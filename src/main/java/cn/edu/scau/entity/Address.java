package cn.edu.scau.entity;

public class Address {
	private int id;
	private String province;
	private String city;
	private String remark;
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Address [province=" + province + ", city=" + city + ", remark=" + remark + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
