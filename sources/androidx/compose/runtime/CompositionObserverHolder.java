package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.tooling.CompositionObserver;
import kotlin.jvm.internal.v;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@ExperimentalComposeRuntimeApi
/* loaded from: classes.dex */
public final class CompositionObserverHolder {
    public static final int $stable = 8;

    @l
    private CompositionObserver observer;
    private boolean root;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositionObserverHolder() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    @l
    public final CompositionObserver getObserver() {
        return this.observer;
    }

    public final boolean getRoot() {
        return this.root;
    }

    public final void setObserver(@l CompositionObserver compositionObserver) {
        this.observer = compositionObserver;
    }

    public final void setRoot(boolean z11) {
        this.root = z11;
    }

    public CompositionObserverHolder(@l CompositionObserver compositionObserver, boolean z11) {
        this.observer = compositionObserver;
        this.root = z11;
    }

    public /* synthetic */ CompositionObserverHolder(CompositionObserver compositionObserver, boolean z11, int i11, v vVar) {
        this((i11 & 1) != 0 ? null : compositionObserver, (i11 & 2) != 0 ? false : z11);
    }
}
