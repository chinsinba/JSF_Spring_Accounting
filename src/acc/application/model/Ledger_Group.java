package acc.application.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Ledger_Groups database table.
 * 
 */
@Entity
@Table(name="Ledger_Groups")
public class Ledger_Group implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@TableGenerator(name = "Ledger_Group_GEN", table = "ID_GEN", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VAL", allocationSize = 1)
	@GeneratedValue(generator = "Ledger_Group_GEN")
	private long ledger_Group_ID;

	private int code;

	@Column(name="company_name")
	private String companyName;

	@Column(name="Ledger_Group_Name")
	private String ledger_Group_Name;

	@Column(name="Ledger_Sub_Group")
	private String ledger_Sub_Group;

    public Ledger_Group() {
    }

	public long getLedger_Group_ID() {
		return this.ledger_Group_ID;
	}

	public void setLedger_Group_ID(long ledger_Group_ID) {
		this.ledger_Group_ID = ledger_Group_ID;
	}

	public int getCode() {
		return this.code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getLedger_Group_Name() {
		return this.ledger_Group_Name;
	}

	public void setLedger_Group_Name(String ledger_Group_Name) {
		this.ledger_Group_Name = ledger_Group_Name;
	}

	public String getLedger_Sub_Group() {
		return this.ledger_Sub_Group;
	}

	public void setLedger_Sub_Group(String ledger_Sub_Group) {
		this.ledger_Sub_Group = ledger_Sub_Group;
	}

}