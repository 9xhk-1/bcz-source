package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Process;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import java.lang.Thread;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class av implements Thread.UncaughtExceptionHandler {

    /* renamed from: h, reason: collision with root package name */
    private static String f42395h;

    /* renamed from: i, reason: collision with root package name */
    private static final Object f42396i = new Object();

    /* renamed from: a, reason: collision with root package name */
    protected final Context f42397a;

    /* renamed from: b, reason: collision with root package name */
    protected final as f42398b;

    /* renamed from: c, reason: collision with root package name */
    protected final ac f42399c;

    /* renamed from: d, reason: collision with root package name */
    protected final aa f42400d;

    /* renamed from: e, reason: collision with root package name */
    protected Thread.UncaughtExceptionHandler f42401e;

    /* renamed from: f, reason: collision with root package name */
    protected Thread.UncaughtExceptionHandler f42402f;

    /* renamed from: g, reason: collision with root package name */
    protected boolean f42403g = false;

    /* renamed from: j, reason: collision with root package name */
    private int f42404j;

    public av(Context context, as asVar, ac acVar, aa aaVar) {
        this.f42397a = context;
        this.f42398b = asVar;
        this.f42399c = acVar;
        this.f42400d = aaVar;
    }

    private static void c() {
        al.e("current process die", new Object[0]);
        Process.killProcess(Process.myPid());
        System.exit(1);
    }

    public final synchronized void a() {
        if (this.f42404j >= 10) {
            al.a("java crash handler over %d, no need set.", 10);
            return;
        }
        this.f42403g = true;
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != null) {
            if (av.class.getName().equals(defaultUncaughtExceptionHandler.getClass().getName())) {
                return;
            }
            if ("com.android.internal.os.RuntimeInit$UncaughtHandler".equals(defaultUncaughtExceptionHandler.getClass().getName())) {
                al.a("backup system java handler: %s", defaultUncaughtExceptionHandler.toString());
                this.f42402f = defaultUncaughtExceptionHandler;
                this.f42401e = defaultUncaughtExceptionHandler;
            } else {
                al.a("backup java handler: %s", defaultUncaughtExceptionHandler.toString());
                this.f42401e = defaultUncaughtExceptionHandler;
            }
        }
        Thread.setDefaultUncaughtExceptionHandler(this);
        this.f42404j++;
        al.a("registered java monitor: %s", toString());
    }

    public final synchronized void b() {
        this.f42403g = false;
        al.a("close java monitor!", new Object[0]);
        if ("bugly".equals(Thread.getDefaultUncaughtExceptionHandler().getClass().getName())) {
            al.a("Java monitor to unregister: %s", toString());
            Thread.setDefaultUncaughtExceptionHandler(this.f42401e);
            this.f42404j--;
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        synchronized (f42396i) {
            a(thread, th2, true, null, null, this.f42400d.Q);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x010f A[Catch: all -> 0x0104, TryCatch #0 {all -> 0x0104, blocks: (B:31:0x00fc, B:23:0x0109, B:27:0x010f, B:29:0x011d, B:38:0x011f), top: B:30:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011d A[Catch: all -> 0x0104, TryCatch #0 {all -> 0x0104, blocks: (B:31:0x00fc, B:23:0x0109, B:27:0x010f, B:29:0x011d, B:38:0x011f), top: B:30:0x00fc }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.tencent.bugly.crashreport.crash.CrashDetailBean b(java.lang.Thread r5, java.lang.Throwable r6, boolean r7, java.lang.String r8, byte[] r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.av.b(java.lang.Thread, java.lang.Throwable, boolean, java.lang.String, byte[], boolean):com.tencent.bugly.crashreport.crash.CrashDetailBean");
    }

    private static void a(CrashDetailBean crashDetailBean, Throwable th2, boolean z11) {
        String a11;
        String name = th2.getClass().getName();
        String a12 = a(th2);
        al.e("stack frame :%d, has cause %b", Integer.valueOf(th2.getStackTrace().length), Boolean.valueOf(th2.getCause() != null));
        String str = "";
        String stackTraceElement = th2.getStackTrace().length > 0 ? th2.getStackTrace()[0].toString() : "";
        Throwable th3 = th2;
        while (th3 != null && th3.getCause() != null) {
            th3 = th3.getCause();
        }
        if (th3 != null && th3 != th2) {
            crashDetailBean.f42116n = th3.getClass().getName();
            crashDetailBean.f42117o = a(th3);
            if (th3.getStackTrace().length > 0) {
                crashDetailBean.f42118p = th3.getStackTrace()[0].toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(name);
            sb2.append(":");
            sb2.append(a12);
            sb2.append("\n");
            sb2.append(stackTraceElement);
            sb2.append("\n......");
            sb2.append("\nCaused by:\n");
            sb2.append(crashDetailBean.f42116n);
            sb2.append(":");
            sb2.append(crashDetailBean.f42117o);
            sb2.append("\n");
            a11 = a(th3, at.f42352h);
            sb2.append(a11);
            crashDetailBean.f42119q = sb2.toString();
        } else {
            crashDetailBean.f42116n = name;
            if (at.a().i() && z11) {
                al.e("This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful!", new Object[0]);
                str = " This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful![Bugly]";
            }
            crashDetailBean.f42117o = a12 + str;
            crashDetailBean.f42118p = stackTraceElement;
            a11 = a(th2, at.f42352h);
            crashDetailBean.f42119q = a11;
        }
        crashDetailBean.f42123u = ap.c(crashDetailBean.f42119q.getBytes());
        crashDetailBean.f42128z.put(crashDetailBean.B, a11);
    }

    private static boolean a(Thread thread) {
        synchronized (f42396i) {
            try {
                if (f42395h != null && thread.getName().equals(f42395h)) {
                    return true;
                }
                f42395h = thread.getName();
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(Thread thread, Throwable th2, boolean z11, String str, byte[] bArr, boolean z12) {
        if (z11) {
            al.e("Java Crash Happen cause by %s(%d)", thread.getName(), Long.valueOf(thread.getId()));
            if (a(thread)) {
                al.a("this class has handled this exception", new Object[0]);
                if (this.f42402f != null) {
                    al.a("call system handler", new Object[0]);
                    this.f42402f.uncaughtException(thread, th2);
                } else {
                    c();
                }
            }
        } else {
            al.e("Java Catch Happen", new Object[0]);
        }
        try {
            if (!this.f42403g) {
                al.c("Java crash handler is disable. Just return.", new Object[0]);
                if (z11) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f42401e;
                    if (uncaughtExceptionHandler != null && a(uncaughtExceptionHandler)) {
                        al.e("sys default last handle start!", new Object[0]);
                        this.f42401e.uncaughtException(thread, th2);
                        al.e("sys default last handle end!", new Object[0]);
                        return;
                    } else if (this.f42402f != null) {
                        al.e("system handle start!", new Object[0]);
                        this.f42402f.uncaughtException(thread, th2);
                        al.e("system handle end!", new Object[0]);
                        return;
                    } else {
                        al.e("crashreport last handle start!", new Object[0]);
                        c();
                        al.e("crashreport last handle end!", new Object[0]);
                        return;
                    }
                }
                return;
            }
            if (!this.f42399c.b()) {
                al.d("no remote but still store!", new Object[0]);
            }
            if (!this.f42399c.c().f42084f && this.f42399c.b()) {
                al.e("crash report was closed by remote , will not upload to Bugly , print local for helpful!", new Object[0]);
                as.a(z11 ? "JAVA_CRASH" : "JAVA_CATCH", ap.a(), this.f42400d.f42187d, thread.getName(), ap.a(th2), null);
                if (z11) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f42401e;
                    if (uncaughtExceptionHandler2 != null && a(uncaughtExceptionHandler2)) {
                        al.e("sys default last handle start!", new Object[0]);
                        this.f42401e.uncaughtException(thread, th2);
                        al.e("sys default last handle end!", new Object[0]);
                        return;
                    } else if (this.f42402f != null) {
                        al.e("system handle start!", new Object[0]);
                        this.f42402f.uncaughtException(thread, th2);
                        al.e("system handle end!", new Object[0]);
                        return;
                    } else {
                        al.e("crashreport last handle start!", new Object[0]);
                        c();
                        al.e("crashreport last handle end!", new Object[0]);
                        return;
                    }
                }
                return;
            }
            CrashDetailBean b11 = b(thread, th2, z11, str, bArr, z12);
            if (b11 == null) {
                al.e("pkg crash datas fail!", new Object[0]);
                if (z11) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = this.f42401e;
                    if (uncaughtExceptionHandler3 != null && a(uncaughtExceptionHandler3)) {
                        al.e("sys default last handle start!", new Object[0]);
                        this.f42401e.uncaughtException(thread, th2);
                        al.e("sys default last handle end!", new Object[0]);
                        return;
                    } else if (this.f42402f != null) {
                        al.e("system handle start!", new Object[0]);
                        this.f42402f.uncaughtException(thread, th2);
                        al.e("system handle end!", new Object[0]);
                        return;
                    } else {
                        al.e("crashreport last handle start!", new Object[0]);
                        c();
                        al.e("crashreport last handle end!", new Object[0]);
                        return;
                    }
                }
                return;
            }
            as.a(z11 ? "JAVA_CRASH" : "JAVA_CATCH", ap.a(), this.f42400d.f42187d, thread.getName(), ap.a(th2), b11);
            if (!this.f42398b.a(b11, z11)) {
                this.f42398b.b(b11, z11);
            }
            if (z11) {
                this.f42398b.a(b11);
            }
            if (z11) {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler4 = this.f42401e;
                if (uncaughtExceptionHandler4 != null && a(uncaughtExceptionHandler4)) {
                    al.e("sys default last handle start!", new Object[0]);
                    this.f42401e.uncaughtException(thread, th2);
                    al.e("sys default last handle end!", new Object[0]);
                } else if (this.f42402f != null) {
                    al.e("system handle start!", new Object[0]);
                    this.f42402f.uncaughtException(thread, th2);
                    al.e("system handle end!", new Object[0]);
                } else {
                    al.e("crashreport last handle start!", new Object[0]);
                    c();
                    al.e("crashreport last handle end!", new Object[0]);
                }
            }
        } catch (Throwable th3) {
            try {
                if (!al.a(th3)) {
                    th3.printStackTrace();
                }
                if (z11) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = this.f42401e;
                    if (uncaughtExceptionHandler5 != null && a(uncaughtExceptionHandler5)) {
                        al.e("sys default last handle start!", new Object[0]);
                        this.f42401e.uncaughtException(thread, th2);
                        al.e("sys default last handle end!", new Object[0]);
                    } else if (this.f42402f != null) {
                        al.e("system handle start!", new Object[0]);
                        this.f42402f.uncaughtException(thread, th2);
                        al.e("system handle end!", new Object[0]);
                    } else {
                        al.e("crashreport last handle start!", new Object[0]);
                        c();
                        al.e("crashreport last handle end!", new Object[0]);
                    }
                }
            } catch (Throwable th4) {
                if (z11) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = this.f42401e;
                    if (uncaughtExceptionHandler6 != null && a(uncaughtExceptionHandler6)) {
                        al.e("sys default last handle start!", new Object[0]);
                        this.f42401e.uncaughtException(thread, th2);
                        al.e("sys default last handle end!", new Object[0]);
                    } else if (this.f42402f != null) {
                        al.e("system handle start!", new Object[0]);
                        this.f42402f.uncaughtException(thread, th2);
                        al.e("system handle end!", new Object[0]);
                    } else {
                        al.e("crashreport last handle start!", new Object[0]);
                        c();
                        al.e("crashreport last handle end!", new Object[0]);
                    }
                }
                throw th4;
            }
        }
    }

    private static boolean a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        if (uncaughtExceptionHandler == null) {
            return true;
        }
        String name = uncaughtExceptionHandler.getClass().getName();
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            if (name.equals(className) && "uncaughtException".equals(methodName)) {
                return false;
            }
        }
        return true;
    }

    public final synchronized void a(StrategyBean strategyBean) {
        if (strategyBean != null) {
            boolean z11 = strategyBean.f42084f;
            if (z11 != this.f42403g) {
                al.a("java changed to %b", Boolean.valueOf(z11));
                if (strategyBean.f42084f) {
                    a();
                    return;
                }
                b();
            }
        }
    }

    private static String a(Throwable th2, int i11) {
        if (th2 == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        try {
            if (th2.getStackTrace() != null) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    if (i11 > 0 && sb2.length() >= i11) {
                        sb2.append("\n[Stack over limit size :" + i11 + " , has been cutted !]");
                        return sb2.toString();
                    }
                    sb2.append(stackTraceElement.toString());
                    sb2.append("\n");
                }
            }
        } catch (Throwable th3) {
            al.e("gen stack error %s", th3.toString());
        }
        return sb2.toString();
    }

    private static String a(Throwable th2) {
        String message = th2.getMessage();
        if (message == null) {
            return "";
        }
        if (message.length() <= 1000) {
            return message;
        }
        return message.substring(0, 1000) + "\n[Message over limit size:1000, has been cutted!]";
    }
}
