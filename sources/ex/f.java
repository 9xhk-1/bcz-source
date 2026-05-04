package ex;

import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f extends io.ktor.util.pipeline.c<d, mw.a> {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f50195h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final io.ktor.util.pipeline.h f50196i = new io.ktor.util.pipeline.h("Receive");

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final io.ktor.util.pipeline.h f50197j = new io.ktor.util.pipeline.h("Parse");

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final io.ktor.util.pipeline.h f50198k = new io.ktor.util.pipeline.h("Transform");

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final io.ktor.util.pipeline.h f50199l = new io.ktor.util.pipeline.h("State");

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final io.ktor.util.pipeline.h f50200m = new io.ktor.util.pipeline.h("After");

    /* renamed from: g, reason: collision with root package name */
    public final boolean f50201g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final io.ktor.util.pipeline.h a() {
            return f.f50200m;
        }

        @k
        public final io.ktor.util.pipeline.h b() {
            return f.f50197j;
        }

        @k
        public final io.ktor.util.pipeline.h c() {
            return f.f50196i;
        }

        @k
        public final io.ktor.util.pipeline.h d() {
            return f.f50199l;
        }

        @k
        public final io.ktor.util.pipeline.h e() {
            return f.f50198k;
        }

        public a() {
        }
    }

    public f() {
        this(false, 1, null);
    }

    @Override // io.ktor.util.pipeline.c
    public boolean u() {
        return this.f50201g;
    }

    public /* synthetic */ f(boolean z11, int i11, v vVar) {
        this((i11 & 1) != 0 ? true : z11);
    }

    public f(boolean z11) {
        super(f50196i, f50197j, f50198k, f50199l, f50200m);
        this.f50201g = z11;
    }
}
