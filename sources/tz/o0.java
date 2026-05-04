package tz;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public class o0 {

    /* renamed from: a, reason: collision with root package name */
    public volatile p0 f91339a = null;

    /* renamed from: b, reason: collision with root package name */
    public final CountDownLatch f91340b = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    public final LinkedBlockingQueue f91341c = new LinkedBlockingQueue(1);

    /* renamed from: d, reason: collision with root package name */
    public final Object f91342d = new Object();

    public Object a(long j11) throws InterruptedException {
        return this.f91341c.poll(j11, TimeUnit.SECONDS);
    }

    public void b(String str, long j11) {
        if (this.f91339a == null || this.f91339a == p0.f91349c || this.f91339a == p0.f91350d) {
            this.f91341c.offer(this.f91342d);
            try {
                this.f91340b.await(j11, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                if (j0.f91313a) {
                    j0.b("%s awaitInit timeout %d ms", str, Long.valueOf(j11));
                }
            }
        }
    }

    public synchronized void c(p0 p0Var) {
        this.f91339a = p0Var;
    }

    public boolean d() {
        return this.f91339a == p0.f91352f;
    }

    public boolean e() {
        return this.f91339a == p0.f91353g || this.f91339a == p0.f91352f;
    }

    public synchronized p0 f() {
        return this.f91339a;
    }

    public void g() {
        this.f91340b.countDown();
    }
}
