package androidx.compose.runtime;

import androidx.collection.ObjectIntMap;
import androidx.compose.runtime.snapshots.StateObject;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface DerivedState<T> extends State<T> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Record<T> {
        T getCurrentValue();

        @k
        ObjectIntMap<StateObject> getDependencies();
    }

    @k
    Record<T> getCurrentRecord();

    @l
    SnapshotMutationPolicy<T> getPolicy();
}
