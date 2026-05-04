package androidx.media3.extractor.ts;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.extractor.MpegAudioUtil;
import com.google.common.math.h;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class MpeghUtil {
    private static final int MHAS_SYNC_WORD = 12583333;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MhasPacketHeader {
        public static final int PACTYPE_EARCON = 19;
        public static final int PACTYPE_PCMCONFIG = 20;
        public static final int PACTYPE_PCMDATA = 21;
        public static final int PACTYP_AUDIOSCENEINFO = 3;
        public static final int PACTYP_AUDIOTRUNCATION = 17;
        public static final int PACTYP_BUFFERINFO = 14;
        public static final int PACTYP_CRC16 = 9;
        public static final int PACTYP_CRC32 = 10;
        public static final int PACTYP_DESCRIPTOR = 11;
        public static final int PACTYP_FILLDATA = 0;
        public static final int PACTYP_GENDATA = 18;
        public static final int PACTYP_GLOBAL_CRC16 = 15;
        public static final int PACTYP_GLOBAL_CRC32 = 16;
        public static final int PACTYP_LOUDNESS = 22;
        public static final int PACTYP_LOUDNESS_DRC = 13;
        public static final int PACTYP_MARKER = 8;
        public static final int PACTYP_MPEGH3DACFG = 1;
        public static final int PACTYP_MPEGH3DAFRAME = 2;
        public static final int PACTYP_SYNC = 6;
        public static final int PACTYP_SYNCGAP = 7;
        public static final int PACTYP_USERINTERACTION = 12;
        public long packetLabel;
        public int packetLength;
        public int packetType;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Type {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Mpegh3daConfig {

        @Nullable
        public final byte[] compatibleProfileLevelSet;
        public final int profileLevelIndication;
        public final int samplingFrequency;
        public final int standardFrameLength;

        private Mpegh3daConfig(int i11, int i12, int i13, @Nullable byte[] bArr) {
            this.profileLevelIndication = i11;
            this.samplingFrequency = i12;
            this.standardFrameLength = i13;
            this.compatibleProfileLevelSet = bArr;
        }
    }

    private MpeghUtil() {
    }

    private static int getOutputFrameLength(int i11) throws ParserException {
        if (i11 == 0) {
            return 768;
        }
        if (i11 == 1) {
            return 1024;
        }
        if (i11 == 2 || i11 == 3) {
            return 2048;
        }
        if (i11 == 4) {
            return 4096;
        }
        throw ParserException.createForUnsupportedContainerFeature("Unsupported coreSbrFrameLengthIndex " + i11);
    }

    private static double getResamplingRatio(int i11) throws ParserException {
        switch (i11) {
            case 14700:
            case 16000:
                return 3.0d;
            case 22050:
            case 24000:
                return 2.0d;
            case 29400:
            case 32000:
            case 58800:
            case 64000:
                return 1.5d;
            case 44100:
            case 48000:
            case 88200:
            case 96000:
                return 1.0d;
            default:
                throw ParserException.createForUnsupportedContainerFeature("Unsupported sampling rate " + i11);
        }
    }

    private static int getSamplingFrequency(int i11) throws ParserException {
        switch (i11) {
            case 0:
                return 96000;
            case 1:
                return 88200;
            case 2:
                return 64000;
            case 3:
                return 48000;
            case 4:
                return 44100;
            case 5:
                return 32000;
            case 6:
                return 24000;
            case 7:
                return 22050;
            case 8:
                return 16000;
            case 9:
                return 12000;
            case 10:
                return 11025;
            case 11:
                return 8000;
            case 12:
                return 7350;
            case 13:
            case 14:
            default:
                throw ParserException.createForUnsupportedContainerFeature("Unsupported sampling rate index " + i11);
            case 15:
                return 57600;
            case 16:
                return 51200;
            case 17:
                return MpegAudioUtil.MAX_RATE_BYTES_PER_SECOND;
            case 18:
                return 38400;
            case 19:
                return 34150;
            case 20:
                return 28800;
            case 21:
                return 25600;
            case 22:
                return 20000;
            case 23:
                return 19200;
            case 24:
                return 17075;
            case 25:
                return 14400;
            case 26:
                return 12800;
            case 27:
                return 9600;
        }
    }

    private static int getSbrRatioIndex(int i11) throws ParserException {
        if (i11 == 0 || i11 == 1) {
            return 0;
        }
        int i12 = 2;
        if (i11 != 2) {
            i12 = 3;
            if (i11 != 3) {
                if (i11 == 4) {
                    return 1;
                }
                throw ParserException.createForUnsupportedContainerFeature("Unsupported coreSbrFrameLengthIndex " + i11);
            }
        }
        return i12;
    }

    public static boolean isSyncWord(int i11) {
        return (i11 & 16777215) == MHAS_SYNC_WORD;
    }

    public static int parseAudioTruncationInfo(ParsableBitArray parsableBitArray) {
        if (!parsableBitArray.readBit()) {
            return 0;
        }
        parsableBitArray.skipBits(2);
        return parsableBitArray.readBits(13);
    }

    public static boolean parseMhasPacketHeader(ParsableBitArray parsableBitArray, MhasPacketHeader mhasPacketHeader) throws ParserException {
        parsableBitArray.getBytePosition();
        int readEscapedIntValue = readEscapedIntValue(parsableBitArray, 3, 8, 8);
        mhasPacketHeader.packetType = readEscapedIntValue;
        if (readEscapedIntValue == -1) {
            return false;
        }
        long readEscapedLongValue = readEscapedLongValue(parsableBitArray, 2, 8, 32);
        mhasPacketHeader.packetLabel = readEscapedLongValue;
        if (readEscapedLongValue == -1) {
            return false;
        }
        if (readEscapedLongValue > 16) {
            throw ParserException.createForUnsupportedContainerFeature("Contains sub-stream with an invalid packet label " + mhasPacketHeader.packetLabel);
        }
        if (readEscapedLongValue == 0) {
            int i11 = mhasPacketHeader.packetType;
            if (i11 == 1) {
                throw ParserException.createForMalformedContainer("Mpegh3daConfig packet with invalid packet label 0", null);
            }
            if (i11 == 2) {
                throw ParserException.createForMalformedContainer("Mpegh3daFrame packet with invalid packet label 0", null);
            }
            if (i11 == 17) {
                throw ParserException.createForMalformedContainer("AudioTruncation packet with invalid packet label 0", null);
            }
        }
        int readEscapedIntValue2 = readEscapedIntValue(parsableBitArray, 11, 24, 24);
        mhasPacketHeader.packetLength = readEscapedIntValue2;
        return readEscapedIntValue2 != -1;
    }

    public static Mpegh3daConfig parseMpegh3daConfig(ParsableBitArray parsableBitArray) throws ParserException {
        int readBits = parsableBitArray.readBits(8);
        int readBits2 = parsableBitArray.readBits(5);
        int readBits3 = readBits2 == 31 ? parsableBitArray.readBits(24) : getSamplingFrequency(readBits2);
        int readBits4 = parsableBitArray.readBits(3);
        int outputFrameLength = getOutputFrameLength(readBits4);
        int sbrRatioIndex = getSbrRatioIndex(readBits4);
        parsableBitArray.skipBits(2);
        skipSpeakerConfig3d(parsableBitArray);
        skipMpegh3daDecoderConfig(parsableBitArray, parseSignals3d(parsableBitArray), sbrRatioIndex);
        byte[] bArr = null;
        if (parsableBitArray.readBit()) {
            int readEscapedIntValue = readEscapedIntValue(parsableBitArray, 2, 4, 8) + 1;
            for (int i11 = 0; i11 < readEscapedIntValue; i11++) {
                int readEscapedIntValue2 = readEscapedIntValue(parsableBitArray, 4, 8, 16);
                int readEscapedIntValue3 = readEscapedIntValue(parsableBitArray, 4, 8, 16);
                if (readEscapedIntValue2 == 7) {
                    int readBits5 = parsableBitArray.readBits(4) + 1;
                    parsableBitArray.skipBits(4);
                    byte[] bArr2 = new byte[readBits5];
                    for (int i12 = 0; i12 < readBits5; i12++) {
                        bArr2[i12] = (byte) parsableBitArray.readBits(8);
                    }
                    bArr = bArr2;
                } else {
                    parsableBitArray.skipBits(readEscapedIntValue3 * 8);
                }
            }
        }
        byte[] bArr3 = bArr;
        double resamplingRatio = getResamplingRatio(readBits3);
        return new Mpegh3daConfig(readBits, (int) (readBits3 * resamplingRatio), (int) (outputFrameLength * resamplingRatio), bArr3);
    }

    private static boolean parseMpegh3daCoreConfig(ParsableBitArray parsableBitArray) {
        parsableBitArray.skipBits(3);
        boolean readBit = parsableBitArray.readBit();
        if (readBit) {
            parsableBitArray.skipBits(13);
        }
        return readBit;
    }

    private static int parseSignals3d(ParsableBitArray parsableBitArray) {
        int readBits = parsableBitArray.readBits(5);
        int i11 = 0;
        for (int i12 = 0; i12 < readBits + 1; i12++) {
            int readBits2 = parsableBitArray.readBits(3);
            i11 += readEscapedIntValue(parsableBitArray, 5, 8, 16) + 1;
            if ((readBits2 == 0 || readBits2 == 2) && parsableBitArray.readBit()) {
                skipSpeakerConfig3d(parsableBitArray);
            }
        }
        return i11;
    }

    private static int readEscapedIntValue(ParsableBitArray parsableBitArray, int i11, int i12, int i13) {
        Assertions.checkArgument(Math.max(Math.max(i11, i12), i13) <= 31);
        int i14 = (1 << i11) - 1;
        int i15 = (1 << i12) - 1;
        com.google.common.math.f.c(com.google.common.math.f.c(i14, i15), 1 << i13);
        if (parsableBitArray.bitsLeft() < i11) {
            return -1;
        }
        int readBits = parsableBitArray.readBits(i11);
        if (readBits != i14) {
            return readBits;
        }
        if (parsableBitArray.bitsLeft() < i12) {
            return -1;
        }
        int readBits2 = parsableBitArray.readBits(i12);
        int i16 = readBits + readBits2;
        if (readBits2 != i15) {
            return i16;
        }
        if (parsableBitArray.bitsLeft() < i13) {
            return -1;
        }
        return i16 + parsableBitArray.readBits(i13);
    }

    private static long readEscapedLongValue(ParsableBitArray parsableBitArray, int i11, int i12, int i13) {
        Assertions.checkArgument(Math.max(Math.max(i11, i12), i13) <= 63);
        long j11 = (1 << i11) - 1;
        long j12 = (1 << i12) - 1;
        h.c(h.c(j11, j12), 1 << i13);
        if (parsableBitArray.bitsLeft() < i11) {
            return -1L;
        }
        long readBitsToLong = parsableBitArray.readBitsToLong(i11);
        if (readBitsToLong != j11) {
            return readBitsToLong;
        }
        if (parsableBitArray.bitsLeft() < i12) {
            return -1L;
        }
        long readBitsToLong2 = parsableBitArray.readBitsToLong(i12);
        long j13 = readBitsToLong + readBitsToLong2;
        if (readBitsToLong2 != j12) {
            return j13;
        }
        if (parsableBitArray.bitsLeft() < i13) {
            return -1L;
        }
        return j13 + parsableBitArray.readBitsToLong(i13);
    }

    private static void skipMpegh3daDecoderConfig(ParsableBitArray parsableBitArray, int i11, int i12) {
        int i13;
        int readEscapedIntValue = readEscapedIntValue(parsableBitArray, 4, 8, 16) + 1;
        parsableBitArray.skipBit();
        for (int i14 = 0; i14 < readEscapedIntValue; i14++) {
            int readBits = parsableBitArray.readBits(2);
            if (readBits == 0) {
                parseMpegh3daCoreConfig(parsableBitArray);
                if (i12 > 0) {
                    skipSbrConfig(parsableBitArray);
                }
            } else if (readBits == 1) {
                if (parseMpegh3daCoreConfig(parsableBitArray)) {
                    parsableBitArray.skipBit();
                }
                if (i12 > 0) {
                    skipSbrConfig(parsableBitArray);
                    i13 = parsableBitArray.readBits(2);
                } else {
                    i13 = 0;
                }
                if (i13 > 0) {
                    parsableBitArray.skipBits(6);
                    int readBits2 = parsableBitArray.readBits(2);
                    parsableBitArray.skipBits(4);
                    if (parsableBitArray.readBit()) {
                        parsableBitArray.skipBits(5);
                    }
                    if (i13 == 2 || i13 == 3) {
                        parsableBitArray.skipBits(6);
                    }
                    if (readBits2 == 2) {
                        parsableBitArray.skipBit();
                    }
                }
                int floor = ((int) Math.floor(Math.log(i11 - 1) / Math.log(2.0d))) + 1;
                int readBits3 = parsableBitArray.readBits(2);
                if (readBits3 > 0 && parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(floor);
                }
                if (parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(floor);
                }
                if (i12 == 0 && readBits3 == 0) {
                    parsableBitArray.skipBit();
                }
            } else if (readBits == 3) {
                readEscapedIntValue(parsableBitArray, 4, 8, 16);
                int readEscapedIntValue2 = readEscapedIntValue(parsableBitArray, 4, 8, 16);
                if (parsableBitArray.readBit()) {
                    readEscapedIntValue(parsableBitArray, 8, 16, 0);
                }
                parsableBitArray.skipBit();
                if (readEscapedIntValue2 > 0) {
                    parsableBitArray.skipBits(readEscapedIntValue2 * 8);
                }
            }
        }
    }

    private static void skipMpegh3daFlexibleSpeakerConfig(ParsableBitArray parsableBitArray, int i11) {
        int readBits;
        boolean readBit = parsableBitArray.readBit();
        int i12 = readBit ? 1 : 5;
        int i13 = readBit ? 7 : 5;
        int i14 = readBit ? 8 : 6;
        int i15 = 0;
        while (i15 < i11) {
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(7);
                readBits = 0;
            } else {
                if (parsableBitArray.readBits(2) == 3 && parsableBitArray.readBits(i13) * i12 != 0) {
                    parsableBitArray.skipBit();
                }
                readBits = parsableBitArray.readBits(i14) * i12;
                if (readBits != 0 && readBits != 180) {
                    parsableBitArray.skipBit();
                }
                parsableBitArray.skipBit();
            }
            if (readBits != 0 && readBits != 180 && parsableBitArray.readBit()) {
                i15++;
            }
            i15++;
        }
    }

    private static void skipSbrConfig(ParsableBitArray parsableBitArray) {
        parsableBitArray.skipBits(3);
        parsableBitArray.skipBits(8);
        boolean readBit = parsableBitArray.readBit();
        boolean readBit2 = parsableBitArray.readBit();
        if (readBit) {
            parsableBitArray.skipBits(5);
        }
        if (readBit2) {
            parsableBitArray.skipBits(6);
        }
    }

    private static void skipSpeakerConfig3d(ParsableBitArray parsableBitArray) {
        int readBits = parsableBitArray.readBits(2);
        if (readBits == 0) {
            parsableBitArray.skipBits(6);
            return;
        }
        int readEscapedIntValue = readEscapedIntValue(parsableBitArray, 5, 8, 16) + 1;
        if (readBits == 1) {
            parsableBitArray.skipBits(readEscapedIntValue * 7);
        } else if (readBits == 2) {
            skipMpegh3daFlexibleSpeakerConfig(parsableBitArray, readEscapedIntValue);
        }
    }
}
