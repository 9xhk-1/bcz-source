package androidx.compose.ui.window;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nPopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Popup.kt\nandroidx/compose/ui/window/AlignmentOffsetPositionProvider\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,150:1\n32#2:151\n80#3:152\n*S KotlinDebug\n*F\n+ 1 Popup.kt\nandroidx/compose/ui/window/AlignmentOffsetPositionProvider\n*L\n95#1:151\n95#1:152\n*E\n"})
/* loaded from: classes2.dex */
public final class AlignmentOffsetPositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;

    @k
    private final Alignment alignment;
    private final long offset;

    public /* synthetic */ AlignmentOffsetPositionProvider(Alignment alignment, long j11, v vVar) {
        this(alignment, j11);
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo346calculatePositionllwVHH4(@k IntRect intRect, long j11, @k LayoutDirection layoutDirection, long j12) {
        Alignment alignment = this.alignment;
        IntSize.Companion companion = IntSize.Companion;
        return IntOffset.m5247plusqkQi6aY(IntOffset.m5247plusqkQi6aY(IntOffset.m5247plusqkQi6aY(intRect.m5272getTopLeftnOccac(), alignment.mo2085alignKFBX0sM(companion.m5291getZeroYbymL2g(), intRect.m5270getSizeYbymL2g(), layoutDirection)), IntOffset.m5251unaryMinusnOccac(this.alignment.mo2085alignKFBX0sM(companion.m5291getZeroYbymL2g(), j12, layoutDirection))), IntOffset.m5237constructorimpl(((IntOffset.m5243getXimpl(this.offset) * (layoutDirection == LayoutDirection.Ltr ? 1 : -1)) << 32) | (IntOffset.m5244getYimpl(this.offset) & 4294967295L)));
    }

    @k
    public final Alignment getAlignment() {
        return this.alignment;
    }

    /* renamed from: getOffset-nOcc-ac, reason: not valid java name */
    public final long m5366getOffsetnOccac() {
        return this.offset;
    }

    private AlignmentOffsetPositionProvider(Alignment alignment, long j11) {
        this.alignment = alignment;
        this.offset = j11;
    }
}
