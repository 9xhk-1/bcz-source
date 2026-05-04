package androidx.compose.ui.platform;

import android.graphics.RenderNode;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.RenderEffect;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(31)
/* loaded from: classes2.dex */
final class RenderNodeApi29VerificationHelper {

    @m80.k
    public static final RenderNodeApi29VerificationHelper INSTANCE = new RenderNodeApi29VerificationHelper();

    private RenderNodeApi29VerificationHelper() {
    }

    public final void setRenderEffect(@m80.k RenderNode renderNode, @m80.l RenderEffect renderEffect) {
        renderNode.setRenderEffect(renderEffect != null ? renderEffect.asAndroidRenderEffect() : null);
    }
}
