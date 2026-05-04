package m3;

import j50.p0;
import j50.x2;
import kotlin.DeprecationLevel;
import kotlinx.serialization.UnknownFieldException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class g1 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f71919a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f71920b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f71921c;

    /* renamed from: d, reason: collision with root package name */
    public final int f71922d;

    /* renamed from: e, reason: collision with root package name */
    public final int f71923e;

    /* renamed from: f, reason: collision with root package name */
    public final int f71924f;

    /* renamed from: g, reason: collision with root package name */
    public final int f71925g;

    /* renamed from: h, reason: collision with root package name */
    public final int f71926h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<g1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f71927a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f71927a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.game.StudyCompletionResult", aVar, 8);
            l2Var.q("topicId", false);
            l2Var.q("isRemoved", true);
            l2Var.q("isSkipped", true);
            l2Var.q("halfDay", true);
            l2Var.q("halfDayUpdated", true);
            l2Var.q("correctTimes", true);
            l2Var.q("attemptedTimes", true);
            l2Var.q("usageTimeInMs", true);
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
            j50.i iVar = j50.i.f63378a;
            return new f50.i[]{z0Var, iVar, iVar, z0Var, z0Var, z0Var, z0Var, z0Var};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final g1 e(@m80.k i50.f decoder) {
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            boolean z11;
            boolean z12;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            int i17 = 0;
            if (beginStructure.decodeSequentially()) {
                i11 = beginStructure.decodeIntElement(fVar, 0);
                boolean decodeBooleanElement = beginStructure.decodeBooleanElement(fVar, 1);
                boolean decodeBooleanElement2 = beginStructure.decodeBooleanElement(fVar, 2);
                int decodeIntElement = beginStructure.decodeIntElement(fVar, 3);
                int decodeIntElement2 = beginStructure.decodeIntElement(fVar, 4);
                int decodeIntElement3 = beginStructure.decodeIntElement(fVar, 5);
                int decodeIntElement4 = beginStructure.decodeIntElement(fVar, 6);
                i17 = 255;
                i12 = beginStructure.decodeIntElement(fVar, 7);
                i13 = decodeIntElement4;
                i14 = decodeIntElement3;
                i15 = decodeIntElement;
                i16 = decodeIntElement2;
                z11 = decodeBooleanElement2;
                z12 = decodeBooleanElement;
            } else {
                boolean z13 = true;
                i11 = 0;
                int i18 = 0;
                int i19 = 0;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                boolean z14 = false;
                boolean z15 = false;
                while (z13) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    switch (decodeElementIndex) {
                        case -1:
                            z13 = false;
                            break;
                        case 0:
                            i17 |= 1;
                            i11 = beginStructure.decodeIntElement(fVar, 0);
                            continue;
                        case 1:
                            z15 = beginStructure.decodeBooleanElement(fVar, 1);
                            i17 |= 2;
                            continue;
                        case 2:
                            z14 = beginStructure.decodeBooleanElement(fVar, 2);
                            i17 |= 4;
                            break;
                        case 3:
                            i22 = beginStructure.decodeIntElement(fVar, 3);
                            i17 |= 8;
                            break;
                        case 4:
                            i23 = beginStructure.decodeIntElement(fVar, 4);
                            i17 |= 16;
                            break;
                        case 5:
                            i21 = beginStructure.decodeIntElement(fVar, 5);
                            i17 |= 32;
                            break;
                        case 6:
                            i19 = beginStructure.decodeIntElement(fVar, 6);
                            i17 |= 64;
                            break;
                        case 7:
                            i18 = beginStructure.decodeIntElement(fVar, 7);
                            i17 |= 128;
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
                z11 = z14;
                z12 = z15;
            }
            int i24 = i11;
            int i25 = i17;
            beginStructure.endStructure(fVar);
            return new g1(i25, i24, z12, z11, i15, i16, i14, i13, i12, (x2) null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k g1 value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            g1.A(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<g1> serializer() {
            return a.f71927a;
        }

        public b() {
        }
    }

    public /* synthetic */ g1(int i11, int i12, boolean z11, boolean z12, int i13, int i14, int i15, int i16, int i17, x2 x2Var) {
        if (1 != (i11 & 1)) {
            j50.h2.b(i11, 1, a.f71927a.a());
        }
        this.f71919a = i12;
        if ((i11 & 2) == 0) {
            this.f71920b = false;
        } else {
            this.f71920b = z11;
        }
        if ((i11 & 4) == 0) {
            this.f71921c = false;
        } else {
            this.f71921c = z12;
        }
        if ((i11 & 8) == 0) {
            this.f71922d = 0;
        } else {
            this.f71922d = i13;
        }
        if ((i11 & 16) == 0) {
            this.f71923e = 0;
        } else {
            this.f71923e = i14;
        }
        if ((i11 & 32) == 0) {
            this.f71924f = 0;
        } else {
            this.f71924f = i15;
        }
        if ((i11 & 64) == 0) {
            this.f71925g = 0;
        } else {
            this.f71925g = i16;
        }
        if ((i11 & 128) == 0) {
            this.f71926h = 0;
        } else {
            this.f71926h = i17;
        }
    }

    @w00.o
    public static final /* synthetic */ void A(g1 g1Var, i50.e eVar, h50.f fVar) {
        eVar.encodeIntElement(fVar, 0, g1Var.f71919a);
        if (eVar.shouldEncodeElementDefault(fVar, 1) || g1Var.f71920b) {
            eVar.encodeBooleanElement(fVar, 1, g1Var.f71920b);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 2) || g1Var.f71921c) {
            eVar.encodeBooleanElement(fVar, 2, g1Var.f71921c);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 3) || g1Var.f71922d != 0) {
            eVar.encodeIntElement(fVar, 3, g1Var.f71922d);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 4) || g1Var.f71923e != 0) {
            eVar.encodeIntElement(fVar, 4, g1Var.f71923e);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 5) || g1Var.f71924f != 0) {
            eVar.encodeIntElement(fVar, 5, g1Var.f71924f);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 6) || g1Var.f71925g != 0) {
            eVar.encodeIntElement(fVar, 6, g1Var.f71925g);
        }
        if (!eVar.shouldEncodeElementDefault(fVar, 7) && g1Var.f71926h == 0) {
            return;
        }
        eVar.encodeIntElement(fVar, 7, g1Var.f71926h);
    }

    public static /* synthetic */ g1 j(g1 g1Var, int i11, boolean z11, boolean z12, int i12, int i13, int i14, int i15, int i16, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i11 = g1Var.f71919a;
        }
        if ((i17 & 2) != 0) {
            z11 = g1Var.f71920b;
        }
        if ((i17 & 4) != 0) {
            z12 = g1Var.f71921c;
        }
        if ((i17 & 8) != 0) {
            i12 = g1Var.f71922d;
        }
        if ((i17 & 16) != 0) {
            i13 = g1Var.f71923e;
        }
        if ((i17 & 32) != 0) {
            i14 = g1Var.f71924f;
        }
        if ((i17 & 64) != 0) {
            i15 = g1Var.f71925g;
        }
        if ((i17 & 128) != 0) {
            i16 = g1Var.f71926h;
        }
        int i18 = i15;
        int i19 = i16;
        int i21 = i13;
        int i22 = i14;
        return g1Var.i(i11, z11, z12, i12, i21, i22, i18, i19);
    }

    public final int a() {
        return this.f71919a;
    }

    public final boolean b() {
        return this.f71920b;
    }

    public final boolean c() {
        return this.f71921c;
    }

    public final int d() {
        return this.f71922d;
    }

    public final int e() {
        return this.f71923e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return this.f71919a == g1Var.f71919a && this.f71920b == g1Var.f71920b && this.f71921c == g1Var.f71921c && this.f71922d == g1Var.f71922d && this.f71923e == g1Var.f71923e && this.f71924f == g1Var.f71924f && this.f71925g == g1Var.f71925g && this.f71926h == g1Var.f71926h;
    }

    public final int f() {
        return this.f71924f;
    }

    public final int g() {
        return this.f71925g;
    }

    public final int h() {
        return this.f71926h;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.f71919a) * 31) + Boolean.hashCode(this.f71920b)) * 31) + Boolean.hashCode(this.f71921c)) * 31) + Integer.hashCode(this.f71922d)) * 31) + Integer.hashCode(this.f71923e)) * 31) + Integer.hashCode(this.f71924f)) * 31) + Integer.hashCode(this.f71925g)) * 31) + Integer.hashCode(this.f71926h);
    }

    @m80.k
    public final g1 i(int i11, boolean z11, boolean z12, int i12, int i13, int i14, int i15, int i16) {
        return new g1(i11, z11, z12, i12, i13, i14, i15, i16);
    }

    public final int k() {
        return this.f71925g;
    }

    public final int m() {
        return this.f71924f;
    }

    public final int o() {
        return this.f71922d;
    }

    public final int q() {
        return this.f71923e;
    }

    public final int s() {
        return this.f71919a;
    }

    @m80.k
    public String toString() {
        return "StudyCompletionResult(topicId=" + this.f71919a + ", isRemoved=" + this.f71920b + ", isSkipped=" + this.f71921c + ", halfDay=" + this.f71922d + ", halfDayUpdated=" + this.f71923e + ", correctTimes=" + this.f71924f + ", attemptedTimes=" + this.f71925g + ", usageTimeInMs=" + this.f71926h + ')';
    }

    public final int u() {
        return this.f71926h;
    }

    public final boolean w() {
        return this.f71920b;
    }

    public final boolean y() {
        return this.f71921c;
    }

    public g1(int i11, boolean z11, boolean z12, int i12, int i13, int i14, int i15, int i16) {
        this.f71919a = i11;
        this.f71920b = z11;
        this.f71921c = z12;
        this.f71922d = i12;
        this.f71923e = i13;
        this.f71924f = i14;
        this.f71925g = i15;
        this.f71926h = i16;
    }

    public /* synthetic */ g1(int i11, boolean z11, boolean z12, int i12, int i13, int i14, int i15, int i16, int i17, kotlin.jvm.internal.v vVar) {
        this(i11, (i17 & 2) != 0 ? false : z11, (i17 & 4) != 0 ? false : z12, (i17 & 8) != 0 ? 0 : i12, (i17 & 16) != 0 ? 0 : i13, (i17 & 32) != 0 ? 0 : i14, (i17 & 64) != 0 ? 0 : i15, (i17 & 128) != 0 ? 0 : i16);
    }

    @f50.z("attemptedTimes")
    public static /* synthetic */ void l() {
    }

    @f50.z("correctTimes")
    public static /* synthetic */ void n() {
    }

    @f50.z("halfDay")
    public static /* synthetic */ void p() {
    }

    @f50.z("halfDayUpdated")
    public static /* synthetic */ void r() {
    }

    @f50.z("topicId")
    public static /* synthetic */ void t() {
    }

    @f50.z("usageTimeInMs")
    public static /* synthetic */ void v() {
    }

    @f50.z("isRemoved")
    public static /* synthetic */ void x() {
    }

    @f50.z("isSkipped")
    public static /* synthetic */ void z() {
    }
}
