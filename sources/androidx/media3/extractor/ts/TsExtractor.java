package androidx.media3.extractor.ts;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.SubtitleTranscodingExtractorOutput;
import androidx.media3.extractor.ts.TsPayloadReader;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class TsExtractor implements Extractor {
    private static final long AC3_FORMAT_IDENTIFIER = 1094921523;
    private static final long AC4_FORMAT_IDENTIFIER = 1094921524;
    private static final int BUFFER_SIZE = 9400;
    public static final int DEFAULT_TIMESTAMP_SEARCH_BYTES = 112800;
    private static final long E_AC3_FORMAT_IDENTIFIER = 1161904947;

    @Deprecated
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: androidx.media3.extractor.ts.g
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return TsExtractor.a();
        }
    };
    public static final int FLAG_EMIT_RAW_SUBTITLE_DATA = 1;
    private static final long HEVC_FORMAT_IDENTIFIER = 1212503619;
    private static final int MAX_PID_PLUS_ONE = 8192;
    public static final int MODE_HLS = 2;
    public static final int MODE_MULTI_PMT = 0;
    public static final int MODE_SINGLE_PMT = 1;
    private static final int SNIFF_TS_PACKET_COUNT = 5;
    public static final int TS_PACKET_SIZE = 188;
    private static final int TS_PAT_PID = 0;
    public static final int TS_STREAM_TYPE_AAC_ADTS = 15;
    public static final int TS_STREAM_TYPE_AAC_LATM = 17;
    public static final int TS_STREAM_TYPE_AC3 = 129;
    public static final int TS_STREAM_TYPE_AC4 = 172;
    public static final int TS_STREAM_TYPE_AIT = 257;
    public static final int TS_STREAM_TYPE_DC2_H262 = 128;
    public static final int TS_STREAM_TYPE_DTS = 138;
    public static final int TS_STREAM_TYPE_DTS_HD = 136;
    public static final int TS_STREAM_TYPE_DTS_UHD = 139;
    public static final int TS_STREAM_TYPE_DVBSUBS = 89;
    public static final int TS_STREAM_TYPE_E_AC3 = 135;
    public static final int TS_STREAM_TYPE_H262 = 2;
    public static final int TS_STREAM_TYPE_H263 = 16;
    public static final int TS_STREAM_TYPE_H264 = 27;
    public static final int TS_STREAM_TYPE_H265 = 36;
    public static final int TS_STREAM_TYPE_HDMV_DTS = 130;
    public static final int TS_STREAM_TYPE_ID3 = 21;
    public static final int TS_STREAM_TYPE_MHAS = 45;
    public static final int TS_STREAM_TYPE_MPA = 3;
    public static final int TS_STREAM_TYPE_MPA_LSF = 4;
    public static final int TS_STREAM_TYPE_SPLICE_INFO = 134;
    public static final int TS_SYNC_BYTE = 71;
    private int bytesSinceLastSync;
    private final SparseIntArray continuityCounters;
    private final TsDurationReader durationReader;
    private final int extractorFlags;
    private boolean hasOutputSeekMap;

    @Nullable
    private TsPayloadReader id3Reader;
    private final int mode;
    private ExtractorOutput output;
    private final TsPayloadReader.Factory payloadReaderFactory;
    private int pcrPid;
    private boolean pendingSeekToStart;
    private int remainingPmts;
    private final SubtitleParser.Factory subtitleParserFactory;
    private final List<TimestampAdjuster> timestampAdjusters;
    private final int timestampSearchBytes;
    private final SparseBooleanArray trackIds;
    private final SparseBooleanArray trackPids;
    private boolean tracksEnded;
    private TsBinarySearchSeeker tsBinarySearchSeeker;
    private final ParsableByteArray tsPacketBuffer;
    private final SparseArray<TsPayloadReader> tsPayloadReaders;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    @Deprecated
    public TsExtractor() {
        this(1, 1, SubtitleParser.Factory.UNSUPPORTED, new TimestampAdjuster(0L), new DefaultTsPayloadReaderFactory(0), DEFAULT_TIMESTAMP_SEARCH_BYTES);
    }

    public static /* synthetic */ Extractor[] a() {
        return new Extractor[]{new TsExtractor(1, SubtitleParser.Factory.UNSUPPORTED)};
    }

    public static /* synthetic */ int access$108(TsExtractor tsExtractor) {
        int i11 = tsExtractor.remainingPmts;
        tsExtractor.remainingPmts = i11 + 1;
        return i11;
    }

    public static /* synthetic */ Extractor[] b(SubtitleParser.Factory factory) {
        return new Extractor[]{new TsExtractor(factory)};
    }

    private boolean fillBufferWithAtLeastOnePacket(ExtractorInput extractorInput) throws IOException {
        byte[] data = this.tsPacketBuffer.getData();
        if (9400 - this.tsPacketBuffer.getPosition() < 188) {
            int bytesLeft = this.tsPacketBuffer.bytesLeft();
            if (bytesLeft > 0) {
                System.arraycopy(data, this.tsPacketBuffer.getPosition(), data, 0, bytesLeft);
            }
            this.tsPacketBuffer.reset(data, bytesLeft);
        }
        while (this.tsPacketBuffer.bytesLeft() < 188) {
            int limit = this.tsPacketBuffer.limit();
            int read = extractorInput.read(data, limit, 9400 - limit);
            if (read == -1) {
                return false;
            }
            this.tsPacketBuffer.setLimit(limit + read);
        }
        return true;
    }

    private int findEndOfFirstTsPacketInBuffer() throws ParserException {
        int position = this.tsPacketBuffer.getPosition();
        int limit = this.tsPacketBuffer.limit();
        int findSyncBytePosition = TsUtil.findSyncBytePosition(this.tsPacketBuffer.getData(), position, limit);
        this.tsPacketBuffer.setPosition(findSyncBytePosition);
        int i11 = findSyncBytePosition + 188;
        if (i11 <= limit) {
            this.bytesSinceLastSync = 0;
            return i11;
        }
        int i12 = this.bytesSinceLastSync + (findSyncBytePosition - position);
        this.bytesSinceLastSync = i12;
        if (this.mode != 2 || i12 <= 376) {
            return i11;
        }
        throw ParserException.createForMalformedContainer("Cannot find sync byte. Most likely not a Transport Stream.", null);
    }

    private void maybeOutputSeekMap(long j11) {
        if (this.hasOutputSeekMap) {
            return;
        }
        this.hasOutputSeekMap = true;
        if (this.durationReader.getDurationUs() == C.TIME_UNSET) {
            this.output.seekMap(new SeekMap.Unseekable(this.durationReader.getDurationUs()));
            return;
        }
        TsBinarySearchSeeker tsBinarySearchSeeker = new TsBinarySearchSeeker(this.durationReader.getPcrTimestampAdjuster(), this.durationReader.getDurationUs(), j11, this.pcrPid, this.timestampSearchBytes);
        this.tsBinarySearchSeeker = tsBinarySearchSeeker;
        this.output.seekMap(tsBinarySearchSeeker.getSeekMap());
    }

    public static ExtractorsFactory newFactory(final SubtitleParser.Factory factory) {
        return new ExtractorsFactory() { // from class: androidx.media3.extractor.ts.f
            @Override // androidx.media3.extractor.ExtractorsFactory
            public final Extractor[] createExtractors() {
                return TsExtractor.b(SubtitleParser.Factory.this);
            }
        };
    }

    private void resetPayloadReaders() {
        this.trackIds.clear();
        this.tsPayloadReaders.clear();
        SparseArray<TsPayloadReader> createInitialPayloadReaders = this.payloadReaderFactory.createInitialPayloadReaders();
        int size = createInitialPayloadReaders.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.tsPayloadReaders.put(createInitialPayloadReaders.keyAt(i11), createInitialPayloadReaders.valueAt(i11));
        }
        this.tsPayloadReaders.put(0, new SectionReader(new PatReader()));
        this.id3Reader = null;
    }

    private boolean shouldConsumePacketPayload(int i11) {
        return this.mode == 2 || this.tracksEnded || !this.trackPids.get(i11, false);
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        if ((this.extractorFlags & 1) == 0) {
            extractorOutput = new SubtitleTranscodingExtractorOutput(extractorOutput, this.subtitleParserFactory);
        }
        this.output = extractorOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        int i11;
        long length = extractorInput.getLength();
        boolean z11 = this.mode == 2;
        if (this.tracksEnded) {
            if (length != -1 && !z11 && !this.durationReader.isDurationReadFinished()) {
                return this.durationReader.readDuration(extractorInput, positionHolder, this.pcrPid);
            }
            maybeOutputSeekMap(length);
            if (this.pendingSeekToStart) {
                this.pendingSeekToStart = false;
                seek(0L, 0L);
                if (extractorInput.getPosition() != 0) {
                    positionHolder.position = 0L;
                    return 1;
                }
            }
            TsBinarySearchSeeker tsBinarySearchSeeker = this.tsBinarySearchSeeker;
            if (tsBinarySearchSeeker != null && tsBinarySearchSeeker.isSeeking()) {
                return this.tsBinarySearchSeeker.handlePendingSeek(extractorInput, positionHolder);
            }
        }
        if (!fillBufferWithAtLeastOnePacket(extractorInput)) {
            for (int i12 = 0; i12 < this.tsPayloadReaders.size(); i12++) {
                TsPayloadReader valueAt = this.tsPayloadReaders.valueAt(i12);
                if (valueAt instanceof PesReader) {
                    PesReader pesReader = (PesReader) valueAt;
                    if (pesReader.canConsumeSynthesizedEmptyPusi(z11)) {
                        pesReader.consume(new ParsableByteArray(), 1);
                    }
                }
            }
            return -1;
        }
        int findEndOfFirstTsPacketInBuffer = findEndOfFirstTsPacketInBuffer();
        int limit = this.tsPacketBuffer.limit();
        if (findEndOfFirstTsPacketInBuffer > limit) {
            return 0;
        }
        int readInt = this.tsPacketBuffer.readInt();
        if ((8388608 & readInt) != 0) {
            this.tsPacketBuffer.setPosition(findEndOfFirstTsPacketInBuffer);
            return 0;
        }
        int i13 = (4194304 & readInt) != 0 ? 1 : 0;
        int i14 = (2096896 & readInt) >> 8;
        boolean z12 = (readInt & 32) != 0;
        TsPayloadReader tsPayloadReader = (readInt & 16) != 0 ? this.tsPayloadReaders.get(i14) : null;
        if (tsPayloadReader == null) {
            this.tsPacketBuffer.setPosition(findEndOfFirstTsPacketInBuffer);
            return 0;
        }
        if (this.mode != 2) {
            int i15 = readInt & 15;
            i11 = 0;
            int i16 = this.continuityCounters.get(i14, i15 - 1);
            this.continuityCounters.put(i14, i15);
            if (i16 == i15) {
                this.tsPacketBuffer.setPosition(findEndOfFirstTsPacketInBuffer);
                return 0;
            }
            if (i15 != ((i16 + 1) & 15)) {
                tsPayloadReader.seek();
            }
        } else {
            i11 = 0;
        }
        if (z12) {
            int readUnsignedByte = this.tsPacketBuffer.readUnsignedByte();
            i13 |= (this.tsPacketBuffer.readUnsignedByte() & 64) != 0 ? 2 : i11;
            this.tsPacketBuffer.skipBytes(readUnsignedByte - 1);
        }
        boolean z13 = this.tracksEnded;
        if (shouldConsumePacketPayload(i14)) {
            this.tsPacketBuffer.setLimit(findEndOfFirstTsPacketInBuffer);
            tsPayloadReader.consume(this.tsPacketBuffer, i13);
            this.tsPacketBuffer.setLimit(limit);
        }
        if (this.mode != 2 && !z13 && this.tracksEnded && length != -1) {
            this.pendingSeekToStart = true;
        }
        this.tsPacketBuffer.setPosition(findEndOfFirstTsPacketInBuffer);
        return i11;
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j11, long j12) {
        TsBinarySearchSeeker tsBinarySearchSeeker;
        Assertions.checkState(this.mode != 2);
        int size = this.timestampAdjusters.size();
        for (int i11 = 0; i11 < size; i11++) {
            TimestampAdjuster timestampAdjuster = this.timestampAdjusters.get(i11);
            boolean z11 = timestampAdjuster.getTimestampOffsetUs() == C.TIME_UNSET;
            if (!z11) {
                long firstSampleTimestampUs = timestampAdjuster.getFirstSampleTimestampUs();
                z11 = (firstSampleTimestampUs == C.TIME_UNSET || firstSampleTimestampUs == 0 || firstSampleTimestampUs == j12) ? false : true;
            }
            if (z11) {
                timestampAdjuster.reset(j12);
            }
        }
        if (j12 != 0 && (tsBinarySearchSeeker = this.tsBinarySearchSeeker) != null) {
            tsBinarySearchSeeker.setSeekTargetUs(j12);
        }
        this.tsPacketBuffer.reset(0);
        this.continuityCounters.clear();
        for (int i12 = 0; i12 < this.tsPayloadReaders.size(); i12++) {
            this.tsPayloadReaders.valueAt(i12).seek();
        }
        this.bytesSinceLastSync = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // androidx.media3.extractor.Extractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean sniff(androidx.media3.extractor.ExtractorInput r7) throws java.io.IOException {
        /*
            r6 = this;
            androidx.media3.common.util.ParsableByteArray r0 = r6.tsPacketBuffer
            byte[] r0 = r0.getData()
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.peekFully(r0, r2, r1)
            r1 = r2
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L29
            r3 = r2
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r1 = r1 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.skipFully(r1)
            r7 = 1
            return r7
        L29:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.ts.TsExtractor.sniff(androidx.media3.extractor.ExtractorInput):boolean");
    }

    public TsExtractor(SubtitleParser.Factory factory) {
        this(1, 0, factory, new TimestampAdjuster(0L), new DefaultTsPayloadReaderFactory(0), DEFAULT_TIMESTAMP_SEARCH_BYTES);
    }

    public TsExtractor(int i11, SubtitleParser.Factory factory) {
        this(1, i11, factory, new TimestampAdjuster(0L), new DefaultTsPayloadReaderFactory(0), DEFAULT_TIMESTAMP_SEARCH_BYTES);
    }

    @Deprecated
    public TsExtractor(int i11) {
        this(1, 1, SubtitleParser.Factory.UNSUPPORTED, new TimestampAdjuster(0L), new DefaultTsPayloadReaderFactory(i11), DEFAULT_TIMESTAMP_SEARCH_BYTES);
    }

    @Deprecated
    public TsExtractor(int i11, int i12, int i13) {
        this(i11, 1, SubtitleParser.Factory.UNSUPPORTED, new TimestampAdjuster(0L), new DefaultTsPayloadReaderFactory(i12), i13);
    }

    @Deprecated
    public TsExtractor(int i11, TimestampAdjuster timestampAdjuster, TsPayloadReader.Factory factory) {
        this(i11, 1, SubtitleParser.Factory.UNSUPPORTED, timestampAdjuster, factory, DEFAULT_TIMESTAMP_SEARCH_BYTES);
    }

    @Deprecated
    public TsExtractor(int i11, TimestampAdjuster timestampAdjuster, TsPayloadReader.Factory factory, int i12) {
        this(i11, 1, SubtitleParser.Factory.UNSUPPORTED, timestampAdjuster, factory, i12);
    }

    public TsExtractor(int i11, int i12, SubtitleParser.Factory factory, TimestampAdjuster timestampAdjuster, TsPayloadReader.Factory factory2, int i13) {
        this.payloadReaderFactory = (TsPayloadReader.Factory) Assertions.checkNotNull(factory2);
        this.timestampSearchBytes = i13;
        this.mode = i11;
        this.extractorFlags = i12;
        this.subtitleParserFactory = factory;
        if (i11 != 1 && i11 != 2) {
            ArrayList arrayList = new ArrayList();
            this.timestampAdjusters = arrayList;
            arrayList.add(timestampAdjuster);
        } else {
            this.timestampAdjusters = Collections.singletonList(timestampAdjuster);
        }
        this.tsPacketBuffer = new ParsableByteArray(new byte[BUFFER_SIZE], 0);
        this.trackIds = new SparseBooleanArray();
        this.trackPids = new SparseBooleanArray();
        this.tsPayloadReaders = new SparseArray<>();
        this.continuityCounters = new SparseIntArray();
        this.durationReader = new TsDurationReader(i13);
        this.output = ExtractorOutput.PLACEHOLDER;
        this.pcrPid = -1;
        resetPayloadReaders();
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class PatReader implements SectionPayloadReader {
        private final ParsableBitArray patScratch = new ParsableBitArray(new byte[4]);

        public PatReader() {
        }

        @Override // androidx.media3.extractor.ts.SectionPayloadReader
        public void consume(ParsableByteArray parsableByteArray) {
            if (parsableByteArray.readUnsignedByte() == 0 && (parsableByteArray.readUnsignedByte() & 128) != 0) {
                parsableByteArray.skipBytes(6);
                int bytesLeft = parsableByteArray.bytesLeft() / 4;
                for (int i11 = 0; i11 < bytesLeft; i11++) {
                    parsableByteArray.readBytes(this.patScratch, 4);
                    int readBits = this.patScratch.readBits(16);
                    this.patScratch.skipBits(3);
                    if (readBits == 0) {
                        this.patScratch.skipBits(13);
                    } else {
                        int readBits2 = this.patScratch.readBits(13);
                        if (TsExtractor.this.tsPayloadReaders.get(readBits2) == null) {
                            TsExtractor.this.tsPayloadReaders.put(readBits2, new SectionReader(TsExtractor.this.new PmtReader(readBits2)));
                            TsExtractor.access$108(TsExtractor.this);
                        }
                    }
                }
                if (TsExtractor.this.mode != 2) {
                    TsExtractor.this.tsPayloadReaders.remove(0);
                }
            }
        }

        @Override // androidx.media3.extractor.ts.SectionPayloadReader
        public void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class PmtReader implements SectionPayloadReader {
        private static final int TS_PMT_DESC_AC3 = 106;
        private static final int TS_PMT_DESC_AIT = 111;
        private static final int TS_PMT_DESC_DTS = 123;
        private static final int TS_PMT_DESC_DVBSUBS = 89;
        private static final int TS_PMT_DESC_DVB_EXT = 127;
        private static final int TS_PMT_DESC_DVB_EXT_AC4 = 21;
        private static final int TS_PMT_DESC_DVB_EXT_DTS_HD = 14;
        private static final int TS_PMT_DESC_DVB_EXT_DTS_UHD = 33;
        private static final int TS_PMT_DESC_EAC3 = 122;
        private static final int TS_PMT_DESC_ISO639_LANG = 10;
        private static final int TS_PMT_DESC_REGISTRATION = 5;
        private final int pid;
        private final ParsableBitArray pmtScratch = new ParsableBitArray(new byte[5]);
        private final SparseArray<TsPayloadReader> trackIdToReaderScratch = new SparseArray<>();
        private final SparseIntArray trackIdToPidScratch = new SparseIntArray();

        public PmtReader(int i11) {
            this.pid = i11;
        }

        private TsPayloadReader.EsInfo readEsInfo(ParsableByteArray parsableByteArray, int i11) {
            int i12;
            int position = parsableByteArray.getPosition();
            int i13 = position + i11;
            int i14 = -1;
            String str = null;
            ArrayList arrayList = null;
            int i15 = 0;
            while (parsableByteArray.getPosition() < i13) {
                int readUnsignedByte = parsableByteArray.readUnsignedByte();
                int position2 = parsableByteArray.getPosition() + parsableByteArray.readUnsignedByte();
                if (position2 > i13) {
                    break;
                }
                if (readUnsignedByte == 5) {
                    long readUnsignedInt = parsableByteArray.readUnsignedInt();
                    if (readUnsignedInt != TsExtractor.AC3_FORMAT_IDENTIFIER) {
                        if (readUnsignedInt != TsExtractor.E_AC3_FORMAT_IDENTIFIER) {
                            if (readUnsignedInt != TsExtractor.AC4_FORMAT_IDENTIFIER) {
                                if (readUnsignedInt == TsExtractor.HEVC_FORMAT_IDENTIFIER) {
                                    i14 = 36;
                                }
                            }
                            i14 = 172;
                        }
                        i14 = 135;
                    }
                    i14 = 129;
                } else {
                    if (readUnsignedByte != 106) {
                        if (readUnsignedByte != 122) {
                            if (readUnsignedByte == 127) {
                                int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                                if (readUnsignedByte2 != 21) {
                                    if (readUnsignedByte2 == 14) {
                                        i14 = 136;
                                    } else if (readUnsignedByte2 == 33) {
                                        i14 = 139;
                                    }
                                }
                                i14 = 172;
                            } else {
                                if (readUnsignedByte == 123) {
                                    i12 = 138;
                                } else if (readUnsignedByte == 10) {
                                    String trim = parsableByteArray.readString(3).trim();
                                    i15 = parsableByteArray.readUnsignedByte();
                                    str = trim;
                                } else if (readUnsignedByte == 89) {
                                    ArrayList arrayList2 = new ArrayList();
                                    while (parsableByteArray.getPosition() < position2) {
                                        String trim2 = parsableByteArray.readString(3).trim();
                                        int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                                        byte[] bArr = new byte[4];
                                        parsableByteArray.readBytes(bArr, 0, 4);
                                        arrayList2.add(new TsPayloadReader.DvbSubtitleInfo(trim2, readUnsignedByte3, bArr));
                                    }
                                    arrayList = arrayList2;
                                    i14 = 89;
                                } else if (readUnsignedByte == 111) {
                                    i12 = 257;
                                }
                                i14 = i12;
                            }
                        }
                        i14 = 135;
                    }
                    i14 = 129;
                }
                parsableByteArray.skipBytes(position2 - parsableByteArray.getPosition());
            }
            parsableByteArray.setPosition(i13);
            return new TsPayloadReader.EsInfo(i14, str, i15, arrayList, Arrays.copyOfRange(parsableByteArray.getData(), position, i13));
        }

        @Override // androidx.media3.extractor.ts.SectionPayloadReader
        public void consume(ParsableByteArray parsableByteArray) {
            TimestampAdjuster timestampAdjuster;
            if (parsableByteArray.readUnsignedByte() != 2) {
                return;
            }
            if (TsExtractor.this.mode == 1 || TsExtractor.this.mode == 2 || TsExtractor.this.remainingPmts == 1) {
                timestampAdjuster = (TimestampAdjuster) TsExtractor.this.timestampAdjusters.get(0);
            } else {
                timestampAdjuster = new TimestampAdjuster(((TimestampAdjuster) TsExtractor.this.timestampAdjusters.get(0)).getFirstSampleTimestampUs());
                TsExtractor.this.timestampAdjusters.add(timestampAdjuster);
            }
            if ((parsableByteArray.readUnsignedByte() & 128) == 0) {
                return;
            }
            parsableByteArray.skipBytes(1);
            int readUnsignedShort = parsableByteArray.readUnsignedShort();
            int i11 = 3;
            parsableByteArray.skipBytes(3);
            parsableByteArray.readBytes(this.pmtScratch, 2);
            this.pmtScratch.skipBits(3);
            int i12 = 13;
            TsExtractor.this.pcrPid = this.pmtScratch.readBits(13);
            parsableByteArray.readBytes(this.pmtScratch, 2);
            int i13 = 4;
            this.pmtScratch.skipBits(4);
            parsableByteArray.skipBytes(this.pmtScratch.readBits(12));
            if (TsExtractor.this.mode == 2 && TsExtractor.this.id3Reader == null) {
                TsPayloadReader.EsInfo esInfo = new TsPayloadReader.EsInfo(21, null, 0, null, Util.EMPTY_BYTE_ARRAY);
                TsExtractor tsExtractor = TsExtractor.this;
                tsExtractor.id3Reader = tsExtractor.payloadReaderFactory.createPayloadReader(21, esInfo);
                if (TsExtractor.this.id3Reader != null) {
                    TsExtractor.this.id3Reader.init(timestampAdjuster, TsExtractor.this.output, new TsPayloadReader.TrackIdGenerator(readUnsignedShort, 21, 8192));
                }
            }
            this.trackIdToReaderScratch.clear();
            this.trackIdToPidScratch.clear();
            int bytesLeft = parsableByteArray.bytesLeft();
            while (bytesLeft > 0) {
                parsableByteArray.readBytes(this.pmtScratch, 5);
                int readBits = this.pmtScratch.readBits(8);
                this.pmtScratch.skipBits(i11);
                int readBits2 = this.pmtScratch.readBits(i12);
                this.pmtScratch.skipBits(i13);
                int readBits3 = this.pmtScratch.readBits(12);
                TsPayloadReader.EsInfo readEsInfo = readEsInfo(parsableByteArray, readBits3);
                if (readBits == 6 || readBits == 5) {
                    readBits = readEsInfo.streamType;
                }
                bytesLeft -= readBits3 + 5;
                int i14 = TsExtractor.this.mode == 2 ? readBits : readBits2;
                if (!TsExtractor.this.trackIds.get(i14)) {
                    TsPayloadReader createPayloadReader = (TsExtractor.this.mode == 2 && readBits == 21) ? TsExtractor.this.id3Reader : TsExtractor.this.payloadReaderFactory.createPayloadReader(readBits, readEsInfo);
                    if (TsExtractor.this.mode != 2 || readBits2 < this.trackIdToPidScratch.get(i14, 8192)) {
                        this.trackIdToPidScratch.put(i14, readBits2);
                        this.trackIdToReaderScratch.put(i14, createPayloadReader);
                    }
                }
                i11 = 3;
                i13 = 4;
                i12 = 13;
            }
            int size = this.trackIdToPidScratch.size();
            for (int i15 = 0; i15 < size; i15++) {
                int keyAt = this.trackIdToPidScratch.keyAt(i15);
                int valueAt = this.trackIdToPidScratch.valueAt(i15);
                TsExtractor.this.trackIds.put(keyAt, true);
                TsExtractor.this.trackPids.put(valueAt, true);
                TsPayloadReader valueAt2 = this.trackIdToReaderScratch.valueAt(i15);
                if (valueAt2 != null) {
                    if (valueAt2 != TsExtractor.this.id3Reader) {
                        valueAt2.init(timestampAdjuster, TsExtractor.this.output, new TsPayloadReader.TrackIdGenerator(readUnsignedShort, keyAt, 8192));
                    }
                    TsExtractor.this.tsPayloadReaders.put(valueAt, valueAt2);
                }
            }
            if (TsExtractor.this.mode == 2) {
                if (TsExtractor.this.tracksEnded) {
                    return;
                }
                TsExtractor.this.output.endTracks();
                TsExtractor.this.remainingPmts = 0;
                TsExtractor.this.tracksEnded = true;
                return;
            }
            TsExtractor.this.tsPayloadReaders.remove(this.pid);
            TsExtractor tsExtractor2 = TsExtractor.this;
            tsExtractor2.remainingPmts = tsExtractor2.mode == 1 ? 0 : TsExtractor.this.remainingPmts - 1;
            if (TsExtractor.this.remainingPmts == 0) {
                TsExtractor.this.output.endTracks();
                TsExtractor.this.tracksEnded = true;
            }
        }

        @Override // androidx.media3.extractor.ts.SectionPayloadReader
        public void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        }
    }
}
