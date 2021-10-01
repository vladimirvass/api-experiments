package ie.msg.products.databinding.pim;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PIMProductItem {

	@JsonProperty("Status")
	private String status;

	@JsonProperty("Type")
	private String type;

	@JsonProperty("Restrict To")
	private String restrictTo;

	@JsonProperty("Online Retail")
	private String onlineRetail;

	@JsonProperty("Online Foodservice")
	private String onlineFoodservice;

	@JsonProperty("Online Marketplace Del")
	private String onlineMarketplaceDel;

	@JsonProperty("ID")
	private String iD;

	@JsonProperty("MWP Article Code")
	private String mWPArticleCode;

	@JsonProperty("MWP Sellable")
	private String mWPSellable;

	@JsonProperty("Online Marketplace Col")
	private String onlineMarketplaceCol;

	@JsonProperty("Name")
	private String name;

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setRestrictTo(String restrictTo){
		this.restrictTo = restrictTo;
	}

	public String getRestrictTo(){
		return restrictTo;
	}

	public void setOnlineRetail(String onlineRetail){
		this.onlineRetail = onlineRetail;
	}

	public String getOnlineRetail(){
		return onlineRetail;
	}

	public void setOnlineFoodservice(String onlineFoodservice){
		this.onlineFoodservice = onlineFoodservice;
	}

	public String getOnlineFoodservice(){
		return onlineFoodservice;
	}

	public void setOnlineMarketplaceDel(String onlineMarketplaceDel){
		this.onlineMarketplaceDel = onlineMarketplaceDel;
	}

	public String getOnlineMarketplaceDel(){
		return onlineMarketplaceDel;
	}

	public void setID(String iD){
		this.iD = iD;
	}

	public String getID(){
		return iD;
	}

	public void setMWPArticleCode(String mWPArticleCode){
		this.mWPArticleCode = mWPArticleCode;
	}

	public String getMWPArticleCode(){
		return mWPArticleCode;
	}

	public void setMWPSellable(String mWPSellable){
		this.mWPSellable = mWPSellable;
	}

	public String getMWPSellable(){
		return mWPSellable;
	}

	public void setOnlineMarketplaceCol(String onlineMarketplaceCol){
		this.onlineMarketplaceCol = onlineMarketplaceCol;
	}

	public String getOnlineMarketplaceCol(){
		return onlineMarketplaceCol;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	@Override
 	public String toString(){
		return 
			"PIMProductItem{" + 
			"status = '" + status + '\'' + 
			",type = '" + type + '\'' + 
			",restrict To = '" + restrictTo + '\'' + 
			",online Retail = '" + onlineRetail + '\'' + 
			",online Foodservice = '" + onlineFoodservice + '\'' + 
			",online Marketplace Del = '" + onlineMarketplaceDel + '\'' + 
			",iD = '" + iD + '\'' + 
			",mWP Article Code = '" + mWPArticleCode + '\'' + 
			",mWP Sellable = '" + mWPSellable + '\'' + 
			",online Marketplace Col = '" + onlineMarketplaceCol + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}