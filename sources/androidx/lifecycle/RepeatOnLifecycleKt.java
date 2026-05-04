package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import c40.r0;
import c40.s0;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class RepeatOnLifecycleKt {
    @l
    public static final Object repeatOnLifecycle(@k Lifecycle lifecycle, @k Lifecycle.State state, @k p<? super r0, ? super j00.c<? super g2>, ? extends Object> pVar, @k j00.c<? super g2> cVar) {
        if (state == Lifecycle.State.INITIALIZED) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        }
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            return g2.f100423a;
        }
        Object g11 = s0.g(new RepeatOnLifecycleKt$repeatOnLifecycle$3(lifecycle, state, pVar, null), cVar);
        return g11 == kotlin.coroutines.intrinsics.b.l() ? g11 : g2.f100423a;
    }

    @l
    public static final Object repeatOnLifecycle(@k LifecycleOwner lifecycleOwner, @k Lifecycle.State state, @k p<? super r0, ? super j00.c<? super g2>, ? extends Object> pVar, @k j00.c<? super g2> cVar) {
        Object repeatOnLifecycle = repeatOnLifecycle(lifecycleOwner.getLifecycle(), state, pVar, cVar);
        return repeatOnLifecycle == kotlin.coroutines.intrinsics.b.l() ? repeatOnLifecycle : g2.f100423a;
    }
}
