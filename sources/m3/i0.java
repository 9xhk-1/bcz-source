package m3;

import j50.p0;
import j50.x2;
import kotlin.DeprecationLevel;
import kotlinx.serialization.UnknownFieldException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class i0 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f71942a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f71943b;

    /* renamed from: c, reason: collision with root package name */
    public final long f71944c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<i0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f71945a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f71945a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.game.MembershipInfoVo", aVar, 3);
            l2Var.q("membershipType", false);
            l2Var.q("isEnergySufficient", false);
            l2Var.q("membershipExpirationTime", false);
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
            return new f50.i[]{j50.z0.f63517a, j50.i.f63378a, j50.l1.f63406a};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final i0 e(@m80.k i50.f decoder) {
            int i11;
            int i12;
            boolean z11;
            long j11;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            if (beginStructure.decodeSequentially()) {
                i11 = beginStructure.decodeIntElement(fVar, 0);
                i12 = 7;
                z11 = beginStructure.decodeBooleanElement(fVar, 1);
                j11 = beginStructure.decodeLongElement(fVar, 2);
            } else {
                boolean z12 = true;
                i11 = 0;
                long j12 = 0;
                int i13 = 0;
                boolean z13 = false;
                while (z12) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z12 = false;
                    } else if (decodeElementIndex == 0) {
                        i11 = beginStructure.decodeIntElement(fVar, 0);
                        i13 |= 1;
                    } else if (decodeElementIndex == 1) {
                        z13 = beginStructure.decodeBooleanElement(fVar, 1);
                        i13 |= 2;
                    } else {
                        if (decodeElementIndex != 2) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        j12 = beginStructure.decodeLongElement(fVar, 2);
                        i13 |= 4;
                    }
                }
                i12 = i13;
                z11 = z13;
                j11 = j12;
            }
            int i14 = i11;
            beginStructure.endStructure(fVar);
            return new i0(i12, i14, z11, j11, null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k i0 value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            i0.l(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<i0> serializer() {
            return a.f71945a;
        }

        public b() {
        }
    }

    public /* synthetic */ i0(int i11, int i12, boolean z11, long j11, x2 x2Var) {
        if (7 != (i11 & 7)) {
            j50.h2.b(i11, 7, a.f71945a.a());
        }
        this.f71942a = i12;
        this.f71943b = z11;
        this.f71944c = j11;
    }

    public static /* synthetic */ i0 e(i0 i0Var, int i11, boolean z11, long j11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = i0Var.f71942a;
        }
        if ((i12 & 2) != 0) {
            z11 = i0Var.f71943b;
        }
        if ((i12 & 4) != 0) {
            j11 = i0Var.f71944c;
        }
        return i0Var.d(i11, z11, j11);
    }

    @w00.o
    public static final /* synthetic */ void l(i0 i0Var, i50.e eVar, h50.f fVar) {
        eVar.encodeIntElement(fVar, 0, i0Var.f71942a);
        eVar.encodeBooleanElement(fVar, 1, i0Var.f71943b);
        eVar.encodeLongElement(fVar, 2, i0Var.f71944c);
    }

    public final int a() {
        return this.f71942a;
    }

    public final boolean b() {
        return this.f71943b;
    }

    public final long c() {
        return this.f71944c;
    }

    @m80.k
    public final i0 d(int i11, boolean z11, long j11) {
        return new i0(i11, z11, j11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.f71942a == i0Var.f71942a && this.f71943b == i0Var.f71943b && this.f71944c == i0Var.f71944c;
    }

    public final long f() {
        return this.f71944c;
    }

    public final int h() {
        return this.f71942a;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f71942a) * 31) + Boolean.hashCode(this.f71943b)) * 31) + Long.hashCode(this.f71944c);
    }

    public final boolean j() {
        return this.f71943b;
    }

    @m80.k
    public String toString() {
        return "MembershipInfoVo(membershipType=" + this.f71942a + ", isEnergySufficient=" + this.f71943b + ", membershipExpirationTime=" + this.f71944c + ')';
    }

    public i0(int i11, boolean z11, long j11) {
        this.f71942a = i11;
        this.f71943b = z11;
        this.f71944c = j11;
    }

    @f50.z("membershipExpirationTime")
    public static /* synthetic */ void g() {
    }

    @f50.z("membershipType")
    public static /* synthetic */ void i() {
    }

    @f50.z("isEnergySufficient")
    public static /* synthetic */ void k() {
    }
}
