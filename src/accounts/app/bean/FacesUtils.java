package accounts.app.bean;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * 
 * @author syed
 *
 */
public abstract class FacesUtils {

    public static String getBundleKey(String bundleName, String key) {
        return FacesContext.getCurrentInstance().getApplication().getResourceBundle(FacesContext.getCurrentInstance(), bundleName).getString(key);
    }

    public static void addInfo(String controlId, String messageKey, Object... args) {
        addMessage(controlId, FacesMessage.SEVERITY_INFO, messageKey, args);
    }
    
    public static void addInfoString(String controlId, String message) {
        addMessageString(controlId, FacesMessage.SEVERITY_INFO, message);
    }

    public static void addError(String controlId, String messageKey, Object... args) {
        addMessage(controlId, FacesMessage.SEVERITY_ERROR, messageKey, args);
    }
    
    public static void addErrorString(String controlId, String message) {
        addMessageString(controlId, FacesMessage.SEVERITY_ERROR, message);
    }
    
    public static void addMessageString(String controlId, Severity sev,String message) {
        FacesContext jsf = FacesContext.getCurrentInstance();
        jsf.addMessage(controlId, new FacesMessage(sev, message,null));
    }

    public static void addMessage(String controlId,
            javax.faces.application.FacesMessage.Severity sev,
            String messageKey, Object... args) {
        FacesContext jsf = FacesContext.getCurrentInstance();
        ExternalContext extCtxt = jsf.getExternalContext();
        jsf.addMessage(controlId, new FacesMessage(sev, formatMessage(
                messageKey, extCtxt.getRequestLocale(), args), null));
    }

    public static String formatMessage(String messageKey, Locale locale,
            Object... args) {
        return MessageFormat.format(getMessage(messageKey, locale), args);
    }

    public static String getMessage(String messageKey, Locale locale) {
        ResourceBundle i18n = getBundle(locale);
        try {
            return i18n.getString(messageKey);
        } catch (java.util.MissingResourceException mre) {
            return "???" + messageKey + "???";
        }
    }
    
    public static ResourceBundle getBundle(Locale locale) {
        return FacesContext.getCurrentInstance().getApplication().getResourceBundle(FacesContext.getCurrentInstance(), "messages");
    }
}
