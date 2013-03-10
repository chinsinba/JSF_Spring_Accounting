package accounts.app.bean.backingBean.Company;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import accounts.app.bean.PreferencesBean;
import accounts.app.service.CompanyService;
import accounts.model.entity.Address;
import accounts.model.entity.CompanyDetails;

@ManagedBean
@SessionScoped
public class CompanyBean {
	private boolean saveEnabled ; 

	private boolean editable = true;

	private int contactNo;

	private String email;

	private CompanyService companyService;

	private String typeCode ;

	private List<String> typeCodes;

	private CompanyDetails company ;

	private Address compAddress;

	private PreferencesBean prefBean;

	
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
	public CompanyBean(final CompanyService service, PreferencesBean prefBean)
	{
		this.companyService = service;
		company = companyService.get();
		this.setPrefBean(prefBean);
		if(company == null){
			//			setSaveEnabled(false);
			company = new CompanyDetails();
			compAddress = new Address();
			company.setCompanyAddress(compAddress);
			company.setUser(getPrefBean().getUser());
			companyService.create(getCompany());
			edit();

		}
		else
		{	
			setSaveEnabled(true);
			compAddress= company.getCompanyAddress();
		}
	}

	public void save(){

		getCompany().setCompanyAddress(getCompAddress());
		/*	if(isEditable()){
			companyService.create(getCompany());
			setGrowlMessage("Save", "Saved Company Details");
		}
		else
		{
			companyService.update(getCompany());
			setGrowlMessage("Update", "Updated Company Details");
		}*/

		companyService.update(getCompany());
		setGrowlMessage("Save", "Updated Company Details");
		setSaveEnabled(true);
		setEditable(true);

	}

	public void edit()
	{
		setSaveEnabled(false);
		setEditable(false);
	}

	/*public void delete(){
		companyService.delete(getCompany());
		clearValues();
		edit();
	}*/

	private void clearValues() {
		setCompany(new CompanyDetails());
		setCompAddress(new Address());
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


	public boolean isEditable() {
		return editable;
	}


	public void setEditable(boolean editable) {
		this.editable = editable;
	}

	private void setGrowlMessage( String Summary, String description) {
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage(Summary,description));
	}


	public String getCompCode() {
		return getCompany().getCompanyCode();
	}


	public void setCompCode(String compCode) {
		getCompany().setCompanyCode(compCode);
	}


	public PreferencesBean getPrefBean() {
		return prefBean;
	}


	public void setPrefBean(PreferencesBean prefBean) {
		this.prefBean = prefBean;
	}




}
