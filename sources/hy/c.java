package hy;

import java.io.File;
import java.io.InputStream;
import mx.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends v.e {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f59801b;

        public a(Object obj) {
            this.f59801b = obj;
        }

        @Override // mx.v.e
        public io.ktor.utils.io.g m() {
            return mz.c.d((InputStream) this.f59801b, null, null, 3, null);
        }
    }

    @m80.l
    public static final mx.v a(@m80.k zx.b call, @m80.k Object value) {
        kotlin.jvm.internal.g0.p(call, "call");
        kotlin.jvm.internal.g0.p(value, "value");
        if (!(value instanceof mx.d0)) {
            if (value instanceof InputStream) {
                return new a(value);
            }
            return null;
        }
        mx.d0 d0Var = (mx.d0) value;
        if (kotlin.jvm.internal.g0.g(d0Var.o().getScheme(), "file")) {
            return new n(new File(d0Var.o()), null, 2, null);
        }
        return null;
    }
}
