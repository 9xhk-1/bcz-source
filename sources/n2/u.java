package n2;

import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.TextureData;
import com.badlogic.gdx.utils.GdxRuntimeException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class u implements TextureData {

    /* renamed from: a, reason: collision with root package name */
    public TextureData[] f74219a;

    public u(TextureData... textureDataArr) {
        TextureData[] textureDataArr2 = new TextureData[textureDataArr.length];
        this.f74219a = textureDataArr2;
        System.arraycopy(textureDataArr, 0, textureDataArr2, 0, textureDataArr.length);
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean a() {
        return true;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean b() {
        return true;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public void c(int i11) {
        int i12 = 0;
        while (true) {
            TextureData[] textureDataArr = this.f74219a;
            if (i12 >= textureDataArr.length) {
                return;
            }
            com.badlogic.gdx.graphics.j.j1(i11, textureDataArr[i12], i12);
            i12++;
        }
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public Pixmap d() {
        throw new GdxRuntimeException("It's compressed, use the compressed method");
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean e() {
        return false;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean g() {
        return false;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public Pixmap.Format getFormat() {
        return this.f74219a[0].getFormat();
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public int getHeight() {
        return this.f74219a[0].getHeight();
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public TextureData.TextureDataType getType() {
        return TextureData.TextureDataType.Custom;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public int getWidth() {
        return this.f74219a[0].getWidth();
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public void prepare() {
    }
}
