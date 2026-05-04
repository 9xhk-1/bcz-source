package l2;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class r<T extends com.badlogic.gdx.graphics.j> implements Comparable<r<T>> {

    /* renamed from: a, reason: collision with root package name */
    public T f69250a;

    /* renamed from: b, reason: collision with root package name */
    public Texture.TextureFilter f69251b;

    /* renamed from: c, reason: collision with root package name */
    public Texture.TextureFilter f69252c;

    /* renamed from: d, reason: collision with root package name */
    public Texture.TextureWrap f69253d;

    /* renamed from: e, reason: collision with root package name */
    public Texture.TextureWrap f69254e;

    public r(T t11, Texture.TextureFilter textureFilter, Texture.TextureFilter textureFilter2, Texture.TextureWrap textureWrap, Texture.TextureWrap textureWrap2) {
        this.f69250a = null;
        b(t11, textureFilter, textureFilter2, textureWrap, textureWrap2);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(r<T> rVar) {
        if (rVar == this) {
            return 0;
        }
        T t11 = this.f69250a;
        int i11 = t11 == null ? 0 : t11.f12451a;
        T t12 = rVar.f69250a;
        int i12 = t12 == null ? 0 : t12.f12451a;
        if (i11 != i12) {
            return i11 - i12;
        }
        int i02 = t11 == null ? 0 : t11.i0();
        T t13 = rVar.f69250a;
        int i03 = t13 == null ? 0 : t13.i0();
        if (i02 != i03) {
            return i02 - i03;
        }
        Texture.TextureFilter textureFilter = this.f69251b;
        if (textureFilter != rVar.f69251b) {
            int gLEnum = textureFilter == null ? 0 : textureFilter.getGLEnum();
            Texture.TextureFilter textureFilter2 = rVar.f69251b;
            return gLEnum - (textureFilter2 != null ? textureFilter2.getGLEnum() : 0);
        }
        Texture.TextureFilter textureFilter3 = this.f69252c;
        if (textureFilter3 != rVar.f69252c) {
            int gLEnum2 = textureFilter3 == null ? 0 : textureFilter3.getGLEnum();
            Texture.TextureFilter textureFilter4 = rVar.f69252c;
            return gLEnum2 - (textureFilter4 != null ? textureFilter4.getGLEnum() : 0);
        }
        Texture.TextureWrap textureWrap = this.f69253d;
        if (textureWrap != rVar.f69253d) {
            int gLEnum3 = textureWrap == null ? 0 : textureWrap.getGLEnum();
            Texture.TextureWrap textureWrap2 = rVar.f69253d;
            return gLEnum3 - (textureWrap2 != null ? textureWrap2.getGLEnum() : 0);
        }
        Texture.TextureWrap textureWrap3 = this.f69254e;
        if (textureWrap3 == rVar.f69254e) {
            return 0;
        }
        int gLEnum4 = textureWrap3 == null ? 0 : textureWrap3.getGLEnum();
        Texture.TextureWrap textureWrap4 = rVar.f69254e;
        return gLEnum4 - (textureWrap4 != null ? textureWrap4.getGLEnum() : 0);
    }

    public void b(T t11, Texture.TextureFilter textureFilter, Texture.TextureFilter textureFilter2, Texture.TextureWrap textureWrap, Texture.TextureWrap textureWrap2) {
        this.f69250a = t11;
        this.f69251b = textureFilter;
        this.f69252c = textureFilter2;
        this.f69253d = textureWrap;
        this.f69254e = textureWrap2;
    }

    public <V extends T> void c(r<V> rVar) {
        this.f69250a = rVar.f69250a;
        this.f69251b = rVar.f69251b;
        this.f69252c = rVar.f69252c;
        this.f69253d = rVar.f69253d;
        this.f69254e = rVar.f69254e;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return rVar.f69250a == this.f69250a && rVar.f69251b == this.f69251b && rVar.f69252c == this.f69252c && rVar.f69253d == this.f69253d && rVar.f69254e == this.f69254e;
    }

    public int hashCode() {
        T t11 = this.f69250a;
        long i02 = ((((((((((t11 == null ? 0 : t11.f12451a) * 811) + (t11 == null ? 0 : t11.i0())) * 811) + (this.f69251b == null ? 0 : r0.getGLEnum())) * 811) + (this.f69252c == null ? 0 : r0.getGLEnum())) * 811) + (this.f69253d == null ? 0 : r0.getGLEnum())) * 811) + (this.f69254e != null ? r0.getGLEnum() : 0);
        return (int) ((i02 >> 32) ^ i02);
    }

    public r(T t11) {
        this(t11, null, null, null, null);
    }

    public r() {
        this.f69250a = null;
    }
}
