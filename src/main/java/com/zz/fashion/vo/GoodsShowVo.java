package com.zz.fashion.vo;

import java.util.List;


public class GoodsShowVo {
	
	private int goodsid;
	private String detail;
	private String nature;
	private String explain;
	private String goodsname;
	private List<UnitGoods> goods;
	public int getGoodsid() {
		return goodsid;
	}
	public void setGoodsid(int goodsid) {
		this.goodsid = goodsid;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getNature() {
		return nature;
	}
	public void setNature(String nature) {
		this.nature = nature;
	}
	public String getExplain() {
		return explain;
	}
	public void setExplain(String explain) {
		this.explain = explain;
	}
	public String getGoodsname() {
		return goodsname;
	}
	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}
	public List<UnitGoods> getGoods() {
		return goods;
	}
	public void setGoods(List<UnitGoods> goods) {
		this.goods = goods;
	}
	
	
	

}
