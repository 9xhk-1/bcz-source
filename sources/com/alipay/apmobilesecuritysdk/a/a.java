package com.alipay.apmobilesecuritysdk.a;

import android.content.Context;
import android.os.Environment;
import com.alipay.apmobilesecuritysdk.d.e;
import com.alipay.apmobilesecuritysdk.e.b;
import com.alipay.apmobilesecuritysdk.e.g;
import com.alipay.apmobilesecuritysdk.e.h;
import com.alipay.apmobilesecuritysdk.e.i;
import com.alipay.apmobilesecuritysdk.otherid.UmidSdkWrapper;
import com.alipay.sdk.m.f0.c;
import com.alipay.sdk.m.f0.d;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public Context f10346a;

    /* renamed from: b, reason: collision with root package name */
    public com.alipay.apmobilesecuritysdk.b.a f10347b = com.alipay.apmobilesecuritysdk.b.a.a();

    /* renamed from: c, reason: collision with root package name */
    public int f10348c = 4;

    public a(Context context) {
        this.f10346a = context;
    }

    private c b(Map<String, String> map) {
        String str;
        String str2;
        String str3;
        b b11;
        b c11;
        String str4 = "";
        try {
            Context context = this.f10346a;
            d dVar = new d();
            String a11 = com.alipay.sdk.m.z.a.a(map, "appName", "");
            String a12 = com.alipay.sdk.m.z.a.a(map, "sessionId", "");
            String a13 = com.alipay.sdk.m.z.a.a(map, "rpcVersion", "");
            String a14 = a(context, a11);
            String securityToken = UmidSdkWrapper.getSecurityToken(context);
            String d11 = h.d(context);
            if (com.alipay.sdk.m.z.a.b(a12)) {
                dVar.f10544c = a12;
            } else {
                dVar.f10544c = a14;
            }
            dVar.f10545d = securityToken;
            dVar.f10546e = d11;
            dVar.f10542a = "android";
            com.alipay.apmobilesecuritysdk.e.c c12 = com.alipay.apmobilesecuritysdk.e.d.c(context);
            if (c12 != null) {
                str2 = c12.f10356a;
                str = c12.f10358c;
            } else {
                str = "";
                str2 = str;
            }
            if (com.alipay.sdk.m.z.a.a(str2) && (c11 = com.alipay.apmobilesecuritysdk.e.a.c(context)) != null) {
                str2 = c11.f10353a;
                str = c11.f10355c;
            }
            com.alipay.apmobilesecuritysdk.e.c b12 = com.alipay.apmobilesecuritysdk.e.d.b();
            if (b12 != null) {
                str4 = b12.f10356a;
                str3 = b12.f10358c;
            } else {
                str3 = "";
            }
            if (com.alipay.sdk.m.z.a.a(str4) && (b11 = com.alipay.apmobilesecuritysdk.e.a.b()) != null) {
                str4 = b11.f10353a;
                str3 = b11.f10355c;
            }
            dVar.f10549h = str2;
            dVar.f10548g = str4;
            dVar.f10551j = a13;
            if (com.alipay.sdk.m.z.a.a(str2)) {
                dVar.f10543b = str4;
                str = str3;
            } else {
                dVar.f10543b = str2;
            }
            dVar.f10550i = str;
            dVar.f10547f = e.a(context, map);
            return com.alipay.sdk.m.d0.d.b(this.f10346a, this.f10347b.c()).a(dVar);
        } catch (Throwable th2) {
            th2.printStackTrace();
            com.alipay.apmobilesecuritysdk.c.a.a(th2);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x00bc, code lost:
    
        if (com.alipay.sdk.m.z.a.a(b(r9.f10346a)) != false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0201 A[Catch: Exception -> 0x006e, TryCatch #0 {Exception -> 0x006e, blocks: (B:3:0x0006, B:5:0x0037, B:8:0x0040, B:12:0x00c1, B:15:0x01e7, B:17:0x0201, B:19:0x0209, B:21:0x020f, B:23:0x0215, B:25:0x021b, B:31:0x00d9, B:33:0x00f1, B:38:0x00fe, B:39:0x0111, B:44:0x0126, B:46:0x0176, B:48:0x0180, B:49:0x0188, B:51:0x0195, B:53:0x019f, B:54:0x01a7, B:55:0x01a3, B:56:0x0184, B:58:0x0055, B:60:0x0063, B:63:0x0071, B:65:0x0077, B:68:0x0082, B:71:0x008b, B:74:0x0098, B:78:0x00a5, B:81:0x00b2), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0209 A[Catch: Exception -> 0x006e, TryCatch #0 {Exception -> 0x006e, blocks: (B:3:0x0006, B:5:0x0037, B:8:0x0040, B:12:0x00c1, B:15:0x01e7, B:17:0x0201, B:19:0x0209, B:21:0x020f, B:23:0x0215, B:25:0x021b, B:31:0x00d9, B:33:0x00f1, B:38:0x00fe, B:39:0x0111, B:44:0x0126, B:46:0x0176, B:48:0x0180, B:49:0x0188, B:51:0x0195, B:53:0x019f, B:54:0x01a7, B:55:0x01a3, B:56:0x0184, B:58:0x0055, B:60:0x0063, B:63:0x0071, B:65:0x0077, B:68:0x0082, B:71:0x008b, B:74:0x0098, B:78:0x00a5, B:81:0x00b2), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d9 A[Catch: Exception -> 0x006e, TryCatch #0 {Exception -> 0x006e, blocks: (B:3:0x0006, B:5:0x0037, B:8:0x0040, B:12:0x00c1, B:15:0x01e7, B:17:0x0201, B:19:0x0209, B:21:0x020f, B:23:0x0215, B:25:0x021b, B:31:0x00d9, B:33:0x00f1, B:38:0x00fe, B:39:0x0111, B:44:0x0126, B:46:0x0176, B:48:0x0180, B:49:0x0188, B:51:0x0195, B:53:0x019f, B:54:0x01a7, B:55:0x01a3, B:56:0x0184, B:58:0x0055, B:60:0x0063, B:63:0x0071, B:65:0x0077, B:68:0x0082, B:71:0x008b, B:74:0x0098, B:78:0x00a5, B:81:0x00b2), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.util.Map<java.lang.String, java.lang.String> r10) {
        /*
            Method dump skipped, instructions count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.apmobilesecuritysdk.a.a.a(java.util.Map):int");
    }

    public static String a(Context context) {
        String b11 = b(context);
        return com.alipay.sdk.m.z.a.a(b11) ? h.f(context) : b11;
    }

    public static String b(Context context) {
        try {
            String b11 = i.b();
            if (!com.alipay.sdk.m.z.a.a(b11)) {
                return b11;
            }
            com.alipay.apmobilesecuritysdk.e.c b12 = com.alipay.apmobilesecuritysdk.e.d.b(context);
            if (b12 != null) {
                i.a(b12);
                String str = b12.f10356a;
                if (com.alipay.sdk.m.z.a.b(str)) {
                    return str;
                }
            }
            b b13 = com.alipay.apmobilesecuritysdk.e.a.b(context);
            if (b13 == null) {
                return "";
            }
            i.a(b13);
            String str2 = b13.f10353a;
            return com.alipay.sdk.m.z.a.b(str2) ? str2 : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String a(Context context, String str) {
        try {
            b();
            String a11 = i.a(str);
            if (!com.alipay.sdk.m.z.a.a(a11)) {
                return a11;
            }
            String a12 = g.a(context, str);
            i.a(str, a12);
            return !com.alipay.sdk.m.z.a.a(a12) ? a12 : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void b() {
        try {
            String[] strArr = {"device_feature_file_name", "wallet_times", "wxcasxx_v3", "wxcasxx_v4", "wxxzyy_v1"};
            for (int i11 = 0; i11 < 5; i11++) {
                String str = strArr[i11];
                File file = new File(Environment.getExternalStorageDirectory(), ".SystemConfig/" + str);
                if (file.exists() && file.canWrite()) {
                    file.delete();
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String[] strArr = {"2017-01-27 2017-01-28", "2017-11-10 2017-11-11", "2017-12-11 2017-12-12"};
        int random = (int) (Math.random() * 24.0d * 60.0d * 60.0d);
        for (int i11 = 0; i11 < 3; i11++) {
            try {
                String[] split = strArr[i11].split(" ");
                if (split != null && split.length == 2) {
                    Date date = new Date();
                    Date parse = simpleDateFormat.parse(split[0] + " 00:00:00");
                    Date parse2 = simpleDateFormat.parse(split[1] + " 23:59:59");
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(parse2);
                    calendar.add(13, random);
                    Date time = calendar.getTime();
                    if (date.after(parse) && date.before(time)) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
