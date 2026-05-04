package androidx.compose.foundation.lazy;

import androidx.collection.IntList;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface LazyListItemProvider extends LazyLayoutItemProvider {
    @k
    IntList getHeaderIndexes();

    @k
    LazyItemScopeImpl getItemScope();

    @k
    LazyLayoutKeyIndexMap getKeyIndexMap();
}
