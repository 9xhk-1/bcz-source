package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.BezierKt;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@u0({"SMAP\nEasing.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Easing.kt\nandroidx/compose/animation/core/CubicBezierEasing\n+ 2 Preconditions.kt\nandroidx/compose/animation/core/PreconditionsKt\n+ 3 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n+ 4 PackingHelpers.jvm.kt\nandroidx/collection/internal/PackingHelpers_jvmKt\n+ 5 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,179:1\n33#2,5:180\n51#3:185\n55#3:187\n22#4:186\n22#4:188\n65#5,10:189\n*S KotlinDebug\n*F\n+ 1 Easing.kt\nandroidx/compose/animation/core/CubicBezierEasing\n*L\n114#1:180,5\n119#1:185\n120#1:187\n119#1:186\n120#1:188\n153#1:189,10\n*E\n"})
/* loaded from: classes.dex */
public final class CubicBezierEasing implements Easing {
    public static final int $stable = 0;

    /* renamed from: a, reason: collision with root package name */
    private final float f4093a;

    /* renamed from: b, reason: collision with root package name */
    private final float f4094b;

    /* renamed from: c, reason: collision with root package name */
    private final float f4095c;

    /* renamed from: d, reason: collision with root package name */
    private final float f4096d;
    private final float max;
    private final float min;

    public CubicBezierEasing(float f11, float f12, float f13, float f14) {
        this.f4093a = f11;
        this.f4094b = f12;
        this.f4095c = f13;
        this.f4096d = f14;
        if (!((Float.isNaN(f11) || Float.isNaN(f12) || Float.isNaN(f13) || Float.isNaN(f14)) ? false : true)) {
            PreconditionsKt.throwIllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f11 + j2.O + f12 + j2.O + f13 + j2.O + f14 + '.');
        }
        long computeCubicVerticalBounds = BezierKt.computeCubicVerticalBounds(0.0f, f12, f14, 1.0f, new float[5], 0);
        this.min = Float.intBitsToFloat((int) (computeCubicVerticalBounds >> 32));
        this.max = Float.intBitsToFloat((int) (computeCubicVerticalBounds & 4294967295L));
    }

    private final void throwNoSolution(float f11) {
        throw new IllegalArgumentException("The cubic curve with parameters (" + this.f4093a + j2.O + this.f4094b + j2.O + this.f4095c + j2.O + this.f4096d + ") has no solution at " + f11);
    }

    public boolean equals(@l Object obj) {
        if (!(obj instanceof CubicBezierEasing)) {
            return false;
        }
        CubicBezierEasing cubicBezierEasing = (CubicBezierEasing) obj;
        return this.f4093a == cubicBezierEasing.f4093a && this.f4094b == cubicBezierEasing.f4094b && this.f4095c == cubicBezierEasing.f4095c && this.f4096d == cubicBezierEasing.f4096d;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f4093a) * 31) + Float.hashCode(this.f4094b)) * 31) + Float.hashCode(this.f4095c)) * 31) + Float.hashCode(this.f4096d);
    }

    @k
    public String toString() {
        return "CubicBezierEasing(a=" + this.f4093a + ", b=" + this.f4094b + ", c=" + this.f4095c + ", d=" + this.f4096d + ')';
    }

    @Override // androidx.compose.animation.core.Easing
    public float transform(float f11) {
        if (f11 > 0.0f && f11 < 1.0f) {
            float max = Math.max(f11, 1.1920929E-7f);
            float findFirstCubicRoot = BezierKt.findFirstCubicRoot(0.0f - max, this.f4093a - max, this.f4095c - max, 1.0f - max);
            if (Float.isNaN(findFirstCubicRoot)) {
                throwNoSolution(f11);
            }
            f11 = BezierKt.evaluateCubic(this.f4094b, this.f4096d, findFirstCubicRoot);
            float f12 = this.min;
            float f13 = this.max;
            if (f11 < f12) {
                f11 = f12;
            }
            if (f11 > f13) {
                return f13;
            }
        }
        return f11;
    }
}
