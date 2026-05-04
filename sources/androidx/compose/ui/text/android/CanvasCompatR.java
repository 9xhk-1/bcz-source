package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(30)
/* loaded from: classes2.dex */
final class CanvasCompatR {

    @m80.k
    public static final CanvasCompatR INSTANCE = new CanvasCompatR();

    private CanvasCompatR() {
    }

    public final boolean quickReject(@m80.k Canvas canvas, @m80.k RectF rectF) {
        boolean quickReject;
        quickReject = canvas.quickReject(rectF);
        return quickReject;
    }

    public final boolean quickReject(@m80.k Canvas canvas, @m80.k Path path) {
        boolean quickReject;
        quickReject = canvas.quickReject(path);
        return quickReject;
    }

    public final boolean quickReject(@m80.k Canvas canvas, float f11, float f12, float f13, float f14) {
        boolean quickReject;
        quickReject = canvas.quickReject(f11, f12, f13, f14);
        return quickReject;
    }
}
