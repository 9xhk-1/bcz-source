package androidx.constraintlayout.compose.carousel;

import c40.r0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.g0;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$rememberCarouselSwipeableStateFor$1$1", f = "CarouselSwipeable.kt", i = {}, l = {493}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class CarouselSwipeableKt$rememberCarouselSwipeableStateFor$1$1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ CarouselSwipeableState<T> $swipeableState;
    final /* synthetic */ T $value;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselSwipeableKt$rememberCarouselSwipeableStateFor$1$1(T t11, CarouselSwipeableState<T> carouselSwipeableState, c<? super CarouselSwipeableKt$rememberCarouselSwipeableStateFor$1$1> cVar) {
        super(2, cVar);
        this.$value = t11;
        this.$swipeableState = carouselSwipeableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new CarouselSwipeableKt$rememberCarouselSwipeableStateFor$1$1(this.$value, this.$swipeableState, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((CarouselSwipeableKt$rememberCarouselSwipeableStateFor$1$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            if (!g0.g(this.$value, this.$swipeableState.getCurrentValue())) {
                CarouselSwipeableState<T> carouselSwipeableState = this.$swipeableState;
                T t11 = this.$value;
                this.label = 1;
                if (CarouselSwipeableState.animateTo$default(carouselSwipeableState, t11, null, this, 2, null) == l11) {
                    return l11;
                }
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
