package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class LazyLayoutSemanticsKt {
    public static final float estimatedLazyMaxScrollOffset(int i11, int i12, boolean z11) {
        return z11 ? estimatedLazyScrollOffset(i11, i12) + 100 : estimatedLazyScrollOffset(i11, i12);
    }

    public static final float estimatedLazyScrollOffset(int i11, int i12) {
        return i12 + (i11 * 500);
    }

    @Composable
    @k
    public static final Modifier lazyLayoutSemantics(@k Modifier modifier, @k x00.a<? extends LazyLayoutItemProvider> aVar, @k LazyLayoutSemanticState lazyLayoutSemanticState, @k Orientation orientation, boolean z11, boolean z12, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1070136913, i11, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutSemantics (LazyLayoutSemantics.kt:48)");
        }
        Modifier then = modifier.then(new LazyLayoutSemanticsModifier(aVar, lazyLayoutSemanticState, orientation, z11, z12));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return then;
    }
}
