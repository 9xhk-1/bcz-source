package m3;

import j50.d3;
import j50.p0;
import j50.x2;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.UnknownFieldException;
import m3.k2;
import m3.m0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class o2 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: n, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final yz.c0<f50.i<Object>>[] f72023n;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f72024a;

    /* renamed from: b, reason: collision with root package name */
    public final int f72025b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<Integer> f72026c;

    /* renamed from: d, reason: collision with root package name */
    public final int f72027d;

    /* renamed from: e, reason: collision with root package name */
    public final int f72028e;

    /* renamed from: f, reason: collision with root package name */
    public final int f72029f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final List<k2> f72030g;

    /* renamed from: h, reason: collision with root package name */
    public final int f72031h;

    /* renamed from: i, reason: collision with root package name */
    public final int f72032i;

    /* renamed from: j, reason: collision with root package name */
    public final int f72033j;

    /* renamed from: k, reason: collision with root package name */
    public final int f72034k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final List<m0> f72035l;

    /* renamed from: m, reason: collision with root package name */
    @m80.l
    public final String f72036m;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<o2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f72037a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f72037a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.game.WordsGameCommandModel", aVar, 13);
            l2Var.q("gameId", false);
            l2Var.q("bookId", false);
            l2Var.q("modeList", false);
            l2Var.q("gameType", false);
            l2Var.q("specialGame", false);
            l2Var.q("initialStar", false);
            l2Var.q("learningRoadMap", false);
            l2Var.q("startTime", false);
            l2Var.q("dailyRounds", false);
            l2Var.q("currentProgress", false);
            l2Var.q("todayTime", false);
            l2Var.q("propsRemain", false);
            l2Var.q("state", false);
            descriptor = l2Var;
        }

        @Override // f50.i, f50.b0, f50.e
        @m80.k
        public final h50.f a() {
            return descriptor;
        }

        @Override // j50.p0
        @m80.k
        public /* bridge */ f50.i<?>[] c() {
            return p0.a.a(this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // j50.p0
        @m80.k
        public final f50.i<?>[] f() {
            yz.c0[] c0VarArr = o2.f72023n;
            d3 d3Var = d3.f63348a;
            j50.z0 z0Var = j50.z0.f63517a;
            return new f50.i[]{d3Var, z0Var, c0VarArr[2].getValue(), z0Var, z0Var, z0Var, c0VarArr[6].getValue(), z0Var, z0Var, z0Var, z0Var, c0VarArr[11].getValue(), g50.a.v(d3Var)};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final o2 e(@m80.k i50.f decoder) {
            int i11;
            int i12;
            List list;
            String str;
            int i13;
            List list2;
            List list3;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            String str2;
            int i21;
            char c11;
            char c12;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            yz.c0[] c0VarArr = o2.f72023n;
            int i22 = 10;
            int i23 = 9;
            int i24 = 6;
            int i25 = 0;
            if (beginStructure.decodeSequentially()) {
                String decodeStringElement = beginStructure.decodeStringElement(fVar, 0);
                int decodeIntElement = beginStructure.decodeIntElement(fVar, 1);
                List list4 = (List) beginStructure.decodeSerializableElement(fVar, 2, (f50.e) c0VarArr[2].getValue(), null);
                int decodeIntElement2 = beginStructure.decodeIntElement(fVar, 3);
                int decodeIntElement3 = beginStructure.decodeIntElement(fVar, 4);
                int decodeIntElement4 = beginStructure.decodeIntElement(fVar, 5);
                List list5 = (List) beginStructure.decodeSerializableElement(fVar, 6, (f50.e) c0VarArr[6].getValue(), null);
                int decodeIntElement5 = beginStructure.decodeIntElement(fVar, 7);
                int decodeIntElement6 = beginStructure.decodeIntElement(fVar, 8);
                int decodeIntElement7 = beginStructure.decodeIntElement(fVar, 9);
                int decodeIntElement8 = beginStructure.decodeIntElement(fVar, 10);
                List list6 = (List) beginStructure.decodeSerializableElement(fVar, 11, (f50.e) c0VarArr[11].getValue(), null);
                str = (String) beginStructure.decodeNullableSerializableElement(fVar, 12, d3.f63348a, null);
                str2 = decodeStringElement;
                i11 = decodeIntElement;
                i13 = decodeIntElement8;
                i14 = decodeIntElement7;
                i15 = decodeIntElement5;
                i16 = decodeIntElement4;
                i17 = decodeIntElement2;
                i18 = decodeIntElement6;
                i19 = decodeIntElement3;
                i12 = 8191;
                list2 = list5;
                list3 = list4;
                list = list6;
            } else {
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                int i29 = 0;
                int i31 = 0;
                int i32 = 0;
                int i33 = 0;
                List list7 = null;
                String str3 = null;
                String str4 = null;
                boolean z11 = true;
                int i34 = 0;
                List list8 = null;
                List list9 = null;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    switch (decodeElementIndex) {
                        case -1:
                            c11 = 5;
                            z11 = false;
                            i22 = 10;
                            i24 = 6;
                        case 0:
                            c12 = 5;
                            str4 = beginStructure.decodeStringElement(fVar, 0);
                            i25 |= 1;
                            i22 = 10;
                            i23 = 9;
                            i24 = 6;
                        case 1:
                            c12 = 5;
                            i26 = beginStructure.decodeIntElement(fVar, 1);
                            i25 |= 2;
                            i22 = 10;
                            i23 = 9;
                            i24 = 6;
                        case 2:
                            c12 = 5;
                            list9 = (List) beginStructure.decodeSerializableElement(fVar, 2, (f50.e) c0VarArr[2].getValue(), list9);
                            i25 |= 4;
                            i22 = 10;
                            i23 = 9;
                            i24 = 6;
                        case 3:
                            c11 = 5;
                            i31 = beginStructure.decodeIntElement(fVar, 3);
                            i25 |= 8;
                            i22 = 10;
                            i24 = 6;
                        case 4:
                            c11 = 5;
                            i33 = beginStructure.decodeIntElement(fVar, 4);
                            i25 |= 16;
                            i22 = 10;
                            i24 = 6;
                        case 5:
                            i29 = beginStructure.decodeIntElement(fVar, 5);
                            i25 |= 32;
                            i24 = i24;
                            i22 = 10;
                        case 6:
                            int i35 = i24;
                            list8 = (List) beginStructure.decodeSerializableElement(fVar, i35, (f50.e) c0VarArr[i35].getValue(), list8);
                            i25 |= 64;
                            i24 = i35;
                            i22 = 10;
                        case 7:
                            i28 = beginStructure.decodeIntElement(fVar, 7);
                            i25 |= 128;
                        case 8:
                            i32 = beginStructure.decodeIntElement(fVar, 8);
                            i25 |= 256;
                        case 9:
                            i27 = beginStructure.decodeIntElement(fVar, i23);
                            i25 |= 512;
                        case 10:
                            i34 = beginStructure.decodeIntElement(fVar, i22);
                            i25 |= 1024;
                        case 11:
                            i21 = i24;
                            list7 = (List) beginStructure.decodeSerializableElement(fVar, 11, (f50.e) c0VarArr[11].getValue(), list7);
                            i25 |= 2048;
                            i24 = i21;
                        case 12:
                            i21 = i24;
                            str3 = (String) beginStructure.decodeNullableSerializableElement(fVar, 12, d3.f63348a, str3);
                            i25 |= 4096;
                            i24 = i21;
                        default:
                            throw new UnknownFieldException(decodeElementIndex);
                    }
                }
                i11 = i26;
                i12 = i25;
                list = list7;
                str = str3;
                i13 = i34;
                list2 = list8;
                list3 = list9;
                i14 = i27;
                i15 = i28;
                i16 = i29;
                i17 = i31;
                i18 = i32;
                i19 = i33;
                str2 = str4;
            }
            beginStructure.endStructure(fVar);
            return new o2(i12, str2, i11, list3, i17, i19, i16, list2, i15, i18, i14, i13, list, str, null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k o2 value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            o2.W(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<o2> serializer() {
            return a.f72037a;
        }

        public b() {
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f72023n = new yz.c0[]{null, null, yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: m3.l2
            @Override // x00.a
            public final Object invoke() {
                f50.i d11;
                d11 = o2.d();
                return d11;
            }
        }), null, null, null, yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: m3.m2
            @Override // x00.a
            public final Object invoke() {
                f50.i e11;
                e11 = o2.e();
                return e11;
            }
        }), null, null, null, null, yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: m3.n2
            @Override // x00.a
            public final Object invoke() {
                f50.i f11;
                f11 = o2.f();
                return f11;
            }
        }), null};
    }

    public /* synthetic */ o2(int i11, String str, int i12, List list, int i13, int i14, int i15, List list2, int i16, int i17, int i18, int i19, List list3, String str2, x2 x2Var) {
        if (8191 != (i11 & f2.a.L)) {
            j50.h2.b(i11, f2.a.L, a.f72037a.a());
        }
        this.f72024a = str;
        this.f72025b = i12;
        this.f72026c = list;
        this.f72027d = i13;
        this.f72028e = i14;
        this.f72029f = i15;
        this.f72030g = list2;
        this.f72031h = i16;
        this.f72032i = i17;
        this.f72033j = i18;
        this.f72034k = i19;
        this.f72035l = list3;
        this.f72036m = str2;
    }

    @w00.o
    public static final /* synthetic */ void W(o2 o2Var, i50.e eVar, h50.f fVar) {
        yz.c0<f50.i<Object>>[] c0VarArr = f72023n;
        eVar.encodeStringElement(fVar, 0, o2Var.f72024a);
        eVar.encodeIntElement(fVar, 1, o2Var.f72025b);
        eVar.encodeSerializableElement(fVar, 2, c0VarArr[2].getValue(), o2Var.f72026c);
        eVar.encodeIntElement(fVar, 3, o2Var.f72027d);
        eVar.encodeIntElement(fVar, 4, o2Var.f72028e);
        eVar.encodeIntElement(fVar, 5, o2Var.f72029f);
        eVar.encodeSerializableElement(fVar, 6, c0VarArr[6].getValue(), o2Var.f72030g);
        eVar.encodeIntElement(fVar, 7, o2Var.f72031h);
        eVar.encodeIntElement(fVar, 8, o2Var.f72032i);
        eVar.encodeIntElement(fVar, 9, o2Var.f72033j);
        eVar.encodeIntElement(fVar, 10, o2Var.f72034k);
        eVar.encodeSerializableElement(fVar, 11, c0VarArr[11].getValue(), o2Var.f72035l);
        eVar.encodeNullableSerializableElement(fVar, 12, d3.f63348a, o2Var.f72036m);
    }

    public static final /* synthetic */ f50.i d() {
        return new j50.f(j50.z0.f63517a);
    }

    public static final /* synthetic */ f50.i e() {
        return new j50.f(k2.a.f71972a);
    }

    public static final /* synthetic */ f50.i f() {
        return new j50.f(m0.a.f71998a);
    }

    public static /* synthetic */ o2 v(o2 o2Var, String str, int i11, List list, int i12, int i13, int i14, List list2, int i15, int i16, int i17, int i18, List list3, String str2, int i19, Object obj) {
        if ((i19 & 1) != 0) {
            str = o2Var.f72024a;
        }
        return o2Var.u(str, (i19 & 2) != 0 ? o2Var.f72025b : i11, (i19 & 4) != 0 ? o2Var.f72026c : list, (i19 & 8) != 0 ? o2Var.f72027d : i12, (i19 & 16) != 0 ? o2Var.f72028e : i13, (i19 & 32) != 0 ? o2Var.f72029f : i14, (i19 & 64) != 0 ? o2Var.f72030g : list2, (i19 & 128) != 0 ? o2Var.f72031h : i15, (i19 & 256) != 0 ? o2Var.f72032i : i16, (i19 & 512) != 0 ? o2Var.f72033j : i17, (i19 & 1024) != 0 ? o2Var.f72034k : i18, (i19 & 2048) != 0 ? o2Var.f72035l : list3, (i19 & 4096) != 0 ? o2Var.f72036m : str2);
    }

    public final int A() {
        return this.f72032i;
    }

    @m80.k
    public final String C() {
        return this.f72024a;
    }

    public final int E() {
        return this.f72027d;
    }

    public final int G() {
        return this.f72029f;
    }

    @m80.k
    public final List<k2> I() {
        return this.f72030g;
    }

    @m80.k
    public final List<Integer> K() {
        return this.f72026c;
    }

    @m80.k
    public final List<m0> M() {
        return this.f72035l;
    }

    public final int O() {
        return this.f72028e;
    }

    public final int Q() {
        return this.f72031h;
    }

    @m80.l
    public final String S() {
        return this.f72036m;
    }

    public final int U() {
        return this.f72034k;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2)) {
            return false;
        }
        o2 o2Var = (o2) obj;
        return kotlin.jvm.internal.g0.g(this.f72024a, o2Var.f72024a) && this.f72025b == o2Var.f72025b && kotlin.jvm.internal.g0.g(this.f72026c, o2Var.f72026c) && this.f72027d == o2Var.f72027d && this.f72028e == o2Var.f72028e && this.f72029f == o2Var.f72029f && kotlin.jvm.internal.g0.g(this.f72030g, o2Var.f72030g) && this.f72031h == o2Var.f72031h && this.f72032i == o2Var.f72032i && this.f72033j == o2Var.f72033j && this.f72034k == o2Var.f72034k && kotlin.jvm.internal.g0.g(this.f72035l, o2Var.f72035l) && kotlin.jvm.internal.g0.g(this.f72036m, o2Var.f72036m);
    }

    @m80.k
    public final String h() {
        return this.f72024a;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((this.f72024a.hashCode() * 31) + Integer.hashCode(this.f72025b)) * 31) + this.f72026c.hashCode()) * 31) + Integer.hashCode(this.f72027d)) * 31) + Integer.hashCode(this.f72028e)) * 31) + Integer.hashCode(this.f72029f)) * 31) + this.f72030g.hashCode()) * 31) + Integer.hashCode(this.f72031h)) * 31) + Integer.hashCode(this.f72032i)) * 31) + Integer.hashCode(this.f72033j)) * 31) + Integer.hashCode(this.f72034k)) * 31) + this.f72035l.hashCode()) * 31;
        String str = this.f72036m;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final int i() {
        return this.f72033j;
    }

    public final int j() {
        return this.f72034k;
    }

    @m80.k
    public final List<m0> k() {
        return this.f72035l;
    }

    @m80.l
    public final String l() {
        return this.f72036m;
    }

    public final int m() {
        return this.f72025b;
    }

    @m80.k
    public final List<Integer> n() {
        return this.f72026c;
    }

    public final int o() {
        return this.f72027d;
    }

    public final int p() {
        return this.f72028e;
    }

    public final int q() {
        return this.f72029f;
    }

    @m80.k
    public final List<k2> r() {
        return this.f72030g;
    }

    public final int s() {
        return this.f72031h;
    }

    public final int t() {
        return this.f72032i;
    }

    @m80.k
    public String toString() {
        return "WordsGameCommandModel(gameId=" + this.f72024a + ", bookId=" + this.f72025b + ", modeList=" + this.f72026c + ", gameType=" + this.f72027d + ", specialGame=" + this.f72028e + ", initialStar=" + this.f72029f + ", learningRoadMap=" + this.f72030g + ", startTime=" + this.f72031h + ", dailyRounds=" + this.f72032i + ", currentProgress=" + this.f72033j + ", todayTime=" + this.f72034k + ", propsRemain=" + this.f72035l + ", state=" + this.f72036m + ')';
    }

    @m80.k
    public final o2 u(@m80.k String gameId, int i11, @m80.k List<Integer> modeList, int i12, int i13, int i14, @m80.k List<k2> learningRoadMap, int i15, int i16, int i17, int i18, @m80.k List<m0> propsRemain, @m80.l String str) {
        kotlin.jvm.internal.g0.p(gameId, "gameId");
        kotlin.jvm.internal.g0.p(modeList, "modeList");
        kotlin.jvm.internal.g0.p(learningRoadMap, "learningRoadMap");
        kotlin.jvm.internal.g0.p(propsRemain, "propsRemain");
        return new o2(gameId, i11, modeList, i12, i13, i14, learningRoadMap, i15, i16, i17, i18, propsRemain, str);
    }

    public final int w() {
        return this.f72025b;
    }

    public final int y() {
        return this.f72033j;
    }

    public o2(@m80.k String gameId, int i11, @m80.k List<Integer> modeList, int i12, int i13, int i14, @m80.k List<k2> learningRoadMap, int i15, int i16, int i17, int i18, @m80.k List<m0> propsRemain, @m80.l String str) {
        kotlin.jvm.internal.g0.p(gameId, "gameId");
        kotlin.jvm.internal.g0.p(modeList, "modeList");
        kotlin.jvm.internal.g0.p(learningRoadMap, "learningRoadMap");
        kotlin.jvm.internal.g0.p(propsRemain, "propsRemain");
        this.f72024a = gameId;
        this.f72025b = i11;
        this.f72026c = modeList;
        this.f72027d = i12;
        this.f72028e = i13;
        this.f72029f = i14;
        this.f72030g = learningRoadMap;
        this.f72031h = i15;
        this.f72032i = i16;
        this.f72033j = i17;
        this.f72034k = i18;
        this.f72035l = propsRemain;
        this.f72036m = str;
    }

    @f50.z("dailyRounds")
    public static /* synthetic */ void B() {
    }

    @f50.z("gameId")
    public static /* synthetic */ void D() {
    }

    @f50.z("gameType")
    public static /* synthetic */ void F() {
    }

    @f50.z("initialStar")
    public static /* synthetic */ void H() {
    }

    @f50.z("learningRoadMap")
    public static /* synthetic */ void J() {
    }

    @f50.z("modeList")
    public static /* synthetic */ void L() {
    }

    @f50.z("propsRemain")
    public static /* synthetic */ void N() {
    }

    @f50.z("specialGame")
    public static /* synthetic */ void P() {
    }

    @f50.z("startTime")
    public static /* synthetic */ void R() {
    }

    @f50.z("state")
    public static /* synthetic */ void T() {
    }

    @f50.z("todayTime")
    public static /* synthetic */ void V() {
    }

    @f50.z("bookId")
    public static /* synthetic */ void x() {
    }

    @f50.z("currentProgress")
    public static /* synthetic */ void z() {
    }
}
