package androidx.compose.ui.text.android;

import android.text.Layout;
import androidx.annotation.IntRange;
import androidx.compose.runtime.internal.StabilityInferred;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u0;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nLayoutHelper.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutHelper.android.kt\nandroidx/compose/ui/text/android/LayoutHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,433:1\n1#2:434\n1627#3,6:435\n1627#3,6:441\n*S KotlinDebug\n*F\n+ 1 LayoutHelper.android.kt\nandroidx/compose/ui/text/android/LayoutHelper\n*L\n283#1:435,6\n324#1:441,6\n*E\n"})
/* loaded from: classes2.dex */
public final class LayoutHelper {
    public static final int $stable = 8;

    @m80.k
    private final boolean[] bidiProcessedParagraphs;

    @m80.k
    private final Layout layout;

    @m80.k
    private final List<Bidi> paragraphBidi;
    private final int paragraphCount;

    @m80.k
    private final List<Integer> paragraphEnds;

    @m80.l
    private char[] tmpBuffer;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class BidiRun {
        public static final int $stable = 0;
        private final int end;
        private final boolean isRtl;
        private final int start;

        public BidiRun(int i11, int i12, boolean z11) {
            this.start = i11;
            this.end = i12;
            this.isRtl = z11;
        }

        public static /* synthetic */ BidiRun copy$default(BidiRun bidiRun, int i11, int i12, boolean z11, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = bidiRun.start;
            }
            if ((i13 & 2) != 0) {
                i12 = bidiRun.end;
            }
            if ((i13 & 4) != 0) {
                z11 = bidiRun.isRtl;
            }
            return bidiRun.copy(i11, i12, z11);
        }

        public final int component1() {
            return this.start;
        }

        public final int component2() {
            return this.end;
        }

        public final boolean component3() {
            return this.isRtl;
        }

