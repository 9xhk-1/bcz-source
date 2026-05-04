package n2;

import com.badlogic.gdx.graphics.Cubemap;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.GdxRuntimeException;
import n2.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class g extends h<Cubemap> {

    /* renamed from: q, reason: collision with root package name */
    public static final Cubemap.CubemapSide[] f74122q = Cubemap.CubemapSide.values();

    /* renamed from: p, reason: collision with root package name */
    public int f74123p;

    public g() {
    }

    @Override // n2.h
    public void S() {
        this.f74123p = -1;
        super.S();
    }

    @Override // n2.h
    /* renamed from: i1, reason: merged with bridge method [inline-methods] */
    public void o(Cubemap cubemap) {
        com.badlogic.gdx.graphics.f fVar = q1.g.f81385h;
        int i02 = cubemap.i0();
        for (Cubemap.CubemapSide cubemapSide : Cubemap.CubemapSide.values()) {
            fVar.Y2(com.badlogic.gdx.graphics.f.f11622l4, com.badlogic.gdx.graphics.f.G4, cubemapSide.glEnum, i02, 0);
        }
    }

    public void j1(Cubemap.CubemapSide cubemapSide) {
        q1.g.f81385h.Y2(com.badlogic.gdx.graphics.f.f11622l4, com.badlogic.gdx.graphics.f.G4, cubemapSide.glEnum, n0().i0(), 0);
    }

    @Override // n2.h
    /* renamed from: k1, reason: merged with bridge method [inline-methods] */
    public Cubemap R(h.e eVar) {
        h.f<? extends h<T>> fVar = this.f74137i;
        i iVar = new i(fVar.f74147a, fVar.f74148b, 0, eVar.f74140a, eVar.f74141b, eVar.f74142c);
        Cubemap cubemap = new Cubemap(iVar, iVar, iVar, iVar, iVar, iVar);
        Texture.TextureFilter textureFilter = Texture.TextureFilter.Linear;
        cubemap.a1(textureFilter, textureFilter);
        Texture.TextureWrap textureWrap = Texture.TextureWrap.ClampToEdge;
        cubemap.b1(textureWrap, textureWrap);
        return cubemap;
    }

    @Override // n2.h
    /* renamed from: l1, reason: merged with bridge method [inline-methods] */
    public void X(Cubemap cubemap) {
        cubemap.dispose();
    }

    public Cubemap.CubemapSide m1() {
        int i11 = this.f74123p;
        if (i11 < 0) {
            return null;
        }
        return f74122q[i11];
    }

    public boolean n1() {
        int i11 = this.f74123p;
        if (i11 > 5) {
            throw new GdxRuntimeException("No remaining sides.");
        }
        if (i11 == 5) {
            return false;
        }
        this.f74123p = i11 + 1;
        j1(m1());
        return true;
    }

    public g(h.f<? extends h<Cubemap>> fVar) {
        super(fVar);
    }

    public g(Pixmap.Format format, int i11, int i12, boolean z11) {
        this(format, i11, i12, z11, false);
    }

    public g(Pixmap.Format format, int i11, int i12, boolean z11, boolean z12) {
        h.c cVar = new h.c(i11, i12);
        cVar.a(format);
        if (z11) {
            cVar.b();
        }
        if (z12) {
            cVar.d();
        }
        this.f74137i = cVar;
        z();
    }
}
