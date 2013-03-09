package accounts.app.bean;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import accounts.model.entity.user.User;


/**
 * 
 * @author syed
 *
 */
@ManagedBean
@SessionScoped
public class PreferencesBean  {

	public static final String MODERATOR ="ROLE_moderator";

	public static final String ADMIN ="ROLE_admin";

	public PreferencesBean() {
		//this.currentLocale = FacesContext.getCurrentInstance().getApplication().getDefaultLocale();
	}
	private boolean authenticated = false;
	private String username;

	private User user;

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}
	private int id;
	/**
	 * XXX Returns <code>id</code>.
	 * 
	 * @return Returns the {@link #id}.
	 */
	public int getId() {
		return id;
	}

	/**
	 * XXX  Set <code>id</code>.
	 * 
	 * @param id The {@link #id} to set.
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * XXX Returns <code>username</code>.
	 * 
	 * @return Returns the {@link #username}.
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * XXX  Set <code>username</code>.
	 * 
	 * @param username The {@link #username} to set.
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	private List<GrantedAuthority> grantedAuthorities=new LinkedList<GrantedAuthority>();;


	public List<Locale> getSupportedLocales() {

		List<Locale> locales = new ArrayList<Locale>();
		for (Iterator<Locale> it = FacesContext.getCurrentInstance().getApplication().getSupportedLocales(); it.hasNext();) {
			Locale loc = it.next();
			locales.add(loc);
		}
		return locales;
	}

	public boolean getIsUserLoggedIn() {
		return isUserInRole("user") || isUserInRole("ROLE_ADMIN");
	}

	public boolean getTest(){
		return isUserInRole("user") || isUserInRole("ROLE_ADMIN");
	}

	public boolean isUserInRole(final String role) {
		if(this.grantedAuthorities!=null){
			for (GrantedAuthority ga : this.grantedAuthorities) {
				if (role.equals(ga.getAuthority())) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * XXX Returns <code>authenticated</code>.
	 * 
	 * @return Returns the {@link #authenticated}.
	 */
	public boolean isAuthenticated() {
		return authenticated;
	}

	/**
	 * XXX  Set <code>authenticated</code>.
	 * 
	 * @param authenticated The {@link #authenticated} to set.
	 */
	public void setAuthenticated(boolean authenticated) {
		this.authenticated = authenticated;
	}

	/**
	 * XXX Returns <code>grantedAuthorities</code>.
	 * 
	 * @return Returns the {@link #grantedAuthorities}.
	 */
	public List<GrantedAuthority> getGrantedAuthorities() {
		return grantedAuthorities;
	}

	/**
	 * XXX  Set <code>grantedAuthorities</code>.
	 * 
	 * @param grantedAuthorities The {@link #grantedAuthorities} to set.
	 */
	public void setGrantedAuthorities(List<GrantedAuthority> grantedAuthorities) {
		this.grantedAuthorities = grantedAuthorities;
	}

	public void setAuthData(Authentication result) {
		this.getGrantedAuthorities().clear();
		this.getGrantedAuthorities().addAll(result.getAuthorities());
		this.setAuthenticated(true);
		this.setUsername(result.getName());
	}

	public void clearAuthData(){
		this.getGrantedAuthorities().clear();
		this.setAuthenticated(false);
		this.setUser(null);
		this.setUsername("");
	}

	public void setUser(accounts.model.entity.user.User user) {
		this.user=user;
	}
}
