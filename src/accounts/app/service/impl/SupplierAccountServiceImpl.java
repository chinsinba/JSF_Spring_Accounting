package accounts.app.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import accounts.app.dao.SupplierAccountDAO;
import accounts.app.service.SupplierAccountService;
import accounts.model.entity.CompanyDetails;
import accounts.model.entity.account.SupplierAccount;

@Service
public class SupplierAccountServiceImpl implements SupplierAccountService {

	private SupplierAccountDAO dao;

	@Inject
	public SupplierAccountServiceImpl(SupplierAccountDAO dao) {

		this.dao = dao;
	}

	@Override
	@Transactional
	public SupplierAccount create(SupplierAccount custAccount) {
		return dao.create(custAccount);
	}

	@Override
	public List<SupplierAccount> findAll(CompanyDetails company) {
		return dao.findAll(company);
	}

}
