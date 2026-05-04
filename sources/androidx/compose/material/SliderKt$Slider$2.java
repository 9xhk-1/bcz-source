package androidx.compose.material;

import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
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
@u0({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$Slider$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,1290:1\n75#2:1291\n75#2:1292\n557#3:1293\n554#3,6:1294\n1247#4,3:1300\n1250#4,3:1304\n1247#4,6:1307\n1247#4,6:1313\n1247#4,6:1319\n1247#4,6:1325\n1247#4,6:1331\n1247#4,6:1337\n555#5:1303\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$Slider$2\n*L\n197#1:1291\n202#1:1292\n213#1:1293\n213#1:1294,6\n213#1:1300,3\n213#1:1304,3\n214#1:1307,6\n215#1:1313,6\n218#1:1319,6\n227#1:1325,6\n230#1:1331,6\n261#1:1337,6\n213#1:1303\n*E\n"})
/* loaded from: classes.dex */
public final class SliderKt$Slider$2 extends Lambda implements q<BoxWithConstraintsScope, Composer, Integer, g2> {
    final /* synthetic */ SliderColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ a<g2> $onValueChangeFinished;
    final /* synthetic */ State<l<Float, g2>> $onValueChangeState;
    final /* synthetic */ List<Float> $tickFractions;
    final /* synthetic */ float $value;
    final /* synthetic */ f<Float> $valueRange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$Slider$2(f<Float> fVar, float f11, List<Float> list, a<g2> aVar, MutableInteractionSource mutableInteractionSource, boolean z11, SliderColors sliderColors, State<? extends l<? super Float, g2>> state) {
        super(3);
        this.$valueRange = fVar;
        this.$value = f11;
        this.$tickFractions = list;
        this.$onValueChangeFinished = aVar;
        this.$interactionSource = mutableInteractionSource;
        this.$enabled = z11;
        this.$colors = sliderColors;
        this.$onValueChangeState = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$scaleToOffset(f<Float> fVar, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, float f11) {
        float scale;
        scale = SliderKt.scale(fVar.getStart().floatValue(), fVar.getEndInclusive().floatValue(), f11, floatRef.element, floatRef2.element);
        return scale;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$scaleToUserValue(Ref.FloatRef floatRef, Ref.FloatRef floatRef2, f<Float> fVar, float f11) {
        float scale;
        scale = SliderKt.scale(floatRef.element, floatRef2.element, f11, fVar.getStart().floatValue(), fVar.getEndInclusive().floatValue());
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
        MutableFloatState mutableFloatState;
        Ref.FloatRef floatRef;
        Ref.FloatRef floatRef2;
        final SliderDraggableState sliderDraggableState;
        Ref.FloatRef floatRef3;
        Ref.FloatRef floatRef4;
        Modifier sliderTapModifier;
        float calcFraction;
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
            ComposerKt.traceEventStart(2085116814, i12, -1, "androidx.compose.material.Slider.<anonymous> (Slider.kt:196)");
        }
        boolean z11 = composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
        float m5068getMaxWidthimpl = Constraints.m5068getMaxWidthimpl(boxWithConstraintsScope2.mo631getConstraintsmsEJaDk());
        final Ref.FloatRef floatRef5 = new Ref.FloatRef();
        final Ref.FloatRef floatRef6 = new Ref.FloatRef();
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        floatRef5.element = Math.max(m5068getMaxWidthimpl - density.mo377toPx0680j_4(SliderKt.getThumbRadius()), 0.0f);
        floatRef6.element = Math.min(density.mo377toPx0680j_4(SliderKt.getThumbRadius()), floatRef5.element);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer);
            composer.updateRememberedValue(rememberedValue);
        }
        final r0 r0Var = (r0) rememberedValue;
        float f11 = this.$value;
        f<Float> fVar = this.$valueRange;
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(invoke$scaleToOffset(fVar, floatRef6, floatRef5, f11));
            composer.updateRememberedValue(rememberedValue2);
        }
        final MutableFloatState mutableFloatState2 = (MutableFloatState) rememberedValue2;
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
            composer.updateRememberedValue(rememberedValue3);
        }
        final MutableFloatState mutableFloatState3 = (MutableFloatState) rememberedValue3;
        boolean changed = composer.changed(floatRef6.element) | composer.changed(floatRef5.element) | composer.changed(this.$valueRange);
        final State<l<Float, g2>> state = this.$onValueChangeState;
        final f<Float> fVar2 = this.$valueRange;
        Object rememberedValue4 = composer.rememberedValue();
        if (changed || rememberedValue4 == companion.getEmpty()) {
            mutableFloatState = mutableFloatState3;
            floatRef = floatRef6;
            floatRef2 = floatRef5;
            rememberedValue4 = new SliderDraggableState(new l<Float, g2>() { // from class: androidx.compose.material.SliderKt$Slider$2$draggableState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Float f12) {
                    invoke(f12.floatValue());
                    return g2.f100423a;
                }

                public final void invoke(float f12) {
                    float invoke$scaleToUserValue;
                    MutableFloatState mutableFloatState4 = MutableFloatState.this;
                    mutableFloatState4.setFloatValue(mutableFloatState4.getFloatValue() + f12 + mutableFloatState3.getFloatValue());
                    mutableFloatState3.setFloatValue(0.0f);
                    float H = u.H(MutableFloatState.this.getFloatValue(), floatRef6.element, floatRef5.element);
                    l<Float, g2> value = state.getValue();
                    invoke$scaleToUserValue = SliderKt$Slider$2.invoke$scaleToUserValue(floatRef6, floatRef5, fVar2, H);
                    value.invoke(Float.valueOf(invoke$scaleToUserValue));
                }
            });
            composer.updateRememberedValue(rememberedValue4);
        } else {
            floatRef2 = floatRef5;
            floatRef = floatRef6;
            mutableFloatState = mutableFloatState3;
        }
        SliderDraggableState sliderDraggableState2 = (SliderDraggableState) rememberedValue4;
        boolean changed2 = composer.changed(this.$valueRange) | composer.changed(floatRef.element) | composer.changed(floatRef2.element);
        f<Float> fVar3 = this.$valueRange;
        Object rememberedValue5 = composer.rememberedValue();
        if (changed2 || rememberedValue5 == companion.getEmpty()) {
            rememberedValue5 = new SliderKt$Slider$2$2$1(fVar3, floatRef, floatRef2);
            composer.updateRememberedValue(rememberedValue5);
        }
        SliderKt.CorrectValueSideEffect((l) ((i) rememberedValue5), this.$valueRange, t.e(floatRef.element, floatRef2.element), mutableFloatState2, this.$value, composer, 3072);
        boolean changedInstance = composer.changedInstance(this.$tickFractions) | composer.changed(floatRef.element) | composer.changed(floatRef2.element) | composer.changedInstance(r0Var) | composer.changedInstance(sliderDraggableState2) | composer.changed(this.$onValueChangeFinished);
        final List<Float> list = this.$tickFractions;
        final a<g2> aVar = this.$onValueChangeFinished;
        Object rememberedValue6 = composer.rememberedValue();
        if (changedInstance || rememberedValue6 == companion.getEmpty()) {
            sliderDraggableState = sliderDraggableState2;
            final Ref.FloatRef floatRef7 = floatRef2;
            final Ref.FloatRef floatRef8 = floatRef;
            Object obj = new l<Float, g2>() { // from class: androidx.compose.material.SliderKt$Slider$2$gestureEndAction$1$1

                /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                @d(c = "androidx.compose.material.SliderKt$Slider$2$gestureEndAction$1$1$1", f = "Slider.kt", i = {}, l = {com.jiongji.andriod.card.R.styleable.Theme_drawable_tab_mall}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.compose.material.SliderKt$Slider$2$gestureEndAction$1$1$1, reason: invalid class name */
                public static final class AnonymousClass1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
                    final /* synthetic */ float $current;
                    final /* synthetic */ SliderDraggableState $draggableState;
                    final /* synthetic */ a<g2> $onValueChangeFinished;
                    final /* synthetic */ float $target;
                    final /* synthetic */ float $velocity;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(SliderDraggableState sliderDraggableState, float f11, float f12, float f13, a<g2> aVar, c<? super AnonymousClass1> cVar) {
                        super(2, cVar);
                        this.$draggableState = sliderDraggableState;
                        this.$current = f11;
                        this.$target = f12;
                        this.$velocity = f13;
                        this.$onValueChangeFinished = aVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final c<g2> create(Object obj, c<?> cVar) {
                        return new AnonymousClass1(this.$draggableState, this.$current, this.$target, this.$velocity, this.$onValueChangeFinished, cVar);
                    }

                    @Override // x00.p
                    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
                        return ((AnonymousClass1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object animateToTarget;
                        Object l11 = b.l();
                        int i11 = this.label;
                        if (i11 == 0) {
                            e.n(obj);
                            SliderDraggableState sliderDraggableState = this.$draggableState;
                            float f11 = this.$current;
                            float f12 = this.$target;
                            float f13 = this.$velocity;
                            this.label = 1;
                            animateToTarget = SliderKt.animateToTarget(sliderDraggableState, f11, f12, f13, this);
                            if (animateToTarget == l11) {
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
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Float f12) {
                    invoke(f12.floatValue());
                    return g2.f100423a;
                }

                public final void invoke(float f12) {
                    float snapValueToTick;
                    a<g2> aVar2;
                    float floatValue = MutableFloatState.this.getFloatValue();
                    snapValueToTick = SliderKt.snapValueToTick(floatValue, list, floatRef8.element, floatRef7.element);
                    if (floatValue != snapValueToTick) {
                        k.f(r0Var, null, null, new AnonymousClass1(sliderDraggableState, floatValue, snapValueToTick, f12, aVar, null), 3, null);
                    } else {
                        if (sliderDraggableState.isDragging() || (aVar2 = aVar) == null) {
                            return;
                        }
                        aVar2.invoke();
                    }
                }
            };
            floatRef3 = floatRef8;
            floatRef4 = floatRef7;
            composer.updateRememberedValue(obj);
            rememberedValue6 = obj;
        } else {
            floatRef4 = floatRef2;
            floatRef3 = floatRef;
            sliderDraggableState = sliderDraggableState2;
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState((l) rememberedValue6, composer, 0);
        Modifier.Companion companion2 = Modifier.Companion;
        sliderTapModifier = SliderKt.sliderTapModifier(companion2, sliderDraggableState, this.$interactionSource, m5068getMaxWidthimpl, z11, mutableFloatState2, rememberUpdatedState, mutableFloatState, this.$enabled);
        Orientation orientation = Orientation.Horizontal;
        boolean isDragging = sliderDraggableState.isDragging();
        boolean z12 = this.$enabled;
        boolean z13 = z11;
        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
        boolean changed3 = composer.changed(rememberUpdatedState);
        Object rememberedValue7 = composer.rememberedValue();
        if (changed3 || rememberedValue7 == companion.getEmpty()) {
            rememberedValue7 = new SliderKt$Slider$2$drag$1$1(rememberUpdatedState, null);
            composer.updateRememberedValue(rememberedValue7);
        }
        Modifier draggable$default = DraggableKt.draggable$default(companion2, sliderDraggableState, orientation, z12, mutableInteractionSource, isDragging, null, (q) rememberedValue7, z13, 32, null);
        calcFraction = SliderKt.calcFraction(this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue(), u.H(this.$value, this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue()));
        SliderKt.SliderImpl(this.$enabled, calcFraction, this.$tickFractions, this.$colors, floatRef4.element - floatRef3.element, this.$interactionSource, sliderTapModifier.then(draggable$default), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
