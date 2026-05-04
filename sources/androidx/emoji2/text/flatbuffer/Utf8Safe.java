package androidx.emoji2.text.flatbuffer;

import androidx.emoji2.text.flatbuffer.Utf8;
import com.tencent.ijk.media.player.IjkMediaMeta;
import java.nio.ByteBuffer;
import s60.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class Utf8Safe extends Utf8 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i11, int i12) {
            super("Unpaired surrogate at index " + i11 + " of " + i12);
        }
    }

    private static int computeEncodedLength(CharSequence charSequence) {
        int length = charSequence.length();
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 < length) {
                char charAt = charSequence.charAt(i11);
                if (charAt >= 2048) {
                    i12 += encodedLengthGeneral(charSequence, i11);
                    break;
                }
                i12 += (127 - charAt) >>> 31;
                i11++;
            } else {
                break;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i12 + IjkMediaMeta.AV_CH_WIDE_RIGHT));
    }

    public static String decodeUtf8Array(byte[] bArr, int i11, int i12) {
        if ((i11 | i12 | ((bArr.length - i11) - i12)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i11), Integer.valueOf(i12)));
        }
        int i13 = i11 + i12;
        char[] cArr = new char[i12];
        int i14 = 0;
        while (i11 < i13) {
            byte b11 = bArr[i11];
            if (!Utf8.DecodeUtil.isOneByte(b11)) {
                break;
            }
            i11++;
            Utf8.DecodeUtil.handleOneByte(b11, cArr, i14);
            i14++;
        }
        int i15 = i14;
        while (i11 < i13) {
            int i16 = i11 + 1;
            byte b12 = bArr[i11];
            if (Utf8.DecodeUtil.isOneByte(b12)) {
                int i17 = i15 + 1;
                Utf8.DecodeUtil.handleOneByte(b12, cArr, i15);
                int i18 = i16;
                while (i18 < i13) {
                    byte b13 = bArr[i18];
                    if (!Utf8.DecodeUtil.isOneByte(b13)) {
                        break;
                    }
                    i18++;
                    Utf8.DecodeUtil.handleOneByte(b13, cArr, i17);
                    i17++;
                }
                i15 = i17;
                i11 = i18;
            } else if (Utf8.DecodeUtil.isTwoBytes(b12)) {
                if (i16 >= i13) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                i11 += 2;
                Utf8.DecodeUtil.handleTwoBytes(b12, bArr[i16], cArr, i15);
                i15++;
            } else if (Utf8.DecodeUtil.isThreeBytes(b12)) {
                if (i16 >= i13 - 1) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i19 = i11 + 2;
                i11 += 3;
                Utf8.DecodeUtil.handleThreeBytes(b12, bArr[i16], bArr[i19], cArr, i15);
                i15++;
            } else {
                if (i16 >= i13 - 2) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                byte b14 = bArr[i16];
                int i21 = i11 + 3;
                byte b15 = bArr[i11 + 2];
                i11 += 4;
                Utf8.DecodeUtil.handleFourBytes(b12, b14, b15, bArr[i21], cArr, i15);
                i15 += 2;
            }
        }
        return new String(cArr, 0, i15);
    }

    public static String decodeUtf8Buffer(ByteBuffer byteBuffer, int i11, int i12) {
        if ((i11 | i12 | ((byteBuffer.limit() - i11) - i12)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i11), Integer.valueOf(i12)));
        }
        int i13 = i11 + i12;
        char[] cArr = new char[i12];
        int i14 = 0;
        while (i11 < i13) {
            byte b11 = byteBuffer.get(i11);
            if (!Utf8.DecodeUtil.isOneByte(b11)) {
                break;
            }
            i11++;
            Utf8.DecodeUtil.handleOneByte(b11, cArr, i14);
            i14++;
        }
        int i15 = i14;
        while (i11 < i13) {
            int i16 = i11 + 1;
            byte b12 = byteBuffer.get(i11);
            if (Utf8.DecodeUtil.isOneByte(b12)) {
                int i17 = i15 + 1;
                Utf8.DecodeUtil.handleOneByte(b12, cArr, i15);
                int i18 = i16;
                while (i18 < i13) {
                    byte b13 = byteBuffer.get(i18);
                    if (!Utf8.DecodeUtil.isOneByte(b13)) {
                        break;
                    }
                    i18++;
                    Utf8.DecodeUtil.handleOneByte(b13, cArr, i17);
                    i17++;
                }
                i15 = i17;
                i11 = i18;
            } else if (Utf8.DecodeUtil.isTwoBytes(b12)) {
                if (i16 >= i13) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                i11 += 2;
                Utf8.DecodeUtil.handleTwoBytes(b12, byteBuffer.get(i16), cArr, i15);
                i15++;
            } else if (Utf8.DecodeUtil.isThreeBytes(b12)) {
                if (i16 >= i13 - 1) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i19 = i11 + 2;
                i11 += 3;
                Utf8.DecodeUtil.handleThreeBytes(b12, byteBuffer.get(i16), byteBuffer.get(i19), cArr, i15);
                i15++;
            } else {
                if (i16 >= i13 - 2) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                byte b14 = byteBuffer.get(i16);
                int i21 = i11 + 3;
                byte b15 = byteBuffer.get(i11 + 2);
                i11 += 4;
                Utf8.DecodeUtil.handleFourBytes(b12, b14, b15, byteBuffer.get(i21), cArr, i15);
                i15 += 2;
            }
        }
        return new String(cArr, 0, i15);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int encodeUtf8Array(java.lang.CharSequence r7, byte[] r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.flatbuffer.Utf8Safe.encodeUtf8Array(java.lang.CharSequence, byte[], int, int):int");
    }

    private static void encodeUtf8Buffer(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i11;
        int length = charSequence.length();
        int position = byteBuffer.position();
        int i12 = 0;
        while (i12 < length) {
            try {
                char charAt = charSequence.charAt(i12);
                if (charAt >= 128) {
                    break;
                }
                byteBuffer.put(position + i12, (byte) charAt);
                i12++;
            } catch (IndexOutOfBoundsException unused) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i12) + " at index " + (byteBuffer.position() + Math.max(i12, (position - byteBuffer.position()) + 1)));
            }
        }
        if (i12 == length) {
            byteBuffer.position(position + i12);
            return;
        }
        position += i12;
        while (i12 < length) {
            char charAt2 = charSequence.charAt(i12);
            if (charAt2 < 128) {
                byteBuffer.put(position, (byte) charAt2);
            } else if (charAt2 < 2048) {
                int i13 = position + 1;
                try {
                    byteBuffer.put(position, (byte) ((charAt2 >>> 6) | 192));
                    byteBuffer.put(i13, (byte) ((charAt2 & d.f88057a) | 128));
                    position = i13;
                } catch (IndexOutOfBoundsException unused2) {
                    position = i13;
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i12) + " at index " + (byteBuffer.position() + Math.max(i12, (position - byteBuffer.position()) + 1)));
                }
            } else {
                if (charAt2 >= 55296 && 57343 >= charAt2) {
                    int i14 = i12 + 1;
                    if (i14 != length) {
                        try {
                            char charAt3 = charSequence.charAt(i14);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                int i15 = position + 1;
                                try {
                                    byteBuffer.put(position, (byte) ((codePoint >>> 18) | 240));
                                    i11 = position + 2;
                                } catch (IndexOutOfBoundsException unused3) {
                                    position = i15;
                                    i12 = i14;
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i12) + " at index " + (byteBuffer.position() + Math.max(i12, (position - byteBuffer.position()) + 1)));
                                }
                                try {
                                    byteBuffer.put(i15, (byte) (((codePoint >>> 12) & 63) | 128));
                                    position += 3;
                                    byteBuffer.put(i11, (byte) (((codePoint >>> 6) & 63) | 128));
                                    byteBuffer.put(position, (byte) ((codePoint & 63) | 128));
                                    i12 = i14;
                                } catch (IndexOutOfBoundsException unused4) {
                                    i12 = i14;
                                    position = i11;
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i12) + " at index " + (byteBuffer.position() + Math.max(i12, (position - byteBuffer.position()) + 1)));
                                }
                            } else {
                                i12 = i14;
                            }
                        } catch (IndexOutOfBoundsException unused5) {
                        }
                    }
                    throw new UnpairedSurrogateException(i12, length);
                }
                int i16 = position + 1;
                byteBuffer.put(position, (byte) ((charAt2 >>> '\f') | 224));
                position += 2;
                byteBuffer.put(i16, (byte) (((charAt2 >>> 6) & 63) | 128));
                byteBuffer.put(position, (byte) ((charAt2 & d.f88057a) | 128));
            }
            i12++;
            position++;
        }
        byteBuffer.position(position);
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int i11) {
        int length = charSequence.length();
        int i12 = 0;
        while (i11 < length) {
            char charAt = charSequence.charAt(i11);
            if (charAt < 2048) {
                i12 += (127 - charAt) >>> 31;
            } else {
                i12 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i11) < 65536) {
                        throw new UnpairedSurrogateException(i11, length);
                    }
                    i11++;
                }
            }
            i11++;
        }
        return i12;
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public String decodeUtf8(ByteBuffer byteBuffer, int i11, int i12) throws IllegalArgumentException {
        return byteBuffer.hasArray() ? decodeUtf8Array(byteBuffer.array(), byteBuffer.arrayOffset() + i11, i12) : decodeUtf8Buffer(byteBuffer, i11, i12);
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            encodeUtf8Buffer(charSequence, byteBuffer);
        } else {
            int arrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(encodeUtf8Array(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
        }
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public int encodedLength(CharSequence charSequence) {
        return computeEncodedLength(charSequence);
    }
}
