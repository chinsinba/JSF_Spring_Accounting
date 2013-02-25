package accounts.app.bean.backingBean;

import java.util.List;

import javax.annotation.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import accounts.app.service.CustomerAccountService;
import accounts.model.entity.Address;
import accounts.model.entity.BankDetails;
import accounts.model.entity.Contact;
import accounts.model.entity.account.CustomerAccount;

@ManagedBean
@ViewScoped
public class CustomerAccountBean extends AbstractAccountBean{

	private CustomerAccountService service;

	private List<CustomerAccount> custAccounts;
	
	private CustomerAccount selAccont;

	@Inject
	public CustomerAccountBean(LedgerGroupBean  ledGrpBean, LedgerAccountBean ledAccBean, CompanyBean compBean, CustomerAccountService service) {
		super(ledGrpBean, ledAccBean, compBean);
		this.setService(service);
	}

	public void save(){

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
		service.create(custAccount);
		setGrowlMessage("Save", "Created new customer account");
	}

	
	public CustomerAccountService getService() {
		return service;
	}

	public void setService(CustomerAccountService service) {
		this.service = service;
	}

	public List<CustomerAccount> getCustAccounts() {
		custAccounts = service.findAll(getCompany());
		return custAccounts;
	}

	public void setCustAccounts(List<CustomerAccount> custAccounts) {
		this.custAccounts = custAccounts;
	}

	public CustomerAccount getSelAccont() {
		return selAccont;
	}

	public void setSelAccont(CustomerAccount selAccont) {
		this.selAccont = selAccont;
	}
}
