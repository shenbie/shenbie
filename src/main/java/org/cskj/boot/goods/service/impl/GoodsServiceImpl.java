package org.cskj.boot.goods.service.impl;

import java.util.List;

import org.cskj.boot.goods.bean.Goods;
import org.cskj.boot.goods.mapper.GoodsMapper;
import org.cskj.boot.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class GoodsServiceImpl implements GoodsService{
	
	@Autowired
	private GoodsMapper gm;
	
	@Override
	public List<Goods> queryGoodsAll(){
		return gm.queryGoodsAll();
	}

	@Override
	public int addGoods(Goods goods) {
		// TODO Auto-generated method stub
		return gm.addGoods(goods);
	}

	@Override
	public int deleteGoods(int id) {
		return gm.deleteGoods(id);
	}

	
	@Override
	public int updateGoods(Goods goods) {
		return gm.updateGoods(goods);
	}

	@Override
	public Goods queryGoodsById(Goods goods) {
		// TODO Auto-generated method stub
		return gm.queryGoodsById(goods);
	}

}
