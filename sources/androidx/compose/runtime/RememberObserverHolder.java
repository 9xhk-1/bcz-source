package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class RememberObserverHolder {
    public static final int $stable = 8;

    @l
    private Anchor after;

    @k
    private RememberObserver wrapped;

    public RememberObserverHolder(@k RememberObserver rememberObserver, @l Anchor anchor) {
        this.wrapped = rememberObserver;
        this.after = anchor;
    }

    @l
    public final Anchor getAfter() {
        return this.after;
    }

    @k
    public final RememberObserver getWrapped() {
        return this.wrapped;
    }

    public final void setAfter(@l Anchor anchor) {
        this.after = anchor;
    }

    public final void setWrapped(@k RememberObserver rememberObserver) {
        this.wrapped = rememberObserver;
    }
}
