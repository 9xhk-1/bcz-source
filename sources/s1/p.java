package s1;

import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.TextureData;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class p extends s1.b<Texture, b> {

    /* renamed from: b, reason: collision with root package name */
    public a f87123b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f87124a;

        /* renamed from: b, reason: collision with root package name */
        public TextureData f87125b;

        /* renamed from: c, reason: collision with root package name */
        public Texture f87126c;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends r1.c<Texture> {

        /* renamed from: b, reason: collision with root package name */
        public Pixmap.Format f87127b = null;

        /* renamed from: c, reason: collision with root package name */
        public boolean f87128c = false;

        /* renamed from: d, reason: collision with root package name */
        public Texture f87129d = null;

        /* renamed from: e, reason: collision with root package name */
        public TextureData f87130e = null;

        /* renamed from: f, reason: collision with root package name */
        public Texture.TextureFilter f87131f;

        /* renamed from: g, reason: collision with root package name */
        public Texture.TextureFilter f87132g;

        /* renamed from: h, reason: collision with root package name */
        public Texture.TextureWrap f87133h;

        /* renamed from: i, reason: collision with root package name */
        public Texture.TextureWrap f87134i;

        public b() {
            Texture.TextureFilter textureFilter = Texture.TextureFilter.Nearest;
            this.f87131f = textureFilter;
            this.f87132g = textureFilter;
            Texture.TextureWrap textureWrap = Texture.TextureWrap.ClampToEdge;
            this.f87133h = textureWrap;
            this.f87134i = textureWrap;
        }
    }

    public p(e eVar) {
        super(eVar);
        this.f87123b = new a();
    }

    @Override // s1.a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public com.badlogic.gdx.utils.a<r1.a> a(String str, v1.a aVar, b bVar) {
        return null;
    }

    @Override // s1.b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void c(r1.e eVar, String str, v1.a aVar, b bVar) {
        boolean z11;
        TextureData textureData;
        a aVar2 = this.f87123b;
        aVar2.f87124a = str;
        if (bVar == null || (textureData = bVar.f87130e) == null) {
            Pixmap.Format format = null;
            aVar2.f87126c = null;
            if (bVar != null) {
                format = bVar.f87127b;
                z11 = bVar.f87128c;
                aVar2.f87126c = bVar.f87129d;
            } else {
                z11 = false;
            }
            aVar2.f87125b = TextureData.a.a(aVar, format, z11);
        } else {
            aVar2.f87125b = textureData;
            aVar2.f87126c = bVar.f87129d;
        }
        if (this.f87123b.f87125b.b()) {
            return;
        }
        this.f87123b.f87125b.prepare();
    }

    @Override // s1.b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Texture d(r1.e eVar, String str, v1.a aVar, b bVar) {
        a aVar2 = this.f87123b;
        if (aVar2 == null) {
            return null;
        }
        Texture texture = aVar2.f87126c;
        if (texture != null) {
            texture.r1(aVar2.f87125b);
        } else {
            texture = new Texture(this.f87123b.f87125b);
        }
        if (bVar != null) {
            texture.a1(bVar.f87131f, bVar.f87132g);
            texture.b1(bVar.f87133h, bVar.f87134i);
        }
        return texture;
    }
}
