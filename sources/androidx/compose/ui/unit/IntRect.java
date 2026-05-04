package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@u0({"SMAP\nIntRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntRect.kt\nandroidx/compose/ui/unit/IntRect\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,276:1\n30#2:277\n80#3:278\n80#3:280\n80#3:282\n80#3:284\n80#3:286\n80#3:288\n80#3:290\n80#3:292\n80#3:294\n80#3:296\n32#4:279\n32#4:281\n32#4:283\n32#4:285\n32#4:287\n32#4:289\n32#4:291\n32#4:293\n32#4:295\n*S KotlinDebug\n*F\n+ 1 IntRect.kt\nandroidx/compose/ui/unit/IntRect\n*L\n71#1:277\n71#1:278\n139#1:280\n143#1:282\n147#1:284\n151#1:286\n160#1:288\n164#1:290\n168#1:292\n173#1:294\n179#1:296\n139#1:279\n143#1:281\n147#1:283\n151#1:285\n160#1:287\n164#1:289\n168#1:291\n173#1:293\n179#1:295\n*E\n"})
/* loaded from: classes2.dex */
public final class IntRect {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final IntRect Zero = new IntRect(0, 0, 0, 0);
    private final int bottom;
    private final int left;
    private final int right;
    private final int top;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final IntRect getZero() {
            return IntRect.Zero;
        }

        private Companion() {
        }

