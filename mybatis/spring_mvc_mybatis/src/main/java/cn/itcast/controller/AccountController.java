package cn.itcast.controller;

import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.List;

/**
 * @author : YYC
 * @Description : 账户控制的web层
 * @Creation Date: 2019-07-20 20:38
 * @ModificationHistory Who  When  What
 * -----------------------------------------------------
 */
@Controller
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public ModelAndView findAll() throws IOException {
        List<Account> list = accountService.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("result",list);
        modelAndView.setViewName("/display.jsp");
        return modelAndView;
    }

    @RequestMapping("/insert")
    @ResponseBody
    public String insert(@RequestBody List<Account> accountList){
        int save = accountService.save(accountList);
        System.out.println(accountList);
        if(save == -1){
            return "error";
        } else{
            return "success";
        }

    }
}
