package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class ViewLayerContainer extends DrawChildContainer {
    public static final int $stable = 0;

    public ViewLayerContainer(@m80.k Context context) {
        super(context);
    }

    public final void dispatchGetDisplayList() {
    }

    @Override // androidx.compose.ui.platform.DrawChildContainer, android.view.ViewGroup, android.view.View
    public void dispatchDraw(@m80.k Canvas canvas) {
    }
}
