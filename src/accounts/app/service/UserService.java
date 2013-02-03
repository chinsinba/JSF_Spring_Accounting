package accounts.app.service;

import accounts.model.user.User;


/**
 * 
 * @author syed
 *
 */
public interface UserService {
    User getUser(int userId);
}