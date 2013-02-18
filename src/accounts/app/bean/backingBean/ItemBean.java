package accounts.app.bean.backingBean;

import java.sql.Date;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import accounts.app.service.ItemService;
import accounts.model.entity.CompanyDetails;
import accounts.model.entity.LedgerAccount;
import accounts.model.entity.Unit;
import accounts.model.entity.item.Item;
import accounts.model.entity.item.ItemCategory;

@ManagedBean
@ViewScoped
public class ItemBean {

	private CompanyBean compBean;
	private ItemService itemService;

	@Inject
	public ItemBean(CompanyBean compBean, ItemService itemService){

		this.compBean= compBean;
		this.itemService=itemService;
		this.company = compBean.getCompany();
	}

	private CompanyDetails company;

	private String compName;

	private String compCode;

	private List<String> itemGroups;

	private String itemGroup;

	private List<LedgerAccount> accounts;
	private LedgerAccount account;

	private String itemName;

	private ItemCategory category;

	private String code;

	private byte[] itemLogo;

	private Unit openingStockUnit;

	private String quantity;

	private long valuation;

	private LedgerAccount accountName;

	private LedgerAccount inwardTaxAccount;

	private List<LedgerAccount> purTaxs;
	
	private LedgerAccount purTax;
	
	private LedgerAccount outwardTaxAccount;
	
	private List<LedgerAccount> salTaxs;
	private LedgerAccount salTax;

	public List<LedgerAccount> getPurTaxs() {
		return purTaxs;
	}


	public void setPurTaxs(List<LedgerAccount> purTaxs) {
		this.purTaxs = purTaxs;
	}


	public LedgerAccount getPurTax() {
		return purTax;
	}


	public void setPurTax(LedgerAccount purTax) {
		this.purTax = purTax;
	}


	public List<LedgerAccount> getSalTaxs() {
		return salTaxs;
	}


	public void setSalTaxs(List<LedgerAccount> salTaxs) {
		this.salTaxs = salTaxs;
	}


	public LedgerAccount getSalTax() {
		return salTax;
	}


	public void setSalTax(LedgerAccount salTax) {
		this.salTax = salTax;
	}

	private boolean reqBatchNo;

	private Date manufacturingDate;

	private Date expiryDate;

	public CompanyBean getCompBean() {
		return compBean;
	}


	public void setCompBean(CompanyBean compBean) {
		this.compBean = compBean;
	}


	public ItemService getItemService() {
		return itemService;
	}


	public void setItemService(ItemService itemService) {
		this.itemService = itemService;
	}


	public CompanyDetails getCompany() {
		return company;
	}


	public void setCompany(CompanyDetails company) {
		this.company = company;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public ItemCategory getCategory() {
		return category;
	}


	public void setCategory(ItemCategory category) {
		this.category = category;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public byte[] getItemLogo() {
		return itemLogo;
	}


	public void setItemLogo(byte[] itemLogo) {
		this.itemLogo = itemLogo;
	}


	public Unit getOpeningStockUnit() {
		return openingStockUnit;
	}


	public void setOpeningStockUnit(Unit openingStockUnit) {
		this.openingStockUnit = openingStockUnit;
	}


	public String getQuantity() {
		return quantity;
	}


	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}


	public long getValuation() {
		return valuation;
	}


	public void setValuation(long valuation) {
		this.valuation = valuation;
	}


	public LedgerAccount getAccountName() {
		return accountName;
	}


	public void setAccountName(LedgerAccount accountName) {
		this.accountName = accountName;
	}


	public LedgerAccount getInwardTaxAccount() {
		return inwardTaxAccount;
	}


	public void setInwardTaxAccount(LedgerAccount inwardTaxAccount) {
		this.inwardTaxAccount = inwardTaxAccount;
	}


	public LedgerAccount getOutwardTaxAccount() {
		return outwardTaxAccount;
	}


	public void setOutwardTaxAccount(LedgerAccount outwardTaxAccount) {
		this.outwardTaxAccount = outwardTaxAccount;
	}


	public boolean isReqBatchNo() {
		return reqBatchNo;
	}


	public void setReqBatchNo(boolean reqBatchNo) {
		this.reqBatchNo = reqBatchNo;
	}


	public Date getManufacturingDate() {
		return manufacturingDate;
	}


	public void setManufacturingDate(Date manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}


	public Date getExpiryDate() {
		return expiryDate;
	}


	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}


	public void save(){


		Item item = new Item();
		item.setAccountName(getAccountName());
		item.setCompany(getCompany());
		item.setItemName(getItemName());
		item.setManufacturingDate(new Date(getManufacturingDate().getTime()));
		item.setQuantity(getQuantity());
		item.setValuation(getValuation());
		item.setCode(getCode());
		item.setInwardTaxAccount(getInwardTaxAccount());
		item.setAccountName(getAccountName());
		item.setCategory(getCategory());
		item.setExpiryDate(new Date(getExpiryDate().getTime()));

		item.setItemLogo(getItemLogo());
		item.setOpeningStockUnit(getOpeningStockUnit());
		item.setOutwardTaxAccount(getOutwardTaxAccount());
		item.setReqBatchNo(isReqBatchNo());
		itemService.create(item);

		clearValues();
	}

	private void clearValues() {

	}

	public void delete()
	{

	}

	public String getCompName() {
		return getCompany().getCompanyName();
	}


	public void setCompName(String compName) {
		getCompany().setCompanyName(compName);
	}


	public String getCompCode() {
		return getCompany().getCompanyCode();
	}


	public void setCompCode(String compcode) {
		getCompany().setCompanyCode(compcode);
	}

	private void setGrowlMessage( String Summary, String description) {
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage(Summary,description));
	}


	public List<String> getItemGroups() {
		return itemGroups;
	}


	public void setItemGroups(List<String> itemGroups) {
		this.itemGroups = itemGroups;
	}


	public String getItemGroup() {
		return itemGroup;
	}


	public void setItemGroup(String itemGroup) {
		this.itemGroup = itemGroup;
	}


	public List<LedgerAccount> getAccounts() {
		return accounts;
	}


	public void setAccounts(List<LedgerAccount> accounts) {
		this.accounts = accounts;
	}


	public LedgerAccount getAccount() {
		return account;
	}


	public void setAccount(LedgerAccount account) {
		this.account = account;
	}

}
