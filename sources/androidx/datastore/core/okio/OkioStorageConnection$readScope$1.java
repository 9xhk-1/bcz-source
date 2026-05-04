package androidx.datastore.core.okio;

import j00.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import l00.d;
import m80.k;
import m80.l;
import vb.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.datastore.core.okio.OkioStorageConnection", f = "OkioStorage.kt", i = {0, 0, 0}, l = {113}, m = "readScope", n = {"this", "$this$use$iv", a.f93813p}, s = {"L$0", "L$1", "Z$0"})
/* loaded from: classes2.dex */
public final class OkioStorageConnection$readScope$1<R> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OkioStorageConnection<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkioStorageConnection$readScope$1(OkioStorageConnection<T> okioStorageConnection, c<? super OkioStorageConnection$readScope$1> cVar) {
        super(cVar);
        this.this$0 = okioStorageConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.readScope(null, this);
    }
}
