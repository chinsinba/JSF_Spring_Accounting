package acc.application.model;

import java.io.Serializable;

import java.util.Set;

import javax.persistence.*;


/**
 * The persistent class for the account_type database table.
 * 
 */
@Entity
@Table(name="account_type")
public class AccountType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@TableGenerator(name = "AccType_GEN", table = "ID_GEN", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VAL", allocationSize = 1)
	@GeneratedValue(generator = "AccType_GEN")
	private long account_type_ID;

	@Column(name="account_type")
	private String accountType;

	//bi-directional many-to-one association to Company_account
	@OneToMany(mappedBy="accountType")
	private Set<Company_account> companyAccounts;

    public AccountType() {
    }

	public long getAccount_type_ID() {
		return this.account_type_ID;
	}

	public void setAccount_type_ID(long account_type_ID) {
		this.account_type_ID = account_type_ID;
	}

	public String getAccountType() {
		return this.accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Set<Company_account> getCompanyAccounts() {
		return this.companyAccounts;
	}

	public void setCompanyAccounts(Set<Company_account> companyAccounts) {
		this.companyAccounts = companyAccounts;
	}
	
}