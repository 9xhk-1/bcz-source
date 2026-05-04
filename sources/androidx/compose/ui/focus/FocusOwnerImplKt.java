package androidx.compose.ui.focus;

import androidx.compose.ui.focus.FocusDirection;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class FocusOwnerImplKt {

    @k
    private static final String Warning = "FocusRelatedWarning";

    /* renamed from: is1dFocusSearch-3ESFkO8, reason: not valid java name */
    public static final boolean m2176is1dFocusSearch3ESFkO8(int i11) {
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m2152equalsimpl0(i11, companion.m2160getNextdhqQ8s())) {
            return true;
        }
        return FocusDirection.m2152equalsimpl0(i11, companion.m2161getPreviousdhqQ8s());
    }
}
