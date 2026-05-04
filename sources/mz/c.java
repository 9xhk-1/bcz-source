package mz;

import c40.h1;
import io.ktor.utils.io.g;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.g0;
import m80.k;
import pz.h;
import w00.j;
import y40.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c {
    @k
    public static final g a(@k InputStream inputStream, @k kotlin.coroutines.d context, @k h<ByteBuffer> pool) {
        g0.p(inputStream, "<this>");
        g0.p(context, "context");
        g0.p(pool, "pool");
        return new b(l.b(inputStream), context);
    }

    public static /* synthetic */ g b(InputStream inputStream, kotlin.coroutines.d dVar, h hVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dVar = h1.c();
        }
        return a(inputStream, dVar, hVar);
    }

    @j(name = "toByteReadChannelWithArrayPool")
    @k
    public static final g c(@k InputStream inputStream, @k kotlin.coroutines.d context, @k h<byte[]> pool) {
        g0.p(inputStream, "<this>");
        g0.p(context, "context");
        g0.p(pool, "pool");
        return new b(l.b(inputStream), context);
    }

    public static /* synthetic */ g d(InputStream inputStream, kotlin.coroutines.d dVar, h hVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dVar = h1.c();
        }
        if ((i11 & 2) != 0) {
            hVar = pz.a.a();
        }
        return c(inputStream, dVar, hVar);
    }
}
