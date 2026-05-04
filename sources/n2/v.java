package n2;

import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.TextureData;
import com.badlogic.gdx.utils.GdxRuntimeException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class v implements TextureData {

    /* renamed from: a, reason: collision with root package name */
    public final Pixmap f74220a;

    /* renamed from: b, reason: collision with root package name */
    public final Pixmap.Format f74221b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f74222c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f74223d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f74224e;

    public v(Pixmap pixmap, Pixmap.Format format, boolean z11, boolean z12) {
        this(pixmap, format, z11, z12, false);
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean a() {
        return this.f74224e;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean b() {
        return true;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public void c(int i11) {
        throw new GdxRuntimeException("This TextureData implementation does not upload data itself");
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public Pixmap d() {
        return this.f74220a;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean e() {
        return this.f74222c;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean g() {
        return this.f74223d;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public Pixmap.Format getFormat() {
        return this.f74221b;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public int getHeight() {
        return this.f74220a.f1();
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public TextureData.TextureDataType getType() {
        return TextureData.TextureDataType.Pixmap;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public int getWidth() {
        return this.f74220a.i1();
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public void prepare() {
        throw new GdxRuntimeException("prepare() must not be called on a PixmapTextureData instance as it is already prepared.");
    }

    public v(Pixmap pixmap, Pixmap.Format format, boolean z11, boolean z12, boolean z13) {
        this.f74220a = pixmap;
        this.f74221b = format == null ? pixmap.b1() : format;
        this.f74222c = z11;
        this.f74223d = z12;
        this.f74224e = z13;
    }
}
