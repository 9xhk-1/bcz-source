package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class LazyGridPrefetchStrategyKt {
    @ExperimentalFoundationApi
    @k
    public static final LazyGridPrefetchStrategy LazyGridPrefetchStrategy(int i11) {
        return new DefaultLazyGridPrefetchStrategy(i11);
    }

    public static /* synthetic */ LazyGridPrefetchStrategy LazyGridPrefetchStrategy$default(int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 2;
        }
        return LazyGridPrefetchStrategy(i11);
    }
}
