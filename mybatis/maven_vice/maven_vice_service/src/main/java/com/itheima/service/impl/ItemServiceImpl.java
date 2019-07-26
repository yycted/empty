package com.itheima.service.impl;

import com.itheima.dao.ItemMapper;
import com.itheima.domain.Item;
import com.itheima.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : YYC
 * @Description : How Time Flies
 * @Creation Date: 2019-07-25 20:35
 * @ModificationHistory Who  When  What
 * -----------------------------------------------------
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper mapper;

    public Item findById(int id) {
        try {
            Item item = mapper.findById(id);
            return item;
        } catch (Exception e){
            return null;
        }
    }
}
