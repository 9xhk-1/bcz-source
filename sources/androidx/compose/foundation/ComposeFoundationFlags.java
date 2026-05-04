package androidx.compose.foundation;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class ComposeFoundationFlags {

    @m80.k
    public static final ComposeFoundationFlags INSTANCE = new ComposeFoundationFlags();

    @w00.g
    public static boolean NewNestedFlingPropagationEnabled = true;

    @w00.g
    public static boolean DragGesturePickUpEnabled = true;

    @w00.g
    public static boolean isDetectTapGesturesImmediateCoroutineDispatchEnabled = true;
    public static final int $stable = 8;

    private ComposeFoundationFlags() {
    }

    public static /* synthetic */ void getDragGesturePickUpEnabled$annotations() {
    }

    public static /* synthetic */ void getNewNestedFlingPropagationEnabled$annotations() {
    }

    public static /* synthetic */ void isDetectTapGesturesImmediateCoroutineDispatchEnabled$annotations() {
    }
}
