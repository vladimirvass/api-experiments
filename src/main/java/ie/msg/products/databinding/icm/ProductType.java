package ie.msg.products.databinding.icm;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductType{

	@JsonProperty("@name")
	private String name;

	@JsonProperty("@domain")
	private String domain;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setDomain(String domain){
		this.domain = domain;
	}

	public String getDomain(){
		return domain;
	}

	@Override
 	public String toString(){
		return 
			"ProductType{" + 
			"@name = '" + name + '\'' + 
			",@domain = '" + domain + '\'' + 
			"}";
		}
}