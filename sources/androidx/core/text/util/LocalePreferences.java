package androidx.core.text.util;

import android.icu.number.NumberFormatter;
import android.icu.number.UnlocalizedNumberFormatter;
import android.icu.text.DateFormat;
import android.icu.text.DateTimePatternGenerator;
import android.icu.util.Calendar;
import android.icu.util.MeasureUnit;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(21)
/* loaded from: classes2.dex */
public final class LocalePreferences {
    private static final String TAG = "LocalePreferences";
    private static final String[] WEATHER_FAHRENHEIT_COUNTRIES = {"BS", "BZ", "KY", "PR", "PW", "US"};

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: androidx.core.text.util.LocalePreferences$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$android$icu$text$DateFormat$HourCycle;

        static {
            DateFormat.HourCycle[] values;
            DateFormat.HourCycle hourCycle;
            int ordinal;
            DateFormat.HourCycle hourCycle2;
            int ordinal2;
            DateFormat.HourCycle hourCycle3;
            int ordinal3;
            DateFormat.HourCycle hourCycle4;
            int ordinal4;
            values = DateFormat.HourCycle.values();
            int[] iArr = new int[values.length];
            $SwitchMap$android$icu$text$DateFormat$HourCycle = iArr;
            try {
                hourCycle4 = DateFormat.HourCycle.HOUR_CYCLE_11;
                ordinal4 = hourCycle4.ordinal();
                iArr[ordinal4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = $SwitchMap$android$icu$text$DateFormat$HourCycle;
                hourCycle3 = DateFormat.HourCycle.HOUR_CYCLE_12;
                ordinal3 = hourCycle3.ordinal();
                iArr2[ordinal3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = $SwitchMap$android$icu$text$DateFormat$HourCycle;
                hourCycle2 = DateFormat.HourCycle.HOUR_CYCLE_23;
                ordinal2 = hourCycle2.ordinal();
                iArr3[ordinal2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = $SwitchMap$android$icu$text$DateFormat$HourCycle;
                hourCycle = DateFormat.HourCycle.HOUR_CYCLE_24;
                ordinal = hourCycle.ordinal();
                iArr4[ordinal] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(24)
    public static class Api24Impl {
        private Api24Impl() {
        }

        @DoNotInline
        public static String getCalendarType(@NonNull Locale locale) {
            return Calendar.getInstance(locale).getType();
        }

        @DoNotInline
        public static Locale getDefaultLocale() {
            return Locale.getDefault(Locale.Category.FORMAT);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(33)
    public static class Api33Impl {
        private Api33Impl() {
        }

        @DoNotInline
        public static String getHourCycle(@NonNull Locale locale) {
            return getHourCycleType(DateTimePatternGenerator.getInstance(locale).getDefaultHourCycle());
        }

        private static String getHourCycleType(DateFormat.HourCycle hourCycle) {
            int i11 = AnonymousClass1.$SwitchMap$android$icu$text$DateFormat$HourCycle[hourCycle.ordinal()];
            return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? "" : HourCycle.H24 : HourCycle.H23 : HourCycle.H12 : HourCycle.H11;
        }

        @DoNotInline
        public static String getResolvedTemperatureUnit(@NonNull Locale locale) {
            String identifier = ((UnlocalizedNumberFormatter) ((UnlocalizedNumberFormatter) NumberFormatter.with().usage("weather")).unit(MeasureUnit.CELSIUS)).locale(locale).format(1L).getOutputUnit().getIdentifier();
            return identifier.startsWith(TemperatureUnit.FAHRENHEIT) ? TemperatureUnit.FAHRENHEIT : identifier;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CalendarType {
        public static final String CHINESE = "chinese";
        public static final String DANGI = "dangi";
        public static final String DEFAULT = "";
        public static final String GREGORIAN = "gregorian";
        public static final String HEBREW = "hebrew";
        public static final String INDIAN = "indian";
        public static final String ISLAMIC = "islamic";
        public static final String ISLAMIC_CIVIL = "islamic-civil";
        public static final String ISLAMIC_RGSA = "islamic-rgsa";
        public static final String ISLAMIC_TBLA = "islamic-tbla";
        public static final String ISLAMIC_UMALQURA = "islamic-umalqura";
        public static final String PERSIAN = "persian";
        private static final String U_EXTENSION_TAG = "ca";

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public @interface CalendarTypes {
        }

        private CalendarType() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class FirstDayOfWeek {
        public static final String DEFAULT = "";
        public static final String FRIDAY = "fri";
        public static final String MONDAY = "mon";
        public static final String SATURDAY = "sat";
        public static final String SUNDAY = "sun";
        public static final String THURSDAY = "thu";
        public static final String TUESDAY = "tue";
        private static final String U_EXTENSION_TAG = "fw";
        public static final String WEDNESDAY = "wed";

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public @interface Days {
        }

        private FirstDayOfWeek() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class HourCycle {
        public static final String DEFAULT = "";
        public static final String H11 = "h11";
        public static final String H12 = "h12";
        public static final String H23 = "h23";
        public static final String H24 = "h24";
        private static final String U_EXTENSION_TAG = "hc";

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public @interface HourCycleTypes {
        }

        private HourCycle() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TemperatureUnit {
        public static final String CELSIUS = "celsius";
        public static final String DEFAULT = "";
        public static final String FAHRENHEIT = "fahrenhe";
        public static final String KELVIN = "kelvin";
        private static final String U_EXTENSION_TAG = "mu";

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public @interface TemperatureUnits {
        }

        private TemperatureUnit() {
        }
    }

    private LocalePreferences() {
    }

    private static String getBaseFirstDayOfWeek(@NonNull Locale locale) {
        return getStringOfFirstDayOfWeek(java.util.Calendar.getInstance(locale).getFirstDayOfWeek());
    }

    private static String getBaseHourCycle(@NonNull Locale locale) {
        return android.text.format.DateFormat.getBestDateTimePattern(locale, "jm").contains("H") ? HourCycle.H23 : HourCycle.H12;
    }

    @NonNull
    public static String getCalendarType() {
        return getCalendarType(true);
    }

    private static Locale getDefaultLocale() {
        return Locale.getDefault();
    }

    @NonNull
    public static String getFirstDayOfWeek() {
        return getFirstDayOfWeek(true);
    }

    @NonNull
    public static String getHourCycle() {
        return getHourCycle(true);
    }

    private static String getStringOfFirstDayOfWeek(int i11) {
        return (i11 < 1 || i11 > 7) ? "" : new String[]{FirstDayOfWeek.SUNDAY, FirstDayOfWeek.MONDAY, FirstDayOfWeek.TUESDAY, FirstDayOfWeek.WEDNESDAY, FirstDayOfWeek.THURSDAY, FirstDayOfWeek.FRIDAY, FirstDayOfWeek.SATURDAY}[i11 - 1];
    }

    private static String getTemperatureHardCoded(Locale locale) {
        return Arrays.binarySearch(WEATHER_FAHRENHEIT_COUNTRIES, locale.getCountry()) >= 0 ? TemperatureUnit.FAHRENHEIT : TemperatureUnit.CELSIUS;
    }

    @NonNull
    public static String getTemperatureUnit() {
        return getTemperatureUnit(true);
    }

    private static String getUnicodeLocaleType(String str, String str2, Locale locale, boolean z11) {
        String unicodeLocaleType = locale.getUnicodeLocaleType(str);
        if (unicodeLocaleType != null) {
            return unicodeLocaleType;
        }
        if (z11) {
            return null;
        }
        return str2;
    }

    @NonNull
    public static String getCalendarType(@NonNull Locale locale) {
        return getCalendarType(locale, true);
    }

    @NonNull
    public static String getFirstDayOfWeek(@NonNull Locale locale) {
        return getFirstDayOfWeek(locale, true);
    }

    @NonNull
    public static String getHourCycle(@NonNull Locale locale) {
        return getHourCycle(locale, true);
    }

    @NonNull
    public static String getTemperatureUnit(@NonNull Locale locale) {
        return getTemperatureUnit(locale, true);
    }

    @NonNull
    public static String getCalendarType(boolean z11) {
        return getCalendarType(Api24Impl.getDefaultLocale(), z11);
    }

    @NonNull
    public static String getFirstDayOfWeek(boolean z11) {
        return getFirstDayOfWeek(Api24Impl.getDefaultLocale(), z11);
    }

    @NonNull
    public static String getHourCycle(boolean z11) {
        return getHourCycle(Api24Impl.getDefaultLocale(), z11);
    }

    @NonNull
    public static String getTemperatureUnit(boolean z11) {
        return getTemperatureUnit(Api24Impl.getDefaultLocale(), z11);
    }

    @NonNull
    public static String getCalendarType(@NonNull Locale locale, boolean z11) {
        String unicodeLocaleType = getUnicodeLocaleType(com.igexin.push.core.b.f37706ac, "", locale, z11);
        return unicodeLocaleType != null ? unicodeLocaleType : Api24Impl.getCalendarType(locale);
    }

    @NonNull
    public static String getFirstDayOfWeek(@NonNull Locale locale, boolean z11) {
        String unicodeLocaleType = getUnicodeLocaleType("fw", "", locale, z11);
        return unicodeLocaleType != null ? unicodeLocaleType : getBaseFirstDayOfWeek(locale);
    }

    @NonNull
    public static String getHourCycle(@NonNull Locale locale, boolean z11) {
        String unicodeLocaleType = getUnicodeLocaleType("hc", "", locale, z11);
        if (unicodeLocaleType != null) {
            return unicodeLocaleType;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return Api33Impl.getHourCycle(locale);
        }
        return getBaseHourCycle(locale);
    }

    @NonNull
    public static String getTemperatureUnit(@NonNull Locale locale, boolean z11) {
        String unicodeLocaleType = getUnicodeLocaleType("mu", "", locale, z11);
        if (unicodeLocaleType != null) {
            return unicodeLocaleType;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return Api33Impl.getResolvedTemperatureUnit(locale);
        }
        return getTemperatureHardCoded(locale);
    }
}
