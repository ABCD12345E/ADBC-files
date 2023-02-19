package com.tns.CustomerDetail;

import org.springframework.data.jpa.repository.JpaRepository;

import customerdetail.CustomerDetail;

public interface CustomerServicerRespository extends JpaRepository<CustomerDetail, Integer> 
{

}
