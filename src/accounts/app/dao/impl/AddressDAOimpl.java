package accounts.app.dao.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import accounts.app.dao.AddressDao;
import accounts.app.dao.GenericDao;
import accounts.model.entity.Address;
import accounts.model.entity.CompanyDetails;
/**
 * 
 * @author syed
 *
 */
@Component
@Repository
public class AddressDAOimpl extends GenericDAOImpl<Address> implements AddressDao{

}
