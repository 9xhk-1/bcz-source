package l2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final q f69236a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f69237b;

    /* renamed from: c, reason: collision with root package name */
    public int f69238c;

    /* renamed from: d, reason: collision with root package name */
    public int f69239d;

    /* renamed from: e, reason: collision with root package name */
    public int f69240e;

    /* renamed from: f, reason: collision with root package name */
    public float f69241f;

    /* renamed from: g, reason: collision with root package name */
    public float f69242g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f69243h;

    /* renamed from: i, reason: collision with root package name */
    public int f69244i;

    public m(q qVar) {
        this.f69236a = qVar;
    }

    public void a() {
        q1.g.f81384g.glDisable(com.badlogic.gdx.graphics.f.f11582f0);
        this.f69240e = 0;
        q1.g.f81384g.glDepthMask(true);
        this.f69243h = true;
        q1.g.f81384g.glDisable(com.badlogic.gdx.graphics.f.f11564c0);
        this.f69237b = false;
        q1.g.f81384g.glDisable(com.badlogic.gdx.graphics.f.f11558b0);
        this.f69239d = 0;
        this.f69238c = 0;
        this.f69244i = 0;
        this.f69236a.c();
    }

    public void b() {
        if (this.f69240e != 0) {
            q1.g.f81384g.glDisable(com.badlogic.gdx.graphics.f.f11582f0);
        }
        if (!this.f69243h) {
            q1.g.f81384g.glDepthMask(true);
        }
        if (this.f69237b) {
            q1.g.f81384g.glDisable(com.badlogic.gdx.graphics.f.f11564c0);
        }
        if (this.f69244i > 0) {
            q1.g.f81384g.glDisable(com.badlogic.gdx.graphics.f.f11558b0);
        }
        this.f69236a.end();
    }

    public void c(boolean z11, int i11, int i12) {
        if (z11 != this.f69237b) {
            this.f69237b = z11;
            if (z11) {
                q1.g.f81384g.glEnable(com.badlogic.gdx.graphics.f.f11564c0);
            } else {
                q1.g.f81384g.glDisable(com.badlogic.gdx.graphics.f.f11564c0);
            }
        }
        if (z11) {
            if (this.f69238c == i11 && this.f69239d == i12) {
                return;
            }
            q1.g.f81384g.glBlendFunc(i11, i12);
            this.f69238c = i11;
            this.f69239d = i12;
        }
    }

    public void d(int i11) {
        if (i11 != this.f69244i) {
            this.f69244i = i11;
            if (i11 != 1028 && i11 != 1029 && i11 != 1032) {
                q1.g.f81384g.glDisable(com.badlogic.gdx.graphics.f.f11558b0);
            } else {
                q1.g.f81384g.glEnable(com.badlogic.gdx.graphics.f.f11558b0);
                q1.g.f81384g.glCullFace(i11);
            }
        }
    }

    public void e(boolean z11) {
        if (this.f69243h != z11) {
            com.badlogic.gdx.graphics.f fVar = q1.g.f81384g;
            this.f69243h = z11;
            fVar.glDepthMask(z11);
        }
    }

    public void f(int i11) {
        g(i11, 0.0f, 1.0f);
    }

    public void g(int i11, float f11, float f12) {
        int i12 = this.f69240e;
        boolean z11 = i12 != 0;
        boolean z12 = i11 != 0;
        if (i12 != i11) {
            this.f69240e = i11;
            if (z12) {
                q1.g.f81384g.glEnable(com.badlogic.gdx.graphics.f.f11582f0);
                q1.g.f81384g.glDepthFunc(i11);
            } else {
                q1.g.f81384g.glDisable(com.badlogic.gdx.graphics.f.f11582f0);
            }
        }
        if (z12) {
            if (!z11 || this.f69240e != i11) {
                com.badlogic.gdx.graphics.f fVar = q1.g.f81384g;
                this.f69240e = i11;
                fVar.glDepthFunc(i11);
            }
            if (z11 && this.f69241f == f11 && this.f69242g == f12) {
                return;
            }
            com.badlogic.gdx.graphics.f fVar2 = q1.g.f81384g;
            this.f69241f = f11;
            this.f69242g = f12;
            fVar2.glDepthRangef(f11, f12);
        }
    }
}
