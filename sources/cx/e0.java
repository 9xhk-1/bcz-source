package cx;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e0 extends io.ktor.util.pipeline.c<Object, y> {

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final a f46866h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final io.ktor.util.pipeline.h f46867i = new io.ktor.util.pipeline.h("Before");

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final io.ktor.util.pipeline.h f46868j = new io.ktor.util.pipeline.h("State");

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public static final io.ktor.util.pipeline.h f46869k = new io.ktor.util.pipeline.h("Transform");

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public static final io.ktor.util.pipeline.h f46870l = new io.ktor.util.pipeline.h("Render");

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public static final io.ktor.util.pipeline.h f46871m = new io.ktor.util.pipeline.h("Send");

    /* renamed from: g, reason: collision with root package name */
    public final boolean f46872g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final io.ktor.util.pipeline.h a() {
            return e0.f46867i;
        }

        @m80.k
        public final io.ktor.util.pipeline.h b() {
            return e0.f46870l;
        }

        @m80.k
        public final io.ktor.util.pipeline.h c() {
            return e0.f46871m;
        }

        @m80.k
        public final io.ktor.util.pipeline.h d() {
            return e0.f46868j;
        }

        @m80.k
        public final io.ktor.util.pipeline.h e() {
            return e0.f46869k;
        }

        public a() {
        }
    }

    public e0() {
        this(false, 1, null);
    }

    @Override // io.ktor.util.pipeline.c
    public boolean u() {
        return this.f46872g;
    }

    public /* synthetic */ e0(boolean z11, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? true : z11);
    }

    public e0(boolean z11) {
        super(f46867i, f46868j, f46869k, f46870l, f46871m);
        this.f46872g = z11;
    }
}
