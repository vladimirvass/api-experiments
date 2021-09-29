package dbk.datapool.demo.helper.databinding.models.testdata;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TestDataSetJSON {

	@JsonProperty("giftcards")
	private Giftcards giftcards;

	@JsonProperty("addresses")
	private List<AddressesItem> addresses;

	@JsonProperty("vouchers")
	private Vouchers vouchers;

	@JsonProperty("users")
	private Users users;

	@JsonProperty("products")
	private Products products;

	public void setGiftcards(Giftcards giftcards){
		this.giftcards = giftcards;
	}

	public Giftcards getGiftcards(){
		return giftcards;
	}

	public void setAddresses(List<AddressesItem> addresses){
		this.addresses = addresses;
	}

	public List<AddressesItem> getAddresses(){
		return addresses;
	}

	public void setVouchers(Vouchers vouchers){
		this.vouchers = vouchers;
	}

	public Vouchers getVouchers(){
		return vouchers;
	}

	public void setUsers(Users users){
		this.users = users;
	}

	public Users getUsers(){
		return users;
	}

	public void setProducts(Products products){
		this.products = products;
	}

	public Products getProducts(){
		return products;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"giftcards = '" + giftcards + '\'' + 
			",addresses = '" + addresses + '\'' + 
			",vouchers = '" + vouchers + '\'' + 
			",users = '" + users + '\'' + 
			",products = '" + products + '\'' + 
			"}";
		}
}