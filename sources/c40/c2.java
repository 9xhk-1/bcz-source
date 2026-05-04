package c40;

import kotlin.DeprecationLevel;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineStart;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c2 {
    @o00.i
    @yz.n(level = DeprecationLevel.ERROR, message = "'async' can not be called without the corresponding coroutine scope. Consider wrapping 'async' in 'coroutineScope { }', using 'runBlocking { }', or using some other 'CoroutineScope'")
    @m80.k
    public static final <T> x0<T> a(@m80.k kotlin.coroutines.d dVar, @m80.k CoroutineStart coroutineStart, @m80.k x00.p<? super r0, ? super j00.c<? super T>, ? extends Object> pVar) {
        throw new UnsupportedOperationException("Should never be called, was introduced to help with incomplete code");
    }

    public static /* synthetic */ x0 b(kotlin.coroutines.d dVar, CoroutineStart coroutineStart, x00.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return a(dVar, coroutineStart, pVar);
    }

    @o00.i
    @yz.n(level = DeprecationLevel.ERROR, message = "'launch' can not be called without the corresponding coroutine scope. Consider wrapping 'launch' in 'coroutineScope { }', using 'runBlocking { }', or using some other 'CoroutineScope'")
    @m80.k
    public static final l2 c(@m80.k kotlin.coroutines.d dVar, @m80.k CoroutineStart coroutineStart, @m80.k x00.p<? super r0, ? super j00.c<? super yz.g2>, ? extends Object> pVar) {
        throw new UnsupportedOperationException("Should never be called, was introduced to help with incomplete code");
    }

    public static /* synthetic */ l2 d(kotlin.coroutines.d dVar, CoroutineStart coroutineStart, x00.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return c(dVar, coroutineStart, pVar);
    }
}
