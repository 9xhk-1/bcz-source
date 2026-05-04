package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@u0({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpRect\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,434:1\n49#2:435\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpRect\n*L\n415#1:435\n*E\n"})
/* loaded from: classes2.dex */
public final class DpRect {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);
    private final float bottom;
    private final float left;
    private final float right;
    private final float top;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ DpRect(float f11, float f12, float f13, float f14, v vVar) {
        this(f11, f12, f13, f14);
    }

    /* renamed from: copy-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ DpRect m5187copya9UjIt4$default(DpRect dpRect, float f11, float f12, float f13, float f14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = dpRect.left;
        }
        if ((i11 & 2) != 0) {
            f12 = dpRect.top;
        }
        if ((i11 & 4) != 0) {
            f13 = dpRect.right;
        }
        if ((i11 & 8) != 0) {
            f14 = dpRect.bottom;
        }
        return dpRect.m5196copya9UjIt4(f11, f12, f13, f14);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    public final float m5192component1D9Ej5fM() {
        return this.left;
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name */
    public final float m5193component2D9Ej5fM() {
        return this.top;
    }

    /* renamed from: component3-D9Ej5fM, reason: not valid java name */
    public final float m5194component3D9Ej5fM() {
        return this.right;
    }

    /* renamed from: component4-D9Ej5fM, reason: not valid java name */
    public final float m5195component4D9Ej5fM() {
        return this.bottom;
    }

    @k
    /* renamed from: copy-a9UjIt4, reason: not valid java name */
    public final DpRect m5196copya9UjIt4(float f11, float f12, float f13, float f14) {
        return new DpRect(f11, f12, f13, f14, null);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DpRect)) {
            return false;
        }
        DpRect dpRect = (DpRect) obj;
        return Dp.m5120equalsimpl0(this.left, dpRect.left) && Dp.m5120equalsimpl0(this.top, dpRect.top) && Dp.m5120equalsimpl0(this.right, dpRect.right) && Dp.m5120equalsimpl0(this.bottom, dpRect.bottom);
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m5197getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: getLeft-D9Ej5fM, reason: not valid java name */
    public final float m5198getLeftD9Ej5fM() {
        return this.left;
    }

    /* renamed from: getRight-D9Ej5fM, reason: not valid java name */
    public final float m5199getRightD9Ej5fM() {
        return this.right;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m5200getTopD9Ej5fM() {
        return this.top;
    }

    public int hashCode() {
        return (((((Dp.m5121hashCodeimpl(this.left) * 31) + Dp.m5121hashCodeimpl(this.top)) * 31) + Dp.m5121hashCodeimpl(this.right)) * 31) + Dp.m5121hashCodeimpl(this.bottom);
    }

    @k
    public String toString() {
        return "DpRect(left=" + ((Object) Dp.m5126toStringimpl(this.left)) + ", top=" + ((Object) Dp.m5126toStringimpl(this.top)) + ", right=" + ((Object) Dp.m5126toStringimpl(this.right)) + ", bottom=" + ((Object) Dp.m5126toStringimpl(this.bottom)) + ')';
    }

    public /* synthetic */ DpRect(long j11, long j12, v vVar) {
        this(j11, j12);
    }

    private DpRect(float f11, float f12, float f13, float f14) {
        this.left = f11;
        this.top = f12;
        this.right = f13;
        this.bottom = f14;
    }

    private DpRect(long j11, long j12) {
        this(DpOffset.m5176getXD9Ej5fM(j11), DpOffset.m5178getYD9Ej5fM(j11), Dp.m5115constructorimpl(DpOffset.m5176getXD9Ej5fM(j11) + DpSize.m5213getWidthD9Ej5fM(j12)), Dp.m5115constructorimpl(DpOffset.m5178getYD9Ej5fM(j11) + DpSize.m5211getHeightD9Ej5fM(j12)), null);
    }

    @Stable
    /* renamed from: getBottom-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m5188getBottomD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getLeft-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m5189getLeftD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getRight-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m5190getRightD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getTop-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m5191getTopD9Ej5fM$annotations() {
    }
}
