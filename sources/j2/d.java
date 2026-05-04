package j2;

import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.n;
import com.badlogic.gdx.utils.GdxRuntimeException;
import e2.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class d extends k {

    /* renamed from: e, reason: collision with root package name */
    public Mesh f63133e;

    /* renamed from: f, reason: collision with root package name */
    public x1.e f63134f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public float f63135a;

        /* renamed from: b, reason: collision with root package name */
        public float f63136b;

        /* renamed from: c, reason: collision with root package name */
        public float f63137c;

        /* renamed from: d, reason: collision with root package name */
        public float f63138d;

        /* renamed from: e, reason: collision with root package name */
        public float f63139e;

        /* renamed from: f, reason: collision with root package name */
        public float f63140f;

        /* renamed from: g, reason: collision with root package name */
        public float f63141g;

        /* renamed from: h, reason: collision with root package name */
        public float f63142h;

        /* renamed from: i, reason: collision with root package name */
        public float f63143i;

        public a(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
            this.f63135a = f11;
            this.f63136b = f12;
            this.f63137c = f13;
            this.f63138d = f14;
            this.f63139e = f15;
            this.f63140f = f16;
            this.f63141g = f17;
            this.f63142h = f18;
            this.f63143i = f19;
        }

        public static Vector3 a(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, Vector3 vector3) {
            float J = n.J();
            float J2 = n.J();
            return vector3.set(((f14 - f11) * J) + f11 + ((f17 - f11) * J2), ((f15 - f12) * J) + f12 + ((f18 - f12) * J2), (J * (f16 - f13)) + f13 + (J2 * (f19 - f13)));
        }

        public Vector3 b(Vector3 vector3) {
            float J = n.J();
            float J2 = n.J();
            float f11 = this.f63135a;
            float f12 = ((this.f63138d - f11) * J) + f11 + ((this.f63141g - f11) * J2);
            float f13 = this.f63136b;
            float f14 = ((this.f63139e - f13) * J) + f13 + ((this.f63142h - f13) * J2);
            float f15 = this.f63137c;
            return vector3.set(f12, f14, (J * (this.f63140f - f15)) + f15 + (J2 * (this.f63143i - f15)));
        }
    }

    public d(d dVar) {
        super(dVar);
    }

    @Override // j2.k, e2.i.b
    public void b(r1.e eVar, e2.i iVar) {
        i.c f11 = iVar.f();
        r1.a b11 = f11.b();
        if (b11 != null) {
            x1.e eVar2 = (x1.e) eVar.Q0(b11);
            l(eVar2.f97013d.get(((Integer) f11.a("index")).intValue()), eVar2);
        }
    }

    @Override // j2.k, j2.f
    public void d(f fVar) {
        super.d(fVar);
        d dVar = (d) fVar;
        l(dVar.f63133e, dVar.f63134f);
    }

    public void k(Mesh mesh) {
        l(mesh, null);
    }

    public void l(Mesh mesh, x1.e eVar) {
        if (mesh.q1(1) == null) {
            throw new GdxRuntimeException("Mesh vertices must have Usage.Position");
        }
        this.f63134f = eVar;
        this.f63133e = mesh;
    }

    @Override // j2.k, e2.i.b
    public void o(r1.e eVar, e2.i iVar) {
        if (this.f63134f != null) {
            i.c a11 = iVar.a();
            a11.d(eVar.a1(this.f63134f), x1.e.class);
            a11.c("index", Integer.valueOf(this.f63134f.f97013d.q(this.f63133e, true)));
        }
    }

    public d() {
    }
}
