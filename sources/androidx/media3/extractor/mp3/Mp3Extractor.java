package androidx.media3.extractor.mp3;

import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.DiscardingTrackOutput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.Id3Peeker;
import androidx.media3.extractor.MpegAudioUtil;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.metadata.id3.Id3Decoder;
import androidx.media3.extractor.metadata.id3.MlltFrame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import androidx.media3.extractor.mp3.Seeker;
import com.google.common.math.h;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.math.RoundingMode;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import ro.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class Mp3Extractor implements Extractor {
    public static final int FLAG_DISABLE_ID3_METADATA = 8;
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING = 1;
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING_ALWAYS = 2;
    public static final int FLAG_ENABLE_INDEX_SEEKING = 4;
    private static final int MAX_SNIFF_BYTES = 32768;
    private static final int MAX_SYNC_BYTES = 131072;
    private static final int MPEG_AUDIO_HEADER_MASK = -128000;
    private static final int SCRATCH_LENGTH = 10;
    private static final int SEEK_HEADER_INFO = 1231971951;
    private static final int SEEK_HEADER_UNSET = 0;
    private static final int SEEK_HEADER_VBRI = 1447187017;
    private static final int SEEK_HEADER_XING = 1483304551;
    private static final String TAG = "Mp3Extractor";
    private long basisTimeUs;
    private TrackOutput currentTrackOutput;
    private boolean disableSeeking;
    private long endPositionOfLastSampleRead;
    private ExtractorOutput extractorOutput;
    private long firstSamplePosition;
    private final int flags;
    private final long forcedFirstSampleTimestampUs;
    private final GaplessInfoHolder gaplessInfoHolder;
    private final Id3Peeker id3Peeker;
    private boolean isSeekInProgress;

    @Nullable
    private Metadata metadata;
    private TrackOutput realTrackOutput;
    private int sampleBytesRemaining;
    private long samplesRead;
    private final ParsableByteArray scratch;
    private long seekTimeUs;
    private Seeker seeker;
    private final TrackOutput skippingTrackOutput;
    private final MpegAudioUtil.Header synchronizedHeader;
    private int synchronizedHeaderData;
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: androidx.media3.extractor.mp3.a
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return Mp3Extractor.a();
        }
    };
    private static final Id3Decoder.FramePredicate REQUIRED_ID3_FRAME_PREDICATE = new Id3Decoder.FramePredicate() { // from class: androidx.media3.extractor.mp3.b
        @Override // androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate
        public final boolean evaluate(int i11, int i12, int i13, int i14, int i15) {
            return Mp3Extractor.b(i11, i12, i13, i14, i15);
        }
    };

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public Mp3Extractor() {
        this(0);
    }

    public static /* synthetic */ Extractor[] a() {
        return new Extractor[]{new Mp3Extractor()};
    }

    @EnsuresNonNull({"extractorOutput", "realTrackOutput"})
    private void assertInitialized() {
        Assertions.checkStateNotNull(this.realTrackOutput);
        Util.castNonNull(this.extractorOutput);
    }

    public static /* synthetic */ boolean b(int i11, int i12, int i13, int i14, int i15) {
        if (i12 == 67 && i13 == 79 && i14 == 77 && (i15 == 77 || i11 == 2)) {
            return true;
        }
        if (i12 == 77 && i13 == 76 && i14 == 76) {
            return i15 == 84 || i11 == 2;
        }
        return false;
    }

    @RequiresNonNull({"realTrackOutput"})
    private Seeker computeSeeker(ExtractorInput extractorInput) throws IOException {
        long id3TlenUs;
        long j11;
        Seeker maybeReadSeekFrame = maybeReadSeekFrame(extractorInput);
        MlltSeeker maybeHandleSeekMetadata = maybeHandleSeekMetadata(this.metadata, extractorInput.getPosition());
        if (this.disableSeeking) {
            return new Seeker.UnseekableSeeker();
        }
        if ((this.flags & 4) != 0) {
            if (maybeHandleSeekMetadata != null) {
                id3TlenUs = maybeHandleSeekMetadata.getDurationUs();
                j11 = maybeHandleSeekMetadata.getDataEndPosition();
            } else if (maybeReadSeekFrame != null) {
                id3TlenUs = maybeReadSeekFrame.getDurationUs();
                j11 = maybeReadSeekFrame.getDataEndPosition();
            } else {
                id3TlenUs = getId3TlenUs(this.metadata);
                j11 = -1;
            }
            maybeReadSeekFrame = new IndexSeeker(id3TlenUs, extractorInput.getPosition(), j11);
        } else if (maybeHandleSeekMetadata != null) {
            maybeReadSeekFrame = maybeHandleSeekMetadata;
        } else if (maybeReadSeekFrame == null) {
            maybeReadSeekFrame = null;
        }
        if (maybeReadSeekFrame == null || (!maybeReadSeekFrame.isSeekable() && (this.flags & 1) != 0)) {
            maybeReadSeekFrame = getConstantBitrateSeeker(extractorInput, (this.flags & 2) != 0);
        }
        if (maybeReadSeekFrame != null) {
            this.realTrackOutput.durationUs(maybeReadSeekFrame.getDurationUs());
        }
        return maybeReadSeekFrame;
    }

    private long computeTimeUs(long j11) {
        return this.basisTimeUs + ((j11 * 1000000) / this.synchronizedHeader.sampleRate);
    }

    private Seeker getConstantBitrateSeeker(ExtractorInput extractorInput, boolean z11) throws IOException {
        extractorInput.peekFully(this.scratch.getData(), 0, 4);
        this.scratch.setPosition(0);
        this.synchronizedHeader.setForHeaderData(this.scratch.readInt());
        return new ConstantBitrateSeeker(extractorInput.getLength(), extractorInput.getPosition(), this.synchronizedHeader, z11);
    }

    private static long getId3TlenUs(@Nullable Metadata metadata) {
        if (metadata == null) {
            return C.TIME_UNSET;
        }
        int length = metadata.length();
        for (int i11 = 0; i11 < length; i11++) {
            Metadata.Entry entry = metadata.get(i11);
            if (entry instanceof TextInformationFrame) {
                TextInformationFrame textInformationFrame = (TextInformationFrame) entry;
                if (textInformationFrame.f5226id.equals("TLEN")) {
                    return Util.msToUs(Long.parseLong(textInformationFrame.values.get(0)));
                }
            }
        }
        return C.TIME_UNSET;
    }

    private static int getSeekFrameHeader(ParsableByteArray parsableByteArray, int i11) {
        if (parsableByteArray.limit() >= i11 + 4) {
            parsableByteArray.setPosition(i11);
            int readInt = parsableByteArray.readInt();
            if (readInt == SEEK_HEADER_XING || readInt == SEEK_HEADER_INFO) {
                return readInt;
            }
        }
        if (parsableByteArray.limit() < 40) {
            return 0;
        }
        parsableByteArray.setPosition(36);
        if (parsableByteArray.readInt() == SEEK_HEADER_VBRI) {
            return SEEK_HEADER_VBRI;
        }
        return 0;
    }

    private static boolean headersMatch(int i11, long j11) {
        return ((long) (i11 & MPEG_AUDIO_HEADER_MASK)) == (j11 & (-128000));
    }

    @Nullable
    private static MlltSeeker maybeHandleSeekMetadata(@Nullable Metadata metadata, long j11) {
        if (metadata == null) {
            return null;
        }
        int length = metadata.length();
        for (int i11 = 0; i11 < length; i11++) {
            Metadata.Entry entry = metadata.get(i11);
            if (entry instanceof MlltFrame) {
                return MlltSeeker.create(j11, (MlltFrame) entry, getId3TlenUs(metadata));
            }
        }
        return null;
    }

    @Nullable
    private Seeker maybeReadSeekFrame(ExtractorInput extractorInput) throws IOException {
        int i11;
        int i12;
        ParsableByteArray parsableByteArray = new ParsableByteArray(this.synchronizedHeader.frameSize);
        extractorInput.peekFully(parsableByteArray.getData(), 0, this.synchronizedHeader.frameSize);
        MpegAudioUtil.Header header = this.synchronizedHeader;
        int i13 = 21;
        if ((header.version & 1) != 0) {
            if (header.channels != 1) {
                i13 = 36;
            }
        } else if (header.channels == 1) {
            i13 = 13;
        }
        int seekFrameHeader = getSeekFrameHeader(parsableByteArray, i13);
        if (seekFrameHeader != SEEK_HEADER_INFO) {
            if (seekFrameHeader == SEEK_HEADER_VBRI) {
                VbriSeeker create = VbriSeeker.create(extractorInput.getLength(), extractorInput.getPosition(), this.synchronizedHeader, parsableByteArray);
                extractorInput.skipFully(this.synchronizedHeader.frameSize);
                return create;
            }
            if (seekFrameHeader != SEEK_HEADER_XING) {
                extractorInput.resetPeekPosition();
                return null;
            }
        }
        XingFrame parse = XingFrame.parse(this.synchronizedHeader, parsableByteArray);
        if (!this.gaplessInfoHolder.hasGaplessInfo() && (i11 = parse.encoderDelay) != -1 && (i12 = parse.encoderPadding) != -1) {
            GaplessInfoHolder gaplessInfoHolder = this.gaplessInfoHolder;
            gaplessInfoHolder.encoderDelay = i11;
            gaplessInfoHolder.encoderPadding = i12;
        }
        long position = extractorInput.getPosition();
        if (extractorInput.getLength() != -1 && parse.dataSize != -1 && extractorInput.getLength() != parse.dataSize + position) {
            Log.i(TAG, "Data size mismatch between stream (" + extractorInput.getLength() + ") and Xing frame (" + (parse.dataSize + position) + "), using Xing value.");
        }
        extractorInput.skipFully(this.synchronizedHeader.frameSize);
        return seekFrameHeader == SEEK_HEADER_XING ? XingSeeker.create(parse, position) : getConstantBitrateSeeker(position, parse, extractorInput.getLength());
    }

    private void maybeUpdateCbrDurationToLastSample() {
        Seeker seeker = this.seeker;
        if ((seeker instanceof ConstantBitrateSeeker) && seeker.isSeekable()) {
            long j11 = this.endPositionOfLastSampleRead;
            if (j11 == -1 || j11 == this.seeker.getDataEndPosition()) {
                return;
            }
            this.seeker = ((ConstantBitrateSeeker) this.seeker).copyWithNewDataEndPosition(this.endPositionOfLastSampleRead);
            ((ExtractorOutput) Assertions.checkNotNull(this.extractorOutput)).seekMap(this.seeker);
            ((TrackOutput) Assertions.checkNotNull(this.realTrackOutput)).durationUs(this.seeker.getDurationUs());
        }
    }

    private boolean peekEndOfStreamOrHeader(ExtractorInput extractorInput) throws IOException {
        Seeker seeker = this.seeker;
        if (seeker != null) {
            long dataEndPosition = seeker.getDataEndPosition();
            if (dataEndPosition != -1 && extractorInput.getPeekPosition() > dataEndPosition - 4) {
                return true;
            }
        }
        try {
            return !extractorInput.peekFully(this.scratch.getData(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    private int readInternal(ExtractorInput extractorInput) throws IOException {
        if (this.synchronizedHeaderData == 0) {
            try {
                synchronize(extractorInput, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.seeker == null) {
            Seeker computeSeeker = computeSeeker(extractorInput);
            this.seeker = computeSeeker;
            this.extractorOutput.seekMap(computeSeeker);
            Format.Builder metadata = new Format.Builder().setContainerMimeType(MimeTypes.AUDIO_MPEG).setSampleMimeType(this.synchronizedHeader.mimeType).setMaxInputSize(4096).setChannelCount(this.synchronizedHeader.channels).setSampleRate(this.synchronizedHeader.sampleRate).setEncoderDelay(this.gaplessInfoHolder.encoderDelay).setEncoderPadding(this.gaplessInfoHolder.encoderPadding).setMetadata((this.flags & 8) != 0 ? null : this.metadata);
            if (this.seeker.getAverageBitrate() != -2147483647) {
                metadata.setAverageBitrate(this.seeker.getAverageBitrate());
            }
            this.currentTrackOutput.format(metadata.build());
            this.firstSamplePosition = extractorInput.getPosition();
        } else if (this.firstSamplePosition != 0) {
            long position = extractorInput.getPosition();
            long j11 = this.firstSamplePosition;
            if (position < j11) {
                extractorInput.skipFully((int) (j11 - position));
            }
        }
        return readSample(extractorInput);
    }

    @RequiresNonNull({"realTrackOutput", "seeker"})
    private int readSample(ExtractorInput extractorInput) throws IOException {
        if (this.sampleBytesRemaining == 0) {
            extractorInput.resetPeekPosition();
            if (peekEndOfStreamOrHeader(extractorInput)) {
                return -1;
            }
            this.scratch.setPosition(0);
            int readInt = this.scratch.readInt();
            if (!headersMatch(readInt, this.synchronizedHeaderData) || MpegAudioUtil.getFrameSize(readInt) == -1) {
                extractorInput.skipFully(1);
                this.synchronizedHeaderData = 0;
                return 0;
            }
            this.synchronizedHeader.setForHeaderData(readInt);
            if (this.basisTimeUs == C.TIME_UNSET) {
                this.basisTimeUs = this.seeker.getTimeUs(extractorInput.getPosition());
                if (this.forcedFirstSampleTimestampUs != C.TIME_UNSET) {
                    this.basisTimeUs += this.forcedFirstSampleTimestampUs - this.seeker.getTimeUs(0L);
                }
            }
            this.sampleBytesRemaining = this.synchronizedHeader.frameSize;
            long position = extractorInput.getPosition();
            MpegAudioUtil.Header header = this.synchronizedHeader;
            this.endPositionOfLastSampleRead = position + header.frameSize;
            Seeker seeker = this.seeker;
            if (seeker instanceof IndexSeeker) {
                IndexSeeker indexSeeker = (IndexSeeker) seeker;
                indexSeeker.maybeAddSeekPoint(computeTimeUs(this.samplesRead + header.samplesPerFrame), this.endPositionOfLastSampleRead);
                if (this.isSeekInProgress && indexSeeker.isTimeUsInIndex(this.seekTimeUs)) {
                    this.isSeekInProgress = false;
                    this.currentTrackOutput = this.realTrackOutput;
                }
            }
        }
        int sampleData = this.currentTrackOutput.sampleData((DataReader) extractorInput, this.sampleBytesRemaining, true);
        if (sampleData == -1) {
            return -1;
        }
        int i11 = this.sampleBytesRemaining - sampleData;
        this.sampleBytesRemaining = i11;
        if (i11 > 0) {
            return 0;
        }
        this.currentTrackOutput.sampleMetadata(computeTimeUs(this.samplesRead), 1, this.synchronizedHeader.frameSize, 0, null);
        this.samplesRead += this.synchronizedHeader.samplesPerFrame;
        this.sampleBytesRemaining = 0;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x009e, code lost:
    
        if (r12 == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a0, code lost:
    
        r11.skipFully(r1 + r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a8, code lost:
    
        r10.synchronizedHeaderData = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00aa, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a5, code lost:
    
        r11.resetPeekPosition();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean synchronize(androidx.media3.extractor.ExtractorInput r11, boolean r12) throws java.io.IOException {
        /*
            r10 = this;
            if (r12 == 0) goto L6
            r0 = 32768(0x8000, float:4.5918E-41)
            goto L8
        L6:
            r0 = 131072(0x20000, float:1.83671E-40)
        L8:
            r11.resetPeekPosition()
            long r1 = r11.getPosition()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            if (r1 != 0) goto L3d
            int r1 = r10.flags
            r1 = r1 & 8
            if (r1 != 0) goto L1e
            r1 = 0
            goto L20
        L1e:
            androidx.media3.extractor.metadata.id3.Id3Decoder$FramePredicate r1 = androidx.media3.extractor.mp3.Mp3Extractor.REQUIRED_ID3_FRAME_PREDICATE
        L20:
            androidx.media3.extractor.Id3Peeker r3 = r10.id3Peeker
            androidx.media3.common.Metadata r1 = r3.peekId3Data(r11, r1)
            r10.metadata = r1
            if (r1 == 0) goto L2f
            androidx.media3.extractor.GaplessInfoHolder r3 = r10.gaplessInfoHolder
            r3.setFromMetadata(r1)
        L2f:
            long r3 = r11.getPeekPosition()
            int r1 = (int) r3
            if (r12 != 0) goto L39
            r11.skipFully(r1)
        L39:
            r3 = r2
        L3a:
            r4 = r3
            r5 = r4
            goto L40
        L3d:
            r1 = r2
            r3 = r1
            goto L3a
        L40:
            boolean r6 = r10.peekEndOfStreamOrHeader(r11)
            r7 = 1
            if (r6 == 0) goto L53
            if (r4 <= 0) goto L4a
            goto L9e
        L4a:
            r10.maybeUpdateCbrDurationToLastSample()
            java.io.EOFException r11 = new java.io.EOFException
            r11.<init>()
            throw r11
        L53:
            androidx.media3.common.util.ParsableByteArray r6 = r10.scratch
            r6.setPosition(r2)
            androidx.media3.common.util.ParsableByteArray r6 = r10.scratch
            int r6 = r6.readInt()
            if (r3 == 0) goto L67
            long r8 = (long) r3
            boolean r8 = headersMatch(r6, r8)
            if (r8 == 0) goto L6e
        L67:
            int r8 = androidx.media3.extractor.MpegAudioUtil.getFrameSize(r6)
            r9 = -1
            if (r8 != r9) goto L90
        L6e:
            int r3 = r5 + 1
            if (r5 != r0) goto L7e
            if (r12 == 0) goto L75
            return r2
        L75:
            r10.maybeUpdateCbrDurationToLastSample()
            java.io.EOFException r11 = new java.io.EOFException
            r11.<init>()
            throw r11
        L7e:
            if (r12 == 0) goto L89
            r11.resetPeekPosition()
            int r4 = r1 + r3
            r11.advancePeekPosition(r4)
            goto L8c
        L89:
            r11.skipFully(r7)
        L8c:
            r4 = r2
            r5 = r3
            r3 = r4
            goto L40
        L90:
            int r4 = r4 + 1
            if (r4 != r7) goto L9b
            androidx.media3.extractor.MpegAudioUtil$Header r3 = r10.synchronizedHeader
            r3.setForHeaderData(r6)
            r3 = r6
            goto Lab
        L9b:
            r6 = 4
            if (r4 != r6) goto Lab
        L9e:
            if (r12 == 0) goto La5
            int r1 = r1 + r5
            r11.skipFully(r1)
            goto La8
        La5:
            r11.resetPeekPosition()
        La8:
            r10.synchronizedHeaderData = r3
            return r7
        Lab:
            int r8 = r8 + (-4)
            r11.advancePeekPosition(r8)
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp3.Mp3Extractor.synchronize(androidx.media3.extractor.ExtractorInput, boolean):boolean");
    }

    public void disableSeeking() {
        this.disableSeeking = true;
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        TrackOutput track = extractorOutput.track(0, 1);
        this.realTrackOutput = track;
        this.currentTrackOutput = track;
        this.extractorOutput.endTracks();
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        assertInitialized();
        int readInternal = readInternal(extractorInput);
        if (readInternal == -1 && (this.seeker instanceof IndexSeeker)) {
            long computeTimeUs = computeTimeUs(this.samplesRead);
            if (this.seeker.getDurationUs() != computeTimeUs) {
                ((IndexSeeker) this.seeker).setDurationUs(computeTimeUs);
                this.extractorOutput.seekMap(this.seeker);
                this.realTrackOutput.durationUs(this.seeker.getDurationUs());
            }
        }
        return readInternal;
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j11, long j12) {
        this.synchronizedHeaderData = 0;
        this.basisTimeUs = C.TIME_UNSET;
        this.samplesRead = 0L;
        this.sampleBytesRemaining = 0;
        this.seekTimeUs = j12;
        Seeker seeker = this.seeker;
        if (!(seeker instanceof IndexSeeker) || ((IndexSeeker) seeker).isTimeUsInIndex(j12)) {
            return;
        }
        this.isSeekInProgress = true;
        this.currentTrackOutput = this.skippingTrackOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        return synchronize(extractorInput, true);
    }

    public Mp3Extractor(int i11) {
        this(i11, C.TIME_UNSET);
    }

    public Mp3Extractor(int i11, long j11) {
        this.flags = (i11 & 2) != 0 ? i11 | 1 : i11;
        this.forcedFirstSampleTimestampUs = j11;
        this.scratch = new ParsableByteArray(10);
        this.synchronizedHeader = new MpegAudioUtil.Header();
        this.gaplessInfoHolder = new GaplessInfoHolder();
        this.basisTimeUs = C.TIME_UNSET;
        this.id3Peeker = new Id3Peeker();
        DiscardingTrackOutput discardingTrackOutput = new DiscardingTrackOutput();
        this.skippingTrackOutput = discardingTrackOutput;
        this.currentTrackOutput = discardingTrackOutput;
        this.endPositionOfLastSampleRead = -1L;
    }

    @Nullable
    private Seeker getConstantBitrateSeeker(long j11, XingFrame xingFrame, long j12) {
        long j13;
        long j14;
        long computeDurationUs = xingFrame.computeDurationUs();
        if (computeDurationUs == C.TIME_UNSET) {
            return null;
        }
        long j15 = xingFrame.dataSize;
        if (j15 != -1) {
            long j16 = j11 + j15;
            j13 = j15 - xingFrame.header.frameSize;
            j14 = j16;
        } else {
            if (j12 == -1) {
                return null;
            }
            j13 = (j12 - j11) - xingFrame.header.frameSize;
            j14 = j12;
        }
        long j17 = j13;
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        return new ConstantBitrateSeeker(j14, j11 + xingFrame.header.frameSize, i.e(Util.scaleLargeValue(j17, 8000000L, computeDurationUs, roundingMode)), i.e(h.g(j17, xingFrame.frameCount, roundingMode)), false);
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }
}
