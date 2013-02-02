package accounts.model.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
public class Permission {
	
	
	@Id
	@TableGenerator(name = "Permission_GEN", table = "ID_GEN", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VAL", allocationSize = 1)
	@GeneratedValue(strategy= GenerationType.TABLE, generator = "Permission_GEN")
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	private String permission;

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

}
