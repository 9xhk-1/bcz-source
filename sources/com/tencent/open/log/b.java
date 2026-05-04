package com.tencent.open.log;

import android.text.TextUtils;
import com.tencent.open.log.d;
import com.tencent.open.utils.m;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static SimpleDateFormat f44531a = d.C0526d.a("yy.MM.dd.HH");

    /* renamed from: g, reason: collision with root package name */
    private File f44537g;

    /* renamed from: b, reason: collision with root package name */
    private String f44532b = "Tracer.File";

    /* renamed from: c, reason: collision with root package name */
    private int f44533c = Integer.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    private int f44534d = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    private int f44535e = 4096;

    /* renamed from: f, reason: collision with root package name */
    private long f44536f = 10000;

    /* renamed from: h, reason: collision with root package name */
    private int f44538h = 10;

    /* renamed from: i, reason: collision with root package name */
    private String f44539i = ".log";

    /* renamed from: j, reason: collision with root package name */
    private long f44540j = Long.MAX_VALUE;

    public b(File file, int i11, int i12, int i13, String str, long j11, int i14, String str2, long j12) {
        a(file);
        b(i11);
        a(i12);
        c(i13);
        a(str);
        b(j11);
        d(i14);
        b(str2);
        c(j12);
    }

    private String c(String str) {
        return "com.tencent.mobileqq_connectSdk." + str + ".log";
    }

    private File[] d(long j11) {
        File file;
        File b11 = b();
        String c11 = c(a(j11));
        try {
            b11 = new File(b11, c11);
        } catch (Throwable th2) {
            SLog.e(SLog.TAG, "getWorkFile,get old sdcard file exception:", th2);
        }
        String b12 = m.b();
        if (!TextUtils.isEmpty(b12) || b12 != null) {
            try {
                File file2 = new File(b12, c.f44555o);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                file = new File(file2, c11);
            } catch (Exception e11) {
                SLog.e(SLog.TAG, "getWorkFile,get app specific file exception:", e11);
            }
            return new File[]{b11, file};
        }
        file = null;
        return new File[]{b11, file};
    }

    public File[] a() {
        return d(System.currentTimeMillis());
    }

    public File b() {
        File e11 = e();
        if (e11 != null) {
            e11.mkdirs();
        }
        return e11;
    }

    public File e() {
        return this.f44537g;
    }

    public int f() {
        return this.f44538h;
    }

    public static String a(long j11) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j11);
        return new SimpleDateFormat("yy.MM.dd.HH").format(calendar.getTime());
    }

    public String c() {
        return this.f44532b;
    }

    public void b(int i11) {
        this.f44534d = i11;
    }

    public void c(int i11) {
        this.f44535e = i11;
    }

    public void b(long j11) {
        this.f44536f = j11;
    }

    public void c(long j11) {
        this.f44540j = j11;
    }

    public void b(String str) {
        this.f44539i = str;
    }

    public void a(String str) {
        this.f44532b = str;
    }

    public void a(int i11) {
        this.f44533c = i11;
    }

    public void a(File file) {
        this.f44537g = file;
    }

    public int d() {
        return this.f44535e;
    }

    public void d(int i11) {
        this.f44538h = i11;
    }
}
