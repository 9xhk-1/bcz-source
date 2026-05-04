package jz;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.g0;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c {
    @yz.n(message = "[writeByteBuffer] is deprecated. Consider using [transferFrom] instead", replaceWith = @w0(expression = "this.transferFrom(source)", imports = {}))
    public static final void a(@m80.k y40.b bVar, @m80.k ByteBuffer source) {
        g0.p(bVar, "<this>");
        g0.p(source, "source");
        y40.d.h(bVar, source);
    }
}
