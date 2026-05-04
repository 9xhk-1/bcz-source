package androidx.compose.ui.text.android;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.text.MeasuredText;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(29)
/* loaded from: classes2.dex */
final class CanvasCompatQ {

    @m80.k
    public static final CanvasCompatQ INSTANCE = new CanvasCompatQ();

    private CanvasCompatQ() {
    }

    public final void disableZ(@m80.k Canvas canvas) {
        canvas.disableZ();
    }

    public final void drawColor(@m80.k Canvas canvas, long j11) {
        canvas.drawColor(j11);
    }

    public final void drawDoubleRoundRect(@m80.k Canvas canvas, @m80.k RectF rectF, float f11, float f12, @m80.k RectF rectF2, float f13, float f14, @m80.k Paint paint) {
        canvas.drawDoubleRoundRect(rectF, f11, f12, rectF2, f13, f14, paint);
    }

    public final void drawRenderNode(@m80.k Canvas canvas, @m80.k RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }

    public final void drawTextRun(@m80.k Canvas canvas, @m80.k MeasuredText measuredText, int i11, int i12, int i13, int i14, float f11, float f12, boolean z11, @m80.k Paint paint) {
        canvas.drawTextRun(measuredText, i11, i12, i13, i14, f11, f12, z11, paint);
    }

    public final void enableZ(@m80.k Canvas canvas) {
        canvas.enableZ();
    }

    public final void drawColor(@m80.k Canvas canvas, int i11, @m80.k BlendMode blendMode) {
        canvas.drawColor(i11, blendMode);
    }

    public final void drawDoubleRoundRect(@m80.k Canvas canvas, @m80.k RectF rectF, @m80.k float[] fArr, @m80.k RectF rectF2, @m80.k float[] fArr2, @m80.k Paint paint) {
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    public final void drawColor(@m80.k Canvas canvas, long j11, @m80.k BlendMode blendMode) {
        canvas.drawColor(j11, blendMode);
    }
}
