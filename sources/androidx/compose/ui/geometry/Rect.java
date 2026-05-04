package androidx.compose.ui.geometry;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@u0({"SMAP\nRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rect.kt\nandroidx/compose/ui/geometry/Rect\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,287:1\n56#1,6:288\n56#1,6:303\n56#1,6:309\n56#1:319\n61#1:328\n56#1,6:333\n61#1:343\n56#1:352\n33#2:294\n53#3,3:295\n60#3:299\n70#3:302\n53#3,3:316\n53#3,3:321\n53#3,3:325\n53#3,3:330\n53#3,3:340\n53#3,3:345\n53#3,3:349\n53#3,3:354\n53#3,3:358\n60#3:362\n70#3:365\n65#4:298\n69#4:301\n65#4:361\n69#4:364\n22#5:300\n22#5:363\n22#5:366\n30#6:315\n30#6:320\n30#6:324\n30#6:329\n30#6:339\n30#6:344\n30#6:348\n30#6:353\n30#6:357\n*S KotlinDebug\n*F\n+ 1 Rect.kt\nandroidx/compose/ui/geometry/Rect\n*L\n66#1:288,6\n161#1:303,6\n165#1:309,6\n173#1:319\n181#1:328\n190#1:333,6\n194#1:343\n203#1:352\n66#1:294\n66#1:295,3\n100#1:299\n100#1:302\n169#1:316,3\n173#1:321,3\n177#1:325,3\n181#1:330,3\n190#1:340,3\n194#1:345,3\n198#1:349,3\n203#1:354,3\n209#1:358,3\n219#1:362\n220#1:365\n100#1:298\n100#1:301\n219#1:361\n220#1:364\n100#1:300\n219#1:363\n220#1:366\n169#1:315\n173#1:320\n177#1:324\n181#1:329\n190#1:339\n194#1:344\n198#1:348\n203#1:353\n209#1:357\n*E\n"})
/* loaded from: classes.dex */
public final class Rect {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final Rect Zero = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
    private final float bottom;
    private final float left;
    private final float right;
    private final float top;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final Rect getZero() {
            return Rect.Zero;
        }

        private Companion() {
        }

