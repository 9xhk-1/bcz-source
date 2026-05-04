package androidx.constraintlayout.compose;

import android.os.Build;
import android.view.View;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.p;
import x00.q;
import yz.g2;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nMotionLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MotionLayout.kt\nandroidx/constraintlayout/compose/MotionLayoutKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1651:1\n1225#2,6:1652\n1225#2,3:1658\n1228#2,3:1662\n1225#2,6:1665\n1225#2,6:1671\n1225#2,6:1677\n1225#2,6:1683\n1225#2,6:1689\n1225#2,6:1695\n1225#2,6:1701\n1225#2,6:1707\n1225#2,6:1713\n1225#2,6:1719\n1225#2,6:1725\n1225#2,6:1731\n1225#2,6:1737\n1225#2,6:1743\n1225#2,6:1749\n1225#2,6:1755\n1225#2,6:1761\n1225#2,6:1767\n1225#2,6:1773\n1225#2,6:1779\n1225#2,6:1787\n1225#2,6:1793\n1225#2,6:1799\n1225#2,6:1805\n1225#2,6:1812\n1225#2,6:1818\n1225#2,6:1824\n1225#2,6:1830\n1#3:1661\n77#4:1785\n77#4:1786\n77#4:1811\n81#5:1836\n107#5,2:1837\n81#5:1839\n107#5,2:1840\n81#5:1842\n107#5,2:1843\n*S KotlinDebug\n*F\n+ 1 MotionLayout.kt\nandroidx/constraintlayout/compose/MotionLayoutKt\n*L\n146#1:1652,6\n147#1:1658,3\n147#1:1662,3\n256#1:1665,6\n257#1:1671,6\n382#1:1677,6\n383#1:1683,6\n435#1:1689,6\n438#1:1695,6\n443#1:1701,6\n448#1:1707,6\n457#1:1713,6\n458#1:1719,6\n461#1:1725,6\n465#1:1731,6\n467#1:1737,6\n469#1:1743,6\n472#1:1749,6\n474#1:1755,6\n526#1:1761,6\n529#1:1767,6\n534#1:1773,6\n582#1:1779,6\n593#1:1787,6\n594#1:1793,6\n596#1:1799,6\n609#1:1805,6\n676#1:1812,6\n1028#1:1818,6\n1048#1:1824,6\n1049#1:1830,6\n591#1:1785\n592#1:1786\n655#1:1811\n457#1:1836\n457#1:1837,2\n458#1:1839\n458#1:1840,2\n467#1:1842\n467#1:1843,2\n*E\n"})
/* loaded from: classes2.dex */
public final class MotionLayoutKt {
    @Composable
    @ExperimentalMotionApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_]]")
    /* renamed from: MotionLayout-6oYECBM, reason: not valid java name */
    public static final void m5530MotionLayout6oYECBM(@k MotionScene motionScene, float f11, @l Modifier modifier, @l String str, int i11, int i12, @l InvalidationStrategy invalidationStrategy, @k final q<? super MotionLayoutScope, ? super Composer, ? super Integer, g2> qVar, @l Composer composer, int i13, int i14) {
        if ((i14 & 4) != 0) {
            modifier = Modifier.Companion;
        }
        Modifier modifier2 = modifier;
        if ((i14 & 8) != 0) {
            str = "default";
        }
        String str2 = str;
        int m5471getNonebfy_xzQ = (i14 & 16) != 0 ? DebugFlags.Companion.m5471getNonebfy_xzQ() : i11;
        int i15 = (i14 & 32) != 0 ? 257 : i12;
        final InvalidationStrategy defaultInvalidationStrategy = (i14 & 64) != 0 ? InvalidationStrategy.Companion.getDefaultInvalidationStrategy() : invalidationStrategy;
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt.mutableStateOf(g2.f100423a, SnapshotStateKt.neverEqualPolicy());
            composer.updateRememberedValue(rememberedValue);
        }
        final MutableState mutableState = (MutableState) rememberedValue;
        Object rememberedValue2 = composer.rememberedValue();
        Object obj = rememberedValue2;
        if (rememberedValue2 == companion.getEmpty()) {
            Ref ref = new Ref();
            ref.setValue(CompositionSource.Unknown);
            composer.updateRememberedValue(ref);
            obj = ref;
        }
        final Ref ref2 = (Ref) obj;
        m5533MotionLayoutCoreSehEMGo(motionScene, f11, str2, i15, m5471getNonebfy_xzQ, modifier2, mutableState, ref2, defaultInvalidationStrategy, ComposableLambdaKt.rememberComposableLambda(-23317463, true, new q<MotionLayoutScope, Composer, Integer, g2>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayout$contentDelegate$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ g2 invoke(MotionLayoutScope motionLayoutScope, Composer composer2, Integer num) {
                invoke(motionLayoutScope, composer2, num.intValue());
                return g2.f100423a;
            }

            @Composable
            public final void invoke(MotionLayoutScope motionLayoutScope, Composer composer2, int i16) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-23317463, i16, -1, "androidx.constraintlayout.compose.MotionLayout.<anonymous> (MotionLayout.kt:264)");
                }
                mutableState.setValue(g2.f100423a);
                if (defaultInvalidationStrategy.getOnObservedStateChange() == null && ref2.getValue() == CompositionSource.Unknown) {
                    ref2.setValue(CompositionSource.Content);
                }
                qVar.invoke(motionLayoutScope, composer2, Integer.valueOf(i16 & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, (i13 & 14) | 806879232 | (i13 & 112) | ((i13 >> 3) & 896) | ((i13 >> 6) & 7168) | (i13 & 57344) | ((i13 << 9) & 458752) | (Ref.$stable << 21) | (234881024 & (i13 << 6)));
    }

    @Composable
    @ExperimentalMotionApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_]]")
    /* renamed from: MotionLayout-T3LJ6Qw, reason: not valid java name */
    public static final void m5531MotionLayoutT3LJ6Qw(@k ConstraintSet constraintSet, @k ConstraintSet constraintSet2, float f11, @l Modifier modifier, @l Transition transition, int i11, int i12, @l InvalidationStrategy invalidationStrategy, @k final q<? super MotionLayoutScope, ? super Composer, ? super Integer, g2> qVar, @l Composer composer, int i13, int i14) {
        Modifier modifier2 = (i14 & 8) != 0 ? Modifier.Companion : modifier;
        Transition transition2 = (i14 & 16) != 0 ? null : transition;
        int m5471getNonebfy_xzQ = (i14 & 32) != 0 ? DebugFlags.Companion.m5471getNonebfy_xzQ() : i11;
        int i15 = (i14 & 64) != 0 ? 257 : i12;
        final InvalidationStrategy defaultInvalidationStrategy = (i14 & 128) != 0 ? InvalidationStrategy.Companion.getDefaultInvalidationStrategy() : invalidationStrategy;
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt.mutableStateOf(g2.f100423a, SnapshotStateKt.neverEqualPolicy());
            composer.updateRememberedValue(rememberedValue);
        }
        final MutableState mutableState = (MutableState) rememberedValue;
        Object rememberedValue2 = composer.rememberedValue();
        Object obj = rememberedValue2;
        if (rememberedValue2 == companion.getEmpty()) {
            Ref ref = new Ref();
            ref.setValue(CompositionSource.Unknown);
            composer.updateRememberedValue(ref);
            obj = ref;
        }
        final Ref ref2 = (Ref) obj;
        MotionLayoutCore(constraintSet, constraintSet2, transition2, f11, null, i15, DebugFlags.m5464getShowBoundsimpl(m5471getNonebfy_xzQ), DebugFlags.m5466getShowPathsimpl(m5471getNonebfy_xzQ), DebugFlags.m5465getShowKeyPositionsimpl(m5471getNonebfy_xzQ), modifier2, mutableState, ref2, defaultInvalidationStrategy, ComposableLambdaKt.rememberComposableLambda(284503157, true, new q<MotionLayoutScope, Composer, Integer, g2>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayout$contentDelegate$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ g2 invoke(MotionLayoutScope motionLayoutScope, Composer composer2, Integer num) {
                invoke(motionLayoutScope, composer2, num.intValue());
                return g2.f100423a;
            }

            @Composable
            public final void invoke(MotionLayoutScope motionLayoutScope, Composer composer2, int i16) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(284503157, i16, -1, "androidx.constraintlayout.compose.MotionLayout.<anonymous> (MotionLayout.kt:154)");
                }
                mutableState.setValue(g2.f100423a);
                if (defaultInvalidationStrategy.getOnObservedStateChange() == null && ref2.getValue() == CompositionSource.Unknown) {
                    ref2.setValue(CompositionSource.Content);
                }
                qVar.invoke(motionLayoutScope, composer2, Integer.valueOf(i16 & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, (i13 & 14) | 24576 | (i13 & 112) | ((i13 >> 6) & 896) | ((i13 << 3) & 7168) | ((i13 >> 3) & 458752) | ((i13 << 18) & 1879048192), (Ref.$stable << 3) | 3078 | ((i13 >> 15) & 896));
    }

    @ExperimentalMotionApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @Composable
    @v0
    public static final void MotionLayoutCore(@k final ConstraintSet constraintSet, @k final ConstraintSet constraintSet2, @l final Transition transition, final float f11, @l final LayoutInformationReceiver layoutInformationReceiver, final int i11, final boolean z11, final boolean z12, final boolean z13, @k final Modifier modifier, @k final MutableState<g2> mutableState, @k final Ref<CompositionSource> ref, @k final InvalidationStrategy invalidationStrategy, @k final q<? super MotionLayoutScope, ? super Composer, ? super Integer, g2> qVar, @l Composer composer, final int i12, final int i13) {
        int i14;
        ConstraintSet constraintSet3;
        int i15;
        int i16;
        TransitionImpl transitionImpl;
        Composer composer2;
        boolean z14;
        boolean z15;
        boolean z16;
        Composer startRestartGroup = composer.startRestartGroup(-657259923);
        if ((i12 & 6) == 0) {
            i14 = (startRestartGroup.changed(constraintSet) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            constraintSet3 = constraintSet2;
            i14 |= startRestartGroup.changed(constraintSet3) ? 32 : 16;
        } else {
            constraintSet3 = constraintSet2;
        }
        if ((i12 & 384) == 0) {
            i14 |= startRestartGroup.changed(transition) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i14 |= startRestartGroup.changed(f11) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i14 |= (32768 & i12) == 0 ? startRestartGroup.changed(layoutInformationReceiver) : startRestartGroup.changedInstance(layoutInformationReceiver) ? 16384 : 8192;
        }
        if ((196608 & i12) == 0) {
            i15 = i11;
            i14 |= startRestartGroup.changed(i15) ? 131072 : 65536;
        } else {
            i15 = i11;
        }
        if ((i12 & 1572864) == 0) {
            i14 |= startRestartGroup.changed(z11) ? 1048576 : 524288;
        }
        if ((i12 & 12582912) == 0) {
            i14 |= startRestartGroup.changed(z12) ? 8388608 : 4194304;
        }
        if ((i12 & 100663296) == 0) {
            i14 |= startRestartGroup.changed(z13) ? 67108864 : 33554432;
        }
        if ((i12 & 805306368) == 0) {
            i14 |= startRestartGroup.changed(modifier) ? 536870912 : 268435456;
        }
        if ((i13 & 6) == 0) {
            i16 = i13 | (startRestartGroup.changed(mutableState) ? 4 : 2);
        } else {
            i16 = i13;
        }
        if ((i13 & 48) == 0) {
            i16 |= (i13 & 64) == 0 ? startRestartGroup.changed(ref) : startRestartGroup.changedInstance(ref) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i16 |= startRestartGroup.changedInstance(invalidationStrategy) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i16 |= startRestartGroup.changedInstance(qVar) ? 2048 : 1024;
        }
        int i17 = i16;
        if ((i14 & 306783379) == 306783378 && (i17 & 1171) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-657259923, i14, i17, "androidx.constraintlayout.compose.MotionLayoutCore (MotionLayout.kt:577)");
            }
            int i18 = i14 >> 9;
            MutableFloatState createAndUpdateMotionProgress = createAndUpdateMotionProgress(f11, startRestartGroup, i18 & 14);
            TransitionImpl transitionImpl2 = transition instanceof TransitionImpl ? (TransitionImpl) transition : null;
            if (transitionImpl2 == null) {
                transitionImpl2 = TransitionImpl.Companion.getEMPTY$constraintlayout_compose_release();
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotLongStateKt.mutableLongStateOf(0L);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableLongState mutableLongState = (MutableLongState) rememberedValue;
            mutableLongState.getLongValue();
            if (layoutInformationReceiver != null) {
                layoutInformationReceiver.setUpdateFlag(mutableLongState);
            }
            UpdateWithForcedIfNoUserChange(createAndUpdateMotionProgress, layoutInformationReceiver, startRestartGroup, i18 & 112);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new MotionMeasurer(density);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final MotionMeasurer motionMeasurer = (MotionMeasurer) rememberedValue2;
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new MotionLayoutScope(motionMeasurer, createAndUpdateMotionProgress);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            final MotionLayoutScope motionLayoutScope = (MotionLayoutScope) rememberedValue3;
            boolean z17 = ((i14 & 14) == 4) | ((i14 & 112) == 32) | ((i14 & 896) == 256);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (z17 || rememberedValue4 == companion.getEmpty()) {
                transitionImpl = transitionImpl2;
                motionMeasurer.initWith(constraintSet, constraintSet3, layoutDirection, transitionImpl, createAndUpdateMotionProgress.getFloatValue());
                rememberedValue4 = Boolean.TRUE;
                startRestartGroup.updateRememberedValue(rememberedValue4);
            } else {
                transitionImpl = transitionImpl2;
            }
            ((Boolean) rememberedValue4).getClass();
            startRestartGroup.startReplaceGroup(-487863565);
            if (invalidationStrategy.getOnObservedStateChange() != null) {
                Snapshot.Companion companion2 = Snapshot.Companion;
                boolean z18 = ((i17 & 14) == 4) | ((i17 & 112) == 32 || ((i17 & 64) != 0 && startRestartGroup.changedInstance(ref)));
                Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (z18 || rememberedValue5 == companion.getEmpty()) {
                    rememberedValue5 = new x00.l<Object, g2>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$8$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // x00.l
                        public /* bridge */ /* synthetic */ g2 invoke(Object obj) {
                            invoke2(obj);
                            return g2.f100423a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Object obj) {
                            mutableState.setValue(g2.f100423a);
                            if (ref.getValue() == CompositionSource.Unknown) {
                                ref.setValue(CompositionSource.Content);
                            }
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                Snapshot.Companion.observe$default(companion2, (x00.l) rememberedValue5, null, invalidationStrategy.getOnObservedStateChange(), 2, null);
            }
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            MeasurePolicy motionLayoutMeasurePolicy = motionLayoutMeasurePolicy(mutableState, ref, constraintSet, constraintSet2, transitionImpl, createAndUpdateMotionProgress, motionMeasurer, i15, invalidationStrategy);
            motionMeasurer.addLayoutInformationReceiver(layoutInformationReceiver);
            MotionLayoutDebugFlags forcedDrawDebug = layoutInformationReceiver != null ? layoutInformationReceiver.getForcedDrawDebug() : null;
            float forcedScaleFactor = motionMeasurer.getForcedScaleFactor();
            if (forcedDrawDebug == null || forcedDrawDebug == MotionLayoutDebugFlags.UNKNOWN) {
                z14 = z11;
                z15 = z12;
                z16 = z13;
            } else {
                z14 = forcedDrawDebug == MotionLayoutDebugFlags.SHOW_ALL;
                z15 = z14;
                z16 = z15;
            }
            composer2.startReplaceGroup(-487805395);
            boolean z19 = Build.VERSION.SDK_INT >= 30 && Api30Impl.isShowingLayoutBounds((View) composer2.consume(AndroidCompositionLocals_androidKt.getLocalView()));
            composer2.endReplaceGroup();
            Modifier motionPointerInput = MotionDragHandlerKt.motionPointerInput(motionDebug(modifier, motionMeasurer, forcedScaleFactor, z19 ? true : z14, z15, z16), transition == null ? TransitionImpl.Companion.getEMPTY$constraintlayout_compose_release() : transition, createAndUpdateMotionProgress, motionMeasurer);
            boolean changedInstance = composer2.changedInstance(motionMeasurer);
            Object rememberedValue6 = composer2.rememberedValue();
            if (changedInstance || rememberedValue6 == companion.getEmpty()) {
                rememberedValue6 = new x00.l<SemanticsPropertyReceiver, g2>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$9$1
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public /* bridge */ /* synthetic */ g2 invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return g2.f100423a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        ToolingUtilsKt.setDesignInfoProvider(semanticsPropertyReceiver, MotionMeasurer.this);
                    }
                };
                composer2.updateRememberedValue(rememberedValue6);
            }
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(motionPointerInput, false, (x00.l) rememberedValue6, 1, null), ComposableLambdaKt.rememberComposableLambda(1008059664, true, new p<Composer, Integer, g2>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$10
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return g2.f100423a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer3, int i19) {
                    if ((i19 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1008059664, i19, -1, "androidx.constraintlayout.compose.MotionLayoutCore.<anonymous> (MotionLayout.kt:677)");
                    }
                    qVar.invoke(motionLayoutScope, composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54), motionLayoutMeasurePolicy, composer2, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$11
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer3, int i19) {
                    MotionLayoutKt.MotionLayoutCore(ConstraintSet.this, constraintSet2, transition, f11, layoutInformationReceiver, i11, z11, z12, z13, modifier, mutableState, ref, invalidationStrategy, qVar, composer3, RecomposeScopeImplKt.updateChangedFlags(i12 | 1), RecomposeScopeImplKt.updateChangedFlags(i13));
                }
            });
        }
    }

    @ExperimentalMotionApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @Composable
    @v0
    /* renamed from: MotionLayoutCore-SehEMGo, reason: not valid java name */
    public static final void m5533MotionLayoutCoreSehEMGo(@k final MotionScene motionScene, final float f11, @k final String str, final int i11, final int i12, @k final Modifier modifier, @k final MutableState<g2> mutableState, @k final Ref<CompositionSource> ref, @k final InvalidationStrategy invalidationStrategy, @k final q<? super MotionLayoutScope, ? super Composer, ? super Integer, g2> qVar, @l Composer composer, final int i13) {
        int i14;
        float f12;
        int i15;
        int i16;
        q<? super MotionLayoutScope, ? super Composer, ? super Integer, g2> qVar2;
        String str2;
        String str3;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1160212844);
        if ((i13 & 6) == 0) {
            i14 = (startRestartGroup.changed(motionScene) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            f12 = f11;
            i14 |= startRestartGroup.changed(f12) ? 32 : 16;
        } else {
            f12 = f11;
        }
        if ((i13 & 384) == 0) {
            i14 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 = i11;
            i14 |= startRestartGroup.changed(i15) ? 2048 : 1024;
        } else {
            i15 = i11;
        }
        if ((i13 & 24576) == 0) {
            i16 = i12;
            i14 |= startRestartGroup.changed(i16) ? 16384 : 8192;
        } else {
            i16 = i12;
        }
        if ((196608 & i13) == 0) {
            i14 |= startRestartGroup.changed(modifier) ? 131072 : 65536;
        }
        if ((1572864 & i13) == 0) {
            i14 |= startRestartGroup.changed(mutableState) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i14 |= (16777216 & i13) == 0 ? startRestartGroup.changed(ref) : startRestartGroup.changedInstance(ref) ? 8388608 : 4194304;
        }
        if ((100663296 & i13) == 0) {
            i14 |= startRestartGroup.changedInstance(invalidationStrategy) ? 67108864 : 33554432;
        }
        if ((805306368 & i13) == 0) {
            qVar2 = qVar;
            i14 |= startRestartGroup.changedInstance(qVar2) ? 536870912 : 268435456;
        } else {
            qVar2 = qVar;
        }
        if ((i14 & 306783379) == 306783378 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1160212844, i14, -1, "androidx.constraintlayout.compose.MotionLayoutCore (MotionLayout.kt:523)");
            }
            int i17 = i14 & 14;
            boolean z11 = ((i14 & 896) == 256) | (i17 == 4);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = motionScene.getTransitionInstance(str);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Transition transition = (Transition) rememberedValue;
            boolean changed = (i17 == 4) | startRestartGroup.changed(transition);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                if (transition == null || (str2 = transition.getStartConstraintSetId()) == null) {
                    str2 = TtmlNode.START;
                }
                rememberedValue2 = motionScene.getConstraintSetInstance(str2);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ConstraintSet constraintSet = (ConstraintSet) rememberedValue2;
            boolean changed2 = (i17 == 4) | startRestartGroup.changed(transition);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                if (transition == null || (str3 = transition.getEndConstraintSetId()) == null) {
                    str3 = TtmlNode.END;
                }
                rememberedValue3 = motionScene.getConstraintSetInstance(str3);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            ConstraintSet constraintSet2 = (ConstraintSet) rememberedValue3;
            if (constraintSet == null || constraintSet2 == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // x00.p
                        public /* bridge */ /* synthetic */ g2 invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return g2.f100423a;
                        }

                        public final void invoke(Composer composer3, int i18) {
                            MotionLayoutKt.m5533MotionLayoutCoreSehEMGo(MotionScene.this, f11, str, i11, i12, modifier, mutableState, ref, invalidationStrategy, qVar, composer3, RecomposeScopeImplKt.updateChangedFlags(i13 | 1));
                        }
                    });
                    return;
                }
                return;
            }
            composer2 = startRestartGroup;
            int i18 = ((i14 << 6) & 465920) | ((i14 << 12) & 1879048192);
            int i19 = i14 >> 18;
            MotionLayoutCore(constraintSet, constraintSet2, transition, f12, motionScene instanceof LayoutInformationReceiver ? (LayoutInformationReceiver) motionScene : null, i15, DebugFlags.m5464getShowBoundsimpl(i16), DebugFlags.m5466getShowPathsimpl(i12), DebugFlags.m5465getShowKeyPositionsimpl(i12), modifier, mutableState, ref, invalidationStrategy, qVar2, composer2, i18, (i19 & 14) | (Ref.$stable << 3) | (i19 & 112) | (i19 & 896) | (i19 & 7168));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup2 = composer2.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer3, int i21) {
                    MotionLayoutKt.m5533MotionLayoutCoreSehEMGo(MotionScene.this, f11, str, i11, i12, modifier, mutableState, ref, invalidationStrategy, qVar, composer3, RecomposeScopeImplKt.updateChangedFlags(i13 | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x024a A[ADDED_TO_REGION] */
    @androidx.constraintlayout.compose.ExperimentalMotionApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    @yz.v0
    /* renamed from: MotionLayoutCore-TEds9UA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m5534MotionLayoutCoreTEds9UA(@m80.k final androidx.constraintlayout.compose.MotionScene r25, @m80.l final java.lang.String r26, @m80.k final androidx.compose.animation.core.AnimationSpec<java.lang.Float> r27, @m80.l androidx.compose.ui.Modifier r28, @m80.l x00.a<yz.g2> r29, int r30, int r31, @m80.k final androidx.compose.runtime.MutableState<yz.g2> r32, @m80.k final androidx.compose.ui.node.Ref<androidx.constraintlayout.compose.CompositionSource> r33, @m80.k final androidx.constraintlayout.compose.InvalidationStrategy r34, @m80.k final x00.q<? super androidx.constraintlayout.compose.MotionLayoutScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r35, @m80.l androidx.compose.runtime.Composer r36, final int r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 1131
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.MotionLayoutKt.m5534MotionLayoutCoreTEds9UA(androidx.constraintlayout.compose.MotionScene, java.lang.String, androidx.compose.animation.core.AnimationSpec, androidx.compose.ui.Modifier, x00.a, int, int, androidx.compose.runtime.MutableState, androidx.compose.ui.node.Ref, androidx.constraintlayout.compose.InvalidationStrategy, x00.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConstraintSet MotionLayoutCore_TEds9UA$lambda$14(MutableState<ConstraintSet> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConstraintSet MotionLayoutCore_TEds9UA$lambda$17(MutableState<ConstraintSet> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MotionLayoutCore_TEds9UA$lambda$23(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MotionLayoutCore_TEds9UA$lambda$24(MutableState<Boolean> mutableState, boolean z11) {
        mutableState.setValue(Boolean.valueOf(z11));
    }

    @Composable
    public static final void UpdateWithForcedIfNoUserChange(@k final MutableFloatState mutableFloatState, @l final LayoutInformationReceiver layoutInformationReceiver, @l Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(1501096015);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(mutableFloatState) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? startRestartGroup.changed(layoutInformationReceiver) : startRestartGroup.changedInstance(layoutInformationReceiver) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1501096015, i12, -1, "androidx.constraintlayout.compose.UpdateWithForcedIfNoUserChange (MotionLayout.kt:1019)");
            }
            if (layoutInformationReceiver == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$UpdateWithForcedIfNoUserChange$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // x00.p
                        public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return g2.f100423a;
                        }

                        public final void invoke(Composer composer2, int i13) {
                            MotionLayoutKt.UpdateWithForcedIfNoUserChange(MutableFloatState.this, layoutInformationReceiver, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                        }
                    });
                    return;
                }
                return;
            }
            float floatValue = mutableFloatState.getFloatValue();
            float forcedProgress = layoutInformationReceiver.getForcedProgress();
            Object rememberedValue = startRestartGroup.rememberedValue();
            Object obj = rememberedValue;
            if (rememberedValue == Composer.Companion.getEmpty()) {
                Ref ref = new Ref();
                ref.setValue(Float.valueOf(floatValue));
                startRestartGroup.updateRememberedValue(ref);
                obj = ref;
            }
            Ref ref2 = (Ref) obj;
            if (Float.isNaN(forcedProgress) || !g0.e((Float) ref2.getValue(), floatValue)) {
                layoutInformationReceiver.resetForcedProgress();
            } else {
                mutableFloatState.setFloatValue(forcedProgress);
            }
            ref2.setValue(Float.valueOf(floatValue));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$UpdateWithForcedIfNoUserChange$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i13) {
                    MotionLayoutKt.UpdateWithForcedIfNoUserChange(MutableFloatState.this, layoutInformationReceiver, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    @Composable
    @k
    public static final MutableFloatState createAndUpdateMotionProgress(float f11, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1721363510, i11, -1, "androidx.constraintlayout.compose.createAndUpdateMotionProgress (MotionLayout.kt:1046)");
        }
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(f11);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableFloatState mutableFloatState = (MutableFloatState) rememberedValue;
        Object rememberedValue2 = composer.rememberedValue();
        Object obj = rememberedValue2;
        if (rememberedValue2 == companion.getEmpty()) {
            Ref.FloatRef floatRef = new Ref.FloatRef();
            floatRef.element = f11;
            composer.updateRememberedValue(floatRef);
            obj = floatRef;
        }
        Ref.FloatRef floatRef2 = (Ref.FloatRef) obj;
        if (floatRef2.element != f11) {
            floatRef2.element = f11;
            mutableFloatState.setFloatValue(f11);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableFloatState;
    }

    @ExperimentalMotionApi
    @k
    public static final Modifier motionDebug(@k Modifier modifier, @k final MotionMeasurer motionMeasurer, float f11, final boolean z11, final boolean z12, final boolean z13) {
        if (!Float.isNaN(f11)) {
            modifier = ScaleKt.scale(modifier, f11);
        }
        return (z11 || z13 || z12) ? DrawModifierKt.drawBehind(modifier, new x00.l<DrawScope, g2>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$motionDebug$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DrawScope drawScope) {
                MotionMeasurer.this.drawDebug(drawScope, z11, z12, z13);
            }
        }) : modifier;
    }

    @ExperimentalMotionApi
    @k
    public static final MeasurePolicy motionLayoutMeasurePolicy(@k final androidx.compose.runtime.State<g2> state, @k final androidx.compose.ui.node.Ref<CompositionSource> ref, @k final ConstraintSet constraintSet, @k final ConstraintSet constraintSet2, @k final TransitionImpl transitionImpl, @k final MutableFloatState mutableFloatState, @k final MotionMeasurer motionMeasurer, final int i11, @k final InvalidationStrategy invalidationStrategy) {
        return new MeasurePolicy() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$motionLayoutMeasurePolicy$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo33measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j11) {
                final LinkedHashMap linkedHashMap = new LinkedHashMap();
                state.getValue();
                MotionMeasurer motionMeasurer2 = motionMeasurer;
                LayoutDirection layoutDirection = measureScope.getLayoutDirection();
                ConstraintSet constraintSet3 = constraintSet;
                ConstraintSet constraintSet4 = constraintSet2;
                TransitionImpl transitionImpl2 = transitionImpl;
                int i12 = i11;
                float floatValue = mutableFloatState.getFloatValue();
                CompositionSource value = ref.getValue();
                if (value == null) {
                    value = CompositionSource.Unknown;
                }
                long m5557performInterpolationMeasureLzAeyeM = motionMeasurer2.m5557performInterpolationMeasureLzAeyeM(j11, layoutDirection, constraintSet3, constraintSet4, transitionImpl2, list, linkedHashMap, i12, floatValue, value, invalidationStrategy.getShouldInvalidate$constraintlayout_compose_release());
                ref.setValue(CompositionSource.Unknown);
                int m5286getWidthimpl = IntSize.m5286getWidthimpl(m5557performInterpolationMeasureLzAeyeM);
                int m5285getHeightimpl = IntSize.m5285getHeightimpl(m5557performInterpolationMeasureLzAeyeM);
                final MotionMeasurer motionMeasurer3 = motionMeasurer;
                return MeasureScope.layout$default(measureScope, m5286getWidthimpl, m5285getHeightimpl, null, new x00.l<Placeable.PlacementScope, g2>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$motionLayoutMeasurePolicy$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
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
                        MotionMeasurer.this.performLayout(placementScope, list, linkedHashMap);
                    }
                }, 4, null);
            }
        };
    }

    @Composable
    @ExperimentalMotionApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_]]")
    /* renamed from: MotionLayout-T3LJ6Qw, reason: not valid java name */
    public static final void m5532MotionLayoutT3LJ6Qw(@k MotionScene motionScene, @l String str, @k AnimationSpec<Float> animationSpec, @l Modifier modifier, @l x00.a<g2> aVar, int i11, int i12, @l InvalidationStrategy invalidationStrategy, @k final q<? super MotionLayoutScope, ? super Composer, ? super Integer, g2> qVar, @l Composer composer, int i13, int i14) {
        Modifier modifier2 = (i14 & 8) != 0 ? Modifier.Companion : modifier;
        x00.a<g2> aVar2 = (i14 & 16) != 0 ? null : aVar;
        int m5471getNonebfy_xzQ = (i14 & 32) != 0 ? DebugFlags.Companion.m5471getNonebfy_xzQ() : i11;
        int i15 = (i14 & 64) != 0 ? 257 : i12;
        final InvalidationStrategy defaultInvalidationStrategy = (i14 & 128) != 0 ? InvalidationStrategy.Companion.getDefaultInvalidationStrategy() : invalidationStrategy;
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt.mutableStateOf(g2.f100423a, SnapshotStateKt.neverEqualPolicy());
            composer.updateRememberedValue(rememberedValue);
        }
        final MutableState mutableState = (MutableState) rememberedValue;
        Object rememberedValue2 = composer.rememberedValue();
        Object obj = rememberedValue2;
        if (rememberedValue2 == companion.getEmpty()) {
            androidx.compose.ui.node.Ref ref = new androidx.compose.ui.node.Ref();
            ref.setValue(CompositionSource.Unknown);
            composer.updateRememberedValue(ref);
            obj = ref;
        }
        final androidx.compose.ui.node.Ref ref2 = (androidx.compose.ui.node.Ref) obj;
        m5534MotionLayoutCoreTEds9UA(motionScene, str, animationSpec, modifier2, aVar2, m5471getNonebfy_xzQ, i15, mutableState, ref2, defaultInvalidationStrategy, ComposableLambdaKt.rememberComposableLambda(1064705982, true, new q<MotionLayoutScope, Composer, Integer, g2>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayout$contentDelegate$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ g2 invoke(MotionLayoutScope motionLayoutScope, Composer composer2, Integer num) {
                invoke(motionLayoutScope, composer2, num.intValue());
                return g2.f100423a;
            }

            @Composable
            public final void invoke(MotionLayoutScope motionLayoutScope, Composer composer2, int i16) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1064705982, i16, -1, "androidx.constraintlayout.compose.MotionLayout.<anonymous> (MotionLayout.kt:390)");
                }
                mutableState.setValue(g2.f100423a);
                if (defaultInvalidationStrategy.getOnObservedStateChange() == null && ref2.getValue() == CompositionSource.Unknown) {
                    ref2.setValue(CompositionSource.Content);
                }
                qVar.invoke(motionLayoutScope, composer2, Integer.valueOf(i16 & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, (i13 & 14) | 12582912 | (i13 & 112) | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (458752 & i13) | (3670016 & i13) | (androidx.compose.ui.node.Ref.$stable << 24) | ((i13 << 6) & 1879048192), 6, 0);
    }
}
