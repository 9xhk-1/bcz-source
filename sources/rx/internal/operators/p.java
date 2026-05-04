package rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import rx.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class p implements b.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final rx.b[] f85867a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements qb0.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ec0.b f85868a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Queue f85869b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AtomicInteger f85870c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ qb0.b f85871d;

        public a(ec0.b bVar, Queue queue, AtomicInteger atomicInteger, qb0.b bVar2) {
            this.f85868a = bVar;
            this.f85869b = queue;
            this.f85870c = atomicInteger;
            this.f85871d = bVar2;
        }

        @Override // qb0.b
        public void a(qb0.h hVar) {
            this.f85868a.a(hVar);
        }

        public void b() {
            if (this.f85870c.decrementAndGet() == 0) {
                if (this.f85869b.isEmpty()) {
                    this.f85871d.onCompleted();
                } else {
                    this.f85871d.onError(n.b(this.f85869b));
                }
            }
        }

        @Override // qb0.b
        public void onCompleted() {
            b();
        }

        @Override // qb0.b
        public void onError(Throwable th2) {
            this.f85869b.offer(th2);
            b();
        }
    }

    public p(rx.b[] bVarArr) {
        this.f85867a = bVarArr;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.b bVar) {
        qb0.b bVar2;
        ec0.b bVar3 = new ec0.b();
        AtomicInteger atomicInteger = new AtomicInteger(this.f85867a.length + 1);
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        bVar.a(bVar3);
        rx.b[] bVarArr = this.f85867a;
        int length = bVarArr.length;
        int i11 = 0;
        while (i11 < length) {
            rx.b bVar4 = bVarArr[i11];
            if (bVar3.isUnsubscribed()) {
                return;
            }
            if (bVar4 == null) {
                concurrentLinkedQueue.offer(new NullPointerException("A completable source is null"));
                atomicInteger.decrementAndGet();
                bVar2 = bVar;
            } else {
                bVar2 = bVar;
                bVar4.G0(new a(bVar3, concurrentLinkedQueue, atomicInteger, bVar2));
            }
            i11++;
            bVar = bVar2;
        }
        qb0.b bVar5 = bVar;
        if (atomicInteger.decrementAndGet() == 0) {
            if (concurrentLinkedQueue.isEmpty()) {
                bVar5.onCompleted();
            } else {
                bVar5.onError(n.b(concurrentLinkedQueue));
            }
        }
    }
}
