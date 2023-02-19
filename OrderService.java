package com.tns.OrderService;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrderService
{
	private Integer O_id;
	private String O_name;
	
	
	public OrderService() 
	{
		super();
	}
	
	public OrderService(Integer o_id, String o_name)
	{
		super();
		O_id = o_id;
		O_name = o_name;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getO_id() {
		return O_id;
	}
	public void setO_id(Integer s_id) {
		O_id = o_id;
	}
	public String getO_name() {
		return o_name;
	}
	public void setO_name(String o_name)
	{
		O_name = o_name;
	}
	@Override
	public String toString()
	{
		return "Order[Order id:"+O_id+" Order name"+O_name+"]";
	}
}

