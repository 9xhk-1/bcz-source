package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@u0({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesImpl\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/layout/internal/InlineClassHelperKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,472:1\n92#2,5:473\n113#3:478\n113#3:479\n113#3:480\n113#3:481\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesImpl\n*L\n299#1:473,5\n292#1:478\n293#1:479\n294#1:480\n295#1:481\n*E\n"})
/* loaded from: classes.dex */
public final class PaddingValuesImpl implements PaddingValues {
    public static final int $stable = 0;
    private final float bottom;
    private final float end;
    private final float start;
    private final float top;

    public /* synthetic */ PaddingValuesImpl(float f11, float f12, float f13, float f14, v vVar) {
        this(f11, f12, f13, f14);
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateBottomPadding-D9Ej5fM */
    public float mo675calculateBottomPaddingD9Ej5fM() {
        return this.bottom;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateLeftPadding-u2uoSUM */
    public float mo676calculateLeftPaddingu2uoSUM(@m80.k LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? this.start : this.end;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateRightPadding-u2uoSUM */
    public float mo677calculateRightPaddingu2uoSUM(@m80.k LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? this.end : this.start;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateTopPadding-D9Ej5fM */
    public float mo678calculateTopPaddingD9Ej5fM() {
        return this.top;
    }

    public boolean equals(@l Object obj) {
        if (!(obj instanceof PaddingValuesImpl)) {
            return false;
        }
        PaddingValuesImpl paddingValuesImpl = (PaddingValuesImpl) obj;
        return Dp.m5120equalsimpl0(this.start, paddingValuesImpl.start) && Dp.m5120equalsimpl0(this.top, paddingValuesImpl.top) && Dp.m5120equalsimpl0(this.end, paddingValuesImpl.end) && Dp.m5120equalsimpl0(this.bottom, paddingValuesImpl.bottom);
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m747getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: getEnd-D9Ej5fM, reason: not valid java name */
    public final float m748getEndD9Ej5fM() {
        return this.end;
    }

    /* renamed from: getStart-D9Ej5fM, reason: not valid java name */
    public final float m749getStartD9Ej5fM() {
        return this.start;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m750getTopD9Ej5fM() {
        return this.top;
    }

    public int hashCode() {
        return (((((Dp.m5121hashCodeimpl(this.start) * 31) + Dp.m5121hashCodeimpl(this.top)) * 31) + Dp.m5121hashCodeimpl(this.end)) * 31) + Dp.m5121hashCodeimpl(this.bottom);
    }

    @m80.k
    public String toString() {
        return "PaddingValues(start=" + ((Object) Dp.m5126toStringimpl(this.start)) + ", top=" + ((Object) Dp.m5126toStringimpl(this.top)) + ", end=" + ((Object) Dp.m5126toStringimpl(this.end)) + ", bottom=" + ((Object) Dp.m5126toStringimpl(this.bottom)) + ')';
    }

    private PaddingValuesImpl(float f11, float f12, float f13, float f14) {
        this.start = f11;
        this.top = f12;
        this.end = f13;
        this.bottom = f14;
        if (!((f11 >= 0.0f) & (f12 >= 0.0f) & (f13 >= 0.0f)) || !(f14 >= 0.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("Padding must be non-negative");
        }
    }

    public /* synthetic */ PaddingValuesImpl(float f11, float f12, float f13, float f14, int i11, v vVar) {
        this((i11 & 1) != 0 ? Dp.m5115constructorimpl(0) : f11, (i11 & 2) != 0 ? Dp.m5115constructorimpl(0) : f12, (i11 & 4) != 0 ? Dp.m5115constructorimpl(0) : f13, (i11 & 8) != 0 ? Dp.m5115constructorimpl(0) : f14, null);
    }

    @Stable
    /* renamed from: getBottom-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m743getBottomD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getEnd-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m744getEndD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getStart-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m745getStartD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getTop-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m746getTopD9Ej5fM$annotations() {
    }
}
