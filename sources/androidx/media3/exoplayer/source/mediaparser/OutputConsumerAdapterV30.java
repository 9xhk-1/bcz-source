package androidx.media3.exoplayer.source.mediaparser;

import android.media.DrmInitData;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaParser;
import android.media.MediaParser$InputReader;
import android.media.MediaParser$OutputConsumer;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.collection.SieveCacheKt;
import androidx.media3.common.C;
import androidx.media3.common.DataReader;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.MediaFormatUtil;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.NoOpExtractorOutput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.common.collect.ImmutableList;
import com.tencent.ijk.media.player.IjkMediaMeta;
import com.tencent.ijk.media.player.misc.IMediaFormat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(30)
@UnstableApi
/* loaded from: classes2.dex */
public final class OutputConsumerAdapterV30 implements MediaParser$OutputConsumer {
    private static final String MEDIA_FORMAT_KEY_CHUNK_INDEX_DURATIONS = "chunk-index-long-us-durations";
    private static final String MEDIA_FORMAT_KEY_CHUNK_INDEX_OFFSETS = "chunk-index-long-offsets";
    private static final String MEDIA_FORMAT_KEY_CHUNK_INDEX_SIZES = "chunk-index-int-sizes";
    private static final String MEDIA_FORMAT_KEY_CHUNK_INDEX_TIMES = "chunk-index-long-us-times";
    private static final String MEDIA_FORMAT_KEY_TRACK_TYPE = "track-type-string";
    private static final Pattern REGEX_CRYPTO_INFO_PATTERN;
    private static final Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> SEEK_POINT_PAIR_START;
    private static final String TAG = "OConsumerAdapterV30";

    @Nullable
    private String containerMimeType;

    @Nullable
    private MediaParser.SeekMap dummySeekMap;
    private final boolean expectDummySeekMap;
    private ExtractorOutput extractorOutput;

    @Nullable
    private ChunkIndex lastChunkIndex;
    private final ArrayList<TrackOutput.CryptoData> lastOutputCryptoDatas;
    private final ArrayList<MediaCodec.CryptoInfo> lastReceivedCryptoInfos;

    @Nullable
    private MediaParser.SeekMap lastSeekMap;
    private List<Format> muxedCaptionFormats;
    private int primaryTrackIndex;

    @Nullable
    private final Format primaryTrackManifestFormat;
    private final int primaryTrackType;
    private long sampleTimestampUpperLimitFilterUs;
    private final DataReaderAdapter scratchDataReaderAdapter;
    private boolean seekingDisabled;

