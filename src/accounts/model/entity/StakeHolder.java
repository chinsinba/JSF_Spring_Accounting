package accounts.model.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.TableGenerator;


@Entity
@NamedQuery(name="stakeHolder.findall",query="SELECT stkhold FROM StakeHolder stkhold WHERE stkhold.company = :company")
@Table(name="STAKEHOLDER")
public class StakeHolder {

	@Id
	@TableGenerator(name = "StakeHolder_GEN", table = "ID_GEN", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VAL", allocationSize = 1)
	@GeneratedValue(strategy= GenerationType.TABLE, generator = "StakeHolder_GEN")
	private long id;
	
	@ManyToOne
	private CompanyDetails company;
	
	
	private String stakeHolderName;
	
	private Date dob;
	
	private String address;
	
	private long phNo;
	
	private String email;
	
	private String panNo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public CompanyDetails getCompany() {
		return company;
	}

	public void setCompany(CompanyDetails company) {
		this.company = company;
	}

	public String getStakeHolderName() {
		return stakeHolderName;
	}

	public void setStakeHolderName(String stakeHolderName) {
		this.stakeHolderName = stakeHolderName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhNo() {
		return phNo;
	}

	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	
}
