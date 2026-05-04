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
public class c extends dt.b {

    /* renamed from: n, reason: collision with root package name */
    public static final int f48111n = 0;

    /* renamed from: o, reason: collision with root package name */
    public static final int f48112o = 1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f48113p = 2;

    /* renamed from: q, reason: collision with root package name */
    public static final int f48114q = 4;

    /* renamed from: r, reason: collision with root package name */
    public static final int f48115r = 8;

    /* renamed from: s, reason: collision with root package name */
    public static final int f48116s = 16;

    /* renamed from: t, reason: collision with root package name */
    public static final int f48117t = 32;

    /* renamed from: u, reason: collision with root package name */
    public static final int f48118u = 64;

    /* renamed from: v, reason: collision with root package name */
    public static final int f48119v = 128;

    /* renamed from: w, reason: collision with root package name */
    public static final int f48120w = 256;

    /* renamed from: x, reason: collision with root package name */
    public static final int f48121x = 512;

    /* renamed from: y, reason: collision with root package name */
    public static final int f48122y = 511;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference<View> f48123b;

    /* renamed from: c, reason: collision with root package name */
    public long f48124c;

    /* renamed from: g, reason: collision with root package name */
    public Interpolator f48128g;

    /* renamed from: d, reason: collision with root package name */
    public boolean f48125d = false;

    /* renamed from: e, reason: collision with root package name */
    public long f48126e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f48127f = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f48129h = false;

    /* renamed from: i, reason: collision with root package name */
    public a.InterfaceC0121a f48130i = null;

    /* renamed from: j, reason: collision with root package name */
    public b f48131j = new b(this, null);

    /* renamed from: k, reason: collision with root package name */
    public ArrayList<C0575c> f48132k = new ArrayList<>();

    /* renamed from: l, reason: collision with root package name */
    public Runnable f48133l = new a();

