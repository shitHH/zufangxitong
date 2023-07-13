package com.etc.controller;

import com.etc.pojo.Contract;
import com.etc.pojo.House;
import com.etc.pojo.OwnUser;
import com.etc.service.*;
import com.etc.vo.HouseVO;
import org.apache.log4j.Logger;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author 李英
 * @date 2021-04-08
 * @category 合同有关的控制器
 */
@Controller
public class ContractController {
    //基本配置
    Logger log = Logger.getLogger(ContractController.class);
    @Resource
    ContractService contractService;
    @Resource
    OwnUserService userService;
    @Resource
    HouseService houseService;
    @Resource
    BorrowHouseService borrowHouseService;
    @Resource
    DealHouseService dealHouseService;
    //经纪人只能查看自己成交的合同
    //跳转合同页面
    @RequestMapping("/tocontract")
    public String tocontract(Model model){
        List<Contract> contracts = contractService.findAll();
        model.addAttribute("listcontract",contracts);
        return "contract";
    }
    //查询合同的详细信息
    @RequestMapping("/coninfo")
    public String coninfo(Model model,int cid){
        //根据cid查询合同
        Contract contract = contractService.findByCid(cid);
        //从合同里面调取买家ID、卖家ID、hid
        int byuid = contract.getByuid();
        int sauid = contract.getSauid();
        int hid = contract.getHid();
        //调取买家信息、卖家信息、房屋信息
        OwnUser byuser = userService.findByid(byuid);
        OwnUser sauser = userService.findByid(sauid);
        House house = houseService.findByHid(hid);
        //将调取出的信息存放到model中，传递给前端页面
        model.addAttribute("byuser",byuser);
        model.addAttribute("sauser",sauser);
        model.addAttribute("house",house);
        model.addAttribute("contract",contract);
        return "coninfo";
    }
    //添加新合同
    @RequestMapping("/toaddcon")
    public String toaddcon(Model model, int aid){
        //查找aid名下的所有用户
        List<OwnUser> byuserlist = userService.findOwnUserList(501,aid);
        //查找所有业主
        List<OwnUser> sauserlist = userService.findByRid(502);
        //查找所有的房子
        List<HouseVO> houseList = houseService.findtgAll();
        model.addAttribute("byuserlist",byuserlist);
        model.addAttribute("sauserlist",sauserlist);
        model.addAttribute("houselist",houseList);
        return "addcon";
    }
    @RequestMapping("/addcon")
    public String addcon(Contract contract){
        Contract contract1 = contractService.insertContract(contract);
        return "forward:tocontract.action";
    }
    //删除合同
    @RequestMapping("/delecon")
    public String delecon(int cid,Model model){
        Contract contract = contractService.findByCid(cid);
        boolean flag = contractService.deleteContract(contract);
        if (flag){
            return "forward:tocontract.action";
        }else{
            model.addAttribute("mess","删除失败");
            return "forward:tocontract.action";
        }
    }
}
