package androidx.compose.runtime.internal;

import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class Thread_jvmKt {
    public static final long currentThreadId() {
        return Thread.currentThread().getId();
    }

    @k
    public static final String currentThreadName() {
        return Thread.currentThread().getName();
    }
}
