package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.KotlinNothingValueException;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 2)
/* loaded from: classes.dex */
public final class ComputedProvidableCompositionLocal<T> extends ProvidableCompositionLocal<T> {
    public static final int $stable = 0;

    @k
    private final ComputedValueHolder<T> defaultValueHolder;

    public ComputedProvidableCompositionLocal(@k l<? super CompositionLocalAccessorScope, ? extends T> lVar) {
        super(new x00.a<T>() { // from class: androidx.compose.runtime.ComputedProvidableCompositionLocal.1
            @Override // x00.a
            public final T invoke() {
                ComposerKt.composeRuntimeError("Unexpected call to default provider");
                throw new KotlinNothingValueException();
            }
        });
        this.defaultValueHolder = new ComputedValueHolder<>(lVar);
    }

    @Override // androidx.compose.runtime.ProvidableCompositionLocal
    @k
    public ProvidedValue<T> defaultProvidedValue$runtime_release(T t11) {
        return new ProvidedValue<>(this, t11, t11 == null, null, null, null, true);
    }

    @Override // androidx.compose.runtime.CompositionLocal
    @k
    public ComputedValueHolder<T> getDefaultValueHolder$runtime_release() {
        return this.defaultValueHolder;
    }
}
