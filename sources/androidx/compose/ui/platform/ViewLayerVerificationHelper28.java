package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(28)
/* loaded from: classes2.dex */
final class ViewLayerVerificationHelper28 {

    @m80.k
    public static final ViewLayerVerificationHelper28 INSTANCE = new ViewLayerVerificationHelper28();

    private ViewLayerVerificationHelper28() {
    }

    public final void setOutlineAmbientShadowColor(@m80.k View view, int i11) {
        view.setOutlineAmbientShadowColor(i11);
    }

    public final void setOutlineSpotShadowColor(@m80.k View view, int i11) {
        view.setOutlineSpotShadowColor(i11);
    }
}
