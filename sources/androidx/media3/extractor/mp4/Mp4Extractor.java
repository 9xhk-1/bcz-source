package androidx.media3.extractor.mp4;

import androidx.annotation.Nullable;
import androidx.collection.SieveCacheKt;
import androidx.media3.common.C;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.Mp4Box;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.Ac4Util;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SniffFailure;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.TrueHdSampleRechunker;
import androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
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
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class Mp4Extractor implements Extractor, SeekMap {

    @Deprecated
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: androidx.media3.extractor.mp4.g
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return Mp4Extractor.c();
        }
    };
    private static final int FILE_TYPE_HEIC = 2;
    private static final int FILE_TYPE_MP4 = 0;
    private static final int FILE_TYPE_QUICKTIME = 1;
    public static final int FLAG_EMIT_RAW_SUBTITLE_DATA = 16;
    public static final int FLAG_MARK_FIRST_VIDEO_TRACK_WITH_MAIN_ROLE = 8;
    public static final int FLAG_READ_AUXILIARY_TRACKS = 64;
    public static final int FLAG_READ_MOTION_PHOTO_METADATA = 2;
    public static final int FLAG_READ_SEF_DATA = 4;
    public static final int FLAG_READ_WITHIN_GOP_SAMPLE_DEPENDENCIES = 32;
    public static final int FLAG_READ_WITHIN_GOP_SAMPLE_DEPENDENCIES_H265 = 128;
    public static final int FLAG_WORKAROUND_IGNORE_EDIT_LISTS = 1;
    private static final long MAXIMUM_READ_AHEAD_BYTES_STREAM = 10485760;
    private static final long RELOAD_MINIMUM_SEEK_DISTANCE = 262144;
    private static final int STATE_READING_ATOM_HEADER = 0;
    private static final int STATE_READING_ATOM_PAYLOAD = 1;
    private static final int STATE_READING_SAMPLE = 2;
    private static final int STATE_READING_SEF = 3;
    private long[][] accumulatedSampleSizes;

    @Nullable
    private ParsableByteArray atomData;
    private final ParsableByteArray atomHeader;
    private int atomHeaderBytesRead;
    private long atomSize;
    private int atomType;
    private long axteAtomOffset;
    private final ArrayDeque<Mp4Box.ContainerBox> containerAtoms;
    private long durationUs;
    private ExtractorOutput extractorOutput;
    private int fileType;
    private int firstVideoTrackIndex;
    private final int flags;
    private boolean isSampleDependedOn;
    private ImmutableList<SniffFailure> lastSniffFailures;

    @Nullable
    private MotionPhotoMetadata motionPhotoMetadata;
    private final ParsableByteArray nalPrefix;
    private final ParsableByteArray nalStartCode;
    private int parserState;
    private boolean readingAuxiliaryTracks;
    private int sampleBytesRead;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private long sampleOffsetForAuxiliaryTracks;
    private int sampleTrackIndex;
    private final ParsableByteArray scratch;
    private boolean seekToAxteAtom;
    private boolean seenFtypAtom;
    private final SefReader sefReader;
    private final List<Metadata.Entry> slowMotionMetadataEntries;
    private final SubtitleParser.Factory subtitleParserFactory;
    private Mp4Track[] tracks;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Mp4Track {
        public int sampleIndex;
        public final TrackSampleTable sampleTable;
        public final Track track;
        public final TrackOutput trackOutput;

        @Nullable
        public final TrueHdSampleRechunker trueHdSampleRechunker;

        public Mp4Track(Track track, TrackSampleTable trackSampleTable, TrackOutput trackOutput) {
            this.track = track;
            this.sampleTable = trackSampleTable;
            this.trackOutput = trackOutput;
            this.trueHdSampleRechunker = MimeTypes.AUDIO_TRUEHD.equals(track.format.sampleMimeType) ? new TrueHdSampleRechunker() : null;
        }
    }

    @Deprecated
    public Mp4Extractor() {
        this(SubtitleParser.Factory.UNSUPPORTED, 16);
    }

    public static /* synthetic */ Extractor[] b(SubtitleParser.Factory factory) {
        return new Extractor[]{new Mp4Extractor(factory)};
    }

    private static int brandToFileType(int i11) {
        if (i11 != 1751476579) {
            return i11 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    public static /* synthetic */ Extractor[] c() {
        return new Extractor[]{new Mp4Extractor(SubtitleParser.Factory.UNSUPPORTED, 16)};
    }

    private static long[][] calculateAccumulatedSampleSizes(Mp4Track[] mp4TrackArr) {
        long[][] jArr = new long[mp4TrackArr.length][];
        int[] iArr = new int[mp4TrackArr.length];
        long[] jArr2 = new long[mp4TrackArr.length];
        boolean[] zArr = new boolean[mp4TrackArr.length];
        for (int i11 = 0; i11 < mp4TrackArr.length; i11++) {
            jArr[i11] = new long[mp4TrackArr[i11].sampleTable.sampleCount];
            jArr2[i11] = mp4TrackArr[i11].sampleTable.timestampsUs[0];
        }
        long j11 = 0;
        int i12 = 0;
        while (i12 < mp4TrackArr.length) {
            long j12 = Long.MAX_VALUE;
            int i13 = -1;
            for (int i14 = 0; i14 < mp4TrackArr.length; i14++) {
                if (!zArr[i14]) {
                    long j13 = jArr2[i14];
                    if (j13 <= j12) {
                        i13 = i14;
                        j12 = j13;
                    }
                }
            }
            int i15 = iArr[i13];
            long[] jArr3 = jArr[i13];
            jArr3[i15] = j11;
            TrackSampleTable trackSampleTable = mp4TrackArr[i13].sampleTable;
            j11 += trackSampleTable.sizes[i15];
            int i16 = i15 + 1;
            iArr[i13] = i16;
            if (i16 < jArr3.length) {
                jArr2[i13] = trackSampleTable.timestampsUs[i16];
            } else {
                zArr[i13] = true;
                i12++;
            }
        }
        return jArr;
    }

    private boolean canReadWithinGopSampleDependencies(Format format) {
        return Objects.equals(format.sampleMimeType, MimeTypes.VIDEO_H264) ? (this.flags & 32) != 0 : Objects.equals(format.sampleMimeType, MimeTypes.VIDEO_H265) && (this.flags & 128) != 0;
    }

    public static int codecsToParseWithinGopSampleDependenciesAsFlags(int i11) {
        int i12 = (i11 & 1) != 0 ? 32 : 0;
        return (i11 & 2) != 0 ? i12 | 128 : i12;
    }

    private void enterReadingAtomHeaderState() {
        this.parserState = 0;
        this.atomHeaderBytesRead = 0;
    }

    private List<Integer> getAuxiliaryTrackTypesForAuxiliaryTracks(Metadata metadata) {
        List<Integer> auxiliaryTrackTypesFromMap = ((MdtaMetadataEntry) Assertions.checkStateNotNull(MetadataUtil.findMdtaMetadataEntryWithKey(metadata, MdtaMetadataEntry.KEY_AUXILIARY_TRACKS_MAP))).getAuxiliaryTrackTypesFromMap();
        ArrayList arrayList = new ArrayList(auxiliaryTrackTypesFromMap.size());
        for (int i11 = 0; i11 < auxiliaryTrackTypesFromMap.size(); i11++) {
            int intValue = auxiliaryTrackTypesFromMap.get(i11).intValue();
            int i12 = 1;
            if (intValue != 0) {
                if (intValue != 1) {
                    i12 = 3;
                    if (intValue != 2) {
                        i12 = intValue != 3 ? 0 : 4;
                    }
                } else {
                    i12 = 2;
                }
            }
            arrayList.add(Integer.valueOf(i12));
        }
        return arrayList;
    }

    private static int getSynchronizationSampleIndex(TrackSampleTable trackSampleTable, long j11) {
        int indexOfEarlierOrEqualSynchronizationSample = trackSampleTable.getIndexOfEarlierOrEqualSynchronizationSample(j11);
        return indexOfEarlierOrEqualSynchronizationSample == -1 ? trackSampleTable.getIndexOfLaterOrEqualSynchronizationSample(j11) : indexOfEarlierOrEqualSynchronizationSample;
    }

    private int getTrackIndexOfNextReadSample(long j11) {
        int i11 = -1;
        int i12 = -1;
        int i13 = 0;
        long j12 = Long.MAX_VALUE;
        boolean z11 = true;
        long j13 = Long.MAX_VALUE;
        boolean z12 = true;
        long j14 = Long.MAX_VALUE;
        while (true) {
            Mp4Track[] mp4TrackArr = this.tracks;
            if (i13 >= mp4TrackArr.length) {
                break;
            }
            Mp4Track mp4Track = mp4TrackArr[i13];
            int i14 = mp4Track.sampleIndex;
            TrackSampleTable trackSampleTable = mp4Track.sampleTable;
            if (i14 != trackSampleTable.sampleCount) {
                long j15 = trackSampleTable.offsets[i14];
                long j16 = ((long[][]) Util.castNonNull(this.accumulatedSampleSizes))[i13][i14];
                long j17 = j15 - j11;
                boolean z13 = j17 < 0 || j17 >= 262144;
                if ((!z13 && z12) || (z13 == z12 && j17 < j14)) {
                    z12 = z13;
                    j13 = j16;
                    i12 = i13;
                    j14 = j17;
                }
                if (j16 < j12) {
                    z11 = z13;
                    j12 = j16;
                    i11 = i13;
                }
            }
            i13++;
        }
        return (j12 == Long.MAX_VALUE || !z11 || j13 < j12 + MAXIMUM_READ_AHEAD_BYTES_STREAM) ? i12 : i11;
    }

    private static long maybeAdjustSeekOffset(TrackSampleTable trackSampleTable, long j11, long j12) {
        int synchronizationSampleIndex = getSynchronizationSampleIndex(trackSampleTable, j11);
        return synchronizationSampleIndex == -1 ? j12 : Math.min(trackSampleTable.offsets[synchronizationSampleIndex], j12);
    }

    private void maybeSetDefaultSampleOffsetForAuxiliaryTracks(Metadata metadata) {
        MdtaMetadataEntry findMdtaMetadataEntryWithKey = MetadataUtil.findMdtaMetadataEntryWithKey(metadata, MdtaMetadataEntry.KEY_AUXILIARY_TRACKS_INTERLEAVED);
        if (findMdtaMetadataEntryWithKey == null || findMdtaMetadataEntryWithKey.value[0] != 0) {
            return;
        }
        this.sampleOffsetForAuxiliaryTracks = this.axteAtomOffset + 16;
    }

    private void maybeSkipRemainingMetaAtomHeaderBytes(ExtractorInput extractorInput) throws IOException {
        this.scratch.reset(8);
        extractorInput.peekFully(this.scratch.getData(), 0, 8);
        BoxParser.maybeSkipRemainingMetaBoxHeaderBytes(this.scratch);
        extractorInput.skipFully(this.scratch.getPosition());
        extractorInput.resetPeekPosition();
    }

    public static ExtractorsFactory newFactory(final SubtitleParser.Factory factory) {
        return new ExtractorsFactory() { // from class: androidx.media3.extractor.mp4.e
            @Override // androidx.media3.extractor.ExtractorsFactory
            public final Extractor[] createExtractors() {
                return Mp4Extractor.b(SubtitleParser.Factory.this);
            }
        };
    }

    private void processAtomEnded(long j11) throws ParserException {
        while (!this.containerAtoms.isEmpty() && this.containerAtoms.peek().endPosition == j11) {
            Mp4Box.ContainerBox pop = this.containerAtoms.pop();
            if (pop.type == 1836019574) {
                processMoovAtom(pop);
                this.containerAtoms.clear();
                if (!this.seekToAxteAtom) {
                    this.parserState = 2;
                }
            } else if (!this.containerAtoms.isEmpty()) {
                this.containerAtoms.peek().add(pop);
            }
        }
        if (this.parserState != 2) {
            enterReadingAtomHeaderState();
        }
    }

    private void processEndOfStreamReadingAtomHeader() {
        if (this.fileType != 2 || (this.flags & 2) == 0) {
            return;
        }
        TrackOutput track = this.extractorOutput.track(0, 4);
        MotionPhotoMetadata motionPhotoMetadata = this.motionPhotoMetadata;
        track.format(new Format.Builder().setMetadata(motionPhotoMetadata == null ? null : new Metadata(motionPhotoMetadata)).build());
        this.extractorOutput.endTracks();
        this.extractorOutput.seekMap(new SeekMap.Unseekable(C.TIME_UNSET));
    }

    private static int processFtypAtom(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        int brandToFileType = brandToFileType(parsableByteArray.readInt());
        if (brandToFileType != 0) {
            return brandToFileType;
        }
        parsableByteArray.skipBytes(4);
        while (parsableByteArray.bytesLeft() > 0) {
            int brandToFileType2 = brandToFileType(parsableByteArray.readInt());
            if (brandToFileType2 != 0) {
                return brandToFileType2;
            }
        }
        return 0;
    }

    private void processMoovAtom(Mp4Box.ContainerBox containerBox) throws ParserException {
        List<Integer> list;
        Metadata metadata;
        Metadata metadata2;
        List<TrackSampleTable> list2;
        Metadata metadata3;
        Metadata metadata4;
        GaplessInfoHolder gaplessInfoHolder;
        String str;
        ArrayList arrayList;
        Mp4Box.ContainerBox containerBoxOfType = containerBox.getContainerBoxOfType(Mp4Box.TYPE_meta);
        List<Integer> arrayList2 = new ArrayList<>();
        if (containerBoxOfType != null) {
            Metadata parseMdtaFromMeta = BoxParser.parseMdtaFromMeta(containerBoxOfType);
            if (this.readingAuxiliaryTracks) {
                Assertions.checkStateNotNull(parseMdtaFromMeta);
                maybeSetDefaultSampleOffsetForAuxiliaryTracks(parseMdtaFromMeta);
                arrayList2 = getAuxiliaryTrackTypesForAuxiliaryTracks(parseMdtaFromMeta);
            } else if (shouldSeekToAxteAtom(parseMdtaFromMeta)) {
                this.seekToAxteAtom = true;
                return;
            }
            metadata = parseMdtaFromMeta;
            list = arrayList2;
        } else {
            list = arrayList2;
            metadata = null;
        }
        ArrayList arrayList3 = new ArrayList();
        boolean z11 = this.fileType == 1;
        GaplessInfoHolder gaplessInfoHolder2 = new GaplessInfoHolder();
        Mp4Box.LeafBox leafBoxOfType = containerBox.getLeafBoxOfType(Mp4Box.TYPE_udta);
        if (leafBoxOfType != null) {
            Metadata parseUdta = BoxParser.parseUdta(leafBoxOfType);
            gaplessInfoHolder2.setFromMetadata(parseUdta);
            metadata2 = parseUdta;
        } else {
            metadata2 = null;
        }
        Metadata metadata5 = new Metadata(BoxParser.parseMvhd(((Mp4Box.LeafBox) Assertions.checkNotNull(containerBox.getLeafBoxOfType(Mp4Box.TYPE_mvhd))).data));
        List<TrackSampleTable> parseTraks = BoxParser.parseTraks(containerBox, gaplessInfoHolder2, C.TIME_UNSET, null, (this.flags & 1) != 0, z11, new r() { // from class: androidx.media3.extractor.mp4.f
            @Override // ho.r
            public final Object apply(Object obj) {
                return Mp4Extractor.a((Track) obj);
            }
        });
        if (this.readingAuxiliaryTracks) {
            Assertions.checkState(list.size() == parseTraks.size(), String.format(Locale.US, "The number of auxiliary track types from metadata (%d) is not same as the number of auxiliary tracks (%d)", Integer.valueOf(list.size()), Integer.valueOf(parseTraks.size())));
        }
        String containerMimeType = MimeTypeResolver.getContainerMimeType(parseTraks);
        int i11 = 0;
        int i12 = 0;
        long j11 = C.TIME_UNSET;
        int i13 = -1;
        while (i11 < parseTraks.size()) {
            TrackSampleTable trackSampleTable = parseTraks.get(i11);
            if (trackSampleTable.sampleCount == 0) {
                list2 = parseTraks;
                gaplessInfoHolder = gaplessInfoHolder2;
                str = containerMimeType;
                metadata3 = metadata;
                arrayList = arrayList3;
            } else {
                Track track = trackSampleTable.track;
                list2 = parseTraks;
                ArrayList arrayList4 = arrayList3;
                int i14 = i12 + 1;
                String str2 = containerMimeType;
                Mp4Track mp4Track = new Mp4Track(track, trackSampleTable, this.extractorOutput.track(i12, track.type));
                metadata3 = metadata;
                long j12 = track.durationUs;
                if (j12 == C.TIME_UNSET) {
                    j12 = trackSampleTable.durationUs;
                }
                mp4Track.trackOutput.durationUs(j12);
                j11 = Math.max(j11, j12);
                int i15 = MimeTypes.AUDIO_TRUEHD.equals(track.format.sampleMimeType) ? trackSampleTable.maximumSize * 16 : trackSampleTable.maximumSize + 30;
                Format.Builder buildUpon = track.format.buildUpon();
                buildUpon.setMaxInputSize(i15);
                if (track.type == 2) {
                    int i16 = track.format.roleFlags;
                    if ((this.flags & 8) != 0) {
                        i16 |= i13 == -1 ? 1 : 2;
                    }
                    if (this.readingAuxiliaryTracks) {
                        i16 |= 32768;
                        buildUpon.setAuxiliaryTrackType(list.get(i11).intValue());
                    }
                    buildUpon.setRoleFlags(i16);
                }
                MetadataUtil.setFormatGaplessInfo(track.type, gaplessInfoHolder2, buildUpon);
                int i17 = track.type;
                Metadata metadata6 = track.format.metadata;
                if (this.slowMotionMetadataEntries.isEmpty()) {
                    gaplessInfoHolder = gaplessInfoHolder2;
                    metadata4 = null;
                } else {
                    gaplessInfoHolder = gaplessInfoHolder2;
                    metadata4 = new Metadata(this.slowMotionMetadataEntries);
                }
                MetadataUtil.setFormatMetadata(i17, metadata3, buildUpon, metadata6, metadata4, metadata2, metadata5);
                str = str2;
                buildUpon.setContainerMimeType(str);
                mp4Track.trackOutput.format(buildUpon.build());
                if (track.type == 2 && i13 == -1) {
                    i13 = arrayList4.size();
                }
                arrayList = arrayList4;
                arrayList.add(mp4Track);
                i12 = i14;
            }
            i11++;
            metadata = metadata3;
            arrayList3 = arrayList;
            parseTraks = list2;
            containerMimeType = str;
            gaplessInfoHolder2 = gaplessInfoHolder;
        }
        this.firstVideoTrackIndex = i13;
        this.durationUs = j11;
        Mp4Track[] mp4TrackArr = (Mp4Track[]) arrayList3.toArray(new Mp4Track[0]);
        this.tracks = mp4TrackArr;
        this.accumulatedSampleSizes = calculateAccumulatedSampleSizes(mp4TrackArr);
        this.extractorOutput.endTracks();
        this.extractorOutput.seekMap(this);
    }

    private void processUnparsedAtom(long j11) {
        if (this.atomType == 1836086884) {
            int i11 = this.atomHeaderBytesRead;
            this.motionPhotoMetadata = new MotionPhotoMetadata(0L, j11, C.TIME_UNSET, j11 + i11, this.atomSize - i11);
        }
    }

    private boolean readAtomHeader(ExtractorInput extractorInput) throws IOException {
        Mp4Box.ContainerBox peek;
        if (this.atomHeaderBytesRead == 0) {
            if (!extractorInput.readFully(this.atomHeader.getData(), 0, 8, true)) {
                processEndOfStreamReadingAtomHeader();
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
            if (length == -1 && (peek = this.containerAtoms.peek()) != null) {
                length = peek.endPosition;
            }
            if (length != -1) {
                this.atomSize = (length - extractorInput.getPosition()) + this.atomHeaderBytesRead;
            }
        }
        if (this.atomSize < this.atomHeaderBytesRead) {
            throw ParserException.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
        }
        if (shouldParseContainerAtom(this.atomType)) {
            long position = extractorInput.getPosition();
            long j12 = this.atomSize;
            int i11 = this.atomHeaderBytesRead;
            long j13 = (position + j12) - i11;
            if (j12 != i11 && this.atomType == 1835365473) {
                maybeSkipRemainingMetaAtomHeaderBytes(extractorInput);
            }
            this.containerAtoms.push(new Mp4Box.ContainerBox(this.atomType, j13));
            if (this.atomSize == this.atomHeaderBytesRead) {
                processAtomEnded(j13);
            } else {
                enterReadingAtomHeaderState();
            }
        } else if (shouldParseLeafAtom(this.atomType)) {
            Assertions.checkState(this.atomHeaderBytesRead == 8);
            Assertions.checkState(this.atomSize <= SieveCacheKt.NodeLinkMask);
            ParsableByteArray parsableByteArray = new ParsableByteArray((int) this.atomSize);
            System.arraycopy(this.atomHeader.getData(), 0, parsableByteArray.getData(), 0, 8);
            this.atomData = parsableByteArray;
            this.parserState = 1;
        } else {
            processUnparsedAtom(extractorInput.getPosition() - this.atomHeaderBytesRead);
            this.atomData = null;
            this.parserState = 1;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean readAtomPayload(androidx.media3.extractor.ExtractorInput r10, androidx.media3.extractor.PositionHolder r11) throws java.io.IOException {
        /*
            r9 = this;
            long r0 = r9.atomSize
            int r2 = r9.atomHeaderBytesRead
            long r2 = (long) r2
            long r0 = r0 - r2
            long r2 = r10.getPosition()
            long r2 = r2 + r0
            androidx.media3.common.util.ParsableByteArray r4 = r9.atomData
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L46
            byte[] r7 = r4.getData()
            int r8 = r9.atomHeaderBytesRead
            int r0 = (int) r0
            r10.readFully(r7, r8, r0)
            int r10 = r9.atomType
            r0 = 1718909296(0x66747970, float:2.8862439E23)
            if (r10 != r0) goto L2b
            r9.seenFtypAtom = r5
            int r10 = processFtypAtom(r4)
            r9.fileType = r10
            goto L5e
        L2b:
            java.util.ArrayDeque<androidx.media3.container.Mp4Box$ContainerBox> r10 = r9.containerAtoms
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L5e
            java.util.ArrayDeque<androidx.media3.container.Mp4Box$ContainerBox> r10 = r9.containerAtoms
            java.lang.Object r10 = r10.peek()
            androidx.media3.container.Mp4Box$ContainerBox r10 = (androidx.media3.container.Mp4Box.ContainerBox) r10
            androidx.media3.container.Mp4Box$LeafBox r0 = new androidx.media3.container.Mp4Box$LeafBox
            int r1 = r9.atomType
            r0.<init>(r1, r4)
            r10.add(r0)
            goto L5e
        L46:
            boolean r4 = r9.seenFtypAtom
            if (r4 != 0) goto L53
            int r4 = r9.atomType
            r7 = 1835295092(0x6d646174, float:4.4175247E27)
            if (r4 != r7) goto L53
            r9.fileType = r5
        L53:
            r7 = 262144(0x40000, double:1.295163E-318)
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 >= 0) goto L60
            int r0 = (int) r0
            r10.skipFully(r0)
        L5e:
            r10 = r6
            goto L68
        L60:
            long r7 = r10.getPosition()
            long r7 = r7 + r0
            r11.position = r7
            r10 = r5
        L68:
            r9.processAtomEnded(r2)
            boolean r0 = r9.seekToAxteAtom
            if (r0 == 0) goto L78
            r9.readingAuxiliaryTracks = r5
            long r0 = r9.axteAtomOffset
            r11.position = r0
            r9.seekToAxteAtom = r6
            r10 = r5
        L78:
            if (r10 == 0) goto L80
            int r10 = r9.parserState
            r11 = 2
            if (r10 == r11) goto L80
            return r5
        L80:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.Mp4Extractor.readAtomPayload(androidx.media3.extractor.ExtractorInput, androidx.media3.extractor.PositionHolder):boolean");
    }

    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean, int] */
    private int readSample(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        TrackOutput.CryptoData cryptoData;
        ?? r12;
        int i11;
        long position = extractorInput.getPosition();
        if (this.sampleTrackIndex == -1) {
            int trackIndexOfNextReadSample = getTrackIndexOfNextReadSample(position);
            this.sampleTrackIndex = trackIndexOfNextReadSample;
            if (trackIndexOfNextReadSample == -1) {
                return -1;
            }
        }
        Mp4Track mp4Track = this.tracks[this.sampleTrackIndex];
        TrackOutput trackOutput = mp4Track.trackOutput;
        int i12 = mp4Track.sampleIndex;
        TrackSampleTable trackSampleTable = mp4Track.sampleTable;
        long j11 = trackSampleTable.offsets[i12] + this.sampleOffsetForAuxiliaryTracks;
        int i13 = trackSampleTable.sizes[i12];
        TrueHdSampleRechunker trueHdSampleRechunker = mp4Track.trueHdSampleRechunker;
        long j12 = (j11 - position) + this.sampleBytesRead;
        if (j12 < 0 || j12 >= 262144) {
            positionHolder.position = j11;
            return 1;
        }
        if (mp4Track.track.sampleTransformation == 1) {
            j12 += 8;
            i13 -= 8;
        }
        extractorInput.skipFully((int) j12);
        if (!canReadWithinGopSampleDependencies(mp4Track.track.format)) {
            this.isSampleDependedOn = true;
        }
        Track track = mp4Track.track;
        if (track.nalUnitLengthFieldLength == 0) {
            cryptoData = null;
            if (MimeTypes.AUDIO_AC4.equals(track.format.sampleMimeType)) {
                if (this.sampleBytesWritten == 0) {
                    Ac4Util.getAc4SampleHeader(i13, this.scratch);
                    trackOutput.sampleData(this.scratch, 7);
                    this.sampleBytesWritten += 7;
                }
                i13 += 7;
            } else if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.startSample(extractorInput);
            }
            while (true) {
                int i14 = this.sampleBytesWritten;
                if (i14 >= i13) {
                    break;
                }
                int sampleData = trackOutput.sampleData((DataReader) extractorInput, i13 - i14, false);
                this.sampleBytesRead += sampleData;
                this.sampleBytesWritten += sampleData;
                this.sampleCurrentNalBytesRemaining -= sampleData;
            }
        } else {
            byte[] data = this.nalPrefix.getData();
            data[0] = 0;
            data[1] = 0;
            data[2] = 0;
            int i15 = 4 - mp4Track.track.nalUnitLengthFieldLength;
            i13 += i15;
            while (this.sampleBytesWritten < i13) {
                int i16 = this.sampleCurrentNalBytesRemaining;
                if (i16 == 0) {
                    Track track2 = mp4Track.track;
                    int i17 = track2.nalUnitLengthFieldLength;
                    if (this.isSampleDependedOn || NalUnitUtil.numberOfBytesInNalUnitHeader(track2.format) + i17 > mp4Track.sampleTable.sizes[i12] - this.sampleBytesRead) {
                        i11 = 0;
                    } else {
                        i11 = NalUnitUtil.numberOfBytesInNalUnitHeader(mp4Track.track.format);
                        i17 = mp4Track.track.nalUnitLengthFieldLength + i11;
                    }
                    extractorInput.readFully(data, i15, i17);
                    this.sampleBytesRead += i17;
                    this.nalPrefix.setPosition(0);
                    int readInt = this.nalPrefix.readInt();
                    if (readInt < 0) {
                        throw ParserException.createForMalformedContainer("Invalid NAL length", null);
                    }
                    this.sampleCurrentNalBytesRemaining = readInt - i11;
                    this.nalStartCode.setPosition(0);
                    trackOutput.sampleData(this.nalStartCode, 4);
                    this.sampleBytesWritten += 4;
                    if (i11 > 0) {
                        trackOutput.sampleData(this.nalPrefix, i11);
                        this.sampleBytesWritten += i11;
                        if (NalUnitUtil.isDependedOn(data, 4, i11, mp4Track.track.format)) {
                            this.isSampleDependedOn = true;
                        }
                    }
                } else {
                    int sampleData2 = trackOutput.sampleData((DataReader) extractorInput, i16, false);
                    this.sampleBytesRead += sampleData2;
                    this.sampleBytesWritten += sampleData2;
                    this.sampleCurrentNalBytesRemaining -= sampleData2;
                }
            }
            cryptoData = null;
        }
        int i18 = i13;
        TrackSampleTable trackSampleTable2 = mp4Track.sampleTable;
        long j13 = trackSampleTable2.timestampsUs[i12];
        int i19 = trackSampleTable2.flags[i12];
        if (!this.isSampleDependedOn) {
            i19 |= 67108864;
        }
        int i21 = i19;
        if (trueHdSampleRechunker != null) {
            boolean z11 = false;
            trueHdSampleRechunker.sampleMetadata(trackOutput, j13, i21, i18, 0, null);
            r12 = z11;
            if (i12 + 1 == mp4Track.sampleTable.sampleCount) {
                trueHdSampleRechunker.outputPendingSampleMetadata(trackOutput, cryptoData);
                r12 = z11;
            }
        } else {
            r12 = 0;
            trackOutput.sampleMetadata(j13, i21, i18, 0, null);
        }
        mp4Track.sampleIndex++;
        this.sampleTrackIndex = -1;
        this.sampleBytesRead = r12;
        this.sampleBytesWritten = r12;
        this.sampleCurrentNalBytesRemaining = r12;
        this.isSampleDependedOn = r12;
        return r12;
    }

    private int readSefData(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        int read = this.sefReader.read(extractorInput, positionHolder, this.slowMotionMetadataEntries);
        if (read == 1 && positionHolder.position == 0) {
            enterReadingAtomHeaderState();
        }
        return read;
    }

    private static boolean shouldParseContainerAtom(int i11) {
        return i11 == 1836019574 || i11 == 1953653099 || i11 == 1835297121 || i11 == 1835626086 || i11 == 1937007212 || i11 == 1701082227 || i11 == 1835365473 || i11 == 1635284069;
    }

    private static boolean shouldParseLeafAtom(int i11) {
        return i11 == 1835296868 || i11 == 1836476516 || i11 == 1751411826 || i11 == 1937011556 || i11 == 1937011827 || i11 == 1937011571 || i11 == 1668576371 || i11 == 1701606260 || i11 == 1937011555 || i11 == 1937011578 || i11 == 1937013298 || i11 == 1937007471 || i11 == 1668232756 || i11 == 1953196132 || i11 == 1718909296 || i11 == 1969517665 || i11 == 1801812339 || i11 == 1768715124;
    }

    private boolean shouldSeekToAxteAtom(@Nullable Metadata metadata) {
        MdtaMetadataEntry findMdtaMetadataEntryWithKey;
        if (metadata != null && (this.flags & 64) != 0 && (findMdtaMetadataEntryWithKey = MetadataUtil.findMdtaMetadataEntryWithKey(metadata, MdtaMetadataEntry.KEY_AUXILIARY_TRACKS_OFFSET)) != null) {
            long readUnsignedLongToLong = new ParsableByteArray(findMdtaMetadataEntryWithKey.value).readUnsignedLongToLong();
            if (readUnsignedLongToLong > 0) {
                this.axteAtomOffset = readUnsignedLongToLong;
                return true;
            }
        }
        return false;
    }

    private void updateSampleIndex(Mp4Track mp4Track, long j11) {
        TrackSampleTable trackSampleTable = mp4Track.sampleTable;
        int indexOfEarlierOrEqualSynchronizationSample = trackSampleTable.getIndexOfEarlierOrEqualSynchronizationSample(j11);
        if (indexOfEarlierOrEqualSynchronizationSample == -1) {
            indexOfEarlierOrEqualSynchronizationSample = trackSampleTable.getIndexOfLaterOrEqualSynchronizationSample(j11);
        }
        mp4Track.sampleIndex = indexOfEarlierOrEqualSynchronizationSample;
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    public long[] getSampleTimestampsUs(int i11) {
        Mp4Track[] mp4TrackArr = this.tracks;
        return mp4TrackArr.length <= i11 ? new long[0] : mp4TrackArr[i11].sampleTable.timestampsUs;
    }

    @Override // androidx.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j11) {
        return getSeekPoints(j11, -1);
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        if ((this.flags & 16) == 0) {
            extractorOutput = new SubtitleTranscodingExtractorOutput(extractorOutput, this.subtitleParserFactory);
        }
        this.extractorOutput = extractorOutput;
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        while (true) {
            int i11 = this.parserState;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        return readSample(extractorInput, positionHolder);
                    }
                    if (i11 == 3) {
                        return readSefData(extractorInput, positionHolder);
                    }
                    throw new IllegalStateException();
                }
                if (readAtomPayload(extractorInput, positionHolder)) {
                    return 1;
                }
            } else if (!readAtomHeader(extractorInput)) {
                return -1;
            }
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j11, long j12) {
        this.containerAtoms.clear();
        this.atomHeaderBytesRead = 0;
        this.sampleTrackIndex = -1;
        this.sampleBytesRead = 0;
        this.sampleBytesWritten = 0;
        this.sampleCurrentNalBytesRemaining = 0;
        this.isSampleDependedOn = false;
        if (j11 == 0) {
            if (this.parserState != 3) {
                enterReadingAtomHeaderState();
                return;
            } else {
                this.sefReader.reset();
                this.slowMotionMetadataEntries.clear();
                return;
            }
        }
        for (Mp4Track mp4Track : this.tracks) {
            updateSampleIndex(mp4Track, j12);
            TrueHdSampleRechunker trueHdSampleRechunker = mp4Track.trueHdSampleRechunker;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.reset();
            }
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        SniffFailure sniffUnfragmented = Sniffer.sniffUnfragmented(extractorInput, (this.flags & 2) != 0);
        this.lastSniffFailures = sniffUnfragmented != null ? ImmutableList.of(sniffUnfragmented) : ImmutableList.of();
        return sniffUnfragmented == null;
    }

    public Mp4Extractor(SubtitleParser.Factory factory) {
        this(factory, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.media3.extractor.SeekMap.SeekPoints getSeekPoints(long r17, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r19
            androidx.media3.extractor.mp4.Mp4Extractor$Mp4Track[] r4 = r0.tracks
            int r5 = r4.length
            if (r5 != 0) goto L13
            androidx.media3.extractor.SeekMap$SeekPoints r1 = new androidx.media3.extractor.SeekMap$SeekPoints
            androidx.media3.extractor.SeekPoint r2 = androidx.media3.extractor.SeekPoint.START
            r1.<init>(r2)
            return r1
        L13:
            r5 = -1
            if (r3 == r5) goto L18
            r6 = r3
            goto L1a
        L18:
            int r6 = r0.firstVideoTrackIndex
        L1a:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = -1
            if (r6 == r5) goto L58
            r4 = r4[r6]
            androidx.media3.extractor.mp4.TrackSampleTable r4 = r4.sampleTable
            int r6 = getSynchronizationSampleIndex(r4, r1)
            if (r6 != r5) goto L35
            androidx.media3.extractor.SeekMap$SeekPoints r1 = new androidx.media3.extractor.SeekMap$SeekPoints
            androidx.media3.extractor.SeekPoint r2 = androidx.media3.extractor.SeekPoint.START
            r1.<init>(r2)
            return r1
        L35:
            long[] r11 = r4.timestampsUs
            r12 = r11[r6]
            long[] r11 = r4.offsets
            r14 = r11[r6]
            int r11 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r11 >= 0) goto L5e
            int r11 = r4.sampleCount
            int r11 = r11 + (-1)
            if (r6 >= r11) goto L5e
            int r1 = r4.getIndexOfLaterOrEqualSynchronizationSample(r1)
            if (r1 == r5) goto L5e
            if (r1 == r6) goto L5e
            long[] r2 = r4.timestampsUs
            r9 = r2[r1]
            long[] r2 = r4.offsets
            r1 = r2[r1]
            goto L60
        L58:
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = r1
        L5e:
            r1 = r9
            r9 = r7
        L60:
            if (r3 != r5) goto L80
            r3 = 0
        L63:
            androidx.media3.extractor.mp4.Mp4Extractor$Mp4Track[] r4 = r0.tracks
            int r5 = r4.length
            if (r3 >= r5) goto L80
            int r5 = r0.firstVideoTrackIndex
            if (r3 == r5) goto L7d
            r4 = r4[r3]
            androidx.media3.extractor.mp4.TrackSampleTable r4 = r4.sampleTable
            long r5 = maybeAdjustSeekOffset(r4, r12, r14)
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L7c
            long r1 = maybeAdjustSeekOffset(r4, r9, r1)
        L7c:
            r14 = r5
        L7d:
            int r3 = r3 + 1
            goto L63
        L80:
            androidx.media3.extractor.SeekPoint r3 = new androidx.media3.extractor.SeekPoint
            r3.<init>(r12, r14)
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 != 0) goto L8f
            androidx.media3.extractor.SeekMap$SeekPoints r1 = new androidx.media3.extractor.SeekMap$SeekPoints
            r1.<init>(r3)
            return r1
        L8f:
            androidx.media3.extractor.SeekPoint r4 = new androidx.media3.extractor.SeekPoint
            r4.<init>(r9, r1)
            androidx.media3.extractor.SeekMap$SeekPoints r1 = new androidx.media3.extractor.SeekMap$SeekPoints
            r1.<init>(r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.Mp4Extractor.getSeekPoints(long, int):androidx.media3.extractor.SeekMap$SeekPoints");
    }

    @Override // androidx.media3.extractor.Extractor
    public ImmutableList<SniffFailure> getSniffFailureDetails() {
        return this.lastSniffFailures;
    }

    @Deprecated
    public Mp4Extractor(int i11) {
        this(SubtitleParser.Factory.UNSUPPORTED, i11);
    }

    public Mp4Extractor(SubtitleParser.Factory factory, int i11) {
        this.subtitleParserFactory = factory;
        this.flags = i11;
        this.lastSniffFailures = ImmutableList.of();
        this.parserState = (i11 & 4) != 0 ? 3 : 0;
        this.sefReader = new SefReader();
        this.slowMotionMetadataEntries = new ArrayList();
        this.atomHeader = new ParsableByteArray(16);
        this.containerAtoms = new ArrayDeque<>();
        this.nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.nalPrefix = new ParsableByteArray(6);
        this.scratch = new ParsableByteArray();
        this.sampleTrackIndex = -1;
        this.extractorOutput = ExtractorOutput.PLACEHOLDER;
        this.tracks = new Mp4Track[0];
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    public static /* synthetic */ Track a(Track track) {
        return track;
    }
}
