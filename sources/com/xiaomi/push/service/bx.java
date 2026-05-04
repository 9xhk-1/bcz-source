package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
public final class bx implements ar {

    /* renamed from: a, reason: collision with root package name */
    private static volatile bx f46343a;

    /* renamed from: a, reason: collision with other field name */
    private long f987a;

    /* renamed from: a, reason: collision with other field name */
    Context f988a;

    /* renamed from: a, reason: collision with other field name */
    private SharedPreferences f989a;

    /* renamed from: a, reason: collision with other field name */
    private volatile boolean f991a = false;

    /* renamed from: a, reason: collision with other field name */
    private ConcurrentHashMap<String, a> f990a = new ConcurrentHashMap<>();

    public static abstract class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        long f46344a;

        /* renamed from: a, reason: collision with other field name */
        String f992a;

        public a(String str, long j11) {
            this.f992a = str;
            this.f46344a = j11;
        }

        public abstract void a(bx bxVar);

        @Override // java.lang.Runnable
        public void run() {
            if (bx.f46343a != null) {
                Context context = bx.f46343a.f988a;
                if (com.xiaomi.push.bi.d(context)) {
                    if (System.currentTimeMillis() - bx.f46343a.f989a.getLong(":ts-" + this.f992a, 0L) > this.f46344a || com.xiaomi.push.ag.a(context)) {
                        com.xiaomi.push.q.a(bx.f46343a.f989a.edit().putLong(":ts-" + this.f992a, System.currentTimeMillis()));
                        a(bx.f46343a);
                    }
                }
            }
        }
    }

    private bx(Context context) {
        this.f988a = context.getApplicationContext();
        this.f989a = context.getSharedPreferences("sync", 0);
    }

    public static bx a(Context context) {
        if (f46343a == null) {
            synchronized (bx.class) {
                try {
                    if (f46343a == null) {
                        f46343a = new bx(context);
                    }
                } finally {
                }
            }
        }
        return f46343a;
    }

    public String a(String str, String str2) {
        return this.f989a.getString(str + ":" + str2, "");
    }

    @Override // com.xiaomi.push.service.ar
    /* renamed from: a, reason: collision with other method in class */
    public void mo6272a() {
        if (this.f991a) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f987a < 3600000) {
            return;
        }
        this.f987a = currentTimeMillis;
        this.f991a = true;
        com.xiaomi.push.aj.a(this.f988a).a(new by(this), (int) (Math.random() * 10.0d));
    }

    public void a(a aVar) {
        if (this.f990a.putIfAbsent(aVar.f992a, aVar) == null) {
            com.xiaomi.push.aj.a(this.f988a).a(aVar, ((int) (Math.random() * 30.0d)) + 10);
        }
    }

    public void a(String str, String str2, String str3) {
        com.xiaomi.push.q.a(f46343a.f989a.edit().putString(str + ":" + str2, str3));
    }
}
