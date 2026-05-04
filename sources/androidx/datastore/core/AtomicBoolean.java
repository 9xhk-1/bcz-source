package androidx.datastore.core;

import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class AtomicBoolean {

    @k
    private final java.util.concurrent.atomic.AtomicBoolean delegate;

    public AtomicBoolean(boolean z11) {
        this.delegate = new java.util.concurrent.atomic.AtomicBoolean(z11);
    }

    public final boolean get() {
        return this.delegate.get();
    }

    public final void set(boolean z11) {
        this.delegate.set(z11);
    }
}
