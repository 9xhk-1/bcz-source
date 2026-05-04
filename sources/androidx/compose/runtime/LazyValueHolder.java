package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.KotlinNothingValueException;
import m80.k;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LazyValueHolder<T> implements ValueHolder<T> {
    public static final int $stable = 8;

    @k
    private final c0 current$delegate;

    public LazyValueHolder(@k x00.a<? extends T> aVar) {
        this.current$delegate = e0.c(aVar);
    }

    private final T getCurrent() {
        return (T) this.current$delegate.getValue();
    }

    @Override // androidx.compose.runtime.ValueHolder
    public T readValue(@k PersistentCompositionLocalMap persistentCompositionLocalMap) {
        return getCurrent();
    }

    @Override // androidx.compose.runtime.ValueHolder
    @k
    public ProvidedValue<T> toProvided(@k CompositionLocal<T> compositionLocal) {
        ComposerKt.composeRuntimeError("Cannot produce a provider from a lazy value holder");
        throw new KotlinNothingValueException();
    }
}
