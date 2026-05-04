package androidx.compose.ui.text;

import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.AndroidStringDelegate_androidKt;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class StringKt {

    @k
    private static final PlatformStringDelegate stringDelegate = AndroidStringDelegate_androidKt.ActualStringDelegate();

    @k
    public static final String capitalize(@k String str, @k Locale locale) {
        return stringDelegate.capitalize(str, locale.getPlatformLocale());
    }

    @k
    public static final String decapitalize(@k String str, @k Locale locale) {
        return stringDelegate.decapitalize(str, locale.getPlatformLocale());
    }

    @k
    public static final String toLowerCase(@k String str, @k Locale locale) {
        return stringDelegate.toLowerCase(str, locale.getPlatformLocale());
    }

    @k
    public static final String toUpperCase(@k String str, @k Locale locale) {
        return stringDelegate.toUpperCase(str, locale.getPlatformLocale());
    }

    @k
    public static final String capitalize(@k String str, @k LocaleList localeList) {
        return capitalize(str, localeList.isEmpty() ? Locale.Companion.getCurrent() : localeList.get(0));
    }

    @k
    public static final String decapitalize(@k String str, @k LocaleList localeList) {
        return decapitalize(str, localeList.isEmpty() ? Locale.Companion.getCurrent() : localeList.get(0));
    }

    @k
    public static final String toLowerCase(@k String str, @k LocaleList localeList) {
        return toLowerCase(str, localeList.isEmpty() ? Locale.Companion.getCurrent() : localeList.get(0));
    }

    @k
    public static final String toUpperCase(@k String str, @k LocaleList localeList) {
        return toUpperCase(str, localeList.isEmpty() ? Locale.Companion.getCurrent() : localeList.get(0));
    }
}
