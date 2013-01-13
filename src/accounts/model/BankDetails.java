package accounts.model;

public class BankDetails {
	
	private String bankName;
	
	private String  accountNo;
	
	private String branchName;
	
	private String branchCode;
	
	private Address address;
	
	private String iscCode;
	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getIscCode() {
		return iscCode;
	}
	public void setIscCode(String iscCode) {
		this.iscCode = iscCode;
	}
}
