package androidx.compose.ui.graphics;

import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(29)
/* loaded from: classes.dex */
final class CanvasZHelper {

    @m80.k
    public static final CanvasZHelper INSTANCE = new CanvasZHelper();

    private CanvasZHelper() {
    }

    public final void enableZ(@m80.k android.graphics.Canvas canvas, boolean z11) {
        if (z11) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
