package androidx.compose.ui.focus;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class CancelIndicatingFocusBoundaryScope implements FocusEnterExitScope {
    public static final int $stable = 8;
    private boolean isCanceled;
    private final int requestedFocusDirection;

    public /* synthetic */ CancelIndicatingFocusBoundaryScope(int i11, v vVar) {
        this(i11);
    }

    @Override // androidx.compose.ui.focus.FocusEnterExitScope
    public void cancelFocusChange() {
        this.isCanceled = true;
    }

    @Override // androidx.compose.ui.focus.FocusEnterExitScope
    /* renamed from: getRequestedFocusDirection-dhqQ-8s, reason: not valid java name */
    public int mo2148getRequestedFocusDirectiondhqQ8s() {
        return this.requestedFocusDirection;
    }

    public final boolean isCanceled() {
        return this.isCanceled;
    }

    private CancelIndicatingFocusBoundaryScope(int i11) {
        this.requestedFocusDirection = i11;
    }
}
