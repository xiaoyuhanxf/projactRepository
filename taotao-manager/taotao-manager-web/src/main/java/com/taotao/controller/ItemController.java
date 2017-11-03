package com.taotao.controller;

import controller.taotao.pojo.TbItem;
import controller.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ItemController {

    @Autowired
    private ItemService itemServiceimpl;

    @RequestMapping(value ="/item/{itemId}",method = RequestMethod.GET)
    @ResponseBody
    public TbItem getTbItem(@PathVariable("itemId") String itemId) {
        TbItem tbitem = itemServiceimpl.getTbitem(itemId);
        return tbitem;
    }
}
