package b2;

import a3.r;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.a;
import d2.h;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import n2.w;
import s1.g;
import x1.d;
import x1.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c extends g<b> {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f5682h = false;

    /* renamed from: d, reason: collision with root package name */
    public final r f5683d;

    /* renamed from: e, reason: collision with root package name */
    public final r f5684e;

    /* renamed from: f, reason: collision with root package name */
    public final r f5685f;

    /* renamed from: g, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<a> f5686g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f5687a;

        /* renamed from: e, reason: collision with root package name */
        public boolean f5691e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f5692f;

        /* renamed from: c, reason: collision with root package name */
        public com.badlogic.gdx.utils.a<Integer> f5689c = new com.badlogic.gdx.utils.a<>(200);

        /* renamed from: d, reason: collision with root package name */
        public int f5690d = 0;

        /* renamed from: g, reason: collision with root package name */
        public d f5693g = new d("");

        /* renamed from: b, reason: collision with root package name */
        public String f5688b = "default";

        public a(String str) {
            this.f5687a = str;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends g.a {

        /* renamed from: c, reason: collision with root package name */
        public boolean f5694c;

        public b() {
        }

        public b(boolean z11) {
            this.f5694c = z11;
        }
    }

    public c() {
        this(null);
    }

    public final int o(String str, int i11) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        int parseInt = Integer.parseInt(str);
        return parseInt < 0 ? i11 + parseInt : parseInt - 1;
    }

    public e p(v1.a aVar, boolean z11) {
        return k(aVar, new b(z11));
    }

    @Override // s1.g
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public d2.b m(v1.a aVar, b bVar) {
        return r(aVar, bVar != null && bVar.f5694c);
    }

    public d2.b r(v1.a aVar, boolean z11) {
        int i11;
        int i12;
        int i13;
        char charAt;
        if (f5682h) {
            q1.g.f81378a.h("ObjLoader", "Wavefront (OBJ) is not fully supported, consult the documentation for more information");
        }
        b2.b bVar = new b2.b();
        a aVar2 = new a("default");
        this.f5686g.a(aVar2);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(aVar.F()), 4096);
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                i11 = 3;
                i12 = 2;
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split("\\s+");
                if (split.length < 1) {
                    break;
                }
                if (split[0].length() != 0 && (charAt = split[0].toLowerCase().charAt(0)) != '#') {
                    if (charAt == 'v') {
                        if (split[0].length() == 1) {
                            this.f5683d.a(Float.parseFloat(split[1]));
                            this.f5683d.a(Float.parseFloat(split[2]));
                            this.f5683d.a(Float.parseFloat(split[3]));
                        } else if (split[0].charAt(1) == 'n') {
                            this.f5684e.a(Float.parseFloat(split[1]));
                            this.f5684e.a(Float.parseFloat(split[2]));
                            this.f5684e.a(Float.parseFloat(split[3]));
                        } else if (split[0].charAt(1) == 't') {
                            this.f5685f.a(Float.parseFloat(split[1]));
                            this.f5685f.a(z11 ? 1.0f - Float.parseFloat(split[2]) : Float.parseFloat(split[2]));
                        }
                    } else if (charAt == 'f') {
                        com.badlogic.gdx.utils.a<Integer> aVar3 = aVar2.f5689c;
                        for (int i14 = 1; i14 < split.length - 2; i14++) {
                            String[] split2 = split[1].split("/");
                            aVar3.a(Integer.valueOf(o(split2[0], this.f5683d.f1626b)));
                            if (split2.length > 2) {
                                if (i14 == 1) {
                                    aVar2.f5691e = true;
                                }
                                aVar3.a(Integer.valueOf(o(split2[2], this.f5684e.f1626b)));
                            }
                            if (split2.length > 1 && split2[1].length() > 0) {
                                if (i14 == 1) {
                                    aVar2.f5692f = true;
                                }
                                aVar3.a(Integer.valueOf(o(split2[1], this.f5685f.f1626b)));
                            }
                            String[] split3 = split[i14 + 1].split("/");
                            aVar3.a(Integer.valueOf(o(split3[0], this.f5683d.f1626b)));
                            if (split3.length > 2) {
                                aVar3.a(Integer.valueOf(o(split3[2], this.f5684e.f1626b)));
                            }
                            if (split3.length > 1 && split3[1].length() > 0) {
                                aVar3.a(Integer.valueOf(o(split3[1], this.f5685f.f1626b)));
                            }
                            String[] split4 = split[i14 + 2].split("/");
                            aVar3.a(Integer.valueOf(o(split4[0], this.f5683d.f1626b)));
                            if (split4.length > 2) {
                                aVar3.a(Integer.valueOf(o(split4[2], this.f5684e.f1626b)));
                            }
                            if (split4.length > 1 && split4[1].length() > 0) {
                                aVar3.a(Integer.valueOf(o(split4[1], this.f5685f.f1626b)));
                            }
                            aVar2.f5690d++;
                        }
                    } else {
                        if (charAt != 'o' && charAt != 'g') {
                            if (split[0].equals("mtllib")) {
                                bVar.b(aVar.B().a(split[1]));
                            } else if (split[0].equals("usemtl")) {
                                if (split.length == 1) {
                                    aVar2.f5688b = "default";
                                } else {
                                    aVar2.f5688b = split[1].replace('.', '_');
                                }
                            }
                        }
                        aVar2 = split.length > 1 ? s(split[1]) : s("default");
                    }
                }
            } catch (IOException unused) {
                return null;
            }
        }
        bufferedReader.close();
        int i15 = 0;
        while (true) {
            com.badlogic.gdx.utils.a<a> aVar4 = this.f5686g;
            i13 = aVar4.f13179b;
            if (i15 >= i13) {
                break;
            }
            if (aVar4.get(i15).f5690d < 1) {
                this.f5686g.A(i15);
                i15--;
            }
            i15++;
        }
        if (i13 < 1) {
            return null;
        }
        d2.b bVar2 = new d2.b();
        int i16 = 0;
        int i17 = 0;
        while (i16 < i13) {
            a aVar5 = this.f5686g.get(i16);
            com.badlogic.gdx.utils.a<Integer> aVar6 = aVar5.f5689c;
            int i18 = aVar6.f13179b;
            int i19 = aVar5.f5690d;
            boolean z12 = aVar5.f5691e;
            boolean z13 = aVar5.f5692f;
            int i21 = i19 * i11;
            int i22 = i12;
            float[] fArr = new float[i21 * ((z12 ? i11 : 0) + 3 + (z13 ? i12 : 0))];
            int i23 = i11;
            int i24 = 0;
            int i25 = 0;
            while (i24 < i18) {
                int i26 = i24 + 1;
                int i27 = i16;
                int intValue = aVar6.get(i24).intValue() * 3;
                int i28 = i13;
                int i29 = i17;
                fArr[i25] = this.f5683d.n(intValue);
                int i31 = intValue + 2;
                fArr[i25 + 1] = this.f5683d.n(intValue + 1);
                int i32 = i25 + 3;
                fArr[i25 + 2] = this.f5683d.n(i31);
                if (z12) {
                    int intValue2 = aVar6.get(i26).intValue() * 3;
                    fArr[i32] = this.f5684e.n(intValue2);
                    fArr[i25 + 4] = this.f5684e.n(intValue2 + 1);
                    i32 = i25 + 6;
                    fArr[i25 + 5] = this.f5684e.n(intValue2 + 2);
                    i26 = i24 + 2;
                }
                if (z13) {
                    int intValue3 = aVar6.get(i26).intValue() * 2;
                    int i33 = i32;
                    fArr[i33] = this.f5685f.n(intValue3);
                    fArr[i32 + 1] = this.f5685f.n(intValue3 + 1);
                    i24 = i26 + 1;
                    i25 = i33 + 2;
                } else {
                    i25 = i32;
                    i24 = i26;
                }
                i16 = i27;
                i13 = i28;
                i17 = i29;
            }
            int i34 = i16;
            int i35 = i13;
            int i36 = i17;
            if (i21 >= 32767) {
                i21 = 0;
            }
            short[] sArr = new short[i21];
            if (i21 > 0) {
                for (int i37 = 0; i37 < i21; i37++) {
                    sArr[i37] = (short) i37;
                }
            }
            com.badlogic.gdx.utils.a aVar7 = new com.badlogic.gdx.utils.a();
            aVar7.a(new com.badlogic.gdx.graphics.r(1, i23, w.f74225u));
            if (z12) {
                aVar7.a(new com.badlogic.gdx.graphics.r(8, i23, w.f74226v));
            }
            if (z13) {
                aVar7.a(new com.badlogic.gdx.graphics.r(16, i22, "a_texCoord0"));
            }
            i17 = i36 + 1;
            String num = Integer.toString(i17);
            String str = "default".equals(aVar5.f5687a) ? "node" + num : aVar5.f5687a;
            String str2 = "default".equals(aVar5.f5687a) ? "mesh" + num : aVar5.f5687a;
            String str3 = "default".equals(aVar5.f5687a) ? "part" + num : aVar5.f5687a;
            d2.e eVar = new d2.e();
            eVar.f47029a = str;
            eVar.f47033e = str2;
            eVar.f47032d = new Vector3(1.0f, 1.0f, 1.0f);
            eVar.f47030b = new Vector3();
            eVar.f47031c = new Quaternion();
            h hVar = new h();
            hVar.f47043b = str3;
            hVar.f47042a = aVar5.f5688b;
            eVar.f47034f = new h[]{hVar};
            d2.d dVar = new d2.d();
            dVar.f47026a = str3;
            dVar.f47027b = sArr;
            dVar.f47028c = 4;
            d2.c cVar = new d2.c();
            cVar.f47022a = str2;
            cVar.f47023b = (com.badlogic.gdx.graphics.r[]) aVar7.Q(com.badlogic.gdx.graphics.r.class);
            cVar.f47024c = fArr;
            cVar.f47025d = new d2.d[]{dVar};
            bVar2.f47020e.a(eVar);
            bVar2.f47018c.a(cVar);
            bVar2.f47019d.a(bVar.a(aVar5.f5688b));
            i16 = i34 + 1;
            i13 = i35;
            i11 = i23;
            i12 = 2;
        }
        r rVar = this.f5683d;
        if (rVar.f1626b > 0) {
            rVar.i();
        }
        r rVar2 = this.f5684e;
        if (rVar2.f1626b > 0) {
            rVar2.i();
        }
        r rVar3 = this.f5685f;
        if (rVar3.f1626b > 0) {
            rVar3.i();
        }
        com.badlogic.gdx.utils.a<a> aVar8 = this.f5686g;
        if (aVar8.f13179b > 0) {
            aVar8.clear();
        }
        return bVar2;
    }

    public final a s(String str) {
        a.b<a> it = this.f5686g.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.f5687a.equals(str)) {
                return next;
            }
        }
        a aVar = new a(str);
        this.f5686g.a(aVar);
        return aVar;
    }

    public c(s1.e eVar) {
        super(eVar);
        this.f5683d = new r(300);
        this.f5684e = new r(300);
        this.f5685f = new r(200);
        this.f5686g = new com.badlogic.gdx.utils.a<>(10);
    }
}
