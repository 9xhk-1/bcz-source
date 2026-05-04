package androidx.compose.ui.text.android.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.android.TextLayout_androidKt;
import kotlin.jvm.internal.g0;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class IndentationFixSpan implements LeadingMarginSpan {
    public static final int $stable = 0;

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(@l Canvas canvas, @l Paint paint, int i11, int i12, int i13, int i14, int i15, @l CharSequence charSequence, int i16, int i17, boolean z11, @l Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i16)) != layout.getLineCount() - 1 || !TextLayout_androidKt.isLineEllipsized(layout, lineForOffset)) {
            return;
        }
        float ellipsizedLeftPadding = IndentationFixSpan_androidKt.getEllipsizedLeftPadding(layout, lineForOffset, paint) + IndentationFixSpan_androidKt.getEllipsizedRightPadding(layout, lineForOffset, paint);
        if (ellipsizedLeftPadding == 0.0f) {
            return;
        }
        g0.m(canvas);
        canvas.translate(ellipsizedLeftPadding, 0.0f);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z11) {
        return 0;
    }
}
