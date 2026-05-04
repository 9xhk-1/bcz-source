package androidx.core.os;

import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.DoNotInline;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.Size;
import androidx.core.text.ICUCompat;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class LocaleListCompat {
    private static final LocaleListCompat sEmptyLocaleList = create(new Locale[0]);
    private final LocaleListInterface mImpl;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(21)
    public static class Api21Impl {
        private static final Locale[] PSEUDO_LOCALE = {new Locale("en", "XA"), new Locale("ar", "XB")};

        private Api21Impl() {
        }

        @DoNotInline
        public static Locale forLanguageTag(String str) {
            return Locale.forLanguageTag(str);
        }

        private static boolean isPseudoLocale(Locale locale) {
            for (Locale locale2 : PSEUDO_LOCALE) {
                if (locale2.equals(locale)) {
                    return true;
                }
            }
            return false;
        }

        @DoNotInline
        public static boolean matchesLanguageAndScript(@NonNull Locale locale, @NonNull Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage()) || isPseudoLocale(locale) || isPseudoLocale(locale2)) {
                return false;
            }
            String maximizeAndGetScript = ICUCompat.maximizeAndGetScript(locale);
            if (!maximizeAndGetScript.isEmpty()) {
                return maximizeAndGetScript.equals(ICUCompat.maximizeAndGetScript(locale2));
            }
            String country = locale.getCountry();
            return country.isEmpty() || country.equals(locale2.getCountry());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(24)
    public static class Api24Impl {
        private Api24Impl() {
        }

        @DoNotInline
        public static LocaleList createLocaleList(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        @DoNotInline
        public static LocaleList getAdjustedDefault() {
            return LocaleList.getAdjustedDefault();
        }

        @DoNotInline
        public static LocaleList getDefault() {
            return LocaleList.getDefault();
        }
    }

    private LocaleListCompat(LocaleListInterface localeListInterface) {
        this.mImpl = localeListInterface;
    }

    @NonNull
    public static LocaleListCompat create(@NonNull Locale... localeArr) {
        return wrap(Api24Impl.createLocaleList(localeArr));
    }

    public static Locale forLanguageTagCompat(String str) {
        if (str.contains(Constants.ACCEPT_TIME_SEPARATOR_SERVER)) {
            String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER, -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else {
            if (!str.contains("_")) {
                return new Locale(str);
            }
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    @NonNull
    public static LocaleListCompat forLanguageTags(@Nullable String str) {
        if (str == null || str.isEmpty()) {
            return getEmptyLocaleList();
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i11 = 0; i11 < length; i11++) {
            localeArr[i11] = Api21Impl.forLanguageTag(split[i11]);
        }
        return create(localeArr);
    }

    @NonNull
    @Size(min = 1)
    public static LocaleListCompat getAdjustedDefault() {
        return wrap(Api24Impl.getAdjustedDefault());
    }

    @NonNull
    @Size(min = 1)
    public static LocaleListCompat getDefault() {
        return wrap(Api24Impl.getDefault());
    }

    @NonNull
    public static LocaleListCompat getEmptyLocaleList() {
        return sEmptyLocaleList;
    }

    @RequiresApi(21)
    public static boolean matchesLanguageAndScript(@NonNull Locale locale, @NonNull Locale locale2) {
        boolean matchesLanguageAndScript;
        if (Build.VERSION.SDK_INT < 33) {
            return Api21Impl.matchesLanguageAndScript(locale, locale2);
        }
        matchesLanguageAndScript = LocaleList.matchesLanguageAndScript(locale, locale2);
        return matchesLanguageAndScript;
    }

    @RequiresApi(24)
    @Deprecated
    public static LocaleListCompat wrap(Object obj) {
        return wrap((LocaleList) obj);
    }

    public boolean equals(Object obj) {
        return (obj instanceof LocaleListCompat) && this.mImpl.equals(((LocaleListCompat) obj).mImpl);
    }

    @Nullable
    public Locale get(int i11) {
        return this.mImpl.get(i11);
    }

    @Nullable
    public Locale getFirstMatch(@NonNull String[] strArr) {
        return this.mImpl.getFirstMatch(strArr);
    }

    public int hashCode() {
        return this.mImpl.hashCode();
    }

    @IntRange(from = -1)
    public int indexOf(@Nullable Locale locale) {
        return this.mImpl.indexOf(locale);
    }

    public boolean isEmpty() {
        return this.mImpl.isEmpty();
    }

    @IntRange(from = 0)
    public int size() {
        return this.mImpl.size();
    }

    @NonNull
    public String toLanguageTags() {
        return this.mImpl.toLanguageTags();
    }

    @NonNull
    public String toString() {
        return this.mImpl.toString();
    }

    @Nullable
    public Object unwrap() {
        return this.mImpl.getLocaleList();
    }

    @NonNull
    @RequiresApi(24)
    public static LocaleListCompat wrap(@NonNull LocaleList localeList) {
        return new LocaleListCompat(new LocaleListPlatformWrapper(localeList));
    }
}
