package accounts.app.dao.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import accounts.app.dao.CompanyDAO;
import accounts.model.entity.CompanyDetails;

/**
 * 
 * @author syed
 *
 */
@Repository
@Component
public class CompanyDAOImpl extends GenericDAOImpl<CompanyDetails> implements CompanyDAO{

}
