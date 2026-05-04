package l3;

import j50.d3;
import j50.p0;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.UnknownFieldException;
import l3.l2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class a3 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final yz.c0<f50.i<Object>>[] f69267h = {null, null, null, null, yz.e0.b(LazyThreadSafetyMode.PUBLICATION, new x00.a() { // from class: l3.z2
        @Override // x00.a
        public final Object invoke() {
            f50.i b11;
            b11 = a3.b();
            return b11;
        }
    }), null, null};

    /* renamed from: a, reason: collision with root package name */
    public final int f69268a;

    /* renamed from: b, reason: collision with root package name */
    public final int f69269b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final String f69270c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final String f69271d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final List<l2> f69272e;

    /* renamed from: f, reason: collision with root package name */
    public final int f69273f;

    /* renamed from: g, reason: collision with root package name */
    public final int f69274g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<a3> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f69275a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f69275a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.WordRoot", aVar, 7);
            l2Var.q("meanId", true);
            l2Var.q("sentenceId", true);
            l2Var.q("etymology", true);
            l2Var.q("mnemonic", true);
            l2Var.q("rootList", true);
            l2Var.q("samePrefixCnt", true);
            l2Var.q("sameRootCnt", true);
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
            yz.c0[] c0VarArr = a3.f69267h;
            j50.z0 z0Var = j50.z0.f63517a;
            d3 d3Var = d3.f63348a;
            return new f50.i[]{z0Var, z0Var, g50.a.v(d3Var), g50.a.v(d3Var), c0VarArr[4].getValue(), z0Var, z0Var};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final a3 e(@m80.k i50.f decoder) {
            int i11;
            List list;
            String str;
            int i12;
            int i13;
            int i14;
            int i15;
            String str2;
            char c11;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            yz.c0[] c0VarArr = a3.f69267h;
            int i16 = 6;
            if (beginStructure.decodeSequentially()) {
                i11 = beginStructure.decodeIntElement(fVar, 0);
                int decodeIntElement = beginStructure.decodeIntElement(fVar, 1);
                d3 d3Var = d3.f63348a;
                String str3 = (String) beginStructure.decodeNullableSerializableElement(fVar, 2, d3Var, null);
                String str4 = (String) beginStructure.decodeNullableSerializableElement(fVar, 3, d3Var, null);
                List list2 = (List) beginStructure.decodeSerializableElement(fVar, 4, (f50.e) c0VarArr[4].getValue(), null);
                int decodeIntElement2 = beginStructure.decodeIntElement(fVar, 5);
                list = list2;
                i12 = beginStructure.decodeIntElement(fVar, 6);
                i13 = decodeIntElement2;
                str = str4;
                str2 = str3;
                i14 = 127;
                i15 = decodeIntElement;
            } else {
                boolean z11 = true;
                i11 = 0;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                List list3 = null;
                String str5 = null;
                int i21 = 0;
                String str6 = null;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    switch (decodeElementIndex) {
                        case -1:
                            z11 = false;
                        case 0:
                            i18 |= 1;
                            i11 = beginStructure.decodeIntElement(fVar, 0);
                            i16 = 6;
                        case 1:
                            c11 = 2;
                            i19 = beginStructure.decodeIntElement(fVar, 1);
                            i18 |= 2;
                            i16 = 6;
                        case 2:
                            c11 = 2;
                            str5 = (String) beginStructure.decodeNullableSerializableElement(fVar, 2, d3.f63348a, str5);
                            i18 |= 4;
                            i16 = 6;
                        case 3:
                            str6 = (String) beginStructure.decodeNullableSerializableElement(fVar, 3, d3.f63348a, str6);
                            i18 |= 8;
                        case 4:
                            list3 = (List) beginStructure.decodeSerializableElement(fVar, 4, (f50.e) c0VarArr[4].getValue(), list3);
                            i18 |= 16;
                        case 5:
                            i17 = beginStructure.decodeIntElement(fVar, 5);
                            i18 |= 32;
                        case 6:
                            i21 = beginStructure.decodeIntElement(fVar, i16);
                            i18 |= 64;
                        default:
                            throw new UnknownFieldException(decodeElementIndex);
                    }
                }
                list = list3;
                str = str6;
                i12 = i21;
                i13 = i17;
                i14 = i18;
                i15 = i19;
                str2 = str5;
            }
            int i22 = i11;
            beginStructure.endStructure(fVar);
            return new a3(i14, i22, i15, str2, str, list, i13, i12, (j50.x2) null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k a3 value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            a3.A(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<a3> serializer() {
            return a.f69275a;
        }

        public b() {
        }
    }

    public a3() {
        this(0, 0, (String) null, (String) null, (List) null, 0, 0, 127, (kotlin.jvm.internal.v) null);
    }

    @w00.o
    public static final /* synthetic */ void A(a3 a3Var, i50.e eVar, h50.f fVar) {
        yz.c0<f50.i<Object>>[] c0VarArr = f69267h;
        if (eVar.shouldEncodeElementDefault(fVar, 0) || a3Var.f69268a != 0) {
            eVar.encodeIntElement(fVar, 0, a3Var.f69268a);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 1) || a3Var.f69269b != 0) {
            eVar.encodeIntElement(fVar, 1, a3Var.f69269b);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 2) || a3Var.f69270c != null) {
            eVar.encodeNullableSerializableElement(fVar, 2, d3.f63348a, a3Var.f69270c);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 3) || a3Var.f69271d != null) {
            eVar.encodeNullableSerializableElement(fVar, 3, d3.f63348a, a3Var.f69271d);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 4) || !kotlin.jvm.internal.g0.g(a3Var.f69272e, a00.h0.J())) {
            eVar.encodeSerializableElement(fVar, 4, c0VarArr[4].getValue(), a3Var.f69272e);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 5) || a3Var.f69273f != 0) {
            eVar.encodeIntElement(fVar, 5, a3Var.f69273f);
        }
        if (!eVar.shouldEncodeElementDefault(fVar, 6) && a3Var.f69274g == 0) {
            return;
        }
        eVar.encodeIntElement(fVar, 6, a3Var.f69274g);
    }

    public static final /* synthetic */ f50.i b() {
        return new j50.f(l2.a.f69581a);
    }

    public static /* synthetic */ a3 l(a3 a3Var, int i11, int i12, String str, String str2, List list, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = a3Var.f69268a;
        }
        if ((i15 & 2) != 0) {
            i12 = a3Var.f69269b;
        }
        if ((i15 & 4) != 0) {
            str = a3Var.f69270c;
        }
        if ((i15 & 8) != 0) {
            str2 = a3Var.f69271d;
        }
        if ((i15 & 16) != 0) {
            list = a3Var.f69272e;
        }
        if ((i15 & 32) != 0) {
            i13 = a3Var.f69273f;
        }
        if ((i15 & 64) != 0) {
            i14 = a3Var.f69274g;
        }
        int i16 = i13;
        int i17 = i14;
        List list2 = list;
        String str3 = str;
        return a3Var.k(i11, i12, str3, str2, list2, i16, i17);
    }

    public final int d() {
        return this.f69268a;
    }

    public final int e() {
        return this.f69269b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3)) {
            return false;
        }
        a3 a3Var = (a3) obj;
        return this.f69268a == a3Var.f69268a && this.f69269b == a3Var.f69269b && kotlin.jvm.internal.g0.g(this.f69270c, a3Var.f69270c) && kotlin.jvm.internal.g0.g(this.f69271d, a3Var.f69271d) && kotlin.jvm.internal.g0.g(this.f69272e, a3Var.f69272e) && this.f69273f == a3Var.f69273f && this.f69274g == a3Var.f69274g;
    }

    @m80.l
    public final String f() {
        return this.f69270c;
    }

    @m80.l
    public final String g() {
        return this.f69271d;
    }

    @m80.k
    public final List<l2> h() {
        return this.f69272e;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f69268a) * 31) + Integer.hashCode(this.f69269b)) * 31;
        String str = this.f69270c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f69271d;
        return ((((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f69272e.hashCode()) * 31) + Integer.hashCode(this.f69273f)) * 31) + Integer.hashCode(this.f69274g);
    }

    public final int i() {
        return this.f69273f;
    }

    public final int j() {
        return this.f69274g;
    }

    @m80.k
    public final a3 k(int i11, int i12, @m80.l String str, @m80.l String str2, @m80.k List<l2> rootList, int i13, int i14) {
        kotlin.jvm.internal.g0.p(rootList, "rootList");
        return new a3(i11, i12, str, str2, rootList, i13, i14);
    }

    @m80.l
    public final String m() {
        return this.f69270c;
    }

    public final int o() {
        return this.f69268a;
    }

    @m80.l
    public final String q() {
        return this.f69271d;
    }

    @m80.k
    public final List<l2> s() {
        return this.f69272e;
    }

    @m80.k
    public String toString() {
        return "WordRoot(meanId=" + this.f69268a + ", sentenceId=" + this.f69269b + ", etymology=" + this.f69270c + ", mnemonic=" + this.f69271d + ", rootList=" + this.f69272e + ", samePrefixCnt=" + this.f69273f + ", sameRootCnt=" + this.f69274g + ')';
    }

    public final int u() {
        return this.f69273f;
    }

    public final int w() {
        return this.f69274g;
    }

    public final int y() {
        return this.f69269b;
    }

    public /* synthetic */ a3(int i11, int i12, int i13, String str, String str2, List list, int i14, int i15, j50.x2 x2Var) {
        if ((i11 & 1) == 0) {
            this.f69268a = 0;
        } else {
            this.f69268a = i12;
        }
        if ((i11 & 2) == 0) {
            this.f69269b = 0;
        } else {
            this.f69269b = i13;
        }
        if ((i11 & 4) == 0) {
            this.f69270c = null;
        } else {
            this.f69270c = str;
        }
        if ((i11 & 8) == 0) {
            this.f69271d = null;
        } else {
            this.f69271d = str2;
        }
        if ((i11 & 16) == 0) {
            this.f69272e = a00.h0.J();
        } else {
            this.f69272e = list;
        }
        if ((i11 & 32) == 0) {
            this.f69273f = 0;
        } else {
            this.f69273f = i14;
        }
        if ((i11 & 64) == 0) {
            this.f69274g = 0;
        } else {
            this.f69274g = i15;
        }
    }

    public a3(int i11, int i12, @m80.l String str, @m80.l String str2, @m80.k List<l2> rootList, int i13, int i14) {
        kotlin.jvm.internal.g0.p(rootList, "rootList");
        this.f69268a = i11;
        this.f69269b = i12;
        this.f69270c = str;
        this.f69271d = str2;
        this.f69272e = rootList;
        this.f69273f = i13;
        this.f69274g = i14;
    }

    public /* synthetic */ a3(int i11, int i12, String str, String str2, List list, int i13, int i14, int i15, kotlin.jvm.internal.v vVar) {
        this((i15 & 1) != 0 ? 0 : i11, (i15 & 2) != 0 ? 0 : i12, (i15 & 4) != 0 ? null : str, (i15 & 8) != 0 ? null : str2, (i15 & 16) != 0 ? a00.h0.J() : list, (i15 & 32) != 0 ? 0 : i13, (i15 & 64) != 0 ? 0 : i14);
    }

    @f50.z("etymology")
    public static /* synthetic */ void n() {
    }

    @f50.z("meanId")
    public static /* synthetic */ void p() {
    }

    @f50.z("mnemonic")
    public static /* synthetic */ void r() {
    }

    @f50.z("rootList")
    public static /* synthetic */ void t() {
    }

    @f50.z("samePrefixCnt")
    public static /* synthetic */ void v() {
    }

    @f50.z("sameRootCnt")
    public static /* synthetic */ void x() {
    }

    @f50.z("sentenceId")
    public static /* synthetic */ void z() {
    }
}
