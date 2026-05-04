package androidx.compose.runtime.tooling;

import androidx.compose.runtime.ExperimentalComposeRuntimeApi;
import androidx.compose.runtime.RecomposeScope;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@ExperimentalComposeRuntimeApi
/* loaded from: classes.dex */
public interface RecomposeScopeObserver {
    void onBeginScopeComposition(@k RecomposeScope recomposeScope);

    void onEndScopeComposition(@k RecomposeScope recomposeScope);

    void onScopeDisposed(@k RecomposeScope recomposeScope);
}
