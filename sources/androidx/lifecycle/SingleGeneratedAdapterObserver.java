package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class SingleGeneratedAdapterObserver implements LifecycleEventObserver {

    @k
    private final GeneratedAdapter generatedAdapter;

    public SingleGeneratedAdapterObserver(@k GeneratedAdapter generatedAdapter) {
        g0.p(generatedAdapter, "generatedAdapter");
        this.generatedAdapter = generatedAdapter;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@k LifecycleOwner source, @k Lifecycle.Event event) {
        g0.p(source, "source");
        g0.p(event, "event");
        this.generatedAdapter.callMethods(source, event, false, null);
        this.generatedAdapter.callMethods(source, event, true, null);
    }
}
