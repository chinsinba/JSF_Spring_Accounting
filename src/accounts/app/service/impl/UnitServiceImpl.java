package accounts.app.service.impl;

import accounts.app.dao.UnitDAO;
import accounts.app.service.UnitService;
import accounts.model.entity.Unit;

/**
 * 
 * @author syed
 *
 */
public class UnitServiceImpl implements UnitService{

	private final UnitDAO unitDAO;

	public UnitServiceImpl(UnitDAO unitDAO)
	{
		this.unitDAO = unitDAO;
	}
}
