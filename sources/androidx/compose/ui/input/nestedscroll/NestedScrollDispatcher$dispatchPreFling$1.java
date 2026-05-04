package androidx.compose.ui.input.nestedscroll;

import j00.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import l00.d;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", i = {}, l = {200}, m = "dispatchPreFling-QWom1Mo", n = {}, s = {})
/* loaded from: classes.dex */
public final class NestedScrollDispatcher$dispatchPreFling$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NestedScrollDispatcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollDispatcher$dispatchPreFling$1(NestedScrollDispatcher nestedScrollDispatcher, c<? super NestedScrollDispatcher$dispatchPreFling$1> cVar) {
        super(cVar);
        this.this$0 = nestedScrollDispatcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m3608dispatchPreFlingQWom1Mo(0L, this);
    }
}
