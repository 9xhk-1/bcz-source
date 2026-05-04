package com.heytap.mcssdk.base;

import n60.a;
import n60.b;
import o60.l;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class BaseNCodec implements b, a {
    private static final int DEFAULT_BUFFER_RESIZE_FACTOR = 2;
    private static final int DEFAULT_BUFFER_SIZE = 8192;
    protected static final int MASK_8BITS = 255;
    public static final int MIME_CHUNK_SIZE = 76;
    protected static final byte PAD_DEFAULT = 61;
    public static final int PEM_CHUNK_SIZE = 64;
    protected final byte PAD = 61;
    protected byte[] buffer;
    private final int chunkSeparatorLength;
    protected int currentLinePos;
    private final int encodedBlockSize;
    protected boolean eof;
    protected final int lineLength;
    protected int modulus;
    protected int pos;
    private int readPos;
    private final int unencodedBlockSize;

    public BaseNCodec(int i11, int i12, int i13, int i14) {
        this.unencodedBlockSize = i11;
        this.encodedBlockSize = i12;
        this.lineLength = (i13 <= 0 || i14 <= 0) ? 0 : (i13 / i12) * i12;
        this.chunkSeparatorLength = i14;
    }

    public static boolean isWhiteSpace(byte b11) {
        return b11 == 9 || b11 == 10 || b11 == 13 || b11 == 32;
    }

    private void reset() {
        this.buffer = null;
        this.pos = 0;
        this.readPos = 0;
        this.currentLinePos = 0;
        this.modulus = 0;
        this.eof = false;
    }

    private void resizeBuffer() {
        byte[] bArr = this.buffer;
        if (bArr == null) {
            this.buffer = new byte[getDefaultBufferSize()];
            this.pos = 0;
            this.readPos = 0;
        } else {
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.buffer = bArr2;
        }
    }

    public int available() {
        if (this.buffer != null) {
            return this.pos - this.readPos;
        }
        return 0;
    }

    public boolean containsAlphabetOrPad(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b11 : bArr) {
            if (61 == b11 || isInAlphabet(b11)) {
                return true;
            }
        }
        return false;
    }

    @Override // n60.d
    public Object decode(Object obj) throws DecoderException {
        if (obj instanceof byte[]) {
            return decode((byte[]) obj);
        }
        if (obj instanceof String) {
            return decode((String) obj);
        }
        throw new DecoderException("Parameter supplied to Base-N decode is not a byte[] or a String");
    }

    public abstract void decode(byte[] bArr, int i11, int i12);

    @Override // n60.e
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof byte[]) {
            return encode((byte[]) obj);
        }
        throw new EncoderException("Parameter supplied to Base-N encode is not a byte[]");
    }

    public abstract void encode(byte[] bArr, int i11, int i12);

    public String encodeAsString(byte[] bArr) {
        return l.o(encode(bArr));
    }

    public String encodeToString(byte[] bArr) {
        return l.o(encode(bArr));
    }

    public void ensureBufferSize(int i11) {
        byte[] bArr = this.buffer;
        if (bArr == null || bArr.length < this.pos + i11) {
            resizeBuffer();
        }
    }

    public int getDefaultBufferSize() {
        return 8192;
    }

    public long getEncodedLength(byte[] bArr) {
        int length = bArr.length;
        int i11 = this.unencodedBlockSize;
        long j11 = (((length + i11) - 1) / i11) * this.encodedBlockSize;
        int i12 = this.lineLength;
        return i12 > 0 ? j11 + ((((i12 + j11) - 1) / i12) * this.chunkSeparatorLength) : j11;
    }

    public boolean hasData() {
        return this.buffer != null;
    }

    public abstract boolean isInAlphabet(byte b11);

    public boolean isInAlphabet(byte[] bArr, boolean z11) {
        byte b11;
        for (int i11 = 0; i11 < bArr.length; i11++) {
            if (!isInAlphabet(bArr[i11]) && (!z11 || ((b11 = bArr[i11]) != 61 && !isWhiteSpace(b11)))) {
                return false;
            }
        }
        return true;
    }

    public int readResults(byte[] bArr, int i11, int i12) {
        if (this.buffer == null) {
            return this.eof ? -1 : 0;
        }
        int min = Math.min(available(), i12);
        System.arraycopy(this.buffer, this.readPos, bArr, i11, min);
        int i13 = this.readPos + min;
        this.readPos = i13;
        if (i13 >= this.pos) {
            this.buffer = null;
        }
        return min;
    }

    @Override // n60.b
    public byte[] encode(byte[] bArr) {
        reset();
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        encode(bArr, 0, bArr.length);
        encode(bArr, 0, -1);
        int i11 = this.pos - this.readPos;
        byte[] bArr2 = new byte[i11];
        readResults(bArr2, 0, i11);
        return bArr2;
    }

    public boolean isInAlphabet(String str) {
        return isInAlphabet(l.g(str), true);
    }

    public byte[] decode(String str) {
        return decode(l.g(str));
    }

    @Override // n60.a
    public byte[] decode(byte[] bArr) {
        reset();
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        decode(bArr, 0, bArr.length);
        decode(bArr, 0, -1);
        int i11 = this.pos;
        byte[] bArr2 = new byte[i11];
        readResults(bArr2, 0, i11);
        return bArr2;
    }
}
