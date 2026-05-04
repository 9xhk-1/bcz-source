package androidx.constraintlayout.compose.carousel;

import j00.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import l00.d;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableState", f = "CarouselSwipeable.kt", i = {1, 1, 1, 2, 2, 2}, l = {146, 171, 174}, m = "processNewAnchors$constraintlayout_compose_release", n = {"this", "newAnchors", "targetOffset", "this", "newAnchors", "targetOffset"}, s = {"L$0", "L$1", "F$0", "L$0", "L$1", "F$0"})
/* loaded from: classes2.dex */
public final class CarouselSwipeableState$processNewAnchors$1 extends ContinuationImpl {
    float F$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CarouselSwipeableState<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselSwipeableState$processNewAnchors$1(CarouselSwipeableState<T> carouselSwipeableState, c<? super CarouselSwipeableState$processNewAnchors$1> cVar) {
        super(cVar);
        this.this$0 = carouselSwipeableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.processNewAnchors$constraintlayout_compose_release(null, null, this);
    }
}
