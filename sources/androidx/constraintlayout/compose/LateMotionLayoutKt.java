package androidx.constraintlayout.compose;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import c40.r0;
import e40.o;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLateMotionLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LateMotionLayout.kt\nandroidx/constraintlayout/compose/LateMotionLayoutKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,149:1\n77#2:150\n1225#3,6:151\n1225#3,6:157\n1225#3,6:163\n1225#3,6:169\n1225#3,6:175\n1225#3,6:181\n1225#3,6:187\n1225#3,6:193\n*S KotlinDebug\n*F\n+ 1 LateMotionLayout.kt\nandroidx/constraintlayout/compose/LateMotionLayoutKt\n*L\n59#1:150\n60#1:151,6\n62#1:157,6\n63#1:163,6\n64#1:169,6\n70#1:175,6\n71#1:181,6\n81#1:187,6\n86#1:193,6\n*E\n"})
/* loaded from: classes2.dex */
public final class LateMotionLayoutKt {
    @Composable
    @v0
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void LateMotionLayout(@k final MutableState<ConstraintSet> mutableState, @k final MutableState<ConstraintSet> mutableState2, @k final AnimationSpec<Float> animationSpec, @k o<ConstraintSet> oVar, @k final androidx.compose.runtime.State<g2> state, @k final Ref<CompositionSource> ref, final int i11, @l final x00.a<g2> aVar, @k final Modifier modifier, @k final p<? super Composer, ? super Integer, g2> pVar, @l Composer composer, final int i12) {
        int i13;
        androidx.compose.runtime.State<g2> state2;
        int i14;
        Composer composer2;
        final o<ConstraintSet> oVar2;
        Composer startRestartGroup = composer.startRestartGroup(688627412);
        if ((i12 & 6) == 0) {
            i13 = (startRestartGroup.changed(mutableState) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= startRestartGroup.changed(mutableState2) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= startRestartGroup.changedInstance(animationSpec) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= startRestartGroup.changedInstance(oVar) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            state2 = state;
            i13 |= startRestartGroup.changed(state2) ? 16384 : 8192;
        } else {
            state2 = state;
        }
        if ((196608 & i12) == 0) {
            i13 |= (i12 & 262144) == 0 ? startRestartGroup.changed(ref) : startRestartGroup.changedInstance(ref) ? 131072 : 65536;
        }
        if ((1572864 & i12) == 0) {
            i14 = i11;
            i13 |= startRestartGroup.changed(i14) ? 1048576 : 524288;
        } else {
            i14 = i11;
        }
        if ((i12 & 12582912) == 0) {
            i13 |= startRestartGroup.changedInstance(aVar) ? 8388608 : 4194304;
        }
        if ((i12 & 100663296) == 0) {
            i13 |= startRestartGroup.changed(modifier) ? 67108864 : 33554432;
        }
        if ((i12 & 805306368) == 0) {
            i13 |= startRestartGroup.changedInstance(pVar) ? 536870912 : 268435456;
        }
        if ((i13 & 306783379) == 306783378 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            oVar2 = oVar;
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(688627412, i13, -1, "androidx.constraintlayout.compose.LateMotionLayout (LateMotionLayout.kt:57)");
            }
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new MotionMeasurer(density);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final MotionMeasurer motionMeasurer = (MotionMeasurer) rememberedValue;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            Animatable animatable = (Animatable) rememberedValue2;
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = animatable.asState();
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            androidx.compose.runtime.State state3 = (androidx.compose.runtime.State) rememberedValue3;
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = SnapshotIntStateKt.mutableIntStateOf(1);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            MutableIntState mutableIntState = (MutableIntState) rememberedValue4;
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == companion.getEmpty()) {
                rememberedValue5 = new x00.a<ConstraintSet>() { // from class: androidx.constraintlayout.compose.LateMotionLayoutKt$LateMotionLayout$measurePolicy$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // x00.a
                    public final ConstraintSet invoke() {
                        ConstraintSet value = mutableState.getValue();
                        g0.m(value);
                        return value;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            x00.a aVar2 = (x00.a) rememberedValue5;
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == companion.getEmpty()) {
                rememberedValue6 = new x00.a<ConstraintSet>() { // from class: androidx.constraintlayout.compose.LateMotionLayoutKt$LateMotionLayout$measurePolicy$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // x00.a
                    public final ConstraintSet invoke() {
                        ConstraintSet value = mutableState2.getValue();
                        g0.m(value);
                        return value;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            int i15 = i13;
            MeasurePolicy lateMotionLayoutMeasurePolicy = lateMotionLayoutMeasurePolicy(aVar2, (x00.a) rememberedValue6, state2, ref, state3, motionMeasurer, i14);
            boolean changedInstance = startRestartGroup.changedInstance(motionMeasurer);
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue7 == companion.getEmpty()) {
                rememberedValue7 = new x00.l<SemanticsPropertyReceiver, g2>() { // from class: androidx.constraintlayout.compose.LateMotionLayoutKt$LateMotionLayout$1$1
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
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            boolean z11 = true;
            composer2 = startRestartGroup;
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier, false, (x00.l) rememberedValue7, 1, null), pVar, lateMotionLayoutMeasurePolicy, composer2, (i15 >> 24) & 112, 0);
            boolean changedInstance2 = composer2.changedInstance(oVar) | ((i15 & 14) == 4) | ((i15 & 112) == 32) | ((i15 & 458752) == 131072 || ((i15 & 262144) != 0 && composer2.changedInstance(ref))) | composer2.changedInstance(animatable) | composer2.changedInstance(animationSpec);
            if ((i15 & 29360128) != 8388608) {
                z11 = false;
            }
            boolean z12 = changedInstance2 | z11;
            Object rememberedValue8 = composer2.rememberedValue();
            if (z12 || rememberedValue8 == companion.getEmpty()) {
                LateMotionLayoutKt$LateMotionLayout$2$1 lateMotionLayoutKt$LateMotionLayout$2$1 = new LateMotionLayoutKt$LateMotionLayout$2$1(oVar, mutableIntState, mutableState, mutableState2, ref, animatable, animationSpec, aVar, null);
                oVar2 = oVar;
                composer2.updateRememberedValue(lateMotionLayoutKt$LateMotionLayout$2$1);
                rememberedValue8 = lateMotionLayoutKt$LateMotionLayout$2$1;
            } else {
                oVar2 = oVar;
            }
            EffectsKt.LaunchedEffect(oVar2, (p<? super r0, ? super j00.c<? super g2>, ? extends Object>) rememberedValue8, composer2, (i15 >> 9) & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.constraintlayout.compose.LateMotionLayoutKt$LateMotionLayout$3
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

                public final void invoke(Composer composer3, int i16) {
                    LateMotionLayoutKt.LateMotionLayout(mutableState, mutableState2, animationSpec, oVar2, state, ref, i11, aVar, modifier, pVar, composer3, RecomposeScopeImplKt.updateChangedFlags(i12 | 1));
                }
            });
        }
    }

    private static final MeasurePolicy lateMotionLayoutMeasurePolicy(final x00.a<? extends ConstraintSet> aVar, final x00.a<? extends ConstraintSet> aVar2, final androidx.compose.runtime.State<g2> state, final Ref<CompositionSource> ref, final androidx.compose.runtime.State<Float> state2, final MotionMeasurer motionMeasurer, final int i11) {
        return new MeasurePolicy() { // from class: androidx.constraintlayout.compose.LateMotionLayoutKt$lateMotionLayoutMeasurePolicy$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo33measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j11) {
                final LinkedHashMap linkedHashMap = new LinkedHashMap();
                state.getValue();
                MotionMeasurer motionMeasurer2 = motionMeasurer;
                LayoutDirection layoutDirection = measureScope.getLayoutDirection();
                ConstraintSet invoke = aVar.invoke();
                ConstraintSet invoke2 = aVar2.invoke();
                TransitionImpl eMPTY$constraintlayout_compose_release = TransitionImpl.Companion.getEMPTY$constraintlayout_compose_release();
                int i12 = i11;
                float floatValue = state2.getValue().floatValue();
                CompositionSource value = ref.getValue();
                if (value == null) {
                    value = CompositionSource.Unknown;
                }
                long m5557performInterpolationMeasureLzAeyeM = motionMeasurer2.m5557performInterpolationMeasureLzAeyeM(j11, layoutDirection, invoke, invoke2, eMPTY$constraintlayout_compose_release, list, linkedHashMap, i12, floatValue, value, null);
                ref.setValue(CompositionSource.Unknown);
                int m5286getWidthimpl = IntSize.m5286getWidthimpl(m5557performInterpolationMeasureLzAeyeM);
                int m5285getHeightimpl = IntSize.m5285getHeightimpl(m5557performInterpolationMeasureLzAeyeM);
                final MotionMeasurer motionMeasurer3 = motionMeasurer;
                return MeasureScope.layout$default(measureScope, m5286getWidthimpl, m5285getHeightimpl, null, new x00.l<Placeable.PlacementScope, g2>() { // from class: androidx.constraintlayout.compose.LateMotionLayoutKt$lateMotionLayoutMeasurePolicy$1.1
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
}
