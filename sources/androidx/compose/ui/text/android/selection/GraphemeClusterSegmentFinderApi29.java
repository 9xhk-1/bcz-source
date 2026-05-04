package androidx.compose.ui.text.android.selection;

import android.text.TextPaint;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@RequiresApi(29)
/* loaded from: classes2.dex */
public final class GraphemeClusterSegmentFinderApi29 extends GraphemeClusterSegmentFinder {
    public static final int $stable = 8;

    @k
    private final CharSequence text;

    @k
    private final TextPaint textPaint;

    public GraphemeClusterSegmentFinderApi29(@k CharSequence charSequence, @k TextPaint textPaint) {
        this.text = charSequence;
        this.textPaint = textPaint;
    }

    @Override // androidx.compose.ui.text.android.selection.GraphemeClusterSegmentFinder
    public int next(int i11) {
        int textRunCursor;
        TextPaint textPaint = this.textPaint;
        CharSequence charSequence = this.text;
        textRunCursor = textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i11, 0);
        return textRunCursor;
    }

    @Override // androidx.compose.ui.text.android.selection.GraphemeClusterSegmentFinder
    public int previous(int i11) {
        int textRunCursor;
        TextPaint textPaint = this.textPaint;
        CharSequence charSequence = this.text;
        textRunCursor = textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i11, 2);
        return textRunCursor;
    }
}
