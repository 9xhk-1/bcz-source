package androidx.media3.common.util;

import androidx.annotation.VisibleForTesting;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class LongArrayQueue {
    public static final int DEFAULT_INITIAL_CAPACITY = 16;
    private long[] data;
    private int headIndex;
    private int size;
    private int tailIndex;
    private int wrapAroundMask;

    public LongArrayQueue() {
        this(16);
    }

    private void doubleArraySize() {
        long[] jArr = this.data;
        int length = jArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        long[] jArr2 = new long[length];
        int length2 = jArr.length;
        int i11 = this.headIndex;
        int i12 = length2 - i11;
        System.arraycopy(jArr, i11, jArr2, 0, i12);
        System.arraycopy(this.data, 0, jArr2, i12, i11);
        this.headIndex = 0;
        this.tailIndex = this.size - 1;
        this.data = jArr2;
        this.wrapAroundMask = jArr2.length - 1;
    }

    public void add(long j11) {
        if (this.size == this.data.length) {
            doubleArraySize();
        }
        int i11 = (this.tailIndex + 1) & this.wrapAroundMask;
        this.tailIndex = i11;
        this.data[i11] = j11;
        this.size++;
    }

    @VisibleForTesting
    public int capacity() {
        return this.data.length;
    }

    public void clear() {
        this.headIndex = 0;
        this.tailIndex = -1;
        this.size = 0;
    }

    public long element() {
        if (this.size != 0) {
            return this.data[this.headIndex];
        }
        throw new NoSuchElementException();
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public long remove() {
        int i11 = this.size;
        if (i11 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.data;
        int i12 = this.headIndex;
        long j11 = jArr[i12];
        this.headIndex = this.wrapAroundMask & (i12 + 1);
        this.size = i11 - 1;
        return j11;
    }

    public int size() {
        return this.size;
    }

    public LongArrayQueue(int i11) {
        Assertions.checkArgument(i11 >= 0 && i11 <= 1073741824);
        i11 = i11 == 0 ? 1 : i11;
        i11 = Integer.bitCount(i11) != 1 ? Integer.highestOneBit(i11 - 1) << 1 : i11;
        this.headIndex = 0;
        this.tailIndex = -1;
        this.size = 0;
        long[] jArr = new long[i11];
        this.data = jArr;
        this.wrapAroundMask = jArr.length - 1;
    }
}
