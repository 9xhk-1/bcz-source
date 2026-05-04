package m3;

import j50.p0;
import j50.x2;
import kotlin.DeprecationLevel;
import kotlinx.serialization.UnknownFieldException;
import m3.h0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class o0 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f72018a;

    /* renamed from: b, reason: collision with root package name */
    public final int f72019b;

    /* renamed from: c, reason: collision with root package name */
    public final int f72020c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final h0 f72021d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<o0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f72022a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f72022a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.game.RechargeInfoVo", aVar, 4);
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
        public final o0 e(@m80.k i50.f decoder) {
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
            return new o0(i14, i18, i13, i12, h0Var, (x2) null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k o0 value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            o0.o(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<o0> serializer() {
            return a.f72022a;
        }

        public b() {
        }
    }

    public /* synthetic */ o0(int i11, int i12, int i13, int i14, h0 h0Var, x2 x2Var) {
        if (7 != (i11 & 7)) {
            j50.h2.b(i11, 7, a.f72022a.a());
        }
        this.f72018a = i12;
        this.f72019b = i13;
        this.f72020c = i14;
        if ((i11 & 8) == 0) {
            this.f72021d = null;
        } else {
            this.f72021d = h0Var;
        }
    }

    public static /* synthetic */ o0 f(o0 o0Var, int i11, int i12, int i13, h0 h0Var, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = o0Var.f72018a;
        }
        if ((i14 & 2) != 0) {
            i12 = o0Var.f72019b;
        }
        if ((i14 & 4) != 0) {
            i13 = o0Var.f72020c;
        }
        if ((i14 & 8) != 0) {
            h0Var = o0Var.f72021d;
        }
        return o0Var.e(i11, i12, i13, h0Var);
    }

    @w00.o
    public static final /* synthetic */ void o(o0 o0Var, i50.e eVar, h50.f fVar) {
        eVar.encodeIntElement(fVar, 0, o0Var.f72018a);
        eVar.encodeIntElement(fVar, 1, o0Var.f72019b);
        eVar.encodeIntElement(fVar, 2, o0Var.f72020c);
        if (!eVar.shouldEncodeElementDefault(fVar, 3) && o0Var.f72021d == null) {
            return;
        }
        eVar.encodeNullableSerializableElement(fVar, 3, h0.a.f71936a, o0Var.f72021d);
    }

    public final int a() {
        return this.f72018a;
    }

    public final int b() {
        return this.f72019b;
    }

    public final int c() {
        return this.f72020c;
    }

    @m80.l
    public final h0 d() {
        return this.f72021d;
    }

    @m80.k
    public final o0 e(int i11, int i12, int i13, @m80.l h0 h0Var) {
        return new o0(i11, i12, i13, h0Var);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return this.f72018a == o0Var.f72018a && this.f72019b == o0Var.f72019b && this.f72020c == o0Var.f72020c && kotlin.jvm.internal.g0.g(this.f72021d, o0Var.f72021d);
    }

    public final int g() {
        return this.f72018a;
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.f72018a) * 31) + Integer.hashCode(this.f72019b)) * 31) + Integer.hashCode(this.f72020c)) * 31;
        h0 h0Var = this.f72021d;
        return hashCode + (h0Var == null ? 0 : h0Var.hashCode());
    }

    public final int i() {
        return this.f72020c;
    }

    public final int k() {
        return this.f72019b;
    }

    @m80.l
    public final h0 m() {
        return this.f72021d;
    }

    @m80.k
    public String toString() {
        return "RechargeInfoVo(coin=" + this.f72018a + ", freeRechargeRemaining=" + this.f72019b + ", cost=" + this.f72020c + ", memberSaleInfo=" + this.f72021d + ')';
    }

    public o0(int i11, int i12, int i13, @m80.l h0 h0Var) {
        this.f72018a = i11;
        this.f72019b = i12;
        this.f72020c = i13;
        this.f72021d = h0Var;
    }

    public /* synthetic */ o0(int i11, int i12, int i13, h0 h0Var, int i14, kotlin.jvm.internal.v vVar) {
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
