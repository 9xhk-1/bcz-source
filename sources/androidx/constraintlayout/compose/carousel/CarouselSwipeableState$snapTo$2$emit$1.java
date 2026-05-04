package androidx.constraintlayout.compose.carousel;

import j00.c;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import l00.d;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableState$snapTo$2", f = "CarouselSwipeable.kt", i = {0}, l = {299}, m = "emit", n = {"this"}, s = {"L$0"})
/* loaded from: classes2.dex */
public final class CarouselSwipeableState$snapTo$2$emit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CarouselSwipeableState$snapTo$2<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CarouselSwipeableState$snapTo$2$emit$1(CarouselSwipeableState$snapTo$2<? super T> carouselSwipeableState$snapTo$2, c<? super CarouselSwipeableState$snapTo$2$emit$1> cVar) {
        super(cVar);
        this.this$0 = carouselSwipeableState$snapTo$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((Map) null, (c<? super g2>) this);
    }
}
