package androidx.compose.ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.VisibleForTesting;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class PaintExtensions_androidKt {
    private static final void extendWith(Rect rect, Rect rect2) {
        rect.right += rect2.width();
        rect.top = Math.min(rect.top, rect2.top);
        rect.bottom = Math.max(rect.bottom, rect2.bottom);
    }

    private static final void fillStringBounds(Paint paint, CharSequence charSequence, int i11, int i12, Rect rect) {
        if (Build.VERSION.SDK_INT >= 29) {
            Paint29.getTextBounds(paint, charSequence, i11, i12, rect);
        } else {
            paint.getTextBounds(charSequence.toString(), i11, i12, rect);
        }
    }

    @m80.k
    public static final Rect getCharSequenceBounds(@m80.k TextPaint textPaint, @m80.k CharSequence charSequence, int i11, int i12) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (SpannedExtensions_androidKt.hasSpan(spanned, MetricAffectingSpan.class, i11, i12)) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i11 < i12) {
                    int nextSpanTransition = spanned.nextSpanTransition(i11, i12, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i11, nextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    fillStringBounds(textPaint2, charSequence, i11, nextSpanTransition, rect2);
                    extendWith(rect, rect2);
                    i11 = nextSpanTransition;
                }
                return rect;
            }
        }
        return getStringBounds(textPaint, charSequence, i11, i12);
    }

    @VisibleForTesting
    @m80.k
    public static final Rect getStringBounds(@m80.k Paint paint, @m80.k CharSequence charSequence, int i11, int i12) {
        Rect rect = new Rect();
        fillStringBounds(paint, charSequence, i11, i12, rect);
        return rect;
    }
}
