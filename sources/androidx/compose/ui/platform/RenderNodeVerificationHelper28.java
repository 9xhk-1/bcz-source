package androidx.compose.ui.platform;

import android.view.RenderNode;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(28)
/* loaded from: classes2.dex */
final class RenderNodeVerificationHelper28 {

    @m80.k
    public static final RenderNodeVerificationHelper28 INSTANCE = new RenderNodeVerificationHelper28();

    private RenderNodeVerificationHelper28() {
    }

    public final int getAmbientShadowColor(@m80.k RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    public final int getSpotShadowColor(@m80.k RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    public final void setAmbientShadowColor(@m80.k RenderNode renderNode, int i11) {
        renderNode.setAmbientShadowColor(i11);
    }

    public final void setSpotShadowColor(@m80.k RenderNode renderNode, int i11) {
        renderNode.setSpotShadowColor(i11);
    }
}
