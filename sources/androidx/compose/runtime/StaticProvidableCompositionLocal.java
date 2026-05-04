package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 2)
/* loaded from: classes.dex */
public final class StaticProvidableCompositionLocal<T> extends ProvidableCompositionLocal<T> {
    public static final int $stable = 0;

    public StaticProvidableCompositionLocal(@k x00.a<? extends T> aVar) {
        super(aVar);
    }

    @Override // androidx.compose.runtime.ProvidableCompositionLocal
    @k
    public ProvidedValue<T> defaultProvidedValue$runtime_release(T t11) {
        return new ProvidedValue<>(this, t11, t11 == null, null, null, null, false);
    }
}
