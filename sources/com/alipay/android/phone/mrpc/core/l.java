package com.alipay.android.phone.mrpc.core;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class l implements ab {

    /* renamed from: b, reason: collision with root package name */
    public static l f10290b;

    /* renamed from: i, reason: collision with root package name */
    public static final ThreadFactory f10291i = new n();

    /* renamed from: a, reason: collision with root package name */
    public Context f10292a;

    /* renamed from: c, reason: collision with root package name */
    public ThreadPoolExecutor f10293c;

    /* renamed from: d, reason: collision with root package name */
    public b f10294d = b.a("android");

    /* renamed from: e, reason: collision with root package name */
    public long f10295e;

    /* renamed from: f, reason: collision with root package name */
    public long f10296f;

    /* renamed from: g, reason: collision with root package name */
    public long f10297g;

    /* renamed from: h, reason: collision with root package name */
    public int f10298h;

    public l(Context context) {
        this.f10292a = context;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 11, 3L, TimeUnit.SECONDS, new ArrayBlockingQueue(20), f10291i, new ThreadPoolExecutor.CallerRunsPolicy());
        this.f10293c = threadPoolExecutor;
        try {
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        } catch (Exception unused) {
        }
        CookieSyncManager.createInstance(this.f10292a);
        CookieManager.getInstance().setAcceptCookie(true);
    }

    public static final synchronized l b(Context context) {
        synchronized (l.class) {
            l lVar = f10290b;
            if (lVar != null) {
                return lVar;
            }
            l lVar2 = new l(context);
            f10290b = lVar2;
            return lVar2;
        }
    }

    public final b a() {
        return this.f10294d;
    }

    public final void c(long j11) {
        this.f10297g += j11;
    }

    public static final l a(Context context) {
        l lVar = f10290b;
        return lVar != null ? lVar : b(context);
    }

    public final void b(long j11) {
        this.f10296f += j11;
        this.f10298h++;
    }

    @Override // com.alipay.android.phone.mrpc.core.ab
    public final Future<u> a(t tVar) {
        if (s.a(this.f10292a)) {
            String str = sb.b.f88202b + hashCode() + ": Active Task = %d, Completed Task = %d, All Task = %d,Avarage Speed = %d KB/S, Connetct Time = %d ms, All data size = %d bytes, All enqueueConnect time = %d ms, All socket time = %d ms, All request times = %d times";
            Integer valueOf = Integer.valueOf(this.f10293c.getActiveCount());
            Long valueOf2 = Long.valueOf(this.f10293c.getCompletedTaskCount());
            Long valueOf3 = Long.valueOf(this.f10293c.getTaskCount());
            long j11 = this.f10297g;
            Long valueOf4 = Long.valueOf(j11 == 0 ? 0L : ((this.f10295e * 1000) / j11) >> 10);
            int i11 = this.f10298h;
            String.format(str, valueOf, valueOf2, valueOf3, valueOf4, Long.valueOf(i11 != 0 ? this.f10296f / i11 : 0L), Long.valueOf(this.f10295e), Long.valueOf(this.f10296f), Long.valueOf(this.f10297g), Integer.valueOf(this.f10298h));
        }
        q qVar = new q(this, (o) tVar);
        m mVar = new m(this, qVar, qVar);
        this.f10293c.execute(mVar);
        return mVar;
    }

    public final void a(long j11) {
        this.f10295e += j11;
    }
}
