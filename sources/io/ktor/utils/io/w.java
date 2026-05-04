package io.ktor.utils.io;

import kotlin.DeprecationLevel;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class w {
    @m80.k
    public static final v a(@m80.k g gVar) {
        kotlin.jvm.internal.g0.p(gVar, "<this>");
        return new v(gVar);
    }

    public static final long b(@m80.k g gVar) {
        kotlin.jvm.internal.g0.p(gVar, "<this>");
        throw new IllegalStateException("Counter is no longer available on the regular ByteReadChannel. Use CounterByteReadChannel instead.");
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Counter is no longer available on the regular ByteReadChannel. Use CounterByteReadChannel instead.", replaceWith = @w0(expression = "this.counted().totalBytesRead", imports = {}))
    public static /* synthetic */ void c(g gVar) {
    }
}
