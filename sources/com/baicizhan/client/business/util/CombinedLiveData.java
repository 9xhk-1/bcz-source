package com.baicizhan.client.business.util;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class CombinedLiveData<T, K, S> extends MediatorLiveData<S> {
    public static final int $stable = 8;

    @m80.k
    private final x00.p<T, K, S> combine;

    @m80.l
    private T data1;

    @m80.l
    private K data2;

    /* JADX WARN: Multi-variable type inference failed */
    public CombinedLiveData(@m80.k LiveData<T> source1, @m80.k LiveData<K> source2, @m80.k x00.p<? super T, ? super K, ? extends S> combine) {
        g0.p(source1, "source1");
        g0.p(source2, "source2");
        g0.p(combine, "combine");
        this.combine = combine;
        super.addSource(source1, new LiveDataUtilsKt$sam$androidx_lifecycle_Observer$0(new x00.l() { // from class: com.baicizhan.client.business.util.f
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 _init_$lambda$0;
                _init_$lambda$0 = CombinedLiveData._init_$lambda$0(CombinedLiveData.this, obj);
                return _init_$lambda$0;
            }
        }));
        super.addSource(source2, new LiveDataUtilsKt$sam$androidx_lifecycle_Observer$0(new x00.l() { // from class: com.baicizhan.client.business.util.g
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 _init_$lambda$1;
                _init_$lambda$1 = CombinedLiveData._init_$lambda$1(CombinedLiveData.this, obj);
                return _init_$lambda$1;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final g2 _init_$lambda$0(CombinedLiveData combinedLiveData, Object obj) {
        combinedLiveData.data1 = obj;
        combinedLiveData.setValue(combinedLiveData.combine.invoke(obj, combinedLiveData.data2));
        return g2.f100423a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final g2 _init_$lambda$1(CombinedLiveData combinedLiveData, Object obj) {
        combinedLiveData.data2 = obj;
        combinedLiveData.setValue(combinedLiveData.combine.invoke(combinedLiveData.data1, obj));
        return g2.f100423a;
    }

    @Override // androidx.lifecycle.MediatorLiveData
    public <T> void addSource(@m80.k LiveData<T> source, @m80.k Observer<? super T> onChanged) {
        g0.p(source, "source");
        g0.p(onChanged, "onChanged");
        throw new UnsupportedOperationException();
    }

    @Override // androidx.lifecycle.MediatorLiveData
    public <T> void removeSource(@m80.k LiveData<T> toRemote) {
        g0.p(toRemote, "toRemote");
        throw new UnsupportedOperationException();
    }
}
