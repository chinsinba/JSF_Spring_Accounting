package accounts.app.bean.backingBean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import accounts.app.service.CompanyService;
import accounts.model.entity.Address;
import accounts.model.entity.CompanyDetails;

@ManagedBean
@ViewScoped
public class CompanyBean {
	private boolean saveEnabled ; 

	/*private String compName;

	private String panNo;

	private String addrLine1;

	private String addrLine2;

	private String addrLine3;

	private String addrLine4;

	private String city;

	private String district;

	private String hobliGram;

	private String state;

	private String country;*/

	private int contactNo;

	private String email;

	private CompanyService companyService;

	private String typeCode ;

	private List<String> typeCodes;

	/*private String regName;

	private String regNo;


	private Date regDate;

	private Date finStartDate;

	private Date finEndDate;

	private Date bookStartDate;*/

	private CompanyDetails company ;

	private Address compAddress;

	public CompanyService getCompanyService() {
		return companyService;
	}


	public void setCompanyService(CompanyService companyService) {
		this.companyService = companyService;
	}


	public Date getFinStartDate() {
		return getCompany().getFinancialYearStart();
	}


	public void setFinStartDate(Date finStartDate) {
		getCompany().setFinancialYearStart(new java.sql.Date(finStartDate.getTime()));
	}


	public Date getFinEndDate() {
		return getCompany().getFinancialYearEnd();
	}


	public void setFinEndDate(Date finEndDate) {
		getCompany().setFinancialYearEnd(new java.sql.Date(finEndDate.getTime()));
	}


	public Date getBookStartDate() {
		return getCompany().getBooksStartDate();
	}


	public void setBookStartDate(Date bookStartDate) {
		getCompany().setBooksStartDate(new java.sql.Date(bookStartDate.getTime()));
	}


	@Inject
	public CompanyBean(final CompanyService service)
	{
		this.companyService = service;
		company = companyService.get();
		if(company == null){
			setSaveEnabled(false);
			company = new CompanyDetails();
			compAddress = new Address();
		}
		else
		{
			setSaveEnabled(true);
			compAddress= company.getCompanyAddress();
		}
	}

	public void save(){

		/*		getCompany().setCompanyName(getCompName());

		Address addr = new Address();
		addr.setAddressLine1(getAddrLine1());
		addr.setAddressLine2(getAddrLine2());
		addr.setAddressLine3(getAddrLine3());
		addr.setAddressLine4(getAddrLine4());
		addr.setCity(getCity());
		addr.setCountry(getCountry());
		addr.setDistrict(getDistrict());
		addr.setState(getState());
		addr.setHobliGram(getHobliGram());

		getCompany().setCompanyAddress(addr);

		getCompany().setPanNo(getPanNo());
		getCompany().setFinancialYearEnd(new java.sql.Date(getFinEndDate().getTime()));
		getCompany().setFinancialYearStart(new java.sql.Date(getFinStartDate().getTime()));
		getCompany().setBooksStartDate(new java.sql.Date(getBookStartDate().getTime()));

		getCompany().setRegistrationDate(new java.sql.Date(getRegDate().getTime()));

		getCompany().setRegistrationName(getRegName());

		getCompany().setRegistrationNo(getRegNo());*/

		getCompany().setCompanyAddress(getCompAddress());


		companyService.create(getCompany());

	}



	public String getCompName() {
		return getCompany().getCompanyName();
	}

	public void setCompName(String compName) {
		getCompany().setCompanyName(compName);
	}

	public String getPanNo() {
		return getCompany().getPanNo();
	}

	public void setPanNo(String panNo) {
		getCompany().setPanNo(panNo);
	}

	public String getAddrLine1() {
		return getCompAddress().getAddressLine1();
	}

	public void setAddrLine1(String addrLine1) {
		getCompAddress().setAddressLine1(addrLine1);
	}

	public String getAddrLine2() {
		return getCompAddress().getAddressLine2();
	}

	public void setAddrLine2(String addrLine2) {
		getCompAddress().setAddressLine2(addrLine2);
	}

	public String getAddrLine3() {
		return getCompAddress().getAddressLine3();
	}

	public void setAddrLine3(String addrLine3) {
		getCompAddress().setAddressLine3(addrLine3);
	}

	public String getAddrLine4() {
		return getCompAddress().getAddressLine4();
	}

	public void setAddrLine4(String addrLine4) {
		getCompAddress().setAddressLine4(addrLine4);
	}

	public String getCity() {
		return getCompAddress().getCity();
	}

	public void setCity(String city) {
		getCompAddress().setCity(city);
	}

	public String getDistrict() {
		return getCompAddress().getDistrict();
	}

	public void setDistrict(String district) {
		getCompAddress().setDistrict(district);
	}

	public String getHobliGram() {
		return getCompAddress().getHobliGram();
	}

	public void setHobliGram(String hobliGram) {
		getCompAddress().setHobliGram(hobliGram);
	}

	public String getState() {
		return getCompAddress().getState();
	}

	public void setState(String state) {
		getCompAddress().setState(state);
	}

	public String getCountry() {
		return getCompAddress().getCountry();
	}

	public void setCountry(String country) {
		getCompAddress().setCountry(country);
	}

	public int getContactNo() {
		return contactNo;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public List<String> getTypeCodes() {
		typeCodes =new ArrayList<String>();
		typeCodes.add("Proprietary");
		typeCodes.add("Pvt ltd Co");
		typeCodes.add("Public ltd Co");
		typeCodes.add("Govt Enterprise");

		return typeCodes;
	}

	public void setTypeCodes(List<String> typeCodes) {
		this.typeCodes = typeCodes;
	}


	public String getTypeCode() {
		return "Govt Enterprise";
	}


	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}


	public String getRegName() {
		return getCompany().getRegistrationName();
	}


	public void setRegName(String regName) {
		getCompany().setRegistrationName(regName);
	}


	public String getRegNo() {
		return getCompany().getRegistrationNo();
	}


	public void setRegNo(String regNo) {
		getCompany().setRegistrationNo(regNo);
	}


	public Date getRegDate() {
		return getCompany().getRegistrationDate();
	}


	public void setRegDate(Date regDate) {
		getCompany().setRegistrationDate(new java.sql.Date(regDate.getTime()));
	}


	public CompanyDetails getCompany() {

		return company;
	}


	public void setCompany(CompanyDetails company) {
		this.company = company;
	}


	public boolean isSaveEnabled() {
		return saveEnabled;
	}


	public void setSaveEnabled(boolean saveEnabled) {
		this.saveEnabled = saveEnabled;
	}


	public Address getCompAddress() {
		return compAddress;
	}


	public void setCompAddress(Address compAddress) {
		this.compAddress = compAddress;
	}

}
