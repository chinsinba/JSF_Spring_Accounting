package accounts.app.bean;

import javax.annotation.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CompanyMenuBean {

	private String centerPage = "/views/Company/Details.xhtml" ;

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
