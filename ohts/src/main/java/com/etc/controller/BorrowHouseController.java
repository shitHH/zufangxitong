package com.etc.controller;

import com.etc.pojo.Ancillary;
import com.etc.pojo.BorrowHouse;
import com.etc.pojo.House;
import com.etc.pojo.OwnUser;
import com.etc.service.AUserService;
import com.etc.service.AncillaryService;
import com.etc.service.BorrowHouseService;

import com.etc.service.HouseService;
import com.etc.vo.AuserVo;
import com.etc.vo.BorrowHouseVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.rmi.log.LogInputStream;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author lixiaobin
 * @version 1.0
 * @category 租赁合同控制器
 * @date 2021/4/7  14:29
 */
@Controller
public class BorrowHouseController {
    @Resource
    HouseService houseService;
    @Resource
    BorrowHouseService borrowHouseService;
    @Resource
    AUserService aUserService;
    @Resource
    AncillaryService ancillaryService;
    @RequestMapping("/borrowhouselist")
    public String borrowhouselist(Model model, HttpServletRequest request){
        String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort();
        List<BorrowHouseVO> list=borrowHouseService.findBorrowAll();
        model.addAttribute("list",list);
        model.addAttribute("basePath",basePath);
        return "houselist";
        /*return "borrowhouselist";*/
    }

    @RequestMapping("/borrowhouseinfo")
    public String borrowhouseinfo(int hid,Model model){
        BorrowHouseVO borrowHouseVO=borrowHouseService.findByHid(hid);
        model.addAttribute("borrowHouse",borrowHouseVO);
        return "borrowhouseinfo";
    }
    @RequestMapping("/toupdateborrowhs")
    public String toupdateborrowhs(int brid,Model model){
        System.out.println(brid);
        BorrowHouseVO borrowHouseVO=borrowHouseService.findBorrowByBrid(brid);
        model.addAttribute("borrowHouse",borrowHouseVO);
        List<Ancillary> list = ancillaryService.findAll();
        model.addAttribute("ancillarylist", list);
        return "borrowhouseupdate";
    }

    @RequestMapping("/updateborrowhouse")
    public String updateborrowhouse(@ModelAttribute BorrowHouse borrowHouse,String[] anc){
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < anc.length; i++) {
            if (i != anc.length - 1) {
                stringBuffer.append(anc[i] + ",");
            } else {
                stringBuffer.append(anc[i]);
            }
        }
        borrowHouse.setAncillary(stringBuffer.toString());
        System.out.println(borrowHouse);
        System.out.println(borrowHouse.getBrid());
        System.out.println(borrowHouse.getHid());
        System.out.println(borrowHouse.getUid());
        borrowHouseService.updateBorrowHouse(borrowHouse);
        return "redirect:/borrowhouseinfo.action?brid="+borrowHouse.getBrid();
    }
    //和经纪人取得联系
    @RequestMapping("/findausertel")
    public String findausertel(int uid,Model model){
        System.out.println(uid);
        AuserVo auserVo=aUserService.findAuserByUid(uid);
        model.addAttribute("auser",auserVo);
        return "talkwithauser";
    }
}
