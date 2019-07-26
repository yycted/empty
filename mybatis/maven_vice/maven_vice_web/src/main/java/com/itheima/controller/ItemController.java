package com.itheima.controller;
import com.itheima.domain.Item;
import com.itheima.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author : YYC
 * @Description : web层
 * @Creation Date: 2019-07-25 21:31
 * @ModificationHistory Who  When  What
 * -----------------------------------------------------
 */
@Controller
@RequestMapping("/item")
public class ItemController {

    @Autowired
    public ItemService service;

    @RequestMapping("/findById")
    public ModelAndView findById(int id){
        ModelAndView modelAndView = new ModelAndView();
        Item item = service.findById(id);
        modelAndView.addObject("item",item);
        modelAndView.setViewName("/display.jsp");
        return modelAndView;
    }
}
