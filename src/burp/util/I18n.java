package burp.util;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class I18n {
    private static Locale currentLocale = Locale.US;
    private static ResourceBundle bundle = ResourceBundle.getBundle("lang.messages", currentLocale);

    public static void setLocale(Locale locale) {
        currentLocale = locale;
        bundle = ResourceBundle.getBundle("lang.messages", currentLocale);
    }

    public static Locale getLocale() {
        return currentLocale;
    }

    public static String t(String key) {
        try {
            return bundle.getString(key);
        } catch (MissingResourceException e) {
            return key;
        }
    }
}