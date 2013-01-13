package accounts.model.user;

import java.util.List;

public class User {

	private String name;
	
	private String password;
	
	private boolean isActive;
	
	private List<Roles> hasRoles;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public List<Roles> getHasRoles() {
		return hasRoles;
	}

	public void setHasRoles(List<Roles> hasRoles) {
		this.hasRoles = hasRoles;
	}
}
