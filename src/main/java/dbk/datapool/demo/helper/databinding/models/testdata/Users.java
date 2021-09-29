package dbk.datapool.demo.helper.databinding.models.testdata;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Users{

	@JsonProperty("contractor")
	private Contractor contractor;

	@JsonProperty("guest")
	private Guest guest;

	@JsonProperty("regular")
	private Regular regular;

	public void setContractor(Contractor contractor){
		this.contractor = contractor;
	}

	public Contractor getContractor(){
		return contractor;
	}

	public void setGuest(Guest guest){
		this.guest = guest;
	}

	public Guest getGuest(){
		return guest;
	}

	public void setRegular(Regular regular){
		this.regular = regular;
	}

	public Regular getRegular(){
		return regular;
	}

	@Override
 	public String toString(){
		return 
			"Users{" + 
			"contractor = '" + contractor + '\'' + 
			",guest = '" + guest + '\'' + 
			",regular = '" + regular + '\'' + 
			"}";
		}
}