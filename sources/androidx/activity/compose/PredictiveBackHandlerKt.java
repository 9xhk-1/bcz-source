package androidx.activity.compose;

import android.annotation.SuppressLint;
import androidx.activity.BackEventCompat;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleOwner;
import c40.r0;
import j00.c;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.i;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPredictiveBackHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PredictiveBackHandler.kt\nandroidx/activity/compose/PredictiveBackHandlerKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,200:1\n481#2:201\n480#2,4:202\n484#2,2:209\n488#2:215\n1225#3,3:206\n1228#3,3:212\n1225#3,6:216\n1225#3,6:222\n1225#3,6:228\n1225#3,6:235\n480#4:211\n77#5:234\n81#6:241\n*S KotlinDebug\n*F\n+ 1 PredictiveBackHandler.kt\nandroidx/activity/compose/PredictiveBackHandlerKt\n*L\n80#1:201\n80#1:202,4\n80#1:209,2\n80#1:215\n80#1:206,3\n80#1:212,3\n82#1:216,6\n87#1:222,6\n92#1:228,6\n103#1:235,6\n80#1:211\n101#1:234\n79#1:241\n*E\n"})
/* loaded from: classes.dex */
public final class PredictiveBackHandlerKt {
    @Composable
    @SuppressLint({"RememberReturnType"})
    public static final void PredictiveBackHandler(final boolean z11, @k final p<i<BackEventCompat>, ? super c<g2>, ? extends Object> pVar, @l Composer composer, final int i11, final int i12) {
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(-642000585);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (startRestartGroup.changed(z11) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changedInstance(pVar) ? 32 : 16;
        }
        if ((i13 & 19) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i14 != 0) {
                z11 = true;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-642000585, i13, -1, "androidx.activity.compose.PredictiveBackHandler (PredictiveBackHandler.kt:76)");
            }
            State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(pVar, startRestartGroup, (i13 >> 3) & 14);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            r0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new PredictiveBackHandlerCallback(z11, coroutineScope, PredictiveBackHandler$lambda$0(rememberUpdatedState));
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final PredictiveBackHandlerCallback predictiveBackHandlerCallback = (PredictiveBackHandlerCallback) rememberedValue2;
            boolean changed = startRestartGroup.changed(PredictiveBackHandler$lambda$0(rememberUpdatedState)) | startRestartGroup.changed(coroutineScope);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue3 == companion.getEmpty()) {
                predictiveBackHandlerCallback.setCurrentOnBack(PredictiveBackHandler$lambda$0(rememberUpdatedState));
                predictiveBackHandlerCallback.setOnBackScope(coroutineScope);
                startRestartGroup.updateRememberedValue(g2.f100423a);
            }
            Boolean valueOf = Boolean.valueOf(z11);
            int i15 = i13 & 14;
            boolean changedInstance = startRestartGroup.changedInstance(predictiveBackHandlerCallback) | (i15 == 4);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new PredictiveBackHandlerKt$PredictiveBackHandler$2$1(predictiveBackHandlerCallback, z11, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            EffectsKt.LaunchedEffect(valueOf, (p<? super r0, ? super c<? super g2>, ? extends Object>) rememberedValue4, startRestartGroup, i15);
            OnBackPressedDispatcherOwner current = LocalOnBackPressedDispatcherOwner.INSTANCE.getCurrent(startRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            final OnBackPressedDispatcher onBackPressedDispatcher = current.getOnBackPressedDispatcher();
            final LifecycleOwner lifecycleOwner = (LifecycleOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean changedInstance2 = startRestartGroup.changedInstance(onBackPressedDispatcher) | startRestartGroup.changedInstance(lifecycleOwner) | startRestartGroup.changedInstance(predictiveBackHandlerCallback);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue5 == companion.getEmpty()) {
                rememberedValue5 = new x00.l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                        OnBackPressedDispatcher.this.addCallback(lifecycleOwner, predictiveBackHandlerCallback);
                        final PredictiveBackHandlerCallback predictiveBackHandlerCallback2 = predictiveBackHandlerCallback;
                        return new DisposableEffectResult() { // from class: androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$3$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                PredictiveBackHandlerCallback.this.remove();
                            }
                        };
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            EffectsKt.DisposableEffect(lifecycleOwner, onBackPressedDispatcher, (x00.l) rememberedValue5, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i16) {
                    PredictiveBackHandlerKt.PredictiveBackHandler(z11, pVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
                }
            });
        }
    }

    private static final p<i<BackEventCompat>, c<g2>, Object> PredictiveBackHandler$lambda$0(State<? extends p<i<BackEventCompat>, ? super c<g2>, ? extends Object>> state) {
        return (p) state.getValue();
    }
}
