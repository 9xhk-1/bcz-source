package l3;

import j50.d3;
import j50.p0;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.UnknownFieldException;
import l3.a3;
import l3.i0;
import l3.j2;
import l3.k2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class y2 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: p, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final yz.c0<f50.i<Object>>[] f69725p;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final k2 f69726a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<j2> f69727b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<i0.w> f69728c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final List<i0.z> f69729d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final List<i0.r> f69730e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final List<i0.b0> f69731f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final List<i0.h> f69732g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    public final i0.a0 f69733h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final List<i0.y> f69734i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final List<String> f69735j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final List<String> f69736k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final List<String> f69737l;

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public final List<Integer> f69738m;

    /* renamed from: n, reason: collision with root package name */
    @m80.l
    public final a3 f69739n;

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public final List<i0.m> f69740o;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<y2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f69741a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f69741a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.WordPackModel", aVar, 15);
            l2Var.q("word", true);
            l2Var.q("means", true);
            l2Var.q("sentences", true);
            l2Var.q("tips", true);
            l2Var.q("phrases", true);
            l2Var.q("variants", true);
            l2Var.q("derivations", true);
            l2Var.q("tvInfo", true);
            l2Var.q("similars", true);
            l2Var.q("synonyms", true);
            l2Var.q("antonyms", true);
            l2Var.q("enMeans", true);
            l2Var.q("examTags", true);
            l2Var.q("wordRoot", true);
            l2Var.q("spellingKeyPoints", true);
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
            yz.c0[] c0VarArr = y2.f69725p;
            return new f50.i[]{k2.a.f69569a, c0VarArr[1].getValue(), c0VarArr[2].getValue(), c0VarArr[3].getValue(), c0VarArr[4].getValue(), c0VarArr[5].getValue(), c0VarArr[6].getValue(), g50.a.v(i0.a0.a.f69355a), c0VarArr[8].getValue(), c0VarArr[9].getValue(), c0VarArr[10].getValue(), c0VarArr[11].getValue(), c0VarArr[12].getValue(), g50.a.v(a3.a.f69275a), c0VarArr[14].getValue()};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final y2 e(@m80.k i50.f decoder) {
            int i11;
            List list;
            k2 k2Var;
            List list2;
            List list3;
            List list4;
            List list5;
            List list6;
            i0.a0 a0Var;
            List list7;
            List list8;
            List list9;
            List list10;
            a3 a3Var;
            List list11;
            List list12;
            List list13;
            List list14;
            List list15;
            List list16;
            List list17;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            yz.c0[] c0VarArr = y2.f69725p;
            if (beginStructure.decodeSequentially()) {
                k2 k2Var2 = (k2) beginStructure.decodeSerializableElement(fVar, 0, k2.a.f69569a, null);
                List list18 = (List) beginStructure.decodeSerializableElement(fVar, 1, (f50.e) c0VarArr[1].getValue(), null);
                List list19 = (List) beginStructure.decodeSerializableElement(fVar, 2, (f50.e) c0VarArr[2].getValue(), null);
                List list20 = (List) beginStructure.decodeSerializableElement(fVar, 3, (f50.e) c0VarArr[3].getValue(), null);
                list = (List) beginStructure.decodeSerializableElement(fVar, 4, (f50.e) c0VarArr[4].getValue(), null);
                List list21 = (List) beginStructure.decodeSerializableElement(fVar, 5, (f50.e) c0VarArr[5].getValue(), null);
                List list22 = (List) beginStructure.decodeSerializableElement(fVar, 6, (f50.e) c0VarArr[6].getValue(), null);
                i0.a0 a0Var2 = (i0.a0) beginStructure.decodeNullableSerializableElement(fVar, 7, i0.a0.a.f69355a, null);
                List list23 = (List) beginStructure.decodeSerializableElement(fVar, 8, (f50.e) c0VarArr[8].getValue(), null);
                List list24 = (List) beginStructure.decodeSerializableElement(fVar, 9, (f50.e) c0VarArr[9].getValue(), null);
                List list25 = (List) beginStructure.decodeSerializableElement(fVar, 10, (f50.e) c0VarArr[10].getValue(), null);
                List list26 = (List) beginStructure.decodeSerializableElement(fVar, 11, (f50.e) c0VarArr[11].getValue(), null);
                List list27 = (List) beginStructure.decodeSerializableElement(fVar, 12, (f50.e) c0VarArr[12].getValue(), null);
                i11 = 32767;
                a3Var = (a3) beginStructure.decodeNullableSerializableElement(fVar, 13, a3.a.f69275a, null);
                k2Var = k2Var2;
                list12 = list18;
                a0Var = a0Var2;
                list2 = list19;
                list10 = (List) beginStructure.decodeSerializableElement(fVar, 14, (f50.e) c0VarArr[14].getValue(), null);
                list6 = list25;
                list8 = list24;
                list7 = list22;
                list9 = list21;
                list3 = list23;
                list4 = list20;
                list11 = list27;
                list5 = list26;
            } else {
                int i12 = 14;
                int i13 = 1;
                boolean z11 = true;
                int i14 = 2;
                List list28 = null;
                List list29 = null;
                List list30 = null;
                List list31 = null;
                List list32 = null;
                a3 a3Var2 = null;
                k2 k2Var3 = null;
                int i15 = 10;
                int i16 = 9;
                int i17 = 6;
                int i18 = 5;
                int i19 = 3;
                int i21 = 8;
                int i22 = 4;
                i11 = 0;
                List list33 = null;
                List list34 = null;
                List list35 = null;
                i0.a0 a0Var3 = null;
                List list36 = null;
                list = null;
                List list37 = null;
                List list38 = null;
                while (z11) {
                    int i23 = i12;
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    switch (decodeElementIndex) {
                        case -1:
                            list13 = list28;
                            k2Var3 = k2Var3;
                            list33 = list33;
                            z11 = false;
                            list28 = list13;
                            i12 = 14;
                            i13 = 1;
                            i14 = 2;
                            i19 = 3;
                            i22 = 4;
                            i18 = 5;
                            i17 = 6;
                            i21 = 8;
                            i16 = 9;
                            i15 = 10;
                        case 0:
                            list13 = list28;
                            i11 |= 1;
                            k2Var3 = (k2) beginStructure.decodeSerializableElement(fVar, 0, k2.a.f69569a, k2Var3);
                            list33 = list33;
                            list28 = list13;
                            i12 = 14;
                            i13 = 1;
                            i14 = 2;
                            i19 = 3;
                            i22 = 4;
                            i18 = 5;
                            i17 = 6;
                            i21 = 8;
                            i16 = 9;
                            i15 = 10;
                        case 1:
                            List list39 = list28;
                            int i24 = i13;
                            List list40 = (List) beginStructure.decodeSerializableElement(fVar, i24, (f50.e) c0VarArr[i13].getValue(), list33);
                            i11 |= 2;
                            list32 = list32;
                            i12 = 14;
                            i14 = 2;
                            i19 = 3;
                            i22 = 4;
                            i18 = 5;
                            i17 = 6;
                            i21 = 8;
                            i16 = 9;
                            i15 = 10;
                            i13 = i24;
                            list33 = list40;
                            list28 = list39;
                        case 2:
                            list29 = (List) beginStructure.decodeSerializableElement(fVar, i14, (f50.e) c0VarArr[i14].getValue(), list29);
                            i11 |= 4;
                            list28 = list28;
                            list33 = list33;
                            i12 = 14;
                            i19 = 3;
                            i22 = 4;
                            i18 = 5;
                            i17 = 6;
                            i21 = 8;
                            i16 = 9;
                            i15 = 10;
                        case 3:
                            list31 = (List) beginStructure.decodeSerializableElement(fVar, i19, (f50.e) c0VarArr[i19].getValue(), list31);
                            i11 |= 8;
                            list28 = list28;
                            list33 = list33;
                            i12 = 14;
                            i22 = 4;
                            i18 = 5;
                            i17 = 6;
                            i21 = 8;
                            i16 = 9;
                            i15 = 10;
                        case 4:
                            list = (List) beginStructure.decodeSerializableElement(fVar, i22, (f50.e) c0VarArr[i22].getValue(), list);
                            i11 |= 16;
                            list28 = list28;
                            list33 = list33;
                            i12 = 14;
                            i18 = 5;
                            i17 = 6;
                            i21 = 8;
                            i16 = 9;
                            i15 = 10;
                        case 5:
                            list38 = (List) beginStructure.decodeSerializableElement(fVar, i18, (f50.e) c0VarArr[i18].getValue(), list38);
                            i11 |= 32;
                            list28 = list28;
                            list33 = list33;
                            i12 = 14;
                            i17 = 6;
                            i21 = 8;
                            i16 = 9;
                            i15 = 10;
                        case 6:
                            list14 = list33;
                            list15 = list28;
                            list36 = (List) beginStructure.decodeSerializableElement(fVar, i17, (f50.e) c0VarArr[i17].getValue(), list36);
                            i11 |= 64;
                            list28 = list15;
                            list33 = list14;
                            i12 = 14;
                            i21 = 8;
                            i16 = 9;
                            i15 = 10;
                        case 7:
                            list14 = list33;
                            list15 = list28;
                            a0Var3 = (i0.a0) beginStructure.decodeNullableSerializableElement(fVar, 7, i0.a0.a.f69355a, a0Var3);
                            i11 |= 128;
                            list28 = list15;
                            list33 = list14;
                            i12 = 14;
                            i21 = 8;
                            i16 = 9;
                            i15 = 10;
                        case 8:
                            list30 = (List) beginStructure.decodeSerializableElement(fVar, i21, (f50.e) c0VarArr[i21].getValue(), list30);
                            i11 |= 256;
                            list28 = list28;
                            list33 = list33;
                            i12 = 14;
                            i16 = 9;
                            i15 = 10;
                        case 9:
                            list37 = (List) beginStructure.decodeSerializableElement(fVar, i16, (f50.e) c0VarArr[i16].getValue(), list37);
                            i11 |= 512;
                            list28 = list28;
                            list33 = list33;
                            i12 = 14;
                            i15 = 10;
                        case 10:
                            list16 = list33;
                            list17 = list28;
                            list35 = (List) beginStructure.decodeSerializableElement(fVar, i15, (f50.e) c0VarArr[i15].getValue(), list35);
                            i11 |= 1024;
                            list28 = list17;
                            list33 = list16;
                            i12 = 14;
                        case 11:
                            list16 = list33;
                            list17 = list28;
                            list34 = (List) beginStructure.decodeSerializableElement(fVar, 11, (f50.e) c0VarArr[11].getValue(), list34);
                            i11 |= 2048;
                            list28 = list17;
                            list33 = list16;
                            i12 = 14;
                        case 12:
                            list16 = list33;
                            list32 = (List) beginStructure.decodeSerializableElement(fVar, 12, (f50.e) c0VarArr[12].getValue(), list32);
                            i11 |= 4096;
                            list28 = list28;
                            a3Var2 = a3Var2;
                            list33 = list16;
                            i12 = 14;
                        case 13:
                            list16 = list33;
                            list17 = list28;
                            a3Var2 = (a3) beginStructure.decodeNullableSerializableElement(fVar, 13, a3.a.f69275a, a3Var2);
                            i11 |= 8192;
                            list28 = list17;
                            list33 = list16;
                            i12 = 14;
                        case 14:
                            list28 = (List) beginStructure.decodeSerializableElement(fVar, i23, (f50.e) c0VarArr[i23].getValue(), list28);
                            i11 |= 16384;
                            i12 = i23;
                            list33 = list33;
                        default:
                            throw new UnknownFieldException(decodeElementIndex);
                    }
                }
                k2Var = k2Var3;
                list2 = list29;
                list3 = list30;
                list4 = list31;
                list5 = list34;
                list6 = list35;
                a0Var = a0Var3;
                list7 = list36;
                list8 = list37;
                list9 = list38;
                list10 = list28;
                a3Var = a3Var2;
                list11 = list32;
                list12 = list33;
            }
            int i25 = i11;
            List list41 = list;
            beginStructure.endStructure(fVar);
            return new y2(i25, k2Var, list12, list2, list4, list41, list9, list7, a0Var, list3, list8, list6, list5, list11, a3Var, list10, (j50.x2) null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k y2 value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            y2.u0(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<y2> serializer() {
            return a.f69741a;
        }

        public b() {
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f69725p = new yz.c0[]{null, yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.m2
            @Override // x00.a
            public final Object invoke() {
                f50.i m11;
                m11 = y2.m();
                return m11;
            }
        }), yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.r2
            @Override // x00.a
            public final Object invoke() {
                f50.i n11;
                n11 = y2.n();
                return n11;
            }
        }), yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.s2
            @Override // x00.a
            public final Object invoke() {
                f50.i o11;
                o11 = y2.o();
                return o11;
            }
        }), yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.t2
            @Override // x00.a
            public final Object invoke() {
                f50.i q11;
                q11 = y2.q();
                return q11;
            }
        }), yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.u2
            @Override // x00.a
            public final Object invoke() {
                f50.i r11;
                r11 = y2.r();
                return r11;
            }
        }), yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.v2
            @Override // x00.a
            public final Object invoke() {
                f50.i s11;
                s11 = y2.s();
                return s11;
            }
        }), null, yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.w2
            @Override // x00.a
            public final Object invoke() {
                f50.i t11;
                t11 = y2.t();
                return t11;
            }
        }), yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.x2
            @Override // x00.a
            public final Object invoke() {
                f50.i u11;
                u11 = y2.u();
                return u11;
            }
        }), yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.n2
            @Override // x00.a
            public final Object invoke() {
                f50.i v11;
                v11 = y2.v();
                return v11;
            }
        }), yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.o2
            @Override // x00.a
            public final Object invoke() {
                f50.i w11;
                w11 = y2.w();
                return w11;
            }
        }), yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.p2
            @Override // x00.a
            public final Object invoke() {
                f50.i x11;
                x11 = y2.x();
                return x11;
            }
        }), null, yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.q2
            @Override // x00.a
            public final Object invoke() {
                f50.i p11;
                p11 = y2.p();
                return p11;
            }
        })};
    }

    public y2() {
        this((k2) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (i0.a0) null, (List) null, (List) null, (List) null, (List) null, (List) null, (a3) null, (List) null, 32767, (kotlin.jvm.internal.v) null);
    }

    public static final /* synthetic */ f50.i m() {
        return new j50.f(j2.a.f69558a);
    }

    public static final /* synthetic */ f50.i n() {
        return new j50.f(i0.w.a.f69528a);
    }

    public static final /* synthetic */ f50.i o() {
        return new j50.f(i0.z.a.f69543a);
    }

    public static final /* synthetic */ f50.i p() {
        return new j50.f(i0.m.a.f69439a);
    }

    public static final /* synthetic */ f50.i q() {
        return new j50.f(i0.r.a.f69475a);
    }

    public static final /* synthetic */ f50.i r() {
        return new j50.f(i0.b0.a.f69369a);
    }

    public static final /* synthetic */ f50.i s() {
        return new j50.f(i0.h.a.f69413a);
    }

    public static final /* synthetic */ f50.i t() {
        return new j50.f(i0.y.a.f69540a);
    }

    public static final /* synthetic */ f50.i u() {
        return new j50.f(d3.f63348a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (kotlin.jvm.internal.g0.g(r13.f69726a, new l3.k2(0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, 127, (kotlin.jvm.internal.v) null)) == false) goto L7;
     */
    @w00.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void u0(l3.y2 r13, i50.e r14, h50.f r15) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.y2.u0(l3.y2, i50.e, h50.f):void");
    }

    public static final /* synthetic */ f50.i v() {
        return new j50.f(d3.f63348a);
    }

    public static final /* synthetic */ f50.i w() {
        return new j50.f(d3.f63348a);
    }

    public static final /* synthetic */ f50.i x() {
        return new j50.f(j50.z0.f63517a);
    }

    @m80.k
    public final List<String> A() {
        return this.f69735j;
    }

    @m80.k
    public final List<String> B() {
        return this.f69736k;
    }

    @m80.k
    public final List<String> C() {
        return this.f69737l;
    }

    @m80.k
    public final List<Integer> D() {
        return this.f69738m;
    }

    @m80.l
    public final a3 E() {
        return this.f69739n;
    }

    @m80.k
    public final List<i0.m> F() {
        return this.f69740o;
    }

    @m80.k
    public final List<j2> G() {
        return this.f69727b;
    }

    @m80.k
    public final List<i0.w> H() {
        return this.f69728c;
    }

    @m80.k
    public final List<i0.z> I() {
        return this.f69729d;
    }

    @m80.k
    public final List<i0.r> J() {
        return this.f69730e;
    }

    @m80.k
    public final List<i0.b0> K() {
        return this.f69731f;
    }

    @m80.k
    public final List<i0.h> L() {
        return this.f69732g;
    }

    @m80.l
    public final i0.a0 M() {
        return this.f69733h;
    }

    @m80.k
    public final List<i0.y> N() {
        return this.f69734i;
    }

    @m80.k
    public final y2 O(@m80.k k2 word, @m80.k List<j2> means, @m80.k List<i0.w> sentences, @m80.k List<i0.z> tips, @m80.k List<i0.r> phrases, @m80.k List<i0.b0> variants, @m80.k List<i0.h> derivations, @m80.l i0.a0 a0Var, @m80.k List<i0.y> similars, @m80.k List<String> synonyms, @m80.k List<String> antonyms, @m80.k List<String> enMeans, @m80.k List<Integer> examTags, @m80.l a3 a3Var, @m80.k List<i0.m> spellingKeyPoints) {
        kotlin.jvm.internal.g0.p(word, "word");
        kotlin.jvm.internal.g0.p(means, "means");
        kotlin.jvm.internal.g0.p(sentences, "sentences");
        kotlin.jvm.internal.g0.p(tips, "tips");
        kotlin.jvm.internal.g0.p(phrases, "phrases");
        kotlin.jvm.internal.g0.p(variants, "variants");
        kotlin.jvm.internal.g0.p(derivations, "derivations");
        kotlin.jvm.internal.g0.p(similars, "similars");
        kotlin.jvm.internal.g0.p(synonyms, "synonyms");
        kotlin.jvm.internal.g0.p(antonyms, "antonyms");
        kotlin.jvm.internal.g0.p(enMeans, "enMeans");
        kotlin.jvm.internal.g0.p(examTags, "examTags");
        kotlin.jvm.internal.g0.p(spellingKeyPoints, "spellingKeyPoints");
        return new y2(word, means, sentences, tips, phrases, variants, derivations, a0Var, similars, synonyms, antonyms, enMeans, examTags, a3Var, spellingKeyPoints);
    }

    @m80.k
    public final List<String> Q() {
        return this.f69736k;
    }

    @m80.k
    public final List<i0.h> S() {
        return this.f69732g;
    }

    @m80.k
    public final List<String> U() {
        return this.f69737l;
    }

    @m80.k
    public final List<Integer> W() {
        return this.f69738m;
    }

    @m80.k
    public final List<j2> Y() {
        return this.f69727b;
    }

    @m80.k
    public final List<i0.r> a0() {
        return this.f69730e;
    }

    @m80.k
    public final List<i0.w> c0() {
        return this.f69728c;
    }

    @m80.k
    public final List<i0.y> e0() {
        return this.f69734i;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2)) {
            return false;
        }
        y2 y2Var = (y2) obj;
        return kotlin.jvm.internal.g0.g(this.f69726a, y2Var.f69726a) && kotlin.jvm.internal.g0.g(this.f69727b, y2Var.f69727b) && kotlin.jvm.internal.g0.g(this.f69728c, y2Var.f69728c) && kotlin.jvm.internal.g0.g(this.f69729d, y2Var.f69729d) && kotlin.jvm.internal.g0.g(this.f69730e, y2Var.f69730e) && kotlin.jvm.internal.g0.g(this.f69731f, y2Var.f69731f) && kotlin.jvm.internal.g0.g(this.f69732g, y2Var.f69732g) && kotlin.jvm.internal.g0.g(this.f69733h, y2Var.f69733h) && kotlin.jvm.internal.g0.g(this.f69734i, y2Var.f69734i) && kotlin.jvm.internal.g0.g(this.f69735j, y2Var.f69735j) && kotlin.jvm.internal.g0.g(this.f69736k, y2Var.f69736k) && kotlin.jvm.internal.g0.g(this.f69737l, y2Var.f69737l) && kotlin.jvm.internal.g0.g(this.f69738m, y2Var.f69738m) && kotlin.jvm.internal.g0.g(this.f69739n, y2Var.f69739n) && kotlin.jvm.internal.g0.g(this.f69740o, y2Var.f69740o);
    }

    @m80.k
    public final List<i0.m> g0() {
        return this.f69740o;
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.f69726a.hashCode() * 31) + this.f69727b.hashCode()) * 31) + this.f69728c.hashCode()) * 31) + this.f69729d.hashCode()) * 31) + this.f69730e.hashCode()) * 31) + this.f69731f.hashCode()) * 31) + this.f69732g.hashCode()) * 31;
        i0.a0 a0Var = this.f69733h;
        int hashCode2 = (((((((((((hashCode + (a0Var == null ? 0 : a0Var.hashCode())) * 31) + this.f69734i.hashCode()) * 31) + this.f69735j.hashCode()) * 31) + this.f69736k.hashCode()) * 31) + this.f69737l.hashCode()) * 31) + this.f69738m.hashCode()) * 31;
        a3 a3Var = this.f69739n;
        return ((hashCode2 + (a3Var != null ? a3Var.hashCode() : 0)) * 31) + this.f69740o.hashCode();
    }

    @m80.k
    public final List<String> i0() {
        return this.f69735j;
    }

    @m80.k
    public final List<i0.z> k0() {
        return this.f69729d;
    }

    @m80.l
    public final i0.a0 m0() {
        return this.f69733h;
    }

    @m80.k
    public final List<i0.b0> o0() {
        return this.f69731f;
    }

    @m80.k
    public final k2 q0() {
        return this.f69726a;
    }

    @m80.l
    public final a3 s0() {
        return this.f69739n;
    }

    @m80.k
    public String toString() {
        return "WordPackModel(word=" + this.f69726a + ", means=" + this.f69727b + ", sentences=" + this.f69728c + ", tips=" + this.f69729d + ", phrases=" + this.f69730e + ", variants=" + this.f69731f + ", derivations=" + this.f69732g + ", tvInfo=" + this.f69733h + ", similars=" + this.f69734i + ", synonyms=" + this.f69735j + ", antonyms=" + this.f69736k + ", enMeans=" + this.f69737l + ", examTags=" + this.f69738m + ", wordRoot=" + this.f69739n + ", spellingKeyPoints=" + this.f69740o + ')';
    }

    @m80.k
    public final k2 z() {
        return this.f69726a;
    }

    public /* synthetic */ y2(int i11, k2 k2Var, List list, List list2, List list3, List list4, List list5, List list6, i0.a0 a0Var, List list7, List list8, List list9, List list10, List list11, a3 a3Var, List list12, j50.x2 x2Var) {
        if ((i11 & 1) == 0) {
            this.f69726a = new k2(0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 127, (kotlin.jvm.internal.v) null);
        } else {
            this.f69726a = k2Var;
        }
        if ((i11 & 2) == 0) {
            this.f69727b = a00.h0.J();
        } else {
            this.f69727b = list;
        }
        if ((i11 & 4) == 0) {
            this.f69728c = a00.h0.J();
        } else {
            this.f69728c = list2;
        }
        this.f69729d = (i11 & 8) == 0 ? a00.h0.J() : list3;
        this.f69730e = (i11 & 16) == 0 ? a00.h0.J() : list4;
        this.f69731f = (i11 & 32) == 0 ? a00.h0.J() : list5;
        this.f69732g = (i11 & 64) == 0 ? a00.h0.J() : list6;
        if ((i11 & 128) == 0) {
            this.f69733h = null;
        } else {
            this.f69733h = a0Var;
        }
        this.f69734i = (i11 & 256) == 0 ? a00.h0.J() : list7;
        this.f69735j = (i11 & 512) == 0 ? a00.h0.J() : list8;
        this.f69736k = (i11 & 1024) == 0 ? a00.h0.J() : list9;
        this.f69737l = (i11 & 2048) == 0 ? a00.h0.J() : list10;
        this.f69738m = (i11 & 4096) == 0 ? a00.h0.J() : list11;
        if ((i11 & 8192) == 0) {
            this.f69739n = null;
        } else {
            this.f69739n = a3Var;
        }
        this.f69740o = (i11 & 16384) == 0 ? a00.h0.J() : list12;
    }

    @f50.z("antonyms")
    public static /* synthetic */ void R() {
    }

    @f50.z("derivations")
    public static /* synthetic */ void T() {
    }

    @f50.z("enMeans")
    public static /* synthetic */ void V() {
    }

    @f50.z("examTags")
    public static /* synthetic */ void X() {
    }

    @f50.z("means")
    public static /* synthetic */ void Z() {
    }

    @f50.z("phrases")
    public static /* synthetic */ void b0() {
    }

    @f50.z("sentences")
    public static /* synthetic */ void d0() {
    }

    @f50.z("similars")
    public static /* synthetic */ void f0() {
    }

    @f50.z("spellingKeyPoints")
    public static /* synthetic */ void h0() {
    }

    @f50.z("synonyms")
    public static /* synthetic */ void j0() {
    }

    @f50.z("tips")
    public static /* synthetic */ void l0() {
    }

    @f50.z("tvInfo")
    public static /* synthetic */ void n0() {
    }

    @f50.z("variants")
    public static /* synthetic */ void p0() {
    }

    @f50.z("word")
    public static /* synthetic */ void r0() {
    }

    @f50.z("wordRoot")
    public static /* synthetic */ void t0() {
    }

    public y2(@m80.k k2 word, @m80.k List<j2> means, @m80.k List<i0.w> sentences, @m80.k List<i0.z> tips, @m80.k List<i0.r> phrases, @m80.k List<i0.b0> variants, @m80.k List<i0.h> derivations, @m80.l i0.a0 a0Var, @m80.k List<i0.y> similars, @m80.k List<String> synonyms, @m80.k List<String> antonyms, @m80.k List<String> enMeans, @m80.k List<Integer> examTags, @m80.l a3 a3Var, @m80.k List<i0.m> spellingKeyPoints) {
        kotlin.jvm.internal.g0.p(word, "word");
        kotlin.jvm.internal.g0.p(means, "means");
        kotlin.jvm.internal.g0.p(sentences, "sentences");
        kotlin.jvm.internal.g0.p(tips, "tips");
        kotlin.jvm.internal.g0.p(phrases, "phrases");
        kotlin.jvm.internal.g0.p(variants, "variants");
        kotlin.jvm.internal.g0.p(derivations, "derivations");
        kotlin.jvm.internal.g0.p(similars, "similars");
        kotlin.jvm.internal.g0.p(synonyms, "synonyms");
        kotlin.jvm.internal.g0.p(antonyms, "antonyms");
        kotlin.jvm.internal.g0.p(enMeans, "enMeans");
        kotlin.jvm.internal.g0.p(examTags, "examTags");
        kotlin.jvm.internal.g0.p(spellingKeyPoints, "spellingKeyPoints");
        this.f69726a = word;
        this.f69727b = means;
        this.f69728c = sentences;
        this.f69729d = tips;
        this.f69730e = phrases;
        this.f69731f = variants;
        this.f69732g = derivations;
        this.f69733h = a0Var;
        this.f69734i = similars;
        this.f69735j = synonyms;
        this.f69736k = antonyms;
        this.f69737l = enMeans;
        this.f69738m = examTags;
        this.f69739n = a3Var;
        this.f69740o = spellingKeyPoints;
    }

    public /* synthetic */ y2(k2 k2Var, List list, List list2, List list3, List list4, List list5, List list6, i0.a0 a0Var, List list7, List list8, List list9, List list10, List list11, a3 a3Var, List list12, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? new k2(0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 127, (kotlin.jvm.internal.v) null) : k2Var, (i11 & 2) != 0 ? a00.h0.J() : list, (i11 & 4) != 0 ? a00.h0.J() : list2, (i11 & 8) != 0 ? a00.h0.J() : list3, (i11 & 16) != 0 ? a00.h0.J() : list4, (i11 & 32) != 0 ? a00.h0.J() : list5, (i11 & 64) != 0 ? a00.h0.J() : list6, (i11 & 128) != 0 ? null : a0Var, (i11 & 256) != 0 ? a00.h0.J() : list7, (i11 & 512) != 0 ? a00.h0.J() : list8, (i11 & 1024) != 0 ? a00.h0.J() : list9, (i11 & 2048) != 0 ? a00.h0.J() : list10, (i11 & 4096) != 0 ? a00.h0.J() : list11, (i11 & 8192) == 0 ? a3Var : null, (i11 & 16384) != 0 ? a00.h0.J() : list12);
    }
}
