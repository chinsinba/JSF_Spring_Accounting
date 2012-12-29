package acc.application.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Company_accounts database table.
 * 
 */
@Entity
@Table(name="Company_accounts")
public class Company_account implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@TableGenerator(name = "Company_account_GEN", table = "ID_GEN", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VAL", allocationSize = 1)
	@GeneratedValue(generator = "Company_account_GEN")
	private long id;
	
	@Column(name="Acc_code")
	private String acc_code;

	@Column(name="Acc_Name")
	private String acc_Name;

	@Column(name="Account_name")
	private String account_name;

	@Column(name="contact_no")
	private String contactNo;

	@Column(name="contact_person")
	private String contactPerson;

	@Column(name="credit_days")
	private String creditDays;

	@Column(name="credit_limit")
	private String creditLimit;

	private String email;

	@Column(name="Group_name")
	private String group_name;

	@Column(name="opening_balance")
	private String openingBalance;

	@Column(name="PAN")
	private String pan;

	@Column(name="reg_name")
	private String regName;

	@Column(name="reg_no")
	private String regNo;

	private String type;

	//bi-directional many-to-one association to Adress
	@ManyToOne
	@JoinColumn(name="address")
	private Adress adress;

	//bi-directional many-to-one association to AccountType
	@ManyToOne
	@JoinColumn(name="account_type_ID")
	private AccountType accountType;

	//bi-directional many-to-one association to Bank_detail
	@ManyToOne
	@JoinColumn(name="Bank_details_ID")
	private Bank_detail bankDetail;

	//bi-directional many-to-one association to Company_Detail
	@ManyToOne
	@JoinColumn(name="Company_Id")
	private Company_Detail companyDetail;

	public Company_account() {
	}

	public String getAcc_code() {
		return this.acc_code;
	}

	public void setAcc_code(String acc_code) {
		this.acc_code = acc_code;
	}

	public String getAcc_Name() {
		return this.acc_Name;
	}

	public void setAcc_Name(String acc_Name) {
		this.acc_Name = acc_Name;
	}

	public String getAccount_name() {
		return this.account_name;
	}

	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}

	public String getContactNo() {
		return this.contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getContactPerson() {
		return this.contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getCreditDays() {
		return this.creditDays;
	}

	public void setCreditDays(String creditDays) {
		this.creditDays = creditDays;
	}

	public String getCreditLimit() {
		return this.creditLimit;
	}

	public void setCreditLimit(String creditLimit) {
		this.creditLimit = creditLimit;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGroup_name() {
		return this.group_name;
	}

	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}

	public String getOpeningBalance() {
		return this.openingBalance;
	}

	public void setOpeningBalance(String openingBalance) {
		this.openingBalance = openingBalance;
	}

	public String getPan() {
		return this.pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getRegName() {
		return this.regName;
	}

	public void setRegName(String regName) {
		this.regName = regName;
	}

	public String getRegNo() {
		return this.regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Adress getAdress() {
		return this.adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	public AccountType getAccountType() {
		return this.accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public Bank_detail getBankDetail() {
		return this.bankDetail;
	}

	public void setBankDetail(Bank_detail bankDetail) {
		this.bankDetail = bankDetail;
	}

	public Company_Detail getCompanyDetail() {
		return this.companyDetail;
	}

	public void setCompanyDetail(Company_Detail companyDetail) {
		this.companyDetail = companyDetail;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}