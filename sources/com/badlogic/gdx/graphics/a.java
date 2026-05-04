package com.badlogic.gdx.graphics;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.collision.Ray;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final Vector3 f11508a = new Vector3();

    /* renamed from: b, reason: collision with root package name */
    public final Vector3 f11509b = new Vector3(0.0f, 0.0f, -1.0f);

    /* renamed from: c, reason: collision with root package name */
    public final Vector3 f11510c = new Vector3(0.0f, 1.0f, 0.0f);

    /* renamed from: d, reason: collision with root package name */
    public final Matrix4 f11511d = new Matrix4();

    /* renamed from: e, reason: collision with root package name */
    public final Matrix4 f11512e = new Matrix4();

    /* renamed from: f, reason: collision with root package name */
    public final Matrix4 f11513f = new Matrix4();

    /* renamed from: g, reason: collision with root package name */
    public final Matrix4 f11514g = new Matrix4();

    /* renamed from: h, reason: collision with root package name */
    public float f11515h = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f11516i = 100.0f;

    /* renamed from: j, reason: collision with root package name */
    public float f11517j = 0.0f;

    /* renamed from: k, reason: collision with root package name */
    public float f11518k = 0.0f;

    /* renamed from: l, reason: collision with root package name */
    public final com.badlogic.gdx.math.j f11519l = new com.badlogic.gdx.math.j();

    /* renamed from: m, reason: collision with root package name */
    public final Vector3 f11520m = new Vector3();

    /* renamed from: n, reason: collision with root package name */
    public final Ray f11521n = new Ray(new Vector3(), new Vector3());

    public Ray a(float f11, float f12) {
        return b(f11, f12, 0.0f, 0.0f, q1.g.f81379b.getWidth(), q1.g.f81379b.getHeight());
    }

    public Ray b(float f11, float f12, float f13, float f14, float f15, float f16) {
        q(this.f11521n.origin.set(f11, f12, 0.0f), f13, f14, f15, f16);
        q(this.f11521n.direction.set(f11, f12, 1.0f), f13, f14, f15, f16);
        Ray ray = this.f11521n;
        ray.direction.sub(ray.origin).nor();
        return this.f11521n;
    }

    public void c(float f11, float f12, float f13) {
        this.f11520m.set(f11, f12, f13).sub(this.f11508a).nor();
        if (this.f11520m.isZero()) {
            return;
        }
        float dot = this.f11520m.dot(this.f11510c);
        if (Math.abs(dot - 1.0f) < 1.0E-9f) {
            this.f11510c.set(this.f11509b).scl(-1.0f);
        } else if (Math.abs(dot + 1.0f) < 1.0E-9f) {
            this.f11510c.set(this.f11509b);
        }
        this.f11509b.set(this.f11520m);
        e();
    }

    public void d(Vector3 vector3) {
        c(vector3.f12537x, vector3.f12538y, vector3.f12539z);
    }

    public void e() {
        this.f11520m.set(this.f11509b).crs(this.f11510c);
        this.f11510c.set(this.f11520m).crs(this.f11509b).nor();
    }

    public Vector3 f(Vector3 vector3) {
        g(vector3, 0.0f, 0.0f, q1.g.f81379b.getWidth(), q1.g.f81379b.getHeight());
        return vector3;
    }

    public Vector3 g(Vector3 vector3, float f11, float f12, float f13, float f14) {
        vector3.prj(this.f11513f);
        vector3.f12537x = ((f13 * (vector3.f12537x + 1.0f)) / 2.0f) + f11;
        vector3.f12538y = ((f14 * (vector3.f12538y + 1.0f)) / 2.0f) + f12;
        vector3.f12539z = (vector3.f12539z + 1.0f) / 2.0f;
        return vector3;
    }

    public void h(float f11, float f12, float f13, float f14) {
        this.f11509b.rotate(f11, f12, f13, f14);
        this.f11510c.rotate(f11, f12, f13, f14);
    }

    public void i(Matrix4 matrix4) {
        this.f11509b.rot(matrix4);
        this.f11510c.rot(matrix4);
    }

    public void j(Quaternion quaternion) {
        quaternion.transform(this.f11509b);
        quaternion.transform(this.f11510c);
    }

    public void k(Vector3 vector3, float f11) {
        this.f11509b.rotate(vector3, f11);
        this.f11510c.rotate(vector3, f11);
    }

    public void l(Vector3 vector3, Vector3 vector32, float f11) {
        this.f11520m.set(vector3);
        this.f11520m.sub(this.f11508a);
        o(this.f11520m);
        k(vector32, f11);
        this.f11520m.rotate(vector32, f11);
        Vector3 vector33 = this.f11520m;
        n(-vector33.f12537x, -vector33.f12538y, -vector33.f12539z);
    }

    public void m(Matrix4 matrix4) {
        this.f11508a.mul(matrix4);
        i(matrix4);
    }

    public void n(float f11, float f12, float f13) {
        this.f11508a.add(f11, f12, f13);
    }

    public void o(Vector3 vector3) {
        this.f11508a.add(vector3);
    }

    public Vector3 p(Vector3 vector3) {
        q(vector3, 0.0f, 0.0f, q1.g.f81379b.getWidth(), q1.g.f81379b.getHeight());
        return vector3;
    }

    public Vector3 q(Vector3 vector3, float f11, float f12, float f13, float f14) {
        float f15 = vector3.f12537x - f11;
        float height = (q1.g.f81379b.getHeight() - vector3.f12538y) - f12;
        vector3.f12537x = ((f15 * 2.0f) / f13) - 1.0f;
        vector3.f12538y = ((height * 2.0f) / f14) - 1.0f;
        vector3.f12539z = (vector3.f12539z * 2.0f) - 1.0f;
        vector3.prj(this.f11514g);
        return vector3;
    }

    public abstract void r();

    public abstract void s(boolean z11);
}
