package com.tencent.open.log;

import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.connect.common.Constants;
import com.tencent.open.log.d;
import java.io.File;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class SLog implements TraceLevel {
    public static final String TAG = "openSDK_LOG";

    /* renamed from: c, reason: collision with root package name */
    private static boolean f44512c = false;
    public static SLog instance;

    /* renamed from: a, reason: collision with root package name */
    protected a f44513a;

    /* renamed from: b, reason: collision with root package name */
    private Tracer f44514b;

    private SLog() {
    }

    private void d() {
        this.f44513a = new a(new b(a(), c.f44553m, c.f44547g, c.f44548h, c.f44543c, c.f44549i, 10, c.f44545e, c.f44554n));
    }

    public static final void e(String str, String str2) {
        getInstance().a(16, str, str2, null);
    }

    public static void flushLogs() {
        getInstance().c();
    }

    public static SLog getInstance() {
        if (instance == null) {
            synchronized (SLog.class) {
                try {
                    if (instance == null) {
                        SLog sLog = new SLog();
                        instance = sLog;
                        sLog.d();
                        f44512c = true;
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    public static final void i(String str, String str2) {
        getInstance().a(4, str, str2, null);
    }

    public static void release() {
        synchronized (SLog.class) {
            try {
                getInstance().b();
                if (instance != null) {
                    instance = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final void u(String str, String str2) {
        getInstance().a(32, str, str2, null);
    }

    public static final void v(String str, String str2) {
        getInstance().a(1, str, str2, null);
    }

    public static final void w(String str, String str2) {
        getInstance().a(8, str, str2, null);
    }

    public void a(int i11, String str, String str2, Throwable th2) {
        if (f44512c) {
            String b11 = com.tencent.open.utils.g.b();
            if (!TextUtils.isEmpty(b11)) {
                String str3 = b11 + " SDK_VERSION:" + Constants.SDK_VERSION;
                if (this.f44513a == null) {
                    return;
                }
                e.f44559a.a(32, Thread.currentThread(), System.currentTimeMillis(), TAG, str3, null);
                this.f44513a.a(32, Thread.currentThread(), System.currentTimeMillis(), TAG, str3, null);
                f44512c = false;
            }
        }
        e.f44559a.a(i11, Thread.currentThread(), System.currentTimeMillis(), str, str2, th2);
        if (d.a.a(c.f44542b, i11)) {
            a aVar = this.f44513a;
            if (aVar == null) {
                return;
            } else {
                aVar.a(i11, Thread.currentThread(), System.currentTimeMillis(), str, str2, th2);
            }
        }
        Tracer tracer = this.f44514b;
        if (tracer != null) {
            try {
                tracer.a(i11, Thread.currentThread(), System.currentTimeMillis(), str, a(str2), th2);
            } catch (Exception e11) {
                Log.e(str, "Exception", e11);
            }
        }
    }

    public void b() {
        a aVar = this.f44513a;
        if (aVar != null) {
            aVar.a();
            this.f44513a.b();
            this.f44513a = null;
        }
    }

    public void c() {
        a aVar = this.f44513a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public void setCustomLogger(Tracer tracer) {
        this.f44514b = tracer;
    }

    public static final void e(String str, String str2, Throwable th2) {
        getInstance().a(16, str, str2, th2);
    }

    public static final void i(String str, String str2, Throwable th2) {
        getInstance().a(4, str, str2, th2);
    }

    public static final void u(String str, String str2, Throwable th2) {
        getInstance().a(32, str, str2, th2);
    }

    public static final void v(String str, String str2, Throwable th2) {
        getInstance().a(1, str, str2, th2);
    }

    public static final void w(String str, String str2, Throwable th2) {
        getInstance().a(8, str, str2, th2);
    }

    public static final void d(String str, String str2) {
        getInstance().a(2, str, str2, null);
    }

    public static final void d(String str, String str2, Throwable th2) {
        getInstance().a(2, str, str2, th2);
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return d.a(str) ? "xxxxxx" : str;
    }

    public static File a() {
        String str = c.f44544d;
        try {
            d.c b11 = d.b.b();
            if (b11 != null && b11.c() > c.f44546f) {
                return new File(Environment.getExternalStorageDirectory(), str);
            }
            return new File(com.tencent.open.utils.g.c(), str);
        } catch (Throwable th2) {
            e(TAG, "getLogFilePath:", th2);
            return null;
        }
    }
}
