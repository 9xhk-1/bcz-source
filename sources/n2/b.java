package n2;

import com.badlogic.gdx.graphics.Cubemap;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.TextureData;
import com.badlogic.gdx.utils.GdxRuntimeException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b implements com.badlogic.gdx.graphics.d {

    /* renamed from: a, reason: collision with root package name */
    public final TextureData[] f74109a;

    public b() {
        this((TextureData) null, (TextureData) null, (TextureData) null, (TextureData) null, (TextureData) null, (TextureData) null);
    }

    @Override // com.badlogic.gdx.graphics.d
    public boolean a() {
        for (TextureData textureData : this.f74109a) {
            if (!textureData.a()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.badlogic.gdx.graphics.d
    public boolean b() {
        return false;
    }

    public TextureData c(Cubemap.CubemapSide cubemapSide) {
        return this.f74109a[cubemapSide.index];
    }

    public boolean d() {
        int i11 = 0;
        while (true) {
            TextureData[] textureDataArr = this.f74109a;
            if (i11 >= textureDataArr.length) {
                return true;
            }
            if (textureDataArr[i11] == null) {
                return false;
            }
            i11++;
        }
    }

    public void e(Cubemap.CubemapSide cubemapSide, Pixmap pixmap) {
        this.f74109a[cubemapSide.index] = pixmap != null ? new v(pixmap, null, false, false) : null;
    }

    @Override // com.badlogic.gdx.graphics.d
    public void f() {
        int i11 = 0;
        while (true) {
            TextureData[] textureDataArr = this.f74109a;
            if (i11 >= textureDataArr.length) {
                return;
            }
            if (textureDataArr[i11].getType() == TextureData.TextureDataType.Custom) {
                this.f74109a[i11].c(com.badlogic.gdx.graphics.f.K2 + i11);
            } else {
                Pixmap d11 = this.f74109a[i11].d();
                boolean g11 = this.f74109a[i11].g();
                if (this.f74109a[i11].getFormat() != d11.b1()) {
                    Pixmap pixmap = new Pixmap(d11.i1(), d11.f1(), this.f74109a[i11].getFormat());
                    pixmap.k1(Pixmap.Blending.None);
                    pixmap.Z(d11, 0, 0, 0, 0, d11.i1(), d11.f1());
                    if (this.f74109a[i11].g()) {
                        d11.dispose();
                    }
                    d11 = pixmap;
                    g11 = true;
                }
                q1.g.f81384g.glPixelStorei(com.badlogic.gdx.graphics.f.T0, 1);
                q1.g.f81384g.glTexImage2D(i11 + com.badlogic.gdx.graphics.f.K2, 0, d11.d1(), d11.i1(), d11.f1(), 0, d11.c1(), d11.e1(), d11.h1());
                if (g11) {
                    d11.dispose();
                }
            }
            i11++;
        }
    }

    public void g(Cubemap.CubemapSide cubemapSide, v1.a aVar) {
        this.f74109a[cubemapSide.index] = TextureData.a.b(aVar, false);
    }

    @Override // com.badlogic.gdx.graphics.d
    public int getHeight() {
        int i11;
        int height;
        int height2;
        int height3;
        TextureData textureData = this.f74109a[Cubemap.CubemapSide.PositiveZ.index];
        if (textureData == null || (i11 = textureData.getHeight()) <= 0) {
            i11 = 0;
        }
        TextureData textureData2 = this.f74109a[Cubemap.CubemapSide.NegativeZ.index];
        if (textureData2 != null && (height3 = textureData2.getHeight()) > i11) {
            i11 = height3;
        }
        TextureData textureData3 = this.f74109a[Cubemap.CubemapSide.PositiveX.index];
        if (textureData3 != null && (height2 = textureData3.getHeight()) > i11) {
            i11 = height2;
        }
        TextureData textureData4 = this.f74109a[Cubemap.CubemapSide.NegativeX.index];
        return (textureData4 == null || (height = textureData4.getHeight()) <= i11) ? i11 : height;
    }

    @Override // com.badlogic.gdx.graphics.d
    public int getWidth() {
        int i11;
        int width;
        int width2;
        int width3;
        TextureData textureData = this.f74109a[Cubemap.CubemapSide.PositiveZ.index];
        if (textureData == null || (i11 = textureData.getWidth()) <= 0) {
            i11 = 0;
        }
        TextureData textureData2 = this.f74109a[Cubemap.CubemapSide.NegativeZ.index];
        if (textureData2 != null && (width3 = textureData2.getWidth()) > i11) {
            i11 = width3;
        }
        TextureData textureData3 = this.f74109a[Cubemap.CubemapSide.PositiveY.index];
        if (textureData3 != null && (width2 = textureData3.getWidth()) > i11) {
            i11 = width2;
        }
        TextureData textureData4 = this.f74109a[Cubemap.CubemapSide.NegativeY.index];
        return (textureData4 == null || (width = textureData4.getWidth()) <= i11) ? i11 : width;
    }

    @Override // com.badlogic.gdx.graphics.d
    public void prepare() {
        if (!d()) {
            throw new GdxRuntimeException("You need to complete your cubemap data before using it");
        }
        int i11 = 0;
        while (true) {
            TextureData[] textureDataArr = this.f74109a;
            if (i11 >= textureDataArr.length) {
                return;
            }
            if (!textureDataArr[i11].b()) {
                this.f74109a[i11].prepare();
            }
            i11++;
        }
    }

    public b(v1.a aVar, v1.a aVar2, v1.a aVar3, v1.a aVar4, v1.a aVar5, v1.a aVar6) {
        this(TextureData.a.b(aVar, false), TextureData.a.b(aVar2, false), TextureData.a.b(aVar3, false), TextureData.a.b(aVar4, false), TextureData.a.b(aVar5, false), TextureData.a.b(aVar6, false));
    }

    public b(v1.a aVar, v1.a aVar2, v1.a aVar3, v1.a aVar4, v1.a aVar5, v1.a aVar6, boolean z11) {
        this(TextureData.a.b(aVar, z11), TextureData.a.b(aVar2, z11), TextureData.a.b(aVar3, z11), TextureData.a.b(aVar4, z11), TextureData.a.b(aVar5, z11), TextureData.a.b(aVar6, z11));
    }

    public b(Pixmap pixmap, Pixmap pixmap2, Pixmap pixmap3, Pixmap pixmap4, Pixmap pixmap5, Pixmap pixmap6) {
        this(pixmap, pixmap2, pixmap3, pixmap4, pixmap5, pixmap6, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(com.badlogic.gdx.graphics.Pixmap r4, com.badlogic.gdx.graphics.Pixmap r5, com.badlogic.gdx.graphics.Pixmap r6, com.badlogic.gdx.graphics.Pixmap r7, com.badlogic.gdx.graphics.Pixmap r8, com.badlogic.gdx.graphics.Pixmap r9, boolean r10) {
        /*
            r3 = this;
            r0 = 0
            r1 = 0
            if (r4 != 0) goto L6
            r2 = r1
            goto Lb
        L6:
            n2.v r2 = new n2.v
            r2.<init>(r4, r1, r10, r0)
        Lb:
            if (r5 != 0) goto Lf
            r4 = r1
            goto L14
        Lf:
            n2.v r4 = new n2.v
            r4.<init>(r5, r1, r10, r0)
        L14:
            if (r6 != 0) goto L18
            r5 = r1
            goto L1d
        L18:
            n2.v r5 = new n2.v
            r5.<init>(r6, r1, r10, r0)
        L1d:
            if (r7 != 0) goto L21
            r6 = r1
            goto L26
        L21:
            n2.v r6 = new n2.v
            r6.<init>(r7, r1, r10, r0)
        L26:
            if (r8 != 0) goto L2a
            r7 = r1
            goto L2f
        L2a:
            n2.v r7 = new n2.v
            r7.<init>(r8, r1, r10, r0)
        L2f:
            if (r9 != 0) goto L39
            r10 = r1
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r5 = r2
        L37:
            r4 = r3
            goto L45
        L39:
            n2.v r8 = new n2.v
            r8.<init>(r9, r1, r10, r0)
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r2
            r6 = r4
            goto L37
        L45:
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.b.<init>(com.badlogic.gdx.graphics.Pixmap, com.badlogic.gdx.graphics.Pixmap, com.badlogic.gdx.graphics.Pixmap, com.badlogic.gdx.graphics.Pixmap, com.badlogic.gdx.graphics.Pixmap, com.badlogic.gdx.graphics.Pixmap, boolean):void");
    }

    public b(int i11, int i12, int i13, Pixmap.Format format) {
        this(new v(new Pixmap(i13, i12, format), null, false, true), new v(new Pixmap(i13, i12, format), null, false, true), new v(new Pixmap(i11, i13, format), null, false, true), new v(new Pixmap(i11, i13, format), null, false, true), new v(new Pixmap(i11, i12, format), null, false, true), new v(new Pixmap(i11, i12, format), null, false, true));
    }

    public b(TextureData textureData, TextureData textureData2, TextureData textureData3, TextureData textureData4, TextureData textureData5, TextureData textureData6) {
        this.f74109a = new TextureData[]{textureData, textureData2, textureData3, textureData4, textureData5, textureData6};
    }
}
