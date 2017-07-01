package cn.e3mall.service;

import cn.e3mall.pojo.TbItem;

public interface ItemService {
	//根据主键查询商品信息
	public TbItem geTbItemById(long itemId);

}
