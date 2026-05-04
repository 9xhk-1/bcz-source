package com.huawei.hms.stats;

import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtils;
import com.huawei.hms.support.log.HMSLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: f, reason: collision with root package name */
    private static final a f36242f = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Object f36243a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private boolean f36244b = false;

    /* renamed from: c, reason: collision with root package name */
    private final List<Runnable> f36245c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final Handler f36246d = new Handler(Looper.getMainLooper());

    /* renamed from: e, reason: collision with root package name */
    private final Runnable f36247e = new RunnableC0447a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.huawei.hms.stats.a$a, reason: collision with other inner class name */
    public class RunnableC0447a implements Runnable {
        public RunnableC0447a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HMSLog.i("AnalyticsCacheManager", "Timeout execCacheBi.");
            if (HiAnalyticsUtils.getInstance().getInitFlag()) {
                a.this.b();
            } else {
                a.this.a();
            }
        }
    }

    private a() {
    }

    public static a c() {
        return f36242f;
    }

    public void a(Runnable runnable) {
        synchronized (this.f36243a) {
            try {
                if (runnable == null) {
                    return;
                }
                if (this.f36244b) {
                    return;
                }
                if (this.f36245c.size() >= 60) {
                    return;
                }
                this.f36245c.add(runnable);
                this.f36246d.removeCallbacks(this.f36247e);
                this.f36246d.postDelayed(this.f36247e, 10000L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b() {
        synchronized (this.f36243a) {
            HMSLog.i("AnalyticsCacheManager", "execCacheBi: cache size: " + this.f36245c.size());
            this.f36244b = true;
            try {
                Iterator<Runnable> it = this.f36245c.iterator();
                while (it.hasNext()) {
                    it.next().run();
                    it.remove();
                }
            } catch (Throwable th2) {
                HMSLog.e("AnalyticsCacheManager", "<execCacheBi> failed. " + th2.getMessage());
                a();
            }
            this.f36244b = false;
        }
    }

    public void a() {
        synchronized (this.f36243a) {
            HMSLog.i("AnalyticsCacheManager", "clear AnalyticsCache.");
            this.f36245c.clear();
        }
    }
}
