package androidx.compose.ui.graphics;

import android.view.ViewGroup;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class AndroidGraphicsContext_androidKt {
    @m80.k
    public static final GraphicsContext GraphicsContext(@m80.k ViewGroup viewGroup) {
        return new AndroidGraphicsContext(viewGroup);
    }

    public static final boolean isLayerManagerInitialized(@m80.k GraphicsContext graphicsContext) {
        kotlin.jvm.internal.g0.n(graphicsContext, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidGraphicsContext");
        return ((AndroidGraphicsContext) graphicsContext).isLayerManagerInitialized();
    }

    public static final boolean isLayerPersistenceEnabled() {
        return false;
    }
}
