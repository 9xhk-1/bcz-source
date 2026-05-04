package nz;

import c40.h1;
import io.ktor.utils.io.g;
import java.nio.channels.ReadableByteChannel;
import kotlin.jvm.internal.g0;
import m80.k;
import y40.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b {
    @k
    public static final p a(@k ReadableByteChannel readableByteChannel) {
        g0.p(readableByteChannel, "<this>");
        return new a(readableByteChannel);
    }

    @k
    public static final g b(@k ReadableByteChannel readableByteChannel, @k kotlin.coroutines.d context) {
        g0.p(readableByteChannel, "<this>");
        g0.p(context, "context");
        return new mz.b(a(readableByteChannel), context);
    }

    public static /* synthetic */ g c(ReadableByteChannel readableByteChannel, kotlin.coroutines.d dVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dVar = h1.c();
        }
        return b(readableByteChannel, dVar);
    }
}
