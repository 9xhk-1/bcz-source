package androidx.constraintlayout.compose.carousel;

import j00.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import l00.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1", f = "CarouselSwipeable.kt", i = {0}, l = {842}, m = "onPostFling-RZ2iAVY", n = {"available"}, s = {"J$0"})
/* loaded from: classes2.dex */
public final class CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 extends ContinuationImpl {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1(CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1 carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1, c<? super CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1> cVar) {
        super(cVar);
        this.this$0 = carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo497onPostFlingRZ2iAVY(0L, 0L, this);
    }
}
