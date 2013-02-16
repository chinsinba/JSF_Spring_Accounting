package accounts.app.dao.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import accounts.app.dao.StakeHolderDAO;
import accounts.model.entity.StakeHolder;
/**
 * 
 * @author syed
 *
 */
@Component
@Repository
public class StakeHolderDAOImpl extends GenericDAOImpl<StakeHolder> implements StakeHolderDAO {

}
