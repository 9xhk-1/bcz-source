package h5;

import j50.h2;
import j50.l1;
import j50.l2;
import j50.p0;
import j50.x2;
import kotlin.DeprecationLevel;
import kotlinx.serialization.UnknownFieldException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class y {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f58481a;

    /* renamed from: b, reason: collision with root package name */
    public final long f58482b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<y> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f58483a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f58483a = aVar;
            l2 l2Var = new l2("com.baicizhan.app.biz.game.model.MembershipModel", aVar, 2);
            l2Var.q("vipLevel", false);
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
            return new f50.i[]{j50.z0.f63517a, l1.f63406a};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final y e(@m80.k i50.f decoder) {
            int i11;
            long j11;
            int i12;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            if (beginStructure.decodeSequentially()) {
                i11 = beginStructure.decodeIntElement(fVar, 0);
                j11 = beginStructure.decodeLongElement(fVar, 1);
                i12 = 3;
            } else {
                long j12 = 0;
                boolean z11 = true;
                i11 = 0;
                int i13 = 0;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else if (decodeElementIndex == 0) {
                        i11 = beginStructure.decodeIntElement(fVar, 0);
                        i13 |= 1;
                    } else {
                        if (decodeElementIndex != 1) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        j12 = beginStructure.decodeLongElement(fVar, 1);
                        i13 |= 2;
                    }
                }
                j11 = j12;
                i12 = i13;
            }
            int i14 = i11;
            beginStructure.endStructure(fVar);
            return new y(i12, i14, j11, null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k y value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            y.i(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<y> serializer() {
            return a.f58483a;
        }

        public b() {
        }
    }

    public /* synthetic */ y(int i11, int i12, long j11, x2 x2Var) {
        if (3 != (i11 & 3)) {
            h2.b(i11, 3, a.f58483a.a());
        }
        this.f58481a = i12;
        this.f58482b = j11;
    }

    public static /* synthetic */ y d(y yVar, int i11, long j11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = yVar.f58481a;
        }
        if ((i12 & 2) != 0) {
            j11 = yVar.f58482b;
        }
        return yVar.c(i11, j11);
    }

    @w00.o
    public static final /* synthetic */ void i(y yVar, i50.e eVar, h50.f fVar) {
        eVar.encodeIntElement(fVar, 0, yVar.f58481a);
        eVar.encodeLongElement(fVar, 1, yVar.f58482b);
    }

    public final int a() {
        return this.f58481a;
    }

    public final long b() {
        return this.f58482b;
    }

    @m80.k
    public final y c(int i11, long j11) {
        return new y(i11, j11);
    }

    public final long e() {
        return this.f58482b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f58481a == yVar.f58481a && this.f58482b == yVar.f58482b;
    }

    public final int g() {
        return this.f58481a;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f58481a) * 31) + Long.hashCode(this.f58482b);
    }

    @m80.k
    public String toString() {
        return "MembershipModel(vipLevel=" + this.f58481a + ", membershipExpirationTime=" + this.f58482b + ')';
    }

    public y(int i11, long j11) {
        this.f58481a = i11;
        this.f58482b = j11;
    }

    @f50.z("membershipExpirationTime")
    public static /* synthetic */ void f() {
    }

    @f50.z("vipLevel")
    public static /* synthetic */ void h() {
    }
}
