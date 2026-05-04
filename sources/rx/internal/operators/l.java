package rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import rx.b;
import rx.internal.subscriptions.SequentialSubscription;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class l implements b.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final rx.b[] f85680a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends AtomicInteger implements qb0.b {
        private static final long serialVersionUID = -7965400327305809232L;

        /* renamed from: a, reason: collision with root package name */
        public final qb0.b f85681a;

        /* renamed from: b, reason: collision with root package name */
        public final rx.b[] f85682b;

        /* renamed from: c, reason: collision with root package name */
        public int f85683c;

        /* renamed from: d, reason: collision with root package name */
        public final SequentialSubscription f85684d = new SequentialSubscription();

        public a(qb0.b bVar, rx.b[] bVarArr) {
            this.f85681a = bVar;
            this.f85682b = bVarArr;
        }

        @Override // qb0.b
        public void a(qb0.h hVar) {
            this.f85684d.replace(hVar);
        }

        public void b() {
            if (!this.f85684d.isUnsubscribed() && getAndIncrement() == 0) {
                rx.b[] bVarArr = this.f85682b;
                while (!this.f85684d.isUnsubscribed()) {
                    int i11 = this.f85683c;
                    this.f85683c = i11 + 1;
                    if (i11 == bVarArr.length) {
                        this.f85681a.onCompleted();
                        return;
                    } else {
                        bVarArr[i11].G0(this);
                        if (decrementAndGet() == 0) {
                            return;
                        }
                    }
                }
            }
        }

        @Override // qb0.b
        public void onCompleted() {
            b();
        }

        @Override // qb0.b
        public void onError(Throwable th2) {
            this.f85681a.onError(th2);
        }
    }

    public l(rx.b[] bVarArr) {
        this.f85680a = bVarArr;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.b bVar) {
        a aVar = new a(bVar, this.f85680a);
        bVar.a(aVar.f85684d);
        aVar.b();
    }
}
