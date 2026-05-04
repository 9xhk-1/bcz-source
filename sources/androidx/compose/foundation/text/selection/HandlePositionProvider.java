package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nSelectionHandles.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionHandles.kt\nandroidx/compose/foundation/text/selection/HandlePositionProvider\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,164:1\n284#2:165\n273#2:166\n*S KotlinDebug\n*F\n+ 1 SelectionHandles.kt\nandroidx/compose/foundation/text/selection/HandlePositionProvider\n*L\n126#1:165\n126#1:166\n*E\n"})
/* loaded from: classes.dex */
public final class HandlePositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;

    @k
    private final Alignment handleReferencePoint;

    @k
    private final OffsetProvider positionProvider;
    private long prevPosition = Offset.Companion.m2284getZeroF1C5BW0();

    public HandlePositionProvider(@k Alignment alignment, @k OffsetProvider offsetProvider) {
        this.handleReferencePoint = alignment;
        this.positionProvider = offsetProvider;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo346calculatePositionllwVHH4(@k IntRect intRect, long j11, @k LayoutDirection layoutDirection, long j12) {
        long mo1028provideF1C5BW0 = this.positionProvider.mo1028provideF1C5BW0();
        if ((9223372034707292159L & mo1028provideF1C5BW0) == InlineClassHelperKt.UnspecifiedPackedFloats) {
            mo1028provideF1C5BW0 = this.prevPosition;
        }
        this.prevPosition = mo1028provideF1C5BW0;
        return IntOffset.m5247plusqkQi6aY(IntOffset.m5247plusqkQi6aY(intRect.m5272getTopLeftnOccac(), IntOffsetKt.m5260roundk4lQ0M(mo1028provideF1C5BW0)), this.handleReferencePoint.mo2085alignKFBX0sM(j12, IntSize.Companion.m5291getZeroYbymL2g(), layoutDirection));
    }
}
