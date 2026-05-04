package com.zx.a.I8b7;

import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class q0 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public k0 f46656a;

    /* renamed from: b, reason: collision with root package name */
    public String f46657b = "";

    /* renamed from: c, reason: collision with root package name */
    public int f46658c = 8;

    public q0(k0 k0Var) {
        this.f46656a = (k0) f2.a(k0Var);
    }

    @Override // com.zx.a.I8b7.l0
    public void a(int i11, String str, String str2, Throwable th2) {
        String str3;
        String str4 = "";
        try {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[this.f46658c];
            String className = stackTraceElement.getClassName();
            str3 = String.format("%s.%s", className.substring(className.lastIndexOf(".") + 1), stackTraceElement.getMethodName());
        } catch (Throwable unused) {
            str3 = "";
        }
        if (TextUtils.isEmpty(str)) {
            str = this.f46657b;
        }
        if (!TextUtils.isEmpty(str)) {
            str3 = str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str3;
        }
        if (th2 != null && str2 != null) {
            str2 = str2 + " : " + a(th2);
        }
        if (th2 != null && str2 == null) {
            str2 = a(th2);
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "Empty/NULL log message";
        }
        String trim = str2.trim();
        if (trim.startsWith("{") && trim.endsWith(com.alipay.sdk.m.u.i.f11099d)) {
            try {
                trim = new JSONObject(trim).toString(2);
            } catch (Throwable unused2) {
            }
        }
        if (trim.startsWith("[") && trim.endsWith("]")) {
            try {
                trim = new JSONArray(trim).toString(2);
            } catch (Throwable unused3) {
            }
        }
        try {
            StackTraceElement stackTraceElement2 = Thread.currentThread().getStackTrace()[this.f46658c];
            String className2 = stackTraceElement2.getClassName();
            str4 = String.format("(%s:%d)", className2.substring(className2.lastIndexOf(".") + 1) + ".java", Integer.valueOf(stackTraceElement2.getLineNumber()));
        } catch (Throwable unused4) {
        }
        if (th2 == null) {
            trim = trim + " " + str4;
        }
        this.f46656a.a(i11, str3, trim);
    }

    public static String a(Throwable th2) {
        for (Throwable th3 = th2; th3 != null; th3 = th3.getCause()) {
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintWriter printWriter = new PrintWriter((OutputStream) byteArrayOutputStream, false);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        return byteArrayOutputStream.toString();
    }
}
