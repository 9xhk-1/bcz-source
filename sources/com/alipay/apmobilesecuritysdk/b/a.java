package com.alipay.apmobilesecuritysdk.b;

import com.alipay.sdk.m.d0.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static a f10349b = new a();

    /* renamed from: a, reason: collision with root package name */
    public int f10350a = 0;

    public static a a() {
        return f10349b;
    }

    public final int b() {
        return this.f10350a;
    }

    public final String c() {
        String str;
        String a11 = d.a();
        if (com.alipay.sdk.m.z.a.b(a11)) {
            return a11;
        }
        int i11 = this.f10350a;
        if (i11 == 1) {
            str = "://mobilegw.stable.alipay.net/mgw.htm";
        } else {
            if (i11 == 2) {
                return "https://mobilegwpre.alipay.com/mgw.htm";
            }
            if (i11 == 3) {
                str = "://mobilegw-1-64.test.alipay.net/mgw.htm";
            } else {
                if (i11 != 4) {
                    return "https://mobilegw.alipay.com/mgw.htm";
                }
                str = "://mobilegw.aaa.alipay.net/mgw.htm";
            }
        }
        return a("http", str);
    }

    public static String a(String str, String str2) {
        return str + str2;
    }

    public final void a(int i11) {
        this.f10350a = i11;
    }
}
