package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface DrawContext {
    @k
    default Canvas getCanvas() {
        return EmptyCanvas.INSTANCE;
    }

    @k
    default Density getDensity() {
        return DrawContextKt.getDefaultDensity();
    }

    @l
    default GraphicsLayer getGraphicsLayer() {
        return null;
    }

    @k
    default LayoutDirection getLayoutDirection() {
        return LayoutDirection.Ltr;
    }

    /* renamed from: getSize-NH-jbRc */
    long mo2981getSizeNHjbRc();

    @k
    DrawTransform getTransform();

    /* renamed from: setSize-uvyYCjk */
    void mo2982setSizeuvyYCjk(long j11);

    default void setCanvas(@k Canvas canvas) {
    }

    default void setDensity(@k Density density) {
    }

    default void setGraphicsLayer(@l GraphicsLayer graphicsLayer) {
    }

    default void setLayoutDirection(@k LayoutDirection layoutDirection) {
    }
}
