package com.badlogic.gdx.graphics.g2d;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.collision.BoundingBox;
import com.badlogic.gdx.math.n;
import com.badlogic.gdx.utils.a;
import com.baicizhan.client.business.webview.JsonParams;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import w1.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class ParticleEmitter {

    /* renamed from: k0, reason: collision with root package name */
    public static final int f11886k0 = 1;

    /* renamed from: l0, reason: collision with root package name */
    public static final int f11887l0 = 2;

    /* renamed from: m0, reason: collision with root package name */
    public static final int f11888m0 = 4;

    /* renamed from: n0, reason: collision with root package name */
    public static final int f11889n0 = 8;

    /* renamed from: o0, reason: collision with root package name */
    public static final int f11890o0 = 16;

    /* renamed from: p0, reason: collision with root package name */
    public static final int f11891p0 = 32;

    /* renamed from: q0, reason: collision with root package name */
    public static final int f11892q0 = 64;

    /* renamed from: r0, reason: collision with root package name */
    public static final int f11893r0 = 128;
    public int A;
    public int B;
    public float C;
    public float D;
    public String E;
    public com.badlogic.gdx.utils.a<String> F;
    public int G;
    public boolean[] H;
    public boolean I;
    public boolean J;
    public boolean K;
    public int L;
    public boolean M;
    public BoundingBox N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public float V;
    public float W;
    public float X;
    public float Y;
    public float Z;

    /* renamed from: a, reason: collision with root package name */
    public g f11894a;

    /* renamed from: a0, reason: collision with root package name */
    public float f11895a0;

    /* renamed from: b, reason: collision with root package name */
    public c f11896b;

    /* renamed from: b0, reason: collision with root package name */
    public float f11897b0;

    /* renamed from: c, reason: collision with root package name */
    public g f11898c;

    /* renamed from: c0, reason: collision with root package name */
    public float f11899c0;

    /* renamed from: d, reason: collision with root package name */
    public c f11900d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f11901d0;

    /* renamed from: e, reason: collision with root package name */
    public h f11902e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f11903e0;

    /* renamed from: f, reason: collision with root package name */
    public h f11904f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f11905f0;

    /* renamed from: g, reason: collision with root package name */
    public h f11906g;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f11907g0;

    /* renamed from: h, reason: collision with root package name */
    public h f11908h;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f11909h0;

    /* renamed from: i, reason: collision with root package name */
    public h f11910i;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f11911i0;

    /* renamed from: j, reason: collision with root package name */
    public h f11912j;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f11913j0;

    /* renamed from: k, reason: collision with root package name */
    public h f11914k;

    /* renamed from: l, reason: collision with root package name */
    public h f11915l;

    /* renamed from: m, reason: collision with root package name */
    public h f11916m;

    /* renamed from: n, reason: collision with root package name */
    public b f11917n;

    /* renamed from: o, reason: collision with root package name */
    public g f11918o;

    /* renamed from: p, reason: collision with root package name */
    public g f11919p;

    /* renamed from: q, reason: collision with root package name */
    public h f11920q;

    /* renamed from: r, reason: collision with root package name */
    public h f11921r;

    /* renamed from: s, reason: collision with root package name */
    public i f11922s;

    /* renamed from: t, reason: collision with root package name */
    public g[] f11923t;

    /* renamed from: u, reason: collision with root package name */
    public g[] f11924u;

    /* renamed from: v, reason: collision with root package name */
    public g[] f11925v;

    /* renamed from: w, reason: collision with root package name */
    public float f11926w;

    /* renamed from: x, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<l> f11927x;

    /* renamed from: y, reason: collision with root package name */
    public SpriteMode f11928y;

    /* renamed from: z, reason: collision with root package name */
    public e[] f11929z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum SpawnEllipseSide {
        both,
        top,
        bottom
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum SpawnShape {
        point,
        line,
        square,
        ellipse
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum SpriteMode {
        single,
        random,
        animated
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11930a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f11931b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f11932c;

        static {
            int[] iArr = new int[SpawnShape.values().length];
            f11932c = iArr;
            try {
                iArr[SpawnShape.square.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11932c[SpawnShape.ellipse.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11932c[SpawnShape.line.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[SpawnEllipseSide.values().length];
            f11931b = iArr2;
            try {
                iArr2[SpawnEllipseSide.top.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11931b[SpawnEllipseSide.bottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[SpriteMode.values().length];
            f11930a = iArr3;
            try {
                iArr3[SpriteMode.single.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11930a[SpriteMode.animated.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11930a[SpriteMode.random.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends f {

        /* renamed from: e, reason: collision with root package name */
        public static float[] f11933e = new float[4];

        /* renamed from: c, reason: collision with root package name */
        public float[] f11934c = {1.0f, 1.0f, 1.0f};

        /* renamed from: d, reason: collision with root package name */
        public float[] f11935d = {0.0f};

        public b() {
            this.f11942b = true;
        }

        @Override // com.badlogic.gdx.graphics.g2d.ParticleEmitter.f
        public void d(BufferedReader bufferedReader) throws IOException {
            super.d(bufferedReader);
            if (!this.f11941a) {
                return;
            }
            this.f11934c = new float[ParticleEmitter.l0(bufferedReader, "colorsCount")];
            int i11 = 0;
            int i12 = 0;
            while (true) {
                float[] fArr = this.f11934c;
                if (i12 >= fArr.length) {
                    break;
                }
                fArr[i12] = ParticleEmitter.k0(bufferedReader, "colors" + i12);
                i12++;
            }
            this.f11935d = new float[ParticleEmitter.l0(bufferedReader, "timelineCount")];
            while (true) {
                float[] fArr2 = this.f11935d;
                if (i11 >= fArr2.length) {
                    return;
                }
                fArr2[i11] = ParticleEmitter.k0(bufferedReader, JsonParams.ShareResultO.CHANNEL_WEIXIN_CIRCLE + i11);
                i11++;
            }
        }

        @Override // com.badlogic.gdx.graphics.g2d.ParticleEmitter.f
        public void e(Writer writer) throws IOException {
            super.e(writer);
            if (this.f11941a) {
                writer.write("colorsCount: " + this.f11934c.length + "\n");
                for (int i11 = 0; i11 < this.f11934c.length; i11++) {
                    writer.write("colors" + i11 + ": " + this.f11934c[i11] + "\n");
                }
                writer.write("timelineCount: " + this.f11935d.length + "\n");
                for (int i12 = 0; i12 < this.f11935d.length; i12++) {
                    writer.write(JsonParams.ShareResultO.CHANNEL_WEIXIN_CIRCLE + i12 + ": " + this.f11935d[i12] + "\n");
                }
            }
        }

        public float[] h(float f11) {
            float[] fArr = this.f11935d;
            int length = fArr.length;
            int i11 = 0;
            int i12 = 1;
            while (true) {
                if (i12 >= length) {
                    i12 = -1;
                    break;
                }
                if (fArr[i12] > f11) {
                    break;
                }
                i11 = i12;
                i12++;
            }
            float f12 = fArr[i11];
            int i13 = i11 * 3;
            float[] fArr2 = this.f11934c;
            float f13 = fArr2[i13];
            float f14 = fArr2[i13 + 1];
            float f15 = fArr2[i13 + 2];
            if (i12 == -1) {
                float[] fArr3 = f11933e;
                fArr3[0] = f13;
                fArr3[1] = f14;
                fArr3[2] = f15;
                return fArr3;
            }
            float f16 = (f11 - f12) / (fArr[i12] - f12);
            int i14 = i12 * 3;
            float[] fArr4 = f11933e;
            fArr4[0] = f13 + ((fArr2[i14] - f13) * f16);
            fArr4[1] = f14 + ((fArr2[i14 + 1] - f14) * f16);
            fArr4[2] = f15 + ((fArr2[i14 + 2] - f15) * f16);
            return fArr4;
        }

        public float[] i() {
            return this.f11934c;
        }

        public float[] j() {
            return this.f11935d;
        }

        public void k(b bVar) {
            super.c(bVar);
            float[] fArr = new float[bVar.f11934c.length];
            this.f11934c = fArr;
            System.arraycopy(bVar.f11934c, 0, fArr, 0, fArr.length);
            float[] fArr2 = new float[bVar.f11935d.length];
            this.f11935d = fArr2;
            System.arraycopy(bVar.f11935d, 0, fArr2, 0, fArr2.length);
        }

        public void l(float[] fArr) {
            this.f11934c = fArr;
        }

        public void m(float[] fArr) {
            this.f11935d = fArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c extends h {

        /* renamed from: j, reason: collision with root package name */
        public boolean f11936j;

        public boolean H() {
            return this.f11936j;
        }

        public void I(c cVar) {
            super.x(cVar);
            this.f11936j = cVar.f11936j;
        }

        public void J(c cVar) {
            super.z(cVar);
            this.f11936j = cVar.f11936j;
        }

        public void K(boolean z11) {
            this.f11936j = z11;
        }

        @Override // com.badlogic.gdx.graphics.g2d.ParticleEmitter.h, com.badlogic.gdx.graphics.g2d.ParticleEmitter.g, com.badlogic.gdx.graphics.g2d.ParticleEmitter.f
        public void d(BufferedReader bufferedReader) throws IOException {
            super.d(bufferedReader);
            if (bufferedReader.markSupported()) {
                bufferedReader.mark(100);
            }
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                throw new IOException("Missing value: independent");
            }
            if (readLine.contains("independent")) {
                this.f11936j = Boolean.parseBoolean(ParticleEmitter.n0(readLine));
            } else if (bufferedReader.markSupported()) {
                bufferedReader.reset();
            } else {
                q1.g.f81378a.h("ParticleEmitter", "The loaded particle effect descriptor file uses an old invalid format. Please download the latest version of the Particle Editor tool and recreate the file by loading and saving it again.");
                throw new IOException("The loaded particle effect descriptor file uses an old invalid format. Please download the latest version of the Particle Editor tool and recreate the file by loading and saving it again.");
            }
        }

        @Override // com.badlogic.gdx.graphics.g2d.ParticleEmitter.h, com.badlogic.gdx.graphics.g2d.ParticleEmitter.g, com.badlogic.gdx.graphics.g2d.ParticleEmitter.f
        public void e(Writer writer) throws IOException {
            super.e(writer);
            writer.write("independent: " + this.f11936j + "\n");
        }

        @Override // com.badlogic.gdx.graphics.g2d.ParticleEmitter.h, com.badlogic.gdx.graphics.g2d.ParticleEmitter.g
        public void m(g gVar) {
            if (gVar instanceof c) {
                J((c) gVar);
            } else {
                super.m(gVar);
            }
        }

        @Override // com.badlogic.gdx.graphics.g2d.ParticleEmitter.h
        public void z(h hVar) {
            if (hVar instanceof c) {
                J((c) hVar);
            } else {
                super.z(hVar);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d extends f {

        /* renamed from: c, reason: collision with root package name */
        public float f11937c;

        @Override // com.badlogic.gdx.graphics.g2d.ParticleEmitter.f
        public void d(BufferedReader bufferedReader) throws IOException {
            super.d(bufferedReader);
            if (this.f11941a) {
                this.f11937c = ParticleEmitter.k0(bufferedReader, "value");
            }
        }

        @Override // com.badlogic.gdx.graphics.g2d.ParticleEmitter.f
        public void e(Writer writer) throws IOException {
            super.e(writer);
            if (this.f11941a) {
                writer.write("value: " + this.f11937c + "\n");
            }
        }

        public float h() {
            return this.f11937c;
        }

        public void i(d dVar) {
            super.c(dVar);
            this.f11937c = dVar.f11937c;
        }

        public void j(float f11) {
            this.f11937c = f11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e extends l {
        public float A;
        public float B;
        public float C;
        public float D;
        public float E;
        public float F;
        public float G;
        public float H;
        public float I;
        public float J;
        public float K;
        public float L;
        public float M;
        public float N;
        public float O;
        public float P;
        public float Q;
        public float[] R;
        public int S;

        /* renamed from: x, reason: collision with root package name */
        public int f11938x;

        /* renamed from: y, reason: collision with root package name */
        public int f11939y;

        /* renamed from: z, reason: collision with root package name */
        public float f11940z;

        public e(l lVar) {
            super(lVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public boolean f11941a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f11942b;

        public boolean a() {
            return this.f11942b || this.f11941a;
        }

        public boolean b() {
            return this.f11942b;
        }

        public void c(f fVar) {
            this.f11941a = fVar.f11941a;
            this.f11942b = fVar.f11942b;
        }

        public void d(BufferedReader bufferedReader) throws IOException {
            if (this.f11942b) {
                this.f11941a = true;
            } else {
                this.f11941a = ParticleEmitter.i0(bufferedReader, "active");
            }
        }

        public void e(Writer writer) throws IOException {
            if (this.f11942b) {
                this.f11941a = true;
                return;
            }
            writer.write("active: " + this.f11941a + "\n");
        }

        public void f(boolean z11) {
            this.f11941a = z11;
        }

        public void g(boolean z11) {
            this.f11942b = z11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class g extends f {

        /* renamed from: c, reason: collision with root package name */
        public float f11943c;

        /* renamed from: d, reason: collision with root package name */
        public float f11944d;

        @Override // com.badlogic.gdx.graphics.g2d.ParticleEmitter.f
        public void d(BufferedReader bufferedReader) throws IOException {
            super.d(bufferedReader);
            if (this.f11941a) {
                this.f11943c = ParticleEmitter.k0(bufferedReader, "lowMin");
                this.f11944d = ParticleEmitter.k0(bufferedReader, "lowMax");
            }
        }

        @Override // com.badlogic.gdx.graphics.g2d.ParticleEmitter.f
        public void e(Writer writer) throws IOException {
            super.e(writer);
            if (this.f11941a) {
                writer.write("lowMin: " + this.f11943c + "\n");
                writer.write("lowMax: " + this.f11944d + "\n");
            }
        }

        public float h() {
            return this.f11944d;
        }

        public float i() {
            return this.f11943c;
        }

        public void j(g gVar) {
            super.c(gVar);
            this.f11944d = gVar.f11944d;
            this.f11943c = gVar.f11943c;
        }

        public float k() {
            float f11 = this.f11943c;
            return f11 + ((this.f11944d - f11) * n.J());
        }

        public void l(float f11) {
            this.f11943c *= f11;
            this.f11944d *= f11;
        }

        public void m(g gVar) {
            this.f11943c = gVar.f11943c;
            this.f11944d = gVar.f11944d;
        }

        public void n(float f11) {
            this.f11943c = f11;
            this.f11944d = f11;
        }

        public void o(float f11, float f12) {
            this.f11943c = f11;
            this.f11944d = f12;
        }

        public void p(float f11) {
            this.f11944d = f11;
        }

        public void q(float f11) {
            this.f11943c = f11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class h extends g {

        /* renamed from: e, reason: collision with root package name */
        public float[] f11945e = {1.0f};

        /* renamed from: f, reason: collision with root package name */
        public float[] f11946f = {0.0f};

        /* renamed from: g, reason: collision with root package name */
        public float f11947g;

        /* renamed from: h, reason: collision with root package name */
        public float f11948h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f11949i;

        public void A(float f11) {
            this.f11947g = f11;
            this.f11948h = f11;
        }

        public void B(float f11, float f12) {
            this.f11947g = f11;
            this.f11948h = f12;
        }

        public void C(float f11) {
            this.f11948h = f11;
        }

        public void D(float f11) {
            this.f11947g = f11;
        }

        public void E(boolean z11) {
            this.f11949i = z11;
        }

        public void F(float[] fArr) {
            this.f11945e = fArr;
        }

        public void G(float[] fArr) {
            this.f11946f = fArr;
        }

        @Override // com.badlogic.gdx.graphics.g2d.ParticleEmitter.g, com.badlogic.gdx.graphics.g2d.ParticleEmitter.f
        public void d(BufferedReader bufferedReader) throws IOException {
            super.d(bufferedReader);
            if (!this.f11941a) {
                return;
            }
            this.f11947g = ParticleEmitter.k0(bufferedReader, "highMin");
            this.f11948h = ParticleEmitter.k0(bufferedReader, "highMax");
            this.f11949i = ParticleEmitter.i0(bufferedReader, "relative");
            this.f11945e = new float[ParticleEmitter.l0(bufferedReader, "scalingCount")];
            int i11 = 0;
            int i12 = 0;
            while (true) {
                float[] fArr = this.f11945e;
                if (i12 >= fArr.length) {
                    break;
                }
                fArr[i12] = ParticleEmitter.k0(bufferedReader, "scaling" + i12);
                i12++;
            }
            this.f11946f = new float[ParticleEmitter.l0(bufferedReader, "timelineCount")];
            while (true) {
                float[] fArr2 = this.f11946f;
                if (i11 >= fArr2.length) {
                    return;
                }
                fArr2[i11] = ParticleEmitter.k0(bufferedReader, JsonParams.ShareResultO.CHANNEL_WEIXIN_CIRCLE + i11);
                i11++;
            }
        }

        @Override // com.badlogic.gdx.graphics.g2d.ParticleEmitter.g, com.badlogic.gdx.graphics.g2d.ParticleEmitter.f
        public void e(Writer writer) throws IOException {
            super.e(writer);
            if (this.f11941a) {
                writer.write("highMin: " + this.f11947g + "\n");
                writer.write("highMax: " + this.f11948h + "\n");
                writer.write("relative: " + this.f11949i + "\n");
                writer.write("scalingCount: " + this.f11945e.length + "\n");
                for (int i11 = 0; i11 < this.f11945e.length; i11++) {
                    writer.write("scaling" + i11 + ": " + this.f11945e[i11] + "\n");
                }
                writer.write("timelineCount: " + this.f11946f.length + "\n");
                for (int i12 = 0; i12 < this.f11946f.length; i12++) {
                    writer.write(JsonParams.ShareResultO.CHANNEL_WEIXIN_CIRCLE + i12 + ": " + this.f11946f[i12] + "\n");
                }
            }
        }

        @Override // com.badlogic.gdx.graphics.g2d.ParticleEmitter.g
        public void l(float f11) {
            super.l(f11);
            this.f11947g *= f11;
            this.f11948h *= f11;
        }

        @Override // com.badlogic.gdx.graphics.g2d.ParticleEmitter.g
        public void m(g gVar) {
            if (gVar instanceof h) {
                z((h) gVar);
            } else {
                super.m(gVar);
            }
        }

        public float r() {
            return this.f11948h;
        }

        public float s() {
            return this.f11947g;
        }

        public float t(float f11) {
            float[] fArr = this.f11946f;
            int length = fArr.length;
            int i11 = 1;
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                }
                if (fArr[i11] > f11) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return this.f11945e[length - 1];
            }
            float[] fArr2 = this.f11945e;
            int i12 = i11 - 1;
            float f12 = fArr2[i12];
            float f13 = fArr[i12];
            return f12 + ((fArr2[i11] - f12) * ((f11 - f13) / (fArr[i11] - f13)));
        }

        public float[] u() {
            return this.f11945e;
        }

        public float[] v() {
            return this.f11946f;
        }

        public boolean w() {
            return this.f11949i;
        }

        public void x(h hVar) {
            super.j(hVar);
            this.f11948h = hVar.f11948h;
            this.f11947g = hVar.f11947g;
            float[] fArr = new float[hVar.f11945e.length];
            this.f11945e = fArr;
            System.arraycopy(hVar.f11945e, 0, fArr, 0, fArr.length);
            float[] fArr2 = new float[hVar.f11946f.length];
            this.f11946f = fArr2;
            System.arraycopy(hVar.f11946f, 0, fArr2, 0, fArr2.length);
            this.f11949i = hVar.f11949i;
        }

        public float y() {
            float f11 = this.f11947g;
            return f11 + ((this.f11948h - f11) * n.J());
        }

        public void z(h hVar) {
            super.m(hVar);
            this.f11947g = hVar.f11947g;
            this.f11948h = hVar.f11948h;
            float[] fArr = this.f11945e;
            int length = fArr.length;
            float[] fArr2 = hVar.f11945e;
            if (length != fArr2.length) {
                this.f11945e = Arrays.copyOf(fArr2, fArr2.length);
            } else {
                System.arraycopy(fArr2, 0, fArr, 0, fArr.length);
            }
            float[] fArr3 = this.f11946f;
            int length2 = fArr3.length;
            float[] fArr4 = hVar.f11946f;
            if (length2 != fArr4.length) {
                this.f11946f = Arrays.copyOf(fArr4, fArr4.length);
            } else {
                System.arraycopy(fArr4, 0, fArr3, 0, fArr3.length);
            }
            this.f11949i = hVar.f11949i;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class i extends f {

        /* renamed from: d, reason: collision with root package name */
        public boolean f11951d;

        /* renamed from: c, reason: collision with root package name */
        public SpawnShape f11950c = SpawnShape.point;

        /* renamed from: e, reason: collision with root package name */
        public SpawnEllipseSide f11952e = SpawnEllipseSide.both;

        @Override // com.badlogic.gdx.graphics.g2d.ParticleEmitter.f
        public void d(BufferedReader bufferedReader) throws IOException {
            super.d(bufferedReader);
            if (this.f11941a) {
                SpawnShape valueOf = SpawnShape.valueOf(ParticleEmitter.m0(bufferedReader, "shape"));
                this.f11950c = valueOf;
                if (valueOf == SpawnShape.ellipse) {
                    this.f11951d = ParticleEmitter.i0(bufferedReader, "edges");
                    this.f11952e = SpawnEllipseSide.valueOf(ParticleEmitter.m0(bufferedReader, "side"));
                }
            }
        }

        @Override // com.badlogic.gdx.graphics.g2d.ParticleEmitter.f
        public void e(Writer writer) throws IOException {
            super.e(writer);
            if (this.f11941a) {
                writer.write("shape: " + this.f11950c + "\n");
                if (this.f11950c == SpawnShape.ellipse) {
                    writer.write("edges: " + this.f11951d + "\n");
                    writer.write("side: " + this.f11952e + "\n");
                }
            }
        }

        public SpawnShape h() {
            return this.f11950c;
        }

        public SpawnEllipseSide i() {
            return this.f11952e;
        }

        public boolean j() {
            return this.f11951d;
        }

        public void k(i iVar) {
            super.c(iVar);
            this.f11950c = iVar.f11950c;
            this.f11951d = iVar.f11951d;
            this.f11952e = iVar.f11952e;
        }

        public void l(boolean z11) {
            this.f11951d = z11;
        }

        public void m(SpawnShape spawnShape) {
            this.f11950c = spawnShape;
        }

        public void n(SpawnEllipseSide spawnEllipseSide) {
            this.f11952e = spawnEllipseSide;
        }
    }

    public ParticleEmitter() {
        this.f11894a = new g();
        this.f11896b = new c();
        this.f11898c = new g();
        this.f11900d = new c();
        this.f11902e = new h();
        this.f11904f = new h();
        this.f11906g = new h();
        this.f11908h = new h();
        this.f11910i = new h();
        this.f11912j = new h();
        this.f11914k = new h();
        this.f11915l = new h();
        this.f11916m = new h();
        this.f11917n = new b();
        this.f11918o = new h();
        this.f11919p = new h();
        this.f11920q = new h();
        this.f11921r = new h();
        this.f11922s = new i();
        this.f11928y = SpriteMode.single;
        this.B = 4;
        this.Z = 1.0f;
        this.f11909h0 = true;
        this.f11911i0 = false;
        this.f11913j0 = true;
        T();
    }

    public static boolean i0(BufferedReader bufferedReader, String str) throws IOException {
        return Boolean.parseBoolean(m0(bufferedReader, str));
    }

    public static boolean j0(String str) throws IOException {
        return Boolean.parseBoolean(n0(str));
    }

    public static float k0(BufferedReader bufferedReader, String str) throws IOException {
        return Float.parseFloat(m0(bufferedReader, str));
    }

    public static int l0(BufferedReader bufferedReader, String str) throws IOException {
        return Integer.parseInt(m0(bufferedReader, str));
    }

    public static String m0(BufferedReader bufferedReader, String str) throws IOException {
        String readLine = bufferedReader.readLine();
        if (readLine != null) {
            return n0(readLine);
        }
        throw new IOException("Missing value: " + str);
    }

    public static String n0(String str) throws IOException {
        return str.substring(str.indexOf(":") + 1).trim();
    }

    public float A() {
        if (this.f11899c0 < this.f11897b0) {
            return 0.0f;
        }
        return Math.min(1.0f, this.f11895a0 / this.Z);
    }

    public void A0(boolean z11) {
        this.f11903e0 = z11;
    }

    public h B() {
        return this.f11908h;
    }

    public void B0(boolean z11, boolean z12) {
        this.J = z11;
        this.K = z12;
        e[] eVarArr = this.f11929z;
        if (eVarArr == null) {
            return;
        }
        int length = eVarArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            e eVar = this.f11929z[i11];
            if (eVar != null) {
                eVar.a(z11, z12);
            }
        }
    }

    public h C() {
        return this.f11921r;
    }

    public void C0(com.badlogic.gdx.utils.a<String> aVar) {
        this.F = aVar;
    }

    public i D() {
        return this.f11922s;
    }

    public void D0(int i11) {
        this.B = i11;
        this.H = new boolean[i11];
        this.G = 0;
        this.f11929z = new e[i11];
    }

    public h E() {
        return this.f11920q;
    }

    public void E0(int i11) {
        this.A = i11;
    }

    public SpriteMode F() {
        return this.f11928y;
    }

    public void F0(String str) {
        this.E = str;
    }

    public com.badlogic.gdx.utils.a<l> G() {
        return this.f11927x;
    }

    public void G0(float f11, float f12) {
        if (this.f11901d0) {
            float f13 = f11 - this.C;
            float f14 = f12 - this.D;
            boolean[] zArr = this.H;
            int length = zArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                if (zArr[i11]) {
                    this.f11929z[i11].p0(f13, f14);
                }
            }
        }
        this.C = f11;
        this.D = f12;
    }

    public b H() {
        return this.f11917n;
    }

    public void H0(boolean z11) {
        this.f11911i0 = z11;
    }

    public h I() {
        return this.f11916m;
    }

    public void I0(SpriteMode spriteMode) {
        this.f11928y = spriteMode;
    }

    public h J() {
        return this.f11910i;
    }

    public void J0(com.badlogic.gdx.utils.a<l> aVar) {
        l first;
        this.f11927x = aVar;
        if (aVar.f13179b == 0) {
            return;
        }
        int length = this.f11929z.length;
        for (int i11 = 0; i11 < length; i11++) {
            e eVar = this.f11929z[i11];
            if (eVar == null) {
                return;
            }
            int i12 = a.f11930a[this.f11928y.ordinal()];
            if (i12 == 1) {
                first = aVar.first();
            } else if (i12 != 2) {
                first = i12 != 3 ? null : aVar.y();
            } else {
                int i13 = aVar.f13179b;
                int min = Math.min((int) ((1.0f - (eVar.f11939y / eVar.f11938x)) * i13), i13 - 1);
                eVar.S = min;
                first = aVar.get(min);
            }
            eVar.q(first);
            eVar.e0(first.I(), first.J());
        }
    }

    public h K() {
        return this.f11914k;
    }

    public void K0() {
        this.I = true;
        this.M = false;
        q0();
    }

    public float L() {
        return this.C;
    }

    public void L0(float f11) {
        float f12 = this.f11926w + (f11 * 1000.0f);
        this.f11926w = f12;
        if (f12 < 1.0f) {
            return;
        }
        int i11 = (int) f12;
        float f13 = i11;
        this.f11926w = f12 - f13;
        float f14 = this.f11899c0;
        if (f14 < this.f11897b0) {
            this.f11899c0 = f14 + f13;
        } else {
            if (this.I) {
                this.I = false;
                b();
            }
            float f15 = this.f11895a0;
            if (f15 < this.Z) {
                this.f11895a0 = f15 + f13;
            } else if (this.f11903e0 && !this.M) {
                q0();
            }
            this.Q += i11;
            float t11 = this.O + (this.P * this.f11902e.t(this.f11895a0 / this.Z));
            if (t11 > 0.0f) {
                float f16 = 1000.0f / t11;
                int i12 = this.Q;
                if (i12 >= f16) {
                    int min = Math.min((int) (i12 / f16), this.B - this.G);
                    this.Q = (int) (((int) (this.Q - (min * f16))) % f16);
                    c(min);
                }
            }
            int i13 = this.G;
            int i14 = this.A;
            if (i13 < i14) {
                c(i14 - i13);
            }
        }
        boolean[] zArr = this.H;
        int i15 = this.G;
        e[] eVarArr = this.f11929z;
        int length = zArr.length;
        for (int i16 = 0; i16 < length; i16++) {
            if (zArr[i16] && !M0(eVarArr[i16], f11, i11)) {
                zArr[i16] = false;
                i15--;
            }
        }
        this.G = i15;
    }

    public g M() {
        return this.f11918o;
    }

    public final boolean M0(e eVar, float f11, int i11) {
        float f12;
        float f13;
        int i12 = eVar.f11939y - i11;
        if (i12 <= 0) {
            return false;
        }
        eVar.f11939y = i12;
        float f14 = 1.0f - (i12 / eVar.f11938x);
        int i13 = this.L;
        if ((i13 & 1) != 0) {
            if (this.f11906g.f11941a) {
                eVar.l0(eVar.f11940z + (eVar.A * this.f11904f.t(f14)), eVar.B + (eVar.C * this.f11906g.t(f14)));
            } else {
                eVar.k0(eVar.f11940z + (eVar.A * this.f11904f.t(f14)));
            }
        }
        if ((i13 & 8) != 0) {
            float t11 = (eVar.F + (eVar.G * this.f11910i.t(f14))) * f11;
            if ((i13 & 2) != 0) {
                float t12 = eVar.H + (eVar.I * this.f11912j.t(f14));
                f12 = n.t(t12) * t11;
                f13 = t11 * n.a0(t12);
                if ((i13 & 4) != 0) {
                    float t13 = eVar.D + (eVar.E * this.f11908h.t(f14));
                    if (this.f11905f0) {
                        t13 += t12;
                    }
                    eVar.j0(t13);
                }
            } else {
                f12 = t11 * eVar.J;
                f13 = t11 * eVar.K;
                if (this.f11905f0 || (i13 & 4) != 0) {
                    float t14 = eVar.D + (eVar.E * this.f11908h.t(f14));
                    if (this.f11905f0) {
                        t14 += eVar.H;
                    }
                    eVar.j0(t14);
                }
            }
            if ((i13 & 16) != 0) {
                f12 += (eVar.N + (eVar.O * this.f11914k.t(f14))) * f11;
            }
            if ((i13 & 32) != 0) {
                f13 += (eVar.P + (eVar.Q * this.f11915l.t(f14))) * f11;
            }
            eVar.p0(f12, f13);
        } else if ((i13 & 4) != 0) {
            eVar.j0(eVar.D + (eVar.E * this.f11908h.t(f14)));
        }
        float[] h11 = (i13 & 64) != 0 ? this.f11917n.h(f14) : eVar.R;
        if (this.f11911i0) {
            float f15 = this.f11909h0 ? 0.0f : 1.0f;
            float t15 = eVar.L + (eVar.M * this.f11916m.t(f14));
            eVar.b0(h11[0] * t15, h11[1] * t15, h11[2] * t15, t15 * f15);
        } else {
            eVar.b0(h11[0], h11[1], h11[2], eVar.L + (eVar.M * this.f11916m.t(f14)));
        }
        if ((i13 & 128) != 0) {
            int i14 = this.f11927x.f13179b;
            int min = Math.min((int) (f14 * i14), i14 - 1);
            if (eVar.S != min) {
                l lVar = this.f11927x.get(min);
                float P = eVar.P();
                float H = eVar.H();
                eVar.q(lVar);
                eVar.m0(lVar.P(), lVar.H());
                eVar.e0(lVar.I(), lVar.J());
                eVar.p0((P - lVar.P()) * 0.5f, (H - lVar.H()) * 0.5f);
                eVar.S = min;
            }
        }
        return true;
    }

    public h N() {
        return this.f11904f;
    }

    public g[] O() {
        if (this.f11923t == null) {
            this.f11923t = new g[]{this.f11904f, this.f11920q, this.f11918o};
        }
        return this.f11923t;
    }

    public float P() {
        return this.D;
    }

    public g Q() {
        return this.f11919p;
    }

    public h R() {
        return this.f11906g;
    }

    public g[] S() {
        if (this.f11924u == null) {
            this.f11924u = new g[]{this.f11906g, this.f11921r, this.f11919p};
        }
        return this.f11924u;
    }

    public final void T() {
        this.f11927x = new com.badlogic.gdx.utils.a<>();
        this.F = new com.badlogic.gdx.utils.a<>();
        this.f11898c.g(true);
        this.f11902e.g(true);
        this.f11900d.g(true);
        this.f11904f.g(true);
        this.f11916m.g(true);
        this.f11922s.g(true);
        this.f11920q.g(true);
        this.f11921r.g(true);
    }

    public boolean U() {
        return this.f11909h0;
    }

    public boolean V() {
        return this.f11905f0;
    }

    public boolean W() {
        return this.f11901d0;
    }

    public boolean X() {
        return this.f11907g0;
    }

    public boolean Y() {
        return (!this.f11903e0 || this.M) && this.f11899c0 >= this.f11897b0 && this.f11895a0 >= this.Z && this.G == 0;
    }

    public boolean Z() {
        return this.f11903e0;
    }

    public final void a(int i11) {
        float f11;
        float K;
        float K2;
        int i12 = a.f11930a[this.f11928y.ordinal()];
        l first = (i12 == 1 || i12 == 2) ? this.f11927x.first() : i12 != 3 ? null : this.f11927x.y();
        e[] eVarArr = this.f11929z;
        e eVar = eVarArr[i11];
        if (eVar == null) {
            eVar = g0(first);
            eVarArr[i11] = eVar;
            eVar.a(this.J, this.K);
        } else {
            eVar.V(first);
        }
        float f12 = this.f11895a0 / this.Z;
        int i13 = this.L;
        if (this.f11900d.f11936j) {
            j();
        }
        if (this.f11896b.f11936j) {
            i();
        }
        int t11 = this.T + ((int) (this.U * this.f11900d.t(f12)));
        eVar.f11938x = t11;
        eVar.f11939y = t11;
        h hVar = this.f11910i;
        if (hVar.f11941a) {
            eVar.F = hVar.k();
            float y11 = this.f11910i.y();
            eVar.G = y11;
            if (!this.f11910i.f11949i) {
                eVar.G = y11 - eVar.F;
            }
        }
        eVar.H = this.f11912j.k();
        float y12 = this.f11912j.y();
        eVar.I = y12;
        h hVar2 = this.f11912j;
        if (!hVar2.f11949i) {
            eVar.I = y12 - eVar.H;
        }
        int i14 = i13 & 2;
        if (i14 == 0) {
            f11 = eVar.H + (eVar.I * hVar2.t(0.0f));
            eVar.H = f11;
            eVar.J = n.t(f11);
            eVar.K = n.a0(f11);
        } else {
            f11 = 0.0f;
        }
        float P = first.P();
        float H = first.H();
        eVar.f11940z = this.f11904f.k() / P;
        float y13 = this.f11904f.y() / P;
        eVar.A = y13;
        h hVar3 = this.f11904f;
        if (!hVar3.f11949i) {
            eVar.A = y13 - eVar.f11940z;
        }
        h hVar4 = this.f11906g;
        if (hVar4.f11941a) {
            eVar.B = hVar4.k() / H;
            float y14 = this.f11906g.y() / H;
            eVar.C = y14;
            if (!this.f11906g.f11949i) {
                eVar.C = y14 - eVar.B;
            }
            eVar.l0(eVar.f11940z + (eVar.A * this.f11904f.t(0.0f)), eVar.B + (eVar.C * this.f11906g.t(0.0f)));
        } else {
            eVar.k0(eVar.f11940z + (eVar.A * hVar3.t(0.0f)));
        }
        h hVar5 = this.f11908h;
        if (hVar5.f11941a) {
            eVar.D = hVar5.k();
            float y15 = this.f11908h.y();
            eVar.E = y15;
            h hVar6 = this.f11908h;
            if (!hVar6.f11949i) {
                eVar.E = y15 - eVar.D;
            }
            float t12 = eVar.D + (eVar.E * hVar6.t(0.0f));
            if (this.f11905f0) {
                t12 += f11;
            }
            eVar.j0(t12);
        }
        h hVar7 = this.f11914k;
        if (hVar7.f11941a) {
            eVar.N = hVar7.k();
            float y16 = this.f11914k.y();
            eVar.O = y16;
            if (!this.f11914k.f11949i) {
                eVar.O = y16 - eVar.N;
            }
        }
        h hVar8 = this.f11915l;
        if (hVar8.f11941a) {
            eVar.P = hVar8.k();
            float y17 = this.f11915l.y();
            eVar.Q = y17;
            if (!this.f11915l.f11949i) {
                eVar.Q = y17 - eVar.P;
            }
        }
        float[] fArr = eVar.R;
        if (fArr == null) {
            fArr = new float[3];
            eVar.R = fArr;
        }
        float[] h11 = this.f11917n.h(0.0f);
        fArr[0] = h11[0];
        fArr[1] = h11[1];
        fArr[2] = h11[2];
        eVar.L = this.f11916m.k();
        eVar.M = this.f11916m.y() - eVar.L;
        float f13 = this.C;
        g gVar = this.f11918o;
        if (gVar.f11941a) {
            f13 += gVar.k();
        }
        float f14 = this.D;
        g gVar2 = this.f11919p;
        if (gVar2.f11941a) {
            f14 += gVar2.k();
        }
        int i15 = a.f11932c[this.f11922s.f11950c.ordinal()];
        if (i15 == 1) {
            float t13 = this.V + (this.W * this.f11920q.t(f12));
            float t14 = this.X + (this.Y * this.f11921r.t(f12));
            f13 += n.K(t13) - (t13 * 0.5f);
            f14 += n.K(t14) - (t14 * 0.5f);
        } else if (i15 == 2) {
            float t15 = this.V + (this.W * this.f11920q.t(f12));
            float f15 = t15 * 0.5f;
            float t16 = (this.X + (this.Y * this.f11921r.t(f12))) * 0.5f;
            if (f15 != 0.0f && t16 != 0.0f) {
                float f16 = f15 / t16;
                i iVar = this.f11922s;
                if (iVar.f11951d) {
                    int i16 = a.f11931b[iVar.f11952e.ordinal()];
                    float K3 = i16 != 1 ? i16 != 2 ? n.K(360.0f) : n.K(179.0f) : -n.K(179.0f);
                    float t17 = n.t(K3);
                    float a02 = n.a0(K3);
                    f13 += t17 * f15;
                    f14 += (f15 * a02) / f16;
                    if (i14 == 0) {
                        eVar.H = K3;
                        eVar.J = t17;
                        eVar.K = a02;
                    }
                } else {
                    float f17 = f15 * f15;
                    do {
                        K = n.K(t15) - f15;
                        K2 = n.K(t15) - f15;
                    } while ((K * K) + (K2 * K2) > f17);
                    f13 += K;
                    f14 += K2 / f16;
                }
            }
        } else if (i15 == 3) {
            float t18 = this.V + (this.W * this.f11920q.t(f12));
            float t19 = this.X + (this.Y * this.f11921r.t(f12));
            if (t18 != 0.0f) {
                float J = n.J() * t18;
                f13 += J;
                f14 += J * (t19 / t18);
            } else {
                f14 += t19 * n.J();
            }
        }
        eVar.X(f13 - (P * 0.5f), f14 - (0.5f * H), P, H);
        int t21 = (int) (this.R + (this.S * this.f11896b.t(f12)));
        if (t21 > 0) {
            int i17 = eVar.f11939y;
            if (t21 >= i17) {
                t21 = i17 - 1;
            }
            M0(eVar, t21 / 1000.0f, t21);
        }
    }

    public boolean a0() {
        return this.f11911i0;
    }

    public void b() {
        int i11 = this.G;
        if (i11 == this.B) {
            return;
        }
        boolean[] zArr = this.H;
        int length = zArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            if (!zArr[i12]) {
                a(i12);
                zArr[i12] = true;
                this.G = i11 + 1;
                return;
            }
        }
    }

    public void b0(BufferedReader bufferedReader) throws IOException {
        try {
            this.E = m0(bufferedReader, "name");
            bufferedReader.readLine();
            this.f11894a.d(bufferedReader);
            bufferedReader.readLine();
            this.f11898c.d(bufferedReader);
            bufferedReader.readLine();
            E0(l0(bufferedReader, "minParticleCount"));
            D0(l0(bufferedReader, "maxParticleCount"));
            bufferedReader.readLine();
            this.f11902e.d(bufferedReader);
            bufferedReader.readLine();
            this.f11900d.d(bufferedReader);
            bufferedReader.readLine();
            this.f11896b.d(bufferedReader);
            bufferedReader.readLine();
            this.f11918o.d(bufferedReader);
            bufferedReader.readLine();
            this.f11919p.d(bufferedReader);
            bufferedReader.readLine();
            this.f11922s.d(bufferedReader);
            bufferedReader.readLine();
            this.f11920q.d(bufferedReader);
            bufferedReader.readLine();
            this.f11921r.d(bufferedReader);
            if (bufferedReader.readLine().trim().equals("- Scale -")) {
                this.f11904f.d(bufferedReader);
                this.f11906g.f(false);
            } else {
                this.f11904f.d(bufferedReader);
                bufferedReader.readLine();
                this.f11906g.d(bufferedReader);
            }
            bufferedReader.readLine();
            this.f11910i.d(bufferedReader);
            bufferedReader.readLine();
            this.f11912j.d(bufferedReader);
            bufferedReader.readLine();
            this.f11908h.d(bufferedReader);
            bufferedReader.readLine();
            this.f11914k.d(bufferedReader);
            bufferedReader.readLine();
            this.f11915l.d(bufferedReader);
            bufferedReader.readLine();
            this.f11917n.d(bufferedReader);
            bufferedReader.readLine();
            this.f11916m.d(bufferedReader);
            bufferedReader.readLine();
            this.f11901d0 = i0(bufferedReader, "attached");
            this.f11903e0 = i0(bufferedReader, "continuous");
            this.f11905f0 = i0(bufferedReader, "aligned");
            this.f11909h0 = i0(bufferedReader, "additive");
            this.f11907g0 = i0(bufferedReader, "behind");
            String readLine = bufferedReader.readLine();
            if (readLine.startsWith("premultipliedAlpha")) {
                this.f11911i0 = j0(readLine);
                readLine = bufferedReader.readLine();
            }
            if (readLine.startsWith("spriteMode")) {
                this.f11928y = SpriteMode.valueOf(n0(readLine));
                bufferedReader.readLine();
            }
            com.badlogic.gdx.utils.a<String> aVar = new com.badlogic.gdx.utils.a<>();
            while (true) {
                String readLine2 = bufferedReader.readLine();
                if (readLine2 == null || readLine2.isEmpty()) {
                    break;
                } else {
                    aVar.a(readLine2);
                }
            }
            C0(aVar);
        } catch (RuntimeException e11) {
            if (this.E == null) {
                throw e11;
            }
            throw new RuntimeException("Error parsing emitter: " + this.E, e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0019, code lost:
    
        a(r3);
        r0[r3] = true;
        r2 = r2 + 1;
        r3 = r3 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(int r7) {
        /*
            r6 = this;
            int r0 = r6.B
            int r1 = r6.G
            int r0 = r0 - r1
            int r7 = java.lang.Math.min(r7, r0)
            if (r7 != 0) goto Lc
            return
        Lc:
            boolean[] r0 = r6.H
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L11:
            if (r2 >= r7) goto L28
        L13:
            if (r3 >= r1) goto L28
            boolean r4 = r0[r3]
            if (r4 != 0) goto L25
            r6.a(r3)
            int r4 = r3 + 1
            r5 = 1
            r0[r3] = r5
            int r2 = r2 + 1
            r3 = r4
            goto L11
        L25:
            int r3 = r3 + 1
            goto L13
        L28:
            int r0 = r6.G
            int r0 = r0 + r7
            r6.G = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.graphics.g2d.ParticleEmitter.c(int):void");
    }

    public void c0(ParticleEmitter particleEmitter) {
        g[] x11 = x();
        g[] x12 = particleEmitter.x();
        for (int i11 = 0; i11 < x11.length; i11++) {
            x11[i11].m(x12[i11]);
        }
    }

    public void d() {
        this.M = true;
        this.f11895a0 = this.Z;
    }

    public void d0(ParticleEmitter particleEmitter) {
        e0(particleEmitter);
        f0(particleEmitter);
    }

    public boolean e() {
        return this.f11913j0;
    }

    public void e0(ParticleEmitter particleEmitter) {
        g[] O = O();
        g[] O2 = particleEmitter.O();
        for (int i11 = 0; i11 < O.length; i11++) {
            O[i11].m(O2[i11]);
        }
    }

    public void f(w1.a aVar) {
        if (this.f11911i0) {
            aVar.g0(1, com.badlogic.gdx.graphics.f.f11659s);
        } else if (this.f11909h0) {
            aVar.g0(com.badlogic.gdx.graphics.f.f11653r, 1);
        } else {
            aVar.g0(com.badlogic.gdx.graphics.f.f11653r, com.badlogic.gdx.graphics.f.f11659s);
        }
        e[] eVarArr = this.f11929z;
        boolean[] zArr = this.H;
        int length = zArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (zArr[i11]) {
                eVarArr[i11].D(aVar);
            }
        }
        if (this.f11913j0) {
            if (this.f11909h0 || this.f11911i0) {
                aVar.g0(com.badlogic.gdx.graphics.f.f11653r, com.badlogic.gdx.graphics.f.f11659s);
            }
        }
    }

    public void f0(ParticleEmitter particleEmitter) {
        g[] S = S();
        g[] S2 = particleEmitter.S();
        for (int i11 = 0; i11 < S.length; i11++) {
            S[i11].m(S2[i11]);
        }
    }

    public void g(w1.a aVar, float f11) {
        float f12 = this.f11926w + (f11 * 1000.0f);
        this.f11926w = f12;
        if (f12 < 1.0f) {
            f(aVar);
            return;
        }
        int i11 = (int) f12;
        float f13 = i11;
        this.f11926w = f12 - f13;
        if (this.f11911i0) {
            aVar.g0(1, com.badlogic.gdx.graphics.f.f11659s);
        } else if (this.f11909h0) {
            aVar.g0(com.badlogic.gdx.graphics.f.f11653r, 1);
        } else {
            aVar.g0(com.badlogic.gdx.graphics.f.f11653r, com.badlogic.gdx.graphics.f.f11659s);
        }
        e[] eVarArr = this.f11929z;
        boolean[] zArr = this.H;
        int i12 = this.G;
        int length = zArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            if (zArr[i13]) {
                e eVar = eVarArr[i13];
                if (M0(eVar, f11, i11)) {
                    eVar.D(aVar);
                } else {
                    zArr[i13] = false;
                    i12--;
                }
            }
        }
        this.G = i12;
        if (this.f11913j0 && (this.f11909h0 || this.f11911i0)) {
            aVar.g0(com.badlogic.gdx.graphics.f.f11653r, com.badlogic.gdx.graphics.f.f11659s);
        }
        float f14 = this.f11899c0;
        if (f14 < this.f11897b0) {
            this.f11899c0 = f14 + f13;
            return;
        }
        if (this.I) {
            this.I = false;
            b();
        }
        float f15 = this.f11895a0;
        if (f15 < this.Z) {
            this.f11895a0 = f15 + f13;
        } else if (!this.f11903e0 || this.M) {
            return;
        } else {
            q0();
        }
        this.Q += i11;
        float t11 = this.O + (this.P * this.f11902e.t(this.f11895a0 / this.Z));
        if (t11 > 0.0f) {
            float f16 = 1000.0f / t11;
            int i14 = this.Q;
            if (i14 >= f16) {
                int min = Math.min((int) (i14 / f16), this.B - i12);
                this.Q = (int) (((int) (this.Q - (min * f16))) % f16);
                c(min);
            }
        }
        int i15 = this.A;
        if (i12 < i15) {
            c(i15 - i12);
        }
    }

    public e g0(l lVar) {
        return new e(lVar);
    }

    public void h() {
        h hVar = this.f11912j;
        hVar.B(-hVar.s(), -this.f11912j.r());
        h hVar2 = this.f11912j;
        hVar2.o(-hVar2.i(), -this.f11912j.h());
        h hVar3 = this.f11915l;
        hVar3.B(-hVar3.s(), -this.f11915l.r());
        h hVar4 = this.f11915l;
        hVar4.o(-hVar4.i(), -this.f11915l.h());
        h hVar5 = this.f11914k;
        hVar5.B(-hVar5.s(), -this.f11914k.r());
        h hVar6 = this.f11914k;
        hVar6.o(-hVar6.i(), -this.f11914k.h());
        h hVar7 = this.f11908h;
        hVar7.B(-hVar7.s(), -this.f11908h.r());
        h hVar8 = this.f11908h;
        hVar8.o(-hVar8.i(), -this.f11908h.h());
        g gVar = this.f11919p;
        gVar.o(-gVar.i(), -this.f11919p.h());
    }

    public void h0() {
        if (this.f11927x.isEmpty()) {
            throw new IllegalStateException("ParticleEmitter.setSprites() must have been called before preAllocateParticles()");
        }
        int i11 = 0;
        while (true) {
            e[] eVarArr = this.f11929z;
            if (i11 >= eVarArr.length) {
                return;
            }
            if (eVarArr[i11] == null) {
                e g02 = g0(this.f11927x.first());
                eVarArr[i11] = g02;
                g02.a(this.J, this.K);
            }
            i11++;
        }
    }

    public final void i() {
        c cVar = this.f11896b;
        this.R = cVar.f11941a ? (int) cVar.k() : 0;
        int y11 = (int) this.f11896b.y();
        this.S = y11;
        if (this.f11896b.f11949i) {
            return;
        }
        this.S = y11 - this.R;
    }

    public final void j() {
        this.T = (int) this.f11900d.k();
        int y11 = (int) this.f11900d.y();
        this.U = y11;
        if (this.f11900d.f11949i) {
            return;
        }
        this.U = y11 - this.T;
    }

    public int k() {
        return this.G;
    }

    public boolean l() {
        return this.M;
    }

    public h m() {
        return this.f11912j;
    }

    public BoundingBox n() {
        if (this.N == null) {
            this.N = new BoundingBox();
        }
        e[] eVarArr = this.f11929z;
        boolean[] zArr = this.H;
        BoundingBox boundingBox = this.N;
        boundingBox.inf();
        int length = zArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (zArr[i11]) {
                Rectangle F = eVarArr[i11].F();
                boundingBox.ext(F.f12533x, F.f12534y, 0.0f);
                boundingBox.ext(F.f12533x + F.width, F.f12534y + F.height, 0.0f);
            }
        }
        return boundingBox;
    }

    public g o() {
        return this.f11894a;
    }

    public void o0() {
        p0(true);
    }

    public g p() {
        return this.f11898c;
    }

    public void p0(boolean z11) {
        this.Q = 0;
        this.f11895a0 = this.Z;
        boolean[] zArr = this.H;
        int length = zArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            zArr[i11] = false;
        }
        this.G = 0;
        if (z11) {
            K0();
        }
    }

    public h q() {
        return this.f11902e;
    }

    public final void q0() {
        g gVar = this.f11894a;
        this.f11897b0 = gVar.f11941a ? gVar.k() : 0.0f;
        this.f11899c0 = 0.0f;
        this.f11895a0 -= this.Z;
        this.Z = this.f11898c.k();
        this.O = (int) this.f11902e.k();
        int y11 = (int) this.f11902e.y();
        this.P = y11;
        if (!this.f11902e.f11949i) {
            this.P = y11 - this.O;
        }
        if (!this.f11900d.f11936j) {
            j();
        }
        if (!this.f11896b.f11936j) {
            i();
        }
        this.V = this.f11920q.k();
        float y12 = this.f11920q.y();
        this.W = y12;
        if (!this.f11920q.f11949i) {
            this.W = y12 - this.V;
        }
        this.X = this.f11921r.k();
        float y13 = this.f11921r.y();
        this.Y = y13;
        if (!this.f11921r.f11949i) {
            this.Y = y13 - this.X;
        }
        this.L = 0;
        h hVar = this.f11912j;
        if (hVar.f11941a && hVar.f11946f.length > 1) {
            this.L = 2;
        }
        if (this.f11910i.f11941a) {
            this.L |= 8;
        }
        if (this.f11904f.f11946f.length > 1) {
            this.L |= 1;
        }
        h hVar2 = this.f11906g;
        if (hVar2.f11941a && hVar2.f11946f.length > 1) {
            this.L |= 1;
        }
        h hVar3 = this.f11908h;
        if (hVar3.f11941a && hVar3.f11946f.length > 1) {
            this.L |= 4;
        }
        if (this.f11914k.f11941a) {
            this.L |= 16;
        }
        if (this.f11915l.f11941a) {
            this.L |= 32;
        }
        if (this.f11917n.f11935d.length > 1) {
            this.L |= 64;
        }
        if (this.f11928y == SpriteMode.animated) {
            this.L |= 128;
        }
    }

    public h r() {
        return this.f11915l;
    }

    public void r0(Writer writer) throws IOException {
        writer.write(this.E + "\n");
        writer.write("- Delay -\n");
        this.f11894a.e(writer);
        writer.write("- Duration - \n");
        this.f11898c.e(writer);
        writer.write("- Count - \n");
        writer.write("min: " + this.A + "\n");
        writer.write("max: " + this.B + "\n");
        writer.write("- Emission - \n");
        this.f11902e.e(writer);
        writer.write("- Life - \n");
        this.f11900d.e(writer);
        writer.write("- Life Offset - \n");
        this.f11896b.e(writer);
        writer.write("- X Offset - \n");
        this.f11918o.e(writer);
        writer.write("- Y Offset - \n");
        this.f11919p.e(writer);
        writer.write("- Spawn Shape - \n");
        this.f11922s.e(writer);
        writer.write("- Spawn Width - \n");
        this.f11920q.e(writer);
        writer.write("- Spawn Height - \n");
        this.f11921r.e(writer);
        writer.write("- X Scale - \n");
        this.f11904f.e(writer);
        writer.write("- Y Scale - \n");
        this.f11906g.e(writer);
        writer.write("- Velocity - \n");
        this.f11910i.e(writer);
        writer.write("- Angle - \n");
        this.f11912j.e(writer);
        writer.write("- Rotation - \n");
        this.f11908h.e(writer);
        writer.write("- Wind - \n");
        this.f11914k.e(writer);
        writer.write("- Gravity - \n");
        this.f11915l.e(writer);
        writer.write("- Tint - \n");
        this.f11917n.e(writer);
        writer.write("- Transparency - \n");
        this.f11916m.e(writer);
        writer.write("- Options - \n");
        writer.write("attached: " + this.f11901d0 + "\n");
        writer.write("continuous: " + this.f11903e0 + "\n");
        writer.write("aligned: " + this.f11905f0 + "\n");
        writer.write("additive: " + this.f11909h0 + "\n");
        writer.write("behind: " + this.f11907g0 + "\n");
        writer.write("premultipliedAlpha: " + this.f11911i0 + "\n");
        writer.write("spriteMode: " + this.f11928y.toString() + "\n");
        writer.write("- Image Paths -\n");
        a.b<String> it = this.F.iterator();
        while (it.hasNext()) {
            writer.write(it.next() + "\n");
        }
        writer.write("\n");
    }

    public com.badlogic.gdx.utils.a<String> s() {
        return this.F;
    }

    public void s0(float f11) {
        if (f11 == 1.0f) {
            return;
        }
        for (g gVar : x()) {
            gVar.l(f11);
        }
    }

    public h t() {
        return this.f11900d;
    }

    public void t0(float f11) {
        if (f11 == 1.0f) {
            return;
        }
        u0(f11, f11);
    }

    public h u() {
        return this.f11896b;
    }

    public void u0(float f11, float f12) {
        if (f11 == 1.0f && f12 == 1.0f) {
            return;
        }
        for (g gVar : O()) {
            gVar.l(f11);
        }
        for (g gVar2 : S()) {
            gVar2.l(f12);
        }
    }

    public int v() {
        return this.B;
    }

    public void v0(boolean z11) {
        this.f11909h0 = z11;
    }

    public int w() {
        return this.A;
    }

    public void w0(boolean z11) {
        this.f11905f0 = z11;
    }

    public g[] x() {
        if (this.f11925v == null) {
            this.f11925v = new g[]{this.f11910i, this.f11914k, this.f11915l};
        }
        return this.f11925v;
    }

    public void x0(boolean z11) {
        this.f11901d0 = z11;
    }

    public String y() {
        return this.E;
    }

    public void y0(boolean z11) {
        this.f11907g0 = z11;
    }

    public e[] z() {
        return this.f11929z;
    }

    public void z0(boolean z11) {
        this.f11913j0 = z11;
    }

    public ParticleEmitter(BufferedReader bufferedReader) throws IOException {
        this.f11894a = new g();
        this.f11896b = new c();
        this.f11898c = new g();
        this.f11900d = new c();
        this.f11902e = new h();
        this.f11904f = new h();
        this.f11906g = new h();
        this.f11908h = new h();
        this.f11910i = new h();
        this.f11912j = new h();
        this.f11914k = new h();
        this.f11915l = new h();
        this.f11916m = new h();
        this.f11917n = new b();
        this.f11918o = new h();
        this.f11919p = new h();
        this.f11920q = new h();
        this.f11921r = new h();
        this.f11922s = new i();
        this.f11928y = SpriteMode.single;
        this.B = 4;
        this.Z = 1.0f;
        this.f11909h0 = true;
        this.f11911i0 = false;
        this.f11913j0 = true;
        T();
        b0(bufferedReader);
    }

    public ParticleEmitter(ParticleEmitter particleEmitter) {
        this.f11894a = new g();
        this.f11896b = new c();
        this.f11898c = new g();
        this.f11900d = new c();
        this.f11902e = new h();
        this.f11904f = new h();
        this.f11906g = new h();
        this.f11908h = new h();
        this.f11910i = new h();
        this.f11912j = new h();
        this.f11914k = new h();
        this.f11915l = new h();
        this.f11916m = new h();
        this.f11917n = new b();
        this.f11918o = new h();
        this.f11919p = new h();
        this.f11920q = new h();
        this.f11921r = new h();
        this.f11922s = new i();
        this.f11928y = SpriteMode.single;
        this.B = 4;
        this.Z = 1.0f;
        this.f11909h0 = true;
        this.f11911i0 = false;
        this.f11913j0 = true;
        this.f11927x = new com.badlogic.gdx.utils.a<>(particleEmitter.f11927x);
        this.E = particleEmitter.E;
        this.F = new com.badlogic.gdx.utils.a<>(particleEmitter.F);
        D0(particleEmitter.B);
        this.A = particleEmitter.A;
        this.f11894a.j(particleEmitter.f11894a);
        this.f11898c.j(particleEmitter.f11898c);
        this.f11902e.x(particleEmitter.f11902e);
        this.f11900d.I(particleEmitter.f11900d);
        this.f11896b.I(particleEmitter.f11896b);
        this.f11904f.x(particleEmitter.f11904f);
        this.f11906g.x(particleEmitter.f11906g);
        this.f11908h.x(particleEmitter.f11908h);
        this.f11910i.x(particleEmitter.f11910i);
        this.f11912j.x(particleEmitter.f11912j);
        this.f11914k.x(particleEmitter.f11914k);
        this.f11915l.x(particleEmitter.f11915l);
        this.f11916m.x(particleEmitter.f11916m);
        this.f11917n.k(particleEmitter.f11917n);
        this.f11918o.j(particleEmitter.f11918o);
        this.f11919p.j(particleEmitter.f11919p);
        this.f11920q.x(particleEmitter.f11920q);
        this.f11921r.x(particleEmitter.f11921r);
        this.f11922s.k(particleEmitter.f11922s);
        this.f11901d0 = particleEmitter.f11901d0;
        this.f11903e0 = particleEmitter.f11903e0;
        this.f11905f0 = particleEmitter.f11905f0;
        this.f11907g0 = particleEmitter.f11907g0;
        this.f11909h0 = particleEmitter.f11909h0;
        this.f11911i0 = particleEmitter.f11911i0;
        this.f11913j0 = particleEmitter.f11913j0;
        this.f11928y = particleEmitter.f11928y;
        G0(particleEmitter.L(), particleEmitter.P());
    }
}
