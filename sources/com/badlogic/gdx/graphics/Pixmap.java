package com.badlogic.gdx.graphics;

import com.badlogic.gdx.Net;
import com.badlogic.gdx.graphics.g2d.Gdx2DPixmap;
import com.badlogic.gdx.utils.BufferUtils;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class Pixmap implements a3.q {

    /* renamed from: a, reason: collision with root package name */
    public Blending f11496a;

    /* renamed from: b, reason: collision with root package name */
    public Filter f11497b;

    /* renamed from: c, reason: collision with root package name */
    public final Gdx2DPixmap f11498c;

    /* renamed from: d, reason: collision with root package name */
    public int f11499d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11500e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Blending {
        None,
        SourceOver
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Filter {
        NearestNeighbour,
        BiLinear
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Format {
        Alpha,
        Intensity,
        LuminanceAlpha,
        RGB565,
        RGBA4444,
        RGB888,
        RGBA8888;

        public static Format fromGdx2DPixmapFormat(int i11) {
            if (i11 == 1) {
                return Alpha;
            }
            if (i11 == 2) {
                return LuminanceAlpha;
            }
            if (i11 == 5) {
                return RGB565;
            }
            if (i11 == 6) {
                return RGBA4444;
            }
            if (i11 == 3) {
                return RGB888;
            }
            if (i11 == 4) {
                return RGBA8888;
            }
            throw new GdxRuntimeException("Unknown Gdx2DPixmap Format: " + i11);
        }

        public static int toGdx2DPixmapFormat(Format format) {
            if (format == Alpha || format == Intensity) {
                return 1;
            }
            if (format == LuminanceAlpha) {
                return 2;
            }
            if (format == RGB565) {
                return 5;
            }
            if (format == RGBA4444) {
                return 6;
            }
            if (format == RGB888) {
                return 3;
            }
            if (format == RGBA8888) {
                return 4;
            }
            throw new GdxRuntimeException("Unknown Format: " + format);
        }

        public static int toGlFormat(Format format) {
            return Gdx2DPixmap.k1(toGdx2DPixmapFormat(format));
        }

        public static int toGlType(Format format) {
            return Gdx2DPixmap.l1(toGdx2DPixmapFormat(format));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void a(Throwable th2);

        void b(Pixmap pixmap);
    }

    public Pixmap(int i11, int i12, Format format) {
        this.f11496a = Blending.SourceOver;
        this.f11497b = Filter.BiLinear;
        this.f11499d = 0;
        this.f11498c = new Gdx2DPixmap(i11, i12, Format.toGdx2DPixmapFormat(format));
        k(0.0f, 0.0f, 0.0f, 0.0f);
        w0();
    }

    public static Pixmap b(int i11, int i12, int i13, int i14) {
        q1.g.f81384g.glPixelStorei(f.U0, 1);
        Pixmap pixmap = new Pixmap(i13, i14, Format.RGBA8888);
        q1.g.f81384g.glReadPixels(i11, i12, i13, i14, 6408, f.f11673u1, pixmap.h1());
        return pixmap;
    }

    public static void o(String str, b bVar) {
        Net.b bVar2 = new Net.b("GET");
        bVar2.q(str);
        q1.g.f81383f.d(bVar2, new a(bVar));
    }

    public void C0(int i11, int i12, int i13) {
        this.f11498c.Z(i11, i12, i13, this.f11499d);
    }

    public void D(int i11, int i12, int i13, int i14) {
        this.f11498c.D(i11, i12, i13, i14, this.f11499d);
    }

    public void I(int i11, int i12) {
        this.f11498c.i1(i11, i12, this.f11499d);
    }

    public void J0(int i11, int i12, int i13, int i14) {
        this.f11498c.i0(i11, i12, i13, i14, this.f11499d);
    }

    public void Q0(int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f11498c.n0(i11, i12, i13, i14, i15, i16, this.f11499d);
    }

    public void R(int i11, int i12, int i13) {
        this.f11498c.i1(i11, i12, i13);
    }

    public Blending V0() {
        return this.f11496a;
    }

    public void X(Pixmap pixmap, int i11, int i12) {
        Z(pixmap, i11, i12, 0, 0, pixmap.i1(), pixmap.f1());
    }

    public void Z(Pixmap pixmap, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f11498c.I(pixmap.f11498c, i13, i14, i11, i12, i15, i16);
    }

    public Filter a1() {
        return this.f11497b;
    }

    public Format b1() {
        return Format.fromGdx2DPixmapFormat(this.f11498c.w0());
    }

    public int c1() {
        return this.f11498c.Q0();
    }

    public int d1() {
        return this.f11498c.V0();
    }

    @Override // a3.q
    public void dispose() {
        if (this.f11500e) {
            q1.g.f81378a.h("Pixmap", "Pixmap already disposed!");
        } else {
            this.f11498c.dispose();
            this.f11500e = true;
        }
    }

    public int e1() {
        return this.f11498c.a1();
    }

    public int f1() {
        return this.f11498c.b1();
    }

    public int g1(int i11, int i12) {
        return this.f11498c.c1(i11, i12);
    }

    public void h(com.badlogic.gdx.graphics.b bVar) {
        this.f11499d = com.badlogic.gdx.graphics.b.C(bVar.f11544a, bVar.f11545b, bVar.f11546c, bVar.f11547d);
    }

    public ByteBuffer h1() {
        if (this.f11500e) {
            throw new GdxRuntimeException("Pixmap already disposed");
        }
        return this.f11498c.d1();
    }

    public void i0(Pixmap pixmap, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.f11498c.R(pixmap.f11498c, i11, i12, i13, i14, i15, i16, i17, i18);
    }

    public int i1() {
        return this.f11498c.e1();
    }

    public boolean j1() {
        return this.f11500e;
    }

    public void k(float f11, float f12, float f13, float f14) {
        this.f11499d = com.badlogic.gdx.graphics.b.C(f11, f12, f13, f14);
    }

    public void k1(Blending blending) {
        this.f11496a = blending;
        this.f11498c.h1(blending == Blending.None ? 0 : 1);
    }

    public void l1(int i11) {
        this.f11499d = i11;
    }

    public void m1(Filter filter) {
        this.f11497b = filter;
        this.f11498c.j1(filter == Filter.NearestNeighbour ? 0 : 1);
    }

    public void n0(int i11, int i12, int i13, int i14) {
        this.f11498c.X(i11, i12, i13, i14, this.f11499d);
    }

    public void n1(ByteBuffer byteBuffer) {
        if (!byteBuffer.isDirect()) {
            throw new GdxRuntimeException("Couldn't setPixels from non-direct ByteBuffer");
        }
        ByteBuffer d12 = this.f11498c.d1();
        BufferUtils.b(byteBuffer, d12, d12.limit());
    }

    public void w0() {
        this.f11498c.b(this.f11499d);
    }

    public void z(int i11, int i12, int i13) {
        this.f11498c.z(i11, i12, i13, this.f11499d);
    }

    public Pixmap(byte[] bArr, int i11, int i12) {
        this.f11496a = Blending.SourceOver;
        this.f11497b = Filter.BiLinear;
        this.f11499d = 0;
        try {
            this.f11498c = new Gdx2DPixmap(bArr, i11, i12, 0);
        } catch (IOException e11) {
            throw new GdxRuntimeException("Couldn't load pixmap from image data", e11);
        }
    }

    public Pixmap(ByteBuffer byteBuffer, int i11, int i12) {
        this.f11496a = Blending.SourceOver;
        this.f11497b = Filter.BiLinear;
        this.f11499d = 0;
        if (byteBuffer.isDirect()) {
            try {
                this.f11498c = new Gdx2DPixmap(byteBuffer, i11, i12, 0);
                return;
            } catch (IOException e11) {
                throw new GdxRuntimeException("Couldn't load pixmap from image data", e11);
            }
        }
        throw new GdxRuntimeException("Couldn't load pixmap from non-direct ByteBuffer");
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Net.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f11501a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.badlogic.gdx.graphics.Pixmap$a$a, reason: collision with other inner class name */
        public class RunnableC0187a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ byte[] f11502a;

            public RunnableC0187a(byte[] bArr) {
                this.f11502a = bArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    byte[] bArr = this.f11502a;
                    a.this.f11501a.b(new Pixmap(bArr, 0, bArr.length));
                } catch (Throwable th2) {
                    a.this.c(th2);
                }
            }
        }

        public a(b bVar) {
            this.f11501a = bVar;
        }

        @Override // com.badlogic.gdx.Net.d
        public void b(Net.c cVar) {
            q1.g.f81378a.q(new RunnableC0187a(cVar.getResult()));
        }

        @Override // com.badlogic.gdx.Net.d
        public void c(Throwable th2) {
            this.f11501a.a(th2);
        }

        @Override // com.badlogic.gdx.Net.d
        public void a() {
        }
    }

    public Pixmap(ByteBuffer byteBuffer) {
        this(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    public Pixmap(v1.a aVar) {
        this.f11496a = Blending.SourceOver;
        this.f11497b = Filter.BiLinear;
        this.f11499d = 0;
        try {
            byte[] H = aVar.H();
            this.f11498c = new Gdx2DPixmap(H, 0, H.length, 0);
        } catch (Exception e11) {
            throw new GdxRuntimeException("Couldn't load file: " + aVar, e11);
        }
    }

    public Pixmap(Gdx2DPixmap gdx2DPixmap) {
        this.f11496a = Blending.SourceOver;
        this.f11497b = Filter.BiLinear;
        this.f11499d = 0;
        this.f11498c = gdx2DPixmap;
    }
}
