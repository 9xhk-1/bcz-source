package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.text.TextRange;
import g10.u;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nMultiParagraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/ParagraphInfo\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,1227:1\n65#2:1228\n69#2:1231\n60#3:1229\n70#3:1232\n53#3,3:1234\n53#3,3:1238\n53#3,3:1242\n53#3,3:1246\n22#4:1230\n30#5:1233\n30#5:1237\n30#5:1241\n30#5:1245\n*S KotlinDebug\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/ParagraphInfo\n*L\n1183#1:1228\n1183#1:1231\n1183#1:1229\n1183#1:1232\n1183#1:1234,3\n1191#1:1238,3\n1199#1:1242,3\n1209#1:1246,3\n1183#1:1230\n1183#1:1233\n1191#1:1237\n1199#1:1241\n1209#1:1245\n*E\n"})
/* loaded from: classes2.dex */
public final class ParagraphInfo {
    public static final int $stable = 8;
    private float bottom;
    private final int endIndex;
    private int endLineIndex;

    @k
    private final Paragraph paragraph;
    private final int startIndex;
    private int startLineIndex;
    private float top;

    public ParagraphInfo(@k Paragraph paragraph, int i11, int i12, int i13, int i14, float f11, float f12) {
        this.paragraph = paragraph;
        this.startIndex = i11;
        this.endIndex = i12;
        this.startLineIndex = i13;
        this.endLineIndex = i14;
        this.top = f11;
        this.bottom = f12;
    }

    public static /* synthetic */ ParagraphInfo copy$default(ParagraphInfo paragraphInfo, Paragraph paragraph, int i11, int i12, int i13, int i14, float f11, float f12, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            paragraph = paragraphInfo.paragraph;
        }
        if ((i15 & 2) != 0) {
            i11 = paragraphInfo.startIndex;
        }
        if ((i15 & 4) != 0) {
            i12 = paragraphInfo.endIndex;
        }
        if ((i15 & 8) != 0) {
            i13 = paragraphInfo.startLineIndex;
        }
        if ((i15 & 16) != 0) {
            i14 = paragraphInfo.endLineIndex;
        }
        if ((i15 & 32) != 0) {
            f11 = paragraphInfo.top;
        }
        if ((i15 & 64) != 0) {
            f12 = paragraphInfo.bottom;
        }
        float f13 = f11;
        float f14 = f12;
        int i16 = i14;
        int i17 = i12;
        return paragraphInfo.copy(paragraph, i11, i17, i13, i16, f13, f14);
    }

    /* renamed from: toGlobal-xdX6-G0$default, reason: not valid java name */
    public static /* synthetic */ long m4423toGlobalxdX6G0$default(ParagraphInfo paragraphInfo, long j11, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return paragraphInfo.m4424toGlobalxdX6G0(j11, z11);
    }

    @k
    public final Paragraph component1() {
        return this.paragraph;
    }

    public final int component2() {
        return this.startIndex;
    }

    public final int component3() {
        return this.endIndex;
    }

    public final int component4() {
        return this.startLineIndex;
    }

    public final int component5() {
        return this.endLineIndex;
    }

    public final float component6() {
        return this.top;
    }

    public final float component7() {
        return this.bottom;
    }

    @k
    public final ParagraphInfo copy(@k Paragraph paragraph, int i11, int i12, int i13, int i14, float f11, float f12) {
        return new ParagraphInfo(paragraph, i11, i12, i13, i14, f11, f12);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParagraphInfo)) {
            return false;
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) obj;
        return g0.g(this.paragraph, paragraphInfo.paragraph) && this.startIndex == paragraphInfo.startIndex && this.endIndex == paragraphInfo.endIndex && this.startLineIndex == paragraphInfo.startLineIndex && this.endLineIndex == paragraphInfo.endLineIndex && Float.compare(this.top, paragraphInfo.top) == 0 && Float.compare(this.bottom, paragraphInfo.bottom) == 0;
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final int getEndIndex() {
        return this.endIndex;
    }

    public final int getEndLineIndex() {
        return this.endLineIndex;
    }

    public final int getLength() {
        return this.endIndex - this.startIndex;
    }

    @k
    public final Paragraph getParagraph() {
        return this.paragraph;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public final int getStartLineIndex() {
        return this.startLineIndex;
    }

    public final float getTop() {
        return this.top;
    }

    public int hashCode() {
        return (((((((((((this.paragraph.hashCode() * 31) + Integer.hashCode(this.startIndex)) * 31) + Integer.hashCode(this.endIndex)) * 31) + Integer.hashCode(this.startLineIndex)) * 31) + Integer.hashCode(this.endLineIndex)) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.bottom);
    }

    public final void setBottom(float f11) {
        this.bottom = f11;
    }

    public final void setEndLineIndex(int i11) {
        this.endLineIndex = i11;
    }

    public final void setStartLineIndex(int i11) {
        this.startLineIndex = i11;
    }

    public final void setTop(float f11) {
        this.top = f11;
    }

    @k
    public final Rect toGlobal(@k Rect rect) {
        float f11 = this.top;
        return rect.m2305translatek4lQ0M(Offset.m2260constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L)));
    }

    /* renamed from: toGlobal-xdX6-G0, reason: not valid java name */
    public final long m4424toGlobalxdX6G0(long j11, boolean z11) {
        if (z11) {
            TextRange.Companion companion = TextRange.Companion;
            if (TextRange.m4552equalsimpl0(j11, companion.m4564getZerod9O1mEE())) {
                return companion.m4564getZerod9O1mEE();
            }
        }
        return TextRangeKt.TextRange(toGlobalIndex(TextRange.m4559getStartimpl(j11)), toGlobalIndex(TextRange.m4554getEndimpl(j11)));
    }

    public final int toGlobalIndex(int i11) {
        return i11 + this.startIndex;
    }

    public final int toGlobalLineIndex(int i11) {
        return i11 + this.startLineIndex;
    }

    public final float toGlobalYPosition(float f11) {
        return f11 + this.top;
    }

    @k
    public final Rect toLocal(@k Rect rect) {
        float f11 = -this.top;
        return rect.m2305translatek4lQ0M(Offset.m2260constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L)));
    }

    /* renamed from: toLocal-MK-Hz9U, reason: not valid java name */
    public final long m4425toLocalMKHz9U(long j11) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) - this.top;
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
    }

    public final int toLocalIndex(int i11) {
        return u.I(i11, this.startIndex, this.endIndex) - this.startIndex;
    }

    public final int toLocalLineIndex(int i11) {
        return i11 - this.startLineIndex;
    }

    public final float toLocalYPosition(float f11) {
        return f11 - this.top;
    }

    @k
    public String toString() {
        return "ParagraphInfo(paragraph=" + this.paragraph + ", startIndex=" + this.startIndex + ", endIndex=" + this.endIndex + ", startLineIndex=" + this.startLineIndex + ", endLineIndex=" + this.endLineIndex + ", top=" + this.top + ", bottom=" + this.bottom + ')';
    }

    @k
    public final Path toGlobal(@k Path path) {
        float f11 = this.top;
        path.mo2404translatek4lQ0M(Offset.m2260constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L)));
        return path;
    }

    public /* synthetic */ ParagraphInfo(Paragraph paragraph, int i11, int i12, int i13, int i14, float f11, float f12, int i15, v vVar) {
        this(paragraph, i11, i12, (i15 & 8) != 0 ? -1 : i13, (i15 & 16) != 0 ? -1 : i14, (i15 & 32) != 0 ? -1.0f : f11, (i15 & 64) != 0 ? -1.0f : f12);
    }
}
