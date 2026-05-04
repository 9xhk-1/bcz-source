package androidx.media3.exoplayer.upstream;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.upstream.Allocator;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class DefaultAllocator implements Allocator {
    private static final int AVAILABLE_EXTRA_CAPACITY = 100;
    private int allocatedCount;
    private Allocation[] availableAllocations;
    private int availableCount;
    private final int individualAllocationSize;

    @Nullable
    private final byte[] initialAllocationBlock;
    private int targetBufferSize;
    private final boolean trimOnReset;

    public DefaultAllocator(boolean z11, int i11) {
        this(z11, i11, 0);
    }

    @Override // androidx.media3.exoplayer.upstream.Allocator
    public synchronized Allocation allocate() {
        Allocation allocation;
        try {
            this.allocatedCount++;
            int i11 = this.availableCount;
            if (i11 > 0) {
                Allocation[] allocationArr = this.availableAllocations;
                int i12 = i11 - 1;
                this.availableCount = i12;
                allocation = (Allocation) Assertions.checkNotNull(allocationArr[i12]);
                this.availableAllocations[this.availableCount] = null;
            } else {
                allocation = new Allocation(new byte[this.individualAllocationSize], 0);
                int i13 = this.allocatedCount;
                Allocation[] allocationArr2 = this.availableAllocations;
                if (i13 > allocationArr2.length) {
                    this.availableAllocations = (Allocation[]) Arrays.copyOf(allocationArr2, allocationArr2.length * 2);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return allocation;
    }

    @Override // androidx.media3.exoplayer.upstream.Allocator
    public int getIndividualAllocationLength() {
        return this.individualAllocationSize;
    }

    @Override // androidx.media3.exoplayer.upstream.Allocator
    public synchronized int getTotalBytesAllocated() {
        return this.allocatedCount * this.individualAllocationSize;
    }

    @Override // androidx.media3.exoplayer.upstream.Allocator
    public synchronized void release(Allocation allocation) {
        Allocation[] allocationArr = this.availableAllocations;
        int i11 = this.availableCount;
        this.availableCount = i11 + 1;
        allocationArr[i11] = allocation;
        this.allocatedCount--;
        notifyAll();
    }

    public synchronized void reset() {
        if (this.trimOnReset) {
            setTargetBufferSize(0);
        }
    }

    public synchronized void setTargetBufferSize(int i11) {
        boolean z11 = i11 < this.targetBufferSize;
        this.targetBufferSize = i11;
        if (z11) {
            trim();
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Allocator
    public synchronized void trim() {
        try {
            int i11 = 0;
            int max = Math.max(0, Util.ceilDivide(this.targetBufferSize, this.individualAllocationSize) - this.allocatedCount);
            int i12 = this.availableCount;
            if (max >= i12) {
                return;
            }
            if (this.initialAllocationBlock != null) {
                int i13 = i12 - 1;
                while (i11 <= i13) {
                    Allocation allocation = (Allocation) Assertions.checkNotNull(this.availableAllocations[i11]);
                    if (allocation.data == this.initialAllocationBlock) {
                        i11++;
                    } else {
                        Allocation allocation2 = (Allocation) Assertions.checkNotNull(this.availableAllocations[i13]);
                        if (allocation2.data != this.initialAllocationBlock) {
                            i13--;
                        } else {
                            Allocation[] allocationArr = this.availableAllocations;
                            allocationArr[i11] = allocation2;
                            allocationArr[i13] = allocation;
                            i13--;
                            i11++;
                        }
                    }
                }
                max = Math.max(max, i11);
                if (max >= this.availableCount) {
                    return;
                }
            }
            Arrays.fill(this.availableAllocations, max, this.availableCount, (Object) null);
            this.availableCount = max;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public DefaultAllocator(boolean z11, int i11, int i12) {
        Assertions.checkArgument(i11 > 0);
        Assertions.checkArgument(i12 >= 0);
        this.trimOnReset = z11;
        this.individualAllocationSize = i11;
        this.availableCount = i12;
        this.availableAllocations = new Allocation[i12 + 100];
        if (i12 <= 0) {
            this.initialAllocationBlock = null;
            return;
        }
        this.initialAllocationBlock = new byte[i12 * i11];
        for (int i13 = 0; i13 < i12; i13++) {
            this.availableAllocations[i13] = new Allocation(this.initialAllocationBlock, i13 * i11);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Allocator
    public synchronized void release(@Nullable Allocator.AllocationNode allocationNode) {
        while (allocationNode != null) {
            try {
                Allocation[] allocationArr = this.availableAllocations;
                int i11 = this.availableCount;
                this.availableCount = i11 + 1;
                allocationArr[i11] = allocationNode.getAllocation();
                this.allocatedCount--;
                allocationNode = allocationNode.next();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        notifyAll();
    }
}
