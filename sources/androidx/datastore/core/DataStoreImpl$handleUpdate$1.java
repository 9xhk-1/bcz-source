package androidx.datastore.core;

import j00.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import l00.d;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", i = {1, 1}, l = {com.jiongji.andriod.card.R.styleable.Theme_drawable_tab_mall_new, 243, com.jiongji.andriod.card.R.styleable.Theme_drawable_walk_sound2}, m = "handleUpdate", n = {"update", "$this$handleUpdate_u24lambda_u242"}, s = {"L$0", "L$1"})
/* loaded from: classes2.dex */
public final class DataStoreImpl$handleUpdate$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$handleUpdate$1(DataStoreImpl<T> dataStoreImpl, c<? super DataStoreImpl$handleUpdate$1> cVar) {
        super(cVar);
        this.this$0 = dataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object handleUpdate;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        handleUpdate = this.this$0.handleUpdate(null, this);
        return handleUpdate;
    }
}
