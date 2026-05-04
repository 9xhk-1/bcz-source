package androidx.compose.foundation.lazy.layout;

import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface LazyLayoutKeyIndexMap {

    @k
    public static final Empty Empty = Empty.$$INSTANCE;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Empty implements LazyLayoutKeyIndexMap {
        static final /* synthetic */ Empty $$INSTANCE = new Empty();

        private Empty() {
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
        public int getIndex(@k Object obj) {
            return -1;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
        @l
        public Void getKey(int i11) {
            return null;
        }
    }

    int getIndex(@k Object obj);

    @l
    Object getKey(int i11);
}
