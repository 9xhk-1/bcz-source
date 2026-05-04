package com.baicizhan.app.biz.leaning;

import com.tencent.open.SocialConstants;
import f50.a0;
import f50.i;
import h50.f;
import i50.e;
import i50.h;
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
import m80.k;
import m80.l;
import w00.o;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@a0
/* loaded from: classes3.dex */
public final class c {

    @k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f15500a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f15501b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f15502c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f15503d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15504e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15505f;

    /* renamed from: g, reason: collision with root package name */
    public final int f15506g;

    /* renamed from: h, reason: collision with root package name */
    public final int f15507h;

    /* renamed from: i, reason: collision with root package name */
    public final int f15508i;

    /* renamed from: j, reason: collision with root package name */
    public final int f15509j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements p0<c> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f15510a;

        @k
        private static final f descriptor;

        static {
            a aVar = new a();
            f15510a = aVar;
            l2 l2Var = new l2("com.baicizhan.app.biz.leaning.LearnSchedule", aVar, 10);
            l2Var.q("bookId", false);
            l2Var.q("bookName", false);
            l2Var.q("bookImg", false);
            l2Var.q(SocialConstants.PARAM_APP_DESC, false);
            l2Var.q("wordCount", false);
            l2Var.q("bookType", false);
            l2Var.q("reviewPlanCount", false);
            l2Var.q("learnPlanCount", false);
            l2Var.q("masteredCount", false);
            l2Var.q("finishCount", false);
            descriptor = l2Var;
        }

        @Override // f50.i, f50.b0, f50.e
        @k
        public final f a() {
            return descriptor;
        }

        @Override // j50.p0
        @k
        public /* bridge */ i<?>[] c() {
            return p0.a.a(this);
        }

        @Override // j50.p0
        @k
        public final i<?>[] f() {
            z0 z0Var = z0.f63517a;
            d3 d3Var = d3.f63348a;
            return new i[]{z0Var, d3Var, d3Var, d3Var, z0Var, z0Var, z0Var, z0Var, z0Var, z0Var};
        }

