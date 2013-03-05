package accounts.model.entity.account;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import accounts.model.entity.Address;
import accounts.model.entity.BankDetails;
import accounts.model.entity.CompanyDetails;
import accounts.model.entity.Contact;
import accounts.model.entity.LedgerAccount;
import accounts.model.entity.LedgerGroup;
import accounts.model.entity.user.User;

@Entity
@Table(name="SUPPLIERACCOUNT")
@NamedQuery(name="SupplierAccount.findAll",query="SELECT sup FROM SupplierAccount sup WHERE sup.company=:comp")
public class SupplierAccount  {



	@Id
	@TableGenerator(name = "SupplierAccount_GEN", table = "ID_GEN", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VAL", allocationSize = 1)
	@GeneratedValue(strategy= GenerationType.TABLE, generator = "SupplierAccount_GEN")
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	@OneToOne
	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

	@OneToOne
	private CompanyDetails company;

	private String name;

	private String code;

	@OneToOne(cascade={CascadeType.ALL})
	private Contact contact;

	private String panNo;

	private String email;

	@OneToOne(cascade={CascadeType.ALL})
	private Address address;

	@OneToOne
	private LedgerAccount ledgerAccount;

	@OneToOne
	private LedgerGroup ledgerGroup;

	private long openingBal;

	private String type;

	@OneToOne(cascade={CascadeType.ALL})
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
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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
