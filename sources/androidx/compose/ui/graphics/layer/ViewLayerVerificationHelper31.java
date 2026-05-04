package androidx.compose.ui.graphics.layer;

import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.RenderEffect;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(31)
/* loaded from: classes.dex */
final class ViewLayerVerificationHelper31 {

    @m80.k
    public static final ViewLayerVerificationHelper31 INSTANCE = new ViewLayerVerificationHelper31();

    private ViewLayerVerificationHelper31() {
    }

    public final void setRenderEffect(@m80.k View view, @m80.l RenderEffect renderEffect) {
        view.setRenderEffect(renderEffect != null ? renderEffect.asAndroidRenderEffect() : null);
    }
}
