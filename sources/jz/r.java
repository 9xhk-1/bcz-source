package jz;

import kotlin.jvm.internal.g0;
import y40.c0;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class r {
    public static final boolean a(@m80.k c0 c0Var) {
        g0.p(c0Var, "<this>");
        return c0Var.J();
    }

    public static final boolean c(@m80.k c0 c0Var) {
        g0.p(c0Var, "<this>");
        return !c0Var.J();
    }

    @yz.n(message = "Use exhausted() instead", replaceWith = @w0(expression = "exhausted()", imports = {}))
    public static /* synthetic */ void b(c0 c0Var) {
    }

    @yz.n(message = "This makes no sense for streaming inputs. Some use-cases are covered by exhausted() method", replaceWith = @w0(expression = "!exhausted()", imports = {}))
    public static /* synthetic */ void d(c0 c0Var) {
    }
}
