package m3;

import j50.p0;
import j50.x2;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.UnknownFieldException;
import m3.v0;
import m3.z;
import m3.z0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class l1 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: k, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final yz.c0<f50.i<Object>>[] f71981k;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<v0> f71982a;

    /* renamed from: b, reason: collision with root package name */
    public final int f71983b;

    /* renamed from: c, reason: collision with root package name */
    public final int f71984c;

    /* renamed from: d, reason: collision with root package name */
    public final int f71985d;

    /* renamed from: e, reason: collision with root package name */
    public final int f71986e;

    /* renamed from: f, reason: collision with root package name */
    public final int f71987f;

    /* renamed from: g, reason: collision with root package name */
    public final int f71988g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    public final z f71989h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    public final z0 f71990i;

    /* renamed from: j, reason: collision with root package name */
    @m80.l
    public final List<v0> f71991j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<l1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f71992a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f71992a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.game.SubmitGameRspVo", aVar, 10);
            l2Var.q("singleWordsGameAward", false);
            l2Var.q("learningCompletedRound", false);
            l2Var.q("learningTotalRound", false);
            l2Var.q("spellCompletedCount", false);
            l2Var.q("spellTotalCount", false);
            l2Var.q("reviewCompletedCount", false);
            l2Var.q("reviewTotalCount", false);
            l2Var.q("lavaQuest", true);
            l2Var.q("roundComboAward", true);
            l2Var.q("starAward", true);
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
            yz.c0[] c0VarArr = l1.f71981k;
            j50.z0 z0Var = j50.z0.f63517a;
            return new f50.i[]{c0VarArr[0].getValue(), z0Var, z0Var, z0Var, z0Var, z0Var, z0Var, g50.a.v(z.a.f72132a), g50.a.v(z0.a.f72137a), g50.a.v((f50.i) c0VarArr[9].getValue())};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final l1 e(@m80.k i50.f decoder) {
            int i11;
            List list;
            List list2;
            z0 z0Var;
            z zVar;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            yz.c0[] c0VarArr = l1.f71981k;
            int i18 = 7;
            int i19 = 6;
            int i21 = 5;
            int i22 = 0;
            if (beginStructure.decodeSequentially()) {
                List list3 = (List) beginStructure.decodeSerializableElement(fVar, 0, (f50.e) c0VarArr[0].getValue(), null);
                int decodeIntElement = beginStructure.decodeIntElement(fVar, 1);
                int decodeIntElement2 = beginStructure.decodeIntElement(fVar, 2);
                int decodeIntElement3 = beginStructure.decodeIntElement(fVar, 3);
                int decodeIntElement4 = beginStructure.decodeIntElement(fVar, 4);
                int decodeIntElement5 = beginStructure.decodeIntElement(fVar, 5);
                int decodeIntElement6 = beginStructure.decodeIntElement(fVar, 6);
                z zVar2 = (z) beginStructure.decodeNullableSerializableElement(fVar, 7, z.a.f72132a, null);
                z0 z0Var2 = (z0) beginStructure.decodeNullableSerializableElement(fVar, 8, z0.a.f72137a, null);
                list2 = (List) beginStructure.decodeNullableSerializableElement(fVar, 9, (f50.e) c0VarArr[9].getValue(), null);
                list = list3;
                zVar = zVar2;
                i11 = decodeIntElement6;
                i13 = decodeIntElement5;
                i14 = decodeIntElement3;
                z0Var = z0Var2;
                i15 = decodeIntElement4;
                i16 = decodeIntElement2;
                i12 = 1023;
                i17 = decodeIntElement;
            } else {
                boolean z11 = true;
                int i23 = 0;
                int i24 = 0;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                List list4 = null;
                z0 z0Var3 = null;
                z zVar3 = null;
                List list5 = null;
                int i28 = 0;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    switch (decodeElementIndex) {
                        case -1:
                            z11 = false;
                            i19 = 6;
                            i21 = 5;
                        case 0:
                            list5 = (List) beginStructure.decodeSerializableElement(fVar, 0, (f50.e) c0VarArr[0].getValue(), list5);
                            i22 |= 1;
                            i18 = 7;
                            i19 = 6;
                            i21 = 5;
                        case 1:
                            i27 = beginStructure.decodeIntElement(fVar, 1);
                            i22 |= 2;
                            i18 = 7;
                        case 2:
                            i26 = beginStructure.decodeIntElement(fVar, 2);
                            i22 |= 4;
                            i18 = 7;
                        case 3:
                            i22 |= 8;
                            i24 = beginStructure.decodeIntElement(fVar, 3);
                        case 4:
                            i25 = beginStructure.decodeIntElement(fVar, 4);
                            i22 |= 16;
                        case 5:
                            i28 = beginStructure.decodeIntElement(fVar, i21);
                            i22 |= 32;
                        case 6:
                            i23 = beginStructure.decodeIntElement(fVar, i19);
                            i22 |= 64;
                        case 7:
                            zVar3 = (z) beginStructure.decodeNullableSerializableElement(fVar, i18, z.a.f72132a, zVar3);
                            i22 |= 128;
                        case 8:
                            z0Var3 = (z0) beginStructure.decodeNullableSerializableElement(fVar, 8, z0.a.f72137a, z0Var3);
                            i22 |= 256;
                        case 9:
                            list4 = (List) beginStructure.decodeNullableSerializableElement(fVar, 9, (f50.e) c0VarArr[9].getValue(), list4);
                            i22 |= 512;
                        default:
                            throw new UnknownFieldException(decodeElementIndex);
                    }
                }
                i11 = i23;
                list = list5;
                list2 = list4;
                z0Var = z0Var3;
                zVar = zVar3;
                i12 = i22;
                i13 = i28;
                i14 = i24;
                i15 = i25;
                i16 = i26;
                i17 = i27;
            }
            beginStructure.endStructure(fVar);
            return new l1(i12, list, i17, i16, i14, i15, i13, i11, zVar, z0Var, list2, (x2) null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k l1 value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            l1.L(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<l1> serializer() {
            return a.f71992a;
        }

        public b() {
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f71981k = new yz.c0[]{yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: m3.j1
            @Override // x00.a
            public final Object invoke() {
                f50.i c11;
                c11 = l1.c();
                return c11;
            }
        }), null, null, null, null, null, null, null, null, yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: m3.k1
            @Override // x00.a
            public final Object invoke() {
                f50.i d11;
                d11 = l1.d();
                return d11;
            }
        })};
    }

    public /* synthetic */ l1(int i11, List list, int i12, int i13, int i14, int i15, int i16, int i17, z zVar, z0 z0Var, List list2, x2 x2Var) {
        if (127 != (i11 & 127)) {
            j50.h2.b(i11, 127, a.f71992a.a());
        }
        this.f71982a = list;
        this.f71983b = i12;
        this.f71984c = i13;
        this.f71985d = i14;
        this.f71986e = i15;
        this.f71987f = i16;
        this.f71988g = i17;
        if ((i11 & 128) == 0) {
            this.f71989h = null;
        } else {
            this.f71989h = zVar;
        }
        if ((i11 & 256) == 0) {
            this.f71990i = null;
        } else {
            this.f71990i = z0Var;
        }
        if ((i11 & 512) == 0) {
            this.f71991j = null;
        } else {
            this.f71991j = list2;
        }
    }

    @w00.o
    public static final /* synthetic */ void L(l1 l1Var, i50.e eVar, h50.f fVar) {
        yz.c0<f50.i<Object>>[] c0VarArr = f71981k;
        eVar.encodeSerializableElement(fVar, 0, c0VarArr[0].getValue(), l1Var.f71982a);
        eVar.encodeIntElement(fVar, 1, l1Var.f71983b);
        eVar.encodeIntElement(fVar, 2, l1Var.f71984c);
        eVar.encodeIntElement(fVar, 3, l1Var.f71985d);
        eVar.encodeIntElement(fVar, 4, l1Var.f71986e);
        eVar.encodeIntElement(fVar, 5, l1Var.f71987f);
        eVar.encodeIntElement(fVar, 6, l1Var.f71988g);
        if (eVar.shouldEncodeElementDefault(fVar, 7) || l1Var.f71989h != null) {
            eVar.encodeNullableSerializableElement(fVar, 7, z.a.f72132a, l1Var.f71989h);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 8) || l1Var.f71990i != null) {
            eVar.encodeNullableSerializableElement(fVar, 8, z0.a.f72137a, l1Var.f71990i);
        }
        if (!eVar.shouldEncodeElementDefault(fVar, 9) && l1Var.f71991j == null) {
            return;
        }
        eVar.encodeNullableSerializableElement(fVar, 9, c0VarArr[9].getValue(), l1Var.f71991j);
    }

    public static final /* synthetic */ f50.i c() {
        return new j50.f(v0.a.f72095a);
    }

    public static final /* synthetic */ f50.i d() {
        return new j50.f(v0.a.f72095a);
    }

    public static /* synthetic */ l1 q(l1 l1Var, List list, int i11, int i12, int i13, int i14, int i15, int i16, z zVar, z0 z0Var, List list2, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            list = l1Var.f71982a;
        }
        if ((i17 & 2) != 0) {
            i11 = l1Var.f71983b;
        }
        if ((i17 & 4) != 0) {
            i12 = l1Var.f71984c;
        }
        if ((i17 & 8) != 0) {
            i13 = l1Var.f71985d;
        }
        if ((i17 & 16) != 0) {
            i14 = l1Var.f71986e;
        }
        if ((i17 & 32) != 0) {
            i15 = l1Var.f71987f;
        }
        if ((i17 & 64) != 0) {
            i16 = l1Var.f71988g;
        }
        if ((i17 & 128) != 0) {
            zVar = l1Var.f71989h;
        }
        if ((i17 & 256) != 0) {
            z0Var = l1Var.f71990i;
        }
        if ((i17 & 512) != 0) {
            list2 = l1Var.f71991j;
        }
        z0 z0Var2 = z0Var;
        List list3 = list2;
        int i18 = i16;
        z zVar2 = zVar;
        int i19 = i14;
        int i21 = i15;
        return l1Var.p(list, i11, i12, i13, i19, i21, i18, zVar2, z0Var2, list3);
    }

    @m80.l
    public final z0 B() {
        return this.f71990i;
    }

    @m80.k
    public final List<v0> D() {
        return this.f71982a;
    }

    public final int F() {
        return this.f71985d;
    }

    public final int H() {
        return this.f71986e;
    }

    @m80.l
    public final List<v0> J() {
        return this.f71991j;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return kotlin.jvm.internal.g0.g(this.f71982a, l1Var.f71982a) && this.f71983b == l1Var.f71983b && this.f71984c == l1Var.f71984c && this.f71985d == l1Var.f71985d && this.f71986e == l1Var.f71986e && this.f71987f == l1Var.f71987f && this.f71988g == l1Var.f71988g && kotlin.jvm.internal.g0.g(this.f71989h, l1Var.f71989h) && kotlin.jvm.internal.g0.g(this.f71990i, l1Var.f71990i) && kotlin.jvm.internal.g0.g(this.f71991j, l1Var.f71991j);
    }

    @m80.k
    public final List<v0> f() {
        return this.f71982a;
    }

    @m80.l
    public final List<v0> g() {
        return this.f71991j;
    }

    public final int h() {
        return this.f71983b;
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.f71982a.hashCode() * 31) + Integer.hashCode(this.f71983b)) * 31) + Integer.hashCode(this.f71984c)) * 31) + Integer.hashCode(this.f71985d)) * 31) + Integer.hashCode(this.f71986e)) * 31) + Integer.hashCode(this.f71987f)) * 31) + Integer.hashCode(this.f71988g)) * 31;
        z zVar = this.f71989h;
        int hashCode2 = (hashCode + (zVar == null ? 0 : zVar.hashCode())) * 31;
        z0 z0Var = this.f71990i;
        int hashCode3 = (hashCode2 + (z0Var == null ? 0 : z0Var.hashCode())) * 31;
        List<v0> list = this.f71991j;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final int i() {
        return this.f71984c;
    }

    public final int j() {
        return this.f71985d;
    }

    public final int k() {
        return this.f71986e;
    }

    public final int l() {
        return this.f71987f;
    }

    public final int m() {
        return this.f71988g;
    }

    @m80.l
    public final z n() {
        return this.f71989h;
    }

    @m80.l
    public final z0 o() {
        return this.f71990i;
    }

    @m80.k
    public final l1 p(@m80.k List<v0> singleWordsGameAward, int i11, int i12, int i13, int i14, int i15, int i16, @m80.l z zVar, @m80.l z0 z0Var, @m80.l List<v0> list) {
        kotlin.jvm.internal.g0.p(singleWordsGameAward, "singleWordsGameAward");
        return new l1(singleWordsGameAward, i11, i12, i13, i14, i15, i16, zVar, z0Var, list);
    }

    @m80.l
    public final z r() {
        return this.f71989h;
    }

    public final int t() {
        return this.f71983b;
    }

    @m80.k
    public String toString() {
        return "SubmitGameRspVo(singleWordsGameAward=" + this.f71982a + ", learningCompletedRound=" + this.f71983b + ", learningTotalRound=" + this.f71984c + ", spellCompletedCount=" + this.f71985d + ", spellTotalCount=" + this.f71986e + ", reviewCompletedCount=" + this.f71987f + ", reviewTotalCount=" + this.f71988g + ", lavaQuest=" + this.f71989h + ", roundComboAward=" + this.f71990i + ", starAward=" + this.f71991j + ')';
    }

    public final int v() {
        return this.f71984c;
    }

    public final int x() {
        return this.f71987f;
    }

    public final int z() {
        return this.f71988g;
    }

    public l1(@m80.k List<v0> singleWordsGameAward, int i11, int i12, int i13, int i14, int i15, int i16, @m80.l z zVar, @m80.l z0 z0Var, @m80.l List<v0> list) {
        kotlin.jvm.internal.g0.p(singleWordsGameAward, "singleWordsGameAward");
        this.f71982a = singleWordsGameAward;
        this.f71983b = i11;
        this.f71984c = i12;
        this.f71985d = i13;
        this.f71986e = i14;
        this.f71987f = i15;
        this.f71988g = i16;
        this.f71989h = zVar;
        this.f71990i = z0Var;
        this.f71991j = list;
    }

    public /* synthetic */ l1(List list, int i11, int i12, int i13, int i14, int i15, int i16, z zVar, z0 z0Var, List list2, int i17, kotlin.jvm.internal.v vVar) {
        this(list, i11, i12, i13, i14, i15, i16, (i17 & 128) != 0 ? null : zVar, (i17 & 256) != 0 ? null : z0Var, (i17 & 512) != 0 ? null : list2);
    }

    @f50.z("reviewTotalCount")
    public static /* synthetic */ void A() {
    }

    @f50.z("roundComboAward")
    public static /* synthetic */ void C() {
    }

    @f50.z("singleWordsGameAward")
    public static /* synthetic */ void E() {
    }

    @f50.z("spellCompletedCount")
    public static /* synthetic */ void G() {
    }

    @f50.z("spellTotalCount")
    public static /* synthetic */ void I() {
    }

    @f50.z("starAward")
    public static /* synthetic */ void K() {
    }

    @f50.z("lavaQuest")
    public static /* synthetic */ void s() {
    }

    @f50.z("learningCompletedRound")
    public static /* synthetic */ void u() {
    }

    @f50.z("learningTotalRound")
    public static /* synthetic */ void w() {
    }

    @f50.z("reviewCompletedCount")
    public static /* synthetic */ void y() {
    }
}
