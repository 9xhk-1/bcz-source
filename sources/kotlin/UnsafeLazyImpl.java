package kotlin;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import yz.a2;
import yz.c0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class UnsafeLazyImpl<T> implements c0<T>, Serializable {

    @l
    private Object _value;

    @l
    private x00.a<? extends T> initializer;

    public UnsafeLazyImpl(@k x00.a<? extends T> initializer) {
        g0.p(initializer, "initializer");
        this.initializer = initializer;
        this._value = a2.f100409a;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // yz.c0
    public T getValue() {
        if (this._value == a2.f100409a) {
            x00.a<? extends T> aVar = this.initializer;
            g0.m(aVar);
            this._value = aVar.invoke();
            this.initializer = null;
        }
        return (T) this._value;
    }

    @Override // yz.c0
    public boolean isInitialized() {
        return this._value != a2.f100409a;
    }

    @k
    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
