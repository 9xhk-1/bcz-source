package com.alipay.sdk.m.u;

import com.alipay.sdk.interior.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static Log.ISdkLogCallback f11052a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final String f11053b = "alipaysdk";

    public static void a(Log.ISdkLogCallback iSdkLogCallback) {
        f11052a = iSdkLogCallback;
    }

    public static void b(String str, String str2) {
        a(a(str, str2));
    }

    public static void c(String str, String str2) {
        a(a(str, str2));
    }

    public static void d(String str, String str2) {
        a(a(str, str2));
    }

    public static void e(String str, String str2) {
        a(a(str, str2));
    }

    public static void a(String str) {
        try {
            Log.ISdkLogCallback iSdkLogCallback = f11052a;
            if (iSdkLogCallback != null) {
                iSdkLogCallback.onLogLine(String.format("[AlipaySDK] %s %s", new SimpleDateFormat("hh:mm:ss.SSS", Locale.getDefault()).format(new Date()), str));
            }
        } catch (Throwable unused) {
        }
    }

    public static String b(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static void a(String str, String str2, Throwable th2) {
        a(a(str, str2) + " " + b(th2));
    }

    public static void a(Throwable th2) {
        if (th2 == null) {
            return;
        }
        try {
            a(b(th2));
        } catch (Throwable unused) {
        }
    }

    public static String a(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        return String.format("[%s][%s]", str, str2);
    }
}
