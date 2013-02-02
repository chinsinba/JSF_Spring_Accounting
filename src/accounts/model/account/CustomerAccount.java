package accounts.model.account;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

import accounts.model.Address;
import accounts.model.BankDetails;
import accounts.model.CompanyDetails;
import accounts.model.Contact;
import accounts.model.LedgerAccount;
import accounts.model.LedgerGroup;

@Entity
public class CustomerAccount {


	@Id
	@TableGenerator(name = "CustomerAccount_GEN", table = "ID_GEN", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VAL", allocationSize = 1)
	@GeneratedValue(strategy= GenerationType.TABLE, generator = "CustomerAccount_GEN")
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
	private CompanyDetails company;
	
	private String Name;
	
	private String Code;
	
	private Contact contact;
	
	private String panNo;
	
	private String email;
	
	private Address address;
	
	private LedgerAccount ledgerAccount;
	
	private LedgerGroup ledgerGroup;
	
	private long openingBal;
	
	private String type;
	
	private BankDetails bankDetails;
	
	private boolean creditLimit;
	
	private int noOfCreditDays;
	
	private String registrationName;
	
	private String registrationNo;

	public CompanyDetails getCompany() {
		return company;
	}

	public void setCompany(CompanyDetails company) {
		this.company = company;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public LedgerAccount getLedgerAccount() {
		return ledgerAccount;
	}

	public void setLedgerAccount(LedgerAccount ledgerAccount) {
		this.ledgerAccount = ledgerAccount;
	}

	public LedgerGroup getLedgerGroup() {
		return ledgerGroup;
	}

	public void setLedgerGroup(LedgerGroup ledgerGroup) {
		this.ledgerGroup = ledgerGroup;
	}

	public long getOpeningBal() {
		return openingBal;
	}

	public void setOpeningBal(long openingBal) {
		this.openingBal = openingBal;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public BankDetails getBankDetails() {
		return bankDetails;
	}

	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}

	public boolean isCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(boolean creditLimit) {
		this.creditLimit = creditLimit;
	}

	public int getNoOfCreditDays() {
		return noOfCreditDays;
	}

	public void setNoOfCreditDays(int noOfCreditDays) {
		this.noOfCreditDays = noOfCreditDays;
	}

	public String getRegistrationName() {
		return registrationName;
	}

	public void setRegistrationName(String registrationName) {
		this.registrationName = registrationName;
	}

	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}


}
