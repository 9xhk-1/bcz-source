package io.ktor.websocket;

import androidx.collection.SieveCacheKt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class m {
    @m80.k
    public static final j0 a(@m80.k io.ktor.utils.io.g input, @m80.k io.ktor.utils.io.m output, long j11, boolean z11, @m80.k kotlin.coroutines.d coroutineContext) {
        kotlin.jvm.internal.g0.p(input, "input");
        kotlin.jvm.internal.g0.p(output, "output");
        kotlin.jvm.internal.g0.p(coroutineContext, "coroutineContext");
        return new l(input, output, j11, z11, coroutineContext, null, 32, null);
    }

    public static /* synthetic */ j0 b(io.ktor.utils.io.g gVar, io.ktor.utils.io.m mVar, long j11, boolean z11, kotlin.coroutines.d dVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            j11 = SieveCacheKt.NodeLinkMask;
        }
        long j12 = j11;
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        return a(gVar, mVar, j12, z11, dVar);
    }
}
