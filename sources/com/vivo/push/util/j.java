package com.vivo.push.util;

import android.os.Build;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    private static Method f45101e;

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f45097a = b("rom_1.0");

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f45098b = b("rom_2.0");

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f45099c = b("rom_2.5");

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f45100d = b("rom_3.0");

    /* renamed from: f, reason: collision with root package name */
    private static String f45102f = null;

    /* renamed from: g, reason: collision with root package name */
    private static String f45103g = null;

    public static String a(String str, String str2) {
        String str3;
        try {
            str3 = (String) Class.forName("android.os.SystemProperties").getMethod(ct.d.f46852f, String.class).invoke(null, str);
        } catch (Exception e11) {
            e11.printStackTrace();
            str3 = str2;
        }
        return (str3 == null || str3.length() == 0) ? str2 : str3;
    }

    private static boolean b(String str) {
        String b11 = z.b("ro.vivo.rom", "");
        String b12 = z.b("ro.vivo.rom.version", "");
        p.d("Device", "ro.vivo.rom = " + b11 + " ; ro.vivo.rom.version = " + b12);
        if (b11 == null || !b11.contains(str)) {
            return b12 != null && b12.contains(str);
        }
        return true;
    }

    public static synchronized String a() {
        synchronized (j.class) {
            if (f45102f == null && f45103g == null) {
                try {
                    Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod(ct.d.f46852f, String.class, String.class);
                    f45101e = declaredMethod;
                    declaredMethod.setAccessible(true);
                    f45102f = (String) f45101e.invoke(null, "ro.vivo.rom", "@><@");
                    f45103g = (String) f45101e.invoke(null, "ro.vivo.rom.version", "@><@");
                } catch (Exception unused) {
                    p.b("Device", "getRomCode error");
                }
            }
            p.d("Device", "sRomProperty1 : " + f45102f + " ; sRomProperty2 : " + f45103g);
            String a11 = a(f45102f);
            if (!TextUtils.isEmpty(a11)) {
                return a11;
            }
            String a12 = a(f45103g);
            if (TextUtils.isEmpty(a12)) {
                return null;
            }
            return a12;
        }
    }

    public static boolean b() {
        String str = Build.MANUFACTURER;
        if (TextUtils.isEmpty(str)) {
            p.d("Device", "Build.MANUFACTURER is null");
            return false;
        }
        p.d("Device", "Build.MANUFACTURER is " + str);
        return str.toLowerCase().contains("bbk") || str.toLowerCase().startsWith("vivo");
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = Pattern.compile("rom_([\\d]*).?([\\d]*)", 2).matcher(str);
        if (!matcher.find()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(matcher.group(1));
        sb2.append(TextUtils.isEmpty(matcher.group(2)) ? "0" : matcher.group(2).substring(0, 1));
        return sb2.toString();
    }
}
