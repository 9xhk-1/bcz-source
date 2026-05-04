package z2;

import a3.c1;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.InputEvent;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class j extends i {
    public static final Vector2 A = new Vector2();

    /* renamed from: p, reason: collision with root package name */
    public com.badlogic.gdx.scenes.scene2d.ui.o f100710p;

    /* renamed from: q, reason: collision with root package name */
    public c1.a f100711q;

    /* renamed from: r, reason: collision with root package name */
    public c1.a f100712r;

    /* renamed from: w, reason: collision with root package name */
    public long f100717w;

    /* renamed from: y, reason: collision with root package name */
    public float f100719y;

    /* renamed from: z, reason: collision with root package name */
    public float f100720z;

    /* renamed from: s, reason: collision with root package name */
    public com.badlogic.gdx.math.l f100713s = com.badlogic.gdx.math.l.E;

    /* renamed from: t, reason: collision with root package name */
    public float f100714t = 15.0f;

    /* renamed from: u, reason: collision with root package name */
    public float f100715u = 75.0f;

    /* renamed from: v, reason: collision with root package name */
    public float f100716v = 0.05f;

    /* renamed from: x, reason: collision with root package name */
    public long f100718x = 1750;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends c1.a {

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.o f100721f;

        public a(com.badlogic.gdx.scenes.scene2d.ui.o oVar) {
            this.f100721f = oVar;
        }

        @Override // a3.c1.a, java.lang.Runnable
        public void run() {
            j.this.K(this.f100721f.d4() - j.this.H());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends c1.a {

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.o f100723f;

        public b(com.badlogic.gdx.scenes.scene2d.ui.o oVar) {
            this.f100723f = oVar;
        }

        @Override // a3.c1.a, java.lang.Runnable
        public void run() {
            j.this.K(this.f100723f.d4() + j.this.H());
        }
    }

    public j(com.badlogic.gdx.scenes.scene2d.ui.o oVar) {
        this.f100710p = oVar;
        this.f100711q = new a(oVar);
        this.f100712r = new b(oVar);
    }

    public float H() {
        return this.f100713s.b(this.f100714t, this.f100715u, Math.min(1.0f, (System.currentTimeMillis() - this.f100717w) / this.f100718x));
    }

    public boolean I(float f11) {
        return f11 >= this.f100710p.v1() - this.f100719y;
    }

    public boolean J(float f11) {
        return f11 < this.f100720z;
    }

    public void K(float f11) {
        this.f100710p.S4(f11);
    }

    public void L(float f11, float f12) {
        this.f100719y = f11;
        this.f100720z = f12;
    }

    public void M(float f11, float f12, float f13, float f14) {
        this.f100714t = f11;
        this.f100715u = f12;
        this.f100716v = f13;
        this.f100718x = (long) (f14 * 1000.0f);
    }

    @Override // z2.i
    public void m(InputEvent inputEvent, float f11, float f12, int i11) {
        com.badlogic.gdx.scenes.scene2d.a c11 = inputEvent.c();
        com.badlogic.gdx.scenes.scene2d.ui.o oVar = this.f100710p;
        Vector2 vector2 = A;
        c11.a2(oVar, vector2.set(f11, f12));
        if (I(vector2.f12536y)) {
            this.f100712r.a();
            if (this.f100711q.c()) {
                return;
            }
            this.f100717w = System.currentTimeMillis();
            c1.a aVar = this.f100711q;
            float f13 = this.f100716v;
            c1.i(aVar, f13, f13);
            return;
        }
        if (!J(vector2.f12536y)) {
            this.f100711q.a();
            this.f100712r.a();
            return;
        }
        this.f100711q.a();
        if (this.f100712r.c()) {
            return;
        }
        this.f100717w = System.currentTimeMillis();
        c1.a aVar2 = this.f100712r;
        float f14 = this.f100716v;
        c1.i(aVar2, f14, f14);
    }

    @Override // z2.i
    public void o(InputEvent inputEvent, float f11, float f12, int i11) {
        this.f100711q.a();
        this.f100712r.a();
    }
}
