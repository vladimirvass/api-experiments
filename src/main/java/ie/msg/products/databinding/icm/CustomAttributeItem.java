package ie.msg.products.databinding.icm;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomAttributeItem{

	@JsonProperty("@name")
	private String name;

	@JsonProperty("#text")
	private String text;

	@JsonProperty("@dt:dt")
	private String dtDt;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setText(String text){
		this.text = text;
	}

	public String getText(){
		return text;
	}

	public void setDtDt(String dtDt){
		this.dtDt = dtDt;
	}

	public String getDtDt(){
		return dtDt;
	}

	@Override
 	public String toString(){
		return 
			"CustomAttributeItem{" + 
			"@name = '" + name + '\'' + 
			",#text = '" + text + '\'' + 
			",@dt:dt = '" + dtDt + '\'' + 
			"}";
		}
}