package em;

import android.graphics.DashPathEffect;
import android.util.Log;
import com.github.mikephil.charting.components.LimitLine;
import hm.l;
import java.util.ArrayList;
import java.util.List;
import rm.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class a extends b {

    /* renamed from: g, reason: collision with root package name */
    public l f49880g;

    /* renamed from: n, reason: collision with root package name */
    public int f49887n;

    /* renamed from: o, reason: collision with root package name */
    public int f49888o;

    /* renamed from: z, reason: collision with root package name */
    public List<LimitLine> f49899z;

    /* renamed from: h, reason: collision with root package name */
    public int f49881h = -7829368;

    /* renamed from: i, reason: collision with root package name */
    public float f49882i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    public int f49883j = -7829368;

    /* renamed from: k, reason: collision with root package name */
    public float f49884k = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    public float[] f49885l = new float[0];

    /* renamed from: m, reason: collision with root package name */
    public float[] f49886m = new float[0];

    /* renamed from: p, reason: collision with root package name */
    public int f49889p = 6;

    /* renamed from: q, reason: collision with root package name */
    public float f49890q = 1.0f;

    /* renamed from: r, reason: collision with root package name */
    public boolean f49891r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f49892s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f49893t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f49894u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f49895v = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f49896w = false;

    /* renamed from: x, reason: collision with root package name */
    public DashPathEffect f49897x = null;

    /* renamed from: y, reason: collision with root package name */
    public DashPathEffect f49898y = null;
    public boolean A = false;
    public boolean B = true;
    public float C = 0.0f;
    public float D = 0.0f;
    public boolean E = false;
    public boolean F = false;
    public float G = 0.0f;
    public float H = 0.0f;
    public float I = 0.0f;

    public a() {
        this.f49904e = k.e(10.0f);
        this.f49901b = k.e(5.0f);
        this.f49902c = k.e(5.0f);
        this.f49899z = new ArrayList();
    }

    public DashPathEffect A() {
        return this.f49898y;
    }

    public float B() {
        return this.f49882i;
    }

    public int C() {
        return this.f49889p;
    }

    public List<LimitLine> D() {
        return this.f49899z;
    }

    public String E() {
        String str = "";
        for (int i11 = 0; i11 < this.f49885l.length; i11++) {
            String x11 = x(i11);
            if (x11 != null && str.length() < x11.length()) {
                str = x11;
            }
        }
        return str;
    }

    public float F() {
        return this.D;
    }

    public float G() {
        return this.C;
    }

    public l H() {
        l lVar = this.f49880g;
        if (lVar == null || ((lVar instanceof hm.b) && ((hm.b) lVar).l() != this.f49888o)) {
            this.f49880g = new hm.b(this.f49888o);
        }
        return this.f49880g;
    }

    public boolean I() {
        return this.f49897x != null;
    }

    public boolean J() {
        return this.F;
    }

    public boolean K() {
        return this.E;
    }

    public boolean L() {
        return this.f49896w && this.f49887n > 0;
    }

    public boolean M() {
        return this.f49894u;
    }

    public boolean N() {
        return this.B;
    }

    public boolean O() {
        return this.f49893t;
    }

    public boolean P() {
        return this.f49895v;
    }

    public boolean Q() {
        return this.A;
    }

    public boolean R() {
        return this.f49892s;
    }

    public boolean S() {
        return this.f49891r;
    }

    public boolean T() {
        return this.f49898y != null;
    }

    public void U() {
        this.f49899z.clear();
    }

    public void V(LimitLine limitLine) {
        this.f49899z.remove(limitLine);
    }

    public void W() {
        this.F = false;
    }

    public void X() {
        this.E = false;
    }

    public void Y(int i11) {
        this.f49883j = i11;
    }

    public void Z(DashPathEffect dashPathEffect) {
        this.f49897x = dashPathEffect;
    }

    public void a0(float f11) {
        this.f49884k = k.e(f11);
    }

    @Deprecated
    public void b0(float f11) {
        c0(f11);
    }

    public void c0(float f11) {
        this.F = true;
        this.G = f11;
        this.I = Math.abs(f11 - this.H);
    }

    @Deprecated
    public void d0(float f11) {
        e0(f11);
    }

    public void e0(float f11) {
        this.E = true;
        this.H = f11;
        this.I = Math.abs(this.G - f11);
    }

    public void f0(boolean z11) {
        this.f49896w = z11;
    }

    public void g0(boolean z11) {
        this.f49894u = z11;
    }

    public void h0(boolean z11) {
        this.f49893t = z11;
    }

    public void i0(boolean z11) {
        this.B = z11;
    }

    public void j0(boolean z11) {
        this.f49895v = z11;
    }

    public void k0(boolean z11) {
        this.A = z11;
    }

    public void l0(float f11) {
        this.f49890q = f11;
        this.f49891r = true;
    }

    public void m(LimitLine limitLine) {
        this.f49899z.add(limitLine);
        if (this.f49899z.size() > 6) {
            Log.e("MPAndroiChart", "Warning! You have more than 6 LimitLines on your axis, do you really want that?");
        }
    }

    public void m0(boolean z11) {
        this.f49891r = z11;
    }

    public void n(float f11, float f12) {
        float f13 = this.E ? this.H : f11 - this.C;
        float f14 = this.F ? this.G : f12 + this.D;
        if (Math.abs(f14 - f13) == 0.0f) {
            f14 += 1.0f;
            f13 -= 1.0f;
        }
        this.H = f13;
        this.G = f14;
        this.I = Math.abs(f14 - f13);
    }

    public void n0(int i11) {
        this.f49881h = i11;
    }

    public void o() {
        this.f49897x = null;
    }

    public void o0(DashPathEffect dashPathEffect) {
        this.f49898y = dashPathEffect;
    }

    public void p() {
        this.f49898y = null;
    }

    public void p0(float f11) {
        this.f49882i = k.e(f11);
    }

    public void q(float f11, float f12, float f13) {
        this.f49897x = new DashPathEffect(new float[]{f11, f12}, f13);
    }

    public void q0(int i11) {
        if (i11 > 25) {
            i11 = 25;
        }
        if (i11 < 2) {
            i11 = 2;
        }
        this.f49889p = i11;
        this.f49892s = false;
    }

    public void r(float f11, float f12, float f13) {
        this.f49898y = new DashPathEffect(new float[]{f11, f12}, f13);
    }

    public void r0(int i11, boolean z11) {
        q0(i11);
        this.f49892s = z11;
    }

    public int s() {
        return this.f49883j;
    }

    public void s0(float f11) {
        this.D = f11;
    }

    public DashPathEffect t() {
        return this.f49897x;
    }

    public void t0(float f11) {
        this.C = f11;
    }

    public float u() {
        return this.f49884k;
    }

    public void u0(l lVar) {
        if (lVar == null) {
            this.f49880g = new hm.b(this.f49888o);
        } else {
            this.f49880g = lVar;
        }
    }

    public float v() {
        return this.G;
    }

    public float w() {
        return this.H;
    }

    public String x(int i11) {
        return (i11 < 0 || i11 >= this.f49885l.length) ? "" : H().c(this.f49885l[i11], this);
    }

    public float y() {
        return this.f49890q;
    }

    public int z() {
        return this.f49881h;
    }
}
