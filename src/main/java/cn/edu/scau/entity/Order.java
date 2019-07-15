package cn.edu.scau.entity;

import java.util.Date;
import java.util.List;

public class Order {
	private int id;
	private Client client;
	private Rider rider;
	private double sum_price;
	private List<Dish> dish_list;
	private Address address;
	private Date strat_time;
	private Date end_time;
	private int state;
	
	public static final int unpay=1;//未付款
	public static final int paid_unaccept=2;//已付款但为接单
	public static final int accepted=3;//已接单，正在配送
	public static final int finish=4;//订单完成
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Rider getRider() {
		return rider;
	}
	public void setRider(Rider rider) {
		this.rider = rider;
	}
	public double getSum_price() {
		return sum_price;
	}
	public void setSum_price(double sum_price) {
		this.sum_price = sum_price;
	}
	public List<Dish> getDish_list() {
		return dish_list;
	}
	public void setDish_list(List<Dish> dish_list) {
		this.dish_list = dish_list;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Date getStrat_time() {
		return strat_time;
	}
	public void setStrat_time(Date strat_time) {
		this.strat_time = strat_time;
	}
	public Date getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public static int getUnpay() {
		return unpay;
	}
	public static int getPaidUnaccept() {
		return paid_unaccept;
	}
	public static int getAccepted() {
		return accepted;
	}
	public static int getFinish() {
		return finish;
	}
	
}
