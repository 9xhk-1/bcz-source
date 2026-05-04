package com.xiaomi.channel.commonutils.logger;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import com.xiaomi.push.j;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static int f45144a = 2;

    /* renamed from: a, reason: collision with other field name */
    private static Context f40a = null;

    /* renamed from: a, reason: collision with other field name */
    private static boolean f46a = false;

    /* renamed from: b, reason: collision with other field name */
    private static boolean f47b = false;

    /* renamed from: a, reason: collision with other field name */
    private static String f43a = "XMPush-" + Process.myPid();

    /* renamed from: a, reason: collision with other field name */
    private static LoggerInterface f41a = new a();

    /* renamed from: a, reason: collision with other field name */
    private static final HashMap<Integer, Long> f44a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private static final HashMap<Integer, String> f45145b = new HashMap<>();

    /* renamed from: a, reason: collision with other field name */
    private static final Integer f42a = -1;

    /* renamed from: a, reason: collision with other field name */
    private static AtomicInteger f45a = new AtomicInteger(1);

    public static class a implements LoggerInterface {

        /* renamed from: a, reason: collision with root package name */
        private String f45146a = b.f43a;

        @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
        public void log(String str) {
            Log.v(this.f45146a, str);
        }

        @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
        public void setTag(String str) {
            this.f45146a = str;
        }

        @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
        public void log(String str, Throwable th2) {
            Log.v(this.f45146a, str, th2);
        }
    }

    public static int a() {
        return f45144a;
    }

    private static String b() {
        return "[Tid:" + Thread.currentThread().getId() + "] ";
    }

    public static void c(String str) {
        a(1, m5638a(str));
    }

    public static void d(String str) {
        a(4, m5638a(str));
    }

    public static void e(String str) {
        if (f46a) {
            m5639a(str);
            return;
        }
        Log.w(f43a, m5638a(str));
        if (f47b) {
            return;
        }
        m5639a(str);
    }

    public static Integer a(String str) {
        if (f45144a > 1) {
            return f42a;
        }
        Integer valueOf = Integer.valueOf(f45a.incrementAndGet());
        f44a.put(valueOf, Long.valueOf(System.currentTimeMillis()));
        f45145b.put(valueOf, str);
        f41a.log(str + " starts");
        return valueOf;
    }

    private static String b(String str, String str2) {
        return b() + a(str, str2);
    }

    public static void b(String str) {
        a(0, m5638a(str));
    }

    /* renamed from: a, reason: collision with other method in class */
    private static String m5638a(String str) {
        return b() + str;
    }

    public static String a(String str, String str2) {
        return "[" + str + "] " + str2;
    }

    public static void a(int i11) {
        if (i11 < 0 || i11 > 5) {
            a(2, "set log level as " + i11);
        }
        f45144a = i11;
    }

    public static void a(int i11, String str) {
        if (i11 >= f45144a) {
            f41a.log(str);
        }
    }

    public static void a(int i11, String str, Throwable th2) {
        if (i11 >= f45144a) {
            f41a.log(str, th2);
        }
    }

    public static void a(int i11, Throwable th2) {
        if (i11 >= f45144a) {
            f41a.log("", th2);
        }
    }

    public static void a(Context context) {
        f40a = context;
        if (j.m6172a(context)) {
            f46a = true;
        }
        if (j.m6171a()) {
            f47b = true;
        }
    }

    public static void a(LoggerInterface loggerInterface) {
        f41a = loggerInterface;
    }

    public static void a(Integer num) {
        if (f45144a <= 1) {
            HashMap<Integer, Long> hashMap = f44a;
            if (hashMap.containsKey(num)) {
                long longValue = hashMap.remove(num).longValue();
                String remove = f45145b.remove(num);
                long currentTimeMillis = System.currentTimeMillis() - longValue;
                f41a.log(remove + " ends in " + currentTimeMillis + " ms");
            }
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m5639a(String str) {
        a(2, m5638a(str));
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m5640a(String str, String str2) {
        a(2, b(str, str2));
    }

    public static void a(String str, Throwable th2) {
        a(4, m5638a(str), th2);
    }

    public static void a(Throwable th2) {
        a(4, th2);
    }
}
