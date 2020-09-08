package org.cskj.boot.goods.bean;

public class Goods {

	private int id;
	private String name;
	private String zhiye;
	private String juli;
	private String shanghai;
	private int jinengshu;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getZhiye() {
		return zhiye;
	}
	public void setZhiye(String zhiye) {
		this.zhiye = zhiye;
	}
	public String getJuli() {
		return juli;
	}
	public void setJuli(String juli) {
		this.juli = juli;
	}
	public String getShanghai() {
		return shanghai;
	}
	public void setShanghai(String shanghai) {
		this.shanghai = shanghai;
	}
	public int getJinengshu() {
		return jinengshu;
	}
	public void setJinengshu(int jinengshu) {
		this.jinengshu = jinengshu;
	}
	
	
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Goods(int id, String name, String zhiye, String juli, String shanghai, int jinengshu) {
		super();
		this.id = id;
		this.name = name;
		this.zhiye = zhiye;
		this.juli = juli;
		this.shanghai = shanghai;
		this.jinengshu = jinengshu;
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", zhiye=" + zhiye + ", juli=" + juli + ", shanghai=" + shanghai
				+ ", jinengshu=" + jinengshu + "]";
	}
	
	
	
}
