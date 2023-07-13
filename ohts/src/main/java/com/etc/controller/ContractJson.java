package com.etc.controller;

import com.etc.pojo.House;
import com.etc.pojo.OwnUser;
import com.etc.service.HouseService;
import com.etc.service.OwnUserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
/**
 * @author 李英
 * @date 2021-04-10
 * @category 用来获取合同相关的json数据
 */
@Controller
public class ContractJson {
    Logger log = Logger.getLogger(ContractJson.class);
    @Resource
    OwnUserService userService;
    @Resource
    HouseService houseService;
    //获得前端的数据，并已Json形式传递过去
    //根据byuid 获得买家信息
    @RequestMapping("/getbyuser")
    public @ResponseBody OwnUser getbyuser(@RequestBody int byuid){
        OwnUser byuser = userService.findByid(byuid);
        return byuser;
    }
    //根据sauid获得卖家信息
    @RequestMapping("/getsauser")
    public @ResponseBody OwnUser getsauser(@RequestBody int sauid){
        OwnUser sauser = userService.findByid(sauid);
        return sauser;
    }
    //根据hid获得房子信息
    @RequestMapping("/gethouse")
    public @ResponseBody House gethouse(@RequestBody int hid){
        House house = houseService.findByHid(hid);
        return house;
    }
}