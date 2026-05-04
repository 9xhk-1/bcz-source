package h5;

import j50.d3;
import j50.h2;
import j50.l1;
import j50.l2;
import j50.p0;
import j50.x2;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.UnknownFieldException;
import m3.k2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class m {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: i, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final yz.c0<f50.i<Object>>[] f58372i = {null, null, yz.e0.b(LazyThreadSafetyMode.PUBLICATION, new x00.a() { // from class: h5.l
        @Override // x00.a
        public final Object invoke() {
            f50.i b11;
            b11 = m.b();
            return b11;
        }
    }), null, null, null, null, null};

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f58373a;

    /* renamed from: b, reason: collision with root package name */
    public final long f58374b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<k2> f58375c;

    /* renamed from: d, reason: collision with root package name */
    public final long f58376d;

    /* renamed from: e, reason: collision with root package name */
    public final long f58377e;

    /* renamed from: f, reason: collision with root package name */
    public final long f58378f;

    /* renamed from: g, reason: collision with root package name */
    public final long f58379g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final String f58380h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<m> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f58381a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f58381a = aVar;
            l2 l2Var = new l2("com.baicizhan.app.biz.game.model.GameRoundModel", aVar, 8);
            l2Var.q("roundId", false);
            l2Var.q("bookId", false);
            l2Var.q(xd.a.f98002r, false);
            l2Var.q("roundCate", false);
            l2Var.q("lifeCount", false);
            l2Var.q("roundType", false);
            l2Var.q("roundTime", false);
            l2Var.q("roundState", false);
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
            yz.c0[] c0VarArr = m.f58372i;
            d3 d3Var = d3.f63348a;
            l1 l1Var = l1.f63406a;
            return new f50.i[]{d3Var, l1Var, c0VarArr[2].getValue(), l1Var, l1Var, l1Var, l1Var, d3Var};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final m e(@m80.k i50.f decoder) {
            int i11;
            List list;
            String str;
            long j11;
            long j12;
            long j13;
            String str2;
            long j14;
            long j15;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            yz.c0[] c0VarArr = m.f58372i;
            int i12 = 7;
            String str3 = null;
            if (beginStructure.decodeSequentially()) {
                String decodeStringElement = beginStructure.decodeStringElement(fVar, 0);
                long decodeLongElement = beginStructure.decodeLongElement(fVar, 1);
                List list2 = (List) beginStructure.decodeSerializableElement(fVar, 2, (f50.e) c0VarArr[2].getValue(), null);
                long decodeLongElement2 = beginStructure.decodeLongElement(fVar, 3);
                long decodeLongElement3 = beginStructure.decodeLongElement(fVar, 4);
                long decodeLongElement4 = beginStructure.decodeLongElement(fVar, 5);
                long decodeLongElement5 = beginStructure.decodeLongElement(fVar, 6);
                list = list2;
                str2 = decodeStringElement;
                str = beginStructure.decodeStringElement(fVar, 7);
                j11 = decodeLongElement5;
                j12 = decodeLongElement3;
                i11 = 255;
                j13 = decodeLongElement;
                j14 = decodeLongElement2;
                j15 = decodeLongElement4;
            } else {
                long j16 = 0;
                boolean z11 = true;
                int i13 = 0;
                List list3 = null;
                String str4 = null;
                long j17 = 0;
                long j18 = 0;
                long j19 = 0;
                long j21 = 0;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    switch (decodeElementIndex) {
                        case -1:
                            z11 = false;
                            i12 = 7;
                        case 0:
                            str4 = beginStructure.decodeStringElement(fVar, 0);
                            i13 |= 1;
                            i12 = 7;
                        case 1:
                            j18 = beginStructure.decodeLongElement(fVar, 1);
                            i13 |= 2;
                        case 2:
                            list3 = (List) beginStructure.decodeSerializableElement(fVar, 2, (f50.e) c0VarArr[2].getValue(), list3);
                            i13 |= 4;
                        case 3:
                            j19 = beginStructure.decodeLongElement(fVar, 3);
                            i13 |= 8;
                        case 4:
                            j17 = beginStructure.decodeLongElement(fVar, 4);
                            i13 |= 16;
                        case 5:
                            j21 = beginStructure.decodeLongElement(fVar, 5);
                            i13 |= 32;
                        case 6:
                            j16 = beginStructure.decodeLongElement(fVar, 6);
                            i13 |= 64;
                        case 7:
                            str3 = beginStructure.decodeStringElement(fVar, i12);
                            i13 |= 128;
                        default:
                            throw new UnknownFieldException(decodeElementIndex);
                    }
                }
                i11 = i13;
                list = list3;
                str = str3;
                j11 = j16;
                j12 = j17;
                j13 = j18;
                str2 = str4;
                j14 = j19;
                j15 = j21;
            }
            beginStructure.endStructure(fVar);
            return new m(i11, str2, j13, list, j14, j12, j15, j11, str, null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k m value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            m.D(value, beginStructure, fVar);
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
            return a.f58381a;
        }

        public b() {
        }
    }

    public /* synthetic */ m(int i11, String str, long j11, List list, long j12, long j13, long j14, long j15, String str2, x2 x2Var) {
        if (255 != (i11 & 255)) {
            h2.b(i11, 255, a.f58381a.a());
        }
        this.f58373a = str;
        this.f58374b = j11;
        this.f58375c = list;
        this.f58376d = j12;
        this.f58377e = j13;
        this.f58378f = j14;
        this.f58379g = j15;
        this.f58380h = str2;
    }

    @w00.o
    public static final /* synthetic */ void D(m mVar, i50.e eVar, h50.f fVar) {
        yz.c0<f50.i<Object>>[] c0VarArr = f58372i;
        eVar.encodeStringElement(fVar, 0, mVar.f58373a);
        eVar.encodeLongElement(fVar, 1, mVar.f58374b);
        eVar.encodeSerializableElement(fVar, 2, c0VarArr[2].getValue(), mVar.f58375c);
        eVar.encodeLongElement(fVar, 3, mVar.f58376d);
        eVar.encodeLongElement(fVar, 4, mVar.f58377e);
        eVar.encodeLongElement(fVar, 5, mVar.f58378f);
        eVar.encodeLongElement(fVar, 6, mVar.f58379g);
        eVar.encodeStringElement(fVar, 7, mVar.f58380h);
    }

    public static final /* synthetic */ f50.i b() {
        return new j50.f(k2.a.f71972a);
    }

    public static /* synthetic */ m m(m mVar, String str, long j11, List list, long j12, long j13, long j14, long j15, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = mVar.f58373a;
        }
        return mVar.l(str, (i11 & 2) != 0 ? mVar.f58374b : j11, (i11 & 4) != 0 ? mVar.f58375c : list, (i11 & 8) != 0 ? mVar.f58376d : j12, (i11 & 16) != 0 ? mVar.f58377e : j13, (i11 & 32) != 0 ? mVar.f58378f : j14, (i11 & 64) != 0 ? mVar.f58379g : j15, (i11 & 128) != 0 ? mVar.f58380h : str2);
    }

    @m80.k
    public final List<k2> B() {
        return this.f58375c;
    }

    @m80.k
    public final String d() {
        return this.f58373a;
    }

    public final long e() {
        return this.f58374b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.g0.g(this.f58373a, mVar.f58373a) && this.f58374b == mVar.f58374b && kotlin.jvm.internal.g0.g(this.f58375c, mVar.f58375c) && this.f58376d == mVar.f58376d && this.f58377e == mVar.f58377e && this.f58378f == mVar.f58378f && this.f58379g == mVar.f58379g && kotlin.jvm.internal.g0.g(this.f58380h, mVar.f58380h);
    }

    @m80.k
    public final List<k2> f() {
        return this.f58375c;
    }

    public final long g() {
        return this.f58376d;
    }

    public final long h() {
        return this.f58377e;
    }

    public int hashCode() {
        return (((((((((((((this.f58373a.hashCode() * 31) + Long.hashCode(this.f58374b)) * 31) + this.f58375c.hashCode()) * 31) + Long.hashCode(this.f58376d)) * 31) + Long.hashCode(this.f58377e)) * 31) + Long.hashCode(this.f58378f)) * 31) + Long.hashCode(this.f58379g)) * 31) + this.f58380h.hashCode();
    }

    public final long i() {
        return this.f58378f;
    }

    public final long j() {
        return this.f58379g;
    }

    @m80.k
    public final String k() {
        return this.f58380h;
    }

    @m80.k
    public final m l(@m80.k String roundId, long j11, @m80.k List<k2> words, long j12, long j13, long j14, long j15, @m80.k String roundState) {
        kotlin.jvm.internal.g0.p(roundId, "roundId");
        kotlin.jvm.internal.g0.p(words, "words");
        kotlin.jvm.internal.g0.p(roundState, "roundState");
        return new m(roundId, j11, words, j12, j13, j14, j15, roundState);
    }

    public final long n() {
        return this.f58374b;
    }

    public final long p() {
        return this.f58377e;
    }

    public final long r() {
        return this.f58376d;
    }

    @m80.k
    public final String t() {
        return this.f58373a;
    }

    @m80.k
    public String toString() {
        return "GameRoundModel(roundId=" + this.f58373a + ", bookId=" + this.f58374b + ", words=" + this.f58375c + ", roundCate=" + this.f58376d + ", lifeCount=" + this.f58377e + ", roundType=" + this.f58378f + ", roundTime=" + this.f58379g + ", roundState=" + this.f58380h + ')';
    }

    @m80.k
    public final String v() {
        return this.f58380h;
    }

    public final long x() {
        return this.f58379g;
    }

    public final long z() {
        return this.f58378f;
    }

    public m(@m80.k String roundId, long j11, @m80.k List<k2> words, long j12, long j13, long j14, long j15, @m80.k String roundState) {
        kotlin.jvm.internal.g0.p(roundId, "roundId");
        kotlin.jvm.internal.g0.p(words, "words");
        kotlin.jvm.internal.g0.p(roundState, "roundState");
        this.f58373a = roundId;
        this.f58374b = j11;
        this.f58375c = words;
        this.f58376d = j12;
        this.f58377e = j13;
        this.f58378f = j14;
        this.f58379g = j15;
        this.f58380h = roundState;
    }

    @f50.z("roundType")
    public static /* synthetic */ void A() {
    }

    @f50.z(xd.a.f98002r)
    public static /* synthetic */ void C() {
    }

    @f50.z("bookId")
    public static /* synthetic */ void o() {
    }

    @f50.z("lifeCount")
    public static /* synthetic */ void q() {
    }

    @f50.z("roundCate")
    public static /* synthetic */ void s() {
    }

    @f50.z("roundId")
    public static /* synthetic */ void u() {
    }

    @f50.z("roundState")
    public static /* synthetic */ void w() {
    }

    @f50.z("roundTime")
    public static /* synthetic */ void y() {
    }
}
