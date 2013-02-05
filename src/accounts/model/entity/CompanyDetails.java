package accounts.model.entity;
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;


@Entity
@Table(name="COMPANYDETAILS")
public class CompanyDetails {


	@Id
	@TableGenerator(name = "CompanyDetails_GEN", table = "ID_GEN", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VAL", allocationSize = 1)
	@GeneratedValue(strategy= GenerationType.TABLE, generator = "CompanyDetails_GEN")
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	private String companyName;

	@Lob
	private byte[] companyLogo;

	private String companyType;

	private String companyCode;

	private boolean hasBranch;

	private String registeredUnder;

	private Date registrationDate;

	private String registrationName;

	private String registrationNo;

	private String PanNo;

	private Date booksStartDate;

	private Date financialYearStart;

	private Date financialYearEnd;

	@OneToOne(cascade ={CascadeType.ALL})
	private Address companyAddress;

	@OneToMany(cascade={CascadeType.ALL})
	private List<CompanyBranch> branches;

	public List<CompanyBranch> getBranches() {
		return branches;
	}

	public void setBranches(List<CompanyBranch> branches) {
		this.branches = branches;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public byte[] getCompanyLogo() {
		return companyLogo;
	}

	public void setCompanyLogo(byte[] companyLogo) {
		this.companyLogo = companyLogo;
	}

	public String getCompanyType() {
		return companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public boolean isHasBranch() {
		return hasBranch;
	}

	public void setHasBranch(boolean hasBranch) {
		this.hasBranch = hasBranch;
	}

	public String getRegisteredUnder() {
		return registeredUnder;
	}

	public void setRegisteredUnder(String registeredUnder) {
		this.registeredUnder = registeredUnder;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getRegistrationName() {
		return registrationName;
	}

	public void setRegistrationName(String registrationName) {
		this.registrationName = registrationName;
	}

	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String getPanNo() {
		return PanNo;
	}

	public void setPanNo(String panNo) {
		PanNo = panNo;
	}

	public Date getBooksStartDate() {
		return booksStartDate;
	}

	public void setBooksStartDate(Date booksStartDate) {
		this.booksStartDate = booksStartDate;
	}

	public Date getFinancialYearStart() {
		return financialYearStart;
	}

	public void setFinancialYearStart(Date financialYearStart) {
		this.financialYearStart = financialYearStart;
	}

	public Date getFinancialYearEnd() {
		return financialYearEnd;
	}

	public void setFinancialYearEnd(Date financialYearEnd) {
		this.financialYearEnd = financialYearEnd;
	}

	public Address getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(Address companyAddress) {
		this.companyAddress = companyAddress;
	}


}
