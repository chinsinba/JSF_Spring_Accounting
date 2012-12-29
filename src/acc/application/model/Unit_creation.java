package acc.application.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Unit_creation database table.
 * 
 */
@Entity
public class Unit_creation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@TableGenerator(name = "Unit_creation_GEN", table = "ID_GEN", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VAL", allocationSize = 1)
	@GeneratedValue(generator = "Unit_creation_GEN")
	private long unit_creation_id;

	@Column(name="company_name")
	private String companyName;

	private String decimal;

	@Column(name="Quantity")
	private String quantity;

	@Column(name="Unit_name")
	private String unit_name;

    public Unit_creation() {
    }

	public long getUnit_creation_id() {
		return this.unit_creation_id;
	}

	public void setUnit_creation_id(long unit_creation_id) {
		this.unit_creation_id = unit_creation_id;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDecimal() {
		return this.decimal;
	}

	public void setDecimal(String decimal) {
		this.decimal = decimal;
	}

	public String getQuantity() {
		return this.quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getUnit_name() {
		return this.unit_name;
	}

	public void setUnit_name(String unit_name) {
		this.unit_name = unit_name;
	}

}