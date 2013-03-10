package accounts.app.bean.backingBean.Accounts.Masters;

import java.util.List;

import javax.annotation.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import accounts.app.bean.PreferencesBean;
import accounts.app.bean.backingBean.Company.CompanyBean;
import accounts.app.service.LedgerGroupService;
import accounts.model.entity.CompanyDetails;
import accounts.model.entity.LedgerGroup;

@ManagedBean
@SessionScoped
public class LedgerGroupBean {

	private CompanyDetails company;

	private String groupName;

	private LedgerGroup selSubGroup;

	private List<LedgerGroup> subGroups;

	private LedgerGroup mainGroup;

	public LedgerGroupService ledGrpSvc;

	private PreferencesBean prefBean;

	@Inject
	public LedgerGroupBean(CompanyBean compBean, LedgerGroupService ledgerGroupService, PreferencesBean prefBean)
	{
		this.company = compBean.getCompany();
		this.ledGrpSvc = ledgerGroupService;
		this.setPrefBean(prefBean);
	}

	public CompanyDetails getCompany() {
		return company;
	}


	public void setCompany(CompanyDetails company) {
		this.company = company;
	}


	public String getGroupName() {
		return groupName;
	}


	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}


	public LedgerGroup getSelSubGroup() {

		return selSubGroup;
	}


	public void setSelSubGroup(LedgerGroup selSubGroup) {

		this.selSubGroup = selSubGroup;
		subGroupChanged();
	}


	public List<LedgerGroup> getSubGroups() {
		subGroups = ledGrpSvc.getSubGroups(getCompany());
		if(!subGroups.isEmpty()){
			selSubGroup = subGroups.get(0);
		}
		return subGroups;
	}


	public void setSubGroups(List<LedgerGroup> subGroups) {
		this.subGroups = subGroups;
	}


	public LedgerGroup getMainGroup() {
		return mainGroup;
	}


	public void setMainGroup(LedgerGroup mainGroup) {
		this.mainGroup = mainGroup;
	}


	public LedgerGroupService getLedGrpSvc() {
		return ledGrpSvc;
	}


	public void setLedGrpSvc(LedgerGroupService ledGrpSvc) {
		this.ledGrpSvc = ledGrpSvc;
	}

	public void save(){
		LedgerGroup grp = new LedgerGroup();
		grp.setCompany(getCompany());
		grp.setGroupName(getGroupName());
		grp.setSubgroup(getSelSubGroup());
		grp.setUser(getPrefBean().getUser());
		ledGrpSvc.create(grp);

		setGrowlMessage("Save", "Ledger Group Created");
	}

	public void subGroupChanged(){
		getMainGroup(getSelSubGroup());

	}

	private void getMainGroup(LedgerGroup subGrp){
		if(subGrp.getSubgroup()!=null)
		{
			getMainGroup(subGrp.getSubgroup());
		}
		else{
			setMainGroup(subGrp);
		}
	}

	private void setGrowlMessage( String Summary, String description) {
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage(Summary,description));
	}

	public PreferencesBean getPrefBean() {
		return prefBean;
	}

	public void setPrefBean(PreferencesBean prefBean) {
		this.prefBean = prefBean;
	}
}
