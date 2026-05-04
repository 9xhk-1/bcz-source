package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public interface LazyLayoutItemProvider {
    @Composable
    void Item(int i11, @k Object obj, @l Composer composer, int i12);

    @l
    default Object getContentType(int i11) {
        return null;
    }

    default int getIndex(@k Object obj) {
        return -1;
    }

    int getItemCount();

    @k
    default Object getKey(int i11) {
        return Lazy_androidKt.getDefaultLazyLayoutKey(i11);
    }
}
