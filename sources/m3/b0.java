package m3;

import j50.p0;
import j50.x2;
import kotlin.DeprecationLevel;
import kotlinx.serialization.UnknownFieldException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class b0 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f71849a;

    /* renamed from: b, reason: collision with root package name */
    public final int f71850b;

    /* renamed from: c, reason: collision with root package name */
    public final int f71851c;

    /* renamed from: d, reason: collision with root package name */
    public final int f71852d;

    /* renamed from: e, reason: collision with root package name */
    public final float f71853e;

    /* renamed from: f, reason: collision with root package name */
    public final int f71854f;

    /* renamed from: g, reason: collision with root package name */
    public final int f71855g;

    /* renamed from: h, reason: collision with root package name */
    public final int f71856h;

    /* renamed from: i, reason: collision with root package name */
    public final int f71857i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<b0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f71858a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f71858a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.game.LearningBehaviorVo", aVar, 9);
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
        public final b0 e(@m80.k i50.f decoder) {
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
            return new b0(i29, i28, i18, i17, i15, f11, i14, i13, i12, i16, (x2) null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k b0 value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            b0.D(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<b0> serializer() {
            return a.f71858a;
        }

        public b() {
        }
    }

    public b0(int i11, int i12, int i13, int i14, float f11, int i15, int i16, int i17, int i18) {
        this.f71849a = i11;
        this.f71850b = i12;
        this.f71851c = i13;
        this.f71852d = i14;
        this.f71853e = f11;
        this.f71854f = i15;
        this.f71855g = i16;
        this.f71856h = i17;
        this.f71857i = i18;
    }

    @w00.o
    public static final /* synthetic */ void D(b0 b0Var, i50.e eVar, h50.f fVar) {
        if (eVar.shouldEncodeElementDefault(fVar, 0) || b0Var.f71849a != 0) {
            eVar.encodeIntElement(fVar, 0, b0Var.f71849a);
        }
        eVar.encodeIntElement(fVar, 1, b0Var.f71850b);
        if (eVar.shouldEncodeElementDefault(fVar, 2) || b0Var.f71851c != 0) {
            eVar.encodeIntElement(fVar, 2, b0Var.f71851c);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 3) || b0Var.f71852d != 0) {
            eVar.encodeIntElement(fVar, 3, b0Var.f71852d);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 4) || Float.compare(b0Var.f71853e, 0.0f) != 0) {
            eVar.encodeFloatElement(fVar, 4, b0Var.f71853e);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 5) || b0Var.f71854f != 0) {
            eVar.encodeIntElement(fVar, 5, b0Var.f71854f);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 6) || b0Var.f71855g != 0) {
            eVar.encodeIntElement(fVar, 6, b0Var.f71855g);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 7) || b0Var.f71856h != 0) {
            eVar.encodeIntElement(fVar, 7, b0Var.f71856h);
        }
        if (!eVar.shouldEncodeElementDefault(fVar, 8) && b0Var.f71857i == 0) {
            return;
        }
        eVar.encodeIntElement(fVar, 8, b0Var.f71857i);
    }

    public static /* synthetic */ b0 k(b0 b0Var, int i11, int i12, int i13, int i14, float f11, int i15, int i16, int i17, int i18, int i19, Object obj) {
        if ((i19 & 1) != 0) {
            i11 = b0Var.f71849a;
        }
        if ((i19 & 2) != 0) {
            i12 = b0Var.f71850b;
        }
        if ((i19 & 4) != 0) {
            i13 = b0Var.f71851c;
        }
        if ((i19 & 8) != 0) {
            i14 = b0Var.f71852d;
        }
        if ((i19 & 16) != 0) {
            f11 = b0Var.f71853e;
        }
        if ((i19 & 32) != 0) {
            i15 = b0Var.f71854f;
        }
        if ((i19 & 64) != 0) {
            i16 = b0Var.f71855g;
        }
        if ((i19 & 128) != 0) {
            i17 = b0Var.f71856h;
        }
        if ((i19 & 256) != 0) {
            i18 = b0Var.f71857i;
        }
        int i21 = i17;
        int i22 = i18;
        int i23 = i15;
        int i24 = i16;
        float f12 = f11;
        int i25 = i13;
        return b0Var.j(i11, i12, i25, i14, f12, i23, i24, i21, i22);
    }

    public final int B() {
        return this.f71856h;
    }

    public final int a() {
        return this.f71849a;
    }

    public final int b() {
        return this.f71850b;
    }

    public final int c() {
        return this.f71851c;
    }

    public final int d() {
        return this.f71852d;
    }

    public final float e() {
        return this.f71853e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f71849a == b0Var.f71849a && this.f71850b == b0Var.f71850b && this.f71851c == b0Var.f71851c && this.f71852d == b0Var.f71852d && Float.compare(this.f71853e, b0Var.f71853e) == 0 && this.f71854f == b0Var.f71854f && this.f71855g == b0Var.f71855g && this.f71856h == b0Var.f71856h && this.f71857i == b0Var.f71857i;
    }

    public final int f() {
        return this.f71854f;
    }

    public final int g() {
        return this.f71855g;
    }

    public final int h() {
        return this.f71856h;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.f71849a) * 31) + Integer.hashCode(this.f71850b)) * 31) + Integer.hashCode(this.f71851c)) * 31) + Integer.hashCode(this.f71852d)) * 31) + Float.hashCode(this.f71853e)) * 31) + Integer.hashCode(this.f71854f)) * 31) + Integer.hashCode(this.f71855g)) * 31) + Integer.hashCode(this.f71856h)) * 31) + Integer.hashCode(this.f71857i);
    }

    public final int i() {
        return this.f71857i;
    }

    @m80.k
    public final b0 j(int i11, int i12, int i13, int i14, float f11, int i15, int i16, int i17, int i18) {
        return new b0(i11, i12, i13, i14, f11, i15, i16, i17, i18);
    }

    public final float l() {
        return this.f71853e;
    }

    public final int n() {
        return this.f71851c;
    }

    public final int p() {
        return this.f71852d;
    }

    public final int r() {
        return this.f71850b;
    }

    public final int t() {
        return this.f71857i;
    }

    @m80.k
    public String toString() {
        return "LearningBehaviorVo(topicId=" + this.f71849a + ", question=" + this.f71850b + ", image=" + this.f71851c + ", option=" + this.f71852d + ", correctRatio=" + this.f71853e + ", usageTimeInMs=" + this.f71854f + ", useTipTimes=" + this.f71855g + ", useWikiTimes=" + this.f71856h + ", takeALookTimes=" + this.f71857i + ')';
    }

    public final int v() {
        return this.f71849a;
    }

    public final int x() {
        return this.f71854f;
    }

    public final int z() {
        return this.f71855g;
    }

    public /* synthetic */ b0(int i11, int i12, int i13, int i14, int i15, float f11, int i16, int i17, int i18, int i19, x2 x2Var) {
        if (2 != (i11 & 2)) {
            j50.h2.b(i11, 2, a.f71858a.a());
        }
        if ((i11 & 1) == 0) {
            this.f71849a = 0;
        } else {
            this.f71849a = i12;
        }
        this.f71850b = i13;
        if ((i11 & 4) == 0) {
            this.f71851c = 0;
        } else {
            this.f71851c = i14;
        }
        if ((i11 & 8) == 0) {
            this.f71852d = 0;
        } else {
            this.f71852d = i15;
        }
        if ((i11 & 16) == 0) {
            this.f71853e = 0.0f;
        } else {
            this.f71853e = f11;
        }
        if ((i11 & 32) == 0) {
            this.f71854f = 0;
        } else {
            this.f71854f = i16;
        }
        if ((i11 & 64) == 0) {
            this.f71855g = 0;
        } else {
            this.f71855g = i17;
        }
        if ((i11 & 128) == 0) {
            this.f71856h = 0;
        } else {
            this.f71856h = i18;
        }
        if ((i11 & 256) == 0) {
            this.f71857i = 0;
        } else {
            this.f71857i = i19;
        }
    }

    public /* synthetic */ b0(int i11, int i12, int i13, int i14, float f11, int i15, int i16, int i17, int i18, int i19, kotlin.jvm.internal.v vVar) {
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
