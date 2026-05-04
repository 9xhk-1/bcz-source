package l3;

import j50.d3;
import j50.p0;
import kotlin.DeprecationLevel;
import kotlinx.serialization.UnknownFieldException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class k2 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f69562a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f69563b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f69564c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f69565d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final String f69566e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final String f69567f;

    /* renamed from: g, reason: collision with root package name */
    public final int f69568g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<k2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f69569a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f69569a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.WikiWordInfo", aVar, 7);
            l2Var.q("topicId", true);
            l2Var.q("word", true);
            l2Var.q("accentUs", true);
            l2Var.q("accentUk", true);
            l2Var.q("audioUs", true);
            l2Var.q("audioUk", true);
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
        public final k2 e(@m80.k i50.f decoder) {
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
            return new k2(i13, i16, str5, str4, str2, str3, str, i12, (j50.x2) null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k k2 value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            k2.x(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<k2> serializer() {
            return a.f69569a;
        }

        public b() {
        }
    }

    public k2() {
        this(0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 127, (kotlin.jvm.internal.v) null);
    }

    public static /* synthetic */ k2 i(k2 k2Var, int i11, String str, String str2, String str3, String str4, String str5, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = k2Var.f69562a;
        }
        if ((i13 & 2) != 0) {
            str = k2Var.f69563b;
        }
        if ((i13 & 4) != 0) {
            str2 = k2Var.f69564c;
        }
        if ((i13 & 8) != 0) {
            str3 = k2Var.f69565d;
        }
        if ((i13 & 16) != 0) {
            str4 = k2Var.f69566e;
        }
        if ((i13 & 32) != 0) {
            str5 = k2Var.f69567f;
        }
        if ((i13 & 64) != 0) {
            i12 = k2Var.f69568g;
        }
        String str6 = str5;
        int i14 = i12;
        String str7 = str4;
        String str8 = str2;
        return k2Var.h(i11, str, str8, str3, str7, str6, i14);
    }

    @w00.o
    public static final /* synthetic */ void x(k2 k2Var, i50.e eVar, h50.f fVar) {
        if (eVar.shouldEncodeElementDefault(fVar, 0) || k2Var.f69562a != 0) {
            eVar.encodeIntElement(fVar, 0, k2Var.f69562a);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 1) || !kotlin.jvm.internal.g0.g(k2Var.f69563b, "")) {
            eVar.encodeStringElement(fVar, 1, k2Var.f69563b);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 2) || !kotlin.jvm.internal.g0.g(k2Var.f69564c, "")) {
            eVar.encodeStringElement(fVar, 2, k2Var.f69564c);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 3) || !kotlin.jvm.internal.g0.g(k2Var.f69565d, "")) {
            eVar.encodeStringElement(fVar, 3, k2Var.f69565d);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 4) || !kotlin.jvm.internal.g0.g(k2Var.f69566e, "")) {
            eVar.encodeStringElement(fVar, 4, k2Var.f69566e);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 5) || !kotlin.jvm.internal.g0.g(k2Var.f69567f, "")) {
            eVar.encodeStringElement(fVar, 5, k2Var.f69567f);
        }
        if (!eVar.shouldEncodeElementDefault(fVar, 6) && k2Var.f69568g == 0) {
            return;
        }
        eVar.encodeIntElement(fVar, 6, k2Var.f69568g);
    }

    public final int a() {
        return this.f69562a;
    }

    @m80.k
    public final String b() {
        return this.f69563b;
    }

    @m80.k
    public final String c() {
        return this.f69564c;
    }

    @m80.k
    public final String d() {
        return this.f69565d;
    }

    @m80.k
    public final String e() {
        return this.f69566e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) obj;
        return this.f69562a == k2Var.f69562a && kotlin.jvm.internal.g0.g(this.f69563b, k2Var.f69563b) && kotlin.jvm.internal.g0.g(this.f69564c, k2Var.f69564c) && kotlin.jvm.internal.g0.g(this.f69565d, k2Var.f69565d) && kotlin.jvm.internal.g0.g(this.f69566e, k2Var.f69566e) && kotlin.jvm.internal.g0.g(this.f69567f, k2Var.f69567f) && this.f69568g == k2Var.f69568g;
    }

    @m80.k
    public final String f() {
        return this.f69567f;
    }

    public final int g() {
        return this.f69568g;
    }

    @m80.k
    public final k2 h(int i11, @m80.k String word, @m80.k String accentUs, @m80.k String accentUk, @m80.k String audioUs, @m80.k String audioUk, int i12) {
        kotlin.jvm.internal.g0.p(word, "word");
        kotlin.jvm.internal.g0.p(accentUs, "accentUs");
        kotlin.jvm.internal.g0.p(accentUk, "accentUk");
        kotlin.jvm.internal.g0.p(audioUs, "audioUs");
        kotlin.jvm.internal.g0.p(audioUk, "audioUk");
        return new k2(i11, word, accentUs, accentUk, audioUs, audioUk, i12);
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.f69562a) * 31) + this.f69563b.hashCode()) * 31) + this.f69564c.hashCode()) * 31) + this.f69565d.hashCode()) * 31) + this.f69566e.hashCode()) * 31) + this.f69567f.hashCode()) * 31) + Integer.hashCode(this.f69568g);
    }

    @m80.k
    public final String j() {
        return this.f69565d;
    }

    @m80.k
    public final String l() {
        return this.f69564c;
    }

    @m80.k
    public final String n() {
        return this.f69567f;
    }

    @m80.k
    public final String p() {
        return this.f69566e;
    }

    public final int r() {
        return this.f69562a;
    }

    @m80.k
    public final String t() {
        return this.f69563b;
    }

    @m80.k
    public String toString() {
        return "WikiWordInfo(topicId=" + this.f69562a + ", word=" + this.f69563b + ", accentUs=" + this.f69564c + ", accentUk=" + this.f69565d + ", audioUs=" + this.f69566e + ", audioUk=" + this.f69567f + ", wordType=" + this.f69568g + ')';
    }

    public final int v() {
        return this.f69568g;
    }

    public /* synthetic */ k2(int i11, int i12, String str, String str2, String str3, String str4, String str5, int i13, j50.x2 x2Var) {
        if ((i11 & 1) == 0) {
            this.f69562a = 0;
        } else {
            this.f69562a = i12;
        }
        if ((i11 & 2) == 0) {
            this.f69563b = "";
        } else {
            this.f69563b = str;
        }
        if ((i11 & 4) == 0) {
            this.f69564c = "";
        } else {
            this.f69564c = str2;
        }
        if ((i11 & 8) == 0) {
            this.f69565d = "";
        } else {
            this.f69565d = str3;
        }
        if ((i11 & 16) == 0) {
            this.f69566e = "";
        } else {
            this.f69566e = str4;
        }
        if ((i11 & 32) == 0) {
            this.f69567f = "";
        } else {
            this.f69567f = str5;
        }
        if ((i11 & 64) == 0) {
            this.f69568g = 0;
        } else {
            this.f69568g = i13;
        }
    }

    public k2(int i11, @m80.k String word, @m80.k String accentUs, @m80.k String accentUk, @m80.k String audioUs, @m80.k String audioUk, int i12) {
        kotlin.jvm.internal.g0.p(word, "word");
        kotlin.jvm.internal.g0.p(accentUs, "accentUs");
        kotlin.jvm.internal.g0.p(accentUk, "accentUk");
        kotlin.jvm.internal.g0.p(audioUs, "audioUs");
        kotlin.jvm.internal.g0.p(audioUk, "audioUk");
        this.f69562a = i11;
        this.f69563b = word;
        this.f69564c = accentUs;
        this.f69565d = accentUk;
        this.f69566e = audioUs;
        this.f69567f = audioUk;
        this.f69568g = i12;
    }

    public /* synthetic */ k2(int i11, String str, String str2, String str3, String str4, String str5, int i12, int i13, kotlin.jvm.internal.v vVar) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? "" : str, (i13 & 4) != 0 ? "" : str2, (i13 & 8) != 0 ? "" : str3, (i13 & 16) != 0 ? "" : str4, (i13 & 32) != 0 ? "" : str5, (i13 & 64) != 0 ? 0 : i12);
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