    /* renamed from: m, reason: collision with root package name */
    public HashMap<bt.a, d> f48134m = new HashMap<>();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.O();
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
            d dVar = (d) c.this.f48134m.get(qVar);
            if ((dVar.f48140a & 511) != 0 && (view = (View) c.this.f48123b.get()) != null) {
                view.invalidate();
            }
            ArrayList<C0575c> arrayList = dVar.f48141b;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    C0575c c0575c = arrayList.get(i11);
                    c.this.N(c0575c.f48137a, c0575c.f48138b + (c0575c.f48139c * Q));
                }
            }
            View view2 = (View) c.this.f48123b.get();
            if (view2 != null) {
                view2.invalidate();
            }
        }

        @Override // bt.a.InterfaceC0121a
        public void b(bt.a aVar) {
            if (c.this.f48130i != null) {
                c.this.f48130i.b(aVar);
            }
        }

        @Override // bt.a.InterfaceC0121a
        public void c(bt.a aVar) {
            if (c.this.f48130i != null) {
                c.this.f48130i.c(aVar);
            }
        }

        @Override // bt.a.InterfaceC0121a
        public void d(bt.a aVar) {
            if (c.this.f48130i != null) {
                c.this.f48130i.d(aVar);
            }
        }

        @Override // bt.a.InterfaceC0121a
        public void e(bt.a aVar) {
            if (c.this.f48130i != null) {
                c.this.f48130i.e(aVar);
            }
            c.this.f48134m.remove(aVar);
            if (c.this.f48134m.isEmpty()) {
                c.this.f48130i = null;
            }
        }

        public /* synthetic */ b(c cVar, b bVar) {
            this();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: dt.c$c, reason: collision with other inner class name */
    public static class C0575c {

        /* renamed from: a, reason: collision with root package name */
        public int f48137a;

        /* renamed from: b, reason: collision with root package name */
        public float f48138b;

        /* renamed from: c, reason: collision with root package name */
        public float f48139c;

        public C0575c(int i11, float f11, float f12) {
            this.f48137a = i11;
            this.f48138b = f11;
            this.f48139c = f12;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public int f48140a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList<C0575c> f48141b;

        public d(int i11, ArrayList<C0575c> arrayList) {
            this.f48140a = i11;
            this.f48141b = arrayList;
        }

        public boolean a(int i11) {
            ArrayList<C0575c> arrayList;
            if ((this.f48140a & i11) != 0 && (arrayList = this.f48141b) != null) {
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    if (this.f48141b.get(i12).f48137a == i11) {
                        this.f48141b.remove(i12);
                        this.f48140a = (~i11) & this.f48140a;
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public c(View view) {
        this.f48123b = new WeakReference<>(view);
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

    public final void J(int i11, float f11) {
        float M = M(i11);
        L(i11, M, f11 - M);
    }

    public final void K(int i11, float f11) {
        L(i11, M(i11), f11);
    }

    public final void L(int i11, float f11, float f12) {
        bt.a aVar;
        if (this.f48134m.size() > 0) {
            Iterator<bt.a> it = this.f48134m.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    aVar = null;
                    break;
                }
                bt.a next = it.next();
                d dVar = this.f48134m.get(next);
                if (dVar.a(i11) && dVar.f48140a == 0) {
                    aVar = next;
                    break;
                }
            }
            if (aVar != null) {
                aVar.cancel();
            }
        }
        this.f48132k.add(new C0575c(i11, f11, f12));
        View view = this.f48123b.get();
        if (view != null) {
            view.removeCallbacks(this.f48133l);
            view.post(this.f48133l);
        }
    }

    public final float M(int i11) {
        View view = this.f48123b.get();
        if (view == null) {
            return 0.0f;
        }
        if (i11 == 1) {
            return view.getTranslationX();
        }
        if (i11 == 2) {
            return view.getTranslationY();
        }
        if (i11 == 4) {
            return view.getScaleX();
        }
        if (i11 == 8) {
            return view.getScaleY();
        }
        if (i11 == 16) {
            return view.getRotation();
        }
        if (i11 == 32) {
            return view.getRotationX();
        }
        if (i11 == 64) {
            return view.getRotationY();
        }
        if (i11 == 128) {
            return view.getX();
        }
        if (i11 == 256) {
            return view.getY();
        }
        if (i11 != 512) {
            return 0.0f;
        }
        return view.getAlpha();
    }

    public final void N(int i11, float f11) {
        View view = this.f48123b.get();
        if (view != null) {
            if (i11 == 1) {
                view.setTranslationX(f11);
                return;
            }
            if (i11 == 2) {
                view.setTranslationY(f11);
                return;
            }
            if (i11 == 4) {
                view.setScaleX(f11);
                return;
            }
            if (i11 == 8) {
                view.setScaleY(f11);
                return;
            }
            if (i11 == 16) {
                view.setRotation(f11);
                return;
            }
            if (i11 == 32) {
                view.setRotationX(f11);
                return;
            }
            if (i11 == 64) {
                view.setRotationY(f11);
                return;
            }
            if (i11 == 128) {
                view.setX(f11);
            } else if (i11 == 256) {
                view.setY(f11);
            } else {
                if (i11 != 512) {
                    return;
                }
                view.setAlpha(f11);
            }
        }
    }

    public final void O() {
        q f02 = q.f0(1.0f);
        ArrayList arrayList = (ArrayList) this.f48132k.clone();
        this.f48132k.clear();
        int size = arrayList.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 |= ((C0575c) arrayList.get(i12)).f48137a;
        }
        this.f48134m.put(f02, new d(i11, arrayList));
        f02.G(this.f48131j);
        f02.a(this.f48131j);
        if (this.f48127f) {
            f02.n(this.f48126e);
        }
        if (this.f48125d) {
            f02.l(this.f48124c);
        }
        if (this.f48129h) {
            f02.m(this.f48128g);
        }
        f02.s();
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
        if (this.f48134m.size() > 0) {
            Iterator it = ((HashMap) this.f48134m.clone()).keySet().iterator();
            while (it.hasNext()) {
                ((bt.a) it.next()).cancel();
            }
        }
        this.f48132k.clear();
        View view = this.f48123b.get();
        if (view != null) {
            view.removeCallbacks(this.f48133l);
        }
    }

    @Override // dt.b
    public long e() {
        return this.f48125d ? this.f48124c : new q().d();
    }

    @Override // dt.b
    public long f() {
        if (this.f48127f) {
            return this.f48126e;
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
            this.f48125d = true;
            this.f48124c = j11;
            return this;
        }
        throw new IllegalArgumentException("Animators cannot have negative duration: " + j11);
    }

    @Override // dt.b
    public dt.b r(Interpolator interpolator) {
        this.f48129h = true;
        this.f48128g = interpolator;
        return this;
    }

    @Override // dt.b
    public dt.b s(a.InterfaceC0121a interfaceC0121a) {
        this.f48130i = interfaceC0121a;
        return this;
    }

    @Override // dt.b
    public dt.b t(long j11) {
        if (j11 >= 0) {
            this.f48127f = true;
            this.f48126e = j11;
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
