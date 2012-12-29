package acc.application;

import javax.annotation.PostConstruct;

public class MenuPageBean {

	private String page;

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}
	@PostConstruct
	public void init(){
		this.page = "MenuBar";
	}

	public String getCompany(){
		return "Company";
	}
}
