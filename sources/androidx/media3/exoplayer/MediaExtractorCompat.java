package androidx.media3.exoplayer;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaCodec;
import android.media.MediaDataSource;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.PersistableBundle;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.C;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.MediaFormatUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSourceUtil;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.datasource.FileDescriptorDataSource;
import androidx.media3.datasource.MediaDataSourceAdapter;
import androidx.media3.decoder.CryptoInfo;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.source.SampleQueue;
import androidx.media3.exoplayer.source.UnrecognizedInputFormatException;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.DefaultAllocator;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.DefaultExtractorsFactory;
import androidx.media3.extractor.DiscardingTrackOutput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.mp4.PsshAtomUtil;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.q6;
import com.tencent.ijk.media.player.misc.IMediaFormat;
import ho.r;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class MediaExtractorCompat {
    private static final long DEFAULT_LAST_SAMPLE_DURATION_US = 10000;
    public static final int SEEK_TO_CLOSEST_SYNC = 2;
    public static final int SEEK_TO_NEXT_SYNC = 1;
    public static final int SEEK_TO_PREVIOUS_SYNC = 0;
    private static final String TAG = "MediaExtractorCompat";
    private final Allocator allocator;

    @Nullable
    private DataSource currentDataSource;

    @Nullable
    private Extractor currentExtractor;

    @Nullable
    private ExtractorInput currentExtractorInput;
    private final DataSource.Factory dataSourceFactory;
    private final ExtractorsFactory extractorsFactory;
    private final FormatHolder formatHolder;
    private boolean hasBeenPrepared;

    @Nullable
    private Map<String, String> httpRequestHeaders;

    @Nullable
    private LogSessionId logSessionId;
    private long offsetInCurrentFile;

    @Nullable
    private SeekPoint pendingSeek;
    private final PositionHolder positionHolder;
    private final DecoderInputBuffer sampleHolderWithBufferReplacementDisabled;
    private final DecoderInputBuffer sampleHolderWithBufferReplacementEnabled;
    private final SampleMetadataQueue sampleMetadataQueue;
    private final SparseArray<MediaExtractorSampleQueue> sampleQueues;

    @Nullable
    private SeekMap seekMap;
    private final Set<Integer> selectedTrackIndices;
    private final ArrayList<MediaExtractorTrack> tracks;
    private boolean tracksEnded;
    private int upstreamFormatsCount;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class ExtractorOutputImpl implements ExtractorOutput {
        private ExtractorOutputImpl() {
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public void endTracks() {
            MediaExtractorCompat.this.tracksEnded = true;
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public void seekMap(SeekMap seekMap) {
            MediaExtractorCompat.this.seekMap = seekMap;
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public TrackOutput track(int i11, int i12) {
            MediaExtractorSampleQueue mediaExtractorSampleQueue = (MediaExtractorSampleQueue) MediaExtractorCompat.this.sampleQueues.get(i11);
            if (mediaExtractorSampleQueue != null) {
                return mediaExtractorSampleQueue;
            }
            if (MediaExtractorCompat.this.tracksEnded) {
                return new DiscardingTrackOutput();
            }
            MediaExtractorCompat mediaExtractorCompat = MediaExtractorCompat.this;
            MediaExtractorSampleQueue mediaExtractorSampleQueue2 = mediaExtractorCompat.new MediaExtractorSampleQueue(mediaExtractorCompat.allocator, i11);
            MediaExtractorCompat.this.sampleQueues.put(i11, mediaExtractorSampleQueue2);
            return mediaExtractorSampleQueue2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class MediaExtractorSampleQueue extends SampleQueue {
        private int compatibilityTrackIndex;
        private int mainTrackIndex;
        public long trackDurationUs;
        public final int trackId;

        public MediaExtractorSampleQueue(Allocator allocator, int i11) {
            super(allocator, null, null);
            this.trackId = i11;
            this.trackDurationUs = C.TIME_UNSET;
            this.mainTrackIndex = -1;
            this.compatibilityTrackIndex = -1;
        }

        private void queueSampleMetadata(long j11, int i11) {
            int i12 = ((1073741824 & i11) != 0 ? 2 : 0) | ((i11 & 1) != 0 ? 1 : 0);
            if (this.compatibilityTrackIndex != -1) {
                MediaExtractorCompat.this.sampleMetadataQueue.addLast(j11, i12, this.compatibilityTrackIndex);
            }
            MediaExtractorCompat.this.sampleMetadataQueue.addLast(j11, i12, this.mainTrackIndex);
        }

        @Override // androidx.media3.extractor.TrackOutput
        public void durationUs(long j11) {
            this.trackDurationUs = j11;
            super.durationUs(j11);
        }

        @Override // androidx.media3.exoplayer.source.SampleQueue
        public Format getAdjustedUpstreamFormat(Format format) {
            if (getUpstreamFormat() == null) {
                MediaExtractorCompat.this.onSampleQueueFormatInitialized(this, format);
            }
            return super.getAdjustedUpstreamFormat(format);
        }

        @Override // androidx.media3.exoplayer.source.SampleQueue, androidx.media3.extractor.TrackOutput
        public void sampleMetadata(long j11, int i11, int i12, int i13, @Nullable TrackOutput.CryptoData cryptoData) {
            int i14 = i11 & (-536870913);
            Assertions.checkState(this.mainTrackIndex != -1);
            int writeIndex = getWriteIndex();
            super.sampleMetadata(j11, i14, i12, i13, cryptoData);
            if (getWriteIndex() == writeIndex + 1) {
                queueSampleMetadata(j11, i14);
            }
        }

        public void setCompatibilityTrackIndex(int i11) {
            this.compatibilityTrackIndex = i11;
        }

        public void setMainTrackIndex(int i11) {
            this.mainTrackIndex = i11;
        }

        public String toString() {
            return String.format("trackId: %s, mainTrackIndex: %s, compatibilityTrackIndex: %s", Integer.valueOf(this.trackId), Integer.valueOf(this.mainTrackIndex), Integer.valueOf(this.compatibilityTrackIndex));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class MediaExtractorTrack {

        @Nullable
        public final String compatibilityTrackMimeType;
        public final boolean isCompatibilityTrack;
        public final MediaExtractorSampleQueue sampleQueue;

        /* JADX INFO: Access modifiers changed from: private */
        public Format getFormat(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer) {
            formatHolder.clear();
            this.sampleQueue.read(formatHolder, decoderInputBuffer, 2, false);
            Format format = (Format) Assertions.checkNotNull(formatHolder.format);
            formatHolder.clear();
            return format;
        }

        public MediaFormat createDownstreamMediaFormat(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer) {
            MediaFormat createMediaFormatFromFormat = MediaFormatUtil.createMediaFormatFromFormat(getFormat(formatHolder, decoderInputBuffer));
            if (this.compatibilityTrackMimeType != null) {
                if (Util.SDK_INT >= 29) {
                    createMediaFormatFromFormat.removeKey("codecs-string");
                }
                createMediaFormatFromFormat.setString(IMediaFormat.KEY_MIME, this.compatibilityTrackMimeType);
            }
            return createMediaFormatFromFormat;
        }

        public void discardFrontSample() {
            this.sampleQueue.skip(1);
            this.sampleQueue.discardToRead();
        }

        public int getIdOfBackingTrack() {
            return this.sampleQueue.trackId;
        }

        public String toString() {
            return String.format("MediaExtractorSampleQueue: %s, isCompatibilityTrack: %s, compatibilityTrackMimeType: %s", this.sampleQueue, Boolean.valueOf(this.isCompatibilityTrack), this.compatibilityTrackMimeType);
        }

        private MediaExtractorTrack(MediaExtractorSampleQueue mediaExtractorSampleQueue, boolean z11, @Nullable String str) {
            this.sampleQueue = mediaExtractorSampleQueue;
            this.isCompatibilityTrack = z11;
            this.compatibilityTrackMimeType = str;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class SampleMetadataQueue {
        private final ArrayDeque<SampleMetadata> sampleMetadataPool = new ArrayDeque<>();
        private final ArrayDeque<SampleMetadata> sampleMetadataQueue = new ArrayDeque<>();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class SampleMetadata {
            public int flags;
            public long timeUs;
            public int trackIndex;

            public SampleMetadata(long j11, int i11, int i12) {
                set(j11, i11, i12);
            }

            public void set(long j11, int i11, int i12) {
                this.timeUs = j11;
                this.flags = i11;
                this.trackIndex = i12;
            }
        }

        private SampleMetadata obtainSampleMetadata(long j11, int i11, int i12) {
            SampleMetadata sampleMetadata = this.sampleMetadataPool.isEmpty() ? new SampleMetadata(j11, i11, i12) : this.sampleMetadataPool.pop();
            sampleMetadata.set(j11, i11, i12);
            return sampleMetadata;
        }

        public void addLast(long j11, int i11, int i12) {
            this.sampleMetadataQueue.addLast(obtainSampleMetadata(j11, i11, i12));
        }

        public void clear() {
            Iterator<SampleMetadata> it = this.sampleMetadataQueue.iterator();
            while (it.hasNext()) {
                this.sampleMetadataPool.push(it.next());
            }
            this.sampleMetadataQueue.clear();
        }

        public boolean isEmpty() {
            return this.sampleMetadataQueue.isEmpty();
        }

        @Nullable
        public SampleMetadata peekFirst() {
            return this.sampleMetadataQueue.peekFirst();
        }

        public SampleMetadata removeFirst() {
            SampleMetadata removeFirst = this.sampleMetadataQueue.removeFirst();
            this.sampleMetadataPool.push(removeFirst);
            return removeFirst;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    public @interface SeekMode {
    }

    public MediaExtractorCompat(Context context) {
        this(new DefaultExtractorsFactory(), new DefaultDataSource.Factory(context));
    }

    @EnsuresNonNullIf(expression = {"sampleMetadataQueue.peekFirst()"}, result = true)
    private boolean advanceToSampleOrEndOfInput() {
        int read;
        try {
            maybeResolvePendingSeek();
            boolean z11 = false;
            while (true) {
                if (this.sampleMetadataQueue.isEmpty()) {
                    if (z11) {
                        return false;
                    }
                    try {
                        read = ((Extractor) Assertions.checkNotNull(this.currentExtractor)).read((ExtractorInput) Assertions.checkNotNull(this.currentExtractorInput), this.positionHolder);
                    } catch (Exception | OutOfMemoryError e11) {
                        Log.w(TAG, "Treating exception as the end of input.", e11);
                    }
                    if (read == -1) {
                        z11 = true;
                    } else if (read == 1) {
                        this.currentExtractorInput = reopenCurrentDataSource(this.positionHolder.position);
                    }
                } else {
                    if (this.selectedTrackIndices.contains(Integer.valueOf(((SampleMetadataQueue.SampleMetadata) Assertions.checkNotNull(this.sampleMetadataQueue.peekFirst())).trackIndex))) {
                        return true;
                    }
                    skipOneSample();
                }
            }
        } catch (IOException e12) {
            Log.w(TAG, "Treating exception as the end of input.", e12);
            return false;
        }
    }

    private DataSpec buildDataSpec(Uri uri, long j11) {
        DataSpec.Builder flags = new DataSpec.Builder().setUri(uri).setPosition(j11).setFlags(6);
        Map<String, String> map = this.httpRequestHeaders;
        if (map != null) {
            flags.setHttpRequestHeaders(map);
        }
        return flags.build();
    }

    private void maybeResolvePendingSeek() throws IOException {
        SeekPoint seekPoint = this.pendingSeek;
        if (seekPoint == null) {
            return;
        }
        SeekPoint seekPoint2 = (SeekPoint) Assertions.checkNotNull(seekPoint);
        ((Extractor) Assertions.checkNotNull(this.currentExtractor)).seek(seekPoint2.position, seekPoint2.timeUs);
        this.currentExtractorInput = reopenCurrentDataSource(seekPoint2.position);
        this.pendingSeek = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void onSampleQueueFormatInitialized(MediaExtractorSampleQueue mediaExtractorSampleQueue, Format format) {
        boolean z11 = true;
        this.upstreamFormatsCount++;
        mediaExtractorSampleQueue.setMainTrackIndex(this.tracks.size());
        Object[] objArr = 0;
        this.tracks.add(new MediaExtractorTrack(mediaExtractorSampleQueue, false, null));
        String alternativeCodecMimeType = MediaCodecUtil.getAlternativeCodecMimeType(format);
        if (alternativeCodecMimeType != null) {
            mediaExtractorSampleQueue.setCompatibilityTrackIndex(this.tracks.size());
            this.tracks.add(new MediaExtractorTrack(mediaExtractorSampleQueue, z11, alternativeCodecMimeType));
        }
    }

    private void peekNextSelectedTrackSample(DecoderInputBuffer decoderInputBuffer) {
        MediaExtractorSampleQueue mediaExtractorSampleQueue = this.tracks.get(((SampleMetadataQueue.SampleMetadata) Assertions.checkNotNull(this.sampleMetadataQueue.peekFirst())).trackIndex).sampleQueue;
        int read = mediaExtractorSampleQueue.read(this.formatHolder, decoderInputBuffer, 1, false);
        if (read == -5) {
            read = mediaExtractorSampleQueue.read(this.formatHolder, decoderInputBuffer, 1, false);
        }
        this.formatHolder.clear();
        Assertions.checkState(read == -4);
    }

    private void populatePlatformCryptoInfoParameters(MediaCodec.CryptoInfo cryptoInfo) {
        MediaCodec.CryptoInfo frameworkCryptoInfo = ((CryptoInfo) Assertions.checkNotNull(this.sampleHolderWithBufferReplacementEnabled.cryptoInfo)).getFrameworkCryptoInfo();
        cryptoInfo.numSubSamples = frameworkCryptoInfo.numSubSamples;
        cryptoInfo.numBytesOfClearData = frameworkCryptoInfo.numBytesOfClearData;
        cryptoInfo.numBytesOfEncryptedData = frameworkCryptoInfo.numBytesOfEncryptedData;
        cryptoInfo.key = frameworkCryptoInfo.key;
        cryptoInfo.iv = frameworkCryptoInfo.iv;
        cryptoInfo.mode = frameworkCryptoInfo.mode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void prepareDataSource(DataSource dataSource, DataSpec dataSpec) throws IOException {
        int i11;
        Assertions.checkState(!this.hasBeenPrepared);
        this.hasBeenPrepared = true;
        this.offsetInCurrentFile = dataSpec.position;
        this.currentDataSource = dataSource;
        ExtractorInput defaultExtractorInput = new DefaultExtractorInput(this.currentDataSource, 0L, dataSource.open(dataSpec));
        Extractor selectExtractor = selectExtractor(defaultExtractorInput);
        Throwable e11 = null;
        selectExtractor.init(new ExtractorOutputImpl());
        boolean z11 = true;
        while (z11) {
            try {
                i11 = selectExtractor.read(defaultExtractorInput, this.positionHolder);
            } catch (Exception | OutOfMemoryError e12) {
                e11 = e12;
                i11 = -1;
            }
            boolean z12 = !this.tracksEnded || this.upstreamFormatsCount < this.sampleQueues.size() || this.seekMap == null;
            if (e11 != null || (z12 && i11 == -1)) {
                release();
                throw ParserException.createForMalformedContainer(e11 != null ? "Exception encountered while parsing input media." : "Reached end of input before preparation completed.", e11);
            }
            if (i11 == 1) {
                defaultExtractorInput = reopenCurrentDataSource(this.positionHolder.position);
            }
            z11 = z12;
        }
        this.currentExtractorInput = defaultExtractorInput;
        this.currentExtractor = selectExtractor;
    }

    private ExtractorInput reopenCurrentDataSource(long j11) throws IOException {
        DataSource dataSource = (DataSource) Assertions.checkNotNull(this.currentDataSource);
        Uri uri = (Uri) Assertions.checkNotNull(dataSource.getUri());
        DataSourceUtil.closeQuietly(dataSource);
        long open = dataSource.open(buildDataSpec(uri, this.offsetInCurrentFile + j11));
        if (open != -1) {
            open += j11;
        }
        return new DefaultExtractorInput(dataSource, j11, open);
    }

    private Extractor selectExtractor(ExtractorInput extractorInput) throws IOException {
        Extractor extractor;
        Extractor[] createExtractors = this.extractorsFactory.createExtractors();
        int length = createExtractors.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                extractor = null;
                break;
            }
            extractor = createExtractors[i11];
            try {
                if (extractor.sniff(extractorInput)) {
                    extractorInput.resetPeekPosition();
                    break;
                }
            } catch (EOFException unused) {
            } catch (Throwable th2) {
                extractorInput.resetPeekPosition();
                throw th2;
            }
            extractorInput.resetPeekPosition();
            i11++;
        }
        if (extractor != null) {
            return extractor;
        }
        throw new UnrecognizedInputFormatException("None of the available extractors (" + ho.a0.p(org.junit.jupiter.api.j2.O).k(q6.D(ImmutableList.copyOf(createExtractors), new r() { // from class: androidx.media3.exoplayer.c3
            @Override // ho.r
            public final Object apply(Object obj) {
                String simpleName;
                simpleName = ((Extractor) obj).getUnderlyingImplementation().getClass().getSimpleName();
                return simpleName;
            }
        })) + ") could read the stream.", (Uri) Assertions.checkNotNull(((DataSource) Assertions.checkNotNull(this.currentDataSource)).getUri()), ImmutableList.of());
    }

    private void skipOneSample() {
        MediaExtractorTrack mediaExtractorTrack = this.tracks.get(this.sampleMetadataQueue.removeFirst().trackIndex);
        if (mediaExtractorTrack.isCompatibilityTrack) {
            return;
        }
        mediaExtractorTrack.discardFrontSample();
    }

    public boolean advance() {
        if (!advanceToSampleOrEndOfInput()) {
            return false;
        }
        skipOneSample();
        return advanceToSampleOrEndOfInput();
    }

    @VisibleForTesting(otherwise = 5)
    public Allocator getAllocator() {
        return this.allocator;
    }

    public long getCachedDuration() {
        if (!advanceToSampleOrEndOfInput()) {
            return 0L;
        }
        long j11 = Long.MIN_VALUE;
        long j12 = Long.MIN_VALUE;
        for (int i11 = 0; i11 < this.tracks.size(); i11++) {
            MediaExtractorSampleQueue mediaExtractorSampleQueue = this.tracks.get(i11).sampleQueue;
            j12 = Math.max(j12, mediaExtractorSampleQueue.getLargestReadTimestampUs());
            j11 = Math.max(j11, mediaExtractorSampleQueue.getLargestQueuedTimestampUs());
        }
        Assertions.checkState(j11 != Long.MIN_VALUE);
        if (j12 == j11) {
            return 0L;
        }
        return (j11 - (j12 != Long.MIN_VALUE ? j12 : 0L)) + 10000;
    }

    @Nullable
    public DrmInitData getDrmInitData() {
        for (int i11 = 0; i11 < this.tracks.size(); i11++) {
            DrmInitData drmInitData = this.tracks.get(i11).getFormat(this.formatHolder, this.sampleHolderWithBufferReplacementDisabled).drmInitData;
            if (drmInitData != null) {
                return drmInitData;
            }
        }
        return null;
    }

    @RequiresApi(31)
    public LogSessionId getLogSessionId() {
        LogSessionId logSessionId;
        LogSessionId logSessionId2 = this.logSessionId;
        if (logSessionId2 != null) {
            return logSessionId2;
        }
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        return logSessionId;
    }

    @RequiresApi(26)
    public PersistableBundle getMetrics() {
        String str;
        PersistableBundle persistableBundle = new PersistableBundle();
        Extractor extractor = this.currentExtractor;
        if (extractor != null) {
            persistableBundle.putString("android.media.mediaextractor.fmt", extractor.getUnderlyingImplementation().getClass().getSimpleName());
        }
        if (!this.tracks.isEmpty() && (str = this.tracks.get(0).getFormat(this.formatHolder, this.sampleHolderWithBufferReplacementDisabled).containerMimeType) != null) {
            persistableBundle.putString("android.media.mediaextractor.mime", str);
        }
        persistableBundle.putInt("android.media.mediaextractor.ntrk", this.tracks.size());
        return persistableBundle;
    }

    @Nullable
    public Map<UUID, byte[]> getPsshInfo() {
        PsshAtomUtil.PsshAtom parsePsshAtom;
        DrmInitData drmInitData = getDrmInitData();
        if (drmInitData == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i11 = 0; i11 < drmInitData.schemeDataCount; i11++) {
            byte[] bArr = drmInitData.get(i11).data;
            if (bArr != null && (parsePsshAtom = PsshAtomUtil.parsePsshAtom(bArr)) != null) {
                hashMap.put(parsePsshAtom.uuid, parsePsshAtom.schemeData);
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        return hashMap;
    }

    public boolean getSampleCryptoInfo(MediaCodec.CryptoInfo cryptoInfo) {
        if (!advanceToSampleOrEndOfInput() || (this.sampleMetadataQueue.peekFirst().flags & 2) == 0) {
            return false;
        }
        peekNextSelectedTrackSample(this.sampleHolderWithBufferReplacementEnabled);
        populatePlatformCryptoInfoParameters(cryptoInfo);
        return true;
    }

    public int getSampleFlags() {
        if (advanceToSampleOrEndOfInput()) {
            return this.sampleMetadataQueue.peekFirst().flags;
        }
        return -1;
    }

    public long getSampleSize() {
        if (!advanceToSampleOrEndOfInput()) {
            return -1L;
        }
        peekNextSelectedTrackSample(this.sampleHolderWithBufferReplacementEnabled);
        ByteBuffer byteBuffer = (ByteBuffer) Assertions.checkNotNull(this.sampleHolderWithBufferReplacementEnabled.data);
        int position = byteBuffer.position();
        byteBuffer.position(0);
        return position;
    }

    public long getSampleTime() {
        if (advanceToSampleOrEndOfInput()) {
            return this.sampleMetadataQueue.peekFirst().timeUs;
        }
        return -1L;
    }

    public int getSampleTrackIndex() {
        if (advanceToSampleOrEndOfInput()) {
            return this.sampleMetadataQueue.peekFirst().trackIndex;
        }
        return -1;
    }

    public int getTrackCount() {
        return this.tracks.size();
    }

    public MediaFormat getTrackFormat(int i11) {
        MediaExtractorTrack mediaExtractorTrack = this.tracks.get(i11);
        MediaFormat createDownstreamMediaFormat = mediaExtractorTrack.createDownstreamMediaFormat(this.formatHolder, this.sampleHolderWithBufferReplacementDisabled);
        long j11 = mediaExtractorTrack.sampleQueue.trackDurationUs;
        if (j11 != C.TIME_UNSET) {
            createDownstreamMediaFormat.setLong("durationUs", j11);
            return createDownstreamMediaFormat;
        }
        SeekMap seekMap = this.seekMap;
        if (seekMap != null && seekMap.getDurationUs() != C.TIME_UNSET) {
            createDownstreamMediaFormat.setLong("durationUs", this.seekMap.getDurationUs());
        }
        return createDownstreamMediaFormat;
    }

    public boolean hasCacheReachedEndOfStream() {
        return getCachedDuration() == 0;
    }

    public int readSampleData(ByteBuffer byteBuffer, int i11) {
        if (!advanceToSampleOrEndOfInput()) {
            return -1;
        }
        byteBuffer.position(i11);
        byteBuffer.limit(byteBuffer.capacity());
        DecoderInputBuffer decoderInputBuffer = this.sampleHolderWithBufferReplacementDisabled;
        decoderInputBuffer.data = byteBuffer;
        peekNextSelectedTrackSample(decoderInputBuffer);
        byteBuffer.flip();
        byteBuffer.position(i11);
        this.sampleHolderWithBufferReplacementDisabled.data = null;
        return byteBuffer.remaining();
    }

    public void release() {
        for (int i11 = 0; i11 < this.sampleQueues.size(); i11++) {
            this.sampleQueues.valueAt(i11).release();
        }
        this.sampleQueues.clear();
        Extractor extractor = this.currentExtractor;
        if (extractor != null) {
            extractor.release();
            this.currentExtractor = null;
        }
        this.currentExtractorInput = null;
        this.pendingSeek = null;
        DataSourceUtil.closeQuietly(this.currentDataSource);
        this.currentDataSource = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007a A[LOOP:0: B:18:0x0072->B:20:0x007a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void seekTo(long r6, int r8) {
        /*
            r5 = this;
            androidx.media3.extractor.SeekMap r0 = r5.seekMap
            if (r0 != 0) goto L5
            return
        L5:
            java.util.Set<java.lang.Integer> r0 = r5.selectedTrackIndices
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L37
            androidx.media3.extractor.Extractor r0 = r5.currentExtractor
            boolean r2 = r0 instanceof androidx.media3.extractor.mp4.Mp4Extractor
            if (r2 == 0) goto L37
            androidx.media3.extractor.mp4.Mp4Extractor r0 = (androidx.media3.extractor.mp4.Mp4Extractor) r0
            java.util.ArrayList<androidx.media3.exoplayer.MediaExtractorCompat$MediaExtractorTrack> r2 = r5.tracks
            java.util.Set<java.lang.Integer> r3 = r5.selectedTrackIndices
            java.util.Iterator r3 = r3.iterator()
            java.lang.Object r3 = r3.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r2 = r2.get(r3)
            androidx.media3.exoplayer.MediaExtractorCompat$MediaExtractorTrack r2 = (androidx.media3.exoplayer.MediaExtractorCompat.MediaExtractorTrack) r2
            int r2 = r2.getIdOfBackingTrack()
            androidx.media3.extractor.SeekMap$SeekPoints r0 = r0.getSeekPoints(r6, r2)
            goto L3d
        L37:
            androidx.media3.extractor.SeekMap r0 = r5.seekMap
            androidx.media3.extractor.SeekMap$SeekPoints r0 = r0.getSeekPoints(r6)
        L3d:
            if (r8 == 0) goto L6a
            if (r8 == r1) goto L67
            r1 = 2
            if (r8 != r1) goto L61
            androidx.media3.extractor.SeekPoint r8 = r0.second
            long r1 = r8.timeUs
            long r1 = r6 - r1
            long r1 = java.lang.Math.abs(r1)
            androidx.media3.extractor.SeekPoint r8 = r0.first
            long r3 = r8.timeUs
            long r6 = r6 - r3
            long r6 = java.lang.Math.abs(r6)
            int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r6 >= 0) goto L5e
            androidx.media3.extractor.SeekPoint r6 = r0.second
            goto L6c
        L5e:
            androidx.media3.extractor.SeekPoint r6 = r0.first
            goto L6c
        L61:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>()
            throw r6
        L67:
            androidx.media3.extractor.SeekPoint r6 = r0.second
            goto L6c
        L6a:
            androidx.media3.extractor.SeekPoint r6 = r0.first
        L6c:
            androidx.media3.exoplayer.MediaExtractorCompat$SampleMetadataQueue r7 = r5.sampleMetadataQueue
            r7.clear()
            r7 = 0
        L72:
            android.util.SparseArray<androidx.media3.exoplayer.MediaExtractorCompat$MediaExtractorSampleQueue> r8 = r5.sampleQueues
            int r8 = r8.size()
            if (r7 >= r8) goto L88
            android.util.SparseArray<androidx.media3.exoplayer.MediaExtractorCompat$MediaExtractorSampleQueue> r8 = r5.sampleQueues
            java.lang.Object r8 = r8.valueAt(r7)
            androidx.media3.exoplayer.MediaExtractorCompat$MediaExtractorSampleQueue r8 = (androidx.media3.exoplayer.MediaExtractorCompat.MediaExtractorSampleQueue) r8
            r8.reset()
            int r7 = r7 + 1
            goto L72
        L88:
            r5.pendingSeek = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.MediaExtractorCompat.seekTo(long, int):void");
    }

    public void selectTrack(int i11) {
        this.selectedTrackIndices.add(Integer.valueOf(i11));
    }

    public void setDataSource(Uri uri, long j11) throws IOException {
        prepareDataSource(this.dataSourceFactory.createDataSource(), buildDataSpec(uri, j11));
    }

    @RequiresApi(31)
    public void setLogSessionId(LogSessionId logSessionId) {
        LogSessionId logSessionId2;
        boolean equals;
        logSessionId2 = LogSessionId.LOG_SESSION_ID_NONE;
        equals = logSessionId.equals(logSessionId2);
        if (equals) {
            return;
        }
        this.logSessionId = logSessionId;
    }

    public void unselectTrack(int i11) {
        this.selectedTrackIndices.remove(Integer.valueOf(i11));
    }

    public MediaExtractorCompat(ExtractorsFactory extractorsFactory, DataSource.Factory factory) {
        this.extractorsFactory = extractorsFactory;
        this.dataSourceFactory = factory;
        this.positionHolder = new PositionHolder();
        this.allocator = new DefaultAllocator(true, 65536);
        this.tracks = new ArrayList<>();
        this.sampleQueues = new SparseArray<>();
        this.sampleMetadataQueue = new SampleMetadataQueue();
        this.formatHolder = new FormatHolder();
        this.sampleHolderWithBufferReplacementDisabled = DecoderInputBuffer.newNoDataInstance();
        this.sampleHolderWithBufferReplacementEnabled = new DecoderInputBuffer(2);
        this.selectedTrackIndices = new HashSet();
    }

    public void setDataSource(AssetFileDescriptor assetFileDescriptor) throws IOException {
        if (assetFileDescriptor.getDeclaredLength() == -1) {
            setDataSource(assetFileDescriptor.getFileDescriptor());
        } else {
            setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getDeclaredLength());
        }
    }

    public void setDataSource(FileDescriptor fileDescriptor) throws IOException {
        setDataSource(fileDescriptor, 0L, -1L);
    }

    public void setDataSource(FileDescriptor fileDescriptor, long j11, long j12) throws IOException {
        prepareDataSource(new FileDescriptorDataSource(fileDescriptor, j11, j12), buildDataSpec(Uri.EMPTY, 0L));
    }

    public void setDataSource(Context context, Uri uri, @Nullable Map<String, String> map) throws IOException {
        AssetFileDescriptor openAssetFileDescriptor;
        String scheme = uri.getScheme();
        String path = uri.getPath();
        if ((scheme == null || scheme.equals("file")) && path != null) {
            setDataSource(path);
            return;
        }
        try {
            openAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(uri, en.r.f50027a);
        } catch (FileNotFoundException | SecurityException unused) {
        }
        if (openAssetFileDescriptor != null) {
            try {
                setDataSource(openAssetFileDescriptor);
                openAssetFileDescriptor.close();
                return;
            } catch (Throwable th2) {
                try {
                    openAssetFileDescriptor.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (openAssetFileDescriptor != null) {
            openAssetFileDescriptor.close();
        }
        setDataSource(uri.toString(), map);
    }

    public void setDataSource(String str) throws IOException {
        setDataSource(str, (Map<String, String>) null);
    }

    public void setDataSource(String str, @Nullable Map<String, String> map) throws IOException {
        this.httpRequestHeaders = map;
        prepareDataSource(this.dataSourceFactory.createDataSource(), buildDataSpec(Uri.parse(str), 0L));
    }

    @RequiresApi(23)
    public void setDataSource(MediaDataSource mediaDataSource) throws IOException {
        prepareDataSource(new MediaDataSourceAdapter(mediaDataSource, false), buildDataSpec(Uri.EMPTY, 0L));
    }
}
