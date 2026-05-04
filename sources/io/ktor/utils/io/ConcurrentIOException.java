package io.ktor.utils.io;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class ConcurrentIOException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConcurrentIOException(@m80.k String taskName) {
        super("Concurrent " + taskName + " attempts");
        kotlin.jvm.internal.g0.p(taskName, "taskName");
    }
}
