package androidx.compose.runtime;

import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
public interface MutableState<T> extends State<T> {
    T component1();

    @k
    l<T, g2> component2();

    @Override // androidx.compose.runtime.State
    T getValue();

    void setValue(T t11);
}
