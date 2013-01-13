package accounts.app.dao;

import accounts.app.user.User;

/**
 * @author Imran Pariyani
 * 
 * {@link http://pariyani.com} pariyani
 */
public interface UserDao {
    User getUser(int userId);
}
