package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public static final String f31300a = "UTC";

    /* renamed from: b, reason: collision with root package name */
    public static AtomicReference<u> f31301b = new AtomicReference<>();

    @TargetApi(24)
    public static DateFormat A(Locale locale) {
        return d("yMMMM", locale);
    }

    @TargetApi(24)
    public static DateFormat B(Locale locale) {
        return d("yMMMMEEEEd", locale);
    }

    @NonNull
    public static String C(@NonNull String str) {
        int b11 = b(str, "yY", 1, 0);
        if (b11 >= str.length()) {
            return str;
        }
        String str2 = "EMd";
        int b12 = b(str, "EMd", 1, b11);
        if (b12 < str.length()) {
            str2 = "EMd,";
        }
        return str.replace(str.substring(b(str, str2, -1, b11) + 1, b12), " ").trim();
    }

    public static void D(@Nullable u uVar) {
        f31301b.set(uVar);
    }

    public static long a(long j11) {
        Calendar x11 = x();
        x11.setTimeInMillis(j11);
        return f(x11).getTimeInMillis();
    }

    public static int b(@NonNull String str, @NonNull String str2, int i11, int i12) {
        while (i12 >= 0 && i12 < str.length() && str2.indexOf(str.charAt(i12)) == -1) {
            if (str.charAt(i12) == '\'') {
                do {
                    i12 += i11;
                    if (i12 >= 0 && i12 < str.length()) {
                    }
                } while (str.charAt(i12) != '\'');
            }
            i12 += i11;
        }
        return i12;
    }

    @TargetApi(24)
    public static DateFormat c(Locale locale) {
        return d("MMMd", locale);
    }

    @TargetApi(24)
    public static DateFormat d(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(w());
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return instanceForSkeleton;
    }

    @NonNull
    public static String e(@NonNull String str) {
        return str.replaceAll("[^dMy/\\-.]", "").replaceAll("d{1,2}", "dd").replaceAll("M{1,2}", "MM").replaceAll("y{1,4}", "yyyy").replaceAll("\\.$", "").replaceAll("My", "M/y");
    }

    public static Calendar f(Calendar calendar) {
        Calendar y11 = y(calendar);
        Calendar x11 = x();
        x11.set(y11.get(1), y11.get(2), y11.get(5));
        return x11;
    }

    public static SimpleDateFormat g() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(e(((SimpleDateFormat) java.text.DateFormat.getDateInstance(3, Locale.getDefault())).toPattern()), Locale.getDefault());
        simpleDateFormat.setTimeZone(u());
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    public static String h(Resources resources, SimpleDateFormat simpleDateFormat) {
        String pattern = simpleDateFormat.toPattern();
        String string = resources.getString(R.string.mtrl_picker_text_input_year_abbr);
        String string2 = resources.getString(R.string.mtrl_picker_text_input_month_abbr);
        String string3 = resources.getString(R.string.mtrl_picker_text_input_day_abbr);
        if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage())) {
            pattern = pattern.replaceAll("d+", "d").replaceAll("M+", "M").replaceAll("y+", "y");
        }
        return pattern.replace("d", string3).replace("M", string2).replace("y", string);
    }

    public static java.text.DateFormat i(int i11, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i11, locale);
        dateInstance.setTimeZone(u());
        return dateInstance;
    }

    public static java.text.DateFormat j() {
        return k(Locale.getDefault());
    }

    public static java.text.DateFormat k(Locale locale) {
        return i(0, locale);
    }

    public static java.text.DateFormat l() {
        return m(Locale.getDefault());
    }

    public static java.text.DateFormat m(Locale locale) {
        return i(2, locale);
    }

    public static java.text.DateFormat n() {
        return o(Locale.getDefault());
    }

    public static java.text.DateFormat o(Locale locale) {
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) m(locale);
        simpleDateFormat.applyPattern(C(simpleDateFormat.toPattern()));
        return simpleDateFormat;
    }

    @TargetApi(24)
    public static DateFormat p(Locale locale) {
        return d("MMMMEEEEd", locale);
    }

    public static java.text.DateFormat q(@NonNull java.text.DateFormat dateFormat) {
        java.text.DateFormat dateFormat2 = (java.text.DateFormat) dateFormat.clone();
        dateFormat2.setTimeZone(u());
        return dateFormat2;
    }

    public static SimpleDateFormat r(String str) {
        return s(str, Locale.getDefault());
    }

    public static SimpleDateFormat s(String str, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(u());
        return simpleDateFormat;
    }

    public static u t() {
        u uVar = f31301b.get();
        return uVar == null ? u.e() : uVar;
    }

    public static TimeZone u() {
        return TimeZone.getTimeZone("UTC");
    }

    public static Calendar v() {
        Calendar c11 = t().c();
        c11.set(11, 0);
        c11.set(12, 0);
        c11.set(13, 0);
        c11.set(14, 0);
        c11.setTimeZone(u());
        return c11;
    }

    @TargetApi(24)
    public static android.icu.util.TimeZone w() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    public static Calendar x() {
        return y(null);
    }

    public static Calendar y(@Nullable Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(u());
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }

    @TargetApi(24)
    public static DateFormat z(Locale locale) {
        return d("yMMMd", locale);
    }
}
