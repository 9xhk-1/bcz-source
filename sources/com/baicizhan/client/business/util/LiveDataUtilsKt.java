package com.baicizhan.client.business.util;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import c40.h1;
import c40.r0;
import kotlin.jvm.internal.g0;
import kotlinx.coroutines.flow.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class LiveDataUtilsKt {
    @m80.k
    public static final <T> MediatorLiveData<T> debounce(@m80.k LiveData<T> liveData, long j11, @m80.k final r0 scope) {
        g0.p(liveData, "<this>");
        g0.p(scope, "scope");
        MediatorLiveData<T> mediatorLiveData = new MediatorLiveData<>();
        final kotlinx.coroutines.flow.x b11 = e0.b(0, 0, null, 7, null);
        kotlinx.coroutines.flow.k.W0(kotlinx.coroutines.flow.k.h1(kotlinx.coroutines.flow.k.P0(kotlinx.coroutines.flow.k.c0(b11, j11), h1.e()), new LiveDataUtilsKt$debounce$1$1(mediatorLiveData, null)), scope);
        mediatorLiveData.addSource(liveData, new LiveDataUtilsKt$sam$androidx_lifecycle_Observer$0(new x00.l() { // from class: com.baicizhan.client.business.util.n
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 debounce$lambda$0$0;
                debounce$lambda$0$0 = LiveDataUtilsKt.debounce$lambda$0$0(r0.this, b11, obj);
                return debounce$lambda$0$0;
            }
        }));
        return mediatorLiveData;
    }

    public static /* synthetic */ MediatorLiveData debounce$default(LiveData liveData, long j11, r0 r0Var, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 1000;
        }
        return debounce(liveData, j11, r0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2 debounce$lambda$0$0(r0 r0Var, kotlinx.coroutines.flow.x xVar, Object obj) {
        c40.k.f(r0Var, null, null, new LiveDataUtilsKt$debounce$1$2$1(xVar, obj, null), 3, null);
        return g2.f100423a;
    }

    @m80.k
    public static final <T> LiveData<T> filter(@m80.k LiveData<T> liveData, @m80.k final x00.l<? super T, Boolean> filter) {
        g0.p(liveData, "<this>");
        g0.p(filter, "filter");
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new LiveDataUtilsKt$sam$i$androidx_lifecycle_Observer$0(new x00.l<T, g2>() { // from class: com.baicizhan.client.business.util.LiveDataUtilsKt$filter$1$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Object obj) {
                invoke2((LiveDataUtilsKt$filter$1$1<T>) obj);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(T t11) {
                if (filter.invoke(t11).booleanValue()) {
                    mediatorLiveData.setValue(t11);
                }
            }
        }));
        return mediatorLiveData;
    }
}
