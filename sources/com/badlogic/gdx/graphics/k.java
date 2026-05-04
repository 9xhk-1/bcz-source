package com.badlogic.gdx.graphics;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class k extends a {

    /* renamed from: o, reason: collision with root package name */
    public float f12458o = 1.0f;

    /* renamed from: p, reason: collision with root package name */
    public final Vector3 f12459p = new Vector3();

    public k() {
        this.f11515h = 0.0f;
    }

    @Override // com.badlogic.gdx.graphics.a
    public void r() {
        s(true);
    }

    @Override // com.badlogic.gdx.graphics.a
    public void s(boolean z11) {
        Matrix4 matrix4 = this.f11511d;
        float f11 = this.f12458o;
        float f12 = this.f11517j;
        float f13 = this.f11518k;
        matrix4.setToOrtho(((-f12) * f11) / 2.0f, (f12 / 2.0f) * f11, (-(f13 / 2.0f)) * f11, (f11 * f13) / 2.0f, this.f11515h, this.f11516i);
        this.f11512e.setToLookAt(this.f11509b, this.f11510c);
        Matrix4 matrix42 = this.f11512e;
        Vector3 vector3 = this.f11508a;
        matrix42.translate(-vector3.f12537x, -vector3.f12538y, -vector3.f12539z);
        this.f11513f.set(this.f11511d);
        Matrix4.mul(this.f11513f.val, this.f11512e.val);
        if (z11) {
            this.f11514g.set(this.f11513f);
            Matrix4.inv(this.f11514g.val);
            this.f11519l.k(this.f11514g);
        }
    }

    public void t(float f11) {
        k(this.f11509b, f11);
    }

    public void u(boolean z11) {
        v(z11, q1.g.f81379b.getWidth(), q1.g.f81379b.getHeight());
    }

    public void v(boolean z11, float f11, float f12) {
        if (z11) {
            this.f11510c.set(0.0f, -1.0f, 0.0f);
            this.f11509b.set(0.0f, 0.0f, 1.0f);
        } else {
            this.f11510c.set(0.0f, 1.0f, 0.0f);
            this.f11509b.set(0.0f, 0.0f, -1.0f);
        }
        Vector3 vector3 = this.f11508a;
        float f13 = this.f12458o;
        vector3.set((f13 * f11) / 2.0f, (f13 * f12) / 2.0f, 0.0f);
        this.f11517j = f11;
        this.f11518k = f12;
        r();
    }

    public void w(float f11, float f12) {
        n(f11, f12, 0.0f);
    }

    public void x(Vector2 vector2) {
        n(vector2.f12535x, vector2.f12536y, 0.0f);
    }

    public k(float f11, float f12) {
        this.f11517j = f11;
        this.f11518k = f12;
        this.f11515h = 0.0f;
        r();
    }
}
