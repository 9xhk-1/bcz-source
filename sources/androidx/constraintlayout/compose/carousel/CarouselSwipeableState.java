package androidx.constraintlayout.compose.carousel;

import a00.l1;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.FloatState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import com.jiongji.andriod.card.R;
import g10.u;
import j00.c;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import l00.d;
import m80.k;
import x00.a;
import x00.l;
import x00.p;
import yz.g2;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCarouselSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarouselSwipeable.kt\nandroidx/constraintlayout/compose/carousel/CarouselSwipeableState\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,850:1\n21#2:851\n23#2:855\n50#3:852\n55#3:854\n107#4:853\n81#5:856\n107#5,2:857\n81#5:859\n107#5,2:860\n81#5:862\n107#5,2:863\n81#5:894\n107#5,2:895\n81#5:900\n107#5,2:901\n1#6:865\n2333#7,14:866\n2333#7,14:880\n79#8:897\n112#8,2:898\n*S KotlinDebug\n*F\n+ 1 CarouselSwipeable.kt\nandroidx/constraintlayout/compose/carousel/CarouselSwipeableState\n*L\n123#1:851\n123#1:855\n123#1:852\n123#1:854\n123#1:853\n89#1:856\n89#1:857,2\n93#1:859\n93#1:860,2\n120#1:862\n120#1:863,2\n183#1:894\n183#1:895,2\n187#1:900\n187#1:901,2\n162#1:866,14\n168#1:880,14\n185#1:897\n185#1:898,2\n*E\n"})
@Stable
/* loaded from: classes2.dex */
public class CarouselSwipeableState<T> {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private final MutableFloatState absoluteOffset;

    @k
    private final MutableState anchors$delegate;

    @k
    private final AnimationSpec<Float> animationSpec;

    @k
    private final MutableState<Float> animationTarget;

    @k
    private final l<T, Boolean> confirmStateChange;

    @k
    private final MutableState currentValue$delegate;

    @k
    private final DraggableState draggableState;

    @k
    private final MutableState isAnimationRunning$delegate;

    @k
    private final i<Map<Float, T>> latestNonEmptyAnchorsFlow;
    private float maxBound;
    private float minBound;

    @k
    private final MutableFloatState offsetState;

    @k
    private final MutableFloatState overflowState;

    @k
    private final MutableState resistance$delegate;

    @k
    private final MutableState thresholds$delegate;

    @k
    private final MutableFloatState velocityThreshold$delegate;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final <T> Saver<CarouselSwipeableState<T>, T> Saver(@k final AnimationSpec<Float> animationSpec, @k final l<? super T, Boolean> lVar) {
            return SaverKt.Saver(new p<SaverScope, CarouselSwipeableState<T>, T>() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableState$Companion$Saver$1
                @Override // x00.p
                public final T invoke(SaverScope saverScope, CarouselSwipeableState<T> carouselSwipeableState) {
                    return carouselSwipeableState.getCurrentValue();
                }
            }, new l<T, CarouselSwipeableState<T>>() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // x00.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((CarouselSwipeableState$Companion$Saver$2<T>) obj);
                }

