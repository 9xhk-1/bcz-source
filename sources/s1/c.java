package s1;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.a;
import com.badlogic.gdx.graphics.g2d.e;
import com.badlogic.gdx.utils.GdxRuntimeException;
import s1.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c extends b<com.badlogic.gdx.graphics.g2d.a, a> {

    /* renamed from: b, reason: collision with root package name */
    public a.C0189a f87082b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends r1.c<com.badlogic.gdx.graphics.g2d.a> {

        /* renamed from: b, reason: collision with root package name */
        public boolean f87083b = false;

        /* renamed from: c, reason: collision with root package name */
        public boolean f87084c = false;

        /* renamed from: d, reason: collision with root package name */
        public Texture.TextureFilter f87085d;

        /* renamed from: e, reason: collision with root package name */
        public Texture.TextureFilter f87086e;

        /* renamed from: f, reason: collision with root package name */
        public a.C0189a f87087f;

        /* renamed from: g, reason: collision with root package name */
        public String f87088g;

        public a() {
            Texture.TextureFilter textureFilter = Texture.TextureFilter.Nearest;
            this.f87085d = textureFilter;
            this.f87086e = textureFilter;
            this.f87087f = null;
            this.f87088g = null;
        }
    }

    public c(e eVar) {
        super(eVar);
    }

    @Override // s1.a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public com.badlogic.gdx.utils.a<r1.a> a(String str, v1.a aVar, a aVar2) {
        String str2;
        a.C0189a c0189a;
        com.badlogic.gdx.utils.a<r1.a> aVar3 = new com.badlogic.gdx.utils.a<>();
        if (aVar2 != null && (c0189a = aVar2.f87087f) != null) {
            this.f87082b = c0189a;
            return aVar3;
        }
        this.f87082b = new a.C0189a(aVar, aVar2 != null && aVar2.f87083b);
        if (aVar2 != null && (str2 = aVar2.f87088g) != null) {
            aVar3.a(new r1.a(str2, com.badlogic.gdx.graphics.g2d.e.class));
            return aVar3;
        }
        for (int i11 = 0; i11 < this.f87082b.f().length; i11++) {
            v1.a b11 = b(this.f87082b.e(i11));
            p.b bVar = new p.b();
            if (aVar2 != null) {
                bVar.f87128c = aVar2.f87084c;
                bVar.f87131f = aVar2.f87085d;
                bVar.f87132g = aVar2.f87086e;
            }
            aVar3.a(new r1.a(b11, Texture.class, bVar));
        }
        return aVar3;
    }

    @Override // s1.b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public com.badlogic.gdx.graphics.g2d.a d(r1.e eVar, String str, v1.a aVar, a aVar2) {
        String str2;
        if (aVar2 == null || (str2 = aVar2.f87088g) == null) {
            int length = this.f87082b.f().length;
            com.badlogic.gdx.utils.a aVar3 = new com.badlogic.gdx.utils.a(length);
            for (int i11 = 0; i11 < length; i11++) {
                aVar3.a(new w1.o((Texture) eVar.w0(this.f87082b.e(i11), Texture.class)));
            }
            return new com.badlogic.gdx.graphics.g2d.a(this.f87082b, (com.badlogic.gdx.utils.a<w1.o>) aVar3, true);
        }
        com.badlogic.gdx.graphics.g2d.e eVar2 = (com.badlogic.gdx.graphics.g2d.e) eVar.w0(str2, com.badlogic.gdx.graphics.g2d.e.class);
        String str3 = aVar.O(this.f87082b.f12002b[0]).A().toString();
        e.a Z = eVar2.Z(str3);
        if (Z != null) {
            return new com.badlogic.gdx.graphics.g2d.a(aVar, Z);
        }
        throw new GdxRuntimeException("Could not find font region " + str3 + " in atlas " + aVar2.f87088g);
    }

    @Override // s1.b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void c(r1.e eVar, String str, v1.a aVar, a aVar2) {
    }
}
