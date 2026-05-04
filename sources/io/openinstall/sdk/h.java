package io.openinstall.sdk;

import android.util.Pair;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes8.dex */
public class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LinkedBlockingQueue f62613a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f62614b;

    public h(g gVar, LinkedBlockingQueue linkedBlockingQueue) {
        this.f62614b = gVar;
        this.f62613a = linkedBlockingQueue;
    }

    @Override // java.lang.Runnable
    public void run() {
        tz.o e11;
        String str;
        LinkedBlockingQueue linkedBlockingQueue;
        Pair create;
        LinkedBlockingQueue linkedBlockingQueue2;
        String a11;
        e11 = this.f62614b.e(this.f62614b.f91250i.j(true));
        if (!this.f62614b.f91250i.g() || e11 != null) {
            if (e11 == null || !e11.k(2)) {
                str = "pbT";
                if (e11 == null || !e11.k(1)) {
                    linkedBlockingQueue = this.f62613a;
                    create = Pair.create("pbT", null);
                } else {
                    linkedBlockingQueue2 = this.f62613a;
                    a11 = e11.a();
                }
            } else {
                linkedBlockingQueue2 = this.f62613a;
                str = "pbH";
                a11 = e11.f();
            }
            linkedBlockingQueue2.offer(Pair.create(str, a11));
            this.f62614b.f91250i.f(false);
        }
        linkedBlockingQueue = this.f62613a;
        create = Pair.create("pbR", String.valueOf(false));
        linkedBlockingQueue.offer(create);
        this.f62614b.f91250i.f(false);
    }
}
