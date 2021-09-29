package dbk.datapool.demo.helper.databinding.models.testdata;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Contractor{

	@JsonProperty("credentials")
	private Credentials credentials;

	public void setCredentials(Credentials credentials){
		this.credentials = credentials;
	}

	public Credentials getCredentials(){
		return credentials;
	}

	@Override
 	public String toString(){
		return 
			"Contractor{" + 
			"credentials = '" + credentials + '\'' + 
			"}";
		}
}