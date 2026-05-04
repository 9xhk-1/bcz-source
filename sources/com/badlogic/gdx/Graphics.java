package com.badlogic.gdx;

import com.badlogic.gdx.graphics.Cursor;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.f;
import com.badlogic.gdx.graphics.g;
import com.badlogic.gdx.graphics.glutils.GLVersion;
import com.badlogic.gdx.graphics.h;
import com.badlogic.gdx.graphics.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface Graphics {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum GraphicsType {
        AndroidGL,
        LWJGL,
        WebGL,
        iOSGL,
        JGLFW,
        Mock,
        LWJGL3
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f11338a;

        /* renamed from: b, reason: collision with root package name */
        public final int f11339b;

        /* renamed from: c, reason: collision with root package name */
        public final int f11340c;

        /* renamed from: d, reason: collision with root package name */
        public final int f11341d;

        /* renamed from: e, reason: collision with root package name */
        public final int f11342e;

        /* renamed from: f, reason: collision with root package name */
        public final int f11343f;

        /* renamed from: g, reason: collision with root package name */
        public final int f11344g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f11345h;

        public a(int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z11) {
            this.f11338a = i11;
            this.f11339b = i12;
            this.f11340c = i13;
            this.f11341d = i14;
            this.f11342e = i15;
            this.f11343f = i16;
            this.f11344g = i17;
            this.f11345h = z11;
        }

        public String toString() {
            return "r: " + this.f11338a + ", g: " + this.f11339b + ", b: " + this.f11340c + ", a: " + this.f11341d + ", depth: " + this.f11342e + ", stencil: " + this.f11343f + ", num samples: " + this.f11344g + ", coverage sampling: " + this.f11345h;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f11346a;

        /* renamed from: b, reason: collision with root package name */
        public final int f11347b;

        /* renamed from: c, reason: collision with root package name */
        public final int f11348c;

        /* renamed from: d, reason: collision with root package name */
        public final int f11349d;

        public b(int i11, int i12, int i13, int i14) {
            this.f11346a = i11;
            this.f11347b = i12;
            this.f11348c = i13;
            this.f11349d = i14;
        }

        public String toString() {
            return this.f11346a + "x" + this.f11347b + ", bpp: " + this.f11349d + ", hz: " + this.f11348c;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f11350a;

        /* renamed from: b, reason: collision with root package name */
        public final int f11351b;

        /* renamed from: c, reason: collision with root package name */
        public final String f11352c;

        public c(int i11, int i12, String str) {
            this.f11350a = i11;
            this.f11351b = i12;
            this.f11352c = str;
        }
    }

    boolean A();

    boolean B();

    boolean C();

    int D();

    void E(boolean z11);

    void F(Cursor.SystemCursor systemCursor);

    a G();

    long H();

    float I();

    boolean J();

    int K();

    int L();

    GLVersion M();

    float N();

    int O();

    float P();

    void Q(Cursor cursor);

    void R(boolean z11);

    float S();

    int T();

    c U();

    b[] V();

    c[] W();

    b X();

    boolean Y(b bVar);

    c a();

    boolean b(int i11, int i12);

    void c(f fVar);

    boolean d(String str);

    void e(int i11);

    g f();

    boolean g();

    float getDensity();

    int getHeight();

    GraphicsType getType();

    int getWidth();

    void h(boolean z11);

    b i(c cVar);

    b[] j(c cVar);

    void k(g gVar);

    f l();

    boolean m();

    void n(String str);

    Cursor o(Pixmap pixmap, int i11, int i12);

    i p();

    h q();

    void r(boolean z11);

    int s();

    float t();

    void u(i iVar);

    float v();

    void w();

    int x();

    void y(h hVar);

    @Deprecated
    float z();
}
