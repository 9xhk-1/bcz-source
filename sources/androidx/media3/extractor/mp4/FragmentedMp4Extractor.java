package androidx.media3.extractor.mp4;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.collection.SieveCacheKt;
import androidx.media3.common.C;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.container.Mp4Box;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.container.ReorderingSeiMessageQueue;
import androidx.media3.extractor.CeaUtil;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SniffFailure;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.metadata.emsg.EventMessage;
import androidx.media3.extractor.metadata.emsg.EventMessageEncoder;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.SubtitleTranscodingExtractorOutput;
import com.google.common.collect.ImmutableList;
import ho.r;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public class FragmentedMp4Extractor implements Extractor {
    private static final int EXTRA_TRACKS_BASE_ID = 100;
    public static final int FLAG_EMIT_RAW_SUBTITLE_DATA = 32;
    public static final int FLAG_ENABLE_EMSG_TRACK = 4;
    public static final int FLAG_READ_WITHIN_GOP_SAMPLE_DEPENDENCIES = 64;
    public static final int FLAG_READ_WITHIN_GOP_SAMPLE_DEPENDENCIES_H265 = 128;
    public static final int FLAG_WORKAROUND_EVERY_VIDEO_FRAME_IS_SYNC_FRAME = 1;
    public static final int FLAG_WORKAROUND_IGNORE_EDIT_LISTS = 16;
    public static final int FLAG_WORKAROUND_IGNORE_TFDT_BOX = 2;
    private static final int SAMPLE_GROUP_TYPE_seig = 1936025959;
    private static final int STATE_READING_ATOM_HEADER = 0;
    private static final int STATE_READING_ATOM_PAYLOAD = 1;
    private static final int STATE_READING_ENCRYPTION_DATA = 2;
    private static final int STATE_READING_SAMPLE_CONTINUE = 4;
    private static final int STATE_READING_SAMPLE_START = 3;
    private static final String TAG = "FragmentedMp4Extractor";

    @Nullable
    private final TrackOutput additionalEmsgTrackOutput;

    @Nullable
    private ParsableByteArray atomData;
    private final ParsableByteArray atomHeader;
    private int atomHeaderBytesRead;
    private long atomSize;
    private int atomType;
    private TrackOutput[] ceaTrackOutputs;
    private final List<Format> closedCaptionFormats;
    private final ArrayDeque<Mp4Box.ContainerBox> containerAtoms;

    @Nullable
    private TrackBundle currentTrackBundle;
    private long durationUs;
    private TrackOutput[] emsgTrackOutputs;
    private long endOfMdatPosition;
    private final EventMessageEncoder eventMessageEncoder;
    private ExtractorOutput extractorOutput;
    private final int flags;
    private boolean haveOutputSeekMap;
    private boolean isSampleDependedOn;
    private ImmutableList<SniffFailure> lastSniffFailures;
    private final ParsableByteArray nalPrefix;
    private final ParsableByteArray nalStartCode;
    private final ParsableByteArray nalUnitWithoutHeaderBuffer;
    private int parserState;
    private int pendingMetadataSampleBytes;
    private final ArrayDeque<MetadataSampleInfo> pendingMetadataSampleInfos;
    private long pendingSeekTimeUs;
    private boolean processSeiNalUnitPayload;
    private final ReorderingSeiMessageQueue reorderingSeiMessageQueue;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private int sampleSize;
    private final ParsableByteArray scratch;
    private final byte[] scratchBytes;
    private long segmentIndexEarliestPresentationTimeUs;

    @Nullable
    private final Track sideloadedTrack;
    private final SubtitleParser.Factory subtitleParserFactory;

    @Nullable
    private final TimestampAdjuster timestampAdjuster;
    private final SparseArray<TrackBundle> trackBundles;

    @Deprecated
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: androidx.media3.extractor.mp4.b
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return FragmentedMp4Extractor.c();
        }
    };
    private static final byte[] PIFF_SAMPLE_ENCRYPTION_BOX_EXTENDED_TYPE = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final Format EMSG_FORMAT = new Format.Builder().setSampleMimeType(MimeTypes.APPLICATION_EMSG).build();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class MetadataSampleInfo {
        public final boolean sampleTimeIsRelative;
        public final long sampleTimeUs;
        public final int size;

        public MetadataSampleInfo(long j11, boolean z11, int i11) {
            this.sampleTimeUs = j11;
            this.sampleTimeIsRelative = z11;
            this.size = i11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class TrackBundle {
        private static final int SINGLE_SUBSAMPLE_ENCRYPTION_DATA_LENGTH = 8;
        private final String containerMimeType;
        public int currentSampleInTrackRun;
        public int currentSampleIndex;
        public int currentTrackRunIndex;
        private boolean currentlyInFragment;
        public DefaultSampleValues defaultSampleValues;
        public int firstSampleToOutputIndex;
        public TrackSampleTable moovSampleTable;
        public final TrackOutput output;
        public final TrackFragment fragment = new TrackFragment();
        public final ParsableByteArray scratch = new ParsableByteArray();
        private final ParsableByteArray encryptionSignalByte = new ParsableByteArray(1);
        private final ParsableByteArray defaultInitializationVector = new ParsableByteArray();

        public TrackBundle(TrackOutput trackOutput, TrackSampleTable trackSampleTable, DefaultSampleValues defaultSampleValues, String str) {
            this.output = trackOutput;
            this.moovSampleTable = trackSampleTable;
            this.defaultSampleValues = defaultSampleValues;
            this.containerMimeType = str;
            reset(trackSampleTable, defaultSampleValues);
        }

        public int getCurrentSampleFlags() {
            int i11 = !this.currentlyInFragment ? this.moovSampleTable.flags[this.currentSampleIndex] : this.fragment.sampleIsSyncFrameTable[this.currentSampleIndex] ? 1 : 0;
            return getEncryptionBoxIfEncrypted() != null ? i11 | 1073741824 : i11;
        }

        public long getCurrentSampleOffset() {
            return !this.currentlyInFragment ? this.moovSampleTable.offsets[this.currentSampleIndex] : this.fragment.trunDataPosition[this.currentTrackRunIndex];
        }

        public long getCurrentSamplePresentationTimeUs() {
            return !this.currentlyInFragment ? this.moovSampleTable.timestampsUs[this.currentSampleIndex] : this.fragment.getSamplePresentationTimeUs(this.currentSampleIndex);
        }

        public int getCurrentSampleSize() {
            return !this.currentlyInFragment ? this.moovSampleTable.sizes[this.currentSampleIndex] : this.fragment.sampleSizeTable[this.currentSampleIndex];
        }

        @Nullable
        public TrackEncryptionBox getEncryptionBoxIfEncrypted() {
            if (!this.currentlyInFragment) {
                return null;
            }
            int i11 = ((DefaultSampleValues) Util.castNonNull(this.fragment.header)).sampleDescriptionIndex;
            TrackEncryptionBox trackEncryptionBox = this.fragment.trackEncryptionBox;
            if (trackEncryptionBox == null) {
                trackEncryptionBox = this.moovSampleTable.track.getSampleDescriptionEncryptionBox(i11);
            }
            if (trackEncryptionBox == null || !trackEncryptionBox.isEncrypted) {
                return null;
            }
            return trackEncryptionBox;
        }

        public boolean next() {
            this.currentSampleIndex++;
            if (!this.currentlyInFragment) {
                return false;
            }
            int i11 = this.currentSampleInTrackRun + 1;
            this.currentSampleInTrackRun = i11;
            int[] iArr = this.fragment.trunLength;
            int i12 = this.currentTrackRunIndex;
            if (i11 != iArr[i12]) {
                return true;
            }
            this.currentTrackRunIndex = i12 + 1;
            this.currentSampleInTrackRun = 0;
            return false;
        }

        public int outputSampleEncryptionData(int i11, int i12) {
            ParsableByteArray parsableByteArray;
            TrackEncryptionBox encryptionBoxIfEncrypted = getEncryptionBoxIfEncrypted();
            if (encryptionBoxIfEncrypted == null) {
                return 0;
            }
            int i13 = encryptionBoxIfEncrypted.perSampleIvSize;
            if (i13 != 0) {
                parsableByteArray = this.fragment.sampleEncryptionData;
            } else {
                byte[] bArr = (byte[]) Util.castNonNull(encryptionBoxIfEncrypted.defaultInitializationVector);
                this.defaultInitializationVector.reset(bArr, bArr.length);
                ParsableByteArray parsableByteArray2 = this.defaultInitializationVector;
                i13 = bArr.length;
                parsableByteArray = parsableByteArray2;
            }
            boolean sampleHasSubsampleEncryptionTable = this.fragment.sampleHasSubsampleEncryptionTable(this.currentSampleIndex);
            boolean z11 = sampleHasSubsampleEncryptionTable || i12 != 0;
            this.encryptionSignalByte.getData()[0] = (byte) ((z11 ? 128 : 0) | i13);
            this.encryptionSignalByte.setPosition(0);
            this.output.sampleData(this.encryptionSignalByte, 1, 1);
            this.output.sampleData(parsableByteArray, i13, 1);
            if (!z11) {
                return i13 + 1;
            }
            if (!sampleHasSubsampleEncryptionTable) {
                this.scratch.reset(8);
                byte[] data = this.scratch.getData();
                data[0] = 0;
                data[1] = 1;
                data[2] = (byte) ((i12 >> 8) & 255);
                data[3] = (byte) (i12 & 255);
                data[4] = (byte) ((i11 >> 24) & 255);
                data[5] = (byte) ((i11 >> 16) & 255);
                data[6] = (byte) ((i11 >> 8) & 255);
                data[7] = (byte) (i11 & 255);
                this.output.sampleData(this.scratch, 8, 1);
                return i13 + 9;
            }
            ParsableByteArray parsableByteArray3 = this.fragment.sampleEncryptionData;
            int readUnsignedShort = parsableByteArray3.readUnsignedShort();
            parsableByteArray3.skipBytes(-2);
            int i14 = (readUnsignedShort * 6) + 2;
            if (i12 != 0) {
                this.scratch.reset(i14);
                byte[] data2 = this.scratch.getData();
                parsableByteArray3.readBytes(data2, 0, i14);
                int i15 = (((data2[2] & 255) << 8) | (data2[3] & 255)) + i12;
                data2[2] = (byte) ((i15 >> 8) & 255);
                data2[3] = (byte) (i15 & 255);
                parsableByteArray3 = this.scratch;
            }
            this.output.sampleData(parsableByteArray3, i14, 1);
            return i13 + 1 + i14;
        }

        public void reset(TrackSampleTable trackSampleTable, DefaultSampleValues defaultSampleValues) {
            this.moovSampleTable = trackSampleTable;
            this.defaultSampleValues = defaultSampleValues;
            this.output.format(trackSampleTable.track.format.buildUpon().setContainerMimeType(this.containerMimeType).build());
            resetFragmentInfo();
        }

        public void resetFragmentInfo() {
            this.fragment.reset();
            this.currentSampleIndex = 0;
            this.currentTrackRunIndex = 0;
            this.currentSampleInTrackRun = 0;
            this.firstSampleToOutputIndex = 0;
            this.currentlyInFragment = false;
        }

        public void seek(long j11) {
            int i11 = this.currentSampleIndex;
            while (true) {
                TrackFragment trackFragment = this.fragment;
                if (i11 >= trackFragment.sampleCount || trackFragment.getSamplePresentationTimeUs(i11) > j11) {
                    return;
                }
                if (this.fragment.sampleIsSyncFrameTable[i11]) {
                    this.firstSampleToOutputIndex = i11;
                }
                i11++;
            }
        }

        public void skipSampleEncryptionData() {
            TrackEncryptionBox encryptionBoxIfEncrypted = getEncryptionBoxIfEncrypted();
            if (encryptionBoxIfEncrypted == null) {
                return;
            }
            ParsableByteArray parsableByteArray = this.fragment.sampleEncryptionData;
            int i11 = encryptionBoxIfEncrypted.perSampleIvSize;
            if (i11 != 0) {
                parsableByteArray.skipBytes(i11);
            }
            if (this.fragment.sampleHasSubsampleEncryptionTable(this.currentSampleIndex)) {
                parsableByteArray.skipBytes(parsableByteArray.readUnsignedShort() * 6);
            }
        }

        public void updateDrmInitData(DrmInitData drmInitData) {
            TrackEncryptionBox sampleDescriptionEncryptionBox = this.moovSampleTable.track.getSampleDescriptionEncryptionBox(((DefaultSampleValues) Util.castNonNull(this.fragment.header)).sampleDescriptionIndex);
            this.output.format(this.moovSampleTable.track.format.buildUpon().setContainerMimeType(this.containerMimeType).setDrmInitData(drmInitData.copyWithSchemeType(sampleDescriptionEncryptionBox != null ? sampleDescriptionEncryptionBox.schemeType : null)).build());
        }
    }

    @Deprecated
    public FragmentedMp4Extractor() {
        this(SubtitleParser.Factory.UNSUPPORTED, 32, null, null, ImmutableList.of(), null);
    }

    public static /* synthetic */ Extractor[] b(SubtitleParser.Factory factory) {
        return new Extractor[]{new FragmentedMp4Extractor(factory)};
    }

    public static /* synthetic */ Extractor[] c() {
        return new Extractor[]{new FragmentedMp4Extractor(SubtitleParser.Factory.UNSUPPORTED, 32)};
    }

    private boolean canReadWithinGopSampleDependencies(Format format) {
        return Objects.equals(format.sampleMimeType, MimeTypes.VIDEO_H264) ? (this.flags & 64) != 0 : Objects.equals(format.sampleMimeType, MimeTypes.VIDEO_H265) && (this.flags & 128) != 0;
    }

    private static int checkNonNegative(int i11) throws ParserException {
        if (i11 >= 0) {
            return i11;
        }
        throw ParserException.createForMalformedContainer("Unexpected negative value: " + i11, null);
    }

    public static int codecsToParseWithinGopSampleDependenciesAsFlags(int i11) {
        int i12 = (i11 & 1) != 0 ? 64 : 0;
        return (i11 & 2) != 0 ? i12 | 128 : i12;
    }

    private void enterReadingAtomHeaderState() {
        this.parserState = 0;
        this.atomHeaderBytesRead = 0;
    }

    private DefaultSampleValues getDefaultSampleValues(SparseArray<DefaultSampleValues> sparseArray, int i11) {
        return sparseArray.size() == 1 ? sparseArray.valueAt(0) : (DefaultSampleValues) Assertions.checkNotNull(sparseArray.get(i11));
    }

    @Nullable
    private static DrmInitData getDrmInitDataFromAtoms(List<Mp4Box.LeafBox> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < size; i11++) {
            Mp4Box.LeafBox leafBox = list.get(i11);
            if (leafBox.type == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] data = leafBox.data.getData();
                UUID parseUuid = PsshAtomUtil.parseUuid(data);
                if (parseUuid == null) {
                    Log.w(TAG, "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(parseUuid, MimeTypes.VIDEO_MP4, data));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    @Nullable
    private static TrackBundle getNextTrackBundle(SparseArray<TrackBundle> sparseArray) {
        int size = sparseArray.size();
        TrackBundle trackBundle = null;
        long j11 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            TrackBundle valueAt = sparseArray.valueAt(i11);
            if ((valueAt.currentlyInFragment || valueAt.currentSampleIndex != valueAt.moovSampleTable.sampleCount) && (!valueAt.currentlyInFragment || valueAt.currentTrackRunIndex != valueAt.fragment.trunCount)) {
                long currentSampleOffset = valueAt.getCurrentSampleOffset();
                if (currentSampleOffset < j11) {
                    trackBundle = valueAt;
                    j11 = currentSampleOffset;
                }
            }
        }
        return trackBundle;
    }

    private void initExtraTracks() {
        int i11;
        TrackOutput[] trackOutputArr = new TrackOutput[2];
        this.emsgTrackOutputs = trackOutputArr;
        TrackOutput trackOutput = this.additionalEmsgTrackOutput;
        int i12 = 0;
        if (trackOutput != null) {
            trackOutputArr[0] = trackOutput;
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i13 = 100;
        if ((this.flags & 4) != 0) {
            trackOutputArr[i11] = this.extractorOutput.track(100, 5);
            i13 = 101;
            i11++;
        }
        TrackOutput[] trackOutputArr2 = (TrackOutput[]) Util.nullSafeArrayCopy(this.emsgTrackOutputs, i11);
        this.emsgTrackOutputs = trackOutputArr2;
        for (TrackOutput trackOutput2 : trackOutputArr2) {
            trackOutput2.format(EMSG_FORMAT);
        }
        this.ceaTrackOutputs = new TrackOutput[this.closedCaptionFormats.size()];
        while (i12 < this.ceaTrackOutputs.length) {
            TrackOutput track = this.extractorOutput.track(i13, 3);
            track.format(this.closedCaptionFormats.get(i12));
            this.ceaTrackOutputs[i12] = track;
            i12++;
            i13++;
        }
    }

    private static boolean isEdtsListDurationForEntireMediaTimeline(Track track) {
        long[] jArr = track.editListDurations;
        if (jArr != null && jArr.length == 1 && track.editListMediaTimes != null) {
            long j11 = jArr[0];
            if (j11 == 0 || Util.scaleLargeTimestamp(j11, 1000000L, track.movieTimescale) + Util.scaleLargeTimestamp(track.editListMediaTimes[0], 1000000L, track.timescale) >= track.durationUs) {
                return true;
            }
        }
        return false;
    }

    public static ExtractorsFactory newFactory(final SubtitleParser.Factory factory) {
        return new ExtractorsFactory() { // from class: androidx.media3.extractor.mp4.c
            @Override // androidx.media3.extractor.ExtractorsFactory
            public final Extractor[] createExtractors() {
                return FragmentedMp4Extractor.b(SubtitleParser.Factory.this);
            }
        };
    }

    private void onContainerAtomRead(Mp4Box.ContainerBox containerBox) throws ParserException {
        int i11 = containerBox.type;
        if (i11 == 1836019574) {
            onMoovContainerAtomRead(containerBox);
        } else if (i11 == 1836019558) {
            onMoofContainerAtomRead(containerBox);
        } else {
            if (this.containerAtoms.isEmpty()) {
                return;
            }
            this.containerAtoms.peek().add(containerBox);
        }
    }

    private void onEmsgLeafAtomRead(ParsableByteArray parsableByteArray) {
        String str;
        String str2;
        long scaleLargeTimestamp;
        long scaleLargeTimestamp2;
        long readUnsignedInt;
        long j11;
        if (this.emsgTrackOutputs.length == 0) {
            return;
        }
        parsableByteArray.setPosition(8);
        int parseFullBoxVersion = BoxParser.parseFullBoxVersion(parsableByteArray.readInt());
        if (parseFullBoxVersion == 0) {
            str = (String) Assertions.checkNotNull(parsableByteArray.readNullTerminatedString());
            str2 = (String) Assertions.checkNotNull(parsableByteArray.readNullTerminatedString());
            long readUnsignedInt2 = parsableByteArray.readUnsignedInt();
            scaleLargeTimestamp = Util.scaleLargeTimestamp(parsableByteArray.readUnsignedInt(), 1000000L, readUnsignedInt2);
            long j12 = this.segmentIndexEarliestPresentationTimeUs;
            long j13 = j12 != C.TIME_UNSET ? j12 + scaleLargeTimestamp : -9223372036854775807L;
            scaleLargeTimestamp2 = Util.scaleLargeTimestamp(parsableByteArray.readUnsignedInt(), 1000L, readUnsignedInt2);
            readUnsignedInt = parsableByteArray.readUnsignedInt();
            j11 = j13;
        } else {
            if (parseFullBoxVersion != 1) {
                Log.w(TAG, "Skipping unsupported emsg version: " + parseFullBoxVersion);
                return;
            }
            long readUnsignedInt3 = parsableByteArray.readUnsignedInt();
            j11 = Util.scaleLargeTimestamp(parsableByteArray.readUnsignedLongToLong(), 1000000L, readUnsignedInt3);
            long scaleLargeTimestamp3 = Util.scaleLargeTimestamp(parsableByteArray.readUnsignedInt(), 1000L, readUnsignedInt3);
            long readUnsignedInt4 = parsableByteArray.readUnsignedInt();
            str = (String) Assertions.checkNotNull(parsableByteArray.readNullTerminatedString());
            str2 = (String) Assertions.checkNotNull(parsableByteArray.readNullTerminatedString());
            scaleLargeTimestamp2 = scaleLargeTimestamp3;
            readUnsignedInt = readUnsignedInt4;
            scaleLargeTimestamp = -9223372036854775807L;
        }
        String str3 = str;
        String str4 = str2;
        byte[] bArr = new byte[parsableByteArray.bytesLeft()];
        parsableByteArray.readBytes(bArr, 0, parsableByteArray.bytesLeft());
        ParsableByteArray parsableByteArray2 = new ParsableByteArray(this.eventMessageEncoder.encode(new EventMessage(str3, str4, scaleLargeTimestamp2, readUnsignedInt, bArr)));
        int bytesLeft = parsableByteArray2.bytesLeft();
        for (TrackOutput trackOutput : this.emsgTrackOutputs) {
            parsableByteArray2.setPosition(0);
            trackOutput.sampleData(parsableByteArray2, bytesLeft);
        }
        if (j11 == C.TIME_UNSET) {
            this.pendingMetadataSampleInfos.addLast(new MetadataSampleInfo(scaleLargeTimestamp, true, bytesLeft));
            this.pendingMetadataSampleBytes += bytesLeft;
            return;
        }
        if (!this.pendingMetadataSampleInfos.isEmpty()) {
            this.pendingMetadataSampleInfos.addLast(new MetadataSampleInfo(j11, false, bytesLeft));
            this.pendingMetadataSampleBytes += bytesLeft;
            return;
        }
        TimestampAdjuster timestampAdjuster = this.timestampAdjuster;
        if (timestampAdjuster != null && !timestampAdjuster.isInitialized()) {
            this.pendingMetadataSampleInfos.addLast(new MetadataSampleInfo(j11, false, bytesLeft));
            this.pendingMetadataSampleBytes += bytesLeft;
            return;
        }
        TimestampAdjuster timestampAdjuster2 = this.timestampAdjuster;
        if (timestampAdjuster2 != null) {
            j11 = timestampAdjuster2.adjustSampleTimestamp(j11);
        }
        long j14 = j11;
        for (TrackOutput trackOutput2 : this.emsgTrackOutputs) {
            trackOutput2.sampleMetadata(j14, 1, bytesLeft, 0, null);
        }
    }

    private void onLeafAtomRead(Mp4Box.LeafBox leafBox, long j11) throws ParserException {
        if (!this.containerAtoms.isEmpty()) {
            this.containerAtoms.peek().add(leafBox);
            return;
        }
        int i11 = leafBox.type;
        if (i11 != 1936286840) {
            if (i11 == 1701671783) {
                onEmsgLeafAtomRead(leafBox.data);
            }
        } else {
            Pair<Long, ChunkIndex> parseSidx = parseSidx(leafBox.data, j11);
            this.segmentIndexEarliestPresentationTimeUs = ((Long) parseSidx.first).longValue();
            this.extractorOutput.seekMap((SeekMap) parseSidx.second);
            this.haveOutputSeekMap = true;
        }
    }

    private void onMoofContainerAtomRead(Mp4Box.ContainerBox containerBox) throws ParserException {
        parseMoof(containerBox, this.trackBundles, this.sideloadedTrack != null, this.flags, this.scratchBytes);
        DrmInitData drmInitDataFromAtoms = getDrmInitDataFromAtoms(containerBox.leafChildren);
        if (drmInitDataFromAtoms != null) {
            int size = this.trackBundles.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.trackBundles.valueAt(i11).updateDrmInitData(drmInitDataFromAtoms);
            }
        }
        if (this.pendingSeekTimeUs != C.TIME_UNSET) {
            int size2 = this.trackBundles.size();
            for (int i12 = 0; i12 < size2; i12++) {
                this.trackBundles.valueAt(i12).seek(this.pendingSeekTimeUs);
            }
            this.pendingSeekTimeUs = C.TIME_UNSET;
        }
    }

    private void onMoovContainerAtomRead(Mp4Box.ContainerBox containerBox) throws ParserException {
        int i11 = 0;
        Assertions.checkState(this.sideloadedTrack == null, "Unexpected moov box.");
        DrmInitData drmInitDataFromAtoms = getDrmInitDataFromAtoms(containerBox.leafChildren);
        Mp4Box.ContainerBox containerBox2 = (Mp4Box.ContainerBox) Assertions.checkNotNull(containerBox.getContainerBoxOfType(Mp4Box.TYPE_mvex));
        SparseArray<DefaultSampleValues> sparseArray = new SparseArray<>();
        int size = containerBox2.leafChildren.size();
        long j11 = -9223372036854775807L;
        for (int i12 = 0; i12 < size; i12++) {
            Mp4Box.LeafBox leafBox = containerBox2.leafChildren.get(i12);
            int i13 = leafBox.type;
            if (i13 == 1953654136) {
                Pair<Integer, DefaultSampleValues> parseTrex = parseTrex(leafBox.data);
                sparseArray.put(((Integer) parseTrex.first).intValue(), (DefaultSampleValues) parseTrex.second);
            } else if (i13 == 1835362404) {
                j11 = parseMehd(leafBox.data);
            }
        }
        List<TrackSampleTable> parseTraks = BoxParser.parseTraks(containerBox, new GaplessInfoHolder(), j11, drmInitDataFromAtoms, (this.flags & 16) != 0, false, new r() { // from class: androidx.media3.extractor.mp4.a
            @Override // ho.r
            public final Object apply(Object obj) {
                return FragmentedMp4Extractor.this.modifyTrack((Track) obj);
            }
        });
        int size2 = parseTraks.size();
        if (this.trackBundles.size() != 0) {
            Assertions.checkState(this.trackBundles.size() == size2);
            while (i11 < size2) {
                TrackSampleTable trackSampleTable = parseTraks.get(i11);
                Track track = trackSampleTable.track;
                this.trackBundles.get(track.f5229id).reset(trackSampleTable, getDefaultSampleValues(sparseArray, track.f5229id));
                i11++;
            }
            return;
        }
        String containerMimeType = MimeTypeResolver.getContainerMimeType(parseTraks);
        while (i11 < size2) {
            TrackSampleTable trackSampleTable2 = parseTraks.get(i11);
            Track track2 = trackSampleTable2.track;
            TrackOutput track3 = this.extractorOutput.track(i11, track2.type);
            track3.durationUs(track2.durationUs);
            this.trackBundles.put(track2.f5229id, new TrackBundle(track3, trackSampleTable2, getDefaultSampleValues(sparseArray, track2.f5229id), containerMimeType));
            this.durationUs = Math.max(this.durationUs, track2.durationUs);
            i11++;
        }
        this.extractorOutput.endTracks();
    }

    private void outputPendingMetadataSamples(long j11) {
        while (!this.pendingMetadataSampleInfos.isEmpty()) {
            MetadataSampleInfo removeFirst = this.pendingMetadataSampleInfos.removeFirst();
            this.pendingMetadataSampleBytes -= removeFirst.size;
            long j12 = removeFirst.sampleTimeUs;
            if (removeFirst.sampleTimeIsRelative) {
                j12 += j11;
            }
            TimestampAdjuster timestampAdjuster = this.timestampAdjuster;
            if (timestampAdjuster != null) {
                j12 = timestampAdjuster.adjustSampleTimestamp(j12);
            }
            long j13 = j12;
            for (TrackOutput trackOutput : this.emsgTrackOutputs) {
                trackOutput.sampleMetadata(j13, 1, removeFirst.size, this.pendingMetadataSampleBytes, null);
            }
        }
    }

    private static long parseMehd(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        return BoxParser.parseFullBoxVersion(parsableByteArray.readInt()) == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
    }

    private static void parseMoof(Mp4Box.ContainerBox containerBox, SparseArray<TrackBundle> sparseArray, boolean z11, int i11, byte[] bArr) throws ParserException {
        int size = containerBox.containerChildren.size();
        for (int i12 = 0; i12 < size; i12++) {
            Mp4Box.ContainerBox containerBox2 = containerBox.containerChildren.get(i12);
            if (containerBox2.type == 1953653094) {
                parseTraf(containerBox2, sparseArray, z11, i11, bArr);
            }
        }
    }

    private static void parseSaio(ParsableByteArray parsableByteArray, TrackFragment trackFragment) throws ParserException {
        parsableByteArray.setPosition(8);
        int readInt = parsableByteArray.readInt();
        if ((BoxParser.parseFullBoxFlags(readInt) & 1) == 1) {
            parsableByteArray.skipBytes(8);
        }
        int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        if (readUnsignedIntToInt == 1) {
            trackFragment.auxiliaryDataPosition += BoxParser.parseFullBoxVersion(readInt) == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
        } else {
            throw ParserException.createForMalformedContainer("Unexpected saio entry count: " + readUnsignedIntToInt, null);
        }
    }

    private static void parseSaiz(TrackEncryptionBox trackEncryptionBox, ParsableByteArray parsableByteArray, TrackFragment trackFragment) throws ParserException {
        int i11;
        int i12 = trackEncryptionBox.perSampleIvSize;
        parsableByteArray.setPosition(8);
        if ((BoxParser.parseFullBoxFlags(parsableByteArray.readInt()) & 1) == 1) {
            parsableByteArray.skipBytes(8);
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        if (readUnsignedIntToInt > trackFragment.sampleCount) {
            throw ParserException.createForMalformedContainer("Saiz sample count " + readUnsignedIntToInt + " is greater than fragment sample count" + trackFragment.sampleCount, null);
        }
        if (readUnsignedByte == 0) {
            boolean[] zArr = trackFragment.sampleHasSubsampleEncryptionTable;
            i11 = 0;
            for (int i13 = 0; i13 < readUnsignedIntToInt; i13++) {
                int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                i11 += readUnsignedByte2;
                zArr[i13] = readUnsignedByte2 > i12;
            }
        } else {
            i11 = readUnsignedByte * readUnsignedIntToInt;
            Arrays.fill(trackFragment.sampleHasSubsampleEncryptionTable, 0, readUnsignedIntToInt, readUnsignedByte > i12);
        }
        Arrays.fill(trackFragment.sampleHasSubsampleEncryptionTable, readUnsignedIntToInt, trackFragment.sampleCount, false);
        if (i11 > 0) {
            trackFragment.initEncryptionData(i11);
        }
    }

    private static void parseSampleGroups(Mp4Box.ContainerBox containerBox, @Nullable String str, TrackFragment trackFragment) throws ParserException {
        byte[] bArr = null;
        ParsableByteArray parsableByteArray = null;
        ParsableByteArray parsableByteArray2 = null;
        for (int i11 = 0; i11 < containerBox.leafChildren.size(); i11++) {
            Mp4Box.LeafBox leafBox = containerBox.leafChildren.get(i11);
            ParsableByteArray parsableByteArray3 = leafBox.data;
            int i12 = leafBox.type;
            if (i12 == 1935828848) {
                parsableByteArray3.setPosition(12);
                if (parsableByteArray3.readInt() == SAMPLE_GROUP_TYPE_seig) {
                    parsableByteArray = parsableByteArray3;
                }
            } else if (i12 == 1936158820) {
                parsableByteArray3.setPosition(12);
                if (parsableByteArray3.readInt() == SAMPLE_GROUP_TYPE_seig) {
                    parsableByteArray2 = parsableByteArray3;
                }
            }
        }
        if (parsableByteArray == null || parsableByteArray2 == null) {
            return;
        }
        parsableByteArray.setPosition(8);
        int parseFullBoxVersion = BoxParser.parseFullBoxVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(4);
        if (parseFullBoxVersion == 1) {
            parsableByteArray.skipBytes(4);
        }
        if (parsableByteArray.readInt() != 1) {
            throw ParserException.createForUnsupportedContainerFeature("Entry count in sbgp != 1 (unsupported).");
        }
        parsableByteArray2.setPosition(8);
        int parseFullBoxVersion2 = BoxParser.parseFullBoxVersion(parsableByteArray2.readInt());
        parsableByteArray2.skipBytes(4);
        if (parseFullBoxVersion2 == 1) {
            if (parsableByteArray2.readUnsignedInt() == 0) {
                throw ParserException.createForUnsupportedContainerFeature("Variable length description in sgpd found (unsupported)");
            }
        } else if (parseFullBoxVersion2 >= 2) {
            parsableByteArray2.skipBytes(4);
        }
        if (parsableByteArray2.readUnsignedInt() != 1) {
            throw ParserException.createForUnsupportedContainerFeature("Entry count in sgpd != 1 (unsupported).");
        }
        parsableByteArray2.skipBytes(1);
        int readUnsignedByte = parsableByteArray2.readUnsignedByte();
        int i13 = (readUnsignedByte & 240) >> 4;
        int i14 = readUnsignedByte & 15;
        boolean z11 = parsableByteArray2.readUnsignedByte() == 1;
        if (z11) {
            int readUnsignedByte2 = parsableByteArray2.readUnsignedByte();
            byte[] bArr2 = new byte[16];
            parsableByteArray2.readBytes(bArr2, 0, 16);
            if (readUnsignedByte2 == 0) {
                int readUnsignedByte3 = parsableByteArray2.readUnsignedByte();
                bArr = new byte[readUnsignedByte3];
                parsableByteArray2.readBytes(bArr, 0, readUnsignedByte3);
            }
            trackFragment.definesEncryptionData = true;
            trackFragment.trackEncryptionBox = new TrackEncryptionBox(z11, str, readUnsignedByte2, bArr2, i13, i14, bArr);
        }
    }

    private static void parseSenc(ParsableByteArray parsableByteArray, TrackFragment trackFragment) throws ParserException {
        parseSenc(parsableByteArray, 0, trackFragment);
    }

    private static Pair<Long, ChunkIndex> parseSidx(ParsableByteArray parsableByteArray, long j11) throws ParserException {
        long readUnsignedLongToLong;
        long readUnsignedLongToLong2;
        parsableByteArray.setPosition(8);
        int parseFullBoxVersion = BoxParser.parseFullBoxVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(4);
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        if (parseFullBoxVersion == 0) {
            readUnsignedLongToLong = parsableByteArray.readUnsignedInt();
            readUnsignedLongToLong2 = parsableByteArray.readUnsignedInt();
        } else {
            readUnsignedLongToLong = parsableByteArray.readUnsignedLongToLong();
            readUnsignedLongToLong2 = parsableByteArray.readUnsignedLongToLong();
        }
        long j12 = j11 + readUnsignedLongToLong2;
        long scaleLargeTimestamp = Util.scaleLargeTimestamp(readUnsignedLongToLong, 1000000L, readUnsignedInt);
        parsableByteArray.skipBytes(2);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int[] iArr = new int[readUnsignedShort];
        long[] jArr = new long[readUnsignedShort];
        long[] jArr2 = new long[readUnsignedShort];
        long[] jArr3 = new long[readUnsignedShort];
        long j13 = j12;
        long j14 = scaleLargeTimestamp;
        int i11 = 0;
        while (i11 < readUnsignedShort) {
            int readInt = parsableByteArray.readInt();
            if ((Integer.MIN_VALUE & readInt) != 0) {
                throw ParserException.createForMalformedContainer("Unhandled indirect reference", null);
            }
            long readUnsignedInt2 = parsableByteArray.readUnsignedInt();
            iArr[i11] = readInt & Integer.MAX_VALUE;
            jArr[i11] = j13;
            jArr3[i11] = j14;
            readUnsignedLongToLong += readUnsignedInt2;
            long[] jArr4 = jArr3;
            j14 = Util.scaleLargeTimestamp(readUnsignedLongToLong, 1000000L, readUnsignedInt);
            jArr2[i11] = j14 - jArr4[i11];
            parsableByteArray.skipBytes(4);
            j13 += iArr[i11];
            i11++;
            jArr3 = jArr4;
        }
        return Pair.create(Long.valueOf(scaleLargeTimestamp), new ChunkIndex(iArr, jArr, jArr2, jArr3));
    }

    private static long parseTfdt(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        return BoxParser.parseFullBoxVersion(parsableByteArray.readInt()) == 1 ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
    }

    @Nullable
    private static TrackBundle parseTfhd(ParsableByteArray parsableByteArray, SparseArray<TrackBundle> sparseArray, boolean z11) {
        parsableByteArray.setPosition(8);
        int parseFullBoxFlags = BoxParser.parseFullBoxFlags(parsableByteArray.readInt());
        TrackBundle valueAt = z11 ? sparseArray.valueAt(0) : sparseArray.get(parsableByteArray.readInt());
        if (valueAt == null) {
            return null;
        }
        if ((parseFullBoxFlags & 1) != 0) {
            long readUnsignedLongToLong = parsableByteArray.readUnsignedLongToLong();
            TrackFragment trackFragment = valueAt.fragment;
            trackFragment.dataPosition = readUnsignedLongToLong;
            trackFragment.auxiliaryDataPosition = readUnsignedLongToLong;
        }
        DefaultSampleValues defaultSampleValues = valueAt.defaultSampleValues;
        valueAt.fragment.header = new DefaultSampleValues((parseFullBoxFlags & 2) != 0 ? parsableByteArray.readInt() - 1 : defaultSampleValues.sampleDescriptionIndex, (parseFullBoxFlags & 8) != 0 ? parsableByteArray.readInt() : defaultSampleValues.duration, (parseFullBoxFlags & 16) != 0 ? parsableByteArray.readInt() : defaultSampleValues.size, (parseFullBoxFlags & 32) != 0 ? parsableByteArray.readInt() : defaultSampleValues.flags);
        return valueAt;
    }

    private static void parseTraf(Mp4Box.ContainerBox containerBox, SparseArray<TrackBundle> sparseArray, boolean z11, int i11, byte[] bArr) throws ParserException {
        TrackBundle parseTfhd = parseTfhd(((Mp4Box.LeafBox) Assertions.checkNotNull(containerBox.getLeafBoxOfType(Mp4Box.TYPE_tfhd))).data, sparseArray, z11);
        if (parseTfhd == null) {
            return;
        }
        TrackFragment trackFragment = parseTfhd.fragment;
        long j11 = trackFragment.nextFragmentDecodeTime;
        boolean z12 = trackFragment.nextFragmentDecodeTimeIncludesMoov;
        parseTfhd.resetFragmentInfo();
        parseTfhd.currentlyInFragment = true;
        Mp4Box.LeafBox leafBoxOfType = containerBox.getLeafBoxOfType(Mp4Box.TYPE_tfdt);
        if (leafBoxOfType == null || (i11 & 2) != 0) {
            trackFragment.nextFragmentDecodeTime = j11;
            trackFragment.nextFragmentDecodeTimeIncludesMoov = z12;
        } else {
            trackFragment.nextFragmentDecodeTime = parseTfdt(leafBoxOfType.data);
            trackFragment.nextFragmentDecodeTimeIncludesMoov = true;
        }
        parseTruns(containerBox, parseTfhd, i11);
        TrackEncryptionBox sampleDescriptionEncryptionBox = parseTfhd.moovSampleTable.track.getSampleDescriptionEncryptionBox(((DefaultSampleValues) Assertions.checkNotNull(trackFragment.header)).sampleDescriptionIndex);
        Mp4Box.LeafBox leafBoxOfType2 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_saiz);
        if (leafBoxOfType2 != null) {
            parseSaiz((TrackEncryptionBox) Assertions.checkNotNull(sampleDescriptionEncryptionBox), leafBoxOfType2.data, trackFragment);
        }
        Mp4Box.LeafBox leafBoxOfType3 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_saio);
        if (leafBoxOfType3 != null) {
            parseSaio(leafBoxOfType3.data, trackFragment);
        }
        Mp4Box.LeafBox leafBoxOfType4 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_senc);
        if (leafBoxOfType4 != null) {
            parseSenc(leafBoxOfType4.data, trackFragment);
        }
        parseSampleGroups(containerBox, sampleDescriptionEncryptionBox != null ? sampleDescriptionEncryptionBox.schemeType : null, trackFragment);
        int size = containerBox.leafChildren.size();
        for (int i12 = 0; i12 < size; i12++) {
            Mp4Box.LeafBox leafBox = containerBox.leafChildren.get(i12);
            if (leafBox.type == 1970628964) {
                parseUuid(leafBox.data, trackFragment, bArr);
            }
        }
    }

    private static Pair<Integer, DefaultSampleValues> parseTrex(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(12);
        return Pair.create(Integer.valueOf(parsableByteArray.readInt()), new DefaultSampleValues(parsableByteArray.readInt() - 1, parsableByteArray.readInt(), parsableByteArray.readInt(), parsableByteArray.readInt()));
    }

    private static int parseTrun(TrackBundle trackBundle, int i11, int i12, ParsableByteArray parsableByteArray, int i13) throws ParserException {
        boolean z11;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        parsableByteArray.setPosition(8);
        int parseFullBoxFlags = BoxParser.parseFullBoxFlags(parsableByteArray.readInt());
        Track track = trackBundle.moovSampleTable.track;
        TrackFragment trackFragment = trackBundle.fragment;
        DefaultSampleValues defaultSampleValues = (DefaultSampleValues) Util.castNonNull(trackFragment.header);
        trackFragment.trunLength[i11] = parsableByteArray.readUnsignedIntToInt();
        long[] jArr = trackFragment.trunDataPosition;
        long j11 = trackFragment.dataPosition;
        jArr[i11] = j11;
        if ((parseFullBoxFlags & 1) != 0) {
            jArr[i11] = j11 + parsableByteArray.readInt();
        }
        boolean z12 = (parseFullBoxFlags & 4) != 0;
        int i22 = defaultSampleValues.flags;
        if (z12) {
            i22 = parsableByteArray.readInt();
        }
        boolean z13 = (parseFullBoxFlags & 256) != 0;
        boolean z14 = (parseFullBoxFlags & 512) != 0;
        boolean z15 = (parseFullBoxFlags & 1024) != 0;
        boolean z16 = (parseFullBoxFlags & 2048) != 0;
        long j12 = isEdtsListDurationForEntireMediaTimeline(track) ? ((long[]) Util.castNonNull(track.editListMediaTimes))[0] : 0L;
        int[] iArr = trackFragment.sampleSizeTable;
        long[] jArr2 = trackFragment.samplePresentationTimesUs;
        boolean[] zArr = trackFragment.sampleIsSyncFrameTable;
        boolean z17 = z16;
        boolean z18 = track.type == 2 && (i12 & 1) != 0;
        int i23 = i13 + trackFragment.trunLength[i11];
        boolean z19 = z12;
        long j13 = track.timescale;
        long j14 = trackFragment.nextFragmentDecodeTime;
        int i24 = i13;
        while (i24 < i23) {
            if (z13) {
                i14 = parsableByteArray.readInt();
                z11 = z18;
            } else {
                z11 = z18;
                i14 = defaultSampleValues.duration;
            }
            int checkNonNegative = checkNonNegative(i14);
            if (z14) {
                i16 = parsableByteArray.readInt();
                i15 = i23;
            } else {
                i15 = i23;
                i16 = defaultSampleValues.size;
            }
            int checkNonNegative2 = checkNonNegative(i16);
            if (z15) {
                i17 = checkNonNegative2;
                i18 = parsableByteArray.readInt();
            } else if (i24 == 0 && z19) {
                i17 = checkNonNegative2;
                i18 = i22;
            } else {
                i17 = checkNonNegative2;
                i18 = defaultSampleValues.flags;
            }
            if (z17) {
                i19 = i18;
                i21 = parsableByteArray.readInt();
            } else {
                i19 = i18;
                i21 = 0;
            }
            int i25 = i24;
            long scaleLargeTimestamp = Util.scaleLargeTimestamp((i21 + j14) - j12, 1000000L, j13);
            jArr2[i25] = scaleLargeTimestamp;
            if (!trackFragment.nextFragmentDecodeTimeIncludesMoov) {
                jArr2[i25] = scaleLargeTimestamp + trackBundle.moovSampleTable.durationUs;
            }
            iArr[i25] = i17;
            zArr[i25] = ((i19 >> 16) & 1) == 0 && (!z11 || i25 == 0);
            j14 += checkNonNegative;
            i24 = i25 + 1;
            i23 = i15;
            z18 = z11;
        }
        int i26 = i23;
        trackFragment.nextFragmentDecodeTime = j14;
        return i26;
    }

    private static void parseTruns(Mp4Box.ContainerBox containerBox, TrackBundle trackBundle, int i11) throws ParserException {
        List<Mp4Box.LeafBox> list = containerBox.leafChildren;
        int size = list.size();
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            Mp4Box.LeafBox leafBox = list.get(i14);
            if (leafBox.type == 1953658222) {
                ParsableByteArray parsableByteArray = leafBox.data;
                parsableByteArray.setPosition(12);
                int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
                if (readUnsignedIntToInt > 0) {
                    i13 += readUnsignedIntToInt;
                    i12++;
                }
            }
        }
        trackBundle.currentTrackRunIndex = 0;
        trackBundle.currentSampleInTrackRun = 0;
        trackBundle.currentSampleIndex = 0;
        trackBundle.fragment.initTables(i12, i13);
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < size; i17++) {
            Mp4Box.LeafBox leafBox2 = list.get(i17);
            if (leafBox2.type == 1953658222) {
                i16 = parseTrun(trackBundle, i15, i11, leafBox2.data, i16);
                i15++;
            }
        }
    }

    private static void parseUuid(ParsableByteArray parsableByteArray, TrackFragment trackFragment, byte[] bArr) throws ParserException {
        parsableByteArray.setPosition(8);
        parsableByteArray.readBytes(bArr, 0, 16);
        if (Arrays.equals(bArr, PIFF_SAMPLE_ENCRYPTION_BOX_EXTENDED_TYPE)) {
            parseSenc(parsableByteArray, 16, trackFragment);
        }
    }

    private void processAtomEnded(long j11) throws ParserException {
        while (!this.containerAtoms.isEmpty() && this.containerAtoms.peek().endPosition == j11) {
            onContainerAtomRead(this.containerAtoms.pop());
        }
        enterReadingAtomHeaderState();
    }

    private boolean readAtomHeader(ExtractorInput extractorInput) throws IOException {
        if (this.atomHeaderBytesRead == 0) {
            if (!extractorInput.readFully(this.atomHeader.getData(), 0, 8, true)) {
                return false;
            }
            this.atomHeaderBytesRead = 8;
            this.atomHeader.setPosition(0);
            this.atomSize = this.atomHeader.readUnsignedInt();
            this.atomType = this.atomHeader.readInt();
        }
        long j11 = this.atomSize;
        if (j11 == 1) {
            extractorInput.readFully(this.atomHeader.getData(), 8, 8);
            this.atomHeaderBytesRead += 8;
            this.atomSize = this.atomHeader.readUnsignedLongToLong();
        } else if (j11 == 0) {
            long length = extractorInput.getLength();
            if (length == -1 && !this.containerAtoms.isEmpty()) {
                length = this.containerAtoms.peek().endPosition;
            }
            if (length != -1) {
                this.atomSize = (length - extractorInput.getPosition()) + this.atomHeaderBytesRead;
            }
        }
        if (this.atomSize < this.atomHeaderBytesRead) {
            throw ParserException.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
        }
        long position = extractorInput.getPosition() - this.atomHeaderBytesRead;
        int i11 = this.atomType;
        if ((i11 == 1836019558 || i11 == 1835295092) && !this.haveOutputSeekMap) {
            this.extractorOutput.seekMap(new SeekMap.Unseekable(this.durationUs, position));
            this.haveOutputSeekMap = true;
        }
        if (this.atomType == 1836019558) {
            int size = this.trackBundles.size();
            for (int i12 = 0; i12 < size; i12++) {
                TrackFragment trackFragment = this.trackBundles.valueAt(i12).fragment;
                trackFragment.atomPosition = position;
                trackFragment.auxiliaryDataPosition = position;
                trackFragment.dataPosition = position;
            }
        }
        int i13 = this.atomType;
        if (i13 == 1835295092) {
            this.currentTrackBundle = null;
            this.endOfMdatPosition = position + this.atomSize;
            this.parserState = 2;
            return true;
        }
        if (shouldParseContainerAtom(i13)) {
            long position2 = (extractorInput.getPosition() + this.atomSize) - 8;
            this.containerAtoms.push(new Mp4Box.ContainerBox(this.atomType, position2));
            if (this.atomSize == this.atomHeaderBytesRead) {
                processAtomEnded(position2);
            } else {
                enterReadingAtomHeaderState();
            }
        } else if (shouldParseLeafAtom(this.atomType)) {
            if (this.atomHeaderBytesRead != 8) {
                throw ParserException.createForUnsupportedContainerFeature("Leaf atom defines extended atom size (unsupported).");
            }
            if (this.atomSize > SieveCacheKt.NodeLinkMask) {
                throw ParserException.createForUnsupportedContainerFeature("Leaf atom with length > 2147483647 (unsupported).");
            }
            ParsableByteArray parsableByteArray = new ParsableByteArray((int) this.atomSize);
            System.arraycopy(this.atomHeader.getData(), 0, parsableByteArray.getData(), 0, 8);
            this.atomData = parsableByteArray;
            this.parserState = 1;
        } else {
            if (this.atomSize > SieveCacheKt.NodeLinkMask) {
                throw ParserException.createForUnsupportedContainerFeature("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.atomData = null;
            this.parserState = 1;
        }
        return true;
    }

    private void readAtomPayload(ExtractorInput extractorInput) throws IOException {
        int i11 = (int) (this.atomSize - this.atomHeaderBytesRead);
        ParsableByteArray parsableByteArray = this.atomData;
        if (parsableByteArray != null) {
            extractorInput.readFully(parsableByteArray.getData(), 8, i11);
            onLeafAtomRead(new Mp4Box.LeafBox(this.atomType, parsableByteArray), extractorInput.getPosition());
        } else {
            extractorInput.skipFully(i11);
        }
        processAtomEnded(extractorInput.getPosition());
    }

    private void readEncryptionData(ExtractorInput extractorInput) throws IOException {
        int size = this.trackBundles.size();
        long j11 = Long.MAX_VALUE;
        TrackBundle trackBundle = null;
        for (int i11 = 0; i11 < size; i11++) {
            TrackFragment trackFragment = this.trackBundles.valueAt(i11).fragment;
            if (trackFragment.sampleEncryptionDataNeedsFill) {
                long j12 = trackFragment.auxiliaryDataPosition;
                if (j12 < j11) {
                    trackBundle = this.trackBundles.valueAt(i11);
                    j11 = j12;
                }
            }
        }
        if (trackBundle == null) {
            this.parserState = 3;
            return;
        }
        int position = (int) (j11 - extractorInput.getPosition());
        if (position < 0) {
            throw ParserException.createForMalformedContainer("Offset to encryption data was negative.", null);
        }
        extractorInput.skipFully(position);
        trackBundle.fragment.fillEncryptionData(extractorInput);
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0110, code lost:
    
        if ((r5.nalUnitLengthFieldLength + r14) <= (r16.sampleSize - r16.sampleBytesWritten)) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean readSample(androidx.media3.extractor.ExtractorInput r17) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.FragmentedMp4Extractor.readSample(androidx.media3.extractor.ExtractorInput):boolean");
    }

    private static boolean shouldParseContainerAtom(int i11) {
        return i11 == 1836019574 || i11 == 1953653099 || i11 == 1835297121 || i11 == 1835626086 || i11 == 1937007212 || i11 == 1836019558 || i11 == 1953653094 || i11 == 1836475768 || i11 == 1701082227;
    }

    private static boolean shouldParseLeafAtom(int i11) {
        return i11 == 1751411826 || i11 == 1835296868 || i11 == 1836476516 || i11 == 1936286840 || i11 == 1937011556 || i11 == 1937011827 || i11 == 1668576371 || i11 == 1937011555 || i11 == 1937011578 || i11 == 1937013298 || i11 == 1937007471 || i11 == 1668232756 || i11 == 1937011571 || i11 == 1952867444 || i11 == 1952868452 || i11 == 1953196132 || i11 == 1953654136 || i11 == 1953658222 || i11 == 1886614376 || i11 == 1935763834 || i11 == 1935763823 || i11 == 1936027235 || i11 == 1970628964 || i11 == 1935828848 || i11 == 1936158820 || i11 == 1701606260 || i11 == 1835362404 || i11 == 1701671783;
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        if ((this.flags & 32) == 0) {
            extractorOutput = new SubtitleTranscodingExtractorOutput(extractorOutput, this.subtitleParserFactory);
        }
        this.extractorOutput = extractorOutput;
        enterReadingAtomHeaderState();
        initExtraTracks();
        Track track = this.sideloadedTrack;
        if (track != null) {
            this.trackBundles.put(0, new TrackBundle(this.extractorOutput.track(0, track.type), new TrackSampleTable(this.sideloadedTrack, new long[0], new int[0], 0, new long[0], new int[0], 0L), new DefaultSampleValues(0, 0, 0, 0), MimeTypeResolver.getContainerMimeType(this.sideloadedTrack.format)));
            this.extractorOutput.endTracks();
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        while (true) {
            int i11 = this.parserState;
            if (i11 != 0) {
                if (i11 == 1) {
                    readAtomPayload(extractorInput);
                } else if (i11 == 2) {
                    readEncryptionData(extractorInput);
                } else if (readSample(extractorInput)) {
                    return 0;
                }
            } else if (!readAtomHeader(extractorInput)) {
                this.reorderingSeiMessageQueue.flush();
                return -1;
            }
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j11, long j12) {
        int size = this.trackBundles.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.trackBundles.valueAt(i11).resetFragmentInfo();
        }
        this.pendingMetadataSampleInfos.clear();
        this.pendingMetadataSampleBytes = 0;
        this.reorderingSeiMessageQueue.clear();
        this.pendingSeekTimeUs = j12;
        this.containerAtoms.clear();
        enterReadingAtomHeaderState();
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        SniffFailure sniffFragmented = Sniffer.sniffFragmented(extractorInput);
        this.lastSniffFailures = sniffFragmented != null ? ImmutableList.of(sniffFragmented) : ImmutableList.of();
        return sniffFragmented == null;
    }

    private static void parseSenc(ParsableByteArray parsableByteArray, int i11, TrackFragment trackFragment) throws ParserException {
        parsableByteArray.setPosition(i11 + 8);
        int parseFullBoxFlags = BoxParser.parseFullBoxFlags(parsableByteArray.readInt());
        if ((parseFullBoxFlags & 1) != 0) {
            throw ParserException.createForUnsupportedContainerFeature("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z11 = (parseFullBoxFlags & 2) != 0;
        int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        if (readUnsignedIntToInt == 0) {
            Arrays.fill(trackFragment.sampleHasSubsampleEncryptionTable, 0, trackFragment.sampleCount, false);
            return;
        }
        if (readUnsignedIntToInt == trackFragment.sampleCount) {
            Arrays.fill(trackFragment.sampleHasSubsampleEncryptionTable, 0, readUnsignedIntToInt, z11);
            trackFragment.initEncryptionData(parsableByteArray.bytesLeft());
            trackFragment.fillEncryptionData(parsableByteArray);
        } else {
            throw ParserException.createForMalformedContainer("Senc sample count " + readUnsignedIntToInt + " is different from fragment sample count" + trackFragment.sampleCount, null);
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public ImmutableList<SniffFailure> getSniffFailureDetails() {
        return this.lastSniffFailures;
    }

    public FragmentedMp4Extractor(SubtitleParser.Factory factory) {
        this(factory, 0, null, null, ImmutableList.of(), null);
    }

    @Deprecated
    public FragmentedMp4Extractor(int i11) {
        this(SubtitleParser.Factory.UNSUPPORTED, i11 | 32, null, null, ImmutableList.of(), null);
    }

    public FragmentedMp4Extractor(SubtitleParser.Factory factory, int i11) {
        this(factory, i11, null, null, ImmutableList.of(), null);
    }

    @Deprecated
    public FragmentedMp4Extractor(int i11, @Nullable TimestampAdjuster timestampAdjuster) {
        this(SubtitleParser.Factory.UNSUPPORTED, i11 | 32, timestampAdjuster, null, ImmutableList.of(), null);
    }

    @Deprecated
    public FragmentedMp4Extractor(int i11, @Nullable TimestampAdjuster timestampAdjuster, @Nullable Track track) {
        this(SubtitleParser.Factory.UNSUPPORTED, i11 | 32, timestampAdjuster, track, ImmutableList.of(), null);
    }

    @Deprecated
    public FragmentedMp4Extractor(int i11, @Nullable TimestampAdjuster timestampAdjuster, @Nullable Track track, List<Format> list) {
        this(SubtitleParser.Factory.UNSUPPORTED, i11 | 32, timestampAdjuster, track, list, null);
    }

    @Deprecated
    public FragmentedMp4Extractor(int i11, @Nullable TimestampAdjuster timestampAdjuster, @Nullable Track track, List<Format> list, @Nullable TrackOutput trackOutput) {
        this(SubtitleParser.Factory.UNSUPPORTED, i11 | 32, timestampAdjuster, track, list, trackOutput);
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    public FragmentedMp4Extractor(SubtitleParser.Factory factory, int i11, @Nullable TimestampAdjuster timestampAdjuster, @Nullable Track track, List<Format> list, @Nullable TrackOutput trackOutput) {
        this.subtitleParserFactory = factory;
        this.flags = i11;
        this.timestampAdjuster = timestampAdjuster;
        this.sideloadedTrack = track;
        this.closedCaptionFormats = Collections.unmodifiableList(list);
        this.additionalEmsgTrackOutput = trackOutput;
        this.eventMessageEncoder = new EventMessageEncoder();
        this.atomHeader = new ParsableByteArray(16);
        this.nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.nalPrefix = new ParsableByteArray(6);
        this.nalUnitWithoutHeaderBuffer = new ParsableByteArray();
        byte[] bArr = new byte[16];
        this.scratchBytes = bArr;
        this.scratch = new ParsableByteArray(bArr);
        this.containerAtoms = new ArrayDeque<>();
        this.pendingMetadataSampleInfos = new ArrayDeque<>();
        this.trackBundles = new SparseArray<>();
        this.lastSniffFailures = ImmutableList.of();
        this.durationUs = C.TIME_UNSET;
        this.pendingSeekTimeUs = C.TIME_UNSET;
        this.segmentIndexEarliestPresentationTimeUs = C.TIME_UNSET;
        this.extractorOutput = ExtractorOutput.PLACEHOLDER;
        this.emsgTrackOutputs = new TrackOutput[0];
        this.ceaTrackOutputs = new TrackOutput[0];
        this.reorderingSeiMessageQueue = new ReorderingSeiMessageQueue(new ReorderingSeiMessageQueue.SeiConsumer() { // from class: androidx.media3.extractor.mp4.d
            @Override // androidx.media3.container.ReorderingSeiMessageQueue.SeiConsumer
            public final void consume(long j11, ParsableByteArray parsableByteArray) {
                CeaUtil.consume(j11, parsableByteArray, FragmentedMp4Extractor.this.ceaTrackOutputs);
            }
        });
    }

    @Nullable
    public Track modifyTrack(@Nullable Track track) {
        return track;
    }
}
