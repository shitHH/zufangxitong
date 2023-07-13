package com.etc.controller;

import com.etc.dao.*;
import com.etc.pojo.*;
import com.etc.service.AUserService;
import com.etc.service.DealHouseService;
import com.etc.service.HouseService;
import com.etc.vo.DealHouseVO;
import com.etc.vo.HouseVO;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.annotation.Resource;

import javax.servlet.http.HttpServletRequest;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Project：ohts
 * classname:BorrowHouseController
 * Date：2021/4/7
 * Time：14:52
 * Description：TODO
 *
 * @author 王永祺  李英
 * @version 1.0
 * @category 房屋的控制器 增加房屋状态控制器
 */
@Controller
public class HouseController {
    Logger log = Logger.getLogger(HouseController.class);
    @Resource
    BorrowHouseDao borrowHouseDao;
    @Resource
    DealHouseService dealHouseService;
    @Resource
    AncillaryDao ancillaryDao;
    @Resource
    UseTypeDao useTypeDao;
    @Resource
    HouseTypeDao houseTypeDao;
    @Resource
    HouseDao houseDao;
    @Resource
    HouseService houseService;
    @Resource
    OwnUserDao ownUserDao;
    @Resource
    AUserService aUserService;

    //进入上传房源页面
    @RequestMapping("/toaddhouse")
    public String toaddhouse(Model model) {
        List<HouseType> houseTypelist = houseTypeDao.findAllHouseType();
        model.addAttribute("houseTypelist", houseTypelist);
        //房屋用途
        List<OwnUser> ownUserList=ownUserDao.findAll();
        model.addAttribute("ownUserList",ownUserList);
        List<UseType> useTypelist = useTypeDao.findAll();
        model.addAttribute("uselist", useTypelist);
        return "addhouse";
    }

    //增加房源
    @RequestMapping("/addhouse")
    public String addouse(@RequestParam("file") CommonsMultipartFile file,@ModelAttribute House house,Model model) {
        //上传房源图片
            try {
                String origname = file.getOriginalFilename();
                origname = getname(origname);
                System.out.println(origname);
                String path = "D:/newdir/" + origname;
                File newfile = new File(path);
                file.transferTo(newfile);
                String imageaddress = "/newdir/" + origname;
                house.setHouseimage(imageaddress);
                System.err.println(imageaddress);
            } catch (IOException e) {
                e.printStackTrace();
            }
            ///////////选择用户并将身份修改为业主///
            int uid=house.getUid();
            OwnUser ownUser= ownUserDao.findByid(uid);
            ownUser.setRid(502);
            ownUserDao.update(ownUser);
            /////////增加房屋///////////////////
            System.out.println(house);
            System.out.println(house.getHarea());
            System.out.println(house.getIspass());
            System.err.println(house);
            int flag = houseDao.insert(house);
            if (flag > 0) {
                log.info("添加成功");
            } else {
                log.info("添加失败");
            }
            model.addAttribute("house",house);
        if (house.getUtid() == 601 || house.getUtid() == 602) {
            return "forward:/toadddealhouse.action?hid="+house.getHid();
        } else {
            return "forward:/toaddborrowhouse.action?hid="+house.getHid();
        }

    }

    //进入上传租赁房源页面
    @RequestMapping("/toaddborrowhouse")
    public String toaddborrowhouse(@ModelAttribute House house, Model model) {
        System.out.println(house);
        log.info("进入上传租赁房源页面");
        //把房屋配套设施集合传进页面
        List<Ancillary> list = ancillaryDao.findAll();
        model.addAttribute("ancillarylist", list);
        model.addAttribute("house",house);

        return "addborrowhouse";
    }

