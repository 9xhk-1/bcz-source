package qy;

import kotlin.jvm.internal.v;
import zx.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class m extends io.ktor.util.pipeline.c<Object, k0> {

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final a f82742h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final io.ktor.util.pipeline.h f82743i = new io.ktor.util.pipeline.h("Before");

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final io.ktor.util.pipeline.h f82744j = new io.ktor.util.pipeline.h("Transform");

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public static final io.ktor.util.pipeline.h f82745k = new io.ktor.util.pipeline.h("Render");

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public static final io.ktor.util.pipeline.h f82746l = new io.ktor.util.pipeline.h("ContentEncoding");

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public static final io.ktor.util.pipeline.h f82747m = new io.ktor.util.pipeline.h("TransferEncoding");

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public static final io.ktor.util.pipeline.h f82748n = new io.ktor.util.pipeline.h("After");

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public static final io.ktor.util.pipeline.h f82749o = new io.ktor.util.pipeline.h(kk.k.f66726i);

    /* renamed from: g, reason: collision with root package name */
    public final boolean f82750g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @m80.k
        public final io.ktor.util.pipeline.h a() {
            return m.f82748n;
        }

        @m80.k
        public final io.ktor.util.pipeline.h b() {
            return m.f82743i;
        }

        @m80.k
        public final io.ktor.util.pipeline.h c() {
            return m.f82746l;
        }

        @m80.k
        public final io.ktor.util.pipeline.h d() {
            return m.f82749o;
        }

        @m80.k
        public final io.ktor.util.pipeline.h e() {
            return m.f82745k;
        }

        @m80.k
        public final io.ktor.util.pipeline.h f() {
            return m.f82747m;
        }

        @m80.k
        public final io.ktor.util.pipeline.h g() {
            return m.f82744j;
        }

        public a() {
        }
    }

    public m() {
        this(false, 1, null);
    }

    @Override // io.ktor.util.pipeline.c
    public boolean u() {
        return this.f82750g;
    }

    public /* synthetic */ m(boolean z11, int i11, v vVar) {
        this((i11 & 1) != 0 ? false : z11);
    }

    public m(boolean z11) {
        super(f82743i, f82744j, f82745k, f82746l, f82747m, f82748n, f82749o);
        this.f82750g = z11;
    }
}
