package com.getui.gtc.base.log.c;

import android.os.Process;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.alipay.sdk.m.u.i;
import com.getui.gtc.base.log.ILogDestination;
import com.getui.gtc.base.log.ILogFormatter;
import com.getui.gtc.base.util.CommonUtil;
import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class a implements ILogFormatter {

    /* renamed from: c, reason: collision with root package name */
    private final ILogDestination f29815c;

    /* renamed from: e, reason: collision with root package name */
    private String f29817e;

    /* renamed from: d, reason: collision with root package name */
    private final SimpleDateFormat f29816d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());

    /* renamed from: a, reason: collision with root package name */
    public String f29813a = "";

    /* renamed from: b, reason: collision with root package name */
    public int f29814b = 8;

    public a(ILogDestination iLogDestination) {
        this.f29817e = "";
        this.f29815c = (ILogDestination) com.getui.gtc.base.log.e.a.a(iLogDestination);
        this.f29817e = CommonUtil.getProcessName();
    }

    private String a() {
        try {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[this.f29814b];
            String className = stackTraceElement.getClassName();
            return String.format("%s.%s", className.substring(className.lastIndexOf(".") + 1), stackTraceElement.getMethodName());
        } catch (Throwable unused) {
            return "";
        }
    }

    private String b() {
        try {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[this.f29814b];
            String className = stackTraceElement.getClassName();
            return String.format("(%s:%d)", className.substring(className.lastIndexOf(".") + 1) + ".java", Integer.valueOf(stackTraceElement.getLineNumber()));
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // com.getui.gtc.base.log.ILogFormatter
    public final void log(int i11, String str, String str2, Throwable th2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f29816d.format(new Date()));
        sb2.append(" ");
        sb2.append(Process.myPid());
        sb2.append("/");
        sb2.append(this.f29817e);
        sb2.append(" ");
        sb2.append(i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? "?" : ExifInterface.LONGITUDE_EAST : ExifInterface.LONGITUDE_WEST : "I" : "D" : ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
        sb2.append("/");
        String a11 = a();
        String str3 = TextUtils.isEmpty(str) ? this.f29813a : str;
        if (!TextUtils.isEmpty(str3)) {
            a11 = str3 + Constants.ACCEPT_TIME_SEPARATOR_SERVER + a11;
        }
        sb2.append(a11);
        sb2.append(": ");
        sb2.append(a(str2, th2));
        String sb3 = sb2.toString();
        if (!sb3.endsWith("\n")) {
            sb3 = sb3 + "\n";
        }
        this.f29815c.log(i11, str, sb3);
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
