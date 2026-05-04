package androidx.media3.exoplayer.upstream;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public interface Allocator {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface AllocationNode {
        Allocation getAllocation();

        @Nullable
        AllocationNode next();
    }

    Allocation allocate();

    int getIndividualAllocationLength();

    int getTotalBytesAllocated();

    void release(Allocation allocation);

    void release(AllocationNode allocationNode);

    void trim();
}
