package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.layer.GraphicsLayer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface GraphicsContext {
    @m80.k
    GraphicsLayer createGraphicsLayer();

    void releaseGraphicsLayer(@m80.k GraphicsLayer graphicsLayer);
}
