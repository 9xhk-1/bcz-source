package z2;

import a3.d0;
import a3.l0;
import java.util.Iterator;
import z2.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class o<T> implements g, Iterable<T> {

    /* renamed from: a, reason: collision with root package name */
    @d0
    public com.badlogic.gdx.scenes.scene2d.a f100729a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f100732d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f100733e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f100734f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f100735g;

    /* renamed from: i, reason: collision with root package name */
    @d0
    public T f100737i;

    /* renamed from: b, reason: collision with root package name */
    public final com.badlogic.gdx.utils.o<T> f100730b = new com.badlogic.gdx.utils.o<>();

    /* renamed from: c, reason: collision with root package name */
    public final com.badlogic.gdx.utils.o<T> f100731c = new com.badlogic.gdx.utils.o<>();

    /* renamed from: h, reason: collision with root package name */
    public boolean f100736h = true;

    public void A() {
        this.f100731c.j(this.f100730b.f13401a);
        this.f100731c.w(this.f100730b);
    }

    public com.badlogic.gdx.utils.a<T> B() {
        return this.f100730b.iterator().f();
    }

    public com.badlogic.gdx.utils.a<T> C(com.badlogic.gdx.utils.a<T> aVar) {
        return this.f100730b.iterator().g(aVar);
    }

    @Override // z2.g
    public boolean I() {
        return this.f100732d;
    }

    @Override // z2.g
    public void J0(boolean z11) {
        this.f100732d = z11;
    }

    public void a(T t11) {
        if (t11 == null) {
            throw new IllegalArgumentException("item cannot be null.");
        }
        if (this.f100730b.add(t11)) {
            if (this.f100736h && h()) {
                this.f100730b.remove(t11);
            } else {
                this.f100737i = t11;
                d();
            }
        }
    }

    public void b(com.badlogic.gdx.utils.a<T> aVar) {
        A();
        int i11 = aVar.f13179b;
        boolean z11 = false;
        for (int i12 = 0; i12 < i11; i12++) {
            T t11 = aVar.get(i12);
            if (t11 == null) {
                throw new IllegalArgumentException("item cannot be null.");
            }
            if (this.f100730b.add(t11)) {
                z11 = true;
            }
        }
        if (z11) {
            if (this.f100736h && h()) {
                s();
            } else {
                this.f100737i = aVar.peek();
                d();
            }
        }
        g();
    }

    public void clear() {
        if (this.f100730b.f13401a == 0) {
            this.f100737i = null;
            return;
        }
        A();
        this.f100730b.j(8);
        if (this.f100736h && h()) {
            s();
        } else {
            this.f100737i = null;
            d();
        }
        g();
    }

    public boolean contains(@d0 T t11) {
        if (t11 == null) {
            return false;
        }
        return this.f100730b.contains(t11);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:8:0x000a, B:10:0x000f, B:13:0x0038, B:15:0x003d, B:17:0x0041, B:19:0x0065, B:24:0x0073, B:25:0x0075, B:27:0x007b, B:30:0x007f, B:31:0x0047, B:33:0x004d, B:37:0x0057, B:40:0x005f, B:42:0x0019, B:44:0x0021, B:46:0x0025, B:50:0x002f), top: B:7:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f A[Catch: all -> 0x0016, TRY_LEAVE, TryCatch #0 {all -> 0x0016, blocks: (B:8:0x000a, B:10:0x000f, B:13:0x0038, B:15:0x003d, B:17:0x0041, B:19:0x0065, B:24:0x0073, B:25:0x0075, B:27:0x007b, B:30:0x007f, B:31:0x0047, B:33:0x004d, B:37:0x0057, B:40:0x005f, B:42:0x0019, B:44:0x0021, B:46:0x0025, B:50:0x002f), top: B:7:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(T r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L8a
            boolean r0 = r4.f100732d
            if (r0 == 0) goto L7
            return
        L7:
            r4.A()
            boolean r0 = r4.f100733e     // Catch: java.lang.Throwable -> L16
            r1 = 1
            if (r0 != 0) goto L19
            boolean r0 = z2.t.c()     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L38
            goto L19
        L16:
            r5 = move-exception
            goto L86
        L19:
            com.badlogic.gdx.utils.o<T> r0 = r4.f100730b     // Catch: java.lang.Throwable -> L16
            boolean r0 = r0.contains(r5)     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L38
            boolean r0 = r4.f100735g     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L2f
            com.badlogic.gdx.utils.o<T> r0 = r4.f100730b     // Catch: java.lang.Throwable -> L16
            int r0 = r0.f13401a     // Catch: java.lang.Throwable -> L16
            if (r0 != r1) goto L2f
            r4.g()
            return
        L2f:
            com.badlogic.gdx.utils.o<T> r0 = r4.f100730b     // Catch: java.lang.Throwable -> L16
            r0.remove(r5)     // Catch: java.lang.Throwable -> L16
            r5 = 0
            r4.f100737i = r5     // Catch: java.lang.Throwable -> L16
            goto L75
        L38:
            boolean r0 = r4.f100734f     // Catch: java.lang.Throwable -> L16
            r2 = 0
            if (r0 == 0) goto L47
            boolean r0 = r4.f100733e     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L65
            boolean r0 = z2.t.c()     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L65
        L47:
            com.badlogic.gdx.utils.o<T> r0 = r4.f100730b     // Catch: java.lang.Throwable -> L16
            int r3 = r0.f13401a     // Catch: java.lang.Throwable -> L16
            if (r3 != r1) goto L57
            boolean r0 = r0.contains(r5)     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L57
            r4.g()
            return
        L57:
            com.badlogic.gdx.utils.o<T> r0 = r4.f100730b     // Catch: java.lang.Throwable -> L16
            int r3 = r0.f13401a     // Catch: java.lang.Throwable -> L16
            if (r3 <= 0) goto L5e
            goto L5f
        L5e:
            r1 = r2
        L5f:
            r2 = 8
            r0.j(r2)     // Catch: java.lang.Throwable -> L16
            r2 = r1
        L65:
            com.badlogic.gdx.utils.o<T> r0 = r4.f100730b     // Catch: java.lang.Throwable -> L16
            boolean r0 = r0.add(r5)     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L73
            if (r2 != 0) goto L73
            r4.g()
            return
        L73:
            r4.f100737i = r5     // Catch: java.lang.Throwable -> L16
        L75:
            boolean r5 = r4.h()     // Catch: java.lang.Throwable -> L16
            if (r5 == 0) goto L7f
            r4.s()     // Catch: java.lang.Throwable -> L16
            goto L82
        L7f:
            r4.d()     // Catch: java.lang.Throwable -> L16
        L82:
            r4.g()
            return
        L86:
            r4.g()
            throw r5
        L8a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "item cannot be null."
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.o.f(java.lang.Object):void");
    }

    @d0
    public T first() {
        com.badlogic.gdx.utils.o<T> oVar = this.f100730b;
        if (oVar.f13401a == 0) {
            return null;
        }
        return oVar.first();
    }

    public void g() {
        this.f100731c.j(32);
    }

    public boolean h() {
        if (this.f100729a == null) {
            return false;
        }
        d.a aVar = (d.a) l0.f(d.a.class);
        try {
            return this.f100729a.q1(aVar);
        } finally {
            l0.a(aVar);
        }
    }

    public boolean isEmpty() {
        return this.f100730b.f13401a == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return this.f100730b.iterator();
    }

    @d0
    public T j() {
        T t11 = this.f100737i;
        if (t11 != null) {
            return t11;
        }
        com.badlogic.gdx.utils.o<T> oVar = this.f100730b;
        if (oVar.f13401a > 0) {
            return oVar.first();
        }
        return null;
    }

    public boolean k() {
        return this.f100734f;
    }

    public boolean l() {
        return this.f100735g;
    }

    public boolean m() {
        return this.f100733e;
    }

    @Deprecated
    public boolean n() {
        return this.f100730b.f13401a > 0;
    }

    public com.badlogic.gdx.utils.o<T> o() {
        return this.f100730b;
    }

    public boolean p() {
        return this.f100730b.f13401a > 0;
    }

    public void q(T t11) {
        if (t11 == null) {
            throw new IllegalArgumentException("item cannot be null.");
        }
        if (this.f100730b.remove(t11)) {
            if (this.f100736h && h()) {
                this.f100730b.add(t11);
            } else {
                this.f100737i = null;
                d();
            }
        }
    }

    public void r(com.badlogic.gdx.utils.a<T> aVar) {
        A();
        int i11 = aVar.f13179b;
        boolean z11 = false;
        for (int i12 = 0; i12 < i11; i12++) {
            T t11 = aVar.get(i12);
            if (t11 == null) {
                throw new IllegalArgumentException("item cannot be null.");
            }
            if (this.f100730b.remove(t11)) {
                z11 = true;
            }
        }
        if (z11) {
            if (this.f100736h && h()) {
                s();
            } else {
                this.f100737i = null;
                d();
            }
        }
        g();
    }

    public void s() {
        this.f100730b.j(this.f100731c.f13401a);
        this.f100730b.w(this.f100731c);
    }

    public int size() {
        return this.f100730b.f13401a;
    }

    public void t(T t11) {
        if (t11 == null) {
            throw new IllegalArgumentException("item cannot be null.");
        }
        com.badlogic.gdx.utils.o<T> oVar = this.f100730b;
        if (oVar.f13401a == 1 && oVar.first() == t11) {
            return;
        }
        A();
        this.f100730b.j(8);
        this.f100730b.add(t11);
        if (this.f100736h && h()) {
            s();
        } else {
            this.f100737i = t11;
            d();
        }
        g();
    }

    public String toString() {
        return this.f100730b.toString();
    }

    public void u(@d0 com.badlogic.gdx.scenes.scene2d.a aVar) {
        this.f100729a = aVar;
    }

    public void v(com.badlogic.gdx.utils.a<T> aVar) {
        A();
        this.f100737i = null;
        this.f100730b.j(aVar.f13179b);
        int i11 = aVar.f13179b;
        boolean z11 = false;
        for (int i12 = 0; i12 < i11; i12++) {
            T t11 = aVar.get(i12);
            if (t11 == null) {
                throw new IllegalArgumentException("item cannot be null.");
            }
            if (this.f100730b.add(t11)) {
                z11 = true;
            }
        }
        if (z11) {
            if (this.f100736h && h()) {
                s();
            } else if (aVar.f13179b > 0) {
                this.f100737i = aVar.peek();
                d();
            }
        }
        g();
    }

    public void w(boolean z11) {
        this.f100734f = z11;
    }

    public void x(boolean z11) {
        this.f100736h = z11;
    }

    public void y(boolean z11) {
        this.f100735g = z11;
    }

    public void z(boolean z11) {
        this.f100733e = z11;
    }

    public void d() {
    }
}
