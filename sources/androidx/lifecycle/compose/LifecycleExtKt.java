package androidx.lifecycle.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.lifecycle.Lifecycle;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class LifecycleExtKt {
    @Composable
    @k
    public static final State<Lifecycle.State> currentStateAsState(@k Lifecycle lifecycle, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1892357376, i11, -1, "androidx.lifecycle.compose.currentStateAsState (LifecycleExt.kt:31)");
        }
        State<Lifecycle.State> collectAsState = SnapshotStateKt.collectAsState(lifecycle.getCurrentStateFlow(), null, composer, 0, 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return collectAsState;
    }
}
