package j2;

import com.badlogic.gdx.utils.JsonValue;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class e extends f {

    /* renamed from: b, reason: collision with root package name */
    public float f63144b;

    @Override // j2.f, com.badlogic.gdx.utils.f.c
    public void D(com.badlogic.gdx.utils.f fVar, JsonValue jsonValue) {
        super.D(fVar, jsonValue);
        this.f63144b = ((Float) fVar.M("value", Float.TYPE, jsonValue)).floatValue();
    }

    public float f() {
        return this.f63144b;
    }

    public void g(e eVar) {
        super.d(eVar);
        this.f63144b = eVar.f63144b;
    }

    public void h(float f11) {
        this.f63144b = f11;
    }

    @Override // j2.f, com.badlogic.gdx.utils.f.c
    public void z(com.badlogic.gdx.utils.f fVar) {
        super.z(fVar);
        fVar.F0("value", Float.valueOf(this.f63144b));
    }
}
