package com.tns.CustomerDetail;


public class CustomerDeatil
{
	@Autowired
	private CustomerDetail repo;
	public List<Customer> listAll()
	{
		return repo.findAll();
	}
	public void save(Customer Cust)
	{
		repo.save(Cust);
	}
	public Customer get(Integer Cust_id)
	{
		return repo.findbyId(Cust_id).get();
	}
	public void delete(Integer Cust_id)
	{
		
		repo.deleteById(Cust_id);
	}

}
