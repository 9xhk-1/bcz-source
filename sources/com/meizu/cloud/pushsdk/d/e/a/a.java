package com.meizu.cloud.pushsdk.d.e.a;

import com.meizu.cloud.pushsdk.d.b.a.b;
import com.meizu.cloud.pushsdk.d.e.a;
import com.meizu.cloud.pushsdk.d.f.c;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes7.dex */
public class a extends com.meizu.cloud.pushsdk.d.e.a {

    /* renamed from: n, reason: collision with root package name */
    private static final String f39806n = "a";

    /* renamed from: o, reason: collision with root package name */
    private static ScheduledExecutorService f39807o;

    public a(a.C0479a c0479a) {
        super(c0479a);
        b.a(this.f39790k);
        c();
    }

    @Override // com.meizu.cloud.pushsdk.d.e.a
    public void a(final com.meizu.cloud.pushsdk.d.c.b bVar, final boolean z11) {
        b.a(new Runnable() { // from class: com.meizu.cloud.pushsdk.d.e.a.a.2
            @Override // java.lang.Runnable
            public void run() {
                a.super.a(bVar, z11);
            }
        });
    }

    public void c() {
        if (f39807o == null && this.f39788i) {
            c.b(f39806n, "Session checking has been resumed.", new Object[0]);
            final com.meizu.cloud.pushsdk.d.e.b bVar = this.f39783d;
            ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
            f39807o = newSingleThreadScheduledExecutor;
            Runnable runnable = new Runnable() { // from class: com.meizu.cloud.pushsdk.d.e.a.a.1
                @Override // java.lang.Runnable
                public void run() {
                    bVar.b();
                }
            };
            long j11 = this.f39789j;
            newSingleThreadScheduledExecutor.scheduleAtFixedRate(runnable, j11, j11, this.f39791l);
        }
    }
}
