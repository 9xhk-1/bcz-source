package ec0;

import androidx.camera.view.q;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import qb0.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class d implements h {

    /* renamed from: c, reason: collision with root package name */
    public static final b f49635c = new b(false, 0);

    /* renamed from: a, reason: collision with root package name */
    public final h f49636a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference<b> f49637b = new AtomicReference<>(f49635c);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends AtomicInteger implements h {
        private static final long serialVersionUID = 7005765588239987643L;

        /* renamed from: a, reason: collision with root package name */
        public final d f49638a;

        public a(d dVar) {
            this.f49638a = dVar;
        }

        @Override // qb0.h
        public boolean isUnsubscribed() {
            return get() != 0;
        }

        @Override // qb0.h
        public void unsubscribe() {
            if (compareAndSet(0, 1)) {
                this.f49638a.b();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f49639a;

        /* renamed from: b, reason: collision with root package name */
        public final int f49640b;

        public b(boolean z11, int i11) {
            this.f49639a = z11;
            this.f49640b = i11;
        }

        public b a() {
            return new b(this.f49639a, this.f49640b + 1);
        }

        public b b() {
            return new b(this.f49639a, this.f49640b - 1);
        }

        public b c() {
            return new b(true, this.f49640b);
        }
    }

    public d(h hVar) {
        if (hVar == null) {
            throw new IllegalArgumentException("s");
        }
        this.f49636a = hVar;
    }

    public h a() {
        b bVar;
        AtomicReference<b> atomicReference = this.f49637b;
        do {
            bVar = atomicReference.get();
            if (bVar.f49639a) {
                return f.e();
            }
        } while (!q.a(atomicReference, bVar, bVar.a()));
        return new a(this);
    }

    public void b() {
        b bVar;
        b b11;
        AtomicReference<b> atomicReference = this.f49637b;
        do {
            bVar = atomicReference.get();
            b11 = bVar.b();
        } while (!q.a(atomicReference, bVar, b11));
        c(b11);
    }

    public final void c(b bVar) {
        if (bVar.f49639a && bVar.f49640b == 0) {
            this.f49636a.unsubscribe();
        }
    }

    @Override // qb0.h
    public boolean isUnsubscribed() {
        return this.f49637b.get().f49639a;
    }

    @Override // qb0.h
    public void unsubscribe() {
        b bVar;
        b c11;
        AtomicReference<b> atomicReference = this.f49637b;
        do {
            bVar = atomicReference.get();
            if (bVar.f49639a) {
                return;
            } else {
                c11 = bVar.c();
            }
        } while (!q.a(atomicReference, bVar, c11));
        c(c11);
    }
}
