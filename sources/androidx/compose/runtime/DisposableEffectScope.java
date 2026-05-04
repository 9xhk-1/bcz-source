package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class DisposableEffectScope {
    public static final int $stable = 0;

    @k
    public final DisposableEffectResult onDispose(@k final x00.a<g2> aVar) {
        return new DisposableEffectResult() { // from class: androidx.compose.runtime.DisposableEffectScope$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                aVar.invoke();
            }
        };
    }
}
