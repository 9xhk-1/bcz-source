package com.huawei.hms.base.log;

import android.os.Process;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    private String f35473b;

    /* renamed from: c, reason: collision with root package name */
    private String f35474c;

    /* renamed from: d, reason: collision with root package name */
    private int f35475d;

    /* renamed from: g, reason: collision with root package name */
    private String f35478g;

    /* renamed from: h, reason: collision with root package name */
    private int f35479h;

    /* renamed from: i, reason: collision with root package name */
    private int f35480i;

    /* renamed from: j, reason: collision with root package name */
    private int f35481j;

    /* renamed from: a, reason: collision with root package name */
    private final StringBuilder f35472a = new StringBuilder();

    /* renamed from: e, reason: collision with root package name */
    private long f35476e = 0;

    /* renamed from: f, reason: collision with root package name */
    private long f35477f = 0;

    public e(int i11, String str, int i12, String str2) {
        this.f35474c = "HMS";
        this.f35481j = i11;
        this.f35473b = str;
        this.f35475d = i12;
        if (str2 != null) {
            this.f35474c = str2;
        }
        b();
    }

    public static String a(int i11) {
        return i11 != 3 ? i11 != 4 ? i11 != 5 ? i11 != 6 ? String.valueOf(i11) : ExifInterface.LONGITUDE_EAST : ExifInterface.LONGITUDE_WEST : "I" : "D";
    }

    private e b() {
        this.f35476e = System.currentTimeMillis();
        Thread currentThread = Thread.currentThread();
        this.f35477f = currentThread.getId();
        this.f35479h = Process.myPid();
        StackTraceElement[] stackTrace = currentThread.getStackTrace();
        int length = stackTrace.length;
        int i11 = this.f35481j;
        if (length > i11) {
            StackTraceElement stackTraceElement = stackTrace[i11];
            this.f35478g = stackTraceElement.getFileName();
            this.f35480i = stackTraceElement.getLineNumber();
        }
        return this;
    }

    public String c() {
        StringBuilder sb2 = new StringBuilder();
        b(sb2);
        return sb2.toString();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        b(sb2);
        a(sb2);
        return sb2.toString();
    }

    public <T> e a(T t11) {
        this.f35472a.append(t11);
        return this;
    }

    public e a(Throwable th2) {
        a((e) '\n').a((e) Log.getStackTraceString(th2));
        return this;
    }

    public String a() {
        StringBuilder sb2 = new StringBuilder();
        a(sb2);
        return sb2.toString();
    }

    private StringBuilder b(StringBuilder sb2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());
        sb2.append('[');
        sb2.append(simpleDateFormat.format(Long.valueOf(this.f35476e)));
        String a11 = a(this.f35475d);
        sb2.append(' ');
        sb2.append(a11);
        sb2.append('/');
        sb2.append(this.f35474c);
        sb2.append('/');
        sb2.append(this.f35473b);
        sb2.append(' ');
        sb2.append(this.f35479h);
        sb2.append(':');
        sb2.append(this.f35477f);
        sb2.append(' ');
        sb2.append(this.f35478g);
        sb2.append(':');
        sb2.append(this.f35480i);
        sb2.append(l50.b.f69930l);
        return sb2;
    }

    private StringBuilder a(StringBuilder sb2) {
        sb2.append(' ');
        sb2.append(this.f35472a.toString());
        return sb2;
    }
}
