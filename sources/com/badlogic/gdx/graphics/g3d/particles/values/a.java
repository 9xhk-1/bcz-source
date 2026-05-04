package com.badlogic.gdx.graphics.g3d.particles.values;

import com.badlogic.gdx.graphics.g3d.particles.values.PrimitiveSpawnShapeValue;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.n;
import com.badlogic.gdx.utils.JsonValue;
import com.badlogic.gdx.utils.f;
import j2.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a extends PrimitiveSpawnShapeValue {

    /* renamed from: p, reason: collision with root package name */
    public PrimitiveSpawnShapeValue.SpawnSide f12205p;

    public a(a aVar) {
        super(aVar);
        this.f12205p = PrimitiveSpawnShapeValue.SpawnSide.both;
        d(aVar);
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.values.PrimitiveSpawnShapeValue, j2.k, j2.f, com.badlogic.gdx.utils.f.c
    public void D(f fVar, JsonValue jsonValue) {
        super.D(fVar, jsonValue);
        this.f12205p = (PrimitiveSpawnShapeValue.SpawnSide) fVar.M("side", PrimitiveSpawnShapeValue.SpawnSide.class, jsonValue);
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.values.PrimitiveSpawnShapeValue, j2.k, j2.f
    public void d(j2.f fVar) {
        super.d(fVar);
        this.f12205p = ((a) fVar).f12205p;
    }

    @Override // j2.k
    public k f() {
        return new a(this);
    }

    @Override // j2.k
    public void i(Vector3 vector3, float f11) {
        float K;
        float K2;
        float K3;
        float q11 = this.f12198h + (this.f12199i * this.f12195e.q(f11));
        float q12 = this.f12200j + (this.f12201k * this.f12196f.q(f11));
        float q13 = this.f12202l + (this.f12203m * this.f12197g.q(f11));
        PrimitiveSpawnShapeValue.SpawnSide spawnSide = this.f12205p;
        float L = n.L(0.0f, spawnSide == PrimitiveSpawnShapeValue.SpawnSide.top ? 3.1415927f : spawnSide == PrimitiveSpawnShapeValue.SpawnSide.bottom ? -3.1415927f : 6.2831855f);
        if (!this.f12204n) {
            K = n.K(q11 / 2.0f);
            K2 = n.K(q12 / 2.0f);
            K3 = n.K(q13 / 2.0f);
        } else {
            if (q11 == 0.0f) {
                vector3.set(0.0f, (q12 / 2.0f) * n.Z(L), (q13 / 2.0f) * n.s(L));
                return;
            }
            if (q12 == 0.0f) {
                vector3.set((q11 / 2.0f) * n.s(L), 0.0f, (q13 / 2.0f) * n.Z(L));
                return;
            } else if (q13 == 0.0f) {
                vector3.set((q11 / 2.0f) * n.s(L), (q12 / 2.0f) * n.Z(L), 0.0f);
                return;
            } else {
                K = q11 / 2.0f;
                K2 = q12 / 2.0f;
                K3 = q13 / 2.0f;
            }
        }
        float L2 = n.L(-1.0f, 1.0f);
        float sqrt = (float) Math.sqrt(1.0f - (L2 * L2));
        vector3.set(K * sqrt * n.s(L), K2 * sqrt * n.Z(L), K3 * L2);
    }

    public PrimitiveSpawnShapeValue.SpawnSide r() {
        return this.f12205p;
    }

    public void s(PrimitiveSpawnShapeValue.SpawnSide spawnSide) {
        this.f12205p = spawnSide;
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.values.PrimitiveSpawnShapeValue, j2.k, j2.f, com.badlogic.gdx.utils.f.c
    public void z(f fVar) {
        super.z(fVar);
        fVar.F0("side", this.f12205p);
    }

    public a() {
        this.f12205p = PrimitiveSpawnShapeValue.SpawnSide.both;
    }
}
