package s2;

import a3.v;
import a3.x0;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.badlogic.gdx.maps.tiled.TiledMapTile;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.SerializationException;
import com.badlogic.gdx.utils.a;
import com.badlogic.gdx.utils.t;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;
import s1.p;
import s2.b;
import s2.b.C1125b;
import s2.i;
import w1.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class d<P extends b.C1125b> extends b<P> {

    /* renamed from: p, reason: collision with root package name */
    public t f87408p;

    /* renamed from: q, reason: collision with root package name */
    public t.a f87409q;

    public d(s1.e eVar) {
        super(eVar);
        this.f87408p = new t();
    }

    public static String y(t.a aVar) {
        return aVar.e("value", aVar.C());
    }

    public static int[] z(t.a aVar, int i11, int i12) {
        InputStream bufferedInputStream;
        t.a l11 = aVar.l("data");
        String e11 = l11.e(c60.c.f8169p, null);
        if (e11 == null) {
            throw new GdxRuntimeException("Unsupported encoding (XML) for TMX Layer Data");
        }
        int[] iArr = new int[i11 * i12];
        if (e11.equals("csv")) {
            String[] split = l11.C().split(",");
            for (int i13 = 0; i13 < split.length; i13++) {
                iArr[i13] = (int) Long.parseLong(split[i13].trim());
            }
            return iArr;
        }
        try {
            if (!e11.equals("base64")) {
                throw new GdxRuntimeException("Unrecognised encoding (" + e11 + ") for TMX Layer Data");
            }
            try {
                String e12 = l11.e("compression", null);
                byte[] a11 = a3.c.a(l11.C());
                if (e12 == null) {
                    bufferedInputStream = new ByteArrayInputStream(a11);
                } else if (e12.equals("gzip")) {
                    bufferedInputStream = new BufferedInputStream(new GZIPInputStream(new ByteArrayInputStream(a11), a11.length));
                } else {
                    if (!e12.equals("zlib")) {
                        throw new GdxRuntimeException("Unrecognised compression (" + e12 + ") for TMX Layer Data");
                    }
                    bufferedInputStream = new BufferedInputStream(new InflaterInputStream(new ByteArrayInputStream(a11)));
                }
                InputStream inputStream = bufferedInputStream;
                byte[] bArr = new byte[4];
                for (int i14 = 0; i14 < i12; i14++) {
                    for (int i15 = 0; i15 < i11; i15++) {
                        int read = inputStream.read(bArr);
                        while (read < 4) {
                            int read2 = inputStream.read(bArr, read, 4 - read);
                            if (read2 == -1) {
                                break;
                            }
                            read += read2;
                        }
                        if (read != 4) {
                            throw new GdxRuntimeException("Error Reading TMX Layer Data: Premature end of tile data");
                        }
                        iArr[(i14 * i11) + i15] = b.r(bArr[0]) | (b.r(bArr[1]) << 8) | (b.r(bArr[2]) << 16) | (b.r(bArr[3]) << 24);
                    }
                }
                x0.a(inputStream);
                return iArr;
            } catch (IOException e13) {
                throw new GdxRuntimeException("Error Reading TMX Layer Data - IOException: " + e13.getMessage());
            }
        } catch (Throwable th2) {
            x0.a(null);
            throw th2;
        }
    }

    public void A(q2.d dVar, t.a aVar) {
        String e11 = aVar.e("name", null);
        float parseFloat = Float.parseFloat(aVar.e("opacity", "1.0"));
        String e12 = aVar.e("tintcolor", "#ffffffff");
        boolean z11 = aVar.z("visible", 1) == 1;
        float v11 = aVar.v("offsetx", 0.0f);
        float v12 = aVar.v("offsety", 0.0f);
        float v13 = aVar.v("parallaxx", 1.0f);
        float v14 = aVar.v("parallaxy", 1.0f);
        dVar.q(e11);
        dVar.t(parseFloat);
        dVar.y(z11);
        dVar.r(v11);
        dVar.s(v12);
        dVar.u(v13);
        dVar.v(v14);
        dVar.x(com.badlogic.gdx.graphics.b.R(b.q(e12)));
    }

    public void B(String str, q2.h hVar, t.a aVar) {
        com.badlogic.gdx.utils.l<String, com.badlogic.gdx.utils.a<b.c>> lVar = this.f87391k;
        if (lVar == null) {
            throw new GdxRuntimeException("No class information loaded to support class properties. Did you set the 'projectFilePath' parameter?");
        }
        if (lVar.isEmpty()) {
            throw new GdxRuntimeException("No class information available. Did you set the correct Tiled project path in the 'projectFilePath' parameter?");
        }
        com.badlogic.gdx.utils.a<b.c> k11 = this.f87391k.k(str);
        if (k11 == null) {
            throw new GdxRuntimeException("There is no class with name '" + str + "' in given Tiled project file.");
        }
        a.b<b.c> it = k11.iterator();
        while (it.hasNext()) {
            b.c next = it.next();
            String str2 = next.f87402a;
            t.a x11 = aVar == null ? null : x(aVar, str2);
            String str3 = next.f87403b;
            str3.getClass();
            if (str3.equals("object")) {
                n(hVar, str2, x11 == null ? next.f87405d.v() : y(x11));
            } else if (str3.equals("class")) {
                q2.h hVar2 = new q2.h();
                String str4 = next.f87404c;
                hVar2.h("type", str4);
                hVar.h(str2, hVar2);
                if (x11 == null) {
                    m(str4, hVar2, next.f87405d);
                } else {
                    B(str4, hVar2, x11);
                }
            } else {
                l(hVar, str2, x11 == null ? next.f87405d.v() : y(x11), next.f87403b);
            }
        }
    }

    public void C(f fVar, q2.e eVar, t.a aVar, v1.a aVar2, q2.a aVar3) {
        o oVar;
        if (aVar.A().equals("imagelayer")) {
            float parseFloat = aVar.D("offsetx") ? Float.parseFloat(aVar.e("offsetx", "0")) : Float.parseFloat(aVar.e("x", "0"));
            float parseFloat2 = aVar.D("offsety") ? Float.parseFloat(aVar.e("offsety", "0")) : Float.parseFloat(aVar.e("y", "0"));
            if (this.f87383c) {
                parseFloat2 = this.f87387g - parseFloat2;
            }
            boolean z11 = aVar.z("repeatx", 0) == 1;
            boolean z12 = aVar.z("repeaty", 0) == 1;
            t.a l11 = aVar.l("image");
            if (l11 != null) {
                oVar = aVar3.a(b.k(aVar2, l11.d("source")).C());
                parseFloat2 -= oVar.b();
            } else {
                oVar = null;
            }
            g gVar = new g(oVar, parseFloat, parseFloat2, z11, z12);
            A(gVar, aVar);
            t.a l12 = aVar.l("properties");
            if (l12 != null) {
                J(gVar.k(), l12);
            }
            eVar.a(gVar);
        }
    }

    public void D(f fVar, q2.e eVar, t.a aVar, v1.a aVar2, q2.a aVar3) {
        String A = aVar.A();
        if (A.equals("group")) {
            E(fVar, eVar, aVar, aVar2, aVar3);
            return;
        }
        if (A.equals("layer")) {
            K(fVar, eVar, aVar);
        } else if (A.equals("objectgroup")) {
            I(fVar, eVar, aVar);
        } else if (A.equals("imagelayer")) {
            C(fVar, eVar, aVar, aVar2, aVar3);
        }
    }

    public void E(f fVar, q2.e eVar, t.a aVar, v1.a aVar2, q2.a aVar3) {
        if (aVar.A().equals("group")) {
            q2.c cVar = new q2.c();
            A(cVar, aVar);
            t.a l11 = aVar.l("properties");
            if (l11 != null) {
                J(cVar.k(), l11);
            }
            int n11 = aVar.n();
            for (int i11 = 0; i11 < n11; i11++) {
                D(fVar, cVar.z(), aVar.k(i11), aVar2, aVar3);
            }
            Iterator<q2.d> it = cVar.z().iterator();
            while (it.hasNext()) {
                it.next().w(cVar);
            }
            eVar.a(cVar);
        }
    }

    public void F(f fVar, TiledMapTile tiledMapTile, t.a aVar) {
        H(fVar, tiledMapTile.e(), aVar, tiledMapTile.b().b());
    }

    public void G(f fVar, q2.d dVar, t.a aVar) {
        H(fVar, dVar.d(), aVar, this.f87387g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01cb  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void H(s2.f r22, q2.g r23, com.badlogic.gdx.utils.t.a r24, float r25) {
        /*
            Method dump skipped, instructions count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.d.H(s2.f, q2.g, com.badlogic.gdx.utils.t$a, float):void");
    }

    public void I(f fVar, q2.e eVar, t.a aVar) {
        if (aVar.A().equals("objectgroup")) {
            q2.d dVar = new q2.d();
            A(dVar, aVar);
            t.a l11 = aVar.l("properties");
            if (l11 != null) {
                J(dVar.k(), l11);
            }
            a.b<t.a> it = aVar.p("object").iterator();
            while (it.hasNext()) {
                G(fVar, dVar, it.next());
            }
            eVar.a(dVar);
        }
    }

    public void J(q2.h hVar, t.a aVar) {
        if (aVar != null && aVar.A().equals("properties")) {
            a.b<t.a> it = aVar.p("property").iterator();
            while (it.hasNext()) {
                t.a next = it.next();
                String e11 = next.e("name", null);
                String y11 = y(next);
                String e12 = next.e("type", null);
                if ("object".equals(e12)) {
                    n(hVar, e11, y11);
                } else if ("class".equals(e12)) {
                    q2.h hVar2 = new q2.h();
                    String d11 = next.d("propertytype");
                    hVar2.h("type", d11);
                    hVar.h(e11, hVar2);
                    B(d11, hVar2, next.l("properties"));
                } else {
                    l(hVar, e11, y11, e12);
                }
            }
        }
    }

    public void K(f fVar, q2.e eVar, t.a aVar) {
        if (aVar.A().equals("layer")) {
            int z11 = aVar.z("width", 0);
            int z12 = aVar.z("height", 0);
            i iVar = new i(z11, z12, ((Integer) fVar.o().d("tilewidth", Integer.class)).intValue(), ((Integer) fVar.o().d("tileheight", Integer.class)).intValue());
            A(iVar, aVar);
            int[] z13 = z(aVar, z11, z12);
            k z14 = fVar.z();
            for (int i11 = 0; i11 < z12; i11++) {
                for (int i12 = 0; i12 < z11; i12++) {
                    int i13 = z13[(i11 * z11) + i12];
                    boolean z15 = (Integer.MIN_VALUE & i13) != 0;
                    boolean z16 = (1073741824 & i13) != 0;
                    boolean z17 = (536870912 & i13) != 0;
                    TiledMapTile b11 = z14.b(i13 & 536870911);
                    if (b11 != null) {
                        i.a h11 = h(z15, z16, z17);
                        h11.h(b11);
                        iVar.E(i12, this.f87383c ? (z12 - 1) - i11 : i11, h11);
                    }
                }
            }
            t.a l11 = aVar.l("properties");
            if (l11 != null) {
                J(iVar.k(), l11);
            }
            eVar.a(iVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void L(t.a aVar, v1.a aVar2, q2.a aVar3) {
        v1.a aVar4;
        int i11;
        int i12;
        String str;
        int i13;
        int i14;
        v1.a aVar5;
        int i15;
        int i16;
        t.a aVar6 = aVar;
        if (aVar6.A().equals("tileset")) {
            int z11 = aVar6.z("firstgid", 1);
            String e11 = aVar6.e("source", null);
            String str2 = "";
            if (e11 != null) {
                v1.a k11 = b.k(aVar2, e11);
                try {
                    t.a q11 = this.f87408p.q(k11);
                    t.a l11 = q11.l("image");
                    if (l11 != null) {
                        str2 = l11.d("source");
                        i15 = l11.z("width", 0);
                        i16 = l11.z("height", 0);
                        aVar5 = b.k(k11, str2);
                    } else {
                        aVar5 = null;
                        i15 = 0;
                        i16 = 0;
                    }
                    aVar4 = aVar5;
                    i11 = i15;
                    i12 = i16;
                    str = str2;
                    aVar6 = q11;
                } catch (SerializationException unused) {
                    throw new GdxRuntimeException("Error parsing external tileset.");
                }
            } else {
                t.a l12 = aVar6.l("image");
                if (l12 != null) {
                    str2 = l12.d("source");
                    i11 = l12.z("width", 0);
                    i12 = l12.z("height", 0);
                    aVar4 = b.k(aVar2, str2);
                } else {
                    aVar4 = null;
                    i11 = 0;
                    i12 = 0;
                }
                str = str2;
            }
            String c11 = aVar6.c("name", null);
            int z12 = aVar6.z("tilewidth", 0);
            int z13 = aVar6.z("tileheight", 0);
            int z14 = aVar6.z("spacing", 0);
            int z15 = aVar6.z("margin", 0);
            t.a l13 = aVar6.l("tileoffset");
            if (l13 != null) {
                i13 = l13.z("x", 0);
                i14 = l13.z("y", 0);
            } else {
                i13 = 0;
                i14 = 0;
            }
            j jVar = new j();
            jVar.h(c11);
            q2.h b11 = jVar.b();
            t.a l14 = aVar6.l("properties");
            if (l14 != null) {
                J(b11, l14);
            }
            b11.h("firstgid", Integer.valueOf(z11));
            com.badlogic.gdx.utils.a<t.a> p11 = aVar6.p("tile");
            s(aVar2, aVar3, jVar, aVar6, p11, c11, z11, z12, z13, z14, z15, e11, i13, i14, str, i11, i12, aVar4);
            com.badlogic.gdx.utils.a aVar7 = new com.badlogic.gdx.utils.a();
            a.b<t.a> it = p11.iterator();
            while (it.hasNext()) {
                t.a next = it.next();
                TiledMapTile d11 = jVar.d(next.z("id", 0) + z11);
                if (d11 != null) {
                    v2.a v11 = v(jVar, d11, next, z11);
                    if (v11 != null) {
                        aVar7.a(v11);
                        d11 = v11;
                    }
                    u(d11, next);
                    t(d11, next);
                }
            }
            a.b it2 = aVar7.iterator();
            while (it2.hasNext()) {
                v2.a aVar8 = (v2.a) it2.next();
                jVar.f(aVar8.getId(), aVar8);
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
        String e11 = this.f87409q.e("orientation", null);
        int z11 = this.f87409q.z("width", 0);
        int z12 = this.f87409q.z("height", 0);
        int z13 = this.f87409q.z("tilewidth", 0);
        int z14 = this.f87409q.z("tileheight", 0);
        int z15 = this.f87409q.z("hexsidelength", 0);
        String e12 = this.f87409q.e("staggeraxis", null);
        String e13 = this.f87409q.e("staggerindex", null);
        String e14 = this.f87409q.e("backgroundcolor", null);
        q2.h o11 = this.f87388h.o();
        if (e11 != null) {
            o11.h("orientation", e11);
        }
        o11.h("width", Integer.valueOf(z11));
        o11.h("height", Integer.valueOf(z12));
        o11.h("tilewidth", Integer.valueOf(z13));
        o11.h("tileheight", Integer.valueOf(z14));
        o11.h("hexsidelength", Integer.valueOf(z15));
        if (e12 != null) {
            o11.h("staggeraxis", e12);
        }
        if (e13 != null) {
            o11.h("staggerindex", e13);
        }
        if (e14 != null) {
            o11.h("backgroundcolor", e14);
        }
        this.f87384d = z13;
        this.f87385e = z14;
        this.f87386f = z11 * z13;
        this.f87387g = z12 * z14;
        if (e11 != null && TypedValues.TransitionType.S_STAGGERED.equals(e11) && z12 > 1) {
            this.f87386f += z13 / 2;
            this.f87387g = (this.f87387g / 2) + (z14 / 2);
        }
        t.a l11 = this.f87409q.l("properties");
        if (l11 != null) {
            J(this.f87388h.o(), l11);
        }
        a.b<t.a> it = this.f87409q.p("tileset").iterator();
        while (it.hasNext()) {
            t.a next = it.next();
            L(next, aVar, aVar2);
            this.f87409q.I(next);
        }
        v1.a aVar3 = aVar;
        q2.a aVar4 = aVar2;
        int n11 = this.f87409q.n();
        int i11 = 0;
        while (i11 < n11) {
            t.a k11 = this.f87409q.k(i11);
            f fVar = this.f87388h;
            D(fVar, fVar.b(), k11, aVar3, aVar4);
            i11++;
            aVar3 = aVar;
            aVar4 = aVar2;
        }
        com.badlogic.gdx.utils.a f11 = this.f87388h.b().f(q2.c.class);
        while (f11.v()) {
            q2.c cVar = (q2.c) f11.first();
            f11.A(0);
            Iterator<q2.d> it2 = cVar.z().iterator();
            while (it2.hasNext()) {
                q2.d next2 = it2.next();
                next2.u(next2.h() * cVar.h());
                next2.v(next2.i() * cVar.i());
                if (next2 instanceof q2.c) {
                    f11.a((q2.c) next2);
                }
            }
        }
        a.b<Runnable> it3 = this.f87390j.iterator();
        while (it3.hasNext()) {
            it3.next().run();
        }
        this.f87390j = null;
        return this.f87388h;
    }

    public abstract void s(v1.a aVar, q2.a aVar2, j jVar, t.a aVar3, com.badlogic.gdx.utils.a<t.a> aVar4, String str, int i11, int i12, int i13, int i14, int i15, String str2, int i16, int i17, String str3, int i18, int i19, v1.a aVar5);

    public void t(TiledMapTile tiledMapTile, t.a aVar) {
        t.a l11 = aVar.l("objectgroup");
        if (l11 != null) {
            a.b<t.a> it = l11.p("object").iterator();
            while (it.hasNext()) {
                F(this.f87388h, tiledMapTile, it.next());
            }
        }
    }

    public void u(TiledMapTile tiledMapTile, t.a aVar) {
        String e11 = aVar.e("terrain", null);
        if (e11 != null) {
            tiledMapTile.a().h("terrain", e11);
        }
        String e12 = aVar.e("probability", null);
        if (e12 != null) {
            tiledMapTile.a().h("probability", e12);
        }
        String e13 = aVar.e("type", null);
        if (e13 != null) {
            tiledMapTile.a().h("type", e13);
        }
        t.a l11 = aVar.l("properties");
        if (l11 != null) {
            J(tiledMapTile.a(), l11);
        }
    }

    public v2.a v(j jVar, TiledMapTile tiledMapTile, t.a aVar, int i11) {
        t.a l11 = aVar.l("animation");
        if (l11 == null) {
            return null;
        }
        com.badlogic.gdx.utils.a aVar2 = new com.badlogic.gdx.utils.a();
        v vVar = new v();
        a.b<t.a> it = l11.p(TypedValues.AttributesType.S_FRAME).iterator();
        while (it.hasNext()) {
            t.a next = it.next();
            aVar2.a((v2.b) jVar.d(next.y("tileid") + i11));
            vVar.a(next.y("duration"));
        }
        v2.a aVar3 = new v2.a(vVar, (com.badlogic.gdx.utils.a<v2.b>) aVar2);
        aVar3.d(tiledMapTile.getId());
        return aVar3;
    }

    @Override // s1.a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public com.badlogic.gdx.utils.a<r1.a> a(String str, v1.a aVar, P p11) {
        this.f87409q = this.f87408p.q(aVar);
        p.b bVar = new p.b();
        if (p11 != null) {
            bVar.f87128c = p11.f87396b;
            bVar.f87131f = p11.f87397c;
            bVar.f87132g = p11.f87398d;
        }
        return i(aVar, bVar);
    }

    public t.a x(t.a aVar, String str) {
        a.b<t.a> it = aVar.q("property").iterator();
        while (it.hasNext()) {
            t.a next = it.next();
            if (str.equals(next.d("name"))) {
                return next;
            }
        }
        return null;
    }
}
