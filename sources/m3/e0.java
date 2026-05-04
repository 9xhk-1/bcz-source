package m3;

import j50.d3;
import j50.p0;
import j50.x2;
import kotlin.DeprecationLevel;
import kotlinx.serialization.UnknownFieldException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class e0 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f71891a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f71892b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f71893c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f71894d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public final String f71895e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<e0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f71896a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f71896a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.game.LookupRspVo", aVar, 5);
            l2Var.q("topicId", false);
            l2Var.q("word", false);
            l2Var.q(com.baicizhan.main.wikiv2.studyv2.data.t.f26099a, false);
            l2Var.q("phoneticUs", false);
            l2Var.q("audioUsUrl", false);
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
            return new f50.i[]{j50.z0.f63517a, d3Var, d3Var, d3Var, g50.a.v(d3Var)};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final e0 e(@m80.k i50.f decoder) {
            int i11;
            int i12;
            String str;
            String str2;
            String str3;
            String str4;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            if (beginStructure.decodeSequentially()) {
                i11 = beginStructure.decodeIntElement(fVar, 0);
                String decodeStringElement = beginStructure.decodeStringElement(fVar, 1);
                String decodeStringElement2 = beginStructure.decodeStringElement(fVar, 2);
                str3 = beginStructure.decodeStringElement(fVar, 3);
                str4 = (String) beginStructure.decodeNullableSerializableElement(fVar, 4, d3.f63348a, null);
                str2 = decodeStringElement2;
                str = decodeStringElement;
                i12 = 31;
            } else {
                boolean z11 = true;
                i11 = 0;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                int i13 = 0;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else if (decodeElementIndex == 0) {
                        i11 = beginStructure.decodeIntElement(fVar, 0);
                        i13 |= 1;
                    } else if (decodeElementIndex == 1) {
                        str5 = beginStructure.decodeStringElement(fVar, 1);
                        i13 |= 2;
                    } else if (decodeElementIndex == 2) {
                        str6 = beginStructure.decodeStringElement(fVar, 2);
                        i13 |= 4;
                    } else if (decodeElementIndex == 3) {
                        str7 = beginStructure.decodeStringElement(fVar, 3);
                        i13 |= 8;
                    } else {
                        if (decodeElementIndex != 4) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        str8 = (String) beginStructure.decodeNullableSerializableElement(fVar, 4, d3.f63348a, str8);
                        i13 |= 16;
                    }
                }
                i12 = i13;
                str = str5;
                str2 = str6;
                str3 = str7;
                str4 = str8;
            }
            int i14 = i11;
            beginStructure.endStructure(fVar);
            return new e0(i12, i14, str, str2, str3, str4, null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k e0 value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            e0.r(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<e0> serializer() {
            return a.f71896a;
        }

        public b() {
        }
    }

    public /* synthetic */ e0(int i11, int i12, String str, String str2, String str3, String str4, x2 x2Var) {
        if (31 != (i11 & 31)) {
            j50.h2.b(i11, 31, a.f71896a.a());
        }
        this.f71891a = i12;
        this.f71892b = str;
        this.f71893c = str2;
        this.f71894d = str3;
        this.f71895e = str4;
    }

    public static /* synthetic */ e0 g(e0 e0Var, int i11, String str, String str2, String str3, String str4, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = e0Var.f71891a;
        }
        if ((i12 & 2) != 0) {
            str = e0Var.f71892b;
        }
        if ((i12 & 4) != 0) {
            str2 = e0Var.f71893c;
        }
        if ((i12 & 8) != 0) {
            str3 = e0Var.f71894d;
        }
        if ((i12 & 16) != 0) {
            str4 = e0Var.f71895e;
        }
        String str5 = str4;
        String str6 = str2;
        return e0Var.f(i11, str, str6, str3, str5);
    }

    @w00.o
    public static final /* synthetic */ void r(e0 e0Var, i50.e eVar, h50.f fVar) {
        eVar.encodeIntElement(fVar, 0, e0Var.f71891a);
        eVar.encodeStringElement(fVar, 1, e0Var.f71892b);
        eVar.encodeStringElement(fVar, 2, e0Var.f71893c);
        eVar.encodeStringElement(fVar, 3, e0Var.f71894d);
        eVar.encodeNullableSerializableElement(fVar, 4, d3.f63348a, e0Var.f71895e);
    }

    public final int a() {
        return this.f71891a;
    }

    @m80.k
    public final String b() {
        return this.f71892b;
    }

    @m80.k
    public final String c() {
        return this.f71893c;
    }

    @m80.k
    public final String d() {
        return this.f71894d;
    }

    @m80.l
    public final String e() {
        return this.f71895e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f71891a == e0Var.f71891a && kotlin.jvm.internal.g0.g(this.f71892b, e0Var.f71892b) && kotlin.jvm.internal.g0.g(this.f71893c, e0Var.f71893c) && kotlin.jvm.internal.g0.g(this.f71894d, e0Var.f71894d) && kotlin.jvm.internal.g0.g(this.f71895e, e0Var.f71895e);
    }

    @m80.k
    public final e0 f(int i11, @m80.k String word, @m80.k String mean, @m80.k String phoneticUs, @m80.l String str) {
        kotlin.jvm.internal.g0.p(word, "word");
        kotlin.jvm.internal.g0.p(mean, "mean");
        kotlin.jvm.internal.g0.p(phoneticUs, "phoneticUs");
        return new e0(i11, word, mean, phoneticUs, str);
    }

    @m80.l
    public final String h() {
        return this.f71895e;
    }

    public int hashCode() {
        int hashCode = ((((((Integer.hashCode(this.f71891a) * 31) + this.f71892b.hashCode()) * 31) + this.f71893c.hashCode()) * 31) + this.f71894d.hashCode()) * 31;
        String str = this.f71895e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @m80.k
    public final String j() {
        return this.f71893c;
    }

    @m80.k
    public final String l() {
        return this.f71894d;
    }

    public final int n() {
        return this.f71891a;
    }

    @m80.k
    public final String p() {
        return this.f71892b;
    }

    @m80.k
    public String toString() {
        return "LookupRspVo(topicId=" + this.f71891a + ", word=" + this.f71892b + ", mean=" + this.f71893c + ", phoneticUs=" + this.f71894d + ", audioUsUrl=" + this.f71895e + ')';
    }

    public e0(int i11, @m80.k String word, @m80.k String mean, @m80.k String phoneticUs, @m80.l String str) {
        kotlin.jvm.internal.g0.p(word, "word");
        kotlin.jvm.internal.g0.p(mean, "mean");
        kotlin.jvm.internal.g0.p(phoneticUs, "phoneticUs");
        this.f71891a = i11;
        this.f71892b = word;
        this.f71893c = mean;
        this.f71894d = phoneticUs;
        this.f71895e = str;
    }

    @f50.z("audioUsUrl")
    public static /* synthetic */ void i() {
    }

    @f50.z(com.baicizhan.main.wikiv2.studyv2.data.t.f26099a)
    public static /* synthetic */ void k() {
    }

    @f50.z("phoneticUs")
    public static /* synthetic */ void m() {
    }

    @f50.z("topicId")
    public static /* synthetic */ void o() {
    }

    @f50.z("word")
    public static /* synthetic */ void q() {
    }
}
