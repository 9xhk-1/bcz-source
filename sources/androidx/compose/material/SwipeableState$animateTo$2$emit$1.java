package androidx.compose.material;

import j00.c;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import l00.d;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.material.SwipeableState$animateTo$2", f = "Swipeable.kt", i = {0, 0}, l = {327}, m = "emit", n = {"this", "anchors"}, s = {"L$0", "L$1"})
/* loaded from: classes.dex */
public final class SwipeableState$animateTo$2$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SwipeableState$animateTo$2<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwipeableState$animateTo$2$emit$1(SwipeableState$animateTo$2<? super T> swipeableState$animateTo$2, c<? super SwipeableState$animateTo$2$emit$1> cVar) {
        super(cVar);
        this.this$0 = swipeableState$animateTo$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((Map) null, (c<? super g2>) this);
    }
}
