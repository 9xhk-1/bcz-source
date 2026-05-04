package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(26)
/* loaded from: classes2.dex */
final class CanvasCompatO {

    @m80.k
    public static final CanvasCompatO INSTANCE = new CanvasCompatO();

    private CanvasCompatO() {
    }

    public final boolean clipOutPath(@m80.k Canvas canvas, @m80.k Path path) {
        boolean clipOutPath;
        clipOutPath = canvas.clipOutPath(path);
        return clipOutPath;
    }

    public final boolean clipOutRect(@m80.k Canvas canvas, @m80.k RectF rectF) {
        boolean clipOutRect;
        clipOutRect = canvas.clipOutRect(rectF);
        return clipOutRect;
    }

    public final boolean clipOutRect(@m80.k Canvas canvas, @m80.k Rect rect) {
        boolean clipOutRect;
        clipOutRect = canvas.clipOutRect(rect);
        return clipOutRect;
    }

    public final boolean clipOutRect(@m80.k Canvas canvas, float f11, float f12, float f13, float f14) {
        boolean clipOutRect;
        clipOutRect = canvas.clipOutRect(f11, f12, f13, f14);
        return clipOutRect;
    }

    public final boolean clipOutRect(@m80.k Canvas canvas, int i11, int i12, int i13, int i14) {
        boolean clipOutRect;
        clipOutRect = canvas.clipOutRect(i11, i12, i13, i14);
        return clipOutRect;
    }
}
