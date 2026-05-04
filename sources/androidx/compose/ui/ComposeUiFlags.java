package androidx.compose.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;
import w00.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
/* loaded from: classes.dex */
public final class ComposeUiFlags {

    @g
    public static boolean isRemoveFocusedViewFixEnabled;

    @g
    public static boolean isViewFocusFixEnabled;

    @k
    public static final ComposeUiFlags INSTANCE = new ComposeUiFlags();

    @g
    public static boolean isRectTrackingEnabled = true;

    @g
    public static boolean NewNestedScrollFlingDispatchingEnabled = true;

    @g
    public static boolean isSemanticAutofillEnabled = true;

    @g
    public static boolean isTrackFocusEnabled = true;
    public static final int $stable = 8;

    private ComposeUiFlags() {
    }

    public static /* synthetic */ void getNewNestedScrollFlingDispatchingEnabled$annotations() {
    }

    public static /* synthetic */ void isRectTrackingEnabled$annotations() {
    }

    public static /* synthetic */ void isRemoveFocusedViewFixEnabled$annotations() {
    }

    public static /* synthetic */ void isSemanticAutofillEnabled$annotations() {
    }

    public static /* synthetic */ void isTrackFocusEnabled$annotations() {
    }

    public static /* synthetic */ void isViewFocusFixEnabled$annotations() {
    }
}
