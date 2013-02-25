package accounts.app.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import accounts.app.dao.CustomerAccountDAO;
import accounts.app.service.CustomerAccountService;
import accounts.model.entity.CompanyDetails;
import accounts.model.entity.account.CustomerAccount;

@Service
public class CustomerAccountServiceImpl implements CustomerAccountService {

	private CustomerAccountDAO dao;

	@Inject
	public CustomerAccountServiceImpl(CustomerAccountDAO dao) {

		this.dao = dao;
	}

	@Override
	@Transactional
	public CustomerAccount create(CustomerAccount custAccount) {
		return dao.create(custAccount);
	}

	@Override
	public List<CustomerAccount> findAll(CompanyDetails company) {
		return dao.findAll(company);
	}

}
