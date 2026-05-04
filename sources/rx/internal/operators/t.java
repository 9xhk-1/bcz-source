package rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class t<T, R> extends qb0.g<T> {

    /* renamed from: e, reason: collision with root package name */
    public static final int f86064e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f86065f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f86066g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final int f86067h = 3;

    /* renamed from: a, reason: collision with root package name */
    public final qb0.g<? super R> f86068a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f86069b;

    /* renamed from: c, reason: collision with root package name */
    public R f86070c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicInteger f86071d = new AtomicInteger();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements qb0.d {

        /* renamed from: a, reason: collision with root package name */
        public final t<?, ?> f86072a;

        public a(t<?, ?> tVar) {
            this.f86072a = tVar;
        }

        @Override // qb0.d
        public void request(long j11) {
            this.f86072a.D(j11);
        }
    }

    public t(qb0.g<? super R> gVar) {
        this.f86068a = gVar;
    }

    public final void C(R r11) {
        qb0.g<? super R> gVar = this.f86068a;
        do {
            int i11 = this.f86071d.get();
            if (i11 == 2 || i11 == 3 || gVar.isUnsubscribed()) {
                return;
            }
            if (i11 == 1) {
                gVar.onNext(r11);
                if (!gVar.isUnsubscribed()) {
                    gVar.onCompleted();
                }
                this.f86071d.lazySet(3);
                return;
            }
            this.f86070c = r11;
        } while (!this.f86071d.compareAndSet(0, 2));
    }

    public final void D(long j11) {
        if (j11 < 0) {
            throw new IllegalArgumentException("n >= 0 required but it was " + j11);
        }
        if (j11 != 0) {
            qb0.g<? super R> gVar = this.f86068a;
            do {
                int i11 = this.f86071d.get();
                if (i11 == 1 || i11 == 3 || gVar.isUnsubscribed()) {
                    return;
                }
                if (i11 == 2) {
                    if (this.f86071d.compareAndSet(2, 3)) {
                        gVar.onNext(this.f86070c);
                        if (gVar.isUnsubscribed()) {
                            return;
                        }
                        gVar.onCompleted();
                        return;
                    }
                    return;
                }
            } while (!this.f86071d.compareAndSet(0, 1));
        }
    }

    public final void E() {
        qb0.g<? super R> gVar = this.f86068a;
        gVar.add(this);
        gVar.setProducer(new a(this));
    }

    public final void H(rx.c<? extends T> cVar) {
        E();
        cVar.J6(this);
    }

    @Override // qb0.c
    public void onCompleted() {
        if (this.f86069b) {
            C(this.f86070c);
        } else {
            q();
        }
    }

    @Override // qb0.c
    public void onError(Throwable th2) {
        this.f86070c = null;
        this.f86068a.onError(th2);
    }

    public final void q() {
        this.f86068a.onCompleted();
    }

    @Override // qb0.g
    public final void setProducer(qb0.d dVar) {
        dVar.request(Long.MAX_VALUE);
    }
}
