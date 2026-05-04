package a2;

import a3.q;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.k;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector3;
import l2.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d extends c implements f, q {

    /* renamed from: c, reason: collision with root package name */
    public n2.f f1406c;

    /* renamed from: d, reason: collision with root package name */
    public com.badlogic.gdx.graphics.a f1407d;

    /* renamed from: e, reason: collision with root package name */
    public float f1408e;

    /* renamed from: f, reason: collision with root package name */
    public float f1409f;

    /* renamed from: g, reason: collision with root package name */
    public final Vector3 f1410g = new Vector3();

    /* renamed from: h, reason: collision with root package name */
    public final r f1411h;

    public d(int i11, int i12, float f11, float f12, float f13, float f14) {
        this.f1406c = new n2.f(Pixmap.Format.RGBA8888, i11, i12, true);
        k kVar = new k(f11, f12);
        this.f1407d = kVar;
        kVar.f11515h = f13;
        kVar.f11516i = f14;
        this.f1409f = f12 * 0.5f;
        this.f1408e = f13 + ((f14 - f13) * 0.5f);
        r rVar = new r();
        this.f1411h = rVar;
        Texture.TextureFilter textureFilter = Texture.TextureFilter.Nearest;
        rVar.f69252c = textureFilter;
        rVar.f69251b = textureFilter;
        Texture.TextureWrap textureWrap = Texture.TextureWrap.ClampToEdge;
        rVar.f69254e = textureWrap;
        rVar.f69253d = textureWrap;
    }

    public void J0(com.badlogic.gdx.graphics.a aVar) {
        b1(aVar);
        c();
    }

    public void Q0(Vector3 vector3, Vector3 vector32) {
        c1(vector3, vector32);
        c();
    }

    public com.badlogic.gdx.graphics.a V0() {
        return this.f1407d;
    }

    public n2.f a1() {
        return this.f1406c;
    }

    @Override // a2.f
    public r b() {
        this.f1411h.f69250a = this.f1406c.n0();
        return this.f1411h;
    }

    public void b1(com.badlogic.gdx.graphics.a aVar) {
        c1(this.f1410g.set(aVar.f11509b).scl(this.f1409f), aVar.f11509b);
    }

    public void c() {
        int d12 = this.f1406c.d1();
        int Q0 = this.f1406c.Q0();
        this.f1406c.c();
        q1.g.f81384g.glViewport(0, 0, d12, Q0);
        q1.g.f81384g.glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
        q1.g.f81384g.glClear(16640);
        q1.g.f81384g.glEnable(com.badlogic.gdx.graphics.f.f11588g0);
        q1.g.f81384g.glScissor(1, 1, d12 - 2, Q0 - 2);
    }

    public void c1(Vector3 vector3, Vector3 vector32) {
        this.f1407d.f11508a.set(this.f1405b).scl(-this.f1408e).add(vector3);
        this.f1407d.f11509b.set(this.f1405b).nor();
        this.f1407d.e();
        this.f1407d.r();
    }

    @Override // a3.q
    public void dispose() {
        n2.f fVar = this.f1406c;
        if (fVar != null) {
            fVar.dispose();
        }
        this.f1406c = null;
    }

    public void end() {
        q1.g.f81384g.glDisable(com.badlogic.gdx.graphics.f.f11588g0);
        this.f1406c.end();
    }

    @Override // a2.f
    public Matrix4 o() {
        return this.f1407d.f11513f;
    }
}
