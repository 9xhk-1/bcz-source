package androidx.compose.foundation.lazy.layout;

import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class LazyLayoutItemProviderKt {
    public static final int findIndexByKey(@k LazyLayoutItemProvider lazyLayoutItemProvider, @l Object obj, int i11) {
        int index;
        return (obj == null || lazyLayoutItemProvider.getItemCount() == 0 || (i11 < lazyLayoutItemProvider.getItemCount() && g0.g(obj, lazyLayoutItemProvider.getKey(i11))) || (index = lazyLayoutItemProvider.getIndex(obj)) == -1) ? i11 : index;
    }
}
