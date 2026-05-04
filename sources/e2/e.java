package e2;

import a3.q;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.collision.BoundingBox;
import com.badlogic.gdx.utils.a;
import e2.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class e implements q, i.b {

    /* renamed from: a, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<c> f48398a;

    /* renamed from: b, reason: collision with root package name */
    public BoundingBox f48399b;

    public e() {
        this.f48398a = new com.badlogic.gdx.utils.a<>(true, 3, c.class);
    }

    public void C0(Vector3 vector3, float f11) {
        int i11 = this.f48398a.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f48398a.get(i12).w(vector3, f11);
        }
    }

    public void D() {
        int i11 = this.f48398a.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f48398a.get(i12).i();
        }
    }

    public void J0(float f11, float f12, float f13) {
        int i11 = this.f48398a.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f48398a.get(i12).x(f11, f12, f13);
        }
    }

    public void Q0(Vector3 vector3) {
        int i11 = this.f48398a.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f48398a.get(i12).x(vector3.f12537x, vector3.f12538y, vector3.f12539z);
        }
    }

    public c R(String str) {
        int i11 = this.f48398a.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            c cVar = this.f48398a.get(i12);
            if (cVar.f48376a.equals(str)) {
                return cVar;
            }
        }
        return null;
    }

    public void V0(com.badlogic.gdx.utils.a<f2.d<?>> aVar) {
        a.b<c> it = this.f48398a.iterator();
        while (it.hasNext()) {
            c next = it.next();
            a.b<f2.d<?>> it2 = aVar.iterator();
            while (it2.hasNext()) {
                if (next.f48379d.Q0(it2.next())) {
                    break;
                }
            }
        }
    }

    public BoundingBox X() {
        if (this.f48399b == null) {
            this.f48399b = new BoundingBox();
        }
        BoundingBox boundingBox = this.f48399b;
        boundingBox.inf();
        a.b<c> it = this.f48398a.iterator();
        while (it.hasNext()) {
            boundingBox.ext(it.next().l());
        }
        return boundingBox;
    }

    public com.badlogic.gdx.utils.a<c> Z() {
        return this.f48398a;
    }

    public void a1(Matrix4 matrix4) {
        int i11 = this.f48398a.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f48398a.get(i12).C(matrix4);
        }
    }

    @Override // e2.i.b
    public void b(r1.e eVar, i iVar) {
        a.b<c> it = this.f48398a.iterator();
        while (it.hasNext()) {
            it.next().b(eVar, iVar);
        }
    }

    public void b1() {
        int i11 = this.f48398a.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f48398a.get(i12).F();
        }
    }

    public void c1(Vector3 vector3) {
        int i11 = this.f48398a.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f48398a.get(i12).G(vector3);
        }
    }

    public void d1() {
        int i11 = this.f48398a.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f48398a.get(i12).H();
        }
    }

    @Override // a3.q
    public void dispose() {
        int i11 = this.f48398a.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f48398a.get(i12).h();
        }
    }

    public void e1(float f11) {
        int i11 = this.f48398a.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f48398a.get(i12).J(f11);
        }
    }

    public void end() {
        int i11 = this.f48398a.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f48398a.get(i12).end();
        }
    }

    public boolean i0() {
        int i11 = this.f48398a.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (!this.f48398a.get(i12).p()) {
                return false;
            }
        }
        return true;
    }

    public void init() {
        int i11 = this.f48398a.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f48398a.get(i12).n();
        }
    }

    public void n0() {
        int i11 = this.f48398a.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f48398a.get(i12).u();
        }
    }

    @Override // e2.i.b
    public void o(r1.e eVar, i iVar) {
        a.b<c> it = this.f48398a.iterator();
        while (it.hasNext()) {
            it.next().o(eVar, iVar);
        }
    }

    public void w0(Quaternion quaternion) {
        int i11 = this.f48398a.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f48398a.get(i12).v(quaternion);
        }
    }

    public e z() {
        return new e(this);
    }

    public e(e eVar) {
        this.f48398a = new com.badlogic.gdx.utils.a<>(true, eVar.f48398a.f13179b);
        int i11 = eVar.f48398a.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f48398a.a(eVar.f48398a.get(i12).g());
        }
    }

    public e(c... cVarArr) {
        this.f48398a = new com.badlogic.gdx.utils.a<>(cVarArr);
    }
}
