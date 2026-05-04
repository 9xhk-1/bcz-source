package androidx.compose.ui.geometry;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.u0;
import m80.k;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nMutableRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableRect.kt\nandroidx/compose/ui/geometry/MutableRect\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,232:1\n37#1,5:233\n37#1,5:247\n37#1,5:252\n37#1:261\n41#1:270\n37#1,5:275\n41#1:284\n37#1:293\n33#2:238\n53#3,3:239\n60#3:243\n70#3:246\n53#3,3:258\n53#3,3:263\n53#3,3:267\n53#3,3:272\n53#3,3:281\n53#3,3:286\n53#3,3:290\n53#3,3:295\n53#3,3:299\n60#3:303\n70#3:306\n65#4:242\n69#4:245\n65#4:302\n69#4:305\n22#5:244\n22#5:304\n22#5:307\n30#6:257\n30#6:262\n30#6:266\n30#6:271\n30#6:280\n30#6:285\n30#6:289\n30#6:294\n30#6:298\n*S KotlinDebug\n*F\n+ 1 MutableRect.kt\nandroidx/compose/ui/geometry/MutableRect\n*L\n45#1:233,5\n121#1:247,5\n125#1:252,5\n133#1:261\n141#1:270\n150#1:275,5\n154#1:284\n163#1:293\n45#1:238\n45#1:239,3\n69#1:243\n69#1:246\n129#1:258,3\n133#1:263,3\n137#1:267,3\n141#1:272,3\n150#1:281,3\n154#1:286,3\n158#1:290,3\n163#1:295,3\n169#1:299,3\n179#1:303\n180#1:306\n69#1:242\n69#1:245\n179#1:302\n180#1:305\n69#1:244\n179#1:304\n180#1:307\n129#1:257\n133#1:262\n137#1:266\n141#1:271\n150#1:280\n154#1:285\n158#1:289\n163#1:294\n169#1:298\n*E\n"})
/* loaded from: classes.dex */
public final class MutableRect {
    public static final int $stable = 8;
    private float bottom;
    private float left;
    private float right;
    private float top;

    public MutableRect(float f11, float f12, float f13, float f14) {
        this.left = f11;
        this.top = f12;
        this.right = f13;
        this.bottom = f14;
    }

    /* renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m2242containsk4lQ0M(long j11) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
        return (intBitsToFloat >= this.left) & (intBitsToFloat < this.right) & (intBitsToFloat2 >= this.top) & (intBitsToFloat2 < this.bottom);
    }

    public final void deflate(float f11) {
        inflate(-f11);
    }

    public final float getBottom() {
        return this.bottom;
    }

    /* renamed from: getBottomCenter-F1C5BW0, reason: not valid java name */
    public final long m2243getBottomCenterF1C5BW0() {
        float right = this.left + ((getRight() - getLeft()) / 2.0f);
        float f11 = this.bottom;
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(right) << 32));
    }

    /* renamed from: getBottomLeft-F1C5BW0, reason: not valid java name */
    public final long m2244getBottomLeftF1C5BW0() {
        float f11 = this.left;
        float f12 = this.bottom;
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(f12) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32));
    }

    /* renamed from: getBottomRight-F1C5BW0, reason: not valid java name */
    public final long m2245getBottomRightF1C5BW0() {
        float f11 = this.right;
        float f12 = this.bottom;
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(f12) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32));
    }

    /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
    public final long m2246getCenterF1C5BW0() {
        float right = this.left + ((getRight() - getLeft()) / 2.0f);
        float bottom = this.top + ((getBottom() - getTop()) / 2.0f);
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(bottom) & 4294967295L) | (Float.floatToRawIntBits(right) << 32));
    }

    /* renamed from: getCenterLeft-F1C5BW0, reason: not valid java name */
    public final long m2247getCenterLeftF1C5BW0() {
        float f11 = this.left;
        float bottom = this.top + ((getBottom() - getTop()) / 2.0f);
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(bottom) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32));
    }

    /* renamed from: getCenterRight-F1C5BW0, reason: not valid java name */
    public final long m2248getCenterRightF1C5BW0() {
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
    public final long m2249getSizeNHjbRc() {
        float right = getRight() - getLeft();
        float bottom = getBottom() - getTop();
        return Size.m2328constructorimpl((Float.floatToRawIntBits(bottom) & 4294967295L) | (Float.floatToRawIntBits(right) << 32));
    }

    public final float getTop() {
        return this.top;
    }

    /* renamed from: getTopCenter-F1C5BW0, reason: not valid java name */
    public final long m2250getTopCenterF1C5BW0() {
        float right = this.left + ((getRight() - getLeft()) / 2.0f);
        float f11 = this.top;
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(right) << 32));
    }

    /* renamed from: getTopLeft-F1C5BW0, reason: not valid java name */
    public final long m2251getTopLeftF1C5BW0() {
        float f11 = this.left;
        float f12 = this.top;
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(f12) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32));
    }

    /* renamed from: getTopRight-F1C5BW0, reason: not valid java name */
    public final long m2252getTopRightF1C5BW0() {
        float f11 = this.right;
        float f12 = this.top;
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(f12) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32));
    }

    public final float getWidth() {
        return getRight() - getLeft();
    }

    public final void inflate(float f11) {
        this.left -= f11;
        this.top -= f11;
        this.right += f11;
        this.bottom += f11;
    }

    public final void intersect(float f11, float f12, float f13, float f14) {
        this.left = Math.max(f11, this.left);
        this.top = Math.max(f12, this.top);
        this.right = Math.min(f13, this.right);
        this.bottom = Math.min(f14, this.bottom);
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
        return (this.left < rect.getRight()) & (rect.getLeft() < this.right) & (this.top < rect.getBottom()) & (rect.getTop() < this.bottom);
    }

    public final void set(float f11, float f12, float f13, float f14) {
        this.left = f11;
        this.top = f12;
        this.right = f13;
        this.bottom = f14;
    }

    public final void setBottom(float f11) {
        this.bottom = f11;
    }

    public final void setLeft(float f11) {
        this.left = f11;
    }

    public final void setRight(float f11) {
        this.right = f11;
    }

    public final void setTop(float f11) {
        this.top = f11;
    }

    @k
    public String toString() {
        return "MutableRect(" + GeometryUtilsKt.toStringAsFixed(this.left, 1) + j2.O + GeometryUtilsKt.toStringAsFixed(this.top, 1) + j2.O + GeometryUtilsKt.toStringAsFixed(this.right, 1) + j2.O + GeometryUtilsKt.toStringAsFixed(this.bottom, 1) + ')';
    }

    public final void translate(float f11, float f12) {
        this.left += f11;
        this.top += f12;
        this.right += f11;
        this.bottom += f12;
    }

    /* renamed from: translate-k-4lQ0M, reason: not valid java name */
    public final void m2253translatek4lQ0M(long j11) {
        translate(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)));
    }

    public final boolean overlaps(@k MutableRect mutableRect) {
        return this.right > mutableRect.left && mutableRect.right > this.left && this.bottom > mutableRect.top && mutableRect.bottom > this.top;
    }
}
