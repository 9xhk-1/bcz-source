package l3;

import j50.d3;
import j50.p0;
import kotlin.DeprecationLevel;
import kotlinx.serialization.UnknownFieldException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class l2 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f69575a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f69576b;

    /* renamed from: c, reason: collision with root package name */
    public final int f69577c;

    /* renamed from: d, reason: collision with root package name */
    public final int f69578d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final String f69579e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final String f69580f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<l2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f69581a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f69581a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.WordBaseRoot", aVar, 6);
            l2Var.q("rootId", true);
            l2Var.q("rootEn", true);
            l2Var.q("rootType", true);
            l2Var.q("definitionId", true);
            l2Var.q("definition", true);
            l2Var.q("variation", true);
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
            return new f50.i[]{z0Var, d3Var, z0Var, z0Var, d3Var, d3Var};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final l2 e(@m80.k i50.f decoder) {
            int i11;
            String str;
            int i12;
            String str2;
            int i13;
            String str3;
            int i14;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            if (beginStructure.decodeSequentially()) {
                i11 = beginStructure.decodeIntElement(fVar, 0);
                String decodeStringElement = beginStructure.decodeStringElement(fVar, 1);
                int decodeIntElement = beginStructure.decodeIntElement(fVar, 2);
                int decodeIntElement2 = beginStructure.decodeIntElement(fVar, 3);
                String decodeStringElement2 = beginStructure.decodeStringElement(fVar, 4);
                str = beginStructure.decodeStringElement(fVar, 5);
                i12 = decodeIntElement2;
                str2 = decodeStringElement2;
                i13 = decodeIntElement;
                str3 = decodeStringElement;
                i14 = 63;
            } else {
                String str4 = null;
                String str5 = null;
                String str6 = null;
                boolean z11 = true;
                i11 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    switch (decodeElementIndex) {
                        case -1:
                            z11 = false;
                            continue;
                        case 0:
                            i11 = beginStructure.decodeIntElement(fVar, 0);
                            i17 |= 1;
                            continue;
                        case 1:
                            str6 = beginStructure.decodeStringElement(fVar, 1);
                            i17 |= 2;
                            break;
                        case 2:
                            i16 = beginStructure.decodeIntElement(fVar, 2);
                            i17 |= 4;
                            break;
                        case 3:
                            i15 = beginStructure.decodeIntElement(fVar, 3);
                            i17 |= 8;
                            break;
                        case 4:
                            str5 = beginStructure.decodeStringElement(fVar, 4);
                            i17 |= 16;
                            break;
                        case 5:
                            str4 = beginStructure.decodeStringElement(fVar, 5);
                            i17 |= 32;
                            break;
                        default:
                            throw new UnknownFieldException(decodeElementIndex);
                    }
                }
                str = str4;
                i12 = i15;
                str2 = str5;
                i13 = i16;
                str3 = str6;
                i14 = i17;
            }
            int i18 = i11;
            beginStructure.endStructure(fVar);
            return new l2(i14, i18, str3, i13, i12, str2, str, (j50.x2) null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k l2 value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            l2.u(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<l2> serializer() {
            return a.f69581a;
        }

        public b() {
        }
    }

    public l2() {
        this(0, (String) null, 0, 0, (String) null, (String) null, 63, (kotlin.jvm.internal.v) null);
    }

    public static /* synthetic */ l2 h(l2 l2Var, int i11, String str, int i12, int i13, String str2, String str3, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = l2Var.f69575a;
        }
        if ((i14 & 2) != 0) {
            str = l2Var.f69576b;
        }
        if ((i14 & 4) != 0) {
            i12 = l2Var.f69577c;
        }
        if ((i14 & 8) != 0) {
            i13 = l2Var.f69578d;
        }
        if ((i14 & 16) != 0) {
            str2 = l2Var.f69579e;
        }
        if ((i14 & 32) != 0) {
            str3 = l2Var.f69580f;
        }
        String str4 = str2;
        String str5 = str3;
        return l2Var.g(i11, str, i12, i13, str4, str5);
    }

    @w00.o
    public static final /* synthetic */ void u(l2 l2Var, i50.e eVar, h50.f fVar) {
        if (eVar.shouldEncodeElementDefault(fVar, 0) || l2Var.f69575a != 0) {
            eVar.encodeIntElement(fVar, 0, l2Var.f69575a);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 1) || !kotlin.jvm.internal.g0.g(l2Var.f69576b, "")) {
            eVar.encodeStringElement(fVar, 1, l2Var.f69576b);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 2) || l2Var.f69577c != 0) {
            eVar.encodeIntElement(fVar, 2, l2Var.f69577c);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 3) || l2Var.f69578d != 0) {
            eVar.encodeIntElement(fVar, 3, l2Var.f69578d);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 4) || !kotlin.jvm.internal.g0.g(l2Var.f69579e, "")) {
            eVar.encodeStringElement(fVar, 4, l2Var.f69579e);
        }
        if (!eVar.shouldEncodeElementDefault(fVar, 5) && kotlin.jvm.internal.g0.g(l2Var.f69580f, "")) {
            return;
        }
        eVar.encodeStringElement(fVar, 5, l2Var.f69580f);
    }

    public final int a() {
        return this.f69575a;
    }

    @m80.k
    public final String b() {
        return this.f69576b;
    }

    public final int c() {
        return this.f69577c;
    }

    public final int d() {
        return this.f69578d;
    }

    @m80.k
    public final String e() {
        return this.f69579e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj;
        return this.f69575a == l2Var.f69575a && kotlin.jvm.internal.g0.g(this.f69576b, l2Var.f69576b) && this.f69577c == l2Var.f69577c && this.f69578d == l2Var.f69578d && kotlin.jvm.internal.g0.g(this.f69579e, l2Var.f69579e) && kotlin.jvm.internal.g0.g(this.f69580f, l2Var.f69580f);
    }

    @m80.k
    public final String f() {
        return this.f69580f;
    }

    @m80.k
    public final l2 g(int i11, @m80.k String rootEn, int i12, int i13, @m80.k String definition, @m80.k String variation) {
        kotlin.jvm.internal.g0.p(rootEn, "rootEn");
        kotlin.jvm.internal.g0.p(definition, "definition");
        kotlin.jvm.internal.g0.p(variation, "variation");
        return new l2(i11, rootEn, i12, i13, definition, variation);
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f69575a) * 31) + this.f69576b.hashCode()) * 31) + Integer.hashCode(this.f69577c)) * 31) + Integer.hashCode(this.f69578d)) * 31) + this.f69579e.hashCode()) * 31) + this.f69580f.hashCode();
    }

    @m80.k
    public final String i() {
        return this.f69579e;
    }

    public final int k() {
        return this.f69578d;
    }

    @m80.k
    public final String m() {
        return this.f69576b;
    }

    public final int o() {
        return this.f69575a;
    }

    public final int q() {
        return this.f69577c;
    }

    @m80.k
    public final String s() {
        return this.f69580f;
    }

    @m80.k
    public String toString() {
        return "WordBaseRoot(rootId=" + this.f69575a + ", rootEn=" + this.f69576b + ", rootType=" + this.f69577c + ", definitionId=" + this.f69578d + ", definition=" + this.f69579e + ", variation=" + this.f69580f + ')';
    }

    public /* synthetic */ l2(int i11, int i12, String str, int i13, int i14, String str2, String str3, j50.x2 x2Var) {
        if ((i11 & 1) == 0) {
            this.f69575a = 0;
        } else {
            this.f69575a = i12;
        }
        if ((i11 & 2) == 0) {
            this.f69576b = "";
        } else {
            this.f69576b = str;
        }
        if ((i11 & 4) == 0) {
            this.f69577c = 0;
        } else {
            this.f69577c = i13;
        }
        if ((i11 & 8) == 0) {
            this.f69578d = 0;
        } else {
            this.f69578d = i14;
        }
        if ((i11 & 16) == 0) {
            this.f69579e = "";
        } else {
            this.f69579e = str2;
        }
        if ((i11 & 32) == 0) {
            this.f69580f = "";
        } else {
            this.f69580f = str3;
        }
    }

    public l2(int i11, @m80.k String rootEn, int i12, int i13, @m80.k String definition, @m80.k String variation) {
        kotlin.jvm.internal.g0.p(rootEn, "rootEn");
        kotlin.jvm.internal.g0.p(definition, "definition");
        kotlin.jvm.internal.g0.p(variation, "variation");
        this.f69575a = i11;
        this.f69576b = rootEn;
        this.f69577c = i12;
        this.f69578d = i13;
        this.f69579e = definition;
        this.f69580f = variation;
    }

    public /* synthetic */ l2(int i11, String str, int i12, int i13, String str2, String str3, int i14, kotlin.jvm.internal.v vVar) {
        this((i14 & 1) != 0 ? 0 : i11, (i14 & 2) != 0 ? "" : str, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13, (i14 & 16) != 0 ? "" : str2, (i14 & 32) != 0 ? "" : str3);
    }

    @f50.z("definition")
    public static /* synthetic */ void j() {
    }

    @f50.z("definitionId")
    public static /* synthetic */ void l() {
    }

    @f50.z("rootEn")
    public static /* synthetic */ void n() {
    }

    @f50.z("rootId")
    public static /* synthetic */ void p() {
    }

    @f50.z("rootType")
    public static /* synthetic */ void r() {
    }

    @f50.z("variation")
    public static /* synthetic */ void t() {
    }
}
