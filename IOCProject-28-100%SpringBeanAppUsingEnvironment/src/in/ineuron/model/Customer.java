package in.ineuron.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id")
	private Integer custId;
	
	@Column(name = "customer_name")
	private String custName;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "remaining_amount")
	private Float remianingAmount;

}
