package j2;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.JsonValue;
import com.badlogic.gdx.utils.f;
import e2.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class k extends f implements i.b, f.c {

    /* renamed from: b, reason: collision with root package name */
    public h f63153b;

    /* renamed from: c, reason: collision with root package name */
    public h f63154c;

    /* renamed from: d, reason: collision with root package name */
    public h f63155d;

    public k() {
        this.f63153b = new h();
        this.f63154c = new h();
        this.f63155d = new h();
    }

    @Override // j2.f, com.badlogic.gdx.utils.f.c
    public void D(com.badlogic.gdx.utils.f fVar, JsonValue jsonValue) {
        super.D(fVar, jsonValue);
        this.f63153b = (h) fVar.M("xOffsetValue", h.class, jsonValue);
        this.f63154c = (h) fVar.M("yOffsetValue", h.class, jsonValue);
        this.f63155d = (h) fVar.M("zOffsetValue", h.class, jsonValue);
    }

    @Override // j2.f
    public void d(f fVar) {
        super.d(fVar);
        k kVar = (k) fVar;
        this.f63153b.h(kVar.f63153b);
        this.f63154c.h(kVar.f63154c);
        this.f63155d.h(kVar.f63155d);
    }

    public abstract k f();

    public final Vector3 h(Vector3 vector3, float f11) {
        i(vector3, f11);
        h hVar = this.f63153b;
        if (hVar.f63145a) {
            vector3.f12537x += hVar.i();
        }
        h hVar2 = this.f63154c;
        if (hVar2.f63145a) {
            vector3.f12538y += hVar2.i();
        }
        h hVar3 = this.f63155d;
        if (hVar3.f63145a) {
            vector3.f12539z += hVar3.i();
        }
        return vector3;
    }

    public abstract void i(Vector3 vector3, float f11);

    @Override // j2.f, com.badlogic.gdx.utils.f.c
    public void z(com.badlogic.gdx.utils.f fVar) {
        super.z(fVar);
        fVar.F0("xOffsetValue", this.f63153b);
        fVar.F0("yOffsetValue", this.f63154c);
        fVar.F0("zOffsetValue", this.f63155d);
    }

    public k(k kVar) {
        this();
    }

    public void g() {
    }

    public void j() {
    }

    public void b(r1.e eVar, e2.i iVar) {
    }

    public void o(r1.e eVar, e2.i iVar) {
    }
}
