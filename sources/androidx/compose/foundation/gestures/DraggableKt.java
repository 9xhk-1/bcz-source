package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import c40.r0;
import j00.c;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,640:1\n1247#2,6:641\n69#3:647\n65#3:650\n70#4:648\n60#4:651\n22#5:649\n*S KotlinDebug\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt\n*L\n130#1:641,6\n630#1:647\n630#1:650\n630#1:648\n630#1:651\n630#1:649\n*E\n"})
/* loaded from: classes.dex */
public final class DraggableKt {

    @k
    private static final q<r0, Offset, c<? super g2>, Object> NoOpOnDragStarted = new DraggableKt$NoOpOnDragStarted$1(null);

    @k
    private static final q<r0, Float, c<? super g2>, Object> NoOpOnDragStopped = new DraggableKt$NoOpOnDragStopped$1(null);

    @k
    public static final DraggableState DraggableState(@k l<? super Float, g2> lVar) {
        return new DefaultDraggableState(lVar);
    }

    @Stable
    @k
    public static final Modifier draggable(@k Modifier modifier, @k DraggableState draggableState, @k Orientation orientation, boolean z11, @m80.l MutableInteractionSource mutableInteractionSource, boolean z12, @k q<? super r0, ? super Offset, ? super c<? super g2>, ? extends Object> qVar, @k q<? super r0, ? super Float, ? super c<? super g2>, ? extends Object> qVar2, boolean z13) {
        return modifier.then(new DraggableElement(draggableState, orientation, z11, mutableInteractionSource, z12, qVar, qVar2, z13));
    }

    public static /* synthetic */ Modifier draggable$default(Modifier modifier, DraggableState draggableState, Orientation orientation, boolean z11, MutableInteractionSource mutableInteractionSource, boolean z12, q qVar, q qVar2, boolean z13, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        boolean z14 = z11;
        if ((i11 & 8) != 0) {
            mutableInteractionSource = null;
        }
        return draggable(modifier, draggableState, orientation, z14, mutableInteractionSource, (i11 & 16) != 0 ? false : z12, (i11 & 32) != 0 ? NoOpOnDragStarted : qVar, (i11 & 64) != 0 ? NoOpOnDragStopped : qVar2, (i11 & 128) != 0 ? false : z13);
    }

    @Composable
    @k
    public static final DraggableState rememberDraggableState(@k l<? super Float, g2> lVar, @m80.l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-183245213, i11, -1, "androidx.compose.foundation.gestures.rememberDraggableState (Draggable.kt:127)");
        }
        final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(lVar, composer, i11 & 14);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = DraggableState(new l<Float, g2>() { // from class: androidx.compose.foundation.gestures.DraggableKt$rememberDraggableState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Float f11) {
                    invoke(f11.floatValue());
                    return g2.f100423a;
                }

                public final void invoke(float f11) {
                    rememberUpdatedState.getValue().invoke(Float.valueOf(f11));
                }
            });
            composer.updateRememberedValue(rememberedValue);
        }
        DraggableState draggableState = (DraggableState) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return draggableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toFloat-3MmeM6k, reason: not valid java name */
    public static final float m452toFloat3MmeM6k(long j11, Orientation orientation) {
        return Float.intBitsToFloat((int) (orientation == Orientation.Vertical ? j11 & 4294967295L : j11 >> 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toFloat-sF-c-tU, reason: not valid java name */
    public static final float m453toFloatsFctU(long j11, Orientation orientation) {
        return orientation == Orientation.Vertical ? Velocity.m5354getYimpl(j11) : Velocity.m5353getXimpl(j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toValidVelocity-TH1AsA0, reason: not valid java name */
    public static final long m454toValidVelocityTH1AsA0(long j11) {
        return VelocityKt.Velocity(Float.isNaN(Velocity.m5353getXimpl(j11)) ? 0.0f : Velocity.m5353getXimpl(j11), Float.isNaN(Velocity.m5354getYimpl(j11)) ? 0.0f : Velocity.m5354getYimpl(j11));
    }
}
