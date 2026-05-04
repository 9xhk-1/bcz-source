package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 2)
/* loaded from: classes.dex */
public final class DynamicValueHolder<T> implements ValueHolder<T> {
    public static final int $stable = 0;

    @k
    private final MutableState<T> state;

    public DynamicValueHolder(@k MutableState<T> mutableState) {
        this.state = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DynamicValueHolder copy$default(DynamicValueHolder dynamicValueHolder, MutableState mutableState, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            mutableState = dynamicValueHolder.state;
        }
        return dynamicValueHolder.copy(mutableState);
    }

    @k
    public final MutableState<T> component1() {
        return this.state;
    }

    @k
    public final DynamicValueHolder<T> copy(@k MutableState<T> mutableState) {
        return new DynamicValueHolder<>(mutableState);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DynamicValueHolder) && g0.g(this.state, ((DynamicValueHolder) obj).state);
    }

    @k
    public final MutableState<T> getState() {
        return this.state;
    }

    public int hashCode() {
        return this.state.hashCode();
    }

    @Override // androidx.compose.runtime.ValueHolder
    public T readValue(@k PersistentCompositionLocalMap persistentCompositionLocalMap) {
        return this.state.getValue();
    }

    @Override // androidx.compose.runtime.ValueHolder
    @k
    public ProvidedValue<T> toProvided(@k CompositionLocal<T> compositionLocal) {
        return new ProvidedValue<>(compositionLocal, null, false, null, this.state, null, true);
    }

    @k
    public String toString() {
        return "DynamicValueHolder(state=" + this.state + ')';
    }
}
