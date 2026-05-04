package com.badlogic.gdx.graphics.glutils;

import a3.x0;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.TextureData;
import com.badlogic.gdx.graphics.d;
import com.badlogic.gdx.graphics.f;
import com.badlogic.gdx.graphics.glutils.ETC1;
import com.badlogic.gdx.utils.BufferUtils;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.zip.GZIPInputStream;
import q1.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c implements TextureData, d {

    /* renamed from: p, reason: collision with root package name */
    public static final int f12244p = 4660;

    /* renamed from: q, reason: collision with root package name */
    public static final int f12245q = 4660;

    /* renamed from: r, reason: collision with root package name */
    public static final int f12246r = 4660;

    /* renamed from: s, reason: collision with root package name */
    public static final int f12247s = 4660;

    /* renamed from: a, reason: collision with root package name */
    public v1.a f12248a;

    /* renamed from: b, reason: collision with root package name */
    public int f12249b;

    /* renamed from: c, reason: collision with root package name */
    public int f12250c;

    /* renamed from: d, reason: collision with root package name */
    public int f12251d;

    /* renamed from: e, reason: collision with root package name */
    public int f12252e;

    /* renamed from: f, reason: collision with root package name */
    public int f12253f;

    /* renamed from: g, reason: collision with root package name */
    public int f12254g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f12255h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f12256i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f12257j;

    /* renamed from: k, reason: collision with root package name */
    public int f12258k;

    /* renamed from: l, reason: collision with root package name */
    public int f12259l;

    /* renamed from: m, reason: collision with root package name */
    public int f12260m;

    /* renamed from: n, reason: collision with root package name */
    public ByteBuffer f12261n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f12262o;

    public c(v1.a aVar, boolean z11) {
        this.f12248a = aVar;
        this.f12262o = z11;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean a() {
        return true;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean b() {
        return this.f12261n != null;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public void c(int i11) {
        boolean z11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z12;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        if (this.f12261n == null) {
            throw new GdxRuntimeException("Call prepare() before calling consumeCompressedData()");
        }
        IntBuffer G = BufferUtils.G(16);
        int i24 = this.f12249b;
        int i25 = 1;
        if (i24 != 0 && this.f12251d != 0) {
            z11 = false;
        } else {
            if (i24 + this.f12251d != 0) {
                throw new GdxRuntimeException("either both or none of glType, glFormat must be zero");
            }
            z11 = true;
        }
        if (this.f12255h > 0) {
            i13 = 3553;
            i12 = 2;
        } else {
            i12 = 1;
            i13 = 4660;
        }
        if (this.f12256i > 0) {
            i12 = 3;
            i13 = 4660;
        }
        int i26 = this.f12258k;
        if (i26 == 6) {
            if (i12 != 2) {
                throw new GdxRuntimeException("cube map needs 2D faces");
            }
            i13 = 34067;
        } else if (i26 != 1) {
            throw new GdxRuntimeException("numberOfFaces must be either 1 or 6");
        }
        if (this.f12257j > 0) {
            if (i13 != 4660 && i13 != 3553) {
                throw new GdxRuntimeException("No API for 3D and cube arrays yet");
            }
            i12++;
            i13 = 4660;
        }
        if (i13 == 4660) {
            throw new GdxRuntimeException("Unsupported texture format (only 2D texture are supported in LibGdx for the time being)");
        }
        int i27 = f.K2;
        if (i26 != 6 || i11 == 34067) {
            if (i26 != 6 || i11 != 34067) {
                if (i11 != i13 && (34069 > i11 || i11 > 34074 || i11 != 3553)) {
                    throw new GdxRuntimeException("Invalid target requested : 0x" + Integer.toHexString(i11) + ", expecting : 0x" + Integer.toHexString(i13));
                }
                i27 = i11;
            }
            i14 = -1;
        } else {
            if (34069 > i11 || i11 > 34074) {
                throw new GdxRuntimeException("You must specify either GL_TEXTURE_CUBE_MAP to bind all 6 faces of the cube or the requested face GL_TEXTURE_CUBE_MAP_POSITIVE_X and followings.");
            }
            i14 = i11 - f.K2;
        }
        g.f81384g.glGetIntegerv(f.T0, G);
        int i28 = G.get(0);
        int i29 = 4;
        if (i28 != 4) {
            g.f81384g.glPixelStorei(f.T0, 4);
        }
        int i31 = this.f12252e;
        int i32 = this.f12251d;
        int i33 = this.f12260m;
        int i34 = 0;
        while (i34 < this.f12259l) {
            int max = Math.max(i25, this.f12254g >> i34);
            int i35 = i29;
            int max2 = Math.max(i25, this.f12255h >> i34);
            Math.max(i25, this.f12256i >> i34);
            this.f12261n.position(i33);
            int i36 = this.f12261n.getInt();
            int i37 = (i36 + 3) & (-4);
            i33 += 4;
            int i38 = 0;
            while (i38 < this.f12258k) {
                this.f12261n.position(i33);
                i33 += i37;
                if (i14 == -1 || i14 == i38) {
                    ByteBuffer slice = this.f12261n.slice();
                    slice.limit(i37);
                    i15 = i14;
                    if (i12 != 1 && i12 == 2) {
                        int i39 = this.f12257j;
                        if (i39 > 0) {
                            max2 = i39;
                        }
                        if (z11) {
                            if (i31 == ETC1.f12207b) {
                                z12 = z11;
                                if (g.f81379b.d("GL_OES_compressed_ETC1_RGB8_texture")) {
                                    i21 = i34;
                                    i23 = i36;
                                    i17 = max2;
                                    i18 = max;
                                    i19 = i31;
                                    g.f81384g.glCompressedTexImage2D(i27 + i38, i21, i19, i18, i17, 0, i23, slice);
                                } else {
                                    Pixmap a11 = ETC1.a(new ETC1.a(max, max2, slice, 0), Pixmap.Format.RGB888);
                                    i21 = i34;
                                    g.f81384g.glTexImage2D(i27 + i38, i21, a11.d1(), a11.i1(), a11.f1(), 0, a11.c1(), a11.e1(), a11.h1());
                                    a11.dispose();
                                    i16 = i36;
                                    i17 = max2;
                                    i18 = max;
                                    i19 = i31;
                                    i22 = i32;
                                }
                            } else {
                                z12 = z11;
                                i23 = i36;
                                i17 = max2;
                                i18 = max;
                                i19 = i31;
                                i21 = i34;
                                g.f81384g.glCompressedTexImage2D(i27 + i38, i21, i19, i18, i17, 0, i23, slice);
                            }
                            i16 = i23;
                            i22 = i32;
                        } else {
                            z12 = z11;
                            i16 = i36;
                            i17 = max2;
                            i18 = max;
                            i19 = i31;
                            i21 = i34;
                            i22 = i32;
                            g.f81384g.glTexImage2D(i27 + i38, i21, i19, i18, i17, 0, i22, this.f12249b, slice);
                        }
                        max2 = i17;
                        i38++;
                        i36 = i16;
                        i34 = i21;
                        i31 = i19;
                        max = i18;
                        i32 = i22;
                        i14 = i15;
                        z11 = z12;
                    }
                } else {
                    i15 = i14;
                }
                z12 = z11;
                i16 = i36;
                i18 = max;
                i19 = i31;
                i22 = i32;
                i21 = i34;
                i38++;
                i36 = i16;
                i34 = i21;
                i31 = i19;
                max = i18;
                i32 = i22;
                i14 = i15;
                z11 = z12;
            }
            i34++;
            i29 = i35;
            z11 = z11;
            i25 = 1;
        }
        if (i28 != i29) {
            g.f81384g.glPixelStorei(f.T0, i28);
        }
        if (e()) {
            g.f81384g.l3(i27);
        }
        h();
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public Pixmap d() {
        throw new GdxRuntimeException("This TextureData implementation does not return a Pixmap");
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean e() {
        return this.f12262o;
    }

    @Override // com.badlogic.gdx.graphics.d
    public void f() {
        c(f.I2);
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean g() {
        throw new GdxRuntimeException("This TextureData implementation does not return a Pixmap");
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public Pixmap.Format getFormat() {
        throw new GdxRuntimeException("This TextureData implementation directly handles texture formats.");
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public int getHeight() {
        return this.f12255h;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public TextureData.TextureDataType getType() {
        return TextureData.TextureDataType.Custom;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public int getWidth() {
        return this.f12254g;
    }

    public void h() {
        ByteBuffer byteBuffer = this.f12261n;
        if (byteBuffer != null) {
            BufferUtils.p(byteBuffer);
        }
        this.f12261n = null;
    }

    public ByteBuffer i(int i11, int i12) {
        int i13 = this.f12260m;
        for (int i14 = 0; i14 < this.f12259l; i14++) {
            int i15 = (this.f12261n.getInt(i13) + 3) & (-4);
            i13 += 4;
            if (i14 == i11) {
                for (int i16 = 0; i16 < this.f12258k; i16++) {
                    if (i16 == i12) {
                        this.f12261n.position(i13);
                        ByteBuffer slice = this.f12261n.slice();
                        slice.limit(i15);
                        return slice;
                    }
                    i13 += i15;
                }
            } else {
                i13 += i15 * this.f12258k;
            }
        }
        return null;
    }

    public int j() {
        return this.f12252e;
    }

    public int k() {
        return this.f12258k;
    }

    public int l() {
        return this.f12259l;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public void prepare() {
        DataInputStream dataInputStream;
        if (this.f12261n != null) {
            throw new GdxRuntimeException("Already prepared");
        }
        v1.a aVar = this.f12248a;
        if (aVar == null) {
            throw new GdxRuntimeException("Need a file to load from");
        }
        if (aVar.z().endsWith(".zktx")) {
            byte[] bArr = new byte[f.D2];
            DataInputStream dataInputStream2 = null;
            try {
                try {
                    dataInputStream = new DataInputStream(new BufferedInputStream(new GZIPInputStream(this.f12248a.F())));
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f12261n = BufferUtils.J(dataInputStream.readInt());
                while (true) {
                    int read = dataInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    } else {
                        this.f12261n.put(bArr, 0, read);
                    }
                }
                this.f12261n.position(0);
                ByteBuffer byteBuffer = this.f12261n;
                byteBuffer.limit(byteBuffer.capacity());
                x0.a(dataInputStream);
            } catch (Exception e12) {
                e = e12;
                dataInputStream2 = dataInputStream;
                throw new GdxRuntimeException("Couldn't load zktx file '" + this.f12248a + "'", e);
            } catch (Throwable th3) {
                th = th3;
                dataInputStream2 = dataInputStream;
                x0.a(dataInputStream2);
                throw th;
            }
        } else {
            this.f12261n = ByteBuffer.wrap(this.f12248a.H());
        }
        if (this.f12261n.get() != -85) {
            throw new GdxRuntimeException("Invalid KTX Header");
        }
        if (this.f12261n.get() != 75) {
            throw new GdxRuntimeException("Invalid KTX Header");
        }
        if (this.f12261n.get() != 84) {
            throw new GdxRuntimeException("Invalid KTX Header");
        }
        if (this.f12261n.get() != 88) {
            throw new GdxRuntimeException("Invalid KTX Header");
        }
        if (this.f12261n.get() != 32) {
            throw new GdxRuntimeException("Invalid KTX Header");
        }
        if (this.f12261n.get() != 49) {
            throw new GdxRuntimeException("Invalid KTX Header");
        }
        if (this.f12261n.get() != 49) {
            throw new GdxRuntimeException("Invalid KTX Header");
        }
        if (this.f12261n.get() != -69) {
            throw new GdxRuntimeException("Invalid KTX Header");
        }
        if (this.f12261n.get() != 13) {
            throw new GdxRuntimeException("Invalid KTX Header");
        }
        if (this.f12261n.get() != 10) {
            throw new GdxRuntimeException("Invalid KTX Header");
        }
        if (this.f12261n.get() != 26) {
            throw new GdxRuntimeException("Invalid KTX Header");
        }
        if (this.f12261n.get() != 10) {
            throw new GdxRuntimeException("Invalid KTX Header");
        }
        int i11 = this.f12261n.getInt();
        if (i11 != 67305985 && i11 != 16909060) {
            throw new GdxRuntimeException("Invalid KTX Header");
        }
        if (i11 != 67305985) {
            ByteBuffer byteBuffer2 = this.f12261n;
            ByteOrder order = byteBuffer2.order();
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
            if (order == byteOrder) {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            byteBuffer2.order(byteOrder);
        }
        this.f12249b = this.f12261n.getInt();
        this.f12250c = this.f12261n.getInt();
        this.f12251d = this.f12261n.getInt();
        this.f12252e = this.f12261n.getInt();
        this.f12253f = this.f12261n.getInt();
        this.f12254g = this.f12261n.getInt();
        this.f12255h = this.f12261n.getInt();
        this.f12256i = this.f12261n.getInt();
        this.f12257j = this.f12261n.getInt();
        this.f12258k = this.f12261n.getInt();
        int i12 = this.f12261n.getInt();
        this.f12259l = i12;
        if (i12 == 0) {
            this.f12259l = 1;
            this.f12262o = true;
        }
        this.f12260m = this.f12261n.position() + this.f12261n.getInt();
        if (this.f12261n.isDirect()) {
            return;
        }
        int i13 = this.f12260m;
        for (int i14 = 0; i14 < this.f12259l; i14++) {
            i13 += (((this.f12261n.getInt(i13) + 3) & (-4)) * this.f12258k) + 4;
        }
        this.f12261n.limit(i13);
        this.f12261n.position(0);
        ByteBuffer J = BufferUtils.J(i13);
        J.order(this.f12261n.order());
        J.put(this.f12261n);
        this.f12261n = J;
    }
}
