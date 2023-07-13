package com.etc.controller;

import com.etc.dao.BorrowHouseDao;
import com.etc.dao.DealHouseDao;
import com.etc.pojo.DealHouse;
import com.etc.pojo.OwnUser;
import com.etc.service.DealHouseService;
import com.etc.service.HouseService;
import com.etc.service.OwnUserService;
import com.etc.vo.DealHouseVO;
import com.etc.vo.HouseVO;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author 李英
 * @author 王永琪
 * @version 2.0
 * @date 2021-04-07
 * @category 用户相关控制器
 * @category 将房屋信息传入前端
 */
@Controller
public class OwnUserController {
    //获得日志
    Logger log = Logger.getLogger(OwnUserController.class);

    @Resource
    OwnUserService ownUserService;
    @Resource
    BorrowHouseDao borrowHouseDao;
    @Resource
    DealHouseService dealHouseService;
    @Resource
    HouseService houseService;

    //默认页面
    @RequestMapping({"/", "/index"})
    public String init() {
        return "yonghu";
    }

    //用户登录部分
    @RequestMapping("/tologinuser")
    public String tologin() {
        return "loginuser";
    }

    @RequestMapping("/loginuser")
    public String loginuser(Model model, OwnUser user, HttpSession session) {
        OwnUser ownUser = ownUserService.findUser(user.getUtel(), user.getUpass());
        if (ownUser != null) {
            session.setAttribute("currentuser", ownUser);
            model.addAttribute("mess", "用户登录成功");
            return "yonghu";
        } else {
            model.addAttribute("mess", "电话或密码错误，请重新输入");
        }
        return "loginuser";
    }

    /**
     * 跳转到修改密码页面
     */
    @RequestMapping("/tochangepass")
    public String toChangePass() {
        // 转发到修改密码页面
        return "changepass";
    }

    /**
     * 修改密码时，验证输入的原密码是否正确
     */
    @RequestMapping(value = "/checkpass", produces = {"text/html;charset=utf-8;", "application/json;"})
    public @ResponseBody
    String checkPass(@RequestBody String oldPass, HttpSession session) {
        System.out.println(oldPass);
        // 获取Session中的用户
        OwnUser currentuser = (OwnUser) session.getAttribute("currentuser");
        // 调用方法查询对应用户
        OwnUser ownUser = ownUserService.findByid(currentuser.getUid());
        // 判断
        if (ownUser.getUpass().equals(oldPass)) {
            return "";
        } else {
            return "密码错误，请重新输入！";
        }
    }

    /**
     * 修改用户密码
     */
    @RequestMapping("/changepass")
    public String changePass(OwnUser ownUser) {
        // 调用方法修改密码
        boolean flag = ownUserService.update(ownUser);
        // 判断
        if (flag) {
            return "redirect:exit.action";
        } else {
            return "redirect:tochangepass.action";
        }
    }

    /**
     * 跳转到用户注册页面
     */
    @RequestMapping("/toregist")
    public String toRegist() {
        // 转发到注册页面
        return "regist";
    }

    /**
     * 用户注册页面
     */
    @RequestMapping("/regist")
    public String regist(@ModelAttribute("ownUser") OwnUser ownUser) {
        // 调用用户添加方法
        ownUser.setAid(3001);
        ownUser.setRid(501);
        boolean flag = ownUserService.addUser(ownUser);
        // 判断是否注册成功
        if (flag) {
            return "redirect:/tologinuser.action";
        } else {
            return "/regist.jsp";
        }
    }
    /**
     * 注册时验证用户输入手机号是否已经存在
     */
    @RequestMapping(value = "/checkutel", produces = {"text/html;charset=utf-8;", "application/json;"})
    public @ResponseBody
    String checkUtel(@RequestBody String utel) {
        // 调用查询方法查询所有用户
        List<OwnUser> list = ownUserService.findAll();
        // 判断
        if (list != null && list.size() > 0) {
            // 遍历集合
            for (OwnUser ownUser : list) {
                // 判断手机号
                if (ownUser.getUtel().equals(utel)) {
                    // 手机号已存在，返回信息
                    return "手机号已经注册，请重新输入！";
                }
            }
        }
        return "";
    }

