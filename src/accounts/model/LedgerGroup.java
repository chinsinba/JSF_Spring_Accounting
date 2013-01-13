package accounts.model;

import java.util.Set;

public class LedgerGroup {
	
	private CompanyDetails company;
	
	private String groupName;
	
	private Set<LedgerGroup> subgroup;
	
	private String code;
	
	private String internalCode;

	public CompanyDetails getCompany() {
		return company;
	}

	public void setCompany(CompanyDetails company) {
		this.company = company;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Set<LedgerGroup> getSubgroup() {
		return subgroup;
	}

	public void setSubgroup(Set<LedgerGroup> subgroup) {
		this.subgroup = subgroup;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getInternalCode() {
		return internalCode;
	}

	public void setInternalCode(String internalCode) {
		this.internalCode = internalCode;
	}
	

}
