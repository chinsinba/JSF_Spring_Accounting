package accounts.app.bean.backingBean;

import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import accounts.app.bean.PreferencesBean;
import accounts.model.entity.CompanyDetails;

public abstract class AbstractAccountBean {


	private String custName;

	private String custCode;

	private long openBal;

	private String crDb;

	private String contPer;

	private long phNo;

	private long mobNo;

	private String email;

	private String addr1;

	private String addr2;

	private String addr3;

	private String addr4;

	private String city;

	private String district;

	private String hobli;

	private String state;

	private String country;

	private String bnkName;

	private String accNo;

	private String brName;

	private String ifscCode;

	private String brcode;

	private String tinVat;

	private String cst;

	private String panNo;

	private int crDays;

	private Date custSince;

	private boolean credit;

	private CompanyDetails company;
	
	private PreferencesBean prefBean;
	

	@Inject
	public AbstractAccountBean(LedgerGroupBean  ledGrpBean, LedgerAccountBean ledAccBean, CompanyBean compBean,PreferencesBean prefBean) {
		this.setCompany(compBean.getCompany());
		this.setPrefBean(prefBean);
		
	}

	public void save(){/*

		CustomerAccount custAccount = new CustomerAccount();

		Address custAddr = new Address();
		custAddr.setAddressLine1(getAddr1());
		custAddr.setAddressLine2(getAddr2());
		custAddr.setAddressLine3(getAddr3());
		custAddr.setAddressLine4(getAddr4());
		custAddr.setCity(getCity());
		custAddr.setCountry(getCountry());
		custAddr.setDistrict(getDistrict());
		custAddr.setHobliGram(getHobli());
		custAddr.setState(getState());

		BankDetails custBankDet = new BankDetails();
		custBankDet.setAccountNo(getAccNo());
		custBankDet.setBankName(getBnkName());
		custBankDet.setBranchCode(getBrcode());
		custBankDet.setBranchName(getBrName());
		custBankDet.setIscCode(getIfscCode());



		Contact custCont = new Contact();
		custCont.setContractPersonName(getContPer());
		custCont.setPhoneNo(getPhNo());

		custAccount.setAddress(custAddr);
		custAccount.setBankDetails(custBankDet);
		custAccount.setCode(getCustCode());
		custAccount.setCompany(getCompany());
		custAccount.setContact(custCont);
		custAccount.setCreditLimit(isCredit());
		custAccount.setEmail(getEmail());
		custAccount.setName(getCustName());
		custAccount.setNoOfCreditDays(getCrDays());
		custAccount.setOpeningBal(getOpenBal());
		custAccount.setPanNo(getPanNo());
//		service.create(custAccount);
		setGrowlMessage("Save", "Created new customer account");
	*/}
	

	protected void setGrowlMessage( String Summary, String description) {
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage(Summary,description));
	}
	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustCode() {
		return custCode;
	}

	public void setCustCode(String custCode) {
		this.custCode = custCode;
	}

	public long getOpenBal() {
		return openBal;
	}

	public void setOpenBal(long openBal) {
		this.openBal = openBal;
	}

	public String getCrDb() {
		return crDb;
	}

	public void setCrDb(String crDb) {
		this.crDb = crDb;
	}

	public String getContPer() {
		return contPer;
	}

	public void setContPer(String contPer) {
		this.contPer = contPer;
	}

	public long getPhNo() {
		return phNo;
	}

	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}

	public long getMobNo() {
		return mobNo;
	}

	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddr1() {
		return addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getAddr2() {
		return addr2;
	}

	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

	public String getAddr3() {
		return addr3;
	}

	public void setAddr3(String addr3) {
		this.addr3 = addr3;
	}

	public String getAddr4() {
		return addr4;
	}

	public void setAddr4(String addr4) {
		this.addr4 = addr4;
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

	public String getHobli() {
		return hobli;
	}

	public void setHobli(String hobli) {
		this.hobli = hobli;
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

	public String getBnkName() {
		return bnkName;
	}

	public void setBnkName(String bnkName) {
		this.bnkName = bnkName;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getBrName() {
		return brName;
	}

	public void setBrName(String brName) {
		this.brName = brName;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getBrcode() {
		return brcode;
	}

	public void setBrcode(String brcode) {
		this.brcode = brcode;
	}

	public String getTinVat() {
		return tinVat;
	}

	public void setTinVat(String tinVat) {
		this.tinVat = tinVat;
	}

	public String getCst() {
		return cst;
	}

	public void setCst(String cst) {
		this.cst = cst;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public int getCrDays() {
		return crDays;
	}

	public void setCrDays(int crDays) {
		this.crDays = crDays;
	}

	public Date getCustSince() {
		return custSince;
	}

	public void setCustSince(Date custSince) {
		this.custSince = custSince;
	}

	public boolean isCredit() {
		return credit;
	}

	public void setCredit(boolean credit) {
		this.credit = credit;
	}

	public CompanyDetails getCompany() {
		return company;
	}

	public void setCompany(CompanyDetails company) {
		this.company = company;
	}

	public PreferencesBean getPrefBean() {
		return prefBean;
	}

	public void setPrefBean(PreferencesBean prefBean) {
		this.prefBean = prefBean;
	}


}
