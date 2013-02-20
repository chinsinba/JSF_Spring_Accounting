package accounts.app.bean.backingBean;

import java.util.Date;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import org.primefaces.model.LazyDataModel;

import accounts.app.service.CompanyService;
import accounts.model.entity.CompanyDetails;
import accounts.model.entity.StakeHolder;

@ManagedBean
@ViewScoped
public class CompStakeholderBean  {
	private CompanyService companyService;
	private List<StakeHolder> stakeHolder;
	private StakeHolder selectedStakeHolder;
	private LazyDataModel<StakeHolder> lazyModel;  

	private String compName;
	private String compCode;
	private String stakeHoldName;

	private Date stakeHoldDob;

	private long stakeHoldPhNo;

	private String stakeHoldAddr;

	private String stakeHoldEmail;


	private String stakeHoldPan;

	private String selstakeHoldName;

	private Date selstakeHoldDob;

	private long selstakeHoldPhNo;

	private String selstakeHoldAddr;

	private String selstakeHoldEmail;

	private String selstakeHoldPan;

	private CompanyDetails company; 
	
	private CompanyBean compBean;


	private boolean editing;

	@Inject
	public CompStakeholderBean(final CompanyService service, CompanyBean company)
	{
		this.companyService = service;
		this.stakeHolder = companyService.getStakeHolders(company.getCompany());
		this.lazyModel = new LazyCarDataModel(stakeHolder);
		this.setCompany(company.getCompany());
		this.setCompBean(company);

	}

	public String getSelstakeHoldName() {
		return selstakeHoldName;
	}

	public void setSelstakeHoldName(String selstakeHoldName) {
		this.selstakeHoldName = selstakeHoldName;
	}

	public Date getSelstakeHoldDob() {
		return selstakeHoldDob;
	}

	public void setSelstakeHoldDob(Date selstakeHoldDob) {
		this.selstakeHoldDob = selstakeHoldDob;
	}

	public long getSelstakeHoldPhNo() {
		return selstakeHoldPhNo;
	}

	public void setSelstakeHoldPhNo(long selstakeHoldPhNo) {
		this.selstakeHoldPhNo = selstakeHoldPhNo;
	}

	public String getSelstakeHoldAddr() {
		return selstakeHoldAddr;
	}

	public void setSelstakeHoldAddr(String selstakeHoldAddr) {
		this.selstakeHoldAddr = selstakeHoldAddr;
	}

	public String getSelstakeHoldEmail() {
		return selstakeHoldEmail;
	}

	public void setSelstakeHoldEmail(String selstakeHoldEmail) {
		this.selstakeHoldEmail = selstakeHoldEmail;
	}

	public String getSelstakeHoldPan() {
		return selstakeHoldPan;
	}

	public void setSelstakeHoldPan(String selstakeHoldPan) {
		this.selstakeHoldPan = selstakeHoldPan;
	}

	public CompanyService getCompanyService() {
		return companyService;
	}

	public void setCompanyService(CompanyService companyService) {
		this.companyService = companyService;
	}

	public StakeHolder getSelectedStakeHolder() {
		return selectedStakeHolder;
	}

	public void setSelectedStakeHolder(StakeHolder selectedStakeHolder) {
		this.selectedStakeHolder = selectedStakeHolder;
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

	public long getStakeHoldPhNo() {
		return stakeHoldPhNo;
	}

	public void setStakeHoldPhNo(long stakeHoldPhNo) {
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
	public List<StakeHolder> getStakeHolder() {
		return stakeHolder;
	}

	public void setStakeHolder(List<StakeHolder> stakeHolder) {
		this.stakeHolder = stakeHolder;
	}

	public LazyDataModel<StakeHolder> getLazyModel() {
		return lazyModel;
	}

	public void setLazyModel(LazyDataModel<StakeHolder> lazyModel) {
		this.lazyModel = lazyModel;
	}

	public StakeHolder getSelectedCar() {
		return selectedStakeHolder;
	}

	public void setSelectedCar(StakeHolder selectedCar) {
		this.selectedStakeHolder = selectedCar;
	}


	public CompanyDetails getCompany() {
		return getCompBean().getCompany();
	}

	public void setCompany(CompanyDetails company) {
		this.company = company;
	}

	public void save(){

		StakeHolder stkholder = new StakeHolder();
		stkholder.setAddress(getStakeHoldAddr());
		stkholder.setDob(new java.sql.Date(getStakeHoldDob().getTime()));
		stkholder.setEmail(getStakeHoldEmail());
		stkholder.setPanNo(getStakeHoldPan());
		stkholder.setStakeHolderName(getStakeHoldName());
		stkholder.setCompany(getCompany());
		companyService.create(stkholder);
		stakeHolder.add(stkholder);
		clearValues();
		setGrowlMessage("Save", "Insert Successfull");
		setEditing(false);
	}

	private void setGrowlMessage( String Summary, String description) {
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage(Summary,description));
	}

	public void edit()
	{
		setSelstakeHoldName(selectedStakeHolder.getStakeHolderName());
		setSelstakeHoldDob(selectedStakeHolder.getDob());
		setSelstakeHoldPhNo(selectedStakeHolder.getPhNo());
		setSelstakeHoldAddr(selectedStakeHolder.getAddress());
		setSelstakeHoldEmail(selectedStakeHolder.getEmail());
		setSelstakeHoldPan(selectedStakeHolder.getPanNo());
		setEditing(true);
	}

	private void clearValues() {
		setStakeHoldName(null);

		setStakeHoldDob(null);
		setStakeHoldPhNo(0);

		setStakeHoldAddr(null);


		setStakeHoldEmail(null);

		setStakeHoldPan(null);
	}

	public void update()
	{
		selectedStakeHolder.setAddress(getSelstakeHoldAddr());
		selectedStakeHolder.setDob(new java.sql.Date(getSelstakeHoldDob().getTime()));
		selectedStakeHolder.setEmail(getSelstakeHoldEmail());
		selectedStakeHolder.setPanNo(getSelstakeHoldPan());
		selectedStakeHolder.setStakeHolderName(getSelstakeHoldName());
		selectedStakeHolder.setCompany(getCompany());
		companyService.update(selectedStakeHolder);
		setGrowlMessage("Update", "Update Successfull");
	}

	/**
	 * @return the editing
	 */
	public boolean isEditing() {
		return editing;
	}

	/**
	 * @param editing the editing to set
	 */
	public void setEditing(boolean editing) {
		this.editing = editing;
	}

	public void delete(){
		companyService.delete(selectedStakeHolder);
		stakeHolder.remove(selectedStakeHolder);
		setGrowlMessage("Delete", "Delete Successfull");
	}

	public String getCompName() {
		return getCompany().getCompanyName();
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public String getCompCode() {
		return getCompany().getCompanyCode();
	}

	public void setCompCode(String compCode) {
		this.compCode = compCode;
	}

	public CompanyBean getCompBean() {
		return compBean;
	}

	public void setCompBean(CompanyBean compBean) {
		this.compBean = compBean;
	}

}