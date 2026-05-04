package androidx.lifecycle.viewmodel.internal;

import c40.p2;
import c40.r0;
import kotlin.coroutines.d;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class CloseableCoroutineScope implements AutoCloseable, r0 {

    @k
    private final d coroutineContext;

    public CloseableCoroutineScope(@k d coroutineContext) {
        g0.p(coroutineContext, "coroutineContext");
        this.coroutineContext = coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        p2.j(getCoroutineContext(), null, 1, null);
    }

    @Override // c40.r0
    @k
    public d getCoroutineContext() {
        return this.coroutineContext;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CloseableCoroutineScope(@k r0 coroutineScope) {
        this(coroutineScope.getCoroutineContext());
        g0.p(coroutineScope, "coroutineScope");
    }
}
