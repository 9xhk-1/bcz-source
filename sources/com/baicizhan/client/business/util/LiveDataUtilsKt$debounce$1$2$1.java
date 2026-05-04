package com.baicizhan.client.business.util;

import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "com.baicizhan.client.business.util.LiveDataUtilsKt$debounce$1$2$1", f = "LiveDataUtils.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes4.dex */
public final class LiveDataUtilsKt$debounce$1$2$1 extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {
    final /* synthetic */ kotlinx.coroutines.flow.x<T> $debounceFlow;
    final /* synthetic */ T $sourceData;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveDataUtilsKt$debounce$1$2$1(kotlinx.coroutines.flow.x<T> xVar, T t11, j00.c<? super LiveDataUtilsKt$debounce$1$2$1> cVar) {
        super(2, cVar);
        this.$debounceFlow = xVar;
        this.$sourceData = t11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new LiveDataUtilsKt$debounce$1$2$1(this.$debounceFlow, this.$sourceData, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((LiveDataUtilsKt$debounce$1$2$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            kotlinx.coroutines.flow.x<T> xVar = this.$debounceFlow;
            T t11 = this.$sourceData;
            this.label = 1;
            if (xVar.emit(t11, this) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
        }
        return g2.f100423a;
    }
}
