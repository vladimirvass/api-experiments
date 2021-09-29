package dbk.datapool.demo.helper.databinding.models.testdata;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TESTPRODUCT001{

	@JsonProperty("masterSku")
	private String masterSku;

	@JsonProperty("name")
	private String name;

	@JsonProperty("variants")
	private List<VariantsItem> variants;

	@JsonProperty("brand")
	private String brand;

	public void setMasterSku(String masterSku){
		this.masterSku = masterSku;
	}

	public String getMasterSku(){
		return masterSku;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setVariants(List<VariantsItem> variants){
		this.variants = variants;
	}

	public List<VariantsItem> getVariants(){
		return variants;
	}

	public void setBrand(String brand){
		this.brand = brand;
	}

	public String getBrand(){
		return brand;
	}

	@Override
 	public String toString(){
		return 
			"TESTPRODUCT001{" + 
			"masterSku = '" + masterSku + '\'' + 
			",name = '" + name + '\'' + 
			",variants = '" + variants + '\'' + 
			",brand = '" + brand + '\'' + 
			"}";
		}
}