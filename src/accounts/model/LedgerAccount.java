package accounts.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
public class LedgerAccount {
	
	@Id
	@TableGenerator(name = "LedgerAccount_GEN", table = "ID_GEN", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VAL", allocationSize = 1)
	@GeneratedValue(strategy= GenerationType.TABLE, generator = "LedgerAccount_GEN")
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	
	private CompanyDetails company;
	
	private String accountName;
	
	private String accountCode;
	
	private LedgerGroup LedgerGroup;
	
	private long openingBalance;
	
	private String internalCode;
	
	//this linked to  LedgerGroup
	private String debit_Credit;

	public CompanyDetails getCompany() {
		return company;
	}

	public void setCompany(CompanyDetails company) {
		this.company = company;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountCode() {
		return accountCode;
	}

	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}

	public LedgerGroup getLedgerGroup() {
		return LedgerGroup;
	}

	public void setLedgerGroup(LedgerGroup ledgerGroup) {
		LedgerGroup = ledgerGroup;
	}

	public long getOpeningBalance() {
		return openingBalance;
	}

	public void setOpeningBalance(long openingBalance) {
		this.openingBalance = openingBalance;
	}

	public String getInternalCode() {
		return internalCode;
	}

	public void setInternalCode(String internalCode) {
		this.internalCode = internalCode;
	}

	public String getDebit_Credit() {
		return debit_Credit;
	}

	public void setDebit_Credit(String debit_Credit) {
		this.debit_Credit = debit_Credit;
	}
	

}
