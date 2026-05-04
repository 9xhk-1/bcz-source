package com.getui.gtc.base.log.c;

import android.text.TextUtils;
import com.alipay.sdk.m.u.i;
import com.getui.gtc.base.log.ILogDestination;
import com.getui.gtc.base.log.ILogFormatter;
import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class b implements ILogFormatter {

    /* renamed from: a, reason: collision with root package name */
    public String f29818a;

    /* renamed from: b, reason: collision with root package name */
    public int f29819b;

    /* renamed from: c, reason: collision with root package name */
    private ILogDestination f29820c;

    public b() {
        this(new com.getui.gtc.base.log.b.b());
    }

    private String a() {
        try {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[this.f29819b];
            String className = stackTraceElement.getClassName();
            return String.format("%s.%s", className.substring(className.lastIndexOf(".") + 1), stackTraceElement.getMethodName());
        } catch (Throwable unused) {
            return "";
        }
    }

    private String b() {
        try {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[this.f29819b];
            String className = stackTraceElement.getClassName();
            return String.format("(%s:%d)", className.substring(className.lastIndexOf(".") + 1) + ".java", Integer.valueOf(stackTraceElement.getLineNumber()));
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // com.getui.gtc.base.log.ILogFormatter
    public final void log(int i11, String str, String str2, Throwable th2) {
        String a11 = a();
        if (TextUtils.isEmpty(str)) {
            str = this.f29818a;
        }
        if (!TextUtils.isEmpty(str)) {
            a11 = str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + a11;
        }
        this.f29820c.log(i11, a11, a(str2, th2));
    }

    public b(ILogDestination iLogDestination) {
        this.f29818a = "";
        this.f29819b = 8;
        this.f29820c = (ILogDestination) com.getui.gtc.base.log.e.a.a(iLogDestination);
    }

    private String a(String str, Throwable th2) {
        if (th2 != null && str != null) {
            str = str + " : " + a(th2);
        }
        if (th2 != null && str == null) {
            str = a(th2);
        }
        if (TextUtils.isEmpty(str)) {
            str = "Empty/NULL log message";
        }
        String trim = str.trim();
        if (trim.startsWith("{") && trim.endsWith(i.f11099d)) {
            try {
                trim = new JSONObject(trim).toString(2);
            } catch (Throwable unused) {
            }
        }
        if (trim.startsWith("[") && trim.endsWith("]")) {
            try {
                trim = new JSONArray(trim).toString(2);
            } catch (Throwable unused2) {
            }
        }
        String b11 = b();
        if (th2 != null) {
            return trim;
        }
        return trim + " " + b11;
    }

    private static String a(Throwable th2) {
        if (th2 == null) {
            return "";
        }
        for (Throwable th3 = th2; th3 != null; th3 = th3.getCause()) {
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintWriter printWriter = new PrintWriter((OutputStream) byteArrayOutputStream, false);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        return byteArrayOutputStream.toString();
    }
}
