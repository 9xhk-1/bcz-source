package androidx.compose.ui.graphics.layer;

import android.view.RenderNode;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(24)
/* loaded from: classes.dex */
final class RenderNodeVerificationHelper24 {

    @m80.k
    public static final RenderNodeVerificationHelper24 INSTANCE = new RenderNodeVerificationHelper24();

    private RenderNodeVerificationHelper24() {
    }

    public final void discardDisplayList(@m80.k RenderNode renderNode) {
        renderNode.discardDisplayList();
    }
}
