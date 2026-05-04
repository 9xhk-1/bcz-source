package androidx.compose.ui.platform;

import android.view.ViewParent;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@RequiresApi(26)
/* loaded from: classes2.dex */
public final class WrapperRenderNodeLayerHelperMethods {
    public static final int $stable = 0;

    @m80.k
    public static final WrapperRenderNodeLayerHelperMethods INSTANCE = new WrapperRenderNodeLayerHelperMethods();

    private WrapperRenderNodeLayerHelperMethods() {
    }

    public final void onDescendantInvalidated(@m80.k AndroidComposeView androidComposeView) {
        ViewParent parent = androidComposeView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(androidComposeView, androidComposeView);
        }
    }
}
