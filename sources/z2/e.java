package z2;

import a3.b1;
import a3.d0;
import com.badlogic.gdx.scenes.scene2d.InputEvent;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class e extends com.badlogic.gdx.scenes.scene2d.b {

    /* renamed from: o, reason: collision with root package name */
    public static float f100654o = 0.1f;

    /* renamed from: g, reason: collision with root package name */
    public int f100660g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f100661h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f100662i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f100663j;

    /* renamed from: k, reason: collision with root package name */
    public long f100664k;

    /* renamed from: m, reason: collision with root package name */
    public int f100666m;

    /* renamed from: n, reason: collision with root package name */
    public long f100667n;

    /* renamed from: b, reason: collision with root package name */
    public float f100655b = 14.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f100656c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f100657d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public int f100658e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f100659f = -1;

    /* renamed from: l, reason: collision with root package name */
    public long f100665l = 400000000;

    public e() {
    }

    public boolean A() {
        if (this.f100661h) {
            return true;
        }
        long j11 = this.f100664k;
        if (j11 <= 0) {
            return false;
        }
        if (j11 > b1.a()) {
            return true;
        }
        this.f100664k = 0L;
        return false;
    }

    public void B(int i11) {
        this.f100660g = i11;
    }

    public void C(int i11) {
        this.f100666m = i11;
    }

    public void D(float f11) {
        this.f100665l = (long) (f11 * 1.0E9f);
    }

    public void E(float f11) {
        this.f100655b = f11;
    }

    public void F(boolean z11) {
        if (z11) {
            this.f100664k = b1.a() + ((long) (f100654o * 1000.0f));
        } else {
            this.f100664k = 0L;
        }
    }

    @Override // com.badlogic.gdx.scenes.scene2d.b
    public void b(InputEvent inputEvent, float f11, float f12, int i11, @d0 com.badlogic.gdx.scenes.scene2d.a aVar) {
        if (i11 != -1 || this.f100663j) {
            return;
        }
        this.f100662i = true;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.b
    public void c(InputEvent inputEvent, float f11, float f12, int i11, @d0 com.badlogic.gdx.scenes.scene2d.a aVar) {
        if (i11 != -1 || this.f100663j) {
            return;
        }
        this.f100662i = false;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.b
    public boolean i(InputEvent inputEvent, float f11, float f12, int i11, int i12) {
        int i13;
        if (this.f100661h) {
            return false;
        }
        if (i11 == 0 && (i13 = this.f100660g) != -1 && i12 != i13) {
            return false;
        }
        this.f100661h = true;
        this.f100658e = i11;
        this.f100659f = i12;
        this.f100656c = f11;
        this.f100657d = f12;
        F(true);
        return true;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.b
    public void j(InputEvent inputEvent, float f11, float f12, int i11) {
        if (i11 != this.f100658e || this.f100663j) {
            return;
        }
        boolean y11 = y(inputEvent.c(), f11, f12);
        this.f100661h = y11;
        if (y11) {
            return;
        }
        w();
    }

    @Override // com.badlogic.gdx.scenes.scene2d.b
    public void k(InputEvent inputEvent, float f11, float f12, int i11, int i12) {
        int i13;
        if (i11 == this.f100658e) {
            if (!this.f100663j) {
                boolean y11 = y(inputEvent.c(), f11, f12);
                if (y11 && i11 == 0 && (i13 = this.f100660g) != -1 && i12 != i13) {
                    y11 = false;
                }
                if (y11) {
                    long c11 = b1.c();
                    if (c11 - this.f100667n > this.f100665l) {
                        this.f100666m = 0;
                    }
                    this.f100666m++;
                    this.f100667n = c11;
                    m(inputEvent, f11, f12);
                }
            }
            this.f100661h = false;
            this.f100658e = -1;
            this.f100659f = -1;
            this.f100663j = false;
        }
    }

    public void l() {
        if (this.f100658e == -1) {
            return;
        }
        this.f100663j = true;
        this.f100661h = false;
    }

    public int n() {
        return this.f100660g;
    }

    public int o() {
        return this.f100659f;
    }

    public int p() {
        return this.f100658e;
    }

    public int q() {
        return this.f100666m;
    }

    public float r() {
        return this.f100655b;
    }

    public float s() {
        return this.f100656c;
    }

    public float t() {
        return this.f100657d;
    }

    public boolean u() {
        return this.f100656c != -1.0f;
    }

    public boolean v(float f11, float f12) {
        float f13 = this.f100656c;
        return !(f13 == -1.0f && this.f100657d == -1.0f) && Math.abs(f11 - f13) < this.f100655b && Math.abs(f12 - this.f100657d) < this.f100655b;
    }

    public void w() {
        this.f100656c = -1.0f;
        this.f100657d = -1.0f;
    }

    public boolean x() {
        return this.f100662i || this.f100661h;
    }

    public boolean y(com.badlogic.gdx.scenes.scene2d.a aVar, float f11, float f12) {
        com.badlogic.gdx.scenes.scene2d.a T1 = aVar.T1(f11, f12, true);
        if (T1 == null || !T1.V1(aVar)) {
            return v(f11, f12);
        }
        return true;
    }

    public boolean z() {
        return this.f100661h;
    }

    public e(int i11) {
        this.f100660g = i11;
    }

    public void m(InputEvent inputEvent, float f11, float f12) {
    }
}
