package accounts.app.bean.convertor;

import javax.annotation.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import accounts.app.service.LedgerAccountService;
import accounts.model.entity.LedgerAccount;
import accounts.model.entity.LedgerGroup;

@ManagedBean
@RequestScoped
@FacesConverter("accounts.app.bean.convertor.LedgerAccountConverter")
public class LedgerAccountConverter implements Converter {

	private LedgerAccountService service;
	
	@Inject
	public LedgerAccountConverter(LedgerAccountService service) {
		this.service = service;
	}
	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		// TODO Auto-generated method stub
		return service.find(Long.parseLong(arg2));
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		// TODO Auto-generated method stub
		return String.valueOf(((LedgerAccount)arg2).getId());
	}

}
