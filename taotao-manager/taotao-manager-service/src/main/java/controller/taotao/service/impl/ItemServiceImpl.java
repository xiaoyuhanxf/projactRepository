package controller.taotao.service.impl;

import controller.taotao.dao.TbItemMapper;
import controller.taotao.pojo.TbItem;
import controller.taotao.service.ItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ItemServiceImpl implements ItemService {

    @Resource
    private TbItemMapper tbItemMapper;
    @Override
    public TbItem getTbitem(String id) {
        TbItem tbItem =tbItemMapper.selectByPrimaryKey(id);
        return tbItem;
    }
}
