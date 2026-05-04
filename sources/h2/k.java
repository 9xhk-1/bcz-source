package h2;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.JsonValue;
import e2.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class k extends d {

    /* renamed from: l, reason: collision with root package name */
    public j2.k f58037l;

    /* renamed from: m, reason: collision with root package name */
    public a.d f58038m;

    /* renamed from: n, reason: collision with root package name */
    public a.d f58039n;

    public k() {
        this.f58037l = new j2.g();
    }

    @Override // e2.d, com.badlogic.gdx.utils.f.c
    public void D(com.badlogic.gdx.utils.f fVar, JsonValue jsonValue) {
        this.f58037l = (j2.k) fVar.M("spawnShape", j2.k.class, jsonValue);
    }

    @Override // e2.d
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public k Z() {
        return new k(this);
    }

    @Override // e2.d
    public void R(int i11, int i12) {
        int i13 = this.f58038m.f48332c;
        int i14 = i11 * i13;
        int i15 = (i13 * i12) + i14;
        while (i14 < i15) {
            j2.k kVar = this.f58037l;
            Vector3 vector3 = e2.d.f48387b;
            kVar.h(vector3, this.f48397a.f48377b.f52562n);
            vector3.mul(this.f48397a.f48382g);
            a.d dVar = this.f58038m;
            float[] fArr = dVar.f48337e;
            fArr[i14] = vector3.f12537x;
            fArr[i14 + 1] = vector3.f12538y;
            fArr[i14 + 2] = vector3.f12539z;
            i14 += dVar.f48332c;
        }
        int i16 = this.f58039n.f48332c;
        int i17 = i11 * i16;
        int i18 = (i12 * i16) + i17;
        while (i17 < i18) {
            Matrix4 matrix4 = this.f48397a.f48382g;
            Quaternion quaternion = e2.d.f48393h;
            matrix4.getRotation(quaternion, true);
            a.d dVar2 = this.f58039n;
            float[] fArr2 = dVar2.f48337e;
            fArr2[i17] = quaternion.f12530x;
            fArr2[i17 + 1] = quaternion.f12531y;
            fArr2[i17 + 2] = quaternion.f12532z;
            fArr2[i17 + 3] = quaternion.f12529w;
            i17 += dVar2.f48332c;
        }
    }

    @Override // e2.d
    public void X() {
        this.f58038m = (a.d) this.f48397a.f48380e.a(e2.b.f48346d);
        this.f58039n = (a.d) this.f48397a.f48380e.a(e2.b.f48351i);
    }

    @Override // e2.d, e2.i.b
    public void b(r1.e eVar, e2.i iVar) {
        this.f58037l.b(eVar, iVar);
    }

    @Override // e2.d
    public void init() {
        this.f58037l.g();
    }

    @Override // e2.d, e2.i.b
    public void o(r1.e eVar, e2.i iVar) {
        this.f58037l.o(eVar, iVar);
    }

    @Override // e2.d
    public void w0() {
        this.f58037l.j();
    }

    @Override // e2.d, com.badlogic.gdx.utils.f.c
    public void z(com.badlogic.gdx.utils.f fVar) {
        fVar.G0("spawnShape", this.f58037l, j2.k.class);
    }

    public k(j2.k kVar) {
        this.f58037l = kVar;
    }

    public k(k kVar) {
        this.f58037l = kVar.f58037l.f();
    }
}
