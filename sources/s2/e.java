package s2;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.a;
import com.badlogic.gdx.utils.t;
import java.io.IOException;
import java.util.Iterator;
import java.util.StringTokenizer;
import q2.a;
import s1.n;
import s2.i;
import w1.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class e extends n<f, a> {

    /* renamed from: b, reason: collision with root package name */
    public t f87410b;

    /* renamed from: c, reason: collision with root package name */
    public t.a f87411c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends r1.c<f> {
    }

    public e() {
        super(new t1.d());
        this.f87410b = new t();
    }

    private static v1.a e(v1.a aVar, String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, "\\/");
        v1.a B = aVar.B();
        while (stringTokenizer.hasMoreElements()) {
            String nextToken = stringTokenizer.nextToken();
            B = nextToken.equals(zr.m.f102856e) ? B.B() : B.a(nextToken);
        }
        return B;
    }

    private void j(q2.h hVar, t.a aVar) {
        if (aVar.A().equals("Properties")) {
            a.b<t.a> it = aVar.p("Property").iterator();
            while (it.hasNext()) {
                t.a next = it.next();
                String e11 = next.e("Key", null);
                String e12 = next.e("Type", null);
                String C = next.C();
                if (e12.equals("Int32")) {
                    hVar.h(e11, Integer.valueOf(Integer.parseInt(C)));
                } else if (e12.equals("String")) {
                    hVar.h(e11, C);
                } else if (e12.equals("Boolean")) {
                    hVar.h(e11, Boolean.valueOf(C.equalsIgnoreCase(n6.m.f74525c)));
                } else {
                    hVar.h(e11, C);
                }
            }
        }
    }

    @Override // s1.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public com.badlogic.gdx.utils.a<r1.a> a(String str, v1.a aVar, a aVar2) {
        com.badlogic.gdx.utils.a<r1.a> aVar3 = new com.badlogic.gdx.utils.a<>();
        try {
            t.a q11 = this.f87410b.q(aVar);
            this.f87411c = q11;
            a.b<v1.a> it = l(q11, aVar).iterator();
            while (it.hasNext()) {
                aVar3.a(new r1.a(it.next().C(), Texture.class));
            }
            return aVar3;
        } catch (IOException e11) {
            throw new GdxRuntimeException("Couldn't load tilemap '" + str + "'", e11);
        }
    }

    public f f(String str) {
        try {
            v1.a b11 = b(str);
            this.f87411c = this.f87410b.q(b11);
            com.badlogic.gdx.utils.l lVar = new com.badlogic.gdx.utils.l();
            a.b<v1.a> it = l(this.f87411c, b11).iterator();
            while (it.hasNext()) {
                v1.a next = it.next();
                lVar.r(next.C(), new Texture(next));
            }
            f i11 = i(this.f87411c, b11, new a.b(lVar));
            i11.D(lVar.z().f());
            return i11;
        } catch (IOException e11) {
            throw new GdxRuntimeException("Couldn't load tilemap '" + str + "'", e11);
        }
    }

    @Override // s1.n
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public f c(r1.e eVar, String str, v1.a aVar, a aVar2) {
        try {
            return i(this.f87411c, aVar, new a.C1000a(eVar));
        } catch (Exception e11) {
            throw new GdxRuntimeException("Couldn't load tilemap '" + str + "'", e11);
        }
    }

    public final void h(f fVar, t.a aVar) {
        t.a aVar2;
        int i11;
        int i12;
        if (aVar.A().equals("Layer")) {
            String d11 = aVar.d("Id");
            String d12 = aVar.d("Visible");
            t.a l11 = aVar.l("Dimensions");
            String d13 = l11.d("LayerSize");
            String d14 = l11.d("TileSize");
            String[] split = d13.split(" x ");
            int i13 = 0;
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            String[] split2 = d14.split(" x ");
            i iVar = new i(parseInt, parseInt2, Integer.parseInt(split2[0]), Integer.parseInt(split2[1]));
            iVar.q(d11);
            iVar.y(d12.equalsIgnoreCase("True"));
            com.badlogic.gdx.utils.a<t.a> p11 = aVar.l("TileArray").p("Row");
            k z11 = fVar.z();
            int i14 = p11.f13179b;
            j jVar = null;
            int i15 = 0;
            int i16 = 0;
            while (i15 < i14) {
                t.a aVar3 = p11.get(i15);
                int i17 = (i14 - 1) - i15;
                int n11 = aVar3.n();
                int i18 = i13;
                int i19 = i18;
                while (i18 < n11) {
                    t.a k11 = aVar3.k(i18);
                    String A = k11.A();
                    com.badlogic.gdx.utils.a<t.a> aVar4 = p11;
                    int i21 = i14;
                    int i22 = i15;
                    if (A.equals("TileSheet")) {
                        jVar = z11.f(k11.d("Ref"));
                        i16 = ((Integer) jVar.b().d("firstgid", Integer.class)).intValue();
                        aVar2 = aVar3;
                        i11 = n11;
                        i12 = i18;
                    } else {
                        int i23 = i16;
                        if (A.equals("Null")) {
                            i19 += k11.y("Count");
                            aVar2 = aVar3;
                        } else {
                            aVar2 = aVar3;
                            if (A.equals("Static")) {
                                i.a aVar5 = new i.a();
                                aVar5.h(jVar.d(i23 + k11.y("Index")));
                                iVar.E(i19, i17, aVar5);
                                i19++;
                            } else {
                                j jVar2 = jVar;
                                if (A.equals("Animated")) {
                                    int w11 = k11.w("Interval");
                                    t.a l12 = k11.l("Frames");
                                    com.badlogic.gdx.utils.a aVar6 = new com.badlogic.gdx.utils.a();
                                    i11 = n11;
                                    int n12 = l12.n();
                                    i12 = i18;
                                    j jVar3 = jVar2;
                                    int i24 = 0;
                                    while (i24 < n12) {
                                        int i25 = n12;
                                        t.a k12 = l12.k(i24);
                                        int i26 = i24;
                                        String A2 = k12.A();
                                        if (A2.equals("TileSheet")) {
                                            j f11 = z11.f(k12.d("Ref"));
                                            jVar3 = f11;
                                            i23 = ((Integer) f11.b().d("firstgid", Integer.class)).intValue();
                                        } else if (A2.equals("Static")) {
                                            aVar6.a((v2.b) jVar3.d(i23 + k12.y("Index")));
                                        }
                                        i24 = i26 + 1;
                                        n12 = i25;
                                    }
                                    i.a aVar7 = new i.a();
                                    aVar7.h(new v2.a(w11 / 1000.0f, (com.badlogic.gdx.utils.a<v2.b>) aVar6));
                                    iVar.E(i19, i17, aVar7);
                                    i19++;
                                    jVar = jVar3;
                                    i16 = i23;
                                } else {
                                    i11 = n11;
                                    i12 = i18;
                                    i16 = i23;
                                    jVar = jVar2;
                                }
                            }
                        }
                        i11 = n11;
                        i12 = i18;
                        i16 = i23;
                    }
                    i18 = i12 + 1;
                    p11 = aVar4;
                    i14 = i21;
                    i15 = i22;
                    aVar3 = aVar2;
                    n11 = i11;
                }
                i15++;
                i13 = 0;
            }
            t.a l13 = aVar.l("Properties");
            if (l13 != null) {
                j(iVar.k(), l13);
            }
            fVar.b().a(iVar);
        }
    }

    public final f i(t.a aVar, v1.a aVar2, q2.a aVar3) {
        f fVar = new f();
        t.a l11 = aVar.l("Properties");
        if (l11 != null) {
            j(fVar.o(), l11);
        }
        a.b<t.a> it = aVar.l("TileSheets").p("TileSheet").iterator();
        while (it.hasNext()) {
            k(fVar, it.next(), aVar2, aVar3);
        }
        a.b<t.a> it2 = aVar.l("Layers").p("Layer").iterator();
        while (it2.hasNext()) {
            h(fVar, it2.next());
        }
        return fVar;
    }

    public final void k(f fVar, t.a aVar, v1.a aVar2, q2.a aVar3) {
        if (aVar.A().equals("TileSheet")) {
            String d11 = aVar.d("Id");
            aVar.l("Description").C();
            String C = aVar.l("ImageSource").C();
            t.a l11 = aVar.l("Alignment");
            String d12 = l11.d("SheetSize");
            String d13 = l11.d("TileSize");
            String d14 = l11.d("Margin");
            l11.d("Spacing");
            String[] split = d12.split(" x ");
            Integer.parseInt(split[0]);
            int i11 = 1;
            Integer.parseInt(split[1]);
            String[] split2 = d13.split(" x ");
            int parseInt = Integer.parseInt(split2[0]);
            int parseInt2 = Integer.parseInt(split2[1]);
            String[] split3 = d14.split(" x ");
            int parseInt3 = Integer.parseInt(split3[0]);
            int parseInt4 = Integer.parseInt(split3[1]);
            String[] split4 = d14.split(" x ");
            int parseInt5 = Integer.parseInt(split4[0]);
            int parseInt6 = Integer.parseInt(split4[1]);
            o a11 = aVar3.a(e(aVar2, C).C());
            k z11 = fVar.z();
            Iterator<j> it = z11.iterator();
            while (it.hasNext()) {
                i11 += it.next().size();
            }
            j jVar = new j();
            jVar.h(d11);
            jVar.b().h("firstgid", Integer.valueOf(i11));
            int c11 = a11.c() - parseInt;
            int b11 = a11.b() - parseInt2;
            for (int i12 = parseInt4; i12 <= b11; i12 += parseInt2 + parseInt6) {
                int i13 = parseInt3;
                while (i13 <= c11) {
                    v2.b bVar = new v2.b(new o(a11, i13, i12, parseInt, parseInt2));
                    bVar.d(i11);
                    jVar.f(i11, bVar);
                    i13 += parseInt + parseInt5;
                    i11++;
                }
            }
            t.a l12 = aVar.l("Properties");
            if (l12 != null) {
                j(jVar.b(), l12);
            }
            z11.a(jVar);
        }
    }

    public final com.badlogic.gdx.utils.a<v1.a> l(t.a aVar, v1.a aVar2) throws IOException {
        com.badlogic.gdx.utils.a<v1.a> aVar3 = new com.badlogic.gdx.utils.a<>();
        a.b<t.a> it = aVar.l("TileSheets").p("TileSheet").iterator();
        while (it.hasNext()) {
            aVar3.a(e(aVar2, it.next().l("ImageSource").C()));
        }
        return aVar3;
    }

    public e(s1.e eVar) {
        super(eVar);
        this.f87410b = new t();
    }
}
