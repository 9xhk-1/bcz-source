package jz;

import io.ktor.utils.io.z;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {
    @yz.n(level = DeprecationLevel.ERROR, message = z.f62311a, replaceWith = @w0(expression = "write(other, min(other.size, maxSize.toLong())", imports = {}))
    public static final int a(@m80.k y40.b bVar, @m80.k y40.b other, int i11) {
        g0.p(bVar, "<this>");
        g0.p(other, "other");
        long min = Math.min(other.r(), i11);
        bVar.i6(other, min);
        return (int) min;
    }
}