                @Override // x00.l
                public final CarouselSwipeableState<T> invoke(T t11) {
                    return new CarouselSwipeableState<>(t11, animationSpec, lVar);
                }
            });
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CarouselSwipeableState(T t11, @k AnimationSpec<Float> animationSpec, @k l<? super T, Boolean> lVar) {
        this.animationSpec = animationSpec;
        this.confirmStateChange = lVar;
        this.currentValue$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t11, null, 2, null);
        this.isAnimationRunning$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.offsetState = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.overflowState = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.absoluteOffset = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.animationTarget = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.anchors$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(l1.z(), null, 2, null);
        final i snapshotFlow = SnapshotStateKt.snapshotFlow(new a<Map<Float, ? extends T>>(this) { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableState$latestNonEmptyAnchorsFlow$1
            final /* synthetic */ CarouselSwipeableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // x00.a
            public final Map<Float, T> invoke() {
                return this.this$0.getAnchors$constraintlayout_compose_release();
            }
        });
        this.latestNonEmptyAnchorsFlow = kotlinx.coroutines.flow.k.W1(new i<Map<Float, ? extends T>>() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableState$special$$inlined$filter$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CarouselSwipeable.kt\nandroidx/constraintlayout/compose/carousel/CarouselSwipeableState\n*L\n1#1,222:1\n22#2:223\n23#2:225\n123#3:224\n*E\n"})
            /* renamed from: androidx.constraintlayout.compose.carousel.CarouselSwipeableState$special$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements j {
                final /* synthetic */ j $this_unsafeFlow;

                /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                @d(c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableState$special$$inlined$filter$1$2", f = "CarouselSwipeable.kt", i = {}, l = {R.styleable.Theme_drawable_sound1}, m = "emit", n = {}, s = {})
                /* renamed from: androidx.constraintlayout.compose.carousel.CarouselSwipeableState$special$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @m80.l
                    public final Object invokeSuspend(@k Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(j jVar) {
                    this.$this_unsafeFlow = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.j
                @m80.l
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, @m80.k j00.c r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof androidx.constraintlayout.compose.carousel.CarouselSwipeableState$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        androidx.constraintlayout.compose.carousel.CarouselSwipeableState$special$$inlined$filter$1$2$1 r0 = (androidx.constraintlayout.compose.carousel.CarouselSwipeableState$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.constraintlayout.compose.carousel.CarouselSwipeableState$special$$inlined$filter$1$2$1 r0 = new androidx.constraintlayout.compose.carousel.CarouselSwipeableState$special$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.e.n(r6)
                        goto L48
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.e.n(r6)
                        kotlinx.coroutines.flow.j r6 = r4.$this_unsafeFlow
                        r2 = r5
                        java.util.Map r2 = (java.util.Map) r2
                        boolean r2 = r2.isEmpty()
                        if (r2 != 0) goto L48
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        yz.g2 r5 = yz.g2.f100423a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.carousel.CarouselSwipeableState$special$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            @m80.l
            public Object collect(@k j jVar, @k c cVar) {
                Object collect = i.this.collect(new AnonymousClass2(jVar), cVar);
                return collect == b.l() ? collect : g2.f100423a;
            }
        }, 1);
        this.minBound = Float.NEGATIVE_INFINITY;
        this.maxBound = Float.POSITIVE_INFINITY;
        this.thresholds$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new p<Float, Float, Float>() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableState$thresholds$2
            public final Float invoke(float f11, float f12) {
                return Float.valueOf(0.0f);
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ Float invoke(Float f11, Float f12) {
                return invoke(f11.floatValue(), f12.floatValue());
            }
        }, null, 2, null);
        this.velocityThreshold$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.resistance$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.draggableState = DraggableKt.DraggableState(new l<Float, g2>(this) { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableState$draggableState$1
            final /* synthetic */ CarouselSwipeableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Float f11) {
                invoke(f11.floatValue());
                return g2.f100423a;
            }

            public final void invoke(float f11) {
                MutableFloatState mutableFloatState;
                MutableFloatState mutableFloatState2;
                MutableFloatState mutableFloatState3;
                MutableFloatState mutableFloatState4;
                mutableFloatState = ((CarouselSwipeableState) this.this$0).absoluteOffset;
                float floatValue = mutableFloatState.getFloatValue() + f11;
                float H = u.H(floatValue, this.this$0.getMinBound$constraintlayout_compose_release(), this.this$0.getMaxBound$constraintlayout_compose_release());
                float f12 = floatValue - H;
                ResistanceConfig resistance$constraintlayout_compose_release = this.this$0.getResistance$constraintlayout_compose_release();
                float computeResistance = resistance$constraintlayout_compose_release != null ? resistance$constraintlayout_compose_release.computeResistance(f12) : 0.0f;
                mutableFloatState2 = ((CarouselSwipeableState) this.this$0).offsetState;
                mutableFloatState2.setFloatValue(H + computeResistance);
                mutableFloatState3 = ((CarouselSwipeableState) this.this$0).overflowState;
                mutableFloatState3.setFloatValue(f12);
                mutableFloatState4 = ((CarouselSwipeableState) this.this$0).absoluteOffset;
                mutableFloatState4.setFloatValue(floatValue);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object animateInternalToOffset(float f11, AnimationSpec<Float> animationSpec, c<? super g2> cVar) {
        Object drag$default = DraggableState.drag$default(this.draggableState, null, new CarouselSwipeableState$animateInternalToOffset$2(this, f11, animationSpec, null), cVar, 1, null);
        return drag$default == b.l() ? drag$default : g2.f100423a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$default(CarouselSwipeableState carouselSwipeableState, Object obj, AnimationSpec animationSpec, c cVar, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateTo");
        }
        if ((i11 & 2) != 0) {
            animationSpec = carouselSwipeableState.animationSpec;
        }
        return carouselSwipeableState.animateTo(obj, animationSpec, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAnimationRunning(boolean z11) {
        this.isAnimationRunning$delegate.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentValue(T t11) {
        this.currentValue$delegate.setValue(t11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object snapInternalToOffset(float f11, c<? super g2> cVar) {
        Object drag$default = DraggableState.drag$default(this.draggableState, null, new CarouselSwipeableState$snapInternalToOffset$2(f11, this, null), cVar, 1, null);
        return drag$default == b.l() ? drag$default : g2.f100423a;
    }

    @m80.l
    public final Object animateTo(T t11, @k AnimationSpec<Float> animationSpec, @k c<? super g2> cVar) {
        Object collect = this.latestNonEmptyAnchorsFlow.collect(new CarouselSwipeableState$animateTo$2(t11, this, animationSpec), cVar);
        return collect == b.l() ? collect : g2.f100423a;
    }

    public final void ensureInit$constraintlayout_compose_release(@k Map<Float, ? extends T> map) {
        Float offset;
        if (getAnchors$constraintlayout_compose_release().isEmpty()) {
            offset = CarouselSwipeableKt.getOffset(map, getCurrentValue());
            if (offset == null) {
                throw new IllegalArgumentException("The initial value must have an associated anchor.");
            }
            this.offsetState.setFloatValue(offset.floatValue());
            this.absoluteOffset.setFloatValue(offset.floatValue());
        }
    }

    @k
    public final Map<Float, T> getAnchors$constraintlayout_compose_release() {
        return (Map) this.anchors$delegate.getValue();
    }

    @k
    public final AnimationSpec<Float> getAnimationSpec$constraintlayout_compose_release() {
        return this.animationSpec;
    }

    @k
    public final l<T, Boolean> getConfirmStateChange$constraintlayout_compose_release() {
        return this.confirmStateChange;
    }

    public final T getCurrentValue() {
        return this.currentValue$delegate.getValue();
    }

    public final float getDirection() {
        Float offset;
        offset = CarouselSwipeableKt.getOffset(getAnchors$constraintlayout_compose_release(), getCurrentValue());
        if (offset == null) {
            return 0.0f;
        }
        return Math.signum(getOffset().getFloatValue() - offset.floatValue());
    }

    @k
    public final DraggableState getDraggableState$constraintlayout_compose_release() {
        return this.draggableState;
    }

    public final float getMaxBound$constraintlayout_compose_release() {
        return this.maxBound;
    }

    public final float getMinBound$constraintlayout_compose_release() {
        return this.minBound;
    }

    @k
    public final FloatState getOffset() {
        return this.offsetState;
    }

    @k
    public final FloatState getOverflow() {
        return this.overflowState;
    }

    @k
    public final SwipeProgress<T> getProgress() {
        List findBounds;
        Object currentValue;
        Object obj;
        float f11;
        findBounds = CarouselSwipeableKt.findBounds(getOffset().getFloatValue(), getAnchors$constraintlayout_compose_release().keySet());
        int size = findBounds.size();
        if (size == 0) {
            T currentValue2 = getCurrentValue();
            currentValue = getCurrentValue();
            obj = currentValue2;
            f11 = 1.0f;
        } else if (size != 1) {
            Pair a11 = getDirection() > 0.0f ? h1.a(findBounds.get(0), findBounds.get(1)) : h1.a(findBounds.get(1), findBounds.get(0));
            float floatValue = ((Number) a11.component1()).floatValue();
            float floatValue2 = ((Number) a11.component2()).floatValue();
            obj = l1.K(getAnchors$constraintlayout_compose_release(), Float.valueOf(floatValue));
            currentValue = l1.K(getAnchors$constraintlayout_compose_release(), Float.valueOf(floatValue2));
            f11 = (getOffset().getFloatValue() - floatValue) / (floatValue2 - floatValue);
        } else {
            Object K = l1.K(getAnchors$constraintlayout_compose_release(), findBounds.get(0));
            currentValue = l1.K(getAnchors$constraintlayout_compose_release(), findBounds.get(0));
            f11 = 1.0f;
            obj = K;
        }
        return new SwipeProgress<>(obj, currentValue, f11);
    }

    @m80.l
    public final ResistanceConfig getResistance$constraintlayout_compose_release() {
        return (ResistanceConfig) this.resistance$delegate.getValue();
    }

    public final T getTargetValue() {
        Float offset;
        float computeTarget;
        Float value = this.animationTarget.getValue();
        if (value != null) {
            computeTarget = value.floatValue();
        } else {
            float floatValue = getOffset().getFloatValue();
            offset = CarouselSwipeableKt.getOffset(getAnchors$constraintlayout_compose_release(), getCurrentValue());
            computeTarget = CarouselSwipeableKt.computeTarget(floatValue, offset != null ? offset.floatValue() : getOffset().getFloatValue(), getAnchors$constraintlayout_compose_release().keySet(), getThresholds$constraintlayout_compose_release(), 0.0f, Float.POSITIVE_INFINITY);
        }
        T t11 = getAnchors$constraintlayout_compose_release().get(Float.valueOf(computeTarget));
        return t11 == null ? getCurrentValue() : t11;
    }

    @k
    public final p<Float, Float, Float> getThresholds$constraintlayout_compose_release() {
        return (p) this.thresholds$delegate.getValue();
    }

    public final float getVelocityThreshold$constraintlayout_compose_release() {
        return this.velocityThreshold$delegate.getFloatValue();
    }

    public final boolean isAnimationRunning() {
        return ((Boolean) this.isAnimationRunning$delegate.getValue()).booleanValue();
    }

    public final float performDrag(float f11) {
        float H = u.H(this.absoluteOffset.getFloatValue() + f11, this.minBound, this.maxBound) - this.absoluteOffset.getFloatValue();
        if (Math.abs(H) > 0.0f) {
            this.draggableState.dispatchRawDelta(H);
        }
        return H;
    }

    @m80.l
    public final Object performFling(final float f11, @k c<? super g2> cVar) {
        Object collect = this.latestNonEmptyAnchorsFlow.collect(new j(this) { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableState$performFling$2
            final /* synthetic */ CarouselSwipeableState<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // kotlinx.coroutines.flow.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, c cVar2) {
                return emit((Map) obj, (c<? super g2>) cVar2);
            }

            public final Object emit(Map<Float, ? extends T> map, c<? super g2> cVar2) {
                Float offset;
                float computeTarget;
                Object animateInternalToOffset;
                offset = CarouselSwipeableKt.getOffset(map, this.this$0.getCurrentValue());
                g0.m(offset);
                float floatValue = offset.floatValue();
                computeTarget = CarouselSwipeableKt.computeTarget(this.this$0.getOffset().getFloatValue(), floatValue, map.keySet(), this.this$0.getThresholds$constraintlayout_compose_release(), f11, this.this$0.getVelocityThreshold$constraintlayout_compose_release());
                T t11 = map.get(l00.a.e(computeTarget));
                if (t11 != null && this.this$0.getConfirmStateChange$constraintlayout_compose_release().invoke(t11).booleanValue()) {
                    Object animateTo$default = CarouselSwipeableState.animateTo$default(this.this$0, t11, null, cVar2, 2, null);
                    return animateTo$default == b.l() ? animateTo$default : g2.f100423a;
                }
                CarouselSwipeableState<T> carouselSwipeableState = this.this$0;
                animateInternalToOffset = carouselSwipeableState.animateInternalToOffset(floatValue, carouselSwipeableState.getAnimationSpec$constraintlayout_compose_release(), cVar2);
                return animateInternalToOffset == b.l() ? animateInternalToOffset : g2.f100423a;
            }
        }, cVar);
        return collect == b.l() ? collect : g2.f100423a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x009f, code lost:
    
        if (snapInternalToOffset(r10, r0) == r1) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processNewAnchors$constraintlayout_compose_release(@m80.k java.util.Map<java.lang.Float, ? extends T> r10, @m80.k java.util.Map<java.lang.Float, ? extends T> r11, @m80.k j00.c<? super yz.g2> r12) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.carousel.CarouselSwipeableState.processNewAnchors$constraintlayout_compose_release(java.util.Map, java.util.Map, j00.c):java.lang.Object");
    }

    public final void setAnchors$constraintlayout_compose_release(@k Map<Float, ? extends T> map) {
        this.anchors$delegate.setValue(map);
    }

    public final void setMaxBound$constraintlayout_compose_release(float f11) {
        this.maxBound = f11;
    }

    public final void setMinBound$constraintlayout_compose_release(float f11) {
        this.minBound = f11;
    }

    public final void setResistance$constraintlayout_compose_release(@m80.l ResistanceConfig resistanceConfig) {
        this.resistance$delegate.setValue(resistanceConfig);
    }

    public final void setThresholds$constraintlayout_compose_release(@k p<? super Float, ? super Float, Float> pVar) {
        this.thresholds$delegate.setValue(pVar);
    }

    public final void setVelocityThreshold$constraintlayout_compose_release(float f11) {
        this.velocityThreshold$delegate.setFloatValue(f11);
    }

    @m80.l
    public final Object snapTo(T t11, @k c<? super g2> cVar) {
        Object collect = this.latestNonEmptyAnchorsFlow.collect(new CarouselSwipeableState$snapTo$2(t11, this), cVar);
        return collect == b.l() ? collect : g2.f100423a;
    }

    public /* synthetic */ CarouselSwipeableState(Object obj, AnimationSpec animationSpec, l lVar, int i11, v vVar) {
        this(obj, (i11 & 2) != 0 ? SwipeableDefaults.INSTANCE.getAnimationSpec() : animationSpec, (i11 & 4) != 0 ? new l<T, Boolean>() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.l
            public final Boolean invoke(T t11) {
                return Boolean.TRUE;
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Boolean invoke(Object obj2) {
                return invoke((AnonymousClass1) obj2);
            }
        } : lVar);
    }
}
