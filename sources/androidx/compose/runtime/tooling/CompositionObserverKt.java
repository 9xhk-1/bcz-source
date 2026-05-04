package androidx.compose.runtime.tooling;

import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionImpl;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.ExperimentalComposeRuntimeApi;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Recomposer;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class CompositionObserverKt {
    @ExperimentalComposeRuntimeApi
    @k
    public static final CompositionObserverHandle observe(@k Recomposer recomposer, @k CompositionRegistrationObserver compositionRegistrationObserver) {
        return recomposer.addCompositionRegistrationObserver$runtime_release(compositionRegistrationObserver);
    }

    @l
    @ExperimentalComposeRuntimeApi
    public static final CompositionObserverHandle observe(@k Composition composition, @k CompositionObserver compositionObserver) {
        CompositionImpl compositionImpl = (CompositionImpl) CompositionKt.getCompositionService(composition, CompositionKt.getCompositionImplServiceKey());
        if (compositionImpl != null) {
            return compositionImpl.observe$runtime_release(compositionObserver);
        }
        return null;
    }

    @ExperimentalComposeRuntimeApi
    @k
    public static final CompositionObserverHandle observe(@k RecomposeScope recomposeScope, @k RecomposeScopeObserver recomposeScopeObserver) {
        g0.n(recomposeScope, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
        return ((RecomposeScopeImpl) recomposeScope).observe$runtime_release(recomposeScopeObserver);
    }
}
