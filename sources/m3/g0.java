package m3;

import j50.p0;
import j50.x2;
import kotlin.DeprecationLevel;
import kotlinx.serialization.UnknownFieldException;
import m3.h0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class g0 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f71915a;

    /* renamed from: b, reason: collision with root package name */
    public final long f71916b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final h0 f71917c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<g0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f71918a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f71918a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.game.MemberPopupSaleInfoVo", aVar, 3);
            l2Var.q("memberSaleStage", false);
            l2Var.q("stageEndTime", false);
            l2Var.q("memberSaleInfo", true);
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
            return new f50.i[]{j50.z0.f63517a, j50.l1.f63406a, g50.a.v(h0.a.f71936a)};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final g0 e(@m80.k i50.f decoder) {
            int i11;
            int i12;
            long j11;
            h0 h0Var;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            if (beginStructure.decodeSequentially()) {
                i11 = beginStructure.decodeIntElement(fVar, 0);
                long decodeLongElement = beginStructure.decodeLongElement(fVar, 1);
                i12 = 7;
                h0Var = (h0) beginStructure.decodeNullableSerializableElement(fVar, 2, h0.a.f71936a, null);
                j11 = decodeLongElement;
            } else {
                long j12 = 0;
                boolean z11 = true;
                i11 = 0;
                h0 h0Var2 = null;
                i12 = 0;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else if (decodeElementIndex == 0) {
                        i11 = beginStructure.decodeIntElement(fVar, 0);
                        i12 |= 1;
                    } else if (decodeElementIndex == 1) {
                        j12 = beginStructure.decodeLongElement(fVar, 1);
                        i12 |= 2;
                    } else {
                        if (decodeElementIndex != 2) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        h0Var2 = (h0) beginStructure.decodeNullableSerializableElement(fVar, 2, h0.a.f71936a, h0Var2);
                        i12 |= 4;
                    }
                }
                j11 = j12;
                h0Var = h0Var2;
            }
            int i13 = i11;
            int i14 = i12;
            beginStructure.endStructure(fVar);
            return new g0(i14, i13, j11, h0Var, (x2) null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k g0 value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            g0.l(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<g0> serializer() {
            return a.f71918a;
        }

        public b() {
        }
    }

    public /* synthetic */ g0(int i11, int i12, long j11, h0 h0Var, x2 x2Var) {
        if (3 != (i11 & 3)) {
            j50.h2.b(i11, 3, a.f71918a.a());
        }
        this.f71915a = i12;
        this.f71916b = j11;
        if ((i11 & 4) == 0) {
            this.f71917c = null;
        } else {
            this.f71917c = h0Var;
        }
    }

    public static /* synthetic */ g0 e(g0 g0Var, int i11, long j11, h0 h0Var, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = g0Var.f71915a;
        }
        if ((i12 & 2) != 0) {
            j11 = g0Var.f71916b;
        }
        if ((i12 & 4) != 0) {
            h0Var = g0Var.f71917c;
        }
        return g0Var.d(i11, j11, h0Var);
    }

    @w00.o
    public static final /* synthetic */ void l(g0 g0Var, i50.e eVar, h50.f fVar) {
        eVar.encodeIntElement(fVar, 0, g0Var.f71915a);
        eVar.encodeLongElement(fVar, 1, g0Var.f71916b);
        if (!eVar.shouldEncodeElementDefault(fVar, 2) && g0Var.f71917c == null) {
            return;
        }
        eVar.encodeNullableSerializableElement(fVar, 2, h0.a.f71936a, g0Var.f71917c);
    }

    public final int a() {
        return this.f71915a;
    }

    public final long b() {
        return this.f71916b;
    }

    @m80.l
    public final h0 c() {
        return this.f71917c;
    }

    @m80.k
    public final g0 d(int i11, long j11, @m80.l h0 h0Var) {
        return new g0(i11, j11, h0Var);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f71915a == g0Var.f71915a && this.f71916b == g0Var.f71916b && kotlin.jvm.internal.g0.g(this.f71917c, g0Var.f71917c);
    }

    @m80.l
    public final h0 f() {
        return this.f71917c;
    }

    public final int h() {
        return this.f71915a;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f71915a) * 31) + Long.hashCode(this.f71916b)) * 31;
        h0 h0Var = this.f71917c;
        return hashCode + (h0Var == null ? 0 : h0Var.hashCode());
    }

    public final long j() {
        return this.f71916b;
    }

    @m80.k
    public String toString() {
        return "MemberPopupSaleInfoVo(memberSaleStage=" + this.f71915a + ", stageEndTime=" + this.f71916b + ", memberSaleInfo=" + this.f71917c + ')';
    }

    public g0(int i11, long j11, @m80.l h0 h0Var) {
        this.f71915a = i11;
        this.f71916b = j11;
        this.f71917c = h0Var;
    }

    public /* synthetic */ g0(int i11, long j11, h0 h0Var, int i12, kotlin.jvm.internal.v vVar) {
        this(i11, j11, (i12 & 4) != 0 ? null : h0Var);
    }

    @f50.z("memberSaleInfo")
    public static /* synthetic */ void g() {
    }

    @f50.z("memberSaleStage")
    public static /* synthetic */ void i() {
    }

    @f50.z("stageEndTime")
    public static /* synthetic */ void k() {
    }
}
