package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class StaticValueHolder<T> implements ValueHolder<T> {
    public static final int $stable = 0;
    private final T value;

    public StaticValueHolder(T t11) {
        this.value = t11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StaticValueHolder copy$default(StaticValueHolder staticValueHolder, Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = staticValueHolder.value;
        }
        return staticValueHolder.copy(obj);
    }

    public final T component1() {
        return this.value;
    }

    @k
    public final StaticValueHolder<T> copy(T t11) {
        return new StaticValueHolder<>(t11);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StaticValueHolder) && g0.g(this.value, ((StaticValueHolder) obj).value);
    }

    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        T t11 = this.value;
        if (t11 == null) {
            return 0;
        }
        return t11.hashCode();
    }

    @Override // androidx.compose.runtime.ValueHolder
    public T readValue(@k PersistentCompositionLocalMap persistentCompositionLocalMap) {
        return this.value;
    }

    @Override // androidx.compose.runtime.ValueHolder
    @k
    public ProvidedValue<T> toProvided(@k CompositionLocal<T> compositionLocal) {
        T t11 = this.value;
        return new ProvidedValue<>(compositionLocal, t11, t11 == null, null, null, null, false);
    }

    @k
    public String toString() {
        return "StaticValueHolder(value=" + this.value + ')';
    }
}
