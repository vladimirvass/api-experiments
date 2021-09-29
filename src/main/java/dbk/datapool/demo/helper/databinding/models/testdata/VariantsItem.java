package dbk.datapool.demo.helper.databinding.models.testdata;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VariantsItem{

	@JsonProperty("colour")
	private String colour;

	@JsonProperty("size")
	private String size;

	@JsonProperty("promo-price")
	private double promoPrice;

	@JsonProperty("selling-price")
	private double sellingPrice;

	@JsonProperty("sku")
	private String sku;

	@JsonProperty("base-price")
	private double basePrice;

	public void setColour(String colour){
		this.colour = colour;
	}

	public String getColour(){
		return colour;
	}

	public void setSize(String size){
		this.size = size;
	}

	public String getSize(){
		return size;
	}

	public void setPromoPrice(double promoPrice){
		this.promoPrice = promoPrice;
	}

	public double getPromoPrice(){
		return promoPrice;
	}

	public void setSellingPrice(double sellingPrice){
		this.sellingPrice = sellingPrice;
	}

	public double getSellingPrice(){
		return sellingPrice;
	}

	public void setSku(String sku){
		this.sku = sku;
	}

	public String getSku(){
		return sku;
	}

	public void setBasePrice(double basePrice){
		this.basePrice = basePrice;
	}

	public double getBasePrice(){
		return basePrice;
	}

	@Override
 	public String toString(){
		return 
			"VariantsItem{" + 
			"colour = '" + colour + '\'' + 
			",size = '" + size + '\'' + 
			",promo-price = '" + promoPrice + '\'' + 
			",selling-price = '" + sellingPrice + '\'' + 
			",sku = '" + sku + '\'' + 
			",base-price = '" + basePrice + '\'' + 
			"}";
		}
}