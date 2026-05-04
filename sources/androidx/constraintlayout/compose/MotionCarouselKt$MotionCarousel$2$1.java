package androidx.constraintlayout.compose;

import androidx.compose.runtime.MutableState;
import androidx.constraintlayout.compose.carousel.CarouselSwipeableState;
import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.constraintlayout.compose.MotionCarouselKt$MotionCarousel$2$1", f = "MotionCarousel.kt", i = {}, l = {209}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class MotionCarouselKt$MotionCarousel$2$1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
    final /* synthetic */ MutableState<CarouselState> $state$delegate;
    final /* synthetic */ String $swipeStateStart;
    final /* synthetic */ CarouselSwipeableState<String> $swipeableState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MotionCarouselKt$MotionCarousel$2$1(CarouselSwipeableState<String> carouselSwipeableState, String str, MutableState<CarouselState> mutableState, j00.c<? super MotionCarouselKt$MotionCarousel$2$1> cVar) {
        super(2, cVar);
        this.$swipeableState = carouselSwipeableState;
        this.$swipeStateStart = str;
        this.$state$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new MotionCarouselKt$MotionCarousel$2$1(this.$swipeableState, this.$swipeStateStart, this.$state$delegate, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((MotionCarouselKt$MotionCarousel$2$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CarouselState MotionCarousel$lambda$4;
        CarouselState MotionCarousel$lambda$42;
        CarouselState MotionCarousel$lambda$43;
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            MotionCarousel$lambda$4 = MotionCarouselKt.MotionCarousel$lambda$4(this.$state$delegate);
            if (MotionCarousel$lambda$4.getIndex() > 0) {
                MotionCarousel$lambda$42 = MotionCarouselKt.MotionCarousel$lambda$4(this.$state$delegate);
                MotionCarousel$lambda$42.setIndex(MotionCarousel$lambda$42.getIndex() - 1);
            }
            CarouselSwipeableState<String> carouselSwipeableState = this.$swipeableState;
            String str = this.$swipeStateStart;
            this.label = 1;
            if (carouselSwipeableState.snapTo(str, this) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
        }
        MotionCarousel$lambda$43 = MotionCarouselKt.MotionCarousel$lambda$4(this.$state$delegate);
        MotionCarousel$lambda$43.setDirection(MotionCarouselDirection.FORWARD);
        return g2.f100423a;
    }
}
