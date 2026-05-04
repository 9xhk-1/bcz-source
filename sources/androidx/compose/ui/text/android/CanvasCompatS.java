package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.fonts.Font;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(31)
/* loaded from: classes2.dex */
final class CanvasCompatS {

    @m80.k
    public static final CanvasCompatS INSTANCE = new CanvasCompatS();

    private CanvasCompatS() {
    }

    public final void drawGlyphs(@m80.k Canvas canvas, @m80.k int[] iArr, int i11, @m80.k float[] fArr, int i12, int i13, @m80.k Font font, @m80.k Paint paint) {
        canvas.drawGlyphs(iArr, i11, fArr, i12, i13, font, paint);
    }

    public final void drawPatch(@m80.k Canvas canvas, @m80.k NinePatch ninePatch, @m80.k Rect rect, @m80.l Paint paint) {
        canvas.drawPatch(ninePatch, rect, paint);
    }

    public final void drawPatch(@m80.k Canvas canvas, @m80.k NinePatch ninePatch, @m80.k RectF rectF, @m80.l Paint paint) {
        canvas.drawPatch(ninePatch, rectF, paint);
    }
}
