package ie.msg.products.databinding.pim;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PIMProduct {

	@JsonProperty("PIMProduct")
	private List<PIMProductItem> pIMProduct;

	public void setPIMProduct(List<PIMProductItem> pIMProduct){
		this.pIMProduct = pIMProduct;
	}

	public List<PIMProductItem> getPIMProduct(){
		return pIMProduct;
	}

	@Override
 	public String toString(){
		return 
			"PIMProduct{" + 
			"pIMProduct = '" + pIMProduct + '\'' + 
			"}";
		}
}