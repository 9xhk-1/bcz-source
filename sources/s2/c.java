package s2;

import a3.v;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.motion.widget.Key;
import com.badlogic.gdx.maps.tiled.TiledMapTile;
import com.badlogic.gdx.math.q;
import com.badlogic.gdx.math.r;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.JsonValue;
import com.badlogic.gdx.utils.SerializationException;
import com.badlogic.gdx.utils.a;
import java.util.Iterator;
import s1.p;
import s2.b;
import s2.b.C1125b;
import s2.i;
import w1.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class c<P extends b.C1125b> extends b<P> {

    /* renamed from: p, reason: collision with root package name */
    public com.badlogic.gdx.utils.g f87406p;

    /* renamed from: q, reason: collision with root package name */
    public JsonValue f87407q;

    public c(s1.e eVar) {
        super(eVar);
        this.f87406p = new com.badlogic.gdx.utils.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] x(com.badlogic.gdx.utils.JsonValue r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.c.x(com.badlogic.gdx.utils.JsonValue, int, int):int[]");
    }

    public void A(f fVar, q2.e eVar, JsonValue jsonValue, v1.a aVar, q2.a aVar2) {
        String W = jsonValue.W("type", "");
        W.getClass();
        switch (W) {
            case "imagelayer":
                z(fVar, eVar, jsonValue, aVar, aVar2);
                break;
            case "objectgroup":
                F(fVar, eVar, jsonValue);
                break;
            case "tilelayer":
                H(fVar, eVar, jsonValue);
                break;
            case "group":
                B(fVar, eVar, jsonValue, aVar, aVar2);
                break;
        }
    }

    public void B(f fVar, q2.e eVar, JsonValue jsonValue, v1.a aVar, q2.a aVar2) {
        if (jsonValue.W("type", "").equals("group")) {
            q2.c cVar = new q2.c();
            y(cVar, jsonValue);
            JsonValue z11 = jsonValue.z("properties");
            if (z11 != null) {
                G(cVar.k(), z11);
            }
            JsonValue z12 = jsonValue.z("layers");
            if (z12 != null) {
                JsonValue.b it = z12.iterator();
                while (it.hasNext()) {
                    A(fVar, cVar.z(), it.next(), aVar, aVar2);
                }
            }
            Iterator<q2.d> it2 = cVar.z().iterator();
            while (it2.hasNext()) {
                it2.next().w(cVar);
            }
            eVar.a(cVar);
        }
    }

    public void C(f fVar, TiledMapTile tiledMapTile, JsonValue jsonValue) {
        E(fVar, tiledMapTile.e(), jsonValue, tiledMapTile.b().b());
    }

    public void D(f fVar, q2.d dVar, JsonValue jsonValue) {
        E(fVar, dVar.d(), jsonValue, this.f87387g);
    }

    public void E(f fVar, q2.g gVar, JsonValue jsonValue, float f11) {
        float f12;
        q2.f fVar2;
        float f13;
        boolean z11 = this.f87382b;
        float f14 = z11 ? 1.0f / this.f87384d : 1.0f;
        float f15 = z11 ? 1.0f / this.f87385e : 1.0f;
        float f16 = 0.0f;
        float M = jsonValue.M("x", 0.0f) * f14;
        float M2 = (this.f87383c ? f11 - jsonValue.M("y", 0.0f) : jsonValue.M("y", 0.0f)) * f15;
        float M3 = jsonValue.M("width", 0.0f) * f14;
        float M4 = jsonValue.M("height", 0.0f) * f15;
        JsonValue z12 = jsonValue.z("polygon");
        if (z12 != null) {
            float[] fArr = new float[z12.f13160j * 2];
            JsonValue.b it = z12.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                JsonValue next = it.next();
                int i12 = i11 + 1;
                fArr[i11] = next.M("x", f16) * f14;
                i11 += 2;
                fArr[i12] = next.M("y", f16) * f15 * (this.f87383c ? -1 : 1);
                f16 = 0.0f;
            }
            q qVar = new q(fArr);
            qVar.t(M, M2);
            fVar2 = new r2.c(qVar);
            f12 = f15;
        } else {
            JsonValue z13 = jsonValue.z("polyline");
            if (z13 != null) {
                float[] fArr2 = new float[z13.f13160j * 2];
                JsonValue.b it2 = z13.iterator();
                int i13 = 0;
                while (it2.hasNext()) {
                    JsonValue next2 = it2.next();
                    int i14 = i13 + 1;
                    float f17 = f15;
                    fArr2[i13] = next2.M("x", 0.0f) * f14;
                    i13 += 2;
                    fArr2[i14] = next2.M("y", 0.0f) * f17 * (this.f87383c ? -1 : 1);
                    f15 = f17;
                }
                f12 = f15;
                r rVar = new r(fArr2);
                rVar.s(M, M2);
                fVar2 = new r2.d(rVar);
            } else {
                f12 = f15;
                if (jsonValue.z("ellipse") != null) {
                    fVar2 = new r2.b(M, this.f87383c ? M2 - M4 : M2, M3, M4);
                } else {
                    fVar2 = null;
                }
            }
        }
        if (fVar2 == null) {
            String W = jsonValue.W("gid", null);
            if (W != null) {
                int parseLong = (int) Long.parseLong(W);
                float f18 = f14;
                f13 = M2;
                t2.a aVar = new t2.a(fVar.z().b(parseLong & 536870911), (Integer.MIN_VALUE & parseLong) != 0, (1073741824 & parseLong) != 0);
                o o11 = aVar.o();
                aVar.d().h("gid", Integer.valueOf(parseLong));
                aVar.x(M);
                aVar.y(this.f87383c ? f13 : f13 - M4);
                float M5 = jsonValue.M("width", o11.c());
                float M6 = jsonValue.M("height", o11.b());
                aVar.u((M5 / o11.c()) * f18);
                aVar.v(f12 * (M6 / o11.b()));
                aVar.t(jsonValue.M(Key.ROTATION, 0.0f));
                fVar2 = aVar;
            } else {
                f13 = M2;
                fVar2 = new r2.e(M, this.f87383c ? f13 - M4 : f13, M3, M4);
            }
        } else {
            f13 = M2;
        }
        fVar2.g(jsonValue.W("name", null));
        String W2 = jsonValue.W(Key.ROTATION, null);
        if (W2 != null) {
            fVar2.d().h(Key.ROTATION, Float.valueOf(Float.parseFloat(W2)));
        }
        String W3 = jsonValue.W("type", null);
        if (W3 != null) {
            fVar2.d().h("type", W3);
        }
        int O = jsonValue.O("id", 0);
        if (O != 0) {
            fVar2.d().h("id", Integer.valueOf(O));
        }
        fVar2.d().h("x", Float.valueOf(M));
        if (fVar2 instanceof t2.a) {
            fVar2.d().h("y", Float.valueOf(f13));
        } else {
            fVar2.d().h("y", Float.valueOf(this.f87383c ? f13 - M4 : f13));
        }
        fVar2.d().h("width", Float.valueOf(M3));
        fVar2.d().h("height", Float.valueOf(M4));
        fVar2.i(jsonValue.B("visible", true));
        JsonValue z14 = jsonValue.z("properties");
        if (z14 != null) {
            G(fVar2.d(), z14);
        }
        this.f87389i.p(O, fVar2);
        gVar.a(fVar2);
    }

    public void F(f fVar, q2.e eVar, JsonValue jsonValue) {
        if (jsonValue.W("type", "").equals("objectgroup")) {
            q2.d dVar = new q2.d();
            y(dVar, jsonValue);
            JsonValue z11 = jsonValue.z("properties");
            if (z11 != null) {
                G(dVar.k(), z11);
            }
            JsonValue.b it = jsonValue.z("objects").iterator();
            while (it.hasNext()) {
                D(fVar, dVar, it.next());
            }
            eVar.a(dVar);
        }
    }

    public final void G(q2.h hVar, JsonValue jsonValue) {
        if (jsonValue == null || !"properties".equals(jsonValue.q0())) {
            return;
        }
        JsonValue.b it = jsonValue.iterator();
        while (it.hasNext()) {
            JsonValue next = it.next();
            String W = next.W("name", null);
            String W2 = next.W("value", null);
            String W3 = next.W("type", null);
            if (W2 == null && !"class".equals(W3)) {
                W2 = next.v();
            }
            W3.getClass();
            if (W3.equals("object")) {
                n(hVar, W, W2);
            } else if (W3.equals("class")) {
                q2.h hVar2 = new q2.h();
                String V = next.V("propertytype");
                hVar2.h("type", V);
                hVar.h(W, hVar2);
                m(V, hVar2, next.z("value"));
            } else {
                l(hVar, W, W2, W3);
            }
        }
    }

    public void H(f fVar, q2.e eVar, JsonValue jsonValue) {
        if (jsonValue.W("type", "").equals("tilelayer")) {
            int O = jsonValue.O("width", 0);
            int O2 = jsonValue.O("height", 0);
            i iVar = new i(O, O2, ((Integer) fVar.o().d("tilewidth", Integer.class)).intValue(), ((Integer) fVar.o().d("tileheight", Integer.class)).intValue());
            y(iVar, jsonValue);
            int[] x11 = x(jsonValue, O, O2);
            k z11 = fVar.z();
            for (int i11 = 0; i11 < O2; i11++) {
                for (int i12 = 0; i12 < O; i12++) {
                    int i13 = x11[(i11 * O) + i12];
                    boolean z12 = (Integer.MIN_VALUE & i13) != 0;
                    boolean z13 = (1073741824 & i13) != 0;
                    boolean z14 = (536870912 & i13) != 0;
                    TiledMapTile b11 = z11.b(i13 & 536870911);
                    if (b11 != null) {
                        i.a h11 = h(z12, z13, z14);
                        h11.h(b11);
                        iVar.E(i12, this.f87383c ? (O2 - 1) - i11 : i11, h11);
                    }
                }
            }
            JsonValue z15 = jsonValue.z("properties");
            if (z15 != null) {
                G(iVar.k(), z15);
            }
            eVar.a(iVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void I(JsonValue jsonValue, v1.a aVar, q2.a aVar2) {
        JsonValue jsonValue2;
        v1.a aVar3;
        int i11;
        int i12;
        String str;
        int i13;
        int i14;
        v1.a aVar4;
        int i15;
        int i16;
        if (jsonValue.V("firstgid") != null) {
            int O = jsonValue.O("firstgid", 1);
            String W = jsonValue.W("source", null);
            String str2 = "";
            if (W != null) {
                v1.a k11 = b.k(aVar, W);
                try {
                    JsonValue a11 = this.f87406p.a(k11);
                    if (a11.X("image")) {
                        str2 = a11.V("image");
                        i16 = a11.O("imagewidth", 0);
                        i15 = a11.O("imageheight", 0);
                        aVar4 = b.k(k11, str2);
                    } else {
                        aVar4 = null;
                        i15 = 0;
                        i16 = 0;
                    }
                    aVar3 = aVar4;
                    i12 = i15;
                    i11 = i16;
                    str = str2;
                    jsonValue2 = a11;
                } catch (SerializationException unused) {
                    throw new GdxRuntimeException("Error parsing external tileSet.");
                }
            } else if (jsonValue.X("image")) {
                String V = jsonValue.V("image");
                int O2 = jsonValue.O("imagewidth", 0);
                i12 = jsonValue.O("imageheight", 0);
                i11 = O2;
                aVar3 = b.k(aVar, V);
                str = V;
                jsonValue2 = jsonValue;
            } else {
                jsonValue2 = jsonValue;
                aVar3 = null;
                i11 = 0;
                i12 = 0;
                str = "";
            }
            String W2 = jsonValue2.W("name", null);
            int O3 = jsonValue2.O("tilewidth", 0);
            int O4 = jsonValue2.O("tileheight", 0);
            int O5 = jsonValue2.O("spacing", 0);
            int O6 = jsonValue2.O("margin", 0);
            JsonValue z11 = jsonValue2.z("tileoffset");
            if (z11 != null) {
                i13 = z11.O("x", 0);
                i14 = z11.O("y", 0);
            } else {
                i13 = 0;
                i14 = 0;
            }
            j jVar = new j();
            jVar.h(W2);
            q2.h b11 = jVar.b();
            JsonValue z12 = jsonValue2.z("properties");
            if (z12 != null) {
                G(b11, z12);
            }
            b11.h("firstgid", Integer.valueOf(O));
            JsonValue z13 = jsonValue2.z("tiles");
            if (z13 == null) {
                z13 = new JsonValue(JsonValue.ValueType.array);
            }
            JsonValue jsonValue3 = z13;
            s(aVar, aVar2, jVar, jsonValue2, jsonValue3, W2, O, O3, O4, O5, O6, W, i13, i14, str, i11, i12, aVar3);
            com.badlogic.gdx.utils.a aVar5 = new com.badlogic.gdx.utils.a();
            JsonValue.b it = jsonValue3.iterator();
            while (it.hasNext()) {
                JsonValue next = it.next();
                TiledMapTile d11 = jVar.d(next.O("id", 0) + O);
                if (d11 != null) {
                    v2.a v11 = v(jVar, d11, next, O);
                    if (v11 != null) {
                        aVar5.a(v11);
                        d11 = v11;
                    }
                    u(d11, next);
                    t(d11, next);
                }
            }
            a.b it2 = aVar5.iterator();
            while (it2.hasNext()) {
                v2.a aVar6 = (v2.a) it2.next();
                jVar.f(aVar6.getId(), aVar6);
            }
            this.f87388h.z().a(jVar);
        }
    }

    @Override // s2.b
    public f p(v1.a aVar, P p11, q2.a aVar2) {
        this.f87388h = new f();
        this.f87389i = new com.badlogic.gdx.utils.d<>();
        this.f87390j = new com.badlogic.gdx.utils.a<>();
        if (p11 != null) {
            this.f87382b = p11.f87399e;
            this.f87383c = p11.f87400f;
            o(p11.f87401g);
        } else {
            this.f87382b = false;
            this.f87383c = true;
        }
        String W = this.f87407q.W("orientation", null);
        int O = this.f87407q.O("width", 0);
        int O2 = this.f87407q.O("height", 0);
        int O3 = this.f87407q.O("tilewidth", 0);
        int O4 = this.f87407q.O("tileheight", 0);
        int O5 = this.f87407q.O("hexsidelength", 0);
        String W2 = this.f87407q.W("staggeraxis", null);
        String W3 = this.f87407q.W("staggerindex", null);
        String W4 = this.f87407q.W("backgroundcolor", null);
        q2.h o11 = this.f87388h.o();
        if (W != null) {
            o11.h("orientation", W);
        }
        o11.h("width", Integer.valueOf(O));
        o11.h("height", Integer.valueOf(O2));
        o11.h("tilewidth", Integer.valueOf(O3));
        o11.h("tileheight", Integer.valueOf(O4));
        o11.h("hexsidelength", Integer.valueOf(O5));
        if (W2 != null) {
            o11.h("staggeraxis", W2);
        }
        if (W3 != null) {
            o11.h("staggerindex", W3);
        }
        if (W4 != null) {
            o11.h("backgroundcolor", W4);
        }
        this.f87384d = O3;
        this.f87385e = O4;
        this.f87386f = O * O3;
        this.f87387g = O2 * O4;
        if (W != null && TypedValues.TransitionType.S_STAGGERED.equals(W) && O2 > 1) {
            this.f87386f += O3 / 2;
            this.f87387g = (this.f87387g / 2) + (O4 / 2);
        }
        JsonValue z11 = this.f87407q.z("properties");
        if (z11 != null) {
            G(this.f87388h.o(), z11);
        }
        JsonValue.b it = this.f87407q.z("tilesets").iterator();
        while (it.hasNext()) {
            I(it.next(), aVar, aVar2);
        }
        v1.a aVar3 = aVar;
        q2.a aVar4 = aVar2;
        JsonValue.b it2 = this.f87407q.z("layers").iterator();
        while (it2.hasNext()) {
            JsonValue next = it2.next();
            f fVar = this.f87388h;
            A(fVar, fVar.b(), next, aVar3, aVar4);
            aVar3 = aVar;
            aVar4 = aVar2;
        }
        com.badlogic.gdx.utils.a f11 = this.f87388h.b().f(q2.c.class);
        while (f11.v()) {
            q2.c cVar = (q2.c) f11.first();
            f11.A(0);
            Iterator<q2.d> it3 = cVar.z().iterator();
            while (it3.hasNext()) {
                q2.d next2 = it3.next();
                next2.u(next2.h() * cVar.h());
                next2.v(next2.i() * cVar.i());
                if (next2 instanceof q2.c) {
                    f11.a((q2.c) next2);
                }
            }
        }
        a.b<Runnable> it4 = this.f87390j.iterator();
        while (it4.hasNext()) {
            it4.next().run();
        }
        this.f87390j = null;
        return this.f87388h;
    }

    public abstract void s(v1.a aVar, q2.a aVar2, j jVar, JsonValue jsonValue, JsonValue jsonValue2, String str, int i11, int i12, int i13, int i14, int i15, String str2, int i16, int i17, String str3, int i18, int i19, v1.a aVar3);

    public final void t(TiledMapTile tiledMapTile, JsonValue jsonValue) {
        JsonValue z11 = jsonValue.z("objectgroup");
        if (z11 != null) {
            JsonValue.b it = z11.z("objects").iterator();
            while (it.hasNext()) {
                C(this.f87388h, tiledMapTile, it.next());
            }
        }
    }

    public final void u(TiledMapTile tiledMapTile, JsonValue jsonValue) {
        String W = jsonValue.W("terrain", null);
        if (W != null) {
            tiledMapTile.a().h("terrain", W);
        }
        String W2 = jsonValue.W("probability", null);
        if (W2 != null) {
            tiledMapTile.a().h("probability", W2);
        }
        String W3 = jsonValue.W("type", null);
        if (W3 != null) {
            tiledMapTile.a().h("type", W3);
        }
        JsonValue z11 = jsonValue.z("properties");
        if (z11 != null) {
            G(tiledMapTile.a(), z11);
        }
    }

    public final v2.a v(j jVar, TiledMapTile tiledMapTile, JsonValue jsonValue, int i11) {
        JsonValue z11 = jsonValue.z("animation");
        if (z11 == null) {
            return null;
        }
        com.badlogic.gdx.utils.a aVar = new com.badlogic.gdx.utils.a();
        v vVar = new v();
        JsonValue.b it = z11.iterator();
        while (it.hasNext()) {
            JsonValue next = it.next();
            aVar.a((v2.b) jVar.d(next.N("tileid") + i11));
            vVar.a(next.N("duration"));
        }
        v2.a aVar2 = new v2.a(vVar, (com.badlogic.gdx.utils.a<v2.b>) aVar);
        aVar2.d(tiledMapTile.getId());
        return aVar2;
    }

    @Override // s1.a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public com.badlogic.gdx.utils.a<r1.a> a(String str, v1.a aVar, P p11) {
        this.f87407q = this.f87406p.a(aVar);
        p.b bVar = new p.b();
        if (p11 != null) {
            bVar.f87128c = p11.f87396b;
            bVar.f87131f = p11.f87397c;
            bVar.f87132g = p11.f87398d;
        }
        return i(aVar, bVar);
    }

    public void y(q2.d dVar, JsonValue jsonValue) {
        String V = jsonValue.V("name");
        float M = jsonValue.M("opacity", 1.0f);
        String W = jsonValue.W("tintcolor", "#ffffffff");
        boolean B = jsonValue.B("visible", true);
        float M2 = jsonValue.M("offsetx", 0.0f);
        float M3 = jsonValue.M("offsety", 0.0f);
        float M4 = jsonValue.M("parallaxx", 1.0f);
        float M5 = jsonValue.M("parallaxy", 1.0f);
        dVar.q(V);
        dVar.t(M);
        dVar.y(B);
        dVar.r(M2);
        dVar.s(M3);
        dVar.u(M4);
        dVar.v(M5);
        dVar.x(com.badlogic.gdx.graphics.b.R(b.q(W)));
    }

    public void z(f fVar, q2.e eVar, JsonValue jsonValue, v1.a aVar, q2.a aVar2) {
        o oVar;
        if (jsonValue.W("type", "").equals("imagelayer")) {
            float M = jsonValue.M("offsetx", 0.0f);
            float M2 = jsonValue.M("offsety", 0.0f);
            if (this.f87383c) {
                M2 = this.f87387g - M2;
            }
            String W = jsonValue.W("image", "");
            boolean z11 = jsonValue.O("repeatx", 0) == 1;
            boolean z12 = jsonValue.O("repeaty", 0) == 1;
            if (W.isEmpty()) {
                oVar = null;
            } else {
                oVar = aVar2.a(b.k(aVar, W).C());
                M2 -= oVar.b();
            }
            g gVar = new g(oVar, M, M2, z11, z12);
            y(gVar, jsonValue);
            JsonValue z13 = jsonValue.z("properties");
            if (z13 != null) {
                G(gVar.k(), z13);
            }
            eVar.a(gVar);
        }
    }
}