    @RequestMapping(value = "/checkucard", produces = {"text/html;charset=utf-8;", "application/json;"})
    public @ResponseBody
    String checkUcard(@RequestBody String ucard) {
        // 调用方法，查询所有用户
        List<OwnUser> list = ownUserService.findAll();
        if (list != null && list.size() > 0) {
            // 遍历集合
            for(OwnUser ownUser:list){
                // 判断身份证号是否存在
                if(ucard.equals(ownUser.getUcard())){
                    return "该身份证号已经注册，请重新输入！";
                }
            }
        }
        return "";
    }

    @RequestMapping("/torenewalownuser")
    public String toRenewalOwnuser(int uid, Model model) {
        // 调用方法，查询对应用户
        OwnUser ownUser = ownUserService.findByid(uid);
        // 将用户存储到model中
        model.addAttribute("ownuser", ownUser);
        // 转发到更新用户页面
        return "renewalownuser";
    }

    @RequestMapping("/renewalownuser")
    public String renewalOwnuser(@ModelAttribute("ownUser") OwnUser ownUser) {
        // 调用更新方法
        boolean flag = ownUserService.update(ownUser);
        // 判断是否成功
        if (flag) {
            return "yonghu";
        } else {
            return "redirect:/torenewalownuser.action?uid=" + ownUser.getUid();
        }
    }

    @RequestMapping("/allownuserlist")
    public String allOwnuserList(int aid, Model model) {
        // 调用方法查询用户
        List<OwnUser> list = ownUserService.findAllOwnUserByAid(aid);
        // 将查询的结果存储到model中
        model.addAttribute("ownuserlist", list);
        // 转发到用户列表展示页面
        return "ownuserlist";
    }

    @RequestMapping("/ownuserlist")
    public String ownUserList(int rid, int aid, Model model) {
        System.out.println(rid + ":" + aid);
        // 调用查询方法，查询对应用户
        List<OwnUser> list = ownUserService.findOwnUserList(rid, aid);
        System.out.println(list);
        // 将查询的结果存储到model中
        model.addAttribute("ownuserlist", list);
        // 转发到用户列表展示页面
        return "ownuserlist";
    }

    @RequestMapping("/finduserbyuid")
    public String findUserByUid(int uid, Model model) {
        // 调用查询方法，查询对应用户
        OwnUser user = ownUserService.findByid(uid);
        // 将查询的用户存储到model中
        model.addAttribute("ownuser", user);
        // 转发到用户信息页面
        return "ownuserinfo";
    }

    @RequestMapping("/finduserbyname")
    public String findUserByName(String name, Model model) {
        // 调用查询方法，查询对应用户
        List<OwnUser> list = ownUserService.findNameList(name);
        System.out.println(list);
        // 将查询的结合存储到model中
        model.addAttribute("ownuserlist", list);
        // 转发到用户列表展示页面
        return "ownuserlist";
    }

    @RequestMapping("/toupdateownuser")
    public String toUpdateOwnUser(int uid, Model model) {
        // 调用方法，查询对应用户
        OwnUser ownUser = ownUserService.findByid(uid);
        // 将用户存储到model中
        model.addAttribute("ownuser", ownUser);
        // 转发到更新用户页面
        return "updateownuser";
    }

    @RequestMapping("/updateownuser")
    public String updateOwnUser(@ModelAttribute("ownUser") OwnUser ownUser) {
        System.out.println(ownUser);
        // 调用更新方法
        boolean flag = ownUserService.update(ownUser);
        // 判断是否成功
        if (flag) {
            return "redirect:/ownuserlist.action?rid=" + ownUser.getRid() + "&aid=" + ownUser.getAid();
        } else {
            return "redirect:/toupdateownuser.action?uid=" + ownUser.getUid();
        }
    }

    @RequestMapping("/toyonghu")
    public String toyonghu() {
        return "yonghu";
    }

    @RequestMapping("/exit")
    public String exit(HttpSession session) {
        // 注销session
        session.invalidate();
        return "yonghu";
    }


    @RequestMapping("/toabout")
    public String toabout() {
        return "about";
    }

    @RequestMapping("/single")
    public String single() {
        return "blog-single";
    }

    //跳转到买卖房屋列表
    @RequestMapping("/leftsidebar")
    public String leftsidebar(Model model, HttpServletRequest request) {
        String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort();
        List<DealHouseVO> list = dealHouseService.findAllByUtid(602);
        model.addAttribute("basePath", basePath);
        model.addAttribute("list", list);
        return "listing-grid-left-sidebar";
    }

    @RequestMapping("/listinggrid")
    public String ListingGrid() {
        return "listing-grid";
    }


}
