package com.etc.controller;

import com.etc.dao.AUserDao;
import com.etc.pojo.AUser;
import com.etc.pojo.Role;
import com.etc.service.AUserService;
import com.etc.vo.AuserVo;
import com.etc.vo.ChartAuserVo;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author 贠一凡
 * @date 2021/4/7
 * @category 经纪人控制器
 */
@Controller
public class AUserController {
    Logger logger = Logger.getLogger(AUserController.class);
    @Resource
    AUserService aUserService;
    @Resource
    AUserDao aUserDao;

    @RequestMapping("/auserlist")
    public String list(Model model, HttpSession session) {
        AUser auser = (AUser) session.getAttribute("currentaUser");
        logger.info(auser.getAname());
        AuserVo auserVo = aUserDao.findAuserRid(auser.getAid());
        model.addAttribute("auser", auserVo);
        return "auserInfo";
    }

    @RequestMapping("/manager")
    public String manager() {
        return "houtai";
    }


    @RequestMapping("/tologin")
    public String tologin(String atel, Model model) {
        model.addAttribute("atel", atel);
        return "login1";
    }

    @RequestMapping("/login")
    public String login(@ModelAttribute AUser aUser, String captcha, HttpSession session, Model model) {
//从session中获取验证码
        String simpleCaptcha = String.valueOf(session.getAttribute("simpleCaptcha"));
        /*        logger.info(aUser);*/

        if (captcha.equals(simpleCaptcha)) {
//            开始登录验证
            AUser currentUser = aUserService.findByAtelAndApass(aUser);

            if (currentUser != null && currentUser.getRid() != 501 && currentUser.getRid() != 502) {//如果登录成功，将当前登录的人，记录在会话当中

                session.setAttribute("currentaUser", currentUser);
                return "redirect:/manager.action";
            } else {//用户输入错误
                model.addAttribute("mess", "用户电话或密码输入错误");
                return "login1";
            }
        } else {//用户输入错误
            model.addAttribute("mess", "验证码输入错误");
            return "login1";
        }
    }

    @RequestMapping("/updateauser")
    public String updateauser(int aid, Model model) {
        AUser auser = aUserService.findByAid(aid);//通过模型得到经纪人对象
        model.addAttribute("auser", auser);
        return "updateauser";
    }

    @RequestMapping("/updateausersave")
    public String updateAuserSave(@ModelAttribute AUser aUser) {
        logger.info(aUser);
        boolean flag = aUserService.updateAUser(aUser);
//        return "redirect:/findbyaid.action?aid=" + aUser.getAid();
        return "redirect:/auserlist.action";
    }

    @RequestMapping("/findbyaid")
    public String findByAid(int aid, Model model) {
        AUser auser = aUserService.findByAid(aid);
        model.addAttribute("auser", auser);
        return "auserInfo";
    }

    @RequestMapping("/auserlist1")
    public String auserList(Model model) {
        List<AuserVo> auserlist1 = aUserService.findAllAuser();
        System.out.println(auserlist1);
        model.addAttribute("auserlist", auserlist1);
        return "auserlist";

    }

    @RequestMapping("/findaid")
    public String findAid(int aid, Model model) {
        AUser toauser = aUserService.findByAid(aid);
        logger.info(toauser);
        model.addAttribute("toauser", toauser);
        return "updateauserlist";
    }


    @RequestMapping("/toauserchart")
    public String toauserchart() {
        return "auserchart";
    }

    @RequestMapping("/auserchart")
    public @ResponseBody
    List<ChartAuserVo> auserChartList() {
        List<ChartAuserVo> list = aUserService.findAuserChart();
        return list;

    }

    @RequestMapping("/ownuserchart")
    public @ResponseBody
    List<ChartAuserVo> ownUserChart() {
        List<ChartAuserVo> list = aUserService.findOwnuserChart();
        return list;

    }
}
