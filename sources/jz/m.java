package jz;

import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import y40.c0;
import y40.x;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class m {
    @yz.n(level = DeprecationLevel.ERROR, message = "Use transferTo instead", replaceWith = @w0(expression = "output.transferTo(this)", imports = {"kotlinx.io.transferTo"}))
    public static final long a(@m80.k c0 c0Var, @m80.k x output) {
        g0.p(c0Var, "<this>");
        g0.p(output, "output");
        return c0Var.S1(output);
    }
}
