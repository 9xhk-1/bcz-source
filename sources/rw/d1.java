package rw;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@io.ktor.utils.io.c0
@kotlin.jvm.internal.u0({"SMAP\nHttpTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpTimeout.kt\nio/ktor/client/plugins/HttpTimeoutConfig\n+ 2 Attributes.kt\nio/ktor/util/AttributesKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,284:1\n18#2:285\n58#3,16:286\n*S KotlinDebug\n*F\n+ 1 HttpTimeout.kt\nio/ktor/client/plugins/HttpTimeoutConfig\n*L\n108#1:285\n108#1:286,16\n*E\n"})
/* loaded from: classes8.dex */
public final class d1 {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final a f84614d = new a(0 == true ? 1 : 0);

    /* renamed from: e, reason: collision with root package name */
    public static final long f84615e = Long.MAX_VALUE;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final xy.a<d1> f84616f;

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public Long f84617a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public Long f84618b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public Long f84619c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final xy.a<d1> a() {
            return d1.f84616f;
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        h10.r rVar = null;
        h10.d d11 = kotlin.jvm.internal.o0.d(d1.class);
        try {
            rVar = kotlin.jvm.internal.o0.B(d1.class);
        } catch (Throwable unused) {
        }
        f84616f = new xy.a<>("TimeoutConfiguration", new gz.a(d11, rVar));
    }

    public /* synthetic */ d1(Long l11, Long l12, Long l13, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? null : l11, (i11 & 2) != 0 ? null : l12, (i11 & 4) != 0 ? null : l13);
    }

    public final Long b(Long l11) {
        if (l11 == null || l11.longValue() > 0) {
            return l11;
        }
        throw new IllegalArgumentException("Only positive timeout values are allowed, for infinite timeout use HttpTimeout.INFINITE_TIMEOUT_MS");
    }

    @m80.l
    public final Long c() {
        return this.f84618b;
    }

    @m80.l
    public final Long d() {
        return this.f84617a;
    }

    @m80.l
    public final Long e() {
        return this.f84619c;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d1.class != obj.getClass()) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return kotlin.jvm.internal.g0.g(this.f84617a, d1Var.f84617a) && kotlin.jvm.internal.g0.g(this.f84618b, d1Var.f84618b) && kotlin.jvm.internal.g0.g(this.f84619c, d1Var.f84619c);
    }

    public final void f(@m80.l Long l11) {
        this.f84618b = b(l11);
    }

    public final void g(@m80.l Long l11) {
        this.f84617a = b(l11);
    }

    public final void h(@m80.l Long l11) {
        this.f84619c = b(l11);
    }

    public int hashCode() {
        Long l11 = this.f84617a;
        int hashCode = (l11 != null ? l11.hashCode() : 0) * 31;
        Long l12 = this.f84618b;
        int hashCode2 = (hashCode + (l12 != null ? l12.hashCode() : 0)) * 31;
        Long l13 = this.f84619c;
        return hashCode2 + (l13 != null ? l13.hashCode() : 0);
    }

    public d1(@m80.l Long l11, @m80.l Long l12, @m80.l Long l13) {
        this.f84617a = 0L;
        this.f84618b = 0L;
        this.f84619c = 0L;
        g(l11);
        f(l12);
        h(l13);
    }
}
