package hy;

import mx.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends v.e {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f59824b;

        public a(Object obj) {
            this.f59824b = obj;
        }

        @Override // mx.v.e
        public io.ktor.utils.io.g m() {
            return (io.ktor.utils.io.g) this.f59824b;
        }
    }

    @m80.l
    public static final mx.v a(@m80.k zx.b call, @m80.k Object value) {
        kotlin.jvm.internal.g0.p(call, "call");
        kotlin.jvm.internal.g0.p(value, "value");
        if (value instanceof mx.v) {
            return (mx.v) value;
        }
        if (value instanceof String) {
            return new mx.c0((String) value, qy.i.c(call, null), null);
        }
        return value instanceof byte[] ? new mx.c((byte[]) value, null, null, 6, null) : value instanceof ix.g1 ? new g((ix.g1) value) : value instanceof io.ktor.utils.io.g ? new a(value) : c.a(call, value);
    }
}
