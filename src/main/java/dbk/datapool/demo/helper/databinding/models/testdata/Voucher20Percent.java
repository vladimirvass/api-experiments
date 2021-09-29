package dbk.datapool.demo.helper.databinding.models.testdata;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Voucher20Percent{

	@JsonProperty("discountPercentage")
	private String discountPercentage;

	@JsonProperty("code")
	private String code;

	public void setDiscountPercentage(String discountPercentage){
		this.discountPercentage = discountPercentage;
	}

	public String getDiscountPercentage(){
		return discountPercentage;
	}

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	@Override
 	public String toString(){
		return 
			"Voucher20Percent{" + 
			"discountPercentage = '" + discountPercentage + '\'' + 
			",code = '" + code + '\'' + 
			"}";
		}
}