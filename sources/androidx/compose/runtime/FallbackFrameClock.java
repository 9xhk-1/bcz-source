package androidx.compose.runtime;

import androidx.compose.runtime.MonotonicFrameClock;
import c40.h1;
import c40.i;
import j00.c;
import kotlin.coroutines.d;
import m80.k;
import m80.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class FallbackFrameClock implements MonotonicFrameClock {
    private static final long DefaultFrameDelay = 16;

    @k
    public static final FallbackFrameClock INSTANCE = new FallbackFrameClock();

    private FallbackFrameClock() {
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    public <R> R fold(R r11, @k p<? super R, ? super d.b, ? extends R> pVar) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r11, pVar);
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    @l
    public <E extends d.b> E get(@k d.c<E> cVar) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, cVar);
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    @k
    public d minusKey(@k d.c<?> cVar) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, cVar);
    }

    @Override // kotlin.coroutines.d
    @k
    public d plus(@k d dVar) {
        return MonotonicFrameClock.DefaultImpls.plus(this, dVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    @l
    public <R> Object withFrameNanos(@k x00.l<? super Long, ? extends R> lVar, @k c<? super R> cVar) {
        return i.h(h1.e(), new FallbackFrameClock$withFrameNanos$2(lVar, null), cVar);
    }
}
