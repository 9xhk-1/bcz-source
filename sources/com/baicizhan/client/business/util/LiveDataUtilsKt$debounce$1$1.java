package com.baicizhan.client.business.util;

import androidx.lifecycle.MediatorLiveData;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "com.baicizhan.client.business.util.LiveDataUtilsKt$debounce$1$1", f = "LiveDataUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes4.dex */
public final class LiveDataUtilsKt$debounce$1$1<T> extends SuspendLambda implements x00.p<T, j00.c<? super g2>, Object> {
    final /* synthetic */ MediatorLiveData<T> $mld;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveDataUtilsKt$debounce$1$1(MediatorLiveData<T> mediatorLiveData, j00.c<? super LiveDataUtilsKt$debounce$1$1> cVar) {
        super(2, cVar);
        this.$mld = mediatorLiveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        LiveDataUtilsKt$debounce$1$1 liveDataUtilsKt$debounce$1$1 = new LiveDataUtilsKt$debounce$1$1(this.$mld, cVar);
        liveDataUtilsKt$debounce$1$1.L$0 = obj;
        return liveDataUtilsKt$debounce$1$1;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(T t11, j00.c<? super g2> cVar) {
        return ((LiveDataUtilsKt$debounce$1$1) create(t11, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.L$0;
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.e.n(obj);
        this.$mld.setValue(obj2);
        return g2.f100423a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x00.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, j00.c<? super g2> cVar) {
        return invoke2((LiveDataUtilsKt$debounce$1$1<T>) obj, cVar);
    }
}
