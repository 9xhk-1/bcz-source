package a7;

import f50.a0;
import j50.d3;
import j50.h2;
import j50.l2;
import j50.p0;
import j50.x2;
import j50.z0;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import kotlinx.serialization.UnknownFieldException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@a0
/* loaded from: classes3.dex */
public final class e {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f2036a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f2037b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f2038c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2039d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2040e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements p0<e> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f2041a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f2041a = aVar;
            l2 l2Var = new l2("com.baicizhan.app.biz.lookup.LookUpHistoryRecord", aVar, 5);
            l2Var.q("word", false);
            l2Var.q(com.baicizhan.main.wikiv2.studyv2.data.t.f26099a, false);
            l2Var.q("phonetic", false);
            l2Var.q("topicId", false);
            l2Var.q("lookUpTime", false);
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
            z0 z0Var = z0.f63517a;
            return new f50.i[]{d3Var, d3Var, d3Var, z0Var, z0Var};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final e e(@m80.k i50.f decoder) {
            String str;
            int i11;
            int i12;
            String str2;
            String str3;
            int i13;
            g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            if (beginStructure.decodeSequentially()) {
                str = beginStructure.decodeStringElement(fVar, 0);
                String decodeStringElement = beginStructure.decodeStringElement(fVar, 1);
                String decodeStringElement2 = beginStructure.decodeStringElement(fVar, 2);
                i11 = beginStructure.decodeIntElement(fVar, 3);
                i12 = beginStructure.decodeIntElement(fVar, 4);
                str2 = decodeStringElement2;
                str3 = decodeStringElement;
                i13 = 31;
            } else {
                str = null;
                String str4 = null;
                String str5 = null;
                boolean z11 = true;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else if (decodeElementIndex == 0) {
                        str = beginStructure.decodeStringElement(fVar, 0);
                        i16 |= 1;
                    } else if (decodeElementIndex == 1) {
                        str5 = beginStructure.decodeStringElement(fVar, 1);
                        i16 |= 2;
                    } else if (decodeElementIndex == 2) {
                        str4 = beginStructure.decodeStringElement(fVar, 2);
                        i16 |= 4;
                    } else if (decodeElementIndex == 3) {
                        i14 = beginStructure.decodeIntElement(fVar, 3);
                        i16 |= 8;
                    } else {
                        if (decodeElementIndex != 4) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        i15 = beginStructure.decodeIntElement(fVar, 4);
                        i16 |= 16;
                    }
                }
                i11 = i14;
                i12 = i15;
                str2 = str4;
                str3 = str5;
                i13 = i16;
            }
            String str6 = str;
            beginStructure.endStructure(fVar);
            return new e(i13, str6, str3, str2, i11, i12, null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k e value) {
            g0.p(encoder, "encoder");
            g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            e.m(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        @m80.k
        public final f50.i<e> serializer() {
            return a.f2041a;
        }

        public b() {
        }
    }

    public /* synthetic */ e(int i11, String str, String str2, String str3, int i12, int i13, x2 x2Var) {
        if (31 != (i11 & 31)) {
            h2.b(i11, 31, a.f2041a.a());
        }
        this.f2036a = str;
        this.f2037b = str2;
        this.f2038c = str3;
        this.f2039d = i12;
        this.f2040e = i13;
    }

    public static /* synthetic */ e g(e eVar, String str, String str2, String str3, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = eVar.f2036a;
        }
        if ((i13 & 2) != 0) {
            str2 = eVar.f2037b;
        }
        if ((i13 & 4) != 0) {
            str3 = eVar.f2038c;
        }
        if ((i13 & 8) != 0) {
            i11 = eVar.f2039d;
        }
        if ((i13 & 16) != 0) {
            i12 = eVar.f2040e;
        }
        int i14 = i12;
        String str4 = str3;
        return eVar.f(str, str2, str4, i11, i14);
    }

    @w00.o
    public static final /* synthetic */ void m(e eVar, i50.e eVar2, h50.f fVar) {
        eVar2.encodeStringElement(fVar, 0, eVar.f2036a);
        eVar2.encodeStringElement(fVar, 1, eVar.f2037b);
        eVar2.encodeStringElement(fVar, 2, eVar.f2038c);
        eVar2.encodeIntElement(fVar, 3, eVar.f2039d);
        eVar2.encodeIntElement(fVar, 4, eVar.f2040e);
    }

    @m80.k
    public final String a() {
        return this.f2036a;
    }

    @m80.k
    public final String b() {
        return this.f2037b;
    }

    @m80.k
    public final String c() {
        return this.f2038c;
    }

    public final int d() {
        return this.f2039d;
    }

    public final int e() {
        return this.f2040e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return g0.g(this.f2036a, eVar.f2036a) && g0.g(this.f2037b, eVar.f2037b) && g0.g(this.f2038c, eVar.f2038c) && this.f2039d == eVar.f2039d && this.f2040e == eVar.f2040e;
    }

    @m80.k
    public final e f(@m80.k String word, @m80.k String mean, @m80.k String phonetic, int i11, int i12) {
        g0.p(word, "word");
        g0.p(mean, "mean");
        g0.p(phonetic, "phonetic");
        return new e(word, mean, phonetic, i11, i12);
    }

    public final int h() {
        return this.f2040e;
    }

    public int hashCode() {
        return (((((((this.f2036a.hashCode() * 31) + this.f2037b.hashCode()) * 31) + this.f2038c.hashCode()) * 31) + Integer.hashCode(this.f2039d)) * 31) + Integer.hashCode(this.f2040e);
    }

    @m80.k
    public final String i() {
        return this.f2037b;
    }

    @m80.k
    public final String j() {
        return this.f2038c;
    }

    public final int k() {
        return this.f2039d;
    }

    @m80.k
    public final String l() {
        return this.f2036a;
    }

    @m80.k
    public String toString() {
        return "LookUpHistoryRecord(word=" + this.f2036a + ", mean=" + this.f2037b + ", phonetic=" + this.f2038c + ", topicId=" + this.f2039d + ", lookUpTime=" + this.f2040e + ')';
    }

    public e(@m80.k String word, @m80.k String mean, @m80.k String phonetic, int i11, int i12) {
        g0.p(word, "word");
        g0.p(mean, "mean");
        g0.p(phonetic, "phonetic");
        this.f2036a = word;
        this.f2037b = mean;
        this.f2038c = phonetic;
        this.f2039d = i11;
        this.f2040e = i12;
    }
}
