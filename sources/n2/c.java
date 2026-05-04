package n2;

import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.TextureData;
import com.badlogic.gdx.utils.GdxRuntimeException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c implements com.badlogic.gdx.graphics.q {

    /* renamed from: a, reason: collision with root package name */
    public TextureData[] f74110a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f74111b;

    /* renamed from: c, reason: collision with root package name */
    public Pixmap.Format f74112c;

    /* renamed from: d, reason: collision with root package name */
    public int f74113d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f74114e;

    public c(Pixmap.Format format, boolean z11, v1.a[] aVarArr) {
        this.f74112c = format;
        this.f74114e = z11;
        this.f74113d = aVarArr.length;
        this.f74110a = new TextureData[aVarArr.length];
        for (int i11 = 0; i11 < aVarArr.length; i11++) {
            this.f74110a[i11] = TextureData.a.a(aVarArr[i11], format, z11);
        }
    }

    @Override // com.badlogic.gdx.graphics.q
    public boolean a() {
        for (TextureData textureData : this.f74110a) {
            if (!textureData.a()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.badlogic.gdx.graphics.q
    public boolean b() {
        return this.f74111b;
    }

    @Override // com.badlogic.gdx.graphics.q
    public int c() {
        return Pixmap.Format.toGlFormat(this.f74112c);
    }

    @Override // com.badlogic.gdx.graphics.q
    public int d() {
        return Pixmap.Format.toGlType(this.f74112c);
    }

    @Override // com.badlogic.gdx.graphics.q
    public void e() {
        boolean z11;
        Pixmap pixmap;
        boolean z12 = false;
        int i11 = 0;
        while (true) {
            TextureData[] textureDataArr = this.f74110a;
            if (i11 >= textureDataArr.length) {
                break;
            }
            if (textureDataArr[i11].getType() == TextureData.TextureDataType.Custom) {
                this.f74110a[i11].c(com.badlogic.gdx.graphics.g.L6);
                z12 = true;
            } else {
                TextureData textureData = this.f74110a[i11];
                Pixmap d11 = textureData.d();
                boolean g11 = textureData.g();
                if (textureData.getFormat() != d11.b1()) {
                    Pixmap pixmap2 = new Pixmap(d11.i1(), d11.f1(), textureData.getFormat());
                    pixmap2.k1(Pixmap.Blending.None);
                    pixmap2.Z(d11, 0, 0, 0, 0, d11.i1(), d11.f1());
                    if (textureData.g()) {
                        d11.dispose();
                    }
                    z11 = true;
                    pixmap = pixmap2;
                } else {
                    z11 = g11;
                    pixmap = d11;
                }
                q1.g.f81386i.b1(com.badlogic.gdx.graphics.g.L6, 0, 0, 0, i11, pixmap.i1(), pixmap.f1(), 1, pixmap.d1(), pixmap.e1(), pixmap.h1());
                if (z11) {
                    pixmap.dispose();
                }
            }
            i11++;
        }
        if (!this.f74114e || z12) {
            return;
        }
        q1.g.f81385h.l3(com.badlogic.gdx.graphics.g.L6);
    }

    @Override // com.badlogic.gdx.graphics.q
    public int getDepth() {
        return this.f74113d;
    }

    @Override // com.badlogic.gdx.graphics.q
    public int getHeight() {
        return this.f74110a[0].getHeight();
    }

    @Override // com.badlogic.gdx.graphics.q
    public int getWidth() {
        return this.f74110a[0].getWidth();
    }

    @Override // com.badlogic.gdx.graphics.q
    public void prepare() {
        int i11 = -1;
        int i12 = -1;
        for (TextureData textureData : this.f74110a) {
            textureData.prepare();
            if (i11 == -1) {
                i11 = textureData.getWidth();
                i12 = textureData.getHeight();
            } else if (i11 != textureData.getWidth() || i12 != textureData.getHeight()) {
                throw new GdxRuntimeException("Error whilst preparing TextureArray: TextureArray Textures must have equal dimensions.");
            }
        }
        this.f74111b = true;
    }
}
