package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import c40.h1;
import c40.r0;
import m80.k;
import m80.l;
import x00.p;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "PausingDispatcherKt")
/* loaded from: classes2.dex */
public final class PausingDispatcherKt {
    @l
    @n(message = "whenCreated has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withCreated for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> Object whenCreated(@k LifecycleOwner lifecycleOwner, @k p<? super r0, ? super j00.c<? super T>, ? extends Object> pVar, @k j00.c<? super T> cVar) {
        return whenCreated(lifecycleOwner.getLifecycle(), pVar, cVar);
    }

    @l
    @n(message = "whenResumed has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withResumed for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> Object whenResumed(@k LifecycleOwner lifecycleOwner, @k p<? super r0, ? super j00.c<? super T>, ? extends Object> pVar, @k j00.c<? super T> cVar) {
        return whenResumed(lifecycleOwner.getLifecycle(), pVar, cVar);
    }

    @l
    @n(message = "whenStarted has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStarted for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> Object whenStarted(@k LifecycleOwner lifecycleOwner, @k p<? super r0, ? super j00.c<? super T>, ? extends Object> pVar, @k j00.c<? super T> cVar) {
        return whenStarted(lifecycleOwner.getLifecycle(), pVar, cVar);
    }

    @l
    @n(message = "whenStateAtLeast has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStateAtLeast for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> Object whenStateAtLeast(@k Lifecycle lifecycle, @k Lifecycle.State state, @k p<? super r0, ? super j00.c<? super T>, ? extends Object> pVar, @k j00.c<? super T> cVar) {
        return c40.i.h(h1.e().q(), new PausingDispatcherKt$whenStateAtLeast$2(lifecycle, state, pVar, null), cVar);
    }

    @l
    @n(message = "whenCreated has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withCreated for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> Object whenCreated(@k Lifecycle lifecycle, @k p<? super r0, ? super j00.c<? super T>, ? extends Object> pVar, @k j00.c<? super T> cVar) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.CREATED, pVar, cVar);
    }

    @l
    @n(message = "whenResumed has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withResumed for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> Object whenResumed(@k Lifecycle lifecycle, @k p<? super r0, ? super j00.c<? super T>, ? extends Object> pVar, @k j00.c<? super T> cVar) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.RESUMED, pVar, cVar);
    }

    @l
    @n(message = "whenStarted has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStarted for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> Object whenStarted(@k Lifecycle lifecycle, @k p<? super r0, ? super j00.c<? super T>, ? extends Object> pVar, @k j00.c<? super T> cVar) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.STARTED, pVar, cVar);
    }
}
