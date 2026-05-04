package l3;

import j50.d3;
import j50.p0;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.UnknownFieldException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class j2 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final yz.c0<f50.i<Object>>[] f69552f = {null, null, null, null, yz.e0.b(LazyThreadSafetyMode.PUBLICATION, new x00.a() { // from class: l3.i2
        @Override // x00.a
        public final Object invoke() {
            f50.i b11;
            b11 = j2.b();
            return b11;
        }
    })};

    /* renamed from: a, reason: collision with root package name */
    public final long f69553a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f69554b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f69555c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final String f69556d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final List<Long> f69557e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<j2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f69558a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f69558a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.WikiMean", aVar, 5);
            l2Var.q("id", true);
            l2Var.q("meanType", true);
            l2Var.q(com.baicizhan.main.wikiv2.studyv2.data.t.f26099a, true);
            l2Var.q("meanEn", true);
            l2Var.q("senIds", true);
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
            yz.c0[] c0VarArr = j2.f69552f;
            d3 d3Var = d3.f63348a;
            return new f50.i[]{j50.l1.f63406a, d3Var, d3Var, g50.a.v(d3Var), c0VarArr[4].getValue()};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final j2 e(@m80.k i50.f decoder) {
            int i11;
            String str;
            String str2;
            String str3;
            List list;
            long j11;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            yz.c0[] c0VarArr = j2.f69552f;
            String str4 = null;
            if (beginStructure.decodeSequentially()) {
                long decodeLongElement = beginStructure.decodeLongElement(fVar, 0);
                String decodeStringElement = beginStructure.decodeStringElement(fVar, 1);
                String decodeStringElement2 = beginStructure.decodeStringElement(fVar, 2);
                String str5 = (String) beginStructure.decodeNullableSerializableElement(fVar, 3, d3.f63348a, null);
                list = (List) beginStructure.decodeSerializableElement(fVar, 4, (f50.e) c0VarArr[4].getValue(), null);
                str = decodeStringElement;
                str3 = str5;
                str2 = decodeStringElement2;
                i11 = 31;
                j11 = decodeLongElement;
            } else {
                boolean z11 = true;
                int i12 = 0;
                List list2 = null;
                long j12 = 0;
                String str6 = null;
                String str7 = null;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else if (decodeElementIndex == 0) {
                        j12 = beginStructure.decodeLongElement(fVar, 0);
                        i12 |= 1;
                    } else if (decodeElementIndex == 1) {
                        str4 = beginStructure.decodeStringElement(fVar, 1);
                        i12 |= 2;
                    } else if (decodeElementIndex == 2) {
                        str6 = beginStructure.decodeStringElement(fVar, 2);
                        i12 |= 4;
                    } else if (decodeElementIndex == 3) {
                        str7 = (String) beginStructure.decodeNullableSerializableElement(fVar, 3, d3.f63348a, str7);
                        i12 |= 8;
                    } else {
                        if (decodeElementIndex != 4) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        list2 = (List) beginStructure.decodeSerializableElement(fVar, 4, (f50.e) c0VarArr[4].getValue(), list2);
                        i12 |= 16;
                    }
                }
                i11 = i12;
                str = str4;
                str2 = str6;
                str3 = str7;
                list = list2;
                j11 = j12;
            }
            beginStructure.endStructure(fVar);
            return new j2(i11, j11, str, str2, str3, list, (j50.x2) null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k j2 value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            j2.u(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<j2> serializer() {
            return a.f69558a;
        }

        public b() {
        }
    }

    public j2() {
        this(0L, (String) null, (String) null, (String) null, (List) null, 31, (kotlin.jvm.internal.v) null);
    }

    public static final /* synthetic */ f50.i b() {
        return new j50.f(j50.l1.f63406a);
    }

    public static /* synthetic */ j2 j(j2 j2Var, long j11, String str, String str2, String str3, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = j2Var.f69553a;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            str = j2Var.f69554b;
        }
        String str4 = str;
        if ((i11 & 4) != 0) {
            str2 = j2Var.f69555c;
        }
        String str5 = str2;
        if ((i11 & 8) != 0) {
            str3 = j2Var.f69556d;
        }
        String str6 = str3;
        if ((i11 & 16) != 0) {
            list = j2Var.f69557e;
        }
        return j2Var.i(j12, str4, str5, str6, list);
    }

    @w00.o
    public static final /* synthetic */ void u(j2 j2Var, i50.e eVar, h50.f fVar) {
        yz.c0<f50.i<Object>>[] c0VarArr = f69552f;
        if (eVar.shouldEncodeElementDefault(fVar, 0) || j2Var.f69553a != 0) {
            eVar.encodeLongElement(fVar, 0, j2Var.f69553a);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 1) || !kotlin.jvm.internal.g0.g(j2Var.f69554b, "")) {
            eVar.encodeStringElement(fVar, 1, j2Var.f69554b);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 2) || !kotlin.jvm.internal.g0.g(j2Var.f69555c, "")) {
            eVar.encodeStringElement(fVar, 2, j2Var.f69555c);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 3) || j2Var.f69556d != null) {
            eVar.encodeNullableSerializableElement(fVar, 3, d3.f63348a, j2Var.f69556d);
        }
        if (!eVar.shouldEncodeElementDefault(fVar, 4) && kotlin.jvm.internal.g0.g(j2Var.f69557e, a00.h0.J())) {
            return;
        }
        eVar.encodeSerializableElement(fVar, 4, c0VarArr[4].getValue(), j2Var.f69557e);
    }

    public final long d() {
        return this.f69553a;
    }

    @m80.k
    public final String e() {
        return this.f69554b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) obj;
        return this.f69553a == j2Var.f69553a && kotlin.jvm.internal.g0.g(this.f69554b, j2Var.f69554b) && kotlin.jvm.internal.g0.g(this.f69555c, j2Var.f69555c) && kotlin.jvm.internal.g0.g(this.f69556d, j2Var.f69556d) && kotlin.jvm.internal.g0.g(this.f69557e, j2Var.f69557e);
    }

    @m80.k
    public final String f() {
        return this.f69555c;
    }

    @m80.l
    public final String g() {
        return this.f69556d;
    }

    @m80.k
    public final List<Long> h() {
        return this.f69557e;
    }

    public int hashCode() {
        int hashCode = ((((Long.hashCode(this.f69553a) * 31) + this.f69554b.hashCode()) * 31) + this.f69555c.hashCode()) * 31;
        String str = this.f69556d;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f69557e.hashCode();
    }

    @m80.k
    public final j2 i(long j11, @m80.k String meanType, @m80.k String mean, @m80.l String str, @m80.k List<Long> senIds) {
        kotlin.jvm.internal.g0.p(meanType, "meanType");
        kotlin.jvm.internal.g0.p(mean, "mean");
        kotlin.jvm.internal.g0.p(senIds, "senIds");
        return new j2(j11, meanType, mean, str, senIds);
    }

    public final long k() {
        return this.f69553a;
    }

    @m80.k
    public final String m() {
        return this.f69555c;
    }

    @m80.l
    public final String o() {
        return this.f69556d;
    }

    @m80.k
    public final String q() {
        return this.f69554b;
    }

    @m80.k
    public final List<Long> s() {
        return this.f69557e;
    }

    @m80.k
    public String toString() {
        return "WikiMean(id=" + this.f69553a + ", meanType=" + this.f69554b + ", mean=" + this.f69555c + ", meanEn=" + this.f69556d + ", senIds=" + this.f69557e + ')';
    }

    public /* synthetic */ j2(int i11, long j11, String str, String str2, String str3, List list, j50.x2 x2Var) {
        this.f69553a = (i11 & 1) == 0 ? 0L : j11;
        if ((i11 & 2) == 0) {
            this.f69554b = "";
        } else {
            this.f69554b = str;
        }
        if ((i11 & 4) == 0) {
            this.f69555c = "";
        } else {
            this.f69555c = str2;
        }
        if ((i11 & 8) == 0) {
            this.f69556d = null;
        } else {
            this.f69556d = str3;
        }
        if ((i11 & 16) == 0) {
            this.f69557e = a00.h0.J();
        } else {
            this.f69557e = list;
        }
    }

    public j2(long j11, @m80.k String meanType, @m80.k String mean, @m80.l String str, @m80.k List<Long> senIds) {
        kotlin.jvm.internal.g0.p(meanType, "meanType");
        kotlin.jvm.internal.g0.p(mean, "mean");
        kotlin.jvm.internal.g0.p(senIds, "senIds");
        this.f69553a = j11;
        this.f69554b = meanType;
        this.f69555c = mean;
        this.f69556d = str;
        this.f69557e = senIds;
    }

    public /* synthetic */ j2(long j11, String str, String str2, String str3, List list, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? 0L : j11, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? "" : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? a00.h0.J() : list);
    }

    @f50.z("id")
    public static /* synthetic */ void l() {
    }

    @f50.z(com.baicizhan.main.wikiv2.studyv2.data.t.f26099a)
    public static /* synthetic */ void n() {
    }

    @f50.z("meanEn")
    public static /* synthetic */ void p() {
    }

    @f50.z("meanType")
    public static /* synthetic */ void r() {
    }

    @f50.z("senIds")
    public static /* synthetic */ void t() {
    }
}
