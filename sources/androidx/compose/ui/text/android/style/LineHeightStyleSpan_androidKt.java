package androidx.compose.ui.text.android.style;

import android.graphics.Paint;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class LineHeightStyleSpan_androidKt {
    public static final int lineHeight(@k Paint.FontMetricsInt fontMetricsInt) {
        return fontMetricsInt.descent - fontMetricsInt.ascent;
    }
}
