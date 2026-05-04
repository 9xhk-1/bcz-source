package androidx.lifecycle;

import androidx.camera.view.q;
import androidx.lifecycle.Lifecycle;
import c40.h1;
import c40.l3;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class LifecycleKt {
    @k
    public static final LifecycleCoroutineScope getCoroutineScope(@k Lifecycle lifecycle) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        g0.p(lifecycle, "<this>");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) lifecycle.getInternalScopeRef().get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(lifecycle, l3.c(null, 1, null).plus(h1.e().q()));
        } while (!q.a(lifecycle.getInternalScopeRef(), null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.register();
        return lifecycleCoroutineScopeImpl;
    }

    @k
    public static final kotlinx.coroutines.flow.i<Lifecycle.Event> getEventFlow(@k Lifecycle lifecycle) {
        g0.p(lifecycle, "<this>");
        return kotlinx.coroutines.flow.k.P0(kotlinx.coroutines.flow.k.t(new LifecycleKt$eventFlow$1(lifecycle, null)), h1.e().q());
    }
}
