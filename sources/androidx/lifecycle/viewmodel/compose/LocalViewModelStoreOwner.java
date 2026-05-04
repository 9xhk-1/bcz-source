package androidx.lifecycle.viewmodel.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import w00.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nLocalViewModelStoreOwner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalViewModelStoreOwner.kt\nandroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,53:1\n74#2:54\n*S KotlinDebug\n*F\n+ 1 LocalViewModelStoreOwner.kt\nandroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner\n*L\n39#1:54\n*E\n"})
/* loaded from: classes2.dex */
public final class LocalViewModelStoreOwner {
    public static final int $stable = 0;

    @k
    public static final LocalViewModelStoreOwner INSTANCE = new LocalViewModelStoreOwner();

    @k
    private static final ProvidableCompositionLocal<ViewModelStoreOwner> LocalViewModelStoreOwner = CompositionLocalKt.compositionLocalOf$default(null, new x00.a<ViewModelStoreOwner>() { // from class: androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner$LocalViewModelStoreOwner$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        @l
        public final ViewModelStoreOwner invoke() {
            return null;
        }
    }, 1, null);

    private LocalViewModelStoreOwner() {
    }

    @l
    @j(name = "getCurrent")
    @Composable
    public final ViewModelStoreOwner getCurrent(@l Composer composer, int i11) {
        composer.startReplaceableGroup(-584162872);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-584162872, i11, -1, "androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.<get-current> (LocalViewModelStoreOwner.kt:38)");
        }
        ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) composer.consume(LocalViewModelStoreOwner);
        if (viewModelStoreOwner == null) {
            viewModelStoreOwner = LocalViewModelStoreOwner_androidKt.findViewTreeViewModelStoreOwner(composer, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return viewModelStoreOwner;
    }

    @k
    public final ProvidedValue<ViewModelStoreOwner> provides(@k ViewModelStoreOwner viewModelStoreOwner) {
        g0.p(viewModelStoreOwner, "viewModelStoreOwner");
        return LocalViewModelStoreOwner.provides(viewModelStoreOwner);
    }
}
