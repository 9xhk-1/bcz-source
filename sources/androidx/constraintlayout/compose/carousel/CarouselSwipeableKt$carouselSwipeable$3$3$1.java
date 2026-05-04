package androidx.constraintlayout.compose.carousel;

import a00.l1;
import androidx.compose.ui.unit.Density;
import c40.r0;
import j00.c;
import java.util.Map;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.u0;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$carouselSwipeable$3$3$1", f = "CarouselSwipeable.kt", i = {}, l = {584}, m = "invokeSuspend", n = {}, s = {})
@u0({"SMAP\nCarouselSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarouselSwipeable.kt\nandroidx/constraintlayout/compose/carousel/CarouselSwipeableKt$carouselSwipeable$3$3$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,850:1\n1#2:851\n*E\n"})
/* loaded from: classes2.dex */
public final class CarouselSwipeableKt$carouselSwipeable$3$3$1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ Map<Float, T> $anchors;
    final /* synthetic */ Density $density;
    final /* synthetic */ ResistanceConfig $resistance;
    final /* synthetic */ CarouselSwipeableState<T> $state;
    final /* synthetic */ p<T, T, ThresholdConfig> $thresholds;
    final /* synthetic */ float $velocityThreshold;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CarouselSwipeableKt$carouselSwipeable$3$3$1(CarouselSwipeableState<T> carouselSwipeableState, Map<Float, ? extends T> map, ResistanceConfig resistanceConfig, Density density, p<? super T, ? super T, ? extends ThresholdConfig> pVar, float f11, c<? super CarouselSwipeableKt$carouselSwipeable$3$3$1> cVar) {
        super(2, cVar);
        this.$state = carouselSwipeableState;
        this.$anchors = map;
        this.$resistance = resistanceConfig;
        this.$density = density;
        this.$thresholds = pVar;
        this.$velocityThreshold = f11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new CarouselSwipeableKt$carouselSwipeable$3$3$1(this.$state, this.$anchors, this.$resistance, this.$density, this.$thresholds, this.$velocityThreshold, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((CarouselSwipeableKt$carouselSwipeable$3$3$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            Map anchors$constraintlayout_compose_release = this.$state.getAnchors$constraintlayout_compose_release();
            this.$state.setAnchors$constraintlayout_compose_release(this.$anchors);
            this.$state.setResistance$constraintlayout_compose_release(this.$resistance);
            CarouselSwipeableState<T> carouselSwipeableState = this.$state;
            final Map<Float, T> map = this.$anchors;
            final p<T, T, ThresholdConfig> pVar = this.$thresholds;
            final Density density = this.$density;
            carouselSwipeableState.setThresholds$constraintlayout_compose_release(new p<Float, Float, Float>() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$carouselSwipeable$3$3$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ Float invoke(Float f11, Float f12) {
                    return invoke(f11.floatValue(), f12.floatValue());
                }

                public final Float invoke(float f11, float f12) {
                    return Float.valueOf(pVar.invoke(l1.K(map, Float.valueOf(f11)), l1.K(map, Float.valueOf(f12))).computeThreshold(density, f11, f12));
                }
            });
            this.$state.setVelocityThreshold$constraintlayout_compose_release(this.$density.mo377toPx0680j_4(this.$velocityThreshold));
            CarouselSwipeableState<T> carouselSwipeableState2 = this.$state;
            Object obj2 = this.$anchors;
            this.label = 1;
            if (carouselSwipeableState2.processNewAnchors$constraintlayout_compose_release(anchors$constraintlayout_compose_release, obj2, this) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
        }
        return g2.f100423a;
    }
}
