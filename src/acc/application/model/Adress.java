package acc.application.model;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Set;


/**
 * The persistent class for the Adress database table.
 * 
 */
@Entity
public class Adress implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@TableGenerator(name = "Address_GEN", table = "ID_GEN", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VAL", allocationSize = 1)
	@GeneratedValue(generator = "Address_GEN")
	private int adress_id;

	@Column(name="Address_Line_1")
	private String address_Line_1;

	@Column(name="Address_Line_2")
	private String address_Line_2;

	@Column(name="Address_Line_3")
	private String address_Line_3;

	@Column(name="Address_Line_4")
	private String address_Line_4;

	@Column(name="City")
	private String city;

	@Column(name="Country")
	private String country;

	@Column(name="District")
	private String district;

	@Column(name="Hobli_Gram")
	private String hobli_Gram;

	@Column(name="State")
	private String state;

	/*//bi-directional many-to-one association to Branch
	@OneToMany(mappedBy="adress")
	private Set<Branch> branches;

	//bi-directional many-to-one association to Company_Detail
	@OneToMany(mappedBy="adress")
	private Set<Company_Detail> companyDetails;

	//bi-directional many-to-one association to Company_account
	@OneToMany(mappedBy="adress")
	private Set<Company_account> companyAccounts;*/

    public Adress() {
    }

	public int getAdress_id() {
		return this.adress_id;
	}

	public void setAdress_id(int adress_id) {
		this.adress_id = adress_id;
	}

	public String getAddress_Line_1() {
		return this.address_Line_1;
	}

	public void setAddress_Line_1(String address_Line_1) {
		this.address_Line_1 = address_Line_1;
	}

	public String getAddress_Line_2() {
		return this.address_Line_2;
	}

	public void setAddress_Line_2(String address_Line_2) {
		this.address_Line_2 = address_Line_2;
	}

	public String getAddress_Line_3() {
		return this.address_Line_3;
	}

	public void setAddress_Line_3(String address_Line_3) {
		this.address_Line_3 = address_Line_3;
	}

	public String getAddress_Line_4() {
		return this.address_Line_4;
	}

	public void setAddress_Line_4(String address_Line_4) {
		this.address_Line_4 = address_Line_4;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getHobli_Gram() {
		return this.hobli_Gram;
	}

	public void setHobli_Gram(String hobli_Gram) {
		this.hobli_Gram = hobli_Gram;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

/*	public Set<Branch> getBranches() {
		return this.branches;
	}

	public void setBranches(Set<Branch> branches) {
		this.branches = branches;
	}
	
	public Set<Company_Detail> getCompanyDetails() {
		return this.companyDetails;
	}

	public void setCompanyDetails(Set<Company_Detail> companyDetails) {
		this.companyDetails = companyDetails;
	}
	
	public Set<Company_account> getCompanyAccounts() {
		return this.companyAccounts;
	}

	public void setCompanyAccounts(Set<Company_account> companyAccounts) {
		this.companyAccounts = companyAccounts;
	}*/
	
}