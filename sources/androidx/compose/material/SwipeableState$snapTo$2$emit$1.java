package androidx.compose.material;

import j00.c;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import l00.d;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.material.SwipeableState$snapTo$2", f = "Swipeable.kt", i = {0}, l = {310}, m = "emit", n = {"this"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class SwipeableState$snapTo$2$emit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SwipeableState$snapTo$2<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwipeableState$snapTo$2$emit$1(SwipeableState$snapTo$2<? super T> swipeableState$snapTo$2, c<? super SwipeableState$snapTo$2$emit$1> cVar) {
        super(cVar);
        this.this$0 = swipeableState$snapTo$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((Map) null, (c<? super g2>) this);
    }
}
