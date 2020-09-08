package org.cskj.boot.goods.controller;

import java.util.List;

import org.cskj.boot.goods.bean.Goods;
import org.cskj.boot.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodsController {

	@Autowired
	private GoodsService gs;
	
	@GetMapping(value="queryGoodsAll")
	public List<Goods> queryGoodsAll(){
		return gs.queryGoodsAll();
	}
	@PostMapping(value="addGoods")
	public boolean addGoods(@RequestBody Goods goods) {
		return  gs.addGoods(goods)>0?true:false;
	}
	@DeleteMapping(value="deleteGoods")
	public boolean deleteGoods(int id) {
		return gs.deleteGoods(id) > 0 ? true : false;
	}
	
	@PostMapping(value="queryGoodsById")
	public Goods queryGoodsById(@RequestBody Goods goods) {
		return gs.queryGoodsById(goods);
	}
	
	@PutMapping(value="updateGoods")
	public boolean updateGoods(@RequestBody Goods goods) {
		System.out.println(goods);
		
		return gs.updateGoods(goods) > 0 ? true : false;
	}
}
