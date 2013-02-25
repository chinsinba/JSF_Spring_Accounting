package accounts.app.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import accounts.app.dao.OtherAccountDAO;
import accounts.app.dao.SupplierAccountDAO;
import accounts.app.service.OtherAccountService;
import accounts.app.service.SupplierAccountService;
import accounts.model.entity.CompanyDetails;
import accounts.model.entity.account.OtherAccount;
import accounts.model.entity.account.SupplierAccount;

@Service
public class OtherAccountServiceImpl implements OtherAccountService {

	private OtherAccountDAO dao;

	@Inject
	public OtherAccountServiceImpl(OtherAccountDAO dao) {

		this.dao = dao;
	}

	@Override
	@Transactional
	public OtherAccount create(OtherAccount custAccount) {
		return dao.create(custAccount);
	}

	@Override
	public List<OtherAccount> findAll(CompanyDetails company) {
		return dao.findAll(company);
	}

}
