package accounts.app.service;

import org.springframework.stereotype.Service;

import accounts.model.entity.user.User;


/**
 * 
 * @author syed
 *
 */
public interface UserService {
    User getUser(long userId);
}