package com.badlogic.gdx.graphics;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class l extends a {

    /* renamed from: o, reason: collision with root package name */
    public float f12460o;

    /* renamed from: p, reason: collision with root package name */
    public final Vector3 f12461p;

    public l() {
        this.f12460o = 67.0f;
        this.f12461p = new Vector3();
    }

    @Override // com.badlogic.gdx.graphics.a
    public void r() {
        s(true);
    }

    @Override // com.badlogic.gdx.graphics.a
    public void s(boolean z11) {
        this.f11511d.setToProjection(Math.abs(this.f11515h), Math.abs(this.f11516i), this.f12460o, this.f11517j / this.f11518k);
        Matrix4 matrix4 = this.f11512e;
        Vector3 vector3 = this.f11508a;
        matrix4.setToLookAt(vector3, this.f12461p.set(vector3).add(this.f11509b), this.f11510c);
        this.f11513f.set(this.f11511d);
        Matrix4.mul(this.f11513f.val, this.f11512e.val);
        if (z11) {
            this.f11514g.set(this.f11513f);
            Matrix4.inv(this.f11514g.val);
            this.f11519l.k(this.f11514g);
        }
    }

    public l(float f11, float f12, float f13) {
        this.f12460o = 67.0f;
        this.f12461p = new Vector3();
        this.f12460o = f11;
        this.f11517j = f12;
        this.f11518k = f13;
        r();
    }
}
