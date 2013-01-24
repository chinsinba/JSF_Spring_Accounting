package accounts.app.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import accounts.app.dao.UserDao;
import accounts.app.user.User;


/**
 * @author Imran Pariyani
 * 
 * {@link http://pariyani.com} pariyani
 */
public class UserDaoImpl implements UserDao {

    private EntityManager entityManagerFactory;

    void setEntityManager(EntityManager entityManager) {
        this.entityManagerFactory = entityManager;
    }

    
    public User getUser(int id) {
        return (User) this.entityManagerFactory.find(User.class, id);
    }
}