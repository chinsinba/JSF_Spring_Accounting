package accounts.model.user;

import java.util.List;

public class Roles {

	private String roleName;

	private List<Permission> hasPermission;

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public List<Permission> getHasPermission() {
		return hasPermission;
	}

	public void setHasPermission(List<Permission> hasPermission) {
		this.hasPermission = hasPermission;
	}

}