        @Stable
        public static /* synthetic */ void getZero$annotations() {
        }
    }

    public IntRect(int i11, int i12, int i13, int i14) {
        this.left = i11;
        this.top = i12;
        this.right = i13;
        this.bottom = i14;
    }

    public static /* synthetic */ IntRect copy$default(IntRect intRect, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = intRect.left;
        }
        if ((i15 & 2) != 0) {
            i12 = intRect.top;
        }
        if ((i15 & 4) != 0) {
            i13 = intRect.right;
        }
        if ((i15 & 8) != 0) {
            i14 = intRect.bottom;
        }
        return intRect.copy(i11, i12, i13, i14);
    }

    public final int component1() {
        return this.left;
    }

    public final int component2() {
        return this.top;
    }

    public final int component3() {
        return this.right;
    }

    public final int component4() {
        return this.bottom;
    }

    /* renamed from: contains--gyyYBs, reason: not valid java name */
    public final boolean m5263containsgyyYBs(long j11) {
        return IntOffset.m5243getXimpl(j11) >= this.left && IntOffset.m5243getXimpl(j11) < this.right && IntOffset.m5244getYimpl(j11) >= this.top && IntOffset.m5244getYimpl(j11) < this.bottom;
    }

    @k
    public final IntRect copy(int i11, int i12, int i13, int i14) {
        return new IntRect(i11, i12, i13, i14);
    }

    @Stable
    @k
    public final IntRect deflate(int i11) {
        return inflate(-i11);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntRect)) {
            return false;
        }
        IntRect intRect = (IntRect) obj;
        return this.left == intRect.left && this.top == intRect.top && this.right == intRect.right && this.bottom == intRect.bottom;
    }

    public final int getBottom() {
        return this.bottom;
    }

    /* renamed from: getBottomCenter-nOcc-ac, reason: not valid java name */
    public final long m5264getBottomCenternOccac() {
        return IntOffset.m5237constructorimpl((this.bottom & 4294967295L) | ((this.left + (getWidth() / 2)) << 32));
    }

    /* renamed from: getBottomLeft-nOcc-ac, reason: not valid java name */
    public final long m5265getBottomLeftnOccac() {
        return IntOffset.m5237constructorimpl((this.bottom & 4294967295L) | (this.left << 32));
    }

    /* renamed from: getBottomRight-nOcc-ac, reason: not valid java name */
    public final long m5266getBottomRightnOccac() {
        return IntOffset.m5237constructorimpl((this.bottom & 4294967295L) | (this.right << 32));
    }

    /* renamed from: getCenter-nOcc-ac, reason: not valid java name */
    public final long m5267getCenternOccac() {
        return IntOffset.m5237constructorimpl(((this.top + (getHeight() / 2)) & 4294967295L) | ((this.left + (getWidth() / 2)) << 32));
    }

    /* renamed from: getCenterLeft-nOcc-ac, reason: not valid java name */
    public final long m5268getCenterLeftnOccac() {
        return IntOffset.m5237constructorimpl(((this.top + (getHeight() / 2)) & 4294967295L) | (this.left << 32));
    }

    /* renamed from: getCenterRight-nOcc-ac, reason: not valid java name */
    public final long m5269getCenterRightnOccac() {
        return IntOffset.m5237constructorimpl(((this.top + (getHeight() / 2)) & 4294967295L) | (this.right << 32));
    }

    public final int getHeight() {
        return this.bottom - this.top;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getMaxDimension() {
        return Math.max(Math.abs(getWidth()), Math.abs(getHeight()));
    }

    public final int getMinDimension() {
        return Math.min(Math.abs(getWidth()), Math.abs(getHeight()));
    }

    public final int getRight() {
        return this.right;
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m5270getSizeYbymL2g() {
        return IntSize.m5281constructorimpl((getHeight() & 4294967295L) | (getWidth() << 32));
    }

    public final int getTop() {
        return this.top;
    }

    /* renamed from: getTopCenter-nOcc-ac, reason: not valid java name */
    public final long m5271getTopCenternOccac() {
        return IntOffset.m5237constructorimpl((this.top & 4294967295L) | ((this.left + (getWidth() / 2)) << 32));
    }

    /* renamed from: getTopLeft-nOcc-ac, reason: not valid java name */
    public final long m5272getTopLeftnOccac() {
        return IntOffset.m5237constructorimpl((this.top & 4294967295L) | (this.left << 32));
    }

    /* renamed from: getTopRight-nOcc-ac, reason: not valid java name */
    public final long m5273getTopRightnOccac() {
        return IntOffset.m5237constructorimpl((this.top & 4294967295L) | (this.right << 32));
    }

    public final int getWidth() {
        return this.right - this.left;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.left) * 31) + Integer.hashCode(this.top)) * 31) + Integer.hashCode(this.right)) * 31) + Integer.hashCode(this.bottom);
    }

    @Stable
    @k
    public final IntRect inflate(int i11) {
        return new IntRect(this.left - i11, this.top - i11, this.right + i11, this.bottom + i11);
    }

    @Stable
    @k
    public final IntRect intersect(@k IntRect intRect) {
        return new IntRect(Math.max(this.left, intRect.left), Math.max(this.top, intRect.top), Math.min(this.right, intRect.right), Math.min(this.bottom, intRect.bottom));
    }

    public final boolean isEmpty() {
        return this.left >= this.right || this.top >= this.bottom;
    }

    public final boolean overlaps(@k IntRect intRect) {
        return this.right > intRect.left && intRect.right > this.left && this.bottom > intRect.top && intRect.bottom > this.top;
    }

    @k
    public String toString() {
        return "IntRect.fromLTRB(" + this.left + j2.O + this.top + j2.O + this.right + j2.O + this.bottom + ')';
    }

    @Stable
    @k
    public final IntRect translate(int i11, int i12) {
        return new IntRect(this.left + i11, this.top + i12, this.right + i11, this.bottom + i12);
    }

    @Stable
    @k
    /* renamed from: translate--gyyYBs, reason: not valid java name */
    public final IntRect m5274translategyyYBs(long j11) {
        return new IntRect(this.left + IntOffset.m5243getXimpl(j11), this.top + IntOffset.m5244getYimpl(j11), this.right + IntOffset.m5243getXimpl(j11), this.bottom + IntOffset.m5244getYimpl(j11));
    }

    @Stable
    public static /* synthetic */ void getBottom$annotations() {
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations() {
    }

    @Stable
    public static /* synthetic */ void getLeft$annotations() {
    }

    @Stable
    public static /* synthetic */ void getRight$annotations() {
    }

    @Stable
    /* renamed from: getSize-YbymL2g$annotations, reason: not valid java name */
    public static /* synthetic */ void m5262getSizeYbymL2g$annotations() {
    }

    @Stable
    public static /* synthetic */ void getTop$annotations() {
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations() {
    }

    @Stable
    public static /* synthetic */ void isEmpty$annotations() {
    }
}
