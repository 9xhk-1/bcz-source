package androidx.lifecycle;

import c40.l2;
import c40.r0;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.p;
import yz.g2;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public abstract class LifecycleCoroutineScope implements r0 {
    @k
    public abstract Lifecycle getLifecycle$lifecycle_common();

    @n(message = "launchWhenCreated is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.CREATED.")
    @k
    public final l2 launchWhenCreated(@k p<? super r0, ? super j00.c<? super g2>, ? extends Object> block) {
        l2 f11;
        g0.p(block, "block");
        f11 = c40.k.f(this, null, null, new LifecycleCoroutineScope$launchWhenCreated$1(this, block, null), 3, null);
        return f11;
    }

    @n(message = "launchWhenResumed is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.RESUMED.")
    @k
    public final l2 launchWhenResumed(@k p<? super r0, ? super j00.c<? super g2>, ? extends Object> block) {
        l2 f11;
        g0.p(block, "block");
        f11 = c40.k.f(this, null, null, new LifecycleCoroutineScope$launchWhenResumed$1(this, block, null), 3, null);
        return f11;
    }

    @n(message = "launchWhenStarted is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.STARTED.")
    @k
    public final l2 launchWhenStarted(@k p<? super r0, ? super j00.c<? super g2>, ? extends Object> block) {
        l2 f11;
        g0.p(block, "block");
        f11 = c40.k.f(this, null, null, new LifecycleCoroutineScope$launchWhenStarted$1(this, block, null), 3, null);
        return f11;
    }
}
