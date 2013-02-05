package accounts.app.dao;

import org.springframework.stereotype.Repository;

import accounts.model.entity.user.User;

/**
 * 
 * @author syed
 *
 */

public interface UserDao extends GenericDao<User>{
    User getUser(long userId);
}
