package e2;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.collision.BoundingBox;
import com.badlogic.gdx.utils.JsonValue;
import com.badlogic.gdx.utils.a;
import com.badlogic.gdx.utils.f;
import e2.a;
import e2.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c implements f.c, i.b {

    /* renamed from: l, reason: collision with root package name */
    public static final float f48375l = 0.016666668f;

    /* renamed from: a, reason: collision with root package name */
    public String f48376a;

    /* renamed from: b, reason: collision with root package name */
    public g2.a f48377b;

    /* renamed from: c, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<h2.d> f48378c;

    /* renamed from: d, reason: collision with root package name */
    public i2.g<?, ?> f48379d;

    /* renamed from: e, reason: collision with root package name */
    public a f48380e;

    /* renamed from: f, reason: collision with root package name */
    public b f48381f;

    /* renamed from: g, reason: collision with root package name */
    public Matrix4 f48382g;

    /* renamed from: h, reason: collision with root package name */
    public Vector3 f48383h;

    /* renamed from: i, reason: collision with root package name */
    public BoundingBox f48384i;

    /* renamed from: j, reason: collision with root package name */
    public float f48385j;

    /* renamed from: k, reason: collision with root package name */
    public float f48386k;

    public c() {
        this.f48382g = new Matrix4();
        this.f48383h = new Vector3(1.0f, 1.0f, 1.0f);
        this.f48378c = new com.badlogic.gdx.utils.a<>(true, 3, h2.d.class);
        A(0.016666668f);
    }

    public final void A(float f11) {
        this.f48385j = f11;
        this.f48386k = f11 * f11;
    }

    public void B(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f48382g.set(f11, f12, f13, f14, f15, f16, f17, f18, f18, f18);
        this.f48383h.set(f18, f18, f18);
    }

    public void C(Matrix4 matrix4) {
        this.f48382g.set(matrix4);
        matrix4.getScale(this.f48383h);
    }

    @Override // com.badlogic.gdx.utils.f.c
    public void D(com.badlogic.gdx.utils.f fVar, JsonValue jsonValue) {
        this.f48376a = (String) fVar.M("name", String.class, jsonValue);
        this.f48377b = (g2.a) fVar.M("emitter", g2.a.class, jsonValue);
        this.f48378c.g((com.badlogic.gdx.utils.a) fVar.N("influencers", com.badlogic.gdx.utils.a.class, h2.d.class, jsonValue));
        this.f48379d = (i2.g) fVar.M("renderer", i2.g.class, jsonValue);
    }

    public void E(Vector3 vector3) {
        this.f48382g.setTranslation(vector3);
    }

    public void F() {
        this.f48377b.w0();
        a.b<h2.d> it = this.f48378c.iterator();
        while (it.hasNext()) {
            it.next().w0();
        }
    }

    public void G(Vector3 vector3) {
        this.f48382g.translate(vector3);
    }

    public void H() {
        J(q1.g.f81379b.S());
    }

    public void J(float f11) {
        A(f11);
        this.f48377b.C0();
        a.b<h2.d> it = this.f48378c.iterator();
        while (it.hasNext()) {
            it.next().C0();
        }
    }

    public void a(int i11, int i12) {
        this.f48377b.R(i11, i12);
        a.b<h2.d> it = this.f48378c.iterator();
        while (it.hasNext()) {
            it.next().R(i11, i12);
        }
    }

    @Override // e2.i.b
    public void b(r1.e eVar, i iVar) {
        this.f48377b.b(eVar, iVar);
        a.b<h2.d> it = this.f48378c.iterator();
        while (it.hasNext()) {
            it.next().b(eVar, iVar);
        }
        this.f48379d.b(eVar, iVar);
    }

    public void d(int i11) {
        this.f48380e = new a(i11);
        this.f48377b.X();
        a.b<h2.d> it = this.f48378c.iterator();
        while (it.hasNext()) {
            it.next().X();
        }
        this.f48379d.X();
    }

    public void e() {
        this.f48377b.n0(this);
        a.b<h2.d> it = this.f48378c.iterator();
        while (it.hasNext()) {
            it.next().n0(this);
        }
        this.f48379d.n0(this);
    }

    public void end() {
        a.b<h2.d> it = this.f48378c.iterator();
        while (it.hasNext()) {
            it.next().end();
        }
        this.f48377b.end();
    }

    public void f() {
        this.f48384i.clr();
        a.d dVar = (a.d) this.f48380e.g(b.f48346d);
        int i11 = dVar.f48332c * this.f48380e.f48329c;
        for (int i12 = 0; i12 < i11; i12 += dVar.f48332c) {
            BoundingBox boundingBox = this.f48384i;
            float[] fArr = dVar.f48337e;
            boundingBox.ext(fArr[i12], fArr[i12 + 1], fArr[i12 + 2]);
        }
    }

    public c g() {
        g2.a aVar = (g2.a) this.f48377b.Z();
        com.badlogic.gdx.utils.a<h2.d> aVar2 = this.f48378c;
        h2.d[] dVarArr = new h2.d[aVar2.f13179b];
        a.b<h2.d> it = aVar2.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            dVarArr[i11] = (h2.d) it.next().Z();
            i11++;
        }
        return new c(new String(this.f48376a), aVar, (i2.g) this.f48379d.Z(), dVarArr);
    }

    public void h() {
        this.f48377b.dispose();
        a.b<h2.d> it = this.f48378c.iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
    }

    public void i() {
        if (this.f48380e.f48329c > 0) {
            this.f48379d.C0();
        }
    }

    public final <K extends h2.d> int j(Class<K> cls) {
        int i11 = 0;
        while (true) {
            com.badlogic.gdx.utils.a<h2.d> aVar = this.f48378c;
            if (i11 >= aVar.f13179b) {
                return -1;
            }
            if (g3.c.y(cls, aVar.get(i11).getClass())) {
                return i11;
            }
            i11++;
        }
    }

    public <K extends h2.d> K k(Class<K> cls) {
        int j11 = j(cls);
        if (j11 > -1) {
            return (K) this.f48378c.get(j11);
        }
        return null;
    }

    public BoundingBox l() {
        if (this.f48384i == null) {
            this.f48384i = new BoundingBox();
        }
        f();
        return this.f48384i;
    }

    public void m(Matrix4 matrix4) {
        matrix4.set(this.f48382g);
    }

    public void n() {
        e();
        if (this.f48380e != null) {
            end();
            this.f48381f.c();
        }
        d(this.f48377b.f52561m);
        this.f48377b.init();
        a.b<h2.d> it = this.f48378c.iterator();
        while (it.hasNext()) {
            it.next().init();
        }
        this.f48379d.init();
    }

    @Override // e2.i.b
    public void o(r1.e eVar, i iVar) {
        this.f48377b.o(eVar, iVar);
        a.b<h2.d> it = this.f48378c.iterator();
        while (it.hasNext()) {
            it.next().o(eVar, iVar);
        }
        this.f48379d.o(eVar, iVar);
    }

    public boolean p() {
        return this.f48377b.V0();
    }

    public void q(int i11, int i12) {
        this.f48377b.i0(i11, i12);
        a.b<h2.d> it = this.f48378c.iterator();
        while (it.hasNext()) {
            it.next().i0(i11, i12);
        }
    }

    public void r(Matrix4 matrix4) {
        this.f48382g.mul(matrix4);
        this.f48382g.getScale(this.f48383h);
    }

    public <K extends h2.d> void s(Class<K> cls) {
        int j11 = j(cls);
        if (j11 > -1) {
            this.f48378c.A(j11);
        }
    }

    public <K extends h2.d> boolean t(Class<K> cls, K k11) {
        int j11 = j(cls);
        if (j11 <= -1) {
            return false;
        }
        this.f48378c.r(j11, k11);
        this.f48378c.A(j11 + 1);
        return true;
    }

    public void u() {
        end();
        F();
    }

    public void v(Quaternion quaternion) {
        this.f48382g.rotate(quaternion);
    }

    public void w(Vector3 vector3, float f11) {
        this.f48382g.rotate(vector3, f11);
    }

    public void x(float f11, float f12, float f13) {
        this.f48382g.scale(f11, f12, f13);
        this.f48382g.getScale(this.f48383h);
    }

    public void y(Vector3 vector3) {
        x(vector3.f12537x, vector3.f12538y, vector3.f12539z);
    }

    @Override // com.badlogic.gdx.utils.f.c
    public void z(com.badlogic.gdx.utils.f fVar) {
        fVar.F0("name", this.f48376a);
        fVar.G0("emitter", this.f48377b, g2.a.class);
        fVar.H0("influencers", this.f48378c, com.badlogic.gdx.utils.a.class, h2.d.class);
        fVar.G0("renderer", this.f48379d, i2.g.class);
    }

    public c(String str, g2.a aVar, i2.g<?, ?> gVar, h2.d... dVarArr) {
        this();
        this.f48376a = str;
        this.f48377b = aVar;
        this.f48379d = gVar;
        this.f48381f = new b();
        this.f48378c = new com.badlogic.gdx.utils.a<>(dVarArr);
    }
}
