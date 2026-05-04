package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nTouchBoundsExpansion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchBoundsExpansion.kt\nandroidx/compose/ui/node/DpTouchBoundsExpansion\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,248:1\n102#2,5:249\n102#2,5:254\n102#2,5:259\n102#2,5:264\n*S KotlinDebug\n*F\n+ 1 TouchBoundsExpansion.kt\nandroidx/compose/ui/node/DpTouchBoundsExpansion\n*L\n164#1:249,5\n165#1:254,5\n166#1:259,5\n167#1:264,5\n*E\n"})
/* loaded from: classes2.dex */
public final class DpTouchBoundsExpansion {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);
    private final float bottom;
    private final float end;
    private final boolean isLayoutDirectionAware;
    private final float start;
    private final float top;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nTouchBoundsExpansion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchBoundsExpansion.kt\nandroidx/compose/ui/node/DpTouchBoundsExpansion$Companion\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,248:1\n113#2:249\n113#2:250\n113#2:251\n113#2:252\n*S KotlinDebug\n*F\n+ 1 TouchBoundsExpansion.kt\nandroidx/compose/ui/node/DpTouchBoundsExpansion$Companion\n*L\n191#1:249\n192#1:250\n193#1:251\n194#1:252\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: Absolute-a9UjIt4$default, reason: not valid java name */
        public static /* synthetic */ DpTouchBoundsExpansion m4016Absolutea9UjIt4$default(Companion companion, float f11, float f12, float f13, float f14, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f11 = Dp.m5115constructorimpl(0);
            }
            if ((i11 & 2) != 0) {
                f12 = Dp.m5115constructorimpl(0);
            }
            if ((i11 & 4) != 0) {
                f13 = Dp.m5115constructorimpl(0);
            }
            if ((i11 & 8) != 0) {
                f14 = Dp.m5115constructorimpl(0);
            }
            return companion.m4017Absolutea9UjIt4(f11, f12, f13, f14);
        }

        @k
        /* renamed from: Absolute-a9UjIt4, reason: not valid java name */
        public final DpTouchBoundsExpansion m4017Absolutea9UjIt4(float f11, float f12, float f13, float f14) {
            return new DpTouchBoundsExpansion(f11, f12, f13, f14, false, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ DpTouchBoundsExpansion(float f11, float f12, float f13, float f14, boolean z11, v vVar) {
        this(f11, f12, f13, f14, z11);
    }

    /* renamed from: copy-lDy3nrA$default, reason: not valid java name */
    public static /* synthetic */ DpTouchBoundsExpansion m4005copylDy3nrA$default(DpTouchBoundsExpansion dpTouchBoundsExpansion, float f11, float f12, float f13, float f14, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = dpTouchBoundsExpansion.start;
        }
        if ((i11 & 2) != 0) {
            f12 = dpTouchBoundsExpansion.top;
        }
        if ((i11 & 4) != 0) {
            f13 = dpTouchBoundsExpansion.end;
        }
        if ((i11 & 8) != 0) {
            f14 = dpTouchBoundsExpansion.bottom;
        }
        if ((i11 & 16) != 0) {
            z11 = dpTouchBoundsExpansion.isLayoutDirectionAware;
        }
        boolean z12 = z11;
        float f15 = f13;
        return dpTouchBoundsExpansion.m4010copylDy3nrA(f11, f12, f15, f14, z12);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    public final float m4006component1D9Ej5fM() {
        return this.start;
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name */
    public final float m4007component2D9Ej5fM() {
        return this.top;
    }

    /* renamed from: component3-D9Ej5fM, reason: not valid java name */
    public final float m4008component3D9Ej5fM() {
        return this.end;
    }

    /* renamed from: component4-D9Ej5fM, reason: not valid java name */
    public final float m4009component4D9Ej5fM() {
        return this.bottom;
    }

    public final boolean component5() {
        return this.isLayoutDirectionAware;
    }

    @k
    /* renamed from: copy-lDy3nrA, reason: not valid java name */
    public final DpTouchBoundsExpansion m4010copylDy3nrA(float f11, float f12, float f13, float f14, boolean z11) {
        return new DpTouchBoundsExpansion(f11, f12, f13, f14, z11, null);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DpTouchBoundsExpansion)) {
            return false;
        }
        DpTouchBoundsExpansion dpTouchBoundsExpansion = (DpTouchBoundsExpansion) obj;
        return Dp.m5120equalsimpl0(this.start, dpTouchBoundsExpansion.start) && Dp.m5120equalsimpl0(this.top, dpTouchBoundsExpansion.top) && Dp.m5120equalsimpl0(this.end, dpTouchBoundsExpansion.end) && Dp.m5120equalsimpl0(this.bottom, dpTouchBoundsExpansion.bottom) && this.isLayoutDirectionAware == dpTouchBoundsExpansion.isLayoutDirectionAware;
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m4011getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: getEnd-D9Ej5fM, reason: not valid java name */
    public final float m4012getEndD9Ej5fM() {
        return this.end;
    }

    /* renamed from: getStart-D9Ej5fM, reason: not valid java name */
    public final float m4013getStartD9Ej5fM() {
        return this.start;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m4014getTopD9Ej5fM() {
        return this.top;
    }

    public int hashCode() {
        return (((((((Dp.m5121hashCodeimpl(this.start) * 31) + Dp.m5121hashCodeimpl(this.top)) * 31) + Dp.m5121hashCodeimpl(this.end)) * 31) + Dp.m5121hashCodeimpl(this.bottom)) * 31) + Boolean.hashCode(this.isLayoutDirectionAware);
    }

    public final boolean isLayoutDirectionAware() {
        return this.isLayoutDirectionAware;
    }

    /* renamed from: roundToTouchBoundsExpansion-TW6G1oQ, reason: not valid java name */
    public final long m4015roundToTouchBoundsExpansionTW6G1oQ(@k Density density) {
        return TouchBoundsExpansion.m4200constructorimpl(TouchBoundsExpansion.Companion.pack$ui_release(density.mo371roundToPx0680j_4(this.start), density.mo371roundToPx0680j_4(this.top), density.mo371roundToPx0680j_4(this.end), density.mo371roundToPx0680j_4(this.bottom), this.isLayoutDirectionAware));
    }

    @k
    public String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) Dp.m5126toStringimpl(this.start)) + ", top=" + ((Object) Dp.m5126toStringimpl(this.top)) + ", end=" + ((Object) Dp.m5126toStringimpl(this.end)) + ", bottom=" + ((Object) Dp.m5126toStringimpl(this.bottom)) + ", isLayoutDirectionAware=" + this.isLayoutDirectionAware + ')';
    }

    private DpTouchBoundsExpansion(float f11, float f12, float f13, float f14, boolean z11) {
        this.start = f11;
        this.top = f12;
        this.end = f13;
        this.bottom = f14;
        this.isLayoutDirectionAware = z11;
        if (!(f11 >= 0.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("Left must be non-negative");
        }
        if (!(f12 >= 0.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("Top must be non-negative");
        }
        if (!(f13 >= 0.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("Right must be non-negative");
        }
        if (f14 >= 0.0f) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Bottom must be non-negative");
    }
}
