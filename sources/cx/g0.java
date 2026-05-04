package cx;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class g0 extends io.ktor.util.pipeline.c<Object, y> {

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final a f46880h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final io.ktor.util.pipeline.h f46881i = new io.ktor.util.pipeline.h("Before");

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final io.ktor.util.pipeline.h f46882j = new io.ktor.util.pipeline.h("State");

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public static final io.ktor.util.pipeline.h f46883k = new io.ktor.util.pipeline.h("Monitoring");

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public static final io.ktor.util.pipeline.h f46884l = new io.ktor.util.pipeline.h(kk.k.f66726i);

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public static final io.ktor.util.pipeline.h f46885m = new io.ktor.util.pipeline.h("Receive");

    /* renamed from: g, reason: collision with root package name */
    public final boolean f46886g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final io.ktor.util.pipeline.h a() {
            return g0.f46881i;
        }

        @m80.k
        public final io.ktor.util.pipeline.h b() {
            return g0.f46884l;
        }

        @m80.k
        public final io.ktor.util.pipeline.h c() {
            return g0.f46883k;
        }

        @m80.k
        public final io.ktor.util.pipeline.h d() {
            return g0.f46885m;
        }

        @m80.k
        public final io.ktor.util.pipeline.h e() {
            return g0.f46882j;
        }

        public a() {
        }
    }

    public g0() {
        this(false, 1, null);
    }

    @Override // io.ktor.util.pipeline.c
    public boolean u() {
        return this.f46886g;
    }

    public /* synthetic */ g0(boolean z11, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? true : z11);
    }

    public g0(boolean z11) {
        super(f46881i, f46882j, f46883k, f46884l, f46885m);
        this.f46886g = z11;
    }
}
