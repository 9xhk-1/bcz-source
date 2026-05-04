package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAnimatedVisibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,865:1\n1247#2,6:866\n1247#2,6:874\n1247#2,6:883\n1247#2,6:889\n1247#2,6:895\n1247#2,6:901\n1247#2,6:937\n1757#3,2:872\n1759#3,3:880\n79#4,6:907\n86#4,3:922\n89#4,2:931\n93#4:936\n347#5,9:913\n356#5,3:933\n4206#6,6:925\n85#7:943\n85#7:944\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityKt\n*L\n683#1:866,6\n727#1:874,6\n737#1:883,6\n753#1:889,6\n762#1:895,6\n773#1:901,6\n849#1:937,6\n727#1:872,2\n727#1:880,3\n754#1:907,6\n754#1:922,3\n754#1:931,2\n754#1:936\n754#1:913,9\n754#1:933,3\n754#1:925,6\n731#1:943\n734#1:944\n*E\n"})
/* loaded from: classes.dex */
public final class AnimatedVisibilityKt {
    /* JADX WARN: Removed duplicated region for block: B:135:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> void AnimatedEnterExitImpl(@m80.k final androidx.compose.animation.core.Transition<T> r23, @m80.k final x00.l<? super T, java.lang.Boolean> r24, @m80.k final androidx.compose.ui.Modifier r25, @m80.k final androidx.compose.animation.EnterTransition r26, @m80.k final androidx.compose.animation.ExitTransition r27, @m80.k final x00.p<? super androidx.compose.animation.EnterExitState, ? super androidx.compose.animation.EnterExitState, java.lang.Boolean> r28, @m80.l androidx.compose.animation.OnLookaheadMeasured r29, @m80.k final x00.q<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r30, @m80.l androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 907
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedEnterExitImpl(androidx.compose.animation.core.Transition, x00.l, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, x00.p, androidx.compose.animation.OnLookaheadMeasured, x00.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p<EnterExitState, EnterExitState, Boolean> AnimatedEnterExitImpl$lambda$2(State<? extends p<? super EnterExitState, ? super EnterExitState, Boolean>> state) {
        return (p) state.getValue();
    }

    private static final boolean AnimatedEnterExitImpl$lambda$4(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x004d  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AnimatedVisibility(boolean r23, @m80.l androidx.compose.ui.Modifier r24, @m80.l androidx.compose.animation.EnterTransition r25, @m80.l androidx.compose.animation.ExitTransition r26, @m80.l java.lang.String r27, @m80.k final x00.q<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r28, @m80.l androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(boolean, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, x00.q, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void AnimatedVisibilityImpl(@k final Transition<T> transition, @k final l<? super T, Boolean> lVar, @k final Modifier modifier, @k final EnterTransition enterTransition, @k final ExitTransition exitTransition, @k final q<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, g2> qVar, @m80.l Composer composer, final int i11) {
        int i12;
        ExitTransition exitTransition2;
        Composer startRestartGroup = composer.startRestartGroup(429978603);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(transition) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(lVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= startRestartGroup.changed(enterTransition) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            exitTransition2 = exitTransition;
            i12 |= startRestartGroup.changed(exitTransition2) ? 16384 : 8192;
        } else {
            exitTransition2 = exitTransition;
        }
        if ((i11 & 196608) == 0) {
            i12 |= startRestartGroup.changedInstance(qVar) ? 131072 : 65536;
        }
        if (startRestartGroup.shouldExecute((74899 & i12) != 74898, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(429978603, i12, -1, "androidx.compose.animation.AnimatedVisibilityImpl (AnimatedVisibility.kt:677)");
            }
            int i13 = i12 & 112;
            int i14 = i12 & 14;
            boolean z11 = (i13 == 32) | (i14 == 4);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new q<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // x00.q
                    public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                        return m64invoke3p2s80s(measureScope, measurable, constraints.m5074unboximpl());
                    }

                    /* renamed from: invoke-3p2s80s, reason: not valid java name */
                    public final MeasureResult m64invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j11) {
                        long m5281constructorimpl;
                        final Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(j11);
                        if (!measureScope.isLookingAhead() || lVar.invoke(transition.getTargetState()).booleanValue()) {
                            m5281constructorimpl = IntSize.m5281constructorimpl((mo3857measureBRTryo0.getWidth() << 32) | (mo3857measureBRTryo0.getHeight() & 4294967295L));
                        } else {
                            m5281constructorimpl = IntSize.Companion.m5291getZeroYbymL2g();
                        }
                        return MeasureScope.layout$default(measureScope, (int) (m5281constructorimpl >> 32), (int) (m5281constructorimpl & 4294967295L), null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1.1
                            {
                                super(1);
                            }

                            @Override // x00.l
                            public /* bridge */ /* synthetic */ g2 invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return g2.f100423a;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                Placeable.PlacementScope.place$default(placementScope, Placeable.this, 0, 0, 0.0f, 4, null);
                            }
                        }, 4, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            AnimatedEnterExitImpl(transition, lVar, LayoutModifierKt.layout(modifier, (q) rememberedValue), enterTransition, exitTransition2, new p<EnterExitState, EnterExitState, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$2
                @Override // x00.p
                public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                    return Boolean.valueOf(enterExitState == enterExitState2 && enterExitState2 == EnterExitState.PostExit);
                }
            }, null, qVar, startRestartGroup, i13 | i14 | 196608 | (i12 & 7168) | (57344 & i12) | ((i12 << 6) & 29360128), 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$3
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

                public final void invoke(Composer composer2, int i15) {
                    AnimatedVisibilityKt.AnimatedVisibilityImpl(transition, lVar, modifier, enterTransition, exitTransition, qVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getExitFinished(Transition<EnterExitState> transition) {
        EnterExitState currentState = transition.getCurrentState();
        EnterExitState enterExitState = EnterExitState.PostExit;
        return currentState == enterExitState && transition.getTargetState() == enterExitState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Composable
    private static final <T> EnterExitState targetEnterExit(Transition<T> transition, l<? super T, Boolean> lVar, T t11, Composer composer, int i11) {
        EnterExitState enterExitState;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(361571134, i11, -1, "androidx.compose.animation.targetEnterExit (AnimatedVisibility.kt:836)");
        }
        composer.startMovableGroup(-902032957, transition);
        if (transition.isSeeking()) {
            composer.startReplaceGroup(2101770115);
            composer.endReplaceGroup();
            enterExitState = lVar.invoke(t11).booleanValue() ? EnterExitState.Visible : lVar.invoke(transition.getCurrentState()).booleanValue() ? EnterExitState.PostExit : EnterExitState.PreEnter;
        } else {
            composer.startReplaceGroup(2102044248);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            if (lVar.invoke(transition.getCurrentState()).booleanValue()) {
                mutableState.setValue(Boolean.TRUE);
            }
            enterExitState = lVar.invoke(t11).booleanValue() ? EnterExitState.Visible : ((Boolean) mutableState.getValue()).booleanValue() ? EnterExitState.PostExit : EnterExitState.PreEnter;
            composer.endReplaceGroup();
        }
        composer.endMovableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return enterExitState;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x004c  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AnimatedVisibility(@m80.k final androidx.compose.foundation.layout.RowScope r23, boolean r24, @m80.l androidx.compose.ui.Modifier r25, @m80.l androidx.compose.animation.EnterTransition r26, @m80.l androidx.compose.animation.ExitTransition r27, @m80.l java.lang.String r28, @m80.k final x00.q<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r29, @m80.l androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.foundation.layout.RowScope, boolean, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, x00.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x004c  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AnimatedVisibility(@m80.k final androidx.compose.foundation.layout.ColumnScope r23, boolean r24, @m80.l androidx.compose.ui.Modifier r25, @m80.l androidx.compose.animation.EnterTransition r26, @m80.l androidx.compose.animation.ExitTransition r27, @m80.l java.lang.String r28, @m80.k final x00.q<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r29, @m80.l androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.foundation.layout.ColumnScope, boolean, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, x00.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0051  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AnimatedVisibility(@m80.k final androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> r23, @m80.l androidx.compose.ui.Modifier r24, @m80.l androidx.compose.animation.EnterTransition r25, @m80.l androidx.compose.animation.ExitTransition r26, @m80.l java.lang.String r27, @m80.k final x00.q<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r28, @m80.l androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.animation.core.MutableTransitionState, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, x00.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0053  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AnimatedVisibility(@m80.k final androidx.compose.foundation.layout.RowScope r23, @m80.k final androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> r24, @m80.l androidx.compose.ui.Modifier r25, @m80.l androidx.compose.animation.EnterTransition r26, @m80.l androidx.compose.animation.ExitTransition r27, @m80.l java.lang.String r28, @m80.k final x00.q<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r29, @m80.l androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.foundation.layout.RowScope, androidx.compose.animation.core.MutableTransitionState, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, x00.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0053  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AnimatedVisibility(@m80.k final androidx.compose.foundation.layout.ColumnScope r23, @m80.k final androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> r24, @m80.l androidx.compose.ui.Modifier r25, @m80.l androidx.compose.animation.EnterTransition r26, @m80.l androidx.compose.animation.ExitTransition r27, @m80.l java.lang.String r28, @m80.k final x00.q<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r29, @m80.l androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.foundation.layout.ColumnScope, androidx.compose.animation.core.MutableTransitionState, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, x00.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0067  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> void AnimatedVisibility(@m80.k final androidx.compose.animation.core.Transition<T> r21, @m80.k final x00.l<? super T, java.lang.Boolean> r22, @m80.l androidx.compose.ui.Modifier r23, @m80.l androidx.compose.animation.EnterTransition r24, @m80.l androidx.compose.animation.ExitTransition r25, @m80.k final x00.q<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r26, @m80.l androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.animation.core.Transition, x00.l, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, x00.q, androidx.compose.runtime.Composer, int, int):void");
    }
}
