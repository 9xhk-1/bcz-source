package n2;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import n2.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class f extends h<Texture> {
    public f() {
    }

    public static void p() {
        h.p();
    }

    @Override // n2.h
    /* renamed from: i1, reason: merged with bridge method [inline-methods] */
    public void o(Texture texture) {
        q1.g.f81385h.Y2(com.badlogic.gdx.graphics.f.f11622l4, com.badlogic.gdx.graphics.f.G4, com.badlogic.gdx.graphics.f.f11552a0, texture.i0(), 0);
    }

    @Override // n2.h
    /* renamed from: j1 */
    public Texture R(h.e eVar) {
        h.f<? extends h<T>> fVar = this.f74137i;
        Texture texture = new Texture(new i(fVar.f74147a, fVar.f74148b, 0, eVar.f74140a, eVar.f74141b, eVar.f74142c));
        if (!eVar.f74145f || q1.g.f81378a.getType() != Application.ApplicationType.WebGL) {
            Texture.TextureFilter textureFilter = Texture.TextureFilter.Linear;
            texture.a1(textureFilter, textureFilter);
        }
        Texture.TextureWrap textureWrap = Texture.TextureWrap.ClampToEdge;
        texture.b1(textureWrap, textureWrap);
        return texture;
    }

    @Override // n2.h
    /* renamed from: k1, reason: merged with bridge method [inline-methods] */
    public void X(Texture texture) {
        texture.dispose();
    }

    public f(h.f<? extends h<Texture>> fVar) {
        super(fVar);
    }

    public f(Pixmap.Format format, int i11, int i12, boolean z11) {
        this(format, i11, i12, z11, false);
    }

    public f(Pixmap.Format format, int i11, int i12, boolean z11, boolean z12) {
        h.b bVar = new h.b(i11, i12);
        bVar.a(format);
        if (z11) {
            bVar.b();
        }
        if (z12) {
            bVar.d();
        }
        this.f74137i = bVar;
        z();
    }
}
