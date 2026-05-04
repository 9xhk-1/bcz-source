package l2;

import a3.x;
import com.badlogic.gdx.math.Vector3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class i extends q1.h {

    /* renamed from: a, reason: collision with root package name */
    public final com.badlogic.gdx.graphics.a f69186a;

    /* renamed from: b, reason: collision with root package name */
    public final x f69187b = new x();

    /* renamed from: c, reason: collision with root package name */
    public int f69188c = 29;

    /* renamed from: d, reason: collision with root package name */
    public int f69189d = 32;

    /* renamed from: e, reason: collision with root package name */
    public int f69190e = 51;

    /* renamed from: f, reason: collision with root package name */
    public int f69191f = 47;

    /* renamed from: g, reason: collision with root package name */
    public int f69192g = 45;

    /* renamed from: h, reason: collision with root package name */
    public int f69193h = 33;

    /* renamed from: i, reason: collision with root package name */
    public boolean f69194i = true;

    /* renamed from: j, reason: collision with root package name */
    public float f69195j = 5.0f;

    /* renamed from: k, reason: collision with root package name */
    public float f69196k = 0.5f;

    /* renamed from: l, reason: collision with root package name */
    public final Vector3 f69197l = new Vector3();

    public i(com.badlogic.gdx.graphics.a aVar) {
        this.f69186a = aVar;
    }

    public void C0() {
        J0(q1.g.f81379b.S());
    }

    @Override // q1.h, q1.k
    public boolean I(int i11, int i12, int i13) {
        float f11 = (-q1.g.f81381d.g()) * this.f69196k;
        float f12 = (-q1.g.f81381d.P()) * this.f69196k;
        com.badlogic.gdx.graphics.a aVar = this.f69186a;
        aVar.f11509b.rotate(aVar.f11510c, f11);
        this.f69197l.set(this.f69186a.f11509b).crs(this.f69186a.f11510c).nor();
        this.f69186a.f11509b.rotate(this.f69197l, f12);
        return true;
    }

    public void J0(float f11) {
        if (this.f69187b.b(this.f69190e)) {
            this.f69197l.set(this.f69186a.f11509b).nor().scl(this.f69195j * f11);
            this.f69186a.f11508a.add(this.f69197l);
        }
        if (this.f69187b.b(this.f69191f)) {
            this.f69197l.set(this.f69186a.f11509b).nor().scl((-f11) * this.f69195j);
            this.f69186a.f11508a.add(this.f69197l);
        }
        if (this.f69187b.b(this.f69188c)) {
            this.f69197l.set(this.f69186a.f11509b).crs(this.f69186a.f11510c).nor().scl((-f11) * this.f69195j);
            this.f69186a.f11508a.add(this.f69197l);
        }
        if (this.f69187b.b(this.f69189d)) {
            this.f69197l.set(this.f69186a.f11509b).crs(this.f69186a.f11510c).nor().scl(this.f69195j * f11);
            this.f69186a.f11508a.add(this.f69197l);
        }
        if (this.f69187b.b(this.f69192g)) {
            this.f69197l.set(this.f69186a.f11510c).nor().scl(this.f69195j * f11);
            this.f69186a.f11508a.add(this.f69197l);
        }
        if (this.f69187b.b(this.f69193h)) {
            this.f69197l.set(this.f69186a.f11510c).nor().scl((-f11) * this.f69195j);
            this.f69186a.f11508a.add(this.f69197l);
        }
        if (this.f69194i) {
            this.f69186a.s(true);
        }
    }

    @Override // q1.h, q1.k
    public boolean X(int i11) {
        this.f69187b.t(i11, 0);
        return true;
    }

    @Override // q1.h, q1.k
    public boolean Z(int i11) {
        this.f69187b.q(i11, i11);
        return true;
    }

    public void n0(float f11) {
        this.f69196k = f11;
    }

    public void w0(float f11) {
        this.f69195j = f11;
    }
}
