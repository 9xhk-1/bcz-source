package androidx.compose.runtime;

import m80.k;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface RememberManager {
    void deactivating(@k ComposeNodeLifecycleCallback composeNodeLifecycleCallback, int i11, int i12, int i13);

    void endResumingScope(@k RecomposeScopeImpl recomposeScopeImpl);

    void forgetting(@k RememberObserverHolder rememberObserverHolder, int i11, int i12, int i13);

    void releasing(@k ComposeNodeLifecycleCallback composeNodeLifecycleCallback, int i11, int i12, int i13);

    void rememberPausingScope(@k RecomposeScopeImpl recomposeScopeImpl);

    void remembering(@k RememberObserverHolder rememberObserverHolder);

    void sideEffect(@k x00.a<g2> aVar);

    void startResumingScope(@k RecomposeScopeImpl recomposeScopeImpl);
}
