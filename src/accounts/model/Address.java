package accounts.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;




@Entity
@Table(name="Address")
public class Address {
	
	@Id
	@TableGenerator(name = "ADDRESS_GEN", table = "ID_GEN", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VAL", allocationSize = 1)
	@GeneratedValue(strategy= GenerationType.TABLE, generator = "ADDRESS_GEN")
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	private String addressLine1;
	
	private String addressLine2;

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressLine3() {
		return addressLine3;
	}

	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	public String getAddressLine4() {
		return addressLine4;
	}

	public void setAddressLine4(String addressLine4) {
		this.addressLine4 = addressLine4;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getHobliGram() {
		return hobliGram;
	}

	public void setHobliGram(String hobliGram) {
		this.hobliGram = hobliGram;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	private String addressLine3;

	private String addressLine4;

	private String city;
	
	private String hobliGram;
	
	private String district;
	
	private String state;
	
	private String country;
	

}
