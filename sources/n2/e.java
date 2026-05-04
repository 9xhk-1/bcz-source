package n2;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.GdxRuntimeException;
import n2.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class e extends f {
    public e() {
        l1();
    }

    @Override // n2.f, n2.h
    /* renamed from: j1, reason: merged with bridge method [inline-methods] */
    public Texture R(h.e eVar) {
        h.f<? extends h<T>> fVar = this.f74137i;
        Texture texture = new Texture(new com.badlogic.gdx.graphics.glutils.b(fVar.f74147a, fVar.f74148b, eVar.f74140a, eVar.f74141b, eVar.f74142c, eVar.f74144e));
        if (q1.g.f81378a.getType() == Application.ApplicationType.Desktop || q1.g.f81378a.getType() == Application.ApplicationType.Applet) {
            Texture.TextureFilter textureFilter = Texture.TextureFilter.Linear;
            texture.a1(textureFilter, textureFilter);
        } else {
            Texture.TextureFilter textureFilter2 = Texture.TextureFilter.Nearest;
            texture.a1(textureFilter2, textureFilter2);
        }
        Texture.TextureWrap textureWrap = Texture.TextureWrap.ClampToEdge;
        texture.b1(textureWrap, textureWrap);
        return texture;
    }

    public final void l1() {
        if (q1.g.f81379b.m() && q1.g.f81378a.getType() == Application.ApplicationType.WebGL && !q1.g.f81379b.d("EXT_color_buffer_float")) {
            throw new GdxRuntimeException("Extension EXT_color_buffer_float not supported!");
        }
    }

    public e(h.f<? extends h<Texture>> fVar) {
        super(fVar);
        l1();
    }

    public e(int i11, int i12, boolean z11) {
        l1();
        h.a aVar = new h.a(i11, i12);
        aVar.i(com.badlogic.gdx.graphics.g.C6, 6408, com.badlogic.gdx.graphics.f.f11703z1, false);
        if (z11) {
            aVar.b();
        }
        this.f74137i = aVar;
        z();
    }
}
