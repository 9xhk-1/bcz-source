package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public class aj {

    /* renamed from: a, reason: collision with root package name */
    private static volatile aj f45249a;

    /* renamed from: a, reason: collision with other field name */
    private SharedPreferences f127a;

    /* renamed from: a, reason: collision with other field name */
    private ScheduledThreadPoolExecutor f130a = new ScheduledThreadPoolExecutor(1);

    /* renamed from: a, reason: collision with other field name */
    private Map<String, ScheduledFuture> f129a = new HashMap();

    /* renamed from: a, reason: collision with other field name */
    private Object f128a = new Object();

    public static abstract class a implements Runnable {
        /* renamed from: a */
        public abstract String mo5759a();
    }

    private aj(Context context) {
        this.f127a = context.getSharedPreferences("mipush_extra", 0);
    }

    public boolean b(a aVar, int i11) {
        if (aVar == null || a(aVar) != null) {
            return false;
        }
        ScheduledFuture<?> schedule = this.f130a.schedule(new al(this, aVar), i11, TimeUnit.SECONDS);
        synchronized (this.f128a) {
            this.f129a.put(aVar.mo5759a(), schedule);
        }
        return true;
    }

    public static aj a(Context context) {
        if (f45249a == null) {
            synchronized (aj.class) {
                try {
                    if (f45249a == null) {
                        f45249a = new aj(context);
                    }
                } finally {
                }
            }
        }
        return f45249a;
    }

    private static String a(String str) {
        return "last_job_time" + str;
    }

    private ScheduledFuture a(a aVar) {
        ScheduledFuture scheduledFuture;
        synchronized (this.f128a) {
            scheduledFuture = this.f129a.get(aVar.mo5759a());
        }
        return scheduledFuture;
    }

    public void a(Runnable runnable) {
        a(runnable, 0);
    }

    public void a(Runnable runnable, int i11) {
        this.f130a.schedule(runnable, i11, TimeUnit.SECONDS);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m5718a(a aVar) {
        return b(aVar, 0);
    }

    public boolean a(a aVar, int i11) {
        return a(aVar, i11, 0);
    }

    public boolean a(a aVar, int i11, int i12) {
        return a(aVar, i11, i12, false);
    }

    public boolean a(a aVar, int i11, int i12, boolean z11) {
        if (aVar == null || a(aVar) != null) {
            return false;
        }
        String a11 = a(aVar.mo5759a());
        ak akVar = new ak(this, aVar, z11, a11);
        if (!z11) {
            long abs = Math.abs(System.currentTimeMillis() - this.f127a.getLong(a11, 0L)) / 1000;
            if (abs < i11 - i12) {
                i12 = (int) (i11 - abs);
            }
        }
        try {
            ScheduledFuture<?> scheduleAtFixedRate = this.f130a.scheduleAtFixedRate(akVar, i12, i11, TimeUnit.SECONDS);
            synchronized (this.f128a) {
                this.f129a.put(aVar.mo5759a(), scheduleAtFixedRate);
            }
            return true;
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.a(e11);
            return true;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m5719a(String str) {
        synchronized (this.f128a) {
            try {
                ScheduledFuture scheduledFuture = this.f129a.get(str);
                if (scheduledFuture == null) {
                    return false;
                }
                this.f129a.remove(str);
                return scheduledFuture.cancel(false);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        a f45250a;

        public b(a aVar) {
            this.f45250a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a();
            this.f45250a.run();
            b();
        }

        public void a() {
        }

        public void b() {
        }
    }
}
