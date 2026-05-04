package s1;

import com.badlogic.gdx.graphics.Cubemap;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d extends s1.b<Cubemap, b> {

    /* renamed from: b, reason: collision with root package name */
    public a f87089b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f87090a;

        /* renamed from: b, reason: collision with root package name */
        public com.badlogic.gdx.graphics.d f87091b;

        /* renamed from: c, reason: collision with root package name */
        public Cubemap f87092c;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends r1.c<Cubemap> {

        /* renamed from: b, reason: collision with root package name */
        public Pixmap.Format f87093b = null;

        /* renamed from: c, reason: collision with root package name */
        public Cubemap f87094c = null;

        /* renamed from: d, reason: collision with root package name */
        public com.badlogic.gdx.graphics.d f87095d = null;

        /* renamed from: e, reason: collision with root package name */
        public Texture.TextureFilter f87096e;

        /* renamed from: f, reason: collision with root package name */
        public Texture.TextureFilter f87097f;

        /* renamed from: g, reason: collision with root package name */
        public Texture.TextureWrap f87098g;

        /* renamed from: h, reason: collision with root package name */
        public Texture.TextureWrap f87099h;

        public b() {
            Texture.TextureFilter textureFilter = Texture.TextureFilter.Nearest;
            this.f87096e = textureFilter;
            this.f87097f = textureFilter;
            Texture.TextureWrap textureWrap = Texture.TextureWrap.ClampToEdge;
            this.f87098g = textureWrap;
            this.f87099h = textureWrap;
        }
    }

    public d(e eVar) {
        super(eVar);
        this.f87089b = new a();
    }

    @Override // s1.a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public com.badlogic.gdx.utils.a<r1.a> a(String str, v1.a aVar, b bVar) {
        return null;
    }

    @Override // s1.b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void c(r1.e eVar, String str, v1.a aVar, b bVar) {
        com.badlogic.gdx.graphics.d dVar;
        a aVar2 = this.f87089b;
        aVar2.f87090a = str;
        if (bVar == null || (dVar = bVar.f87095d) == null) {
            aVar2.f87092c = null;
            if (bVar != null) {
                aVar2.f87092c = bVar.f87094c;
            }
            if (str.contains(".ktx") || str.contains(".zktx")) {
                this.f87089b.f87091b = new com.badlogic.gdx.graphics.glutils.c(aVar, false);
            }
        } else {
            aVar2.f87091b = dVar;
            aVar2.f87092c = bVar.f87094c;
        }
        if (this.f87089b.f87091b.b()) {
            return;
        }
        this.f87089b.f87091b.prepare();
    }

    @Override // s1.b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Cubemap d(r1.e eVar, String str, v1.a aVar, b bVar) {
        a aVar2 = this.f87089b;
        if (aVar2 == null) {
            return null;
        }
        Cubemap cubemap = aVar2.f87092c;
        if (cubemap != null) {
            cubemap.q1(aVar2.f87091b);
        } else {
            cubemap = new Cubemap(this.f87089b.f87091b);
        }
        if (bVar != null) {
            cubemap.a1(bVar.f87096e, bVar.f87097f);
            cubemap.b1(bVar.f87098g, bVar.f87099h);
        }
        return cubemap;
    }
}
