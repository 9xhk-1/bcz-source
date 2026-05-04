package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class CompositeGeneratedAdaptersObserver implements LifecycleEventObserver {

    @k
    private final GeneratedAdapter[] generatedAdapters;

    public CompositeGeneratedAdaptersObserver(@k GeneratedAdapter[] generatedAdapters) {
        g0.p(generatedAdapters, "generatedAdapters");
        this.generatedAdapters = generatedAdapters;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@k LifecycleOwner source, @k Lifecycle.Event event) {
        g0.p(source, "source");
        g0.p(event, "event");
        MethodCallsLogger methodCallsLogger = new MethodCallsLogger();
        for (GeneratedAdapter generatedAdapter : this.generatedAdapters) {
            generatedAdapter.callMethods(source, event, false, methodCallsLogger);
        }
        for (GeneratedAdapter generatedAdapter2 : this.generatedAdapters) {
            generatedAdapter2.callMethods(source, event, true, methodCallsLogger);
        }
    }
}
