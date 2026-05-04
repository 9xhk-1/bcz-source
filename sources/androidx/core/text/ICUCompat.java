package androidx.core.text;

import android.annotation.SuppressLint;
import android.icu.util.ULocale;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class ICUCompat {
    private static final String TAG = "ICUCompat";
    private static Method sAddLikelySubtagsMethod;
    private static Method sGetScriptMethod;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        public static String getScript(Locale locale) {
            return locale.getScript();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(24)
    public static class Api24Impl {
        private Api24Impl() {
        }

        @DoNotInline
        public static ULocale addLikelySubtags(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        @DoNotInline
        public static ULocale forLocale(Locale locale) {
            return ULocale.forLocale(locale);
        }

        @DoNotInline
        public static String getScript(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    private ICUCompat() {
    }

    @SuppressLint({"BanUncheckedReflection"})
    private static String addLikelySubtagsBelowApi21(Locale locale) {
        String locale2 = locale.toString();
        try {
            Method method = sAddLikelySubtagsMethod;
            if (method != null) {
                return (String) method.invoke(null, locale2);
            }
        } catch (IllegalAccessException e11) {
            Log.w(TAG, e11);
        } catch (InvocationTargetException e12) {
            Log.w(TAG, e12);
        }
        return locale2;
    }

    @SuppressLint({"BanUncheckedReflection"})
    private static String getScriptBelowApi21(String str) {
        try {
            Method method = sGetScriptMethod;
            if (method != null) {
                return (String) method.invoke(null, str);
            }
        } catch (IllegalAccessException e11) {
            Log.w(TAG, e11);
        } catch (InvocationTargetException e12) {
            Log.w(TAG, e12);
        }
        return null;
    }

    @Nullable
    public static String maximizeAndGetScript(@NonNull Locale locale) {
        return Api24Impl.getScript(Api24Impl.addLikelySubtags(Api24Impl.forLocale(locale)));
    }
}
