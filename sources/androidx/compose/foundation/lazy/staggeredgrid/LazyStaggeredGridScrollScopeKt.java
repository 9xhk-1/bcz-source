package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class LazyStaggeredGridScrollScopeKt {
    @k
    public static final LazyLayoutScrollScope LazyLayoutScrollScope(@k LazyStaggeredGridState lazyStaggeredGridState, @k ScrollScope scrollScope) {
        return new LazyStaggeredGridScrollScopeKt$LazyLayoutScrollScope$1(scrollScope, lazyStaggeredGridState);
    }
}
