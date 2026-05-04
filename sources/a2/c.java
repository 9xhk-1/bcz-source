package a2;

import com.badlogic.gdx.math.Vector3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c extends b<c> {

    /* renamed from: b, reason: collision with root package name */
    public final Vector3 f1405b = new Vector3();

    public c C0(Vector3 vector3) {
        this.f1405b.set(vector3);
        return this;
    }

    public boolean I(c cVar) {
        if (cVar == null) {
            return false;
        }
        if (cVar != this) {
            return this.f1404a.equals(cVar.f1404a) && this.f1405b.equals(cVar.f1405b);
        }
        return true;
    }

    public c R(float f11, float f12, float f13, float f14, float f15, float f16) {
        this.f1404a.F(f11, f12, f13, 1.0f);
        this.f1405b.set(f14, f15, f16).nor();
        return this;
    }

    public c X(float f11, float f12, float f13, Vector3 vector3) {
        this.f1404a.F(f11, f12, f13, 1.0f);
        if (vector3 != null) {
            this.f1405b.set(vector3).nor();
        }
        return this;
    }

    public c Z(c cVar) {
        return n0(cVar.f1404a, cVar.f1405b);
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && I((c) obj);
    }

    public c i0(com.badlogic.gdx.graphics.b bVar, float f11, float f12, float f13) {
        if (bVar != null) {
            this.f1404a.H(bVar);
        }
        this.f1405b.set(f11, f12, f13).nor();
        return this;
    }

    public c n0(com.badlogic.gdx.graphics.b bVar, Vector3 vector3) {
        if (bVar != null) {
            this.f1404a.H(bVar);
        }
        if (vector3 != null) {
            this.f1405b.set(vector3).nor();
        }
        return this;
    }

    public c w0(float f11, float f12, float f13) {
        this.f1405b.set(f11, f12, f13);
        return this;
    }
}
