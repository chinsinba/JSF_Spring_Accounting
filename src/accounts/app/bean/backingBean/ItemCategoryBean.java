package accounts.app.bean.backingBean;

import java.util.List;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import accounts.app.service.ItemGroupService;
import accounts.model.entity.CompanyDetails;
import accounts.model.entity.item.ItemCategory;

@ManagedBean
@ViewScoped
public class ItemCategoryBean {

	private CompanyDetails company;

	private String groupName;

	private ItemCategory selSubGroup;

	private List<ItemCategory> subGroups;

	private ItemCategory mainGroup;

	public ItemGroupService ledGrpSvc;

	@Inject
	public ItemCategoryBean(CompanyBean compBean, ItemGroupService ledgerGroupService)
	{
		this.company = compBean.getCompany();
		this.ledGrpSvc = ledgerGroupService;
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


	public ItemCategory getSelSubGroup() {

		return selSubGroup;
	}


	public void setSelSubGroup(ItemCategory selSubGroup) {

		this.selSubGroup = selSubGroup;
		if(this.selSubGroup!=null)
			subGroupChanged();
	}

	@PostConstruct
	public void init()
	{}

	public List<ItemCategory> getSubGroups() {
		subGroups = ledGrpSvc.getSubGroups(getCompany());
		if(!subGroups.isEmpty()){
			selSubGroup = subGroups.get(0);
		}


		return subGroups;
	}


	public void setSubGroups(List<ItemCategory> subGroups) {
		this.subGroups = subGroups;
	}


	public ItemCategory getMainGroup() {
		return mainGroup;
	}


	public void setMainGroup(ItemCategory mainGroup) {
		this.mainGroup = mainGroup;
	}


	public ItemGroupService getLedGrpSvc() {
		return ledGrpSvc;
	}


	public void setLedGrpSvc(ItemGroupService ledGrpSvc) {
		this.ledGrpSvc = ledGrpSvc;
	}

	public void save(){
		ItemCategory grp = new ItemCategory();
		grp.setCompany(getCompany());
		grp.setCategoryName(getGroupName());
		grp.setBelongsToCategory(getSelSubGroup());

		ledGrpSvc.create(grp);
		setGrowlMessage("Save", "Ledger Group Created");
	}

	public void subGroupChanged(){
		getMainGroup(getSelSubGroup());

	}

	private void getMainGroup(ItemCategory subGrp){
		if(subGrp.getBelongsToCategory()!=null)
		{
			getMainGroup(subGrp.getBelongsToCategory());
		}
		else{
			setMainGroup(subGrp);
		}
	}




	private void setGrowlMessage( String Summary, String description) {
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage(Summary,description));
	}

}
