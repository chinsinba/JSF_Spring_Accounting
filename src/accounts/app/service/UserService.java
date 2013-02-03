package accounts.app.service;

import accounts.model.entity.user.User;


/**
 * 
 * @author syed
 *
 */
public interface UserService {
    User getUser(int userId);
}