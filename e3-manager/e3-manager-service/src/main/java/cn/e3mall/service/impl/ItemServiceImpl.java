package cn.e3mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.pojo.TbItemExample;
import cn.e3mall.pojo.TbItemExample.Criteria;
import cn.e3mall.service.ItemService;
/**
 * 商品管理service
 * @author 言文俊
 *
 */
@Service
public class ItemServiceImpl implements ItemService{

	@Autowired
	private TbItemMapper itemMapper;
	
	//根据主键查询
	@Override
	public TbItem geTbItemById(long itemId) {
		//TbItem tbItem = itemMapper.selectByPrimaryKey(itemId);
		//设置查询条件方式
		TbItemExample example=new TbItemExample();
		Criteria criteria = example.createCriteria();
		//设置根据id这个字段查询的条件
		criteria.andIdEqualTo(itemId);
		List<TbItem> list = itemMapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}

}
