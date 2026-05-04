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
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDraggable2D.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable2D.kt\nandroidx/compose/foundation/gestures/Draggable2DKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,329:1\n1247#2,6:330\n*S KotlinDebug\n*F\n+ 1 Draggable2D.kt\nandroidx/compose/foundation/gestures/Draggable2DKt\n*L\n109#1:330,6\n*E\n"})
/* loaded from: classes.dex */
public final class Draggable2DKt {

    @k
    private static final l<Offset, g2> NoOpOnDragStart = new l<Offset, g2>() { // from class: androidx.compose.foundation.gestures.Draggable2DKt$NoOpOnDragStart$1
        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(Offset offset) {
            m445invokek4lQ0M(offset.m2278unboximpl());
            return g2.f100423a;
        }

        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final void m445invokek4lQ0M(long j11) {
        }
    };

    @k
    private static final l<Velocity, g2> NoOpOnDragStop = new l<Velocity, g2>() { // from class: androidx.compose.foundation.gestures.Draggable2DKt$NoOpOnDragStop$1
        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(Velocity velocity) {
            m446invokeTH1AsA0(velocity.m5362unboximpl());
            return g2.f100423a;
        }

        /* renamed from: invoke-TH1AsA0, reason: not valid java name */
        public final void m446invokeTH1AsA0(long j11) {
        }
    };

    @k
    public static final Draggable2DState Draggable2DState(@k l<? super Offset, g2> lVar) {
        return new DefaultDraggable2DState(lVar);
    }

    @Stable
    @k
    public static final Modifier draggable2D(@k Modifier modifier, @k Draggable2DState draggable2DState, boolean z11, @m80.l MutableInteractionSource mutableInteractionSource, boolean z12, @k l<? super Offset, g2> lVar, @k l<? super Velocity, g2> lVar2, boolean z13) {
        return modifier.then(new Draggable2DElement(draggable2DState, z11, mutableInteractionSource, z12, lVar, lVar2, z13));
    }

    @Composable
    @k
    public static final Draggable2DState rememberDraggable2DState(@k l<? super Offset, g2> lVar, @m80.l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1150277615, i11, -1, "androidx.compose.foundation.gestures.rememberDraggable2DState (Draggable2D.kt:106)");
        }
        final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(lVar, composer, i11 & 14);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = Draggable2DState(new l<Offset, g2>() { // from class: androidx.compose.foundation.gestures.Draggable2DKt$rememberDraggable2DState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Offset offset) {
                    m447invokek4lQ0M(offset.m2278unboximpl());
                    return g2.f100423a;
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m447invokek4lQ0M(long j11) {
                    rememberUpdatedState.getValue().invoke(Offset.m2257boximpl(j11));
                }
            });
            composer.updateRememberedValue(rememberedValue);
        }
        Draggable2DState draggable2DState = (Draggable2DState) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return draggable2DState;
    }
}
