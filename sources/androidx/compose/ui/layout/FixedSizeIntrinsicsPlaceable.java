package androidx.compose.ui.layout;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/FixedSizeIntrinsicsPlaceable\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,415:1\n30#2:416\n80#3:417\n*S KotlinDebug\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/FixedSizeIntrinsicsPlaceable\n*L\n259#1:416\n259#1:417\n*E\n"})
/* loaded from: classes.dex */
final class FixedSizeIntrinsicsPlaceable extends Placeable {
    public FixedSizeIntrinsicsPlaceable(int i11, int i12) {
        m3919setMeasuredSizeozmzZPI(IntSize.m5281constructorimpl((i12 & 4294967295L) | (i11 << 32)));
    }

    @Override // androidx.compose.ui.layout.Measured
    public int get(@k AlignmentLine alignmentLine) {
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno, reason: not valid java name */
    public void mo3858placeAtf8xVGno(long j11, float f11, @l x00.l<? super GraphicsLayerScope, g2> lVar) {
    }
}
