package in.ineuron.dto;

import lombok.Data;

@Data
public class CustomerDTO {
	
	
	private Integer custId;
	private String custName;
	private String address;
	private Integer totalBalance;
	private Integer moneyPaid;

}
