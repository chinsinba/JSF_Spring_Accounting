package accounts.app.bean.backingBean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import org.primefaces.model.LazyDataModel;

import accounts.app.service.CompanyService;
import accounts.model.entity.CompanyDetails;
import accounts.model.entity.StakeHolder;

@ManagedBean
@ViewScoped
public class CompStakeholderBean  implements Serializable{
	private CompanyService companyService;
	private List<StakeHolder> stakeHolder;
	private StakeHolder selectedStakeHolder;
	private LazyDataModel<StakeHolder> lazyModel;  

	private String stakeHoldName;

	private Date stakeHoldDob;

	private int stakeHoldPhNo;

	private String stakeHoldAddr;

	private String stakeHoldEmail;

	private String stakeHoldPan;

	private CompanyDetails company; 



	@Inject
	public CompStakeholderBean(final CompanyService service, CompanyBean company)
	{
		this.companyService = service;
		this.stakeHolder = companyService.getStakeHolders(company.getCompany());
		this.lazyModel = new LazyCarDataModel(stakeHolder);
		this.setCompany(company.getCompany());

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
		return company;
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
	}

}