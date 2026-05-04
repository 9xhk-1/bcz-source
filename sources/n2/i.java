package n2;

import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.TextureData;
import com.badlogic.gdx.utils.GdxRuntimeException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class i implements TextureData {

    /* renamed from: a, reason: collision with root package name */
    public int f74158a;

    /* renamed from: b, reason: collision with root package name */
    public int f74159b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f74160c = false;

    /* renamed from: d, reason: collision with root package name */
    public int f74161d;

    /* renamed from: e, reason: collision with root package name */
    public int f74162e;

    /* renamed from: f, reason: collision with root package name */
    public int f74163f;

    /* renamed from: g, reason: collision with root package name */
    public int f74164g;

    public i(int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f74158a = i11;
        this.f74159b = i12;
        this.f74161d = i13;
        this.f74162e = i14;
        this.f74163f = i15;
        this.f74164g = i16;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean a() {
        return false;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean b() {
        return this.f74160c;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public void c(int i11) {
        q1.g.f81384g.glTexImage2D(i11, this.f74161d, this.f74162e, this.f74158a, this.f74159b, 0, this.f74163f, this.f74164g, null);
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public Pixmap d() {
        throw new GdxRuntimeException("This TextureData implementation does not return a Pixmap");
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean e() {
        return false;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean g() {
        throw new GdxRuntimeException("This TextureData implementation does not return a Pixmap");
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public Pixmap.Format getFormat() {
        return Pixmap.Format.RGBA8888;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public int getHeight() {
        return this.f74159b;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public TextureData.TextureDataType getType() {
        return TextureData.TextureDataType.Custom;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public int getWidth() {
        return this.f74158a;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public void prepare() {
        if (this.f74160c) {
            throw new GdxRuntimeException("Already prepared");
        }
        this.f74160c = true;
    }
}
