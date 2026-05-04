package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.badlogic.gdx.graphics.f;
import com.badlogic.gdx.graphics.g;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import rf.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class DtsUtil {
    public static final int DTS_EXPRESS_MAX_RATE_BITS_PER_SECOND = 768000;
    public static final int DTS_HD_MAX_RATE_BYTES_PER_SECOND = 2250000;
    private static final byte FIRST_BYTE_14B_BE = 31;
    private static final byte FIRST_BYTE_14B_LE = -1;
    private static final byte FIRST_BYTE_BE = Byte.MAX_VALUE;
    private static final byte FIRST_BYTE_EXTSS_BE = 100;
    private static final byte FIRST_BYTE_EXTSS_LE = 37;
    private static final byte FIRST_BYTE_LE = -2;
    private static final byte FIRST_BYTE_UHD_FTOC_NONSYNC_BE = 113;
    private static final byte FIRST_BYTE_UHD_FTOC_NONSYNC_LE = -24;
    private static final byte FIRST_BYTE_UHD_FTOC_SYNC_BE = 64;
    private static final byte FIRST_BYTE_UHD_FTOC_SYNC_LE = -14;
    public static final int FRAME_TYPE_CORE = 1;
    public static final int FRAME_TYPE_EXTENSION_SUBSTREAM = 2;
    public static final int FRAME_TYPE_UHD_NON_SYNC = 4;
    public static final int FRAME_TYPE_UHD_SYNC = 3;
    public static final int FRAME_TYPE_UNKNOWN = 0;
    private static final int SYNC_VALUE_14B_BE = 536864768;
    private static final int SYNC_VALUE_14B_LE = -14745368;
    private static final int SYNC_VALUE_BE = 2147385345;
    private static final int SYNC_VALUE_EXTSS_BE = 1683496997;
    private static final int SYNC_VALUE_EXTSS_LE = 622876772;
    private static final int SYNC_VALUE_LE = -25230976;
    private static final int SYNC_VALUE_UHD_FTOC_NONSYNC_BE = 1908687592;
    private static final int SYNC_VALUE_UHD_FTOC_NONSYNC_LE = -398277519;
    private static final int SYNC_VALUE_UHD_FTOC_SYNC_BE = 1078008818;
    private static final int SYNC_VALUE_UHD_FTOC_SYNC_LE = -233094848;
    private static final int[] CHANNELS_BY_AMODE = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] SAMPLE_RATE_BY_SFREQ = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    private static final int[] TWICE_BITRATE_KBPS_BY_RATE = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, f.f11642p0, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, g.f11731e5, f.f11626m2};
    public static final int DTS_MAX_RATE_BYTES_PER_SECOND = 192000;
    private static final int[] SAMPLE_RATE_BY_INDEX = {8000, 16000, 32000, 64000, h.f83979k, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, DTS_MAX_RATE_BYTES_PER_SECOND, 384000};
    private static final int[] UHD_FTOC_PAYLOAD_LENGTH_TABLE = {5, 8, 10, 12};
    private static final int[] UHD_METADATA_CHUNK_SIZE_LENGTH_TABLE = {6, 9, 12, 15};
    private static final int[] UHD_AUDIO_CHUNK_ID_LENGTH_TABLE = {2, 4, 6, 8};
    private static final int[] UHD_AUDIO_CHUNK_SIZE_LENGTH_TABLE = {9, 11, 13, 16};
    private static final int[] UHD_HEADER_SIZE_LENGTH_TABLE = {5, 8, 10, 12};

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DtsAudioMimeType {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DtsHeader {
        public final int bitrate;
        public final int channelCount;
        public final long frameDurationUs;
        public final int frameSize;
        public final String mimeType;
        public final int sampleRate;

        private DtsHeader(String str, int i11, int i12, int i13, long j11, int i14) {
            this.mimeType = str;
            this.channelCount = i11;
            this.sampleRate = i12;
            this.frameSize = i13;
            this.frameDurationUs = j11;
            this.bitrate = i14;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FrameType {
    }

    private DtsUtil() {
    }

    private static void checkCrc(byte[] bArr, int i11) throws ParserException {
        int i12 = i11 - 2;
        if (((bArr[i11 - 1] & 255) | ((bArr[i12] << 8) & 65535)) != Util.crc16(bArr, 0, i12, 65535)) {
            throw ParserException.createForMalformedContainer("CRC check failed", null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int getDtsFrameSize(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 7
            r4 = 6
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4f
            r2 = -1
            if (r1 == r2) goto L3e
            r2 = 31
            if (r1 == r2) goto L26
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r3]
        L20:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
            goto L5e
        L26:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            r7 = r7[r1]
        L36:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = r5
            goto L5e
        L3e:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            r7 = r7[r1]
            goto L36
        L4f:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r4]
            goto L20
        L5e:
            if (r0 == 0) goto L64
            int r7 = r7 * 16
            int r7 = r7 / 14
        L64:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.DtsUtil.getDtsFrameSize(byte[]):int");
    }

    public static int getFrameType(int i11) {
        if (i11 == SYNC_VALUE_BE || i11 == SYNC_VALUE_LE || i11 == SYNC_VALUE_14B_BE || i11 == SYNC_VALUE_14B_LE) {
            return 1;
        }
        if (i11 == SYNC_VALUE_EXTSS_BE || i11 == SYNC_VALUE_EXTSS_LE) {
            return 2;
        }
        if (i11 == SYNC_VALUE_UHD_FTOC_SYNC_BE || i11 == SYNC_VALUE_UHD_FTOC_SYNC_LE) {
            return 3;
        }
        return (i11 == SYNC_VALUE_UHD_FTOC_NONSYNC_BE || i11 == SYNC_VALUE_UHD_FTOC_NONSYNC_LE) ? 4 : 0;
    }

    private static ParsableBitArray getNormalizedFrame(byte[] bArr) {
        byte b11 = bArr[0];
        if (b11 == Byte.MAX_VALUE || b11 == 100 || b11 == 64 || b11 == 113) {
            return new ParsableBitArray(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (isLittleEndianFrameHeader(copyOf)) {
            for (int i11 = 0; i11 < copyOf.length - 1; i11 += 2) {
                byte b12 = copyOf[i11];
                int i12 = i11 + 1;
                copyOf[i11] = copyOf[i12];
                copyOf[i12] = b12;
            }
        }
        ParsableBitArray parsableBitArray = new ParsableBitArray(copyOf);
        if (copyOf[0] == 31) {
            ParsableBitArray parsableBitArray2 = new ParsableBitArray(copyOf);
            while (parsableBitArray2.bitsLeft() >= 16) {
                parsableBitArray2.skipBits(2);
                parsableBitArray.putInt(parsableBitArray2.readBits(14), 14);
            }
        }
        parsableBitArray.reset(copyOf);
        return parsableBitArray;
    }

    private static boolean isLittleEndianFrameHeader(byte[] bArr) {
        byte b11 = bArr[0];
        return b11 == -2 || b11 == -1 || b11 == 37 || b11 == -14 || b11 == -24;
    }

    public static int parseDtsAudioSampleCount(byte[] bArr) {
        int i11;
        byte b11;
        int i12;
        byte b12;
        byte b13 = bArr[0];
        if (b13 != -2) {
            if (b13 == -1) {
                i11 = (bArr[4] & 7) << 4;
                b12 = bArr[7];
            } else if (b13 != 31) {
                i11 = (bArr[4] & 1) << 6;
                b11 = bArr[5];
            } else {
                i11 = (bArr[5] & 7) << 4;
                b12 = bArr[6];
            }
            i12 = b12 & 60;
            return (((i12 >> 2) | i11) + 1) * 32;
        }
        i11 = (bArr[5] & 1) << 6;
        b11 = bArr[4];
        i12 = b11 & 252;
        return (((i12 >> 2) | i11) + 1) * 32;
    }

    public static Format parseDtsFormat(byte[] bArr, @Nullable String str, @Nullable String str2, int i11, String str3, @Nullable DrmInitData drmInitData) {
        ParsableBitArray normalizedFrame = getNormalizedFrame(bArr);
        normalizedFrame.skipBits(60);
        int i12 = CHANNELS_BY_AMODE[normalizedFrame.readBits(6)];
        int i13 = SAMPLE_RATE_BY_SFREQ[normalizedFrame.readBits(4)];
        int readBits = normalizedFrame.readBits(5);
        int[] iArr = TWICE_BITRATE_KBPS_BY_RATE;
        int i14 = readBits >= iArr.length ? -1 : (iArr[readBits] * 1000) / 2;
        normalizedFrame.skipBits(10);
        return new Format.Builder().setId(str).setContainerMimeType(str3).setSampleMimeType(MimeTypes.AUDIO_DTS).setAverageBitrate(i14).setChannelCount(i12 + (normalizedFrame.readBits(2) > 0 ? 1 : 0)).setSampleRate(i13).setDrmInitData(drmInitData).setLanguage(str2).setRoleFlags(i11).build();
    }

    public static DtsHeader parseDtsHdHeader(byte[] bArr) throws ParserException {
        int i11;
        int i12;
        int i13;
        int i14;
        long j11;
        int i15;
        ParsableBitArray normalizedFrame = getNormalizedFrame(bArr);
        normalizedFrame.skipBits(40);
        int readBits = normalizedFrame.readBits(2);
        if (normalizedFrame.readBit()) {
            i11 = 20;
            i12 = 12;
        } else {
            i11 = 16;
            i12 = 8;
        }
        normalizedFrame.skipBits(i12);
        int readBits2 = normalizedFrame.readBits(i11) + 1;
        boolean readBit = normalizedFrame.readBit();
        int i16 = -1;
        int i17 = 0;
        if (readBit) {
            i13 = normalizedFrame.readBits(2);
            int readBits3 = (normalizedFrame.readBits(3) + 1) * 512;
            if (normalizedFrame.readBit()) {
                normalizedFrame.skipBits(36);
            }
            int readBits4 = normalizedFrame.readBits(3) + 1;
            int readBits5 = normalizedFrame.readBits(3) + 1;
            if (readBits4 != 1 || readBits5 != 1) {
                throw ParserException.createForUnsupportedContainerFeature("Multiple audio presentations or assets not supported");
            }
            int i18 = readBits + 1;
            int readBits6 = normalizedFrame.readBits(i18);
            for (int i19 = 0; i19 < i18; i19++) {
                if (((readBits6 >> i19) & 1) == 1) {
                    normalizedFrame.skipBits(8);
                }
            }
            if (normalizedFrame.readBit()) {
                normalizedFrame.skipBits(2);
                int readBits7 = (normalizedFrame.readBits(2) + 1) << 2;
                int readBits8 = normalizedFrame.readBits(2) + 1;
                while (i17 < readBits8) {
                    normalizedFrame.skipBits(readBits7);
                    i17++;
                }
            }
            i17 = readBits3;
        } else {
            i13 = -1;
        }
        normalizedFrame.skipBits(i11);
        normalizedFrame.skipBits(12);
        if (readBit) {
            if (normalizedFrame.readBit()) {
                normalizedFrame.skipBits(4);
            }
            if (normalizedFrame.readBit()) {
                normalizedFrame.skipBits(24);
            }
            if (normalizedFrame.readBit()) {
                normalizedFrame.skipBytes(normalizedFrame.readBits(10) + 1);
            }
            normalizedFrame.skipBits(5);
            i14 = SAMPLE_RATE_BY_INDEX[normalizedFrame.readBits(4)];
            i16 = normalizedFrame.readBits(8) + 1;
        } else {
            i14 = C.RATE_UNSET_INT;
        }
        int i21 = i14;
        if (readBit) {
            if (i13 == 0) {
                i15 = 32000;
            } else if (i13 == 1) {
                i15 = 44100;
            } else {
                if (i13 != 2) {
                    throw ParserException.createForMalformedContainer("Unsupported reference clock code in DTS HD header: " + i13, null);
                }
                i15 = 48000;
            }
            j11 = Util.scaleLargeTimestamp(i17, 1000000L, i15);
        } else {
            j11 = C.TIME_UNSET;
        }
        return new DtsHeader(MimeTypes.AUDIO_DTS_EXPRESS, i16, i21, readBits2, j11, 0);
    }

    public static int parseDtsHdHeaderSize(byte[] bArr) {
        ParsableBitArray normalizedFrame = getNormalizedFrame(bArr);
        normalizedFrame.skipBits(42);
        return normalizedFrame.readBits(normalizedFrame.readBit() ? 12 : 8) + 1;
    }

    public static DtsHeader parseDtsUhdHeader(byte[] bArr, AtomicInteger atomicInteger) throws ParserException {
        int i11;
        long j11;
        AtomicInteger atomicInteger2;
        int i12;
        int i13;
        ParsableBitArray normalizedFrame = getNormalizedFrame(bArr);
        int i14 = normalizedFrame.readBits(32) == SYNC_VALUE_UHD_FTOC_SYNC_BE ? 1 : 0;
        int parseUnsignedVarInt = parseUnsignedVarInt(normalizedFrame, UHD_FTOC_PAYLOAD_LENGTH_TABLE, true) + 1;
        if (i14 == 0) {
            i11 = C.RATE_UNSET_INT;
            j11 = C.TIME_UNSET;
        } else {
            if (!normalizedFrame.readBit()) {
                throw ParserException.createForUnsupportedContainerFeature("Only supports full channel mask-based audio presentation");
            }
            checkCrc(bArr, parseUnsignedVarInt);
            int readBits = normalizedFrame.readBits(2);
            if (readBits == 0) {
                i12 = 512;
            } else if (readBits == 1) {
                i12 = 480;
            } else {
                if (readBits != 2) {
                    throw ParserException.createForMalformedContainer("Unsupported base duration index in DTS UHD header: " + readBits, null);
                }
                i12 = 384;
            }
            int readBits2 = i12 * (normalizedFrame.readBits(3) + 1);
            int readBits3 = normalizedFrame.readBits(2);
            if (readBits3 == 0) {
                i13 = 32000;
            } else if (readBits3 == 1) {
                i13 = 44100;
            } else {
                if (readBits3 != 2) {
                    throw ParserException.createForMalformedContainer("Unsupported clock rate index in DTS UHD header: " + readBits3, null);
                }
                i13 = 48000;
            }
            if (normalizedFrame.readBit()) {
                normalizedFrame.skipBits(36);
            }
            i11 = (1 << normalizedFrame.readBits(2)) * i13;
            j11 = Util.scaleLargeTimestamp(readBits2, 1000000L, i13);
        }
        int i15 = i11;
        long j12 = j11;
        int i16 = 0;
        for (int i17 = 0; i17 < i14; i17++) {
            i16 += parseUnsignedVarInt(normalizedFrame, UHD_METADATA_CHUNK_SIZE_LENGTH_TABLE, true);
        }
        if (i14 != 0) {
            atomicInteger2 = atomicInteger;
            atomicInteger2.set(parseUnsignedVarInt(normalizedFrame, UHD_AUDIO_CHUNK_ID_LENGTH_TABLE, true));
        } else {
            atomicInteger2 = atomicInteger;
        }
        return new DtsHeader(MimeTypes.AUDIO_DTS_X, 2, i15, parseUnsignedVarInt + i16 + (atomicInteger2.get() != 0 ? parseUnsignedVarInt(normalizedFrame, UHD_AUDIO_CHUNK_SIZE_LENGTH_TABLE, true) : 0), j12, 0);
    }

    public static int parseDtsUhdHeaderSize(byte[] bArr) {
        ParsableBitArray normalizedFrame = getNormalizedFrame(bArr);
        normalizedFrame.skipBits(32);
        return parseUnsignedVarInt(normalizedFrame, UHD_HEADER_SIZE_LENGTH_TABLE, true) + 1;
    }

    private static int parseUnsignedVarInt(ParsableBitArray parsableBitArray, int[] iArr, boolean z11) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < 3 && parsableBitArray.readBit(); i13++) {
            i12++;
        }
        if (z11) {
            int i14 = 0;
            while (i11 < i12) {
                i14 += 1 << iArr[i11];
                i11++;
            }
            i11 = i14;
        }
        return i11 + parsableBitArray.readBits(iArr[i12]);
    }

    public static int parseDtsAudioSampleCount(ByteBuffer byteBuffer) {
        int i11;
        byte b11;
        int i12;
        byte b12;
        if (byteBuffer.getInt(0) == SYNC_VALUE_UHD_FTOC_SYNC_LE || byteBuffer.getInt(0) == SYNC_VALUE_UHD_FTOC_NONSYNC_LE) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == SYNC_VALUE_EXTSS_LE) {
            return 4096;
        }
        int position = byteBuffer.position();
        byte b13 = byteBuffer.get(position);
        if (b13 != -2) {
            if (b13 == -1) {
                i11 = (byteBuffer.get(position + 4) & 7) << 4;
                b12 = byteBuffer.get(position + 7);
            } else if (b13 != 31) {
                i11 = (byteBuffer.get(position + 4) & 1) << 6;
                b11 = byteBuffer.get(position + 5);
            } else {
                i11 = (byteBuffer.get(position + 5) & 7) << 4;
                b12 = byteBuffer.get(position + 6);
            }
            i12 = b12 & 60;
            return (((i12 >> 2) | i11) + 1) * 32;
        }
        i11 = (byteBuffer.get(position + 5) & 1) << 6;
        b11 = byteBuffer.get(position + 4);
        i12 = b11 & 252;
        return (((i12 >> 2) | i11) + 1) * 32;
    }
}
