package androidx.compose.ui.text.android.style;

import android.graphics.Paint;
import android.text.Layout;
import androidx.compose.ui.text.android.TextLayout_androidKt;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class IndentationFixSpan_androidKt {

    @k
    private static final String EllipsisChar = "…";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final float getEllipsizedLeftPadding(@k Layout layout, int i11, @k Paint paint) {
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i11);
        if (!TextLayout_androidKt.isLineEllipsized(layout, i11) || layout.getParagraphDirection(i11) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float primaryHorizontal = (layout.getPrimaryHorizontal(layout.getLineStart(i11) + layout.getEllipsisStart(i11)) - lineLeft) + paint.measureText("…");
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i11);
        if ((paragraphAlignment == null ? -1 : WhenMappings.$EnumSwitchMapping$0[paragraphAlignment.ordinal()]) == 1) {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - primaryHorizontal) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - primaryHorizontal;
        }
        return abs + width;
    }

    public static /* synthetic */ float getEllipsizedLeftPadding$default(Layout layout, int i11, Paint paint, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            paint = layout.getPaint();
        }
        return getEllipsizedLeftPadding(layout, i11, paint);
    }

    public static final float getEllipsizedRightPadding(@k Layout layout, int i11, @k Paint paint) {
        float width;
        float width2;
        if (!TextLayout_androidKt.isLineEllipsized(layout, i11)) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i11) != -1 || layout.getWidth() >= layout.getLineRight(i11)) {
            return 0.0f;
        }
        float lineRight = (layout.getLineRight(i11) - layout.getPrimaryHorizontal(layout.getLineStart(i11) + layout.getEllipsisStart(i11))) + paint.measureText("…");
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i11);
        if ((paragraphAlignment != null ? WhenMappings.$EnumSwitchMapping$0[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i11);
            width2 = (layout.getWidth() - lineRight) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i11);
            width2 = layout.getWidth() - lineRight;
        }
        return width - width2;
    }

    public static /* synthetic */ float getEllipsizedRightPadding$default(Layout layout, int i11, Paint paint, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            paint = layout.getPaint();
        }
        return getEllipsizedRightPadding(layout, i11, paint);
    }
}
