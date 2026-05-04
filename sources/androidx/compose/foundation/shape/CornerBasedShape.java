package androidx.compose.foundation.shape;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nCornerBasedShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CornerBasedShape.kt\nandroidx/compose/foundation/shape/CornerBasedShape\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,119:1\n96#2,5:120\n*S KotlinDebug\n*F\n+ 1 CornerBasedShape.kt\nandroidx/compose/foundation/shape/CornerBasedShape\n*L\n62#1:120,5\n*E\n"})
/* loaded from: classes.dex */
public abstract class CornerBasedShape implements Shape {
    public static final int $stable = 0;

    @k
    private final CornerSize bottomEnd;

    @k
    private final CornerSize bottomStart;

    @k
    private final CornerSize topEnd;

    @k
    private final CornerSize topStart;

    public CornerBasedShape(@k CornerSize cornerSize, @k CornerSize cornerSize2, @k CornerSize cornerSize3, @k CornerSize cornerSize4) {
        this.topStart = cornerSize;
        this.topEnd = cornerSize2;
        this.bottomEnd = cornerSize3;
        this.bottomStart = cornerSize4;
    }

    public static /* synthetic */ CornerBasedShape copy$default(CornerBasedShape cornerBasedShape, CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i11 & 1) != 0) {
            cornerSize = cornerBasedShape.topStart;
        }
        if ((i11 & 2) != 0) {
            cornerSize2 = cornerBasedShape.topEnd;
        }
        if ((i11 & 4) != 0) {
            cornerSize3 = cornerBasedShape.bottomEnd;
        }
        if ((i11 & 8) != 0) {
            cornerSize4 = cornerBasedShape.bottomStart;
        }
        return cornerBasedShape.copy(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    @k
    public final CornerBasedShape copy(@k CornerSize cornerSize) {
        return copy(cornerSize, cornerSize, cornerSize, cornerSize);
    }

    @k
    public abstract CornerBasedShape copy(@k CornerSize cornerSize, @k CornerSize cornerSize2, @k CornerSize cornerSize3, @k CornerSize cornerSize4);

    @k
    /* renamed from: createOutline-LjSzlW0 */
    public abstract Outline mo1002createOutlineLjSzlW0(long j11, float f11, float f12, float f13, float f14, @k LayoutDirection layoutDirection);

    @Override // androidx.compose.ui.graphics.Shape
    @k
    /* renamed from: createOutline-Pq9zytI */
    public final Outline mo291createOutlinePq9zytI(long j11, @k LayoutDirection layoutDirection, @k Density density) {
        float mo1010toPxTmRCtEA = this.topStart.mo1010toPxTmRCtEA(j11, density);
        float mo1010toPxTmRCtEA2 = this.topEnd.mo1010toPxTmRCtEA(j11, density);
        float mo1010toPxTmRCtEA3 = this.bottomEnd.mo1010toPxTmRCtEA(j11, density);
        float mo1010toPxTmRCtEA4 = this.bottomStart.mo1010toPxTmRCtEA(j11, density);
        float m2336getMinDimensionimpl = Size.m2336getMinDimensionimpl(j11);
        float f11 = mo1010toPxTmRCtEA + mo1010toPxTmRCtEA4;
        if (f11 > m2336getMinDimensionimpl) {
            float f12 = m2336getMinDimensionimpl / f11;
            mo1010toPxTmRCtEA *= f12;
            mo1010toPxTmRCtEA4 *= f12;
        }
        float f13 = mo1010toPxTmRCtEA2 + mo1010toPxTmRCtEA3;
        if (f13 > m2336getMinDimensionimpl) {
            float f14 = m2336getMinDimensionimpl / f13;
            mo1010toPxTmRCtEA2 *= f14;
            mo1010toPxTmRCtEA3 *= f14;
        }
        if (!(mo1010toPxTmRCtEA >= 0.0f && mo1010toPxTmRCtEA2 >= 0.0f && mo1010toPxTmRCtEA3 >= 0.0f && mo1010toPxTmRCtEA4 >= 0.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("Corner size in Px can't be negative(topStart = " + mo1010toPxTmRCtEA + ", topEnd = " + mo1010toPxTmRCtEA2 + ", bottomEnd = " + mo1010toPxTmRCtEA3 + ", bottomStart = " + mo1010toPxTmRCtEA4 + ")!");
        }
        return mo1002createOutlineLjSzlW0(j11, mo1010toPxTmRCtEA, mo1010toPxTmRCtEA2, mo1010toPxTmRCtEA3, mo1010toPxTmRCtEA4, layoutDirection);
    }

    @k
    public final CornerSize getBottomEnd() {
        return this.bottomEnd;
    }

    @k
    public final CornerSize getBottomStart() {
        return this.bottomStart;
    }

    @k
    public final CornerSize getTopEnd() {
        return this.topEnd;
    }

    @k
    public final CornerSize getTopStart() {
        return this.topStart;
    }
}
