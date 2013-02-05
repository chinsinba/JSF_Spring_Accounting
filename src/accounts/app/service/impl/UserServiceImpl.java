package accounts.app.service.impl;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.inject.Inject;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import accounts.app.dao.UserDao;
import accounts.app.service.UserService;
import accounts.model.entity.user.User;


/**
 * 
 * @author syed
 *
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    private JavaMailSender javaMailSender;
    
    @Inject
    UserServiceImpl(UserDao userDao,JavaMailSender javaMailSender) {
        this.userDao = userDao;
        this.javaMailSender = javaMailSender;
        if (this.javaMailSender != null) {
            this.sendMailExeService = Executors.newFixedThreadPool(5);
        }
    }

    private ExecutorService sendMailExeService;

    @Transactional(readOnly = true)
    public User getUser(long userId) {
    	
        return userDao.getUser(userId);
    }

    class SendMailRunnable implements Runnable {
        private MimeMessage message;

        private JavaMailSender mailSender;
        
        SendMailRunnable(MimeMessage message  ,JavaMailSender mailSender) {
            this.message = message;
            this.mailSender = mailSender;
        }

        public void run() {
            try {
                if (mailSender != null && message != null) {
                    mailSender.send(message);
                }
            } catch (Throwable zzz) {
                zzz.printStackTrace(); 
            }
        }
    }
}
