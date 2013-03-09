package accounts.model.entity.user;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.TableGenerator;

@Entity
public class Roles {

	@Id
	@TableGenerator(name = "Roles_GEN", table = "ID_GEN", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VAL", allocationSize = 1)
	@GeneratedValue(strategy= GenerationType.TABLE, generator = "Roles_GEN")
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	private String authority;

	@OneToMany
	private List<Permission> hasPermission;

	

	public List<Permission> getHasPermission() {
		return hasPermission;
	}

	public void setHasPermission(List<Permission> hasPermission) {
		this.hasPermission = hasPermission;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

}
