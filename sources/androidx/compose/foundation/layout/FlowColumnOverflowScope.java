package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@LayoutScopeMarker
@Stable
@ExperimentalLayoutApi
/* loaded from: classes.dex */
public interface FlowColumnOverflowScope extends FlowColumnScope {
    int getShownItemCount();

    int getTotalItemCount();

    @ExperimentalLayoutApi
    static /* synthetic */ void getShownItemCount$annotations() {
    }

    @ExperimentalLayoutApi
    static /* synthetic */ void getTotalItemCount$annotations() {
    }
}
