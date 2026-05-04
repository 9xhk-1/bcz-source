package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nRuler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ruler.kt\nandroidx/compose/ui/layout/HorizontalRuler\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,73:1\n54#2:74\n85#3:75\n53#3,3:77\n70#3:81\n30#4:76\n69#5:80\n22#6:82\n*S KotlinDebug\n*F\n+ 1 Ruler.kt\nandroidx/compose/ui/layout/HorizontalRuler\n*L\n69#1:74\n69#1:75\n69#1:77,3\n70#1:81\n69#1:76\n70#1:80\n70#1:82\n*E\n"})
/* loaded from: classes.dex */
public final class HorizontalRuler extends Ruler {
    public static final int $stable = 0;

    public HorizontalRuler() {
        super(null);
    }

    @Override // androidx.compose.ui.layout.Ruler
    public float calculateCoordinate$ui_release(float f11, @k LayoutCoordinates layoutCoordinates, @k LayoutCoordinates layoutCoordinates2) {
        return Float.intBitsToFloat((int) (layoutCoordinates2.mo3866localPositionOfR5De75A(layoutCoordinates, Offset.m2260constructorimpl((Float.floatToRawIntBits(((int) (layoutCoordinates.mo3865getSizeYbymL2g() >> 32)) / 2.0f) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L))) & 4294967295L));
    }
}
