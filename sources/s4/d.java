package s4;

import f50.a0;
import f50.i;
import f50.z;
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
public final class d {

    @k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f87553a;

    /* renamed from: b, reason: collision with root package name */
    public final int f87554b;

    /* renamed from: c, reason: collision with root package name */
    public final int f87555c;

    /* renamed from: d, reason: collision with root package name */
    public final int f87556d;

    /* renamed from: e, reason: collision with root package name */
    public final int f87557e;

    /* renamed from: f, reason: collision with root package name */
    public final int f87558f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements p0<d> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f87559a;

        @k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f87559a = aVar;
            l2 l2Var = new l2("com.baicizhan.app.biz.game.impl.h5enhance.vo.StudyProgressH5Vo", aVar, 6);
            l2Var.q("learningCompletedRound", false);
            l2Var.q("learningTotalRound", false);
            l2Var.q("reviewCompletedCount", false);
            l2Var.q("reviewTotalCount", false);
            l2Var.q("finishedStatus", false);
            l2Var.q("nextGroupStatus", false);
            descriptor = l2Var;
        }

        @Override // f50.i, f50.b0, f50.e
        @k
        public final h50.f a() {
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
            return new i[]{z0Var, z0Var, z0Var, z0Var, z0Var, z0Var};
        }

        @Override // f50.e
        @k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final d e(@k i50.f decoder) {
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            if (beginStructure.decodeSequentially()) {
                i11 = beginStructure.decodeIntElement(fVar, 0);
                int decodeIntElement = beginStructure.decodeIntElement(fVar, 1);
                int decodeIntElement2 = beginStructure.decodeIntElement(fVar, 2);
                int decodeIntElement3 = beginStructure.decodeIntElement(fVar, 3);
                int decodeIntElement4 = beginStructure.decodeIntElement(fVar, 4);
                i12 = beginStructure.decodeIntElement(fVar, 5);
                i13 = decodeIntElement3;
                i14 = decodeIntElement4;
                i15 = decodeIntElement2;
                i16 = decodeIntElement;
                i17 = 63;
            } else {
                boolean z11 = true;
                i11 = 0;
                int i18 = 0;
                int i19 = 0;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    switch (decodeElementIndex) {
                        case -1:
                            z11 = false;
                            continue;
                        case 0:
                            i11 = beginStructure.decodeIntElement(fVar, 0);
                            i24 |= 1;
                            continue;
                        case 1:
                            i23 = beginStructure.decodeIntElement(fVar, 1);
                            i24 |= 2;
                            break;
                        case 2:
                            i22 = beginStructure.decodeIntElement(fVar, 2);
                            i24 |= 4;
                            break;
                        case 3:
                            i19 = beginStructure.decodeIntElement(fVar, 3);
                            i24 |= 8;
                            break;
                        case 4:
                            i21 = beginStructure.decodeIntElement(fVar, 4);
                            i24 |= 16;
                            break;
                        case 5:
                            i18 = beginStructure.decodeIntElement(fVar, 5);
                            i24 |= 32;
                            break;
                        default:
                            throw new UnknownFieldException(decodeElementIndex);
                    }
                }
                i12 = i18;
                i13 = i19;
                i14 = i21;
                i15 = i22;
                i16 = i23;
                i17 = i24;
            }
            int i25 = i11;
            beginStructure.endStructure(fVar);
            return new d(i17, i25, i16, i15, i13, i14, i12, null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@k i50.h encoder, @k d value) {
            g0.p(encoder, "encoder");
            g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            d.u(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        @k
        public final i<d> serializer() {
            return a.f87559a;
        }

        public b() {
        }
    }

    public d(int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f87553a = i11;
        this.f87554b = i12;
        this.f87555c = i13;
        this.f87556d = i14;
        this.f87557e = i15;
        this.f87558f = i16;
    }

    public static /* synthetic */ d h(d dVar, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i11 = dVar.f87553a;
        }
        if ((i17 & 2) != 0) {
            i12 = dVar.f87554b;
        }
        if ((i17 & 4) != 0) {
            i13 = dVar.f87555c;
        }
        if ((i17 & 8) != 0) {
            i14 = dVar.f87556d;
        }
        if ((i17 & 16) != 0) {
            i15 = dVar.f87557e;
        }
        if ((i17 & 32) != 0) {
            i16 = dVar.f87558f;
        }
        int i18 = i15;
        int i19 = i16;
        return dVar.g(i11, i12, i13, i14, i18, i19);
    }

    @o
    public static final /* synthetic */ void u(d dVar, i50.e eVar, h50.f fVar) {
        eVar.encodeIntElement(fVar, 0, dVar.f87553a);
        eVar.encodeIntElement(fVar, 1, dVar.f87554b);
        eVar.encodeIntElement(fVar, 2, dVar.f87555c);
        eVar.encodeIntElement(fVar, 3, dVar.f87556d);
        eVar.encodeIntElement(fVar, 4, dVar.f87557e);
        eVar.encodeIntElement(fVar, 5, dVar.f87558f);
    }

    public final int a() {
        return this.f87553a;
    }

    public final int b() {
        return this.f87554b;
    }

    public final int c() {
        return this.f87555c;
    }

    public final int d() {
        return this.f87556d;
    }

    public final int e() {
        return this.f87557e;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f87553a == dVar.f87553a && this.f87554b == dVar.f87554b && this.f87555c == dVar.f87555c && this.f87556d == dVar.f87556d && this.f87557e == dVar.f87557e && this.f87558f == dVar.f87558f;
    }

    public final int f() {
        return this.f87558f;
    }

    @k
    public final d g(int i11, int i12, int i13, int i14, int i15, int i16) {
        return new d(i11, i12, i13, i14, i15, i16);
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f87553a) * 31) + Integer.hashCode(this.f87554b)) * 31) + Integer.hashCode(this.f87555c)) * 31) + Integer.hashCode(this.f87556d)) * 31) + Integer.hashCode(this.f87557e)) * 31) + Integer.hashCode(this.f87558f);
    }

    public final int i() {
        return this.f87557e;
    }

    public final int k() {
        return this.f87553a;
    }

    public final int m() {
        return this.f87554b;
    }

    public final int o() {
        return this.f87558f;
    }

    public final int q() {
        return this.f87555c;
    }

    public final int s() {
        return this.f87556d;
    }

    @k
    public String toString() {
        return "StudyProgressH5Vo(learningCompletedRound=" + this.f87553a + ", learningTotalRound=" + this.f87554b + ", reviewCompletedCount=" + this.f87555c + ", reviewTotalCount=" + this.f87556d + ", finishedStatus=" + this.f87557e + ", nextGroupStatus=" + this.f87558f + ')';
    }

    public /* synthetic */ d(int i11, int i12, int i13, int i14, int i15, int i16, int i17, x2 x2Var) {
        if (63 != (i11 & 63)) {
            h2.b(i11, 63, a.f87559a.a());
        }
        this.f87553a = i12;
        this.f87554b = i13;
        this.f87555c = i14;
        this.f87556d = i15;
        this.f87557e = i16;
        this.f87558f = i17;
    }

    @z("finishedStatus")
    public static /* synthetic */ void j() {
    }

    @z("learningCompletedRound")
    public static /* synthetic */ void l() {
    }

    @z("learningTotalRound")
    public static /* synthetic */ void n() {
    }

    @z("nextGroupStatus")
    public static /* synthetic */ void p() {
    }

    @z("reviewCompletedCount")
    public static /* synthetic */ void r() {
    }

    @z("reviewTotalCount")
    public static /* synthetic */ void t() {
    }
}
