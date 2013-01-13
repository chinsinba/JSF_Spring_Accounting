package accounts.app.service;

import accounts.app.user.User;

/**
 * @author Imran Pariyani
 * 
 * {@link http://pariyani.com} pariyani
 */
public interface UserService {
    User getUser(int userId);
}