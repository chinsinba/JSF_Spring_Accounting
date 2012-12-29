package acc.application.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Bank_accounts database table.
 * 
 */
@Entity
@Table(name="Bank_accounts")
public class Bank_account implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@TableGenerator(name = "Bank_account_GEN", table = "ID_GEN", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VAL", allocationSize = 1)
	@GeneratedValue(generator = "Bank_account_GEN")
	private long id;

	@Column(name="Bank_account_no")
	private String bank_account_no;

	@Column(name="Bank_account_type")
	private String bank_account_type;

	@Column(name="Bank_Branch_address")
	private String bank_Branch_address;

	@Column(name="Bank_branch_code")
	private String bank_branch_code;

	@Column(name="Bank_branch_name")
	private String bank_branch_name;

	@Column(name="Bank_code")
	private String bank_code;

	@Column(name="Bank_Contact_no")
	private String bank_Contact_no;

	@Column(name="Bank_contact_person")
	private String bank_contact_person;

	@Column(name="Bank_group")
	private String bank_group;

	@Column(name="Bank_Name")
	private String bank_Name;

	@Column(name="Bank_type")
	private String bank_type;

	@Column(name="opening_balance")
	private String openingBalance;

	//bi-directional many-to-one association to Company_Detail
	@ManyToOne
	@JoinColumn(name="Company_Id")
	private Company_Detail companyDetail;

	public Bank_account() {
	}


	public String getBank_account_no() {
		return this.bank_account_no;
	}

	public void setBank_account_no(String bank_account_no) {
		this.bank_account_no = bank_account_no;
	}

	public String getBank_account_type() {
		return this.bank_account_type;
	}

	public void setBank_account_type(String bank_account_type) {
		this.bank_account_type = bank_account_type;
	}

	public String getBank_Branch_address() {
		return this.bank_Branch_address;
	}

	public void setBank_Branch_address(String bank_Branch_address) {
		this.bank_Branch_address = bank_Branch_address;
	}

	public String getBank_branch_code() {
		return this.bank_branch_code;
	}

	public void setBank_branch_code(String bank_branch_code) {
		this.bank_branch_code = bank_branch_code;
	}

	public String getBank_branch_name() {
		return this.bank_branch_name;
	}

	public void setBank_branch_name(String bank_branch_name) {
		this.bank_branch_name = bank_branch_name;
	}

	public String getBank_code() {
		return this.bank_code;
	}

	public void setBank_code(String bank_code) {
		this.bank_code = bank_code;
	}

	public String getBank_Contact_no() {
		return this.bank_Contact_no;
	}

	public void setBank_Contact_no(String bank_Contact_no) {
		this.bank_Contact_no = bank_Contact_no;
	}

	public String getBank_contact_person() {
		return this.bank_contact_person;
	}

	public void setBank_contact_person(String bank_contact_person) {
		this.bank_contact_person = bank_contact_person;
	}

	public String getBank_group() {
		return this.bank_group;
	}

	public void setBank_group(String bank_group) {
		this.bank_group = bank_group;
	}

	public String getBank_Name() {
		return this.bank_Name;
	}

	public void setBank_Name(String bank_Name) {
		this.bank_Name = bank_Name;
	}

	public String getBank_type() {
		return this.bank_type;
	}

	public void setBank_type(String bank_type) {
		this.bank_type = bank_type;
	}

	public String getOpeningBalance() {
		return this.openingBalance;
	}

	public void setOpeningBalance(String openingBalance) {
		this.openingBalance = openingBalance;
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