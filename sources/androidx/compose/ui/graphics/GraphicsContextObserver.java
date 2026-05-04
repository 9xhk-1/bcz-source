package androidx.compose.ui.graphics;

import androidx.compose.runtime.RememberObserver;
import androidx.compose.ui.graphics.layer.GraphicsLayer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class GraphicsContextObserver implements RememberObserver {

    @m80.k
    private final GraphicsContext graphicsContext;

    @m80.k
    private final GraphicsLayer graphicsLayer;

    public GraphicsContextObserver(@m80.k GraphicsContext graphicsContext) {
        this.graphicsContext = graphicsContext;
        this.graphicsLayer = graphicsContext.createGraphicsLayer();
    }

    @m80.k
    public final GraphicsLayer getGraphicsLayer() {
        return this.graphicsLayer;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        this.graphicsContext.releaseGraphicsLayer(this.graphicsLayer);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        this.graphicsContext.releaseGraphicsLayer(this.graphicsLayer);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }
}
