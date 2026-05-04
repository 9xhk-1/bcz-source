package com.baicizhan.client.business.managers.booklist;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "com.baicizhan.client.business.managers.booklist.HelpersKt", f = "Helpers.kt", i = {0, 0, 0, 0}, l = {20}, m = "queryMergeResult", n = {"$this$queryMergeResult", "taskId", "state", "times"}, s = {"L$0", "L$1", "L$2", "I$0"}, v = 1)
/* loaded from: classes4.dex */
public final class HelpersKt$queryMergeResult$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public HelpersKt$queryMergeResult$1(j00.c<? super HelpersKt$queryMergeResult$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object queryMergeResult;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        queryMergeResult = HelpersKt.queryMergeResult(null, null, this);
        return queryMergeResult;
    }
}
