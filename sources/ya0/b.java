package ya0;

import a00.a0;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class b {
    @k
    public static final a a() {
        return new a(null, null, 3, null);
    }

    @k
    public static final a b(@k Object... parameters) {
        g0.p(parameters, "parameters");
        return new a(a0.nz(parameters), Boolean.TRUE);
    }

    @k
    public static final a c(@k Object... parameters) {
        g0.p(parameters, "parameters");
        return new a(a0.nz(parameters), Boolean.FALSE);
    }

    @k
    public static final a d(@k Object... parameters) {
        g0.p(parameters, "parameters");
        return new a(a0.nz(parameters), null, 2, null);
    }
}