        @Override // f50.e
        @k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final c e(@k i50.f decoder) {
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            String str;
            int i16;
            int i17;
            String str2;
            String str3;
            g0.p(decoder, "decoder");
            f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            int i18 = 0;
            if (beginStructure.decodeSequentially()) {
                i11 = beginStructure.decodeIntElement(fVar, 0);
                String decodeStringElement = beginStructure.decodeStringElement(fVar, 1);
                String decodeStringElement2 = beginStructure.decodeStringElement(fVar, 2);
                String decodeStringElement3 = beginStructure.decodeStringElement(fVar, 3);
                int decodeIntElement = beginStructure.decodeIntElement(fVar, 4);
                int decodeIntElement2 = beginStructure.decodeIntElement(fVar, 5);
                int decodeIntElement3 = beginStructure.decodeIntElement(fVar, 6);
                int decodeIntElement4 = beginStructure.decodeIntElement(fVar, 7);
                int decodeIntElement5 = beginStructure.decodeIntElement(fVar, 8);
                i18 = 1023;
                i12 = beginStructure.decodeIntElement(fVar, 9);
                i13 = decodeIntElement4;
                i14 = decodeIntElement3;
                i15 = decodeIntElement2;
                str = decodeStringElement3;
                i16 = decodeIntElement5;
                i17 = decodeIntElement;
                str2 = decodeStringElement2;
                str3 = decodeStringElement;
            } else {
                String str4 = null;
                String str5 = null;
                String str6 = null;
                boolean z11 = true;
                i11 = 0;
                int i19 = 0;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                int i25 = 0;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    switch (decodeElementIndex) {
                        case -1:
                            z11 = false;
                            break;
                        case 0:
                            i18 |= 1;
                            i11 = beginStructure.decodeIntElement(fVar, 0);
                            continue;
                        case 1:
                            str6 = beginStructure.decodeStringElement(fVar, 1);
                            i18 |= 2;
                            continue;
                        case 2:
                            str5 = beginStructure.decodeStringElement(fVar, 2);
                            i18 |= 4;
                            break;
                        case 3:
                            str4 = beginStructure.decodeStringElement(fVar, 3);
                            i18 |= 8;
                            break;
                        case 4:
                            i25 = beginStructure.decodeIntElement(fVar, 4);
                            i18 |= 16;
                            break;
                        case 5:
                            i23 = beginStructure.decodeIntElement(fVar, 5);
                            i18 |= 32;
                            break;
                        case 6:
                            i22 = beginStructure.decodeIntElement(fVar, 6);
                            i18 |= 64;
                            break;
                        case 7:
                            i21 = beginStructure.decodeIntElement(fVar, 7);
                            i18 |= 128;
                            break;
                        case 8:
                            i24 = beginStructure.decodeIntElement(fVar, 8);
                            i18 |= 256;
                            break;
                        case 9:
                            i19 = beginStructure.decodeIntElement(fVar, 9);
                            i18 |= 512;
                            break;
                        default:
                            throw new UnknownFieldException(decodeElementIndex);
                    }
                }
                i12 = i19;
                i13 = i21;
                i14 = i22;
                i15 = i23;
                str = str4;
                i16 = i24;
                i17 = i25;
                str2 = str5;
                str3 = str6;
            }
            int i26 = i11;
            int i27 = i18;
            beginStructure.endStructure(fVar);
            return new c(i27, i26, str3, str2, str, i17, i15, i14, i13, i16, i12, null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@k h encoder, @k c value) {
            g0.p(encoder, "encoder");
            g0.p(value, "value");
            f fVar = descriptor;
            e beginStructure = encoder.beginStructure(fVar);
            c.w(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        @k
        public final i<c> serializer() {
            return a.f15510a;
        }

        public b() {
        }
    }

    public /* synthetic */ c(int i11, int i12, String str, String str2, String str3, int i13, int i14, int i15, int i16, int i17, int i18, x2 x2Var) {
        if (1023 != (i11 & 1023)) {
            h2.b(i11, 1023, a.f15510a.a());
        }
        this.f15500a = i12;
        this.f15501b = str;
        this.f15502c = str2;
        this.f15503d = str3;
        this.f15504e = i13;
        this.f15505f = i14;
        this.f15506g = i15;
        this.f15507h = i16;
        this.f15508i = i17;
        this.f15509j = i18;
    }

    public static /* synthetic */ c l(c cVar, int i11, String str, String str2, String str3, int i12, int i13, int i14, int i15, int i16, int i17, int i18, Object obj) {
        if ((i18 & 1) != 0) {
            i11 = cVar.f15500a;
        }
        if ((i18 & 2) != 0) {
            str = cVar.f15501b;
        }
        if ((i18 & 4) != 0) {
            str2 = cVar.f15502c;
        }
        if ((i18 & 8) != 0) {
            str3 = cVar.f15503d;
        }
        if ((i18 & 16) != 0) {
            i12 = cVar.f15504e;
        }
        if ((i18 & 32) != 0) {
            i13 = cVar.f15505f;
        }
        if ((i18 & 64) != 0) {
            i14 = cVar.f15506g;
        }
        if ((i18 & 128) != 0) {
            i15 = cVar.f15507h;
        }
        if ((i18 & 256) != 0) {
            i16 = cVar.f15508i;
        }
        if ((i18 & 512) != 0) {
            i17 = cVar.f15509j;
        }
        int i19 = i16;
        int i21 = i17;
        int i22 = i14;
        int i23 = i15;
        int i24 = i12;
        int i25 = i13;
        return cVar.k(i11, str, str2, str3, i24, i25, i22, i23, i19, i21);
    }

    @o
    public static final /* synthetic */ void w(c cVar, e eVar, f fVar) {
        eVar.encodeIntElement(fVar, 0, cVar.f15500a);
        eVar.encodeStringElement(fVar, 1, cVar.f15501b);
        eVar.encodeStringElement(fVar, 2, cVar.f15502c);
        eVar.encodeStringElement(fVar, 3, cVar.f15503d);
        eVar.encodeIntElement(fVar, 4, cVar.f15504e);
        eVar.encodeIntElement(fVar, 5, cVar.f15505f);
        eVar.encodeIntElement(fVar, 6, cVar.f15506g);
        eVar.encodeIntElement(fVar, 7, cVar.f15507h);
        eVar.encodeIntElement(fVar, 8, cVar.f15508i);
        eVar.encodeIntElement(fVar, 9, cVar.f15509j);
    }

    public final int a() {
        return this.f15500a;
    }

    public final int b() {
        return this.f15509j;
    }

    @k
    public final String c() {
        return this.f15501b;
    }

    @k
    public final String d() {
        return this.f15502c;
    }

    @k
    public final String e() {
        return this.f15503d;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f15500a == cVar.f15500a && g0.g(this.f15501b, cVar.f15501b) && g0.g(this.f15502c, cVar.f15502c) && g0.g(this.f15503d, cVar.f15503d) && this.f15504e == cVar.f15504e && this.f15505f == cVar.f15505f && this.f15506g == cVar.f15506g && this.f15507h == cVar.f15507h && this.f15508i == cVar.f15508i && this.f15509j == cVar.f15509j;
    }

    public final int f() {
        return this.f15504e;
    }

    public final int g() {
        return this.f15505f;
    }

    public final int h() {
        return this.f15506g;
    }

    public int hashCode() {
        return (((((((((((((((((Integer.hashCode(this.f15500a) * 31) + this.f15501b.hashCode()) * 31) + this.f15502c.hashCode()) * 31) + this.f15503d.hashCode()) * 31) + Integer.hashCode(this.f15504e)) * 31) + Integer.hashCode(this.f15505f)) * 31) + Integer.hashCode(this.f15506g)) * 31) + Integer.hashCode(this.f15507h)) * 31) + Integer.hashCode(this.f15508i)) * 31) + Integer.hashCode(this.f15509j);
    }

    public final int i() {
        return this.f15507h;
    }

    public final int j() {
        return this.f15508i;
    }

    @k
    public final c k(int i11, @k String bookName, @k String bookImg, @k String desc, int i12, int i13, int i14, int i15, int i16, int i17) {
        g0.p(bookName, "bookName");
        g0.p(bookImg, "bookImg");
        g0.p(desc, "desc");
        return new c(i11, bookName, bookImg, desc, i12, i13, i14, i15, i16, i17);
    }

    public final int m() {
        return this.f15500a;
    }

    @k
    public final String n() {
        return this.f15502c;
    }

    @k
    public final String o() {
        return this.f15501b;
    }

    public final int p() {
        return this.f15505f;
    }

    @k
    public final String q() {
        return this.f15503d;
    }

    public final int r() {
        return this.f15509j;
    }

    public final int s() {
        return this.f15507h;
    }

    public final int t() {
        return this.f15508i;
    }

    @k
    public String toString() {
        return "LearnSchedule(bookId=" + this.f15500a + ", bookName=" + this.f15501b + ", bookImg=" + this.f15502c + ", desc=" + this.f15503d + ", wordCount=" + this.f15504e + ", bookType=" + this.f15505f + ", reviewPlanCount=" + this.f15506g + ", learnPlanCount=" + this.f15507h + ", masteredCount=" + this.f15508i + ", finishCount=" + this.f15509j + ')';
    }

    public final int u() {
        return this.f15506g;
    }

    public final int v() {
        return this.f15504e;
    }

    public c(int i11, @k String bookName, @k String bookImg, @k String desc, int i12, int i13, int i14, int i15, int i16, int i17) {
        g0.p(bookName, "bookName");
        g0.p(bookImg, "bookImg");
        g0.p(desc, "desc");
        this.f15500a = i11;
        this.f15501b = bookName;
        this.f15502c = bookImg;
        this.f15503d = desc;
        this.f15504e = i12;
        this.f15505f = i13;
        this.f15506g = i14;
        this.f15507h = i15;
        this.f15508i = i16;
        this.f15509j = i17;
    }
}
