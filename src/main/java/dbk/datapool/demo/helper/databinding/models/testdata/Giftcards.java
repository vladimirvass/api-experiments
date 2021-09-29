package dbk.datapool.demo.helper.databinding.models.testdata;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Giftcards{

	@JsonProperty("giftcard-1-euro")
	private String giftcard1Euro;

	@JsonProperty("giftcard-10-euro")
	private String giftcard10Euro;

	@JsonProperty("giftcard-1000-euro")
	private String giftcard1000Euro;

	@JsonProperty("giftcard-100-euro")
	private String giftcard100Euro;

	public void setGiftcard1Euro(String giftcard1Euro){
		this.giftcard1Euro = giftcard1Euro;
	}

	public String getGiftcard1Euro(){
		return giftcard1Euro;
	}

	public void setGiftcard10Euro(String giftcard10Euro){
		this.giftcard10Euro = giftcard10Euro;
	}

	public String getGiftcard10Euro(){
		return giftcard10Euro;
	}

	public void setGiftcard1000Euro(String giftcard1000Euro){
		this.giftcard1000Euro = giftcard1000Euro;
	}

	public String getGiftcard1000Euro(){
		return giftcard1000Euro;
	}

	public void setGiftcard100Euro(String giftcard100Euro){
		this.giftcard100Euro = giftcard100Euro;
	}

	public String getGiftcard100Euro(){
		return giftcard100Euro;
	}

	@Override
 	public String toString(){
		return 
			"Giftcards{" + 
			"giftcard-1-euro = '" + giftcard1Euro + '\'' + 
			",giftcard-10-euro = '" + giftcard10Euro + '\'' + 
			",giftcard-1000-euro = '" + giftcard1000Euro + '\'' + 
			",giftcard-100-euro = '" + giftcard100Euro + '\'' + 
			"}";
		}
}