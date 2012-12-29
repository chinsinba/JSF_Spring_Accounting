package acc.application.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Ledger_account database table.
 * 
 */
@Entity
public class Ledger_account implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@TableGenerator(name = "Ledger_account_GEN", table = "ID_GEN", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VAL", allocationSize = 1)
	@GeneratedValue(generator = "Ledger_account_GEN")
	private long id;

	@Column(name="Account_Code")
	private String account_Code;

	@Column(name="Account_name")
	private String account_name;

	@Column(name="company_name")
	private String companyName;

	@Column(name="opening_balance")
	private double openingBalance;

	@Column(name="sub_group")
	private String subGroup;

	private String type;

	//bi-directional many-to-one association to Company_Detail
    @ManyToOne
	@JoinColumn(name="Company_Details_Company_Id")
	private Company_Detail companyDetail;

    public Ledger_account() {
    }

	
	public String getAccount_Code() {
		return this.account_Code;
	}

	public void setAccount_Code(String account_Code) {
		this.account_Code = account_Code;
	}

	public String getAccount_name() {
		return this.account_name;
	}

	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public double getOpeningBalance() {
		return this.openingBalance;
	}

	public void setOpeningBalance(double openingBalance) {
		this.openingBalance = openingBalance;
	}

	public String getSubGroup() {
		return this.subGroup;
	}

	public void setSubGroup(String subGroup) {
		this.subGroup = subGroup;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
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