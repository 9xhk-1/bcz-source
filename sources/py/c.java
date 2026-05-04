package py;

import kotlin.jvm.internal.v;
import zx.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class c extends io.ktor.util.pipeline.c<Object, k0> {

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final a f81324h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final io.ktor.util.pipeline.h f81325i = new io.ktor.util.pipeline.h("Before");

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final io.ktor.util.pipeline.h f81326j = new io.ktor.util.pipeline.h("Transform");

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public static final io.ktor.util.pipeline.h f81327k = new io.ktor.util.pipeline.h("After");

    /* renamed from: g, reason: collision with root package name */
    public final boolean f81328g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @m80.k
        public final io.ktor.util.pipeline.h a() {
            return c.f81327k;
        }

        @m80.k
        public final io.ktor.util.pipeline.h b() {
            return c.f81325i;
        }

        @m80.k
        public final io.ktor.util.pipeline.h c() {
            return c.f81326j;
        }

        public a() {
        }
    }

    public c() {
        this(false, 1, null);
    }

    @Override // io.ktor.util.pipeline.c
    public boolean u() {
        return this.f81328g;
    }

    public /* synthetic */ c(boolean z11, int i11, v vVar) {
        this((i11 & 1) != 0 ? false : z11);
    }

    public c(boolean z11) {
        super(f81325i, f81326j, f81327k);
        this.f81328g = z11;
    }
}
