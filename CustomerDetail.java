package customerdetail;

import javax.persistence.Entity;

@Entity
public class CustomerDetail {
	private Integer Cust_id;
	private Integer Cust_name;
	public CustomerDetail(Integer cust_id, Integer cust_name, Integer cust_addr) {
		super();
		Cust_id = cust_id;
		Cust_name = cust_name;
		Cust_addr = cust_addr;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getCust_id() {
		return Cust_id;
	}
	public void setCust_id(Integer cust_id) {
		Cust_id = cust_id;
	}
	public Integer getCust_name() {
		return Cust_name;
	}
	public void setCust_name(Integer cust_name) {
		Cust_name = cust_name;
	}
	public Integer getCust_addr() {
		return Cust_addr;
	}
	public void setCust_addr(Integer cust_addr) {
		Cust_addr = cust_addr;
	}
	@Override
	public String toString()
	{
		return "Customer[Customer id:"+Cust_id+"Customer name:"+Cust_name+"Customer addrress:"+Cust_addr+"]";
	}
	private Integer Cust_addr;

	
}
