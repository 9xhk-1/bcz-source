package androidx.media3.extractor;

import android.support.v4.media.session.MediaSessionCompat;
import androidx.annotation.Nullable;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.baicizhan.main.vld.bonding.j;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class Ac3Util {
    public static final int AC3_MAX_RATE_BYTES_PER_SECOND = 80000;
    private static final int AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT = 1536;
    private static final int AUDIO_SAMPLES_PER_AUDIO_BLOCK = 256;
    public static final int E_AC3_MAX_RATE_BYTES_PER_SECOND = 768000;
    public static final int TRUEHD_MAX_RATE_BYTES_PER_SECOND = 3062500;
    public static final int TRUEHD_RECHUNK_SAMPLE_COUNT = 16;
    public static final int TRUEHD_SYNCFRAME_PREFIX_LENGTH = 10;
    private static final int[] BLOCKS_PER_SYNCFRAME_BY_NUMBLKSCOD = {1, 2, 3, 6};
    private static final int[] SAMPLE_RATE_BY_FSCOD = {48000, 44100, 32000};
    private static final int[] SAMPLE_RATE_BY_FSCOD2 = {24000, 22050, 16000};
    private static final int[] CHANNEL_COUNT_BY_ACMOD = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] BITRATE_BY_HALF_FRMSIZECOD = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, MediaSessionCompat.K, 384, 448, 512, 576, 640};
    private static final int[] SYNCFRAME_SIZE_WORDS_BY_HALF_FRMSIZECOD_44_1 = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class SyncFrameInfo {
        public static final int STREAM_TYPE_TYPE0 = 0;
        public static final int STREAM_TYPE_TYPE1 = 1;
        public static final int STREAM_TYPE_TYPE2 = 2;
        public static final int STREAM_TYPE_UNDEFINED = -1;
        public final int bitrate;
        public final int channelCount;
        public final int frameSize;

        @Nullable
        public final String mimeType;
        public final int sampleCount;
        public final int sampleRate;
        public final int streamType;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface StreamType {
        }

        private SyncFrameInfo(@Nullable String str, int i11, int i12, int i13, int i14, int i15, int i16) {
            this.mimeType = str;
            this.streamType = i11;
            this.channelCount = i12;
            this.sampleRate = i13;
            this.frameSize = i14;
            this.sampleCount = i15;
            this.bitrate = i16;
        }
    }

    private Ac3Util() {
    }

    private static int calculateEac3Bitrate(int i11, int i12, int i13) {
        return (i11 * i12) / (i13 * 32);
    }

    public static int findTrueHdSyncframeOffset(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i11 = position; i11 <= limit; i11++) {
            if ((Util.getBigEndianInt(byteBuffer, i11 + 4) & (-2)) == -126718022) {
                return i11 - position;
            }
        }
        return -1;
    }

    private static int getAc3SyncframeSize(int i11, int i12) {
        int i13 = i12 / 2;
        if (i11 < 0) {
            return -1;
        }
        int[] iArr = SAMPLE_RATE_BY_FSCOD;
        if (i11 >= iArr.length || i12 < 0) {
            return -1;
        }
        int[] iArr2 = SYNCFRAME_SIZE_WORDS_BY_HALF_FRMSIZECOD_44_1;
        if (i13 >= iArr2.length) {
            return -1;
        }
        int i14 = iArr[i11];
        if (i14 == 44100) {
            return (iArr2[i13] + (i12 % 2)) * 2;
        }
        int i15 = BITRATE_BY_HALF_FRMSIZECOD[i13];
        return i14 == 32000 ? i15 * 6 : i15 * 4;
    }

    public static Format parseAc3AnnexFFormat(ParsableByteArray parsableByteArray, String str, @Nullable String str2, @Nullable DrmInitData drmInitData) {
        ParsableBitArray parsableBitArray = new ParsableBitArray();
        parsableBitArray.reset(parsableByteArray);
        int i11 = SAMPLE_RATE_BY_FSCOD[parsableBitArray.readBits(2)];
        parsableBitArray.skipBits(8);
        int i12 = CHANNEL_COUNT_BY_ACMOD[parsableBitArray.readBits(3)];
        if (parsableBitArray.readBits(1) != 0) {
            i12++;
        }
        int i13 = BITRATE_BY_HALF_FRMSIZECOD[parsableBitArray.readBits(5)] * 1000;
        parsableBitArray.byteAlign();
        parsableByteArray.setPosition(parsableBitArray.getBytePosition());
        return new Format.Builder().setId(str).setSampleMimeType(MimeTypes.AUDIO_AC3).setChannelCount(i12).setSampleRate(i11).setDrmInitData(drmInitData).setLanguage(str2).setAverageBitrate(i13).setPeakBitrate(i13).build();
    }

    public static int parseAc3SyncframeAudioSampleCount(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return BLOCKS_PER_SYNCFRAME_BY_NUMBLKSCOD[((byteBuffer.get(byteBuffer.position() + 4) & j.f25378c) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT;
    }

    public static SyncFrameInfo parseAc3SyncframeInfo(ParsableBitArray parsableBitArray) {
        int ac3SyncframeSize;
        int i11;
        int i12;
        int i13;
        String str;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int position = parsableBitArray.getPosition();
        parsableBitArray.skipBits(40);
        boolean z11 = parsableBitArray.readBits(5) > 10;
        parsableBitArray.setPosition(position);
        int i21 = -1;
        if (z11) {
            parsableBitArray.skipBits(16);
            int readBits = parsableBitArray.readBits(2);
            if (readBits == 0) {
                i21 = 0;
            } else if (readBits == 1) {
                i21 = 1;
            } else if (readBits == 2) {
                i21 = 2;
            }
            parsableBitArray.skipBits(3);
            ac3SyncframeSize = (parsableBitArray.readBits(11) + 1) * 2;
            int readBits2 = parsableBitArray.readBits(2);
            if (readBits2 == 3) {
                i11 = SAMPLE_RATE_BY_FSCOD2[parsableBitArray.readBits(2)];
                i15 = 3;
                i16 = 6;
            } else {
                int readBits3 = parsableBitArray.readBits(2);
                int i22 = BLOCKS_PER_SYNCFRAME_BY_NUMBLKSCOD[readBits3];
                i15 = readBits3;
                i11 = SAMPLE_RATE_BY_FSCOD[readBits2];
                i16 = i22;
            }
            i13 = i16 * 256;
            int calculateEac3Bitrate = calculateEac3Bitrate(ac3SyncframeSize, i11, i16);
            int readBits4 = parsableBitArray.readBits(3);
            boolean readBit = parsableBitArray.readBit();
            i12 = CHANNEL_COUNT_BY_ACMOD[readBits4] + (readBit ? 1 : 0);
            parsableBitArray.skipBits(10);
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(8);
            }
            if (readBits4 == 0) {
                parsableBitArray.skipBits(5);
                if (parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(8);
                }
            }
            if (i21 == 1 && parsableBitArray.readBit()) {
                parsableBitArray.skipBits(16);
            }
            if (parsableBitArray.readBit()) {
                if (readBits4 > 2) {
                    parsableBitArray.skipBits(2);
                }
                if ((readBits4 & 1) == 0 || readBits4 <= 2) {
                    i18 = 6;
                } else {
                    i18 = 6;
                    parsableBitArray.skipBits(6);
                }
                if ((readBits4 & 4) != 0) {
                    parsableBitArray.skipBits(i18);
                }
                if (readBit && parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(5);
                }
                if (i21 == 0) {
                    if (parsableBitArray.readBit()) {
                        i19 = 6;
                        parsableBitArray.skipBits(6);
                    } else {
                        i19 = 6;
                    }
                    if (readBits4 == 0 && parsableBitArray.readBit()) {
                        parsableBitArray.skipBits(i19);
                    }
                    if (parsableBitArray.readBit()) {
                        parsableBitArray.skipBits(i19);
                    }
                    int readBits5 = parsableBitArray.readBits(2);
                    if (readBits5 == 1) {
                        parsableBitArray.skipBits(5);
                    } else if (readBits5 == 2) {
                        parsableBitArray.skipBits(12);
                    } else if (readBits5 == 3) {
                        int readBits6 = parsableBitArray.readBits(5);
                        if (parsableBitArray.readBit()) {
                            parsableBitArray.skipBits(5);
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                if (parsableBitArray.readBit()) {
                                    parsableBitArray.skipBits(4);
                                }
                                if (parsableBitArray.readBit()) {
                                    parsableBitArray.skipBits(4);
                                }
                            }
                        }
                        if (parsableBitArray.readBit()) {
                            parsableBitArray.skipBits(5);
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(7);
                                if (parsableBitArray.readBit()) {
                                    parsableBitArray.skipBits(8);
                                }
                            }
                        }
                        parsableBitArray.skipBits((readBits6 + 2) * 8);
                        parsableBitArray.byteAlign();
                    }
                    if (readBits4 < 2) {
                        if (parsableBitArray.readBit()) {
                            parsableBitArray.skipBits(14);
                        }
                        if (readBits4 == 0 && parsableBitArray.readBit()) {
                            parsableBitArray.skipBits(14);
                        }
                    }
                    if (parsableBitArray.readBit()) {
                        if (i15 == 0) {
                            parsableBitArray.skipBits(5);
                        } else {
                            for (int i23 = 0; i23 < i16; i23++) {
                                if (parsableBitArray.readBit()) {
                                    parsableBitArray.skipBits(5);
                                }
                            }
                        }
                    }
                }
            }
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(5);
                if (readBits4 == 2) {
                    parsableBitArray.skipBits(4);
                }
                if (readBits4 >= 6) {
                    parsableBitArray.skipBits(2);
                }
                if (parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(8);
                }
                if (readBits4 == 0 && parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(8);
                }
                if (readBits2 < 3) {
                    parsableBitArray.skipBit();
                }
            }
            if (i21 == 0 && i15 != 3) {
                parsableBitArray.skipBit();
            }
            if (i21 == 2 && (i15 == 3 || parsableBitArray.readBit())) {
                i17 = 6;
                parsableBitArray.skipBits(6);
            } else {
                i17 = 6;
            }
            str = (parsableBitArray.readBit() && parsableBitArray.readBits(i17) == 1 && parsableBitArray.readBits(8) == 1) ? MimeTypes.AUDIO_E_AC3_JOC : MimeTypes.AUDIO_E_AC3;
            i14 = calculateEac3Bitrate;
        } else {
            parsableBitArray.skipBits(32);
            int readBits7 = parsableBitArray.readBits(2);
            String str2 = readBits7 == 3 ? null : MimeTypes.AUDIO_AC3;
            int readBits8 = parsableBitArray.readBits(6);
            int i24 = BITRATE_BY_HALF_FRMSIZECOD[readBits8 / 2] * 1000;
            ac3SyncframeSize = getAc3SyncframeSize(readBits7, readBits8);
            parsableBitArray.skipBits(8);
            int readBits9 = parsableBitArray.readBits(3);
            if ((readBits9 & 1) != 0 && readBits9 != 1) {
                parsableBitArray.skipBits(2);
            }
            if ((readBits9 & 4) != 0) {
                parsableBitArray.skipBits(2);
            }
            if (readBits9 == 2) {
                parsableBitArray.skipBits(2);
            }
            int[] iArr = SAMPLE_RATE_BY_FSCOD;
            i11 = readBits7 < iArr.length ? iArr[readBits7] : -1;
            i12 = CHANNEL_COUNT_BY_ACMOD[readBits9] + (parsableBitArray.readBit() ? 1 : 0);
            i13 = AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT;
            str = str2;
            i14 = i24;
        }
        return new SyncFrameInfo(str, i21, i12, i11, ac3SyncframeSize, i13, i14);
    }

    public static int parseAc3SyncframeSize(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b11 = bArr[4];
        return getAc3SyncframeSize((b11 & j.f25378c) >> 6, b11 & 63);
    }

    public static Format parseEAc3AnnexFFormat(ParsableByteArray parsableByteArray, String str, @Nullable String str2, @Nullable DrmInitData drmInitData) {
        String str3;
        ParsableBitArray parsableBitArray = new ParsableBitArray();
        parsableBitArray.reset(parsableByteArray);
        int readBits = parsableBitArray.readBits(13) * 1000;
        parsableBitArray.skipBits(3);
        int i11 = SAMPLE_RATE_BY_FSCOD[parsableBitArray.readBits(2)];
        parsableBitArray.skipBits(10);
        int i12 = CHANNEL_COUNT_BY_ACMOD[parsableBitArray.readBits(3)];
        if (parsableBitArray.readBits(1) != 0) {
            i12++;
        }
        parsableBitArray.skipBits(3);
        int readBits2 = parsableBitArray.readBits(4);
        parsableBitArray.skipBits(1);
        if (readBits2 > 0) {
            parsableBitArray.skipBits(6);
            if (parsableBitArray.readBits(1) != 0) {
                i12 += 2;
            }
            parsableBitArray.skipBits(1);
        }
        if (parsableBitArray.bitsLeft() > 7) {
            parsableBitArray.skipBits(7);
            if (parsableBitArray.readBits(1) != 0) {
                str3 = MimeTypes.AUDIO_E_AC3_JOC;
                parsableBitArray.byteAlign();
                parsableByteArray.setPosition(parsableBitArray.getBytePosition());
                return new Format.Builder().setId(str).setSampleMimeType(str3).setChannelCount(i12).setSampleRate(i11).setDrmInitData(drmInitData).setLanguage(str2).setPeakBitrate(readBits).build();
            }
        }
        str3 = MimeTypes.AUDIO_E_AC3;
        parsableBitArray.byteAlign();
        parsableByteArray.setPosition(parsableBitArray.getBytePosition());
        return new Format.Builder().setId(str).setSampleMimeType(str3).setChannelCount(i12).setSampleRate(i11).setDrmInitData(drmInitData).setLanguage(str2).setPeakBitrate(readBits).build();
    }

    public static int parseTrueHdSyncframeAudioSampleCount(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b11 = bArr[7];
            if ((b11 & 254) == 186) {
                return 40 << ((bArr[(b11 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }

    public static int parseTrueHdSyncframeAudioSampleCount(ByteBuffer byteBuffer, int i11) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i11) + ((byteBuffer.get((byteBuffer.position() + i11) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }
}
