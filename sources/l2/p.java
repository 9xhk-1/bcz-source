package l2;

import a3.j0;
import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.utils.GdxRuntimeException;
import n2.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class p implements a3.q, x1.j {

    /* renamed from: a, reason: collision with root package name */
    public final j f69245a;

    /* renamed from: b, reason: collision with root package name */
    public final Mesh f69246b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f69247c;

    /* renamed from: d, reason: collision with root package name */
    public final String f69248d;

    /* renamed from: e, reason: collision with root package name */
    public final x1.i f69249e;

    public p() {
        this(5000, 5000, new com.badlogic.gdx.graphics.s(new com.badlogic.gdx.graphics.r(1, 3, w.f74225u), new com.badlogic.gdx.graphics.r(4, 4, w.f74227w)), 1);
    }

    public k D() {
        return R(1);
    }

    public k R(int i11) {
        if (this.f69247c) {
            throw new GdxRuntimeException("Call end() after calling begin()");
        }
        this.f69247c = true;
        this.f69245a.d(this.f69246b.r1());
        this.f69245a.a1("id", i11, this.f69249e.f97048b);
        return this.f69245a;
    }

    public x1.d X() {
        return this.f69249e.f97049c;
    }

    public Matrix4 Z() {
        return this.f69249e.f97047a;
    }

    @Override // a3.q
    public void dispose() {
        this.f69246b.dispose();
    }

    public void end() {
        if (!this.f69247c) {
            throw new GdxRuntimeException("Call begin() prior to calling end()");
        }
        this.f69247c = false;
        this.f69245a.j(this.f69246b);
    }

    @Override // x1.j
    public void z(com.badlogic.gdx.utils.a<x1.i> aVar, j0<x1.i> j0Var) {
        aVar.a(this.f69249e);
    }

    public p(int i11, int i12, com.badlogic.gdx.graphics.s sVar, int i13) {
        this.f69248d = "id";
        x1.i iVar = new x1.i();
        this.f69249e = iVar;
        Mesh mesh = new Mesh(false, i11, i12, sVar);
        this.f69246b = mesh;
        this.f69245a = new j();
        c2.b bVar = iVar.f97048b;
        bVar.f7490e = mesh;
        bVar.f7487b = i13;
        iVar.f97049c = new x1.d();
    }
}
