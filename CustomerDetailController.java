package com.tns.CustomerDetail;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerDetailController {
	@Autowired(required=true)
	private CustomerDeatil detail;
	@GetMapping("/CustomerDetail")
	public List<Customer> List()
	{ 
		return detail.listAll();
	}
	@GetMapping("/CustomerDetail/{Cust_id}")
	public ResponseEntity<Detail> get(@PathVariable Integer Cust_id)
	{
		try
		{
			Customer Cust=detail.get(Cust_id);
			return new ResponseEntity<CustomerDetail>(Cust,HttpStatus.OK);
		}
		catch(NoResultException e)
		{
			return new ResponseEntity<CustomerDetail>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/CustomerDetail")
	public void add(@RequestBody Customer Cust)
	{
		Customer.save(Cust);
	}
	@PutMapping("/CustomerDetail")
	public ResponseEntity<?> update(@REquestBody Customer Cust, @PathVariable Integer Cust_id)
	{
		Customer existCust=detail.get(Cust_id);
		Customer.save(existCust);
		return new ResponseEntity<>  (HttpStatus.OK);
		
	}
	@DeleteMapping("/CustomerDetail/{Cust_id}")
	public void delete(@PathVariable Integer Cust_id)
	{
		Detail.delete(Cust_id);
		
	}
	

}
