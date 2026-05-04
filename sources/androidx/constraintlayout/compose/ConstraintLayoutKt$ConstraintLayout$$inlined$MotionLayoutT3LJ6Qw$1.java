package androidx.constraintlayout.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.node.Ref;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.u0;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nMotionLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MotionLayout.kt\nandroidx/constraintlayout/compose/MotionLayoutKt$MotionLayout$contentDelegate$1\n+ 2 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n*L\n1#1,166:1\n800#2:167\n*E\n"})
/* renamed from: androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$$inlined$MotionLayout-T3LJ6Qw$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class ConstraintLayoutKt$ConstraintLayout$$inlined$MotionLayoutT3LJ6Qw$1 extends Lambda implements q<MotionLayoutScope, Composer, Integer, g2> {
    final /* synthetic */ int $$changed$inlined;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ p $content$inlined;
    final /* synthetic */ MutableState $contentTracker;
    final /* synthetic */ InvalidationStrategy $invalidationStrategy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintLayoutKt$ConstraintLayout$$inlined$MotionLayoutT3LJ6Qw$1(MutableState mutableState, InvalidationStrategy invalidationStrategy, Ref ref, p pVar, int i11) {
        super(3);
        this.$contentTracker = mutableState;
        this.$invalidationStrategy = invalidationStrategy;
        this.$compositionSource = ref;
        this.$content$inlined = pVar;
        this.$$changed$inlined = i11;
    }

    @Override // x00.q
    public /* bridge */ /* synthetic */ g2 invoke(MotionLayoutScope motionLayoutScope, Composer composer, Integer num) {
        invoke(motionLayoutScope, composer, num.intValue());
        return g2.f100423a;
    }

    @Composable
    public final void invoke(MotionLayoutScope motionLayoutScope, Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(284503157, i11, -1, "androidx.constraintlayout.compose.MotionLayout.<anonymous> (MotionLayout.kt:154)");
        }
        this.$contentTracker.setValue(g2.f100423a);
        if (this.$invalidationStrategy.getOnObservedStateChange() == null && this.$compositionSource.getValue() == CompositionSource.Unknown) {
            this.$compositionSource.setValue(CompositionSource.Content);
        }
        composer.startReplaceGroup(-2075780874);
        this.$content$inlined.invoke(composer, Integer.valueOf((this.$$changed$inlined >> 15) & 14));
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
