package androidx.compose.runtime.tooling;

import androidx.compose.runtime.Composition;
import androidx.compose.runtime.ExperimentalComposeRuntimeApi;
import androidx.compose.runtime.RecomposeScope;
import java.util.Map;
import java.util.Set;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@ExperimentalComposeRuntimeApi
/* loaded from: classes.dex */
public interface CompositionObserver {
    void onBeginComposition(@k Composition composition, @k Map<RecomposeScope, ? extends Set<? extends Object>> map);

    void onEndComposition(@k Composition composition);
}
