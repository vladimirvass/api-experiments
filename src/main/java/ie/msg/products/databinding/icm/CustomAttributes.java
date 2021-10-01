package ie.msg.products.databinding.icm;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomAttributes{

	@JsonProperty("custom-attribute")
	private List<CustomAttributeItem> customAttribute;

	public void setCustomAttribute(List<CustomAttributeItem> customAttribute){
		this.customAttribute = customAttribute;
	}

	public List<CustomAttributeItem> getCustomAttribute(){
		return customAttribute;
	}

	@Override
 	public String toString(){
		return 
			"CustomAttributes{" + 
			"custom-attribute = '" + customAttribute + '\'' + 
			"}";
		}
}