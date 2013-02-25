package accounts.app.bean.backingBean;

import java.util.List;

import javax.annotation.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import accounts.app.service.CustomerAccountService;
import accounts.app.service.SupplierAccountService;
import accounts.model.entity.Address;
import accounts.model.entity.BankDetails;
import accounts.model.entity.Contact;
import accounts.model.entity.account.CustomerAccount;
import accounts.model.entity.account.SupplierAccount;

@ManagedBean
@ViewScoped
public class SupplierAccountBean extends AbstractAccountBean{

	private SupplierAccountService service;

	private List<SupplierAccount> supAccounts;

	private SupplierAccount selAccont;

	@Inject
	public SupplierAccountBean(LedgerGroupBean ledGrpBean,
			LedgerAccountBean ledAccBean, CompanyBean compBean,
			SupplierAccountService service) {
		super(ledGrpBean, ledAccBean, compBean);
		this.service = service;
	}

	public SupplierAccountService getService() {
		return service;
	}

	public void setService(SupplierAccountService service) {
		this.service = service;
	}

	public void save()
	{
		SupplierAccount custAccount = new SupplierAccount();

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
		setGrowlMessage("Save", "Created new Supplier account");


	}

	public List<SupplierAccount> getSupAccounts() {
		supAccounts= service.findAll(getCompany());
		return supAccounts;
	}

	public void setSupAccounts(List<SupplierAccount> supAccounts) {
		this.supAccounts = supAccounts;
	}

	public SupplierAccount getSelAccont() {
		return selAccont;
	}

	public void setSelAccont(SupplierAccount selAccont) {
		this.selAccont = selAccont;
	}

}
