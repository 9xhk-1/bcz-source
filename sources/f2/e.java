package f2;

import a3.j0;
import com.badlogic.gdx.Application;
import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.f;
import com.badlogic.gdx.graphics.g3d.particles.ParticleShader;
import com.badlogic.gdx.graphics.r;
import com.badlogic.gdx.graphics.s;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.a;
import e2.a;
import e2.i;
import i2.h;
import n2.w;
import q1.g;
import x1.i;
import y1.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class e extends b<h> {

    /* renamed from: j, reason: collision with root package name */
    public static boolean f50381j = false;

    /* renamed from: k, reason: collision with root package name */
    public static final Vector3 f50382k = new Vector3();

    /* renamed from: l, reason: collision with root package name */
    public static final int f50383l = 512;

    /* renamed from: m, reason: collision with root package name */
    public static final s f50384m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f50385n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f50386o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f50387p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f50388q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f50389r;

    /* renamed from: f, reason: collision with root package name */
    public float[] f50390f;

    /* renamed from: g, reason: collision with root package name */
    public i f50391g;

    /* renamed from: h, reason: collision with root package name */
    public y1.a f50392h;

    /* renamed from: i, reason: collision with root package name */
    public y1.d f50393i;

    static {
        s sVar = new s(new r(1, 3, w.f74225u), new r(2, 4, w.f74227w), new r(16, 4, "a_region"), new r(512, 3, "a_sizeAndRotation"));
        f50384m = sVar;
        f50385n = (short) (sVar.f12497b / 4);
        f50386o = (short) (sVar.d(1).f12492e / 4);
        f50387p = (short) (sVar.d(2).f12492e / 4);
        f50388q = (short) (sVar.d(16).f12492e / 4);
        f50389r = (short) (sVar.d(512).f12492e / 4);
    }

    public e() {
        this(1000);
    }

    public static void l() {
        g.f81384g.glEnable(f.T4);
        if (g.f81378a.getType() == Application.ApplicationType.Desktop) {
            g.f81384g.glEnable(34913);
        }
        f50381j = true;
    }

    @Override // f2.b
    public void a(int i11) {
        this.f50390f = new float[f50385n * i11];
        Mesh mesh = this.f50391g.f97048b.f7490e;
        if (mesh != null) {
            mesh.dispose();
        }
        this.f50391g.f97048b.f7490e = new Mesh(false, i11, 0, f50384m);
    }

    @Override // f2.d, e2.i.b
    public void b(r1.e eVar, e2.i iVar) {
        i.c g11 = iVar.g("pointSpriteBatch");
        if (g11 != null) {
            p((Texture) eVar.Q0(g11.b()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.b
    public void e(int[] iArr) {
        a.b it = this.f50374a.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            h hVar = (h) it.next();
            a.d dVar = hVar.f60132e;
            a.d dVar2 = hVar.f60130c;
            a.d dVar3 = hVar.f60127b;
            a.d dVar4 = hVar.f60131d;
            a.d dVar5 = hVar.f60133f;
            int i12 = 0;
            while (i12 < hVar.f60126a.f48380e.f48329c) {
                int i13 = iArr[i11] * f50385n;
                int i14 = dVar2.f48332c * i12;
                int i15 = dVar3.f48332c * i12;
                int i16 = dVar4.f48332c * i12;
                int i17 = dVar5.f48332c * i12;
                float[] fArr = this.f50390f;
                int i18 = f50386o;
                a.b bVar = it;
                float[] fArr2 = dVar3.f48337e;
                fArr[i13 + i18] = fArr2[i15];
                fArr[i13 + i18 + 1] = fArr2[i15 + 1];
                fArr[i13 + i18 + 2] = fArr2[i15 + 2];
                int i19 = f50387p;
                int i21 = i13 + i19;
                float[] fArr3 = dVar4.f48337e;
                fArr[i21] = fArr3[i16];
                fArr[i13 + i19 + 1] = fArr3[i16 + 1];
                fArr[i13 + i19 + 2] = fArr3[i16 + 2];
                fArr[i13 + i19 + 3] = fArr3[i16 + 3];
                int i22 = f50389r;
                fArr[i13 + i22] = dVar.f48337e[dVar.f48332c * i12];
                float[] fArr4 = dVar5.f48337e;
                fArr[i13 + i22 + 1] = fArr4[i17];
                fArr[i13 + i22 + 2] = fArr4[i17 + 1];
                int i23 = f50388q;
                float[] fArr5 = dVar2.f48337e;
                fArr[i13 + i23] = fArr5[i14];
                fArr[i13 + i23 + 1] = fArr5[i14 + 1];
                fArr[i13 + i23 + 2] = fArr5[i14 + 2];
                fArr[i13 + i23 + 3] = fArr5[i14 + 3];
                i12++;
                i11++;
                it = bVar;
            }
        }
        c2.b bVar2 = this.f50391g.f97048b;
        int i24 = this.f50375b;
        bVar2.f7489d = i24;
        bVar2.f7490e.O1(this.f50390f, 0, i24 * f50385n);
        this.f50391g.f97048b.f();
    }

    public void k() {
        x1.i iVar = new x1.i();
        this.f50391g = iVar;
        c2.b bVar = iVar.f97048b;
        bVar.f7487b = 0;
        bVar.f7488c = 0;
        iVar.f97049c = new x1.d(this.f50392h, this.f50393i, j.m(null));
    }

    public y1.a m() {
        return this.f50392h;
    }

    public Texture n() {
        return ((j) this.f50391g.f97049c.l(j.f98991l)).f99005e.f69250a;
    }

    @Override // f2.d, e2.i.b
    public void o(r1.e eVar, e2.i iVar) {
        iVar.b("pointSpriteBatch").d(eVar.a1(n()), Texture.class);
    }

    public void p(Texture texture) {
        ((j) this.f50391g.f97049c.l(j.f98991l)).f99005e.f69250a = texture;
    }

    @Override // x1.j
    public void z(com.badlogic.gdx.utils.a<x1.i> aVar, j0<x1.i> j0Var) {
        if (this.f50375b > 0) {
            aVar.a(j0Var.h().a(this.f50391g));
        }
    }

    public e(int i11) {
        this(i11, new ParticleShader.a(ParticleShader.ParticleType.Point));
    }

    public e(int i11, ParticleShader.a aVar) {
        this(i11, aVar, null, null);
    }

    public e(int i11, ParticleShader.a aVar, y1.a aVar2, y1.d dVar) {
        super(h.class);
        if (!f50381j) {
            l();
        }
        this.f50392h = aVar2;
        this.f50393i = dVar;
        if (aVar2 == null) {
            this.f50392h = new y1.a(1, f.f11659s, 1.0f);
        }
        if (this.f50393i == null) {
            this.f50393i = new y1.d(f.f11596h2, false);
        }
        k();
        d(i11);
        this.f50391g.f97052f = new ParticleShader(this.f50391g, aVar);
        this.f50391g.f97052f.init();
    }
}
