package accounts.app.bean.backingBean;

import java.util.List;

import javax.annotation.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import accounts.app.bean.PreferencesBean;
import accounts.app.service.OtherAccountService;
import accounts.app.service.SupplierAccountService;
import accounts.model.entity.Address;
import accounts.model.entity.BankDetails;
import accounts.model.entity.Contact;
import accounts.model.entity.account.OtherAccount;
import accounts.model.entity.account.SupplierAccount;

@ManagedBean
@ViewScoped
public class OtherAccountBean extends AbstractAccountBean{

	private OtherAccountService service;

	private List<OtherAccount> othAccounts;

	private OtherAccount selAccont;

	public OtherAccountService getService() {
		return service;
	}

	public void setService(OtherAccountService service) {
		this.service = service;
	}

	public List<OtherAccount> getOthAccounts() {
		othAccounts= service.findAll(getCompany());
		return othAccounts;
	}

	public void setOthAccounts(List<OtherAccount> othAccounts) {
		this.othAccounts = othAccounts;
	}

	public OtherAccount getSelAccont() {
		return selAccont;
	}

	public void setSelAccont(OtherAccount selAccont) {
		this.selAccont = selAccont;
	}



	@Inject
	public OtherAccountBean(LedgerGroupBean ledGrpBean,
			LedgerAccountBean ledAccBean, CompanyBean compBean, OtherAccountService service,PreferencesBean prefbean) {
		super(ledGrpBean, ledAccBean, compBean,prefbean);

		this.service= service;
	}


	public void save()
	{
		OtherAccount custAccount = new OtherAccount();

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
		custAccount.setUser(getPrefBean().getUser());
		service.create(custAccount);
		setGrowlMessage("Save", "Created new Account");


	}
}
