package j2;

import com.badlogic.gdx.math.n;
import com.badlogic.gdx.utils.JsonValue;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class h extends f {

    /* renamed from: b, reason: collision with root package name */
    public float f63146b;

    /* renamed from: c, reason: collision with root package name */
    public float f63147c;

    @Override // j2.f, com.badlogic.gdx.utils.f.c
    public void D(com.badlogic.gdx.utils.f fVar, JsonValue jsonValue) {
        super.D(fVar, jsonValue);
        Class cls = Float.TYPE;
        this.f63146b = ((Float) fVar.M("lowMin", cls, jsonValue)).floatValue();
        this.f63147c = ((Float) fVar.M("lowMax", cls, jsonValue)).floatValue();
    }

    public float f() {
        return this.f63147c;
    }

    public float g() {
        return this.f63146b;
    }

    public void h(h hVar) {
        super.d(hVar);
        this.f63147c = hVar.f63147c;
        this.f63146b = hVar.f63146b;
    }

    public float i() {
        float f11 = this.f63146b;
        return f11 + ((this.f63147c - f11) * n.J());
    }

    public void j(float f11) {
        this.f63146b = f11;
        this.f63147c = f11;
    }

    public void k(float f11, float f12) {
        this.f63146b = f11;
        this.f63147c = f12;
    }

    public void l(float f11) {
        this.f63147c = f11;
    }

    public void m(float f11) {
        this.f63146b = f11;
    }

    @Override // j2.f, com.badlogic.gdx.utils.f.c
    public void z(com.badlogic.gdx.utils.f fVar) {
        super.z(fVar);
        fVar.F0("lowMin", Float.valueOf(this.f63146b));
        fVar.F0("lowMax", Float.valueOf(this.f63147c));
    }
}
