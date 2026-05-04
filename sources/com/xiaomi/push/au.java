package com.xiaomi.push;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* loaded from: classes8.dex */
class au implements at, InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    private static final String[][] f45262a = {new String[]{"com.bun.supplier.IIdentifierListener", "com.bun.supplier.IdSupplier"}, new String[]{"com.bun.miitmdid.core.IIdentifierListener", "com.bun.miitmdid.supplier.IdSupplier"}};

    /* renamed from: a, reason: collision with other field name */
    private Context f148a;

    /* renamed from: a, reason: collision with other field name */
    private Class f150a = null;

    /* renamed from: b, reason: collision with root package name */
    private Class f45263b = null;

    /* renamed from: a, reason: collision with other field name */
    private Method f152a = null;

    /* renamed from: b, reason: collision with other field name */
    private Method f153b = null;

    /* renamed from: c, reason: collision with root package name */
    private Method f45264c = null;

    /* renamed from: d, reason: collision with root package name */
    private Method f45265d = null;

    /* renamed from: e, reason: collision with root package name */
    private Method f45266e = null;

    /* renamed from: f, reason: collision with root package name */
    private Method f45267f = null;

    /* renamed from: g, reason: collision with root package name */
    private Method f45268g = null;

    /* renamed from: a, reason: collision with other field name */
    private final Object f151a = new Object();

    /* renamed from: a, reason: collision with other field name */
    private volatile int f146a = 0;

    /* renamed from: a, reason: collision with other field name */
    private volatile long f147a = 0;

    /* renamed from: a, reason: collision with other field name */
    private volatile a f149a = null;

    public class a {

        /* renamed from: a, reason: collision with other field name */
        Boolean f154a;

        /* renamed from: a, reason: collision with other field name */
        String f155a;

        /* renamed from: b, reason: collision with root package name */
        String f45270b;

        /* renamed from: c, reason: collision with root package name */
        String f45271c;

        /* renamed from: d, reason: collision with root package name */
        String f45272d;

        private a() {
            this.f154a = null;
            this.f155a = null;
            this.f45270b = null;
            this.f45271c = null;
            this.f45272d = null;
        }

        public boolean a() {
            if (!TextUtils.isEmpty(this.f155a) || !TextUtils.isEmpty(this.f45270b) || !TextUtils.isEmpty(this.f45271c) || !TextUtils.isEmpty(this.f45272d)) {
                this.f154a = Boolean.TRUE;
            }
            return this.f154a != null;
        }
    }

    public au(Context context) {
        this.f148a = context.getApplicationContext();
        a(context);
        b(context);
    }

    private static Class<?> a(Context context, String str) {
        try {
            return s.a(context, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private void b(Context context) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = -elapsedRealtime;
        Class cls = this.f45263b;
        if (cls != null) {
            try {
                ClassLoader classLoader = cls.getClassLoader();
                if (classLoader == null) {
                    classLoader = context.getClassLoader();
                }
                a(this.f152a, this.f150a.newInstance(), context, Proxy.newProxyInstance(classLoader, new Class[]{this.f45263b}, this));
            } catch (Throwable th2) {
                b("call init sdk error:" + th2);
            }
            this.f147a = elapsedRealtime;
        }
        elapsedRealtime = j11;
        this.f147a = elapsedRealtime;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        this.f147a = SystemClock.elapsedRealtime();
        if (objArr != null) {
            a aVar = new a();
            int length = objArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                Object obj2 = objArr[i11];
                if (obj2 != null && !a(obj2)) {
                    aVar.f45270b = (String) a(this.f45264c, obj2, new Object[0]);
                    aVar.f154a = (Boolean) a(this.f45267f, obj2, new Object[0]);
                    a(this.f45268g, obj2, new Object[0]);
                    if (aVar.a()) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("has get succ, check duplicate:");
                        sb2.append(this.f149a != null);
                        b(sb2.toString());
                        synchronized (au.class) {
                            try {
                                if (this.f149a == null) {
                                    this.f149a = aVar;
                                }
                            } finally {
                            }
                        }
                    }
                }
                i11++;
            }
        }
        a();
        return null;
    }

    private static <T> T a(Method method, Object obj, Object... objArr) {
        if (method == null) {
            return null;
        }
        try {
            T t11 = (T) method.invoke(obj, objArr);
            if (t11 != null) {
                return t11;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void b(String str) {
        com.xiaomi.channel.commonutils.logger.b.m5639a("mdid:" + str);
    }

    @Override // com.xiaomi.push.at
    /* renamed from: a */
    public String mo5724a() {
        a("getOAID");
        if (this.f149a == null) {
            return null;
        }
        return this.f149a.f45270b;
    }

    private static Method a(Class<?> cls, String str, Class<?>... clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            return cls.getMethod(str, clsArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    private void a() {
        synchronized (this.f151a) {
            try {
                this.f151a.notifyAll();
            } catch (Exception unused) {
            }
        }
    }

    private void a(Context context) {
        Class<?> a11 = a(context, "com.bun.miitmdid.core.MdidSdk");
        Class<?> cls = null;
        Class<?> cls2 = null;
        int i11 = 0;
        while (true) {
            String[][] strArr = f45262a;
            if (i11 >= strArr.length) {
                break;
            }
            String[] strArr2 = strArr[i11];
            Class<?> a12 = a(context, strArr2[0]);
            Class<?> a13 = a(context, strArr2[1]);
            if (a12 != null && a13 != null) {
                b("found class in index " + i11);
                cls2 = a13;
                cls = a12;
                break;
            }
            i11++;
            cls2 = a13;
            cls = a12;
        }
        this.f150a = a11;
        this.f152a = a(a11, "InitSdk", (Class<?>[]) new Class[]{Context.class, cls});
        this.f45263b = cls;
        this.f45264c = a(cls2, "getOAID", (Class<?>[]) new Class[0]);
        this.f45267f = a(cls2, "isSupported", (Class<?>[]) new Class[0]);
        this.f45268g = a(cls2, "shutDown", (Class<?>[]) new Class[0]);
    }

    private void a(String str) {
        if (this.f149a != null) {
            return;
        }
        long j11 = this.f147a;
        long elapsedRealtime = SystemClock.elapsedRealtime() - Math.abs(j11);
        int i11 = this.f146a;
        if (elapsedRealtime > 3000 && i11 < 3) {
            synchronized (this.f151a) {
                try {
                    if (this.f147a == j11 && this.f146a == i11) {
                        b("retry, current count is " + i11);
                        this.f146a = this.f146a + 1;
                        b(this.f148a);
                        j11 = this.f147a;
                        elapsedRealtime = SystemClock.elapsedRealtime() - Math.abs(j11);
                    }
                } finally {
                }
            }
        }
        if (this.f149a != null || j11 < 0 || elapsedRealtime > 3000 || Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        synchronized (this.f151a) {
            if (this.f149a == null) {
                try {
                    b(str + " wait...");
                    this.f151a.wait(3000L);
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // com.xiaomi.push.at
    /* renamed from: a */
    public boolean mo5725a() {
        a("isSupported");
        return this.f149a != null && Boolean.TRUE.equals(this.f149a.f154a);
    }

    private static boolean a(Object obj) {
        return (obj instanceof Boolean) || (obj instanceof Character) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Double);
    }
}
