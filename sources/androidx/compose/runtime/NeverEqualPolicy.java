package androidx.compose.runtime;

import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class NeverEqualPolicy implements SnapshotMutationPolicy<Object> {

    @k
    public static final NeverEqualPolicy INSTANCE = new NeverEqualPolicy();

    private NeverEqualPolicy() {
    }

    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public boolean equivalent(@l Object obj, @l Object obj2) {
        return false;
    }

    @k
    public String toString() {
        return "NeverEqualPolicy";
    }
}
