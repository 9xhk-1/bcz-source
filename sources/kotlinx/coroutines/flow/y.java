package kotlinx.coroutines.flow;

import c40.z1;
import yz.c1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@c1(markerClass = {z1.class})
/* loaded from: classes8.dex */
public interface y<T> extends m0<T>, x<T> {
    boolean b(T t11, T t12);

    @Override // kotlinx.coroutines.flow.m0
    T getValue();

    void setValue(T t11);
}
