package androidx.compose.foundation.layout;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection", f = "WindowInsetsConnection.android.kt", i = {0, 0, 0, 1, 1, 1, 2, 2}, l = {301, 327, 352}, m = "fling-huYlsQE", n = {"this", "available", "flingAmount", "this", "endVelocity", "available", "this", "available"}, s = {"L$0", "J$0", "F$0", "L$0", "L$1", "J$0", "L$0", "J$0"})
/* loaded from: classes.dex */
public final class WindowInsetsNestedScrollConnection$fling$1 extends ContinuationImpl {
    float F$0;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WindowInsetsNestedScrollConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInsetsNestedScrollConnection$fling$1(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, j00.c<? super WindowInsetsNestedScrollConnection$fling$1> cVar) {
        super(cVar);
        this.this$0 = windowInsetsNestedScrollConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@m80.k Object obj) {
        Object m801flinghuYlsQE;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m801flinghuYlsQE = this.this$0.m801flinghuYlsQE(0L, 0.0f, false, this);
        return m801flinghuYlsQE;
    }
}
