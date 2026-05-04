package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import c40.l2;
import java.util.concurrent.atomic.AtomicReference;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nCursorAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CursorAnimationState.kt\nandroidx/compose/foundation/text/input/internal/CursorAnimationState\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,99:1\n79#2:100\n112#2,2:101\n*S KotlinDebug\n*F\n+ 1 CursorAnimationState.kt\nandroidx/compose/foundation/text/input/internal/CursorAnimationState\n*L\n44#1:100\n44#1:101,2\n*E\n"})
/* loaded from: classes.dex */
public final class CursorAnimationState {
    public static final int $stable = 8;
    private final boolean animate;

    @m80.k
    private AtomicReference<l2> animationJob = new AtomicReference<>(null);

    @m80.k
    private final MutableFloatState cursorAlpha$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);

    public CursorAnimationState(boolean z11) {
        this.animate = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCursorAlpha(float f11) {
        this.cursorAlpha$delegate.setFloatValue(f11);
    }

    public final void cancelAndHide() {
        l2 andSet = this.animationJob.getAndSet(null);
        if (andSet != null) {
            l2.a.b(andSet, null, 1, null);
        }
    }

    public final boolean getAnimate() {
        return this.animate;
    }

    public final float getCursorAlpha() {
        return this.cursorAlpha$delegate.getFloatValue();
    }

    @m80.l
    public final Object snapToVisibleAndAnimate(@m80.k j00.c<? super g2> cVar) {
        Object g11 = c40.s0.g(new CursorAnimationState$snapToVisibleAndAnimate$2(this, null), cVar);
        return g11 == kotlin.coroutines.intrinsics.b.l() ? g11 : g2.f100423a;
    }
}
