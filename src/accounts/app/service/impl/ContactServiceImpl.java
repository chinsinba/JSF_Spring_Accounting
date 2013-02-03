package accounts.app.service.impl;

import accounts.app.dao.ContactDAO;
import accounts.app.service.ContactService;
import accounts.model.entity.Contact;
import accounts.model.entity.user.User;


/**
 * 
 * @author syed
 *
 */
public class ContactServiceImpl implements ContactService{

	private final ContactDAO contactDao;

	public ContactServiceImpl(ContactDAO contactDao){
		this.contactDao = contactDao;
	}
}
