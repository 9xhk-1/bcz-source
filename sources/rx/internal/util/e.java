package rx.internal.util;

import androidx.camera.view.q;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import wb0.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class e<E> implements qb0.h {

    /* renamed from: e, reason: collision with root package name */
    public static final int f86694e;

    /* renamed from: a, reason: collision with root package name */
    public final a<E> f86695a = new a<>();

    /* renamed from: b, reason: collision with root package name */
    public final b f86696b = new b();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f86697c = new AtomicInteger();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicInteger f86698d = new AtomicInteger();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<E> {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReferenceArray<E> f86699a = new AtomicReferenceArray<>(e.f86694e);

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReference<a<E>> f86700b = new AtomicReference<>();

        public a<E> a() {
            if (this.f86700b.get() != null) {
                return this.f86700b.get();
            }
            a<E> aVar = new a<>();
            return q.a(this.f86700b, null, aVar) ? aVar : this.f86700b.get();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicIntegerArray f86701a = new AtomicIntegerArray(e.f86694e);

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReference<b> f86702b = new AtomicReference<>();

        public int a(int i11, int i12) {
            return this.f86701a.getAndSet(i11, i12);
        }

        public b b() {
            if (this.f86702b.get() != null) {
                return this.f86702b.get();
            }
            b bVar = new b();
            return q.a(this.f86702b, null, bVar) ? bVar : this.f86702b.get();
        }

        public void c(int i11, int i12) {
            this.f86701a.set(i11, i12);
        }
    }

    static {
        int i11 = i.b() ? 8 : 128;
        String property = System.getProperty("rx.indexed-ring-buffer.size");
        if (property != null) {
            try {
                i11 = Integer.parseInt(property);
            } catch (NumberFormatException e11) {
                System.err.println("Failed to set 'rx.indexed-ring-buffer.size' with value " + property + " => " + e11.getMessage());
            }
        }
        f86694e = i11;
    }

    public static <T> e<T> i() {
        return new e<>();
    }

    public int a(E e11) {
        int f11 = f();
        int i11 = f86694e;
        if (f11 < i11) {
            this.f86695a.f86699a.set(f11, e11);
            return f11;
        }
        e(f11).f86699a.set(f11 % i11, e11);
        return f11;
    }

    public int b(p<? super E, Boolean> pVar) {
        return c(pVar, 0);
    }

    public int c(p<? super E, Boolean> pVar, int i11) {
        int d11 = d(pVar, i11, this.f86697c.get());
        if (i11 > 0 && d11 == this.f86697c.get()) {
            return d(pVar, 0, i11);
        }
        if (d11 == this.f86697c.get()) {
            return 0;
        }
        return d11;
    }

    public final int d(p<? super E, Boolean> pVar, int i11, int i12) {
        a<E> aVar;
        int i13;
        E e11;
        int i14 = this.f86697c.get();
        a<E> aVar2 = this.f86695a;
        int i15 = f86694e;
        if (i11 >= i15) {
            a<E> e12 = e(i11);
            i13 = i11;
            i11 %= i15;
            aVar = e12;
        } else {
            aVar = aVar2;
            i13 = i11;
        }
        while (aVar != null) {
            while (i11 < f86694e) {
                if (i13 >= i14 || i13 >= i12 || !((e11 = aVar.f86699a.get(i11)) == null || pVar.call(e11).booleanValue())) {
                    return i13;
                }
                i11++;
                i13++;
            }
            aVar = aVar.f86700b.get();
            i11 = 0;
        }
        return i13;
    }

    public final a<E> e(int i11) {
        int i12 = f86694e;
        if (i11 < i12) {
            return this.f86695a;
        }
        int i13 = i11 / i12;
        a<E> aVar = this.f86695a;
        for (int i14 = 0; i14 < i13; i14++) {
            aVar = aVar.a();
        }
        return aVar;
    }

    public final synchronized int f() {
        int andIncrement;
        try {
            int g11 = g();
            if (g11 >= 0) {
                int i11 = f86694e;
                if (g11 < i11) {
                    andIncrement = this.f86696b.a(g11, -1);
                } else {
                    andIncrement = h(g11).a(g11 % i11, -1);
                }
                if (andIncrement == this.f86697c.get()) {
                    this.f86697c.getAndIncrement();
                }
            } else {
                andIncrement = this.f86697c.getAndIncrement();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return andIncrement;
    }

    public final synchronized int g() {
        int i11;
        int i12;
        do {
            i11 = this.f86698d.get();
            if (i11 <= 0) {
                return -1;
            }
            i12 = i11 - 1;
        } while (!this.f86698d.compareAndSet(i11, i12));
        return i12;
    }

    public final b h(int i11) {
        int i12 = f86694e;
        if (i11 < i12) {
            return this.f86696b;
        }
        int i13 = i11 / i12;
        b bVar = this.f86696b;
        for (int i14 = 0; i14 < i13; i14++) {
            bVar = bVar.b();
        }
        return bVar;
    }

    @Override // qb0.h
    public boolean isUnsubscribed() {
        return false;
    }

    public final synchronized void j(int i11) {
        try {
            int andIncrement = this.f86698d.getAndIncrement();
            int i12 = f86694e;
            if (andIncrement < i12) {
                this.f86696b.c(andIncrement, i11);
            } else {
                h(andIncrement).c(andIncrement % i12, i11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void k() {
        int i11 = this.f86697c.get();
        int i12 = 0;
        loop0: for (a<E> aVar = this.f86695a; aVar != null; aVar = aVar.f86700b.get()) {
            int i13 = 0;
            while (i13 < f86694e) {
                if (i12 >= i11) {
                    break loop0;
                }
                aVar.f86699a.set(i13, null);
                i13++;
                i12++;
            }
        }
        this.f86697c.set(0);
        this.f86698d.set(0);
    }

    public E n(int i11) {
        E andSet;
        int i12 = f86694e;
        if (i11 < i12) {
            andSet = this.f86695a.f86699a.getAndSet(i11, null);
        } else {
            andSet = e(i11).f86699a.getAndSet(i11 % i12, null);
        }
        j(i11);
        return andSet;
    }

    @Override // qb0.h
    public void unsubscribe() {
        k();
    }
}
