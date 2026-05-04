package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.UnstableApi;
import rf.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class MpegAudioUtil {
    public static final int MAX_FRAME_SIZE_BYTES = 4096;
    private static final int SAMPLES_PER_FRAME_L1 = 384;
    private static final int SAMPLES_PER_FRAME_L2 = 1152;
    private static final int SAMPLES_PER_FRAME_L3_V1 = 1152;
    private static final int SAMPLES_PER_FRAME_L3_V2 = 576;
    private static final String[] MIME_TYPE_BY_LAYER = {MimeTypes.AUDIO_MPEG_L1, MimeTypes.AUDIO_MPEG_L2, MimeTypes.AUDIO_MPEG};
    private static final int[] SAMPLING_RATE_V1 = {44100, 48000, 32000};
    private static final int[] BITRATE_V1_L1 = {32000, 64000, 96000, h.f83979k, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 288000, 320000, 352000, 384000, 416000, 448000};
    private static final int[] BITRATE_V2_L1 = {32000, 48000, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, h.f83979k, 144000, 160000, 176000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND};
    private static final int[] BITRATE_V1_L2 = {32000, 48000, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, h.f83979k, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 320000, 384000};
    public static final int MAX_RATE_BYTES_PER_SECOND = 40000;
    private static final int[] BITRATE_V1_L3 = {32000, MAX_RATE_BYTES_PER_SECOND, 48000, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, h.f83979k, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 320000};
    private static final int[] BITRATE_V2 = {8000, 16000, 24000, 32000, MAX_RATE_BYTES_PER_SECOND, 48000, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, h.f83979k, 144000, 160000};

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Header {
        public int bitrate;
        public int channels;
        public int frameSize;

        @Nullable
        public String mimeType;
        public int sampleRate;
        public int samplesPerFrame;
        public int version;

        public Header() {
        }

        public boolean setForHeaderData(int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            if (!MpegAudioUtil.isMagicPresent(i11) || (i12 = (i11 >>> 19) & 3) == 1 || (i13 = (i11 >>> 17) & 3) == 0 || (i14 = (i11 >>> 12) & 15) == 0 || i14 == 15 || (i15 = (i11 >>> 10) & 3) == 3) {
                return false;
            }
            this.version = i12;
            this.mimeType = MpegAudioUtil.MIME_TYPE_BY_LAYER[3 - i13];
            int i16 = MpegAudioUtil.SAMPLING_RATE_V1[i15];
            this.sampleRate = i16;
            if (i12 == 2) {
                this.sampleRate = i16 / 2;
            } else if (i12 == 0) {
                this.sampleRate = i16 / 4;
            }
            int i17 = (i11 >>> 9) & 1;
            this.samplesPerFrame = MpegAudioUtil.getFrameSizeInSamples(i12, i13);
            if (i13 == 3) {
                int i18 = i12 == 3 ? MpegAudioUtil.BITRATE_V1_L1[i14 - 1] : MpegAudioUtil.BITRATE_V2_L1[i14 - 1];
                this.bitrate = i18;
                this.frameSize = (((i18 * 12) / this.sampleRate) + i17) * 4;
            } else {
                if (i12 == 3) {
                    int i19 = i13 == 2 ? MpegAudioUtil.BITRATE_V1_L2[i14 - 1] : MpegAudioUtil.BITRATE_V1_L3[i14 - 1];
                    this.bitrate = i19;
                    this.frameSize = ((i19 * 144) / this.sampleRate) + i17;
                } else {
                    int i21 = MpegAudioUtil.BITRATE_V2[i14 - 1];
                    this.bitrate = i21;
                    this.frameSize = (((i13 == 1 ? 72 : 144) * i21) / this.sampleRate) + i17;
                }
            }
            this.channels = ((i11 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }

        public Header(Header header) {
            this.version = header.version;
            this.mimeType = header.mimeType;
            this.frameSize = header.frameSize;
            this.sampleRate = header.sampleRate;
            this.channels = header.channels;
            this.bitrate = header.bitrate;
            this.samplesPerFrame = header.samplesPerFrame;
        }
    }

    private MpegAudioUtil() {
    }

    public static int getFrameSize(int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        if (!isMagicPresent(i11) || (i12 = (i11 >>> 19) & 3) == 1 || (i13 = (i11 >>> 17) & 3) == 0 || (i14 = (i11 >>> 12) & 15) == 0 || i14 == 15 || (i15 = (i11 >>> 10) & 3) == 3) {
            return -1;
        }
        int i16 = SAMPLING_RATE_V1[i15];
        if (i12 == 2) {
            i16 /= 2;
        } else if (i12 == 0) {
            i16 /= 4;
        }
        int i17 = (i11 >>> 9) & 1;
        if (i13 == 3) {
            return ((((i12 == 3 ? BITRATE_V1_L1[i14 - 1] : BITRATE_V2_L1[i14 - 1]) * 12) / i16) + i17) * 4;
        }
        int i18 = i12 == 3 ? i13 == 2 ? BITRATE_V1_L2[i14 - 1] : BITRATE_V1_L3[i14 - 1] : BITRATE_V2[i14 - 1];
        if (i12 == 3) {
            return ((i18 * 144) / i16) + i17;
        }
        return (((i13 == 1 ? 72 : 144) * i18) / i16) + i17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getFrameSizeInSamples(int i11, int i12) {
        if (i12 == 1) {
            if (i11 == 3) {
                return 1152;
            }
            return SAMPLES_PER_FRAME_L3_V2;
        }
        if (i12 == 2) {
            return 1152;
        }
        if (i12 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isMagicPresent(int i11) {
        return (i11 & (-2097152)) == -2097152;
    }

    public static int parseMpegAudioFrameSampleCount(int i11) {
        int i12;
        int i13;
        if (!isMagicPresent(i11) || (i12 = (i11 >>> 19) & 3) == 1 || (i13 = (i11 >>> 17) & 3) == 0) {
            return -1;
        }
        int i14 = (i11 >>> 12) & 15;
        int i15 = (i11 >>> 10) & 3;
        if (i14 == 0 || i14 == 15 || i15 == 3) {
            return -1;
        }
        return getFrameSizeInSamples(i12, i13);
    }
}
