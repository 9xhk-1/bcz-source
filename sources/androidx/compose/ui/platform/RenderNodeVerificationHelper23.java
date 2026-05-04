package androidx.compose.ui.platform;

import android.view.RenderNode;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(23)
/* loaded from: classes2.dex */
final class RenderNodeVerificationHelper23 {

    @m80.k
    public static final RenderNodeVerificationHelper23 INSTANCE = new RenderNodeVerificationHelper23();

    private RenderNodeVerificationHelper23() {
    }

    public final void destroyDisplayListData(@m80.k RenderNode renderNode) {
        renderNode.destroyDisplayListData();
    }
}
