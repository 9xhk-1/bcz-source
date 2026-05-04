package io.openinstall.sdk;

import android.util.Pair;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes8.dex */
public class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LinkedBlockingQueue f62606a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f62607b;

    public f(e eVar, LinkedBlockingQueue linkedBlockingQueue) {
        this.f62607b = eVar;
        this.f62606a = linkedBlockingQueue;
    }

    @Override // java.lang.Runnable
    public void run() {
        tz.o j11 = this.f62607b.f91250i.j(true);
        if (j11 != null && j11.k(2)) {
            this.f62606a.offer(Pair.create("pbH", j11.f()));
        } else if (j11 == null || !j11.k(1)) {
            this.f62606a.offer(Pair.create("pbT", null));
        } else {
            this.f62606a.offer(Pair.create("pbT", j11.a()));
        }
    }
}
