package accounts.app.bean.backingBean.Accounts.Masters;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import accounts.app.bean.PreferencesBean;
import accounts.app.bean.backingBean.Company.CompanyBean;
import accounts.app.service.LedgerAccountService;
import accounts.model.entity.CompanyDetails;
import accounts.model.entity.LedgerAccount;
import accounts.model.entity.LedgerGroup;

@ManagedBean
@ViewScoped
public class LedgerAccountBean {

	private String accName;

	private String accCode;

	private LedgerGroup group;

	private String type;

	private List<String> types;

	private long openBalance;

	private CompanyDetails comp;

	private LedgerAccountService service;

	private List<LedgerAccount> ledAccounts;

	private LedgerAccount selAccount;

	private PreferencesBean prefBean;


	@Inject
	public LedgerAccountBean(LedgerGroupBean bean, CompanyBean compBean, LedgerAccountService service, PreferencesBean prefBean) {
		this.group = bean.getSelSubGroup();
		this.setComp(compBean.getCompany());
		this.service = service;
		this.setPrefBean(prefBean);
	}

	public String getAccName() {
		return accName;
	}

	public String getAccCode() {
		return accCode;
	}

	public LedgerGroup getGroup() {
		return group;
	}

	public String getType() {
		return type;
	}

	public long getOpenBalance() {
		return openBalance;
	}

	public LedgerAccountService getService() {
		return service;
	}

	public void setService(LedgerAccountService service) {
		this.service = service;
	}

	public void setAccCode(String accCode) {
		this.accCode = accCode;
	}

	public void setGroup(LedgerGroup group) {
		this.group = group;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setOpenBalance(long openBalance) {
		this.openBalance = openBalance;
	}

	public void save(){

		LedgerAccount ledAccount = new LedgerAccount();

		ledAccount.setAccountCode(getAccCode());
		ledAccount.setAccountName(getAccName());
		ledAccount.setLedgerGroup(getGroup());
		ledAccount.setCompany(getComp());
		ledAccount.setDebit_Credit(getType());
		ledAccount.setOpeningBalance(getOpenBalance());
		ledAccount.setUser(getPrefBean().getUser());
		service.create(ledAccount);
		ledAccounts.add(ledAccount);
		setGrowlMessage("Save", "Account created");
	}

	public List<String> getTypes() {
		List<String> typeList = new ArrayList<String>();
		typeList.add("Credit");
		typeList.add("Debit");
		return typeList;
	}

	public void setTypes(List<String> types) {
		this.types = types;
	}

	public CompanyDetails getComp() {
		return comp;
	}

	public void setComp(CompanyDetails comp) {
		this.comp = comp;
	}


	private void setGrowlMessage( String Summary, String description) {
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage(Summary,description));
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public List<LedgerAccount> getLedAccounts() {
		ledAccounts = service.findAll(getComp());
		return ledAccounts;
	}

	public void setLedAccounts(List<LedgerAccount> ledAccounts) {
		this.ledAccounts = ledAccounts;
	}

	public LedgerAccount getSelAccount() {
		return selAccount;
	}

	public void setSelAccount(LedgerAccount selAccount) {
		this.selAccount = selAccount;
	}

	public PreferencesBean getPrefBean() {
		return prefBean;
	}

	public void setPrefBean(PreferencesBean prefBean) {
		this.prefBean = prefBean;
	}

}
