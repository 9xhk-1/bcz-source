package com.heytap.msp.push.encrypt;

import ho.c;
import java.math.BigInteger;
import kx.a0;
import o60.l;
import s60.b;
import s60.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class Base64 extends BaseNCodec {
    private static final int BITS_PER_ENCODED_BYTE = 6;
    private static final int BYTES_PER_ENCODED_BLOCK = 4;
    private static final int BYTES_PER_UNENCODED_BLOCK = 3;
    private static final int MASK_6BITS = 63;
    private int bitWorkArea;
    private final int decodeSize;
    private final byte[] decodeTable;
    private final int encodeSize;
    private final byte[] encodeTable;
    private final byte[] lineSeparator;
    static final byte[] CHUNK_SEPARATOR = {13, 10};
    private static final byte[] STANDARD_ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] URL_SAFE_ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, a0.f68904b, b.f88049h};
    private static final byte[] DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, c.f59556u, 19, 20, c.f59560y, c.f59561z, c.A, c.B, c.C, -1, -1, -1, -1, 63, -1, c.D, c.E, 28, c.G, c.H, 31, 32, 33, 34, 35, 36, e.f88061c, 38, 39, 40, 41, 42, 43, 44, a0.f68904b, 46, 47, 48, 49, 50, 51};

    public Base64() {
        this(0);
    }

    public static byte[] decodeBase64(String str) {
        return new Base64().decode(str);
    }

    public static BigInteger decodeInteger(byte[] bArr) {
        return new BigInteger(1, decodeBase64(bArr));
    }

    public static byte[] encodeBase64(byte[] bArr) {
        return encodeBase64(bArr, false);
    }

    public static byte[] encodeBase64Chunked(byte[] bArr) {
        return encodeBase64(bArr, true);
    }

    public static String encodeBase64String(byte[] bArr) {
        return l.o(encodeBase64(bArr, false));
    }

    public static byte[] encodeBase64URLSafe(byte[] bArr) {
        return encodeBase64(bArr, false, true);
    }

    public static String encodeBase64URLSafeString(byte[] bArr) {
        return l.o(encodeBase64(bArr, false, true));
    }

    public static byte[] encodeInteger(BigInteger bigInteger) {
        if (bigInteger != null) {
            return encodeBase64(toIntegerBytes(bigInteger), false);
        }
        throw new NullPointerException("encodeInteger called with null parameter");
    }

    public static boolean isArrayByteBase64(byte[] bArr) {
        return isBase64(bArr);
    }

    public static boolean isBase64(byte b11) {
        if (b11 == 61) {
            return true;
        }
        if (b11 < 0) {
            return false;
        }
        byte[] bArr = DECODE_TABLE;
        return b11 < bArr.length && bArr[b11] != -1;
    }

    public static byte[] toIntegerBytes(BigInteger bigInteger) {
        int bitLength = ((bigInteger.bitLength() + 7) >> 3) << 3;
        byte[] byteArray = bigInteger.toByteArray();
        int i11 = 1;
        if (bigInteger.bitLength() % 8 != 0 && (bigInteger.bitLength() / 8) + 1 == bitLength / 8) {
            return byteArray;
        }
        int length = byteArray.length;
        if (bigInteger.bitLength() % 8 == 0) {
            length--;
        } else {
            i11 = 0;
        }
        int i12 = bitLength / 8;
        int i13 = i12 - length;
        byte[] bArr = new byte[i12];
        System.arraycopy(byteArray, i11, bArr, i13, length);
        return bArr;
    }

    @Override // com.heytap.msp.push.encrypt.BaseNCodec
    public void decode(byte[] bArr, int i11, int i12) {
        byte b11;
        if (this.eof) {
            return;
        }
        if (i12 < 0) {
            this.eof = true;
        }
        int i13 = 0;
        while (true) {
            if (i13 >= i12) {
                break;
            }
            ensureBufferSize(this.decodeSize);
            int i14 = i11 + 1;
            byte b12 = bArr[i11];
            if (b12 == 61) {
                this.eof = true;
                break;
            }
            if (b12 >= 0) {
                byte[] bArr2 = DECODE_TABLE;
                if (b12 < bArr2.length && (b11 = bArr2[b12]) >= 0) {
                    int i15 = (this.modulus + 1) % 4;
                    this.modulus = i15;
                    int i16 = (this.bitWorkArea << 6) + b11;
                    this.bitWorkArea = i16;
                    if (i15 == 0) {
                        byte[] bArr3 = this.buffer;
                        int i17 = this.pos;
                        int i18 = i17 + 1;
                        this.pos = i18;
                        bArr3[i17] = (byte) ((i16 >> 16) & 255);
                        int i19 = i17 + 2;
                        this.pos = i19;
                        bArr3[i18] = (byte) ((i16 >> 8) & 255);
                        this.pos = i17 + 3;
                        bArr3[i19] = (byte) (i16 & 255);
                    }
                }
            }
            i13++;
            i11 = i14;
        }
        if (!this.eof || this.modulus == 0) {
            return;
        }
        ensureBufferSize(this.decodeSize);
        int i21 = this.modulus;
        if (i21 == 2) {
            int i22 = this.bitWorkArea >> 4;
            this.bitWorkArea = i22;
            byte[] bArr4 = this.buffer;
            int i23 = this.pos;
            this.pos = i23 + 1;
            bArr4[i23] = (byte) (i22 & 255);
            return;
        }
        if (i21 != 3) {
            return;
        }
        int i24 = this.bitWorkArea;
        int i25 = i24 >> 2;
        this.bitWorkArea = i25;
        byte[] bArr5 = this.buffer;
        int i26 = this.pos;
        int i27 = i26 + 1;
        this.pos = i27;
        bArr5[i26] = (byte) ((i24 >> 10) & 255);
        this.pos = i26 + 2;
        bArr5[i27] = (byte) (i25 & 255);
    }

    @Override // com.heytap.msp.push.encrypt.BaseNCodec
    public void encode(byte[] bArr, int i11, int i12) {
        if (this.eof) {
            return;
        }
        if (i12 >= 0) {
            int i13 = 0;
            while (i13 < i12) {
                ensureBufferSize(this.encodeSize);
                int i14 = (this.modulus + 1) % 3;
                this.modulus = i14;
                int i15 = i11 + 1;
                int i16 = bArr[i11];
                if (i16 < 0) {
                    i16 += 256;
                }
                int i17 = (this.bitWorkArea << 8) + i16;
                this.bitWorkArea = i17;
                if (i14 == 0) {
                    byte[] bArr2 = this.buffer;
                    int i18 = this.pos;
                    int i19 = i18 + 1;
                    this.pos = i19;
                    byte[] bArr3 = this.encodeTable;
                    bArr2[i18] = bArr3[(i17 >> 18) & 63];
                    int i21 = i18 + 2;
                    this.pos = i21;
                    bArr2[i19] = bArr3[(i17 >> 12) & 63];
                    int i22 = i18 + 3;
                    this.pos = i22;
                    bArr2[i21] = bArr3[(i17 >> 6) & 63];
                    int i23 = i18 + 4;
                    this.pos = i23;
                    bArr2[i22] = bArr3[i17 & 63];
                    int i24 = this.currentLinePos + 4;
                    this.currentLinePos = i24;
                    int i25 = this.lineLength;
                    if (i25 > 0 && i25 <= i24) {
                        byte[] bArr4 = this.lineSeparator;
                        System.arraycopy(bArr4, 0, bArr2, i23, bArr4.length);
                        this.pos += this.lineSeparator.length;
                        this.currentLinePos = 0;
                    }
                }
                i13++;
                i11 = i15;
            }
            return;
        }
        this.eof = true;
        if (this.modulus == 0 && this.lineLength == 0) {
            return;
        }
        ensureBufferSize(this.encodeSize);
        int i26 = this.pos;
        int i27 = this.modulus;
        if (i27 == 1) {
            byte[] bArr5 = this.buffer;
            int i28 = i26 + 1;
            this.pos = i28;
            byte[] bArr6 = this.encodeTable;
            int i29 = this.bitWorkArea;
            bArr5[i26] = bArr6[(i29 >> 2) & 63];
            int i31 = i26 + 2;
            this.pos = i31;
            bArr5[i28] = bArr6[(i29 << 4) & 63];
            if (bArr6 == STANDARD_ENCODE_TABLE) {
                int i32 = i26 + 3;
                this.pos = i32;
                bArr5[i31] = 61;
                this.pos = i26 + 4;
                bArr5[i32] = 61;
            }
        } else if (i27 == 2) {
            byte[] bArr7 = this.buffer;
            int i33 = i26 + 1;
            this.pos = i33;
            byte[] bArr8 = this.encodeTable;
            int i34 = this.bitWorkArea;
            bArr7[i26] = bArr8[(i34 >> 10) & 63];
            int i35 = i26 + 2;
            this.pos = i35;
            bArr7[i33] = bArr8[(i34 >> 4) & 63];
            int i36 = i26 + 3;
            this.pos = i36;
            bArr7[i35] = bArr8[(i34 << 2) & 63];
            if (bArr8 == STANDARD_ENCODE_TABLE) {
                this.pos = i26 + 4;
                bArr7[i36] = 61;
            }
        }
        int i37 = this.currentLinePos;
        int i38 = this.pos;
        int i39 = i37 + (i38 - i26);
        this.currentLinePos = i39;
        if (this.lineLength <= 0 || i39 <= 0) {
            return;
        }
        byte[] bArr9 = this.lineSeparator;
        System.arraycopy(bArr9, 0, this.buffer, i38, bArr9.length);
        this.pos += this.lineSeparator.length;
    }

    @Override // com.heytap.msp.push.encrypt.BaseNCodec
    public boolean isInAlphabet(byte b11) {
        if (b11 < 0) {
            return false;
        }
        byte[] bArr = this.decodeTable;
        return b11 < bArr.length && bArr[b11] != -1;
    }

    public boolean isUrlSafe() {
        return this.encodeTable == URL_SAFE_ENCODE_TABLE;
    }

    public Base64(boolean z11) {
        this(76, CHUNK_SEPARATOR, z11);
    }

    public static byte[] decodeBase64(byte[] bArr) {
        return new Base64().decode(bArr);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z11) {
        return encodeBase64(bArr, z11, false);
    }

    public static boolean isBase64(String str) {
        return isBase64(l.g(str));
    }

    public Base64(int i11) {
        this(i11, CHUNK_SEPARATOR);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z11, boolean z12) {
        return encodeBase64(bArr, z11, z12, Integer.MAX_VALUE);
    }

    public static boolean isBase64(byte[] bArr) {
        for (int i11 = 0; i11 < bArr.length; i11++) {
            if (!isBase64(bArr[i11]) && !BaseNCodec.isWhiteSpace(bArr[i11])) {
                return false;
            }
        }
        return true;
    }

    public Base64(int i11, byte[] bArr) {
        this(i11, bArr, false);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z11, boolean z12, int i11) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        Base64 base64 = z11 ? new Base64(z12) : new Base64(0, CHUNK_SEPARATOR, z12);
        long encodedLength = base64.getEncodedLength(bArr);
        if (encodedLength <= i11) {
            return base64.encode(bArr);
        }
        throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + encodedLength + ") than the specified maximum size of " + i11);
    }

    public Base64(int i11, byte[] bArr, boolean z11) {
        super(3, 4, i11, bArr == null ? 0 : bArr.length);
        this.decodeTable = DECODE_TABLE;
        if (bArr != null) {
            if (containsAlphabetOrPad(bArr)) {
                throw new IllegalArgumentException("lineSeparator must not contain base64 characters: [" + l.o(bArr) + "]");
            }
            if (i11 > 0) {
                this.encodeSize = bArr.length + 4;
                byte[] bArr2 = new byte[bArr.length];
                this.lineSeparator = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            } else {
                this.encodeSize = 4;
                this.lineSeparator = null;
            }
        } else {
            this.encodeSize = 4;
            this.lineSeparator = null;
        }
        this.decodeSize = this.encodeSize - 1;
        this.encodeTable = z11 ? URL_SAFE_ENCODE_TABLE : STANDARD_ENCODE_TABLE;
    }
}
