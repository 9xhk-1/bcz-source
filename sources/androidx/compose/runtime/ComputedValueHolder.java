package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 2)
/* loaded from: classes.dex */
public final class ComputedValueHolder<T> implements ValueHolder<T> {
    public static final int $stable = 0;

    @k
    private final l<CompositionLocalAccessorScope, T> compute;

    /* JADX WARN: Multi-variable type inference failed */
    public ComputedValueHolder(@k l<? super CompositionLocalAccessorScope, ? extends T> lVar) {
        this.compute = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ComputedValueHolder copy$default(ComputedValueHolder computedValueHolder, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = computedValueHolder.compute;
        }
        return computedValueHolder.copy(lVar);
    }

    @k
    public final l<CompositionLocalAccessorScope, T> component1() {
        return this.compute;
    }

    @k
    public final ComputedValueHolder<T> copy(@k l<? super CompositionLocalAccessorScope, ? extends T> lVar) {
        return new ComputedValueHolder<>(lVar);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ComputedValueHolder) && g0.g(this.compute, ((ComputedValueHolder) obj).compute);
    }

    @k
    public final l<CompositionLocalAccessorScope, T> getCompute() {
        return this.compute;
    }

    public int hashCode() {
        return this.compute.hashCode();
    }

    @Override // androidx.compose.runtime.ValueHolder
    public T readValue(@k PersistentCompositionLocalMap persistentCompositionLocalMap) {
        return this.compute.invoke(persistentCompositionLocalMap);
    }

    @Override // androidx.compose.runtime.ValueHolder
    @k
    public ProvidedValue<T> toProvided(@k CompositionLocal<T> compositionLocal) {
        return new ProvidedValue<>(compositionLocal, null, false, null, null, this.compute, false);
    }

    @k
    public String toString() {
        return "ComputedValueHolder(compute=" + this.compute + ')';
    }
}
