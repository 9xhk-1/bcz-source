package androidx.compose.foundation.shape;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nAbsoluteCutCornerShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbsoluteCutCornerShape.kt\nandroidx/compose/foundation/shape/AbsoluteCutCornerShape\n+ 2 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,202:1\n57#2:203\n57#2:206\n57#2:209\n61#2:212\n57#2:214\n61#2:217\n61#2:219\n61#2:222\n60#3:204\n60#3:207\n60#3:210\n70#3:213\n60#3:215\n70#3:218\n70#3:220\n70#3:223\n22#4:205\n22#4:208\n22#4:211\n22#4:216\n22#4:221\n22#4:224\n*S KotlinDebug\n*F\n+ 1 AbsoluteCutCornerShape.kt\nandroidx/compose/foundation/shape/AbsoluteCutCornerShape\n*L\n70#1:203\n71#1:206\n73#1:209\n73#1:212\n74#1:214\n74#1:217\n76#1:219\n77#1:222\n70#1:204\n71#1:207\n73#1:210\n73#1:213\n74#1:215\n74#1:218\n76#1:220\n77#1:223\n70#1:205\n71#1:208\n73#1:211\n74#1:216\n76#1:221\n77#1:224\n*E\n"})
/* loaded from: classes.dex */
public final class AbsoluteCutCornerShape extends CornerBasedShape {
    public static final int $stable = 0;

    public AbsoluteCutCornerShape(@k CornerSize cornerSize, @k CornerSize cornerSize2, @k CornerSize cornerSize3, @k CornerSize cornerSize4) {
        super(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    @k
    /* renamed from: createOutline-LjSzlW0, reason: not valid java name */
    public Outline mo1002createOutlineLjSzlW0(long j11, float f11, float f12, float f13, float f14, @k LayoutDirection layoutDirection) {
        if (f11 + f12 + f14 + f13 == 0.0f) {
            return new Outline.Rectangle(SizeKt.m2358toRectuvyYCjk(j11));
        }
        Path Path = AndroidPath_androidKt.Path();
        Path.moveTo(0.0f, f11);
        Path.lineTo(f11, 0.0f);
        int i11 = (int) (j11 >> 32);
        Path.lineTo(Float.intBitsToFloat(i11) - f12, 0.0f);
        Path.lineTo(Float.intBitsToFloat(i11), f12);
        int i12 = (int) (j11 & 4294967295L);
        Path.lineTo(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12) - f13);
        Path.lineTo(Float.intBitsToFloat(i11) - f13, Float.intBitsToFloat(i12));
        Path.lineTo(f14, Float.intBitsToFloat(i12));
        Path.lineTo(0.0f, Float.intBitsToFloat(i12) - f14);
        Path.close();
        return new Outline.Generic(Path);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbsoluteCutCornerShape)) {
            return false;
        }
        AbsoluteCutCornerShape absoluteCutCornerShape = (AbsoluteCutCornerShape) obj;
        return g0.g(getTopStart(), absoluteCutCornerShape.getTopStart()) && g0.g(getTopEnd(), absoluteCutCornerShape.getTopEnd()) && g0.g(getBottomEnd(), absoluteCutCornerShape.getBottomEnd()) && g0.g(getBottomStart(), absoluteCutCornerShape.getBottomStart());
    }

    public int hashCode() {
        return (((((getTopStart().hashCode() * 31) + getTopEnd().hashCode()) * 31) + getBottomEnd().hashCode()) * 31) + getBottomStart().hashCode();
    }

    @k
    public String toString() {
        return "AbsoluteCutCornerShape(topLeft = " + getTopStart() + ", topRight = " + getTopEnd() + ", bottomRight = " + getBottomEnd() + ", bottomLeft = " + getBottomStart() + ')';
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    @k
    public AbsoluteCutCornerShape copy(@k CornerSize cornerSize, @k CornerSize cornerSize2, @k CornerSize cornerSize3, @k CornerSize cornerSize4) {
        return new AbsoluteCutCornerShape(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }
}
