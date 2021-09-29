package dbk.datapool.demo.helper.databinding.models.testdata;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Vouchers{

	@JsonProperty("voucher-10-percent")
	private Voucher10Percent voucher10Percent;

	@JsonProperty("voucher-20-percent")
	private Voucher20Percent voucher20Percent;

	@JsonProperty("voucher-5-percent")
	private Voucher5Percent voucher5Percent;

	public void setVoucher10Percent(Voucher10Percent voucher10Percent){
		this.voucher10Percent = voucher10Percent;
	}

	public Voucher10Percent getVoucher10Percent(){
		return voucher10Percent;
	}

	public void setVoucher20Percent(Voucher20Percent voucher20Percent){
		this.voucher20Percent = voucher20Percent;
	}

	public Voucher20Percent getVoucher20Percent(){
		return voucher20Percent;
	}

	public void setVoucher5Percent(Voucher5Percent voucher5Percent){
		this.voucher5Percent = voucher5Percent;
	}

	public Voucher5Percent getVoucher5Percent(){
		return voucher5Percent;
	}

	@Override
 	public String toString(){
		return 
			"Vouchers{" + 
			"voucher-10-percent = '" + voucher10Percent + '\'' + 
			",voucher-20-percent = '" + voucher20Percent + '\'' + 
			",voucher-5-percent = '" + voucher5Percent + '\'' + 
			"}";
		}
}