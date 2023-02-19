package com.tns.OrderService;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class Order_Service 
{
	@Autowired
	private Order_Service_Repository repo;
	
	public List<OrderService> listAll()
	{
		return repo.findAll();
	}
	
	public void save(OrderService ord)
	{
		repo.save(ord);
	}
	
	public OrderService get(Integer o_id)
	{
		return repo.findById(o_id).get();
	}
	public void delete(Integer o_id)
	{
		repo.deleteById(o_id);
	}
	
}


