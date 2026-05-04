package m3;

import androidx.media3.extractor.text.ttml.TtmlNode;
import j50.d3;
import j50.p0;
import j50.x2;
import kotlin.DeprecationLevel;
import kotlinx.serialization.UnknownFieldException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class z {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f72123a;

    /* renamed from: b, reason: collision with root package name */
    public final int f72124b;

    /* renamed from: c, reason: collision with root package name */
    public final int f72125c;

    /* renamed from: d, reason: collision with root package name */
    public final int f72126d;

    /* renamed from: e, reason: collision with root package name */
    public final int f72127e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public final String f72128f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final String f72129g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final String f72130h;

    /* renamed from: i, reason: collision with root package name */
    public final long f72131i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<z> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f72132a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f72132a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.game.LavaQuestVo", aVar, 9);
            l2Var.q("status", false);
            l2Var.q("current", false);
            l2Var.q(hb.d.f59153d, false);
            l2Var.q("propsRemainCount", false);
            l2Var.q("revivalCoinCost", false);
            l2Var.q("iconImg", false);
            l2Var.q(TtmlNode.ATTR_TTS_BACKGROUND_COLOR, false);
            l2Var.q("borderColor", false);
            l2Var.q("endTime", false);
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
            f50.i<?> v11 = g50.a.v(d3Var);
            j50.z0 z0Var = j50.z0.f63517a;
            return new f50.i[]{z0Var, z0Var, z0Var, z0Var, z0Var, v11, d3Var, d3Var, j50.l1.f63406a};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final z e(@m80.k i50.f decoder) {
            int i11;
            String str;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            long j11;
            String str2;
            String str3;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            if (beginStructure.decodeSequentially()) {
                i11 = beginStructure.decodeIntElement(fVar, 0);
                int decodeIntElement = beginStructure.decodeIntElement(fVar, 1);
                int decodeIntElement2 = beginStructure.decodeIntElement(fVar, 2);
                int decodeIntElement3 = beginStructure.decodeIntElement(fVar, 3);
                int decodeIntElement4 = beginStructure.decodeIntElement(fVar, 4);
                String str4 = (String) beginStructure.decodeNullableSerializableElement(fVar, 5, d3.f63348a, null);
                String decodeStringElement = beginStructure.decodeStringElement(fVar, 6);
                str3 = beginStructure.decodeStringElement(fVar, 7);
                str2 = decodeStringElement;
                str = str4;
                i12 = decodeIntElement3;
                i13 = 511;
                i14 = decodeIntElement4;
                i15 = decodeIntElement2;
                i16 = decodeIntElement;
                j11 = beginStructure.decodeLongElement(fVar, 8);
            } else {
                boolean z11 = true;
                i11 = 0;
                int i17 = 0;
                int i18 = 0;
                String str5 = null;
                String str6 = null;
                long j12 = 0;
                int i19 = 0;
                int i21 = 0;
                int i22 = 0;
                String str7 = null;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    switch (decodeElementIndex) {
                        case -1:
                            z11 = false;
                            break;
                        case 0:
                            i21 |= 1;
                            i11 = beginStructure.decodeIntElement(fVar, 0);
                            continue;
                        case 1:
                            i18 = beginStructure.decodeIntElement(fVar, 1);
                            i21 |= 2;
                            continue;
                        case 2:
                            i17 = beginStructure.decodeIntElement(fVar, 2);
                            i21 |= 4;
                            break;
                        case 3:
                            i19 = beginStructure.decodeIntElement(fVar, 3);
                            i21 |= 8;
                            break;
                        case 4:
                            i22 = beginStructure.decodeIntElement(fVar, 4);
                            i21 |= 16;
                            break;
                        case 5:
                            str7 = (String) beginStructure.decodeNullableSerializableElement(fVar, 5, d3.f63348a, str7);
                            i21 |= 32;
                            break;
                        case 6:
                            str5 = beginStructure.decodeStringElement(fVar, 6);
                            i21 |= 64;
                            break;
                        case 7:
                            str6 = beginStructure.decodeStringElement(fVar, 7);
                            i21 |= 128;
                            break;
                        case 8:
                            j12 = beginStructure.decodeLongElement(fVar, 8);
                            i21 |= 256;
                            break;
                        default:
                            throw new UnknownFieldException(decodeElementIndex);
                    }
                }
                str = str7;
                i12 = i19;
                i13 = i21;
                i14 = i22;
                i15 = i17;
                i16 = i18;
                j11 = j12;
                str2 = str5;
                str3 = str6;
            }
            int i23 = i11;
            beginStructure.endStructure(fVar);
            return new z(i13, i23, i16, i15, i12, i14, str, str2, str3, j11, null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k z value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            z.D(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<z> serializer() {
            return a.f72132a;
        }

        public b() {
        }
    }

    public /* synthetic */ z(int i11, int i12, int i13, int i14, int i15, int i16, String str, String str2, String str3, long j11, x2 x2Var) {
        if (511 != (i11 & 511)) {
            j50.h2.b(i11, 511, a.f72132a.a());
        }
        this.f72123a = i12;
        this.f72124b = i13;
        this.f72125c = i14;
        this.f72126d = i15;
        this.f72127e = i16;
        this.f72128f = str;
        this.f72129g = str2;
        this.f72130h = str3;
        this.f72131i = j11;
    }

    @w00.o
    public static final /* synthetic */ void D(z zVar, i50.e eVar, h50.f fVar) {
        eVar.encodeIntElement(fVar, 0, zVar.f72123a);
        eVar.encodeIntElement(fVar, 1, zVar.f72124b);
        eVar.encodeIntElement(fVar, 2, zVar.f72125c);
        eVar.encodeIntElement(fVar, 3, zVar.f72126d);
        eVar.encodeIntElement(fVar, 4, zVar.f72127e);
        eVar.encodeNullableSerializableElement(fVar, 5, d3.f63348a, zVar.f72128f);
        eVar.encodeStringElement(fVar, 6, zVar.f72129g);
        eVar.encodeStringElement(fVar, 7, zVar.f72130h);
        eVar.encodeLongElement(fVar, 8, zVar.f72131i);
    }

    public static /* synthetic */ z k(z zVar, int i11, int i12, int i13, int i14, int i15, String str, String str2, String str3, long j11, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i11 = zVar.f72123a;
        }
        if ((i16 & 2) != 0) {
            i12 = zVar.f72124b;
        }
        if ((i16 & 4) != 0) {
            i13 = zVar.f72125c;
        }
        if ((i16 & 8) != 0) {
            i14 = zVar.f72126d;
        }
        if ((i16 & 16) != 0) {
            i15 = zVar.f72127e;
        }
        if ((i16 & 32) != 0) {
            str = zVar.f72128f;
        }
        if ((i16 & 64) != 0) {
            str2 = zVar.f72129g;
        }
        if ((i16 & 128) != 0) {
            str3 = zVar.f72130h;
        }
        if ((i16 & 256) != 0) {
            j11 = zVar.f72131i;
        }
        long j12 = j11;
        String str4 = str2;
        String str5 = str3;
        int i17 = i15;
        String str6 = str;
        return zVar.j(i11, i12, i13, i14, i17, str6, str4, str5, j12);
    }

    public final int B() {
        return this.f72125c;
    }

    public final int a() {
        return this.f72123a;
    }

    public final int b() {
        return this.f72124b;
    }

    public final int c() {
        return this.f72125c;
    }

    public final int d() {
        return this.f72126d;
    }

    public final int e() {
        return this.f72127e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f72123a == zVar.f72123a && this.f72124b == zVar.f72124b && this.f72125c == zVar.f72125c && this.f72126d == zVar.f72126d && this.f72127e == zVar.f72127e && kotlin.jvm.internal.g0.g(this.f72128f, zVar.f72128f) && kotlin.jvm.internal.g0.g(this.f72129g, zVar.f72129g) && kotlin.jvm.internal.g0.g(this.f72130h, zVar.f72130h) && this.f72131i == zVar.f72131i;
    }

    @m80.l
    public final String f() {
        return this.f72128f;
    }

    @m80.k
    public final String g() {
        return this.f72129g;
    }

    @m80.k
    public final String h() {
        return this.f72130h;
    }

    public int hashCode() {
        int hashCode = ((((((((Integer.hashCode(this.f72123a) * 31) + Integer.hashCode(this.f72124b)) * 31) + Integer.hashCode(this.f72125c)) * 31) + Integer.hashCode(this.f72126d)) * 31) + Integer.hashCode(this.f72127e)) * 31;
        String str = this.f72128f;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f72129g.hashCode()) * 31) + this.f72130h.hashCode()) * 31) + Long.hashCode(this.f72131i);
    }

    public final long i() {
        return this.f72131i;
    }

    @m80.k
    public final z j(int i11, int i12, int i13, int i14, int i15, @m80.l String str, @m80.k String backgroundColor, @m80.k String borderColor, long j11) {
        kotlin.jvm.internal.g0.p(backgroundColor, "backgroundColor");
        kotlin.jvm.internal.g0.p(borderColor, "borderColor");
        return new z(i11, i12, i13, i14, i15, str, backgroundColor, borderColor, j11);
    }

    @m80.k
    public final String l() {
        return this.f72129g;
    }

    @m80.k
    public final String n() {
        return this.f72130h;
    }

    public final int p() {
        return this.f72124b;
    }

    public final long r() {
        return this.f72131i;
    }

    @m80.l
    public final String t() {
        return this.f72128f;
    }

    @m80.k
    public String toString() {
        return "LavaQuestVo(status=" + this.f72123a + ", current=" + this.f72124b + ", total=" + this.f72125c + ", propsRemainCount=" + this.f72126d + ", revivalCoinCost=" + this.f72127e + ", iconImg=" + this.f72128f + ", backgroundColor=" + this.f72129g + ", borderColor=" + this.f72130h + ", endTime=" + this.f72131i + ')';
    }

    public final int v() {
        return this.f72126d;
    }

    public final int x() {
        return this.f72127e;
    }

    public final int z() {
        return this.f72123a;
    }

    public z(int i11, int i12, int i13, int i14, int i15, @m80.l String str, @m80.k String backgroundColor, @m80.k String borderColor, long j11) {
        kotlin.jvm.internal.g0.p(backgroundColor, "backgroundColor");
        kotlin.jvm.internal.g0.p(borderColor, "borderColor");
        this.f72123a = i11;
        this.f72124b = i12;
        this.f72125c = i13;
        this.f72126d = i14;
        this.f72127e = i15;
        this.f72128f = str;
        this.f72129g = backgroundColor;
        this.f72130h = borderColor;
        this.f72131i = j11;
    }

    @f50.z("status")
    public static /* synthetic */ void A() {
    }

    @f50.z(hb.d.f59153d)
    public static /* synthetic */ void C() {
    }

    @f50.z(TtmlNode.ATTR_TTS_BACKGROUND_COLOR)
    public static /* synthetic */ void m() {
    }

    @f50.z("borderColor")
    public static /* synthetic */ void o() {
    }

    @f50.z("current")
    public static /* synthetic */ void q() {
    }

    @f50.z("endTime")
    public static /* synthetic */ void s() {
    }

    @f50.z("iconImg")
    public static /* synthetic */ void u() {
    }

    @f50.z("propsRemainCount")
    public static /* synthetic */ void w() {
    }

    @f50.z("revivalCoinCost")
    public static /* synthetic */ void y() {
    }
}
