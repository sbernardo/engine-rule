package com.bernardo.engine.rule.model.i18n;

import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

public class I18nSupportTest {

    @Test
    public void getStringTest_en() {
        Locale.setDefault(Locale.US);
        String messageRead = I18nSupport.getString("malformed_when", "£$hello && world");
        Assert.assertEquals("Malformed when, next token not recognized in string -> '£$hello && world'", messageRead);
    }

    @Test
    public void getStringTest_it() {
        Locale.setDefault(Locale.ITALY);
        String messageRead = I18nSupport.getString("malformed_when", "£$ciao && mondo");
        Assert.assertEquals("Stringa when malformata, prossimo token non riconosciuto della stringa -> '£$ciao && mondo'", messageRead);
    }

}
