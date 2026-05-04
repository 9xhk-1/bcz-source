package androidx.compose.foundation.lazy;

import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface LazyListItemInfo {
    @l
    default Object getContentType() {
        return null;
    }

    int getIndex();

    @k
    Object getKey();

    int getOffset();

    int getSize();
}
