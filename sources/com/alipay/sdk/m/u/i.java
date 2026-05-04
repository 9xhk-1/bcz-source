package com.alipay.sdk.m.u;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public static final String f11096a = "pref_trade_token";

    /* renamed from: b, reason: collision with root package name */
    public static final String f11097b = ";";

    /* renamed from: c, reason: collision with root package name */
    public static final String f11098c = "result={";

    /* renamed from: d, reason: collision with root package name */
    public static final String f11099d = "}";

    /* renamed from: e, reason: collision with root package name */
    public static final String f11100e = "trade_token=\"";

    /* renamed from: f, reason: collision with root package name */
    public static final String f11101f = "\"";

    /* renamed from: g, reason: collision with root package name */
    public static final String f11102g = "trade_token=";

    public static void a(com.alipay.sdk.m.s.a aVar, Context context, String str) {
        try {
            String a11 = a(str);
            e.b(com.alipay.sdk.m.l.a.A, "trade token: " + a11);
            if (TextUtils.isEmpty(a11)) {
                return;
            }
            j.b(aVar, context, f11096a, a11);
        } catch (Throwable th2) {
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.f10653l, com.alipay.sdk.m.k.b.I, th2);
            e.a(th2);
        }
    }

    public static String a(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(f11097b);
        for (int i11 = 0; i11 < split.length; i11++) {
            if (split[i11].startsWith(f11098c) && split[i11].endsWith(f11099d)) {
                String[] split2 = split[i11].substring(8, r3.length() - 1).split("&");
                int i12 = 0;
                while (true) {
                    if (i12 >= split2.length) {
                        break;
                    }
                    if (split2[i12].startsWith(f11100e) && split2[i12].endsWith("\"")) {
                        str2 = split2[i12].substring(13, r1.length() - 1);
                        break;
                    }
                    if (split2[i12].startsWith(f11102g)) {
                        str2 = split2[i12].substring(12);
                        break;
                    }
                    i12++;
                }
            }
        }
        return str2;
    }

    public static String a(com.alipay.sdk.m.s.a aVar, Context context) {
        String a11 = j.a(aVar, context, f11096a, "");
        e.b(com.alipay.sdk.m.l.a.A, "get trade token: " + a11);
        return a11;
    }
}
