package androidx.compose.foundation.gestures;

import j00.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import l00.d;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.ScrollableNestedScrollConnection", f = "Scrollable.kt", i = {0, 1}, l = {898, 901}, m = "onPostFling-RZ2iAVY", n = {"available", "available"}, s = {"J$0", "J$0"})
/* loaded from: classes.dex */
public final class ScrollableNestedScrollConnection$onPostFling$1 extends ContinuationImpl {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ScrollableNestedScrollConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNestedScrollConnection$onPostFling$1(ScrollableNestedScrollConnection scrollableNestedScrollConnection, c<? super ScrollableNestedScrollConnection$onPostFling$1> cVar) {
        super(cVar);
        this.this$0 = scrollableNestedScrollConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo497onPostFlingRZ2iAVY(0L, 0L, this);
    }
}
