package ie.msg.products.databinding.icm;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ICMRoot{

	@JsonProperty("enfinity")
	private Enfinity enfinity;

	public void setEnfinity(Enfinity enfinity){
		this.enfinity = enfinity;
	}

	public Enfinity getEnfinity(){
		return enfinity;
	}

	@Override
 	public String toString(){
		return 
			"ICMRoot{" + 
			"enfinity = '" + enfinity + '\'' + 
			"}";
		}
}