package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.ScrollScope;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface LazyLayoutScrollScope extends ScrollScope {
    static /* synthetic */ int calculateDistanceTo$default(LazyLayoutScrollScope lazyLayoutScrollScope, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calculateDistanceTo");
        }
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        return lazyLayoutScrollScope.calculateDistanceTo(i11, i12);
    }

    static /* synthetic */ void snapToItem$default(LazyLayoutScrollScope lazyLayoutScrollScope, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: snapToItem");
        }
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        lazyLayoutScrollScope.snapToItem(i11, i12);
    }

    int calculateDistanceTo(int i11, int i12);

    int getFirstVisibleItemIndex();

    int getFirstVisibleItemScrollOffset();

    int getItemCount();

    int getLastVisibleItemIndex();

    void snapToItem(int i11, int i12);
}
