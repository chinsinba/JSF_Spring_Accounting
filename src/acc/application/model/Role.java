package acc.application.model;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Set;


/**
 * The persistent class for the roles database table.
 * 
 */
@Entity
@Table(name="roles")
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@TableGenerator(name = "Role_GEN", table = "ID_GEN", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VAL", allocationSize = 1)
	@GeneratedValue(generator = "Role_GEN")
	private long roleId;

	private String roleName;

	//bi-directional many-to-many association to User
    @ManyToMany
	@JoinTable(
		name="users_has_roles"
		, joinColumns={
			@JoinColumn(name="roles_roleId")
			}
		, inverseJoinColumns={
			@JoinColumn(name="users_userId")
			}
		)
	private Set<User> users;

    public Role() {
    }

	public long getRoleId() {
		return this.roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Set<User> getUsers() {
		return this.users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}
	
}