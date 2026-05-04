package zx;

import kotlin.DeprecationLevel;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class c extends io.ktor.util.pipeline.c<g2, k0> {

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public static final a f103019k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public static final io.ktor.util.pipeline.h f103020l = new io.ktor.util.pipeline.h("Setup");

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public static final io.ktor.util.pipeline.h f103021m = new io.ktor.util.pipeline.h("Monitoring");

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public static final io.ktor.util.pipeline.h f103022n;

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public static final io.ktor.util.pipeline.h f103023o;

    /* renamed from: p, reason: collision with root package name */
    @m80.k
    public static final io.ktor.util.pipeline.h f103024p;

    /* renamed from: q, reason: collision with root package name */
    @m80.k
    public static final io.ktor.util.pipeline.h f103025q;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f103026g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final f f103027h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final py.c f103028i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final qy.m f103029j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final io.ktor.util.pipeline.h a() {
            return c.f103023o;
        }

        @m80.k
        public final io.ktor.util.pipeline.h b() {
            return c.f103024p;
        }

        @m80.k
        public final io.ktor.util.pipeline.h c() {
            return c.f103025q;
        }

        @m80.k
        public final io.ktor.util.pipeline.h e() {
            return c.f103021m;
        }

        @m80.k
        public final io.ktor.util.pipeline.h f() {
            return c.f103022n;
        }

        @m80.k
        public final io.ktor.util.pipeline.h g() {
            return c.f103020l;
        }

        public a() {
        }

        @yz.n(level = DeprecationLevel.ERROR, message = "Renamed to Plugins", replaceWith = @yz.w0(expression = "Plugins", imports = {}))
        public static /* synthetic */ void d() {
        }
    }

    static {
        io.ktor.util.pipeline.h hVar = new io.ktor.util.pipeline.h("Plugins");
        f103022n = hVar;
        f103023o = new io.ktor.util.pipeline.h("Call");
        f103024p = new io.ktor.util.pipeline.h("Fallback");
        f103025q = hVar;
    }

    public /* synthetic */ c(boolean z11, f fVar, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? false : z11, fVar);
    }

    @m80.k
    public final f a() {
        return this.f103027h;
    }

    @m80.k
    public final py.c g0() {
        return this.f103028i;
    }

    @m80.k
    public final qy.m j0() {
        return this.f103029j;
    }

    @Override // io.ktor.util.pipeline.c
    public final boolean u() {
        return this.f103026g;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z11, @m80.k f environment) {
        super(f103020l, f103021m, f103022n, f103023o, f103024p);
        kotlin.jvm.internal.g0.p(environment, "environment");
        this.f103026g = z11;
        this.f103027h = environment;
        this.f103028i = new py.c(z11);
        this.f103029j = new qy.m(z11);
    }
}
