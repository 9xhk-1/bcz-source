package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class SavedStateHandleAttacher implements LifecycleEventObserver {

    @k
    private final SavedStateHandlesProvider provider;

    public SavedStateHandleAttacher(@k SavedStateHandlesProvider provider) {
        g0.p(provider, "provider");
        this.provider = provider;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@k LifecycleOwner source, @k Lifecycle.Event event) {
        g0.p(source, "source");
        g0.p(event, "event");
        if (event == Lifecycle.Event.ON_CREATE) {
            source.getLifecycle().removeObserver(this);
            this.provider.performRestore();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}
