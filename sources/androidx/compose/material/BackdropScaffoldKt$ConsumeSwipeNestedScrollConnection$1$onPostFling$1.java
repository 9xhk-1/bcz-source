package androidx.compose.material;

import j00.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import l00.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.material.BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1", f = "BackdropScaffold.kt", i = {0}, l = {680}, m = "onPostFling-RZ2iAVY", n = {"available"}, s = {"J$0"})
/* loaded from: classes.dex */
public final class BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPostFling$1 extends ContinuationImpl {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPostFling$1(BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1 backdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1, c<? super BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPostFling$1> cVar) {
        super(cVar);
        this.this$0 = backdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo497onPostFlingRZ2iAVY(0L, 0L, this);
    }
}
