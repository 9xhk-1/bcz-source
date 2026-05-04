package s2;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.a;
import com.badlogic.gdx.utils.t;
import q2.a;
import s1.p;
import s2.b;
import w1.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class m extends d<a> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends b.C1125b {
    }

    public m() {
        super(new t1.d());
    }

    public com.badlogic.gdx.utils.a<v1.a> M(v1.a aVar) {
        com.badlogic.gdx.utils.a<v1.a> aVar2 = new com.badlogic.gdx.utils.a<>();
        a.b<t.a> it = this.f87409q.q("tileset").iterator();
        while (it.hasNext()) {
            N(aVar2, aVar, it.next());
        }
        a.b<t.a> it2 = this.f87409q.q("imagelayer").iterator();
        while (it2.hasNext()) {
            String e11 = it2.next().l("image").e("source", null);
            if (e11 != null) {
                aVar2.a(b.k(aVar, e11));
            }
        }
        return aVar2;
    }

    public com.badlogic.gdx.utils.a<v1.a> N(com.badlogic.gdx.utils.a<v1.a> aVar, v1.a aVar2, t.a aVar3) {
        String e11 = aVar3.e("source", null);
        if (e11 != null) {
            v1.a k11 = b.k(aVar2, e11);
            t.a q11 = this.f87408p.q(k11);
            if (q11.l("image") != null) {
                aVar.a(b.k(k11, q11.l("image").d("source")));
                return aVar;
            }
            a.b<t.a> it = q11.p("tile").iterator();
            while (it.hasNext()) {
                aVar.a(b.k(k11, it.next().l("image").d("source")));
            }
        } else {
            if (aVar3.l("image") != null) {
                aVar.a(b.k(aVar2, aVar3.l("image").d("source")));
                return aVar;
            }
            a.b<t.a> it2 = aVar3.p("tile").iterator();
            while (it2.hasNext()) {
                aVar.a(b.k(aVar2, it2.next().l("image").d("source")));
            }
        }
        return aVar;
    }

    public com.badlogic.gdx.utils.a<v1.a> O(v1.a aVar, t.a aVar2) {
        return N(new com.badlogic.gdx.utils.a<>(), aVar, aVar2);
    }

    public f P(String str) {
        return Q(str, new a());
    }

    public f Q(String str, a aVar) {
        v1.a b11 = b(str);
        this.f87409q = this.f87408p.q(b11);
        com.badlogic.gdx.utils.l lVar = new com.badlogic.gdx.utils.l();
        a.b<v1.a> it = M(b11).iterator();
        while (it.hasNext()) {
            v1.a next = it.next();
            Texture texture = new Texture(next, aVar.f87396b);
            texture.a1(aVar.f87397c, aVar.f87398d);
            lVar.r(next.C(), texture);
        }
        f p11 = p(b11, aVar, new a.b(lVar));
        p11.D(lVar.z().f());
        return p11;
    }

    @Override // s1.b
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public void c(r1.e eVar, String str, v1.a aVar, a aVar2) {
        this.f87388h = p(aVar, aVar2, new a.C1000a(eVar));
    }

    @Override // s1.b
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public f d(r1.e eVar, String str, v1.a aVar, a aVar2) {
        return this.f87388h;
    }

    @Override // s2.b
    public com.badlogic.gdx.utils.a<r1.a> i(v1.a aVar, p.b bVar) {
        com.badlogic.gdx.utils.a<r1.a> aVar2 = new com.badlogic.gdx.utils.a<>();
        a.b<v1.a> it = M(aVar).iterator();
        while (it.hasNext()) {
            aVar2.a(new r1.a(it.next(), Texture.class, bVar));
        }
        return aVar2;
    }

    @Override // s2.d
    public void s(v1.a aVar, q2.a aVar2, j jVar, t.a aVar3, com.badlogic.gdx.utils.a<t.a> aVar4, String str, int i11, int i12, int i13, int i14, int i15, String str2, int i16, int i17, String str3, int i18, int i19, v1.a aVar5) {
        int i21;
        q2.h b11 = jVar.b();
        if (aVar5 == null) {
            a.b<t.a> it = aVar4.iterator();
            v1.a aVar6 = aVar5;
            while (it.hasNext()) {
                t.a next = it.next();
                t.a l11 = next.l("image");
                if (l11 != null) {
                    String d11 = l11.d("source");
                    aVar6 = str2 != null ? b.k(b.k(aVar, str2), d11) : b.k(aVar, d11);
                }
                f(jVar, aVar2.a(aVar6.C()), i11 + next.y("id"), i16, i17);
            }
            return;
        }
        o a11 = aVar2.a(aVar5.C());
        b11.h("imagesource", str3);
        b11.h("imagewidth", Integer.valueOf(i18));
        b11.h("imageheight", Integer.valueOf(i19));
        b11.h("tilewidth", Integer.valueOf(i12));
        b11.h("tileheight", Integer.valueOf(i13));
        b11.h("margin", Integer.valueOf(i15));
        b11.h("spacing", Integer.valueOf(i14));
        int c11 = a11.c() - i12;
        int b12 = a11.b() - i13;
        int i22 = i11;
        int i23 = i15;
        while (i23 <= b12) {
            int i24 = i15;
            while (true) {
                i21 = i22;
                if (i24 <= c11) {
                    i22 = i21 + 1;
                    f(jVar, new o(a11, i24, i23, i12, i13), i21, i16, i17);
                    i24 += i12 + i14;
                }
            }
            i23 += i13 + i14;
            i22 = i21;
        }
    }

    public m(s1.e eVar) {
        super(eVar);
    }
}
