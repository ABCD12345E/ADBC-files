package com.tns.OrderService;
import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Order_service_Controller
{
	@Autowired(required=true)
	private Order_Service service;
	
	@GetMapping("/orderservice")
	public java.util.List<OrderService> list()
	{
		return service.listAll();
	}
	
	@GetMapping("/orderservice/{s_id}")
	public ResponseEntity<OrderService> get(@PathVariable Integer O_id)
	{
		try
		{
			OrderService ord=service.get(O_id);
			return new ResponseEntity<OrderService>(ord,HttpStatus.OK);
		}
		catch(NoResultException e)
		{
			return new ResponseEntity<OrderService>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/orderservice")
	public void add(@RequestBody OrderService ord)
	{
		service.save(ord);
	}
	
	@PutMapping("/ordservice/{o_id}")
	public ResponseEntity<?> update(@RequestBody OrderService_ord, @PathVariable Integer O_id)
	{
		Order existord=service.get(O_id);
		service.save(existord);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/orderservice/{o_id}")
	public void delete(@PathVariable Integer o_id)
	{
		service.delete(o_id);
	}
}

