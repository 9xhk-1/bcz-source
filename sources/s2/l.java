package s2;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.JsonValue;
import com.badlogic.gdx.utils.a;
import q2.a;
import s1.p;
import s2.b;
import w1.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class l extends c<b.C1125b> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends b.C1125b {
    }

    public l() {
        super(new t1.d());
    }

    public final void J(JsonValue jsonValue, v1.a aVar, com.badlogic.gdx.utils.a<v1.a> aVar2) {
        if (jsonValue == null) {
            return;
        }
        JsonValue.b it = jsonValue.iterator();
        while (it.hasNext()) {
            JsonValue next = it.next();
            String W = next.W("type", "");
            if (W.equals("imagelayer")) {
                String W2 = next.W("image", null);
                if (W2 != null) {
                    aVar2.a(b.k(aVar, W2));
                }
            } else if (W.equals("group")) {
                J(next.z("layers"), aVar, aVar2);
            }
        }
    }

    public com.badlogic.gdx.utils.a<v1.a> K(v1.a aVar) {
        com.badlogic.gdx.utils.a<v1.a> aVar2 = new com.badlogic.gdx.utils.a<>();
        JsonValue.b it = this.f87407q.z("tileSets").iterator();
        while (it.hasNext()) {
            L(aVar2, aVar, it.next());
        }
        J(this.f87407q.z("layers"), aVar, aVar2);
        return aVar2;
    }

    public com.badlogic.gdx.utils.a<v1.a> L(com.badlogic.gdx.utils.a<v1.a> aVar, v1.a aVar2, JsonValue jsonValue) {
        String W = jsonValue.W("source", null);
        if (W != null) {
            v1.a k11 = b.k(aVar2, W);
            JsonValue a11 = this.f87406p.a(k11);
            if (a11.X("image")) {
                aVar.a(b.k(k11, a11.V("image")));
                return aVar;
            }
            JsonValue.b it = a11.z("tile").iterator();
            while (it.hasNext()) {
                aVar.a(b.k(k11, it.next().V("image")));
            }
        } else {
            if (jsonValue.X("image")) {
                aVar.a(b.k(aVar2, jsonValue.V("image")));
                return aVar;
            }
            JsonValue z11 = jsonValue.z("tiles");
            if (z11 != null) {
                JsonValue.b it2 = z11.iterator();
                while (it2.hasNext()) {
                    aVar.a(b.k(aVar2, it2.next().V("image")));
                }
            }
        }
        return aVar;
    }

    public com.badlogic.gdx.utils.a<v1.a> M(v1.a aVar, JsonValue jsonValue) {
        return L(new com.badlogic.gdx.utils.a<>(), aVar, jsonValue);
    }

    public f N(String str) {
        return O(str, new a());
    }

    public f O(String str, a aVar) {
        v1.a b11 = b(str);
        this.f87407q = this.f87406p.a(b11);
        com.badlogic.gdx.utils.l lVar = new com.badlogic.gdx.utils.l();
        a.b<v1.a> it = K(b11).iterator();
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
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public void c(r1.e eVar, String str, v1.a aVar, b.C1125b c1125b) {
        this.f87388h = p(aVar, c1125b, new a.C1000a(eVar));
    }

    @Override // s1.b
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public f d(r1.e eVar, String str, v1.a aVar, b.C1125b c1125b) {
        return this.f87388h;
    }

    @Override // s2.b
    public com.badlogic.gdx.utils.a<r1.a> i(v1.a aVar, p.b bVar) {
        com.badlogic.gdx.utils.a<r1.a> aVar2 = new com.badlogic.gdx.utils.a<>();
        a.b<v1.a> it = K(aVar).iterator();
        while (it.hasNext()) {
            aVar2.a(new r1.a(it.next(), Texture.class, bVar));
        }
        return aVar2;
    }

    @Override // s2.c
    public void s(v1.a aVar, q2.a aVar2, j jVar, JsonValue jsonValue, JsonValue jsonValue2, String str, int i11, int i12, int i13, int i14, int i15, String str2, int i16, int i17, String str3, int i18, int i19, v1.a aVar3) {
        int i21;
        q2.h b11 = jVar.b();
        if (aVar3 == null) {
            JsonValue.b it = jsonValue2.iterator();
            v1.a aVar4 = aVar3;
            while (it.hasNext()) {
                JsonValue next = it.next();
                if (next.X("image")) {
                    String V = next.V("image");
                    aVar4 = str2 != null ? b.k(b.k(aVar, str2), V) : b.k(aVar, V);
                }
                f(jVar, aVar2.a(aVar4.C()), i11 + next.N("id"), i16, i17);
            }
            return;
        }
        o a11 = aVar2.a(aVar3.C());
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

    public l(s1.e eVar) {
        super(eVar);
    }
}
