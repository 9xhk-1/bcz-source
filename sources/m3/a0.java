package m3;

import j50.p0;
import j50.x2;
import kotlin.DeprecationLevel;
import kotlinx.serialization.UnknownFieldException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class a0 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f71829a;

    /* renamed from: b, reason: collision with root package name */
    public final int f71830b;

    /* renamed from: c, reason: collision with root package name */
    public final int f71831c;

    /* renamed from: d, reason: collision with root package name */
    public final int f71832d;

    /* renamed from: e, reason: collision with root package name */
    public final float f71833e;

    /* renamed from: f, reason: collision with root package name */
    public final int f71834f;

    /* renamed from: g, reason: collision with root package name */
    public final int f71835g;

    /* renamed from: h, reason: collision with root package name */
    public final int f71836h;

    /* renamed from: i, reason: collision with root package name */
    public final int f71837i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<a0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f71838a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f71838a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.game.LearningBehaviorModel", aVar, 9);
            l2Var.q("topicId", true);
            l2Var.q("question", false);
            l2Var.q("image", true);
            l2Var.q("option", true);
            l2Var.q("correctRatio", true);
            l2Var.q("usageTimeInMs", true);
            l2Var.q("useTipTimes", true);
            l2Var.q("useWikiTimes", true);
            l2Var.q("takeALookTimes", true);
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
            return new f50.i[]{z0Var, z0Var, z0Var, z0Var, j50.o0.f63436a, z0Var, z0Var, z0Var, z0Var};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final a0 e(@m80.k i50.f decoder) {
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            float f11;
            int i17;
            int i18;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            int i19 = 0;
            if (beginStructure.decodeSequentially()) {
                i11 = beginStructure.decodeIntElement(fVar, 0);
                int decodeIntElement = beginStructure.decodeIntElement(fVar, 1);
                int decodeIntElement2 = beginStructure.decodeIntElement(fVar, 2);
                int decodeIntElement3 = beginStructure.decodeIntElement(fVar, 3);
                float decodeFloatElement = beginStructure.decodeFloatElement(fVar, 4);
                int decodeIntElement4 = beginStructure.decodeIntElement(fVar, 5);
                int decodeIntElement5 = beginStructure.decodeIntElement(fVar, 6);
                i19 = 511;
                i12 = beginStructure.decodeIntElement(fVar, 7);
                i13 = decodeIntElement5;
                i14 = decodeIntElement4;
                i15 = decodeIntElement3;
                i16 = beginStructure.decodeIntElement(fVar, 8);
                f11 = decodeFloatElement;
                i17 = decodeIntElement2;
                i18 = decodeIntElement;
            } else {
                float f12 = 0.0f;
                boolean z11 = true;
                i11 = 0;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    switch (decodeElementIndex) {
                        case -1:
                            z11 = false;
                            break;
                        case 0:
                            i19 |= 1;
                            i11 = beginStructure.decodeIntElement(fVar, 0);
                            continue;
                        case 1:
                            i27 = beginStructure.decodeIntElement(fVar, 1);
                            i19 |= 2;
                            continue;
                        case 2:
                            i26 = beginStructure.decodeIntElement(fVar, 2);
                            i19 |= 4;
                            break;
                        case 3:
                            i24 = beginStructure.decodeIntElement(fVar, 3);
                            i19 |= 8;
                            break;
                        case 4:
                            f12 = beginStructure.decodeFloatElement(fVar, 4);
                            i19 |= 16;
                            break;
                        case 5:
                            i23 = beginStructure.decodeIntElement(fVar, 5);
                            i19 |= 32;
                            break;
                        case 6:
                            i22 = beginStructure.decodeIntElement(fVar, 6);
                            i19 |= 64;
                            break;
                        case 7:
                            i21 = beginStructure.decodeIntElement(fVar, 7);
                            i19 |= 128;
                            break;
                        case 8:
                            i25 = beginStructure.decodeIntElement(fVar, 8);
                            i19 |= 256;
                            break;
                        default:
                            throw new UnknownFieldException(decodeElementIndex);
                    }
                }
                i12 = i21;
                i13 = i22;
                i14 = i23;
                i15 = i24;
                i16 = i25;
                f11 = f12;
                i17 = i26;
                i18 = i27;
            }
            int i28 = i11;
            int i29 = i19;
            beginStructure.endStructure(fVar);
            return new a0(i29, i28, i18, i17, i15, f11, i14, i13, i12, i16, (x2) null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k a0 value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            a0.D(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<a0> serializer() {
            return a.f71838a;
        }

        public b() {
        }
    }

    public a0(int i11, int i12, int i13, int i14, float f11, int i15, int i16, int i17, int i18) {
        this.f71829a = i11;
        this.f71830b = i12;
        this.f71831c = i13;
        this.f71832d = i14;
        this.f71833e = f11;
        this.f71834f = i15;
        this.f71835g = i16;
        this.f71836h = i17;
        this.f71837i = i18;
    }

    @w00.o
    public static final /* synthetic */ void D(a0 a0Var, i50.e eVar, h50.f fVar) {
        if (eVar.shouldEncodeElementDefault(fVar, 0) || a0Var.f71829a != 0) {
            eVar.encodeIntElement(fVar, 0, a0Var.f71829a);
        }
        eVar.encodeIntElement(fVar, 1, a0Var.f71830b);
        if (eVar.shouldEncodeElementDefault(fVar, 2) || a0Var.f71831c != 0) {
            eVar.encodeIntElement(fVar, 2, a0Var.f71831c);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 3) || a0Var.f71832d != 0) {
            eVar.encodeIntElement(fVar, 3, a0Var.f71832d);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 4) || Float.compare(a0Var.f71833e, 0.0f) != 0) {
            eVar.encodeFloatElement(fVar, 4, a0Var.f71833e);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 5) || a0Var.f71834f != 0) {
            eVar.encodeIntElement(fVar, 5, a0Var.f71834f);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 6) || a0Var.f71835g != 0) {
            eVar.encodeIntElement(fVar, 6, a0Var.f71835g);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 7) || a0Var.f71836h != 0) {
            eVar.encodeIntElement(fVar, 7, a0Var.f71836h);
        }
        if (!eVar.shouldEncodeElementDefault(fVar, 8) && a0Var.f71837i == 0) {
            return;
        }
        eVar.encodeIntElement(fVar, 8, a0Var.f71837i);
    }

    public static /* synthetic */ a0 k(a0 a0Var, int i11, int i12, int i13, int i14, float f11, int i15, int i16, int i17, int i18, int i19, Object obj) {
        if ((i19 & 1) != 0) {
            i11 = a0Var.f71829a;
        }
        if ((i19 & 2) != 0) {
            i12 = a0Var.f71830b;
        }
        if ((i19 & 4) != 0) {
            i13 = a0Var.f71831c;
        }
        if ((i19 & 8) != 0) {
            i14 = a0Var.f71832d;
        }
        if ((i19 & 16) != 0) {
            f11 = a0Var.f71833e;
        }
        if ((i19 & 32) != 0) {
            i15 = a0Var.f71834f;
        }
        if ((i19 & 64) != 0) {
            i16 = a0Var.f71835g;
        }
        if ((i19 & 128) != 0) {
            i17 = a0Var.f71836h;
        }
        if ((i19 & 256) != 0) {
            i18 = a0Var.f71837i;
        }
        int i21 = i17;
        int i22 = i18;
        int i23 = i15;
        int i24 = i16;
        float f12 = f11;
        int i25 = i13;
        return a0Var.j(i11, i12, i25, i14, f12, i23, i24, i21, i22);
    }

    public final int B() {
        return this.f71836h;
    }

    public final int a() {
        return this.f71829a;
    }

    public final int b() {
        return this.f71830b;
    }

    public final int c() {
        return this.f71831c;
    }

    public final int d() {
        return this.f71832d;
    }

    public final float e() {
        return this.f71833e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f71829a == a0Var.f71829a && this.f71830b == a0Var.f71830b && this.f71831c == a0Var.f71831c && this.f71832d == a0Var.f71832d && Float.compare(this.f71833e, a0Var.f71833e) == 0 && this.f71834f == a0Var.f71834f && this.f71835g == a0Var.f71835g && this.f71836h == a0Var.f71836h && this.f71837i == a0Var.f71837i;
    }

    public final int f() {
        return this.f71834f;
    }

    public final int g() {
        return this.f71835g;
    }

    public final int h() {
        return this.f71836h;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.f71829a) * 31) + Integer.hashCode(this.f71830b)) * 31) + Integer.hashCode(this.f71831c)) * 31) + Integer.hashCode(this.f71832d)) * 31) + Float.hashCode(this.f71833e)) * 31) + Integer.hashCode(this.f71834f)) * 31) + Integer.hashCode(this.f71835g)) * 31) + Integer.hashCode(this.f71836h)) * 31) + Integer.hashCode(this.f71837i);
    }

    public final int i() {
        return this.f71837i;
    }

    @m80.k
    public final a0 j(int i11, int i12, int i13, int i14, float f11, int i15, int i16, int i17, int i18) {
        return new a0(i11, i12, i13, i14, f11, i15, i16, i17, i18);
    }

    public final float l() {
        return this.f71833e;
    }

    public final int n() {
        return this.f71831c;
    }

    public final int p() {
        return this.f71832d;
    }

    public final int r() {
        return this.f71830b;
    }

    public final int t() {
        return this.f71837i;
    }

    @m80.k
    public String toString() {
        return "LearningBehaviorModel(topicId=" + this.f71829a + ", question=" + this.f71830b + ", image=" + this.f71831c + ", option=" + this.f71832d + ", correctRatio=" + this.f71833e + ", usageTimeInMs=" + this.f71834f + ", useTipTimes=" + this.f71835g + ", useWikiTimes=" + this.f71836h + ", takeALookTimes=" + this.f71837i + ')';
    }

    public final int v() {
        return this.f71829a;
    }

    public final int x() {
        return this.f71834f;
    }

    public final int z() {
        return this.f71835g;
    }

    public /* synthetic */ a0(int i11, int i12, int i13, int i14, int i15, float f11, int i16, int i17, int i18, int i19, x2 x2Var) {
        if (2 != (i11 & 2)) {
            j50.h2.b(i11, 2, a.f71838a.a());
        }
        if ((i11 & 1) == 0) {
            this.f71829a = 0;
        } else {
            this.f71829a = i12;
        }
        this.f71830b = i13;
        if ((i11 & 4) == 0) {
            this.f71831c = 0;
        } else {
            this.f71831c = i14;
        }
        if ((i11 & 8) == 0) {
            this.f71832d = 0;
        } else {
            this.f71832d = i15;
        }
        if ((i11 & 16) == 0) {
            this.f71833e = 0.0f;
        } else {
            this.f71833e = f11;
        }
        if ((i11 & 32) == 0) {
            this.f71834f = 0;
        } else {
            this.f71834f = i16;
        }
        if ((i11 & 64) == 0) {
            this.f71835g = 0;
        } else {
            this.f71835g = i17;
        }
        if ((i11 & 128) == 0) {
            this.f71836h = 0;
        } else {
            this.f71836h = i18;
        }
        if ((i11 & 256) == 0) {
            this.f71837i = 0;
        } else {
            this.f71837i = i19;
        }
    }

    public /* synthetic */ a0(int i11, int i12, int i13, int i14, float f11, int i15, int i16, int i17, int i18, int i19, kotlin.jvm.internal.v vVar) {
        this((i19 & 1) != 0 ? 0 : i11, i12, (i19 & 4) != 0 ? 0 : i13, (i19 & 8) != 0 ? 0 : i14, (i19 & 16) != 0 ? 0.0f : f11, (i19 & 32) != 0 ? 0 : i15, (i19 & 64) != 0 ? 0 : i16, (i19 & 128) != 0 ? 0 : i17, (i19 & 256) != 0 ? 0 : i18);
    }

    @f50.z("useTipTimes")
    public static /* synthetic */ void A() {
    }

    @f50.z("useWikiTimes")
    public static /* synthetic */ void C() {
    }

    @f50.z("correctRatio")
    public static /* synthetic */ void m() {
    }

    @f50.z("image")
    public static /* synthetic */ void o() {
    }

    @f50.z("option")
    public static /* synthetic */ void q() {
    }

    @f50.z("question")
    public static /* synthetic */ void s() {
    }

    @f50.z("takeALookTimes")
    public static /* synthetic */ void u() {
    }

    @f50.z("topicId")
    public static /* synthetic */ void w() {
    }

    @f50.z("usageTimeInMs")
    public static /* synthetic */ void y() {
    }
}
