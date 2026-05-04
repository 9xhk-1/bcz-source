package m3;

import j50.p0;
import j50.x2;
import kotlin.DeprecationLevel;
import kotlinx.serialization.UnknownFieldException;
import m3.h0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class n0 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f72003a;

    /* renamed from: b, reason: collision with root package name */
    public final int f72004b;

    /* renamed from: c, reason: collision with root package name */
    public final int f72005c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final h0 f72006d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<n0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f72007a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f72007a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.game.RechargeInfoModel", aVar, 4);
            l2Var.q(c6.d.f8117i, false);
            l2Var.q("freeRechargeRemaining", false);
            l2Var.q("cost", false);
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
            f50.i<?> v11 = g50.a.v(h0.a.f71936a);
            j50.z0 z0Var = j50.z0.f63517a;
            return new f50.i[]{z0Var, z0Var, z0Var, v11};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final n0 e(@m80.k i50.f decoder) {
            int i11;
            int i12;
            int i13;
            int i14;
            h0 h0Var;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            if (beginStructure.decodeSequentially()) {
                i11 = beginStructure.decodeIntElement(fVar, 0);
                int decodeIntElement = beginStructure.decodeIntElement(fVar, 1);
                int decodeIntElement2 = beginStructure.decodeIntElement(fVar, 2);
                h0Var = (h0) beginStructure.decodeNullableSerializableElement(fVar, 3, h0.a.f71936a, null);
                i12 = decodeIntElement2;
                i13 = decodeIntElement;
                i14 = 15;
            } else {
                boolean z11 = true;
                i11 = 0;
                int i15 = 0;
                int i16 = 0;
                h0 h0Var2 = null;
                int i17 = 0;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else if (decodeElementIndex == 0) {
                        i11 = beginStructure.decodeIntElement(fVar, 0);
                        i16 |= 1;
                    } else if (decodeElementIndex == 1) {
                        i15 = beginStructure.decodeIntElement(fVar, 1);
                        i16 |= 2;
                    } else if (decodeElementIndex == 2) {
                        i17 = beginStructure.decodeIntElement(fVar, 2);
                        i16 |= 4;
                    } else {
                        if (decodeElementIndex != 3) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        h0Var2 = (h0) beginStructure.decodeNullableSerializableElement(fVar, 3, h0.a.f71936a, h0Var2);
                        i16 |= 8;
                    }
                }
                i12 = i17;
                i13 = i15;
                i14 = i16;
                h0Var = h0Var2;
            }
            int i18 = i11;
            beginStructure.endStructure(fVar);
            return new n0(i14, i18, i13, i12, h0Var, (x2) null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k n0 value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            n0.o(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<n0> serializer() {
            return a.f72007a;
        }

        public b() {
        }
    }

    public /* synthetic */ n0(int i11, int i12, int i13, int i14, h0 h0Var, x2 x2Var) {
        if (7 != (i11 & 7)) {
            j50.h2.b(i11, 7, a.f72007a.a());
        }
        this.f72003a = i12;
        this.f72004b = i13;
        this.f72005c = i14;
        if ((i11 & 8) == 0) {
            this.f72006d = null;
        } else {
            this.f72006d = h0Var;
        }
    }

    public static /* synthetic */ n0 f(n0 n0Var, int i11, int i12, int i13, h0 h0Var, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = n0Var.f72003a;
        }
        if ((i14 & 2) != 0) {
            i12 = n0Var.f72004b;
        }
        if ((i14 & 4) != 0) {
            i13 = n0Var.f72005c;
        }
        if ((i14 & 8) != 0) {
            h0Var = n0Var.f72006d;
        }
        return n0Var.e(i11, i12, i13, h0Var);
    }

    @w00.o
    public static final /* synthetic */ void o(n0 n0Var, i50.e eVar, h50.f fVar) {
        eVar.encodeIntElement(fVar, 0, n0Var.f72003a);
        eVar.encodeIntElement(fVar, 1, n0Var.f72004b);
        eVar.encodeIntElement(fVar, 2, n0Var.f72005c);
        if (!eVar.shouldEncodeElementDefault(fVar, 3) && n0Var.f72006d == null) {
            return;
        }
        eVar.encodeNullableSerializableElement(fVar, 3, h0.a.f71936a, n0Var.f72006d);
    }

    public final int a() {
        return this.f72003a;
    }

    public final int b() {
        return this.f72004b;
    }

    public final int c() {
        return this.f72005c;
    }

    @m80.l
    public final h0 d() {
        return this.f72006d;
    }

    @m80.k
    public final n0 e(int i11, int i12, int i13, @m80.l h0 h0Var) {
        return new n0(i11, i12, i13, h0Var);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.f72003a == n0Var.f72003a && this.f72004b == n0Var.f72004b && this.f72005c == n0Var.f72005c && kotlin.jvm.internal.g0.g(this.f72006d, n0Var.f72006d);
    }

    public final int g() {
        return this.f72003a;
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.f72003a) * 31) + Integer.hashCode(this.f72004b)) * 31) + Integer.hashCode(this.f72005c)) * 31;
        h0 h0Var = this.f72006d;
        return hashCode + (h0Var == null ? 0 : h0Var.hashCode());
    }

    public final int i() {
        return this.f72005c;
    }

    public final int k() {
        return this.f72004b;
    }

    @m80.l
    public final h0 m() {
        return this.f72006d;
    }

    @m80.k
    public String toString() {
        return "RechargeInfoModel(coin=" + this.f72003a + ", freeRechargeRemaining=" + this.f72004b + ", cost=" + this.f72005c + ", memberSaleInfo=" + this.f72006d + ')';
    }

    public n0(int i11, int i12, int i13, @m80.l h0 h0Var) {
        this.f72003a = i11;
        this.f72004b = i12;
        this.f72005c = i13;
        this.f72006d = h0Var;
    }

    public /* synthetic */ n0(int i11, int i12, int i13, h0 h0Var, int i14, kotlin.jvm.internal.v vVar) {
        this(i11, i12, i13, (i14 & 8) != 0 ? null : h0Var);
    }

    @f50.z(c6.d.f8117i)
    public static /* synthetic */ void h() {
    }

    @f50.z("cost")
    public static /* synthetic */ void j() {
    }

    @f50.z("freeRechargeRemaining")
    public static /* synthetic */ void l() {
    }

    @f50.z("memberSaleInfo")
    public static /* synthetic */ void n() {
    }
}
