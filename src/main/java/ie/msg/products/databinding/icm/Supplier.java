package ie.msg.products.databinding.icm;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Supplier{

	@JsonProperty("supplier-sku")
	private Object supplierSku;

	@JsonProperty("supplier-name")
	private Object supplierName;

	public void setSupplierSku(Object supplierSku){
		this.supplierSku = supplierSku;
	}

	public Object getSupplierSku(){
		return supplierSku;
	}

	public void setSupplierName(Object supplierName){
		this.supplierName = supplierName;
	}

	public Object getSupplierName(){
		return supplierName;
	}

	@Override
 	public String toString(){
		return 
			"Supplier{" + 
			"supplier-sku = '" + supplierSku + '\'' + 
			",supplier-name = '" + supplierName + '\'' + 
			"}";
		}
}