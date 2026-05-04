package io.ktor.utils.io;

import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String f62311a = "\n    We're migrating to the new kotlinx-io library.\n    This declaration is deprecated and will be removed in Ktor 4.0.0\n    If you have any problems with migration, please contact us in \n    https://youtrack.jetbrains.com/issue/KTOR-6030/Migrate-to-new-kotlinx.io-library\n    ";

    @m80.k
    public static final String a(@m80.k y40.c0 c0Var) {
        kotlin.jvm.internal.g0.p(c0Var, "<this>");
        return y40.i0.j(c0Var);
    }

    @yz.n(message = "Use close() instead", replaceWith = @w0(expression = "close()", imports = {}))
    public static final void b(@m80.k y40.x xVar) {
        kotlin.jvm.internal.g0.p(xVar, "<this>");
        xVar.close();
    }
}
