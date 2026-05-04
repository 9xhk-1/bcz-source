package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.RectHelper_androidKt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@RequiresApi(33)
/* loaded from: classes.dex */
public final class CursorAnchorInfoApi33Helper {
    public static final int $stable = 0;

    @m80.k
    public static final CursorAnchorInfoApi33Helper INSTANCE = new CursorAnchorInfoApi33Helper();

    private CursorAnchorInfoApi33Helper() {
    }

    @w00.o
    @m80.k
    public static final CursorAnchorInfo.Builder setEditorBoundsInfo(@m80.k CursorAnchorInfo.Builder builder, @m80.k Rect rect) {
        EditorBoundsInfo.Builder editorBounds;
        EditorBoundsInfo.Builder handwritingBounds;
        EditorBoundsInfo build;
        CursorAnchorInfo.Builder editorBoundsInfo;
        editorBounds = m.a().setEditorBounds(RectHelper_androidKt.toAndroidRectF(rect));
        handwritingBounds = editorBounds.setHandwritingBounds(RectHelper_androidKt.toAndroidRectF(rect));
        build = handwritingBounds.build();
        editorBoundsInfo = builder.setEditorBoundsInfo(build);
        return editorBoundsInfo;
    }
}
