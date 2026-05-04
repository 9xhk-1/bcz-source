package com.alipay.android.phone.mrpc.core;

import android.text.format.Time;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f10285a = Pattern.compile("([0-9]{1,2})[- ]([A-Za-z]{3,9})[- ]([0-9]{2,4})[ ]([0-9]{1,2}:[0-9][0-9]:[0-9][0-9])");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f10286b = Pattern.compile("[ ]([A-Za-z]{3,9})[ ]+([0-9]{1,2})[ ]([0-9]{1,2}:[0-9][0-9]:[0-9][0-9])[ ]([0-9]{2,4})");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f10287a;

        /* renamed from: b, reason: collision with root package name */
        public int f10288b;

        /* renamed from: c, reason: collision with root package name */
        public int f10289c;

        public a(int i11, int i12, int i13) {
            this.f10287a = i11;
            this.f10288b = i12;
            this.f10289c = i13;
        }
    }

    public static long a(String str) {
        int c11;
        int d11;
        int i11;
        a aVar;
        int i12;
        int i13;
        int i14;
        Matcher matcher = f10285a.matcher(str);
        if (matcher.find()) {
            i11 = b(matcher.group(1));
            c11 = c(matcher.group(2));
            d11 = d(matcher.group(3));
            aVar = e(matcher.group(4));
        } else {
            Matcher matcher2 = f10286b.matcher(str);
            if (!matcher2.find()) {
                throw new IllegalArgumentException();
            }
            c11 = c(matcher2.group(1));
            int b11 = b(matcher2.group(2));
            a e11 = e(matcher2.group(3));
            d11 = d(matcher2.group(4));
            i11 = b11;
            aVar = e11;
        }
        if (d11 >= 2038) {
            i13 = 0;
            i14 = 2038;
            i12 = 1;
        } else {
            i12 = i11;
            i13 = c11;
            i14 = d11;
        }
        Time time = new Time("UTC");
        time.set(aVar.f10289c, aVar.f10288b, aVar.f10287a, i12, i13, i14);
        return time.toMillis(false);
    }

    public static int b(String str) {
        return str.length() == 2 ? ((str.charAt(0) - '0') * 10) + (str.charAt(1) - '0') : str.charAt(0) - '0';
    }

    public static int c(String str) {
        int lowerCase = ((Character.toLowerCase(str.charAt(0)) + Character.toLowerCase(str.charAt(1))) + Character.toLowerCase(str.charAt(2))) - 291;
        if (lowerCase == 9) {
            return 11;
        }
        if (lowerCase == 10) {
            return 1;
        }
        if (lowerCase == 22) {
            return 0;
        }
        if (lowerCase == 26) {
            return 7;
        }
        if (lowerCase == 29) {
            return 2;
        }
        if (lowerCase == 32) {
            return 3;
        }
        if (lowerCase == 40) {
            return 6;
        }
        if (lowerCase == 42) {
            return 5;
        }
        if (lowerCase == 48) {
            return 10;
        }
        switch (lowerCase) {
            case 35:
                return 9;
            case 36:
                return 4;
            case 37:
                return 8;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static int d(String str) {
        if (str.length() == 2) {
            int charAt = ((str.charAt(0) - '0') * 10) + (str.charAt(1) - '0');
            return charAt >= 70 ? charAt + 1900 : charAt + 2000;
        }
        if (str.length() == 3) {
            return ((str.charAt(0) - '0') * 100) + ((str.charAt(1) - '0') * 10) + (str.charAt(2) - '0') + 1900;
        }
        if (str.length() == 4) {
            return ((str.charAt(0) - '0') * 1000) + ((str.charAt(1) - '0') * 100) + ((str.charAt(2) - '0') * 10) + (str.charAt(3) - '0');
        }
        return 1970;
    }

    public static a e(String str) {
        int charAt = str.charAt(0) - '0';
        int i11 = 1;
        if (str.charAt(1) != ':') {
            charAt = (charAt * 10) + (str.charAt(1) - '0');
            i11 = 2;
        }
        return new a(charAt, ((str.charAt(i11 + 1) - '0') * 10) + (str.charAt(i11 + 2) - '0'), ((str.charAt(i11 + 4) - '0') * 10) + (str.charAt(i11 + 5) - '0'));
    }
}
