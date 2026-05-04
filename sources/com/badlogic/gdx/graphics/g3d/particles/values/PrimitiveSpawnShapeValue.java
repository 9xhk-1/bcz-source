package com.badlogic.gdx.graphics.g3d.particles.values;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.JsonValue;
import com.badlogic.gdx.utils.f;
import j2.j;
import j2.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class PrimitiveSpawnShapeValue extends k {

    /* renamed from: o, reason: collision with root package name */
    public static final Vector3 f12194o = new Vector3();

    /* renamed from: e, reason: collision with root package name */
    public j f12195e;

    /* renamed from: f, reason: collision with root package name */
    public j f12196f;

    /* renamed from: g, reason: collision with root package name */
    public j f12197g;

    /* renamed from: h, reason: collision with root package name */
    public float f12198h;

    /* renamed from: i, reason: collision with root package name */
    public float f12199i;

    /* renamed from: j, reason: collision with root package name */
    public float f12200j;

    /* renamed from: k, reason: collision with root package name */
    public float f12201k;

    /* renamed from: l, reason: collision with root package name */
    public float f12202l;

    /* renamed from: m, reason: collision with root package name */
    public float f12203m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f12204n;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum SpawnSide {
        both,
        top,
        bottom
    }

    public PrimitiveSpawnShapeValue() {
        this.f12204n = false;
        this.f12195e = new j();
        this.f12196f = new j();
        this.f12197g = new j();
    }

    @Override // j2.k, j2.f, com.badlogic.gdx.utils.f.c
    public void D(f fVar, JsonValue jsonValue) {
        super.D(fVar, jsonValue);
        this.f12195e = (j) fVar.M("spawnWidthValue", j.class, jsonValue);
        this.f12196f = (j) fVar.M("spawnHeightValue", j.class, jsonValue);
        this.f12197g = (j) fVar.M("spawnDepthValue", j.class, jsonValue);
        this.f12204n = ((Boolean) fVar.M("edges", Boolean.TYPE, jsonValue)).booleanValue();
    }

    @Override // j2.k, j2.f
    public void d(j2.f fVar) {
        super.d(fVar);
        PrimitiveSpawnShapeValue primitiveSpawnShapeValue = (PrimitiveSpawnShapeValue) fVar;
        this.f12204n = primitiveSpawnShapeValue.f12204n;
        this.f12195e.u(primitiveSpawnShapeValue.f12195e);
        this.f12196f.u(primitiveSpawnShapeValue.f12196f);
        this.f12197g.u(primitiveSpawnShapeValue.f12197g);
    }

    @Override // j2.f
    public void e(boolean z11) {
        super.e(z11);
        this.f12195e.e(true);
        this.f12196f.e(true);
        this.f12197g.e(true);
    }

    @Override // j2.k
    public void j() {
        this.f12198h = this.f12195e.i();
        this.f12199i = this.f12195e.v();
        if (!this.f12195e.t()) {
            this.f12199i -= this.f12198h;
        }
        this.f12200j = this.f12196f.i();
        this.f12201k = this.f12196f.v();
        if (!this.f12196f.t()) {
            this.f12201k -= this.f12200j;
        }
        this.f12202l = this.f12197g.i();
        this.f12203m = this.f12197g.v();
        if (this.f12197g.t()) {
            return;
        }
        this.f12203m -= this.f12202l;
    }

    public j k() {
        return this.f12197g;
    }

    public j l() {
        return this.f12196f;
    }

    public j m() {
        return this.f12195e;
    }

    public boolean n() {
        return this.f12204n;
    }

    public void p(float f11, float f12, float f13) {
        this.f12195e.w(f11);
        this.f12196f.w(f12);
        this.f12197g.w(f13);
    }

    public void q(boolean z11) {
        this.f12204n = z11;
    }

    @Override // j2.k, j2.f, com.badlogic.gdx.utils.f.c
    public void z(f fVar) {
        super.z(fVar);
        fVar.F0("spawnWidthValue", this.f12195e);
        fVar.F0("spawnHeightValue", this.f12196f);
        fVar.F0("spawnDepthValue", this.f12197g);
        fVar.F0("edges", Boolean.valueOf(this.f12204n));
    }

    public PrimitiveSpawnShapeValue(PrimitiveSpawnShapeValue primitiveSpawnShapeValue) {
        super(primitiveSpawnShapeValue);
        this.f12204n = false;
        this.f12195e = new j();
        this.f12196f = new j();
        this.f12197g = new j();
    }
}
