package ac0;

import androidx.camera.view.q;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class f {

    /* renamed from: f, reason: collision with root package name */
    public static final f f2616f = new f();

    /* renamed from: g, reason: collision with root package name */
    public static final ac0.b f2617g = new a();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference<ac0.b> f2618a = new AtomicReference<>();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference<d> f2619b = new AtomicReference<>();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference<h> f2620c = new AtomicReference<>();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference<ac0.a> f2621d = new AtomicReference<>();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference<g> f2622e = new AtomicReference<>();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends ac0.b {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends ac0.a {
        public b() {
        }
    }

    @Deprecated
    public static f c() {
        return f2616f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        r2 = "rxjava.plugin." + r7.substring(0, r7.length() - 6).substring(14) + ".impl";
        r1 = r10.getProperty(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0087, code lost:
    
        if (r1 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a8, code lost:
    
        throw new java.lang.IllegalStateException("Implementing class declaration for " + r0 + " missing: " + r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object e(java.lang.Class<?> r9, java.util.Properties r10) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ac0.f.e(java.lang.Class, java.util.Properties):java.lang.Object");
    }

    public static Properties h() {
        try {
            return System.getProperties();
        } catch (SecurityException unused) {
            return new Properties();
        }
    }

    public ac0.a a() {
        if (this.f2621d.get() == null) {
            Object e11 = e(ac0.a.class, h());
            if (e11 == null) {
                q.a(this.f2621d, null, new b());
            } else {
                q.a(this.f2621d, null, (ac0.a) e11);
            }
        }
        return this.f2621d.get();
    }

    public ac0.b b() {
        if (this.f2618a.get() == null) {
            Object e11 = e(ac0.b.class, h());
            if (e11 == null) {
                q.a(this.f2618a, null, f2617g);
            } else {
                q.a(this.f2618a, null, (ac0.b) e11);
            }
        }
        return this.f2618a.get();
    }

    public d d() {
        if (this.f2619b.get() == null) {
            Object e11 = e(d.class, h());
            if (e11 == null) {
                q.a(this.f2619b, null, e.f());
            } else {
                q.a(this.f2619b, null, (d) e11);
            }
        }
        return this.f2619b.get();
    }

    public g f() {
        if (this.f2622e.get() == null) {
            Object e11 = e(g.class, h());
            if (e11 == null) {
                q.a(this.f2622e, null, g.h());
            } else {
                q.a(this.f2622e, null, (g) e11);
            }
        }
        return this.f2622e.get();
    }

    public h g() {
        if (this.f2620c.get() == null) {
            Object e11 = e(h.class, h());
            if (e11 == null) {
                q.a(this.f2620c, null, i.f());
            } else {
                q.a(this.f2620c, null, (h) e11);
            }
        }
        return this.f2620c.get();
    }

    public void i(ac0.a aVar) {
        if (q.a(this.f2621d, null, aVar)) {
            return;
        }
        throw new IllegalStateException("Another strategy was already registered: " + this.f2620c.get());
    }

    public void j(ac0.b bVar) {
        if (q.a(this.f2618a, null, bVar)) {
            return;
        }
        throw new IllegalStateException("Another strategy was already registered: " + this.f2618a.get());
    }

    public void k(d dVar) {
        if (q.a(this.f2619b, null, dVar)) {
            return;
        }
        throw new IllegalStateException("Another strategy was already registered: " + this.f2619b.get());
    }

    public void l(g gVar) {
        if (q.a(this.f2622e, null, gVar)) {
            return;
        }
        throw new IllegalStateException("Another strategy was already registered: " + this.f2622e.get());
    }

    public void m(h hVar) {
        if (q.a(this.f2620c, null, hVar)) {
            return;
        }
        throw new IllegalStateException("Another strategy was already registered: " + this.f2620c.get());
    }

    public void n() {
        f fVar = f2616f;
        fVar.f2618a.set(null);
        fVar.f2619b.set(null);
        fVar.f2620c.set(null);
        fVar.f2621d.set(null);
        fVar.f2622e.set(null);
    }
}
