package accounts.model;
import java.sql.Date;

import javax.persistence.Lob;


public class CompanyDetails {

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
	
	private Address companyAddress;

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
