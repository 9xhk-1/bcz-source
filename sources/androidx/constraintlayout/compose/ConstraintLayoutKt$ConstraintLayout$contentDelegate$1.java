package androidx.constraintlayout.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.node.Ref;
import e40.o;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.u0;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$contentDelegate$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,2303:1\n1225#2,6:2304\n*S KotlinDebug\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$contentDelegate$1\n*L\n384#1:2304,6\n*E\n"})
/* loaded from: classes2.dex */
public final class ConstraintLayoutKt$ConstraintLayout$contentDelegate$1 extends Lambda implements p<Composer, Integer, g2> {
    final /* synthetic */ o<ConstraintSet> $channel;
    final /* synthetic */ Ref<CompositionSource> $compositionSource;
    final /* synthetic */ q<ConstraintLayoutScope, Composer, Integer, g2> $content;
    final /* synthetic */ MutableState<g2> $contentTracker;
    final /* synthetic */ MutableState<ConstraintSet> $end;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ MutableState<ConstraintSet> $start;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConstraintLayoutKt$ConstraintLayout$contentDelegate$1(MutableState<g2> mutableState, Ref<CompositionSource> ref, ConstraintLayoutScope constraintLayoutScope, q<? super ConstraintLayoutScope, ? super Composer, ? super Integer, g2> qVar, o<ConstraintSet> oVar, MutableState<ConstraintSet> mutableState2, MutableState<ConstraintSet> mutableState3) {
        super(2);
        this.$contentTracker = mutableState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$content = qVar;
        this.$channel = oVar;
        this.$start = mutableState2;
        this.$end = mutableState3;
    }

    @Override // x00.p
    public /* bridge */ /* synthetic */ g2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i11) {
        if ((i11 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-74958949, i11, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:371)");
        }
        this.$contentTracker.setValue(g2.f100423a);
        if (this.$compositionSource.getValue() == CompositionSource.Unknown) {
            this.$compositionSource.setValue(CompositionSource.Content);
        }
        this.$scope.reset();
        this.$content.invoke(this.$scope, composer, 0);
        boolean changedInstance = composer.changedInstance(this.$scope) | composer.changedInstance(this.$channel);
        final ConstraintLayoutScope constraintLayoutScope = this.$scope;
        final MutableState<ConstraintSet> mutableState = this.$start;
        final MutableState<ConstraintSet> mutableState2 = this.$end;
        final o<ConstraintSet> oVar = this.$channel;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new x00.a<g2>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$contentDelegate$1$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // x00.a
                public /* bridge */ /* synthetic */ g2 invoke() {
                    invoke2();
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    RawConstraintSet rawConstraintSet = new RawConstraintSet(ConstraintLayoutScope.this.getContainerObject().mo5597clone());
                    if (mutableState.getValue() != null && mutableState2.getValue() != null) {
                        oVar.m(rawConstraintSet);
                    } else {
                        mutableState.setValue(rawConstraintSet);
                        mutableState2.setValue(mutableState.getValue());
                    }
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        EffectsKt.SideEffect((x00.a) rememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
