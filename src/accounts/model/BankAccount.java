package accounts.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import org.hibernate.annotations.Entity;

@Entity
@Table(name = "BankAccount")
public class BankAccount {

	@Id
	@TableGenerator(name = "BankAccount_GEN", table = "ID_GEN", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VAL", allocationSize = 1)
	@GeneratedValue(strategy= GenerationType.TABLE, generator = "BankAccount_GEN")
	private long id;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	private CompanyDetails company;
	
	private BankDetails bankDetails;
	
	private String code;
	
	private LedgerGroup ledGroup;
	
	//debit/credit
	private String accountType;
	
	private String  accountNo;
	
	
	
	private Contact contact;
	
	
	private long openingBalance;
	
	private String type;
	
	private String internalCode;

	public CompanyDetails getCompany() {
		return company;
	}

	public void setCompany(CompanyDetails company) {
		this.company = company;
	}

	public BankDetails getBankDetails() {
		return bankDetails;
	}

	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public LedgerGroup getLedGroup() {
		return ledGroup;
	}

	public void setLedGroup(LedgerGroup ledGroup) {
		this.ledGroup = ledGroup;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public long getOpeningBalance() {
		return openingBalance;
	}

	public void setOpeningBalance(long openingBalance) {
		this.openingBalance = openingBalance;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getInternalCode() {
		return internalCode;
	}

	public void setInternalCode(String internalCode) {
		this.internalCode = internalCode;
	}
	
}
