package androidx.compose.ui.text.input;

import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.text.input.internal.m;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import m80.k;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(33)
/* loaded from: classes2.dex */
final class CursorAnchorInfoApi33Helper {

    @k
    public static final CursorAnchorInfoApi33Helper INSTANCE = new CursorAnchorInfoApi33Helper();

    private CursorAnchorInfoApi33Helper() {
    }

    @o
    @k
    public static final CursorAnchorInfo.Builder setEditorBoundsInfo(@k CursorAnchorInfo.Builder builder, @k Rect rect) {
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
