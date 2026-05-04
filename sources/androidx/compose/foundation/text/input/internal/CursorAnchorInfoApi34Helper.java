package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.CursorAnchorInfo;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@RequiresApi(34)
/* loaded from: classes.dex */
public final class CursorAnchorInfoApi34Helper {
    public static final int $stable = 0;

    @m80.k
    public static final CursorAnchorInfoApi34Helper INSTANCE = new CursorAnchorInfoApi34Helper();

    private CursorAnchorInfoApi34Helper() {
    }

    @w00.o
    @m80.k
    public static final CursorAnchorInfo.Builder addVisibleLineBounds(@m80.k CursorAnchorInfo.Builder builder, @m80.k TextLayoutResult textLayoutResult, @m80.k Rect rect) {
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
