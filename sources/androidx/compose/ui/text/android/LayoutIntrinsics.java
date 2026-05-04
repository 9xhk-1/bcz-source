package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import androidx.compose.runtime.internal.StabilityInferred;
import java.text.BreakIterator;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import kotlin.Pair;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nLayoutIntrinsics.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutIntrinsics.android.kt\nandroidx/compose/ui/text/android/LayoutIntrinsics\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,227:1\n1#2:228\n*E\n"})
/* loaded from: classes2.dex */
public final class LayoutIntrinsics {
    public static final int $stable = 8;

    @m80.l
    private BoringLayout.Metrics _boringMetrics;

    @m80.l
    private CharSequence _charSequenceForIntrinsicWidth;
    private float _maxIntrinsicWidth = Float.NaN;
    private float _minIntrinsicWidth = Float.NaN;
    private boolean boringMetricsIsInit;

    @m80.k
    private final CharSequence charSequence;
    private final int textDirectionHeuristic;

    @m80.k
    private final TextPaint textPaint;

    public LayoutIntrinsics(@m80.k CharSequence charSequence, @m80.k TextPaint textPaint, int i11) {
        this.charSequence = charSequence;
        this.textPaint = textPaint;
        this.textDirectionHeuristic = i11;
    }

    private final float computeMaxIntrinsicWidth() {
        boolean shouldIncreaseMaxIntrinsic;
        BoringLayout.Metrics boringMetrics = getBoringMetrics();
        float f11 = boringMetrics != null ? boringMetrics.width : -1;
        if (f11 < 0.0f) {
            f11 = (float) Math.ceil(getDesiredWidth$default(this, 0, 0, 3, null));
        }
        shouldIncreaseMaxIntrinsic = LayoutIntrinsics_androidKt.shouldIncreaseMaxIntrinsic(f11, this.charSequence, this.textPaint);
        return shouldIncreaseMaxIntrinsic ? f11 + 0.5f : f11;
    }

    private final float computeMinIntrinsicWidth() {
        BreakIterator lineInstance = BreakIterator.getLineInstance(this.textPaint.getTextLocale());
        CharSequence charSequence = this.charSequence;
        int i11 = 0;
        lineInstance.setText(new CharSequenceCharacterIterator(charSequence, 0, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new Comparator() { // from class: androidx.compose.ui.text.android.z
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int computeMinIntrinsicWidth$lambda$1;
                computeMinIntrinsicWidth$lambda$1 = LayoutIntrinsics.computeMinIntrinsicWidth$lambda$1((Pair) obj, (Pair) obj2);
                return computeMinIntrinsicWidth$lambda$1;
            }
        });
        int next = lineInstance.next();
        while (true) {
            int i12 = i11;
            i11 = next;
            if (i11 == -1) {
                break;
            }
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new Pair(Integer.valueOf(i12), Integer.valueOf(i11)));
            } else {
                Pair pair = (Pair) priorityQueue.peek();
                if (pair != null && ((Number) pair.getSecond()).intValue() - ((Number) pair.getFirst()).intValue() < i11 - i12) {
                    priorityQueue.poll();
                    priorityQueue.add(new Pair(Integer.valueOf(i12), Integer.valueOf(i11)));
                }
            }
            next = lineInstance.next();
        }
        if (priorityQueue.isEmpty()) {
            return 0.0f;
        }
        Iterator it = priorityQueue.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Pair pair2 = (Pair) it.next();
        float desiredWidth = getDesiredWidth(((Number) pair2.component1()).intValue(), ((Number) pair2.component2()).intValue());
        while (it.hasNext()) {
            Pair pair3 = (Pair) it.next();
            desiredWidth = Math.max(desiredWidth, getDesiredWidth(((Number) pair3.component1()).intValue(), ((Number) pair3.component2()).intValue()));
        }
        return desiredWidth;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int computeMinIntrinsicWidth$lambda$1(Pair pair, Pair pair2) {
        return (((Number) pair.getSecond()).intValue() - ((Number) pair.getFirst()).intValue()) - (((Number) pair2.getSecond()).intValue() - ((Number) pair2.getFirst()).intValue());
    }

    private final CharSequence getCharSequenceForIntrinsicWidth() {
        boolean z11;
        CharSequence stripNonMetricAffectingCharacterStyleSpans;
        CharSequence charSequence = this._charSequenceForIntrinsicWidth;
        if (charSequence != null) {
            kotlin.jvm.internal.g0.m(charSequence);
            return charSequence;
        }
        z11 = LayoutIntrinsics_androidKt.stripNonMetricAffectingCharSpans;
        if (!z11) {
            return this.charSequence;
        }
        stripNonMetricAffectingCharacterStyleSpans = LayoutIntrinsics_androidKt.stripNonMetricAffectingCharacterStyleSpans(this.charSequence);
        this._charSequenceForIntrinsicWidth = stripNonMetricAffectingCharacterStyleSpans;
        return stripNonMetricAffectingCharacterStyleSpans;
    }

    private final float getDesiredWidth(int i11, int i12) {
        return Layout.getDesiredWidth(getCharSequenceForIntrinsicWidth(), i11, i12, this.textPaint);
    }

    public static /* synthetic */ float getDesiredWidth$default(LayoutIntrinsics layoutIntrinsics, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = layoutIntrinsics.getCharSequenceForIntrinsicWidth().length();
        }
        return layoutIntrinsics.getDesiredWidth(i11, i12);
    }

    @m80.l
    public final BoringLayout.Metrics getBoringMetrics() {
        if (!this.boringMetricsIsInit) {
            this._boringMetrics = BoringLayoutFactory.INSTANCE.measure(this.charSequence, this.textPaint, TextLayout_androidKt.getTextDirectionHeuristic(this.textDirectionHeuristic));
            this.boringMetricsIsInit = true;
        }
        return this._boringMetrics;
    }

    public final float getMaxIntrinsicWidth() {
        if (!Float.isNaN(this._maxIntrinsicWidth)) {
            return this._maxIntrinsicWidth;
        }
        float computeMaxIntrinsicWidth = computeMaxIntrinsicWidth();
        this._maxIntrinsicWidth = computeMaxIntrinsicWidth;
        return computeMaxIntrinsicWidth;
    }

    public final float getMinIntrinsicWidth() {
        if (!Float.isNaN(this._minIntrinsicWidth)) {
            return this._minIntrinsicWidth;
        }
        float computeMinIntrinsicWidth = computeMinIntrinsicWidth();
        this._minIntrinsicWidth = computeMinIntrinsicWidth;
        return computeMinIntrinsicWidth;
    }
}
