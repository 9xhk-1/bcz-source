package ex;

import kotlin.jvm.internal.v;
import m80.k;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b extends io.ktor.util.pipeline.c<c, g2> {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f50181h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final io.ktor.util.pipeline.h f50182i = new io.ktor.util.pipeline.h("Before");

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final io.ktor.util.pipeline.h f50183j = new io.ktor.util.pipeline.h("State");

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final io.ktor.util.pipeline.h f50184k = new io.ktor.util.pipeline.h("After");

    /* renamed from: g, reason: collision with root package name */
    public final boolean f50185g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final io.ktor.util.pipeline.h a() {
            return b.f50184k;
        }

        @k
        public final io.ktor.util.pipeline.h b() {
            return b.f50182i;
        }

        @k
        public final io.ktor.util.pipeline.h c() {
            return b.f50183j;
        }

        public a() {
        }
    }

    public b() {
        this(false, 1, null);
    }

    @Override // io.ktor.util.pipeline.c
    public boolean u() {
        return this.f50185g;
    }

    public /* synthetic */ b(boolean z11, int i11, v vVar) {
        this((i11 & 1) != 0 ? true : z11);
    }

    public b(boolean z11) {
        super(f50182i, f50183j, f50184k);
        this.f50185g = z11;
    }
}
