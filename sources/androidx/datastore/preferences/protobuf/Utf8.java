package androidx.datastore.preferences.protobuf;

import com.tencent.ijk.media.player.IjkMediaMeta;
import com.tencent.liteav.audio.TXEAudioDef;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import s60.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class Utf8 {
    private static final long ASCII_MASK_LONG = -9187201950435737472L;
    static final int COMPLETE = 0;
    static final int MALFORMED = -1;
    static final int MAX_BYTES_PER_CHAR = 3;
    private static final int UNSAFE_COUNT_ASCII_THRESHOLD = 16;
    private static final Processor processor;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DecodeUtil {
        private DecodeUtil() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleFourBytes(byte byte1, byte byte2, byte byte3, byte byte4, char[] resultArr, int resultPos) throws InvalidProtocolBufferException {
            if (isNotTrailingByte(byte2) || (((byte1 << 28) + (byte2 + 112)) >> 30) != 0 || isNotTrailingByte(byte3) || isNotTrailingByte(byte4)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            int trailingByteValue = ((byte1 & 7) << 18) | (trailingByteValue(byte2) << 12) | (trailingByteValue(byte3) << 6) | trailingByteValue(byte4);
            resultArr[resultPos] = highSurrogate(trailingByteValue);
            resultArr[resultPos + 1] = lowSurrogate(trailingByteValue);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleOneByte(byte byte1, char[] resultArr, int resultPos) {
            resultArr[resultPos] = (char) byte1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleThreeBytes(byte byte1, byte byte2, byte byte3, char[] resultArr, int resultPos) throws InvalidProtocolBufferException {
            if (isNotTrailingByte(byte2) || ((byte1 == -32 && byte2 < -96) || ((byte1 == -19 && byte2 >= -96) || isNotTrailingByte(byte3)))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            resultArr[resultPos] = (char) (((byte1 & 15) << 12) | (trailingByteValue(byte2) << 6) | trailingByteValue(byte3));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleTwoBytes(byte byte1, byte byte2, char[] resultArr, int resultPos) throws InvalidProtocolBufferException {
            if (byte1 < -62 || isNotTrailingByte(byte2)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            resultArr[resultPos] = (char) (((byte1 & 31) << 6) | trailingByteValue(byte2));
        }

        private static char highSurrogate(int codePoint) {
            return (char) ((codePoint >>> 10) + 55232);
        }

        private static boolean isNotTrailingByte(byte b11) {
            return b11 > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isOneByte(byte b11) {
            return b11 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isThreeBytes(byte b11) {
            return b11 < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isTwoBytes(byte b11) {
            return b11 < -32;
        }

        private static char lowSurrogate(int codePoint) {
            return (char) ((codePoint & 1023) + 56320);
        }

        private static int trailingByteValue(byte b11) {
            return b11 & 63;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class Processor {
        public final String decodeUtf8(ByteBuffer buffer, int index, int size) throws InvalidProtocolBufferException {
            if (buffer.hasArray()) {
                return decodeUtf8(buffer.array(), buffer.arrayOffset() + index, size);
            }
            return buffer.isDirect() ? decodeUtf8Direct(buffer, index, size) : decodeUtf8Default(buffer, index, size);
        }

        public abstract String decodeUtf8(byte[] bytes, int index, int size) throws InvalidProtocolBufferException;

        public final String decodeUtf8Default(ByteBuffer buffer, int index, int size) throws InvalidProtocolBufferException {
            if ((index | size | ((buffer.limit() - index) - size)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(buffer.limit()), Integer.valueOf(index), Integer.valueOf(size)));
            }
            int i11 = index + size;
            char[] cArr = new char[size];
            int i12 = 0;
            while (index < i11) {
                byte b11 = buffer.get(index);
                if (!DecodeUtil.isOneByte(b11)) {
                    break;
                }
                index++;
                DecodeUtil.handleOneByte(b11, cArr, i12);
                i12++;
            }
            int i13 = i12;
            while (index < i11) {
                int i14 = index + 1;
                byte b12 = buffer.get(index);
                if (DecodeUtil.isOneByte(b12)) {
                    int i15 = i13 + 1;
                    DecodeUtil.handleOneByte(b12, cArr, i13);
                    int i16 = i14;
                    while (i16 < i11) {
                        byte b13 = buffer.get(i16);
                        if (!DecodeUtil.isOneByte(b13)) {
                            break;
                        }
                        i16++;
                        DecodeUtil.handleOneByte(b13, cArr, i15);
                        i15++;
                    }
                    i13 = i15;
                    index = i16;
                } else if (DecodeUtil.isTwoBytes(b12)) {
                    if (i14 >= i11) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    index += 2;
                    DecodeUtil.handleTwoBytes(b12, buffer.get(i14), cArr, i13);
                    i13++;
                } else if (DecodeUtil.isThreeBytes(b12)) {
                    if (i14 >= i11 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i17 = index + 2;
                    index += 3;
                    DecodeUtil.handleThreeBytes(b12, buffer.get(i14), buffer.get(i17), cArr, i13);
                    i13++;
                } else {
                    if (i14 >= i11 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b14 = buffer.get(i14);
                    int i18 = index + 3;
                    byte b15 = buffer.get(index + 2);
                    index += 4;
                    DecodeUtil.handleFourBytes(b12, b14, b15, buffer.get(i18), cArr, i13);
                    i13 += 2;
                }
            }
            return new String(cArr, 0, i13);
        }

        public abstract String decodeUtf8Direct(ByteBuffer buffer, int index, int size) throws InvalidProtocolBufferException;

        public abstract int encodeUtf8(String in2, byte[] out, int offset, int length);

        public final void encodeUtf8(String in2, ByteBuffer out) {
            if (out.hasArray()) {
                int arrayOffset = out.arrayOffset();
                Java8Compatibility.position(out, Utf8.encode(in2, out.array(), out.position() + arrayOffset, out.remaining()) - arrayOffset);
            } else if (out.isDirect()) {
                encodeUtf8Direct(in2, out);
            } else {
                encodeUtf8Default(in2, out);
            }
        }

        public final void encodeUtf8Default(String in2, ByteBuffer out) {
            int i11;
            int length = in2.length();
            int position = out.position();
            int i12 = 0;
            while (i12 < length) {
                try {
                    char charAt = in2.charAt(i12);
                    if (charAt >= 128) {
                        break;
                    }
                    out.put(position + i12, (byte) charAt);
                    i12++;
                } catch (IndexOutOfBoundsException unused) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + in2.charAt(i12) + " at index " + (out.position() + Math.max(i12, (position - out.position()) + 1)));
                }
            }
            if (i12 == length) {
                Java8Compatibility.position(out, position + i12);
                return;
            }
            position += i12;
            while (i12 < length) {
                char charAt2 = in2.charAt(i12);
                if (charAt2 < 128) {
                    out.put(position, (byte) charAt2);
                } else if (charAt2 < 2048) {
                    int i13 = position + 1;
                    try {
                        out.put(position, (byte) ((charAt2 >>> 6) | 192));
                        out.put(i13, (byte) ((charAt2 & d.f88057a) | 128));
                        position = i13;
                    } catch (IndexOutOfBoundsException unused2) {
                        position = i13;
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + in2.charAt(i12) + " at index " + (out.position() + Math.max(i12, (position - out.position()) + 1)));
                    }
                } else {
                    if (charAt2 >= 55296 && 57343 >= charAt2) {
                        int i14 = i12 + 1;
                        if (i14 != length) {
                            try {
                                char charAt3 = in2.charAt(i14);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    int i15 = position + 1;
                                    try {
                                        out.put(position, (byte) ((codePoint >>> 18) | 240));
                                        i11 = position + 2;
                                    } catch (IndexOutOfBoundsException unused3) {
                                        position = i15;
                                        i12 = i14;
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + in2.charAt(i12) + " at index " + (out.position() + Math.max(i12, (position - out.position()) + 1)));
                                    }
                                    try {
                                        out.put(i15, (byte) (((codePoint >>> 12) & 63) | 128));
                                        position += 3;
                                        out.put(i11, (byte) (((codePoint >>> 6) & 63) | 128));
                                        out.put(position, (byte) ((codePoint & 63) | 128));
                                        i12 = i14;
                                    } catch (IndexOutOfBoundsException unused4) {
                                        i12 = i14;
                                        position = i11;
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + in2.charAt(i12) + " at index " + (out.position() + Math.max(i12, (position - out.position()) + 1)));
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
                    out.put(position, (byte) ((charAt2 >>> '\f') | 224));
                    position += 2;
                    out.put(i16, (byte) (((charAt2 >>> 6) & 63) | 128));
                    out.put(position, (byte) ((charAt2 & d.f88057a) | 128));
                }
                i12++;
                position++;
            }
            Java8Compatibility.position(out, position);
        }

        public abstract void encodeUtf8Direct(String in2, ByteBuffer out);

        public final boolean isValidUtf8(byte[] bytes, int index, int limit) {
            return partialIsValidUtf8(0, bytes, index, limit) == 0;
        }

        public final int partialIsValidUtf8(final int state, final ByteBuffer buffer, int index, final int limit) {
            if (!buffer.hasArray()) {
                return buffer.isDirect() ? partialIsValidUtf8Direct(state, buffer, index, limit) : partialIsValidUtf8Default(state, buffer, index, limit);
            }
            int arrayOffset = buffer.arrayOffset();
            return partialIsValidUtf8(state, buffer.array(), index + arrayOffset, arrayOffset + limit);
        }

        public abstract int partialIsValidUtf8(int state, byte[] bytes, int index, int limit);

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        
            if (r8.get(r9) > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x004c, code lost:
        
            if (r8.get(r9) > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x008f, code lost:
        
            if (r8.get(r7) > (-65)) goto L53;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int partialIsValidUtf8Default(final int r7, final java.nio.ByteBuffer r8, int r9, final int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L92
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1e
                r7 = -62
                if (r0 < r7) goto L1d
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
                goto L1d
            L1a:
                r9 = r7
                goto L92
            L1d:
                return r2
            L1e:
                r4 = -16
                if (r0 >= r4) goto L4f
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L38
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r7 < r10) goto L35
                int r7 = androidx.datastore.preferences.protobuf.Utf8.access$000(r0, r9)
                return r7
            L35:
                r5 = r9
                r9 = r7
                r7 = r5
            L38:
                if (r7 > r3) goto L4e
                r4 = -96
                if (r0 != r1) goto L40
                if (r7 < r4) goto L4e
            L40:
                r1 = -19
                if (r0 != r1) goto L46
                if (r7 >= r4) goto L4e
            L46:
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
            L4e:
                return r2
            L4f:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L64
                int r7 = r9 + 1
                byte r1 = r8.get(r9)
                if (r7 < r10) goto L62
                int r7 = androidx.datastore.preferences.protobuf.Utf8.access$000(r0, r1)
                return r7
            L62:
                r9 = 0
                goto L6a
            L64:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L6a:
                if (r9 != 0) goto L7c
                int r9 = r7 + 1
                byte r7 = r8.get(r7)
                if (r9 < r10) goto L79
                int r7 = androidx.datastore.preferences.protobuf.Utf8.access$100(r0, r1, r7)
                return r7
            L79:
                r5 = r9
                r9 = r7
                r7 = r5
            L7c:
                if (r1 > r3) goto L91
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L91
                if (r9 > r3) goto L91
                int r9 = r7 + 1
                byte r7 = r8.get(r7)
                if (r7 <= r3) goto L92
            L91:
                return r2
            L92:
                int r7 = partialIsValidUtf8(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.Processor.partialIsValidUtf8Default(int, java.nio.ByteBuffer, int, int):int");
        }

        public abstract int partialIsValidUtf8Direct(final int state, final ByteBuffer buffer, int index, final int limit);

        public final boolean isValidUtf8(ByteBuffer buffer, int index, int limit) {
            return partialIsValidUtf8(0, buffer, index, limit) == 0;
        }

        private static int partialIsValidUtf8(final ByteBuffer buffer, int index, final int limit) {
            int estimateConsecutiveAscii = index + Utf8.estimateConsecutiveAscii(buffer, index, limit);
            while (estimateConsecutiveAscii < limit) {
                int i11 = estimateConsecutiveAscii + 1;
                byte b11 = buffer.get(estimateConsecutiveAscii);
                if (b11 >= 0) {
                    estimateConsecutiveAscii = i11;
                } else if (b11 < -32) {
                    if (i11 >= limit) {
                        return b11;
                    }
                    if (b11 < -62 || buffer.get(i11) > -65) {
                        return -1;
                    }
                    estimateConsecutiveAscii += 2;
                } else {
                    if (b11 >= -16) {
                        if (i11 >= limit - 2) {
                            return Utf8.incompleteStateFor(buffer, b11, i11, limit - i11);
                        }
                        int i12 = estimateConsecutiveAscii + 2;
                        byte b12 = buffer.get(i11);
                        if (b12 <= -65 && (((b11 << 28) + (b12 + 112)) >> 30) == 0) {
                            int i13 = estimateConsecutiveAscii + 3;
                            if (buffer.get(i12) <= -65) {
                                estimateConsecutiveAscii += 4;
                                if (buffer.get(i13) > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i11 >= limit - 1) {
                        return Utf8.incompleteStateFor(buffer, b11, i11, limit - i11);
                    }
                    int i14 = estimateConsecutiveAscii + 2;
                    byte b13 = buffer.get(i11);
                    if (b13 > -65 || ((b11 == -32 && b13 < -96) || ((b11 == -19 && b13 >= -96) || buffer.get(i14) > -65))) {
                        return -1;
                    }
                    estimateConsecutiveAscii += 3;
                }
            }
            return 0;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int index, int length) {
            super("Unpaired surrogate at index " + index + " of " + length);
        }
    }

    static {
        processor = (!UnsafeProcessor.isAvailable() || Android.isOnAndroidDevice()) ? new SafeProcessor() : new UnsafeProcessor();
    }

    private Utf8() {
    }

    public static String decodeUtf8(ByteBuffer buffer, int index, int size) throws InvalidProtocolBufferException {
        return processor.decodeUtf8(buffer, index, size);
    }

    public static int encode(String in2, byte[] out, int offset, int length) {
        return processor.encodeUtf8(in2, out, offset, length);
    }

    public static void encodeUtf8(String in2, ByteBuffer out) {
        processor.encodeUtf8(in2, out);
    }

    public static int encodedLength(String string) {
        int length = string.length();
        int i11 = 0;
        while (i11 < length && string.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 < length) {
                char charAt = string.charAt(i11);
                if (charAt >= 2048) {
                    i12 += encodedLengthGeneral(string, i11);
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

    private static int encodedLengthGeneral(String string, int start) {
        int length = string.length();
        int i11 = 0;
        while (start < length) {
            char charAt = string.charAt(start);
            if (charAt < 2048) {
                i11 += (127 - charAt) >>> 31;
            } else {
                i11 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(string, start) < 65536) {
                        throw new UnpairedSurrogateException(start, length);
                    }
                    start++;
                }
            }
            start++;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int estimateConsecutiveAscii(ByteBuffer buffer, int index, int limit) {
        int i11 = limit - 7;
        int i12 = index;
        while (i12 < i11 && (buffer.getLong(i12) & (-9187201950435737472L)) == 0) {
            i12 += 8;
        }
        return i12 - index;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int byte1) {
        if (byte1 > -12) {
            return -1;
        }
        return byte1;
    }

    public static boolean isValidUtf8(byte[] bytes) {
        return processor.isValidUtf8(bytes, 0, bytes.length);
    }

    public static int partialIsValidUtf8(int state, byte[] bytes, int index, int limit) {
        return processor.partialIsValidUtf8(state, bytes, index, limit);
    }

    public static String decodeUtf8(byte[] bytes, int index, int size) throws InvalidProtocolBufferException {
        return processor.decodeUtf8(bytes, index, size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int byte1, int byte2) {
        if (byte1 > -12 || byte2 > -65) {
            return -1;
        }
        return byte1 ^ (byte2 << 8);
    }

    public static boolean isValidUtf8(byte[] bytes, int index, int limit) {
        return processor.isValidUtf8(bytes, index, limit);
    }

    public static int partialIsValidUtf8(int state, ByteBuffer buffer, int index, int limit) {
        return processor.partialIsValidUtf8(state, buffer, index, limit);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class UnsafeProcessor extends Processor {
        public static boolean isAvailable() {
            return UnsafeUtil.hasUnsafeArrayOperations() && UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private static int unsafeEstimateConsecutiveAscii(byte[] bytes, long offset, final int maxChars) {
            int i11 = 0;
            if (maxChars < 16) {
                return 0;
            }
            int i12 = 8 - (((int) offset) & 7);
            while (i11 < i12) {
                long j11 = 1 + offset;
                if (UnsafeUtil.getByte(bytes, offset) < 0) {
                    return i11;
                }
                i11++;
                offset = j11;
            }
            while (true) {
                int i13 = i11 + 8;
                if (i13 > maxChars || (UnsafeUtil.getLong((Object) bytes, UnsafeUtil.BYTE_ARRAY_BASE_OFFSET + offset) & (-9187201950435737472L)) != 0) {
                    break;
                }
                offset += 8;
                i11 = i13;
            }
            while (i11 < maxChars) {
                long j12 = offset + 1;
                if (UnsafeUtil.getByte(bytes, offset) < 0) {
                    return i11;
                }
                i11++;
                offset = j12;
            }
            return maxChars;
        }

        private static int unsafeIncompleteStateFor(byte[] bytes, int byte1, long offset, int remaining) {
            if (remaining == 0) {
                return Utf8.incompleteStateFor(byte1);
            }
            if (remaining == 1) {
                return Utf8.incompleteStateFor(byte1, UnsafeUtil.getByte(bytes, offset));
            }
            if (remaining == 2) {
                return Utf8.incompleteStateFor(byte1, UnsafeUtil.getByte(bytes, offset), UnsafeUtil.getByte(bytes, offset + 1));
            }
            throw new AssertionError();
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public String decodeUtf8(byte[] bytes, int index, int size) throws InvalidProtocolBufferException {
            Charset charset = Internal.UTF_8;
            String str = new String(bytes, index, size, charset);
            if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bytes, index, size + index))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            return str;
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public String decodeUtf8Direct(ByteBuffer buffer, int index, int size) throws InvalidProtocolBufferException {
            if ((index | size | ((buffer.limit() - index) - size)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(buffer.limit()), Integer.valueOf(index), Integer.valueOf(size)));
            }
            long addressOffset = UnsafeUtil.addressOffset(buffer) + index;
            long j11 = size + addressOffset;
            char[] cArr = new char[size];
            int i11 = 0;
            while (addressOffset < j11) {
                byte b11 = UnsafeUtil.getByte(addressOffset);
                if (!DecodeUtil.isOneByte(b11)) {
                    break;
                }
                addressOffset++;
                DecodeUtil.handleOneByte(b11, cArr, i11);
                i11++;
            }
            int i12 = i11;
            while (addressOffset < j11) {
                long j12 = addressOffset + 1;
                byte b12 = UnsafeUtil.getByte(addressOffset);
                if (DecodeUtil.isOneByte(b12)) {
                    int i13 = i12 + 1;
                    DecodeUtil.handleOneByte(b12, cArr, i12);
                    long j13 = j12;
                    while (j13 < j11) {
                        byte b13 = UnsafeUtil.getByte(j13);
                        if (!DecodeUtil.isOneByte(b13)) {
                            break;
                        }
                        j13++;
                        DecodeUtil.handleOneByte(b13, cArr, i13);
                        i13++;
                    }
                    i12 = i13;
                    addressOffset = j13;
                } else if (DecodeUtil.isTwoBytes(b12)) {
                    if (j12 >= j11) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    addressOffset += 2;
                    DecodeUtil.handleTwoBytes(b12, UnsafeUtil.getByte(j12), cArr, i12);
                    i12++;
                } else if (DecodeUtil.isThreeBytes(b12)) {
                    if (j12 >= j11 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    long j14 = 2 + addressOffset;
                    addressOffset += 3;
                    DecodeUtil.handleThreeBytes(b12, UnsafeUtil.getByte(j12), UnsafeUtil.getByte(j14), cArr, i12);
                    i12++;
                } else {
                    if (j12 >= j11 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b14 = UnsafeUtil.getByte(j12);
                    long j15 = addressOffset + 3;
                    byte b15 = UnsafeUtil.getByte(2 + addressOffset);
                    addressOffset += 4;
                    DecodeUtil.handleFourBytes(b12, b14, b15, UnsafeUtil.getByte(j15), cArr, i12);
                    i12 += 2;
                }
            }
            return new String(cArr, 0, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public int encodeUtf8(final String in2, final byte[] out, final int offset, final int length) {
            long j11;
            long j12;
            long j13;
            int i11;
            char charAt;
            long j14 = offset;
            long j15 = length + j14;
            int length2 = in2.length();
            if (length2 > length || out.length - length < offset) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + in2.charAt(length2 - 1) + " at index " + (offset + length));
            }
            int i12 = 0;
            while (true) {
                j11 = 1;
                if (i12 >= length2 || (charAt = in2.charAt(i12)) >= 128) {
                    break;
                }
                UnsafeUtil.putByte(out, j14, (byte) charAt);
                i12++;
                j14 = 1 + j14;
            }
            if (i12 == length2) {
                return (int) j14;
            }
            while (i12 < length2) {
                char charAt2 = in2.charAt(i12);
                if (charAt2 < 128 && j14 < j15) {
                    UnsafeUtil.putByte(out, j14, (byte) charAt2);
                    j13 = j15;
                    j12 = j11;
                    j14 += j11;
                } else if (charAt2 >= 2048 || j14 > j15 - 2) {
                    j12 = j11;
                    if ((charAt2 >= 55296 && 57343 >= charAt2) || j14 > j15 - 3) {
                        j13 = j15;
                        if (j14 > j13 - 4) {
                            if (55296 <= charAt2 && charAt2 <= 57343 && ((i11 = i12 + 1) == length2 || !Character.isSurrogatePair(charAt2, in2.charAt(i11)))) {
                                throw new UnpairedSurrogateException(i12, length2);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + j14);
                        }
                        int i13 = i12 + 1;
                        if (i13 != length2) {
                            char charAt3 = in2.charAt(i13);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                UnsafeUtil.putByte(out, j14, (byte) ((codePoint >>> 18) | 240));
                                UnsafeUtil.putByte(out, j14 + j12, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j16 = j14 + 3;
                                UnsafeUtil.putByte(out, j14 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j14 += 4;
                                UnsafeUtil.putByte(out, j16, (byte) ((codePoint & 63) | 128));
                                i12 = i13;
                            } else {
                                i12 = i13;
                            }
                        }
                        throw new UnpairedSurrogateException(i12 - 1, length2);
                    }
                    UnsafeUtil.putByte(out, j14, (byte) ((charAt2 >>> '\f') | 480));
                    long j17 = j14 + 2;
                    j13 = j15;
                    UnsafeUtil.putByte(out, j14 + j12, (byte) (((charAt2 >>> 6) & 63) | 128));
                    j14 += 3;
                    UnsafeUtil.putByte(out, j17, (byte) ((charAt2 & d.f88057a) | 128));
                } else {
                    j12 = j11;
                    long j18 = j14 + j12;
                    UnsafeUtil.putByte(out, j14, (byte) ((charAt2 >>> 6) | TXEAudioDef.TXE_OPUS_SAMPLE_NUM));
                    j14 += 2;
                    UnsafeUtil.putByte(out, j18, (byte) ((charAt2 & d.f88057a) | 128));
                    j13 = j15;
                }
                i12++;
                j11 = j12;
                j15 = j13;
            }
            return (int) j14;
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public void encodeUtf8Direct(String in2, ByteBuffer out) {
            long j11;
            char c11;
            long j12;
            long j13;
            long j14;
            int i11;
            char c12;
            char charAt;
            long addressOffset = UnsafeUtil.addressOffset(out);
            long position = out.position() + addressOffset;
            long limit = out.limit() + addressOffset;
            int length = in2.length();
            if (length > limit - position) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + in2.charAt(length - 1) + " at index " + out.limit());
            }
            int i12 = 0;
            while (true) {
                j11 = 1;
                c11 = 128;
                if (i12 >= length || (charAt = in2.charAt(i12)) >= 128) {
                    break;
                }
                UnsafeUtil.putByte(position, (byte) charAt);
                i12++;
                position = 1 + position;
            }
            if (i12 == length) {
                Java8Compatibility.position(out, (int) (position - addressOffset));
                return;
            }
            while (i12 < length) {
                char charAt2 = in2.charAt(i12);
                if (charAt2 >= c11 || position >= limit) {
                    j12 = j11;
                    if (charAt2 < 2048 && position <= limit - 2) {
                        long j15 = position + j12;
                        UnsafeUtil.putByte(position, (byte) ((charAt2 >>> 6) | TXEAudioDef.TXE_OPUS_SAMPLE_NUM));
                        position += 2;
                        UnsafeUtil.putByte(j15, (byte) ((charAt2 & d.f88057a) | 128));
                        j13 = addressOffset;
                        j14 = limit;
                    } else {
                        if ((charAt2 >= 55296 && 57343 >= charAt2) || position > limit - 3) {
                            j13 = addressOffset;
                            j14 = limit;
                            if (position > j14 - 4) {
                                if (55296 <= charAt2 && charAt2 <= 57343 && ((i11 = i12 + 1) == length || !Character.isSurrogatePair(charAt2, in2.charAt(i11)))) {
                                    throw new UnpairedSurrogateException(i12, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + position);
                            }
                            int i13 = i12 + 1;
                            if (i13 != length) {
                                char charAt3 = in2.charAt(i13);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    UnsafeUtil.putByte(position, (byte) ((codePoint >>> 18) | 240));
                                    c12 = 128;
                                    UnsafeUtil.putByte(position + j12, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j16 = position + 3;
                                    UnsafeUtil.putByte(position + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    position += 4;
                                    UnsafeUtil.putByte(j16, (byte) ((codePoint & 63) | 128));
                                    i12 = i13;
                                } else {
                                    i12 = i13;
                                }
                            }
                            throw new UnpairedSurrogateException(i12 - 1, length);
                        }
                        UnsafeUtil.putByte(position, (byte) ((charAt2 >>> '\f') | 480));
                        j13 = addressOffset;
                        long j17 = position + 2;
                        j14 = limit;
                        UnsafeUtil.putByte(position + j12, (byte) (((charAt2 >>> 6) & 63) | 128));
                        position += 3;
                        UnsafeUtil.putByte(j17, (byte) ((charAt2 & d.f88057a) | 128));
                    }
                    c12 = 128;
                } else {
                    UnsafeUtil.putByte(position, (byte) charAt2);
                    j13 = addressOffset;
                    j14 = limit;
                    c12 = c11;
                    position += j11;
                    j12 = j11;
                }
                i12++;
                c11 = c12;
                j11 = j12;
                addressOffset = j13;
                limit = j14;
            }
            Java8Compatibility.position(out, (int) (position - addressOffset));
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0058, code lost:
        
            if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r12, r0) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x009e, code lost:
        
            if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r12, r0) > (-65)) goto L59;
         */
        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int partialIsValidUtf8(int r11, byte[] r12, final int r13, final int r14) {
            /*
                Method dump skipped, instructions count: 197
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(int, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        
            if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r0) > (-65)) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0061, code lost:
        
            if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r0) > (-65)) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00a3, code lost:
        
            if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r0) > (-65)) goto L57;
         */
        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int partialIsValidUtf8Direct(final int r10, java.nio.ByteBuffer r11, final int r12, final int r13) {
            /*
                Method dump skipped, instructions count: 205
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8Direct(int, java.nio.ByteBuffer, int, int):int");
        }

        private static int unsafeEstimateConsecutiveAscii(long address, final int maxChars) {
            if (maxChars < 16) {
                return 0;
            }
            int i11 = (int) ((-address) & 7);
            int i12 = i11;
            while (i12 > 0) {
                long j11 = 1 + address;
                if (UnsafeUtil.getByte(address) < 0) {
                    return i11 - i12;
                }
                i12--;
                address = j11;
            }
            int i13 = maxChars - i11;
            while (i13 >= 8 && (UnsafeUtil.getLong(address) & (-9187201950435737472L)) == 0) {
                address += 8;
                i13 -= 8;
            }
            return maxChars - i13;
        }

        private static int unsafeIncompleteStateFor(long address, final int byte1, int remaining) {
            if (remaining == 0) {
                return Utf8.incompleteStateFor(byte1);
            }
            if (remaining == 1) {
                return Utf8.incompleteStateFor(byte1, UnsafeUtil.getByte(address));
            }
            if (remaining == 2) {
                return Utf8.incompleteStateFor(byte1, UnsafeUtil.getByte(address), UnsafeUtil.getByte(address + 1));
            }
            throw new AssertionError();
        }

        /* JADX WARN: Code restructure failed: missing block: B:69:0x0039, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static int partialIsValidUtf8(final byte[] r10, long r11, int r13) {
            /*
                int r0 = unsafeEstimateConsecutiveAscii(r10, r11, r13)
                int r13 = r13 - r0
                long r0 = (long) r0
                long r11 = r11 + r0
            L7:
                r0 = 0
                r1 = r0
            L9:
                r2 = 1
                if (r13 <= 0) goto L1a
                long r4 = r11 + r2
                byte r1 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10, r11)
                if (r1 < 0) goto L19
                int r13 = r13 + (-1)
                r11 = r4
                goto L9
            L19:
                r11 = r4
            L1a:
                if (r13 != 0) goto L1d
                return r0
            L1d:
                int r0 = r13 + (-1)
                r4 = -32
                r5 = -1
                r6 = -65
                if (r1 >= r4) goto L3a
                if (r0 != 0) goto L29
                return r1
            L29:
                int r13 = r13 + (-2)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r11
                byte r11 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10, r11)
                if (r11 <= r6) goto L37
                goto L39
            L37:
                r11 = r2
                goto L7
            L39:
                return r5
            L3a:
                r7 = -16
                r8 = 2
                if (r1 >= r7) goto L65
                r7 = 2
                if (r0 >= r7) goto L48
                int r10 = unsafeIncompleteStateFor(r10, r1, r11, r0)
                return r10
            L48:
                int r13 = r13 + (-3)
                long r2 = r2 + r11
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10, r11)
                if (r0 > r6) goto L64
                r7 = -96
                if (r1 != r4) goto L57
                if (r0 < r7) goto L64
            L57:
                r4 = -19
                if (r1 != r4) goto L5d
                if (r0 >= r7) goto L64
            L5d:
                long r11 = r11 + r8
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10, r2)
                if (r0 <= r6) goto L7
            L64:
                return r5
            L65:
                r4 = 3
                if (r0 >= r4) goto L6d
                int r10 = unsafeIncompleteStateFor(r10, r1, r11, r0)
                return r10
            L6d:
                int r13 = r13 + (-4)
                long r2 = r2 + r11
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10, r11)
                if (r0 > r6) goto L8f
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L8f
                long r8 = r8 + r11
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10, r2)
                if (r0 > r6) goto L8f
                r0 = 3
                long r11 = r11 + r0
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10, r8)
                if (r0 <= r6) goto L7
            L8f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(byte[], long, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:69:0x0039, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static int partialIsValidUtf8(long r10, int r12) {
            /*
                int r0 = unsafeEstimateConsecutiveAscii(r10, r12)
                long r1 = (long) r0
                long r10 = r10 + r1
                int r12 = r12 - r0
            L7:
                r0 = 0
                r1 = r0
            L9:
                r2 = 1
                if (r12 <= 0) goto L1a
                long r4 = r10 + r2
                byte r1 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10)
                if (r1 < 0) goto L19
                int r12 = r12 + (-1)
                r10 = r4
                goto L9
            L19:
                r10 = r4
            L1a:
                if (r12 != 0) goto L1d
                return r0
            L1d:
                int r0 = r12 + (-1)
                r4 = -32
                r5 = -1
                r6 = -65
                if (r1 >= r4) goto L3a
                if (r0 != 0) goto L29
                return r1
            L29:
                int r12 = r12 + (-2)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r10
                byte r10 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10)
                if (r10 <= r6) goto L37
                goto L39
            L37:
                r10 = r2
                goto L7
            L39:
                return r5
            L3a:
                r7 = -16
                r8 = 2
                if (r1 >= r7) goto L65
                r7 = 2
                if (r0 >= r7) goto L48
                int r10 = unsafeIncompleteStateFor(r10, r1, r0)
                return r10
            L48:
                int r12 = r12 + (-3)
                long r2 = r2 + r10
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10)
                if (r0 > r6) goto L64
                r7 = -96
                if (r1 != r4) goto L57
                if (r0 < r7) goto L64
            L57:
                r4 = -19
                if (r1 != r4) goto L5d
                if (r0 >= r7) goto L64
            L5d:
                long r10 = r10 + r8
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r2)
                if (r0 <= r6) goto L7
            L64:
                return r5
            L65:
                r4 = 3
                if (r0 >= r4) goto L6d
                int r10 = unsafeIncompleteStateFor(r10, r1, r0)
                return r10
            L6d:
                int r12 = r12 + (-4)
                long r2 = r2 + r10
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10)
                if (r0 > r6) goto L8f
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L8f
                long r8 = r8 + r10
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r2)
                if (r0 > r6) goto L8f
                r0 = 3
                long r10 = r10 + r0
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r8)
                if (r0 <= r6) goto L7
            L8f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(long, int):int");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int byte1, int byte2, int byte3) {
        if (byte1 > -12 || byte2 > -65 || byte3 > -65) {
            return -1;
        }
        return (byte1 ^ (byte2 << 8)) ^ (byte3 << 16);
    }

    public static boolean isValidUtf8(ByteBuffer buffer) {
        return processor.isValidUtf8(buffer, buffer.position(), buffer.remaining());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(byte[] bytes, int index, int limit) {
        byte b11 = bytes[index - 1];
        int i11 = limit - index;
        if (i11 == 0) {
            return incompleteStateFor(b11);
        }
        if (i11 == 1) {
            return incompleteStateFor(b11, bytes[index]);
        }
        if (i11 == 2) {
            return incompleteStateFor(b11, bytes[index], bytes[index + 1]);
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(final ByteBuffer buffer, final int byte1, final int index, final int remaining) {
        if (remaining == 0) {
            return incompleteStateFor(byte1);
        }
        if (remaining == 1) {
            return incompleteStateFor(byte1, buffer.get(index));
        }
        if (remaining == 2) {
            return incompleteStateFor(byte1, buffer.get(index), buffer.get(index + 1));
        }
        throw new AssertionError();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class SafeProcessor extends Processor {
        private static int partialIsValidUtf8NonAscii(byte[] bytes, int index, int limit) {
            while (index < limit) {
                int i11 = index + 1;
                byte b11 = bytes[index];
                if (b11 < 0) {
                    if (b11 < -32) {
                        if (i11 >= limit) {
                            return b11;
                        }
                        if (b11 >= -62) {
                            index += 2;
                            if (bytes[i11] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b11 >= -16) {
                        if (i11 >= limit - 2) {
                            return Utf8.incompleteStateFor(bytes, i11, limit);
                        }
                        int i12 = index + 2;
                        byte b12 = bytes[i11];
                        if (b12 <= -65 && (((b11 << 28) + (b12 + 112)) >> 30) == 0) {
                            int i13 = index + 3;
                            if (bytes[i12] <= -65) {
                                index += 4;
                                if (bytes[i13] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i11 >= limit - 1) {
                        return Utf8.incompleteStateFor(bytes, i11, limit);
                    }
                    int i14 = index + 2;
                    byte b13 = bytes[i11];
                    if (b13 <= -65 && ((b11 != -32 || b13 >= -96) && (b11 != -19 || b13 < -96))) {
                        index += 3;
                        if (bytes[i14] > -65) {
                        }
                    }
                    return -1;
                }
                index = i11;
            }
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public String decodeUtf8(byte[] bytes, int index, int size) throws InvalidProtocolBufferException {
            if ((index | size | ((bytes.length - index) - size)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bytes.length), Integer.valueOf(index), Integer.valueOf(size)));
            }
            int i11 = index + size;
            char[] cArr = new char[size];
            int i12 = 0;
            while (index < i11) {
                byte b11 = bytes[index];
                if (!DecodeUtil.isOneByte(b11)) {
                    break;
                }
                index++;
                DecodeUtil.handleOneByte(b11, cArr, i12);
                i12++;
            }
            int i13 = i12;
            while (index < i11) {
                int i14 = index + 1;
                byte b12 = bytes[index];
                if (DecodeUtil.isOneByte(b12)) {
                    int i15 = i13 + 1;
                    DecodeUtil.handleOneByte(b12, cArr, i13);
                    int i16 = i14;
                    while (i16 < i11) {
                        byte b13 = bytes[i16];
                        if (!DecodeUtil.isOneByte(b13)) {
                            break;
                        }
                        i16++;
                        DecodeUtil.handleOneByte(b13, cArr, i15);
                        i15++;
                    }
                    i13 = i15;
                    index = i16;
                } else if (DecodeUtil.isTwoBytes(b12)) {
                    if (i14 >= i11) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    index += 2;
                    DecodeUtil.handleTwoBytes(b12, bytes[i14], cArr, i13);
                    i13++;
                } else if (DecodeUtil.isThreeBytes(b12)) {
                    if (i14 >= i11 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i17 = index + 2;
                    index += 3;
                    DecodeUtil.handleThreeBytes(b12, bytes[i14], bytes[i17], cArr, i13);
                    i13++;
                } else {
                    if (i14 >= i11 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b14 = bytes[i14];
                    int i18 = index + 3;
                    byte b15 = bytes[index + 2];
                    index += 4;
                    DecodeUtil.handleFourBytes(b12, b14, b15, bytes[i18], cArr, i13);
                    i13 += 2;
                }
            }
            return new String(cArr, 0, i13);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public String decodeUtf8Direct(ByteBuffer buffer, int index, int size) throws InvalidProtocolBufferException {
            return decodeUtf8Default(buffer, index, size);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        
            return r10 + r0;
         */
        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int encodeUtf8(java.lang.String r8, byte[] r9, int r10, int r11) {
            /*
                Method dump skipped, instructions count: 254
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.SafeProcessor.encodeUtf8(java.lang.String, byte[], int, int):int");
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public void encodeUtf8Direct(String in2, ByteBuffer out) {
            encodeUtf8Default(in2, out);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0046, code lost:
        
            if (r8[r9] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0083, code lost:
        
            if (r8[r7] > (-65)) goto L53;
         */
        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int partialIsValidUtf8(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L86
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1c
                r7 = -62
                if (r0 < r7) goto L1b
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
                goto L1b
            L18:
                r9 = r7
                goto L86
            L1b:
                return r2
            L1c:
                r4 = -16
                if (r0 >= r4) goto L49
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L34
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L31
                int r7 = androidx.datastore.preferences.protobuf.Utf8.access$000(r0, r9)
                return r7
            L31:
                r5 = r9
                r9 = r7
                r7 = r5
            L34:
                if (r7 > r3) goto L48
                r4 = -96
                if (r0 != r1) goto L3c
                if (r7 < r4) goto L48
            L3c:
                r1 = -19
                if (r0 != r1) goto L42
                if (r7 >= r4) goto L48
            L42:
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L48:
                return r2
            L49:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L5c
                int r7 = r9 + 1
                r1 = r8[r9]
                if (r7 < r10) goto L5a
                int r7 = androidx.datastore.preferences.protobuf.Utf8.access$000(r0, r1)
                return r7
            L5a:
                r9 = 0
                goto L62
            L5c:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L62:
                if (r9 != 0) goto L72
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r9 < r10) goto L6f
                int r7 = androidx.datastore.preferences.protobuf.Utf8.access$100(r0, r1, r7)
                return r7
            L6f:
                r5 = r9
                r9 = r7
                r7 = r5
            L72:
                if (r1 > r3) goto L85
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L85
                if (r9 > r3) goto L85
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r7 <= r3) goto L86
            L85:
                return r2
            L86:
                int r7 = partialIsValidUtf8(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.SafeProcessor.partialIsValidUtf8(int, byte[], int, int):int");
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public int partialIsValidUtf8Direct(int state, ByteBuffer buffer, int index, int limit) {
            return partialIsValidUtf8Default(state, buffer, index, limit);
        }

        private static int partialIsValidUtf8(byte[] bytes, int index, int limit) {
            while (index < limit && bytes[index] >= 0) {
                index++;
            }
            if (index >= limit) {
                return 0;
            }
            return partialIsValidUtf8NonAscii(bytes, index, limit);
        }
    }
}
