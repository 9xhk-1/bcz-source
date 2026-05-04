package androidx.lifecycle;

import c40.k1;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface LiveDataScope<T> {
    @l
    Object emit(T t11, @k j00.c<? super g2> cVar);

    @l
    Object emitSource(@k LiveData<T> liveData, @k j00.c<? super k1> cVar);

    @l
    T getLatestValue();
}
