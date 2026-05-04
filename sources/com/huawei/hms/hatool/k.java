package com.huawei.hms.hatool;

import android.util.Pair;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class k extends u0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f35842a;

        static {
            int[] iArr = new int[d0.values().length];
            f35842a = iArr;
            try {
                iArr[d0.SN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35842a[d0.IMEI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35842a[d0.UDID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static f0 a(String str, String str2, String str3, String str4) {
        f0 a11 = u0.a(str, str2, str3, str4);
        String a12 = j.a().a(a1.c(str2, str3));
        long currentTimeMillis = System.currentTimeMillis();
        String b11 = qr.d.b(q0.f() + a12 + currentTimeMillis);
        a11.f(String.valueOf(currentTimeMillis));
        a11.g(b11);
        return a11;
    }

    public static Map<String, String> b(String str, String str2, String str3) {
        Map<String, String> c11 = u0.c(str, str3);
        Map<String, String> i11 = a1.i(str, str2);
        if (i11 == null) {
            return c11;
        }
        c11.putAll(i11);
        return c11;
    }

    public static h1 a(List<b1> list, String str, String str2, String str3, String str4) {
        v.c("hmsSdk", "generate UploadData");
        h1 b11 = u0.b(str, str2);
        if (b11 == null) {
            return null;
        }
        b11.a(a(m1.d().a(), str, str2, str3));
        b11.a(a(str, str2));
        b11.a(a(str2, str, str4));
        b11.a(a1.g(str, str2));
        b11.a(list);
        return b11;
    }

    public static l a(String str, String str2) {
        l a11 = u0.a(str, str2);
        i c11 = j.a().c(str, str2);
        a11.g(j.a().a(a1.c(str, str2)));
        a11.f(a1.o(str, str2));
        a11.c(j.a().f(str, str2));
        int i11 = a.f35842a[c11.a().ordinal()];
        if (i11 == 1) {
            a11.d(c11.b());
            return a11;
        }
        if (i11 == 2) {
            a11.b(c11.b());
            return a11;
        }
        if (i11 != 3) {
            return a11;
        }
        a11.e(c11.b());
        return a11;
    }

    public static y0 a(String str, String str2, String str3) {
        y0 a11 = u0.a(str, str2, str3);
        Pair<String, String> e11 = j.a().e(str2, str);
        a11.f((String) e11.first);
        a11.g((String) e11.second);
        a11.h(o.b());
        a11.d(j.a().d(str2, str));
        return a11;
    }
}
