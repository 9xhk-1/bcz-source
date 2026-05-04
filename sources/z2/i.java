package z2;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.InputEvent;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class i extends com.badlogic.gdx.scenes.scene2d.b {

    /* renamed from: g, reason: collision with root package name */
    public float f100701g;

    /* renamed from: h, reason: collision with root package name */
    public float f100702h;

    /* renamed from: i, reason: collision with root package name */
    public float f100703i;

    /* renamed from: j, reason: collision with root package name */
    public float f100704j;

    /* renamed from: k, reason: collision with root package name */
    public float f100705k;

    /* renamed from: l, reason: collision with root package name */
    public float f100706l;

    /* renamed from: n, reason: collision with root package name */
    public int f100708n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f100709o;

    /* renamed from: b, reason: collision with root package name */
    public float f100696b = 14.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f100697c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f100698d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f100699e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f100700f = -1.0f;

    /* renamed from: m, reason: collision with root package name */
    public int f100707m = -1;

    public float A() {
        return this.f100697c;
    }

    public float B() {
        return this.f100698d;
    }

    public boolean C() {
        return this.f100709o;
    }

    public void D(int i11) {
        this.f100708n = i11;
    }

    public void E(float f11) {
        this.f100701g = f11;
    }

    public void F(float f11) {
        this.f100702h = f11;
    }

    public void G(float f11) {
        this.f100696b = f11;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.b
    public boolean i(InputEvent inputEvent, float f11, float f12, int i11, int i12) {
        int i13;
        if (this.f100707m != -1) {
            return false;
        }
        if (i11 == 0 && (i13 = this.f100708n) != -1 && i12 != i13) {
            return false;
        }
        this.f100707m = i11;
        this.f100697c = f11;
        this.f100698d = f12;
        this.f100699e = inputEvent.x();
        this.f100700f = inputEvent.y();
        return true;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.b
    public void j(InputEvent inputEvent, float f11, float f12, int i11) {
        if (i11 != this.f100707m) {
            return;
        }
        if (!this.f100709o && (Math.abs(this.f100697c - f11) > this.f100696b || Math.abs(this.f100698d - f12) > this.f100696b)) {
            this.f100709o = true;
            this.f100701g = f11;
            this.f100702h = f12;
            n(inputEvent, f11, f12, i11);
            this.f100705k = f11;
            this.f100706l = f12;
        }
        if (this.f100709o) {
            this.f100703i = this.f100705k;
            this.f100704j = this.f100706l;
            this.f100705k = f11;
            this.f100706l = f12;
            m(inputEvent, f11, f12, i11);
        }
    }

    @Override // com.badlogic.gdx.scenes.scene2d.b
    public void k(InputEvent inputEvent, float f11, float f12, int i11, int i12) {
        if (i11 == this.f100707m) {
            int i13 = this.f100708n;
            if (i13 == -1 || i12 == i13) {
                if (this.f100709o) {
                    o(inputEvent, f11, f12, i11);
                }
                l();
            }
        }
    }

    public void l() {
        this.f100709o = false;
        this.f100707m = -1;
    }

    public int p() {
        return this.f100708n;
    }

    public float q() {
        return this.f100705k - this.f100703i;
    }

    public float r() {
        return this.f100706l - this.f100704j;
    }

    public float s() {
        return Vector2.len(this.f100705k - this.f100701g, this.f100706l - this.f100702h);
    }

    public float t() {
        return this.f100701g;
    }

    public float u() {
        return this.f100702h;
    }

    public float v() {
        return this.f100705k;
    }

    public float w() {
        return this.f100706l;
    }

    public float x() {
        return this.f100699e;
    }

    public float y() {
        return this.f100700f;
    }

    public float z() {
        return this.f100696b;
    }

    public void m(InputEvent inputEvent, float f11, float f12, int i11) {
    }

    public void n(InputEvent inputEvent, float f11, float f12, int i11) {
    }

    public void o(InputEvent inputEvent, float f11, float f12, int i11) {
    }
}
