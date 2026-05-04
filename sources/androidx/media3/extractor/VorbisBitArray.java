package androidx.media3.extractor;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class VorbisBitArray {
    private int bitOffset;
    private final int byteLimit;
    private int byteOffset;
    private final byte[] data;

    public VorbisBitArray(byte[] bArr) {
        this.data = bArr;
        this.byteLimit = bArr.length;
    }

    private void assertValidOffset() {
        int i11;
        int i12 = this.byteOffset;
        Assertions.checkState(i12 >= 0 && (i12 < (i11 = this.byteLimit) || (i12 == i11 && this.bitOffset == 0)));
    }

    public int bitsLeft() {
        return ((this.byteLimit - this.byteOffset) * 8) - this.bitOffset;
    }

    public int getPosition() {
        return (this.byteOffset * 8) + this.bitOffset;
    }

    public boolean readBit() {
        boolean z11 = (((this.data[this.byteOffset] & 255) >> this.bitOffset) & 1) == 1;
        skipBits(1);
        return z11;
    }

    public int readBits(int i11) {
        int i12 = this.byteOffset;
        int min = Math.min(i11, 8 - this.bitOffset);
        int i13 = i12 + 1;
        int i14 = ((this.data[i12] & 255) >> this.bitOffset) & (255 >> (8 - min));
        while (min < i11) {
            i14 |= (this.data[i13] & 255) << min;
            min += 8;
            i13++;
        }
        int i15 = i14 & ((-1) >>> (32 - i11));
        skipBits(i11);
        return i15;
    }

    public void reset() {
        this.byteOffset = 0;
        this.bitOffset = 0;
    }

    public void setPosition(int i11) {
        int i12 = i11 / 8;
        this.byteOffset = i12;
        this.bitOffset = i11 - (i12 * 8);
        assertValidOffset();
    }

    public void skipBits(int i11) {
        int i12 = i11 / 8;
        int i13 = this.byteOffset + i12;
        this.byteOffset = i13;
        int i14 = this.bitOffset + (i11 - (i12 * 8));
        this.bitOffset = i14;
        if (i14 > 7) {
            this.byteOffset = i13 + 1;
            this.bitOffset = i14 - 8;
        }
        assertValidOffset();
    }
}
