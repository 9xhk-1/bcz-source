package androidx.media3.extractor.mkv;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DataReader;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.LongArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.TrueHdSampleRechunker;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.SubtitleTranscodingExtractorOutput;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import kx.a0;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.fusesource.jansi.Ansi;
import to.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public class MatroskaExtractor implements Extractor {
    private static final int BLOCK_ADDITIONAL_ID_VP9_ITU_T_35 = 4;
    private static final int BLOCK_ADD_ID_TYPE_DVCC = 1685480259;
    private static final int BLOCK_ADD_ID_TYPE_DVVC = 1685485123;
    private static final int BLOCK_STATE_DATA = 2;
    private static final int BLOCK_STATE_HEADER = 1;
    private static final int BLOCK_STATE_START = 0;
    private static final String CODEC_ID_AAC = "A_AAC";
    private static final String CODEC_ID_AC3 = "A_AC3";
    private static final String CODEC_ID_ACM = "A_MS/ACM";
    private static final String CODEC_ID_ASS = "S_TEXT/ASS";
    private static final String CODEC_ID_AV1 = "V_AV1";
    private static final String CODEC_ID_DTS = "A_DTS";
    private static final String CODEC_ID_DTS_EXPRESS = "A_DTS/EXPRESS";
    private static final String CODEC_ID_DTS_LOSSLESS = "A_DTS/LOSSLESS";
    private static final String CODEC_ID_DVBSUB = "S_DVBSUB";
    private static final String CODEC_ID_E_AC3 = "A_EAC3";
    private static final String CODEC_ID_FLAC = "A_FLAC";
    private static final String CODEC_ID_FOURCC = "V_MS/VFW/FOURCC";
    private static final String CODEC_ID_H264 = "V_MPEG4/ISO/AVC";
    private static final String CODEC_ID_H265 = "V_MPEGH/ISO/HEVC";
    private static final String CODEC_ID_MP2 = "A_MPEG/L2";
    private static final String CODEC_ID_MP3 = "A_MPEG/L3";
    private static final String CODEC_ID_MPEG2 = "V_MPEG2";
    private static final String CODEC_ID_MPEG4_AP = "V_MPEG4/ISO/AP";
    private static final String CODEC_ID_MPEG4_ASP = "V_MPEG4/ISO/ASP";
    private static final String CODEC_ID_MPEG4_SP = "V_MPEG4/ISO/SP";
    private static final String CODEC_ID_OPUS = "A_OPUS";
    private static final String CODEC_ID_PCM_FLOAT = "A_PCM/FLOAT/IEEE";
    private static final String CODEC_ID_PCM_INT_BIG = "A_PCM/INT/BIG";
    private static final String CODEC_ID_PCM_INT_LIT = "A_PCM/INT/LIT";
    private static final String CODEC_ID_PGS = "S_HDMV/PGS";
    private static final String CODEC_ID_SUBRIP = "S_TEXT/UTF8";
    private static final String CODEC_ID_THEORA = "V_THEORA";
    private static final String CODEC_ID_TRUEHD = "A_TRUEHD";
    private static final String CODEC_ID_VOBSUB = "S_VOBSUB";
    private static final String CODEC_ID_VORBIS = "A_VORBIS";
    private static final String CODEC_ID_VP8 = "V_VP8";
    private static final String CODEC_ID_VP9 = "V_VP9";
    private static final String CODEC_ID_VTT = "S_TEXT/WEBVTT";
    private static final String DOC_TYPE_MATROSKA = "matroska";
    private static final String DOC_TYPE_WEBM = "webm";
    private static final int ENCRYPTION_IV_SIZE = 8;
    public static final int FLAG_DISABLE_SEEK_FOR_CUES = 1;
    public static final int FLAG_EMIT_RAW_SUBTITLE_DATA = 2;
    private static final int FOURCC_COMPRESSION_DIVX = 1482049860;
    private static final int FOURCC_COMPRESSION_H263 = 859189832;
    private static final int FOURCC_COMPRESSION_VC1 = 826496599;
    private static final int ID_AUDIO = 225;
    private static final int ID_AUDIO_BIT_DEPTH = 25188;
    private static final int ID_BLOCK = 161;
    private static final int ID_BLOCK_ADDITIONAL = 165;
    private static final int ID_BLOCK_ADDITIONS = 30113;
    private static final int ID_BLOCK_ADDITION_MAPPING = 16868;
    private static final int ID_BLOCK_ADD_ID = 238;
    private static final int ID_BLOCK_ADD_ID_EXTRA_DATA = 16877;
    private static final int ID_BLOCK_ADD_ID_TYPE = 16871;
    private static final int ID_BLOCK_DURATION = 155;
    private static final int ID_BLOCK_GROUP = 160;
    private static final int ID_BLOCK_MORE = 166;
    private static final int ID_CHANNELS = 159;
    private static final int ID_CLUSTER = 524531317;
    private static final int ID_CODEC_DELAY = 22186;
    private static final int ID_CODEC_ID = 134;
    private static final int ID_CODEC_PRIVATE = 25506;
    private static final int ID_COLOUR = 21936;
    private static final int ID_COLOUR_BITS_PER_CHANNEL = 21938;
    private static final int ID_COLOUR_PRIMARIES = 21947;
    private static final int ID_COLOUR_RANGE = 21945;
    private static final int ID_COLOUR_TRANSFER = 21946;
    private static final int ID_CONTENT_COMPRESSION = 20532;
    private static final int ID_CONTENT_COMPRESSION_ALGORITHM = 16980;
    private static final int ID_CONTENT_COMPRESSION_SETTINGS = 16981;
    private static final int ID_CONTENT_ENCODING = 25152;
    private static final int ID_CONTENT_ENCODINGS = 28032;
    private static final int ID_CONTENT_ENCODING_ORDER = 20529;
    private static final int ID_CONTENT_ENCODING_SCOPE = 20530;
    private static final int ID_CONTENT_ENCRYPTION = 20533;
    private static final int ID_CONTENT_ENCRYPTION_AES_SETTINGS = 18407;
    private static final int ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE = 18408;
    private static final int ID_CONTENT_ENCRYPTION_ALGORITHM = 18401;
    private static final int ID_CONTENT_ENCRYPTION_KEY_ID = 18402;
    private static final int ID_CUES = 475249515;
    private static final int ID_CUE_CLUSTER_POSITION = 241;
    private static final int ID_CUE_POINT = 187;
    private static final int ID_CUE_TIME = 179;
    private static final int ID_CUE_TRACK_POSITIONS = 183;
    private static final int ID_DEFAULT_DURATION = 2352003;
    private static final int ID_DISCARD_PADDING = 30114;
    private static final int ID_DISPLAY_HEIGHT = 21690;
    private static final int ID_DISPLAY_UNIT = 21682;
    private static final int ID_DISPLAY_WIDTH = 21680;
    private static final int ID_DOC_TYPE = 17026;
    private static final int ID_DOC_TYPE_READ_VERSION = 17029;
    private static final int ID_DURATION = 17545;
    private static final int ID_EBML = 440786851;
    private static final int ID_EBML_READ_VERSION = 17143;
    private static final int ID_FLAG_DEFAULT = 136;
    private static final int ID_FLAG_FORCED = 21930;
    private static final int ID_INFO = 357149030;
    private static final int ID_LANGUAGE = 2274716;
    private static final int ID_LUMNINANCE_MAX = 21977;
    private static final int ID_LUMNINANCE_MIN = 21978;
    private static final int ID_MASTERING_METADATA = 21968;
    private static final int ID_MAX_BLOCK_ADDITION_ID = 21998;
    private static final int ID_MAX_CLL = 21948;
    private static final int ID_MAX_FALL = 21949;
    private static final int ID_NAME = 21358;
    private static final int ID_PIXEL_HEIGHT = 186;
    private static final int ID_PIXEL_WIDTH = 176;
    private static final int ID_PRIMARY_B_CHROMATICITY_X = 21973;
    private static final int ID_PRIMARY_B_CHROMATICITY_Y = 21974;
    private static final int ID_PRIMARY_G_CHROMATICITY_X = 21971;
    private static final int ID_PRIMARY_G_CHROMATICITY_Y = 21972;
    private static final int ID_PRIMARY_R_CHROMATICITY_X = 21969;
    private static final int ID_PRIMARY_R_CHROMATICITY_Y = 21970;
    private static final int ID_PROJECTION = 30320;
    private static final int ID_PROJECTION_POSE_PITCH = 30324;
    private static final int ID_PROJECTION_POSE_ROLL = 30325;
    private static final int ID_PROJECTION_POSE_YAW = 30323;
    private static final int ID_PROJECTION_PRIVATE = 30322;
    private static final int ID_PROJECTION_TYPE = 30321;
    private static final int ID_REFERENCE_BLOCK = 251;
    private static final int ID_SAMPLING_FREQUENCY = 181;
    private static final int ID_SEEK = 19899;
    private static final int ID_SEEK_HEAD = 290298740;
    private static final int ID_SEEK_ID = 21419;
    private static final int ID_SEEK_POSITION = 21420;
    private static final int ID_SEEK_PRE_ROLL = 22203;
    private static final int ID_SEGMENT = 408125543;
    private static final int ID_SEGMENT_INFO = 357149030;
    private static final int ID_SIMPLE_BLOCK = 163;
    private static final int ID_STEREO_MODE = 21432;
    private static final int ID_TIMECODE_SCALE = 2807729;
    private static final int ID_TIME_CODE = 231;
    private static final int ID_TRACKS = 374648427;
    private static final int ID_TRACK_ENTRY = 174;
    private static final int ID_TRACK_NUMBER = 215;
    private static final int ID_TRACK_TYPE = 131;
    private static final int ID_VIDEO = 224;
    private static final int ID_WHITE_POINT_CHROMATICITY_X = 21975;
    private static final int ID_WHITE_POINT_CHROMATICITY_Y = 21976;
    private static final int LACING_EBML = 3;
    private static final int LACING_FIXED_SIZE = 2;
    private static final int LACING_NONE = 0;
    private static final int LACING_XIPH = 1;
    private static final int OPUS_MAX_INPUT_SIZE = 5760;
    private static final int SSA_PREFIX_END_TIMECODE_OFFSET = 21;
    private static final String SSA_TIMECODE_FORMAT = "%01d:%02d:%02d:%02d";
    private static final long SSA_TIMECODE_LAST_VALUE_SCALING_FACTOR = 10000;
    private static final int SUBRIP_PREFIX_END_TIMECODE_OFFSET = 19;
    private static final String SUBRIP_TIMECODE_FORMAT = "%02d:%02d:%02d,%03d";
    private static final long SUBRIP_TIMECODE_LAST_VALUE_SCALING_FACTOR = 1000;
    private static final String TAG = "MatroskaExtractor";
    private static final Map<String, Integer> TRACK_NAME_TO_ROTATION_DEGREES;
    private static final int TRACK_TYPE_AUDIO = 2;
    private static final int UNSET_ENTRY_ID = -1;
    private static final int VORBIS_MAX_INPUT_SIZE = 8192;
    private static final int VTT_PREFIX_END_TIMECODE_OFFSET = 25;
    private static final String VTT_TIMECODE_FORMAT = "%02d:%02d:%02d.%03d";
    private static final long VTT_TIMECODE_LAST_VALUE_SCALING_FACTOR = 1000;
    private static final int WAVE_FORMAT_EXTENSIBLE = 65534;
    private static final int WAVE_FORMAT_PCM = 1;
    private static final int WAVE_FORMAT_SIZE = 18;
    private int blockAdditionalId;
    private long blockDurationUs;
    private int blockFlags;
    private long blockGroupDiscardPaddingNs;
    private boolean blockHasReferenceBlock;
    private int blockSampleCount;
    private int blockSampleIndex;
    private int[] blockSampleSizes;
    private int blockState;
    private long blockTimeUs;
    private int blockTrackNumber;
    private int blockTrackNumberLength;
    private long clusterTimecodeUs;

    @Nullable
    private LongArray cueClusterPositions;

    @Nullable
    private LongArray cueTimesUs;
    private long cuesContentPosition;

    @Nullable
    private Track currentTrack;
    private long durationTimecode;
    private long durationUs;
    private final ParsableByteArray encryptionInitializationVector;
    private final ParsableByteArray encryptionSubsampleData;
    private ByteBuffer encryptionSubsampleDataBuffer;
    private ExtractorOutput extractorOutput;
    private boolean haveOutputSample;
    private boolean isWebm;
    private final ParsableByteArray nalLength;
    private final ParsableByteArray nalStartCode;
    private final boolean parseSubtitlesDuringExtraction;
    private final EbmlReader reader;
    private int sampleBytesRead;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private boolean sampleEncodingHandled;
    private boolean sampleInitializationVectorRead;
    private int samplePartitionCount;
    private boolean samplePartitionCountRead;
    private byte sampleSignalByte;
    private boolean sampleSignalByteRead;
    private final ParsableByteArray sampleStrippedBytes;
    private final ParsableByteArray scratch;
    private int seekEntryId;
    private final ParsableByteArray seekEntryIdBytes;
    private long seekEntryPosition;
    private boolean seekForCues;
    private final boolean seekForCuesEnabled;
    private long seekPositionAfterBuildingCues;
    private boolean seenClusterPositionForCurrentCuePoint;
    private long segmentContentPosition;
    private long segmentContentSize;
    private boolean sentSeekMap;
    private final SubtitleParser.Factory subtitleParserFactory;
    private final ParsableByteArray subtitleSample;
    private final ParsableByteArray supplementalData;
    private long timecodeScale;
    private final SparseArray<Track> tracks;
    private final VarintReader varintReader;
    private final ParsableByteArray vorbisNumPageSamples;

    @Deprecated
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: androidx.media3.extractor.mkv.b
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return MatroskaExtractor.b();
        }
    };
    private static final byte[] SUBRIP_PREFIX = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, a0.f68904b, a0.f68904b, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] SSA_DIALOGUE_FORMAT = Util.getUtf8Bytes("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] SSA_PREFIX = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final byte[] VTT_PREFIX = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, a0.f68904b, a0.f68904b, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    private static final UUID WAVE_SUBFORMAT_PCM = new UUID(72057594037932032L, -9223371306706625679L);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class InnerEbmlProcessor implements EbmlProcessor {
        private InnerEbmlProcessor() {
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void binaryElement(int i11, int i12, ExtractorInput extractorInput) throws IOException {
            MatroskaExtractor.this.binaryElement(i11, i12, extractorInput);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void endMasterElement(int i11) throws ParserException {
            MatroskaExtractor.this.endMasterElement(i11);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void floatElement(int i11, double d11) throws ParserException {
            MatroskaExtractor.this.floatElement(i11, d11);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public int getElementType(int i11) {
            return MatroskaExtractor.this.getElementType(i11);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void integerElement(int i11, long j11) throws ParserException {
            MatroskaExtractor.this.integerElement(i11, j11);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public boolean isLevel1Element(int i11) {
            return MatroskaExtractor.this.isLevel1Element(i11);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void startMasterElement(int i11, long j11, long j12) throws ParserException {
            MatroskaExtractor.this.startMasterElement(i11, j11, j12);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void stringElement(int i11, String str) throws ParserException {
            MatroskaExtractor.this.stringElement(i11, str);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Track {
        private static final int DEFAULT_MAX_CLL = 1000;
        private static final int DEFAULT_MAX_FALL = 200;
        private static final int DISPLAY_UNIT_PIXELS = 0;
        private static final int MAX_CHROMATICITY = 50000;
        private int blockAddIdType;
        public String codecId;
        public byte[] codecPrivate;
        public TrackOutput.CryptoData cryptoData;
        public int defaultSampleDurationNs;
        public byte[] dolbyVisionConfigBytes;
        public DrmInitData drmInitData;
        public boolean flagForced;
        public boolean hasContentEncryption;
        public boolean isWebm;
        public int maxBlockAdditionId;
        public int nalUnitLengthFieldLength;
        public String name;
        public int number;
        public TrackOutput output;
        public byte[] sampleStrippedBytes;
        public TrueHdSampleRechunker trueHdSampleRechunker;
        public int type;
        public int width = -1;
        public int height = -1;
        public int bitsPerChannel = -1;
        public int displayWidth = -1;
        public int displayHeight = -1;
        public int displayUnit = 0;
        public int projectionType = -1;
        public float projectionPoseYaw = 0.0f;
        public float projectionPosePitch = 0.0f;
        public float projectionPoseRoll = 0.0f;
        public byte[] projectionData = null;
        public int stereoMode = -1;
        public boolean hasColorInfo = false;
        public int colorSpace = -1;
        public int colorTransfer = -1;
        public int colorRange = -1;
        public int maxContentLuminance = 1000;
        public int maxFrameAverageLuminance = 200;
        public float primaryRChromaticityX = -1.0f;
        public float primaryRChromaticityY = -1.0f;
        public float primaryGChromaticityX = -1.0f;
        public float primaryGChromaticityY = -1.0f;
        public float primaryBChromaticityX = -1.0f;
        public float primaryBChromaticityY = -1.0f;
        public float whitePointChromaticityX = -1.0f;
        public float whitePointChromaticityY = -1.0f;
        public float maxMasteringLuminance = -1.0f;
        public float minMasteringLuminance = -1.0f;
        public int channelCount = 1;
        public int audioBitDepth = -1;
        public int sampleRate = 8000;
        public long codecDelayNs = 0;
        public long seekPreRollNs = 0;
        public boolean flagDefault = true;
        private String language = "eng";

        /* JADX INFO: Access modifiers changed from: private */
        @EnsuresNonNull({"output"})
        public void assertOutputInitialized() {
            Assertions.checkNotNull(this.output);
        }

        @EnsuresNonNull({"codecPrivate"})
        private byte[] getCodecPrivate(String str) throws ParserException {
            byte[] bArr = this.codecPrivate;
            if (bArr != null) {
                return bArr;
            }
            throw ParserException.createForMalformedContainer("Missing CodecPrivate for codec " + str, null);
        }

        @Nullable
        private byte[] getHdrStaticInfo() {
            if (this.primaryRChromaticityX == -1.0f || this.primaryRChromaticityY == -1.0f || this.primaryGChromaticityX == -1.0f || this.primaryGChromaticityY == -1.0f || this.primaryBChromaticityX == -1.0f || this.primaryBChromaticityY == -1.0f || this.whitePointChromaticityX == -1.0f || this.whitePointChromaticityY == -1.0f || this.maxMasteringLuminance == -1.0f || this.minMasteringLuminance == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            order.put((byte) 0);
            order.putShort((short) ((this.primaryRChromaticityX * 50000.0f) + 0.5f));
            order.putShort((short) ((this.primaryRChromaticityY * 50000.0f) + 0.5f));
            order.putShort((short) ((this.primaryGChromaticityX * 50000.0f) + 0.5f));
            order.putShort((short) ((this.primaryGChromaticityY * 50000.0f) + 0.5f));
            order.putShort((short) ((this.primaryBChromaticityX * 50000.0f) + 0.5f));
            order.putShort((short) ((this.primaryBChromaticityY * 50000.0f) + 0.5f));
            order.putShort((short) ((this.whitePointChromaticityX * 50000.0f) + 0.5f));
            order.putShort((short) ((this.whitePointChromaticityY * 50000.0f) + 0.5f));
            order.putShort((short) (this.maxMasteringLuminance + 0.5f));
            order.putShort((short) (this.minMasteringLuminance + 0.5f));
            order.putShort((short) this.maxContentLuminance);
            order.putShort((short) this.maxFrameAverageLuminance);
            return bArr;
        }

        private static Pair<String, List<byte[]>> parseFourCcPrivate(ParsableByteArray parsableByteArray) throws ParserException {
            try {
                parsableByteArray.skipBytes(16);
                long readLittleEndianUnsignedInt = parsableByteArray.readLittleEndianUnsignedInt();
                if (readLittleEndianUnsignedInt == 1482049860) {
                    return new Pair<>(MimeTypes.VIDEO_DIVX, null);
                }
                if (readLittleEndianUnsignedInt == 859189832) {
                    return new Pair<>(MimeTypes.VIDEO_H263, null);
                }
                if (readLittleEndianUnsignedInt != 826496599) {
                    Log.w(MatroskaExtractor.TAG, "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair<>(MimeTypes.VIDEO_UNKNOWN, null);
                }
                byte[] data = parsableByteArray.getData();
                for (int position = parsableByteArray.getPosition() + 20; position < data.length - 4; position++) {
                    if (data[position] == 0 && data[position + 1] == 0 && data[position + 2] == 1 && data[position + 3] == 15) {
                        return new Pair<>(MimeTypes.VIDEO_VC1, Collections.singletonList(Arrays.copyOfRange(data, position, data.length)));
                    }
                }
                throw ParserException.createForMalformedContainer("Failed to find FourCC VC1 initialization data", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing FourCC private data", null);
            }
        }

        private static boolean parseMsAcmCodecPrivate(ParsableByteArray parsableByteArray) throws ParserException {
            try {
                int readLittleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
                if (readLittleEndianUnsignedShort == 1) {
                    return true;
                }
                if (readLittleEndianUnsignedShort == 65534) {
                    parsableByteArray.setPosition(24);
                    if (parsableByteArray.readLong() == MatroskaExtractor.WAVE_SUBFORMAT_PCM.getMostSignificantBits()) {
                        if (parsableByteArray.readLong() == MatroskaExtractor.WAVE_SUBFORMAT_PCM.getLeastSignificantBits()) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing MS/ACM codec private", null);
            }
        }

        private static List<byte[]> parseVorbisCodecPrivate(byte[] bArr) throws ParserException {
            int i11;
            int i12;
            try {
                if (bArr[0] != 2) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                int i13 = 0;
                int i14 = 1;
                while (true) {
                    i11 = bArr[i14];
                    if ((i11 & 255) != 255) {
                        break;
                    }
                    i13 += 255;
                    i14++;
                }
                int i15 = i14 + 1;
                int i16 = i13 + (i11 & 255);
                int i17 = 0;
                while (true) {
                    i12 = bArr[i15];
                    if ((i12 & 255) != 255) {
                        break;
                    }
                    i17 += 255;
                    i15++;
                }
                int i18 = i15 + 1;
                int i19 = i17 + (i12 & 255);
                if (bArr[i18] != 1) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i16];
                System.arraycopy(bArr, i18, bArr2, 0, i16);
                int i21 = i18 + i16;
                if (bArr[i21] != 3) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                int i22 = i21 + i19;
                if (bArr[i22] != 5) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                byte[] bArr3 = new byte[bArr.length - i22];
                System.arraycopy(bArr, i22, bArr3, 0, bArr.length - i22);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean samplesHaveSupplementalData(boolean z11) {
            return MatroskaExtractor.CODEC_ID_OPUS.equals(this.codecId) ? z11 : this.maxBlockAdditionId > 0;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0449  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0462  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0471  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x05ad  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x05c8  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x05cb  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0483  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0464  */
        @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.output"})
        @org.checkerframework.checker.nullness.qual.RequiresNonNull({"codecId"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void initializeOutput(androidx.media3.extractor.ExtractorOutput r19, int r20) throws androidx.media3.common.ParserException {
            /*
                Method dump skipped, instructions count: 1744
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mkv.MatroskaExtractor.Track.initializeOutput(androidx.media3.extractor.ExtractorOutput, int):void");
        }

        @RequiresNonNull({"output"})
        public void outputPendingSampleMetadata() {
            TrueHdSampleRechunker trueHdSampleRechunker = this.trueHdSampleRechunker;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.outputPendingSampleMetadata(this.output, this.cryptoData);
            }
        }

        public void reset() {
            TrueHdSampleRechunker trueHdSampleRechunker = this.trueHdSampleRechunker;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.reset();
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        TRACK_NAME_TO_ROTATION_DEGREES = Collections.unmodifiableMap(hashMap);
    }

    @Deprecated
    public MatroskaExtractor() {
        this(new DefaultEbmlReader(), 2, SubtitleParser.Factory.UNSUPPORTED);
    }

    public static /* synthetic */ Extractor[] a(SubtitleParser.Factory factory) {
        return new Extractor[]{new MatroskaExtractor(factory)};
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    private void assertInCues(int i11) throws ParserException {
        if (this.cueTimesUs == null || this.cueClusterPositions == null) {
            throw ParserException.createForMalformedContainer("Element " + i11 + " must be in a Cues", null);
        }
    }

    @EnsuresNonNull({"currentTrack"})
    private void assertInTrackEntry(int i11) throws ParserException {
        if (this.currentTrack != null) {
            return;
        }
        throw ParserException.createForMalformedContainer("Element " + i11 + " must be in a TrackEntry", null);
    }

    @EnsuresNonNull({"extractorOutput"})
    private void assertInitialized() {
        Assertions.checkStateNotNull(this.extractorOutput);
    }

    public static /* synthetic */ Extractor[] b() {
        return new Extractor[]{new MatroskaExtractor(SubtitleParser.Factory.UNSUPPORTED, 2)};
    }

    private SeekMap buildSeekMap(@Nullable LongArray longArray, @Nullable LongArray longArray2) {
        int i11;
        if (this.segmentContentPosition == -1 || this.durationUs == C.TIME_UNSET || longArray == null || longArray.size() == 0 || longArray2 == null || longArray2.size() != longArray.size()) {
            return new SeekMap.Unseekable(this.durationUs);
        }
        int size = longArray.size();
        int[] iArr = new int[size];
        long[] jArr = new long[size];
        long[] jArr2 = new long[size];
        long[] jArr3 = new long[size];
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            jArr3[i13] = longArray.get(i13);
            jArr[i13] = this.segmentContentPosition + longArray2.get(i13);
        }
        while (true) {
            i11 = size - 1;
            if (i12 >= i11) {
                break;
            }
            int i14 = i12 + 1;
            iArr[i12] = (int) (jArr[i14] - jArr[i12]);
            jArr2[i12] = jArr3[i14] - jArr3[i12];
            i12 = i14;
        }
        int i15 = i11;
        while (i15 > 0 && jArr3[i15] > this.durationUs) {
            i15--;
        }
        iArr[i15] = (int) ((this.segmentContentPosition + this.segmentContentSize) - jArr[i15]);
        jArr2[i15] = this.durationUs - jArr3[i15];
        if (i15 < i11) {
            Log.w(TAG, "Discarding trailing cue points with timestamps greater than total duration");
            int i16 = i15 + 1;
            iArr = Arrays.copyOf(iArr, i16);
            jArr = Arrays.copyOf(jArr, i16);
            jArr2 = Arrays.copyOf(jArr2, i16);
            jArr3 = Arrays.copyOf(jArr3, i16);
        }
        return new ChunkIndex(iArr, jArr, jArr2, jArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009e  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#1.output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void commitSampleToOutput(androidx.media3.extractor.mkv.MatroskaExtractor.Track r18, long r19, int r21, int r22, int r23) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            androidx.media3.extractor.TrueHdSampleRechunker r2 = r1.trueHdSampleRechunker
            r9 = 1
            if (r2 == 0) goto L1c
            r3 = r2
            androidx.media3.extractor.TrackOutput r2 = r1.output
            androidx.media3.extractor.TrackOutput$CryptoData r8 = r1.cryptoData
            r5 = r21
            r6 = r22
            r7 = r23
            r1 = r3
            r3 = r19
            r1.sampleMetadata(r2, r3, r5, r6, r7, r8)
            goto Lc8
        L1c:
            java.lang.String r2 = "S_TEXT/UTF8"
            java.lang.String r3 = r1.codecId
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L3a
            java.lang.String r2 = "S_TEXT/ASS"
            java.lang.String r3 = r1.codecId
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L3a
            java.lang.String r2 = "S_TEXT/WEBVTT"
            java.lang.String r3 = r1.codecId
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L56
        L3a:
            int r2 = r0.blockSampleCount
            java.lang.String r3 = "MatroskaExtractor"
            if (r2 <= r9) goto L46
            java.lang.String r2 = "Skipping subtitle sample in laced block."
            androidx.media3.common.util.Log.w(r3, r2)
            goto L56
        L46:
            long r4 = r0.blockDurationUs
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L59
            java.lang.String r2 = "Skipping subtitle sample with no duration."
            androidx.media3.common.util.Log.w(r3, r2)
        L56:
            r2 = r22
            goto L98
        L59:
            java.lang.String r2 = r1.codecId
            androidx.media3.common.util.ParsableByteArray r3 = r0.subtitleSample
            byte[] r3 = r3.getData()
            setSubtitleEndTime(r2, r4, r3)
            androidx.media3.common.util.ParsableByteArray r2 = r0.subtitleSample
            int r2 = r2.getPosition()
        L6a:
            androidx.media3.common.util.ParsableByteArray r3 = r0.subtitleSample
            int r3 = r3.limit()
            if (r2 >= r3) goto L85
            androidx.media3.common.util.ParsableByteArray r3 = r0.subtitleSample
            byte[] r3 = r3.getData()
            r3 = r3[r2]
            if (r3 != 0) goto L82
            androidx.media3.common.util.ParsableByteArray r3 = r0.subtitleSample
            r3.setLimit(r2)
            goto L85
        L82:
            int r2 = r2 + 1
            goto L6a
        L85:
            androidx.media3.extractor.TrackOutput r2 = r1.output
            androidx.media3.common.util.ParsableByteArray r3 = r0.subtitleSample
            int r4 = r3.limit()
            r2.sampleData(r3, r4)
            androidx.media3.common.util.ParsableByteArray r2 = r0.subtitleSample
            int r2 = r2.limit()
            int r2 = r22 + r2
        L98:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = r21 & r3
            if (r3 == 0) goto Lb8
            int r3 = r0.blockSampleCount
            if (r3 <= r9) goto La9
            androidx.media3.common.util.ParsableByteArray r3 = r0.supplementalData
            r4 = 0
            r3.reset(r4)
            goto Lb8
        La9:
            androidx.media3.common.util.ParsableByteArray r3 = r0.supplementalData
            int r3 = r3.limit()
            androidx.media3.extractor.TrackOutput r4 = r1.output
            androidx.media3.common.util.ParsableByteArray r5 = r0.supplementalData
            r6 = 2
            r4.sampleData(r5, r3, r6)
            int r2 = r2 + r3
        Lb8:
            r14 = r2
            androidx.media3.extractor.TrackOutput r10 = r1.output
            androidx.media3.extractor.TrackOutput$CryptoData r1 = r1.cryptoData
            r11 = r19
            r13 = r21
            r15 = r23
            r16 = r1
            r10.sampleMetadata(r11, r13, r14, r15, r16)
        Lc8:
            r0.haveOutputSample = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mkv.MatroskaExtractor.commitSampleToOutput(androidx.media3.extractor.mkv.MatroskaExtractor$Track, long, int, int, int):void");
    }

    private static int[] ensureArrayCapacity(@Nullable int[] iArr, int i11) {
        return iArr == null ? new int[i11] : iArr.length >= i11 ? iArr : new int[Math.max(iArr.length * 2, i11)];
    }

    private int finishWriteSampleData() {
        int i11 = this.sampleBytesWritten;
        resetWriteSampleData();
        return i11;
    }

    private static byte[] formatSubtitleTimecode(long j11, String str, long j12) {
        Assertions.checkArgument(j11 != C.TIME_UNSET);
        int i11 = (int) (j11 / 3600000000L);
        long j13 = j11 - (i11 * 3600000000L);
        int i12 = (int) (j13 / 60000000);
        long j14 = j13 - (i12 * 60000000);
        int i13 = (int) (j14 / 1000000);
        return Util.getUtf8Bytes(String.format(Locale.US, str, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf((int) ((j14 - (i13 * 1000000)) / j12))));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static boolean isCodecSupported(String str) {
        str.getClass();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals(CODEC_ID_MPEG4_AP)) {
                    c11 = 0;
                    break;
                }
                break;
            case -2095575984:
                if (str.equals(CODEC_ID_MPEG4_SP)) {
                    c11 = 1;
                    break;
                }
                break;
            case -1985379776:
                if (str.equals(CODEC_ID_ACM)) {
                    c11 = 2;
                    break;
                }
                break;
            case -1784763192:
                if (str.equals(CODEC_ID_TRUEHD)) {
                    c11 = 3;
                    break;
                }
                break;
            case -1730367663:
                if (str.equals(CODEC_ID_VORBIS)) {
                    c11 = 4;
                    break;
                }
                break;
            case -1482641358:
                if (str.equals(CODEC_ID_MP2)) {
                    c11 = 5;
                    break;
                }
                break;
            case -1482641357:
                if (str.equals(CODEC_ID_MP3)) {
                    c11 = 6;
                    break;
                }
                break;
            case -1373388978:
                if (str.equals(CODEC_ID_FOURCC)) {
                    c11 = 7;
                    break;
                }
                break;
            case -933872740:
                if (str.equals(CODEC_ID_DVBSUB)) {
                    c11 = '\b';
                    break;
                }
                break;
            case -538363189:
                if (str.equals(CODEC_ID_MPEG4_ASP)) {
                    c11 = '\t';
                    break;
                }
                break;
            case -538363109:
                if (str.equals(CODEC_ID_H264)) {
                    c11 = '\n';
                    break;
                }
                break;
            case -425012669:
                if (str.equals(CODEC_ID_VOBSUB)) {
                    c11 = 11;
                    break;
                }
                break;
            case -356037306:
                if (str.equals(CODEC_ID_DTS_LOSSLESS)) {
                    c11 = '\f';
                    break;
                }
                break;
            case 62923557:
                if (str.equals(CODEC_ID_AAC)) {
                    c11 = '\r';
                    break;
                }
                break;
            case 62923603:
                if (str.equals(CODEC_ID_AC3)) {
                    c11 = 14;
                    break;
                }
                break;
            case 62927045:
                if (str.equals(CODEC_ID_DTS)) {
                    c11 = 15;
                    break;
                }
                break;
            case 82318131:
                if (str.equals(CODEC_ID_AV1)) {
                    c11 = 16;
                    break;
                }
                break;
            case 82338133:
                if (str.equals(CODEC_ID_VP8)) {
                    c11 = 17;
                    break;
                }
                break;
            case 82338134:
                if (str.equals(CODEC_ID_VP9)) {
                    c11 = 18;
                    break;
                }
                break;
            case 99146302:
                if (str.equals(CODEC_ID_PGS)) {
                    c11 = 19;
                    break;
                }
                break;
            case 444813526:
                if (str.equals(CODEC_ID_THEORA)) {
                    c11 = 20;
                    break;
                }
                break;
            case 542569478:
                if (str.equals(CODEC_ID_DTS_EXPRESS)) {
                    c11 = 21;
                    break;
                }
                break;
            case 635596514:
                if (str.equals(CODEC_ID_PCM_FLOAT)) {
                    c11 = 22;
                    break;
                }
                break;
            case 725948237:
                if (str.equals(CODEC_ID_PCM_INT_BIG)) {
                    c11 = 23;
                    break;
                }
                break;
            case 725957860:
                if (str.equals(CODEC_ID_PCM_INT_LIT)) {
                    c11 = 24;
                    break;
                }
                break;
            case 738597099:
                if (str.equals(CODEC_ID_ASS)) {
                    c11 = 25;
                    break;
                }
                break;
            case 855502857:
                if (str.equals(CODEC_ID_H265)) {
                    c11 = 26;
                    break;
                }
                break;
            case 1045209816:
                if (str.equals(CODEC_ID_VTT)) {
                    c11 = Ansi.f77778c;
                    break;
                }
                break;
            case 1422270023:
                if (str.equals(CODEC_ID_SUBRIP)) {
                    c11 = sp.b.f88892n;
                    break;
                }
                break;
            case 1809237540:
                if (str.equals(CODEC_ID_MPEG2)) {
                    c11 = sp.b.f88893o;
                    break;
                }
                break;
            case 1950749482:
                if (str.equals(CODEC_ID_E_AC3)) {
                    c11 = sp.b.f88894p;
                    break;
                }
                break;
            case 1950789798:
                if (str.equals(CODEC_ID_FLAC)) {
                    c11 = c.f90845b;
                    break;
                }
                break;
            case 1951062397:
                if (str.equals(CODEC_ID_OPUS)) {
                    c11 = ' ';
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case ' ':
                return true;
            default:
                return false;
        }
    }

    private boolean maybeSeekForCues(PositionHolder positionHolder, long j11) {
        if (this.seekForCues) {
            this.seekPositionAfterBuildingCues = j11;
            positionHolder.position = this.cuesContentPosition;
            this.seekForCues = false;
            return true;
        }
        if (this.sentSeekMap) {
            long j12 = this.seekPositionAfterBuildingCues;
            if (j12 != -1) {
                positionHolder.position = j12;
                this.seekPositionAfterBuildingCues = -1L;
                return true;
            }
        }
        return false;
    }

    public static ExtractorsFactory newFactory(final SubtitleParser.Factory factory) {
        return new ExtractorsFactory() { // from class: androidx.media3.extractor.mkv.a
            @Override // androidx.media3.extractor.ExtractorsFactory
            public final Extractor[] createExtractors() {
                return MatroskaExtractor.a(SubtitleParser.Factory.this);
            }
        };
    }

    private void readScratch(ExtractorInput extractorInput, int i11) throws IOException {
        if (this.scratch.limit() >= i11) {
            return;
        }
        if (this.scratch.capacity() < i11) {
            ParsableByteArray parsableByteArray = this.scratch;
            parsableByteArray.ensureCapacity(Math.max(parsableByteArray.capacity() * 2, i11));
        }
        extractorInput.readFully(this.scratch.getData(), this.scratch.limit(), i11 - this.scratch.limit());
        this.scratch.setLimit(i11);
    }

    private void resetWriteSampleData() {
        this.sampleBytesRead = 0;
        this.sampleBytesWritten = 0;
        this.sampleCurrentNalBytesRemaining = 0;
        this.sampleEncodingHandled = false;
        this.sampleSignalByteRead = false;
        this.samplePartitionCountRead = false;
        this.samplePartitionCount = 0;
        this.sampleSignalByte = (byte) 0;
        this.sampleInitializationVectorRead = false;
        this.sampleStrippedBytes.reset(0);
    }

    private long scaleTimecodeToUs(long j11) throws ParserException {
        long j12 = this.timecodeScale;
        if (j12 != C.TIME_UNSET) {
            return Util.scaleLargeTimestamp(j11, j12, 1000L);
        }
        throw ParserException.createForMalformedContainer("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private static void setSubtitleEndTime(String str, long j11, byte[] bArr) {
        byte[] formatSubtitleTimecode;
        int i11;
        str.getClass();
        switch (str) {
            case "S_TEXT/ASS":
                formatSubtitleTimecode = formatSubtitleTimecode(j11, SSA_TIMECODE_FORMAT, 10000L);
                i11 = 21;
                break;
            case "S_TEXT/WEBVTT":
                formatSubtitleTimecode = formatSubtitleTimecode(j11, VTT_TIMECODE_FORMAT, 1000L);
                i11 = 25;
                break;
            case "S_TEXT/UTF8":
                formatSubtitleTimecode = formatSubtitleTimecode(j11, SUBRIP_TIMECODE_FORMAT, 1000L);
                i11 = 19;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(formatSubtitleTimecode, 0, bArr, i11, formatSubtitleTimecode.length);
    }

    @RequiresNonNull({"#2.output"})
    private int writeSampleData(ExtractorInput extractorInput, Track track, int i11, boolean z11) throws IOException {
        int i12;
        if (CODEC_ID_SUBRIP.equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, SUBRIP_PREFIX, i11);
            return finishWriteSampleData();
        }
        if (CODEC_ID_ASS.equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, SSA_PREFIX, i11);
            return finishWriteSampleData();
        }
        if (CODEC_ID_VTT.equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, VTT_PREFIX, i11);
            return finishWriteSampleData();
        }
        TrackOutput trackOutput = track.output;
        if (!this.sampleEncodingHandled) {
            if (track.hasContentEncryption) {
                this.blockFlags &= -1073741825;
                if (!this.sampleSignalByteRead) {
                    extractorInput.readFully(this.scratch.getData(), 0, 1);
                    this.sampleBytesRead++;
                    if ((this.scratch.getData()[0] & 128) == 128) {
                        throw ParserException.createForMalformedContainer("Extension bit is set in signal byte", null);
                    }
                    this.sampleSignalByte = this.scratch.getData()[0];
                    this.sampleSignalByteRead = true;
                }
                byte b11 = this.sampleSignalByte;
                if ((b11 & 1) == 1) {
                    boolean z12 = (b11 & 2) == 2;
                    this.blockFlags |= 1073741824;
                    if (!this.sampleInitializationVectorRead) {
                        extractorInput.readFully(this.encryptionInitializationVector.getData(), 0, 8);
                        this.sampleBytesRead += 8;
                        this.sampleInitializationVectorRead = true;
                        this.scratch.getData()[0] = (byte) ((z12 ? 128 : 0) | 8);
                        this.scratch.setPosition(0);
                        trackOutput.sampleData(this.scratch, 1, 1);
                        this.sampleBytesWritten++;
                        this.encryptionInitializationVector.setPosition(0);
                        trackOutput.sampleData(this.encryptionInitializationVector, 8, 1);
                        this.sampleBytesWritten += 8;
                    }
                    if (z12) {
                        if (!this.samplePartitionCountRead) {
                            extractorInput.readFully(this.scratch.getData(), 0, 1);
                            this.sampleBytesRead++;
                            this.scratch.setPosition(0);
                            this.samplePartitionCount = this.scratch.readUnsignedByte();
                            this.samplePartitionCountRead = true;
                        }
                        int i13 = this.samplePartitionCount * 4;
                        this.scratch.reset(i13);
                        extractorInput.readFully(this.scratch.getData(), 0, i13);
                        this.sampleBytesRead += i13;
                        short s11 = (short) ((this.samplePartitionCount / 2) + 1);
                        int i14 = (s11 * 6) + 2;
                        ByteBuffer byteBuffer = this.encryptionSubsampleDataBuffer;
                        if (byteBuffer == null || byteBuffer.capacity() < i14) {
                            this.encryptionSubsampleDataBuffer = ByteBuffer.allocate(i14);
                        }
                        this.encryptionSubsampleDataBuffer.position(0);
                        this.encryptionSubsampleDataBuffer.putShort(s11);
                        int i15 = 0;
                        int i16 = 0;
                        while (true) {
                            i12 = this.samplePartitionCount;
                            if (i15 >= i12) {
                                break;
                            }
                            int readUnsignedIntToInt = this.scratch.readUnsignedIntToInt();
                            if (i15 % 2 == 0) {
                                this.encryptionSubsampleDataBuffer.putShort((short) (readUnsignedIntToInt - i16));
                            } else {
                                this.encryptionSubsampleDataBuffer.putInt(readUnsignedIntToInt - i16);
                            }
                            i15++;
                            i16 = readUnsignedIntToInt;
                        }
                        int i17 = (i11 - this.sampleBytesRead) - i16;
                        if (i12 % 2 == 1) {
                            this.encryptionSubsampleDataBuffer.putInt(i17);
                        } else {
                            this.encryptionSubsampleDataBuffer.putShort((short) i17);
                            this.encryptionSubsampleDataBuffer.putInt(0);
                        }
                        this.encryptionSubsampleData.reset(this.encryptionSubsampleDataBuffer.array(), i14);
                        trackOutput.sampleData(this.encryptionSubsampleData, i14, 1);
                        this.sampleBytesWritten += i14;
                    }
                }
            } else {
                byte[] bArr = track.sampleStrippedBytes;
                if (bArr != null) {
                    this.sampleStrippedBytes.reset(bArr, bArr.length);
                }
            }
            if (track.samplesHaveSupplementalData(z11)) {
                this.blockFlags |= 268435456;
                this.supplementalData.reset(0);
                int limit = (this.sampleStrippedBytes.limit() + i11) - this.sampleBytesRead;
                this.scratch.reset(4);
                this.scratch.getData()[0] = (byte) ((limit >> 24) & 255);
                this.scratch.getData()[1] = (byte) ((limit >> 16) & 255);
                this.scratch.getData()[2] = (byte) ((limit >> 8) & 255);
                this.scratch.getData()[3] = (byte) (limit & 255);
                trackOutput.sampleData(this.scratch, 4, 2);
                this.sampleBytesWritten += 4;
            }
            this.sampleEncodingHandled = true;
        }
        int limit2 = i11 + this.sampleStrippedBytes.limit();
        if (!CODEC_ID_H264.equals(track.codecId) && !CODEC_ID_H265.equals(track.codecId)) {
            if (track.trueHdSampleRechunker != null) {
                Assertions.checkState(this.sampleStrippedBytes.limit() == 0);
                track.trueHdSampleRechunker.startSample(extractorInput);
            }
            while (true) {
                int i18 = this.sampleBytesRead;
                if (i18 >= limit2) {
                    break;
                }
                int writeToOutput = writeToOutput(extractorInput, trackOutput, limit2 - i18);
                this.sampleBytesRead += writeToOutput;
                this.sampleBytesWritten += writeToOutput;
            }
        } else {
            byte[] data = this.nalLength.getData();
            data[0] = 0;
            data[1] = 0;
            data[2] = 0;
            int i19 = track.nalUnitLengthFieldLength;
            int i21 = 4 - i19;
            while (this.sampleBytesRead < limit2) {
                int i22 = this.sampleCurrentNalBytesRemaining;
                if (i22 == 0) {
                    writeToTarget(extractorInput, data, i21, i19);
                    this.sampleBytesRead += i19;
                    this.nalLength.setPosition(0);
                    this.sampleCurrentNalBytesRemaining = this.nalLength.readUnsignedIntToInt();
                    this.nalStartCode.setPosition(0);
                    trackOutput.sampleData(this.nalStartCode, 4);
                    this.sampleBytesWritten += 4;
                } else {
                    int writeToOutput2 = writeToOutput(extractorInput, trackOutput, i22);
                    this.sampleBytesRead += writeToOutput2;
                    this.sampleBytesWritten += writeToOutput2;
                    this.sampleCurrentNalBytesRemaining -= writeToOutput2;
                }
            }
        }
        if (CODEC_ID_VORBIS.equals(track.codecId)) {
            this.vorbisNumPageSamples.setPosition(0);
            trackOutput.sampleData(this.vorbisNumPageSamples, 4);
            this.sampleBytesWritten += 4;
        }
        return finishWriteSampleData();
    }

    private void writeSubtitleSampleData(ExtractorInput extractorInput, byte[] bArr, int i11) throws IOException {
        int length = bArr.length + i11;
        if (this.subtitleSample.capacity() < length) {
            this.subtitleSample.reset(Arrays.copyOf(bArr, length + i11));
        } else {
            System.arraycopy(bArr, 0, this.subtitleSample.getData(), 0, bArr.length);
        }
        extractorInput.readFully(this.subtitleSample.getData(), bArr.length, i11);
        this.subtitleSample.setPosition(0);
        this.subtitleSample.setLimit(length);
    }

    private int writeToOutput(ExtractorInput extractorInput, TrackOutput trackOutput, int i11) throws IOException {
        int bytesLeft = this.sampleStrippedBytes.bytesLeft();
        if (bytesLeft <= 0) {
            return trackOutput.sampleData((DataReader) extractorInput, i11, false);
        }
        int min = Math.min(i11, bytesLeft);
        trackOutput.sampleData(this.sampleStrippedBytes, min);
        return min;
    }

    private void writeToTarget(ExtractorInput extractorInput, byte[] bArr, int i11, int i12) throws IOException {
        int min = Math.min(i12, this.sampleStrippedBytes.bytesLeft());
        extractorInput.readFully(bArr, i11 + min, i12 - min);
        if (min > 0) {
            this.sampleStrippedBytes.readBytes(bArr, i11, min);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0244, code lost:
    
        throw androidx.media3.common.ParserException.createForMalformedContainer("EBML lacing sample size out of range.", null);
     */
    /* JADX WARN: Multi-variable type inference failed */
    @androidx.annotation.CallSuper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void binaryElement(int r24, int r25, androidx.media3.extractor.ExtractorInput r26) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mkv.MatroskaExtractor.binaryElement(int, int, androidx.media3.extractor.ExtractorInput):void");
    }

    @CallSuper
    public void endMasterElement(int i11) throws ParserException {
        assertInitialized();
        if (i11 == 160) {
            if (this.blockState != 2) {
                return;
            }
            Track track = this.tracks.get(this.blockTrackNumber);
            track.assertOutputInitialized();
            if (this.blockGroupDiscardPaddingNs > 0 && CODEC_ID_OPUS.equals(track.codecId)) {
                this.supplementalData.reset(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.blockGroupDiscardPaddingNs).array());
            }
            int i12 = 0;
            for (int i13 = 0; i13 < this.blockSampleCount; i13++) {
                i12 += this.blockSampleSizes[i13];
            }
            int i14 = 0;
            while (i14 < this.blockSampleCount) {
                long j11 = this.blockTimeUs + ((track.defaultSampleDurationNs * i14) / 1000);
                int i15 = this.blockFlags;
                if (i14 == 0 && !this.blockHasReferenceBlock) {
                    i15 |= 1;
                }
                int i16 = this.blockSampleSizes[i14];
                int i17 = i12 - i16;
                commitSampleToOutput(track, j11, i15, i16, i17);
                i14++;
                i12 = i17;
            }
            this.blockState = 0;
            return;
        }
        if (i11 == 174) {
            Track track2 = (Track) Assertions.checkStateNotNull(this.currentTrack);
            String str = track2.codecId;
            if (str == null) {
                throw ParserException.createForMalformedContainer("CodecId is missing in TrackEntry element", null);
            }
            if (isCodecSupported(str)) {
                track2.initializeOutput(this.extractorOutput, track2.number);
                this.tracks.put(track2.number, track2);
            }
            this.currentTrack = null;
            return;
        }
        if (i11 == ID_SEEK) {
            int i18 = this.seekEntryId;
            if (i18 != -1) {
                long j12 = this.seekEntryPosition;
                if (j12 != -1) {
                    if (i18 == ID_CUES) {
                        this.cuesContentPosition = j12;
                        return;
                    }
                    return;
                }
            }
            throw ParserException.createForMalformedContainer("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i11 == ID_CONTENT_ENCODING) {
            assertInTrackEntry(i11);
            Track track3 = this.currentTrack;
            if (track3.hasContentEncryption) {
                if (track3.cryptoData == null) {
                    throw ParserException.createForMalformedContainer("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                track3.drmInitData = new DrmInitData(new DrmInitData.SchemeData(C.UUID_NIL, "video/webm", this.currentTrack.cryptoData.encryptionKey));
                return;
            }
            return;
        }
        if (i11 == ID_CONTENT_ENCODINGS) {
            assertInTrackEntry(i11);
            Track track4 = this.currentTrack;
            if (track4.hasContentEncryption && track4.sampleStrippedBytes != null) {
                throw ParserException.createForMalformedContainer("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i11 == 357149030) {
            if (this.timecodeScale == C.TIME_UNSET) {
                this.timecodeScale = 1000000L;
            }
            long j13 = this.durationTimecode;
            if (j13 != C.TIME_UNSET) {
                this.durationUs = scaleTimecodeToUs(j13);
                return;
            }
            return;
        }
        if (i11 == ID_TRACKS) {
            if (this.tracks.size() == 0) {
                throw ParserException.createForMalformedContainer("No valid tracks were found", null);
            }
            this.extractorOutput.endTracks();
        } else {
            if (i11 != ID_CUES) {
                return;
            }
            if (!this.sentSeekMap) {
                this.extractorOutput.seekMap(buildSeekMap(this.cueTimesUs, this.cueClusterPositions));
                this.sentSeekMap = true;
            }
            this.cueTimesUs = null;
            this.cueClusterPositions = null;
        }
    }

    @CallSuper
    public void floatElement(int i11, double d11) throws ParserException {
        if (i11 == 181) {
            getCurrentTrack(i11).sampleRate = (int) d11;
            return;
        }
        if (i11 == ID_DURATION) {
            this.durationTimecode = (long) d11;
            return;
        }
        switch (i11) {
            case ID_PRIMARY_R_CHROMATICITY_X /* 21969 */:
                getCurrentTrack(i11).primaryRChromaticityX = (float) d11;
                break;
            case ID_PRIMARY_R_CHROMATICITY_Y /* 21970 */:
                getCurrentTrack(i11).primaryRChromaticityY = (float) d11;
                break;
            case ID_PRIMARY_G_CHROMATICITY_X /* 21971 */:
                getCurrentTrack(i11).primaryGChromaticityX = (float) d11;
                break;
            case ID_PRIMARY_G_CHROMATICITY_Y /* 21972 */:
                getCurrentTrack(i11).primaryGChromaticityY = (float) d11;
                break;
            case ID_PRIMARY_B_CHROMATICITY_X /* 21973 */:
                getCurrentTrack(i11).primaryBChromaticityX = (float) d11;
                break;
            case ID_PRIMARY_B_CHROMATICITY_Y /* 21974 */:
                getCurrentTrack(i11).primaryBChromaticityY = (float) d11;
                break;
            case ID_WHITE_POINT_CHROMATICITY_X /* 21975 */:
                getCurrentTrack(i11).whitePointChromaticityX = (float) d11;
                break;
            case ID_WHITE_POINT_CHROMATICITY_Y /* 21976 */:
                getCurrentTrack(i11).whitePointChromaticityY = (float) d11;
                break;
            case ID_LUMNINANCE_MAX /* 21977 */:
                getCurrentTrack(i11).maxMasteringLuminance = (float) d11;
                break;
            case ID_LUMNINANCE_MIN /* 21978 */:
                getCurrentTrack(i11).minMasteringLuminance = (float) d11;
                break;
            default:
                switch (i11) {
                    case ID_PROJECTION_POSE_YAW /* 30323 */:
                        getCurrentTrack(i11).projectionPoseYaw = (float) d11;
                        break;
                    case ID_PROJECTION_POSE_PITCH /* 30324 */:
                        getCurrentTrack(i11).projectionPosePitch = (float) d11;
                        break;
                    case ID_PROJECTION_POSE_ROLL /* 30325 */:
                        getCurrentTrack(i11).projectionPoseRoll = (float) d11;
                        break;
                }
        }
    }

    public Track getCurrentTrack(int i11) throws ParserException {
        assertInTrackEntry(i11);
        return this.currentTrack;
    }

    @CallSuper
    public int getElementType(int i11) {
        switch (i11) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case ID_BLOCK_ADD_ID_TYPE /* 16871 */:
            case ID_CONTENT_COMPRESSION_ALGORITHM /* 16980 */:
            case ID_DOC_TYPE_READ_VERSION /* 17029 */:
            case ID_EBML_READ_VERSION /* 17143 */:
            case ID_CONTENT_ENCRYPTION_ALGORITHM /* 18401 */:
            case ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE /* 18408 */:
            case ID_CONTENT_ENCODING_ORDER /* 20529 */:
            case ID_CONTENT_ENCODING_SCOPE /* 20530 */:
            case ID_SEEK_POSITION /* 21420 */:
            case ID_STEREO_MODE /* 21432 */:
            case ID_DISPLAY_WIDTH /* 21680 */:
            case ID_DISPLAY_UNIT /* 21682 */:
            case ID_DISPLAY_HEIGHT /* 21690 */:
            case ID_FLAG_FORCED /* 21930 */:
            case ID_COLOUR_BITS_PER_CHANNEL /* 21938 */:
            case ID_COLOUR_RANGE /* 21945 */:
            case ID_COLOUR_TRANSFER /* 21946 */:
            case ID_COLOUR_PRIMARIES /* 21947 */:
            case ID_MAX_CLL /* 21948 */:
            case ID_MAX_FALL /* 21949 */:
            case ID_MAX_BLOCK_ADDITION_ID /* 21998 */:
            case ID_CODEC_DELAY /* 22186 */:
            case ID_SEEK_PRE_ROLL /* 22203 */:
            case ID_AUDIO_BIT_DEPTH /* 25188 */:
            case ID_DISCARD_PADDING /* 30114 */:
            case ID_PROJECTION_TYPE /* 30321 */:
            case ID_DEFAULT_DURATION /* 2352003 */:
            case ID_TIMECODE_SCALE /* 2807729 */:
                return 2;
            case 134:
            case ID_DOC_TYPE /* 17026 */:
            case ID_NAME /* 21358 */:
            case ID_LANGUAGE /* 2274716 */:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case ID_BLOCK_ADDITION_MAPPING /* 16868 */:
            case ID_CONTENT_ENCRYPTION_AES_SETTINGS /* 18407 */:
            case ID_SEEK /* 19899 */:
            case ID_CONTENT_COMPRESSION /* 20532 */:
            case ID_CONTENT_ENCRYPTION /* 20533 */:
            case ID_COLOUR /* 21936 */:
            case ID_MASTERING_METADATA /* 21968 */:
            case ID_CONTENT_ENCODING /* 25152 */:
            case ID_CONTENT_ENCODINGS /* 28032 */:
            case ID_BLOCK_ADDITIONS /* 30113 */:
            case ID_PROJECTION /* 30320 */:
            case ID_SEEK_HEAD /* 290298740 */:
            case 357149030:
            case ID_TRACKS /* 374648427 */:
            case ID_SEGMENT /* 408125543 */:
            case ID_EBML /* 440786851 */:
            case ID_CUES /* 475249515 */:
            case ID_CLUSTER /* 524531317 */:
                return 1;
            case 161:
            case 163:
            case 165:
            case ID_BLOCK_ADD_ID_EXTRA_DATA /* 16877 */:
            case ID_CONTENT_COMPRESSION_SETTINGS /* 16981 */:
            case ID_CONTENT_ENCRYPTION_KEY_ID /* 18402 */:
            case ID_SEEK_ID /* 21419 */:
            case ID_CODEC_PRIVATE /* 25506 */:
            case ID_PROJECTION_PRIVATE /* 30322 */:
                return 4;
            case 181:
            case ID_DURATION /* 17545 */:
            case ID_PRIMARY_R_CHROMATICITY_X /* 21969 */:
            case ID_PRIMARY_R_CHROMATICITY_Y /* 21970 */:
            case ID_PRIMARY_G_CHROMATICITY_X /* 21971 */:
            case ID_PRIMARY_G_CHROMATICITY_Y /* 21972 */:
            case ID_PRIMARY_B_CHROMATICITY_X /* 21973 */:
            case ID_PRIMARY_B_CHROMATICITY_Y /* 21974 */:
            case ID_WHITE_POINT_CHROMATICITY_X /* 21975 */:
            case ID_WHITE_POINT_CHROMATICITY_Y /* 21976 */:
            case ID_LUMNINANCE_MAX /* 21977 */:
            case ID_LUMNINANCE_MIN /* 21978 */:
            case ID_PROJECTION_POSE_YAW /* 30323 */:
            case ID_PROJECTION_POSE_PITCH /* 30324 */:
            case ID_PROJECTION_POSE_ROLL /* 30325 */:
                return 5;
            default:
                return 0;
        }
    }

    public void handleBlockAddIDExtraData(Track track, ExtractorInput extractorInput, int i11) throws IOException {
        if (track.blockAddIdType != 1685485123 && track.blockAddIdType != 1685480259) {
            extractorInput.skipFully(i11);
            return;
        }
        byte[] bArr = new byte[i11];
        track.dolbyVisionConfigBytes = bArr;
        extractorInput.readFully(bArr, 0, i11);
    }

    public void handleBlockAdditionalData(Track track, int i11, ExtractorInput extractorInput, int i12) throws IOException {
        if (i11 != 4 || !CODEC_ID_VP9.equals(track.codecId)) {
            extractorInput.skipFully(i12);
        } else {
            this.supplementalData.reset(i12);
            extractorInput.readFully(this.supplementalData.getData(), 0, i12);
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final void init(ExtractorOutput extractorOutput) {
        if (this.parseSubtitlesDuringExtraction) {
            extractorOutput = new SubtitleTranscodingExtractorOutput(extractorOutput, this.subtitleParserFactory);
        }
        this.extractorOutput = extractorOutput;
    }

    @CallSuper
    public void integerElement(int i11, long j11) throws ParserException {
        if (i11 == ID_CONTENT_ENCODING_ORDER) {
            if (j11 == 0) {
                return;
            }
            throw ParserException.createForMalformedContainer("ContentEncodingOrder " + j11 + " not supported", null);
        }
        if (i11 == ID_CONTENT_ENCODING_SCOPE) {
            if (j11 == 1) {
                return;
            }
            throw ParserException.createForMalformedContainer("ContentEncodingScope " + j11 + " not supported", null);
        }
        switch (i11) {
            case 131:
                getCurrentTrack(i11).type = (int) j11;
                return;
            case 136:
                getCurrentTrack(i11).flagDefault = j11 == 1;
                return;
            case 155:
                this.blockDurationUs = scaleTimecodeToUs(j11);
                return;
            case 159:
                getCurrentTrack(i11).channelCount = (int) j11;
                return;
            case 176:
                getCurrentTrack(i11).width = (int) j11;
                return;
            case 179:
                assertInCues(i11);
                this.cueTimesUs.add(scaleTimecodeToUs(j11));
                return;
            case 186:
                getCurrentTrack(i11).height = (int) j11;
                return;
            case 215:
                getCurrentTrack(i11).number = (int) j11;
                return;
            case 231:
                this.clusterTimecodeUs = scaleTimecodeToUs(j11);
                return;
            case 238:
                this.blockAdditionalId = (int) j11;
                return;
            case 241:
                if (this.seenClusterPositionForCurrentCuePoint) {
                    return;
                }
                assertInCues(i11);
                this.cueClusterPositions.add(j11);
                this.seenClusterPositionForCurrentCuePoint = true;
                return;
            case 251:
                this.blockHasReferenceBlock = true;
                return;
            case ID_BLOCK_ADD_ID_TYPE /* 16871 */:
                getCurrentTrack(i11).blockAddIdType = (int) j11;
                return;
            case ID_CONTENT_COMPRESSION_ALGORITHM /* 16980 */:
                if (j11 == 3) {
                    return;
                }
                throw ParserException.createForMalformedContainer("ContentCompAlgo " + j11 + " not supported", null);
            case ID_DOC_TYPE_READ_VERSION /* 17029 */:
                if (j11 < 1 || j11 > 2) {
                    throw ParserException.createForMalformedContainer("DocTypeReadVersion " + j11 + " not supported", null);
                }
                return;
            case ID_EBML_READ_VERSION /* 17143 */:
                if (j11 == 1) {
                    return;
                }
                throw ParserException.createForMalformedContainer("EBMLReadVersion " + j11 + " not supported", null);
            case ID_CONTENT_ENCRYPTION_ALGORITHM /* 18401 */:
                if (j11 == 5) {
                    return;
                }
                throw ParserException.createForMalformedContainer("ContentEncAlgo " + j11 + " not supported", null);
            case ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE /* 18408 */:
                if (j11 == 1) {
                    return;
                }
                throw ParserException.createForMalformedContainer("AESSettingsCipherMode " + j11 + " not supported", null);
            case ID_SEEK_POSITION /* 21420 */:
                this.seekEntryPosition = j11 + this.segmentContentPosition;
                return;
            case ID_STEREO_MODE /* 21432 */:
                int i12 = (int) j11;
                assertInTrackEntry(i11);
                if (i12 == 0) {
                    this.currentTrack.stereoMode = 0;
                    return;
                }
                if (i12 == 1) {
                    this.currentTrack.stereoMode = 2;
                    return;
                } else if (i12 == 3) {
                    this.currentTrack.stereoMode = 1;
                    return;
                } else {
                    if (i12 != 15) {
                        return;
                    }
                    this.currentTrack.stereoMode = 3;
                    return;
                }
            case ID_DISPLAY_WIDTH /* 21680 */:
                getCurrentTrack(i11).displayWidth = (int) j11;
                return;
            case ID_DISPLAY_UNIT /* 21682 */:
                getCurrentTrack(i11).displayUnit = (int) j11;
                return;
            case ID_DISPLAY_HEIGHT /* 21690 */:
                getCurrentTrack(i11).displayHeight = (int) j11;
                return;
            case ID_FLAG_FORCED /* 21930 */:
                getCurrentTrack(i11).flagForced = j11 == 1;
                return;
            case ID_COLOUR_BITS_PER_CHANNEL /* 21938 */:
                assertInTrackEntry(i11);
                Track track = this.currentTrack;
                track.hasColorInfo = true;
                track.bitsPerChannel = (int) j11;
                return;
            case ID_MAX_BLOCK_ADDITION_ID /* 21998 */:
                getCurrentTrack(i11).maxBlockAdditionId = (int) j11;
                return;
            case ID_CODEC_DELAY /* 22186 */:
                getCurrentTrack(i11).codecDelayNs = j11;
                return;
            case ID_SEEK_PRE_ROLL /* 22203 */:
                getCurrentTrack(i11).seekPreRollNs = j11;
                return;
            case ID_AUDIO_BIT_DEPTH /* 25188 */:
                getCurrentTrack(i11).audioBitDepth = (int) j11;
                return;
            case ID_DISCARD_PADDING /* 30114 */:
                this.blockGroupDiscardPaddingNs = j11;
                return;
            case ID_PROJECTION_TYPE /* 30321 */:
                assertInTrackEntry(i11);
                int i13 = (int) j11;
                if (i13 == 0) {
                    this.currentTrack.projectionType = 0;
                    return;
                }
                if (i13 == 1) {
                    this.currentTrack.projectionType = 1;
                    return;
                } else if (i13 == 2) {
                    this.currentTrack.projectionType = 2;
                    return;
                } else {
                    if (i13 != 3) {
                        return;
                    }
                    this.currentTrack.projectionType = 3;
                    return;
                }
            case ID_DEFAULT_DURATION /* 2352003 */:
                getCurrentTrack(i11).defaultSampleDurationNs = (int) j11;
                return;
            case ID_TIMECODE_SCALE /* 2807729 */:
                this.timecodeScale = j11;
                return;
            default:
                switch (i11) {
                    case ID_COLOUR_RANGE /* 21945 */:
                        assertInTrackEntry(i11);
                        int i14 = (int) j11;
                        if (i14 == 1) {
                            this.currentTrack.colorRange = 2;
                            return;
                        } else {
                            if (i14 != 2) {
                                return;
                            }
                            this.currentTrack.colorRange = 1;
                            return;
                        }
                    case ID_COLOUR_TRANSFER /* 21946 */:
                        assertInTrackEntry(i11);
                        int isoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer((int) j11);
                        if (isoTransferCharacteristicsToColorTransfer != -1) {
                            this.currentTrack.colorTransfer = isoTransferCharacteristicsToColorTransfer;
                            return;
                        }
                        return;
                    case ID_COLOUR_PRIMARIES /* 21947 */:
                        assertInTrackEntry(i11);
                        this.currentTrack.hasColorInfo = true;
                        int isoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace((int) j11);
                        if (isoColorPrimariesToColorSpace != -1) {
                            this.currentTrack.colorSpace = isoColorPrimariesToColorSpace;
                            return;
                        }
                        return;
                    case ID_MAX_CLL /* 21948 */:
                        getCurrentTrack(i11).maxContentLuminance = (int) j11;
                        return;
                    case ID_MAX_FALL /* 21949 */:
                        getCurrentTrack(i11).maxFrameAverageLuminance = (int) j11;
                        return;
                    default:
                        return;
                }
        }
    }

    @CallSuper
    public boolean isLevel1Element(int i11) {
        return i11 == 357149030 || i11 == ID_CLUSTER || i11 == ID_CUES || i11 == ID_TRACKS;
    }

    @Override // androidx.media3.extractor.Extractor
    public final int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        this.haveOutputSample = false;
        boolean z11 = true;
        while (z11 && !this.haveOutputSample) {
            z11 = this.reader.read(extractorInput);
            if (z11 && maybeSeekForCues(positionHolder, extractorInput.getPosition())) {
                return 1;
            }
        }
        if (z11) {
            return 0;
        }
        for (int i11 = 0; i11 < this.tracks.size(); i11++) {
            Track valueAt = this.tracks.valueAt(i11);
            valueAt.assertOutputInitialized();
            valueAt.outputPendingSampleMetadata();
        }
        return -1;
    }

    @Override // androidx.media3.extractor.Extractor
    @CallSuper
    public void seek(long j11, long j12) {
        this.clusterTimecodeUs = C.TIME_UNSET;
        this.blockState = 0;
        this.reader.reset();
        this.varintReader.reset();
        resetWriteSampleData();
        for (int i11 = 0; i11 < this.tracks.size(); i11++) {
            this.tracks.valueAt(i11).reset();
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean sniff(ExtractorInput extractorInput) throws IOException {
        return new Sniffer().sniff(extractorInput);
    }

    @CallSuper
    public void startMasterElement(int i11, long j11, long j12) throws ParserException {
        assertInitialized();
        if (i11 == 160) {
            this.blockHasReferenceBlock = false;
            this.blockGroupDiscardPaddingNs = 0L;
            return;
        }
        if (i11 == 174) {
            Track track = new Track();
            this.currentTrack = track;
            track.isWebm = this.isWebm;
            return;
        }
        if (i11 == 187) {
            this.seenClusterPositionForCurrentCuePoint = false;
            return;
        }
        if (i11 == ID_SEEK) {
            this.seekEntryId = -1;
            this.seekEntryPosition = -1L;
            return;
        }
        if (i11 == ID_CONTENT_ENCRYPTION) {
            getCurrentTrack(i11).hasContentEncryption = true;
            return;
        }
        if (i11 == ID_MASTERING_METADATA) {
            getCurrentTrack(i11).hasColorInfo = true;
            return;
        }
        if (i11 == ID_SEGMENT) {
            long j13 = this.segmentContentPosition;
            if (j13 != -1 && j13 != j11) {
                throw ParserException.createForMalformedContainer("Multiple Segment elements not supported", null);
            }
            this.segmentContentPosition = j11;
            this.segmentContentSize = j12;
            return;
        }
        if (i11 == ID_CUES) {
            this.cueTimesUs = new LongArray();
            this.cueClusterPositions = new LongArray();
        } else if (i11 == ID_CLUSTER && !this.sentSeekMap) {
            if (this.seekForCuesEnabled && this.cuesContentPosition != -1) {
                this.seekForCues = true;
            } else {
                this.extractorOutput.seekMap(new SeekMap.Unseekable(this.durationUs));
                this.sentSeekMap = true;
            }
        }
    }

    @CallSuper
    public void stringElement(int i11, String str) throws ParserException {
        if (i11 == 134) {
            getCurrentTrack(i11).codecId = str;
            return;
        }
        if (i11 != ID_DOC_TYPE) {
            if (i11 == ID_NAME) {
                getCurrentTrack(i11).name = str;
                return;
            } else {
                if (i11 != ID_LANGUAGE) {
                    return;
                }
                getCurrentTrack(i11).language = str;
                return;
            }
        }
        if (DOC_TYPE_WEBM.equals(str) || DOC_TYPE_MATROSKA.equals(str)) {
            this.isWebm = Objects.equals(str, DOC_TYPE_WEBM);
            return;
        }
        throw ParserException.createForMalformedContainer("DocType " + str + " not supported", null);
    }

    @Deprecated
    public MatroskaExtractor(int i11) {
        this(new DefaultEbmlReader(), i11 | 2, SubtitleParser.Factory.UNSUPPORTED);
    }

    public MatroskaExtractor(SubtitleParser.Factory factory) {
        this(new DefaultEbmlReader(), 0, factory);
    }

    public MatroskaExtractor(SubtitleParser.Factory factory, int i11) {
        this(new DefaultEbmlReader(), i11, factory);
    }

    public MatroskaExtractor(EbmlReader ebmlReader, int i11, SubtitleParser.Factory factory) {
        this.segmentContentPosition = -1L;
        this.timecodeScale = C.TIME_UNSET;
        this.durationTimecode = C.TIME_UNSET;
        this.durationUs = C.TIME_UNSET;
        this.cuesContentPosition = -1L;
        this.seekPositionAfterBuildingCues = -1L;
        this.clusterTimecodeUs = C.TIME_UNSET;
        this.reader = ebmlReader;
        ebmlReader.init(new InnerEbmlProcessor());
        this.subtitleParserFactory = factory;
        this.seekForCuesEnabled = (i11 & 1) == 0;
        this.parseSubtitlesDuringExtraction = (i11 & 2) == 0;
        this.varintReader = new VarintReader();
        this.tracks = new SparseArray<>();
        this.scratch = new ParsableByteArray(4);
        this.vorbisNumPageSamples = new ParsableByteArray(ByteBuffer.allocate(4).putInt(-1).array());
        this.seekEntryIdBytes = new ParsableByteArray(4);
        this.nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.nalLength = new ParsableByteArray(4);
        this.sampleStrippedBytes = new ParsableByteArray();
        this.subtitleSample = new ParsableByteArray();
        this.encryptionInitializationVector = new ParsableByteArray(8);
        this.encryptionSubsampleData = new ParsableByteArray();
        this.supplementalData = new ParsableByteArray();
        this.blockSampleSizes = new int[1];
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }
}
