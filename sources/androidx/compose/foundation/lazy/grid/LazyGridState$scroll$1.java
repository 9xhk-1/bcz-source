package androidx.compose.foundation.lazy.grid;

import j00.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import l00.d;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.lazy.grid.LazyGridState", f = "LazyGridState.kt", i = {0, 0, 0}, l = {377, 378}, m = "scroll", n = {"this", "scrollPriority", "block"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes.dex */
public final class LazyGridState$scroll$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LazyGridState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridState$scroll$1(LazyGridState lazyGridState, c<? super LazyGridState$scroll$1> cVar) {
        super(cVar);
        this.this$0 = lazyGridState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.scroll(null, null, this);
    }
}
