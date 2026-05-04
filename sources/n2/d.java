package n2;

import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.TextureData;
import com.badlogic.gdx.utils.GdxRuntimeException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d implements TextureData {

    /* renamed from: a, reason: collision with root package name */
    public final v1.a f74115a;

    /* renamed from: b, reason: collision with root package name */
    public int f74116b;

    /* renamed from: c, reason: collision with root package name */
    public int f74117c;

    /* renamed from: d, reason: collision with root package name */
    public Pixmap.Format f74118d;

    /* renamed from: e, reason: collision with root package name */
    public Pixmap f74119e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f74120f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f74121g = false;

    public d(v1.a aVar, Pixmap pixmap, Pixmap.Format format, boolean z11) {
        this.f74116b = 0;
        this.f74117c = 0;
        this.f74115a = aVar;
        this.f74119e = pixmap;
        this.f74118d = format;
        this.f74120f = z11;
        if (pixmap != null) {
            this.f74116b = pixmap.i1();
            this.f74117c = this.f74119e.f1();
            if (format == null) {
                this.f74118d = this.f74119e.b1();
            }
        }
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean a() {
        return true;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean b() {
        return this.f74121g;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public void c(int i11) {
        throw new GdxRuntimeException("This TextureData implementation does not upload data itself");
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public Pixmap d() {
        if (!this.f74121g) {
            throw new GdxRuntimeException("Call prepare() before calling getPixmap()");
        }
        this.f74121g = false;
        Pixmap pixmap = this.f74119e;
        this.f74119e = null;
        return pixmap;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean e() {
        return this.f74120f;
    }

    public v1.a f() {
        return this.f74115a;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean g() {
        return true;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public Pixmap.Format getFormat() {
        return this.f74118d;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public int getHeight() {
        return this.f74117c;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public TextureData.TextureDataType getType() {
        return TextureData.TextureDataType.Pixmap;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public int getWidth() {
        return this.f74116b;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public void prepare() {
        if (this.f74121g) {
            throw new GdxRuntimeException("Already prepared");
        }
        if (this.f74119e == null) {
            if (this.f74115a.m().equals("cim")) {
                this.f74119e = com.badlogic.gdx.graphics.m.a(this.f74115a);
            } else {
                this.f74119e = new Pixmap(this.f74115a);
            }
            this.f74116b = this.f74119e.i1();
            this.f74117c = this.f74119e.f1();
            if (this.f74118d == null) {
                this.f74118d = this.f74119e.b1();
            }
        }
        this.f74121g = true;
    }

    public String toString() {
        return this.f74115a.toString();
    }
}
