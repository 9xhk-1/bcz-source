package androidx.compose.foundation;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nClipScrollableContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClipScrollableContainer.kt\nandroidx/compose/foundation/VerticalScrollableClipShape\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,99:1\n1#2:100\n57#3:101\n61#3:104\n60#4:102\n70#4:105\n22#5:103\n22#5:106\n*S KotlinDebug\n*F\n+ 1 ClipScrollableContainer.kt\nandroidx/compose/foundation/VerticalScrollableClipShape\n*L\n93#1:101\n94#1:104\n93#1:102\n94#1:105\n93#1:103\n94#1:106\n*E\n"})
/* loaded from: classes.dex */
final class VerticalScrollableClipShape implements Shape {

    @m80.k
    public static final VerticalScrollableClipShape INSTANCE = new VerticalScrollableClipShape();

    private VerticalScrollableClipShape() {
    }

    @Override // androidx.compose.ui.graphics.Shape
    @m80.k
    /* renamed from: createOutline-Pq9zytI */
    public Outline mo291createOutlinePq9zytI(long j11, @m80.k LayoutDirection layoutDirection, @m80.k Density density) {
        float mo371roundToPx0680j_4 = density.mo371roundToPx0680j_4(ClipScrollableContainerKt.getMaxSupportedElevation());
        return new Outline.Rectangle(new Rect(-mo371roundToPx0680j_4, 0.0f, Float.intBitsToFloat((int) (j11 >> 32)) + mo371roundToPx0680j_4, Float.intBitsToFloat((int) (j11 & 4294967295L))));
    }
}
