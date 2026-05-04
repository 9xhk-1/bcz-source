package l3;

import j50.d3;
import j50.p0;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.UnknownFieldException;
import l3.i0;
import l3.y2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class i0 {

    @m80.k
    public static final f Companion = new f(null);

    /* renamed from: l, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final yz.c0<f50.i<Object>>[] f69340l;

    /* renamed from: a, reason: collision with root package name */
    public final int f69341a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f69342b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<p> f69343c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final u f69344d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public final String f69345e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final List<g> f69346f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final List<s> f69347g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    public final String f69348h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    public final String f69349i;

    /* renamed from: j, reason: collision with root package name */
    @m80.l
    public final y2 f69350j;

    /* renamed from: k, reason: collision with root package name */
    @m80.l
    public final d f69351k;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<i0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f69352a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f69352a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.TopicResourceModel", aVar, 11);
            l2Var.q("topicId", false);
            l2Var.q("word", false);
            l2Var.q("modes", true);
            l2Var.q("resource", false);
            l2Var.q("proExplanation", true);
            l2Var.q("confusingConcept", true);
            l2Var.q("proPhrases", true);
            l2Var.q("additionalExplanation", true);
            l2Var.q("wordConjugation", true);
            l2Var.q("wordPack", true);
            l2Var.q("cake", true);
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
            yz.c0[] c0VarArr = i0.f69340l;
            d3 d3Var = d3.f63348a;
            return new f50.i[]{j50.z0.f63517a, d3Var, c0VarArr[2].getValue(), u.a.f69502a, g50.a.v(d3Var), c0VarArr[5].getValue(), c0VarArr[6].getValue(), g50.a.v(d3Var), g50.a.v(d3Var), g50.a.v(y2.a.f69741a), g50.a.v(d.a.f69400a)};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final i0 e(@m80.k i50.f decoder) {
            int i11;
            int i12;
            y2 y2Var;
            List list;
            d dVar;
            List list2;
            String str;
            String str2;
            String str3;
            u uVar;
            List list3;
            String str4;
            yz.c0[] c0VarArr;
            yz.c0[] c0VarArr2;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            yz.c0[] c0VarArr3 = i0.f69340l;
            String str5 = null;
            if (beginStructure.decodeSequentially()) {
                i11 = beginStructure.decodeIntElement(fVar, 0);
                String decodeStringElement = beginStructure.decodeStringElement(fVar, 1);
                List list4 = (List) beginStructure.decodeSerializableElement(fVar, 2, (f50.e) c0VarArr3[2].getValue(), null);
                u uVar2 = (u) beginStructure.decodeSerializableElement(fVar, 3, u.a.f69502a, null);
                d3 d3Var = d3.f63348a;
                String str6 = (String) beginStructure.decodeNullableSerializableElement(fVar, 4, d3Var, null);
                List list5 = (List) beginStructure.decodeSerializableElement(fVar, 5, (f50.e) c0VarArr3[5].getValue(), null);
                List list6 = (List) beginStructure.decodeSerializableElement(fVar, 6, (f50.e) c0VarArr3[6].getValue(), null);
                String str7 = (String) beginStructure.decodeNullableSerializableElement(fVar, 7, d3Var, null);
                String str8 = (String) beginStructure.decodeNullableSerializableElement(fVar, 8, d3Var, null);
                list2 = list6;
                list = list5;
                y2Var = (y2) beginStructure.decodeNullableSerializableElement(fVar, 9, y2.a.f69741a, null);
                str2 = str7;
                uVar = uVar2;
                str = str8;
                str3 = str6;
                dVar = (d) beginStructure.decodeNullableSerializableElement(fVar, 10, d.a.f69400a, null);
                i12 = 2047;
                list3 = list4;
                str4 = decodeStringElement;
            } else {
                int i13 = 6;
                int i14 = 5;
                boolean z11 = true;
                i11 = 0;
                int i15 = 0;
                y2 y2Var2 = null;
                List list7 = null;
                d dVar2 = null;
                List list8 = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                u uVar3 = null;
                List list9 = null;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    switch (decodeElementIndex) {
                        case -1:
                            z11 = false;
                            i14 = 5;
                            i13 = 6;
                        case 0:
                            c0VarArr2 = c0VarArr3;
                            i15 |= 1;
                            i11 = beginStructure.decodeIntElement(fVar, 0);
                            c0VarArr3 = c0VarArr2;
                            i14 = 5;
                            i13 = 6;
                        case 1:
                            c0VarArr2 = c0VarArr3;
                            str5 = beginStructure.decodeStringElement(fVar, 1);
                            i15 |= 2;
                            c0VarArr3 = c0VarArr2;
                            i14 = 5;
                            i13 = 6;
                        case 2:
                            c0VarArr2 = c0VarArr3;
                            list9 = (List) beginStructure.decodeSerializableElement(fVar, 2, (f50.e) c0VarArr2[2].getValue(), list9);
                            i15 |= 4;
                            c0VarArr3 = c0VarArr2;
                            i14 = 5;
                            i13 = 6;
                        case 3:
                            c0VarArr2 = c0VarArr3;
                            uVar3 = (u) beginStructure.decodeSerializableElement(fVar, 3, u.a.f69502a, uVar3);
                            i15 |= 8;
                            c0VarArr3 = c0VarArr2;
                            i14 = 5;
                            i13 = 6;
                        case 4:
                            c0VarArr2 = c0VarArr3;
                            str11 = (String) beginStructure.decodeNullableSerializableElement(fVar, 4, d3.f63348a, str11);
                            i15 |= 16;
                            c0VarArr3 = c0VarArr2;
                            i14 = 5;
                            i13 = 6;
                        case 5:
                            yz.c0[] c0VarArr4 = c0VarArr3;
                            list7 = (List) beginStructure.decodeSerializableElement(fVar, i14, (f50.e) c0VarArr4[i14].getValue(), list7);
                            i15 |= 32;
                            c0VarArr3 = c0VarArr4;
                            i13 = 6;
                        case 6:
                            c0VarArr = c0VarArr3;
                            list8 = (List) beginStructure.decodeSerializableElement(fVar, i13, (f50.e) c0VarArr[i13].getValue(), list8);
                            i15 |= 64;
                            c0VarArr3 = c0VarArr;
                        case 7:
                            c0VarArr = c0VarArr3;
                            str10 = (String) beginStructure.decodeNullableSerializableElement(fVar, 7, d3.f63348a, str10);
                            i15 |= 128;
                            c0VarArr3 = c0VarArr;
                        case 8:
                            c0VarArr = c0VarArr3;
                            str9 = (String) beginStructure.decodeNullableSerializableElement(fVar, 8, d3.f63348a, str9);
                            i15 |= 256;
                            c0VarArr3 = c0VarArr;
                        case 9:
                            y2Var2 = (y2) beginStructure.decodeNullableSerializableElement(fVar, 9, y2.a.f69741a, y2Var2);
                            i15 |= 512;
                            c0VarArr3 = c0VarArr3;
                        case 10:
                            c0VarArr = c0VarArr3;
                            dVar2 = (d) beginStructure.decodeNullableSerializableElement(fVar, 10, d.a.f69400a, dVar2);
                            i15 |= 1024;
                            c0VarArr3 = c0VarArr;
                        default:
                            throw new UnknownFieldException(decodeElementIndex);
                    }
                }
                i12 = i15;
                y2Var = y2Var2;
                list = list7;
                dVar = dVar2;
                list2 = list8;
                str = str9;
                str2 = str10;
                str3 = str11;
                uVar = uVar3;
                list3 = list9;
                str4 = str5;
            }
            int i16 = i11;
            beginStructure.endStructure(fVar);
            return new i0(i12, i16, str4, list3, uVar, str3, list, list2, str2, str, y2Var, dVar, (j50.x2) null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k i0 value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            i0.Q(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @f50.a0
    public static final class a0 {

        @m80.k
        public static final b Companion = new b(null);

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f69353a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f69354b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        public static final /* synthetic */ class a implements j50.p0<a0> {

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public static final a f69355a;

            @m80.k
            private static final h50.f descriptor;

            static {
                a aVar = new a();
                f69355a = aVar;
                j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.TopicResourceModel.TvInfo", aVar, 2);
                l2Var.q("tvPath", false);
                l2Var.q("tvSnapshot", false);
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

            @Override // j50.p0
            @m80.k
            public final f50.i<?>[] f() {
                d3 d3Var = d3.f63348a;
                return new f50.i[]{d3Var, d3Var};
            }

            @Override // f50.e
            @m80.k
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final a0 e(@m80.k i50.f decoder) {
                String str;
                String str2;
                int i11;
                kotlin.jvm.internal.g0.p(decoder, "decoder");
                h50.f fVar = descriptor;
                i50.d beginStructure = decoder.beginStructure(fVar);
                j50.x2 x2Var = null;
                if (beginStructure.decodeSequentially()) {
                    str = beginStructure.decodeStringElement(fVar, 0);
                    str2 = beginStructure.decodeStringElement(fVar, 1);
                    i11 = 3;
                } else {
                    boolean z11 = true;
                    int i12 = 0;
                    str = null;
                    String str3 = null;
                    while (z11) {
                        int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                        if (decodeElementIndex == -1) {
                            z11 = false;
                        } else if (decodeElementIndex == 0) {
                            str = beginStructure.decodeStringElement(fVar, 0);
                            i12 |= 1;
                        } else {
                            if (decodeElementIndex != 1) {
                                throw new UnknownFieldException(decodeElementIndex);
                            }
                            str3 = beginStructure.decodeStringElement(fVar, 1);
                            i12 |= 2;
                        }
                    }
                    str2 = str3;
                    i11 = i12;
                }
                beginStructure.endStructure(fVar);
                return new a0(i11, str, str2, x2Var);
            }

            @Override // f50.b0
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public final void b(@m80.k i50.h encoder, @m80.k a0 value) {
                kotlin.jvm.internal.g0.p(encoder, "encoder");
                kotlin.jvm.internal.g0.p(value, "value");
                h50.f fVar = descriptor;
                i50.e beginStructure = encoder.beginStructure(fVar);
                a0.i(value, beginStructure, fVar);
                beginStructure.endStructure(fVar);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
                this();
            }

            @m80.k
            public final f50.i<a0> serializer() {
                return a.f69355a;
            }

            public b() {
            }
        }

        public /* synthetic */ a0(int i11, String str, String str2, j50.x2 x2Var) {
            if (3 != (i11 & 3)) {
                j50.h2.b(i11, 3, a.f69355a.a());
            }
            this.f69353a = str;
            this.f69354b = str2;
        }

        public static /* synthetic */ a0 d(a0 a0Var, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = a0Var.f69353a;
            }
            if ((i11 & 2) != 0) {
                str2 = a0Var.f69354b;
            }
            return a0Var.c(str, str2);
        }

        @w00.o
        public static final /* synthetic */ void i(a0 a0Var, i50.e eVar, h50.f fVar) {
            eVar.encodeStringElement(fVar, 0, a0Var.f69353a);
            eVar.encodeStringElement(fVar, 1, a0Var.f69354b);
        }

        @m80.k
        public final String a() {
            return this.f69353a;
        }

        @m80.k
        public final String b() {
            return this.f69354b;
        }

        @m80.k
        public final a0 c(@m80.k String tvPath, @m80.k String tvSnapshot) {
            kotlin.jvm.internal.g0.p(tvPath, "tvPath");
            kotlin.jvm.internal.g0.p(tvSnapshot, "tvSnapshot");
            return new a0(tvPath, tvSnapshot);
        }

        @m80.k
        public final String e() {
            return this.f69353a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a0)) {
                return false;
            }
            a0 a0Var = (a0) obj;
            return kotlin.jvm.internal.g0.g(this.f69353a, a0Var.f69353a) && kotlin.jvm.internal.g0.g(this.f69354b, a0Var.f69354b);
        }

        @m80.k
        public final String g() {
            return this.f69354b;
        }

        public int hashCode() {
            return (this.f69353a.hashCode() * 31) + this.f69354b.hashCode();
        }

        @m80.k
        public String toString() {
            return "TvInfo(tvPath=" + this.f69353a + ", tvSnapshot=" + this.f69354b + ')';
        }

        public a0(@m80.k String tvPath, @m80.k String tvSnapshot) {
            kotlin.jvm.internal.g0.p(tvPath, "tvPath");
            kotlin.jvm.internal.g0.p(tvSnapshot, "tvSnapshot");
            this.f69353a = tvPath;
            this.f69354b = tvSnapshot;
        }

        @f50.z("tvPath")
        public static /* synthetic */ void f() {
        }

        @f50.z("tvSnapshot")
        public static /* synthetic */ void h() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @f50.a0
    public static final class b {

        @m80.k
        public static final C0836b Companion = new C0836b(null);

        /* renamed from: j, reason: collision with root package name */
        @w00.g
        @m80.k
        public static final yz.c0<f50.i<Object>>[] f69356j;

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f69357a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f69358b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final List<j> f69359c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final List<j> f69360d;

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final List<c> f69361e;

        /* renamed from: f, reason: collision with root package name */
        @m80.k
        public final List<j> f69362f;

        /* renamed from: g, reason: collision with root package name */
        @m80.k
        public final List<l> f69363g;

        /* renamed from: h, reason: collision with root package name */
        @m80.k
        public final List<l> f69364h;

        /* renamed from: i, reason: collision with root package name */
        @m80.k
        public final List<l> f69365i;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        public static final /* synthetic */ class a implements j50.p0<b> {

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public static final a f69366a;

            @m80.k
            private static final h50.f descriptor;

            static {
                a aVar = new a();
                f69366a = aVar;
                j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.TopicResourceModel.AIData", aVar, 9);
                l2Var.q("audioUS", true);
                l2Var.q("audioUK", true);
                l2Var.q("explains", true);
                l2Var.q("errorTips", true);
                l2Var.q("phrases", true);
                l2Var.q("phraseErrorTips", true);
                l2Var.q("follows", true);
                l2Var.q("wordChecks", true);
                l2Var.q("phraseChecks", true);
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
                yz.c0[] c0VarArr = b.f69356j;
                d3 d3Var = d3.f63348a;
                return new f50.i[]{d3Var, d3Var, c0VarArr[2].getValue(), c0VarArr[3].getValue(), c0VarArr[4].getValue(), c0VarArr[5].getValue(), c0VarArr[6].getValue(), c0VarArr[7].getValue(), c0VarArr[8].getValue()};
            }

            @Override // f50.e
            @m80.k
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final b e(@m80.k i50.f decoder) {
                int i11;
                List list;
                List list2;
                List list3;
                List list4;
                List list5;
                List list6;
                String str;
                String str2;
                List list7;
                kotlin.jvm.internal.g0.p(decoder, "decoder");
                h50.f fVar = descriptor;
                i50.d beginStructure = decoder.beginStructure(fVar);
                yz.c0[] c0VarArr = b.f69356j;
                int i12 = 7;
                int i13 = 6;
                String str3 = null;
                if (beginStructure.decodeSequentially()) {
                    String decodeStringElement = beginStructure.decodeStringElement(fVar, 0);
                    String decodeStringElement2 = beginStructure.decodeStringElement(fVar, 1);
                    List list8 = (List) beginStructure.decodeSerializableElement(fVar, 2, (f50.e) c0VarArr[2].getValue(), null);
                    List list9 = (List) beginStructure.decodeSerializableElement(fVar, 3, (f50.e) c0VarArr[3].getValue(), null);
                    List list10 = (List) beginStructure.decodeSerializableElement(fVar, 4, (f50.e) c0VarArr[4].getValue(), null);
                    List list11 = (List) beginStructure.decodeSerializableElement(fVar, 5, (f50.e) c0VarArr[5].getValue(), null);
                    List list12 = (List) beginStructure.decodeSerializableElement(fVar, 6, (f50.e) c0VarArr[6].getValue(), null);
                    List list13 = (List) beginStructure.decodeSerializableElement(fVar, 7, (f50.e) c0VarArr[7].getValue(), null);
                    list = (List) beginStructure.decodeSerializableElement(fVar, 8, (f50.e) c0VarArr[8].getValue(), null);
                    str = decodeStringElement;
                    list3 = list13;
                    list2 = list12;
                    list4 = list11;
                    list6 = list9;
                    i11 = 511;
                    list5 = list10;
                    list7 = list8;
                    str2 = decodeStringElement2;
                } else {
                    int i14 = 5;
                    int i15 = 3;
                    int i16 = 4;
                    boolean z11 = true;
                    int i17 = 0;
                    List list14 = null;
                    List list15 = null;
                    List list16 = null;
                    List list17 = null;
                    List list18 = null;
                    List list19 = null;
                    String str4 = null;
                    List list20 = null;
                    while (z11) {
                        int i18 = i13;
                        int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                        switch (decodeElementIndex) {
                            case -1:
                                z11 = false;
                                i13 = 6;
                                i15 = 3;
                                i16 = 4;
                                i14 = 5;
                            case 0:
                                i17 |= 1;
                                str3 = beginStructure.decodeStringElement(fVar, 0);
                                i12 = 7;
                                i13 = 6;
                                i15 = 3;
                                i16 = 4;
                                i14 = 5;
                            case 1:
                                str4 = beginStructure.decodeStringElement(fVar, 1);
                                i17 |= 2;
                                i12 = 7;
                                i13 = 6;
                                i15 = 3;
                                i16 = 4;
                                i14 = 5;
                            case 2:
                                list20 = (List) beginStructure.decodeSerializableElement(fVar, 2, (f50.e) c0VarArr[2].getValue(), list20);
                                i17 |= 4;
                                i12 = 7;
                                i13 = 6;
                                i15 = 3;
                                i16 = 4;
                                i14 = 5;
                            case 3:
                                list19 = (List) beginStructure.decodeSerializableElement(fVar, i15, (f50.e) c0VarArr[i15].getValue(), list19);
                                i17 |= 8;
                                i12 = 7;
                                i13 = 6;
                                i16 = 4;
                                i14 = 5;
                            case 4:
                                list18 = (List) beginStructure.decodeSerializableElement(fVar, i16, (f50.e) c0VarArr[i16].getValue(), list18);
                                i17 |= 16;
                                i12 = 7;
                                i13 = 6;
                                i14 = 5;
                            case 5:
                                list17 = (List) beginStructure.decodeSerializableElement(fVar, i14, (f50.e) c0VarArr[i14].getValue(), list17);
                                i17 |= 32;
                                i12 = 7;
                                i13 = 6;
                            case 6:
                                list15 = (List) beginStructure.decodeSerializableElement(fVar, i18, (f50.e) c0VarArr[i18].getValue(), list15);
                                i17 |= 64;
                                i13 = i18;
                                i12 = 7;
                            case 7:
                                list16 = (List) beginStructure.decodeSerializableElement(fVar, i12, (f50.e) c0VarArr[i12].getValue(), list16);
                                i17 |= 128;
                                i13 = i18;
                            case 8:
                                list14 = (List) beginStructure.decodeSerializableElement(fVar, 8, (f50.e) c0VarArr[8].getValue(), list14);
                                i17 |= 256;
                                i13 = i18;
                            default:
                                throw new UnknownFieldException(decodeElementIndex);
                        }
                    }
                    i11 = i17;
                    list = list14;
                    list2 = list15;
                    list3 = list16;
                    list4 = list17;
                    list5 = list18;
                    list6 = list19;
                    str = str3;
                    str2 = str4;
                    list7 = list20;
                }
                beginStructure.endStructure(fVar);
                return new b(i11, str, str2, list7, list6, list5, list4, list2, list3, list, (j50.x2) null);
            }

            @Override // f50.b0
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public final void b(@m80.k i50.h encoder, @m80.k b value) {
                kotlin.jvm.internal.g0.p(encoder, "encoder");
                kotlin.jvm.internal.g0.p(value, "value");
                h50.f fVar = descriptor;
                i50.e beginStructure = encoder.beginStructure(fVar);
                b.S(value, beginStructure, fVar);
                beginStructure.endStructure(fVar);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: l3.i0$b$b, reason: collision with other inner class name */
        public static final class C0836b {
            public /* synthetic */ C0836b(kotlin.jvm.internal.v vVar) {
                this();
            }

            @m80.k
            public final f50.i<b> serializer() {
                return a.f69366a;
            }

            public C0836b() {
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            f69356j = new yz.c0[]{null, null, yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.j0
                @Override // x00.a
                public final Object invoke() {
                    f50.i h11;
                    h11 = i0.b.h();
                    return h11;
                }
            }), yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.k0
                @Override // x00.a
                public final Object invoke() {
                    f50.i i11;
                    i11 = i0.b.i();
                    return i11;
                }
            }), yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.l0
                @Override // x00.a
                public final Object invoke() {
                    f50.i j11;
                    j11 = i0.b.j();
                    return j11;
                }
            }), yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.m0
                @Override // x00.a
                public final Object invoke() {
                    f50.i k11;
                    k11 = i0.b.k();
                    return k11;
                }
            }), yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.n0
                @Override // x00.a
                public final Object invoke() {
                    f50.i l11;
                    l11 = i0.b.l();
                    return l11;
                }
            }), yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.o0
                @Override // x00.a
                public final Object invoke() {
                    f50.i m11;
                    m11 = i0.b.m();
                    return m11;
                }
            }), yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.p0
                @Override // x00.a
                public final Object invoke() {
                    f50.i n11;
                    n11 = i0.b.n();
                    return n11;
                }
            })};
        }

        public b() {
            this((String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, 511, (kotlin.jvm.internal.v) null);
        }

        @w00.o
        public static final /* synthetic */ void S(b bVar, i50.e eVar, h50.f fVar) {
            yz.c0<f50.i<Object>>[] c0VarArr = f69356j;
            if (eVar.shouldEncodeElementDefault(fVar, 0) || !kotlin.jvm.internal.g0.g(bVar.f69357a, "")) {
                eVar.encodeStringElement(fVar, 0, bVar.f69357a);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 1) || !kotlin.jvm.internal.g0.g(bVar.f69358b, "")) {
                eVar.encodeStringElement(fVar, 1, bVar.f69358b);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 2) || !kotlin.jvm.internal.g0.g(bVar.f69359c, a00.h0.J())) {
                eVar.encodeSerializableElement(fVar, 2, c0VarArr[2].getValue(), bVar.f69359c);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 3) || !kotlin.jvm.internal.g0.g(bVar.f69360d, a00.h0.J())) {
                eVar.encodeSerializableElement(fVar, 3, c0VarArr[3].getValue(), bVar.f69360d);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 4) || !kotlin.jvm.internal.g0.g(bVar.f69361e, a00.h0.J())) {
                eVar.encodeSerializableElement(fVar, 4, c0VarArr[4].getValue(), bVar.f69361e);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 5) || !kotlin.jvm.internal.g0.g(bVar.f69362f, a00.h0.J())) {
                eVar.encodeSerializableElement(fVar, 5, c0VarArr[5].getValue(), bVar.f69362f);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 6) || !kotlin.jvm.internal.g0.g(bVar.f69363g, a00.h0.J())) {
                eVar.encodeSerializableElement(fVar, 6, c0VarArr[6].getValue(), bVar.f69363g);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 7) || !kotlin.jvm.internal.g0.g(bVar.f69364h, a00.h0.J())) {
                eVar.encodeSerializableElement(fVar, 7, c0VarArr[7].getValue(), bVar.f69364h);
            }
            if (!eVar.shouldEncodeElementDefault(fVar, 8) && kotlin.jvm.internal.g0.g(bVar.f69365i, a00.h0.J())) {
                return;
            }
            eVar.encodeSerializableElement(fVar, 8, c0VarArr[8].getValue(), bVar.f69365i);
        }

        public static final /* synthetic */ f50.i h() {
            return new j50.f(j.a.f69425a);
        }

        public static final /* synthetic */ f50.i i() {
            return new j50.f(j.a.f69425a);
        }

        public static final /* synthetic */ f50.i j() {
            return new j50.f(c.a.f69380a);
        }

        public static final /* synthetic */ f50.i k() {
            return new j50.f(j.a.f69425a);
        }

        public static final /* synthetic */ f50.i l() {
            return new j50.f(l.a.f69434a);
        }

        public static final /* synthetic */ f50.i m() {
            return new j50.f(l.a.f69434a);
        }

        public static final /* synthetic */ f50.i n() {
            return new j50.f(l.a.f69434a);
        }

        public static /* synthetic */ b z(b bVar, String str, String str2, List list, List list2, List list3, List list4, List list5, List list6, List list7, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = bVar.f69357a;
            }
            if ((i11 & 2) != 0) {
                str2 = bVar.f69358b;
            }
            if ((i11 & 4) != 0) {
                list = bVar.f69359c;
            }
            if ((i11 & 8) != 0) {
                list2 = bVar.f69360d;
            }
            if ((i11 & 16) != 0) {
                list3 = bVar.f69361e;
            }
            if ((i11 & 32) != 0) {
                list4 = bVar.f69362f;
            }
            if ((i11 & 64) != 0) {
                list5 = bVar.f69363g;
            }
            if ((i11 & 128) != 0) {
                list6 = bVar.f69364h;
            }
            if ((i11 & 256) != 0) {
                list7 = bVar.f69365i;
            }
            List list8 = list6;
            List list9 = list7;
            List list10 = list4;
            List list11 = list5;
            List list12 = list3;
            List list13 = list;
            return bVar.y(str, str2, list13, list2, list12, list10, list11, list8, list9);
        }

        @m80.k
        public final String A() {
            return this.f69358b;
        }

        @m80.k
        public final String C() {
            return this.f69357a;
        }

        @m80.k
        public final List<j> E() {
            return this.f69360d;
        }

        @m80.k
        public final List<j> G() {
            return this.f69359c;
        }

        @m80.k
        public final List<l> I() {
            return this.f69363g;
        }

        @m80.k
        public final List<l> K() {
            return this.f69365i;
        }

        @m80.k
        public final List<j> M() {
            return this.f69362f;
        }

        @m80.k
        public final List<c> O() {
            return this.f69361e;
        }

        @m80.k
        public final List<l> Q() {
            return this.f69364h;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.g0.g(this.f69357a, bVar.f69357a) && kotlin.jvm.internal.g0.g(this.f69358b, bVar.f69358b) && kotlin.jvm.internal.g0.g(this.f69359c, bVar.f69359c) && kotlin.jvm.internal.g0.g(this.f69360d, bVar.f69360d) && kotlin.jvm.internal.g0.g(this.f69361e, bVar.f69361e) && kotlin.jvm.internal.g0.g(this.f69362f, bVar.f69362f) && kotlin.jvm.internal.g0.g(this.f69363g, bVar.f69363g) && kotlin.jvm.internal.g0.g(this.f69364h, bVar.f69364h) && kotlin.jvm.internal.g0.g(this.f69365i, bVar.f69365i);
        }

        public int hashCode() {
            return (((((((((((((((this.f69357a.hashCode() * 31) + this.f69358b.hashCode()) * 31) + this.f69359c.hashCode()) * 31) + this.f69360d.hashCode()) * 31) + this.f69361e.hashCode()) * 31) + this.f69362f.hashCode()) * 31) + this.f69363g.hashCode()) * 31) + this.f69364h.hashCode()) * 31) + this.f69365i.hashCode();
        }

        @m80.k
        public final String p() {
            return this.f69357a;
        }

        @m80.k
        public final String q() {
            return this.f69358b;
        }

        @m80.k
        public final List<j> r() {
            return this.f69359c;
        }

        @m80.k
        public final List<j> s() {
            return this.f69360d;
        }

        @m80.k
        public final List<c> t() {
            return this.f69361e;
        }

        @m80.k
        public String toString() {
            return "AIData(audioUS=" + this.f69357a + ", audioUK=" + this.f69358b + ", explains=" + this.f69359c + ", errorTips=" + this.f69360d + ", phrases=" + this.f69361e + ", phraseErrorTips=" + this.f69362f + ", follows=" + this.f69363g + ", wordChecks=" + this.f69364h + ", phraseChecks=" + this.f69365i + ')';
        }

        @m80.k
        public final List<j> u() {
            return this.f69362f;
        }

        @m80.k
        public final List<l> v() {
            return this.f69363g;
        }

        @m80.k
        public final List<l> w() {
            return this.f69364h;
        }

        @m80.k
        public final List<l> x() {
            return this.f69365i;
        }

        @m80.k
        public final b y(@m80.k String audioUS, @m80.k String audioUK, @m80.k List<j> explains, @m80.k List<j> errorTips, @m80.k List<c> phrases, @m80.k List<j> phraseErrorTips, @m80.k List<l> follows, @m80.k List<l> wordChecks, @m80.k List<l> phraseChecks) {
            kotlin.jvm.internal.g0.p(audioUS, "audioUS");
            kotlin.jvm.internal.g0.p(audioUK, "audioUK");
            kotlin.jvm.internal.g0.p(explains, "explains");
            kotlin.jvm.internal.g0.p(errorTips, "errorTips");
            kotlin.jvm.internal.g0.p(phrases, "phrases");
            kotlin.jvm.internal.g0.p(phraseErrorTips, "phraseErrorTips");
            kotlin.jvm.internal.g0.p(follows, "follows");
            kotlin.jvm.internal.g0.p(wordChecks, "wordChecks");
            kotlin.jvm.internal.g0.p(phraseChecks, "phraseChecks");
            return new b(audioUS, audioUK, explains, errorTips, phrases, phraseErrorTips, follows, wordChecks, phraseChecks);
        }

        public /* synthetic */ b(int i11, String str, String str2, List list, List list2, List list3, List list4, List list5, List list6, List list7, j50.x2 x2Var) {
            if ((i11 & 1) == 0) {
                this.f69357a = "";
            } else {
                this.f69357a = str;
            }
            if ((i11 & 2) == 0) {
                this.f69358b = "";
            } else {
                this.f69358b = str2;
            }
            if ((i11 & 4) == 0) {
                this.f69359c = a00.h0.J();
            } else {
                this.f69359c = list;
            }
            if ((i11 & 8) == 0) {
                this.f69360d = a00.h0.J();
            } else {
                this.f69360d = list2;
            }
            if ((i11 & 16) == 0) {
                this.f69361e = a00.h0.J();
            } else {
                this.f69361e = list3;
            }
            if ((i11 & 32) == 0) {
                this.f69362f = a00.h0.J();
            } else {
                this.f69362f = list4;
            }
            if ((i11 & 64) == 0) {
                this.f69363g = a00.h0.J();
            } else {
                this.f69363g = list5;
            }
            if ((i11 & 128) == 0) {
                this.f69364h = a00.h0.J();
            } else {
                this.f69364h = list6;
            }
            if ((i11 & 256) == 0) {
                this.f69365i = a00.h0.J();
            } else {
                this.f69365i = list7;
            }
        }

        public b(@m80.k String audioUS, @m80.k String audioUK, @m80.k List<j> explains, @m80.k List<j> errorTips, @m80.k List<c> phrases, @m80.k List<j> phraseErrorTips, @m80.k List<l> follows, @m80.k List<l> wordChecks, @m80.k List<l> phraseChecks) {
            kotlin.jvm.internal.g0.p(audioUS, "audioUS");
            kotlin.jvm.internal.g0.p(audioUK, "audioUK");
            kotlin.jvm.internal.g0.p(explains, "explains");
            kotlin.jvm.internal.g0.p(errorTips, "errorTips");
            kotlin.jvm.internal.g0.p(phrases, "phrases");
            kotlin.jvm.internal.g0.p(phraseErrorTips, "phraseErrorTips");
            kotlin.jvm.internal.g0.p(follows, "follows");
            kotlin.jvm.internal.g0.p(wordChecks, "wordChecks");
            kotlin.jvm.internal.g0.p(phraseChecks, "phraseChecks");
            this.f69357a = audioUS;
            this.f69358b = audioUK;
            this.f69359c = explains;
            this.f69360d = errorTips;
            this.f69361e = phrases;
            this.f69362f = phraseErrorTips;
            this.f69363g = follows;
            this.f69364h = wordChecks;
            this.f69365i = phraseChecks;
        }

        @f50.z("audioUK")
        public static /* synthetic */ void B() {
        }

        @f50.z("audioUS")
        public static /* synthetic */ void D() {
        }

        @f50.z("errorTips")
        public static /* synthetic */ void F() {
        }

        @f50.z("explains")
        public static /* synthetic */ void H() {
        }

        @f50.z("follows")
        public static /* synthetic */ void J() {
        }

        @f50.z("phraseChecks")
        public static /* synthetic */ void L() {
        }

        @f50.z("phraseErrorTips")
        public static /* synthetic */ void N() {
        }

        @f50.z("phrases")
        public static /* synthetic */ void P() {
        }

        @f50.z("wordChecks")
        public static /* synthetic */ void R() {
        }

        public /* synthetic */ b(String str, String str2, List list, List list2, List list3, List list4, List list5, List list6, List list7, int i11, kotlin.jvm.internal.v vVar) {
            this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? a00.h0.J() : list, (i11 & 8) != 0 ? a00.h0.J() : list2, (i11 & 16) != 0 ? a00.h0.J() : list3, (i11 & 32) != 0 ? a00.h0.J() : list4, (i11 & 64) != 0 ? a00.h0.J() : list5, (i11 & 128) != 0 ? a00.h0.J() : list6, (i11 & 256) != 0 ? a00.h0.J() : list7);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @f50.a0
    public static final class b0 {

        @m80.k
        public static final b Companion = new b(null);

        /* renamed from: a, reason: collision with root package name */
        public final int f69367a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f69368b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        public static final /* synthetic */ class a implements j50.p0<b0> {

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public static final a f69369a;

            @m80.k
            private static final h50.f descriptor;

            static {
                a aVar = new a();
                f69369a = aVar;
                j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.TopicResourceModel.Variant", aVar, 2);
                l2Var.q("type", false);
                l2Var.q("word", false);
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

            @Override // j50.p0
            @m80.k
            public final f50.i<?>[] f() {
                return new f50.i[]{j50.z0.f63517a, d3.f63348a};
            }

            @Override // f50.e
            @m80.k
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final b0 e(@m80.k i50.f decoder) {
                int i11;
                String str;
                int i12;
                kotlin.jvm.internal.g0.p(decoder, "decoder");
                h50.f fVar = descriptor;
                i50.d beginStructure = decoder.beginStructure(fVar);
                j50.x2 x2Var = null;
                if (beginStructure.decodeSequentially()) {
                    i11 = beginStructure.decodeIntElement(fVar, 0);
                    str = beginStructure.decodeStringElement(fVar, 1);
                    i12 = 3;
                } else {
                    boolean z11 = true;
                    i11 = 0;
                    int i13 = 0;
                    String str2 = null;
                    while (z11) {
                        int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                        if (decodeElementIndex == -1) {
                            z11 = false;
                        } else if (decodeElementIndex == 0) {
                            i11 = beginStructure.decodeIntElement(fVar, 0);
                            i13 |= 1;
                        } else {
                            if (decodeElementIndex != 1) {
                                throw new UnknownFieldException(decodeElementIndex);
                            }
                            str2 = beginStructure.decodeStringElement(fVar, 1);
                            i13 |= 2;
                        }
                    }
                    str = str2;
                    i12 = i13;
                }
                beginStructure.endStructure(fVar);
                return new b0(i12, i11, str, x2Var);
            }

            @Override // f50.b0
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public final void b(@m80.k i50.h encoder, @m80.k b0 value) {
                kotlin.jvm.internal.g0.p(encoder, "encoder");
                kotlin.jvm.internal.g0.p(value, "value");
                h50.f fVar = descriptor;
                i50.e beginStructure = encoder.beginStructure(fVar);
                b0.i(value, beginStructure, fVar);
                beginStructure.endStructure(fVar);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
                this();
            }

            @m80.k
            public final f50.i<b0> serializer() {
                return a.f69369a;
            }

            public b() {
            }
        }

        public /* synthetic */ b0(int i11, int i12, String str, j50.x2 x2Var) {
            if (3 != (i11 & 3)) {
                j50.h2.b(i11, 3, a.f69369a.a());
            }
            this.f69367a = i12;
            this.f69368b = str;
        }

        public static /* synthetic */ b0 d(b0 b0Var, int i11, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = b0Var.f69367a;
            }
            if ((i12 & 2) != 0) {
                str = b0Var.f69368b;
            }
            return b0Var.c(i11, str);
        }

        @w00.o
        public static final /* synthetic */ void i(b0 b0Var, i50.e eVar, h50.f fVar) {
            eVar.encodeIntElement(fVar, 0, b0Var.f69367a);
            eVar.encodeStringElement(fVar, 1, b0Var.f69368b);
        }

        public final int a() {
            return this.f69367a;
        }

        @m80.k
        public final String b() {
            return this.f69368b;
        }

        @m80.k
        public final b0 c(int i11, @m80.k String word) {
            kotlin.jvm.internal.g0.p(word, "word");
            return new b0(i11, word);
        }

        public final int e() {
            return this.f69367a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b0)) {
                return false;
            }
            b0 b0Var = (b0) obj;
            return this.f69367a == b0Var.f69367a && kotlin.jvm.internal.g0.g(this.f69368b, b0Var.f69368b);
        }

        @m80.k
        public final String g() {
            return this.f69368b;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f69367a) * 31) + this.f69368b.hashCode();
        }

        @m80.k
        public String toString() {
            return "Variant(type=" + this.f69367a + ", word=" + this.f69368b + ')';
        }

        public b0(int i11, @m80.k String word) {
            kotlin.jvm.internal.g0.p(word, "word");
            this.f69367a = i11;
            this.f69368b = word;
        }

        @f50.z("type")
        public static /* synthetic */ void f() {
        }

        @f50.z("word")
        public static /* synthetic */ void h() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @f50.a0
    public static final class c {

        @m80.k
        public static final b Companion = new b(null);

        /* renamed from: j, reason: collision with root package name */
        @w00.g
        @m80.k
        public static final yz.c0<f50.i<Object>>[] f69370j = {null, null, null, null, null, null, null, null, yz.e0.b(LazyThreadSafetyMode.PUBLICATION, new x00.a() { // from class: l3.q0
            @Override // x00.a
            public final Object invoke() {
                f50.i b11;
                b11 = i0.c.b();
                return b11;
            }
        })};

        /* renamed from: a, reason: collision with root package name */
        public final long f69371a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f69372b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final String f69373c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final String f69374d;

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final String f69375e;

        /* renamed from: f, reason: collision with root package name */
        @m80.k
        public final String f69376f;

        /* renamed from: g, reason: collision with root package name */
        @m80.k
        public final String f69377g;

        /* renamed from: h, reason: collision with root package name */
        @m80.k
        public final String f69378h;

        /* renamed from: i, reason: collision with root package name */
        @m80.k
        public final List<Long> f69379i;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        public static final /* synthetic */ class a implements j50.p0<c> {

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public static final a f69380a;

            @m80.k
            private static final h50.f descriptor;

            static {
                a aVar = new a();
                f69380a = aVar;
                j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.TopicResourceModel.AiPhrase", aVar, 9);
                l2Var.q("id", true);
                l2Var.q(com.baicizhan.main.wikiv2.studyv2.data.t.f26100b, true);
                l2Var.q(com.baicizhan.main.wikiv2.studyv2.data.t.f26099a, true);
                l2Var.q("audioUS", true);
                l2Var.q("audioUK", true);
                l2Var.q("accentUS", true);
                l2Var.q("accentUK", true);
                l2Var.q("pic", true);
                l2Var.q("errorTipIds", true);
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
                yz.c0[] c0VarArr = c.f69370j;
                d3 d3Var = d3.f63348a;
                return new f50.i[]{j50.l1.f63406a, d3Var, d3Var, d3Var, d3Var, d3Var, d3Var, d3Var, c0VarArr[8].getValue()};
            }

            @Override // f50.e
            @m80.k
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final c e(@m80.k i50.f decoder) {
                int i11;
                List list;
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                String str7;
                long j11;
                kotlin.jvm.internal.g0.p(decoder, "decoder");
                h50.f fVar = descriptor;
                i50.d beginStructure = decoder.beginStructure(fVar);
                yz.c0[] c0VarArr = c.f69370j;
                int i12 = 7;
                String str8 = null;
                if (beginStructure.decodeSequentially()) {
                    long decodeLongElement = beginStructure.decodeLongElement(fVar, 0);
                    String decodeStringElement = beginStructure.decodeStringElement(fVar, 1);
                    String decodeStringElement2 = beginStructure.decodeStringElement(fVar, 2);
                    String decodeStringElement3 = beginStructure.decodeStringElement(fVar, 3);
                    String decodeStringElement4 = beginStructure.decodeStringElement(fVar, 4);
                    String decodeStringElement5 = beginStructure.decodeStringElement(fVar, 5);
                    String decodeStringElement6 = beginStructure.decodeStringElement(fVar, 6);
                    String decodeStringElement7 = beginStructure.decodeStringElement(fVar, 7);
                    list = (List) beginStructure.decodeSerializableElement(fVar, 8, (f50.e) c0VarArr[8].getValue(), null);
                    str = decodeStringElement;
                    str7 = decodeStringElement7;
                    str6 = decodeStringElement6;
                    str5 = decodeStringElement5;
                    str3 = decodeStringElement3;
                    str4 = decodeStringElement4;
                    str2 = decodeStringElement2;
                    i11 = 511;
                    j11 = decodeLongElement;
                } else {
                    boolean z11 = true;
                    int i13 = 0;
                    List list2 = null;
                    String str9 = null;
                    String str10 = null;
                    String str11 = null;
                    String str12 = null;
                    long j12 = 0;
                    String str13 = null;
                    String str14 = null;
                    while (z11) {
                        int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                        switch (decodeElementIndex) {
                            case -1:
                                z11 = false;
                                i12 = 7;
                            case 0:
                                j12 = beginStructure.decodeLongElement(fVar, 0);
                                i13 |= 1;
                                i12 = 7;
                            case 1:
                                str8 = beginStructure.decodeStringElement(fVar, 1);
                                i13 |= 2;
                            case 2:
                                str13 = beginStructure.decodeStringElement(fVar, 2);
                                i13 |= 4;
                            case 3:
                                str14 = beginStructure.decodeStringElement(fVar, 3);
                                i13 |= 8;
                            case 4:
                                str9 = beginStructure.decodeStringElement(fVar, 4);
                                i13 |= 16;
                            case 5:
                                str10 = beginStructure.decodeStringElement(fVar, 5);
                                i13 |= 32;
                            case 6:
                                str11 = beginStructure.decodeStringElement(fVar, 6);
                                i13 |= 64;
                            case 7:
                                str12 = beginStructure.decodeStringElement(fVar, i12);
                                i13 |= 128;
                            case 8:
                                list2 = (List) beginStructure.decodeSerializableElement(fVar, 8, (f50.e) c0VarArr[8].getValue(), list2);
                                i13 |= 256;
                            default:
                                throw new UnknownFieldException(decodeElementIndex);
                        }
                    }
                    i11 = i13;
                    list = list2;
                    str = str8;
                    str2 = str13;
                    str3 = str14;
                    str4 = str9;
                    str5 = str10;
                    str6 = str11;
                    str7 = str12;
                    j11 = j12;
                }
                beginStructure.endStructure(fVar);
                return new c(i11, j11, str, str2, str3, str4, str5, str6, str7, list, (j50.x2) null);
            }

            @Override // f50.b0
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public final void b(@m80.k i50.h encoder, @m80.k c value) {
                kotlin.jvm.internal.g0.p(encoder, "encoder");
                kotlin.jvm.internal.g0.p(value, "value");
                h50.f fVar = descriptor;
                i50.e beginStructure = encoder.beginStructure(fVar);
                c.G(value, beginStructure, fVar);
                beginStructure.endStructure(fVar);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
                this();
            }

            @m80.k
            public final f50.i<c> serializer() {
                return a.f69380a;
            }

            public b() {
            }
        }

        public c() {
            this(0L, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 511, (kotlin.jvm.internal.v) null);
        }

        @w00.o
        public static final /* synthetic */ void G(c cVar, i50.e eVar, h50.f fVar) {
            yz.c0<f50.i<Object>>[] c0VarArr = f69370j;
            if (eVar.shouldEncodeElementDefault(fVar, 0) || cVar.f69371a != 0) {
                eVar.encodeLongElement(fVar, 0, cVar.f69371a);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 1) || !kotlin.jvm.internal.g0.g(cVar.f69372b, "")) {
                eVar.encodeStringElement(fVar, 1, cVar.f69372b);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 2) || !kotlin.jvm.internal.g0.g(cVar.f69373c, "")) {
                eVar.encodeStringElement(fVar, 2, cVar.f69373c);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 3) || !kotlin.jvm.internal.g0.g(cVar.f69374d, "")) {
                eVar.encodeStringElement(fVar, 3, cVar.f69374d);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 4) || !kotlin.jvm.internal.g0.g(cVar.f69375e, "")) {
                eVar.encodeStringElement(fVar, 4, cVar.f69375e);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 5) || !kotlin.jvm.internal.g0.g(cVar.f69376f, "")) {
                eVar.encodeStringElement(fVar, 5, cVar.f69376f);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 6) || !kotlin.jvm.internal.g0.g(cVar.f69377g, "")) {
                eVar.encodeStringElement(fVar, 6, cVar.f69377g);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 7) || !kotlin.jvm.internal.g0.g(cVar.f69378h, "")) {
                eVar.encodeStringElement(fVar, 7, cVar.f69378h);
            }
            if (!eVar.shouldEncodeElementDefault(fVar, 8) && kotlin.jvm.internal.g0.g(cVar.f69379i, a00.h0.J())) {
                return;
            }
            eVar.encodeSerializableElement(fVar, 8, c0VarArr[8].getValue(), cVar.f69379i);
        }

        public static final /* synthetic */ f50.i b() {
            return new j50.f(j50.l1.f63406a);
        }

        public static /* synthetic */ c n(c cVar, long j11, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j11 = cVar.f69371a;
            }
            long j12 = j11;
            if ((i11 & 2) != 0) {
                str = cVar.f69372b;
            }
            String str8 = str;
            if ((i11 & 4) != 0) {
                str2 = cVar.f69373c;
            }
            return cVar.m(j12, str8, str2, (i11 & 8) != 0 ? cVar.f69374d : str3, (i11 & 16) != 0 ? cVar.f69375e : str4, (i11 & 32) != 0 ? cVar.f69376f : str5, (i11 & 64) != 0 ? cVar.f69377g : str6, (i11 & 128) != 0 ? cVar.f69378h : str7, (i11 & 256) != 0 ? cVar.f69379i : list);
        }

        @m80.k
        public final String A() {
            return this.f69373c;
        }

        @m80.k
        public final String C() {
            return this.f69372b;
        }

        @m80.k
        public final String E() {
            return this.f69378h;
        }

        public final long d() {
            return this.f69371a;
        }

        @m80.k
        public final String e() {
            return this.f69372b;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f69371a == cVar.f69371a && kotlin.jvm.internal.g0.g(this.f69372b, cVar.f69372b) && kotlin.jvm.internal.g0.g(this.f69373c, cVar.f69373c) && kotlin.jvm.internal.g0.g(this.f69374d, cVar.f69374d) && kotlin.jvm.internal.g0.g(this.f69375e, cVar.f69375e) && kotlin.jvm.internal.g0.g(this.f69376f, cVar.f69376f) && kotlin.jvm.internal.g0.g(this.f69377g, cVar.f69377g) && kotlin.jvm.internal.g0.g(this.f69378h, cVar.f69378h) && kotlin.jvm.internal.g0.g(this.f69379i, cVar.f69379i);
        }

        @m80.k
        public final String f() {
            return this.f69373c;
        }

        @m80.k
        public final String g() {
            return this.f69374d;
        }

        @m80.k
        public final String h() {
            return this.f69375e;
        }

        public int hashCode() {
            return (((((((((((((((Long.hashCode(this.f69371a) * 31) + this.f69372b.hashCode()) * 31) + this.f69373c.hashCode()) * 31) + this.f69374d.hashCode()) * 31) + this.f69375e.hashCode()) * 31) + this.f69376f.hashCode()) * 31) + this.f69377g.hashCode()) * 31) + this.f69378h.hashCode()) * 31) + this.f69379i.hashCode();
        }

        @m80.k
        public final String i() {
            return this.f69376f;
        }

        @m80.k
        public final String j() {
            return this.f69377g;
        }

        @m80.k
        public final String k() {
            return this.f69378h;
        }

        @m80.k
        public final List<Long> l() {
            return this.f69379i;
        }

        @m80.k
        public final c m(long j11, @m80.k String phrase, @m80.k String mean, @m80.k String audioUS, @m80.k String audioUK, @m80.k String accentUS, @m80.k String accentUK, @m80.k String pic, @m80.k List<Long> errorTipIds) {
            kotlin.jvm.internal.g0.p(phrase, "phrase");
            kotlin.jvm.internal.g0.p(mean, "mean");
            kotlin.jvm.internal.g0.p(audioUS, "audioUS");
            kotlin.jvm.internal.g0.p(audioUK, "audioUK");
            kotlin.jvm.internal.g0.p(accentUS, "accentUS");
            kotlin.jvm.internal.g0.p(accentUK, "accentUK");
            kotlin.jvm.internal.g0.p(pic, "pic");
            kotlin.jvm.internal.g0.p(errorTipIds, "errorTipIds");
            return new c(j11, phrase, mean, audioUS, audioUK, accentUS, accentUK, pic, errorTipIds);
        }

        @m80.k
        public final String o() {
            return this.f69377g;
        }

        @m80.k
        public final String q() {
            return this.f69376f;
        }

        @m80.k
        public final String s() {
            return this.f69375e;
        }

        @m80.k
        public String toString() {
            return "AiPhrase(id=" + this.f69371a + ", phrase=" + this.f69372b + ", mean=" + this.f69373c + ", audioUS=" + this.f69374d + ", audioUK=" + this.f69375e + ", accentUS=" + this.f69376f + ", accentUK=" + this.f69377g + ", pic=" + this.f69378h + ", errorTipIds=" + this.f69379i + ')';
        }

        @m80.k
        public final String u() {
            return this.f69374d;
        }

        @m80.k
        public final List<Long> w() {
            return this.f69379i;
        }

        public final long y() {
            return this.f69371a;
        }

        public /* synthetic */ c(int i11, long j11, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, j50.x2 x2Var) {
            this.f69371a = (i11 & 1) == 0 ? 0L : j11;
            if ((i11 & 2) == 0) {
                this.f69372b = "";
            } else {
                this.f69372b = str;
            }
            if ((i11 & 4) == 0) {
                this.f69373c = "";
            } else {
                this.f69373c = str2;
            }
            if ((i11 & 8) == 0) {
                this.f69374d = "";
            } else {
                this.f69374d = str3;
            }
            if ((i11 & 16) == 0) {
                this.f69375e = "";
            } else {
                this.f69375e = str4;
            }
            if ((i11 & 32) == 0) {
                this.f69376f = "";
            } else {
                this.f69376f = str5;
            }
            if ((i11 & 64) == 0) {
                this.f69377g = "";
            } else {
                this.f69377g = str6;
            }
            if ((i11 & 128) == 0) {
                this.f69378h = "";
            } else {
                this.f69378h = str7;
            }
            if ((i11 & 256) == 0) {
                this.f69379i = a00.h0.J();
            } else {
                this.f69379i = list;
            }
        }

        public c(long j11, @m80.k String phrase, @m80.k String mean, @m80.k String audioUS, @m80.k String audioUK, @m80.k String accentUS, @m80.k String accentUK, @m80.k String pic, @m80.k List<Long> errorTipIds) {
            kotlin.jvm.internal.g0.p(phrase, "phrase");
            kotlin.jvm.internal.g0.p(mean, "mean");
            kotlin.jvm.internal.g0.p(audioUS, "audioUS");
            kotlin.jvm.internal.g0.p(audioUK, "audioUK");
            kotlin.jvm.internal.g0.p(accentUS, "accentUS");
            kotlin.jvm.internal.g0.p(accentUK, "accentUK");
            kotlin.jvm.internal.g0.p(pic, "pic");
            kotlin.jvm.internal.g0.p(errorTipIds, "errorTipIds");
            this.f69371a = j11;
            this.f69372b = phrase;
            this.f69373c = mean;
            this.f69374d = audioUS;
            this.f69375e = audioUK;
            this.f69376f = accentUS;
            this.f69377g = accentUK;
            this.f69378h = pic;
            this.f69379i = errorTipIds;
        }

        public /* synthetic */ c(long j11, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, int i11, kotlin.jvm.internal.v vVar) {
            this((i11 & 1) != 0 ? 0L : j11, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? "" : str2, (i11 & 8) != 0 ? "" : str3, (i11 & 16) != 0 ? "" : str4, (i11 & 32) != 0 ? "" : str5, (i11 & 64) != 0 ? "" : str6, (i11 & 128) != 0 ? "" : str7, (i11 & 256) != 0 ? a00.h0.J() : list);
        }

        @f50.z(com.baicizhan.main.wikiv2.studyv2.data.t.f26099a)
        public static /* synthetic */ void B() {
        }

        @f50.z(com.baicizhan.main.wikiv2.studyv2.data.t.f26100b)
        public static /* synthetic */ void D() {
        }

        @f50.z("pic")
        public static /* synthetic */ void F() {
        }

        @f50.z("accentUK")
        public static /* synthetic */ void p() {
        }

        @f50.z("accentUS")
        public static /* synthetic */ void r() {
        }

        @f50.z("audioUK")
        public static /* synthetic */ void t() {
        }

        @f50.z("audioUS")
        public static /* synthetic */ void v() {
        }

        @f50.z("errorTipIds")
        public static /* synthetic */ void x() {
        }

        @f50.z("id")
        public static /* synthetic */ void z() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @f50.a0
    public static final class c0 {

        @m80.k
        public static final b Companion = new b(null);

        /* renamed from: a, reason: collision with root package name */
        public final int f69381a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f69382b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final String f69383c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final String f69384d;

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final String f69385e;

        /* renamed from: f, reason: collision with root package name */
        @m80.k
        public final String f69386f;

        /* renamed from: g, reason: collision with root package name */
        public final int f69387g;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        public static final /* synthetic */ class a implements j50.p0<c0> {

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public static final a f69388a;

            @m80.k
            private static final h50.f descriptor;

            static {
                a aVar = new a();
                f69388a = aVar;
                j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.TopicResourceModel.WordInfo", aVar, 7);
                l2Var.q("topicId", false);
                l2Var.q("word", false);
                l2Var.q("accentUs", false);
                l2Var.q("accentUk", false);
                l2Var.q("audioUs", false);
                l2Var.q("audioUk", false);
                l2Var.q("wordType", true);
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

            @Override // j50.p0
            @m80.k
            public final f50.i<?>[] f() {
                j50.z0 z0Var = j50.z0.f63517a;
                d3 d3Var = d3.f63348a;
                return new f50.i[]{z0Var, d3Var, d3Var, d3Var, d3Var, d3Var, z0Var};
            }

            @Override // f50.e
            @m80.k
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final c0 e(@m80.k i50.f decoder) {
                int i11;
                int i12;
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                int i13;
                kotlin.jvm.internal.g0.p(decoder, "decoder");
                h50.f fVar = descriptor;
                i50.d beginStructure = decoder.beginStructure(fVar);
                if (beginStructure.decodeSequentially()) {
                    i11 = beginStructure.decodeIntElement(fVar, 0);
                    String decodeStringElement = beginStructure.decodeStringElement(fVar, 1);
                    String decodeStringElement2 = beginStructure.decodeStringElement(fVar, 2);
                    String decodeStringElement3 = beginStructure.decodeStringElement(fVar, 3);
                    String decodeStringElement4 = beginStructure.decodeStringElement(fVar, 4);
                    String decodeStringElement5 = beginStructure.decodeStringElement(fVar, 5);
                    i12 = beginStructure.decodeIntElement(fVar, 6);
                    str = decodeStringElement5;
                    str2 = decodeStringElement3;
                    str3 = decodeStringElement4;
                    str4 = decodeStringElement2;
                    str5 = decodeStringElement;
                    i13 = 127;
                } else {
                    String str6 = null;
                    String str7 = null;
                    String str8 = null;
                    String str9 = null;
                    String str10 = null;
                    boolean z11 = true;
                    i11 = 0;
                    int i14 = 0;
                    int i15 = 0;
                    while (z11) {
                        int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                        switch (decodeElementIndex) {
                            case -1:
                                z11 = false;
                                continue;
                            case 0:
                                i11 = beginStructure.decodeIntElement(fVar, 0);
                                i15 |= 1;
                                continue;
                            case 1:
                                str10 = beginStructure.decodeStringElement(fVar, 1);
                                i15 |= 2;
                                break;
                            case 2:
                                str9 = beginStructure.decodeStringElement(fVar, 2);
                                i15 |= 4;
                                break;
                            case 3:
                                str7 = beginStructure.decodeStringElement(fVar, 3);
                                i15 |= 8;
                                break;
                            case 4:
                                str8 = beginStructure.decodeStringElement(fVar, 4);
                                i15 |= 16;
                                break;
                            case 5:
                                str6 = beginStructure.decodeStringElement(fVar, 5);
                                i15 |= 32;
                                break;
                            case 6:
                                i14 = beginStructure.decodeIntElement(fVar, 6);
                                i15 |= 64;
                                break;
                            default:
                                throw new UnknownFieldException(decodeElementIndex);
                        }
                    }
                    i12 = i14;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    str4 = str9;
                    str5 = str10;
                    i13 = i15;
                }
                int i16 = i11;
                beginStructure.endStructure(fVar);
                return new c0(i13, i16, str5, str4, str2, str3, str, i12, (j50.x2) null);
            }

            @Override // f50.b0
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public final void b(@m80.k i50.h encoder, @m80.k c0 value) {
                kotlin.jvm.internal.g0.p(encoder, "encoder");
                kotlin.jvm.internal.g0.p(value, "value");
                h50.f fVar = descriptor;
                i50.e beginStructure = encoder.beginStructure(fVar);
                c0.x(value, beginStructure, fVar);
                beginStructure.endStructure(fVar);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
                this();
            }

            @m80.k
            public final f50.i<c0> serializer() {
                return a.f69388a;
            }

            public b() {
            }
        }

        public /* synthetic */ c0(int i11, int i12, String str, String str2, String str3, String str4, String str5, int i13, j50.x2 x2Var) {
            if (63 != (i11 & 63)) {
                j50.h2.b(i11, 63, a.f69388a.a());
            }
            this.f69381a = i12;
            this.f69382b = str;
            this.f69383c = str2;
            this.f69384d = str3;
            this.f69385e = str4;
            this.f69386f = str5;
            if ((i11 & 64) == 0) {
                this.f69387g = 0;
            } else {
                this.f69387g = i13;
            }
        }

        public static /* synthetic */ c0 i(c0 c0Var, int i11, String str, String str2, String str3, String str4, String str5, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = c0Var.f69381a;
            }
            if ((i13 & 2) != 0) {
                str = c0Var.f69382b;
            }
            if ((i13 & 4) != 0) {
                str2 = c0Var.f69383c;
            }
            if ((i13 & 8) != 0) {
                str3 = c0Var.f69384d;
            }
            if ((i13 & 16) != 0) {
                str4 = c0Var.f69385e;
            }
            if ((i13 & 32) != 0) {
                str5 = c0Var.f69386f;
            }
            if ((i13 & 64) != 0) {
                i12 = c0Var.f69387g;
            }
            String str6 = str5;
            int i14 = i12;
            String str7 = str4;
            String str8 = str2;
            return c0Var.h(i11, str, str8, str3, str7, str6, i14);
        }

        @w00.o
        public static final /* synthetic */ void x(c0 c0Var, i50.e eVar, h50.f fVar) {
            eVar.encodeIntElement(fVar, 0, c0Var.f69381a);
            eVar.encodeStringElement(fVar, 1, c0Var.f69382b);
            eVar.encodeStringElement(fVar, 2, c0Var.f69383c);
            eVar.encodeStringElement(fVar, 3, c0Var.f69384d);
            eVar.encodeStringElement(fVar, 4, c0Var.f69385e);
            eVar.encodeStringElement(fVar, 5, c0Var.f69386f);
            if (!eVar.shouldEncodeElementDefault(fVar, 6) && c0Var.f69387g == 0) {
                return;
            }
            eVar.encodeIntElement(fVar, 6, c0Var.f69387g);
        }

        public final int a() {
            return this.f69381a;
        }

        @m80.k
        public final String b() {
            return this.f69382b;
        }

        @m80.k
        public final String c() {
            return this.f69383c;
        }

        @m80.k
        public final String d() {
            return this.f69384d;
        }

        @m80.k
        public final String e() {
            return this.f69385e;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c0)) {
                return false;
            }
            c0 c0Var = (c0) obj;
            return this.f69381a == c0Var.f69381a && kotlin.jvm.internal.g0.g(this.f69382b, c0Var.f69382b) && kotlin.jvm.internal.g0.g(this.f69383c, c0Var.f69383c) && kotlin.jvm.internal.g0.g(this.f69384d, c0Var.f69384d) && kotlin.jvm.internal.g0.g(this.f69385e, c0Var.f69385e) && kotlin.jvm.internal.g0.g(this.f69386f, c0Var.f69386f) && this.f69387g == c0Var.f69387g;
        }

        @m80.k
        public final String f() {
            return this.f69386f;
        }

        public final int g() {
            return this.f69387g;
        }

        @m80.k
        public final c0 h(int i11, @m80.k String word, @m80.k String accentUs, @m80.k String accentUk, @m80.k String audioUs, @m80.k String audioUk, int i12) {
            kotlin.jvm.internal.g0.p(word, "word");
            kotlin.jvm.internal.g0.p(accentUs, "accentUs");
            kotlin.jvm.internal.g0.p(accentUk, "accentUk");
            kotlin.jvm.internal.g0.p(audioUs, "audioUs");
            kotlin.jvm.internal.g0.p(audioUk, "audioUk");
            return new c0(i11, word, accentUs, accentUk, audioUs, audioUk, i12);
        }

        public int hashCode() {
            return (((((((((((Integer.hashCode(this.f69381a) * 31) + this.f69382b.hashCode()) * 31) + this.f69383c.hashCode()) * 31) + this.f69384d.hashCode()) * 31) + this.f69385e.hashCode()) * 31) + this.f69386f.hashCode()) * 31) + Integer.hashCode(this.f69387g);
        }

        @m80.k
        public final String j() {
            return this.f69384d;
        }

        @m80.k
        public final String l() {
            return this.f69383c;
        }

        @m80.k
        public final String n() {
            return this.f69386f;
        }

        @m80.k
        public final String p() {
            return this.f69385e;
        }

        public final int r() {
            return this.f69381a;
        }

        @m80.k
        public final String t() {
            return this.f69382b;
        }

        @m80.k
        public String toString() {
            return "WordInfo(topicId=" + this.f69381a + ", word=" + this.f69382b + ", accentUs=" + this.f69383c + ", accentUk=" + this.f69384d + ", audioUs=" + this.f69385e + ", audioUk=" + this.f69386f + ", wordType=" + this.f69387g + ')';
        }

        public final int v() {
            return this.f69387g;
        }

        public c0(int i11, @m80.k String word, @m80.k String accentUs, @m80.k String accentUk, @m80.k String audioUs, @m80.k String audioUk, int i12) {
            kotlin.jvm.internal.g0.p(word, "word");
            kotlin.jvm.internal.g0.p(accentUs, "accentUs");
            kotlin.jvm.internal.g0.p(accentUk, "accentUk");
            kotlin.jvm.internal.g0.p(audioUs, "audioUs");
            kotlin.jvm.internal.g0.p(audioUk, "audioUk");
            this.f69381a = i11;
            this.f69382b = word;
            this.f69383c = accentUs;
            this.f69384d = accentUk;
            this.f69385e = audioUs;
            this.f69386f = audioUk;
            this.f69387g = i12;
        }

        public /* synthetic */ c0(int i11, String str, String str2, String str3, String str4, String str5, int i12, int i13, kotlin.jvm.internal.v vVar) {
            this(i11, str, str2, str3, str4, str5, (i13 & 64) != 0 ? 0 : i12);
        }

        @f50.z("accentUk")
        public static /* synthetic */ void k() {
        }

        @f50.z("accentUs")
        public static /* synthetic */ void m() {
        }

        @f50.z("audioUk")
        public static /* synthetic */ void o() {
        }

        @f50.z("audioUs")
        public static /* synthetic */ void q() {
        }

        @f50.z("topicId")
        public static /* synthetic */ void s() {
        }

        @f50.z("word")
        public static /* synthetic */ void u() {
        }

        @f50.z("wordType")
        public static /* synthetic */ void w() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @f50.a0
    public static final class d {

        @m80.k
        public static final b Companion = new b(null);

        /* renamed from: k, reason: collision with root package name */
        @w00.g
        @m80.k
        public static final yz.c0<f50.i<Object>>[] f69389k;

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f69390a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f69391b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final List<String> f69392c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final List<String> f69393d;

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final String f69394e;

        /* renamed from: f, reason: collision with root package name */
        @m80.k
        public final List<o> f69395f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public final q f69396g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public final List<String> f69397h;

        /* renamed from: i, reason: collision with root package name */
        @m80.k
        public final String f69398i;

        /* renamed from: j, reason: collision with root package name */
        @m80.l
        public final v f69399j;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        public static final /* synthetic */ class a implements j50.p0<d> {

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public static final a f69400a;

            @m80.k
            private static final h50.f descriptor;

            static {
                a aVar = new a();
                f69400a = aVar;
                j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.TopicResourceModel.AllInOneCakePack", aVar, 10);
                l2Var.q(com.baicizhan.main.wikiv2.studyv2.data.t.f26099a, true);
                l2Var.q("meanAudio", true);
                l2Var.q("imgs", true);
                l2Var.q("imgOptions", true);
                l2Var.q("contrastImg", true);
                l2Var.q("meanOptions", true);
                l2Var.q("phonics", true);
                l2Var.q("chunkOptions", true);
                l2Var.q("wordAudio", true);
                l2Var.q("selectChunk", true);
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
                yz.c0[] c0VarArr = d.f69389k;
                d3 d3Var = d3.f63348a;
                return new f50.i[]{d3Var, d3Var, c0VarArr[2].getValue(), c0VarArr[3].getValue(), d3Var, c0VarArr[5].getValue(), g50.a.v(q.a.f69470a), g50.a.v((f50.i) c0VarArr[7].getValue()), d3Var, g50.a.v(v.a.f69506a)};
            }

            @Override // f50.e
            @m80.k
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final d e(@m80.k i50.f decoder) {
                int i11;
                List list;
                v vVar;
                q qVar;
                List list2;
                List list3;
                List list4;
                String str;
                String str2;
                String str3;
                String str4;
                kotlin.jvm.internal.g0.p(decoder, "decoder");
                h50.f fVar = descriptor;
                i50.d beginStructure = decoder.beginStructure(fVar);
                yz.c0[] c0VarArr = d.f69389k;
                int i12 = 9;
                String str5 = null;
                if (beginStructure.decodeSequentially()) {
                    String decodeStringElement = beginStructure.decodeStringElement(fVar, 0);
                    String decodeStringElement2 = beginStructure.decodeStringElement(fVar, 1);
                    List list5 = (List) beginStructure.decodeSerializableElement(fVar, 2, (f50.e) c0VarArr[2].getValue(), null);
                    List list6 = (List) beginStructure.decodeSerializableElement(fVar, 3, (f50.e) c0VarArr[3].getValue(), null);
                    String decodeStringElement3 = beginStructure.decodeStringElement(fVar, 4);
                    List list7 = (List) beginStructure.decodeSerializableElement(fVar, 5, (f50.e) c0VarArr[5].getValue(), null);
                    q qVar2 = (q) beginStructure.decodeNullableSerializableElement(fVar, 6, q.a.f69470a, null);
                    List list8 = (List) beginStructure.decodeNullableSerializableElement(fVar, 7, (f50.e) c0VarArr[7].getValue(), null);
                    String decodeStringElement4 = beginStructure.decodeStringElement(fVar, 8);
                    list = list8;
                    str = decodeStringElement;
                    vVar = (v) beginStructure.decodeNullableSerializableElement(fVar, 9, v.a.f69506a, null);
                    qVar = qVar2;
                    str4 = decodeStringElement4;
                    str3 = decodeStringElement3;
                    i11 = 1023;
                    list2 = list7;
                    list3 = list6;
                    list4 = list5;
                    str2 = decodeStringElement2;
                } else {
                    int i13 = 5;
                    int i14 = 3;
                    boolean z11 = true;
                    int i15 = 0;
                    List list9 = null;
                    v vVar2 = null;
                    q qVar3 = null;
                    List list10 = null;
                    List list11 = null;
                    List list12 = null;
                    String str6 = null;
                    String str7 = null;
                    String str8 = null;
                    while (z11) {
                        int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                        switch (decodeElementIndex) {
                            case -1:
                                z11 = false;
                                i12 = 9;
                                i14 = 3;
                                i13 = 5;
                            case 0:
                                i15 |= 1;
                                str5 = beginStructure.decodeStringElement(fVar, 0);
                                i12 = 9;
                                i14 = 3;
                                i13 = 5;
                            case 1:
                                str6 = beginStructure.decodeStringElement(fVar, 1);
                                i15 |= 2;
                                i12 = 9;
                                i14 = 3;
                                i13 = 5;
                            case 2:
                                list12 = (List) beginStructure.decodeSerializableElement(fVar, 2, (f50.e) c0VarArr[2].getValue(), list12);
                                i15 |= 4;
                                i12 = 9;
                                i14 = 3;
                                i13 = 5;
                            case 3:
                                list11 = (List) beginStructure.decodeSerializableElement(fVar, i14, (f50.e) c0VarArr[i14].getValue(), list11);
                                i15 |= 8;
                                i12 = 9;
                                i13 = 5;
                            case 4:
                                str7 = beginStructure.decodeStringElement(fVar, 4);
                                i15 |= 16;
                                i12 = 9;
                            case 5:
                                list10 = (List) beginStructure.decodeSerializableElement(fVar, i13, (f50.e) c0VarArr[i13].getValue(), list10);
                                i15 |= 32;
                                i12 = 9;
                            case 6:
                                qVar3 = (q) beginStructure.decodeNullableSerializableElement(fVar, 6, q.a.f69470a, qVar3);
                                i15 |= 64;
                                i12 = 9;
                            case 7:
                                list9 = (List) beginStructure.decodeNullableSerializableElement(fVar, 7, (f50.e) c0VarArr[7].getValue(), list9);
                                i15 |= 128;
                            case 8:
                                str8 = beginStructure.decodeStringElement(fVar, 8);
                                i15 |= 256;
                            case 9:
                                vVar2 = (v) beginStructure.decodeNullableSerializableElement(fVar, i12, v.a.f69506a, vVar2);
                                i15 |= 512;
                            default:
                                throw new UnknownFieldException(decodeElementIndex);
                        }
                    }
                    i11 = i15;
                    list = list9;
                    vVar = vVar2;
                    qVar = qVar3;
                    list2 = list10;
                    list3 = list11;
                    list4 = list12;
                    str = str5;
                    str2 = str6;
                    str3 = str7;
                    str4 = str8;
                }
                beginStructure.endStructure(fVar);
                return new d(i11, str, str2, list4, list3, str3, list2, qVar, list, str4, vVar, (j50.x2) null);
            }

            @Override // f50.b0
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public final void b(@m80.k i50.h encoder, @m80.k d value) {
                kotlin.jvm.internal.g0.p(encoder, "encoder");
                kotlin.jvm.internal.g0.p(value, "value");
                h50.f fVar = descriptor;
                i50.e beginStructure = encoder.beginStructure(fVar);
                d.P(value, beginStructure, fVar);
                beginStructure.endStructure(fVar);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
                this();
            }

            @m80.k
            public final f50.i<d> serializer() {
                return a.f69400a;
            }

            public b() {
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            f69389k = new yz.c0[]{null, null, yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.r0
                @Override // x00.a
                public final Object invoke() {
                    f50.i e11;
                    e11 = i0.d.e();
                    return e11;
                }
            }), yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.s0
                @Override // x00.a
                public final Object invoke() {
                    f50.i f11;
                    f11 = i0.d.f();
                    return f11;
                }
            }), null, yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.t0
                @Override // x00.a
                public final Object invoke() {
                    f50.i g11;
                    g11 = i0.d.g();
                    return g11;
                }
            }), null, yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.u0
                @Override // x00.a
                public final Object invoke() {
                    f50.i h11;
                    h11 = i0.d.h();
                    return h11;
                }
            }), null, null};
        }

        public d() {
            this((String) null, (String) null, (List) null, (List) null, (String) null, (List) null, (q) null, (List) null, (String) null, (v) null, 1023, (kotlin.jvm.internal.v) null);
        }

        @w00.o
        public static final /* synthetic */ void P(d dVar, i50.e eVar, h50.f fVar) {
            yz.c0<f50.i<Object>>[] c0VarArr = f69389k;
            if (eVar.shouldEncodeElementDefault(fVar, 0) || !kotlin.jvm.internal.g0.g(dVar.f69390a, "")) {
                eVar.encodeStringElement(fVar, 0, dVar.f69390a);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 1) || !kotlin.jvm.internal.g0.g(dVar.f69391b, "")) {
                eVar.encodeStringElement(fVar, 1, dVar.f69391b);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 2) || !kotlin.jvm.internal.g0.g(dVar.f69392c, a00.h0.J())) {
                eVar.encodeSerializableElement(fVar, 2, c0VarArr[2].getValue(), dVar.f69392c);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 3) || !kotlin.jvm.internal.g0.g(dVar.f69393d, a00.h0.J())) {
                eVar.encodeSerializableElement(fVar, 3, c0VarArr[3].getValue(), dVar.f69393d);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 4) || !kotlin.jvm.internal.g0.g(dVar.f69394e, "")) {
                eVar.encodeStringElement(fVar, 4, dVar.f69394e);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 5) || !kotlin.jvm.internal.g0.g(dVar.f69395f, a00.h0.J())) {
                eVar.encodeSerializableElement(fVar, 5, c0VarArr[5].getValue(), dVar.f69395f);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 6) || dVar.f69396g != null) {
                eVar.encodeNullableSerializableElement(fVar, 6, q.a.f69470a, dVar.f69396g);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 7) || dVar.f69397h != null) {
                eVar.encodeNullableSerializableElement(fVar, 7, c0VarArr[7].getValue(), dVar.f69397h);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 8) || !kotlin.jvm.internal.g0.g(dVar.f69398i, "")) {
                eVar.encodeStringElement(fVar, 8, dVar.f69398i);
            }
            if (!eVar.shouldEncodeElementDefault(fVar, 9) && dVar.f69399j == null) {
                return;
            }
            eVar.encodeNullableSerializableElement(fVar, 9, v.a.f69506a, dVar.f69399j);
        }

        public static final /* synthetic */ f50.i e() {
            return new j50.f(d3.f63348a);
        }

        public static final /* synthetic */ f50.i f() {
            return new j50.f(d3.f63348a);
        }

        public static final /* synthetic */ f50.i g() {
            return new j50.f(o.a.f69452a);
        }

        public static final /* synthetic */ f50.i h() {
            return new j50.f(d3.f63348a);
        }

        public static /* synthetic */ d u(d dVar, String str, String str2, List list, List list2, String str3, List list3, q qVar, List list4, String str4, v vVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = dVar.f69390a;
            }
            if ((i11 & 2) != 0) {
                str2 = dVar.f69391b;
            }
            if ((i11 & 4) != 0) {
                list = dVar.f69392c;
            }
            if ((i11 & 8) != 0) {
                list2 = dVar.f69393d;
            }
            if ((i11 & 16) != 0) {
                str3 = dVar.f69394e;
            }
            if ((i11 & 32) != 0) {
                list3 = dVar.f69395f;
            }
            if ((i11 & 64) != 0) {
                qVar = dVar.f69396g;
            }
            if ((i11 & 128) != 0) {
                list4 = dVar.f69397h;
            }
            if ((i11 & 256) != 0) {
                str4 = dVar.f69398i;
            }
            if ((i11 & 512) != 0) {
                vVar = dVar.f69399j;
            }
            String str5 = str4;
            v vVar2 = vVar;
            q qVar2 = qVar;
            List list5 = list4;
            String str6 = str3;
            List list6 = list3;
            return dVar.t(str, str2, list, list2, str6, list6, qVar2, list5, str5, vVar2);
        }

        @m80.k
        public final List<String> B() {
            return this.f69392c;
        }

        @m80.k
        public final String D() {
            return this.f69390a;
        }

        @m80.k
        public final String F() {
            return this.f69391b;
        }

        @m80.k
        public final List<o> H() {
            return this.f69395f;
        }

        @m80.l
        public final q J() {
            return this.f69396g;
        }

        @m80.l
        public final v L() {
            return this.f69399j;
        }

        @m80.k
        public final String N() {
            return this.f69398i;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return kotlin.jvm.internal.g0.g(this.f69390a, dVar.f69390a) && kotlin.jvm.internal.g0.g(this.f69391b, dVar.f69391b) && kotlin.jvm.internal.g0.g(this.f69392c, dVar.f69392c) && kotlin.jvm.internal.g0.g(this.f69393d, dVar.f69393d) && kotlin.jvm.internal.g0.g(this.f69394e, dVar.f69394e) && kotlin.jvm.internal.g0.g(this.f69395f, dVar.f69395f) && kotlin.jvm.internal.g0.g(this.f69396g, dVar.f69396g) && kotlin.jvm.internal.g0.g(this.f69397h, dVar.f69397h) && kotlin.jvm.internal.g0.g(this.f69398i, dVar.f69398i) && kotlin.jvm.internal.g0.g(this.f69399j, dVar.f69399j);
        }

        public int hashCode() {
            int hashCode = ((((((((((this.f69390a.hashCode() * 31) + this.f69391b.hashCode()) * 31) + this.f69392c.hashCode()) * 31) + this.f69393d.hashCode()) * 31) + this.f69394e.hashCode()) * 31) + this.f69395f.hashCode()) * 31;
            q qVar = this.f69396g;
            int hashCode2 = (hashCode + (qVar == null ? 0 : qVar.hashCode())) * 31;
            List<String> list = this.f69397h;
            int hashCode3 = (((hashCode2 + (list == null ? 0 : list.hashCode())) * 31) + this.f69398i.hashCode()) * 31;
            v vVar = this.f69399j;
            return hashCode3 + (vVar != null ? vVar.hashCode() : 0);
        }

        @m80.k
        public final String j() {
            return this.f69390a;
        }

        @m80.l
        public final v k() {
            return this.f69399j;
        }

        @m80.k
        public final String l() {
            return this.f69391b;
        }

        @m80.k
        public final List<String> m() {
            return this.f69392c;
        }

        @m80.k
        public final List<String> n() {
            return this.f69393d;
        }

        @m80.k
        public final String o() {
            return this.f69394e;
        }

        @m80.k
        public final List<o> p() {
            return this.f69395f;
        }

        @m80.l
        public final q q() {
            return this.f69396g;
        }

        @m80.l
        public final List<String> r() {
            return this.f69397h;
        }

        @m80.k
        public final String s() {
            return this.f69398i;
        }

        @m80.k
        public final d t(@m80.k String mean, @m80.k String meanAudio, @m80.k List<String> imgs, @m80.k List<String> imgOptions, @m80.k String contrastImg, @m80.k List<o> meanOptions, @m80.l q qVar, @m80.l List<String> list, @m80.k String wordAudio, @m80.l v vVar) {
            kotlin.jvm.internal.g0.p(mean, "mean");
            kotlin.jvm.internal.g0.p(meanAudio, "meanAudio");
            kotlin.jvm.internal.g0.p(imgs, "imgs");
            kotlin.jvm.internal.g0.p(imgOptions, "imgOptions");
            kotlin.jvm.internal.g0.p(contrastImg, "contrastImg");
            kotlin.jvm.internal.g0.p(meanOptions, "meanOptions");
            kotlin.jvm.internal.g0.p(wordAudio, "wordAudio");
            return new d(mean, meanAudio, imgs, imgOptions, contrastImg, meanOptions, qVar, list, wordAudio, vVar);
        }

        @m80.k
        public String toString() {
            return "AllInOneCakePack(mean=" + this.f69390a + ", meanAudio=" + this.f69391b + ", imgs=" + this.f69392c + ", imgOptions=" + this.f69393d + ", contrastImg=" + this.f69394e + ", meanOptions=" + this.f69395f + ", phonics=" + this.f69396g + ", chunkOptions=" + this.f69397h + ", wordAudio=" + this.f69398i + ", selectChunk=" + this.f69399j + ')';
        }

        @m80.l
        public final List<String> v() {
            return this.f69397h;
        }

        @m80.k
        public final String x() {
            return this.f69394e;
        }

        @m80.k
        public final List<String> z() {
            return this.f69393d;
        }

        public /* synthetic */ d(int i11, String str, String str2, List list, List list2, String str3, List list3, q qVar, List list4, String str4, v vVar, j50.x2 x2Var) {
            if ((i11 & 1) == 0) {
                this.f69390a = "";
            } else {
                this.f69390a = str;
            }
            if ((i11 & 2) == 0) {
                this.f69391b = "";
            } else {
                this.f69391b = str2;
            }
            if ((i11 & 4) == 0) {
                this.f69392c = a00.h0.J();
            } else {
                this.f69392c = list;
            }
            if ((i11 & 8) == 0) {
                this.f69393d = a00.h0.J();
            } else {
                this.f69393d = list2;
            }
            if ((i11 & 16) == 0) {
                this.f69394e = "";
            } else {
                this.f69394e = str3;
            }
            if ((i11 & 32) == 0) {
                this.f69395f = a00.h0.J();
            } else {
                this.f69395f = list3;
            }
            if ((i11 & 64) == 0) {
                this.f69396g = null;
            } else {
                this.f69396g = qVar;
            }
            if ((i11 & 128) == 0) {
                this.f69397h = null;
            } else {
                this.f69397h = list4;
            }
            if ((i11 & 256) == 0) {
                this.f69398i = "";
            } else {
                this.f69398i = str4;
            }
            if ((i11 & 512) == 0) {
                this.f69399j = null;
            } else {
                this.f69399j = vVar;
            }
        }

        public d(@m80.k String mean, @m80.k String meanAudio, @m80.k List<String> imgs, @m80.k List<String> imgOptions, @m80.k String contrastImg, @m80.k List<o> meanOptions, @m80.l q qVar, @m80.l List<String> list, @m80.k String wordAudio, @m80.l v vVar) {
            kotlin.jvm.internal.g0.p(mean, "mean");
            kotlin.jvm.internal.g0.p(meanAudio, "meanAudio");
            kotlin.jvm.internal.g0.p(imgs, "imgs");
            kotlin.jvm.internal.g0.p(imgOptions, "imgOptions");
            kotlin.jvm.internal.g0.p(contrastImg, "contrastImg");
            kotlin.jvm.internal.g0.p(meanOptions, "meanOptions");
            kotlin.jvm.internal.g0.p(wordAudio, "wordAudio");
            this.f69390a = mean;
            this.f69391b = meanAudio;
            this.f69392c = imgs;
            this.f69393d = imgOptions;
            this.f69394e = contrastImg;
            this.f69395f = meanOptions;
            this.f69396g = qVar;
            this.f69397h = list;
            this.f69398i = wordAudio;
            this.f69399j = vVar;
        }

        @f50.z("imgOptions")
        public static /* synthetic */ void A() {
        }

        @f50.z("imgs")
        public static /* synthetic */ void C() {
        }

        @f50.z(com.baicizhan.main.wikiv2.studyv2.data.t.f26099a)
        public static /* synthetic */ void E() {
        }

        @f50.z("meanAudio")
        public static /* synthetic */ void G() {
        }

        @f50.z("meanOptions")
        public static /* synthetic */ void I() {
        }

        @f50.z("phonics")
        public static /* synthetic */ void K() {
        }

        @f50.z("selectChunk")
        public static /* synthetic */ void M() {
        }

        @f50.z("wordAudio")
        public static /* synthetic */ void O() {
        }

        @f50.z("chunkOptions")
        public static /* synthetic */ void w() {
        }

        @f50.z("contrastImg")
        public static /* synthetic */ void y() {
        }

        public /* synthetic */ d(String str, String str2, List list, List list2, String str3, List list3, q qVar, List list4, String str4, v vVar, int i11, kotlin.jvm.internal.v vVar2) {
            this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? a00.h0.J() : list, (i11 & 8) != 0 ? a00.h0.J() : list2, (i11 & 16) != 0 ? "" : str3, (i11 & 32) != 0 ? a00.h0.J() : list3, (i11 & 64) != 0 ? null : qVar, (i11 & 128) != 0 ? null : list4, (i11 & 256) != 0 ? "" : str4, (i11 & 512) != 0 ? null : vVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @f50.a0
    public static final class e {

        @m80.k
        public static final b Companion = new b(null);

        /* renamed from: a, reason: collision with root package name */
        public final int f69401a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f69402b;

        /* renamed from: c, reason: collision with root package name */
        public final int f69403c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final String f69404d;

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final String f69405e;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        public static final /* synthetic */ class a implements j50.p0<e> {

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public static final a f69406a;

            @m80.k
            private static final h50.f descriptor;

            static {
                a aVar = new a();
                f69406a = aVar;
                j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.TopicResourceModel.AssociatedWordPack", aVar, 5);
                l2Var.q("topicId", true);
                l2Var.q("word", true);
                l2Var.q("type", true);
                l2Var.q("meaning", true);
                l2Var.q("accentUs", true);
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

            @Override // j50.p0
            @m80.k
            public final f50.i<?>[] f() {
                j50.z0 z0Var = j50.z0.f63517a;
                d3 d3Var = d3.f63348a;
                return new f50.i[]{z0Var, d3Var, z0Var, d3Var, d3Var};
            }

            @Override // f50.e
            @m80.k
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final e e(@m80.k i50.f decoder) {
                int i11;
                String str;
                String str2;
                int i12;
                String str3;
                int i13;
                kotlin.jvm.internal.g0.p(decoder, "decoder");
                h50.f fVar = descriptor;
                i50.d beginStructure = decoder.beginStructure(fVar);
                if (beginStructure.decodeSequentially()) {
                    i11 = beginStructure.decodeIntElement(fVar, 0);
                    String decodeStringElement = beginStructure.decodeStringElement(fVar, 1);
                    int decodeIntElement = beginStructure.decodeIntElement(fVar, 2);
                    str = beginStructure.decodeStringElement(fVar, 3);
                    str2 = beginStructure.decodeStringElement(fVar, 4);
                    i12 = decodeIntElement;
                    str3 = decodeStringElement;
                    i13 = 31;
                } else {
                    String str4 = null;
                    String str5 = null;
                    String str6 = null;
                    boolean z11 = true;
                    i11 = 0;
                    int i14 = 0;
                    int i15 = 0;
                    while (z11) {
                        int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                        if (decodeElementIndex == -1) {
                            z11 = false;
                        } else if (decodeElementIndex == 0) {
                            i11 = beginStructure.decodeIntElement(fVar, 0);
                            i15 |= 1;
                        } else if (decodeElementIndex == 1) {
                            str6 = beginStructure.decodeStringElement(fVar, 1);
                            i15 |= 2;
                        } else if (decodeElementIndex == 2) {
                            i14 = beginStructure.decodeIntElement(fVar, 2);
                            i15 |= 4;
                        } else if (decodeElementIndex == 3) {
                            str4 = beginStructure.decodeStringElement(fVar, 3);
                            i15 |= 8;
                        } else {
                            if (decodeElementIndex != 4) {
                                throw new UnknownFieldException(decodeElementIndex);
                            }
                            str5 = beginStructure.decodeStringElement(fVar, 4);
                            i15 |= 16;
                        }
                    }
                    str = str4;
                    str2 = str5;
                    i12 = i14;
                    str3 = str6;
                    i13 = i15;
                }
                int i16 = i11;
                beginStructure.endStructure(fVar);
                return new e(i13, i16, str3, i12, str, str2, (j50.x2) null);
            }

            @Override // f50.b0
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public final void b(@m80.k i50.h encoder, @m80.k e value) {
                kotlin.jvm.internal.g0.p(encoder, "encoder");
                kotlin.jvm.internal.g0.p(value, "value");
                h50.f fVar = descriptor;
                i50.e beginStructure = encoder.beginStructure(fVar);
                e.r(value, beginStructure, fVar);
                beginStructure.endStructure(fVar);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
                this();
            }

            @m80.k
            public final f50.i<e> serializer() {
                return a.f69406a;
            }

            public b() {
            }
        }

        public e() {
            this(0, (String) null, 0, (String) null, (String) null, 31, (kotlin.jvm.internal.v) null);
        }

        public static /* synthetic */ e g(e eVar, int i11, String str, int i12, String str2, String str3, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = eVar.f69401a;
            }
            if ((i13 & 2) != 0) {
                str = eVar.f69402b;
            }
            if ((i13 & 4) != 0) {
                i12 = eVar.f69403c;
            }
            if ((i13 & 8) != 0) {
                str2 = eVar.f69404d;
            }
            if ((i13 & 16) != 0) {
                str3 = eVar.f69405e;
            }
            String str4 = str3;
            int i14 = i12;
            return eVar.f(i11, str, i14, str2, str4);
        }

        @w00.o
        public static final /* synthetic */ void r(e eVar, i50.e eVar2, h50.f fVar) {
            if (eVar2.shouldEncodeElementDefault(fVar, 0) || eVar.f69401a != 0) {
                eVar2.encodeIntElement(fVar, 0, eVar.f69401a);
            }
            if (eVar2.shouldEncodeElementDefault(fVar, 1) || !kotlin.jvm.internal.g0.g(eVar.f69402b, "")) {
                eVar2.encodeStringElement(fVar, 1, eVar.f69402b);
            }
            if (eVar2.shouldEncodeElementDefault(fVar, 2) || eVar.f69403c != 0) {
                eVar2.encodeIntElement(fVar, 2, eVar.f69403c);
            }
            if (eVar2.shouldEncodeElementDefault(fVar, 3) || !kotlin.jvm.internal.g0.g(eVar.f69404d, "")) {
                eVar2.encodeStringElement(fVar, 3, eVar.f69404d);
            }
            if (!eVar2.shouldEncodeElementDefault(fVar, 4) && kotlin.jvm.internal.g0.g(eVar.f69405e, "")) {
                return;
            }
            eVar2.encodeStringElement(fVar, 4, eVar.f69405e);
        }

        public final int a() {
            return this.f69401a;
        }

        @m80.k
        public final String b() {
            return this.f69402b;
        }

        public final int c() {
            return this.f69403c;
        }

        @m80.k
        public final String d() {
            return this.f69404d;
        }

        @m80.k
        public final String e() {
            return this.f69405e;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f69401a == eVar.f69401a && kotlin.jvm.internal.g0.g(this.f69402b, eVar.f69402b) && this.f69403c == eVar.f69403c && kotlin.jvm.internal.g0.g(this.f69404d, eVar.f69404d) && kotlin.jvm.internal.g0.g(this.f69405e, eVar.f69405e);
        }

        @m80.k
        public final e f(int i11, @m80.k String word, int i12, @m80.k String meaning, @m80.k String accentUs) {
            kotlin.jvm.internal.g0.p(word, "word");
            kotlin.jvm.internal.g0.p(meaning, "meaning");
            kotlin.jvm.internal.g0.p(accentUs, "accentUs");
            return new e(i11, word, i12, meaning, accentUs);
        }

        @m80.k
        public final String h() {
            return this.f69405e;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.f69401a) * 31) + this.f69402b.hashCode()) * 31) + Integer.hashCode(this.f69403c)) * 31) + this.f69404d.hashCode()) * 31) + this.f69405e.hashCode();
        }

        @m80.k
        public final String j() {
            return this.f69404d;
        }

        public final int l() {
            return this.f69401a;
        }

        public final int n() {
            return this.f69403c;
        }

        @m80.k
        public final String p() {
            return this.f69402b;
        }

        @m80.k
        public String toString() {
            return "AssociatedWordPack(topicId=" + this.f69401a + ", word=" + this.f69402b + ", type=" + this.f69403c + ", meaning=" + this.f69404d + ", accentUs=" + this.f69405e + ')';
        }

        public /* synthetic */ e(int i11, int i12, String str, int i13, String str2, String str3, j50.x2 x2Var) {
            if ((i11 & 1) == 0) {
                this.f69401a = 0;
            } else {
                this.f69401a = i12;
            }
            if ((i11 & 2) == 0) {
                this.f69402b = "";
            } else {
                this.f69402b = str;
            }
            if ((i11 & 4) == 0) {
                this.f69403c = 0;
            } else {
                this.f69403c = i13;
            }
            if ((i11 & 8) == 0) {
                this.f69404d = "";
            } else {
                this.f69404d = str2;
            }
            if ((i11 & 16) == 0) {
                this.f69405e = "";
            } else {
                this.f69405e = str3;
            }
        }

        public e(int i11, @m80.k String word, int i12, @m80.k String meaning, @m80.k String accentUs) {
            kotlin.jvm.internal.g0.p(word, "word");
            kotlin.jvm.internal.g0.p(meaning, "meaning");
            kotlin.jvm.internal.g0.p(accentUs, "accentUs");
            this.f69401a = i11;
            this.f69402b = word;
            this.f69403c = i12;
            this.f69404d = meaning;
            this.f69405e = accentUs;
        }

        public /* synthetic */ e(int i11, String str, int i12, String str2, String str3, int i13, kotlin.jvm.internal.v vVar) {
            this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? "" : str, (i13 & 4) != 0 ? 0 : i12, (i13 & 8) != 0 ? "" : str2, (i13 & 16) != 0 ? "" : str3);
        }

        @f50.z("accentUs")
        public static /* synthetic */ void i() {
        }

        @f50.z("meaning")
        public static /* synthetic */ void k() {
        }

        @f50.z("topicId")
        public static /* synthetic */ void m() {
        }

        @f50.z("type")
        public static /* synthetic */ void o() {
        }

        @f50.z("word")
        public static /* synthetic */ void q() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f {
        public /* synthetic */ f(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<i0> serializer() {
            return a.f69352a;
        }

        public f() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @f50.a0
    public static final class g {

        @m80.k
        public static final b Companion = new b(null);

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f69407a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f69408b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final String f69409c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        public static final /* synthetic */ class a implements j50.p0<g> {

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public static final a f69410a;

            @m80.k
            private static final h50.f descriptor;

            static {
                a aVar = new a();
                f69410a = aVar;
                j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.TopicResourceModel.Concept", aVar, 3);
                l2Var.q("en", false);
                l2Var.q("chnMean", false);
                l2Var.q("meanType", false);
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

            @Override // j50.p0
            @m80.k
            public final f50.i<?>[] f() {
                d3 d3Var = d3.f63348a;
                return new f50.i[]{d3Var, d3Var, d3Var};
            }

            @Override // f50.e
            @m80.k
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final g e(@m80.k i50.f decoder) {
                String str;
                String str2;
                String str3;
                int i11;
                kotlin.jvm.internal.g0.p(decoder, "decoder");
                h50.f fVar = descriptor;
                i50.d beginStructure = decoder.beginStructure(fVar);
                if (beginStructure.decodeSequentially()) {
                    str = beginStructure.decodeStringElement(fVar, 0);
                    String decodeStringElement = beginStructure.decodeStringElement(fVar, 1);
                    str2 = beginStructure.decodeStringElement(fVar, 2);
                    str3 = decodeStringElement;
                    i11 = 7;
                } else {
                    str = null;
                    String str4 = null;
                    String str5 = null;
                    boolean z11 = true;
                    int i12 = 0;
                    while (z11) {
                        int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                        if (decodeElementIndex == -1) {
                            z11 = false;
                        } else if (decodeElementIndex == 0) {
                            str = beginStructure.decodeStringElement(fVar, 0);
                            i12 |= 1;
                        } else if (decodeElementIndex == 1) {
                            str5 = beginStructure.decodeStringElement(fVar, 1);
                            i12 |= 2;
                        } else {
                            if (decodeElementIndex != 2) {
                                throw new UnknownFieldException(decodeElementIndex);
                            }
                            str4 = beginStructure.decodeStringElement(fVar, 2);
                            i12 |= 4;
                        }
                    }
                    str2 = str4;
                    str3 = str5;
                    i11 = i12;
                }
                String str6 = str;
                beginStructure.endStructure(fVar);
                return new g(i11, str6, str3, str2, null);
            }

            @Override // f50.b0
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public final void b(@m80.k i50.h encoder, @m80.k g value) {
                kotlin.jvm.internal.g0.p(encoder, "encoder");
                kotlin.jvm.internal.g0.p(value, "value");
                h50.f fVar = descriptor;
                i50.e beginStructure = encoder.beginStructure(fVar);
                g.l(value, beginStructure, fVar);
                beginStructure.endStructure(fVar);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
                this();
            }

            @m80.k
            public final f50.i<g> serializer() {
                return a.f69410a;
            }

            public b() {
            }
        }

        public /* synthetic */ g(int i11, String str, String str2, String str3, j50.x2 x2Var) {
            if (7 != (i11 & 7)) {
                j50.h2.b(i11, 7, a.f69410a.a());
            }
            this.f69407a = str;
            this.f69408b = str2;
            this.f69409c = str3;
        }

        public static /* synthetic */ g e(g gVar, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = gVar.f69407a;
            }
            if ((i11 & 2) != 0) {
                str2 = gVar.f69408b;
            }
            if ((i11 & 4) != 0) {
                str3 = gVar.f69409c;
            }
            return gVar.d(str, str2, str3);
        }

        @w00.o
        public static final /* synthetic */ void l(g gVar, i50.e eVar, h50.f fVar) {
            eVar.encodeStringElement(fVar, 0, gVar.f69407a);
            eVar.encodeStringElement(fVar, 1, gVar.f69408b);
            eVar.encodeStringElement(fVar, 2, gVar.f69409c);
        }

        @m80.k
        public final String a() {
            return this.f69407a;
        }

        @m80.k
        public final String b() {
            return this.f69408b;
        }

        @m80.k
        public final String c() {
            return this.f69409c;
        }

        @m80.k
        public final g d(@m80.k String en2, @m80.k String chnMean, @m80.k String meanType) {
            kotlin.jvm.internal.g0.p(en2, "en");
            kotlin.jvm.internal.g0.p(chnMean, "chnMean");
            kotlin.jvm.internal.g0.p(meanType, "meanType");
            return new g(en2, chnMean, meanType);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return kotlin.jvm.internal.g0.g(this.f69407a, gVar.f69407a) && kotlin.jvm.internal.g0.g(this.f69408b, gVar.f69408b) && kotlin.jvm.internal.g0.g(this.f69409c, gVar.f69409c);
        }

        @m80.k
        public final String f() {
            return this.f69408b;
        }

        @m80.k
        public final String h() {
            return this.f69407a;
        }

        public int hashCode() {
            return (((this.f69407a.hashCode() * 31) + this.f69408b.hashCode()) * 31) + this.f69409c.hashCode();
        }

        @m80.k
        public final String j() {
            return this.f69409c;
        }

        @m80.k
        public String toString() {
            return "Concept(en=" + this.f69407a + ", chnMean=" + this.f69408b + ", meanType=" + this.f69409c + ')';
        }

        public g(@m80.k String en2, @m80.k String chnMean, @m80.k String meanType) {
            kotlin.jvm.internal.g0.p(en2, "en");
            kotlin.jvm.internal.g0.p(chnMean, "chnMean");
            kotlin.jvm.internal.g0.p(meanType, "meanType");
            this.f69407a = en2;
            this.f69408b = chnMean;
            this.f69409c = meanType;
        }

        @f50.z("chnMean")
        public static /* synthetic */ void g() {
        }

        @f50.z("en")
        public static /* synthetic */ void i() {
        }

        @f50.z("meanType")
        public static /* synthetic */ void k() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @f50.a0
    public static final class h {

        @m80.k
        public static final b Companion = new b(null);

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f69411a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f69412b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        public static final /* synthetic */ class a implements j50.p0<h> {

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public static final a f69413a;

            @m80.k
            private static final h50.f descriptor;

            static {
                a aVar = new a();
                f69413a = aVar;
                j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.TopicResourceModel.Derivation", aVar, 2);
                l2Var.q("word", false);
                l2Var.q(com.baicizhan.main.wikiv2.studyv2.data.t.f26099a, false);
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

            @Override // j50.p0
            @m80.k
            public final f50.i<?>[] f() {
                d3 d3Var = d3.f63348a;
                return new f50.i[]{d3Var, d3Var};
            }

            @Override // f50.e
            @m80.k
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final h e(@m80.k i50.f decoder) {
                String str;
                String str2;
                int i11;
                kotlin.jvm.internal.g0.p(decoder, "decoder");
                h50.f fVar = descriptor;
                i50.d beginStructure = decoder.beginStructure(fVar);
                j50.x2 x2Var = null;
                if (beginStructure.decodeSequentially()) {
                    str = beginStructure.decodeStringElement(fVar, 0);
                    str2 = beginStructure.decodeStringElement(fVar, 1);
                    i11 = 3;
                } else {
                    boolean z11 = true;
                    int i12 = 0;
                    str = null;
                    String str3 = null;
                    while (z11) {
                        int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                        if (decodeElementIndex == -1) {
                            z11 = false;
                        } else if (decodeElementIndex == 0) {
                            str = beginStructure.decodeStringElement(fVar, 0);
                            i12 |= 1;
                        } else {
                            if (decodeElementIndex != 1) {
                                throw new UnknownFieldException(decodeElementIndex);
                            }
                            str3 = beginStructure.decodeStringElement(fVar, 1);
                            i12 |= 2;
                        }
                    }
                    str2 = str3;
                    i11 = i12;
                }
                beginStructure.endStructure(fVar);
                return new h(i11, str, str2, x2Var);
            }

            @Override // f50.b0
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public final void b(@m80.k i50.h encoder, @m80.k h value) {
                kotlin.jvm.internal.g0.p(encoder, "encoder");
                kotlin.jvm.internal.g0.p(value, "value");
                h50.f fVar = descriptor;
                i50.e beginStructure = encoder.beginStructure(fVar);
                h.i(value, beginStructure, fVar);
                beginStructure.endStructure(fVar);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
                this();
            }

            @m80.k
            public final f50.i<h> serializer() {
                return a.f69413a;
            }

            public b() {
            }
        }

        public /* synthetic */ h(int i11, String str, String str2, j50.x2 x2Var) {
            if (3 != (i11 & 3)) {
                j50.h2.b(i11, 3, a.f69413a.a());
            }
            this.f69411a = str;
            this.f69412b = str2;
        }

        public static /* synthetic */ h d(h hVar, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = hVar.f69411a;
            }
            if ((i11 & 2) != 0) {
                str2 = hVar.f69412b;
            }
            return hVar.c(str, str2);
        }

        @w00.o
        public static final /* synthetic */ void i(h hVar, i50.e eVar, h50.f fVar) {
            eVar.encodeStringElement(fVar, 0, hVar.f69411a);
            eVar.encodeStringElement(fVar, 1, hVar.f69412b);
        }

        @m80.k
        public final String a() {
            return this.f69411a;
        }

        @m80.k
        public final String b() {
            return this.f69412b;
        }

        @m80.k
        public final h c(@m80.k String word, @m80.k String mean) {
            kotlin.jvm.internal.g0.p(word, "word");
            kotlin.jvm.internal.g0.p(mean, "mean");
            return new h(word, mean);
        }

        @m80.k
        public final String e() {
            return this.f69412b;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return kotlin.jvm.internal.g0.g(this.f69411a, hVar.f69411a) && kotlin.jvm.internal.g0.g(this.f69412b, hVar.f69412b);
        }

        @m80.k
        public final String g() {
            return this.f69411a;
        }

        public int hashCode() {
            return (this.f69411a.hashCode() * 31) + this.f69412b.hashCode();
        }

        @m80.k
        public String toString() {
            return "Derivation(word=" + this.f69411a + ", mean=" + this.f69412b + ')';
        }

        public h(@m80.k String word, @m80.k String mean) {
            kotlin.jvm.internal.g0.p(word, "word");
            kotlin.jvm.internal.g0.p(mean, "mean");
            this.f69411a = word;
            this.f69412b = mean;
        }

        @f50.z(com.baicizhan.main.wikiv2.studyv2.data.t.f26099a)
        public static /* synthetic */ void f() {
        }

        @f50.z("word")
        public static /* synthetic */ void h() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @f50.a0
    public static final class i {

        @m80.k
        public static final b Companion = new b(null);

        /* renamed from: a, reason: collision with root package name */
        public final int f69414a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f69415b;

        /* renamed from: c, reason: collision with root package name */
        public final int f69416c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        public static final /* synthetic */ class a implements j50.p0<i> {

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public static final a f69417a;

            @m80.k
            private static final h50.f descriptor;

            static {
                a aVar = new a();
                f69417a = aVar;
                j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.TopicResourceModel.ExamInfo", aVar, 3);
                l2Var.q("recent", false);
                l2Var.q("examName", false);
                l2Var.q("nums", false);
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

            @Override // j50.p0
            @m80.k
            public final f50.i<?>[] f() {
                j50.z0 z0Var = j50.z0.f63517a;
                return new f50.i[]{z0Var, d3.f63348a, z0Var};
            }

            @Override // f50.e
            @m80.k
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final i e(@m80.k i50.f decoder) {
                int i11;
                int i12;
                String str;
                int i13;
                kotlin.jvm.internal.g0.p(decoder, "decoder");
                h50.f fVar = descriptor;
                i50.d beginStructure = decoder.beginStructure(fVar);
                if (beginStructure.decodeSequentially()) {
                    i11 = beginStructure.decodeIntElement(fVar, 0);
                    String decodeStringElement = beginStructure.decodeStringElement(fVar, 1);
                    i12 = beginStructure.decodeIntElement(fVar, 2);
                    str = decodeStringElement;
                    i13 = 7;
                } else {
                    String str2 = null;
                    boolean z11 = true;
                    i11 = 0;
                    int i14 = 0;
                    int i15 = 0;
                    while (z11) {
                        int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                        if (decodeElementIndex == -1) {
                            z11 = false;
                        } else if (decodeElementIndex == 0) {
                            i11 = beginStructure.decodeIntElement(fVar, 0);
                            i15 |= 1;
                        } else if (decodeElementIndex == 1) {
                            str2 = beginStructure.decodeStringElement(fVar, 1);
                            i15 |= 2;
                        } else {
                            if (decodeElementIndex != 2) {
                                throw new UnknownFieldException(decodeElementIndex);
                            }
                            i14 = beginStructure.decodeIntElement(fVar, 2);
                            i15 |= 4;
                        }
                    }
                    i12 = i14;
                    str = str2;
                    i13 = i15;
                }
                int i16 = i11;
                beginStructure.endStructure(fVar);
                return new i(i13, i16, str, i12, null);
            }

            @Override // f50.b0
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public final void b(@m80.k i50.h encoder, @m80.k i value) {
                kotlin.jvm.internal.g0.p(encoder, "encoder");
                kotlin.jvm.internal.g0.p(value, "value");
                h50.f fVar = descriptor;
                i50.e beginStructure = encoder.beginStructure(fVar);
                i.l(value, beginStructure, fVar);
                beginStructure.endStructure(fVar);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
                this();
            }

            @m80.k
            public final f50.i<i> serializer() {
                return a.f69417a;
            }

            public b() {
            }
        }

        public /* synthetic */ i(int i11, int i12, String str, int i13, j50.x2 x2Var) {
            if (7 != (i11 & 7)) {
                j50.h2.b(i11, 7, a.f69417a.a());
            }
            this.f69414a = i12;
            this.f69415b = str;
            this.f69416c = i13;
        }

        public static /* synthetic */ i e(i iVar, int i11, String str, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = iVar.f69414a;
            }
            if ((i13 & 2) != 0) {
                str = iVar.f69415b;
            }
            if ((i13 & 4) != 0) {
                i12 = iVar.f69416c;
            }
            return iVar.d(i11, str, i12);
        }

        @w00.o
        public static final /* synthetic */ void l(i iVar, i50.e eVar, h50.f fVar) {
            eVar.encodeIntElement(fVar, 0, iVar.f69414a);
            eVar.encodeStringElement(fVar, 1, iVar.f69415b);
            eVar.encodeIntElement(fVar, 2, iVar.f69416c);
        }

        public final int a() {
            return this.f69414a;
        }

        @m80.k
        public final String b() {
            return this.f69415b;
        }

        public final int c() {
            return this.f69416c;
        }

        @m80.k
        public final i d(int i11, @m80.k String examName, int i12) {
            kotlin.jvm.internal.g0.p(examName, "examName");
            return new i(i11, examName, i12);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.f69414a == iVar.f69414a && kotlin.jvm.internal.g0.g(this.f69415b, iVar.f69415b) && this.f69416c == iVar.f69416c;
        }

        @m80.k
        public final String f() {
            return this.f69415b;
        }

        public final int h() {
            return this.f69416c;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f69414a) * 31) + this.f69415b.hashCode()) * 31) + Integer.hashCode(this.f69416c);
        }

        public final int j() {
            return this.f69414a;
        }

        @m80.k
        public String toString() {
            return "ExamInfo(recent=" + this.f69414a + ", examName=" + this.f69415b + ", nums=" + this.f69416c + ')';
        }

        public i(int i11, @m80.k String examName, int i12) {
            kotlin.jvm.internal.g0.p(examName, "examName");
            this.f69414a = i11;
            this.f69415b = examName;
            this.f69416c = i12;
        }

        @f50.z("examName")
        public static /* synthetic */ void g() {
        }

        @f50.z("nums")
        public static /* synthetic */ void i() {
        }

        @f50.z("recent")
        public static /* synthetic */ void k() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @f50.a0
    public static final class j {

        @m80.k
        public static final b Companion = new b(null);

        /* renamed from: g, reason: collision with root package name */
        @w00.g
        @m80.k
        public static final yz.c0<f50.i<Object>>[] f69418g = {null, null, null, null, null, yz.e0.b(LazyThreadSafetyMode.PUBLICATION, new x00.a() { // from class: l3.v0
            @Override // x00.a
            public final Object invoke() {
                f50.i b11;
                b11 = i0.j.b();
                return b11;
            }
        })};

        /* renamed from: a, reason: collision with root package name */
        public final long f69419a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f69420b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final String f69421c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final String f69422d;

        /* renamed from: e, reason: collision with root package name */
        public final int f69423e;

        /* renamed from: f, reason: collision with root package name */
        @m80.k
        public final List<Long> f69424f;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        public static final /* synthetic */ class a implements j50.p0<j> {

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public static final a f69425a;

            @m80.k
            private static final h50.f descriptor;

            static {
                a aVar = new a();
                f69425a = aVar;
                j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.TopicResourceModel.Explain", aVar, 6);
                l2Var.q("id", true);
                l2Var.q("text", true);
                l2Var.q("audio", true);
                l2Var.q("pic", true);
                l2Var.q("duration", true);
                l2Var.q("errorTipIds", true);
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
                yz.c0[] c0VarArr = j.f69418g;
                d3 d3Var = d3.f63348a;
                return new f50.i[]{j50.l1.f63406a, d3Var, d3Var, d3Var, j50.z0.f63517a, c0VarArr[5].getValue()};
            }

            @Override // f50.e
            @m80.k
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final j e(@m80.k i50.f decoder) {
                int i11;
                int i12;
                String str;
                String str2;
                String str3;
                List list;
                long j11;
                kotlin.jvm.internal.g0.p(decoder, "decoder");
                h50.f fVar = descriptor;
                i50.d beginStructure = decoder.beginStructure(fVar);
                yz.c0[] c0VarArr = j.f69418g;
                if (beginStructure.decodeSequentially()) {
                    long decodeLongElement = beginStructure.decodeLongElement(fVar, 0);
                    String decodeStringElement = beginStructure.decodeStringElement(fVar, 1);
                    String decodeStringElement2 = beginStructure.decodeStringElement(fVar, 2);
                    String decodeStringElement3 = beginStructure.decodeStringElement(fVar, 3);
                    int decodeIntElement = beginStructure.decodeIntElement(fVar, 4);
                    list = (List) beginStructure.decodeSerializableElement(fVar, 5, (f50.e) c0VarArr[5].getValue(), null);
                    str = decodeStringElement;
                    str3 = decodeStringElement3;
                    i11 = decodeIntElement;
                    str2 = decodeStringElement2;
                    i12 = 63;
                    j11 = decodeLongElement;
                } else {
                    boolean z11 = true;
                    int i13 = 0;
                    String str4 = null;
                    List list2 = null;
                    long j12 = 0;
                    int i14 = 0;
                    String str5 = null;
                    String str6 = null;
                    while (z11) {
                        int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                        switch (decodeElementIndex) {
                            case -1:
                                z11 = false;
                                continue;
                            case 0:
                                j12 = beginStructure.decodeLongElement(fVar, 0);
                                i14 |= 1;
                                continue;
                            case 1:
                                str5 = beginStructure.decodeStringElement(fVar, 1);
                                i14 |= 2;
                                break;
                            case 2:
                                str6 = beginStructure.decodeStringElement(fVar, 2);
                                i14 |= 4;
                                break;
                            case 3:
                                str4 = beginStructure.decodeStringElement(fVar, 3);
                                i14 |= 8;
                                break;
                            case 4:
                                i13 = beginStructure.decodeIntElement(fVar, 4);
                                i14 |= 16;
                                break;
                            case 5:
                                list2 = (List) beginStructure.decodeSerializableElement(fVar, 5, (f50.e) c0VarArr[5].getValue(), list2);
                                i14 |= 32;
                                break;
                            default:
                                throw new UnknownFieldException(decodeElementIndex);
                        }
                    }
                    i11 = i13;
                    i12 = i14;
                    str = str5;
                    str2 = str6;
                    str3 = str4;
                    list = list2;
                    j11 = j12;
                }
                beginStructure.endStructure(fVar);
                return new j(i12, j11, str, str2, str3, i11, list, (j50.x2) null);
            }

            @Override // f50.b0
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public final void b(@m80.k i50.h encoder, @m80.k j value) {
                kotlin.jvm.internal.g0.p(encoder, "encoder");
                kotlin.jvm.internal.g0.p(value, "value");
                h50.f fVar = descriptor;
                i50.e beginStructure = encoder.beginStructure(fVar);
                j.x(value, beginStructure, fVar);
                beginStructure.endStructure(fVar);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
                this();
            }

            @m80.k
            public final f50.i<j> serializer() {
                return a.f69425a;
            }

            public b() {
            }
        }

        public j() {
            this(0L, (String) null, (String) null, (String) null, 0, (List) null, 63, (kotlin.jvm.internal.v) null);
        }

        public static final /* synthetic */ f50.i b() {
            return new j50.f(j50.l1.f63406a);
        }

        public static /* synthetic */ j k(j jVar, long j11, String str, String str2, String str3, int i11, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                j11 = jVar.f69419a;
            }
            long j12 = j11;
            if ((i12 & 2) != 0) {
                str = jVar.f69420b;
            }
            String str4 = str;
            if ((i12 & 4) != 0) {
                str2 = jVar.f69421c;
            }
            String str5 = str2;
            if ((i12 & 8) != 0) {
                str3 = jVar.f69422d;
            }
            String str6 = str3;
            if ((i12 & 16) != 0) {
                i11 = jVar.f69423e;
            }
            int i13 = i11;
            if ((i12 & 32) != 0) {
                list = jVar.f69424f;
            }
            return jVar.j(j12, str4, str5, str6, i13, list);
        }

        @w00.o
        public static final /* synthetic */ void x(j jVar, i50.e eVar, h50.f fVar) {
            yz.c0<f50.i<Object>>[] c0VarArr = f69418g;
            if (eVar.shouldEncodeElementDefault(fVar, 0) || jVar.f69419a != 0) {
                eVar.encodeLongElement(fVar, 0, jVar.f69419a);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 1) || !kotlin.jvm.internal.g0.g(jVar.f69420b, "")) {
                eVar.encodeStringElement(fVar, 1, jVar.f69420b);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 2) || !kotlin.jvm.internal.g0.g(jVar.f69421c, "")) {
                eVar.encodeStringElement(fVar, 2, jVar.f69421c);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 3) || !kotlin.jvm.internal.g0.g(jVar.f69422d, "")) {
                eVar.encodeStringElement(fVar, 3, jVar.f69422d);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 4) || jVar.f69423e != 0) {
                eVar.encodeIntElement(fVar, 4, jVar.f69423e);
            }
            if (!eVar.shouldEncodeElementDefault(fVar, 5) && kotlin.jvm.internal.g0.g(jVar.f69424f, a00.h0.J())) {
                return;
            }
            eVar.encodeSerializableElement(fVar, 5, c0VarArr[5].getValue(), jVar.f69424f);
        }

        public final long d() {
            return this.f69419a;
        }

        @m80.k
        public final String e() {
            return this.f69420b;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.f69419a == jVar.f69419a && kotlin.jvm.internal.g0.g(this.f69420b, jVar.f69420b) && kotlin.jvm.internal.g0.g(this.f69421c, jVar.f69421c) && kotlin.jvm.internal.g0.g(this.f69422d, jVar.f69422d) && this.f69423e == jVar.f69423e && kotlin.jvm.internal.g0.g(this.f69424f, jVar.f69424f);
        }

        @m80.k
        public final String f() {
            return this.f69421c;
        }

        @m80.k
        public final String g() {
            return this.f69422d;
        }

        public final int h() {
            return this.f69423e;
        }

        public int hashCode() {
            return (((((((((Long.hashCode(this.f69419a) * 31) + this.f69420b.hashCode()) * 31) + this.f69421c.hashCode()) * 31) + this.f69422d.hashCode()) * 31) + Integer.hashCode(this.f69423e)) * 31) + this.f69424f.hashCode();
        }

        @m80.k
        public final List<Long> i() {
            return this.f69424f;
        }

        @m80.k
        public final j j(long j11, @m80.k String text, @m80.k String audio, @m80.k String pic, int i11, @m80.k List<Long> errorTipIds) {
            kotlin.jvm.internal.g0.p(text, "text");
            kotlin.jvm.internal.g0.p(audio, "audio");
            kotlin.jvm.internal.g0.p(pic, "pic");
            kotlin.jvm.internal.g0.p(errorTipIds, "errorTipIds");
            return new j(j11, text, audio, pic, i11, errorTipIds);
        }

        @m80.k
        public final String l() {
            return this.f69421c;
        }

        public final int n() {
            return this.f69423e;
        }

        @m80.k
        public final List<Long> p() {
            return this.f69424f;
        }

        public final long r() {
            return this.f69419a;
        }

        @m80.k
        public final String t() {
            return this.f69422d;
        }

        @m80.k
        public String toString() {
            return "Explain(id=" + this.f69419a + ", text=" + this.f69420b + ", audio=" + this.f69421c + ", pic=" + this.f69422d + ", duration=" + this.f69423e + ", errorTipIds=" + this.f69424f + ')';
        }

        @m80.k
        public final String v() {
            return this.f69420b;
        }

        public /* synthetic */ j(int i11, long j11, String str, String str2, String str3, int i12, List list, j50.x2 x2Var) {
            this.f69419a = (i11 & 1) == 0 ? 0L : j11;
            if ((i11 & 2) == 0) {
                this.f69420b = "";
            } else {
                this.f69420b = str;
            }
            if ((i11 & 4) == 0) {
                this.f69421c = "";
            } else {
                this.f69421c = str2;
            }
            if ((i11 & 8) == 0) {
                this.f69422d = "";
            } else {
                this.f69422d = str3;
            }
            if ((i11 & 16) == 0) {
                this.f69423e = 0;
            } else {
                this.f69423e = i12;
            }
            if ((i11 & 32) == 0) {
                this.f69424f = a00.h0.J();
            } else {
                this.f69424f = list;
            }
        }

        public j(long j11, @m80.k String text, @m80.k String audio, @m80.k String pic, int i11, @m80.k List<Long> errorTipIds) {
            kotlin.jvm.internal.g0.p(text, "text");
            kotlin.jvm.internal.g0.p(audio, "audio");
            kotlin.jvm.internal.g0.p(pic, "pic");
            kotlin.jvm.internal.g0.p(errorTipIds, "errorTipIds");
            this.f69419a = j11;
            this.f69420b = text;
            this.f69421c = audio;
            this.f69422d = pic;
            this.f69423e = i11;
            this.f69424f = errorTipIds;
        }

        public /* synthetic */ j(long j11, String str, String str2, String str3, int i11, List list, int i12, kotlin.jvm.internal.v vVar) {
            this((i12 & 1) != 0 ? 0L : j11, (i12 & 2) != 0 ? "" : str, (i12 & 4) != 0 ? "" : str2, (i12 & 8) == 0 ? str3 : "", (i12 & 16) != 0 ? 0 : i11, (i12 & 32) != 0 ? a00.h0.J() : list);
        }

        @f50.z("audio")
        public static /* synthetic */ void m() {
        }

        @f50.z("duration")
        public static /* synthetic */ void o() {
        }

        @f50.z("errorTipIds")
        public static /* synthetic */ void q() {
        }

        @f50.z("id")
        public static /* synthetic */ void s() {
        }

        @f50.z("pic")
        public static /* synthetic */ void u() {
        }

        @f50.z("text")
        public static /* synthetic */ void w() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @f50.a0
    public static final class k {

        @m80.k
        public static final b Companion = new b(null);

        /* renamed from: a, reason: collision with root package name */
        public final int f69426a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f69427b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final String f69428c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        public static final /* synthetic */ class a implements j50.p0<k> {

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public static final a f69429a;

            @m80.k
            private static final h50.f descriptor;

            static {
                a aVar = new a();
                f69429a = aVar;
                j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.TopicResourceModel.ExplanationSentence", aVar, 3);
                l2Var.q("type", true);
                l2Var.q("content", true);
                l2Var.q("audioUrl", true);
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

            @Override // j50.p0
            @m80.k
            public final f50.i<?>[] f() {
                d3 d3Var = d3.f63348a;
                return new f50.i[]{j50.z0.f63517a, d3Var, d3Var};
            }

            @Override // f50.e
            @m80.k
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final k e(@m80.k i50.f decoder) {
                int i11;
                String str;
                String str2;
                int i12;
                kotlin.jvm.internal.g0.p(decoder, "decoder");
                h50.f fVar = descriptor;
                i50.d beginStructure = decoder.beginStructure(fVar);
                if (beginStructure.decodeSequentially()) {
                    i11 = beginStructure.decodeIntElement(fVar, 0);
                    String decodeStringElement = beginStructure.decodeStringElement(fVar, 1);
                    str = beginStructure.decodeStringElement(fVar, 2);
                    str2 = decodeStringElement;
                    i12 = 7;
                } else {
                    String str3 = null;
                    String str4 = null;
                    boolean z11 = true;
                    i11 = 0;
                    int i13 = 0;
                    while (z11) {
                        int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                        if (decodeElementIndex == -1) {
                            z11 = false;
                        } else if (decodeElementIndex == 0) {
                            i11 = beginStructure.decodeIntElement(fVar, 0);
                            i13 |= 1;
                        } else if (decodeElementIndex == 1) {
                            str4 = beginStructure.decodeStringElement(fVar, 1);
                            i13 |= 2;
                        } else {
                            if (decodeElementIndex != 2) {
                                throw new UnknownFieldException(decodeElementIndex);
                            }
                            str3 = beginStructure.decodeStringElement(fVar, 2);
                            i13 |= 4;
                        }
                    }
                    str = str3;
                    str2 = str4;
                    i12 = i13;
                }
                int i14 = i11;
                beginStructure.endStructure(fVar);
                return new k(i12, i14, str2, str, (j50.x2) null);
            }

            @Override // f50.b0
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public final void b(@m80.k i50.h encoder, @m80.k k value) {
                kotlin.jvm.internal.g0.p(encoder, "encoder");
                kotlin.jvm.internal.g0.p(value, "value");
                h50.f fVar = descriptor;
                i50.e beginStructure = encoder.beginStructure(fVar);
                k.l(value, beginStructure, fVar);
                beginStructure.endStructure(fVar);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
                this();
            }

            @m80.k
            public final f50.i<k> serializer() {
                return a.f69429a;
            }

            public b() {
            }
        }

        public k() {
            this(0, (String) null, (String) null, 7, (kotlin.jvm.internal.v) null);
        }

        public static /* synthetic */ k e(k kVar, int i11, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = kVar.f69426a;
            }
            if ((i12 & 2) != 0) {
                str = kVar.f69427b;
            }
            if ((i12 & 4) != 0) {
                str2 = kVar.f69428c;
            }
            return kVar.d(i11, str, str2);
        }

        @w00.o
        public static final /* synthetic */ void l(k kVar, i50.e eVar, h50.f fVar) {
            if (eVar.shouldEncodeElementDefault(fVar, 0) || kVar.f69426a != 0) {
                eVar.encodeIntElement(fVar, 0, kVar.f69426a);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 1) || !kotlin.jvm.internal.g0.g(kVar.f69427b, "")) {
                eVar.encodeStringElement(fVar, 1, kVar.f69427b);
            }
            if (!eVar.shouldEncodeElementDefault(fVar, 2) && kotlin.jvm.internal.g0.g(kVar.f69428c, "")) {
                return;
            }
            eVar.encodeStringElement(fVar, 2, kVar.f69428c);
        }

        public final int a() {
            return this.f69426a;
        }

        @m80.k
        public final String b() {
            return this.f69427b;
        }

        @m80.k
        public final String c() {
            return this.f69428c;
        }

        @m80.k
        public final k d(int i11, @m80.k String content, @m80.k String audioUrl) {
            kotlin.jvm.internal.g0.p(content, "content");
            kotlin.jvm.internal.g0.p(audioUrl, "audioUrl");
            return new k(i11, content, audioUrl);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.f69426a == kVar.f69426a && kotlin.jvm.internal.g0.g(this.f69427b, kVar.f69427b) && kotlin.jvm.internal.g0.g(this.f69428c, kVar.f69428c);
        }

        @m80.k
        public final String f() {
            return this.f69428c;
        }

        @m80.k
        public final String h() {
            return this.f69427b;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f69426a) * 31) + this.f69427b.hashCode()) * 31) + this.f69428c.hashCode();
        }

        public final int j() {
            return this.f69426a;
        }

        @m80.k
        public String toString() {
            return "ExplanationSentence(type=" + this.f69426a + ", content=" + this.f69427b + ", audioUrl=" + this.f69428c + ')';
        }

        public /* synthetic */ k(int i11, int i12, String str, String str2, j50.x2 x2Var) {
            this.f69426a = (i11 & 1) == 0 ? 0 : i12;
            if ((i11 & 2) == 0) {
                this.f69427b = "";
            } else {
                this.f69427b = str;
            }
            if ((i11 & 4) == 0) {
                this.f69428c = "";
            } else {
                this.f69428c = str2;
            }
        }

        public k(int i11, @m80.k String content, @m80.k String audioUrl) {
            kotlin.jvm.internal.g0.p(content, "content");
            kotlin.jvm.internal.g0.p(audioUrl, "audioUrl");
            this.f69426a = i11;
            this.f69427b = content;
            this.f69428c = audioUrl;
        }

        public /* synthetic */ k(int i11, String str, String str2, int i12, kotlin.jvm.internal.v vVar) {
            this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? "" : str, (i12 & 4) != 0 ? "" : str2);
        }

        @f50.z("audioUrl")
        public static /* synthetic */ void g() {
        }

        @f50.z("content")
        public static /* synthetic */ void i() {
        }

        @f50.z("type")
        public static /* synthetic */ void k() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @f50.a0
    public static final class l {

        @m80.k
        public static final b Companion = new b(null);

        /* renamed from: a, reason: collision with root package name */
        public final long f69430a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f69431b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final String f69432c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final String f69433d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        public static final /* synthetic */ class a implements j50.p0<l> {

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public static final a f69434a;

            @m80.k
            private static final h50.f descriptor;

            static {
                a aVar = new a();
                f69434a = aVar;
                j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.TopicResourceModel.FollowRead", aVar, 4);
                l2Var.q("id", true);
                l2Var.q("text", true);
                l2Var.q("audioUS", true);
                l2Var.q("audioUK", true);
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

            @Override // j50.p0
            @m80.k
            public final f50.i<?>[] f() {
                d3 d3Var = d3.f63348a;
                return new f50.i[]{j50.l1.f63406a, d3Var, d3Var, d3Var};
            }

            @Override // f50.e
            @m80.k
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final l e(@m80.k i50.f decoder) {
                String str;
                String str2;
                String str3;
                int i11;
                long j11;
                kotlin.jvm.internal.g0.p(decoder, "decoder");
                h50.f fVar = descriptor;
                i50.d beginStructure = decoder.beginStructure(fVar);
                if (beginStructure.decodeSequentially()) {
                    long decodeLongElement = beginStructure.decodeLongElement(fVar, 0);
                    str = beginStructure.decodeStringElement(fVar, 1);
                    String decodeStringElement = beginStructure.decodeStringElement(fVar, 2);
                    str2 = beginStructure.decodeStringElement(fVar, 3);
                    str3 = decodeStringElement;
                    i11 = 15;
                    j11 = decodeLongElement;
                } else {
                    str = null;
                    boolean z11 = true;
                    int i12 = 0;
                    long j12 = 0;
                    String str4 = null;
                    String str5 = null;
                    while (z11) {
                        int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                        if (decodeElementIndex == -1) {
                            z11 = false;
                        } else if (decodeElementIndex == 0) {
                            j12 = beginStructure.decodeLongElement(fVar, 0);
                            i12 |= 1;
                        } else if (decodeElementIndex == 1) {
                            str = beginStructure.decodeStringElement(fVar, 1);
                            i12 |= 2;
                        } else if (decodeElementIndex == 2) {
                            str5 = beginStructure.decodeStringElement(fVar, 2);
                            i12 |= 4;
                        } else {
                            if (decodeElementIndex != 3) {
                                throw new UnknownFieldException(decodeElementIndex);
                            }
                            str4 = beginStructure.decodeStringElement(fVar, 3);
                            i12 |= 8;
                        }
                    }
                    str2 = str4;
                    str3 = str5;
                    i11 = i12;
                    j11 = j12;
                }
                String str6 = str;
                beginStructure.endStructure(fVar);
                return new l(i11, j11, str6, str3, str2, (j50.x2) null);
            }

            @Override // f50.b0
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public final void b(@m80.k i50.h encoder, @m80.k l value) {
                kotlin.jvm.internal.g0.p(encoder, "encoder");
                kotlin.jvm.internal.g0.p(value, "value");
                h50.f fVar = descriptor;
                i50.e beginStructure = encoder.beginStructure(fVar);
                l.o(value, beginStructure, fVar);
                beginStructure.endStructure(fVar);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
                this();
            }

            @m80.k
            public final f50.i<l> serializer() {
                return a.f69434a;
            }

            public b() {
            }
        }

        public l() {
            this(0L, (String) null, (String) null, (String) null, 15, (kotlin.jvm.internal.v) null);
        }

        public static /* synthetic */ l f(l lVar, long j11, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j11 = lVar.f69430a;
            }
            long j12 = j11;
            if ((i11 & 2) != 0) {
                str = lVar.f69431b;
            }
            String str4 = str;
            if ((i11 & 4) != 0) {
                str2 = lVar.f69432c;
            }
            String str5 = str2;
            if ((i11 & 8) != 0) {
                str3 = lVar.f69433d;
            }
            return lVar.e(j12, str4, str5, str3);
        }

        @w00.o
        public static final /* synthetic */ void o(l lVar, i50.e eVar, h50.f fVar) {
            if (eVar.shouldEncodeElementDefault(fVar, 0) || lVar.f69430a != 0) {
                eVar.encodeLongElement(fVar, 0, lVar.f69430a);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 1) || !kotlin.jvm.internal.g0.g(lVar.f69431b, "")) {
                eVar.encodeStringElement(fVar, 1, lVar.f69431b);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 2) || !kotlin.jvm.internal.g0.g(lVar.f69432c, "")) {
                eVar.encodeStringElement(fVar, 2, lVar.f69432c);
            }
            if (!eVar.shouldEncodeElementDefault(fVar, 3) && kotlin.jvm.internal.g0.g(lVar.f69433d, "")) {
                return;
            }
            eVar.encodeStringElement(fVar, 3, lVar.f69433d);
        }

        public final long a() {
            return this.f69430a;
        }

        @m80.k
        public final String b() {
            return this.f69431b;
        }

        @m80.k
        public final String c() {
            return this.f69432c;
        }

        @m80.k
        public final String d() {
            return this.f69433d;
        }

        @m80.k
        public final l e(long j11, @m80.k String text, @m80.k String audioUS, @m80.k String audioUK) {
            kotlin.jvm.internal.g0.p(text, "text");
            kotlin.jvm.internal.g0.p(audioUS, "audioUS");
            kotlin.jvm.internal.g0.p(audioUK, "audioUK");
            return new l(j11, text, audioUS, audioUK);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return this.f69430a == lVar.f69430a && kotlin.jvm.internal.g0.g(this.f69431b, lVar.f69431b) && kotlin.jvm.internal.g0.g(this.f69432c, lVar.f69432c) && kotlin.jvm.internal.g0.g(this.f69433d, lVar.f69433d);
        }

        @m80.k
        public final String g() {
            return this.f69433d;
        }

        public int hashCode() {
            return (((((Long.hashCode(this.f69430a) * 31) + this.f69431b.hashCode()) * 31) + this.f69432c.hashCode()) * 31) + this.f69433d.hashCode();
        }

        @m80.k
        public final String i() {
            return this.f69432c;
        }

        public final long k() {
            return this.f69430a;
        }

        @m80.k
        public final String m() {
            return this.f69431b;
        }

        @m80.k
        public String toString() {
            return "FollowRead(id=" + this.f69430a + ", text=" + this.f69431b + ", audioUS=" + this.f69432c + ", audioUK=" + this.f69433d + ')';
        }

        public /* synthetic */ l(int i11, long j11, String str, String str2, String str3, j50.x2 x2Var) {
            this.f69430a = (i11 & 1) == 0 ? 0L : j11;
            if ((i11 & 2) == 0) {
                this.f69431b = "";
            } else {
                this.f69431b = str;
            }
            if ((i11 & 4) == 0) {
                this.f69432c = "";
            } else {
                this.f69432c = str2;
            }
            if ((i11 & 8) == 0) {
                this.f69433d = "";
            } else {
                this.f69433d = str3;
            }
        }

        public l(long j11, @m80.k String text, @m80.k String audioUS, @m80.k String audioUK) {
            kotlin.jvm.internal.g0.p(text, "text");
            kotlin.jvm.internal.g0.p(audioUS, "audioUS");
            kotlin.jvm.internal.g0.p(audioUK, "audioUK");
            this.f69430a = j11;
            this.f69431b = text;
            this.f69432c = audioUS;
            this.f69433d = audioUK;
        }

        public /* synthetic */ l(long j11, String str, String str2, String str3, int i11, kotlin.jvm.internal.v vVar) {
            this((i11 & 1) != 0 ? 0L : j11, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? "" : str2, (i11 & 8) != 0 ? "" : str3);
        }

        @f50.z("audioUK")
        public static /* synthetic */ void h() {
        }

        @f50.z("audioUS")
        public static /* synthetic */ void j() {
        }

        @f50.z("id")
        public static /* synthetic */ void l() {
        }

        @f50.z("text")
        public static /* synthetic */ void n() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @f50.a0
    public static final class m {

        @m80.k
        public static final b Companion = new b(null);

        /* renamed from: d, reason: collision with root package name */
        @w00.g
        @m80.k
        public static final yz.c0<f50.i<Object>>[] f69435d = {null, null, yz.e0.b(LazyThreadSafetyMode.PUBLICATION, new x00.a() { // from class: l3.w0
            @Override // x00.a
            public final Object invoke() {
                f50.i b11;
                b11 = i0.m.b();
                return b11;
            }
        })};

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f69436a;

        /* renamed from: b, reason: collision with root package name */
        public final int f69437b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final List<k> f69438c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        public static final /* synthetic */ class a implements j50.p0<m> {

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public static final a f69439a;

            @m80.k
            private static final h50.f descriptor;

            static {
                a aVar = new a();
                f69439a = aVar;
                j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.TopicResourceModel.KeyPointItem", aVar, 3);
                l2Var.q("keyPoint", true);
                l2Var.q("position", true);
                l2Var.q("sentences", true);
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
                return new f50.i[]{d3.f63348a, j50.z0.f63517a, m.f69435d[2].getValue()};
            }

            @Override // f50.e
            @m80.k
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final m e(@m80.k i50.f decoder) {
                int i11;
                int i12;
                String str;
                List list;
                kotlin.jvm.internal.g0.p(decoder, "decoder");
                h50.f fVar = descriptor;
                i50.d beginStructure = decoder.beginStructure(fVar);
                yz.c0[] c0VarArr = m.f69435d;
                if (beginStructure.decodeSequentially()) {
                    String decodeStringElement = beginStructure.decodeStringElement(fVar, 0);
                    int decodeIntElement = beginStructure.decodeIntElement(fVar, 1);
                    list = (List) beginStructure.decodeSerializableElement(fVar, 2, (f50.e) c0VarArr[2].getValue(), null);
                    str = decodeStringElement;
                    i11 = 7;
                    i12 = decodeIntElement;
                } else {
                    boolean z11 = true;
                    int i13 = 0;
                    String str2 = null;
                    List list2 = null;
                    int i14 = 0;
                    while (z11) {
                        int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                        if (decodeElementIndex == -1) {
                            z11 = false;
                        } else if (decodeElementIndex == 0) {
                            str2 = beginStructure.decodeStringElement(fVar, 0);
                            i13 |= 1;
                        } else if (decodeElementIndex == 1) {
                            i14 = beginStructure.decodeIntElement(fVar, 1);
                            i13 |= 2;
                        } else {
                            if (decodeElementIndex != 2) {
                                throw new UnknownFieldException(decodeElementIndex);
                            }
                            list2 = (List) beginStructure.decodeSerializableElement(fVar, 2, (f50.e) c0VarArr[2].getValue(), list2);
                            i13 |= 4;
                        }
                    }
                    i11 = i13;
                    i12 = i14;
                    str = str2;
                    list = list2;
                }
                beginStructure.endStructure(fVar);
                return new m(i11, str, i12, list, (j50.x2) null);
            }

            @Override // f50.b0
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public final void b(@m80.k i50.h encoder, @m80.k m value) {
                kotlin.jvm.internal.g0.p(encoder, "encoder");
                kotlin.jvm.internal.g0.p(value, "value");
                h50.f fVar = descriptor;
                i50.e beginStructure = encoder.beginStructure(fVar);
                m.o(value, beginStructure, fVar);
                beginStructure.endStructure(fVar);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
                this();
            }

            @m80.k
            public final f50.i<m> serializer() {
                return a.f69439a;
            }

            public b() {
            }
        }

        public m() {
            this((String) null, 0, (List) null, 7, (kotlin.jvm.internal.v) null);
        }

        public static final /* synthetic */ f50.i b() {
            return new j50.f(k.a.f69429a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ m h(m mVar, String str, int i11, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = mVar.f69436a;
            }
            if ((i12 & 2) != 0) {
                i11 = mVar.f69437b;
            }
            if ((i12 & 4) != 0) {
                list = mVar.f69438c;
            }
            return mVar.g(str, i11, list);
        }

        @w00.o
        public static final /* synthetic */ void o(m mVar, i50.e eVar, h50.f fVar) {
            yz.c0<f50.i<Object>>[] c0VarArr = f69435d;
            if (eVar.shouldEncodeElementDefault(fVar, 0) || !kotlin.jvm.internal.g0.g(mVar.f69436a, "")) {
                eVar.encodeStringElement(fVar, 0, mVar.f69436a);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 1) || mVar.f69437b != 0) {
                eVar.encodeIntElement(fVar, 1, mVar.f69437b);
            }
            if (!eVar.shouldEncodeElementDefault(fVar, 2) && kotlin.jvm.internal.g0.g(mVar.f69438c, a00.h0.J())) {
                return;
            }
            eVar.encodeSerializableElement(fVar, 2, c0VarArr[2].getValue(), mVar.f69438c);
        }

        @m80.k
        public final String d() {
            return this.f69436a;
        }

        public final int e() {
            return this.f69437b;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return kotlin.jvm.internal.g0.g(this.f69436a, mVar.f69436a) && this.f69437b == mVar.f69437b && kotlin.jvm.internal.g0.g(this.f69438c, mVar.f69438c);
        }

        @m80.k
        public final List<k> f() {
            return this.f69438c;
        }

        @m80.k
        public final m g(@m80.k String keyPoint, int i11, @m80.k List<k> sentences) {
            kotlin.jvm.internal.g0.p(keyPoint, "keyPoint");
            kotlin.jvm.internal.g0.p(sentences, "sentences");
            return new m(keyPoint, i11, sentences);
        }

        public int hashCode() {
            return (((this.f69436a.hashCode() * 31) + Integer.hashCode(this.f69437b)) * 31) + this.f69438c.hashCode();
        }

        @m80.k
        public final String i() {
            return this.f69436a;
        }

        public final int k() {
            return this.f69437b;
        }

        @m80.k
        public final List<k> m() {
            return this.f69438c;
        }

        @m80.k
        public String toString() {
            return "KeyPointItem(keyPoint=" + this.f69436a + ", position=" + this.f69437b + ", sentences=" + this.f69438c + ')';
        }

        public /* synthetic */ m(int i11, String str, int i12, List list, j50.x2 x2Var) {
            this.f69436a = (i11 & 1) == 0 ? "" : str;
            if ((i11 & 2) == 0) {
                this.f69437b = 0;
            } else {
                this.f69437b = i12;
            }
            if ((i11 & 4) == 0) {
                this.f69438c = a00.h0.J();
            } else {
                this.f69438c = list;
            }
        }

        public m(@m80.k String keyPoint, int i11, @m80.k List<k> sentences) {
            kotlin.jvm.internal.g0.p(keyPoint, "keyPoint");
            kotlin.jvm.internal.g0.p(sentences, "sentences");
            this.f69436a = keyPoint;
            this.f69437b = i11;
            this.f69438c = sentences;
        }

        public /* synthetic */ m(String str, int i11, List list, int i12, kotlin.jvm.internal.v vVar) {
            this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? a00.h0.J() : list);
        }

        @f50.z("keyPoint")
        public static /* synthetic */ void j() {
        }

        @f50.z("position")
        public static /* synthetic */ void l() {
        }

        @f50.z("sentences")
        public static /* synthetic */ void n() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @f50.a0
    public static final class o {

        @m80.k
        public static final b Companion = new b(null);

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f69450a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f69451b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        public static final /* synthetic */ class a implements j50.p0<o> {

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public static final a f69452a;

            @m80.k
            private static final h50.f descriptor;

            static {
                a aVar = new a();
                f69452a = aVar;
                j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.TopicResourceModel.MeanItem", aVar, 2);
                l2Var.q(com.baicizhan.main.wikiv2.studyv2.data.t.f26099a, true);
                l2Var.q("audio", true);
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

            @Override // j50.p0
            @m80.k
            public final f50.i<?>[] f() {
                d3 d3Var = d3.f63348a;
                return new f50.i[]{d3Var, d3Var};
            }

            @Override // f50.e
            @m80.k
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final o e(@m80.k i50.f decoder) {
                String str;
                String str2;
                int i11;
                kotlin.jvm.internal.g0.p(decoder, "decoder");
                h50.f fVar = descriptor;
                i50.d beginStructure = decoder.beginStructure(fVar);
                j50.x2 x2Var = null;
                if (beginStructure.decodeSequentially()) {
                    str = beginStructure.decodeStringElement(fVar, 0);
                    str2 = beginStructure.decodeStringElement(fVar, 1);
                    i11 = 3;
                } else {
                    boolean z11 = true;
                    int i12 = 0;
                    str = null;
                    String str3 = null;
                    while (z11) {
                        int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                        if (decodeElementIndex == -1) {
                            z11 = false;
                        } else if (decodeElementIndex == 0) {
                            str = beginStructure.decodeStringElement(fVar, 0);
                            i12 |= 1;
                        } else {
                            if (decodeElementIndex != 1) {
                                throw new UnknownFieldException(decodeElementIndex);
                            }
                            str3 = beginStructure.decodeStringElement(fVar, 1);
                            i12 |= 2;
                        }
                    }
                    str2 = str3;
                    i11 = i12;
                }
                beginStructure.endStructure(fVar);
                return new o(i11, str, str2, x2Var);
            }

            @Override // f50.b0
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public final void b(@m80.k i50.h encoder, @m80.k o value) {
                kotlin.jvm.internal.g0.p(encoder, "encoder");
                kotlin.jvm.internal.g0.p(value, "value");
                h50.f fVar = descriptor;
                i50.e beginStructure = encoder.beginStructure(fVar);
                o.i(value, beginStructure, fVar);
                beginStructure.endStructure(fVar);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
                this();
            }

            @m80.k
            public final f50.i<o> serializer() {
                return a.f69452a;
            }

            public b() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public o() {
            this((String) null, (String) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.v) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ o d(o oVar, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = oVar.f69450a;
            }
            if ((i11 & 2) != 0) {
                str2 = oVar.f69451b;
            }
            return oVar.c(str, str2);
        }

        @w00.o
        public static final /* synthetic */ void i(o oVar, i50.e eVar, h50.f fVar) {
            if (eVar.shouldEncodeElementDefault(fVar, 0) || !kotlin.jvm.internal.g0.g(oVar.f69450a, "")) {
                eVar.encodeStringElement(fVar, 0, oVar.f69450a);
            }
            if (!eVar.shouldEncodeElementDefault(fVar, 1) && kotlin.jvm.internal.g0.g(oVar.f69451b, "")) {
                return;
            }
            eVar.encodeStringElement(fVar, 1, oVar.f69451b);
        }

        @m80.k
        public final String a() {
            return this.f69450a;
        }

        @m80.k
        public final String b() {
            return this.f69451b;
        }

        @m80.k
        public final o c(@m80.k String mean, @m80.k String audio) {
            kotlin.jvm.internal.g0.p(mean, "mean");
            kotlin.jvm.internal.g0.p(audio, "audio");
            return new o(mean, audio);
        }

        @m80.k
        public final String e() {
            return this.f69451b;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return kotlin.jvm.internal.g0.g(this.f69450a, oVar.f69450a) && kotlin.jvm.internal.g0.g(this.f69451b, oVar.f69451b);
        }

        @m80.k
        public final String g() {
            return this.f69450a;
        }

        public int hashCode() {
            return (this.f69450a.hashCode() * 31) + this.f69451b.hashCode();
        }

        @m80.k
        public String toString() {
            return "MeanItem(mean=" + this.f69450a + ", audio=" + this.f69451b + ')';
        }

        public /* synthetic */ o(int i11, String str, String str2, j50.x2 x2Var) {
            if ((i11 & 1) == 0) {
                this.f69450a = "";
            } else {
                this.f69450a = str;
            }
            if ((i11 & 2) == 0) {
                this.f69451b = "";
            } else {
                this.f69451b = str2;
            }
        }

        public o(@m80.k String mean, @m80.k String audio) {
            kotlin.jvm.internal.g0.p(mean, "mean");
            kotlin.jvm.internal.g0.p(audio, "audio");
            this.f69450a = mean;
            this.f69451b = audio;
        }

        public /* synthetic */ o(String str, String str2, int i11, kotlin.jvm.internal.v vVar) {
            this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2);
        }

        @f50.z("audio")
        public static /* synthetic */ void f() {
        }

        @f50.z(com.baicizhan.main.wikiv2.studyv2.data.t.f26099a)
        public static /* synthetic */ void h() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @f50.a0
    public static final class q {

        @m80.k
        public static final b Companion = new b(null);

        /* renamed from: j, reason: collision with root package name */
        @w00.g
        @m80.k
        public static final yz.c0<f50.i<Object>>[] f69460j;

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final List<String> f69461a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final List<String> f69462b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final List<String> f69463c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public final List<String> f69464d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public final List<String> f69465e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public final List<String> f69466f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public final List<String> f69467g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public final List<String> f69468h;

        /* renamed from: i, reason: collision with root package name */
        @m80.l
        public final List<String> f69469i;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        public static final /* synthetic */ class a implements j50.p0<q> {

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public static final a f69470a;

            @m80.k
            private static final h50.f descriptor;

            static {
                a aVar = new a();
                f69470a = aVar;
                j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.TopicResourceModel.Phonics", aVar, 9);
                l2Var.q(sh.f.f88604w, true);
                l2Var.q("chunkColor", true);
                l2Var.q("chunkAudio", true);
                l2Var.q("specialChunk", true);
                l2Var.q("chunkAccent", true);
                l2Var.q("normalChunk", true);
                l2Var.q("normalChunkAudio", true);
                l2Var.q("normalChunkAccent", true);
                l2Var.q("normalSpecialChunk", true);
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
                yz.c0[] c0VarArr = q.f69460j;
                return new f50.i[]{c0VarArr[0].getValue(), c0VarArr[1].getValue(), c0VarArr[2].getValue(), g50.a.v((f50.i) c0VarArr[3].getValue()), g50.a.v((f50.i) c0VarArr[4].getValue()), g50.a.v((f50.i) c0VarArr[5].getValue()), g50.a.v((f50.i) c0VarArr[6].getValue()), g50.a.v((f50.i) c0VarArr[7].getValue()), g50.a.v((f50.i) c0VarArr[8].getValue())};
            }

            @Override // f50.e
            @m80.k
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final q e(@m80.k i50.f decoder) {
                int i11;
                List list;
                List list2;
                List list3;
                List list4;
                List list5;
                List list6;
                List list7;
                List list8;
                List list9;
                kotlin.jvm.internal.g0.p(decoder, "decoder");
                h50.f fVar = descriptor;
                i50.d beginStructure = decoder.beginStructure(fVar);
                yz.c0[] c0VarArr = q.f69460j;
                int i12 = 7;
                int i13 = 6;
                List list10 = null;
                if (beginStructure.decodeSequentially()) {
                    List list11 = (List) beginStructure.decodeSerializableElement(fVar, 0, (f50.e) c0VarArr[0].getValue(), null);
                    List list12 = (List) beginStructure.decodeSerializableElement(fVar, 1, (f50.e) c0VarArr[1].getValue(), null);
                    List list13 = (List) beginStructure.decodeSerializableElement(fVar, 2, (f50.e) c0VarArr[2].getValue(), null);
                    List list14 = (List) beginStructure.decodeNullableSerializableElement(fVar, 3, (f50.e) c0VarArr[3].getValue(), null);
                    List list15 = (List) beginStructure.decodeNullableSerializableElement(fVar, 4, (f50.e) c0VarArr[4].getValue(), null);
                    List list16 = (List) beginStructure.decodeNullableSerializableElement(fVar, 5, (f50.e) c0VarArr[5].getValue(), null);
                    List list17 = (List) beginStructure.decodeNullableSerializableElement(fVar, 6, (f50.e) c0VarArr[6].getValue(), null);
                    List list18 = (List) beginStructure.decodeNullableSerializableElement(fVar, 7, (f50.e) c0VarArr[7].getValue(), null);
                    list = (List) beginStructure.decodeNullableSerializableElement(fVar, 8, (f50.e) c0VarArr[8].getValue(), null);
                    list7 = list11;
                    list3 = list18;
                    list2 = list17;
                    list4 = list16;
                    list6 = list14;
                    i11 = 511;
                    list5 = list15;
                    list9 = list13;
                    list8 = list12;
                } else {
                    int i14 = 5;
                    int i15 = 3;
                    int i16 = 4;
                    int i17 = 2;
                    int i18 = 1;
                    boolean z11 = true;
                    int i19 = 0;
                    List list19 = null;
                    List list20 = null;
                    List list21 = null;
                    List list22 = null;
                    List list23 = null;
                    List list24 = null;
                    List list25 = null;
                    List list26 = null;
                    while (z11) {
                        int i21 = i13;
                        int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                        switch (decodeElementIndex) {
                            case -1:
                                z11 = false;
                                i12 = 7;
                                i13 = 6;
                                i18 = 1;
                                i17 = 2;
                                i15 = 3;
                                i16 = 4;
                                i14 = 5;
                            case 0:
                                list10 = (List) beginStructure.decodeSerializableElement(fVar, 0, (f50.e) c0VarArr[0].getValue(), list10);
                                i19 |= 1;
                                i12 = 7;
                                i13 = 6;
                                i18 = 1;
                                i17 = 2;
                                i15 = 3;
                                i16 = 4;
                                i14 = 5;
                            case 1:
                                list25 = (List) beginStructure.decodeSerializableElement(fVar, i18, (f50.e) c0VarArr[i18].getValue(), list25);
                                i19 |= 2;
                                i12 = 7;
                                i13 = 6;
                                i17 = 2;
                                i15 = 3;
                                i16 = 4;
                                i14 = 5;
                            case 2:
                                list26 = (List) beginStructure.decodeSerializableElement(fVar, i17, (f50.e) c0VarArr[i17].getValue(), list26);
                                i19 |= 4;
                                i12 = 7;
                                i13 = 6;
                                i15 = 3;
                                i16 = 4;
                                i14 = 5;
                            case 3:
                                list24 = (List) beginStructure.decodeNullableSerializableElement(fVar, i15, (f50.e) c0VarArr[i15].getValue(), list24);
                                i19 |= 8;
                                i12 = 7;
                                i13 = 6;
                                i16 = 4;
                                i14 = 5;
                            case 4:
                                list23 = (List) beginStructure.decodeNullableSerializableElement(fVar, i16, (f50.e) c0VarArr[i16].getValue(), list23);
                                i19 |= 16;
                                i12 = 7;
                                i13 = 6;
                                i14 = 5;
                            case 5:
                                list22 = (List) beginStructure.decodeNullableSerializableElement(fVar, i14, (f50.e) c0VarArr[i14].getValue(), list22);
                                i19 |= 32;
                                i12 = 7;
                                i13 = 6;
                            case 6:
                                list20 = (List) beginStructure.decodeNullableSerializableElement(fVar, i21, (f50.e) c0VarArr[i21].getValue(), list20);
                                i19 |= 64;
                                i13 = i21;
                                i12 = 7;
                            case 7:
                                list21 = (List) beginStructure.decodeNullableSerializableElement(fVar, i12, (f50.e) c0VarArr[i12].getValue(), list21);
                                i19 |= 128;
                                i13 = i21;
                            case 8:
                                list19 = (List) beginStructure.decodeNullableSerializableElement(fVar, 8, (f50.e) c0VarArr[8].getValue(), list19);
                                i19 |= 256;
                                i13 = i21;
                            default:
                                throw new UnknownFieldException(decodeElementIndex);
                        }
                    }
                    i11 = i19;
                    list = list19;
                    list2 = list20;
                    list3 = list21;
                    list4 = list22;
                    list5 = list23;
                    list6 = list24;
                    list7 = list10;
                    list8 = list25;
                    list9 = list26;
                }
                beginStructure.endStructure(fVar);
                return new q(i11, list7, list8, list9, list6, list5, list4, list2, list3, list, (j50.x2) null);
            }

            @Override // f50.b0
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public final void b(@m80.k i50.h encoder, @m80.k q value) {
                kotlin.jvm.internal.g0.p(encoder, "encoder");
                kotlin.jvm.internal.g0.p(value, "value");
                h50.f fVar = descriptor;
                i50.e beginStructure = encoder.beginStructure(fVar);
                q.W(value, beginStructure, fVar);
                beginStructure.endStructure(fVar);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
                this();
            }

            @m80.k
            public final f50.i<q> serializer() {
                return a.f69470a;
            }

            public b() {
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            f69460j = new yz.c0[]{yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.f1
                @Override // x00.a
                public final Object invoke() {
                    f50.i j11;
                    j11 = i0.q.j();
                    return j11;
                }
            }), yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.g1
                @Override // x00.a
                public final Object invoke() {
                    f50.i k11;
                    k11 = i0.q.k();
                    return k11;
                }
            }), yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.h1
                @Override // x00.a
                public final Object invoke() {
                    f50.i l11;
                    l11 = i0.q.l();
                    return l11;
                }
            }), yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.i1
                @Override // x00.a
                public final Object invoke() {
                    f50.i m11;
                    m11 = i0.q.m();
                    return m11;
                }
            }), yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.j1
                @Override // x00.a
                public final Object invoke() {
                    f50.i n11;
                    n11 = i0.q.n();
                    return n11;
                }
            }), yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.k1
                @Override // x00.a
                public final Object invoke() {
                    f50.i o11;
                    o11 = i0.q.o();
                    return o11;
                }
            }), yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.l1
                @Override // x00.a
                public final Object invoke() {
                    f50.i p11;
                    p11 = i0.q.p();
                    return p11;
                }
            }), yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.m1
                @Override // x00.a
                public final Object invoke() {
                    f50.i q11;
                    q11 = i0.q.q();
                    return q11;
                }
            }), yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.n1
                @Override // x00.a
                public final Object invoke() {
                    f50.i r11;
                    r11 = i0.q.r();
                    return r11;
                }
            })};
        }

        public q() {
            this((List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, 511, (kotlin.jvm.internal.v) null);
        }

        public static /* synthetic */ q D(q qVar, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = qVar.f69461a;
            }
            if ((i11 & 2) != 0) {
                list2 = qVar.f69462b;
            }
            if ((i11 & 4) != 0) {
                list3 = qVar.f69463c;
            }
            if ((i11 & 8) != 0) {
                list4 = qVar.f69464d;
            }
            if ((i11 & 16) != 0) {
                list5 = qVar.f69465e;
            }
            if ((i11 & 32) != 0) {
                list6 = qVar.f69466f;
            }
            if ((i11 & 64) != 0) {
                list7 = qVar.f69467g;
            }
            if ((i11 & 128) != 0) {
                list8 = qVar.f69468h;
            }
            if ((i11 & 256) != 0) {
                list9 = qVar.f69469i;
            }
            List list10 = list8;
            List list11 = list9;
            List list12 = list6;
            List list13 = list7;
            List list14 = list5;
            List list15 = list3;
            return qVar.C(list, list2, list15, list4, list14, list12, list13, list10, list11);
        }

        @w00.o
        public static final /* synthetic */ void W(q qVar, i50.e eVar, h50.f fVar) {
            yz.c0<f50.i<Object>>[] c0VarArr = f69460j;
            if (eVar.shouldEncodeElementDefault(fVar, 0) || !kotlin.jvm.internal.g0.g(qVar.f69461a, a00.h0.J())) {
                eVar.encodeSerializableElement(fVar, 0, c0VarArr[0].getValue(), qVar.f69461a);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 1) || !kotlin.jvm.internal.g0.g(qVar.f69462b, a00.h0.J())) {
                eVar.encodeSerializableElement(fVar, 1, c0VarArr[1].getValue(), qVar.f69462b);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 2) || !kotlin.jvm.internal.g0.g(qVar.f69463c, a00.h0.J())) {
                eVar.encodeSerializableElement(fVar, 2, c0VarArr[2].getValue(), qVar.f69463c);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 3) || qVar.f69464d != null) {
                eVar.encodeNullableSerializableElement(fVar, 3, c0VarArr[3].getValue(), qVar.f69464d);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 4) || qVar.f69465e != null) {
                eVar.encodeNullableSerializableElement(fVar, 4, c0VarArr[4].getValue(), qVar.f69465e);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 5) || qVar.f69466f != null) {
                eVar.encodeNullableSerializableElement(fVar, 5, c0VarArr[5].getValue(), qVar.f69466f);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 6) || qVar.f69467g != null) {
                eVar.encodeNullableSerializableElement(fVar, 6, c0VarArr[6].getValue(), qVar.f69467g);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 7) || qVar.f69468h != null) {
                eVar.encodeNullableSerializableElement(fVar, 7, c0VarArr[7].getValue(), qVar.f69468h);
            }
            if (!eVar.shouldEncodeElementDefault(fVar, 8) && qVar.f69469i == null) {
                return;
            }
            eVar.encodeNullableSerializableElement(fVar, 8, c0VarArr[8].getValue(), qVar.f69469i);
        }

        public static final /* synthetic */ f50.i j() {
            return new j50.f(d3.f63348a);
        }

        public static final /* synthetic */ f50.i k() {
            return new j50.f(d3.f63348a);
        }

        public static final /* synthetic */ f50.i l() {
            return new j50.f(d3.f63348a);
        }

        public static final /* synthetic */ f50.i m() {
            return new j50.f(d3.f63348a);
        }

        public static final /* synthetic */ f50.i n() {
            return new j50.f(d3.f63348a);
        }

        public static final /* synthetic */ f50.i o() {
            return new j50.f(d3.f63348a);
        }

        public static final /* synthetic */ f50.i p() {
            return new j50.f(d3.f63348a);
        }

        public static final /* synthetic */ f50.i q() {
            return new j50.f(d3.f63348a);
        }

        public static final /* synthetic */ f50.i r() {
            return new j50.f(d3.f63348a);
        }

        @m80.l
        public final List<String> A() {
            return this.f69468h;
        }

        @m80.l
        public final List<String> B() {
            return this.f69469i;
        }

        @m80.k
        public final q C(@m80.k List<String> chunk, @m80.k List<String> chunkColor, @m80.k List<String> chunkAudio, @m80.l List<String> list, @m80.l List<String> list2, @m80.l List<String> list3, @m80.l List<String> list4, @m80.l List<String> list5, @m80.l List<String> list6) {
            kotlin.jvm.internal.g0.p(chunk, "chunk");
            kotlin.jvm.internal.g0.p(chunkColor, "chunkColor");
            kotlin.jvm.internal.g0.p(chunkAudio, "chunkAudio");
            return new q(chunk, chunkColor, chunkAudio, list, list2, list3, list4, list5, list6);
        }

        @m80.k
        public final List<String> E() {
            return this.f69461a;
        }

        @m80.l
        public final List<String> G() {
            return this.f69465e;
        }

        @m80.k
        public final List<String> I() {
            return this.f69463c;
        }

        @m80.k
        public final List<String> K() {
            return this.f69462b;
        }

        @m80.l
        public final List<String> M() {
            return this.f69466f;
        }

        @m80.l
        public final List<String> O() {
            return this.f69468h;
        }

        @m80.l
        public final List<String> Q() {
            return this.f69467g;
        }

        @m80.l
        public final List<String> S() {
            return this.f69469i;
        }

        @m80.l
        public final List<String> U() {
            return this.f69464d;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return kotlin.jvm.internal.g0.g(this.f69461a, qVar.f69461a) && kotlin.jvm.internal.g0.g(this.f69462b, qVar.f69462b) && kotlin.jvm.internal.g0.g(this.f69463c, qVar.f69463c) && kotlin.jvm.internal.g0.g(this.f69464d, qVar.f69464d) && kotlin.jvm.internal.g0.g(this.f69465e, qVar.f69465e) && kotlin.jvm.internal.g0.g(this.f69466f, qVar.f69466f) && kotlin.jvm.internal.g0.g(this.f69467g, qVar.f69467g) && kotlin.jvm.internal.g0.g(this.f69468h, qVar.f69468h) && kotlin.jvm.internal.g0.g(this.f69469i, qVar.f69469i);
        }

        public int hashCode() {
            int hashCode = ((((this.f69461a.hashCode() * 31) + this.f69462b.hashCode()) * 31) + this.f69463c.hashCode()) * 31;
            List<String> list = this.f69464d;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            List<String> list2 = this.f69465e;
            int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<String> list3 = this.f69466f;
            int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
            List<String> list4 = this.f69467g;
            int hashCode5 = (hashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
            List<String> list5 = this.f69468h;
            int hashCode6 = (hashCode5 + (list5 == null ? 0 : list5.hashCode())) * 31;
            List<String> list6 = this.f69469i;
            return hashCode6 + (list6 != null ? list6.hashCode() : 0);
        }

        @m80.k
        public final List<String> t() {
            return this.f69461a;
        }

        @m80.k
        public String toString() {
            return "Phonics(chunk=" + this.f69461a + ", chunkColor=" + this.f69462b + ", chunkAudio=" + this.f69463c + ", specialChunk=" + this.f69464d + ", chunkAccent=" + this.f69465e + ", normalChunk=" + this.f69466f + ", normalChunkAudio=" + this.f69467g + ", normalChunkAccent=" + this.f69468h + ", normalSpecialChunk=" + this.f69469i + ')';
        }

        @m80.k
        public final List<String> u() {
            return this.f69462b;
        }

        @m80.k
        public final List<String> v() {
            return this.f69463c;
        }

        @m80.l
        public final List<String> w() {
            return this.f69464d;
        }

        @m80.l
        public final List<String> x() {
            return this.f69465e;
        }

        @m80.l
        public final List<String> y() {
            return this.f69466f;
        }

        @m80.l
        public final List<String> z() {
            return this.f69467g;
        }

        public /* synthetic */ q(int i11, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, j50.x2 x2Var) {
            this.f69461a = (i11 & 1) == 0 ? a00.h0.J() : list;
            if ((i11 & 2) == 0) {
                this.f69462b = a00.h0.J();
            } else {
                this.f69462b = list2;
            }
            if ((i11 & 4) == 0) {
                this.f69463c = a00.h0.J();
            } else {
                this.f69463c = list3;
            }
            if ((i11 & 8) == 0) {
                this.f69464d = null;
            } else {
                this.f69464d = list4;
            }
            if ((i11 & 16) == 0) {
                this.f69465e = null;
            } else {
                this.f69465e = list5;
            }
            if ((i11 & 32) == 0) {
                this.f69466f = null;
            } else {
                this.f69466f = list6;
            }
            if ((i11 & 64) == 0) {
                this.f69467g = null;
            } else {
                this.f69467g = list7;
            }
            if ((i11 & 128) == 0) {
                this.f69468h = null;
            } else {
                this.f69468h = list8;
            }
            if ((i11 & 256) == 0) {
                this.f69469i = null;
            } else {
                this.f69469i = list9;
            }
        }

        public q(@m80.k List<String> chunk, @m80.k List<String> chunkColor, @m80.k List<String> chunkAudio, @m80.l List<String> list, @m80.l List<String> list2, @m80.l List<String> list3, @m80.l List<String> list4, @m80.l List<String> list5, @m80.l List<String> list6) {
            kotlin.jvm.internal.g0.p(chunk, "chunk");
            kotlin.jvm.internal.g0.p(chunkColor, "chunkColor");
            kotlin.jvm.internal.g0.p(chunkAudio, "chunkAudio");
            this.f69461a = chunk;
            this.f69462b = chunkColor;
            this.f69463c = chunkAudio;
            this.f69464d = list;
            this.f69465e = list2;
            this.f69466f = list3;
            this.f69467g = list4;
            this.f69468h = list5;
            this.f69469i = list6;
        }

        @f50.z(sh.f.f88604w)
        public static /* synthetic */ void F() {
        }

        @f50.z("chunkAccent")
        public static /* synthetic */ void H() {
        }

        @f50.z("chunkAudio")
        public static /* synthetic */ void J() {
        }

        @f50.z("chunkColor")
        public static /* synthetic */ void L() {
        }

        @f50.z("normalChunk")
        public static /* synthetic */ void N() {
        }

        @f50.z("normalChunkAccent")
        public static /* synthetic */ void P() {
        }

        @f50.z("normalChunkAudio")
        public static /* synthetic */ void R() {
        }

        @f50.z("normalSpecialChunk")
        public static /* synthetic */ void T() {
        }

        @f50.z("specialChunk")
        public static /* synthetic */ void V() {
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ q(java.util.List r2, java.util.List r3, java.util.List r4, java.util.List r5, java.util.List r6, java.util.List r7, java.util.List r8, java.util.List r9, java.util.List r10, int r11, kotlin.jvm.internal.v r12) {
            /*
                r1 = this;
                r12 = r11 & 1
                if (r12 == 0) goto L8
                java.util.List r2 = a00.h0.J()
            L8:
                r12 = r11 & 2
                if (r12 == 0) goto L10
                java.util.List r3 = a00.h0.J()
            L10:
                r12 = r11 & 4
                if (r12 == 0) goto L18
                java.util.List r4 = a00.h0.J()
            L18:
                r12 = r11 & 8
                r0 = 0
                if (r12 == 0) goto L1e
                r5 = r0
            L1e:
                r12 = r11 & 16
                if (r12 == 0) goto L23
                r6 = r0
            L23:
                r12 = r11 & 32
                if (r12 == 0) goto L28
                r7 = r0
            L28:
                r12 = r11 & 64
                if (r12 == 0) goto L2d
                r8 = r0
            L2d:
                r12 = r11 & 128(0x80, float:1.794E-43)
                if (r12 == 0) goto L32
                r9 = r0
            L32:
                r11 = r11 & 256(0x100, float:3.59E-43)
                if (r11 == 0) goto L41
                r12 = r0
                r10 = r8
                r11 = r9
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L4b
            L41:
                r12 = r10
                r11 = r9
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L4b:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: l3.i0.q.<init>(java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, int, kotlin.jvm.internal.v):void");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @f50.a0
    public static final class s {

        @m80.k
        public static final b Companion = new b(null);

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f69476a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f69477b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        public static final /* synthetic */ class a implements j50.p0<s> {

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public static final a f69478a;

            @m80.k
            private static final h50.f descriptor;

            static {
                a aVar = new a();
                f69478a = aVar;
                j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.TopicResourceModel.ProPhrase", aVar, 2);
                l2Var.q(com.baicizhan.main.wikiv2.studyv2.data.t.f26100b, false);
                l2Var.q(com.baicizhan.main.wikiv2.studyv2.data.t.f26099a, false);
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

            @Override // j50.p0
            @m80.k
            public final f50.i<?>[] f() {
                d3 d3Var = d3.f63348a;
                return new f50.i[]{d3Var, d3Var};
            }

            @Override // f50.e
            @m80.k
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final s e(@m80.k i50.f decoder) {
                String str;
                String str2;
                int i11;
                kotlin.jvm.internal.g0.p(decoder, "decoder");
                h50.f fVar = descriptor;
                i50.d beginStructure = decoder.beginStructure(fVar);
                j50.x2 x2Var = null;
                if (beginStructure.decodeSequentially()) {
                    str = beginStructure.decodeStringElement(fVar, 0);
                    str2 = beginStructure.decodeStringElement(fVar, 1);
                    i11 = 3;
                } else {
                    boolean z11 = true;
                    int i12 = 0;
                    str = null;
                    String str3 = null;
                    while (z11) {
                        int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                        if (decodeElementIndex == -1) {
                            z11 = false;
                        } else if (decodeElementIndex == 0) {
                            str = beginStructure.decodeStringElement(fVar, 0);
                            i12 |= 1;
                        } else {
                            if (decodeElementIndex != 1) {
                                throw new UnknownFieldException(decodeElementIndex);
                            }
                            str3 = beginStructure.decodeStringElement(fVar, 1);
                            i12 |= 2;
                        }
                    }
                    str2 = str3;
                    i11 = i12;
                }
                beginStructure.endStructure(fVar);
                return new s(i11, str, str2, x2Var);
            }

            @Override // f50.b0
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public final void b(@m80.k i50.h encoder, @m80.k s value) {
                kotlin.jvm.internal.g0.p(encoder, "encoder");
                kotlin.jvm.internal.g0.p(value, "value");
                h50.f fVar = descriptor;
                i50.e beginStructure = encoder.beginStructure(fVar);
                s.i(value, beginStructure, fVar);
                beginStructure.endStructure(fVar);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
                this();
            }

            @m80.k
            public final f50.i<s> serializer() {
                return a.f69478a;
            }

            public b() {
            }
        }

        public /* synthetic */ s(int i11, String str, String str2, j50.x2 x2Var) {
            if (3 != (i11 & 3)) {
                j50.h2.b(i11, 3, a.f69478a.a());
            }
            this.f69476a = str;
            this.f69477b = str2;
        }

        public static /* synthetic */ s d(s sVar, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = sVar.f69476a;
            }
            if ((i11 & 2) != 0) {
                str2 = sVar.f69477b;
            }
            return sVar.c(str, str2);
        }

        @w00.o
        public static final /* synthetic */ void i(s sVar, i50.e eVar, h50.f fVar) {
            eVar.encodeStringElement(fVar, 0, sVar.f69476a);
            eVar.encodeStringElement(fVar, 1, sVar.f69477b);
        }

        @m80.k
        public final String a() {
            return this.f69476a;
        }

        @m80.k
        public final String b() {
            return this.f69477b;
        }

        @m80.k
        public final s c(@m80.k String phrase, @m80.k String mean) {
            kotlin.jvm.internal.g0.p(phrase, "phrase");
            kotlin.jvm.internal.g0.p(mean, "mean");
            return new s(phrase, mean);
        }

        @m80.k
        public final String e() {
            return this.f69477b;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof s)) {
                return false;
            }
            s sVar = (s) obj;
            return kotlin.jvm.internal.g0.g(this.f69476a, sVar.f69476a) && kotlin.jvm.internal.g0.g(this.f69477b, sVar.f69477b);
        }

        @m80.k
        public final String g() {
            return this.f69476a;
        }

        public int hashCode() {
            return (this.f69476a.hashCode() * 31) + this.f69477b.hashCode();
        }

        @m80.k
        public String toString() {
            return "ProPhrase(phrase=" + this.f69476a + ", mean=" + this.f69477b + ')';
        }

        public s(@m80.k String phrase, @m80.k String mean) {
            kotlin.jvm.internal.g0.p(phrase, "phrase");
            kotlin.jvm.internal.g0.p(mean, "mean");
            this.f69476a = phrase;
            this.f69477b = mean;
        }

        @f50.z(com.baicizhan.main.wikiv2.studyv2.data.t.f26099a)
        public static /* synthetic */ void f() {
        }

        @f50.z(com.baicizhan.main.wikiv2.studyv2.data.t.f26100b)
        public static /* synthetic */ void h() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @f50.a0
    public static final class t {

        @m80.k
        public static final b Companion = new b(null);

        /* renamed from: a, reason: collision with root package name */
        public final int f69479a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f69480b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final String f69481c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final String f69482d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        public static final /* synthetic */ class a implements j50.p0<t> {

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public static final a f69483a;

            @m80.k
            private static final h50.f descriptor;

            static {
                a aVar = new a();
                f69483a = aVar;
                j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.TopicResourceModel.RandomItem", aVar, 4);
                l2Var.q("topicId", false);
                l2Var.q("word", false);
                l2Var.q(com.baicizhan.main.wikiv2.studyv2.data.t.f26099a, false);
                l2Var.q("image", false);
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

            @Override // j50.p0
            @m80.k
            public final f50.i<?>[] f() {
                d3 d3Var = d3.f63348a;
                return new f50.i[]{j50.z0.f63517a, d3Var, d3Var, d3Var};
            }

            @Override // f50.e
            @m80.k
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final t e(@m80.k i50.f decoder) {
                int i11;
                String str;
                String str2;
                String str3;
                int i12;
                kotlin.jvm.internal.g0.p(decoder, "decoder");
                h50.f fVar = descriptor;
                i50.d beginStructure = decoder.beginStructure(fVar);
                if (beginStructure.decodeSequentially()) {
                    i11 = beginStructure.decodeIntElement(fVar, 0);
                    String decodeStringElement = beginStructure.decodeStringElement(fVar, 1);
                    String decodeStringElement2 = beginStructure.decodeStringElement(fVar, 2);
                    str = beginStructure.decodeStringElement(fVar, 3);
                    str2 = decodeStringElement2;
                    str3 = decodeStringElement;
                    i12 = 15;
                } else {
                    String str4 = null;
                    String str5 = null;
                    String str6 = null;
                    boolean z11 = true;
                    i11 = 0;
                    int i13 = 0;
                    while (z11) {
                        int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                        if (decodeElementIndex == -1) {
                            z11 = false;
                        } else if (decodeElementIndex == 0) {
                            i11 = beginStructure.decodeIntElement(fVar, 0);
                            i13 |= 1;
                        } else if (decodeElementIndex == 1) {
                            str6 = beginStructure.decodeStringElement(fVar, 1);
                            i13 |= 2;
                        } else if (decodeElementIndex == 2) {
                            str5 = beginStructure.decodeStringElement(fVar, 2);
                            i13 |= 4;
                        } else {
                            if (decodeElementIndex != 3) {
                                throw new UnknownFieldException(decodeElementIndex);
                            }
                            str4 = beginStructure.decodeStringElement(fVar, 3);
                            i13 |= 8;
                        }
                    }
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    i12 = i13;
                }
                int i14 = i11;
                beginStructure.endStructure(fVar);
                return new t(i12, i14, str3, str2, str, null);
            }

            @Override // f50.b0
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public final void b(@m80.k i50.h encoder, @m80.k t value) {
                kotlin.jvm.internal.g0.p(encoder, "encoder");
                kotlin.jvm.internal.g0.p(value, "value");
                h50.f fVar = descriptor;
                i50.e beginStructure = encoder.beginStructure(fVar);
                t.o(value, beginStructure, fVar);
                beginStructure.endStructure(fVar);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
                this();
            }

            @m80.k
            public final f50.i<t> serializer() {
                return a.f69483a;
            }

            public b() {
            }
        }

        public /* synthetic */ t(int i11, int i12, String str, String str2, String str3, j50.x2 x2Var) {
            if (15 != (i11 & 15)) {
                j50.h2.b(i11, 15, a.f69483a.a());
            }
            this.f69479a = i12;
            this.f69480b = str;
            this.f69481c = str2;
            this.f69482d = str3;
        }

        public static /* synthetic */ t f(t tVar, int i11, String str, String str2, String str3, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = tVar.f69479a;
            }
            if ((i12 & 2) != 0) {
                str = tVar.f69480b;
            }
            if ((i12 & 4) != 0) {
                str2 = tVar.f69481c;
            }
            if ((i12 & 8) != 0) {
                str3 = tVar.f69482d;
            }
            return tVar.e(i11, str, str2, str3);
        }

        @w00.o
        public static final /* synthetic */ void o(t tVar, i50.e eVar, h50.f fVar) {
            eVar.encodeIntElement(fVar, 0, tVar.f69479a);
            eVar.encodeStringElement(fVar, 1, tVar.f69480b);
            eVar.encodeStringElement(fVar, 2, tVar.f69481c);
            eVar.encodeStringElement(fVar, 3, tVar.f69482d);
        }

        public final int a() {
            return this.f69479a;
        }

        @m80.k
        public final String b() {
            return this.f69480b;
        }

        @m80.k
        public final String c() {
            return this.f69481c;
        }

        @m80.k
        public final String d() {
            return this.f69482d;
        }

        @m80.k
        public final t e(int i11, @m80.k String word, @m80.k String mean, @m80.k String image) {
            kotlin.jvm.internal.g0.p(word, "word");
            kotlin.jvm.internal.g0.p(mean, "mean");
            kotlin.jvm.internal.g0.p(image, "image");
            return new t(i11, word, mean, image);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof t)) {
                return false;
            }
            t tVar = (t) obj;
            return this.f69479a == tVar.f69479a && kotlin.jvm.internal.g0.g(this.f69480b, tVar.f69480b) && kotlin.jvm.internal.g0.g(this.f69481c, tVar.f69481c) && kotlin.jvm.internal.g0.g(this.f69482d, tVar.f69482d);
        }

        @m80.k
        public final String g() {
            return this.f69482d;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.f69479a) * 31) + this.f69480b.hashCode()) * 31) + this.f69481c.hashCode()) * 31) + this.f69482d.hashCode();
        }

        @m80.k
        public final String i() {
            return this.f69481c;
        }

        public final int k() {
            return this.f69479a;
        }

        @m80.k
        public final String m() {
            return this.f69480b;
        }

        @m80.k
        public String toString() {
            return "RandomItem(topicId=" + this.f69479a + ", word=" + this.f69480b + ", mean=" + this.f69481c + ", image=" + this.f69482d + ')';
        }

        public t(int i11, @m80.k String word, @m80.k String mean, @m80.k String image) {
            kotlin.jvm.internal.g0.p(word, "word");
            kotlin.jvm.internal.g0.p(mean, "mean");
            kotlin.jvm.internal.g0.p(image, "image");
            this.f69479a = i11;
            this.f69480b = word;
            this.f69481c = mean;
            this.f69482d = image;
        }

        @f50.z("image")
        public static /* synthetic */ void h() {
        }

        @f50.z(com.baicizhan.main.wikiv2.studyv2.data.t.f26099a)
        public static /* synthetic */ void j() {
        }

        @f50.z("topicId")
        public static /* synthetic */ void l() {
        }

        @f50.z("word")
        public static /* synthetic */ void n() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @f50.a0
    public static final class v {

        @m80.k
        public static final b Companion = new b(null);

        /* renamed from: c, reason: collision with root package name */
        @w00.g
        @m80.k
        public static final yz.c0<f50.i<Object>>[] f69503c;

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final List<String> f69504a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final List<String> f69505b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        public static final /* synthetic */ class a implements j50.p0<v> {

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public static final a f69506a;

            @m80.k
            private static final h50.f descriptor;

            static {
                a aVar = new a();
                f69506a = aVar;
                j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.TopicResourceModel.SelectChunk", aVar, 2);
                l2Var.q(sh.f.f88604w, true);
                l2Var.q("options", true);
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
                yz.c0[] c0VarArr = v.f69503c;
                return new f50.i[]{c0VarArr[0].getValue(), c0VarArr[1].getValue()};
            }

            @Override // f50.e
            @m80.k
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final v e(@m80.k i50.f decoder) {
                List list;
                List list2;
                int i11;
                kotlin.jvm.internal.g0.p(decoder, "decoder");
                h50.f fVar = descriptor;
                i50.d beginStructure = decoder.beginStructure(fVar);
                yz.c0[] c0VarArr = v.f69503c;
                j50.x2 x2Var = null;
                if (beginStructure.decodeSequentially()) {
                    list2 = (List) beginStructure.decodeSerializableElement(fVar, 0, (f50.e) c0VarArr[0].getValue(), null);
                    list = (List) beginStructure.decodeSerializableElement(fVar, 1, (f50.e) c0VarArr[1].getValue(), null);
                    i11 = 3;
                } else {
                    boolean z11 = true;
                    int i12 = 0;
                    List list3 = null;
                    List list4 = null;
                    while (z11) {
                        int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                        if (decodeElementIndex == -1) {
                            z11 = false;
                        } else if (decodeElementIndex == 0) {
                            list4 = (List) beginStructure.decodeSerializableElement(fVar, 0, (f50.e) c0VarArr[0].getValue(), list4);
                            i12 |= 1;
                        } else {
                            if (decodeElementIndex != 1) {
                                throw new UnknownFieldException(decodeElementIndex);
                            }
                            list3 = (List) beginStructure.decodeSerializableElement(fVar, 1, (f50.e) c0VarArr[1].getValue(), list3);
                            i12 |= 2;
                        }
                    }
                    list = list3;
                    list2 = list4;
                    i11 = i12;
                }
                beginStructure.endStructure(fVar);
                return new v(i11, list2, list, x2Var);
            }

            @Override // f50.b0
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public final void b(@m80.k i50.h encoder, @m80.k v value) {
                kotlin.jvm.internal.g0.p(encoder, "encoder");
                kotlin.jvm.internal.g0.p(value, "value");
                h50.f fVar = descriptor;
                i50.e beginStructure = encoder.beginStructure(fVar);
                v.n(value, beginStructure, fVar);
                beginStructure.endStructure(fVar);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
                this();
            }

            @m80.k
            public final f50.i<v> serializer() {
                return a.f69506a;
            }

            public b() {
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            f69503c = new yz.c0[]{yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.c2
                @Override // x00.a
                public final Object invoke() {
                    f50.i c11;
                    c11 = i0.v.c();
                    return c11;
                }
            }), yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.d2
                @Override // x00.a
                public final Object invoke() {
                    f50.i d11;
                    d11 = i0.v.d();
                    return d11;
                }
            })};
        }

        /* JADX WARN: Multi-variable type inference failed */
        public v() {
            this((List) null, (List) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.v) (0 == true ? 1 : 0));
        }

        public static final /* synthetic */ f50.i c() {
            return new j50.f(d3.f63348a);
        }

        public static final /* synthetic */ f50.i d() {
            return new j50.f(d3.f63348a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ v i(v vVar, List list, List list2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = vVar.f69504a;
            }
            if ((i11 & 2) != 0) {
                list2 = vVar.f69505b;
            }
            return vVar.h(list, list2);
        }

        @w00.o
        public static final /* synthetic */ void n(v vVar, i50.e eVar, h50.f fVar) {
            yz.c0<f50.i<Object>>[] c0VarArr = f69503c;
            if (eVar.shouldEncodeElementDefault(fVar, 0) || !kotlin.jvm.internal.g0.g(vVar.f69504a, a00.h0.J())) {
                eVar.encodeSerializableElement(fVar, 0, c0VarArr[0].getValue(), vVar.f69504a);
            }
            if (!eVar.shouldEncodeElementDefault(fVar, 1) && kotlin.jvm.internal.g0.g(vVar.f69505b, a00.h0.J())) {
                return;
            }
            eVar.encodeSerializableElement(fVar, 1, c0VarArr[1].getValue(), vVar.f69505b);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof v)) {
                return false;
            }
            v vVar = (v) obj;
            return kotlin.jvm.internal.g0.g(this.f69504a, vVar.f69504a) && kotlin.jvm.internal.g0.g(this.f69505b, vVar.f69505b);
        }

        @m80.k
        public final List<String> f() {
            return this.f69504a;
        }

        @m80.k
        public final List<String> g() {
            return this.f69505b;
        }

        @m80.k
        public final v h(@m80.k List<String> chunk, @m80.k List<String> options) {
            kotlin.jvm.internal.g0.p(chunk, "chunk");
            kotlin.jvm.internal.g0.p(options, "options");
            return new v(chunk, options);
        }

        public int hashCode() {
            return (this.f69504a.hashCode() * 31) + this.f69505b.hashCode();
        }

        @m80.k
        public final List<String> j() {
            return this.f69504a;
        }

        @m80.k
        public final List<String> l() {
            return this.f69505b;
        }

        @m80.k
        public String toString() {
            return "SelectChunk(chunk=" + this.f69504a + ", options=" + this.f69505b + ')';
        }

        public /* synthetic */ v(int i11, List list, List list2, j50.x2 x2Var) {
            this.f69504a = (i11 & 1) == 0 ? a00.h0.J() : list;
            if ((i11 & 2) == 0) {
                this.f69505b = a00.h0.J();
            } else {
                this.f69505b = list2;
            }
        }

        public v(@m80.k List<String> chunk, @m80.k List<String> options) {
            kotlin.jvm.internal.g0.p(chunk, "chunk");
            kotlin.jvm.internal.g0.p(options, "options");
            this.f69504a = chunk;
            this.f69505b = options;
        }

        public /* synthetic */ v(List list, List list2, int i11, kotlin.jvm.internal.v vVar) {
            this((i11 & 1) != 0 ? a00.h0.J() : list, (i11 & 2) != 0 ? a00.h0.J() : list2);
        }

        @f50.z(sh.f.f88604w)
        public static /* synthetic */ void k() {
        }

        @f50.z("options")
        public static /* synthetic */ void m() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @f50.a0
    public static final class x {

        @m80.k
        public static final b Companion = new b(null);

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f69529a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f69530b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        public static final /* synthetic */ class a implements j50.p0<x> {

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public static final a f69531a;

            @m80.k
            private static final h50.f descriptor;

            static {
                a aVar = new a();
                f69531a = aVar;
                j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.TopicResourceModel.SentenceChunkItem", aVar, 2);
                l2Var.q("text", true);
                l2Var.q(k3.u0.f65631e, true);
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

            @Override // j50.p0
            @m80.k
            public final f50.i<?>[] f() {
                d3 d3Var = d3.f63348a;
                return new f50.i[]{d3Var, d3Var};
            }

            @Override // f50.e
            @m80.k
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final x e(@m80.k i50.f decoder) {
                String str;
                String str2;
                int i11;
                kotlin.jvm.internal.g0.p(decoder, "decoder");
                h50.f fVar = descriptor;
                i50.d beginStructure = decoder.beginStructure(fVar);
                j50.x2 x2Var = null;
                if (beginStructure.decodeSequentially()) {
                    str = beginStructure.decodeStringElement(fVar, 0);
                    str2 = beginStructure.decodeStringElement(fVar, 1);
                    i11 = 3;
                } else {
                    boolean z11 = true;
                    int i12 = 0;
                    str = null;
                    String str3 = null;
                    while (z11) {
                        int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                        if (decodeElementIndex == -1) {
                            z11 = false;
                        } else if (decodeElementIndex == 0) {
                            str = beginStructure.decodeStringElement(fVar, 0);
                            i12 |= 1;
                        } else {
                            if (decodeElementIndex != 1) {
                                throw new UnknownFieldException(decodeElementIndex);
                            }
                            str3 = beginStructure.decodeStringElement(fVar, 1);
                            i12 |= 2;
                        }
                    }
                    str2 = str3;
                    i11 = i12;
                }
                beginStructure.endStructure(fVar);
                return new x(i11, str, str2, x2Var);
            }

            @Override // f50.b0
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public final void b(@m80.k i50.h encoder, @m80.k x value) {
                kotlin.jvm.internal.g0.p(encoder, "encoder");
                kotlin.jvm.internal.g0.p(value, "value");
                h50.f fVar = descriptor;
                i50.e beginStructure = encoder.beginStructure(fVar);
                x.i(value, beginStructure, fVar);
                beginStructure.endStructure(fVar);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
                this();
            }

            @m80.k
            public final f50.i<x> serializer() {
                return a.f69531a;
            }

            public b() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public x() {
            this((String) null, (String) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.v) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ x d(x xVar, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = xVar.f69529a;
            }
            if ((i11 & 2) != 0) {
                str2 = xVar.f69530b;
            }
            return xVar.c(str, str2);
        }

        @w00.o
        public static final /* synthetic */ void i(x xVar, i50.e eVar, h50.f fVar) {
            if (eVar.shouldEncodeElementDefault(fVar, 0) || !kotlin.jvm.internal.g0.g(xVar.f69529a, "")) {
                eVar.encodeStringElement(fVar, 0, xVar.f69529a);
            }
            if (!eVar.shouldEncodeElementDefault(fVar, 1) && kotlin.jvm.internal.g0.g(xVar.f69530b, "")) {
                return;
            }
            eVar.encodeStringElement(fVar, 1, xVar.f69530b);
        }

        @m80.k
        public final String a() {
            return this.f69529a;
        }

        @m80.k
        public final String b() {
            return this.f69530b;
        }

        @m80.k
        public final x c(@m80.k String text, @m80.k String kana) {
            kotlin.jvm.internal.g0.p(text, "text");
            kotlin.jvm.internal.g0.p(kana, "kana");
            return new x(text, kana);
        }

        @m80.k
        public final String e() {
            return this.f69530b;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof x)) {
                return false;
            }
            x xVar = (x) obj;
            return kotlin.jvm.internal.g0.g(this.f69529a, xVar.f69529a) && kotlin.jvm.internal.g0.g(this.f69530b, xVar.f69530b);
        }

        @m80.k
        public final String g() {
            return this.f69529a;
        }

        public int hashCode() {
            return (this.f69529a.hashCode() * 31) + this.f69530b.hashCode();
        }

        @m80.k
        public String toString() {
            return "SentenceChunkItem(text=" + this.f69529a + ", kana=" + this.f69530b + ')';
        }

        public /* synthetic */ x(int i11, String str, String str2, j50.x2 x2Var) {
            if ((i11 & 1) == 0) {
                this.f69529a = "";
            } else {
                this.f69529a = str;
            }
            if ((i11 & 2) == 0) {
                this.f69530b = "";
            } else {
                this.f69530b = str2;
            }
        }

        public x(@m80.k String text, @m80.k String kana) {
            kotlin.jvm.internal.g0.p(text, "text");
            kotlin.jvm.internal.g0.p(kana, "kana");
            this.f69529a = text;
            this.f69530b = kana;
        }

        public /* synthetic */ x(String str, String str2, int i11, kotlin.jvm.internal.v vVar) {
            this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2);
        }

        @f50.z(k3.u0.f65631e)
        public static /* synthetic */ void f() {
        }

        @f50.z("text")
        public static /* synthetic */ void h() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @f50.a0
    public static final class y {

        @m80.k
        public static final b Companion = new b(null);

        /* renamed from: a, reason: collision with root package name */
        public final int f69532a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f69533b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final String f69534c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final String f69535d;

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final String f69536e;

        /* renamed from: f, reason: collision with root package name */
        @m80.k
        public final String f69537f;

        /* renamed from: g, reason: collision with root package name */
        @m80.k
        public final String f69538g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f69539h;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        public static final /* synthetic */ class a implements j50.p0<y> {

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public static final a f69540a;

            @m80.k
            private static final h50.f descriptor;

            static {
                a aVar = new a();
                f69540a = aVar;
                j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.TopicResourceModel.Similar", aVar, 8);
                l2Var.q("topicId", false);
                l2Var.q("word", false);
                l2Var.q("meanType", false);
                l2Var.q(com.baicizhan.main.wikiv2.studyv2.data.t.f26099a, false);
                l2Var.q("image", false);
                l2Var.q("audioUS", false);
                l2Var.q("audioUK", false);
                l2Var.q(ma.b.O, false);
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

            @Override // j50.p0
            @m80.k
            public final f50.i<?>[] f() {
                d3 d3Var = d3.f63348a;
                return new f50.i[]{j50.z0.f63517a, d3Var, d3Var, d3Var, d3Var, d3Var, d3Var, j50.i.f63378a};
            }

            @Override // f50.e
            @m80.k
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final y e(@m80.k i50.f decoder) {
                int i11;
                boolean z11;
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                kotlin.jvm.internal.g0.p(decoder, "decoder");
                h50.f fVar = descriptor;
                i50.d beginStructure = decoder.beginStructure(fVar);
                int i12 = 0;
                if (beginStructure.decodeSequentially()) {
                    i11 = beginStructure.decodeIntElement(fVar, 0);
                    String decodeStringElement = beginStructure.decodeStringElement(fVar, 1);
                    String decodeStringElement2 = beginStructure.decodeStringElement(fVar, 2);
                    String decodeStringElement3 = beginStructure.decodeStringElement(fVar, 3);
                    String decodeStringElement4 = beginStructure.decodeStringElement(fVar, 4);
                    String decodeStringElement5 = beginStructure.decodeStringElement(fVar, 5);
                    String decodeStringElement6 = beginStructure.decodeStringElement(fVar, 6);
                    i12 = 255;
                    z11 = beginStructure.decodeBooleanElement(fVar, 7);
                    str = decodeStringElement6;
                    str2 = decodeStringElement5;
                    str3 = decodeStringElement3;
                    str4 = decodeStringElement4;
                    str5 = decodeStringElement2;
                    str6 = decodeStringElement;
                } else {
                    String str7 = null;
                    String str8 = null;
                    String str9 = null;
                    String str10 = null;
                    String str11 = null;
                    String str12 = null;
                    boolean z12 = true;
                    i11 = 0;
                    boolean z13 = false;
                    while (z12) {
                        int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                        switch (decodeElementIndex) {
                            case -1:
                                z12 = false;
                                break;
                            case 0:
                                i12 |= 1;
                                i11 = beginStructure.decodeIntElement(fVar, 0);
                                continue;
                            case 1:
                                str12 = beginStructure.decodeStringElement(fVar, 1);
                                i12 |= 2;
                                continue;
                            case 2:
                                str11 = beginStructure.decodeStringElement(fVar, 2);
                                i12 |= 4;
                                break;
                            case 3:
                                str9 = beginStructure.decodeStringElement(fVar, 3);
                                i12 |= 8;
                                break;
                            case 4:
                                str10 = beginStructure.decodeStringElement(fVar, 4);
                                i12 |= 16;
                                break;
                            case 5:
                                str8 = beginStructure.decodeStringElement(fVar, 5);
                                i12 |= 32;
                                break;
                            case 6:
                                str7 = beginStructure.decodeStringElement(fVar, 6);
                                i12 |= 64;
                                break;
                            case 7:
                                z13 = beginStructure.decodeBooleanElement(fVar, 7);
                                i12 |= 128;
                                break;
                            default:
                                throw new UnknownFieldException(decodeElementIndex);
                        }
                    }
                    z11 = z13;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    str4 = str10;
                    str5 = str11;
                    str6 = str12;
                }
                int i13 = i11;
                int i14 = i12;
                beginStructure.endStructure(fVar);
                return new y(i14, i13, str6, str5, str3, str4, str2, str, z11, null);
            }

            @Override // f50.b0
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public final void b(@m80.k i50.h encoder, @m80.k y value) {
                kotlin.jvm.internal.g0.p(encoder, "encoder");
                kotlin.jvm.internal.g0.p(value, "value");
                h50.f fVar = descriptor;
                i50.e beginStructure = encoder.beginStructure(fVar);
                y.A(value, beginStructure, fVar);
                beginStructure.endStructure(fVar);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
                this();
            }

            @m80.k
            public final f50.i<y> serializer() {
                return a.f69540a;
            }

            public b() {
            }
        }

        public /* synthetic */ y(int i11, int i12, String str, String str2, String str3, String str4, String str5, String str6, boolean z11, j50.x2 x2Var) {
            if (255 != (i11 & 255)) {
                j50.h2.b(i11, 255, a.f69540a.a());
            }
            this.f69532a = i12;
            this.f69533b = str;
            this.f69534c = str2;
            this.f69535d = str3;
            this.f69536e = str4;
            this.f69537f = str5;
            this.f69538g = str6;
            this.f69539h = z11;
        }

        @w00.o
        public static final /* synthetic */ void A(y yVar, i50.e eVar, h50.f fVar) {
            eVar.encodeIntElement(fVar, 0, yVar.f69532a);
            eVar.encodeStringElement(fVar, 1, yVar.f69533b);
            eVar.encodeStringElement(fVar, 2, yVar.f69534c);
            eVar.encodeStringElement(fVar, 3, yVar.f69535d);
            eVar.encodeStringElement(fVar, 4, yVar.f69536e);
            eVar.encodeStringElement(fVar, 5, yVar.f69537f);
            eVar.encodeStringElement(fVar, 6, yVar.f69538g);
            eVar.encodeBooleanElement(fVar, 7, yVar.f69539h);
        }

        public static /* synthetic */ y j(y yVar, int i11, String str, String str2, String str3, String str4, String str5, String str6, boolean z11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = yVar.f69532a;
            }
            if ((i12 & 2) != 0) {
                str = yVar.f69533b;
            }
            if ((i12 & 4) != 0) {
                str2 = yVar.f69534c;
            }
            if ((i12 & 8) != 0) {
                str3 = yVar.f69535d;
            }
            if ((i12 & 16) != 0) {
                str4 = yVar.f69536e;
            }
            if ((i12 & 32) != 0) {
                str5 = yVar.f69537f;
            }
            if ((i12 & 64) != 0) {
                str6 = yVar.f69538g;
            }
            if ((i12 & 128) != 0) {
                z11 = yVar.f69539h;
            }
            String str7 = str6;
            boolean z12 = z11;
            String str8 = str4;
            String str9 = str5;
            return yVar.i(i11, str, str2, str3, str8, str9, str7, z12);
        }

        public final int a() {
            return this.f69532a;
        }

        @m80.k
        public final String b() {
            return this.f69533b;
        }

        @m80.k
        public final String c() {
            return this.f69534c;
        }

        @m80.k
        public final String d() {
            return this.f69535d;
        }

        @m80.k
        public final String e() {
            return this.f69536e;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof y)) {
                return false;
            }
            y yVar = (y) obj;
            return this.f69532a == yVar.f69532a && kotlin.jvm.internal.g0.g(this.f69533b, yVar.f69533b) && kotlin.jvm.internal.g0.g(this.f69534c, yVar.f69534c) && kotlin.jvm.internal.g0.g(this.f69535d, yVar.f69535d) && kotlin.jvm.internal.g0.g(this.f69536e, yVar.f69536e) && kotlin.jvm.internal.g0.g(this.f69537f, yVar.f69537f) && kotlin.jvm.internal.g0.g(this.f69538g, yVar.f69538g) && this.f69539h == yVar.f69539h;
        }

        @m80.k
        public final String f() {
            return this.f69537f;
        }

        @m80.k
        public final String g() {
            return this.f69538g;
        }

        public final boolean h() {
            return this.f69539h;
        }

        public int hashCode() {
            return (((((((((((((Integer.hashCode(this.f69532a) * 31) + this.f69533b.hashCode()) * 31) + this.f69534c.hashCode()) * 31) + this.f69535d.hashCode()) * 31) + this.f69536e.hashCode()) * 31) + this.f69537f.hashCode()) * 31) + this.f69538g.hashCode()) * 31) + Boolean.hashCode(this.f69539h);
        }

        @m80.k
        public final y i(int i11, @m80.k String word, @m80.k String meanType, @m80.k String mean, @m80.k String image, @m80.k String audioUS, @m80.k String audioUK, boolean z11) {
            kotlin.jvm.internal.g0.p(word, "word");
            kotlin.jvm.internal.g0.p(meanType, "meanType");
            kotlin.jvm.internal.g0.p(mean, "mean");
            kotlin.jvm.internal.g0.p(image, "image");
            kotlin.jvm.internal.g0.p(audioUS, "audioUS");
            kotlin.jvm.internal.g0.p(audioUK, "audioUK");
            return new y(i11, word, meanType, mean, image, audioUS, audioUK, z11);
        }

        @m80.k
        public final String k() {
            return this.f69538g;
        }

        @m80.k
        public final String m() {
            return this.f69537f;
        }

        public final boolean o() {
            return this.f69539h;
        }

        @m80.k
        public final String q() {
            return this.f69536e;
        }

        @m80.k
        public final String s() {
            return this.f69535d;
        }

        @m80.k
        public String toString() {
            return "Similar(topicId=" + this.f69532a + ", word=" + this.f69533b + ", meanType=" + this.f69534c + ", mean=" + this.f69535d + ", image=" + this.f69536e + ", audioUS=" + this.f69537f + ", audioUK=" + this.f69538g + ", choose=" + this.f69539h + ')';
        }

        @m80.k
        public final String u() {
            return this.f69534c;
        }

        public final int w() {
            return this.f69532a;
        }

        @m80.k
        public final String y() {
            return this.f69533b;
        }

        public y(int i11, @m80.k String word, @m80.k String meanType, @m80.k String mean, @m80.k String image, @m80.k String audioUS, @m80.k String audioUK, boolean z11) {
            kotlin.jvm.internal.g0.p(word, "word");
            kotlin.jvm.internal.g0.p(meanType, "meanType");
            kotlin.jvm.internal.g0.p(mean, "mean");
            kotlin.jvm.internal.g0.p(image, "image");
            kotlin.jvm.internal.g0.p(audioUS, "audioUS");
            kotlin.jvm.internal.g0.p(audioUK, "audioUK");
            this.f69532a = i11;
            this.f69533b = word;
            this.f69534c = meanType;
            this.f69535d = mean;
            this.f69536e = image;
            this.f69537f = audioUS;
            this.f69538g = audioUK;
            this.f69539h = z11;
        }

        @f50.z("audioUK")
        public static /* synthetic */ void l() {
        }

        @f50.z("audioUS")
        public static /* synthetic */ void n() {
        }

        @f50.z(ma.b.O)
        public static /* synthetic */ void p() {
        }

        @f50.z("image")
        public static /* synthetic */ void r() {
        }

        @f50.z(com.baicizhan.main.wikiv2.studyv2.data.t.f26099a)
        public static /* synthetic */ void t() {
        }

        @f50.z("meanType")
        public static /* synthetic */ void v() {
        }

        @f50.z("topicId")
        public static /* synthetic */ void x() {
        }

        @f50.z("word")
        public static /* synthetic */ void z() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @f50.a0
    public static final class z {

        @m80.k
        public static final b Companion = new b(null);

        /* renamed from: a, reason: collision with root package name */
        public final int f69541a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f69542b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        public static final /* synthetic */ class a implements j50.p0<z> {

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public static final a f69543a;

            @m80.k
            private static final h50.f descriptor;

            static {
                a aVar = new a();
                f69543a = aVar;
                j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.TopicResourceModel.Tip", aVar, 2);
                l2Var.q("type", false);
                l2Var.q("content", false);
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

            @Override // j50.p0
            @m80.k
            public final f50.i<?>[] f() {
                return new f50.i[]{j50.z0.f63517a, d3.f63348a};
            }

            @Override // f50.e
            @m80.k
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final z e(@m80.k i50.f decoder) {
                int i11;
                String str;
                int i12;
                kotlin.jvm.internal.g0.p(decoder, "decoder");
                h50.f fVar = descriptor;
                i50.d beginStructure = decoder.beginStructure(fVar);
                j50.x2 x2Var = null;
                if (beginStructure.decodeSequentially()) {
                    i11 = beginStructure.decodeIntElement(fVar, 0);
                    str = beginStructure.decodeStringElement(fVar, 1);
                    i12 = 3;
                } else {
                    boolean z11 = true;
                    i11 = 0;
                    int i13 = 0;
                    String str2 = null;
                    while (z11) {
                        int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                        if (decodeElementIndex == -1) {
                            z11 = false;
                        } else if (decodeElementIndex == 0) {
                            i11 = beginStructure.decodeIntElement(fVar, 0);
                            i13 |= 1;
                        } else {
                            if (decodeElementIndex != 1) {
                                throw new UnknownFieldException(decodeElementIndex);
                            }
                            str2 = beginStructure.decodeStringElement(fVar, 1);
                            i13 |= 2;
                        }
                    }
                    str = str2;
                    i12 = i13;
                }
                beginStructure.endStructure(fVar);
                return new z(i12, i11, str, x2Var);
            }

            @Override // f50.b0
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public final void b(@m80.k i50.h encoder, @m80.k z value) {
                kotlin.jvm.internal.g0.p(encoder, "encoder");
                kotlin.jvm.internal.g0.p(value, "value");
                h50.f fVar = descriptor;
                i50.e beginStructure = encoder.beginStructure(fVar);
                z.i(value, beginStructure, fVar);
                beginStructure.endStructure(fVar);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
                this();
            }

            @m80.k
            public final f50.i<z> serializer() {
                return a.f69543a;
            }

            public b() {
            }
        }

        public /* synthetic */ z(int i11, int i12, String str, j50.x2 x2Var) {
            if (3 != (i11 & 3)) {
                j50.h2.b(i11, 3, a.f69543a.a());
            }
            this.f69541a = i12;
            this.f69542b = str;
        }

        public static /* synthetic */ z d(z zVar, int i11, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = zVar.f69541a;
            }
            if ((i12 & 2) != 0) {
                str = zVar.f69542b;
            }
            return zVar.c(i11, str);
        }

        @w00.o
        public static final /* synthetic */ void i(z zVar, i50.e eVar, h50.f fVar) {
            eVar.encodeIntElement(fVar, 0, zVar.f69541a);
            eVar.encodeStringElement(fVar, 1, zVar.f69542b);
        }

        public final int a() {
            return this.f69541a;
        }

        @m80.k
        public final String b() {
            return this.f69542b;
        }

        @m80.k
        public final z c(int i11, @m80.k String content) {
            kotlin.jvm.internal.g0.p(content, "content");
            return new z(i11, content);
        }

        @m80.k
        public final String e() {
            return this.f69542b;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof z)) {
                return false;
            }
            z zVar = (z) obj;
            return this.f69541a == zVar.f69541a && kotlin.jvm.internal.g0.g(this.f69542b, zVar.f69542b);
        }

        public final int g() {
            return this.f69541a;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f69541a) * 31) + this.f69542b.hashCode();
        }

        @m80.k
        public String toString() {
            return "Tip(type=" + this.f69541a + ", content=" + this.f69542b + ')';
        }

        public z(int i11, @m80.k String content) {
            kotlin.jvm.internal.g0.p(content, "content");
            this.f69541a = i11;
            this.f69542b = content;
        }

        @f50.z("content")
        public static /* synthetic */ void f() {
        }

        @f50.z("type")
        public static /* synthetic */ void h() {
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f69340l = new yz.c0[]{null, null, yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.f0
            @Override // x00.a
            public final Object invoke() {
                f50.i d11;
                d11 = i0.d();
                return d11;
            }
        }), null, null, yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.g0
            @Override // x00.a
            public final Object invoke() {
                f50.i e11;
                e11 = i0.e();
                return e11;
            }
        }), yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.h0
            @Override // x00.a
            public final Object invoke() {
                f50.i f11;
                f11 = i0.f();
                return f11;
            }
        }), null, null, null, null};
    }

    public /* synthetic */ i0(int i11, int i12, String str, List list, u uVar, String str2, List list2, List list3, String str3, String str4, y2 y2Var, d dVar, j50.x2 x2Var) {
        if (11 != (i11 & 11)) {
            j50.h2.b(i11, 11, a.f69352a.a());
        }
        this.f69341a = i12;
        this.f69342b = str;
        if ((i11 & 4) == 0) {
            this.f69343c = a00.h0.J();
        } else {
            this.f69343c = list;
        }
        this.f69344d = uVar;
        if ((i11 & 16) == 0) {
            this.f69345e = null;
        } else {
            this.f69345e = str2;
        }
        if ((i11 & 32) == 0) {
            this.f69346f = a00.h0.J();
        } else {
            this.f69346f = list2;
        }
        if ((i11 & 64) == 0) {
            this.f69347g = a00.h0.J();
        } else {
            this.f69347g = list3;
        }
        if ((i11 & 128) == 0) {
            this.f69348h = null;
        } else {
            this.f69348h = str3;
        }
        if ((i11 & 256) == 0) {
            this.f69349i = null;
        } else {
            this.f69349i = str4;
        }
        if ((i11 & 512) == 0) {
            this.f69350j = null;
        } else {
            this.f69350j = y2Var;
        }
        if ((i11 & 1024) == 0) {
            this.f69351k = null;
        } else {
            this.f69351k = dVar;
        }
    }

    @w00.o
    public static final /* synthetic */ void Q(i0 i0Var, i50.e eVar, h50.f fVar) {
        yz.c0<f50.i<Object>>[] c0VarArr = f69340l;
        eVar.encodeIntElement(fVar, 0, i0Var.f69341a);
        eVar.encodeStringElement(fVar, 1, i0Var.f69342b);
        if (eVar.shouldEncodeElementDefault(fVar, 2) || !kotlin.jvm.internal.g0.g(i0Var.f69343c, a00.h0.J())) {
            eVar.encodeSerializableElement(fVar, 2, c0VarArr[2].getValue(), i0Var.f69343c);
        }
        eVar.encodeSerializableElement(fVar, 3, u.a.f69502a, i0Var.f69344d);
        if (eVar.shouldEncodeElementDefault(fVar, 4) || i0Var.f69345e != null) {
            eVar.encodeNullableSerializableElement(fVar, 4, d3.f63348a, i0Var.f69345e);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 5) || !kotlin.jvm.internal.g0.g(i0Var.f69346f, a00.h0.J())) {
            eVar.encodeSerializableElement(fVar, 5, c0VarArr[5].getValue(), i0Var.f69346f);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 6) || !kotlin.jvm.internal.g0.g(i0Var.f69347g, a00.h0.J())) {
            eVar.encodeSerializableElement(fVar, 6, c0VarArr[6].getValue(), i0Var.f69347g);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 7) || i0Var.f69348h != null) {
            eVar.encodeNullableSerializableElement(fVar, 7, d3.f63348a, i0Var.f69348h);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 8) || i0Var.f69349i != null) {
            eVar.encodeNullableSerializableElement(fVar, 8, d3.f63348a, i0Var.f69349i);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 9) || i0Var.f69350j != null) {
            eVar.encodeNullableSerializableElement(fVar, 9, y2.a.f69741a, i0Var.f69350j);
        }
        if (!eVar.shouldEncodeElementDefault(fVar, 10) && i0Var.f69351k == null) {
            return;
        }
        eVar.encodeNullableSerializableElement(fVar, 10, d.a.f69400a, i0Var.f69351k);
    }

    public static final /* synthetic */ f50.i d() {
        return new j50.f(p.a.f69459a);
    }

    public static final /* synthetic */ f50.i e() {
        return new j50.f(g.a.f69410a);
    }

    public static final /* synthetic */ f50.i f() {
        return new j50.f(s.a.f69478a);
    }

    public static /* synthetic */ i0 t(i0 i0Var, int i11, String str, List list, u uVar, String str2, List list2, List list3, String str3, String str4, y2 y2Var, d dVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = i0Var.f69341a;
        }
        if ((i12 & 2) != 0) {
            str = i0Var.f69342b;
        }
        if ((i12 & 4) != 0) {
            list = i0Var.f69343c;
        }
        if ((i12 & 8) != 0) {
            uVar = i0Var.f69344d;
        }
        if ((i12 & 16) != 0) {
            str2 = i0Var.f69345e;
        }
        if ((i12 & 32) != 0) {
            list2 = i0Var.f69346f;
        }
        if ((i12 & 64) != 0) {
            list3 = i0Var.f69347g;
        }
        if ((i12 & 128) != 0) {
            str3 = i0Var.f69348h;
        }
        if ((i12 & 256) != 0) {
            str4 = i0Var.f69349i;
        }
        if ((i12 & 512) != 0) {
            y2Var = i0Var.f69350j;
        }
        if ((i12 & 1024) != 0) {
            dVar = i0Var.f69351k;
        }
        y2 y2Var2 = y2Var;
        d dVar2 = dVar;
        String str5 = str3;
        String str6 = str4;
        List list4 = list2;
        List list5 = list3;
        String str7 = str2;
        List list6 = list;
        return i0Var.s(i11, str, list6, uVar, str7, list4, list5, str5, str6, y2Var2, dVar2);
    }

    @m80.k
    public final List<p> A() {
        return this.f69343c;
    }

    @m80.l
    public final String C() {
        return this.f69345e;
    }

    @m80.k
    public final List<s> E() {
        return this.f69347g;
    }

    @m80.k
    public final u G() {
        return this.f69344d;
    }

    public final int I() {
        return this.f69341a;
    }

    @m80.k
    public final String K() {
        return this.f69342b;
    }

    @m80.l
    public final String M() {
        return this.f69349i;
    }

    @m80.l
    public final y2 O() {
        return this.f69350j;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.f69341a == i0Var.f69341a && kotlin.jvm.internal.g0.g(this.f69342b, i0Var.f69342b) && kotlin.jvm.internal.g0.g(this.f69343c, i0Var.f69343c) && kotlin.jvm.internal.g0.g(this.f69344d, i0Var.f69344d) && kotlin.jvm.internal.g0.g(this.f69345e, i0Var.f69345e) && kotlin.jvm.internal.g0.g(this.f69346f, i0Var.f69346f) && kotlin.jvm.internal.g0.g(this.f69347g, i0Var.f69347g) && kotlin.jvm.internal.g0.g(this.f69348h, i0Var.f69348h) && kotlin.jvm.internal.g0.g(this.f69349i, i0Var.f69349i) && kotlin.jvm.internal.g0.g(this.f69350j, i0Var.f69350j) && kotlin.jvm.internal.g0.g(this.f69351k, i0Var.f69351k);
    }

    public final int h() {
        return this.f69341a;
    }

    public int hashCode() {
        int hashCode = ((((((Integer.hashCode(this.f69341a) * 31) + this.f69342b.hashCode()) * 31) + this.f69343c.hashCode()) * 31) + this.f69344d.hashCode()) * 31;
        String str = this.f69345e;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f69346f.hashCode()) * 31) + this.f69347g.hashCode()) * 31;
        String str2 = this.f69348h;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f69349i;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        y2 y2Var = this.f69350j;
        int hashCode5 = (hashCode4 + (y2Var == null ? 0 : y2Var.hashCode())) * 31;
        d dVar = this.f69351k;
        return hashCode5 + (dVar != null ? dVar.hashCode() : 0);
    }

    @m80.l
    public final y2 i() {
        return this.f69350j;
    }

    @m80.l
    public final d j() {
        return this.f69351k;
    }

    @m80.k
    public final String k() {
        return this.f69342b;
    }

    @m80.k
    public final List<p> l() {
        return this.f69343c;
    }

    @m80.k
    public final u m() {
        return this.f69344d;
    }

    @m80.l
    public final String n() {
        return this.f69345e;
    }

    @m80.k
    public final List<g> o() {
        return this.f69346f;
    }

    @m80.k
    public final List<s> p() {
        return this.f69347g;
    }

    @m80.l
    public final String q() {
        return this.f69348h;
    }

    @m80.l
    public final String r() {
        return this.f69349i;
    }

    @m80.k
    public final i0 s(int i11, @m80.k String word, @m80.k List<p> modes, @m80.k u resource, @m80.l String str, @m80.k List<g> confusingConcept, @m80.k List<s> proPhrases, @m80.l String str2, @m80.l String str3, @m80.l y2 y2Var, @m80.l d dVar) {
        kotlin.jvm.internal.g0.p(word, "word");
        kotlin.jvm.internal.g0.p(modes, "modes");
        kotlin.jvm.internal.g0.p(resource, "resource");
        kotlin.jvm.internal.g0.p(confusingConcept, "confusingConcept");
        kotlin.jvm.internal.g0.p(proPhrases, "proPhrases");
        return new i0(i11, word, modes, resource, str, confusingConcept, proPhrases, str2, str3, y2Var, dVar);
    }

    @m80.k
    public String toString() {
        return "TopicResourceModel(topicId=" + this.f69341a + ", word=" + this.f69342b + ", modes=" + this.f69343c + ", resource=" + this.f69344d + ", proExplanation=" + this.f69345e + ", confusingConcept=" + this.f69346f + ", proPhrases=" + this.f69347g + ", additionalExplanation=" + this.f69348h + ", wordConjugation=" + this.f69349i + ", wordPack=" + this.f69350j + ", cake=" + this.f69351k + ')';
    }

    @m80.l
    public final String u() {
        return this.f69348h;
    }

    @m80.l
    public final d w() {
        return this.f69351k;
    }

    @m80.k
    public final List<g> y() {
        return this.f69346f;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @f50.a0
    public static final class r {

        @m80.k
        public static final b Companion = new b(null);

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f69471a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f69472b;

        /* renamed from: c, reason: collision with root package name */
        public final int f69473c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final String f69474d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        public static final /* synthetic */ class a implements j50.p0<r> {

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public static final a f69475a;

            @m80.k
            private static final h50.f descriptor;

            static {
                a aVar = new a();
                f69475a = aVar;
                j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.TopicResourceModel.Phrase", aVar, 4);
                l2Var.q(com.baicizhan.main.wikiv2.studyv2.data.t.f26100b, false);
                l2Var.q(com.baicizhan.main.wikiv2.studyv2.data.t.f26099a, false);
                l2Var.q("phraseTag", true);
                l2Var.q("examTag", true);
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

            @Override // j50.p0
            @m80.k
            public final f50.i<?>[] f() {
                d3 d3Var = d3.f63348a;
                return new f50.i[]{d3Var, d3Var, j50.z0.f63517a, d3Var};
            }

            @Override // f50.e
            @m80.k
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final r e(@m80.k i50.f decoder) {
                String str;
                String str2;
                int i11;
                String str3;
                int i12;
                kotlin.jvm.internal.g0.p(decoder, "decoder");
                h50.f fVar = descriptor;
                i50.d beginStructure = decoder.beginStructure(fVar);
                if (beginStructure.decodeSequentially()) {
                    str = beginStructure.decodeStringElement(fVar, 0);
                    String decodeStringElement = beginStructure.decodeStringElement(fVar, 1);
                    int decodeIntElement = beginStructure.decodeIntElement(fVar, 2);
                    str2 = beginStructure.decodeStringElement(fVar, 3);
                    i11 = decodeIntElement;
                    str3 = decodeStringElement;
                    i12 = 15;
                } else {
                    str = null;
                    String str4 = null;
                    String str5 = null;
                    boolean z11 = true;
                    int i13 = 0;
                    int i14 = 0;
                    while (z11) {
                        int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                        if (decodeElementIndex == -1) {
                            z11 = false;
                        } else if (decodeElementIndex == 0) {
                            str = beginStructure.decodeStringElement(fVar, 0);
                            i14 |= 1;
                        } else if (decodeElementIndex == 1) {
                            str5 = beginStructure.decodeStringElement(fVar, 1);
                            i14 |= 2;
                        } else if (decodeElementIndex == 2) {
                            i13 = beginStructure.decodeIntElement(fVar, 2);
                            i14 |= 4;
                        } else {
                            if (decodeElementIndex != 3) {
                                throw new UnknownFieldException(decodeElementIndex);
                            }
                            str4 = beginStructure.decodeStringElement(fVar, 3);
                            i14 |= 8;
                        }
                    }
                    str2 = str4;
                    i11 = i13;
                    str3 = str5;
                    i12 = i14;
                }
                String str6 = str;
                beginStructure.endStructure(fVar);
                return new r(i12, str6, str3, i11, str2, (j50.x2) null);
            }

            @Override // f50.b0
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public final void b(@m80.k i50.h encoder, @m80.k r value) {
                kotlin.jvm.internal.g0.p(encoder, "encoder");
                kotlin.jvm.internal.g0.p(value, "value");
                h50.f fVar = descriptor;
                i50.e beginStructure = encoder.beginStructure(fVar);
                r.o(value, beginStructure, fVar);
                beginStructure.endStructure(fVar);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
                this();
            }

            @m80.k
            public final f50.i<r> serializer() {
                return a.f69475a;
            }

            public b() {
            }
        }

        public /* synthetic */ r(int i11, String str, String str2, int i12, String str3, j50.x2 x2Var) {
            if (3 != (i11 & 3)) {
                j50.h2.b(i11, 3, a.f69475a.a());
            }
            this.f69471a = str;
            this.f69472b = str2;
            if ((i11 & 4) == 0) {
                this.f69473c = 0;
            } else {
                this.f69473c = i12;
            }
            if ((i11 & 8) == 0) {
                this.f69474d = "";
            } else {
                this.f69474d = str3;
            }
        }

        public static /* synthetic */ r f(r rVar, String str, String str2, int i11, String str3, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = rVar.f69471a;
            }
            if ((i12 & 2) != 0) {
                str2 = rVar.f69472b;
            }
            if ((i12 & 4) != 0) {
                i11 = rVar.f69473c;
            }
            if ((i12 & 8) != 0) {
                str3 = rVar.f69474d;
            }
            return rVar.e(str, str2, i11, str3);
        }

        @w00.o
        public static final /* synthetic */ void o(r rVar, i50.e eVar, h50.f fVar) {
            eVar.encodeStringElement(fVar, 0, rVar.f69471a);
            eVar.encodeStringElement(fVar, 1, rVar.f69472b);
            if (eVar.shouldEncodeElementDefault(fVar, 2) || rVar.f69473c != 0) {
                eVar.encodeIntElement(fVar, 2, rVar.f69473c);
            }
            if (!eVar.shouldEncodeElementDefault(fVar, 3) && kotlin.jvm.internal.g0.g(rVar.f69474d, "")) {
                return;
            }
            eVar.encodeStringElement(fVar, 3, rVar.f69474d);
        }

        @m80.k
        public final String a() {
            return this.f69471a;
        }

        @m80.k
        public final String b() {
            return this.f69472b;
        }

        public final int c() {
            return this.f69473c;
        }

        @m80.k
        public final String d() {
            return this.f69474d;
        }

        @m80.k
        public final r e(@m80.k String phrase, @m80.k String mean, int i11, @m80.k String examTag) {
            kotlin.jvm.internal.g0.p(phrase, "phrase");
            kotlin.jvm.internal.g0.p(mean, "mean");
            kotlin.jvm.internal.g0.p(examTag, "examTag");
            return new r(phrase, mean, i11, examTag);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return kotlin.jvm.internal.g0.g(this.f69471a, rVar.f69471a) && kotlin.jvm.internal.g0.g(this.f69472b, rVar.f69472b) && this.f69473c == rVar.f69473c && kotlin.jvm.internal.g0.g(this.f69474d, rVar.f69474d);
        }

        @m80.k
        public final String g() {
            return this.f69474d;
        }

        public int hashCode() {
            return (((((this.f69471a.hashCode() * 31) + this.f69472b.hashCode()) * 31) + Integer.hashCode(this.f69473c)) * 31) + this.f69474d.hashCode();
        }

        @m80.k
        public final String i() {
            return this.f69472b;
        }

        @m80.k
        public final String k() {
            return this.f69471a;
        }

        public final int m() {
            return this.f69473c;
        }

        @m80.k
        public String toString() {
            return "Phrase(phrase=" + this.f69471a + ", mean=" + this.f69472b + ", phraseTag=" + this.f69473c + ", examTag=" + this.f69474d + ')';
        }

        public r(@m80.k String phrase, @m80.k String mean, int i11, @m80.k String examTag) {
            kotlin.jvm.internal.g0.p(phrase, "phrase");
            kotlin.jvm.internal.g0.p(mean, "mean");
            kotlin.jvm.internal.g0.p(examTag, "examTag");
            this.f69471a = phrase;
            this.f69472b = mean;
            this.f69473c = i11;
            this.f69474d = examTag;
        }

        public /* synthetic */ r(String str, String str2, int i11, String str3, int i12, kotlin.jvm.internal.v vVar) {
            this(str, str2, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? "" : str3);
        }

        @f50.z("examTag")
        public static /* synthetic */ void h() {
        }

        @f50.z(com.baicizhan.main.wikiv2.studyv2.data.t.f26099a)
        public static /* synthetic */ void j() {
        }

        @f50.z(com.baicizhan.main.wikiv2.studyv2.data.t.f26100b)
        public static /* synthetic */ void l() {
        }

        @f50.z("phraseTag")
        public static /* synthetic */ void n() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @f50.a0
    public static final class w {

        @m80.k
        public static final b Companion = new b(null);

        /* renamed from: u, reason: collision with root package name */
        @w00.g
        @m80.k
        public static final yz.c0<f50.i<Object>>[] f69507u = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, yz.e0.b(LazyThreadSafetyMode.PUBLICATION, new x00.a() { // from class: l3.e2
            @Override // x00.a
            public final Object invoke() {
                f50.i b11;
                b11 = i0.w.b();
                return b11;
            }
        })};

        /* renamed from: a, reason: collision with root package name */
        public final long f69508a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f69509b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final String f69510c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final String f69511d;

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final String f69512e;

        /* renamed from: f, reason: collision with root package name */
        @m80.k
        public final String f69513f;

        /* renamed from: g, reason: collision with root package name */
        @m80.k
        public final String f69514g;

        /* renamed from: h, reason: collision with root package name */
        @m80.k
        public final String f69515h;

        /* renamed from: i, reason: collision with root package name */
        @m80.k
        public final String f69516i;

        /* renamed from: j, reason: collision with root package name */
        @m80.k
        public final String f69517j;

        /* renamed from: k, reason: collision with root package name */
        @m80.k
        public final String f69518k;

        /* renamed from: l, reason: collision with root package name */
        public final int f69519l;

        /* renamed from: m, reason: collision with root package name */
        @m80.k
        public final String f69520m;

        /* renamed from: n, reason: collision with root package name */
        @m80.k
        public final String f69521n;

        /* renamed from: o, reason: collision with root package name */
        @m80.k
        public final String f69522o;

        /* renamed from: p, reason: collision with root package name */
        @m80.k
        public final String f69523p;

        /* renamed from: q, reason: collision with root package name */
        @m80.k
        public final String f69524q;

        /* renamed from: r, reason: collision with root package name */
        @m80.k
        public final String f69525r;

        /* renamed from: s, reason: collision with root package name */
        @m80.k
        public final String f69526s;

        /* renamed from: t, reason: collision with root package name */
        @m80.k
        public final List<x> f69527t;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        public static final /* synthetic */ class a implements j50.p0<w> {

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public static final a f69528a;

            @m80.k
            private static final h50.f descriptor;

            static {
                a aVar = new a();
                f69528a = aVar;
                j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.TopicResourceModel.Sentence", aVar, 20);
                l2Var.q("id", false);
                l2Var.q("sentence", true);
                l2Var.q("trans", true);
                l2Var.q("audioUS", true);
                l2Var.q("audioUK", true);
                l2Var.q("image", true);
                l2Var.q("source", true);
                l2Var.q("highlightPhrase", true);
                l2Var.q("highlightTrans", true);
                l2Var.q("deepVideo", true);
                l2Var.q("deepCover", true);
                l2Var.q("ryhmeTopicId", true);
                l2Var.q("ryhmeWord", true);
                l2Var.q("ryhmeAudio", true);
                l2Var.q("ryhmeSenAudio", true);
                l2Var.q("ryhmeAudioConcat", true);
                l2Var.q("ryhmeAudioBlank", true);
                l2Var.q("contextVideo", true);
                l2Var.q("contextCover", true);
                l2Var.q("chunks", true);
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
                yz.c0[] c0VarArr = w.f69507u;
                d3 d3Var = d3.f63348a;
                return new f50.i[]{j50.l1.f63406a, d3Var, d3Var, d3Var, d3Var, d3Var, d3Var, d3Var, d3Var, d3Var, d3Var, j50.z0.f63517a, d3Var, d3Var, d3Var, d3Var, d3Var, d3Var, d3Var, c0VarArr[19].getValue()};
            }

            @Override // f50.e
            @m80.k
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final w e(@m80.k i50.f decoder) {
                int i11;
                List list;
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                String str7;
                String str8;
                String str9;
                String str10;
                String str11;
                String str12;
                String str13;
                String str14;
                String str15;
                String str16;
                String str17;
                int i12;
                long j11;
                int i13;
                boolean z11;
                kotlin.jvm.internal.g0.p(decoder, "decoder");
                h50.f fVar = descriptor;
                i50.d beginStructure = decoder.beginStructure(fVar);
                yz.c0[] c0VarArr = w.f69507u;
                int i14 = 3;
                int i15 = 2;
                if (beginStructure.decodeSequentially()) {
                    long decodeLongElement = beginStructure.decodeLongElement(fVar, 0);
                    String decodeStringElement = beginStructure.decodeStringElement(fVar, 1);
                    String decodeStringElement2 = beginStructure.decodeStringElement(fVar, 2);
                    String decodeStringElement3 = beginStructure.decodeStringElement(fVar, 3);
                    String decodeStringElement4 = beginStructure.decodeStringElement(fVar, 4);
                    String decodeStringElement5 = beginStructure.decodeStringElement(fVar, 5);
                    String decodeStringElement6 = beginStructure.decodeStringElement(fVar, 6);
                    String decodeStringElement7 = beginStructure.decodeStringElement(fVar, 7);
                    String decodeStringElement8 = beginStructure.decodeStringElement(fVar, 8);
                    String decodeStringElement9 = beginStructure.decodeStringElement(fVar, 9);
                    String decodeStringElement10 = beginStructure.decodeStringElement(fVar, 10);
                    int decodeIntElement = beginStructure.decodeIntElement(fVar, 11);
                    String decodeStringElement11 = beginStructure.decodeStringElement(fVar, 12);
                    String decodeStringElement12 = beginStructure.decodeStringElement(fVar, 13);
                    String decodeStringElement13 = beginStructure.decodeStringElement(fVar, 14);
                    String decodeStringElement14 = beginStructure.decodeStringElement(fVar, 15);
                    String decodeStringElement15 = beginStructure.decodeStringElement(fVar, 16);
                    String decodeStringElement16 = beginStructure.decodeStringElement(fVar, 17);
                    String decodeStringElement17 = beginStructure.decodeStringElement(fVar, 18);
                    list = (List) beginStructure.decodeSerializableElement(fVar, 19, (f50.e) c0VarArr[19].getValue(), null);
                    i11 = 1048575;
                    str17 = decodeStringElement17;
                    str3 = decodeStringElement3;
                    str8 = decodeStringElement8;
                    str4 = decodeStringElement4;
                    str = decodeStringElement2;
                    str5 = decodeStringElement5;
                    str12 = decodeStringElement12;
                    str10 = decodeStringElement10;
                    str9 = decodeStringElement9;
                    str7 = decodeStringElement7;
                    i12 = decodeIntElement;
                    str11 = decodeStringElement11;
                    str16 = decodeStringElement16;
                    str15 = decodeStringElement15;
                    str14 = decodeStringElement14;
                    str13 = decodeStringElement13;
                    str2 = decodeStringElement;
                    str6 = decodeStringElement6;
                    j11 = decodeLongElement;
                } else {
                    String str18 = null;
                    i11 = 0;
                    int i16 = 0;
                    boolean z12 = true;
                    list = null;
                    String str19 = null;
                    String str20 = null;
                    String str21 = null;
                    String str22 = null;
                    String str23 = null;
                    String str24 = null;
                    String str25 = null;
                    String str26 = null;
                    String str27 = null;
                    String str28 = null;
                    String str29 = null;
                    String str30 = null;
                    String str31 = null;
                    String str32 = null;
                    long j12 = 0;
                    String str33 = null;
                    String str34 = null;
                    while (z12) {
                        int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                        switch (decodeElementIndex) {
                            case -1:
                                i13 = i15;
                                z11 = true;
                                z12 = false;
                                i15 = i13;
                                i14 = 3;
                            case 0:
                                i13 = i15;
                                z11 = true;
                                j12 = beginStructure.decodeLongElement(fVar, 0);
                                i11 |= 1;
                                i15 = i13;
                                i14 = 3;
                            case 1:
                                i11 |= 2;
                                str19 = beginStructure.decodeStringElement(fVar, 1);
                                i15 = i15;
                            case 2:
                                int i17 = i15;
                                i11 |= 4;
                                i15 = i17;
                                str18 = beginStructure.decodeStringElement(fVar, i17);
                            case 3:
                                str33 = beginStructure.decodeStringElement(fVar, i14);
                                i11 |= 8;
                                i15 = 2;
                            case 4:
                                str34 = beginStructure.decodeStringElement(fVar, 4);
                                i11 |= 16;
                                i15 = 2;
                            case 5:
                                str20 = beginStructure.decodeStringElement(fVar, 5);
                                i11 |= 32;
                                i15 = 2;
                            case 6:
                                str21 = beginStructure.decodeStringElement(fVar, 6);
                                i11 |= 64;
                                i15 = 2;
                            case 7:
                                str22 = beginStructure.decodeStringElement(fVar, 7);
                                i11 |= 128;
                                i15 = 2;
                            case 8:
                                str23 = beginStructure.decodeStringElement(fVar, 8);
                                i11 |= 256;
                                i15 = 2;
                            case 9:
                                str24 = beginStructure.decodeStringElement(fVar, 9);
                                i11 |= 512;
                                i15 = 2;
                            case 10:
                                str25 = beginStructure.decodeStringElement(fVar, 10);
                                i11 |= 1024;
                                i15 = 2;
                            case 11:
                                i16 = beginStructure.decodeIntElement(fVar, 11);
                                i11 |= 2048;
                                i15 = 2;
                            case 12:
                                str26 = beginStructure.decodeStringElement(fVar, 12);
                                i11 |= 4096;
                                i15 = 2;
                            case 13:
                                str27 = beginStructure.decodeStringElement(fVar, 13);
                                i11 |= 8192;
                                i15 = 2;
                            case 14:
                                str28 = beginStructure.decodeStringElement(fVar, 14);
                                i11 |= 16384;
                                i15 = 2;
                            case 15:
                                str29 = beginStructure.decodeStringElement(fVar, 15);
                                i11 |= 32768;
                                i15 = 2;
                            case 16:
                                str30 = beginStructure.decodeStringElement(fVar, 16);
                                i11 |= 65536;
                                i15 = 2;
                            case 17:
                                str31 = beginStructure.decodeStringElement(fVar, 17);
                                i11 |= 131072;
                                i15 = 2;
                            case 18:
                                str32 = beginStructure.decodeStringElement(fVar, 18);
                                i11 |= 262144;
                                i15 = 2;
                            case 19:
                                list = (List) beginStructure.decodeSerializableElement(fVar, 19, (f50.e) c0VarArr[19].getValue(), list);
                                i11 |= 524288;
                                i15 = 2;
                            default:
                                throw new UnknownFieldException(decodeElementIndex);
                        }
                    }
                    str = str18;
                    str2 = str19;
                    str3 = str33;
                    str4 = str34;
                    str5 = str20;
                    str6 = str21;
                    str7 = str22;
                    str8 = str23;
                    str9 = str24;
                    str10 = str25;
                    str11 = str26;
                    str12 = str27;
                    str13 = str28;
                    str14 = str29;
                    str15 = str30;
                    str16 = str31;
                    str17 = str32;
                    i12 = i16;
                    j11 = j12;
                }
                List list2 = list;
                int i18 = i11;
                beginStructure.endStructure(fVar);
                return new w(i18, j11, str2, str, str3, str4, str5, str6, str7, str8, str9, str10, i12, str11, str12, str13, str14, str15, str16, str17, list2, (j50.x2) null);
            }

            @Override // f50.b0
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public final void b(@m80.k i50.h encoder, @m80.k w value) {
                kotlin.jvm.internal.g0.p(encoder, "encoder");
                kotlin.jvm.internal.g0.p(value, "value");
                h50.f fVar = descriptor;
                i50.e beginStructure = encoder.beginStructure(fVar);
                w.n0(value, beginStructure, fVar);
                beginStructure.endStructure(fVar);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
                this();
            }

            @m80.k
            public final f50.i<w> serializer() {
                return a.f69528a;
            }

            public b() {
            }
        }

        public /* synthetic */ w(int i11, long j11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i12, String str11, String str12, String str13, String str14, String str15, String str16, String str17, List list, j50.x2 x2Var) {
            if (1 != (i11 & 1)) {
                j50.h2.b(i11, 1, a.f69528a.a());
            }
            this.f69508a = j11;
            if ((i11 & 2) == 0) {
                this.f69509b = "";
            } else {
                this.f69509b = str;
            }
            if ((i11 & 4) == 0) {
                this.f69510c = "";
            } else {
                this.f69510c = str2;
            }
            if ((i11 & 8) == 0) {
                this.f69511d = "";
            } else {
                this.f69511d = str3;
            }
            if ((i11 & 16) == 0) {
                this.f69512e = "";
            } else {
                this.f69512e = str4;
            }
            if ((i11 & 32) == 0) {
                this.f69513f = "";
            } else {
                this.f69513f = str5;
            }
            if ((i11 & 64) == 0) {
                this.f69514g = "";
            } else {
                this.f69514g = str6;
            }
            if ((i11 & 128) == 0) {
                this.f69515h = "";
            } else {
                this.f69515h = str7;
            }
            if ((i11 & 256) == 0) {
                this.f69516i = "";
            } else {
                this.f69516i = str8;
            }
            if ((i11 & 512) == 0) {
                this.f69517j = "";
            } else {
                this.f69517j = str9;
            }
            if ((i11 & 1024) == 0) {
                this.f69518k = "";
            } else {
                this.f69518k = str10;
            }
            this.f69519l = (i11 & 2048) == 0 ? 0 : i12;
            if ((i11 & 4096) == 0) {
                this.f69520m = "";
            } else {
                this.f69520m = str11;
            }
            if ((i11 & 8192) == 0) {
                this.f69521n = "";
            } else {
                this.f69521n = str12;
            }
            if ((i11 & 16384) == 0) {
                this.f69522o = "";
            } else {
                this.f69522o = str13;
            }
            if ((32768 & i11) == 0) {
                this.f69523p = "";
            } else {
                this.f69523p = str14;
            }
            if ((65536 & i11) == 0) {
                this.f69524q = "";
            } else {
                this.f69524q = str15;
            }
            if ((131072 & i11) == 0) {
                this.f69525r = "";
            } else {
                this.f69525r = str16;
            }
            if ((262144 & i11) == 0) {
                this.f69526s = "";
            } else {
                this.f69526s = str17;
            }
            this.f69527t = (i11 & 524288) == 0 ? a00.h0.J() : list;
        }

        public static final /* synthetic */ f50.i b() {
            return new j50.f(x.a.f69531a);
        }

        @w00.o
        public static final /* synthetic */ void n0(w wVar, i50.e eVar, h50.f fVar) {
            yz.c0<f50.i<Object>>[] c0VarArr = f69507u;
            eVar.encodeLongElement(fVar, 0, wVar.f69508a);
            if (eVar.shouldEncodeElementDefault(fVar, 1) || !kotlin.jvm.internal.g0.g(wVar.f69509b, "")) {
                eVar.encodeStringElement(fVar, 1, wVar.f69509b);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 2) || !kotlin.jvm.internal.g0.g(wVar.f69510c, "")) {
                eVar.encodeStringElement(fVar, 2, wVar.f69510c);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 3) || !kotlin.jvm.internal.g0.g(wVar.f69511d, "")) {
                eVar.encodeStringElement(fVar, 3, wVar.f69511d);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 4) || !kotlin.jvm.internal.g0.g(wVar.f69512e, "")) {
                eVar.encodeStringElement(fVar, 4, wVar.f69512e);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 5) || !kotlin.jvm.internal.g0.g(wVar.f69513f, "")) {
                eVar.encodeStringElement(fVar, 5, wVar.f69513f);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 6) || !kotlin.jvm.internal.g0.g(wVar.f69514g, "")) {
                eVar.encodeStringElement(fVar, 6, wVar.f69514g);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 7) || !kotlin.jvm.internal.g0.g(wVar.f69515h, "")) {
                eVar.encodeStringElement(fVar, 7, wVar.f69515h);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 8) || !kotlin.jvm.internal.g0.g(wVar.f69516i, "")) {
                eVar.encodeStringElement(fVar, 8, wVar.f69516i);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 9) || !kotlin.jvm.internal.g0.g(wVar.f69517j, "")) {
                eVar.encodeStringElement(fVar, 9, wVar.f69517j);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 10) || !kotlin.jvm.internal.g0.g(wVar.f69518k, "")) {
                eVar.encodeStringElement(fVar, 10, wVar.f69518k);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 11) || wVar.f69519l != 0) {
                eVar.encodeIntElement(fVar, 11, wVar.f69519l);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 12) || !kotlin.jvm.internal.g0.g(wVar.f69520m, "")) {
                eVar.encodeStringElement(fVar, 12, wVar.f69520m);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 13) || !kotlin.jvm.internal.g0.g(wVar.f69521n, "")) {
                eVar.encodeStringElement(fVar, 13, wVar.f69521n);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 14) || !kotlin.jvm.internal.g0.g(wVar.f69522o, "")) {
                eVar.encodeStringElement(fVar, 14, wVar.f69522o);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 15) || !kotlin.jvm.internal.g0.g(wVar.f69523p, "")) {
                eVar.encodeStringElement(fVar, 15, wVar.f69523p);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 16) || !kotlin.jvm.internal.g0.g(wVar.f69524q, "")) {
                eVar.encodeStringElement(fVar, 16, wVar.f69524q);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 17) || !kotlin.jvm.internal.g0.g(wVar.f69525r, "")) {
                eVar.encodeStringElement(fVar, 17, wVar.f69525r);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 18) || !kotlin.jvm.internal.g0.g(wVar.f69526s, "")) {
                eVar.encodeStringElement(fVar, 18, wVar.f69526s);
            }
            if (!eVar.shouldEncodeElementDefault(fVar, 19) && kotlin.jvm.internal.g0.g(wVar.f69527t, a00.h0.J())) {
                return;
            }
            eVar.encodeSerializableElement(fVar, 19, c0VarArr[19].getValue(), wVar.f69527t);
        }

        public static /* synthetic */ w y(w wVar, long j11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i11, String str11, String str12, String str13, String str14, String str15, String str16, String str17, List list, int i12, Object obj) {
            List list2;
            String str18;
            long j12 = (i12 & 1) != 0 ? wVar.f69508a : j11;
            String str19 = (i12 & 2) != 0 ? wVar.f69509b : str;
            String str20 = (i12 & 4) != 0 ? wVar.f69510c : str2;
            String str21 = (i12 & 8) != 0 ? wVar.f69511d : str3;
            String str22 = (i12 & 16) != 0 ? wVar.f69512e : str4;
            String str23 = (i12 & 32) != 0 ? wVar.f69513f : str5;
            String str24 = (i12 & 64) != 0 ? wVar.f69514g : str6;
            String str25 = (i12 & 128) != 0 ? wVar.f69515h : str7;
            String str26 = (i12 & 256) != 0 ? wVar.f69516i : str8;
            String str27 = (i12 & 512) != 0 ? wVar.f69517j : str9;
            String str28 = (i12 & 1024) != 0 ? wVar.f69518k : str10;
            int i13 = (i12 & 2048) != 0 ? wVar.f69519l : i11;
            String str29 = (i12 & 4096) != 0 ? wVar.f69520m : str11;
            long j13 = j12;
            String str30 = (i12 & 8192) != 0 ? wVar.f69521n : str12;
            String str31 = (i12 & 16384) != 0 ? wVar.f69522o : str13;
            String str32 = (i12 & 32768) != 0 ? wVar.f69523p : str14;
            String str33 = (i12 & 65536) != 0 ? wVar.f69524q : str15;
            String str34 = (i12 & 131072) != 0 ? wVar.f69525r : str16;
            String str35 = (i12 & 262144) != 0 ? wVar.f69526s : str17;
            if ((i12 & 524288) != 0) {
                str18 = str35;
                list2 = wVar.f69527t;
            } else {
                list2 = list;
                str18 = str35;
            }
            return wVar.x(j13, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, i13, str29, str30, str31, str32, str33, str34, str18, list2);
        }

        @m80.k
        public final String B() {
            return this.f69511d;
        }

        @m80.k
        public final List<x> D() {
            return this.f69527t;
        }

        @m80.k
        public final String F() {
            return this.f69526s;
        }

        @m80.k
        public final String H() {
            return this.f69525r;
        }

        @m80.k
        public final String J() {
            return this.f69518k;
        }

        @m80.k
        public final String L() {
            return this.f69517j;
        }

        @m80.k
        public final String N() {
            return this.f69515h;
        }

        @m80.k
        public final String P() {
            return this.f69516i;
        }

        public final long R() {
            return this.f69508a;
        }

        @m80.k
        public final String T() {
            return this.f69513f;
        }

        @m80.k
        public final String V() {
            return this.f69521n;
        }

        @m80.k
        public final String X() {
            return this.f69524q;
        }

        @m80.k
        public final String Z() {
            return this.f69523p;
        }

        @m80.k
        public final String b0() {
            return this.f69522o;
        }

        public final long d() {
            return this.f69508a;
        }

        public final int d0() {
            return this.f69519l;
        }

        @m80.k
        public final String e() {
            return this.f69517j;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof w)) {
                return false;
            }
            w wVar = (w) obj;
            return this.f69508a == wVar.f69508a && kotlin.jvm.internal.g0.g(this.f69509b, wVar.f69509b) && kotlin.jvm.internal.g0.g(this.f69510c, wVar.f69510c) && kotlin.jvm.internal.g0.g(this.f69511d, wVar.f69511d) && kotlin.jvm.internal.g0.g(this.f69512e, wVar.f69512e) && kotlin.jvm.internal.g0.g(this.f69513f, wVar.f69513f) && kotlin.jvm.internal.g0.g(this.f69514g, wVar.f69514g) && kotlin.jvm.internal.g0.g(this.f69515h, wVar.f69515h) && kotlin.jvm.internal.g0.g(this.f69516i, wVar.f69516i) && kotlin.jvm.internal.g0.g(this.f69517j, wVar.f69517j) && kotlin.jvm.internal.g0.g(this.f69518k, wVar.f69518k) && this.f69519l == wVar.f69519l && kotlin.jvm.internal.g0.g(this.f69520m, wVar.f69520m) && kotlin.jvm.internal.g0.g(this.f69521n, wVar.f69521n) && kotlin.jvm.internal.g0.g(this.f69522o, wVar.f69522o) && kotlin.jvm.internal.g0.g(this.f69523p, wVar.f69523p) && kotlin.jvm.internal.g0.g(this.f69524q, wVar.f69524q) && kotlin.jvm.internal.g0.g(this.f69525r, wVar.f69525r) && kotlin.jvm.internal.g0.g(this.f69526s, wVar.f69526s) && kotlin.jvm.internal.g0.g(this.f69527t, wVar.f69527t);
        }

        @m80.k
        public final String f() {
            return this.f69518k;
        }

        @m80.k
        public final String f0() {
            return this.f69520m;
        }

        public final int g() {
            return this.f69519l;
        }

        @m80.k
        public final String h() {
            return this.f69520m;
        }

        @m80.k
        public final String h0() {
            return this.f69509b;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((((((((Long.hashCode(this.f69508a) * 31) + this.f69509b.hashCode()) * 31) + this.f69510c.hashCode()) * 31) + this.f69511d.hashCode()) * 31) + this.f69512e.hashCode()) * 31) + this.f69513f.hashCode()) * 31) + this.f69514g.hashCode()) * 31) + this.f69515h.hashCode()) * 31) + this.f69516i.hashCode()) * 31) + this.f69517j.hashCode()) * 31) + this.f69518k.hashCode()) * 31) + Integer.hashCode(this.f69519l)) * 31) + this.f69520m.hashCode()) * 31) + this.f69521n.hashCode()) * 31) + this.f69522o.hashCode()) * 31) + this.f69523p.hashCode()) * 31) + this.f69524q.hashCode()) * 31) + this.f69525r.hashCode()) * 31) + this.f69526s.hashCode()) * 31) + this.f69527t.hashCode();
        }

        @m80.k
        public final String i() {
            return this.f69521n;
        }

        @m80.k
        public final String j() {
            return this.f69522o;
        }

        @m80.k
        public final String j0() {
            return this.f69514g;
        }

        @m80.k
        public final String k() {
            return this.f69523p;
        }

        @m80.k
        public final String l() {
            return this.f69524q;
        }

        @m80.k
        public final String l0() {
            return this.f69510c;
        }

        @m80.k
        public final String m() {
            return this.f69525r;
        }

        @m80.k
        public final String n() {
            return this.f69526s;
        }

        @m80.k
        public final String o() {
            return this.f69509b;
        }

        @m80.k
        public final List<x> p() {
            return this.f69527t;
        }

        @m80.k
        public final String q() {
            return this.f69510c;
        }

        @m80.k
        public final String r() {
            return this.f69511d;
        }

        @m80.k
        public final String s() {
            return this.f69512e;
        }

        @m80.k
        public final String t() {
            return this.f69513f;
        }

        @m80.k
        public String toString() {
            return "Sentence(id=" + this.f69508a + ", sentence=" + this.f69509b + ", trans=" + this.f69510c + ", audioUS=" + this.f69511d + ", audioUK=" + this.f69512e + ", image=" + this.f69513f + ", source=" + this.f69514g + ", highlightPhrase=" + this.f69515h + ", highlightTrans=" + this.f69516i + ", deepVideo=" + this.f69517j + ", deepCover=" + this.f69518k + ", ryhmeTopicId=" + this.f69519l + ", ryhmeWord=" + this.f69520m + ", ryhmeAudio=" + this.f69521n + ", ryhmeSenAudio=" + this.f69522o + ", ryhmeAudioConcat=" + this.f69523p + ", ryhmeAudioBlank=" + this.f69524q + ", contextVideo=" + this.f69525r + ", contextCover=" + this.f69526s + ", chunks=" + this.f69527t + ')';
        }

        @m80.k
        public final String u() {
            return this.f69514g;
        }

        @m80.k
        public final String v() {
            return this.f69515h;
        }

        @m80.k
        public final String w() {
            return this.f69516i;
        }

        @m80.k
        public final w x(long j11, @m80.k String sentence, @m80.k String trans, @m80.k String audioUS, @m80.k String audioUK, @m80.k String image, @m80.k String source, @m80.k String highlightPhrase, @m80.k String highlightTrans, @m80.k String deepVideo, @m80.k String deepCover, int i11, @m80.k String ryhmeWord, @m80.k String ryhmeAudio, @m80.k String ryhmeSenAudio, @m80.k String ryhmeAudioConcat, @m80.k String ryhmeAudioBlank, @m80.k String contextVideo, @m80.k String contextCover, @m80.k List<x> chunks) {
            kotlin.jvm.internal.g0.p(sentence, "sentence");
            kotlin.jvm.internal.g0.p(trans, "trans");
            kotlin.jvm.internal.g0.p(audioUS, "audioUS");
            kotlin.jvm.internal.g0.p(audioUK, "audioUK");
            kotlin.jvm.internal.g0.p(image, "image");
            kotlin.jvm.internal.g0.p(source, "source");
            kotlin.jvm.internal.g0.p(highlightPhrase, "highlightPhrase");
            kotlin.jvm.internal.g0.p(highlightTrans, "highlightTrans");
            kotlin.jvm.internal.g0.p(deepVideo, "deepVideo");
            kotlin.jvm.internal.g0.p(deepCover, "deepCover");
            kotlin.jvm.internal.g0.p(ryhmeWord, "ryhmeWord");
            kotlin.jvm.internal.g0.p(ryhmeAudio, "ryhmeAudio");
            kotlin.jvm.internal.g0.p(ryhmeSenAudio, "ryhmeSenAudio");
            kotlin.jvm.internal.g0.p(ryhmeAudioConcat, "ryhmeAudioConcat");
            kotlin.jvm.internal.g0.p(ryhmeAudioBlank, "ryhmeAudioBlank");
            kotlin.jvm.internal.g0.p(contextVideo, "contextVideo");
            kotlin.jvm.internal.g0.p(contextCover, "contextCover");
            kotlin.jvm.internal.g0.p(chunks, "chunks");
            return new w(j11, sentence, trans, audioUS, audioUK, image, source, highlightPhrase, highlightTrans, deepVideo, deepCover, i11, ryhmeWord, ryhmeAudio, ryhmeSenAudio, ryhmeAudioConcat, ryhmeAudioBlank, contextVideo, contextCover, chunks);
        }

        @m80.k
        public final String z() {
            return this.f69512e;
        }

        public w(long j11, @m80.k String sentence, @m80.k String trans, @m80.k String audioUS, @m80.k String audioUK, @m80.k String image, @m80.k String source, @m80.k String highlightPhrase, @m80.k String highlightTrans, @m80.k String deepVideo, @m80.k String deepCover, int i11, @m80.k String ryhmeWord, @m80.k String ryhmeAudio, @m80.k String ryhmeSenAudio, @m80.k String ryhmeAudioConcat, @m80.k String ryhmeAudioBlank, @m80.k String contextVideo, @m80.k String contextCover, @m80.k List<x> chunks) {
            kotlin.jvm.internal.g0.p(sentence, "sentence");
            kotlin.jvm.internal.g0.p(trans, "trans");
            kotlin.jvm.internal.g0.p(audioUS, "audioUS");
            kotlin.jvm.internal.g0.p(audioUK, "audioUK");
            kotlin.jvm.internal.g0.p(image, "image");
            kotlin.jvm.internal.g0.p(source, "source");
            kotlin.jvm.internal.g0.p(highlightPhrase, "highlightPhrase");
            kotlin.jvm.internal.g0.p(highlightTrans, "highlightTrans");
            kotlin.jvm.internal.g0.p(deepVideo, "deepVideo");
            kotlin.jvm.internal.g0.p(deepCover, "deepCover");
            kotlin.jvm.internal.g0.p(ryhmeWord, "ryhmeWord");
            kotlin.jvm.internal.g0.p(ryhmeAudio, "ryhmeAudio");
            kotlin.jvm.internal.g0.p(ryhmeSenAudio, "ryhmeSenAudio");
            kotlin.jvm.internal.g0.p(ryhmeAudioConcat, "ryhmeAudioConcat");
            kotlin.jvm.internal.g0.p(ryhmeAudioBlank, "ryhmeAudioBlank");
            kotlin.jvm.internal.g0.p(contextVideo, "contextVideo");
            kotlin.jvm.internal.g0.p(contextCover, "contextCover");
            kotlin.jvm.internal.g0.p(chunks, "chunks");
            this.f69508a = j11;
            this.f69509b = sentence;
            this.f69510c = trans;
            this.f69511d = audioUS;
            this.f69512e = audioUK;
            this.f69513f = image;
            this.f69514g = source;
            this.f69515h = highlightPhrase;
            this.f69516i = highlightTrans;
            this.f69517j = deepVideo;
            this.f69518k = deepCover;
            this.f69519l = i11;
            this.f69520m = ryhmeWord;
            this.f69521n = ryhmeAudio;
            this.f69522o = ryhmeSenAudio;
            this.f69523p = ryhmeAudioConcat;
            this.f69524q = ryhmeAudioBlank;
            this.f69525r = contextVideo;
            this.f69526s = contextCover;
            this.f69527t = chunks;
        }

        @f50.z("audioUK")
        public static /* synthetic */ void A() {
        }

        @f50.z("audioUS")
        public static /* synthetic */ void C() {
        }

        @f50.z("chunks")
        public static /* synthetic */ void E() {
        }

        @f50.z("contextCover")
        public static /* synthetic */ void G() {
        }

        @f50.z("contextVideo")
        public static /* synthetic */ void I() {
        }

        @f50.z("deepCover")
        public static /* synthetic */ void K() {
        }

        @f50.z("deepVideo")
        public static /* synthetic */ void M() {
        }

        @f50.z("highlightPhrase")
        public static /* synthetic */ void O() {
        }

        @f50.z("highlightTrans")
        public static /* synthetic */ void Q() {
        }

        @f50.z("id")
        public static /* synthetic */ void S() {
        }

        @f50.z("image")
        public static /* synthetic */ void U() {
        }

        @f50.z("ryhmeAudio")
        public static /* synthetic */ void W() {
        }

        @f50.z("ryhmeAudioBlank")
        public static /* synthetic */ void Y() {
        }

        @f50.z("ryhmeAudioConcat")
        public static /* synthetic */ void a0() {
        }

        @f50.z("ryhmeSenAudio")
        public static /* synthetic */ void c0() {
        }

        @f50.z("ryhmeTopicId")
        public static /* synthetic */ void e0() {
        }

        @f50.z("ryhmeWord")
        public static /* synthetic */ void g0() {
        }

        @f50.z("sentence")
        public static /* synthetic */ void i0() {
        }

        @f50.z("source")
        public static /* synthetic */ void k0() {
        }

        @f50.z("trans")
        public static /* synthetic */ void m0() {
        }

        public /* synthetic */ w(long j11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i11, String str11, String str12, String str13, String str14, String str15, String str16, String str17, List list, int i12, kotlin.jvm.internal.v vVar) {
            this(j11, (i12 & 2) != 0 ? "" : str, (i12 & 4) != 0 ? "" : str2, (i12 & 8) != 0 ? "" : str3, (i12 & 16) != 0 ? "" : str4, (i12 & 32) != 0 ? "" : str5, (i12 & 64) != 0 ? "" : str6, (i12 & 128) != 0 ? "" : str7, (i12 & 256) != 0 ? "" : str8, (i12 & 512) != 0 ? "" : str9, (i12 & 1024) != 0 ? "" : str10, (i12 & 2048) != 0 ? 0 : i11, (i12 & 4096) != 0 ? "" : str11, (i12 & 8192) != 0 ? "" : str12, (i12 & 16384) != 0 ? "" : str13, (32768 & i12) != 0 ? "" : str14, (65536 & i12) != 0 ? "" : str15, (131072 & i12) != 0 ? "" : str16, (262144 & i12) != 0 ? "" : str17, (i12 & 524288) != 0 ? a00.h0.J() : list);
        }
    }

    public i0(int i11, @m80.k String word, @m80.k List<p> modes, @m80.k u resource, @m80.l String str, @m80.k List<g> confusingConcept, @m80.k List<s> proPhrases, @m80.l String str2, @m80.l String str3, @m80.l y2 y2Var, @m80.l d dVar) {
        kotlin.jvm.internal.g0.p(word, "word");
        kotlin.jvm.internal.g0.p(modes, "modes");
        kotlin.jvm.internal.g0.p(resource, "resource");
        kotlin.jvm.internal.g0.p(confusingConcept, "confusingConcept");
        kotlin.jvm.internal.g0.p(proPhrases, "proPhrases");
        this.f69341a = i11;
        this.f69342b = word;
        this.f69343c = modes;
        this.f69344d = resource;
        this.f69345e = str;
        this.f69346f = confusingConcept;
        this.f69347g = proPhrases;
        this.f69348h = str2;
        this.f69349i = str3;
        this.f69350j = y2Var;
        this.f69351k = dVar;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @f50.a0
    public static final class p {

        @m80.k
        public static final b Companion = new b(null);

        /* renamed from: f, reason: collision with root package name */
        @w00.g
        @m80.k
        public static final yz.c0<f50.i<Object>>[] f69453f;

        /* renamed from: a, reason: collision with root package name */
        public final int f69454a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final List<Long> f69455b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final List<Long> f69456c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final List<Long> f69457d;

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final List<Long> f69458e;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        public static final /* synthetic */ class a implements j50.p0<p> {

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public static final a f69459a;

            @m80.k
            private static final h50.f descriptor;

            static {
                a aVar = new a();
                f69459a = aVar;
                j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.TopicResourceModel.Mode", aVar, 5);
                l2Var.q("mode", false);
                l2Var.q("meanIds", true);
                l2Var.q("senIds", true);
                l2Var.q("explainIds", true);
                l2Var.q("aiPhraseIds", true);
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
                yz.c0[] c0VarArr = p.f69453f;
                return new f50.i[]{j50.z0.f63517a, c0VarArr[1].getValue(), c0VarArr[2].getValue(), c0VarArr[3].getValue(), c0VarArr[4].getValue()};
            }

            @Override // f50.e
            @m80.k
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final p e(@m80.k i50.f decoder) {
                int i11;
                int i12;
                List list;
                List list2;
                List list3;
                List list4;
                kotlin.jvm.internal.g0.p(decoder, "decoder");
                h50.f fVar = descriptor;
                i50.d beginStructure = decoder.beginStructure(fVar);
                yz.c0[] c0VarArr = p.f69453f;
                if (beginStructure.decodeSequentially()) {
                    i11 = beginStructure.decodeIntElement(fVar, 0);
                    List list5 = (List) beginStructure.decodeSerializableElement(fVar, 1, (f50.e) c0VarArr[1].getValue(), null);
                    List list6 = (List) beginStructure.decodeSerializableElement(fVar, 2, (f50.e) c0VarArr[2].getValue(), null);
                    List list7 = (List) beginStructure.decodeSerializableElement(fVar, 3, (f50.e) c0VarArr[3].getValue(), null);
                    list4 = (List) beginStructure.decodeSerializableElement(fVar, 4, (f50.e) c0VarArr[4].getValue(), null);
                    list3 = list7;
                    i12 = 31;
                    list2 = list6;
                    list = list5;
                } else {
                    boolean z11 = true;
                    i11 = 0;
                    List list8 = null;
                    List list9 = null;
                    List list10 = null;
                    List list11 = null;
                    int i13 = 0;
                    while (z11) {
                        int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                        if (decodeElementIndex == -1) {
                            z11 = false;
                        } else if (decodeElementIndex == 0) {
                            i11 = beginStructure.decodeIntElement(fVar, 0);
                            i13 |= 1;
                        } else if (decodeElementIndex == 1) {
                            list8 = (List) beginStructure.decodeSerializableElement(fVar, 1, (f50.e) c0VarArr[1].getValue(), list8);
                            i13 |= 2;
                        } else if (decodeElementIndex == 2) {
                            list9 = (List) beginStructure.decodeSerializableElement(fVar, 2, (f50.e) c0VarArr[2].getValue(), list9);
                            i13 |= 4;
                        } else if (decodeElementIndex == 3) {
                            list10 = (List) beginStructure.decodeSerializableElement(fVar, 3, (f50.e) c0VarArr[3].getValue(), list10);
                            i13 |= 8;
                        } else {
                            if (decodeElementIndex != 4) {
                                throw new UnknownFieldException(decodeElementIndex);
                            }
                            list11 = (List) beginStructure.decodeSerializableElement(fVar, 4, (f50.e) c0VarArr[4].getValue(), list11);
                            i13 |= 16;
                        }
                    }
                    i12 = i13;
                    list = list8;
                    list2 = list9;
                    list3 = list10;
                    list4 = list11;
                }
                int i14 = i11;
                beginStructure.endStructure(fVar);
                return new p(i12, i14, list, list2, list3, list4, (j50.x2) null);
            }

            @Override // f50.b0
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public final void b(@m80.k i50.h encoder, @m80.k p value) {
                kotlin.jvm.internal.g0.p(encoder, "encoder");
                kotlin.jvm.internal.g0.p(value, "value");
                h50.f fVar = descriptor;
                i50.e beginStructure = encoder.beginStructure(fVar);
                p.A(value, beginStructure, fVar);
                beginStructure.endStructure(fVar);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
                this();
            }

            @m80.k
            public final f50.i<p> serializer() {
                return a.f69459a;
            }

            public b() {
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            f69453f = new yz.c0[]{null, yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.b1
                @Override // x00.a
                public final Object invoke() {
                    f50.i e11;
                    e11 = i0.p.e();
                    return e11;
                }
            }), yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.c1
                @Override // x00.a
                public final Object invoke() {
                    f50.i f11;
                    f11 = i0.p.f();
                    return f11;
                }
            }), yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.d1
                @Override // x00.a
                public final Object invoke() {
                    f50.i g11;
                    g11 = i0.p.g();
                    return g11;
                }
            }), yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.e1
                @Override // x00.a
                public final Object invoke() {
                    f50.i h11;
                    h11 = i0.p.h();
                    return h11;
                }
            })};
        }

        public /* synthetic */ p(int i11, int i12, List list, List list2, List list3, List list4, j50.x2 x2Var) {
            if (1 != (i11 & 1)) {
                j50.h2.b(i11, 1, a.f69459a.a());
            }
            this.f69454a = i12;
            if ((i11 & 2) == 0) {
                this.f69455b = a00.h0.J();
            } else {
                this.f69455b = list;
            }
            if ((i11 & 4) == 0) {
                this.f69456c = a00.h0.J();
            } else {
                this.f69456c = list2;
            }
            if ((i11 & 8) == 0) {
                this.f69457d = a00.h0.J();
            } else {
                this.f69457d = list3;
            }
            if ((i11 & 16) == 0) {
                this.f69458e = a00.h0.J();
            } else {
                this.f69458e = list4;
            }
        }

        @w00.o
        public static final /* synthetic */ void A(p pVar, i50.e eVar, h50.f fVar) {
            yz.c0<f50.i<Object>>[] c0VarArr = f69453f;
            eVar.encodeIntElement(fVar, 0, pVar.f69454a);
            if (eVar.shouldEncodeElementDefault(fVar, 1) || !kotlin.jvm.internal.g0.g(pVar.f69455b, a00.h0.J())) {
                eVar.encodeSerializableElement(fVar, 1, c0VarArr[1].getValue(), pVar.f69455b);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 2) || !kotlin.jvm.internal.g0.g(pVar.f69456c, a00.h0.J())) {
                eVar.encodeSerializableElement(fVar, 2, c0VarArr[2].getValue(), pVar.f69456c);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 3) || !kotlin.jvm.internal.g0.g(pVar.f69457d, a00.h0.J())) {
                eVar.encodeSerializableElement(fVar, 3, c0VarArr[3].getValue(), pVar.f69457d);
            }
            if (!eVar.shouldEncodeElementDefault(fVar, 4) && kotlin.jvm.internal.g0.g(pVar.f69458e, a00.h0.J())) {
                return;
            }
            eVar.encodeSerializableElement(fVar, 4, c0VarArr[4].getValue(), pVar.f69458e);
        }

        public static final /* synthetic */ f50.i e() {
            return new j50.f(j50.l1.f63406a);
        }

        public static final /* synthetic */ f50.i f() {
            return new j50.f(j50.l1.f63406a);
        }

        public static final /* synthetic */ f50.i g() {
            return new j50.f(j50.l1.f63406a);
        }

        public static final /* synthetic */ f50.i h() {
            return new j50.f(j50.l1.f63406a);
        }

        public static /* synthetic */ p p(p pVar, int i11, List list, List list2, List list3, List list4, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = pVar.f69454a;
            }
            if ((i12 & 2) != 0) {
                list = pVar.f69455b;
            }
            if ((i12 & 4) != 0) {
                list2 = pVar.f69456c;
            }
            if ((i12 & 8) != 0) {
                list3 = pVar.f69457d;
            }
            if ((i12 & 16) != 0) {
                list4 = pVar.f69458e;
            }
            List list5 = list4;
            List list6 = list2;
            return pVar.o(i11, list, list6, list3, list5);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return this.f69454a == pVar.f69454a && kotlin.jvm.internal.g0.g(this.f69455b, pVar.f69455b) && kotlin.jvm.internal.g0.g(this.f69456c, pVar.f69456c) && kotlin.jvm.internal.g0.g(this.f69457d, pVar.f69457d) && kotlin.jvm.internal.g0.g(this.f69458e, pVar.f69458e);
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.f69454a) * 31) + this.f69455b.hashCode()) * 31) + this.f69456c.hashCode()) * 31) + this.f69457d.hashCode()) * 31) + this.f69458e.hashCode();
        }

        public final int j() {
            return this.f69454a;
        }

        @m80.k
        public final List<Long> k() {
            return this.f69455b;
        }

        @m80.k
        public final List<Long> l() {
            return this.f69456c;
        }

        @m80.k
        public final List<Long> m() {
            return this.f69457d;
        }

        @m80.k
        public final List<Long> n() {
            return this.f69458e;
        }

        @m80.k
        public final p o(int i11, @m80.k List<Long> meanIds, @m80.k List<Long> senIds, @m80.k List<Long> explainIds, @m80.k List<Long> aiPhraseIds) {
            kotlin.jvm.internal.g0.p(meanIds, "meanIds");
            kotlin.jvm.internal.g0.p(senIds, "senIds");
            kotlin.jvm.internal.g0.p(explainIds, "explainIds");
            kotlin.jvm.internal.g0.p(aiPhraseIds, "aiPhraseIds");
            return new p(i11, meanIds, senIds, explainIds, aiPhraseIds);
        }

        @m80.k
        public final List<Long> q() {
            return this.f69458e;
        }

        @m80.k
        public final List<Long> s() {
            return this.f69457d;
        }

        @m80.k
        public String toString() {
            return "Mode(mode=" + this.f69454a + ", meanIds=" + this.f69455b + ", senIds=" + this.f69456c + ", explainIds=" + this.f69457d + ", aiPhraseIds=" + this.f69458e + ')';
        }

        @m80.k
        public final List<Long> u() {
            return this.f69455b;
        }

        public final int w() {
            return this.f69454a;
        }

        @m80.k
        public final List<Long> y() {
            return this.f69456c;
        }

        public p(int i11, @m80.k List<Long> meanIds, @m80.k List<Long> senIds, @m80.k List<Long> explainIds, @m80.k List<Long> aiPhraseIds) {
            kotlin.jvm.internal.g0.p(meanIds, "meanIds");
            kotlin.jvm.internal.g0.p(senIds, "senIds");
            kotlin.jvm.internal.g0.p(explainIds, "explainIds");
            kotlin.jvm.internal.g0.p(aiPhraseIds, "aiPhraseIds");
            this.f69454a = i11;
            this.f69455b = meanIds;
            this.f69456c = senIds;
            this.f69457d = explainIds;
            this.f69458e = aiPhraseIds;
        }

        public /* synthetic */ p(int i11, List list, List list2, List list3, List list4, int i12, kotlin.jvm.internal.v vVar) {
            this(i11, (i12 & 2) != 0 ? a00.h0.J() : list, (i12 & 4) != 0 ? a00.h0.J() : list2, (i12 & 8) != 0 ? a00.h0.J() : list3, (i12 & 16) != 0 ? a00.h0.J() : list4);
        }

        @f50.z("aiPhraseIds")
        public static /* synthetic */ void r() {
        }

        @f50.z("explainIds")
        public static /* synthetic */ void t() {
        }

        @f50.z("meanIds")
        public static /* synthetic */ void v() {
        }

        @f50.z("mode")
        public static /* synthetic */ void x() {
        }

        @f50.z("senIds")
        public static /* synthetic */ void z() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @f50.a0
    public static final class n {

        @m80.k
        public static final b Companion = new b(null);

        /* renamed from: i, reason: collision with root package name */
        @w00.g
        @m80.k
        public static final yz.c0<f50.i<Object>>[] f69440i;

        /* renamed from: a, reason: collision with root package name */
        public final long f69441a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f69442b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final String f69443c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final String f69444d;

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final List<Long> f69445e;

        /* renamed from: f, reason: collision with root package name */
        @m80.k
        public final List<Long> f69446f;

        /* renamed from: g, reason: collision with root package name */
        @m80.k
        public final List<Long> f69447g;

        /* renamed from: h, reason: collision with root package name */
        @m80.k
        public final List<i> f69448h;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        public static final /* synthetic */ class a implements j50.p0<n> {

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public static final a f69449a;

            @m80.k
            private static final h50.f descriptor;

            static {
                a aVar = new a();
                f69449a = aVar;
                j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.TopicResourceModel.Mean", aVar, 8);
                l2Var.q("id", false);
                l2Var.q("meanType", false);
                l2Var.q(com.baicizhan.main.wikiv2.studyv2.data.t.f26099a, false);
                l2Var.q("meanEn", true);
                l2Var.q("senIds", true);
                l2Var.q("explainIds", true);
                l2Var.q("aiPhraseIds", true);
                l2Var.q("exams", true);
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
                yz.c0[] c0VarArr = n.f69440i;
                d3 d3Var = d3.f63348a;
                return new f50.i[]{j50.l1.f63406a, d3Var, d3Var, d3Var, c0VarArr[4].getValue(), c0VarArr[5].getValue(), c0VarArr[6].getValue(), c0VarArr[7].getValue()};
            }

            @Override // f50.e
            @m80.k
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final n e(@m80.k i50.f decoder) {
                int i11;
                List list;
                List list2;
                List list3;
                String str;
                String str2;
                String str3;
                List list4;
                long j11;
                kotlin.jvm.internal.g0.p(decoder, "decoder");
                h50.f fVar = descriptor;
                i50.d beginStructure = decoder.beginStructure(fVar);
                yz.c0[] c0VarArr = n.f69440i;
                String str4 = null;
                if (beginStructure.decodeSequentially()) {
                    long decodeLongElement = beginStructure.decodeLongElement(fVar, 0);
                    String decodeStringElement = beginStructure.decodeStringElement(fVar, 1);
                    String decodeStringElement2 = beginStructure.decodeStringElement(fVar, 2);
                    String decodeStringElement3 = beginStructure.decodeStringElement(fVar, 3);
                    List list5 = (List) beginStructure.decodeSerializableElement(fVar, 4, (f50.e) c0VarArr[4].getValue(), null);
                    List list6 = (List) beginStructure.decodeSerializableElement(fVar, 5, (f50.e) c0VarArr[5].getValue(), null);
                    List list7 = (List) beginStructure.decodeSerializableElement(fVar, 6, (f50.e) c0VarArr[6].getValue(), null);
                    list = (List) beginStructure.decodeSerializableElement(fVar, 7, (f50.e) c0VarArr[7].getValue(), null);
                    str = decodeStringElement;
                    str3 = decodeStringElement3;
                    str2 = decodeStringElement2;
                    i11 = 255;
                    list2 = list7;
                    list3 = list6;
                    list4 = list5;
                    j11 = decodeLongElement;
                } else {
                    boolean z11 = true;
                    int i12 = 0;
                    List list8 = null;
                    List list9 = null;
                    List list10 = null;
                    List list11 = null;
                    long j12 = 0;
                    String str5 = null;
                    String str6 = null;
                    while (z11) {
                        int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                        switch (decodeElementIndex) {
                            case -1:
                                z11 = false;
                                break;
                            case 0:
                                j12 = beginStructure.decodeLongElement(fVar, 0);
                                i12 |= 1;
                                break;
                            case 1:
                                i12 |= 2;
                                str4 = beginStructure.decodeStringElement(fVar, 1);
                                continue;
                            case 2:
                                i12 |= 4;
                                str5 = beginStructure.decodeStringElement(fVar, 2);
                                continue;
                            case 3:
                                str6 = beginStructure.decodeStringElement(fVar, 3);
                                i12 |= 8;
                                continue;
                            case 4:
                                list11 = (List) beginStructure.decodeSerializableElement(fVar, 4, (f50.e) c0VarArr[4].getValue(), list11);
                                i12 |= 16;
                                break;
                            case 5:
                                list10 = (List) beginStructure.decodeSerializableElement(fVar, 5, (f50.e) c0VarArr[5].getValue(), list10);
                                i12 |= 32;
                                break;
                            case 6:
                                list9 = (List) beginStructure.decodeSerializableElement(fVar, 6, (f50.e) c0VarArr[6].getValue(), list9);
                                i12 |= 64;
                                break;
                            case 7:
                                list8 = (List) beginStructure.decodeSerializableElement(fVar, 7, (f50.e) c0VarArr[7].getValue(), list8);
                                i12 |= 128;
                                break;
                            default:
                                throw new UnknownFieldException(decodeElementIndex);
                        }
                    }
                    i11 = i12;
                    list = list8;
                    list2 = list9;
                    list3 = list10;
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    list4 = list11;
                    j11 = j12;
                }
                beginStructure.endStructure(fVar);
                return new n(i11, j11, str, str2, str3, list4, list3, list2, list, (j50.x2) null);
            }

            @Override // f50.b0
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public final void b(@m80.k i50.h encoder, @m80.k n value) {
                kotlin.jvm.internal.g0.p(encoder, "encoder");
                kotlin.jvm.internal.g0.p(value, "value");
                h50.f fVar = descriptor;
                i50.e beginStructure = encoder.beginStructure(fVar);
                n.J(value, beginStructure, fVar);
                beginStructure.endStructure(fVar);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
                this();
            }

            @m80.k
            public final f50.i<n> serializer() {
                return a.f69449a;
            }

            public b() {
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            f69440i = new yz.c0[]{null, null, null, null, yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.x0
                @Override // x00.a
                public final Object invoke() {
                    f50.i e11;
                    e11 = i0.n.e();
                    return e11;
                }
            }), yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.y0
                @Override // x00.a
                public final Object invoke() {
                    f50.i f11;
                    f11 = i0.n.f();
                    return f11;
                }
            }), yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.z0
                @Override // x00.a
                public final Object invoke() {
                    f50.i g11;
                    g11 = i0.n.g();
                    return g11;
                }
            }), yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.a1
                @Override // x00.a
                public final Object invoke() {
                    f50.i h11;
                    h11 = i0.n.h();
                    return h11;
                }
            })};
        }

        public /* synthetic */ n(int i11, long j11, String str, String str2, String str3, List list, List list2, List list3, List list4, j50.x2 x2Var) {
            if (7 != (i11 & 7)) {
                j50.h2.b(i11, 7, a.f69449a.a());
            }
            this.f69441a = j11;
            this.f69442b = str;
            this.f69443c = str2;
            if ((i11 & 8) == 0) {
                this.f69444d = "";
            } else {
                this.f69444d = str3;
            }
            if ((i11 & 16) == 0) {
                this.f69445e = a00.h0.J();
            } else {
                this.f69445e = list;
            }
            if ((i11 & 32) == 0) {
                this.f69446f = a00.h0.J();
            } else {
                this.f69446f = list2;
            }
            if ((i11 & 64) == 0) {
                this.f69447g = a00.h0.J();
            } else {
                this.f69447g = list3;
            }
            if ((i11 & 128) == 0) {
                this.f69448h = a00.h0.J();
            } else {
                this.f69448h = list4;
            }
        }

        @w00.o
        public static final /* synthetic */ void J(n nVar, i50.e eVar, h50.f fVar) {
            yz.c0<f50.i<Object>>[] c0VarArr = f69440i;
            eVar.encodeLongElement(fVar, 0, nVar.f69441a);
            eVar.encodeStringElement(fVar, 1, nVar.f69442b);
            eVar.encodeStringElement(fVar, 2, nVar.f69443c);
            if (eVar.shouldEncodeElementDefault(fVar, 3) || !kotlin.jvm.internal.g0.g(nVar.f69444d, "")) {
                eVar.encodeStringElement(fVar, 3, nVar.f69444d);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 4) || !kotlin.jvm.internal.g0.g(nVar.f69445e, a00.h0.J())) {
                eVar.encodeSerializableElement(fVar, 4, c0VarArr[4].getValue(), nVar.f69445e);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 5) || !kotlin.jvm.internal.g0.g(nVar.f69446f, a00.h0.J())) {
                eVar.encodeSerializableElement(fVar, 5, c0VarArr[5].getValue(), nVar.f69446f);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 6) || !kotlin.jvm.internal.g0.g(nVar.f69447g, a00.h0.J())) {
                eVar.encodeSerializableElement(fVar, 6, c0VarArr[6].getValue(), nVar.f69447g);
            }
            if (!eVar.shouldEncodeElementDefault(fVar, 7) && kotlin.jvm.internal.g0.g(nVar.f69448h, a00.h0.J())) {
                return;
            }
            eVar.encodeSerializableElement(fVar, 7, c0VarArr[7].getValue(), nVar.f69448h);
        }

        public static final /* synthetic */ f50.i e() {
            return new j50.f(j50.l1.f63406a);
        }

        public static final /* synthetic */ f50.i f() {
            return new j50.f(j50.l1.f63406a);
        }

        public static final /* synthetic */ f50.i g() {
            return new j50.f(j50.l1.f63406a);
        }

        public static final /* synthetic */ f50.i h() {
            return new j50.f(i.a.f69417a);
        }

        public static /* synthetic */ n s(n nVar, long j11, String str, String str2, String str3, List list, List list2, List list3, List list4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j11 = nVar.f69441a;
            }
            long j12 = j11;
            if ((i11 & 2) != 0) {
                str = nVar.f69442b;
            }
            String str4 = str;
            if ((i11 & 4) != 0) {
                str2 = nVar.f69443c;
            }
            String str5 = str2;
            if ((i11 & 8) != 0) {
                str3 = nVar.f69444d;
            }
            return nVar.r(j12, str4, str5, str3, (i11 & 16) != 0 ? nVar.f69445e : list, (i11 & 32) != 0 ? nVar.f69446f : list2, (i11 & 64) != 0 ? nVar.f69447g : list3, (i11 & 128) != 0 ? nVar.f69448h : list4);
        }

        @m80.k
        public final String B() {
            return this.f69443c;
        }

        @m80.k
        public final String D() {
            return this.f69444d;
        }

        @m80.k
        public final String F() {
            return this.f69442b;
        }

        @m80.k
        public final List<Long> H() {
            return this.f69445e;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return this.f69441a == nVar.f69441a && kotlin.jvm.internal.g0.g(this.f69442b, nVar.f69442b) && kotlin.jvm.internal.g0.g(this.f69443c, nVar.f69443c) && kotlin.jvm.internal.g0.g(this.f69444d, nVar.f69444d) && kotlin.jvm.internal.g0.g(this.f69445e, nVar.f69445e) && kotlin.jvm.internal.g0.g(this.f69446f, nVar.f69446f) && kotlin.jvm.internal.g0.g(this.f69447g, nVar.f69447g) && kotlin.jvm.internal.g0.g(this.f69448h, nVar.f69448h);
        }

        public int hashCode() {
            return (((((((((((((Long.hashCode(this.f69441a) * 31) + this.f69442b.hashCode()) * 31) + this.f69443c.hashCode()) * 31) + this.f69444d.hashCode()) * 31) + this.f69445e.hashCode()) * 31) + this.f69446f.hashCode()) * 31) + this.f69447g.hashCode()) * 31) + this.f69448h.hashCode();
        }

        public final long j() {
            return this.f69441a;
        }

        @m80.k
        public final String k() {
            return this.f69442b;
        }

        @m80.k
        public final String l() {
            return this.f69443c;
        }

        @m80.k
        public final String m() {
            return this.f69444d;
        }

        @m80.k
        public final List<Long> n() {
            return this.f69445e;
        }

        @m80.k
        public final List<Long> o() {
            return this.f69446f;
        }

        @m80.k
        public final List<Long> p() {
            return this.f69447g;
        }

        @m80.k
        public final List<i> q() {
            return this.f69448h;
        }

        @m80.k
        public final n r(long j11, @m80.k String meanType, @m80.k String mean, @m80.k String meanEn, @m80.k List<Long> senIds, @m80.k List<Long> explainIds, @m80.k List<Long> aiPhraseIds, @m80.k List<i> exams) {
            kotlin.jvm.internal.g0.p(meanType, "meanType");
            kotlin.jvm.internal.g0.p(mean, "mean");
            kotlin.jvm.internal.g0.p(meanEn, "meanEn");
            kotlin.jvm.internal.g0.p(senIds, "senIds");
            kotlin.jvm.internal.g0.p(explainIds, "explainIds");
            kotlin.jvm.internal.g0.p(aiPhraseIds, "aiPhraseIds");
            kotlin.jvm.internal.g0.p(exams, "exams");
            return new n(j11, meanType, mean, meanEn, senIds, explainIds, aiPhraseIds, exams);
        }

        @m80.k
        public final List<Long> t() {
            return this.f69447g;
        }

        @m80.k
        public String toString() {
            return "Mean(id=" + this.f69441a + ", meanType=" + this.f69442b + ", mean=" + this.f69443c + ", meanEn=" + this.f69444d + ", senIds=" + this.f69445e + ", explainIds=" + this.f69446f + ", aiPhraseIds=" + this.f69447g + ", exams=" + this.f69448h + ')';
        }

        @m80.k
        public final List<i> v() {
            return this.f69448h;
        }

        @m80.k
        public final List<Long> x() {
            return this.f69446f;
        }

        public final long z() {
            return this.f69441a;
        }

        public n(long j11, @m80.k String meanType, @m80.k String mean, @m80.k String meanEn, @m80.k List<Long> senIds, @m80.k List<Long> explainIds, @m80.k List<Long> aiPhraseIds, @m80.k List<i> exams) {
            kotlin.jvm.internal.g0.p(meanType, "meanType");
            kotlin.jvm.internal.g0.p(mean, "mean");
            kotlin.jvm.internal.g0.p(meanEn, "meanEn");
            kotlin.jvm.internal.g0.p(senIds, "senIds");
            kotlin.jvm.internal.g0.p(explainIds, "explainIds");
            kotlin.jvm.internal.g0.p(aiPhraseIds, "aiPhraseIds");
            kotlin.jvm.internal.g0.p(exams, "exams");
            this.f69441a = j11;
            this.f69442b = meanType;
            this.f69443c = mean;
            this.f69444d = meanEn;
            this.f69445e = senIds;
            this.f69446f = explainIds;
            this.f69447g = aiPhraseIds;
            this.f69448h = exams;
        }

        @f50.z("id")
        public static /* synthetic */ void A() {
        }

        @f50.z(com.baicizhan.main.wikiv2.studyv2.data.t.f26099a)
        public static /* synthetic */ void C() {
        }

        @f50.z("meanEn")
        public static /* synthetic */ void E() {
        }

        @f50.z("meanType")
        public static /* synthetic */ void G() {
        }

        @f50.z("senIds")
        public static /* synthetic */ void I() {
        }

        @f50.z("aiPhraseIds")
        public static /* synthetic */ void u() {
        }

        @f50.z("exams")
        public static /* synthetic */ void w() {
        }

        @f50.z("explainIds")
        public static /* synthetic */ void y() {
        }

        public /* synthetic */ n(long j11, String str, String str2, String str3, List list, List list2, List list3, List list4, int i11, kotlin.jvm.internal.v vVar) {
            this(j11, str, str2, (i11 & 8) != 0 ? "" : str3, (i11 & 16) != 0 ? a00.h0.J() : list, (i11 & 32) != 0 ? a00.h0.J() : list2, (i11 & 64) != 0 ? a00.h0.J() : list3, (i11 & 128) != 0 ? a00.h0.J() : list4);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @f50.a0
    public static final class u {

        @m80.k
        public static final b Companion = new b(null);

        /* renamed from: r, reason: collision with root package name */
        @w00.g
        @m80.k
        public static final yz.c0<f50.i<Object>>[] f69484r;

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final c0 f69485a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final List<n> f69486b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final List<w> f69487c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final List<Long> f69488d;

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final List<z> f69489e;

        /* renamed from: f, reason: collision with root package name */
        @m80.k
        public final List<r> f69490f;

        /* renamed from: g, reason: collision with root package name */
        @m80.k
        public final List<b0> f69491g;

        /* renamed from: h, reason: collision with root package name */
        @m80.k
        public final List<h> f69492h;

        /* renamed from: i, reason: collision with root package name */
        @m80.l
        public final a0 f69493i;

        /* renamed from: j, reason: collision with root package name */
        @m80.k
        public final List<y> f69494j;

        /* renamed from: k, reason: collision with root package name */
        @m80.k
        public final List<String> f69495k;

        /* renamed from: l, reason: collision with root package name */
        @m80.k
        public final List<String> f69496l;

        /* renamed from: m, reason: collision with root package name */
        @m80.k
        public final List<String> f69497m;

        /* renamed from: n, reason: collision with root package name */
        @m80.k
        public final List<t> f69498n;

        /* renamed from: o, reason: collision with root package name */
        @m80.l
        public final b f69499o;

        /* renamed from: p, reason: collision with root package name */
        @m80.k
        public final List<e> f69500p;

        /* renamed from: q, reason: collision with root package name */
        @m80.k
        public final List<m> f69501q;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        public static final /* synthetic */ class a implements j50.p0<u> {

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public static final a f69502a;

            @m80.k
            private static final h50.f descriptor;

            static {
                a aVar = new a();
                f69502a = aVar;
                j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.TopicResourceModel.Resource", aVar, 17);
                l2Var.q("word", false);
                l2Var.q("means", true);
                l2Var.q("sentences", true);
                l2Var.q("wikiSenIds", true);
                l2Var.q("tips", true);
                l2Var.q("phrases", true);
                l2Var.q("variants", true);
                l2Var.q("derivations", true);
                l2Var.q("tvInfo", true);
                l2Var.q("similars", true);
                l2Var.q("synonyms", true);
                l2Var.q("antonyms", true);
                l2Var.q("enMeans", true);
                l2Var.q("randoms", true);
                l2Var.q("aiData", true);
                l2Var.q("associatedWords", true);
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
                yz.c0[] c0VarArr = u.f69484r;
                return new f50.i[]{c0.a.f69388a, c0VarArr[1].getValue(), c0VarArr[2].getValue(), c0VarArr[3].getValue(), c0VarArr[4].getValue(), c0VarArr[5].getValue(), c0VarArr[6].getValue(), c0VarArr[7].getValue(), g50.a.v(a0.a.f69355a), c0VarArr[9].getValue(), c0VarArr[10].getValue(), c0VarArr[11].getValue(), c0VarArr[12].getValue(), c0VarArr[13].getValue(), g50.a.v(b.a.f69366a), c0VarArr[15].getValue(), c0VarArr[16].getValue()};
            }

            @Override // f50.e
            @m80.k
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final u e(@m80.k i50.f decoder) {
                int i11;
                c0 c0Var;
                List list;
                List list2;
                List list3;
                List list4;
                List list5;
                List list6;
                a0 a0Var;
                List list7;
                List list8;
                List list9;
                List list10;
                List list11;
                b bVar;
                List list12;
                List list13;
                List list14;
                List list15;
                List list16;
                List list17;
                List list18;
                kotlin.jvm.internal.g0.p(decoder, "decoder");
                h50.f fVar = descriptor;
                i50.d beginStructure = decoder.beginStructure(fVar);
                yz.c0[] c0VarArr = u.f69484r;
                if (beginStructure.decodeSequentially()) {
                    c0 c0Var2 = (c0) beginStructure.decodeSerializableElement(fVar, 0, c0.a.f69388a, null);
                    List list19 = (List) beginStructure.decodeSerializableElement(fVar, 1, (f50.e) c0VarArr[1].getValue(), null);
                    List list20 = (List) beginStructure.decodeSerializableElement(fVar, 2, (f50.e) c0VarArr[2].getValue(), null);
                    List list21 = (List) beginStructure.decodeSerializableElement(fVar, 3, (f50.e) c0VarArr[3].getValue(), null);
                    List list22 = (List) beginStructure.decodeSerializableElement(fVar, 4, (f50.e) c0VarArr[4].getValue(), null);
                    List list23 = (List) beginStructure.decodeSerializableElement(fVar, 5, (f50.e) c0VarArr[5].getValue(), null);
                    List list24 = (List) beginStructure.decodeSerializableElement(fVar, 6, (f50.e) c0VarArr[6].getValue(), null);
                    List list25 = (List) beginStructure.decodeSerializableElement(fVar, 7, (f50.e) c0VarArr[7].getValue(), null);
                    a0 a0Var2 = (a0) beginStructure.decodeNullableSerializableElement(fVar, 8, a0.a.f69355a, null);
                    List list26 = (List) beginStructure.decodeSerializableElement(fVar, 9, (f50.e) c0VarArr[9].getValue(), null);
                    List list27 = (List) beginStructure.decodeSerializableElement(fVar, 10, (f50.e) c0VarArr[10].getValue(), null);
                    List list28 = (List) beginStructure.decodeSerializableElement(fVar, 11, (f50.e) c0VarArr[11].getValue(), null);
                    List list29 = (List) beginStructure.decodeSerializableElement(fVar, 12, (f50.e) c0VarArr[12].getValue(), null);
                    List list30 = (List) beginStructure.decodeSerializableElement(fVar, 13, (f50.e) c0VarArr[13].getValue(), null);
                    b bVar2 = (b) beginStructure.decodeNullableSerializableElement(fVar, 14, b.a.f69366a, null);
                    i11 = 131071;
                    list13 = list21;
                    list11 = (List) beginStructure.decodeSerializableElement(fVar, 15, (f50.e) c0VarArr[15].getValue(), null);
                    c0Var = c0Var2;
                    list3 = list20;
                    a0Var = a0Var2;
                    list9 = list22;
                    list10 = list19;
                    list14 = (List) beginStructure.decodeSerializableElement(fVar, 16, (f50.e) c0VarArr[16].getValue(), null);
                    list6 = list27;
                    list = list26;
                    list7 = list25;
                    list8 = list24;
                    list2 = list23;
                    bVar = bVar2;
                    list12 = list30;
                    list4 = list29;
                    list5 = list28;
                } else {
                    int i12 = 16;
                    int i13 = 2;
                    int i14 = 4;
                    int i15 = 1;
                    boolean z11 = true;
                    List list31 = null;
                    List list32 = null;
                    List list33 = null;
                    List list34 = null;
                    List list35 = null;
                    List list36 = null;
                    List list37 = null;
                    b bVar3 = null;
                    List list38 = null;
                    c0 c0Var3 = null;
                    int i16 = 10;
                    int i17 = 9;
                    int i18 = 7;
                    int i19 = 6;
                    int i21 = 5;
                    int i22 = 3;
                    i11 = 0;
                    List list39 = null;
                    List list40 = null;
                    List list41 = null;
                    a0 a0Var3 = null;
                    List list42 = null;
                    List list43 = null;
                    List list44 = null;
                    while (z11) {
                        int i23 = i12;
                        int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                        switch (decodeElementIndex) {
                            case -1:
                                z11 = false;
                                list39 = list39;
                                list32 = list32;
                                i12 = 16;
                                i15 = 1;
                                i13 = 2;
                                i22 = 3;
                                i14 = 4;
                                i21 = 5;
                                i19 = 6;
                                i18 = 7;
                                i17 = 9;
                                i16 = 10;
                            case 0:
                                c0Var3 = (c0) beginStructure.decodeSerializableElement(fVar, 0, c0.a.f69388a, c0Var3);
                                i11 |= 1;
                                list39 = list39;
                                list32 = list32;
                                list31 = list31;
                                i12 = 16;
                                i15 = 1;
                                i13 = 2;
                                i22 = 3;
                                i14 = 4;
                                i21 = 5;
                                i19 = 6;
                                i18 = 7;
                                i17 = 9;
                                i16 = 10;
                            case 1:
                                List list45 = list39;
                                List list46 = list31;
                                f50.e eVar = (f50.e) c0VarArr[i15].getValue();
                                int i24 = i15;
                                list39 = (List) beginStructure.decodeSerializableElement(fVar, i24, eVar, list45);
                                i11 |= 2;
                                i15 = i24;
                                list32 = list32;
                                list31 = list46;
                                i12 = 16;
                                i13 = 2;
                                i22 = 3;
                                i14 = 4;
                                i21 = 5;
                                i19 = 6;
                                i18 = 7;
                                i17 = 9;
                                i16 = 10;
                            case 2:
                                list35 = (List) beginStructure.decodeSerializableElement(fVar, i13, (f50.e) c0VarArr[i13].getValue(), list35);
                                i11 |= 4;
                                list31 = list31;
                                list39 = list39;
                                i12 = 16;
                                i22 = 3;
                                i14 = 4;
                                i21 = 5;
                                i19 = 6;
                                i18 = 7;
                                i17 = 9;
                                i16 = 10;
                            case 3:
                                list32 = (List) beginStructure.decodeSerializableElement(fVar, i22, (f50.e) c0VarArr[i22].getValue(), list32);
                                i11 |= 8;
                                list31 = list31;
                                list39 = list39;
                                i12 = 16;
                                i14 = 4;
                                i21 = 5;
                                i19 = 6;
                                i18 = 7;
                                i17 = 9;
                                i16 = 10;
                            case 4:
                                list44 = (List) beginStructure.decodeSerializableElement(fVar, i14, (f50.e) c0VarArr[i14].getValue(), list44);
                                i11 |= 16;
                                list31 = list31;
                                list39 = list39;
                                i12 = 16;
                                i21 = 5;
                                i19 = 6;
                                i18 = 7;
                                i17 = 9;
                                i16 = 10;
                            case 5:
                                list34 = (List) beginStructure.decodeSerializableElement(fVar, i21, (f50.e) c0VarArr[i21].getValue(), list34);
                                i11 |= 32;
                                list31 = list31;
                                list39 = list39;
                                i12 = 16;
                                i19 = 6;
                                i18 = 7;
                                i17 = 9;
                                i16 = 10;
                            case 6:
                                list43 = (List) beginStructure.decodeSerializableElement(fVar, i19, (f50.e) c0VarArr[i19].getValue(), list43);
                                i11 |= 64;
                                list31 = list31;
                                list39 = list39;
                                i12 = 16;
                                i18 = 7;
                                i17 = 9;
                                i16 = 10;
                            case 7:
                                list15 = list39;
                                list16 = list31;
                                list42 = (List) beginStructure.decodeSerializableElement(fVar, i18, (f50.e) c0VarArr[i18].getValue(), list42);
                                i11 |= 128;
                                list31 = list16;
                                list39 = list15;
                                i12 = 16;
                                i17 = 9;
                                i16 = 10;
                            case 8:
                                list15 = list39;
                                list16 = list31;
                                a0Var3 = (a0) beginStructure.decodeNullableSerializableElement(fVar, 8, a0.a.f69355a, a0Var3);
                                i11 |= 256;
                                list31 = list16;
                                list39 = list15;
                                i12 = 16;
                                i17 = 9;
                                i16 = 10;
                            case 9:
                                list33 = (List) beginStructure.decodeSerializableElement(fVar, i17, (f50.e) c0VarArr[i17].getValue(), list33);
                                i11 |= 512;
                                list31 = list31;
                                list39 = list39;
                                i12 = 16;
                                i16 = 10;
                            case 10:
                                list17 = list39;
                                list18 = list31;
                                list41 = (List) beginStructure.decodeSerializableElement(fVar, i16, (f50.e) c0VarArr[i16].getValue(), list41);
                                i11 |= 1024;
                                list31 = list18;
                                list39 = list17;
                                i12 = 16;
                            case 11:
                                list17 = list39;
                                list18 = list31;
                                list40 = (List) beginStructure.decodeSerializableElement(fVar, 11, (f50.e) c0VarArr[11].getValue(), list40);
                                i11 |= 2048;
                                list31 = list18;
                                list39 = list17;
                                i12 = 16;
                            case 12:
                                list17 = list39;
                                list18 = list31;
                                list36 = (List) beginStructure.decodeSerializableElement(fVar, 12, (f50.e) c0VarArr[12].getValue(), list36);
                                i11 |= 4096;
                                list37 = list37;
                                list31 = list18;
                                list39 = list17;
                                i12 = 16;
                            case 13:
                                list17 = list39;
                                list18 = list31;
                                list37 = (List) beginStructure.decodeSerializableElement(fVar, 13, (f50.e) c0VarArr[13].getValue(), list37);
                                i11 |= 8192;
                                bVar3 = bVar3;
                                list31 = list18;
                                list39 = list17;
                                i12 = 16;
                            case 14:
                                list17 = list39;
                                list18 = list31;
                                bVar3 = (b) beginStructure.decodeNullableSerializableElement(fVar, 14, b.a.f69366a, bVar3);
                                i11 |= 16384;
                                list38 = list38;
                                list31 = list18;
                                list39 = list17;
                                i12 = 16;
                            case 15:
                                list17 = list39;
                                list18 = list31;
                                list38 = (List) beginStructure.decodeSerializableElement(fVar, 15, (f50.e) c0VarArr[15].getValue(), list38);
                                i11 |= 32768;
                                list31 = list18;
                                list39 = list17;
                                i12 = 16;
                            case 16:
                                list31 = (List) beginStructure.decodeSerializableElement(fVar, i23, (f50.e) c0VarArr[i23].getValue(), list31);
                                i11 |= 65536;
                                i12 = i23;
                                list39 = list39;
                            default:
                                throw new UnknownFieldException(decodeElementIndex);
                        }
                    }
                    c0Var = c0Var3;
                    list = list33;
                    list2 = list34;
                    list3 = list35;
                    list4 = list36;
                    list5 = list40;
                    list6 = list41;
                    a0Var = a0Var3;
                    list7 = list42;
                    list8 = list43;
                    list9 = list44;
                    list10 = list39;
                    list11 = list38;
                    bVar = bVar3;
                    list12 = list37;
                    list13 = list32;
                    list14 = list31;
                }
                int i25 = i11;
                beginStructure.endStructure(fVar);
                return new u(i25, c0Var, list10, list3, list13, list9, list2, list8, list7, a0Var, list, list6, list5, list4, list12, bVar, list11, list14, (j50.x2) null);
            }

            @Override // f50.b0
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public final void b(@m80.k i50.h encoder, @m80.k u value) {
                kotlin.jvm.internal.g0.p(encoder, "encoder");
                kotlin.jvm.internal.g0.p(value, "value");
                h50.f fVar = descriptor;
                i50.e beginStructure = encoder.beginStructure(fVar);
                u.E0(value, beginStructure, fVar);
                beginStructure.endStructure(fVar);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
                this();
            }

            @m80.k
            public final f50.i<u> serializer() {
                return a.f69502a;
            }

            public b() {
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            f69484r = new yz.c0[]{null, yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.o1
                @Override // x00.a
                public final Object invoke() {
                    f50.i o11;
                    o11 = i0.u.o();
                    return o11;
                }
            }), yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.x1
                @Override // x00.a
                public final Object invoke() {
                    f50.i p11;
                    p11 = i0.u.p();
                    return p11;
                }
            }), yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.y1
                @Override // x00.a
                public final Object invoke() {
                    f50.i q11;
                    q11 = i0.u.q();
                    return q11;
                }
            }), yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.z1
                @Override // x00.a
                public final Object invoke() {
                    f50.i u11;
                    u11 = i0.u.u();
                    return u11;
                }
            }), yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.a2
                @Override // x00.a
                public final Object invoke() {
                    f50.i v11;
                    v11 = i0.u.v();
                    return v11;
                }
            }), yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.b2
                @Override // x00.a
                public final Object invoke() {
                    f50.i w11;
                    w11 = i0.u.w();
                    return w11;
                }
            }), yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.p1
                @Override // x00.a
                public final Object invoke() {
                    f50.i x11;
                    x11 = i0.u.x();
                    return x11;
                }
            }), null, yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.q1
                @Override // x00.a
                public final Object invoke() {
                    f50.i y11;
                    y11 = i0.u.y();
                    return y11;
                }
            }), yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.r1
                @Override // x00.a
                public final Object invoke() {
                    f50.i z11;
                    z11 = i0.u.z();
                    return z11;
                }
            }), yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.s1
                @Override // x00.a
                public final Object invoke() {
                    f50.i A;
                    A = i0.u.A();
                    return A;
                }
            }), yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.t1
                @Override // x00.a
                public final Object invoke() {
                    f50.i B;
                    B = i0.u.B();
                    return B;
                }
            }), yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.u1
                @Override // x00.a
                public final Object invoke() {
                    f50.i r11;
                    r11 = i0.u.r();
                    return r11;
                }
            }), null, yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.v1
                @Override // x00.a
                public final Object invoke() {
                    f50.i s11;
                    s11 = i0.u.s();
                    return s11;
                }
            }), yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: l3.w1
                @Override // x00.a
                public final Object invoke() {
                    f50.i t11;
                    t11 = i0.u.t();
                    return t11;
                }
            })};
        }

        public /* synthetic */ u(int i11, c0 c0Var, List list, List list2, List list3, List list4, List list5, List list6, List list7, a0 a0Var, List list8, List list9, List list10, List list11, List list12, b bVar, List list13, List list14, j50.x2 x2Var) {
            if (1 != (i11 & 1)) {
                j50.h2.b(i11, 1, a.f69502a.a());
            }
            this.f69485a = c0Var;
            if ((i11 & 2) == 0) {
                this.f69486b = a00.h0.J();
            } else {
                this.f69486b = list;
            }
            if ((i11 & 4) == 0) {
                this.f69487c = a00.h0.J();
            } else {
                this.f69487c = list2;
            }
            if ((i11 & 8) == 0) {
                this.f69488d = a00.h0.J();
            } else {
                this.f69488d = list3;
            }
            if ((i11 & 16) == 0) {
                this.f69489e = a00.h0.J();
            } else {
                this.f69489e = list4;
            }
            if ((i11 & 32) == 0) {
                this.f69490f = a00.h0.J();
            } else {
                this.f69490f = list5;
            }
            if ((i11 & 64) == 0) {
                this.f69491g = a00.h0.J();
            } else {
                this.f69491g = list6;
            }
            if ((i11 & 128) == 0) {
                this.f69492h = a00.h0.J();
            } else {
                this.f69492h = list7;
            }
            if ((i11 & 256) == 0) {
                this.f69493i = null;
            } else {
                this.f69493i = a0Var;
            }
            if ((i11 & 512) == 0) {
                this.f69494j = a00.h0.J();
            } else {
                this.f69494j = list8;
            }
            if ((i11 & 1024) == 0) {
                this.f69495k = a00.h0.J();
            } else {
                this.f69495k = list9;
            }
            if ((i11 & 2048) == 0) {
                this.f69496l = a00.h0.J();
            } else {
                this.f69496l = list10;
            }
            this.f69497m = (i11 & 4096) == 0 ? a00.h0.J() : list11;
            this.f69498n = (i11 & 8192) == 0 ? a00.h0.J() : list12;
            if ((i11 & 16384) == 0) {
                this.f69499o = null;
            } else {
                this.f69499o = bVar;
            }
            this.f69500p = (32768 & i11) == 0 ? a00.h0.J() : list13;
            this.f69501q = (i11 & 65536) == 0 ? a00.h0.J() : list14;
        }

        public static final /* synthetic */ f50.i A() {
            return new j50.f(d3.f63348a);
        }

        public static final /* synthetic */ f50.i B() {
            return new j50.f(d3.f63348a);
        }

        @w00.o
        public static final /* synthetic */ void E0(u uVar, i50.e eVar, h50.f fVar) {
            yz.c0<f50.i<Object>>[] c0VarArr = f69484r;
            eVar.encodeSerializableElement(fVar, 0, c0.a.f69388a, uVar.f69485a);
            if (eVar.shouldEncodeElementDefault(fVar, 1) || !kotlin.jvm.internal.g0.g(uVar.f69486b, a00.h0.J())) {
                eVar.encodeSerializableElement(fVar, 1, c0VarArr[1].getValue(), uVar.f69486b);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 2) || !kotlin.jvm.internal.g0.g(uVar.f69487c, a00.h0.J())) {
                eVar.encodeSerializableElement(fVar, 2, c0VarArr[2].getValue(), uVar.f69487c);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 3) || !kotlin.jvm.internal.g0.g(uVar.f69488d, a00.h0.J())) {
                eVar.encodeSerializableElement(fVar, 3, c0VarArr[3].getValue(), uVar.f69488d);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 4) || !kotlin.jvm.internal.g0.g(uVar.f69489e, a00.h0.J())) {
                eVar.encodeSerializableElement(fVar, 4, c0VarArr[4].getValue(), uVar.f69489e);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 5) || !kotlin.jvm.internal.g0.g(uVar.f69490f, a00.h0.J())) {
                eVar.encodeSerializableElement(fVar, 5, c0VarArr[5].getValue(), uVar.f69490f);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 6) || !kotlin.jvm.internal.g0.g(uVar.f69491g, a00.h0.J())) {
                eVar.encodeSerializableElement(fVar, 6, c0VarArr[6].getValue(), uVar.f69491g);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 7) || !kotlin.jvm.internal.g0.g(uVar.f69492h, a00.h0.J())) {
                eVar.encodeSerializableElement(fVar, 7, c0VarArr[7].getValue(), uVar.f69492h);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 8) || uVar.f69493i != null) {
                eVar.encodeNullableSerializableElement(fVar, 8, a0.a.f69355a, uVar.f69493i);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 9) || !kotlin.jvm.internal.g0.g(uVar.f69494j, a00.h0.J())) {
                eVar.encodeSerializableElement(fVar, 9, c0VarArr[9].getValue(), uVar.f69494j);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 10) || !kotlin.jvm.internal.g0.g(uVar.f69495k, a00.h0.J())) {
                eVar.encodeSerializableElement(fVar, 10, c0VarArr[10].getValue(), uVar.f69495k);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 11) || !kotlin.jvm.internal.g0.g(uVar.f69496l, a00.h0.J())) {
                eVar.encodeSerializableElement(fVar, 11, c0VarArr[11].getValue(), uVar.f69496l);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 12) || !kotlin.jvm.internal.g0.g(uVar.f69497m, a00.h0.J())) {
                eVar.encodeSerializableElement(fVar, 12, c0VarArr[12].getValue(), uVar.f69497m);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 13) || !kotlin.jvm.internal.g0.g(uVar.f69498n, a00.h0.J())) {
                eVar.encodeSerializableElement(fVar, 13, c0VarArr[13].getValue(), uVar.f69498n);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 14) || uVar.f69499o != null) {
                eVar.encodeNullableSerializableElement(fVar, 14, b.a.f69366a, uVar.f69499o);
            }
            if (eVar.shouldEncodeElementDefault(fVar, 15) || !kotlin.jvm.internal.g0.g(uVar.f69500p, a00.h0.J())) {
                eVar.encodeSerializableElement(fVar, 15, c0VarArr[15].getValue(), uVar.f69500p);
            }
            if (!eVar.shouldEncodeElementDefault(fVar, 16) && kotlin.jvm.internal.g0.g(uVar.f69501q, a00.h0.J())) {
                return;
            }
            eVar.encodeSerializableElement(fVar, 16, c0VarArr[16].getValue(), uVar.f69501q);
        }

        public static /* synthetic */ u V(u uVar, c0 c0Var, List list, List list2, List list3, List list4, List list5, List list6, List list7, a0 a0Var, List list8, List list9, List list10, List list11, List list12, b bVar, List list13, List list14, int i11, Object obj) {
            List list15;
            List list16;
            c0 c0Var2;
            u uVar2;
            b bVar2;
            List list17;
            List list18;
            List list19;
            List list20;
            List list21;
            List list22;
            List list23;
            a0 a0Var2;
            List list24;
            List list25;
            List list26;
            List list27;
            List list28;
            c0 c0Var3 = (i11 & 1) != 0 ? uVar.f69485a : c0Var;
            List list29 = (i11 & 2) != 0 ? uVar.f69486b : list;
            List list30 = (i11 & 4) != 0 ? uVar.f69487c : list2;
            List list31 = (i11 & 8) != 0 ? uVar.f69488d : list3;
            List list32 = (i11 & 16) != 0 ? uVar.f69489e : list4;
            List list33 = (i11 & 32) != 0 ? uVar.f69490f : list5;
            List list34 = (i11 & 64) != 0 ? uVar.f69491g : list6;
            List list35 = (i11 & 128) != 0 ? uVar.f69492h : list7;
            a0 a0Var3 = (i11 & 256) != 0 ? uVar.f69493i : a0Var;
            List list36 = (i11 & 512) != 0 ? uVar.f69494j : list8;
            List list37 = (i11 & 1024) != 0 ? uVar.f69495k : list9;
            List list38 = (i11 & 2048) != 0 ? uVar.f69496l : list10;
            List list39 = (i11 & 4096) != 0 ? uVar.f69497m : list11;
            List list40 = (i11 & 8192) != 0 ? uVar.f69498n : list12;
            c0 c0Var4 = c0Var3;
            b bVar3 = (i11 & 16384) != 0 ? uVar.f69499o : bVar;
            List list41 = (i11 & 32768) != 0 ? uVar.f69500p : list13;
            if ((i11 & 65536) != 0) {
                list16 = list41;
                list15 = uVar.f69501q;
                bVar2 = bVar3;
                list17 = list29;
                list18 = list30;
                list19 = list31;
                list20 = list32;
                list21 = list33;
                list22 = list34;
                list23 = list35;
                a0Var2 = a0Var3;
                list24 = list36;
                list25 = list37;
                list26 = list38;
                list27 = list39;
                list28 = list40;
                c0Var2 = c0Var4;
                uVar2 = uVar;
            } else {
                list15 = list14;
                list16 = list41;
                c0Var2 = c0Var4;
                uVar2 = uVar;
                bVar2 = bVar3;
                list17 = list29;
                list18 = list30;
                list19 = list31;
                list20 = list32;
                list21 = list33;
                list22 = list34;
                list23 = list35;
                a0Var2 = a0Var3;
                list24 = list36;
                list25 = list37;
                list26 = list38;
                list27 = list39;
                list28 = list40;
            }
            return uVar2.U(c0Var2, list17, list18, list19, list20, list21, list22, list23, a0Var2, list24, list25, list26, list27, list28, bVar2, list16, list15);
        }

        public static final /* synthetic */ f50.i o() {
            return new j50.f(n.a.f69449a);
        }

        public static final /* synthetic */ f50.i p() {
            return new j50.f(w.a.f69528a);
        }

        public static final /* synthetic */ f50.i q() {
            return new j50.f(j50.l1.f63406a);
        }

        public static final /* synthetic */ f50.i r() {
            return new j50.f(t.a.f69483a);
        }

        public static final /* synthetic */ f50.i s() {
            return new j50.f(e.a.f69406a);
        }

        public static final /* synthetic */ f50.i t() {
            return new j50.f(m.a.f69439a);
        }

        public static final /* synthetic */ f50.i u() {
            return new j50.f(z.a.f69543a);
        }

        public static final /* synthetic */ f50.i v() {
            return new j50.f(r.a.f69475a);
        }

        public static final /* synthetic */ f50.i w() {
            return new j50.f(b0.a.f69369a);
        }

        public static final /* synthetic */ f50.i x() {
            return new j50.f(h.a.f69413a);
        }

        public static final /* synthetic */ f50.i y() {
            return new j50.f(y.a.f69540a);
        }

        public static final /* synthetic */ f50.i z() {
            return new j50.f(d3.f63348a);
        }

        @m80.k
        public final List<Long> A0() {
            return this.f69488d;
        }

        @m80.k
        public final c0 C0() {
            return this.f69485a;
        }

        @m80.k
        public final c0 D() {
            return this.f69485a;
        }

        @m80.k
        public final List<y> E() {
            return this.f69494j;
        }

        @m80.k
        public final List<String> F() {
            return this.f69495k;
        }

        @m80.k
        public final List<String> G() {
            return this.f69496l;
        }

        @m80.k
        public final List<String> H() {
            return this.f69497m;
        }

        @m80.k
        public final List<t> I() {
            return this.f69498n;
        }

        @m80.l
        public final b J() {
            return this.f69499o;
        }

        @m80.k
        public final List<e> K() {
            return this.f69500p;
        }

        @m80.k
        public final List<m> L() {
            return this.f69501q;
        }

        @m80.k
        public final List<n> M() {
            return this.f69486b;
        }

        @m80.k
        public final List<w> N() {
            return this.f69487c;
        }

        @m80.k
        public final List<Long> O() {
            return this.f69488d;
        }

        @m80.k
        public final List<z> P() {
            return this.f69489e;
        }

        @m80.k
        public final List<r> Q() {
            return this.f69490f;
        }

        @m80.k
        public final List<b0> R() {
            return this.f69491g;
        }

        @m80.k
        public final List<h> S() {
            return this.f69492h;
        }

        @m80.l
        public final a0 T() {
            return this.f69493i;
        }

        @m80.k
        public final u U(@m80.k c0 word, @m80.k List<n> means, @m80.k List<w> sentences, @m80.k List<Long> wikiSenIds, @m80.k List<z> tips, @m80.k List<r> phrases, @m80.k List<b0> variants, @m80.k List<h> derivations, @m80.l a0 a0Var, @m80.k List<y> similars, @m80.k List<String> synonyms, @m80.k List<String> antonyms, @m80.k List<String> enMeans, @m80.k List<t> randoms, @m80.l b bVar, @m80.k List<e> associatedWords, @m80.k List<m> spellingKeyPoints) {
            kotlin.jvm.internal.g0.p(word, "word");
            kotlin.jvm.internal.g0.p(means, "means");
            kotlin.jvm.internal.g0.p(sentences, "sentences");
            kotlin.jvm.internal.g0.p(wikiSenIds, "wikiSenIds");
            kotlin.jvm.internal.g0.p(tips, "tips");
            kotlin.jvm.internal.g0.p(phrases, "phrases");
            kotlin.jvm.internal.g0.p(variants, "variants");
            kotlin.jvm.internal.g0.p(derivations, "derivations");
            kotlin.jvm.internal.g0.p(similars, "similars");
            kotlin.jvm.internal.g0.p(synonyms, "synonyms");
            kotlin.jvm.internal.g0.p(antonyms, "antonyms");
            kotlin.jvm.internal.g0.p(enMeans, "enMeans");
            kotlin.jvm.internal.g0.p(randoms, "randoms");
            kotlin.jvm.internal.g0.p(associatedWords, "associatedWords");
            kotlin.jvm.internal.g0.p(spellingKeyPoints, "spellingKeyPoints");
            return new u(word, means, sentences, wikiSenIds, tips, phrases, variants, derivations, a0Var, similars, synonyms, antonyms, enMeans, randoms, bVar, associatedWords, spellingKeyPoints);
        }

        @m80.l
        public final b W() {
            return this.f69499o;
        }

        @m80.k
        public final List<String> Y() {
            return this.f69496l;
        }

        @m80.k
        public final List<e> a0() {
            return this.f69500p;
        }

        @m80.k
        public final List<h> c0() {
            return this.f69492h;
        }

        @m80.k
        public final List<String> e0() {
            return this.f69497m;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u)) {
                return false;
            }
            u uVar = (u) obj;
            return kotlin.jvm.internal.g0.g(this.f69485a, uVar.f69485a) && kotlin.jvm.internal.g0.g(this.f69486b, uVar.f69486b) && kotlin.jvm.internal.g0.g(this.f69487c, uVar.f69487c) && kotlin.jvm.internal.g0.g(this.f69488d, uVar.f69488d) && kotlin.jvm.internal.g0.g(this.f69489e, uVar.f69489e) && kotlin.jvm.internal.g0.g(this.f69490f, uVar.f69490f) && kotlin.jvm.internal.g0.g(this.f69491g, uVar.f69491g) && kotlin.jvm.internal.g0.g(this.f69492h, uVar.f69492h) && kotlin.jvm.internal.g0.g(this.f69493i, uVar.f69493i) && kotlin.jvm.internal.g0.g(this.f69494j, uVar.f69494j) && kotlin.jvm.internal.g0.g(this.f69495k, uVar.f69495k) && kotlin.jvm.internal.g0.g(this.f69496l, uVar.f69496l) && kotlin.jvm.internal.g0.g(this.f69497m, uVar.f69497m) && kotlin.jvm.internal.g0.g(this.f69498n, uVar.f69498n) && kotlin.jvm.internal.g0.g(this.f69499o, uVar.f69499o) && kotlin.jvm.internal.g0.g(this.f69500p, uVar.f69500p) && kotlin.jvm.internal.g0.g(this.f69501q, uVar.f69501q);
        }

        @m80.k
        public final List<n> g0() {
            return this.f69486b;
        }

        public int hashCode() {
            int hashCode = ((((((((((((((this.f69485a.hashCode() * 31) + this.f69486b.hashCode()) * 31) + this.f69487c.hashCode()) * 31) + this.f69488d.hashCode()) * 31) + this.f69489e.hashCode()) * 31) + this.f69490f.hashCode()) * 31) + this.f69491g.hashCode()) * 31) + this.f69492h.hashCode()) * 31;
            a0 a0Var = this.f69493i;
            int hashCode2 = (((((((((((hashCode + (a0Var == null ? 0 : a0Var.hashCode())) * 31) + this.f69494j.hashCode()) * 31) + this.f69495k.hashCode()) * 31) + this.f69496l.hashCode()) * 31) + this.f69497m.hashCode()) * 31) + this.f69498n.hashCode()) * 31;
            b bVar = this.f69499o;
            return ((((hashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31) + this.f69500p.hashCode()) * 31) + this.f69501q.hashCode();
        }

        @m80.k
        public final List<r> i0() {
            return this.f69490f;
        }

        @m80.k
        public final List<t> k0() {
            return this.f69498n;
        }

        @m80.k
        public final List<w> m0() {
            return this.f69487c;
        }

        @m80.k
        public final List<y> o0() {
            return this.f69494j;
        }

        @m80.k
        public final List<m> q0() {
            return this.f69501q;
        }

        @m80.k
        public final List<String> s0() {
            return this.f69495k;
        }

        @m80.k
        public String toString() {
            return "Resource(word=" + this.f69485a + ", means=" + this.f69486b + ", sentences=" + this.f69487c + ", wikiSenIds=" + this.f69488d + ", tips=" + this.f69489e + ", phrases=" + this.f69490f + ", variants=" + this.f69491g + ", derivations=" + this.f69492h + ", tvInfo=" + this.f69493i + ", similars=" + this.f69494j + ", synonyms=" + this.f69495k + ", antonyms=" + this.f69496l + ", enMeans=" + this.f69497m + ", randoms=" + this.f69498n + ", aiData=" + this.f69499o + ", associatedWords=" + this.f69500p + ", spellingKeyPoints=" + this.f69501q + ')';
        }

        @m80.k
        public final List<z> u0() {
            return this.f69489e;
        }

        @m80.l
        public final a0 w0() {
            return this.f69493i;
        }

        @m80.k
        public final List<b0> y0() {
            return this.f69491g;
        }

        @f50.z("wikiSenIds")
        public static /* synthetic */ void B0() {
        }

        @f50.z("word")
        public static /* synthetic */ void D0() {
        }

        @f50.z("aiData")
        public static /* synthetic */ void X() {
        }

        @f50.z("antonyms")
        public static /* synthetic */ void Z() {
        }

        @f50.z("associatedWords")
        public static /* synthetic */ void b0() {
        }

        @f50.z("derivations")
        public static /* synthetic */ void d0() {
        }

        @f50.z("enMeans")
        public static /* synthetic */ void f0() {
        }

        @f50.z("means")
        public static /* synthetic */ void h0() {
        }

        @f50.z("phrases")
        public static /* synthetic */ void j0() {
        }

        @f50.z("randoms")
        public static /* synthetic */ void l0() {
        }

        @f50.z("sentences")
        public static /* synthetic */ void n0() {
        }

        @f50.z("similars")
        public static /* synthetic */ void p0() {
        }

        @f50.z("spellingKeyPoints")
        public static /* synthetic */ void r0() {
        }

        @f50.z("synonyms")
        public static /* synthetic */ void t0() {
        }

        @f50.z("tips")
        public static /* synthetic */ void v0() {
        }

        @f50.z("tvInfo")
        public static /* synthetic */ void x0() {
        }

        @f50.z("variants")
        public static /* synthetic */ void z0() {
        }

        public u(@m80.k c0 word, @m80.k List<n> means, @m80.k List<w> sentences, @m80.k List<Long> wikiSenIds, @m80.k List<z> tips, @m80.k List<r> phrases, @m80.k List<b0> variants, @m80.k List<h> derivations, @m80.l a0 a0Var, @m80.k List<y> similars, @m80.k List<String> synonyms, @m80.k List<String> antonyms, @m80.k List<String> enMeans, @m80.k List<t> randoms, @m80.l b bVar, @m80.k List<e> associatedWords, @m80.k List<m> spellingKeyPoints) {
            kotlin.jvm.internal.g0.p(word, "word");
            kotlin.jvm.internal.g0.p(means, "means");
            kotlin.jvm.internal.g0.p(sentences, "sentences");
            kotlin.jvm.internal.g0.p(wikiSenIds, "wikiSenIds");
            kotlin.jvm.internal.g0.p(tips, "tips");
            kotlin.jvm.internal.g0.p(phrases, "phrases");
            kotlin.jvm.internal.g0.p(variants, "variants");
            kotlin.jvm.internal.g0.p(derivations, "derivations");
            kotlin.jvm.internal.g0.p(similars, "similars");
            kotlin.jvm.internal.g0.p(synonyms, "synonyms");
            kotlin.jvm.internal.g0.p(antonyms, "antonyms");
            kotlin.jvm.internal.g0.p(enMeans, "enMeans");
            kotlin.jvm.internal.g0.p(randoms, "randoms");
            kotlin.jvm.internal.g0.p(associatedWords, "associatedWords");
            kotlin.jvm.internal.g0.p(spellingKeyPoints, "spellingKeyPoints");
            this.f69485a = word;
            this.f69486b = means;
            this.f69487c = sentences;
            this.f69488d = wikiSenIds;
            this.f69489e = tips;
            this.f69490f = phrases;
            this.f69491g = variants;
            this.f69492h = derivations;
            this.f69493i = a0Var;
            this.f69494j = similars;
            this.f69495k = synonyms;
            this.f69496l = antonyms;
            this.f69497m = enMeans;
            this.f69498n = randoms;
            this.f69499o = bVar;
            this.f69500p = associatedWords;
            this.f69501q = spellingKeyPoints;
        }

        public /* synthetic */ u(c0 c0Var, List list, List list2, List list3, List list4, List list5, List list6, List list7, a0 a0Var, List list8, List list9, List list10, List list11, List list12, b bVar, List list13, List list14, int i11, kotlin.jvm.internal.v vVar) {
            this(c0Var, (i11 & 2) != 0 ? a00.h0.J() : list, (i11 & 4) != 0 ? a00.h0.J() : list2, (i11 & 8) != 0 ? a00.h0.J() : list3, (i11 & 16) != 0 ? a00.h0.J() : list4, (i11 & 32) != 0 ? a00.h0.J() : list5, (i11 & 64) != 0 ? a00.h0.J() : list6, (i11 & 128) != 0 ? a00.h0.J() : list7, (i11 & 256) != 0 ? null : a0Var, (i11 & 512) != 0 ? a00.h0.J() : list8, (i11 & 1024) != 0 ? a00.h0.J() : list9, (i11 & 2048) != 0 ? a00.h0.J() : list10, (i11 & 4096) != 0 ? a00.h0.J() : list11, (i11 & 8192) != 0 ? a00.h0.J() : list12, (i11 & 16384) == 0 ? bVar : null, (32768 & i11) != 0 ? a00.h0.J() : list13, (i11 & 65536) != 0 ? a00.h0.J() : list14);
        }
    }

    @f50.z("modes")
    public static /* synthetic */ void B() {
    }

    @f50.z("proExplanation")
    public static /* synthetic */ void D() {
    }

    @f50.z("proPhrases")
    public static /* synthetic */ void F() {
    }

    @f50.z("resource")
    public static /* synthetic */ void H() {
    }

    @f50.z("topicId")
    public static /* synthetic */ void J() {
    }

    @f50.z("word")
    public static /* synthetic */ void L() {
    }

    @f50.z("wordConjugation")
    public static /* synthetic */ void N() {
    }

    @f50.z("wordPack")
    public static /* synthetic */ void P() {
    }

    @f50.z("additionalExplanation")
    public static /* synthetic */ void v() {
    }

    @f50.z("cake")
    public static /* synthetic */ void x() {
    }

    @f50.z("confusingConcept")
    public static /* synthetic */ void z() {
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ i0(int r15, java.lang.String r16, java.util.List r17, l3.i0.u r18, java.lang.String r19, java.util.List r20, java.util.List r21, java.lang.String r22, java.lang.String r23, l3.y2 r24, l3.i0.d r25, int r26, kotlin.jvm.internal.v r27) {
        /*
            r14 = this;
            r0 = r26
            r1 = r0 & 4
            if (r1 == 0) goto Lc
            java.util.List r1 = a00.h0.J()
            r5 = r1
            goto Le
        Lc:
            r5 = r17
        Le:
            r1 = r0 & 16
            r2 = 0
            if (r1 == 0) goto L15
            r7 = r2
            goto L17
        L15:
            r7 = r19
        L17:
            r1 = r0 & 32
            if (r1 == 0) goto L21
            java.util.List r1 = a00.h0.J()
            r8 = r1
            goto L23
        L21:
            r8 = r20
        L23:
            r1 = r0 & 64
            if (r1 == 0) goto L2d
            java.util.List r1 = a00.h0.J()
            r9 = r1
            goto L2f
        L2d:
            r9 = r21
        L2f:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L35
            r10 = r2
            goto L37
        L35:
            r10 = r22
        L37:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L3d
            r11 = r2
            goto L3f
        L3d:
            r11 = r23
        L3f:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L45
            r12 = r2
            goto L47
        L45:
            r12 = r24
        L47:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L53
            r13 = r2
            r3 = r15
            r4 = r16
            r6 = r18
            r2 = r14
            goto L5b
        L53:
            r13 = r25
            r2 = r14
            r3 = r15
            r4 = r16
            r6 = r18
        L5b:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.i0.<init>(int, java.lang.String, java.util.List, l3.i0$u, java.lang.String, java.util.List, java.util.List, java.lang.String, java.lang.String, l3.y2, l3.i0$d, int, kotlin.jvm.internal.v):void");
    }
}
