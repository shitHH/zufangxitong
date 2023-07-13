package com.etc.controller;

import com.etc.pojo.DealHouse;
import com.etc.pojo.House;
import com.etc.service.DealHouseService;
import com.etc.vo.DealHouseVO;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author lixiaobin
 * @version 1.0
 * @category 买卖房源控制器
 * @date 2021/4/9  11:04
 */
@Controller
public class DealHouseController {
    Logger log = Logger.getLogger(DealHouseController.class);
    @Resource
    DealHouseService dealHouseService;
    @RequestMapping("/xfdealhouselist")
    public String dealhouselist(Model model, HttpServletRequest request){
        String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort();
        List<DealHouseVO> list=dealHouseService.findAllByUtid(601);
        System.out.println(list);
        model.addAttribute("list",list);
        model.addAttribute("basePath",basePath);
        return "houselist";
    }
    @RequestMapping("/rsdealhouselist")
    public String rsdealhouselist(Model model, HttpServletRequest request){
        String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort();
        List<DealHouseVO> list=dealHouseService.findAllByUtid(602);
        model.addAttribute("basePath",basePath);
        model.addAttribute("list",list);
        return "houselist";
    }
    @RequestMapping("/dealhouseinfo")
    public String dealhouseinfo(int hid, Model model){
        DealHouseVO dealHouseVO=dealHouseService.findAllByhid3(hid);
        model.addAttribute("dealHouseVO",dealHouseVO);
        return "dealhouseinfo";
    }
    @RequestMapping("/toupdatedealhouse")
    public String toupdatedealhouse(int hid,Model model){
        DealHouseVO dealHouseVO=dealHouseService.findAllByhid3(hid);
        log.info(dealHouseVO);
        if (dealHouseVO.equals("")||dealHouseVO.equals(null)){
            return "forward:/toadddealhouse.action?hid="+hid;
        }else {
            model.addAttribute("dealHouseVO", dealHouseVO);
            return "updatedealhouse";
        }
    }
    @RequestMapping("/updatedealhouse")
    public String updatedealhouse(@ModelAttribute DealHouseVO dealHouseVO){
        System.out.println(dealHouseVO);
        System.out.println(dealHouseVO.getHid());
        System.out.println(dealHouseVO.getDhid());
        DealHouse dealHouse=dealHouseService.findByHid(dealHouseVO.getHid());
        dealHouse.setUnitprice(dealHouseVO.getUnitprice());
        dealHouse.setHprice(dealHouseVO.getHprice());
        dealHouse.setPaytype(dealHouseVO.getPaytype());
        dealHouseService.updateDealHouse(dealHouse);
        return "redirect:/housetglist.action";
    }
}
