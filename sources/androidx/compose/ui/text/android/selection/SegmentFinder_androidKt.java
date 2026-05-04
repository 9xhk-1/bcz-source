package androidx.compose.ui.text.android.selection;

import android.os.Build;
import android.text.TextPaint;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class SegmentFinder_androidKt {
    @k
    public static final SegmentFinder createGraphemeClusterSegmentFinder(@k CharSequence charSequence, @k TextPaint textPaint) {
        return Build.VERSION.SDK_INT >= 29 ? new GraphemeClusterSegmentFinderApi29(charSequence, textPaint) : new GraphemeClusterSegmentFinderUnderApi29(charSequence);
    }
}
