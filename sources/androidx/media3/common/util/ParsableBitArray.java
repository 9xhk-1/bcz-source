package androidx.media3.common.util;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@uo.b
@UnstableApi
/* loaded from: classes2.dex */
public final class ParsableBitArray {
    private int bitOffset;
    private int byteLimit;
    private int byteOffset;
    public byte[] data;

    public ParsableBitArray() {
        this.data = Util.EMPTY_BYTE_ARRAY;
    }

    private void assertValidOffset() {
        int i11;
        int i12 = this.byteOffset;
        Assertions.checkState(i12 >= 0 && (i12 < (i11 = this.byteLimit) || (i12 == i11 && this.bitOffset == 0)));
    }

    public int bitsLeft() {
        return ((this.byteLimit - this.byteOffset) * 8) - this.bitOffset;
    }

    public void byteAlign() {
        if (this.bitOffset == 0) {
            return;
        }
        this.bitOffset = 0;
        this.byteOffset++;
        assertValidOffset();
    }

    public int getBytePosition() {
        Assertions.checkState(this.bitOffset == 0);
        return this.byteOffset;
    }

    public int getPosition() {
        return (this.byteOffset * 8) + this.bitOffset;
    }

    public void putInt(int i11, int i12) {
        if (i12 < 32) {
            i11 &= (1 << i12) - 1;
        }
        int min = Math.min(8 - this.bitOffset, i12);
        int i13 = this.bitOffset;
        int i14 = (8 - i13) - min;
        byte[] bArr = this.data;
        int i15 = this.byteOffset;
        byte b11 = (byte) (((65280 >> i13) | ((1 << i14) - 1)) & bArr[i15]);
        bArr[i15] = b11;
        int i16 = i12 - min;
        bArr[i15] = (byte) (b11 | ((i11 >>> i16) << i14));
        int i17 = i15 + 1;
        while (i16 > 8) {
            this.data[i17] = (byte) (i11 >>> (i16 - 8));
            i16 -= 8;
            i17++;
        }
        int i18 = 8 - i16;
        byte[] bArr2 = this.data;
        byte b12 = (byte) (bArr2[i17] & ((1 << i18) - 1));
        bArr2[i17] = b12;
        bArr2[i17] = (byte) (((i11 & ((1 << i16) - 1)) << i18) | b12);
        skipBits(i12);
        assertValidOffset();
    }

    public boolean readBit() {
        boolean z11 = (this.data[this.byteOffset] & (128 >> this.bitOffset)) != 0;
        skipBit();
        return z11;
    }

    public int readBits(int i11) {
        int i12;
        if (i11 == 0) {
            return 0;
        }
        this.bitOffset += i11;
        int i13 = 0;
        while (true) {
            i12 = this.bitOffset;
            if (i12 <= 8) {
                break;
            }
            int i14 = i12 - 8;
            this.bitOffset = i14;
            byte[] bArr = this.data;
            int i15 = this.byteOffset;
            this.byteOffset = i15 + 1;
            i13 |= (bArr[i15] & 255) << i14;
        }
        byte[] bArr2 = this.data;
        int i16 = this.byteOffset;
        int i17 = ((-1) >>> (32 - i11)) & (i13 | ((bArr2[i16] & 255) >> (8 - i12)));
        if (i12 == 8) {
            this.bitOffset = 0;
            this.byteOffset = i16 + 1;
        }
        assertValidOffset();
        return i17;
    }

    public long readBitsToLong(int i11) {
        return i11 <= 32 ? Util.toUnsignedLong(readBits(i11)) : Util.toLong(readBits(i11 - 32), readBits(32));
    }

    public void readBytes(byte[] bArr, int i11, int i12) {
        Assertions.checkState(this.bitOffset == 0);
        System.arraycopy(this.data, this.byteOffset, bArr, i11, i12);
        this.byteOffset += i12;
        assertValidOffset();
    }

    public String readBytesAsString(int i11) {
        return readBytesAsString(i11, StandardCharsets.UTF_8);
    }

    public void reset(byte[] bArr) {
        reset(bArr, bArr.length);
    }

    public void setPosition(int i11) {
        int i12 = i11 / 8;
        this.byteOffset = i12;
        this.bitOffset = i11 - (i12 * 8);
        assertValidOffset();
    }

    public void skipBit() {
        int i11 = this.bitOffset + 1;
        this.bitOffset = i11;
        if (i11 == 8) {
            this.bitOffset = 0;
            this.byteOffset++;
        }
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

    public void skipBytes(int i11) {
        Assertions.checkState(this.bitOffset == 0);
        this.byteOffset += i11;
        assertValidOffset();
    }

    public String readBytesAsString(int i11, Charset charset) {
        byte[] bArr = new byte[i11];
        readBytes(bArr, 0, i11);
        return new String(bArr, charset);
    }

    public void reset(ParsableByteArray parsableByteArray) {
        reset(parsableByteArray.getData(), parsableByteArray.limit());
        setPosition(parsableByteArray.getPosition() * 8);
    }

    public ParsableBitArray(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public ParsableBitArray(byte[] bArr, int i11) {
        this.data = bArr;
        this.byteLimit = i11;
    }

    public void reset(byte[] bArr, int i11) {
        this.data = bArr;
        this.byteOffset = 0;
        this.bitOffset = 0;
        this.byteLimit = i11;
    }

    public void readBits(byte[] bArr, int i11, int i12) {
        int i13 = (i12 >> 3) + i11;
        while (i11 < i13) {
            byte[] bArr2 = this.data;
            int i14 = this.byteOffset;
            int i15 = i14 + 1;
            this.byteOffset = i15;
            byte b11 = bArr2[i14];
            int i16 = this.bitOffset;
            byte b12 = (byte) (b11 << i16);
            bArr[i11] = b12;
            bArr[i11] = (byte) (((255 & bArr2[i15]) >> (8 - i16)) | b12);
            i11++;
        }
        int i17 = i12 & 7;
        if (i17 == 0) {
            return;
        }
        byte b13 = (byte) (bArr[i13] & (255 >> i17));
        bArr[i13] = b13;
        int i18 = this.bitOffset;
        if (i18 + i17 > 8) {
            byte[] bArr3 = this.data;
            int i19 = this.byteOffset;
            this.byteOffset = i19 + 1;
            bArr[i13] = (byte) (b13 | ((bArr3[i19] & 255) << i18));
            this.bitOffset = i18 - 8;
        }
        int i21 = this.bitOffset + i17;
        this.bitOffset = i21;
        byte[] bArr4 = this.data;
        int i22 = this.byteOffset;
        bArr[i13] = (byte) (((byte) (((255 & bArr4[i22]) >> (8 - i21)) << (8 - i17))) | bArr[i13]);
        if (i21 == 8) {
            this.bitOffset = 0;
            this.byteOffset = i22 + 1;
        }
        assertValidOffset();
    }
}
