package a2;

import com.badlogic.gdx.math.Vector3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class e extends b<e> {

    /* renamed from: b, reason: collision with root package name */
    public final Vector3 f1412b = new Vector3();

    /* renamed from: c, reason: collision with root package name */
    public float f1413c;

    public e C0(float f11, float f12, float f13) {
        this.f1412b.set(f11, f12, f13);
        return this;
    }

    public boolean I(e eVar) {
        if (eVar == null) {
            return false;
        }
        if (eVar != this) {
            return this.f1404a.equals(eVar.f1404a) && this.f1412b.equals(eVar.f1412b) && this.f1413c == eVar.f1413c;
        }
        return true;
    }

    public e J0(Vector3 vector3) {
        this.f1412b.set(vector3);
        return this;
    }

    public e R(float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        this.f1404a.F(f11, f12, f13, 1.0f);
        this.f1412b.set(f14, f15, f16);
        this.f1413c = f17;
        return this;
    }

    public e X(float f11, float f12, float f13, Vector3 vector3, float f14) {
        this.f1404a.F(f11, f12, f13, 1.0f);
        if (vector3 != null) {
            this.f1412b.set(vector3);
        }
        this.f1413c = f14;
        return this;
    }

    public e Z(e eVar) {
        return n0(eVar.f1404a, eVar.f1412b, eVar.f1413c);
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && I((e) obj);
    }

    public e i0(com.badlogic.gdx.graphics.b bVar, float f11, float f12, float f13, float f14) {
        if (bVar != null) {
            this.f1404a.H(bVar);
        }
        this.f1412b.set(f11, f12, f13);
        this.f1413c = f14;
        return this;
    }

    public e n0(com.badlogic.gdx.graphics.b bVar, Vector3 vector3, float f11) {
        if (bVar != null) {
            this.f1404a.H(bVar);
        }
        if (vector3 != null) {
            this.f1412b.set(vector3);
        }
        this.f1413c = f11;
        return this;
    }

    public e w0(float f11) {
        this.f1413c = f11;
        return this;
    }
}
