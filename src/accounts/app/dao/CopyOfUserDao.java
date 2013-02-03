package accounts.app.dao;

import accounts.model.user.User;


/**
 * 
 * @author syed
 *
 */
public interface CopyOfUserDao extends GenericDao<User>{
    User getUser(int userId);
}