        @Stable
        public static /* synthetic */ void getZero$annotations() {
        }
    }

    public Rect(float f11, float f12, float f13, float f14) {
        this.left = f11;
        this.top = f12;
        this.right = f13;
        this.bottom = f14;
    }

    public static /* synthetic */ Rect copy$default(Rect rect, float f11, float f12, float f13, float f14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = rect.left;
        }
        if ((i11 & 2) != 0) {
            f12 = rect.top;
        }
        if ((i11 & 4) != 0) {
            f13 = rect.right;
        }
        if ((i11 & 8) != 0) {
            f14 = rect.bottom;
        }
        return rect.copy(f11, f12, f13, f14);
    }

    public final float component1() {
        return this.left;
    }

    public final float component2() {
        return this.top;
    }

    public final float component3() {
        return this.right;
    }

    public final float component4() {
        return this.bottom;
    }

    /* renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m2294containsk4lQ0M(long j11) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
        return (intBitsToFloat >= this.left) & (intBitsToFloat < this.right) & (intBitsToFloat2 >= this.top) & (intBitsToFloat2 < this.bottom);
    }

    @k
    public final Rect copy(float f11, float f12, float f13, float f14) {
        return new Rect(f11, f12, f13, f14);
    }

    @Stable
    @k
    public final Rect deflate(float f11) {
        return inflate(-f11);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rect)) {
            return false;
        }
        Rect rect = (Rect) obj;
        return Float.compare(this.left, rect.left) == 0 && Float.compare(this.top, rect.top) == 0 && Float.compare(this.right, rect.right) == 0 && Float.compare(this.bottom, rect.bottom) == 0;
    }

    public final float getBottom() {
        return this.bottom;
    }

    /* renamed from: getBottomCenter-F1C5BW0, reason: not valid java name */
    public final long m2295getBottomCenterF1C5BW0() {
        float right = this.left + ((getRight() - getLeft()) / 2.0f);
        float f11 = this.bottom;
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(right) << 32));
    }

    /* renamed from: getBottomLeft-F1C5BW0, reason: not valid java name */
    public final long m2296getBottomLeftF1C5BW0() {
        float f11 = this.left;
        float f12 = this.bottom;
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(f12) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32));
    }

    /* renamed from: getBottomRight-F1C5BW0, reason: not valid java name */
    public final long m2297getBottomRightF1C5BW0() {
        float f11 = this.right;
        float f12 = this.bottom;
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(f12) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32));
    }

    /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
    public final long m2298getCenterF1C5BW0() {
        float right = this.left + ((getRight() - getLeft()) / 2.0f);
        float bottom = this.top + ((getBottom() - getTop()) / 2.0f);
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(bottom) & 4294967295L) | (Float.floatToRawIntBits(right) << 32));
    }

    /* renamed from: getCenterLeft-F1C5BW0, reason: not valid java name */
    public final long m2299getCenterLeftF1C5BW0() {
        float f11 = this.left;
        float bottom = this.top + ((getBottom() - getTop()) / 2.0f);
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(bottom) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32));
    }

    /* renamed from: getCenterRight-F1C5BW0, reason: not valid java name */
    public final long m2300getCenterRightF1C5BW0() {
        float f11 = this.right;
        float bottom = this.top + ((getBottom() - getTop()) / 2.0f);
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(bottom) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32));
    }

    public final float getHeight() {
        return getBottom() - getTop();
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getMaxDimension() {
        return Math.max(Math.abs(getRight() - getLeft()), Math.abs(getBottom() - getTop()));
    }

    public final float getMinDimension() {
        return Math.min(Math.abs(getRight() - getLeft()), Math.abs(getBottom() - getTop()));
    }

    public final float getRight() {
        return this.right;
    }

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m2301getSizeNHjbRc() {
        float right = getRight() - getLeft();
        float bottom = getBottom() - getTop();
        return Size.m2328constructorimpl((Float.floatToRawIntBits(bottom) & 4294967295L) | (Float.floatToRawIntBits(right) << 32));
    }

    public final float getTop() {
        return this.top;
    }

    /* renamed from: getTopCenter-F1C5BW0, reason: not valid java name */
    public final long m2302getTopCenterF1C5BW0() {
        float right = this.left + ((getRight() - getLeft()) / 2.0f);
        float f11 = this.top;
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(right) << 32));
    }

    /* renamed from: getTopLeft-F1C5BW0, reason: not valid java name */
    public final long m2303getTopLeftF1C5BW0() {
        float f11 = this.left;
        float f12 = this.top;
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(f12) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32));
    }

    /* renamed from: getTopRight-F1C5BW0, reason: not valid java name */
    public final long m2304getTopRightF1C5BW0() {
        float f11 = this.right;
        float f12 = this.top;
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(f12) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32));
    }

    public final float getWidth() {
        return getRight() - getLeft();
    }

    public int hashCode() {
        return (((((Float.hashCode(this.left) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.right)) * 31) + Float.hashCode(this.bottom);
    }

    @Stable
    @k
    public final Rect inflate(float f11) {
        return new Rect(this.left - f11, this.top - f11, this.right + f11, this.bottom + f11);
    }

    @Stable
    @k
    public final Rect intersect(@k Rect rect) {
        return new Rect(Math.max(this.left, rect.left), Math.max(this.top, rect.top), Math.min(this.right, rect.right), Math.min(this.bottom, rect.bottom));
    }

    public final boolean isEmpty() {
        return (this.left >= this.right) | (this.top >= this.bottom);
    }

    public final boolean isFinite() {
        return ((Float.floatToRawIntBits(this.left) & Integer.MAX_VALUE) < 2139095040) & ((Float.floatToRawIntBits(this.top) & Integer.MAX_VALUE) < 2139095040) & ((Float.floatToRawIntBits(this.right) & Integer.MAX_VALUE) < 2139095040) & ((Integer.MAX_VALUE & Float.floatToRawIntBits(this.bottom)) < 2139095040);
    }

    public final boolean isInfinite() {
        return (this.left == Float.POSITIVE_INFINITY) | (this.top == Float.POSITIVE_INFINITY) | (this.right == Float.POSITIVE_INFINITY) | (this.bottom == Float.POSITIVE_INFINITY);
    }

    public final boolean overlaps(@k Rect rect) {
        return (this.left < rect.right) & (rect.left < this.right) & (this.top < rect.bottom) & (rect.top < this.bottom);
    }

    @k
    public String toString() {
        return "Rect.fromLTRB(" + GeometryUtilsKt.toStringAsFixed(this.left, 1) + j2.O + GeometryUtilsKt.toStringAsFixed(this.top, 1) + j2.O + GeometryUtilsKt.toStringAsFixed(this.right, 1) + j2.O + GeometryUtilsKt.toStringAsFixed(this.bottom, 1) + ')';
    }

    @Stable
    @k
    public final Rect translate(float f11, float f12) {
        return new Rect(this.left + f11, this.top + f12, this.right + f11, this.bottom + f12);
    }

    @Stable
    @k
    /* renamed from: translate-k-4lQ0M, reason: not valid java name */
    public final Rect m2305translatek4lQ0M(long j11) {
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        return new Rect(this.left + Float.intBitsToFloat(i11), this.top + Float.intBitsToFloat(i12), this.right + Float.intBitsToFloat(i11), this.bottom + Float.intBitsToFloat(i12));
    }

    @Stable
    @k
    public final Rect intersect(float f11, float f12, float f13, float f14) {
        return new Rect(Math.max(this.left, f11), Math.max(this.top, f12), Math.min(this.right, f13), Math.min(this.bottom, f14));
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
    /* renamed from: getSize-NH-jbRc$annotations, reason: not valid java name */
    public static /* synthetic */ void m2293getSizeNHjbRc$annotations() {
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

    @Stable
    public static /* synthetic */ void isFinite$annotations() {
    }

    @Stable
    public static /* synthetic */ void isInfinite$annotations() {
    }
}
