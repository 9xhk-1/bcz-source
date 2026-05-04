package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nOffsetMappingCalculator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OffsetMappingCalculator.kt\nandroidx/compose/foundation/text/input/internal/OffsetMappingCalculator\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 OffsetMappingCalculator.kt\nandroidx/compose/foundation/text/input/internal/OpArray\n*L\n1#1,419:1\n96#2,5:420\n395#3,21:425\n*S KotlinDebug\n*F\n+ 1 OffsetMappingCalculator.kt\nandroidx/compose/foundation/text/input/internal/OffsetMappingCalculator\n*L\n266#1:420,5\n302#1:425,21\n*E\n"})
/* loaded from: classes.dex */
public final class OffsetMappingCalculator {
    public static final int $stable = 8;

    @m80.k
    private int[] ops = OpArray.m1265constructorimpl(10);
    private int opsSize;

    /* renamed from: map-fzxv0v0, reason: not valid java name */
    private final long m1260mapfzxv0v0(int i11, boolean z11) {
        int i12;
        int i13;
        int[] iArr = this.ops;
        int i14 = this.opsSize;
        if (i14 >= 0) {
            if (z11) {
                int i15 = 0;
                i13 = i11;
                while (i15 < i14) {
                    int i16 = i15 * 3;
                    int i17 = iArr[i16];
                    int i18 = iArr[i16 + 1];
                    int i19 = iArr[i16 + 2];
                    long m1261mapStepC6uMEY = m1261mapStepC6uMEY(i13, i17, i18, i19, z11);
                    long m1261mapStepC6uMEY2 = m1261mapStepC6uMEY(i11, i17, i18, i19, z11);
                    int min = Math.min(TextRange.m4559getStartimpl(m1261mapStepC6uMEY), TextRange.m4559getStartimpl(m1261mapStepC6uMEY2));
                    int max = Math.max(TextRange.m4554getEndimpl(m1261mapStepC6uMEY), TextRange.m4554getEndimpl(m1261mapStepC6uMEY2));
                    i15++;
                    i13 = min;
                    i11 = max;
                }
            } else {
                int i21 = i14 - 1;
                i13 = i11;
                while (-1 < i21) {
                    int i22 = i21 * 3;
                    int i23 = iArr[i22];
                    int i24 = iArr[i22 + 1];
                    int i25 = iArr[i22 + 2];
                    boolean z12 = z11;
                    long m1261mapStepC6uMEY3 = m1261mapStepC6uMEY(i13, i23, i24, i25, z12);
                    long m1261mapStepC6uMEY4 = m1261mapStepC6uMEY(i11, i23, i24, i25, z12);
                    i13 = Math.min(TextRange.m4559getStartimpl(m1261mapStepC6uMEY3), TextRange.m4559getStartimpl(m1261mapStepC6uMEY4));
                    i11 = Math.max(TextRange.m4554getEndimpl(m1261mapStepC6uMEY3), TextRange.m4554getEndimpl(m1261mapStepC6uMEY4));
                    i21--;
                    z11 = z12;
                }
            }
            i12 = i11;
            i11 = i13;
        } else {
            i12 = i11;
        }
        return TextRangeKt.TextRange(i11, i12);
    }

    /* renamed from: mapStep-C6u-MEY, reason: not valid java name */
    private final long m1261mapStepC6uMEY(int i11, int i12, int i13, int i14, boolean z11) {
        int i15 = z11 ? i13 : i14;
        if (z11) {
            i13 = i14;
        }
        return i11 < i12 ? TextRangeKt.TextRange(i11) : i11 == i12 ? i15 == 0 ? TextRangeKt.TextRange(i12, i13 + i12) : TextRangeKt.TextRange(i12) : i11 < i12 + i15 ? i13 == 0 ? TextRangeKt.TextRange(i12) : TextRangeKt.TextRange(i12, i13 + i12) : TextRangeKt.TextRange((i11 - i15) + i13);
    }

    /* renamed from: mapFromDest--jx7JFs, reason: not valid java name */
    public final long m1262mapFromDestjx7JFs(int i11) {
        return m1260mapfzxv0v0(i11, false);
    }

    /* renamed from: mapFromSource--jx7JFs, reason: not valid java name */
    public final long m1263mapFromSourcejx7JFs(int i11) {
        return m1260mapfzxv0v0(i11, true);
    }

    public final void recordEditOperation(int i11, int i12, int i13) {
        if (!(i13 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("Expected newLen to be ≥ 0, was " + i13);
        }
        int min = Math.min(i11, i12);
        int max = Math.max(min, i12) - min;
        if (max >= 2 || max != i13) {
            int i14 = this.opsSize + 1;
            if (i14 > OpArray.m1272getSizeimpl(this.ops)) {
                this.ops = OpArray.m1267copyOfpSmdads(this.ops, Math.max(i14 * 2, OpArray.m1272getSizeimpl(this.ops) * 2));
            }
            OpArray.m1274setimpl(this.ops, this.opsSize, min, max, i13);
            this.opsSize = i14;
        }
    }
}
