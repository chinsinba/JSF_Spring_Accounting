package accounts.app.bean.convertor;

import javax.annotation.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import accounts.app.service.ItemGroupService;
import accounts.model.entity.item.ItemCategory;

@ManagedBean
@RequestScoped
@FacesConverter("accounts.app.bean.convertor.ItemGroupConverter")
public class ItemGroupConverter implements Converter {

	ItemGroupService svc ;

	@Inject
	ItemGroupConverter(ItemGroupService service){
		this.svc=service;
	}

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		
		return svc.find(Long.parseLong(arg2));
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		// TODO Auto-generated method stub
		return String.valueOf(((ItemCategory)arg2).getId());
	}

}
