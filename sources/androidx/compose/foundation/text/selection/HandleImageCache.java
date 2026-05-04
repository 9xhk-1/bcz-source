package androidx.compose.foundation.text.selection;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class HandleImageCache {

    @k
    public static final HandleImageCache INSTANCE = new HandleImageCache();

    @l
    private static Canvas canvas;

    @l
    private static CanvasDrawScope canvasDrawScope;

    @l
    private static ImageBitmap imageBitmap;

    private HandleImageCache() {
    }

    @l
    public final Canvas getCanvas() {
        return canvas;
    }

    @l
    public final CanvasDrawScope getCanvasDrawScope() {
        return canvasDrawScope;
    }

    @l
    public final ImageBitmap getImageBitmap() {
        return imageBitmap;
    }

    public final void setCanvas(@l Canvas canvas2) {
        canvas = canvas2;
    }

    public final void setCanvasDrawScope(@l CanvasDrawScope canvasDrawScope2) {
        canvasDrawScope = canvasDrawScope2;
    }

    public final void setImageBitmap(@l ImageBitmap imageBitmap2) {
        imageBitmap = imageBitmap2;
    }
}
