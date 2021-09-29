package dbk.datapool.demo.helper.databinding.models.testdata;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddressesItem{

	@JsonProperty("firstName")
	private String firstName;

	@JsonProperty("lastName")
	private String lastName;

	@JsonProperty("phoneNumber")
	private String phoneNumber;

	@JsonProperty("city")
	private String city;

	@JsonProperty("street")
	private String street;

	@JsonProperty("postalCode")
	private String postalCode;

	@JsonProperty("houseNumber")
	private String houseNumber;

	@JsonProperty("inFix")
	private String inFix;

	@JsonProperty("title")
	private String title;

	@JsonProperty("bus")
	private String bus;

	@JsonProperty("companyName")
	private String companyName;

	@JsonProperty("houseNumberExtention")
	private String houseNumberExtention;

	@JsonProperty("birthday")
	private String birthday;

	@JsonProperty("country")
	private String country;

	@JsonProperty("description")
	private String description;

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String getLastName(){
		return lastName;
	}

	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber(){
		return phoneNumber;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setStreet(String street){
		this.street = street;
	}

	public String getStreet(){
		return street;
	}

	public void setPostalCode(String postalCode){
		this.postalCode = postalCode;
	}

	public String getPostalCode(){
		return postalCode;
	}

	public void setHouseNumber(String houseNumber){
		this.houseNumber = houseNumber;
	}

	public String getHouseNumber(){
		return houseNumber;
	}

	public void setInFix(String inFix){
		this.inFix = inFix;
	}

	public String getInFix(){
		return inFix;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setBus(String bus){
		this.bus = bus;
	}

	public String getBus(){
		return bus;
	}

	public void setCompanyName(String companyName){
		this.companyName = companyName;
	}

	public String getCompanyName(){
		return companyName;
	}

	public void setHouseNumberExtention(String houseNumberExtention){
		this.houseNumberExtention = houseNumberExtention;
	}

	public String getHouseNumberExtention(){
		return houseNumberExtention;
	}

	public void setBirthday(String birthday){
		this.birthday = birthday;
	}

	public String getBirthday(){
		return birthday;
	}

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	@Override
 	public String toString(){
		return 
			"AddressesItem{" + 
			"firstName = '" + firstName + '\'' + 
			",lastName = '" + lastName + '\'' + 
			",phoneNumber = '" + phoneNumber + '\'' + 
			",city = '" + city + '\'' + 
			",street = '" + street + '\'' + 
			",postalCode = '" + postalCode + '\'' + 
			",houseNumber = '" + houseNumber + '\'' + 
			",inFix = '" + inFix + '\'' + 
			",title = '" + title + '\'' + 
			",bus = '" + bus + '\'' + 
			",companyName = '" + companyName + '\'' + 
			",houseNumberExtention = '" + houseNumberExtention + '\'' + 
			",birthday = '" + birthday + '\'' + 
			",country = '" + country + '\'' + 
			",description = '" + description + '\'' + 
			"}";
		}
}