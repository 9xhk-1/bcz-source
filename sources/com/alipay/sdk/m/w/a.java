package com.alipay.sdk.m.w;

import android.content.Context;
import android.os.SystemClock;
import android.util.Pair;
import com.alipay.sdk.m.u.e;
import com.alipay.sdk.m.u.n;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f11127a = "CDT";

    /* renamed from: b, reason: collision with root package name */
    public static final int f11128b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f11129c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f11130d = 3;

    /* renamed from: e, reason: collision with root package name */
    public static final int f11131e = 4;

    /* renamed from: f, reason: collision with root package name */
    public static final int f11132f = 5;

    /* renamed from: g, reason: collision with root package name */
    public static ConcurrentHashMap<Integer, Pair<Long, ?>> f11133g;

    /* renamed from: h, reason: collision with root package name */
    public static ExecutorService f11134h = Executors.newFixedThreadPool(16);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.alipay.sdk.m.w.a$a, reason: collision with other inner class name */
    public interface InterfaceC0177a<T, R> {
        R a(T t11);
    }

    public static synchronized void a(int i11, Object obj) {
        synchronized (a.class) {
            try {
                if (f11133g == null) {
                    f11133g = new ConcurrentHashMap<>();
                }
                f11133g.put(Integer.valueOf(i11), new Pair<>(Long.valueOf(SystemClock.elapsedRealtime()), obj));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Pair<Boolean, ?> a(int i11, TimeUnit timeUnit, long j11) {
        ConcurrentHashMap<Integer, Pair<Long, ?>> concurrentHashMap = f11133g;
        if (concurrentHashMap == null) {
            return new Pair<>(Boolean.FALSE, null);
        }
        Pair<Long, ?> pair = concurrentHashMap.get(Integer.valueOf(i11));
        if (pair == null) {
            return new Pair<>(Boolean.FALSE, null);
        }
        Long l11 = (Long) pair.first;
        Object obj = pair.second;
        if (l11 != null && SystemClock.elapsedRealtime() - l11.longValue() <= TimeUnit.MILLISECONDS.convert(j11, timeUnit)) {
            return new Pair<>(Boolean.TRUE, obj);
        }
        return new Pair<>(Boolean.FALSE, null);
    }

    public static synchronized void a() {
        synchronized (a.class) {
            f11133g = null;
        }
    }

    public static Context a(Context context) {
        if (context == null) {
            return null;
        }
        return context.getApplicationContext();
    }

    public static <T> T a(int i11, long j11, TimeUnit timeUnit, InterfaceC0177a<Object, Boolean> interfaceC0177a, Callable<T> callable, boolean z11, long j12, TimeUnit timeUnit2, com.alipay.sdk.m.s.a aVar, boolean z12) {
        T call;
        try {
            Pair<Boolean, ?> a11 = a(i11, timeUnit, j11);
            if (((Boolean) a11.first).booleanValue() && interfaceC0177a.a(a11.second).booleanValue()) {
                e.d("getC", i11 + " got " + a11.second);
                return (T) a11.second;
            }
            if (z12 && n.h()) {
                com.alipay.sdk.m.k.a.b(aVar, com.alipay.sdk.m.k.b.f10653l, "ch_get_main", "" + i11);
                e.d("getC", i11 + " skip");
                call = null;
            } else {
                if (z11) {
                    call = f11134h.submit(callable).get(j12, timeUnit2);
                } else {
                    call = callable.call();
                }
                a(i11, call);
            }
            e.d("getC", i11 + " new " + call);
            return call;
        } catch (Throwable th2) {
            e.a(f11127a, "ch_get_e|" + i11, th2);
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.f10653l, "ch_get_e|" + i11, th2);
            e.d("getC", i11 + " err");
            return null;
        }
    }
}
