package qb;

import android.util.Log;
import java.io.File;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f82028a = "crash.txt";

    /* renamed from: b, reason: collision with root package name */
    public static final String f82029b = "xlog";

    /* renamed from: c, reason: collision with root package name */
    public static String f82030c;

    /* renamed from: d, reason: collision with root package name */
    public static b f82031d = new f();

    public static void a(String tag, String msg, Throwable t11) {
        f82031d.d(tag, "%s", msg + " " + Log.getStackTraceString(t11));
    }

    public static void b(String tag, String fmt, Object... args) {
        if (args == null || args.length == 0) {
            args = null;
        }
        f82031d.d(tag, fmt, args);
    }

    public static void c(String tag, String msg, Throwable t11) {
        f82031d.e(tag, "%s", msg + " " + Log.getStackTraceString(t11));
    }

    public static void d(String tag, String fmt, Object... args) {
        if (args == null || args.length == 0) {
            args = null;
        }
        f82031d.e(tag, fmt, args);
    }

    public static void e() {
        f82031d.flush();
    }

    public static String f() {
        return f82030c + File.separator + f82029b;
    }

    public static String g() {
        return f82030c + File.separator + f82028a;
    }

    public static void h(String tag, String msg, Throwable t11) {
        f82031d.a(tag, "%s", msg + " " + Log.getStackTraceString(t11));
    }

    public static void i(String tag, String fmt, Object... args) {
        if (args == null || args.length == 0) {
            args = null;
        }
        f82031d.a(tag, fmt, args);
    }

    public static void j(String logPath, String cachePath, String logName) {
        f82030c = logPath;
        f82031d.c(logPath + File.separator + f82029b, cachePath, logName);
    }

    public static void k(b log) {
        if (log != null) {
            f82031d = log;
        }
    }

    public static void l(int androidLogLevel) {
        f82031d.b(androidLogLevel);
    }

    public static void m(Throwable t11) {
        if (f82030c != null) {
            e.a(f82030c + File.separator + f82028a, t11);
        }
        f82031d.flush();
    }

    public static void n(String tag, String msg, Throwable t11) {
        f82031d.g(tag, "%s", msg + " " + Log.getStackTraceString(t11));
    }

    public static void o(String tag, String fmt, Object... args) {
        if (args == null || args.length == 0) {
            args = null;
        }
        f82031d.g(tag, fmt, args);
    }

    public static void p(String tag, String msg, Throwable t11) {
        f82031d.f(tag, "%s", msg + " " + Log.getStackTraceString(t11));
    }

    public static void q(String tag, String fmt, Object... args) {
        if (args == null || args.length == 0) {
            args = null;
        }
        f82031d.f(tag, fmt, args);
    }
}
