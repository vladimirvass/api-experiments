package dbk.datapool.demo.helper.databinding.models.testdata;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Products{

	@JsonProperty("TEST-PRODUCT-001")
	private TESTPRODUCT001 tESTPRODUCT001;

	@JsonProperty("TEST-PRODUCT-002")
	private TESTPRODUCT002 tESTPRODUCT002;

	@JsonProperty("TEST-PRODUCT-003")
	private TESTPRODUCT003 tESTPRODUCT003;

	public void setTESTPRODUCT001(TESTPRODUCT001 tESTPRODUCT001){
		this.tESTPRODUCT001 = tESTPRODUCT001;
	}

	public TESTPRODUCT001 getTESTPRODUCT001(){
		return tESTPRODUCT001;
	}

	public void setTESTPRODUCT002(TESTPRODUCT002 tESTPRODUCT002){
		this.tESTPRODUCT002 = tESTPRODUCT002;
	}

	public TESTPRODUCT002 getTESTPRODUCT002(){
		return tESTPRODUCT002;
	}

	public void setTESTPRODUCT003(TESTPRODUCT003 tESTPRODUCT003){
		this.tESTPRODUCT003 = tESTPRODUCT003;
	}

	public TESTPRODUCT003 getTESTPRODUCT003(){
		return tESTPRODUCT003;
	}

	@Override
 	public String toString(){
		return 
			"Products{" + 
			"tEST-PRODUCT-001 = '" + tESTPRODUCT001 + '\'' + 
			",tEST-PRODUCT-002 = '" + tESTPRODUCT002 + '\'' + 
			",tEST-PRODUCT-003 = '" + tESTPRODUCT003 + '\'' + 
			"}";
		}
}