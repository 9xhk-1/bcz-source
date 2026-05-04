package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLazyLayoutPrefetchState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPrefetchState.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchStateKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,541:1\n1#2:542\n*E\n"})
/* loaded from: classes.dex */
public final class LazyLayoutPrefetchStateKt {

    @k
    private static final String TraversablePrefetchStateNodeKey = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode";
    private static final long ZeroConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 5, null);

    @ExperimentalFoundationApi
    @k
    public static final Modifier traversablePrefetchState(@k Modifier modifier, @l LazyLayoutPrefetchState lazyLayoutPrefetchState) {
        Modifier then;
        return (lazyLayoutPrefetchState == null || (then = modifier.then(new TraversablePrefetchStateModifierElement(lazyLayoutPrefetchState))) == null) ? modifier : then;
    }
}