    //增加租赁房源
    @RequestMapping("/addborrowhouse")
    public String addborrowhouse(@ModelAttribute BorrowHouse borrowHouse, String[] anc) {
        if (anc!=null) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < anc.length; i++) {
                if (i != anc.length - 1) {
                    stringBuffer.append(anc[i] + ",");
                } else {
                    stringBuffer.append(anc[i]);
                }
            }
            borrowHouse.setAncillary(stringBuffer.toString());
            int flag = borrowHouseDao.addBorrowHouse(borrowHouse);
            if (flag > 0) {
                log.info("添加成功");
            } else {
                log.info("添加失败");
            }
            return "redirect:/zufanglist.action";
        }else{
            int flag = borrowHouseDao.addBorrowHouse(borrowHouse);
            if (flag > 0) {
                log.info("添加成功");
            } else {
                log.info("添加失败");
            }
            return "redirect:/zufanglist.action";
        }
    }
    @RequestMapping("/toadddealhouse")
    public String toadddealhouse(@ModelAttribute House house,Model model){
        model.addAttribute("house",house);
        return "adddealhouse";
    }
    @RequestMapping("/adddealhouse")
    public String adddealhouse(@ModelAttribute DealHouse dealHouse){
        boolean flag= dealHouseService.addDealHouse(dealHouse);
        if (flag){
            System.out.println("添加成功");
        }else{
            System.out.println("添加失败");
        }
        return "redirect:/houselist.action";
    }

    @RequestMapping("/houselist")
    public String houselist(Model model, HttpServletRequest request) {
        String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort();
        List<HouseVO> list = houseDao.findAll();
        System.out.println(list.size());
        model.addAttribute("list", list);
        model.addAttribute("basePath",basePath);
        return "houselist";
    }

    @RequestMapping("/checkhouse")
    public String checkhouse(Model model, HttpServletRequest request){
        String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort();
        List<HouseVO> list=houseService.findwtgAll();
        System.out.println(list.size());
        model.addAttribute("list", list);
        model.addAttribute("basePath",basePath);
        return "checkhouse";
    }

    @RequestMapping("/toupdatehouse")
    public String toupdatehs(int hid, Model model) {
        HouseVO houseVO = houseDao.findByHid3(hid);
        model.addAttribute("houseVO", houseVO);
        return "updatehouse";
    }

    @RequestMapping("/updatehouse")
    public String updatehouse(@ModelAttribute HouseVO houseVO) {
        System.out.println(houseVO);
        System.out.println(houseVO.getHid());
        House house = houseDao.findByHid(houseVO.getHid());
        house.setUtid(houseVO.getUtid());
        house.setTid(houseVO.getTid());
        house.setHarea(houseVO.getHarea());
        house.setAspect(houseVO.getAspect());
        house.setPlot(houseVO.getPlot());
        house.setHfloor(houseVO.getHfloor());
        house.setFitment(houseVO.getFitment());
        house.setIspass(houseVO.getIspass());
        houseDao.update(house);
        return "redirect:/houselist.action";
    }

    @RequestMapping("/zufanglist")
    public String zufanglist(Model model) {
        List<HouseVO> list = houseService.findByUtid(603);
        model.addAttribute("list", list);
        return "houselist";
    }

    @RequestMapping("/xinfanglist")
    public String xinfanglist(Model model) {
        List<HouseVO> list = houseService.findByUtid(601);
        model.addAttribute("list", list);
        return "houselist";
    }

    @RequestMapping("/ershoufanglist")
    public String ershoufanglist(Model model) {
        List<HouseVO> list = houseService.findByUtid(602);
        model.addAttribute("list", list);
        return "houselist";
    }

    @RequestMapping("/housetglist")
    public String housetglist(Model model) {
        List<HouseVO> list = houseDao.findtgAll();
        model.addAttribute("list", list);
        return "housetglist";
    }


    //////////////////////////////////test////////////////////////////////////////
    @RequestMapping("/toupload")
    public String toupdate_plus(int hid, Model model) {
        HouseVO houseVO = houseDao.findByHid3(hid);
        model.addAttribute("houseVO", houseVO);
        log.info("进入上传房源图片详情界面");
        return "upload";
    }


    @RequestMapping("/upload")
    public String upload(@RequestParam("file") CommonsMultipartFile file,@ModelAttribute HouseVO houseVO, Model model,HttpServletRequest request) {
        try {
            String origname = file.getOriginalFilename();
            origname=getname(origname);
            System.out.println(origname);
            String path = "D:/newdir/" + origname;
            File newfile= new File(path);
            file.transferTo(newfile);

            House house = houseDao.findByHid(houseVO.getHid());
            String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort();
            String imageaddress="/newdir/"+origname;
            house.setHouseimage(imageaddress);
            System.err.println(imageaddress);
            houseDao.update(house);
            model.addAttribute("basePath",basePath);
            model.addAttribute("filename",imageaddress);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "redirect:/houselist.action";
//        return "houseimage";
    }


    @RequestMapping("/totestupdatedealhouse")
    public String toupdatedealhouse(int hid, Model model) {
        DealHouseVO dealHouseVO = dealHouseService.findAllByhid3(hid);
        model.addAttribute("dealHouseVO", dealHouseVO);
        return "testupdatedealhouse";
    }


   // 设置名称的方法，防止名字冲突
    public String getname(String orignme ){
//        获取文件后缀
        String suffix= orignme.substring(orignme.indexOf("."));
//        设定1000以内的随机数
        int num= new Random().nextInt(1000);
//        定义新名字
        String newname =""+System.currentTimeMillis()+num+suffix;
        return newname;
    }
    //审批通过
    @RequestMapping("/agree")
    public String agree(int hid){
        House house = houseService.findByHid(hid);
        house.setIspass("审核通过");
        houseService.update(house);
        return "forward:checkhouse.action";
    }
    //审批拒绝
    @RequestMapping("/refuse")
    public String refuse(int hid){
        House house = houseService.findByHid(hid);
        house.setIspass("审核驳回");
        houseService.update(house);
        return "forward:checkhouse.action";
    }
    //进入登记业主页面
    @RequestMapping("/toaddyezhu")
    public String toaddyezhu(){
        return "addyezhu";
    }
    //增加业主
    @RequestMapping("/addyezhu")
    public String addyezhu(OwnUser ownUser,int aid){
        int flag = ownUserDao.addyezhu(ownUser);
        // 判断是否注册成功
        if (flag>0) {
            return "forward:/allownuserlist.action?aid="+aid;
        } else {
            return "addyezhu";
        }
    }
    //进入登记客户页面
    @RequestMapping("/toaddkehu")
    public String toaddkehu(){
        return "addkehu";
    }

    //增加客户
    @RequestMapping("/addkehu")
    public String addkehu(OwnUser ownUser,int aid){
        int flag = ownUserDao.addyezhu(ownUser);
        // 判断是否注册成功
        if (flag>0) {
            return "forward:/allownuserlist.action?aid="+aid;
        } else {
            return "addkehu";
        }
    }
}
