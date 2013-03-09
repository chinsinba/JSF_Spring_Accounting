package accounts.app.bean.backingBean;

import java.util.List;

import javax.annotation.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import org.hibernate.id.IdentityGenerator.GetGeneratedKeysDelegate;

import sun.security.action.GetLongAction;

import accounts.app.bean.PreferencesBean;
import accounts.app.service.BankAccountService;
import accounts.model.entity.Address;
import accounts.model.entity.BankAccount;
import accounts.model.entity.BankDetails;
import accounts.model.entity.CompanyDetails;
import accounts.model.entity.Contact;
import accounts.model.entity.LedgerGroup;

@ManagedBean
@ViewScoped
public class BankAccountBean {

	private String bnkName;

	private String bnkCode;

	private String bnkAccNo;

	private String bnkBrName;

	private String bnkAccType;

	private String addr;

	private long contNo;

	private String contPerName;

	private long openBal;

	private String ifscCode;

	private String selType;

	private List<String> selTypes;

	private String selAccType;

	private List<String> selAccTypes;

	private BankAccountService service;

	private CompanyDetails company;

	private LedgerGroup ledGroup;

	private List<BankAccount> bankAccounts;

	private BankAccount selAccount;

	private PreferencesBean prefBean;

	@Inject
	public BankAccountBean(CompanyBean companyBean, LedgerGroupBean ledGrpBean, BankAccountService service, PreferencesBean prefBean){
		this.service =service;
		this.setCompany(companyBean.getCompany());
		this.setPrefBean(prefBean);

	}

	public void save() {

		BankAccount bnkAcc = new BankAccount();
		bnkAcc.setAccountNo(getBnkAccNo());
		bnkAcc.setAccountType(getBnkAccType());
		bnkAcc.setCompany(getCompany());
		bnkAcc.setCode(getBnkCode());
		bnkAcc.setLedGroup(getLedGroup());

		BankDetails bankdet = new BankDetails();

		bankdet.setBankName(getBnkName());
		bankdet.setBranchName(getBnkBrName());
		bankdet.setBranchCode(getIfscCode());
		bankdet.setIscCode(getIfscCode());

		Address addr = new Address();
		addr.setAddressLine1(getAddr());

		Contact cont = new Contact();
		cont.setContractPersonName(getContPerName());
		cont.setPhoneNo(getContNo());
		bnkAcc.setContact(cont);
		bnkAcc.setBankDetails(bankdet);
		bnkAcc.setUser(getPrefBean().getUser());
		service.create(bnkAcc);
		setGrowlMessage("Save", "Bank account created");
	}

	private void setGrowlMessage( String Summary, String description) {
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage(Summary,description));
	}
	public String getBnkName() {
		return bnkName;
	}


	public void setBnkName(String bnkName) {
		this.bnkName = bnkName;
	}


	public String getBnkCode() {
		return bnkCode;
	}


	public void setBnkCode(String bnkCode) {
		this.bnkCode = bnkCode;
	}


	public String getBnkAccNo() {
		return bnkAccNo;
	}


	public void setBnkAccNo(String bnkAccNo) {
		this.bnkAccNo = bnkAccNo;
	}


	public String getBnkBrName() {
		return bnkBrName;
	}


	public void setBnkBrName(String bnkBrName) {
		this.bnkBrName = bnkBrName;
	}


	public String getAddr() {
		return addr;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}


	public long getContNo() {
		return contNo;
	}


	public void setContNo(long contNo) {
		this.contNo = contNo;
	}


	public String getContPerName() {
		return contPerName;
	}


	public void setContPerName(String contPerName) {
		this.contPerName = contPerName;
	}


	public long getOpenBal() {
		return openBal;
	}


	public void setOpenBal(long openBal) {
		this.openBal = openBal;
	}


	public String getSelType() {
		return selType;
	}


	public void setSelType(String selType) {
		this.selType = selType;
	}


	public List<String> getSelTypes() {
		return selTypes;
	}


	public void setSelTypes(List<String> selTypes) {
		this.selTypes = selTypes;
	}


	public String getSelAccType() {
		return selAccType;
	}


	public void setSelAccType(String selAccType) {
		this.selAccType = selAccType;
	}


	public List<String> getSelAccTypes() {
		return selAccTypes;
	}


	public void setSelAccTypes(List<String> selAccTypes) {
		this.selAccTypes = selAccTypes;
	}

	public String getBnkAccType() {
		return bnkAccType;
	}

	public void setBnkAccType(String bnkAccType) {
		this.bnkAccType = bnkAccType;
	}

	public CompanyDetails getCompany() {
		return company;
	}

	public void setCompany(CompanyDetails company) {
		this.company = company;
	}

	public LedgerGroup getLedGroup() {
		return ledGroup;
	}

	public void setLedGroup(LedgerGroup ledGroup) {
		this.ledGroup = ledGroup;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public List<BankAccount> getBankAccounts() {
		bankAccounts = service.findAll(getCompany());
		return bankAccounts;
	}

	public void setBankAccounts(List<BankAccount> bankAccounts) {
		this.bankAccounts = bankAccounts;
	}

	public BankAccount getSelAccount() {
		return selAccount;
	}

	public void setSelAccount(BankAccount selAccount) {
		this.selAccount = selAccount;
	}

	public PreferencesBean getPrefBean() {
		return prefBean;
	}

	public void setPrefBean(PreferencesBean prefBean) {
		this.prefBean = prefBean;
	}


}
