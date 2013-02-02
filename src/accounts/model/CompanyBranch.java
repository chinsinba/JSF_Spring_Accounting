package accounts.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
public class CompanyBranch {

	@Id
	@TableGenerator(name = "CompanyBranch_GEN", table = "ID_GEN", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VAL", allocationSize = 1)
	@GeneratedValue(strategy= GenerationType.TABLE, generator = "CompanyBranch_GEN")
	private long id;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	private CompanyDetails parentCompany;

	private String branchName;

	private String branchCode;

	private Address branchAddress;

	private Set<Contact> contactpersons;

	private String internalCode;

	public CompanyDetails getParentCompany() {
		return parentCompany;
	}

	public void setParentCompany(CompanyDetails parentCompany) {
		this.parentCompany = parentCompany;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public Address getBranchAddress() {
		return branchAddress;
	}

	public void setBranchAddress(Address branchAddress) {
		this.branchAddress = branchAddress;
	}

	public Set<Contact> getContactpersons() {
		return contactpersons;
	}

	public void setContactpersons(Set<Contact> contactpersons) {
		this.contactpersons = contactpersons;
	}

	public String getInternalCode() {
		return internalCode;
	}

	public void setInternalCode(String internalCode) {
		this.internalCode = internalCode;
	}

}
