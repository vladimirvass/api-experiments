package ie.msg.products.databinding.icm;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Manufacturer{

	@JsonProperty("manufacturer-name")
	private Object manufacturerName;

	@JsonProperty("manufacturer-sku")
	private Object manufacturerSku;

	public void setManufacturerName(Object manufacturerName){
		this.manufacturerName = manufacturerName;
	}

	public Object getManufacturerName(){
		return manufacturerName;
	}

	public void setManufacturerSku(Object manufacturerSku){
		this.manufacturerSku = manufacturerSku;
	}

	public Object getManufacturerSku(){
		return manufacturerSku;
	}

	@Override
 	public String toString(){
		return 
			"Manufacturer{" + 
			"manufacturer-name = '" + manufacturerName + '\'' + 
			",manufacturer-sku = '" + manufacturerSku + '\'' + 
			"}";
		}
}