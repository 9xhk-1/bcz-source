package l3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class n {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends n {

        /* renamed from: a, reason: collision with root package name */
        public final int f69582a;

        /* renamed from: b, reason: collision with root package name */
        public final int f69583b;

        /* renamed from: c, reason: collision with root package name */
        public final long f69584c;

        /* renamed from: d, reason: collision with root package name */
        public final int f69585d;

        /* renamed from: e, reason: collision with root package name */
        public final int f69586e;

        public a(int i11, int i12, long j11, int i13, int i14) {
            super(null);
            this.f69582a = i11;
            this.f69583b = i12;
            this.f69584c = j11;
            this.f69585d = i13;
            this.f69586e = i14;
        }

        public static /* synthetic */ a g(a aVar, int i11, int i12, long j11, int i13, int i14, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                i11 = aVar.f69582a;
            }
            if ((i15 & 2) != 0) {
                i12 = aVar.f69583b;
            }
            if ((i15 & 4) != 0) {
                j11 = aVar.f69584c;
            }
            if ((i15 & 8) != 0) {
                i13 = aVar.f69585d;
            }
            if ((i15 & 16) != 0) {
                i14 = aVar.f69586e;
            }
            long j12 = j11;
            return aVar.f(i11, i12, j12, i13, i14);
        }

        public final int a() {
            return this.f69582a;
        }

        public final int b() {
            return this.f69583b;
        }

        public final long c() {
            return this.f69584c;
        }

        public final int d() {
            return this.f69585d;
        }

        public final int e() {
            return this.f69586e;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f69582a == aVar.f69582a && this.f69583b == aVar.f69583b && this.f69584c == aVar.f69584c && this.f69585d == aVar.f69585d && this.f69586e == aVar.f69586e;
        }

        @m80.k
        public final a f(int i11, int i12, long j11, int i13, int i14) {
            return new a(i11, i12, j11, i13, i14);
        }

        public final int h() {
            return this.f69582a;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.f69582a) * 31) + Integer.hashCode(this.f69583b)) * 31) + Long.hashCode(this.f69584c)) * 31) + Integer.hashCode(this.f69585d)) * 31) + Integer.hashCode(this.f69586e);
        }

        public final int i() {
            return this.f69583b;
        }

        public final long j() {
            return this.f69584c;
        }

        public final int k() {
            return this.f69585d;
        }

        public final int l() {
            return this.f69586e;
        }

        @m80.k
        public String toString() {
            return "Limited(energy=" + this.f69582a + ", energyMax=" + this.f69583b + ", nextRecoveryTime=" + this.f69584c + ", recoverCount=" + this.f69585d + ", recoverPeriod=" + this.f69586e + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends n {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final h2 f69587a;

        /* renamed from: b, reason: collision with root package name */
        public final long f69588b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k h2 unlimitedType, long j11) {
            super(null);
            kotlin.jvm.internal.g0.p(unlimitedType, "unlimitedType");
            this.f69587a = unlimitedType;
            this.f69588b = j11;
        }

        public static /* synthetic */ b d(b bVar, h2 h2Var, long j11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                h2Var = bVar.f69587a;
            }
            if ((i11 & 2) != 0) {
                j11 = bVar.f69588b;
            }
            return bVar.c(h2Var, j11);
        }

        @m80.k
        public final h2 a() {
            return this.f69587a;
        }

        public final long b() {
            return this.f69588b;
        }

        @m80.k
        public final b c(@m80.k h2 unlimitedType, long j11) {
            kotlin.jvm.internal.g0.p(unlimitedType, "unlimitedType");
            return new b(unlimitedType, j11);
        }

        public final long e() {
            return this.f69588b;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.g0.g(this.f69587a, bVar.f69587a) && this.f69588b == bVar.f69588b;
        }

        @m80.k
        public final h2 f() {
            return this.f69587a;
        }

        public int hashCode() {
            return (this.f69587a.hashCode() * 31) + Long.hashCode(this.f69588b);
        }

        @m80.k
        public String toString() {
            return "Unlimited(unlimitedType=" + this.f69587a + ", unlimitedEnergyEndTime=" + this.f69588b + ')';
        }
    }

    public /* synthetic */ n(kotlin.jvm.internal.v vVar) {
        this();
    }

    public n() {
    }
}
