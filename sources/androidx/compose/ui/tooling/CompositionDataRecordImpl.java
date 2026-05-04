package androidx.compose.ui.tooling;

import androidx.compose.runtime.tooling.CompositionData;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class CompositionDataRecordImpl implements CompositionDataRecord {

    @k
    private final Set<CompositionData> store = Collections.newSetFromMap(new WeakHashMap());

    @Override // androidx.compose.ui.tooling.CompositionDataRecord
    @k
    public Set<CompositionData> getStore() {
        return this.store;
    }
}
