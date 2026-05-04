package androidx.compose.runtime.snapshots;

import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface StateObject {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @l
        @Deprecated
        public static StateRecord mergeRecords(@k StateObject stateObject, @k StateRecord stateRecord, @k StateRecord stateRecord2, @k StateRecord stateRecord3) {
            return StateObject.super.mergeRecords(stateRecord, stateRecord2, stateRecord3);
        }
    }

    @k
    StateRecord getFirstStateRecord();

    @l
    default StateRecord mergeRecords(@k StateRecord stateRecord, @k StateRecord stateRecord2, @k StateRecord stateRecord3) {
        return null;
    }

    void prependStateRecord(@k StateRecord stateRecord);
}
