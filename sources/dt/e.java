package dt;

import android.view.View;
import android.view.animation.Interpolator;
import bt.a;
import bt.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class e extends dt.b {

    /* renamed from: o, reason: collision with root package name */
    public static final int f48146o = 0;

    /* renamed from: p, reason: collision with root package name */
    public static final int f48147p = 1;

    /* renamed from: q, reason: collision with root package name */
    public static final int f48148q = 2;

    /* renamed from: r, reason: collision with root package name */
    public static final int f48149r = 4;

    /* renamed from: s, reason: collision with root package name */
    public static final int f48150s = 8;

    /* renamed from: t, reason: collision with root package name */
    public static final int f48151t = 16;

    /* renamed from: u, reason: collision with root package name */
    public static final int f48152u = 32;

    /* renamed from: v, reason: collision with root package name */
    public static final int f48153v = 64;

    /* renamed from: w, reason: collision with root package name */
    public static final int f48154w = 128;

    /* renamed from: x, reason: collision with root package name */
    public static final int f48155x = 256;

    /* renamed from: y, reason: collision with root package name */
    public static final int f48156y = 512;

    /* renamed from: z, reason: collision with root package name */
    public static final int f48157z = 511;

    /* renamed from: b, reason: collision with root package name */
    public final et.a f48158b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference<View> f48159c;

    /* renamed from: d, reason: collision with root package name */
    public long f48160d;

    /* renamed from: h, reason: collision with root package name */
    public Interpolator f48164h;

    /* renamed from: e, reason: collision with root package name */
    public boolean f48161e = false;

    /* renamed from: f, reason: collision with root package name */
    public long f48162f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f48163g = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f48165i = false;

    /* renamed from: j, reason: collision with root package name */
    public a.InterfaceC0121a f48166j = null;

    /* renamed from: k, reason: collision with root package name */
    public b f48167k = new b(this, null);

    /* renamed from: l, reason: collision with root package name */
    public ArrayList<c> f48168l = new ArrayList<>();

    /* renamed from: m, reason: collision with root package name */
    public Runnable f48169m = new a();

    /* renamed from: n, reason: collision with root package name */
    public HashMap<bt.a, d> f48170n = new HashMap<>();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.O();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements a.InterfaceC0121a, q.g {
        public b() {
        }

        @Override // bt.q.g
        public void a(q qVar) {
            View view;
            float Q = qVar.Q();
            d dVar = (d) e.this.f48170n.get(qVar);
            if ((dVar.f48176a & 511) != 0 && (view = (View) e.this.f48159c.get()) != null) {
                view.invalidate();
            }
            ArrayList<c> arrayList = dVar.f48177b;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    c cVar = arrayList.get(i11);
                    e.this.N(cVar.f48173a, cVar.f48174b + (cVar.f48175c * Q));
                }
            }
            View view2 = (View) e.this.f48159c.get();
            if (view2 != null) {
                view2.invalidate();
            }
        }

        @Override // bt.a.InterfaceC0121a
        public void b(bt.a aVar) {
            if (e.this.f48166j != null) {
                e.this.f48166j.b(aVar);
            }
        }

        @Override // bt.a.InterfaceC0121a
        public void c(bt.a aVar) {
            if (e.this.f48166j != null) {
                e.this.f48166j.c(aVar);
            }
        }

        @Override // bt.a.InterfaceC0121a
        public void d(bt.a aVar) {
            if (e.this.f48166j != null) {
                e.this.f48166j.d(aVar);
            }
        }

        @Override // bt.a.InterfaceC0121a
        public void e(bt.a aVar) {
            if (e.this.f48166j != null) {
                e.this.f48166j.e(aVar);
            }
            e.this.f48170n.remove(aVar);
            if (e.this.f48170n.isEmpty()) {
                e.this.f48166j = null;
            }
        }

        public /* synthetic */ b(e eVar, b bVar) {
            this();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public int f48173a;

        /* renamed from: b, reason: collision with root package name */
        public float f48174b;

        /* renamed from: c, reason: collision with root package name */
        public float f48175c;

        public c(int i11, float f11, float f12) {
            this.f48173a = i11;
            this.f48174b = f11;
            this.f48175c = f12;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public int f48176a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList<c> f48177b;

        public d(int i11, ArrayList<c> arrayList) {
            this.f48176a = i11;
            this.f48177b = arrayList;
        }

        public boolean a(int i11) {
            ArrayList<c> arrayList;
            if ((this.f48176a & i11) != 0 && (arrayList = this.f48177b) != null) {
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    if (this.f48177b.get(i12).f48173a == i11) {
                        this.f48177b.remove(i12);
                        this.f48176a = (~i11) & this.f48176a;
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public e(View view) {
        this.f48159c = new WeakReference<>(view);
        this.f48158b = et.a.N(view);
    }

    private void J(int i11, float f11) {
        float M = M(i11);
        L(i11, M, f11 - M);
    }

    private void K(int i11, float f11) {
        L(i11, M(i11), f11);
    }

    private void L(int i11, float f11, float f12) {
        bt.a aVar;
        if (this.f48170n.size() > 0) {
            Iterator<bt.a> it = this.f48170n.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    aVar = null;
                    break;
                }
                bt.a next = it.next();
                d dVar = this.f48170n.get(next);
                if (dVar.a(i11) && dVar.f48176a == 0) {
                    aVar = next;
                    break;
                }
            }
            if (aVar != null) {
                aVar.cancel();
            }
        }
        this.f48168l.add(new c(i11, f11, f12));
        View view = this.f48159c.get();
        if (view != null) {
            view.removeCallbacks(this.f48169m);
            view.post(this.f48169m);
        }
    }

    private float M(int i11) {
        if (i11 == 1) {
            return this.f48158b.m();
        }
        if (i11 == 2) {
            return this.f48158b.n();
        }
        if (i11 == 4) {
            return this.f48158b.h();
        }
        if (i11 == 8) {
            return this.f48158b.i();
        }
        if (i11 == 16) {
            return this.f48158b.e();
        }
        if (i11 == 32) {
            return this.f48158b.f();
        }
        if (i11 == 64) {
            return this.f48158b.g();
        }
        if (i11 == 128) {
            return this.f48158b.o();
        }
        if (i11 == 256) {
            return this.f48158b.p();
        }
        if (i11 != 512) {
            return 0.0f;
        }
        return this.f48158b.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(int i11, float f11) {
        if (i11 == 1) {
            this.f48158b.F(f11);
            return;
        }
        if (i11 == 2) {
            this.f48158b.G(f11);
            return;
        }
        if (i11 == 4) {
            this.f48158b.z(f11);
            return;
        }
        if (i11 == 8) {
            this.f48158b.A(f11);
            return;
        }
        if (i11 == 16) {
            this.f48158b.w(f11);
            return;
        }
        if (i11 == 32) {
            this.f48158b.x(f11);
            return;
        }
        if (i11 == 64) {
            this.f48158b.y(f11);
            return;
        }
        if (i11 == 128) {
            this.f48158b.J(f11);
        } else if (i11 == 256) {
            this.f48158b.K(f11);
        } else {
            if (i11 != 512) {
                return;
            }
            this.f48158b.t(f11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        q f02 = q.f0(1.0f);
        ArrayList arrayList = (ArrayList) this.f48168l.clone();
        this.f48168l.clear();
        int size = arrayList.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 |= ((c) arrayList.get(i12)).f48173a;
        }
        this.f48170n.put(f02, new d(i11, arrayList));
        f02.G(this.f48167k);
        f02.a(this.f48167k);
        if (this.f48163g) {
            f02.n(this.f48162f);
        }
        if (this.f48161e) {
            f02.l(this.f48160d);
        }
        if (this.f48165i) {
            f02.m(this.f48164h);
        }
        f02.s();
    }

    @Override // dt.b
    public dt.b A(float f11) {
        K(128, f11);
        return this;
    }

    @Override // dt.b
    public dt.b B(float f11) {
        J(256, f11);
        return this;
    }

    @Override // dt.b
    public dt.b C(float f11) {
        K(256, f11);
        return this;
    }

    @Override // dt.b
    public dt.b a(float f11) {
        J(512, f11);
        return this;
    }

    @Override // dt.b
    public dt.b b(float f11) {
        K(512, f11);
        return this;
    }

    @Override // dt.b
    public void d() {
        if (this.f48170n.size() > 0) {
            Iterator it = ((HashMap) this.f48170n.clone()).keySet().iterator();
            while (it.hasNext()) {
                ((bt.a) it.next()).cancel();
            }
        }
        this.f48168l.clear();
        View view = this.f48159c.get();
        if (view != null) {
            view.removeCallbacks(this.f48169m);
        }
    }

    @Override // dt.b
    public long e() {
        return this.f48161e ? this.f48160d : new q().d();
    }

    @Override // dt.b
    public long f() {
        if (this.f48163g) {
            return this.f48162f;
        }
        return 0L;
    }

    @Override // dt.b
    public dt.b g(float f11) {
        J(16, f11);
        return this;
    }

    @Override // dt.b
    public dt.b h(float f11) {
        K(16, f11);
        return this;
    }

    @Override // dt.b
    public dt.b i(float f11) {
        J(32, f11);
        return this;
    }

    @Override // dt.b
    public dt.b j(float f11) {
        K(32, f11);
        return this;
    }

    @Override // dt.b
    public dt.b k(float f11) {
        J(64, f11);
        return this;
    }

    @Override // dt.b
    public dt.b l(float f11) {
        K(64, f11);
        return this;
    }

    @Override // dt.b
    public dt.b m(float f11) {
        J(4, f11);
        return this;
    }

    @Override // dt.b
    public dt.b n(float f11) {
        K(4, f11);
        return this;
    }

    @Override // dt.b
    public dt.b o(float f11) {
        J(8, f11);
        return this;
    }

    @Override // dt.b
    public dt.b p(float f11) {
        K(8, f11);
        return this;
    }

    @Override // dt.b
    public dt.b q(long j11) {
        if (j11 >= 0) {
            this.f48161e = true;
            this.f48160d = j11;
            return this;
        }
        throw new IllegalArgumentException("Animators cannot have negative duration: " + j11);
    }

    @Override // dt.b
    public dt.b r(Interpolator interpolator) {
        this.f48165i = true;
        this.f48164h = interpolator;
        return this;
    }

    @Override // dt.b
    public dt.b s(a.InterfaceC0121a interfaceC0121a) {
        this.f48166j = interfaceC0121a;
        return this;
    }

    @Override // dt.b
    public dt.b t(long j11) {
        if (j11 >= 0) {
            this.f48163g = true;
            this.f48162f = j11;
            return this;
        }
        throw new IllegalArgumentException("Animators cannot have negative duration: " + j11);
    }

    @Override // dt.b
    public void u() {
        O();
    }

    @Override // dt.b
    public dt.b v(float f11) {
        J(1, f11);
        return this;
    }

    @Override // dt.b
    public dt.b w(float f11) {
        K(1, f11);
        return this;
    }

    @Override // dt.b
    public dt.b x(float f11) {
        J(2, f11);
        return this;
    }

    @Override // dt.b
    public dt.b y(float f11) {
        K(2, f11);
        return this;
    }

    @Override // dt.b
    public dt.b z(float f11) {
        J(128, f11);
        return this;
    }
}
