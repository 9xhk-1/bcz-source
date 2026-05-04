package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import c40.k;
import c40.r0;
import g10.f;
import g10.t;
import g10.u;
import h10.i;
import j00.c;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.u0;
import l00.d;
import x00.a;
import x00.l;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$RangeSlider$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,1290:1\n75#2:1291\n75#2:1292\n1247#3,6:1293\n1247#3,6:1299\n1247#3,6:1305\n1247#3,6:1311\n1247#3,3:1324\n1250#3,3:1328\n1247#3,6:1331\n1247#3,6:1337\n1247#3,6:1343\n1247#3,6:1349\n557#4:1317\n554#4,6:1318\n555#5:1327\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$RangeSlider$2\n*L\n421#1:1291\n426#1:1292\n437#1:1293,6\n438#1:1299,6\n441#1:1305,6\n448#1:1311,6\n455#1:1324,3\n455#1:1328,3\n457#1:1331,6\n483#1:1337,6\n528#1:1343,6\n537#1:1349,6\n455#1:1317\n455#1:1318,6\n455#1:1327\n*E\n"})
/* loaded from: classes.dex */
public final class SliderKt$RangeSlider$2 extends Lambda implements q<BoxWithConstraintsScope, Composer, Integer, g2> {
    final /* synthetic */ SliderColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $endInteractionSource;
    final /* synthetic */ a<g2> $onValueChangeFinished;
    final /* synthetic */ State<l<f<Float>, g2>> $onValueChangeState;
    final /* synthetic */ MutableInteractionSource $startInteractionSource;
    final /* synthetic */ int $steps;
    final /* synthetic */ List<Float> $tickFractions;
    final /* synthetic */ f<Float> $value;
    final /* synthetic */ f<Float> $valueRange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$RangeSlider$2(f<Float> fVar, f<Float> fVar2, List<Float> list, a<g2> aVar, State<? extends l<? super f<Float>, g2>> state, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, boolean z11, int i11, SliderColors sliderColors) {
        super(3);
        this.$valueRange = fVar;
        this.$value = fVar2;
        this.$tickFractions = list;
        this.$onValueChangeFinished = aVar;
        this.$onValueChangeState = state;
        this.$startInteractionSource = mutableInteractionSource;
        this.$endInteractionSource = mutableInteractionSource2;
        this.$enabled = z11;
        this.$steps = i11;
        this.$colors = sliderColors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$scaleToOffset(f<Float> fVar, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, float f11) {
        float scale;
        scale = SliderKt.scale(fVar.getStart().floatValue(), fVar.getEndInclusive().floatValue(), f11, floatRef.element, floatRef2.element);
        return scale;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f<Float> invoke$scaleToUserValue(Ref.FloatRef floatRef, Ref.FloatRef floatRef2, f<Float> fVar, f<Float> fVar2) {
        f<Float> scale;
        scale = SliderKt.scale(floatRef.element, floatRef2.element, (f<Float>) fVar2, fVar.getStart().floatValue(), fVar.getEndInclusive().floatValue());
        return scale;
    }

    @Override // x00.q
    public /* bridge */ /* synthetic */ g2 invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, int i11) {
        BoxWithConstraintsScope boxWithConstraintsScope2;
        int i12;
        Ref.FloatRef floatRef;
        Ref.FloatRef floatRef2;
        Modifier rangeSliderPressDragModifier;
        float calcFraction;
        float calcFraction2;
        Modifier sliderSemantics;
        Modifier sliderSemantics2;
        if ((i11 & 6) == 0) {
            boxWithConstraintsScope2 = boxWithConstraintsScope;
            i12 = i11 | (composer.changed(boxWithConstraintsScope2) ? 4 : 2);
        } else {
            boxWithConstraintsScope2 = boxWithConstraintsScope;
            i12 = i11;
        }
        if (!composer.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(652589923, i12, -1, "androidx.compose.material.RangeSlider.<anonymous> (Slider.kt:420)");
        }
        boolean z11 = composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
        float m5068getMaxWidthimpl = Constraints.m5068getMaxWidthimpl(boxWithConstraintsScope2.mo631getConstraintsmsEJaDk());
        final Ref.FloatRef floatRef3 = new Ref.FloatRef();
        final Ref.FloatRef floatRef4 = new Ref.FloatRef();
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        floatRef3.element = m5068getMaxWidthimpl - density.mo377toPx0680j_4(SliderKt.getThumbRadius());
        floatRef4.element = density.mo377toPx0680j_4(SliderKt.getThumbRadius());
        f<Float> fVar = this.$value;
        f<Float> fVar2 = this.$valueRange;
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(invoke$scaleToOffset(fVar2, floatRef4, floatRef3, fVar.getStart().floatValue()));
            composer.updateRememberedValue(rememberedValue);
        }
        final MutableFloatState mutableFloatState = (MutableFloatState) rememberedValue;
        f<Float> fVar3 = this.$value;
        f<Float> fVar4 = this.$valueRange;
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(invoke$scaleToOffset(fVar4, floatRef4, floatRef3, fVar3.getEndInclusive().floatValue()));
            composer.updateRememberedValue(rememberedValue2);
        }
        final MutableFloatState mutableFloatState2 = (MutableFloatState) rememberedValue2;
        boolean changed = composer.changed(this.$valueRange) | composer.changed(floatRef4.element) | composer.changed(floatRef3.element);
        f<Float> fVar5 = this.$valueRange;
        Object rememberedValue3 = composer.rememberedValue();
        if (changed || rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new SliderKt$RangeSlider$2$2$1(fVar5, floatRef4, floatRef3);
            composer.updateRememberedValue(rememberedValue3);
        }
        SliderKt.CorrectValueSideEffect((l) ((i) rememberedValue3), this.$valueRange, t.e(floatRef4.element, floatRef3.element), mutableFloatState, this.$value.getStart().floatValue(), composer, 3072);
        boolean changed2 = composer.changed(this.$valueRange) | composer.changed(floatRef4.element) | composer.changed(floatRef3.element);
        f<Float> fVar6 = this.$valueRange;
        Object rememberedValue4 = composer.rememberedValue();
        if (changed2 || rememberedValue4 == companion.getEmpty()) {
            rememberedValue4 = new SliderKt$RangeSlider$2$3$1(fVar6, floatRef4, floatRef3);
            composer.updateRememberedValue(rememberedValue4);
        }
        SliderKt.CorrectValueSideEffect((l) ((i) rememberedValue4), this.$valueRange, t.e(floatRef4.element, floatRef3.element), mutableFloatState2, this.$value.getEndInclusive().floatValue(), composer, 3072);
        Object rememberedValue5 = composer.rememberedValue();
        if (rememberedValue5 == companion.getEmpty()) {
            rememberedValue5 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer);
            composer.updateRememberedValue(rememberedValue5);
        }
        final r0 r0Var = (r0) rememberedValue5;
        boolean changedInstance = composer.changedInstance(this.$tickFractions) | composer.changed(floatRef4.element) | composer.changed(floatRef3.element) | composer.changed(this.$onValueChangeFinished) | composer.changedInstance(r0Var) | composer.changed(this.$onValueChangeState) | composer.changed(this.$valueRange);
        final List<Float> list = this.$tickFractions;
        final a<g2> aVar = this.$onValueChangeFinished;
        final State<l<f<Float>, g2>> state = this.$onValueChangeState;
        final f<Float> fVar7 = this.$valueRange;
        Object rememberedValue6 = composer.rememberedValue();
        if (changedInstance || rememberedValue6 == companion.getEmpty()) {
            rememberedValue6 = new l<Boolean, g2>() { // from class: androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1

                /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                @d(c = "androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1$1", f = "Slider.kt", i = {}, l = {467}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1$1, reason: invalid class name */
                public static final class AnonymousClass1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
                    final /* synthetic */ float $current;
                    final /* synthetic */ boolean $isStart;
                    final /* synthetic */ Ref.FloatRef $maxPx;
                    final /* synthetic */ Ref.FloatRef $minPx;
                    final /* synthetic */ a<g2> $onValueChangeFinished;
                    final /* synthetic */ State<l<f<Float>, g2>> $onValueChangeState;
                    final /* synthetic */ MutableFloatState $rawOffsetEnd;
                    final /* synthetic */ MutableFloatState $rawOffsetStart;
                    final /* synthetic */ float $target;
                    final /* synthetic */ f<Float> $valueRange;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public AnonymousClass1(float f11, float f12, a<g2> aVar, boolean z11, MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, State<? extends l<? super f<Float>, g2>> state, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, f<Float> fVar, c<? super AnonymousClass1> cVar) {
                        super(2, cVar);
                        this.$current = f11;
                        this.$target = f12;
                        this.$onValueChangeFinished = aVar;
                        this.$isStart = z11;
                        this.$rawOffsetStart = mutableFloatState;
                        this.$rawOffsetEnd = mutableFloatState2;
                        this.$onValueChangeState = state;
                        this.$minPx = floatRef;
                        this.$maxPx = floatRef2;
                        this.$valueRange = fVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final c<g2> create(Object obj, c<?> cVar) {
                        return new AnonymousClass1(this.$current, this.$target, this.$onValueChangeFinished, this.$isStart, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onValueChangeState, this.$minPx, this.$maxPx, this.$valueRange, cVar);
                    }

                    @Override // x00.p
                    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
                        return ((AnonymousClass1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        TweenSpec tweenSpec;
                        Object l11 = b.l();
                        int i11 = this.label;
                        if (i11 == 0) {
                            e.n(obj);
                            Animatable Animatable$default = AnimatableKt.Animatable$default(this.$current, 0.0f, 2, null);
                            Float e11 = l00.a.e(this.$target);
                            tweenSpec = SliderKt.SliderToTickAnimation;
                            Float e12 = l00.a.e(0.0f);
                            final boolean z11 = this.$isStart;
                            final MutableFloatState mutableFloatState = this.$rawOffsetStart;
                            final MutableFloatState mutableFloatState2 = this.$rawOffsetEnd;
                            final State<l<f<Float>, g2>> state = this.$onValueChangeState;
                            final Ref.FloatRef floatRef = this.$minPx;
                            final Ref.FloatRef floatRef2 = this.$maxPx;
                            final f<Float> fVar = this.$valueRange;
                            l<Animatable<Float, AnimationVector1D>, g2> lVar = new l<Animatable<Float, AnimationVector1D>, g2>() { // from class: androidx.compose.material.SliderKt.RangeSlider.2.gestureEndAction.1.1.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // x00.l
                                public /* bridge */ /* synthetic */ g2 invoke(Animatable<Float, AnimationVector1D> animatable) {
                                    invoke2(animatable);
                                    return g2.f100423a;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Animatable<Float, AnimationVector1D> animatable) {
                                    f<Float> invoke$scaleToUserValue;
                                    (z11 ? mutableFloatState : mutableFloatState2).setFloatValue(animatable.getValue().floatValue());
                                    l<f<Float>, g2> value = state.getValue();
                                    invoke$scaleToUserValue = SliderKt$RangeSlider$2.invoke$scaleToUserValue(floatRef, floatRef2, fVar, t.e(mutableFloatState.getFloatValue(), mutableFloatState2.getFloatValue()));
                                    value.invoke(invoke$scaleToUserValue);
                                }
                            };
                            this.label = 1;
                            if (Animatable$default.animateTo(e11, tweenSpec, e12, lVar, this) == l11) {
                                return l11;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            e.n(obj);
                        }
                        a<g2> aVar = this.$onValueChangeFinished;
                        if (aVar != null) {
                            aVar.invoke();
                        }
                        return g2.f100423a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return g2.f100423a;
                }

                public final void invoke(boolean z12) {
                    float snapValueToTick;
                    float floatValue = (z12 ? MutableFloatState.this : mutableFloatState2).getFloatValue();
                    snapValueToTick = SliderKt.snapValueToTick(floatValue, list, floatRef4.element, floatRef3.element);
                    if (floatValue != snapValueToTick) {
                        k.f(r0Var, null, null, new AnonymousClass1(floatValue, snapValueToTick, aVar, z12, MutableFloatState.this, mutableFloatState2, state, floatRef4, floatRef3, fVar7, null), 3, null);
                        return;
                    }
                    a<g2> aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.invoke();
                    }
                }
            };
            floatRef = floatRef4;
            floatRef2 = floatRef3;
            composer.updateRememberedValue(rememberedValue6);
        } else {
            floatRef2 = floatRef3;
            floatRef = floatRef4;
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState((l) rememberedValue6, composer, 0);
        boolean changed3 = composer.changed(this.$valueRange) | composer.changed(floatRef.element) | composer.changed(floatRef2.element) | composer.changed(this.$value) | composer.changed(this.$onValueChangeState);
        final f<Float> fVar8 = this.$value;
        final State<l<f<Float>, g2>> state2 = this.$onValueChangeState;
        final f<Float> fVar9 = this.$valueRange;
        Object rememberedValue7 = composer.rememberedValue();
        if (changed3 || rememberedValue7 == companion.getEmpty()) {
            final Ref.FloatRef floatRef5 = floatRef2;
            final Ref.FloatRef floatRef6 = floatRef;
            rememberedValue7 = new p<Boolean, Float, g2>() { // from class: androidx.compose.material.SliderKt$RangeSlider$2$onDrag$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Boolean bool, Float f11) {
                    invoke(bool.booleanValue(), f11.floatValue());
                    return g2.f100423a;
                }

                public final void invoke(boolean z12, float f11) {
                    float invoke$scaleToOffset;
                    f<Float> e11;
                    f<Float> invoke$scaleToUserValue;
                    float invoke$scaleToOffset2;
                    if (z12) {
                        MutableFloatState mutableFloatState3 = MutableFloatState.this;
                        mutableFloatState3.setFloatValue(mutableFloatState3.getFloatValue() + f11);
                        MutableFloatState mutableFloatState4 = mutableFloatState2;
                        invoke$scaleToOffset2 = SliderKt$RangeSlider$2.invoke$scaleToOffset(fVar9, floatRef6, floatRef5, fVar8.getEndInclusive().floatValue());
                        mutableFloatState4.setFloatValue(invoke$scaleToOffset2);
                        float floatValue = mutableFloatState2.getFloatValue();
                        e11 = t.e(u.H(MutableFloatState.this.getFloatValue(), floatRef6.element, floatValue), floatValue);
                    } else {
                        MutableFloatState mutableFloatState5 = mutableFloatState2;
                        mutableFloatState5.setFloatValue(mutableFloatState5.getFloatValue() + f11);
                        MutableFloatState mutableFloatState6 = MutableFloatState.this;
                        invoke$scaleToOffset = SliderKt$RangeSlider$2.invoke$scaleToOffset(fVar9, floatRef6, floatRef5, fVar8.getStart().floatValue());
                        mutableFloatState6.setFloatValue(invoke$scaleToOffset);
                        float floatValue2 = MutableFloatState.this.getFloatValue();
                        e11 = t.e(floatValue2, u.H(mutableFloatState2.getFloatValue(), floatValue2, floatRef5.element));
                    }
                    l<f<Float>, g2> value = state2.getValue();
                    invoke$scaleToUserValue = SliderKt$RangeSlider$2.invoke$scaleToUserValue(floatRef6, floatRef5, fVar9, e11);
                    value.invoke(invoke$scaleToUserValue);
                }
            };
            composer.updateRememberedValue(rememberedValue7);
        }
        State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState((p) rememberedValue7, composer, 0);
        Modifier.Companion companion2 = Modifier.Companion;
        rangeSliderPressDragModifier = SliderKt.rangeSliderPressDragModifier(companion2, this.$startInteractionSource, this.$endInteractionSource, mutableFloatState, mutableFloatState2, this.$enabled, z11, m5068getMaxWidthimpl, this.$valueRange, rememberUpdatedState, rememberUpdatedState2);
        final float H = u.H(this.$value.getStart().floatValue(), this.$valueRange.getStart().floatValue(), this.$value.getEndInclusive().floatValue());
        final float H2 = u.H(this.$value.getEndInclusive().floatValue(), this.$value.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue());
        calcFraction = SliderKt.calcFraction(this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue(), H);
        calcFraction2 = SliderKt.calcFraction(this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue(), H2);
        int floor = (int) Math.floor(this.$steps * calcFraction2);
        int floor2 = (int) Math.floor(this.$steps * (1.0f - calcFraction));
        boolean z12 = this.$enabled;
        boolean changed4 = composer.changed(this.$onValueChangeState) | composer.changed(H2);
        final State<l<f<Float>, g2>> state3 = this.$onValueChangeState;
        Object rememberedValue8 = composer.rememberedValue();
        if (changed4 || rememberedValue8 == companion.getEmpty()) {
            rememberedValue8 = new l<Float, g2>() { // from class: androidx.compose.material.SliderKt$RangeSlider$2$startThumbSemantics$1$1
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
                    state3.getValue().invoke(t.e(f11, H2));
                }
            };
            composer.updateRememberedValue(rememberedValue8);
        }
        sliderSemantics = SliderKt.sliderSemantics(companion2, H, z12, (l) rememberedValue8, this.$onValueChangeFinished, t.e(this.$valueRange.getStart().floatValue(), H2), floor);
        boolean z13 = this.$enabled;
        boolean changed5 = composer.changed(this.$onValueChangeState) | composer.changed(H);
        final State<l<f<Float>, g2>> state4 = this.$onValueChangeState;
        Object rememberedValue9 = composer.rememberedValue();
        if (changed5 || rememberedValue9 == companion.getEmpty()) {
            rememberedValue9 = new l<Float, g2>() { // from class: androidx.compose.material.SliderKt$RangeSlider$2$endThumbSemantics$1$1
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
                    state4.getValue().invoke(t.e(H, f11));
                }
            };
            composer.updateRememberedValue(rememberedValue9);
        }
        sliderSemantics2 = SliderKt.sliderSemantics(companion2, H2, z13, (l) rememberedValue9, this.$onValueChangeFinished, t.e(H, this.$valueRange.getEndInclusive().floatValue()), floor2);
        SliderKt.RangeSliderImpl(this.$enabled, calcFraction, calcFraction2, this.$tickFractions, this.$colors, floatRef2.element - floatRef.element, this.$startInteractionSource, this.$endInteractionSource, rangeSliderPressDragModifier, sliderSemantics, sliderSemantics2, composer, 14155776, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
