package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class LazyListPrefetchStrategyKt {
    @ExperimentalFoundationApi
    @k
    public static final LazyListPrefetchStrategy LazyListPrefetchStrategy(int i11) {
        return new DefaultLazyListPrefetchStrategy(i11);
    }

    public static /* synthetic */ LazyListPrefetchStrategy LazyListPrefetchStrategy$default(int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 2;
        }
        return LazyListPrefetchStrategy(i11);
    }
}
