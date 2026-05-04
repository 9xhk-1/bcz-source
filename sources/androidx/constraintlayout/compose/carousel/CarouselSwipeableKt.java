package androidx.constraintlayout.compose.carousel;

import a00.g0;
import a00.h0;
import a00.r0;
import a90.c3;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.a;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCarouselSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarouselSwipeable.kt\nandroidx/constraintlayout/compose/carousel/CarouselSwipeableKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,850:1\n1225#2,6:851\n1225#2,6:857\n1225#2,6:863\n1225#2,6:869\n1225#2,6:875\n135#3:881\n766#4:882\n857#4,2:883\n766#4:898\n857#4,2:899\n288#4,2:914\n171#5,13:885\n482#5,13:901\n*S KotlinDebug\n*F\n+ 1 CarouselSwipeable.kt\nandroidx/constraintlayout/compose/carousel/CarouselSwipeableKt\n*L\n459#1:851,6\n483#1:857,6\n490#1:863,6\n491#1:869,6\n496#1:875,6\n555#1:881\n708#1:882\n708#1:883,2\n709#1:898\n709#1:899,2\n766#1:914,2\n708#1:885,13\n709#1:901,13\n*E\n"})
/* loaded from: classes2.dex */
public final class CarouselSwipeableKt {
    @k
    /* renamed from: carouselSwipeable-pPrIpRY, reason: not valid java name */
    public static final <T> Modifier m5590carouselSwipeablepPrIpRY(@k Modifier modifier, @k final CarouselSwipeableState<T> carouselSwipeableState, @k final Map<Float, ? extends T> map, @k final Orientation orientation, final boolean z11, final boolean z12, @l final MutableInteractionSource mutableInteractionSource, @k final p<? super T, ? super T, ? extends ThresholdConfig> pVar, @l final ResistanceConfig resistanceConfig, final float f11) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new x00.l<InspectorInfo, g2>() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$carouselSwipeable-pPrIpRY$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@k InspectorInfo inspectorInfo) {
                inspectorInfo.setName("swipeable");
                inspectorInfo.getProperties().set("state", CarouselSwipeableState.this);
                inspectorInfo.getProperties().set("anchors", map);
                inspectorInfo.getProperties().set("orientation", orientation);
                inspectorInfo.getProperties().set(c3.f2342e, Boolean.valueOf(z11));
                inspectorInfo.getProperties().set("reverseDirection", Boolean.valueOf(z12));
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
                inspectorInfo.getProperties().set("thresholds", pVar);
                inspectorInfo.getProperties().set("resistance", resistanceConfig);
                inspectorInfo.getProperties().set("velocityThreshold", Dp.m5113boximpl(f11));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$carouselSwipeable$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i11) {
                composer.startReplaceGroup(1858597191);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1858597191, i11, -1, "androidx.constraintlayout.compose.carousel.carouselSwipeable.<anonymous> (CarouselSwipeable.kt:567)");
                }
                if (map.isEmpty()) {
                    throw new IllegalArgumentException("You must have at least one anchor.");
                }
                if (r0.e2(map.values()).size() != map.size()) {
                    throw new IllegalArgumentException("You cannot have two anchors mapped to the same state.");
                }
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                carouselSwipeableState.ensureInit$constraintlayout_compose_release(map);
                Object obj = map;
                Object obj2 = carouselSwipeableState;
                boolean changed = composer.changed(obj2) | composer.changedInstance(map) | composer.changed(resistanceConfig) | composer.changed(pVar) | composer.changed(density) | composer.changed(f11);
                CarouselSwipeableState<T> carouselSwipeableState2 = carouselSwipeableState;
                Map<Float, T> map2 = map;
                ResistanceConfig resistanceConfig2 = resistanceConfig;
                p<T, T, ThresholdConfig> pVar2 = pVar;
                float f12 = f11;
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    Object carouselSwipeableKt$carouselSwipeable$3$3$1 = new CarouselSwipeableKt$carouselSwipeable$3$3$1(carouselSwipeableState2, map2, resistanceConfig2, density, pVar2, f12, null);
                    composer.updateRememberedValue(carouselSwipeableKt$carouselSwipeable$3$3$1);
                    rememberedValue = carouselSwipeableKt$carouselSwipeable$3$3$1;
                }
                EffectsKt.LaunchedEffect(obj, obj2, (p) rememberedValue, composer, 0);
                Modifier.Companion companion = Modifier.Companion;
                boolean isAnimationRunning = carouselSwipeableState.isAnimationRunning();
                DraggableState draggableState$constraintlayout_compose_release = carouselSwipeableState.getDraggableState$constraintlayout_compose_release();
                Orientation orientation2 = orientation;
                boolean z13 = z11;
                MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                boolean changed2 = composer.changed(carouselSwipeableState);
                CarouselSwipeableState<T> carouselSwipeableState3 = carouselSwipeableState;
                Object rememberedValue2 = composer.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new CarouselSwipeableKt$carouselSwipeable$3$4$1(carouselSwipeableState3, null);
                    composer.updateRememberedValue(rememberedValue2);
                }
                Modifier draggable$default = DraggableKt.draggable$default(companion, draggableState$constraintlayout_compose_release, orientation2, z13, mutableInteractionSource2, isAnimationRunning, null, (q) rememberedValue2, z12, 32, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return draggable$default;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float computeTarget(float f11, float f12, Set<Float> set, p<? super Float, ? super Float, Float> pVar, float f13, float f14) {
        List<Float> findBounds = findBounds(f11, set);
        int size = findBounds.size();
        if (size == 0) {
            return f12;
        }
        if (size == 1) {
            return findBounds.get(0).floatValue();
        }
        float floatValue = findBounds.get(0).floatValue();
        float floatValue2 = findBounds.get(1).floatValue();
        return (f12 > f11 ? f13 > (-f14) && f11 > pVar.invoke(Float.valueOf(floatValue2), Float.valueOf(floatValue)).floatValue() : f13 >= f14 || f11 >= pVar.invoke(Float.valueOf(floatValue), Float.valueOf(floatValue2)).floatValue()) ? floatValue2 : floatValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v9 */
    public static final List<Float> findBounds(float f11, Set<Float> set) {
        Object obj;
        Set<Float> set2 = set;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : set2) {
            if (((Number) obj2).floatValue() <= f11 + 0.001d) {
                arrayList.add(obj2);
            }
        }
        Float f12 = null;
        int i11 = 1;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            float floatValue = ((Number) obj).floatValue();
            int L = h0.L(arrayList);
            if (1 <= L) {
                int i12 = 1;
                while (true) {
                    Object obj3 = arrayList.get(i12);
                    float floatValue2 = ((Number) obj3).floatValue();
                    if (Float.compare(floatValue, floatValue2) < 0) {
                        obj = obj3;
                        floatValue = floatValue2;
                    }
                    if (i12 == L) {
                        break;
                    }
                    i12++;
                }
            }
        }
        Float f13 = (Float) obj;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj4 : set2) {
            if (((Number) obj4).floatValue() >= f11 - 0.001d) {
                arrayList2.add(obj4);
            }
        }
        if (!arrayList2.isEmpty()) {
            ?? r13 = arrayList2.get(0);
            float floatValue3 = ((Number) r13).floatValue();
            int L2 = h0.L(arrayList2);
            boolean z11 = r13;
            if (1 <= L2) {
                while (true) {
                    Object obj5 = arrayList2.get(i11);
                    float floatValue4 = ((Number) obj5).floatValue();
                    r13 = z11;
                    if (Float.compare(floatValue3, floatValue4) > 0) {
                        r13 = obj5;
                        floatValue3 = floatValue4;
                    }
                    if (i11 == L2) {
                        break;
                    }
                    i11++;
                    z11 = r13;
                }
            }
            f12 = r13;
        }
        Float f14 = f12;
        return f13 == null ? h0.R(f14) : f14 == null ? g0.l(f13) : kotlin.jvm.internal.g0.f(f13, f14) ? g0.l(f13) : h0.Q(f13, f14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Float getOffset(Map<Float, ? extends T> map, T t11) {
        T t12;
        Iterator<T> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                t12 = null;
                break;
            }
            t12 = it.next();
            if (kotlin.jvm.internal.g0.g(((Map.Entry) t12).getValue(), t11)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) t12;
        if (entry != null) {
            return (Float) entry.getKey();
        }
        return null;
    }

    @k
    public static final <T> NestedScrollConnection getPreUpPostDownNestedScrollConnection(@k CarouselSwipeableState<T> carouselSwipeableState) {
        return new CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1(carouselSwipeableState);
    }

    @Composable
    @k
    public static final <T> CarouselSwipeableState<T> rememberCarouselSwipeableState(@k final T t11, @l final AnimationSpec<Float> animationSpec, @l final x00.l<? super T, Boolean> lVar, @l Composer composer, int i11, int i12) {
        if ((i12 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i12 & 4) != 0) {
            lVar = new x00.l<T, Boolean>() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$rememberCarouselSwipeableState$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.l
                public final Boolean invoke(T t12) {
                    return Boolean.TRUE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // x00.l
                public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                    return invoke((CarouselSwipeableKt$rememberCarouselSwipeableState$1<T>) obj);
                }
            };
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1633385233, i11, -1, "androidx.constraintlayout.compose.carousel.rememberCarouselSwipeableState (CarouselSwipeable.kt:451)");
        }
        Object[] objArr = new Object[0];
        Saver<CarouselSwipeableState<T>, T> Saver = CarouselSwipeableState.Companion.Saver(animationSpec, lVar);
        boolean changedInstance = ((((i11 & 14) ^ 6) > 4 && composer.changedInstance(t11)) || (i11 & 6) == 4) | composer.changedInstance(animationSpec) | ((((i11 & 896) ^ 384) > 256 && composer.changed(lVar)) || (i11 & 384) == 256);
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new a<CarouselSwipeableState<T>>() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$rememberCarouselSwipeableState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // x00.a
                public final CarouselSwipeableState<T> invoke() {
                    return new CarouselSwipeableState<>(t11, animationSpec, lVar);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        CarouselSwipeableState<T> carouselSwipeableState = (CarouselSwipeableState) RememberSaveableKt.m2066rememberSaveable(objArr, (Saver) Saver, (String) null, (a) rememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return carouselSwipeableState;
    }

    @Composable
    @k
    public static final <T> CarouselSwipeableState<T> rememberCarouselSwipeableStateFor(@k final T t11, @k final x00.l<? super T, g2> lVar, @l AnimationSpec<Float> animationSpec, @l Composer composer, int i11, int i12) {
        if ((i12 & 4) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2074386230, i11, -1, "androidx.constraintlayout.compose.carousel.rememberCarouselSwipeableStateFor (CarouselSwipeable.kt:481)");
        }
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = new CarouselSwipeableState(t11, animationSpec, new x00.l<T, Boolean>() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$rememberCarouselSwipeableStateFor$swipeableState$1$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.l
                public final Boolean invoke(T t12) {
                    return Boolean.TRUE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // x00.l
                public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                    return invoke((CarouselSwipeableKt$rememberCarouselSwipeableStateFor$swipeableState$1$1<T>) obj);
                }
            });
            composer.updateRememberedValue(rememberedValue);
        }
        final CarouselSwipeableState<T> carouselSwipeableState = (CarouselSwipeableState) rememberedValue;
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        final MutableState mutableState = (MutableState) rememberedValue2;
        Object value = mutableState.getValue();
        int i13 = (i11 & 14) ^ 6;
        boolean z11 = (i13 > 4 && composer.changedInstance(t11)) || (i11 & 6) == 4;
        Object rememberedValue3 = composer.rememberedValue();
        if (z11 || rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new CarouselSwipeableKt$rememberCarouselSwipeableStateFor$1$1(t11, carouselSwipeableState, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        int i14 = i11 & 8;
        EffectsKt.LaunchedEffect(t11, value, (p) rememberedValue3, composer, i11 & 14);
        T currentValue = carouselSwipeableState.getCurrentValue();
        boolean z12 = ((i13 > 4 && composer.changedInstance(t11)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && composer.changed(lVar)) || (i11 & 48) == 32);
        Object rememberedValue4 = composer.rememberedValue();
        if (z12 || rememberedValue4 == companion.getEmpty()) {
            rememberedValue4 = new x00.l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$rememberCarouselSwipeableStateFor$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // x00.l
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    if (!kotlin.jvm.internal.g0.g(t11, carouselSwipeableState.getCurrentValue())) {
                        lVar.invoke(carouselSwipeableState.getCurrentValue());
                        mutableState.setValue(Boolean.valueOf(!r2.getValue().booleanValue()));
                    }
                    return new DisposableEffectResult() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$rememberCarouselSwipeableStateFor$2$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                        }
                    };
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        EffectsKt.DisposableEffect(currentValue, (x00.l<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue4, composer, i14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return carouselSwipeableState;
    }
}
