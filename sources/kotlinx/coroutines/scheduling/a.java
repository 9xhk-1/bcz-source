package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.scheduling.CoroutineScheduler;
import m80.k;
import w00.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {
    @j(name = "isSchedulerWorker")
    public static final boolean a(@k Thread thread) {
        return thread instanceof CoroutineScheduler.c;
    }

    @j(name = "mayNotBlock")
    public static final boolean b(@k Thread thread) {
        return (thread instanceof CoroutineScheduler.c) && ((CoroutineScheduler.c) thread).f68477c == CoroutineScheduler.WorkerState.CPU_ACQUIRED;
    }
}
