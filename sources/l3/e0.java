package l3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f69308a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final r f69309b;

    /* renamed from: c, reason: collision with root package name */
    public final long f69310c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final n f69311d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final b0 f69312e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f69313f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final g2 f69314g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements g2 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f69315a = new a();

        @Override // l3.g2
        public final Object a(j00.c<? super yz.g2> cVar) {
            return yz.g2.f100423a;
        }
    }

    public e0(@m80.k String avatarUrl, @m80.k r membershipType, long j11, @m80.k n energyState, @m80.k b0 streak, boolean z11, @m80.k g2 onAvatarClick) {
        kotlin.jvm.internal.g0.p(avatarUrl, "avatarUrl");
        kotlin.jvm.internal.g0.p(membershipType, "membershipType");
        kotlin.jvm.internal.g0.p(energyState, "energyState");
        kotlin.jvm.internal.g0.p(streak, "streak");
        kotlin.jvm.internal.g0.p(onAvatarClick, "onAvatarClick");
        this.f69308a = avatarUrl;
        this.f69309b = membershipType;
        this.f69310c = j11;
        this.f69311d = energyState;
        this.f69312e = streak;
        this.f69313f = z11;
        this.f69314g = onAvatarClick;
    }

    public static /* synthetic */ e0 i(e0 e0Var, String str, r rVar, long j11, n nVar, b0 b0Var, boolean z11, g2 g2Var, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = e0Var.f69308a;
        }
        if ((i11 & 2) != 0) {
            rVar = e0Var.f69309b;
        }
        if ((i11 & 4) != 0) {
            j11 = e0Var.f69310c;
        }
        if ((i11 & 8) != 0) {
            nVar = e0Var.f69311d;
        }
        if ((i11 & 16) != 0) {
            b0Var = e0Var.f69312e;
        }
        if ((i11 & 32) != 0) {
            z11 = e0Var.f69313f;
        }
        if ((i11 & 64) != 0) {
            g2Var = e0Var.f69314g;
        }
        long j12 = j11;
        return e0Var.h(str, rVar, j12, nVar, b0Var, z11, g2Var);
    }

    @m80.k
    public final String a() {
        return this.f69308a;
    }

    @m80.k
    public final r b() {
        return this.f69309b;
    }

    public final long c() {
        return this.f69310c;
    }

    @m80.k
    public final n d() {
        return this.f69311d;
    }

    @m80.k
    public final b0 e() {
        return this.f69312e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return kotlin.jvm.internal.g0.g(this.f69308a, e0Var.f69308a) && kotlin.jvm.internal.g0.g(this.f69309b, e0Var.f69309b) && this.f69310c == e0Var.f69310c && kotlin.jvm.internal.g0.g(this.f69311d, e0Var.f69311d) && kotlin.jvm.internal.g0.g(this.f69312e, e0Var.f69312e) && this.f69313f == e0Var.f69313f && kotlin.jvm.internal.g0.g(this.f69314g, e0Var.f69314g);
    }

    public final boolean f() {
        return this.f69313f;
    }

    @m80.k
    public final g2 g() {
        return this.f69314g;
    }

    @m80.k
    public final e0 h(@m80.k String avatarUrl, @m80.k r membershipType, long j11, @m80.k n energyState, @m80.k b0 streak, boolean z11, @m80.k g2 onAvatarClick) {
        kotlin.jvm.internal.g0.p(avatarUrl, "avatarUrl");
        kotlin.jvm.internal.g0.p(membershipType, "membershipType");
        kotlin.jvm.internal.g0.p(energyState, "energyState");
        kotlin.jvm.internal.g0.p(streak, "streak");
        kotlin.jvm.internal.g0.p(onAvatarClick, "onAvatarClick");
        return new e0(avatarUrl, membershipType, j11, energyState, streak, z11, onAvatarClick);
    }

    public int hashCode() {
        return (((((((((((this.f69308a.hashCode() * 31) + this.f69309b.hashCode()) * 31) + Long.hashCode(this.f69310c)) * 31) + this.f69311d.hashCode()) * 31) + this.f69312e.hashCode()) * 31) + Boolean.hashCode(this.f69313f)) * 31) + this.f69314g.hashCode();
    }

    public final boolean j() {
        return this.f69313f;
    }

    @m80.k
    public final String k() {
        return this.f69308a;
    }

    public final long l() {
        return this.f69310c;
    }

    @m80.k
    public final n m() {
        return this.f69311d;
    }

    @m80.k
    public final r n() {
        return this.f69309b;
    }

    @m80.k
    public final g2 o() {
        return this.f69314g;
    }

    @m80.k
    public final b0 p() {
        return this.f69312e;
    }

    @m80.k
    public String toString() {
        return "TopContent(avatarUrl=" + this.f69308a + ", membershipType=" + this.f69309b + ", coin=" + this.f69310c + ", energyState=" + this.f69311d + ", streak=" + this.f69312e + ", avatarBadge=" + this.f69313f + ", onAvatarClick=" + this.f69314g + ')';
    }

    public /* synthetic */ e0(String str, r rVar, long j11, n nVar, b0 b0Var, boolean z11, g2 g2Var, int i11, kotlin.jvm.internal.v vVar) {
        this(str, rVar, j11, nVar, b0Var, (i11 & 32) != 0 ? false : z11, (i11 & 64) != 0 ? a.f69315a : g2Var);
    }
}
