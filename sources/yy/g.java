package yy;

import c40.h1;
import c40.l2;
import c40.p2;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.g0;
import m80.k;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class g {
    @n(message = "Use variant from 'ktor-io' module instead", replaceWith = @w0(expression = "this.toByteReadChannel(context + parent, pool)", imports = {"io.ktor.utils.io.jvm.javaio.toByteReadChannel"}))
    @k
    public static final io.ktor.utils.io.g a(@k InputStream inputStream, @k pz.h<ByteBuffer> pool, @k kotlin.coroutines.d context, @k l2 parent) {
        g0.p(inputStream, "<this>");
        g0.p(pool, "pool");
        g0.p(context, "context");
        g0.p(parent, "parent");
        return mz.c.a(inputStream, context.plus(parent), pool);
    }

    public static /* synthetic */ io.ktor.utils.io.g b(InputStream inputStream, pz.h hVar, kotlin.coroutines.d dVar, l2 l2Var, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            hVar = a.a();
        }
        if ((i11 & 2) != 0) {
            dVar = h1.g();
        }
        if ((i11 & 4) != 0) {
            l2Var = p2.c(null, 1, null);
        }
        return a(inputStream, hVar, dVar, l2Var);
    }
}
