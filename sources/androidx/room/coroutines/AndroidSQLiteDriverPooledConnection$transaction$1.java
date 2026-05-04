package androidx.room.coroutines;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.room.coroutines.AndroidSQLiteDriverPooledConnection", f = "AndroidSQLiteDriverConnectionPool.android.kt", i = {0, 0}, l = {87}, m = "transaction", n = {"this", "db"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
public final class AndroidSQLiteDriverPooledConnection$transaction$1<R> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidSQLiteDriverPooledConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSQLiteDriverPooledConnection$transaction$1(AndroidSQLiteDriverPooledConnection androidSQLiteDriverPooledConnection, j00.c<? super AndroidSQLiteDriverPooledConnection$transaction$1> cVar) {
        super(cVar);
        this.this$0 = androidSQLiteDriverPooledConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.transaction(null, null, this);
    }
}
