package androidx.compose.foundation.shape;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nRoundedCornerShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoundedCornerShape.kt\nandroidx/compose/foundation/shape/RoundedCornerShape\n+ 2 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,201:1\n33#2:202\n33#2:206\n33#2:210\n33#2:214\n53#3,3:203\n53#3,3:207\n53#3,3:211\n53#3,3:215\n*S KotlinDebug\n*F\n+ 1 RoundedCornerShape.kt\nandroidx/compose/foundation/shape/RoundedCornerShape\n*L\n69#1:202\n70#1:206\n72#1:210\n74#1:214\n69#1:203,3\n70#1:207,3\n72#1:211,3\n74#1:215,3\n*E\n"})
/* loaded from: classes.dex */
public final class RoundedCornerShape extends CornerBasedShape {
    public static final int $stable = 0;

    public RoundedCornerShape(@k CornerSize cornerSize, @k CornerSize cornerSize2, @k CornerSize cornerSize3, @k CornerSize cornerSize4) {
        super(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    @k
    /* renamed from: createOutline-LjSzlW0 */
    public Outline mo1002createOutlineLjSzlW0(long j11, float f11, float f12, float f13, float f14, @k LayoutDirection layoutDirection) {
        if (f11 + f12 + f13 + f14 == 0.0f) {
            return new Outline.Rectangle(SizeKt.m2358toRectuvyYCjk(j11));
        }
        Rect m2358toRectuvyYCjk = SizeKt.m2358toRectuvyYCjk(j11);
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        float f15 = layoutDirection == layoutDirection2 ? f11 : f12;
        long m2222constructorimpl = CornerRadius.m2222constructorimpl((Float.floatToRawIntBits(f15) << 32) | (Float.floatToRawIntBits(f15) & 4294967295L));
        float f16 = layoutDirection == layoutDirection2 ? f12 : f11;
        long m2222constructorimpl2 = CornerRadius.m2222constructorimpl((Float.floatToRawIntBits(f16) & 4294967295L) | (Float.floatToRawIntBits(f16) << 32));
        float f17 = layoutDirection == layoutDirection2 ? f13 : f14;
        long m2222constructorimpl3 = CornerRadius.m2222constructorimpl((Float.floatToRawIntBits(f17) << 32) | (Float.floatToRawIntBits(f17) & 4294967295L));
        float f18 = layoutDirection == layoutDirection2 ? f14 : f13;
        return new Outline.Rounded(RoundRectKt.m2320RoundRectZAM2FJo(m2358toRectuvyYCjk, m2222constructorimpl, m2222constructorimpl2, m2222constructorimpl3, CornerRadius.m2222constructorimpl((Float.floatToRawIntBits(f18) & 4294967295L) | (Float.floatToRawIntBits(f18) << 32))));
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoundedCornerShape)) {
            return false;
        }
        RoundedCornerShape roundedCornerShape = (RoundedCornerShape) obj;
        return g0.g(getTopStart(), roundedCornerShape.getTopStart()) && g0.g(getTopEnd(), roundedCornerShape.getTopEnd()) && g0.g(getBottomEnd(), roundedCornerShape.getBottomEnd()) && g0.g(getBottomStart(), roundedCornerShape.getBottomStart());
    }

    public int hashCode() {
        return (((((getTopStart().hashCode() * 31) + getTopEnd().hashCode()) * 31) + getBottomEnd().hashCode()) * 31) + getBottomStart().hashCode();
    }

    @k
    public String toString() {
        return "RoundedCornerShape(topStart = " + getTopStart() + ", topEnd = " + getTopEnd() + ", bottomEnd = " + getBottomEnd() + ", bottomStart = " + getBottomStart() + ')';
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    @k
    public RoundedCornerShape copy(@k CornerSize cornerSize, @k CornerSize cornerSize2, @k CornerSize cornerSize3, @k CornerSize cornerSize4) {
        return new RoundedCornerShape(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }
}
