package androidx.datastore.core;

import j00.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import l00.d;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.datastore.core.FileWriteScope", f = "FileStorage.kt", i = {0}, l = {201}, m = "writeData", n = {"stream"}, s = {"L$1"})
/* loaded from: classes2.dex */
public final class FileWriteScope$writeData$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FileWriteScope<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileWriteScope$writeData$1(FileWriteScope<T> fileWriteScope, c<? super FileWriteScope$writeData$1> cVar) {
        super(cVar);
        this.this$0 = fileWriteScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.writeData(null, this);
    }
}
