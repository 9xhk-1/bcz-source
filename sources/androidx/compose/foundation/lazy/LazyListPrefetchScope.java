package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public interface LazyListPrefetchScope {
    @k
    LazyLayoutPrefetchState.PrefetchHandle schedulePrefetch(int i11);
}
