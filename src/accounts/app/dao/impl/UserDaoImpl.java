package accounts.app.dao.impl;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import accounts.app.dao.UserDao;
import accounts.model.entity.account.OtherAccount;
import accounts.model.entity.user.User;


/**
 * 
 * @author syed
 *
 */
@Repository
@Component
public class UserDaoImpl extends GenericDAOImpl<User> implements UserDao {

    public User getUser(long id) {
        return find(id);
    }
    
    public User getUser(String userName) {
    	Query query = em.createNamedQuery("User.findUser");
		query.setParameter("userName", userName);
		try{
			return (User) query.getSingleResult();
		}catch (Exception e) {
			return null;
		}
    }
}