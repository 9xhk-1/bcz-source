package androidx.compose.runtime;

import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class SourceInformationSlotTableGroupIdentity {
    private final int index;

    @k
    private final Object parentIdentity;

    public SourceInformationSlotTableGroupIdentity(@k Object obj, int i11) {
        this.parentIdentity = obj;
        this.index = i11;
    }

    public static /* synthetic */ SourceInformationSlotTableGroupIdentity copy$default(SourceInformationSlotTableGroupIdentity sourceInformationSlotTableGroupIdentity, Object obj, int i11, int i12, Object obj2) {
        if ((i12 & 1) != 0) {
            obj = sourceInformationSlotTableGroupIdentity.parentIdentity;
        }
        if ((i12 & 2) != 0) {
            i11 = sourceInformationSlotTableGroupIdentity.index;
        }
        return sourceInformationSlotTableGroupIdentity.copy(obj, i11);
    }

    @k
    public final Object component1() {
        return this.parentIdentity;
    }

    public final int component2() {
        return this.index;
    }

    @k
    public final SourceInformationSlotTableGroupIdentity copy(@k Object obj, int i11) {
        return new SourceInformationSlotTableGroupIdentity(obj, i11);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SourceInformationSlotTableGroupIdentity)) {
            return false;
        }
        SourceInformationSlotTableGroupIdentity sourceInformationSlotTableGroupIdentity = (SourceInformationSlotTableGroupIdentity) obj;
        return g0.g(this.parentIdentity, sourceInformationSlotTableGroupIdentity.parentIdentity) && this.index == sourceInformationSlotTableGroupIdentity.index;
    }

    public final int getIndex() {
        return this.index;
    }

    @k
    public final Object getParentIdentity() {
        return this.parentIdentity;
    }

    public int hashCode() {
        return (this.parentIdentity.hashCode() * 31) + Integer.hashCode(this.index);
    }

    @k
    public String toString() {
        return "SourceInformationSlotTableGroupIdentity(parentIdentity=" + this.parentIdentity + ", index=" + this.index + ')';
    }
}
