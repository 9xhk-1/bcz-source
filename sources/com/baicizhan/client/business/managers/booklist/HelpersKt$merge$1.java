package com.baicizhan.client.business.managers.booklist;

import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "com.baicizhan.client.business.managers.booklist.HelpersKt", f = "Helpers.kt", i = {0, 0}, l = {27}, m = "merge", n = {"books", "bookId"}, s = {"L$0", "I$0"}, v = 1)
/* loaded from: classes4.dex */
public final class HelpersKt$merge$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public HelpersKt$merge$1(j00.c<? super HelpersKt$merge$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object merge = HelpersKt.merge(0, null, this);
        return merge == kotlin.coroutines.intrinsics.b.l() ? merge : Result.m6307boximpl(merge);
    }
}
