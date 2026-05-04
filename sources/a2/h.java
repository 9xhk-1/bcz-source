package a2;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class h extends b<h> {

    /* renamed from: b, reason: collision with root package name */
    public final Vector3 f1416b = new Vector3();

    /* renamed from: c, reason: collision with root package name */
    public final Vector3 f1417c = new Vector3();

    /* renamed from: d, reason: collision with root package name */
    public float f1418d;

    /* renamed from: e, reason: collision with root package name */
    public float f1419e;

    /* renamed from: f, reason: collision with root package name */
    public float f1420f;

    public h C0(float f11, float f12, float f13) {
        this.f1417c.set(f11, f12, f13);
        return this;
    }

    public boolean I(h hVar) {
        if (hVar == null) {
            return false;
        }
        if (hVar != this) {
            return this.f1404a.equals(hVar.f1404a) && this.f1416b.equals(hVar.f1416b) && this.f1417c.equals(hVar.f1417c) && n.w(this.f1418d, hVar.f1418d) && n.w(this.f1419e, hVar.f1419e) && n.w(this.f1420f, hVar.f1420f);
        }
        return true;
    }

    public h J0(Vector3 vector3) {
        this.f1417c.set(vector3);
        return this;
    }

    public h Q0(float f11) {
        this.f1420f = f11;
        return this;
    }

    public h R(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, float f22, float f23) {
        this.f1404a.F(f11, f12, f13, 1.0f);
        this.f1416b.set(f14, f15, f16);
        this.f1417c.set(f17, f18, f19).nor();
        this.f1418d = f21;
        this.f1419e = f22;
        this.f1420f = f23;
        return this;
    }

    public h V0(float f11) {
        this.f1418d = f11;
        return this;
    }

    public h X(float f11, float f12, float f13, Vector3 vector3, Vector3 vector32, float f14, float f15, float f16) {
        this.f1404a.F(f11, f12, f13, 1.0f);
        if (vector3 != null) {
            this.f1416b.set(vector3);
        }
        if (vector32 != null) {
            this.f1417c.set(vector32).nor();
        }
        this.f1418d = f14;
        this.f1419e = f15;
        this.f1420f = f16;
        return this;
    }

    public h Z(h hVar) {
        return n0(hVar.f1404a, hVar.f1416b, hVar.f1417c, hVar.f1418d, hVar.f1419e, hVar.f1420f);
    }

    public h a1(float f11, float f12, float f13) {
        this.f1416b.set(f11, f12, f13);
        return this;
    }

    public h b1(Vector3 vector3) {
        this.f1416b.set(vector3);
        return this;
    }

    public h c1(Vector3 vector3) {
        this.f1417c.set(vector3).sub(this.f1416b).nor();
        return this;
    }

    public boolean equals(Object obj) {
        return (obj instanceof h) && I((h) obj);
    }

    public h i0(com.badlogic.gdx.graphics.b bVar, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        if (bVar != null) {
            this.f1404a.H(bVar);
        }
        this.f1416b.set(f11, f12, f13);
        this.f1417c.set(f14, f15, f16).nor();
        this.f1418d = f17;
        this.f1419e = f18;
        this.f1420f = f19;
        return this;
    }

    public h n0(com.badlogic.gdx.graphics.b bVar, Vector3 vector3, Vector3 vector32, float f11, float f12, float f13) {
        if (bVar != null) {
            this.f1404a.H(bVar);
        }
        if (vector3 != null) {
            this.f1416b.set(vector3);
        }
        if (vector32 != null) {
            this.f1417c.set(vector32).nor();
        }
        this.f1418d = f11;
        this.f1419e = f12;
        this.f1420f = f13;
        return this;
    }

    public h w0(float f11) {
        this.f1419e = f11;
        return this;
    }
}
