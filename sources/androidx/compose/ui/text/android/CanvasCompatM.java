package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(23)
/* loaded from: classes2.dex */
final class CanvasCompatM {

    @m80.k
    public static final CanvasCompatM INSTANCE = new CanvasCompatM();

    private CanvasCompatM() {
    }

    public final void drawTextRun(@m80.k Canvas canvas, @m80.k char[] cArr, int i11, int i12, int i13, int i14, float f11, float f12, boolean z11, @m80.k Paint paint) {
        canvas.drawTextRun(cArr, i11, i12, i13, i14, f11, f12, z11, paint);
    }

    public final void drawTextRun(@m80.k Canvas canvas, @m80.k CharSequence charSequence, int i11, int i12, int i13, int i14, float f11, float f12, boolean z11, @m80.k Paint paint) {
        canvas.drawTextRun(charSequence, i11, i12, i13, i14, f11, f12, z11, paint);
    }
}
