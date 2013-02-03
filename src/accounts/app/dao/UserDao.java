package accounts.app.dao;

import accounts.model.entity.user.User;

/**
 * 
 * @author syed
 *
 */
public interface UserDao extends GenericDao<User>{
    User getUser(int userId);
}
