package androidx.compose.ui.text.input;

import android.view.inputmethod.CursorAnchorInfo;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import m80.k;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(34)
/* loaded from: classes2.dex */
final class CursorAnchorInfoApi34Helper {

    @k
    public static final CursorAnchorInfoApi34Helper INSTANCE = new CursorAnchorInfoApi34Helper();

    private CursorAnchorInfoApi34Helper() {
    }

    @o
    @k
    public static final CursorAnchorInfo.Builder addVisibleLineBounds(@k CursorAnchorInfo.Builder builder, @k TextLayoutResult textLayoutResult, @k Rect rect) {
        int lineForVerticalPosition;
        int lineForVerticalPosition2;
        if (!rect.isEmpty() && (lineForVerticalPosition = textLayoutResult.getLineForVerticalPosition(rect.getTop())) <= (lineForVerticalPosition2 = textLayoutResult.getLineForVerticalPosition(rect.getBottom()))) {
            while (true) {
                builder.addVisibleLineBounds(textLayoutResult.getLineLeft(lineForVerticalPosition), textLayoutResult.getLineTop(lineForVerticalPosition), textLayoutResult.getLineRight(lineForVerticalPosition), textLayoutResult.getLineBottom(lineForVerticalPosition));
                if (lineForVerticalPosition == lineForVerticalPosition2) {
                    break;
                }
                lineForVerticalPosition++;
            }
        }
        return builder;
    }
}
