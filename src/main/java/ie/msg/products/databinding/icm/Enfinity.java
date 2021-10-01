package ie.msg.products.databinding.icm;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Enfinity{

	@JsonProperty("@xmlns:dt")
	private String xmlnsDt;

	@JsonProperty("offer")
	private List<Object> offer;

	@JsonProperty("@xsi:schemaLocation")
	private String xsiSchemaLocation;

	@JsonProperty("@minor")
	private String minor;

	@JsonProperty("product")
	private List<ProductItem> product;

	@JsonProperty("@family")
	private String family;

	@JsonProperty("@xmlns:xsi")
	private String xmlnsXsi;

	@JsonProperty("@xmlns")
	private String xmlns;

	@JsonProperty("@major")
	private String major;

	@JsonProperty("@xmlns:xml")
	private String xmlnsXml;

	@JsonProperty("@branch")
	private String branch;

	@JsonProperty("@build")
	private String build;

	public void setXmlnsDt(String xmlnsDt){
		this.xmlnsDt = xmlnsDt;
	}

	public String getXmlnsDt(){
		return xmlnsDt;
	}

	public void setOffer(List<Object> offer){
		this.offer = offer;
	}

	public List<Object> getOffer(){
		return offer;
	}

	public void setXsiSchemaLocation(String xsiSchemaLocation){
		this.xsiSchemaLocation = xsiSchemaLocation;
	}

	public String getXsiSchemaLocation(){
		return xsiSchemaLocation;
	}

	public void setMinor(String minor){
		this.minor = minor;
	}

	public String getMinor(){
		return minor;
	}

	public void setProduct(List<ProductItem> product){
		this.product = product;
	}

	public List<ProductItem> getProduct(){
		return product;
	}

	public void setFamily(String family){
		this.family = family;
	}

	public String getFamily(){
		return family;
	}

	public void setXmlnsXsi(String xmlnsXsi){
		this.xmlnsXsi = xmlnsXsi;
	}

	public String getXmlnsXsi(){
		return xmlnsXsi;
	}

	public void setXmlns(String xmlns){
		this.xmlns = xmlns;
	}

	public String getXmlns(){
		return xmlns;
	}

	public void setMajor(String major){
		this.major = major;
	}

	public String getMajor(){
		return major;
	}

	public void setXmlnsXml(String xmlnsXml){
		this.xmlnsXml = xmlnsXml;
	}

	public String getXmlnsXml(){
		return xmlnsXml;
	}

	public void setBranch(String branch){
		this.branch = branch;
	}

	public String getBranch(){
		return branch;
	}

	public void setBuild(String build){
		this.build = build;
	}

	public String getBuild(){
		return build;
	}

	@Override
 	public String toString(){
		return 
			"Enfinity{" + 
			"@xmlns:dt = '" + xmlnsDt + '\'' + 
			",offer = '" + offer + '\'' + 
			",@xsi:schemaLocation = '" + xsiSchemaLocation + '\'' + 
			",@minor = '" + minor + '\'' + 
			",product = '" + product + '\'' + 
			",@family = '" + family + '\'' + 
			",@xmlns:xsi = '" + xmlnsXsi + '\'' + 
			",@xmlns = '" + xmlns + '\'' + 
			",@major = '" + major + '\'' + 
			",@xmlns:xml = '" + xmlnsXml + '\'' + 
			",@branch = '" + branch + '\'' + 
			",@build = '" + build + '\'' + 
			"}";
		}
}