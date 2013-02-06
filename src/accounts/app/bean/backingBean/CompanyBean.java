package accounts.app.bean.backingBean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

import accounts.app.service.CompanyService;
import accounts.app.service.UserService;
import accounts.model.entity.Address;
import accounts.model.entity.CompanyDetails;

@ManagedBean
@RequestScoped
public class CompanyBean {

	private String compName;

	private String panNo;

	private String addrLine1;

	private String addrLine2;

	private String addrLine3;

	private String addrLine4;

	private String city;

	private String district;

	private String hobliGram;

	private String state;

	private String country;

	private int contactNo;

	private String email;

	private CompanyService companyService;

	private String typeCode ;

	private List<String> typeCodes;

	private String regName;

	private String regNo;


	private String stakeHoldName;

	private Date stakeHoldDob;

	private int stakeHoldPhNo;

	private String stakeHoldAddr;

	private String stakeHoldEmail;

	private String stakeHoldPan;

	private Date regDate;

	private Date finStartDate;

	private Date finEndDate;

	private Date bookStartDate;

	public CompanyService getCompanyService() {
		return companyService;
	}


	public String getStakeHoldName() {
		return stakeHoldName;
	}


	public void setStakeHoldName(String stakeHoldName) {
		this.stakeHoldName = stakeHoldName;
	}


	public Date getStakeHoldDob() {
		return stakeHoldDob;
	}


	public void setStakeHoldDob(Date stakeHoldDob) {
		this.stakeHoldDob = stakeHoldDob;
	}


	public int getStakeHoldPhNo() {
		return stakeHoldPhNo;
	}


	public void setStakeHoldPhNo(int stakeHoldPhNo) {
		this.stakeHoldPhNo = stakeHoldPhNo;
	}


	public String getStakeHoldAddr() {
		return stakeHoldAddr;
	}


	public void setStakeHoldAddr(String stakeHoldAddr) {
		this.stakeHoldAddr = stakeHoldAddr;
	}


	public String getStakeHoldEmail() {
		return stakeHoldEmail;
	}


	public void setStakeHoldEmail(String stakeHoldEmail) {
		this.stakeHoldEmail = stakeHoldEmail;
	}


	public String getStakeHoldPan() {
		return stakeHoldPan;
	}


	public void setStakeHoldPan(String stakeHoldPan) {
		this.stakeHoldPan = stakeHoldPan;
	}


	public void setCompanyService(CompanyService companyService) {
		this.companyService = companyService;
	}


	public Date getFinStartDate() {
		return finStartDate;
	}


	public void setFinStartDate(Date finStartDate) {
		this.finStartDate = finStartDate;
	}


	public Date getFinEndDate() {
		return finEndDate;
	}


	public void setFinEndDate(Date finEndDate) {
		this.finEndDate = finEndDate;
	}


	public Date getBookStartDate() {
		return bookStartDate;
	}


	public void setBookStartDate(Date bookStartDate) {
		this.bookStartDate = bookStartDate;
	}


	@Inject
	public CompanyBean(final CompanyService service)
	{
		this.companyService = service;
	}


	public void save(){
		CompanyDetails company = new CompanyDetails();
		company.setCompanyName(getCompName());

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

		company.setCompanyAddress(addr);

		company.setPanNo(getPanNo());
		company.setFinancialYearEnd(new java.sql.Date(getFinEndDate().getTime()));
		company.setFinancialYearStart(new java.sql.Date(getFinStartDate().getTime()));
		company.setBooksStartDate(new java.sql.Date(getBookStartDate().getTime()));

		company.setRegistrationDate(new java.sql.Date(getRegDate().getTime()));

		company.setRegistrationName(getRegName());

		company.setRegistrationNo(getRegNo());


		companyService.create(company);

	}

	private List<CompanyDetails> stakeHolder;


	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public String getAddrLine1() {
		return addrLine1;
	}

	public void setAddrLine1(String addrLine1) {
		this.addrLine1 = addrLine1;
	}

	public String getAddrLine2() {
		return addrLine2;
	}

	public void setAddrLine2(String addrLine2) {
		this.addrLine2 = addrLine2;
	}

	public String getAddrLine3() {
		return addrLine3;
	}

	public void setAddrLine3(String addrLine3) {
		this.addrLine3 = addrLine3;
	}

	public String getAddrLine4() {
		return addrLine4;
	}

	public void setAddrLine4(String addrLine4) {
		this.addrLine4 = addrLine4;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getHobliGram() {
		return hobliGram;
	}

	public void setHobliGram(String hobliGram) {
		this.hobliGram = hobliGram;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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
		return regName;
	}


	public void setRegName(String regName) {
		this.regName = regName;
	}


	public String getRegNo() {
		return regNo;
	}


	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}


	public Date getRegDate() {
		return regDate;
	}


	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}


	public List<CompanyDetails> getStakeHolder() {
		return companyService.getCompanies();
	}


	public void setStakeHolder(List<CompanyDetails> stakeHolder) {
		this.stakeHolder = stakeHolder;
	}



}
