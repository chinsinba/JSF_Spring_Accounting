package acc.application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

import acc.application.model.User;


public class UserLogin {

	@PersistenceUnit(unitName="Account")
	private EntityManagerFactory emf;
	private String username;
	private String password;


	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String validate(){
		if(username.length()<5)
			return "Welcome";
		return "Welcome";
	}

	public String addUser(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Account");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		User user = new User();
		user.setUserName(username);
		user.setUserPassword(password);
		/*User u = em.find(User.class, user);
		if(u!=null)
			return "Welcome";*/
		em.persist(user);
		em.getTransaction().commit();
		return "Welcome";
	}
	/*public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Account");
		EntityManager em = emf.createEntityManager();
		System.out.println("");
	}*/
}