    @Nullable
    private TimestampAdjuster timestampAdjuster;
    private final ArrayList<Format> trackFormats;
    private final ArrayList<TrackOutput> trackOutputs;
    private boolean tracksEnded;
    private boolean tracksFoundCalled;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DataReaderAdapter implements DataReader {

        @Nullable
        public MediaParser$InputReader input;

        private DataReaderAdapter() {
        }

        @Override // androidx.media3.common.DataReader
        public int read(byte[] bArr, int i11, int i12) throws IOException {
            int read;
            read = m.a(Util.castNonNull(this.input)).read(bArr, i11, i12);
            return read;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class SeekMapAdapter implements SeekMap {
        private final MediaParser.SeekMap adaptedSeekMap;

        public SeekMapAdapter(MediaParser.SeekMap seekMap) {
            this.adaptedSeekMap = seekMap;
        }

        private static SeekPoint asExoPlayerSeekPoint(MediaParser.SeekPoint seekPoint) {
            long j11;
            long j12;
            j11 = seekPoint.timeMicros;
            j12 = seekPoint.position;
            return new SeekPoint(j11, j12);
        }

        @Override // androidx.media3.extractor.SeekMap
        public long getDurationUs() {
            long durationMicros;
            durationMicros = this.adaptedSeekMap.getDurationMicros();
            return durationMicros != SieveCacheKt.NodeMetaAndPreviousMask ? durationMicros : C.TIME_UNSET;
        }

        @Override // androidx.media3.extractor.SeekMap
        public SeekMap.SeekPoints getSeekPoints(long j11) {
            Pair seekPoints;
            seekPoints = this.adaptedSeekMap.getSeekPoints(j11);
            Object obj = seekPoints.first;
            return obj == seekPoints.second ? new SeekMap.SeekPoints(asExoPlayerSeekPoint(androidx.media3.exoplayer.source.m.a(obj))) : new SeekMap.SeekPoints(asExoPlayerSeekPoint(androidx.media3.exoplayer.source.m.a(obj)), asExoPlayerSeekPoint(androidx.media3.exoplayer.source.m.a(seekPoints.second)));
        }

        @Override // androidx.media3.extractor.SeekMap
        public boolean isSeekable() {
            boolean isSeekable;
            isSeekable = this.adaptedSeekMap.isSeekable();
            return isSeekable;
        }
    }

    static {
        MediaParser.SeekPoint seekPoint;
        MediaParser.SeekPoint seekPoint2;
        seekPoint = MediaParser.SeekPoint.START;
        seekPoint2 = MediaParser.SeekPoint.START;
        SEEK_POINT_PAIR_START = Pair.create(seekPoint, seekPoint2);
        REGEX_CRYPTO_INFO_PATTERN = Pattern.compile("pattern \\(encrypt: (\\d+), skip: (\\d+)\\)");
    }

    public OutputConsumerAdapterV30() {
        this(null, -2, false);
    }

    private void ensureSpaceForTrackIndex(int i11) {
        for (int size = this.trackOutputs.size(); size <= i11; size++) {
            this.trackOutputs.add(null);
            this.trackFormats.add(null);
            this.lastReceivedCryptoInfos.add(null);
            this.lastOutputCryptoDatas.add(null);
        }
    }

    private static int getFlag(MediaFormat mediaFormat, String str, int i11) {
        int integer;
        integer = mediaFormat.getInteger(str, 0);
        if (integer != 0) {
            return i11;
        }
        return 0;
    }

    private static List<byte[]> getInitializationData(MediaFormat mediaFormat) {
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (true) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("csd-");
            int i12 = i11 + 1;
            sb2.append(i11);
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer(sb2.toString());
            if (byteBuffer == null) {
                return arrayList;
            }
            arrayList.add(MediaFormatUtil.getArray(byteBuffer));
            i11 = i12;
        }
    }

    private static String getMimeType(String str) {
        str.getClass();
        switch (str) {
            case "android.media.mediaparser.Mp4Parser":
            case "android.media.mediaparser.FragmentedMp4Parser":
                return MimeTypes.VIDEO_MP4;
            case "android.media.mediaparser.OggParser":
                return MimeTypes.AUDIO_OGG;
            case "android.media.mediaparser.TsParser":
                return MimeTypes.VIDEO_MP2T;
            case "android.media.mediaparser.AdtsParser":
                return MimeTypes.AUDIO_AAC;
            case "android.media.mediaparser.WavParser":
                return MimeTypes.AUDIO_RAW;
            case "android.media.mediaparser.PsParser":
                return MimeTypes.VIDEO_PS;
            case "android.media.mediaparser.Ac3Parser":
                return MimeTypes.AUDIO_AC3;
            case "android.media.mediaparser.AmrParser":
                return MimeTypes.AUDIO_AMR;
            case "android.media.mediaparser.FlacParser":
                return MimeTypes.AUDIO_FLAC;
            case "android.media.mediaparser.MatroskaParser":
                return "video/webm";
            case "android.media.mediaparser.Ac4Parser":
                return MimeTypes.AUDIO_AC4;
            case "android.media.mediaparser.Mp3Parser":
                return MimeTypes.AUDIO_MPEG;
            case "android.media.mediaparser.FlvParser":
                return MimeTypes.VIDEO_FLV;
            default:
                throw new IllegalArgumentException("Illegal parser name: " + str);
        }
    }

    private static int getSelectionFlags(MediaFormat mediaFormat) {
        return getFlag(mediaFormat, "is-forced-subtitle", 2) | getFlag(mediaFormat, "is-autoselect", 4) | getFlag(mediaFormat, "is-default", 1);
    }

    private void maybeEndTracks() {
        if (!this.tracksFoundCalled || this.tracksEnded) {
            return;
        }
        int size = this.trackOutputs.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.trackOutputs.get(i11) == null) {
                return;
            }
        }
        this.extractorOutput.endTracks();
        this.tracksEnded = true;
    }

    private boolean maybeObtainChunkIndex(MediaFormat mediaFormat) {
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer(MEDIA_FORMAT_KEY_CHUNK_INDEX_SIZES);
        if (byteBuffer == null) {
            return false;
        }
        IntBuffer asIntBuffer = byteBuffer.asIntBuffer();
        LongBuffer asLongBuffer = ((ByteBuffer) Assertions.checkNotNull(mediaFormat.getByteBuffer(MEDIA_FORMAT_KEY_CHUNK_INDEX_OFFSETS))).asLongBuffer();
        LongBuffer asLongBuffer2 = ((ByteBuffer) Assertions.checkNotNull(mediaFormat.getByteBuffer(MEDIA_FORMAT_KEY_CHUNK_INDEX_DURATIONS))).asLongBuffer();
        LongBuffer asLongBuffer3 = ((ByteBuffer) Assertions.checkNotNull(mediaFormat.getByteBuffer(MEDIA_FORMAT_KEY_CHUNK_INDEX_TIMES))).asLongBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        long[] jArr = new long[asLongBuffer.remaining()];
        long[] jArr2 = new long[asLongBuffer2.remaining()];
        long[] jArr3 = new long[asLongBuffer3.remaining()];
        asIntBuffer.get(iArr);
        asLongBuffer.get(jArr);
        asLongBuffer2.get(jArr2);
        asLongBuffer3.get(jArr3);
        ChunkIndex chunkIndex = new ChunkIndex(iArr, jArr, jArr2, jArr3);
        this.lastChunkIndex = chunkIndex;
        this.extractorOutput.seekMap(chunkIndex);
        return true;
    }

    @Nullable
    private TrackOutput.CryptoData toExoPlayerCryptoData(int i11, @Nullable MediaCodec.CryptoInfo cryptoInfo) {
        int i12;
        int i13;
        if (cryptoInfo == null) {
            return null;
        }
        if (this.lastReceivedCryptoInfos.get(i11) == cryptoInfo) {
            return (TrackOutput.CryptoData) Assertions.checkNotNull(this.lastOutputCryptoDatas.get(i11));
        }
        try {
            Matcher matcher = REGEX_CRYPTO_INFO_PATTERN.matcher(cryptoInfo.toString());
            matcher.find();
            i12 = Integer.parseInt((String) Util.castNonNull(matcher.group(1)));
            i13 = Integer.parseInt((String) Util.castNonNull(matcher.group(2)));
        } catch (RuntimeException e11) {
            Log.e(TAG, "Unexpected error while parsing CryptoInfo: " + cryptoInfo, e11);
            i12 = 0;
            i13 = 0;
        }
        TrackOutput.CryptoData cryptoData = new TrackOutput.CryptoData(cryptoInfo.mode, cryptoInfo.key, i12, i13);
        this.lastReceivedCryptoInfos.set(i11, cryptoInfo);
        this.lastOutputCryptoDatas.set(i11, cryptoData);
        return cryptoData;
    }

    @Nullable
    private static DrmInitData toExoPlayerDrmInitData(@Nullable String str, @Nullable android.media.DrmInitData drmInitData) {
        int schemeInitDataCount;
        DrmInitData.SchemeInitData schemeInitDataAt;
        UUID uuid;
        if (drmInitData == null) {
            return null;
        }
        schemeInitDataCount = drmInitData.getSchemeInitDataCount();
        DrmInitData.SchemeData[] schemeDataArr = new DrmInitData.SchemeData[schemeInitDataCount];
        for (int i11 = 0; i11 < schemeInitDataCount; i11++) {
            schemeInitDataAt = drmInitData.getSchemeInitDataAt(i11);
            uuid = schemeInitDataAt.uuid;
            schemeDataArr[i11] = new DrmInitData.SchemeData(uuid, schemeInitDataAt.mimeType, schemeInitDataAt.data);
        }
        return new androidx.media3.common.DrmInitData(str, schemeDataArr);
    }

    private Format toExoPlayerFormat(MediaParser.TrackData trackData) {
        MediaFormat mediaFormat;
        int integer;
        android.media.DrmInitData drmInitData;
        int integer2;
        int integer3;
        float f11;
        int integer4;
        int integer5;
        int integer6;
        int integer7;
        int integer8;
        int integer9;
        int integer10;
        int integer11;
        float f12;
        long j11;
        mediaFormat = trackData.mediaFormat;
        String string = mediaFormat.getString(IMediaFormat.KEY_MIME);
        integer = mediaFormat.getInteger("caption-service-number", -1);
        Format.Builder builder = new Format.Builder();
        String string2 = mediaFormat.getString("crypto-mode-fourcc");
        drmInitData = trackData.drmInitData;
        Format.Builder containerMimeType = builder.setDrmInitData(toExoPlayerDrmInitData(string2, drmInitData)).setContainerMimeType(this.containerMimeType);
        integer2 = mediaFormat.getInteger(IjkMediaMeta.IJKM_KEY_BITRATE, -1);
        Format.Builder peakBitrate = containerMimeType.setPeakBitrate(integer2);
        integer3 = mediaFormat.getInteger("channel-count", -1);
        Format.Builder codecs = peakBitrate.setChannelCount(integer3).setColorInfo(MediaFormatUtil.getColorInfo(mediaFormat)).setSampleMimeType(string).setCodecs(mediaFormat.getString("codecs-string"));
        f11 = mediaFormat.getFloat("frame-rate", -1.0f);
        Format.Builder frameRate = codecs.setFrameRate(f11);
        integer4 = mediaFormat.getInteger("width", -1);
        Format.Builder width = frameRate.setWidth(integer4);
        integer5 = mediaFormat.getInteger("height", -1);
        Format.Builder language = width.setHeight(integer5).setInitializationData(getInitializationData(mediaFormat)).setLanguage(mediaFormat.getString(IjkMediaMeta.IJKM_KEY_LANGUAGE));
        integer6 = mediaFormat.getInteger("max-input-size", -1);
        Format.Builder maxInputSize = language.setMaxInputSize(integer6);
        integer7 = mediaFormat.getInteger("exo-pcm-encoding", -1);
        Format.Builder pcmEncoding = maxInputSize.setPcmEncoding(integer7);
        int i11 = 0;
        integer8 = mediaFormat.getInteger("rotation-degrees", 0);
        Format.Builder rotationDegrees = pcmEncoding.setRotationDegrees(integer8);
        integer9 = mediaFormat.getInteger("sample-rate", -1);
        Format.Builder selectionFlags = rotationDegrees.setSampleRate(integer9).setSelectionFlags(getSelectionFlags(mediaFormat));
        integer10 = mediaFormat.getInteger("encoder-delay", 0);
        Format.Builder encoderDelay = selectionFlags.setEncoderDelay(integer10);
        integer11 = mediaFormat.getInteger("encoder-padding", 0);
        Format.Builder encoderPadding = encoderDelay.setEncoderPadding(integer11);
        f12 = mediaFormat.getFloat("pixel-width-height-ratio-float", 1.0f);
        Format.Builder pixelWidthHeightRatio = encoderPadding.setPixelWidthHeightRatio(f12);
        j11 = mediaFormat.getLong("subsample-offset-us-long", Long.MAX_VALUE);
        Format.Builder accessibilityChannel = pixelWidthHeightRatio.setSubsampleOffsetUs(j11).setAccessibilityChannel(integer);
        while (true) {
            if (i11 >= this.muxedCaptionFormats.size()) {
                break;
            }
            Format format = this.muxedCaptionFormats.get(i11);
            if (Objects.equals(format.sampleMimeType, string) && format.accessibilityChannel == integer) {
                accessibilityChannel.setLanguage(format.language).setRoleFlags(format.roleFlags).setSelectionFlags(format.selectionFlags).setLabel(format.label).setLabels(format.labels).setMetadata(format.metadata);
                break;
            }
            i11++;
        }
        return accessibilityChannel.build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int toTrackTypeConstant(@Nullable String str) {
        char c11;
        if (str == null) {
            return -1;
        }
        switch (str.hashCode()) {
            case -450004177:
                if (str.equals(TtmlNode.TAG_METADATA)) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case -284840886:
                if (str.equals("unknown")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case 3556653:
                if (str.equals("text")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case 93166550:
                if (str.equals("audio")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case 112202875:
                if (str.equals("video")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        switch (c11) {
            case 0:
                return 5;
            case 1:
                return -1;
            case 2:
                return 3;
            case 3:
                return 1;
            case 4:
                return 2;
            default:
                return MimeTypes.getTrackType(str);
        }
    }

    public void disableSeeking() {
        this.seekingDisabled = true;
    }

    @Nullable
    public ChunkIndex getChunkIndex() {
        return this.lastChunkIndex;
    }

    @Nullable
    public MediaParser.SeekMap getDummySeekMap() {
        return this.dummySeekMap;
    }

    @Nullable
    public Format[] getSampleFormats() {
        if (!this.tracksFoundCalled) {
            return null;
        }
        Format[] formatArr = new Format[this.trackFormats.size()];
        for (int i11 = 0; i11 < this.trackFormats.size(); i11++) {
            formatArr[i11] = (Format) Assertions.checkNotNull(this.trackFormats.get(i11));
        }
        return formatArr;
    }

    public Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> getSeekPoints(long j11) {
        Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> seekPoints;
        MediaParser.SeekMap seekMap = this.lastSeekMap;
        if (seekMap == null) {
            return SEEK_POINT_PAIR_START;
        }
        seekPoints = seekMap.getSeekPoints(j11);
        return seekPoints;
    }

    public void onSampleCompleted(int i11, long j11, int i12, int i13, int i14, @Nullable MediaCodec.CryptoInfo cryptoInfo) {
        long j12 = this.sampleTimestampUpperLimitFilterUs;
        if (j12 == C.TIME_UNSET || j11 < j12) {
            TimestampAdjuster timestampAdjuster = this.timestampAdjuster;
            if (timestampAdjuster != null) {
                j11 = timestampAdjuster.adjustSampleTimestamp(j11);
            }
            ((TrackOutput) Assertions.checkNotNull(this.trackOutputs.get(i11))).sampleMetadata(j11, i12, i13, i14, toExoPlayerCryptoData(i11, cryptoInfo));
        }
    }

    public void onSampleDataFound(int i11, MediaParser$InputReader mediaParser$InputReader) throws IOException {
        long length;
        ensureSpaceForTrackIndex(i11);
        this.scratchDataReaderAdapter.input = mediaParser$InputReader;
        TrackOutput trackOutput = this.trackOutputs.get(i11);
        if (trackOutput == null) {
            trackOutput = this.extractorOutput.track(i11, -1);
            this.trackOutputs.set(i11, trackOutput);
        }
        DataReaderAdapter dataReaderAdapter = this.scratchDataReaderAdapter;
        length = mediaParser$InputReader.getLength();
        trackOutput.sampleData((DataReader) dataReaderAdapter, (int) length, true);
    }

    public void onSeekMapFound(MediaParser.SeekMap seekMap) {
        long durationMicros;
        SeekMap seekMapAdapter;
        if (this.expectDummySeekMap && this.dummySeekMap == null) {
            this.dummySeekMap = seekMap;
            return;
        }
        this.lastSeekMap = seekMap;
        durationMicros = seekMap.getDurationMicros();
        ExtractorOutput extractorOutput = this.extractorOutput;
        if (this.seekingDisabled) {
            if (durationMicros == SieveCacheKt.NodeMetaAndPreviousMask) {
                durationMicros = C.TIME_UNSET;
            }
            seekMapAdapter = new SeekMap.Unseekable(durationMicros);
        } else {
            seekMapAdapter = new SeekMapAdapter(seekMap);
        }
        extractorOutput.seekMap(seekMapAdapter);
    }

    public void onTrackCountFound(int i11) {
        this.tracksFoundCalled = true;
        maybeEndTracks();
    }

    public void onTrackDataFound(int i11, MediaParser.TrackData trackData) {
        MediaFormat mediaFormat;
        MediaFormat mediaFormat2;
        MediaFormat mediaFormat3;
        String string;
        mediaFormat = trackData.mediaFormat;
        if (maybeObtainChunkIndex(mediaFormat)) {
            return;
        }
        ensureSpaceForTrackIndex(i11);
        TrackOutput trackOutput = this.trackOutputs.get(i11);
        if (trackOutput == null) {
            mediaFormat2 = trackData.mediaFormat;
            String string2 = mediaFormat2.getString(MEDIA_FORMAT_KEY_TRACK_TYPE);
            if (string2 != null) {
                string = string2;
            } else {
                mediaFormat3 = trackData.mediaFormat;
                string = mediaFormat3.getString(IMediaFormat.KEY_MIME);
            }
            int trackTypeConstant = toTrackTypeConstant(string);
            if (trackTypeConstant == this.primaryTrackType) {
                this.primaryTrackIndex = i11;
            }
            TrackOutput track = this.extractorOutput.track(i11, trackTypeConstant);
            this.trackOutputs.set(i11, track);
            if (string2 != null) {
                return;
            } else {
                trackOutput = track;
            }
        }
        Format exoPlayerFormat = toExoPlayerFormat(trackData);
        Format format = this.primaryTrackManifestFormat;
        trackOutput.format((format == null || i11 != this.primaryTrackIndex) ? exoPlayerFormat : exoPlayerFormat.withManifestFormatInfo(format));
        this.trackFormats.set(i11, exoPlayerFormat);
        maybeEndTracks();
    }

    public void setExtractorOutput(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
    }

    public void setMuxedCaptionFormats(List<Format> list) {
        this.muxedCaptionFormats = list;
    }

    public void setSampleTimestampUpperLimitFilterUs(long j11) {
        this.sampleTimestampUpperLimitFilterUs = j11;
    }

    public void setSelectedParserName(String str) {
        this.containerMimeType = getMimeType(str);
    }

    public void setTimestampAdjuster(TimestampAdjuster timestampAdjuster) {
        this.timestampAdjuster = timestampAdjuster;
    }

    public OutputConsumerAdapterV30(@Nullable Format format, int i11, boolean z11) {
        this.expectDummySeekMap = z11;
        this.primaryTrackManifestFormat = format;
        this.primaryTrackType = i11;
        this.trackOutputs = new ArrayList<>();
        this.trackFormats = new ArrayList<>();
        this.lastReceivedCryptoInfos = new ArrayList<>();
        this.lastOutputCryptoDatas = new ArrayList<>();
        this.scratchDataReaderAdapter = new DataReaderAdapter();
        this.extractorOutput = new NoOpExtractorOutput();
        this.sampleTimestampUpperLimitFilterUs = C.TIME_UNSET;
        this.muxedCaptionFormats = ImmutableList.of();
    }
}
