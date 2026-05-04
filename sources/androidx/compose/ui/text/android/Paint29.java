package androidx.compose.ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(29)
/* loaded from: classes2.dex */
final class Paint29 {

    @m80.k
    public static final Paint29 INSTANCE = new Paint29();

    private Paint29() {
    }

    @w00.o
    public static final void getTextBounds(@m80.k Paint paint, @m80.k CharSequence charSequence, int i11, int i12, @m80.k Rect rect) {
        paint.getTextBounds(charSequence, i11, i12, rect);
    }
}
