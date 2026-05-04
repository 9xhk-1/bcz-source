package fx;

import c40.h1;
import c40.m0;
import io.ktor.utils.io.b0;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class g {
    @b0
    @m80.k
    public static final m0 a(@m80.k h1 h1Var, int i11, @m80.k String dispatcherName) {
        g0.p(h1Var, "<this>");
        g0.p(dispatcherName, "dispatcherName");
        return m0.limitedParallelism$default(h1.c(), i11, null, 2, null);
    }

    public static /* synthetic */ m0 b(h1 h1Var, int i11, String str, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            str = "ktor-client-dispatcher";
        }
        return a(h1Var, i11, str);
    }
}
