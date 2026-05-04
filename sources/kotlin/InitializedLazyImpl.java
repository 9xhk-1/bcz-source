package kotlin;

import java.io.Serializable;
import m80.k;
import yz.c0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class InitializedLazyImpl<T> implements c0<T>, Serializable {
    private final T value;

    public InitializedLazyImpl(T t11) {
        this.value = t11;
    }

    @Override // yz.c0
    public T getValue() {
        return this.value;
    }

    @Override // yz.c0
    public boolean isInitialized() {
        return true;
    }

    @k
    public String toString() {
        return String.valueOf(getValue());
    }
}
