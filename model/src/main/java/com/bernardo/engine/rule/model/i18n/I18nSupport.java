package com.bernardo.engine.rule.model.i18n;

import java.text.MessageFormat;
import java.util.ResourceBundle;

/**
 * Support i18n resource bundle reder
 *
 * @author Salvatore Bernardo
 */
public class I18nSupport {

    private static final String BASE_NAME = "i18n-messages";

    public static String getString(String key, Object... parameters) {
        ResourceBundle bundle = ResourceBundle.getBundle(BASE_NAME);
        return MessageFormat.format(bundle.getString(key), parameters);
    }

}
