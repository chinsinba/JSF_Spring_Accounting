package accounts.app.service.impl;

import accounts.app.dao.AddressDao;
import accounts.app.service.AddressService;
/**
 * 
 * @author syed
 *
 */
public class AddressServiceImpl implements AddressService{

	private final AddressDao addressDao;

	AddressServiceImpl(AddressDao addressDao){
		this.addressDao = addressDao;
	}

}
