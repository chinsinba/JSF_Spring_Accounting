package accounts.model;

import java.util.Set;

public class CompanyBranch {

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
