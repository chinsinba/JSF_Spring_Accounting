package acc.application.model;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the Company_Details database table.
 * 
 */
@Entity
@Table(name="Company_Details")
public class Company_Detail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@TableGenerator(name = "Company_Detail_GEN", table = "ID_GEN", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VAL", allocationSize = 1)
	@GeneratedValue(generator = "Company_Detail_GEN")
	private long company_Id;

    @Temporal( TemporalType.DATE)
	private Date books_Start_Date;

	@Column(name="Company_logo")
	private String company_logo;

	@Column(name="Company_Name")
	private String company_Name;

	@Column(name="Company_type")
	private String company_type;

    @Temporal( TemporalType.DATE)
	@Column(name="financial_year_end_date")
	private Date financialYearEndDate;

    @Temporal( TemporalType.DATE)
	@Column(name="Financial_year_Start_date")
	private Date financial_year_Start_date;

	@Column(name="PAN")
	private String pan;

    @Temporal( TemporalType.DATE)
	@Column(name="Reg_Date")
	private Date reg_Date;

	@Column(name="Register_Under")
	private String register_Under;

	@Column(name="req_branch")
	private byte reqBranch;

	@Column(name="VAT")
	private String vat;

	//bi-directional many-to-one association to Bank_account
	@OneToMany(mappedBy="companyDetail")
	private Set<Bank_account> bankAccounts;

	//bi-directional many-to-one association to Branch
	@OneToMany(mappedBy="companyDetail")
	private Set<Branch> branches;

	//bi-directional many-to-one association to Adress
    @OneToOne
	private Adress adress;

	//bi-directional many-to-one association to Company_account
	@OneToMany(mappedBy="companyDetail")
	private Set<Company_account> companyAccounts;

	//bi-directional many-to-one association to Ledger_account
	@OneToMany(mappedBy="companyDetail")
	private Set<Ledger_account> ledgerAccounts;

	//bi-directional many-to-one association to Item
	@OneToMany(mappedBy="companyDetail")
	private Set<Item> items;

    public Company_Detail() {
    }

	public long getCompany_Id() {
		return this.company_Id;
	}

	public void setCompany_Id(long company_Id) {
		this.company_Id = company_Id;
	}

	public Date getBooks_Start_Date() {
		return this.books_Start_Date;
	}

	public void setBooks_Start_Date(Date books_Start_Date) {
		this.books_Start_Date = books_Start_Date;
	}

	public String getCompany_logo() {
		return this.company_logo;
	}

	public void setCompany_logo(String company_logo) {
		this.company_logo = company_logo;
	}

	public String getCompany_Name() {
		return this.company_Name;
	}

	public void setCompany_Name(String company_Name) {
		this.company_Name = company_Name;
	}

	public String getCompany_type() {
		return this.company_type;
	}

	public void setCompany_type(String company_type) {
		this.company_type = company_type;
	}

	public Date getFinancialYearEndDate() {
		return this.financialYearEndDate;
	}

	public void setFinancialYearEndDate(Date financialYearEndDate) {
		this.financialYearEndDate = financialYearEndDate;
	}

	public Date getFinancial_year_Start_date() {
		return this.financial_year_Start_date;
	}

	public void setFinancial_year_Start_date(Date financial_year_Start_date) {
		this.financial_year_Start_date = financial_year_Start_date;
	}

	public String getPan() {
		return this.pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public Date getReg_Date() {
		return this.reg_Date;
	}

	public void setReg_Date(Date reg_Date) {
		this.reg_Date = reg_Date;
	}

	public String getRegister_Under() {
		return this.register_Under;
	}

	public void setRegister_Under(String register_Under) {
		this.register_Under = register_Under;
	}

	public byte getReqBranch() {
		return this.reqBranch;
	}

	public void setReqBranch(byte reqBranch) {
		this.reqBranch = reqBranch;
	}

	public String getVat() {
		return this.vat;
	}

	public void setVat(String vat) {
		this.vat = vat;
	}

	public Set<Bank_account> getBankAccounts() {
		return this.bankAccounts;
	}

	public void setBankAccounts(Set<Bank_account> bankAccounts) {
		this.bankAccounts = bankAccounts;
	}
	
	public Set<Branch> getBranches() {
		return this.branches;
	}

	public void setBranches(Set<Branch> branches) {
		this.branches = branches;
	}
	
	public Adress getAdress() {
		return this.adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	
	public Set<Company_account> getCompanyAccounts() {
		return this.companyAccounts;
	}

	public void setCompanyAccounts(Set<Company_account> companyAccounts) {
		this.companyAccounts = companyAccounts;
	}
	
	public Set<Ledger_account> getLedgerAccounts() {
		return this.ledgerAccounts;
	}

	public void setLedgerAccounts(Set<Ledger_account> ledgerAccounts) {
		this.ledgerAccounts = ledgerAccounts;
	}
	
	public Set<Item> getItems() {
		return this.items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}
	
}