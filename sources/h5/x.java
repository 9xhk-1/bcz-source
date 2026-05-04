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
public final class x {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f58472a;

    /* renamed from: b, reason: collision with root package name */
    public final long f58473b;

    /* renamed from: c, reason: collision with root package name */
    public final long f58474c;

    /* renamed from: d, reason: collision with root package name */
    public final int f58475d;

    /* renamed from: e, reason: collision with root package name */
    public final long f58476e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<x> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f58477a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f58477a = aVar;
            l2 l2Var = new l2("com.baicizhan.app.biz.game.model.LimitedEnergyModel", aVar, 5);
            l2Var.q(c6.d.f8119k, false);
            l2Var.q("maxEnergy", false);
            l2Var.q("recoveryPeriod", false);
            l2Var.q("recoveryCount", true);
            l2Var.q("lastUpdateTime", false);
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
            l1 l1Var = l1.f63406a;
            return new f50.i[]{l1Var, l1Var, l1Var, j50.z0.f63517a, l1Var};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final x e(@m80.k i50.f decoder) {
            int i11;
            long j11;
            long j12;
            long j13;
            long j14;
            int i12;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            if (beginStructure.decodeSequentially()) {
                long decodeLongElement = beginStructure.decodeLongElement(fVar, 0);
                long decodeLongElement2 = beginStructure.decodeLongElement(fVar, 1);
                long decodeLongElement3 = beginStructure.decodeLongElement(fVar, 2);
                i11 = beginStructure.decodeIntElement(fVar, 3);
                j11 = beginStructure.decodeLongElement(fVar, 4);
                j12 = decodeLongElement3;
                j13 = decodeLongElement;
                j14 = decodeLongElement2;
                i12 = 31;
            } else {
                long j15 = 0;
                boolean z11 = true;
                i11 = 0;
                int i13 = 0;
                long j16 = 0;
                long j17 = 0;
                long j18 = 0;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else if (decodeElementIndex == 0) {
                        j17 = beginStructure.decodeLongElement(fVar, 0);
                        i13 |= 1;
                    } else if (decodeElementIndex == 1) {
                        j18 = beginStructure.decodeLongElement(fVar, 1);
                        i13 |= 2;
                    } else if (decodeElementIndex == 2) {
                        j16 = beginStructure.decodeLongElement(fVar, 2);
                        i13 |= 4;
                    } else if (decodeElementIndex == 3) {
                        i11 = beginStructure.decodeIntElement(fVar, 3);
                        i13 |= 8;
                    } else {
                        if (decodeElementIndex != 4) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        j15 = beginStructure.decodeLongElement(fVar, 4);
                        i13 |= 16;
                    }
                }
                j11 = j15;
                j12 = j16;
                j13 = j17;
                j14 = j18;
                i12 = i13;
            }
            int i14 = i11;
            beginStructure.endStructure(fVar);
            return new x(i12, j13, j14, j12, i14, j11, (x2) null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k x value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            x.r(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<x> serializer() {
            return a.f58477a;
        }

        public b() {
        }
    }

    public /* synthetic */ x(int i11, long j11, long j12, long j13, int i12, long j14, x2 x2Var) {
        if (23 != (i11 & 23)) {
            h2.b(i11, 23, a.f58477a.a());
        }
        this.f58472a = j11;
        this.f58473b = j12;
        this.f58474c = j13;
        if ((i11 & 8) == 0) {
            this.f58475d = 1;
        } else {
            this.f58475d = i12;
        }
        this.f58476e = j14;
    }

    public static /* synthetic */ x g(x xVar, long j11, long j12, long j13, int i11, long j14, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = xVar.f58472a;
        }
        long j15 = j11;
        if ((i12 & 2) != 0) {
            j12 = xVar.f58473b;
        }
        return xVar.f(j15, j12, (i12 & 4) != 0 ? xVar.f58474c : j13, (i12 & 8) != 0 ? xVar.f58475d : i11, (i12 & 16) != 0 ? xVar.f58476e : j14);
    }

    @w00.o
    public static final /* synthetic */ void r(x xVar, i50.e eVar, h50.f fVar) {
        eVar.encodeLongElement(fVar, 0, xVar.f58472a);
        eVar.encodeLongElement(fVar, 1, xVar.f58473b);
        eVar.encodeLongElement(fVar, 2, xVar.f58474c);
        if (eVar.shouldEncodeElementDefault(fVar, 3) || xVar.f58475d != 1) {
            eVar.encodeIntElement(fVar, 3, xVar.f58475d);
        }
        eVar.encodeLongElement(fVar, 4, xVar.f58476e);
    }

    public final long a() {
        return this.f58472a;
    }

    public final long b() {
        return this.f58473b;
    }

    public final long c() {
        return this.f58474c;
    }

    public final int d() {
        return this.f58475d;
    }

    public final long e() {
        return this.f58476e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f58472a == xVar.f58472a && this.f58473b == xVar.f58473b && this.f58474c == xVar.f58474c && this.f58475d == xVar.f58475d && this.f58476e == xVar.f58476e;
    }

    @m80.k
    public final x f(long j11, long j12, long j13, int i11, long j14) {
        return new x(j11, j12, j13, i11, j14);
    }

    public final long h() {
        return this.f58472a;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.f58472a) * 31) + Long.hashCode(this.f58473b)) * 31) + Long.hashCode(this.f58474c)) * 31) + Integer.hashCode(this.f58475d)) * 31) + Long.hashCode(this.f58476e);
    }

    public final long j() {
        return this.f58476e;
    }

    public final long l() {
        return this.f58473b;
    }

    public final int n() {
        return this.f58475d;
    }

    public final long p() {
        return this.f58474c;
    }

    @m80.k
    public String toString() {
        return "LimitedEnergyModel(energy=" + this.f58472a + ", maxEnergy=" + this.f58473b + ", recoveryPeriod=" + this.f58474c + ", recoveryCount=" + this.f58475d + ", lastUpdateTime=" + this.f58476e + ')';
    }

    public x(long j11, long j12, long j13, int i11, long j14) {
        this.f58472a = j11;
        this.f58473b = j12;
        this.f58474c = j13;
        this.f58475d = i11;
        this.f58476e = j14;
    }

    public /* synthetic */ x(long j11, long j12, long j13, int i11, long j14, int i12, kotlin.jvm.internal.v vVar) {
        this(j11, j12, j13, (i12 & 8) != 0 ? 1 : i11, j14);
    }

    @f50.z(c6.d.f8119k)
    public static /* synthetic */ void i() {
    }

    @f50.z("lastUpdateTime")
    public static /* synthetic */ void k() {
    }

    @f50.z("maxEnergy")
    public static /* synthetic */ void m() {
    }

    @f50.z("recoveryCount")
    public static /* synthetic */ void o() {
    }

    @f50.z("recoveryPeriod")
    public static /* synthetic */ void q() {
    }
}
