package androidx.compose.foundation.shape;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.CornerRadius;
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
@u0({"SMAP\nAbsoluteRoundedCornerShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbsoluteRoundedCornerShape.kt\nandroidx/compose/foundation/shape/AbsoluteRoundedCornerShape\n+ 2 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,197:1\n33#2:198\n33#2:202\n33#2:206\n33#2:210\n33#2:214\n53#3,3:199\n53#3,3:203\n53#3,3:207\n53#3,3:211\n53#3,3:215\n*S KotlinDebug\n*F\n+ 1 AbsoluteRoundedCornerShape.kt\nandroidx/compose/foundation/shape/AbsoluteRoundedCornerShape\n*L\n67#1:198\n68#1:202\n69#1:206\n70#1:210\n113#1:214\n67#1:199,3\n68#1:203,3\n69#1:207,3\n70#1:211,3\n113#1:215,3\n*E\n"})
/* loaded from: classes.dex */
public final class AbsoluteRoundedCornerShape extends CornerBasedShape {
    public static final int $stable = 0;

    public AbsoluteRoundedCornerShape(@k CornerSize cornerSize, @k CornerSize cornerSize2, @k CornerSize cornerSize3, @k CornerSize cornerSize4) {
        super(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    /* renamed from: toRadius-Bz7bX_o, reason: not valid java name */
    private final long m1006toRadiusBz7bX_o(float f11) {
        return CornerRadius.m2222constructorimpl((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L));
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    @k
    /* renamed from: createOutline-LjSzlW0 */
    public Outline mo1002createOutlineLjSzlW0(long j11, float f11, float f12, float f13, float f14, @k LayoutDirection layoutDirection) {
        if (f11 + f12 + f13 + f14 == 0.0f) {
            return new Outline.Rectangle(SizeKt.m2358toRectuvyYCjk(j11));
        }
        return new Outline.Rounded(RoundRectKt.m2320RoundRectZAM2FJo(SizeKt.m2358toRectuvyYCjk(j11), CornerRadius.m2222constructorimpl((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L)), CornerRadius.m2222constructorimpl((Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L)), CornerRadius.m2222constructorimpl((Float.floatToRawIntBits(f13) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L)), CornerRadius.m2222constructorimpl((Float.floatToRawIntBits(f14) & 4294967295L) | (Float.floatToRawIntBits(f14) << 32))));
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbsoluteRoundedCornerShape)) {
            return false;
        }
        AbsoluteRoundedCornerShape absoluteRoundedCornerShape = (AbsoluteRoundedCornerShape) obj;
        return g0.g(getTopStart(), absoluteRoundedCornerShape.getTopStart()) && g0.g(getTopEnd(), absoluteRoundedCornerShape.getTopEnd()) && g0.g(getBottomEnd(), absoluteRoundedCornerShape.getBottomEnd()) && g0.g(getBottomStart(), absoluteRoundedCornerShape.getBottomStart());
    }

    public int hashCode() {
        return (((((getTopStart().hashCode() * 31) + getTopEnd().hashCode()) * 31) + getBottomEnd().hashCode()) * 31) + getBottomStart().hashCode();
    }

    @k
    public String toString() {
        return "AbsoluteRoundedCornerShape(topLeft = " + getTopStart() + ", topRight = " + getTopEnd() + ", bottomRight = " + getBottomEnd() + ", bottomLeft = " + getBottomStart() + ')';
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    @k
    public AbsoluteRoundedCornerShape copy(@k CornerSize cornerSize, @k CornerSize cornerSize2, @k CornerSize cornerSize3, @k CornerSize cornerSize4) {
        return new AbsoluteRoundedCornerShape(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }
}
