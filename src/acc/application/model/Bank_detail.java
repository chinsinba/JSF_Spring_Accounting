package acc.application.model;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Set;


/**
 * The persistent class for the Bank_details database table.
 * 
 */
@Entity
@Table(name="Bank_details")
public class Bank_detail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@TableGenerator(name = "Bank_detail_GEN", table = "ID_GEN", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VAL", allocationSize = 1)
	@GeneratedValue(generator = "Bank_detail_GEN")
	private int bank_details_ID;

	@Column(name="Bank_account_no")
	private String bank_account_no;

	@Column(name="Bank_branch_address")
	private String bank_branch_address;

	@Column(name="Bank_branch_code")
	private String bank_branch_code;

	@Column(name="Bank_Branch_name")
	private String bank_Branch_name;

	@Column(name="Bank_IFSC_Code")
	private String bank_IFSC_Code;

	@Column(name="Bank_Name")
	private String bank_Name;

	//bi-directional many-to-one association to Company_account
	@OneToMany(mappedBy="bankDetail")
	private Set<Company_account> companyAccounts;

    public Bank_detail() {
    }

	public int getBank_details_ID() {
		return this.bank_details_ID;
	}

	public void setBank_details_ID(int bank_details_ID) {
		this.bank_details_ID = bank_details_ID;
	}

	public String getBank_account_no() {
		return this.bank_account_no;
	}

	public void setBank_account_no(String bank_account_no) {
		this.bank_account_no = bank_account_no;
	}

	public String getBank_branch_address() {
		return this.bank_branch_address;
	}

	public void setBank_branch_address(String bank_branch_address) {
		this.bank_branch_address = bank_branch_address;
	}

	public String getBank_branch_code() {
		return this.bank_branch_code;
	}

	public void setBank_branch_code(String bank_branch_code) {
		this.bank_branch_code = bank_branch_code;
	}

	public String getBank_Branch_name() {
		return this.bank_Branch_name;
	}

	public void setBank_Branch_name(String bank_Branch_name) {
		this.bank_Branch_name = bank_Branch_name;
	}

	public String getBank_IFSC_Code() {
		return this.bank_IFSC_Code;
	}

	public void setBank_IFSC_Code(String bank_IFSC_Code) {
		this.bank_IFSC_Code = bank_IFSC_Code;
	}

	public String getBank_Name() {
		return this.bank_Name;
	}

	public void setBank_Name(String bank_Name) {
		this.bank_Name = bank_Name;
	}

	public Set<Company_account> getCompanyAccounts() {
		return this.companyAccounts;
	}

	public void setCompanyAccounts(Set<Company_account> companyAccounts) {
		this.companyAccounts = companyAccounts;
	}
	
}