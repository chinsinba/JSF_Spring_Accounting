package accounts.model.entity.user;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;


@Entity
@Table(name="USER")
@NamedQuery(name="User.findUser", query="SELECT usr FROM User usr WHERE usr.userName=:userName")
public class User {
	
	@Id
	@TableGenerator(name = "User_GEN", table = "ID_GEN", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VAL", allocationSize = 1)
	@GeneratedValue(strategy= GenerationType.TABLE, generator = "User_GEN")
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	private String userName;
	
	private String password;
	
	private boolean enabled;
	
	@OneToMany
	private List<Roles> hasRoles;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public List<Roles> getHasRoles() {
		return hasRoles;
	}

	public void setHasRoles(List<Roles> hasRoles) {
		this.hasRoles = hasRoles;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
}