        @m80.k
        public final BidiRun copy(int i11, int i12, boolean z11) {
            return new BidiRun(i11, i12, z11);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BidiRun)) {
                return false;
            }
            BidiRun bidiRun = (BidiRun) obj;
            return this.start == bidiRun.start && this.end == bidiRun.end && this.isRtl == bidiRun.isRtl;
        }

        public final int getEnd() {
            return this.end;
        }

        public final int getStart() {
            return this.start;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.start) * 31) + Integer.hashCode(this.end)) * 31) + Boolean.hashCode(this.isRtl);
        }

        public final boolean isRtl() {
            return this.isRtl;
        }

        @m80.k
        public String toString() {
            return "BidiRun(start=" + this.start + ", end=" + this.end + ", isRtl=" + this.isRtl + ')';
        }
    }

    public LayoutHelper(@m80.k Layout layout) {
        this.layout = layout;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        do {
            int I3 = k0.I3(this.layout.getText(), '\n', i11, false, 4, null);
            i11 = I3 < 0 ? this.layout.getText().length() : I3 + 1;
            arrayList.add(Integer.valueOf(i11));
        } while (i11 < this.layout.getText().length());
        this.paragraphEnds = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            arrayList2.add(null);
        }
        this.paragraphBidi = arrayList2;
        this.bidiProcessedParagraphs = new boolean[this.paragraphEnds.size()];
        this.paragraphCount = this.paragraphEnds.size();
    }

    private final float getDownstreamHorizontal(int i11, boolean z11) {
        int B = g10.u.B(i11, this.layout.getLineEnd(this.layout.getLineForOffset(i11)));
        return z11 ? this.layout.getPrimaryHorizontal(B) : this.layout.getSecondaryHorizontal(B);
    }

    public static /* synthetic */ int getParagraphForOffset$default(LayoutHelper layoutHelper, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        return layoutHelper.getParagraphForOffset(i11, z11);
    }

    private final int lineEndToVisibleEnd(int i11, int i12) {
        while (i11 > i12 && isLineEndSpace(this.layout.getText().charAt(i11 - 1))) {
            i11--;
        }
        return i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        if (r3.getRunCount() == 1) goto L21;
     */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.text.Bidi analyzeBidi(int r11) {
        /*
            r10 = this;
            boolean[] r0 = r10.bidiProcessedParagraphs
            boolean r0 = r0[r11]
            if (r0 == 0) goto Lf
            java.util.List<java.text.Bidi> r0 = r10.paragraphBidi
            java.lang.Object r11 = r0.get(r11)
            java.text.Bidi r11 = (java.text.Bidi) r11
            return r11
        Lf:
            r0 = 0
            if (r11 != 0) goto L14
            r1 = r0
            goto L22
        L14:
            java.util.List<java.lang.Integer> r1 = r10.paragraphEnds
            int r2 = r11 + (-1)
            java.lang.Object r1 = r1.get(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
        L22:
            java.util.List<java.lang.Integer> r2 = r10.paragraphEnds
            java.lang.Object r2 = r2.get(r11)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r8 = r2 - r1
            char[] r3 = r10.tmpBuffer
            if (r3 == 0) goto L3a
            int r4 = r3.length
            if (r4 >= r8) goto L38
            goto L3a
        L38:
            r4 = r3
            goto L3d
        L3a:
            char[] r3 = new char[r8]
            goto L38
        L3d:
            android.text.Layout r3 = r10.layout
            java.lang.CharSequence r3 = r3.getText()
            android.text.TextUtils.getChars(r3, r1, r2, r4, r0)
            boolean r0 = java.text.Bidi.requiresBidi(r4, r0, r8)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L60
            boolean r9 = r10.isRtlParagraph(r11)
            java.text.Bidi r3 = new java.text.Bidi
            r6 = 0
            r7 = 0
            r5 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            int r0 = r3.getRunCount()
            if (r0 != r2) goto L61
        L60:
            r3 = r1
        L61:
            java.util.List<java.text.Bidi> r0 = r10.paragraphBidi
            r0.set(r11, r3)
            boolean[] r0 = r10.bidiProcessedParagraphs
            r0[r11] = r2
            if (r3 == 0) goto L73
            char[] r11 = r10.tmpBuffer
            if (r4 != r11) goto L72
            r4 = r1
            goto L73
        L72:
            r4 = r11
        L73:
            r10.tmpBuffer = r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.LayoutHelper.analyzeBidi(int):java.text.Bidi");
    }

    public final float getHorizontalPosition(int i11, boolean z11, boolean z12) {
        int i12 = i11;
        if (!z12) {
            return getDownstreamHorizontal(i11, z11);
        }
        int lineForOffset = LayoutCompat_androidKt.getLineForOffset(this.layout, i12, z12);
        int lineStart = this.layout.getLineStart(lineForOffset);
        int lineEnd = this.layout.getLineEnd(lineForOffset);
        if (i12 != lineStart && i12 != lineEnd) {
            return getDownstreamHorizontal(i11, z11);
        }
        if (i12 == 0 || i12 == this.layout.getText().length()) {
            return getDownstreamHorizontal(i11, z11);
        }
        int paragraphForOffset = getParagraphForOffset(i12, z12);
        boolean isRtlParagraph = isRtlParagraph(paragraphForOffset);
        int lineEndToVisibleEnd = lineEndToVisibleEnd(lineEnd, lineStart);
        int paragraphStart = getParagraphStart(paragraphForOffset);
        int i13 = lineStart - paragraphStart;
        int i14 = lineEndToVisibleEnd - paragraphStart;
        Bidi analyzeBidi = analyzeBidi(paragraphForOffset);
        Bidi createLineBidi = analyzeBidi != null ? analyzeBidi.createLineBidi(i13, i14) : null;
        boolean z13 = false;
        if (createLineBidi == null || createLineBidi.getRunCount() == 1) {
            boolean isRtlCharAt = this.layout.isRtlCharAt(lineStart);
            if (z11 || isRtlParagraph == isRtlCharAt) {
                isRtlParagraph = !isRtlParagraph;
            }
            if (i12 == lineStart) {
                z13 = isRtlParagraph;
            } else if (!isRtlParagraph) {
                z13 = true;
            }
            Layout layout = this.layout;
            return z13 ? layout.getLineLeft(lineForOffset) : layout.getLineRight(lineForOffset);
        }
        int runCount = createLineBidi.getRunCount();
        BidiRun[] bidiRunArr = new BidiRun[runCount];
        for (int i15 = 0; i15 < runCount; i15++) {
            bidiRunArr[i15] = new BidiRun(createLineBidi.getRunStart(i15) + lineStart, createLineBidi.getRunLimit(i15) + lineStart, createLineBidi.getRunLevel(i15) % 2 == 1);
        }
        int runCount2 = createLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i16 = 0; i16 < runCount2; i16++) {
            bArr[i16] = (byte) createLineBidi.getRunLevel(i16);
        }
        Bidi.reorderVisually(bArr, 0, bidiRunArr, 0, runCount);
        int i17 = -1;
        if (i12 == lineStart) {
            int i18 = 0;
            while (true) {
                if (i18 >= runCount) {
                    break;
                }
                if (bidiRunArr[i18].getStart() == i12) {
                    i17 = i18;
                    break;
                }
                i18++;
            }
            BidiRun bidiRun = bidiRunArr[i17];
            if (z11 || isRtlParagraph == bidiRun.isRtl()) {
                isRtlParagraph = !isRtlParagraph;
            }
            return (i17 == 0 && isRtlParagraph) ? this.layout.getLineLeft(lineForOffset) : (i17 != a00.a0.Oe(bidiRunArr) || isRtlParagraph) ? isRtlParagraph ? this.layout.getPrimaryHorizontal(bidiRunArr[i17 - 1].getStart()) : this.layout.getPrimaryHorizontal(bidiRunArr[i17 + 1].getStart()) : this.layout.getLineRight(lineForOffset);
        }
        if (i12 > lineEndToVisibleEnd) {
            i12 = lineEndToVisibleEnd(i12, lineStart);
        }
        int i19 = 0;
        while (true) {
            if (i19 >= runCount) {
                break;
            }
            if (bidiRunArr[i19].getEnd() == i12) {
                i17 = i19;
                break;
            }
            i19++;
        }
        BidiRun bidiRun2 = bidiRunArr[i17];
        if (!z11 && isRtlParagraph != bidiRun2.isRtl()) {
            isRtlParagraph = !isRtlParagraph;
        }
        return (i17 == 0 && isRtlParagraph) ? this.layout.getLineLeft(lineForOffset) : (i17 != a00.a0.Oe(bidiRunArr) || isRtlParagraph) ? isRtlParagraph ? this.layout.getPrimaryHorizontal(bidiRunArr[i17 - 1].getEnd()) : this.layout.getPrimaryHorizontal(bidiRunArr[i17 + 1].getEnd()) : this.layout.getLineRight(lineForOffset);
    }

    @m80.k
    public final Layout getLayout() {
        return this.layout;
    }

    @m80.k
    public final BidiRun[] getLineBidiRuns$ui_text_release(int i11) {
        Bidi createLineBidi;
        int lineStart = this.layout.getLineStart(i11);
        int lineEnd = this.layout.getLineEnd(i11);
        int paragraphForOffset$default = getParagraphForOffset$default(this, lineStart, false, 2, null);
        int paragraphStart = getParagraphStart(paragraphForOffset$default);
        int i12 = lineStart - paragraphStart;
        int i13 = lineEnd - paragraphStart;
        Bidi analyzeBidi = analyzeBidi(paragraphForOffset$default);
        if (analyzeBidi == null || (createLineBidi = analyzeBidi.createLineBidi(i12, i13)) == null) {
            return new BidiRun[]{new BidiRun(lineStart, lineEnd, this.layout.isRtlCharAt(lineStart))};
        }
        int runCount = createLineBidi.getRunCount();
        BidiRun[] bidiRunArr = new BidiRun[runCount];
        for (int i14 = 0; i14 < runCount; i14++) {
            int runStart = createLineBidi.getRunStart(i14) + lineStart;
            int runLimit = createLineBidi.getRunLimit(i14) + lineStart;
            boolean z11 = true;
            if (createLineBidi.getRunLevel(i14) % 2 != 1) {
                z11 = false;
            }
            bidiRunArr[i14] = new BidiRun(runStart, runLimit, z11);
        }
        return bidiRunArr;
    }

    public final int getLineVisibleEnd(int i11) {
        return lineEndToVisibleEnd(this.layout.getLineEnd(i11), this.layout.getLineStart(i11));
    }

    public final int getParagraphCount() {
        return this.paragraphCount;
    }

    public final int getParagraphEnd(@IntRange(from = 0) int i11) {
        return this.paragraphEnds.get(i11).intValue();
    }

    public final int getParagraphForOffset(@IntRange(from = 0) int i11, boolean z11) {
        int A = a00.h0.A(this.paragraphEnds, Integer.valueOf(i11), 0, 0, 6, null);
        int i12 = A < 0 ? -(A + 1) : A + 1;
        if (z11 && i12 > 0) {
            int i13 = i12 - 1;
            if (i11 == this.paragraphEnds.get(i13).intValue()) {
                return i13;
            }
        }
        return i12;
    }

    public final int getParagraphStart(@IntRange(from = 0) int i11) {
        if (i11 == 0) {
            return 0;
        }
        return this.paragraphEnds.get(i11 - 1).intValue();
    }

    public final boolean isLineEndSpace(char c11) {
        if (c11 == ' ' || c11 == '\n' || c11 == 5760) {
            return true;
        }
        return (kotlin.jvm.internal.g0.t(c11, 8192) >= 0 && kotlin.jvm.internal.g0.t(c11, 8202) <= 0 && c11 != 8199) || c11 == 8287 || c11 == 12288;
    }

    public final boolean isRtlParagraph(@IntRange(from = 0) int i11) {
        return this.layout.getParagraphDirection(this.layout.getLineForOffset(getParagraphStart(i11))) == -1;
    }
}
