package s2;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.e;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.a;
import com.badlogic.gdx.utils.m;
import com.badlogic.gdx.utils.t;
import s1.p;
import s2.b;
import w1.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a extends d<b> {

    /* renamed from: r, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<Texture> f87372r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC1123a f87373s;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: s2.a$a, reason: collision with other inner class name */
    public interface InterfaceC1123a extends q2.a {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: s2.a$a$a, reason: collision with other inner class name */
        public static class C1124a implements InterfaceC1123a {

            /* renamed from: a, reason: collision with root package name */
            public final r1.e f87374a;

            /* renamed from: b, reason: collision with root package name */
            public final String f87375b;

            public C1124a(r1.e eVar, String str) {
                this.f87374a = eVar;
                this.f87375b = str;
            }

            @Override // q2.a
            public o a(String str) {
                return b().Z(str);
            }

            @Override // s2.a.InterfaceC1123a
            public com.badlogic.gdx.graphics.g2d.e b() {
                return (com.badlogic.gdx.graphics.g2d.e) this.f87374a.w0(this.f87375b, com.badlogic.gdx.graphics.g2d.e.class);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: s2.a$a$b */
        public static class b implements InterfaceC1123a {

            /* renamed from: a, reason: collision with root package name */
            public final com.badlogic.gdx.graphics.g2d.e f87376a;

            public b(com.badlogic.gdx.graphics.g2d.e eVar) {
                this.f87376a = eVar;
            }

            @Override // q2.a
            public o a(String str) {
                return this.f87376a.Z(str);
            }

            @Override // s2.a.InterfaceC1123a
            public com.badlogic.gdx.graphics.g2d.e b() {
                return this.f87376a;
            }
        }

        com.badlogic.gdx.graphics.g2d.e b();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends b.C1125b {

        /* renamed from: h, reason: collision with root package name */
        public boolean f87377h = false;
    }

    public a() {
        super(new t1.d());
        this.f87372r = new com.badlogic.gdx.utils.a<>();
    }

    public v1.a M(v1.a aVar) {
        String str;
        t.a l11 = this.f87409q.l("properties");
        if (l11 != null) {
            a.b<t.a> it = l11.p("property").iterator();
            while (it.hasNext()) {
                t.a next = it.next();
                if (next.d("name").startsWith("atlas")) {
                    str = next.d("value");
                    break;
                }
            }
        }
        str = null;
        if (str == null) {
            throw new GdxRuntimeException("The map is missing the 'atlas' property");
        }
        v1.a k11 = s2.b.k(aVar, str);
        if (k11.l()) {
            return k11;
        }
        throw new GdxRuntimeException("The 'atlas' file could not be found: '" + str + "'");
    }

    public f N(String str) {
        return O(str, new b());
    }

    public f O(String str, b bVar) {
        v1.a b11 = b(str);
        this.f87409q = this.f87408p.q(b11);
        com.badlogic.gdx.graphics.g2d.e eVar = new com.badlogic.gdx.graphics.g2d.e(M(b11));
        InterfaceC1123a.b bVar2 = new InterfaceC1123a.b(eVar);
        this.f87373s = bVar2;
        f p11 = p(b11, bVar, bVar2);
        p11.D(new com.badlogic.gdx.utils.a<>(new com.badlogic.gdx.graphics.g2d.e[]{eVar}));
        R(bVar.f87397c, bVar.f87398d);
        return p11;
    }

    @Override // s1.b
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public void c(r1.e eVar, String str, v1.a aVar, b bVar) {
        InterfaceC1123a.C1124a c1124a = new InterfaceC1123a.C1124a(eVar, M(aVar).C());
        this.f87373s = c1124a;
        this.f87388h = p(aVar, bVar, c1124a);
    }

    @Override // s1.b
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public f d(r1.e eVar, String str, v1.a aVar, b bVar) {
        if (bVar != null) {
            R(bVar.f87397c, bVar.f87398d);
        }
        return this.f87388h;
    }

    public void R(Texture.TextureFilter textureFilter, Texture.TextureFilter textureFilter2) {
        a.b<Texture> it = this.f87372r.iterator();
        while (it.hasNext()) {
            it.next().a1(textureFilter, textureFilter2);
        }
        this.f87372r.clear();
    }

    @Override // s2.b
    public com.badlogic.gdx.utils.a<r1.a> i(v1.a aVar, p.b bVar) {
        com.badlogic.gdx.utils.a<r1.a> aVar2 = new com.badlogic.gdx.utils.a<>();
        v1.a M = M(aVar);
        if (M != null) {
            aVar2.a(new r1.a(M, com.badlogic.gdx.graphics.g2d.e.class));
        }
        return aVar2;
    }

    @Override // s2.d
    public void s(v1.a aVar, q2.a aVar2, j jVar, t.a aVar3, com.badlogic.gdx.utils.a<t.a> aVar4, String str, int i11, int i12, int i13, int i14, int i15, String str2, int i16, int i17, String str3, int i18, int i19, v1.a aVar5) {
        t.a l11;
        int i21;
        com.badlogic.gdx.graphics.g2d.e b11 = this.f87373s.b();
        m.a<Texture> it = b11.C0().iterator();
        while (it.hasNext()) {
            this.f87372r.a(it.next());
        }
        q2.h b12 = jVar.b();
        b12.h("imagesource", str3);
        b12.h("imagewidth", Integer.valueOf(i18));
        b12.h("imageheight", Integer.valueOf(i19));
        b12.h("tilewidth", Integer.valueOf(i12));
        b12.h("tileheight", Integer.valueOf(i13));
        b12.h("margin", Integer.valueOf(i15));
        b12.h("spacing", Integer.valueOf(i14));
        if (str3 != null && str3.length() > 0) {
            int i22 = (((i18 / i12) * (i19 / i13)) + i11) - 1;
            a.b<e.a> it2 = b11.n0(str).iterator();
            while (it2.hasNext()) {
                e.a next = it2.next();
                if (next != null && (i21 = i11 + next.f12071h) >= i11 && i21 <= i22) {
                    f(jVar, next, i21, i16, i17);
                }
            }
        }
        a.b<t.a> it3 = aVar4.iterator();
        while (it3.hasNext()) {
            t.a next2 = it3.next();
            int z11 = i11 + next2.z("id", 0);
            if (jVar.d(z11) == null && (l11 = next2.l("image")) != null) {
                String d11 = l11.d("source");
                String substring = d11.substring(0, d11.lastIndexOf(46));
                o Z = b11.Z(substring);
                if (Z == null) {
                    throw new GdxRuntimeException("Tileset atlasRegion not found: " + substring);
                }
                f(jVar, Z, z11, i16, i17);
            }
        }
    }

    public a(s1.e eVar) {
        super(eVar);
        this.f87372r = new com.badlogic.gdx.utils.a<>();
    }
}
