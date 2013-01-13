package accounts.model;

public class LedgerAccount {
	
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
