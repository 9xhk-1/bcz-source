package androidx.media3.common.util;

import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableSet;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@uo.b
@UnstableApi
/* loaded from: classes2.dex */
public final class ParsableByteArray {
    private static final char[] CR_AND_LF = {'\r', '\n'};
    private static final char[] LF = {'\n'};
    private static final ImmutableSet<Charset> SUPPORTED_CHARSETS_FOR_READLINE = ImmutableSet.of(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    private byte[] data;
    private int limit;
    private int position;

    public ParsableByteArray() {
        this.data = Util.EMPTY_BYTE_ARRAY;
    }

    private int findNextLineTerminator(Charset charset) {
        int i11;
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) {
            i11 = 1;
        } else {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i11 = 2;
        }
        int i12 = this.position;
        while (true) {
            int i13 = this.limit;
            if (i12 >= i13 - (i11 - 1)) {
                return i13;
            }
            if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && Util.isLinebreak(this.data[i12])) {
                break;
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr = this.data;
                if (bArr[i12] == 0 && Util.isLinebreak(bArr[i12 + 1])) {
                    break;
                }
            }
            if (charset.equals(StandardCharsets.UTF_16LE)) {
                byte[] bArr2 = this.data;
                if (bArr2[i12 + 1] == 0 && Util.isLinebreak(bArr2[i12])) {
                    break;
                }
            }
            i12 += i11;
        }
        return i12;
    }

    private int peekCharacterAndSize(Charset charset) {
        byte b11;
        byte b12;
        byte b13 = 1;
        if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && bytesLeft() >= 1) {
            b11 = this.data[this.position];
            b12 = 0;
        } else {
            if ((charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) && bytesLeft() >= 2) {
                byte[] bArr = this.data;
                int i11 = this.position;
                b12 = bArr[i11];
                b11 = bArr[i11 + 1];
            } else {
                if (!charset.equals(StandardCharsets.UTF_16LE) || bytesLeft() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.data;
                int i12 = this.position;
                b12 = bArr2[i12 + 1];
                b11 = bArr2[i12];
            }
            b13 = 2;
        }
        return ro.i.l(b12, b11, (byte) 0, b13);
    }

    private char readCharacterIfInList(Charset charset, char[] cArr) {
        int peekCharacterAndSize = peekCharacterAndSize(charset);
        if (peekCharacterAndSize == 0) {
            return (char) 0;
        }
        char c11 = (char) (peekCharacterAndSize >> 16);
        if (!ro.c.i(cArr, c11)) {
            return (char) 0;
        }
        this.position += peekCharacterAndSize & 65535;
        return c11;
    }

    private void skipLineTerminator(Charset charset) {
        if (readCharacterIfInList(charset, CR_AND_LF) == '\r') {
            readCharacterIfInList(charset, LF);
        }
    }

    public int bytesLeft() {
        return this.limit - this.position;
    }

    public int capacity() {
        return this.data.length;
    }

    public void ensureCapacity(int i11) {
        if (i11 > capacity()) {
            this.data = Arrays.copyOf(this.data, i11);
        }
    }

    public byte[] getData() {
        return this.data;
    }

    public int getPosition() {
        return this.position;
    }

    public int limit() {
        return this.limit;
    }

    public char peekChar() {
        byte[] bArr = this.data;
        int i11 = this.position;
        return (char) ((bArr[i11 + 1] & 255) | ((bArr[i11] & 255) << 8));
    }

    public int peekUnsignedByte() {
        return this.data[this.position] & 255;
    }

    public void readBytes(ParsableBitArray parsableBitArray, int i11) {
        readBytes(parsableBitArray.data, 0, i11);
        parsableBitArray.setPosition(0);
    }

    @Nullable
    public String readDelimiterTerminatedString(char c11) {
        if (bytesLeft() == 0) {
            return null;
        }
        int i11 = this.position;
        while (i11 < this.limit && this.data[i11] != c11) {
            i11++;
        }
        byte[] bArr = this.data;
        int i12 = this.position;
        String fromUtf8Bytes = Util.fromUtf8Bytes(bArr, i12, i11 - i12);
        this.position = i11;
        if (i11 < this.limit) {
            this.position = i11 + 1;
        }
        return fromUtf8Bytes;
    }

    public double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public int readInt() {
        byte[] bArr = this.data;
        int i11 = this.position;
        int i12 = i11 + 1;
        this.position = i12;
        int i13 = (bArr[i11] & 255) << 24;
        int i14 = i11 + 2;
        this.position = i14;
        int i15 = ((bArr[i12] & 255) << 16) | i13;
        int i16 = i11 + 3;
        this.position = i16;
        int i17 = i15 | ((bArr[i14] & 255) << 8);
        this.position = i11 + 4;
        return (bArr[i16] & 255) | i17;
    }

    public int readInt24() {
        byte[] bArr = this.data;
        int i11 = this.position;
        int i12 = i11 + 1;
        this.position = i12;
        int i13 = ((bArr[i11] & 255) << 24) >> 8;
        int i14 = i11 + 2;
        this.position = i14;
        int i15 = ((bArr[i12] & 255) << 8) | i13;
        this.position = i11 + 3;
        return (bArr[i14] & 255) | i15;
    }

    @Nullable
    public String readLine() {
        return readLine(StandardCharsets.UTF_8);
    }

    public int readLittleEndianInt() {
        byte[] bArr = this.data;
        int i11 = this.position;
        int i12 = i11 + 1;
        this.position = i12;
        int i13 = bArr[i11] & 255;
        int i14 = i11 + 2;
        this.position = i14;
        int i15 = ((bArr[i12] & 255) << 8) | i13;
        int i16 = i11 + 3;
        this.position = i16;
        int i17 = i15 | ((bArr[i14] & 255) << 16);
        this.position = i11 + 4;
        return ((bArr[i16] & 255) << 24) | i17;
    }

    public int readLittleEndianInt24() {
        byte[] bArr = this.data;
        int i11 = this.position;
        int i12 = i11 + 1;
        this.position = i12;
        int i13 = bArr[i11] & 255;
        int i14 = i11 + 2;
        this.position = i14;
        int i15 = ((bArr[i12] & 255) << 8) | i13;
        this.position = i11 + 3;
        return ((bArr[i14] & 255) << 16) | i15;
    }

    public long readLittleEndianLong() {
        byte[] bArr = this.data;
        int i11 = this.position;
        this.position = i11 + 1;
        this.position = i11 + 2;
        this.position = i11 + 3;
        long j11 = (bArr[i11] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.position = i11 + 4;
        long j12 = j11 | ((bArr[r8] & 255) << 24);
        this.position = i11 + 5;
        long j13 = j12 | ((bArr[r7] & 255) << 32);
        this.position = i11 + 6;
        long j14 = j13 | ((bArr[r8] & 255) << 40);
        this.position = i11 + 7;
        long j15 = j14 | ((bArr[r7] & 255) << 48);
        this.position = i11 + 8;
        return ((bArr[r8] & 255) << 56) | j15;
    }

    public short readLittleEndianShort() {
        byte[] bArr = this.data;
        int i11 = this.position;
        int i12 = i11 + 1;
        this.position = i12;
        int i13 = bArr[i11] & 255;
        this.position = i11 + 2;
        return (short) (((bArr[i12] & 255) << 8) | i13);
    }

    public long readLittleEndianUnsignedInt() {
        byte[] bArr = this.data;
        int i11 = this.position;
        this.position = i11 + 1;
        this.position = i11 + 2;
        this.position = i11 + 3;
        long j11 = (bArr[i11] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.position = i11 + 4;
        return ((bArr[r4] & 255) << 24) | j11;
    }

    public int readLittleEndianUnsignedInt24() {
        byte[] bArr = this.data;
        int i11 = this.position;
        int i12 = i11 + 1;
        this.position = i12;
        int i13 = bArr[i11] & 255;
        int i14 = i11 + 2;
        this.position = i14;
        int i15 = ((bArr[i12] & 255) << 8) | i13;
        this.position = i11 + 3;
        return ((bArr[i14] & 255) << 16) | i15;
    }

    public int readLittleEndianUnsignedIntToInt() {
        int readLittleEndianInt = readLittleEndianInt();
        if (readLittleEndianInt >= 0) {
            return readLittleEndianInt;
        }
        throw new IllegalStateException("Top bit not zero: " + readLittleEndianInt);
    }

    public int readLittleEndianUnsignedShort() {
        byte[] bArr = this.data;
        int i11 = this.position;
        int i12 = i11 + 1;
        this.position = i12;
        int i13 = bArr[i11] & 255;
        this.position = i11 + 2;
        return ((bArr[i12] & 255) << 8) | i13;
    }

    public long readLong() {
        byte[] bArr = this.data;
        int i11 = this.position;
        this.position = i11 + 1;
        this.position = i11 + 2;
        this.position = i11 + 3;
        long j11 = ((bArr[i11] & 255) << 56) | ((bArr[r2] & 255) << 48) | ((bArr[r7] & 255) << 40);
        this.position = i11 + 4;
        long j12 = j11 | ((bArr[r4] & 255) << 32);
        this.position = i11 + 5;
        long j13 = j12 | ((bArr[r7] & 255) << 24);
        this.position = i11 + 6;
        long j14 = j13 | ((bArr[r4] & 255) << 16);
        this.position = i11 + 7;
        long j15 = j14 | ((bArr[r7] & 255) << 8);
        this.position = i11 + 8;
        return (bArr[r4] & 255) | j15;
    }

    public String readNullTerminatedString(int i11) {
        if (i11 == 0) {
            return "";
        }
        int i12 = this.position;
        int i13 = (i12 + i11) - 1;
        String fromUtf8Bytes = Util.fromUtf8Bytes(this.data, i12, (i13 >= this.limit || this.data[i13] != 0) ? i11 : i11 - 1);
        this.position += i11;
        return fromUtf8Bytes;
    }

    public short readShort() {
        byte[] bArr = this.data;
        int i11 = this.position;
        int i12 = i11 + 1;
        this.position = i12;
        int i13 = (bArr[i11] & 255) << 8;
        this.position = i11 + 2;
        return (short) ((bArr[i12] & 255) | i13);
    }

    public String readString(int i11) {
        return readString(i11, StandardCharsets.UTF_8);
    }

    public int readSynchSafeInt() {
        return (readUnsignedByte() << 21) | (readUnsignedByte() << 14) | (readUnsignedByte() << 7) | readUnsignedByte();
    }

    public int readUnsignedByte() {
        byte[] bArr = this.data;
        int i11 = this.position;
        this.position = i11 + 1;
        return bArr[i11] & 255;
    }

    public int readUnsignedFixedPoint1616() {
        byte[] bArr = this.data;
        int i11 = this.position;
        int i12 = i11 + 1;
        this.position = i12;
        int i13 = (bArr[i11] & 255) << 8;
        this.position = i11 + 2;
        int i14 = (bArr[i12] & 255) | i13;
        this.position = i11 + 4;
        return i14;
    }

    public long readUnsignedInt() {
        byte[] bArr = this.data;
        int i11 = this.position;
        this.position = i11 + 1;
        this.position = i11 + 2;
        this.position = i11 + 3;
        long j11 = ((bArr[i11] & 255) << 24) | ((bArr[r2] & 255) << 16) | ((bArr[r7] & 255) << 8);
        this.position = i11 + 4;
        return (bArr[r4] & 255) | j11;
    }

    public int readUnsignedInt24() {
        byte[] bArr = this.data;
        int i11 = this.position;
        int i12 = i11 + 1;
        this.position = i12;
        int i13 = (bArr[i11] & 255) << 16;
        int i14 = i11 + 2;
        this.position = i14;
        int i15 = ((bArr[i12] & 255) << 8) | i13;
        this.position = i11 + 3;
        return (bArr[i14] & 255) | i15;
    }

    public int readUnsignedIntToInt() {
        int readInt = readInt();
        if (readInt >= 0) {
            return readInt;
        }
        throw new IllegalStateException("Top bit not zero: " + readInt);
    }

    public int readUnsignedLeb128ToInt() {
        return ro.i.e(readUnsignedLeb128ToLong());
    }

    public long readUnsignedLeb128ToLong() {
        long j11 = 0;
        for (int i11 = 0; i11 < 9; i11++) {
            if (this.position == this.limit) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long readUnsignedByte = readUnsignedByte();
            j11 |= (127 & readUnsignedByte) << (i11 * 7);
            if ((readUnsignedByte & 128) == 0) {
                return j11;
            }
        }
        return j11;
    }

    public long readUnsignedLongToLong() {
        long readLong = readLong();
        if (readLong >= 0) {
            return readLong;
        }
        throw new IllegalStateException("Top bit not zero: " + readLong);
    }

    public int readUnsignedShort() {
        byte[] bArr = this.data;
        int i11 = this.position;
        int i12 = i11 + 1;
        this.position = i12;
        int i13 = (bArr[i11] & 255) << 8;
        this.position = i11 + 2;
        return (bArr[i12] & 255) | i13;
    }

    public long readUtf8EncodedLong() {
        int i11;
        int i12;
        long j11 = this.data[this.position];
        int i13 = 7;
        while (true) {
            if (i13 < 0) {
                break;
            }
            if (((1 << i13) & j11) != 0) {
                i13--;
            } else if (i13 < 6) {
                j11 &= r6 - 1;
                i12 = 7 - i13;
            } else if (i13 == 7) {
                i12 = 1;
            }
        }
        i12 = 0;
        if (i12 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j11);
        }
        for (i11 = 1; i11 < i12; i11++) {
            if ((this.data[this.position + i11] & com.baicizhan.main.vld.bonding.j.f25378c) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j11);
            }
            j11 = (j11 << 6) | (r3 & 63);
        }
        this.position += i12;
        return j11;
    }

    @Nullable
    public Charset readUtfCharsetFromBom() {
        if (bytesLeft() >= 3) {
            byte[] bArr = this.data;
            int i11 = this.position;
            if (bArr[i11] == -17 && bArr[i11 + 1] == -69 && bArr[i11 + 2] == -65) {
                this.position = i11 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (bytesLeft() < 2) {
            return null;
        }
        byte[] bArr2 = this.data;
        int i12 = this.position;
        byte b11 = bArr2[i12];
        if (b11 == -2 && bArr2[i12 + 1] == -1) {
            this.position = i12 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b11 != -1 || bArr2[i12 + 1] != -2) {
            return null;
        }
        this.position = i12 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public void reset(int i11) {
        reset(capacity() < i11 ? new byte[i11] : this.data, i11);
    }

    public void setLimit(int i11) {
        Assertions.checkArgument(i11 >= 0 && i11 <= this.data.length);
        this.limit = i11;
    }

    public void setPosition(int i11) {
        Assertions.checkArgument(i11 >= 0 && i11 <= this.limit);
        this.position = i11;
    }

    public void skipBytes(int i11) {
        setPosition(this.position + i11);
    }

    public char peekChar(Charset charset) {
        Assertions.checkArgument(SUPPORTED_CHARSETS_FOR_READLINE.contains(charset), "Unsupported charset: " + charset);
        return (char) (peekCharacterAndSize(charset) >> 16);
    }

    @Nullable
    public String readLine(Charset charset) {
        Assertions.checkArgument(SUPPORTED_CHARSETS_FOR_READLINE.contains(charset), "Unsupported charset: " + charset);
        if (bytesLeft() == 0) {
            return null;
        }
        if (!charset.equals(StandardCharsets.US_ASCII)) {
            readUtfCharsetFromBom();
        }
        String readString = readString(findNextLineTerminator(charset) - this.position, charset);
        if (this.position == this.limit) {
            return readString;
        }
        skipLineTerminator(charset);
        return readString;
    }

    public String readString(int i11, Charset charset) {
        String str = new String(this.data, this.position, i11, charset);
        this.position += i11;
        return str;
    }

    public void reset(byte[] bArr) {
        reset(bArr, bArr.length);
    }

    public ParsableByteArray(int i11) {
        this.data = new byte[i11];
        this.limit = i11;
    }

    public void readBytes(byte[] bArr, int i11, int i12) {
        System.arraycopy(this.data, this.position, bArr, i11, i12);
        this.position += i12;
    }

    public void reset(byte[] bArr, int i11) {
        this.data = bArr;
        this.limit = i11;
        this.position = 0;
    }

    public void readBytes(ByteBuffer byteBuffer, int i11) {
        byteBuffer.put(this.data, this.position, i11);
        this.position += i11;
    }

    public ParsableByteArray(byte[] bArr) {
        this.data = bArr;
        this.limit = bArr.length;
    }

    @Nullable
    public String readNullTerminatedString() {
        return readDelimiterTerminatedString((char) 0);
    }

    public ParsableByteArray(byte[] bArr, int i11) {
        this.data = bArr;
        this.limit = i11;
    }
}
