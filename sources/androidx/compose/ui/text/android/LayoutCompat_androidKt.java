package androidx.compose.ui.text.android;

import android.text.Layout;
import androidx.annotation.IntRange;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class LayoutCompat_androidKt {
    public static final int getLineForOffset(@m80.k Layout layout, @IntRange(from = 0) int i11, boolean z11) {
        if (i11 <= 0) {
            return 0;
        }
        if (i11 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i11);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i11 || lineEnd == i11) {
            if (lineStart == i11) {
                if (z11) {
                    return lineForOffset - 1;
                }
            } else if (!z11) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }
}
