package com.badlogic.gdx.graphics;

import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.TextureData;
import com.badlogic.gdx.utils.BufferUtils;
import java.nio.FloatBuffer;
import n2.t;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class j implements a3.q {

    /* renamed from: h, reason: collision with root package name */
    public static float f12450h;

    /* renamed from: a, reason: collision with root package name */
    public final int f12451a;

    /* renamed from: b, reason: collision with root package name */
    public int f12452b;

    /* renamed from: c, reason: collision with root package name */
    public Texture.TextureFilter f12453c;

    /* renamed from: d, reason: collision with root package name */
    public Texture.TextureFilter f12454d;

    /* renamed from: e, reason: collision with root package name */
    public Texture.TextureWrap f12455e;

    /* renamed from: f, reason: collision with root package name */
    public Texture.TextureWrap f12456f;

    /* renamed from: g, reason: collision with root package name */
    public float f12457g;

    public j(int i11) {
        this(i11, q1.g.f81384g.p());
    }

    public static float X() {
        float f11 = f12450h;
        if (f11 > 0.0f) {
            return f11;
        }
        if (!q1.g.f81379b.d("GL_EXT_texture_filter_anisotropic")) {
            f12450h = 1.0f;
            return 1.0f;
        }
        FloatBuffer F = BufferUtils.F(16);
        F.position(0);
        F.limit(F.capacity());
        q1.g.f81385h.V(f.W4, F);
        float f12 = F.get(0);
        f12450h = f12;
        return f12;
    }

    public static void i1(int i11, TextureData textureData) {
        j1(i11, textureData, 0);
    }

    public static void j1(int i11, TextureData textureData, int i12) {
        boolean z11;
        Pixmap pixmap;
        if (textureData == null) {
            return;
        }
        if (!textureData.b()) {
            textureData.prepare();
        }
        if (textureData.getType() == TextureData.TextureDataType.Custom) {
            textureData.c(i11);
            return;
        }
        Pixmap d11 = textureData.d();
        boolean g11 = textureData.g();
        if (textureData.getFormat() != d11.b1()) {
            Pixmap pixmap2 = new Pixmap(d11.i1(), d11.f1(), textureData.getFormat());
            pixmap2.k1(Pixmap.Blending.None);
            pixmap2.Z(d11, 0, 0, 0, 0, d11.i1(), d11.f1());
            if (textureData.g()) {
                d11.dispose();
            }
            pixmap = pixmap2;
            z11 = true;
        } else {
            z11 = g11;
            pixmap = d11;
        }
        q1.g.f81384g.glPixelStorei(f.T0, 1);
        if (textureData.e()) {
            t.a(i11, pixmap, pixmap.i1(), pixmap.f1());
        } else {
            q1.g.f81384g.glTexImage2D(i11, i12, pixmap.d1(), pixmap.i1(), pixmap.f1(), 0, pixmap.c1(), pixmap.e1(), pixmap.h1());
        }
        if (z11) {
            pixmap.dispose();
        }
    }

    public abstract int C0();

    public abstract int D();

    public abstract int I();

    public abstract boolean J0();

    public abstract void Q0();

    public Texture.TextureFilter R() {
        return this.f12454d;
    }

    public void S() {
        q1.g.f81384g.glBindTexture(this.f12451a, this.f12452b);
    }

    public float V0(float f11) {
        float X = X();
        if (X == 1.0f) {
            return 1.0f;
        }
        float min = Math.min(f11, X);
        if (com.badlogic.gdx.math.n.x(min, this.f12457g, 0.1f)) {
            return min;
        }
        S();
        q1.g.f81385h.glTexParameterf(f.f11552a0, f.V4, min);
        this.f12457g = min;
        return min;
    }

    public Texture.TextureFilter Z() {
        return this.f12453c;
    }

    public void a1(Texture.TextureFilter textureFilter, Texture.TextureFilter textureFilter2) {
        this.f12453c = textureFilter;
        this.f12454d = textureFilter2;
        S();
        q1.g.f81384g.z0(this.f12451a, f.E2, textureFilter.getGLEnum());
        q1.g.f81384g.z0(this.f12451a, f.D2, textureFilter2.getGLEnum());
    }

    public void b(int i11) {
        q1.g.f81384g.glActiveTexture(i11 + f.R2);
        q1.g.f81384g.glBindTexture(this.f12451a, this.f12452b);
    }

    public void b1(Texture.TextureWrap textureWrap, Texture.TextureWrap textureWrap2) {
        this.f12455e = textureWrap;
        this.f12456f = textureWrap2;
        S();
        q1.g.f81384g.z0(this.f12451a, f.F2, textureWrap.getGLEnum());
        q1.g.f81384g.z0(this.f12451a, f.G2, textureWrap2.getGLEnum());
    }

    public float c1(float f11) {
        return d1(f11, false);
    }

    public float d1(float f11, boolean z11) {
        float X = X();
        if (X == 1.0f) {
            return 1.0f;
        }
        float min = Math.min(f11, X);
        if (!z11 && com.badlogic.gdx.math.n.x(min, this.f12457g, 0.1f)) {
            return this.f12457g;
        }
        q1.g.f81385h.glTexParameterf(f.f11552a0, f.V4, min);
        this.f12457g = min;
        return min;
    }

    @Override // a3.q
    public void dispose() {
        o();
    }

    public void e1(Texture.TextureFilter textureFilter, Texture.TextureFilter textureFilter2) {
        f1(textureFilter, textureFilter2, false);
    }

    public void f1(Texture.TextureFilter textureFilter, Texture.TextureFilter textureFilter2, boolean z11) {
        if (textureFilter != null && (z11 || this.f12453c != textureFilter)) {
            q1.g.f81384g.z0(this.f12451a, f.E2, textureFilter.getGLEnum());
            this.f12453c = textureFilter;
        }
        if (textureFilter2 != null) {
            if (z11 || this.f12454d != textureFilter2) {
                q1.g.f81384g.z0(this.f12451a, f.D2, textureFilter2.getGLEnum());
                this.f12454d = textureFilter2;
            }
        }
    }

    public void g1(Texture.TextureWrap textureWrap, Texture.TextureWrap textureWrap2) {
        h1(textureWrap, textureWrap2, false);
    }

    public void h1(Texture.TextureWrap textureWrap, Texture.TextureWrap textureWrap2, boolean z11) {
        if (textureWrap != null && (z11 || this.f12455e != textureWrap)) {
            q1.g.f81384g.z0(this.f12451a, f.F2, textureWrap.getGLEnum());
            this.f12455e = textureWrap;
        }
        if (textureWrap2 != null) {
            if (z11 || this.f12456f != textureWrap2) {
                q1.g.f81384g.z0(this.f12451a, f.G2, textureWrap2.getGLEnum());
                this.f12456f = textureWrap2;
            }
        }
    }

    public int i0() {
        return this.f12452b;
    }

    public Texture.TextureWrap n0() {
        return this.f12455e;
    }

    public void o() {
        int i11 = this.f12452b;
        if (i11 != 0) {
            q1.g.f81384g.k5(i11);
            this.f12452b = 0;
        }
    }

    public Texture.TextureWrap w0() {
        return this.f12456f;
    }

    public float z() {
        return this.f12457g;
    }

    public j(int i11, int i12) {
        Texture.TextureFilter textureFilter = Texture.TextureFilter.Nearest;
        this.f12453c = textureFilter;
        this.f12454d = textureFilter;
        Texture.TextureWrap textureWrap = Texture.TextureWrap.ClampToEdge;
        this.f12455e = textureWrap;
        this.f12456f = textureWrap;
        this.f12457g = 1.0f;
        this.f12451a = i11;
        this.f12452b = i12;
    }
}
