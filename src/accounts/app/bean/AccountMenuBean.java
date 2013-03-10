package accounts.app.bean;

import javax.annotation.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class AccountMenuBean {

	private String centerPage = "/views/Accounts/Masters/Items.xhtml" ;

	public String getCenterPage() {
		return centerPage;
	}

	public void onPageChange(String centerPage){
		setCenterPage(centerPage);
	}
	public void setCenterPage(String centerPage) {
		this.centerPage = centerPage;
	}

}
