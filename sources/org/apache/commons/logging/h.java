package org.apache.commons.logging;

import java.lang.reflect.Constructor;
import java.util.Hashtable;
import org.apache.commons.logging.impl.NoOpLog;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class h {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f77673b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f77674c;

    /* renamed from: a, reason: collision with root package name */
    public static Hashtable f77672a = new Hashtable();

    /* renamed from: d, reason: collision with root package name */
    public static Constructor f77675d = null;

    static {
        f77673b = false;
        f77674c = false;
        String str = null;
        try {
            Class.forName("org.apache.log4j.Logger");
            f77673b = true;
        } catch (Throwable unused) {
            f77673b = false;
        }
        try {
            Class.forName("java.util.logging.Logger");
            Class.forName(org.apache.commons.logging.impl.e.C);
            f77674c = true;
        } catch (Throwable unused2) {
            f77674c = false;
        }
        try {
            str = System.getProperty(org.apache.commons.logging.impl.e.I);
            if (str == null) {
                str = System.getProperty(org.apache.commons.logging.impl.e.H);
            }
        } catch (Throwable unused3) {
        }
        try {
            if (str != null) {
                try {
                    f(str);
                } catch (Throwable unused4) {
                    f("org.apache.commons.logging.impl.NoOpLog");
                }
            }
            try {
                if (f77673b) {
                    f(org.apache.commons.logging.impl.e.B);
                } else if (f77674c) {
                    f(org.apache.commons.logging.impl.e.C);
                } else {
                    f("org.apache.commons.logging.impl.NoOpLog");
                }
            } catch (Throwable unused5) {
                f("org.apache.commons.logging.impl.NoOpLog");
            }
        } catch (Throwable unused6) {
        }
    }

    public static Log a(Class cls) {
        return b(cls.getName());
    }

    public static Log b(String str) {
        Log log = (Log) f77672a.get(str);
        if (log != null) {
            return log;
        }
        Log d11 = d(str);
        f77672a.put(str, d11);
        return d11;
    }

    public static String[] c() {
        return (String[]) f77672a.keySet().toArray(new String[f77672a.size()]);
    }

    public static Log d(String str) {
        Log log;
        try {
            log = (Log) f77675d.newInstance(str);
        } catch (Throwable unused) {
            log = null;
        }
        return log == null ? new NoOpLog(str) : log;
    }

    public static void e(Class cls) throws LinkageError, ExceptionInInitializerError, NoSuchMethodException, SecurityException {
        f77675d = cls.getConstructor("".getClass());
    }

    public static void f(String str) throws LinkageError, NoSuchMethodException, SecurityException, ClassNotFoundException {
        try {
            f77675d = Class.forName(str).getConstructor("".getClass());
        } catch (Throwable unused) {
            f77675d = null;
        }
    }
}
