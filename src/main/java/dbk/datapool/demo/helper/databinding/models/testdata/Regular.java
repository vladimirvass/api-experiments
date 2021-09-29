package dbk.datapool.demo.helper.databinding.models.testdata;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Regular{

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
			"Regular{" + 
			"credentials = '" + credentials + '\'' + 
			"}";
		}
}