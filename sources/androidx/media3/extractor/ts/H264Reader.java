package androidx.media3.extractor.ts;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.container.ParsableNalUnitBitArray;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.ts.TsPayloadReader;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class H264Reader implements ElementaryStreamReader {
    private final boolean allowNonIdrKeyframes;
    private final String containerMimeType;
    private final boolean detectAccessUnits;
    private String formatId;
    private boolean hasOutputFormat;
    private TrackOutput output;
    private boolean randomAccessIndicator;
    private SampleReader sampleReader;
    private final SeiReader seiReader;
    private long totalBytesWritten;
    private final boolean[] prefixFlags = new boolean[3];
    private final NalUnitTargetBuffer sps = new NalUnitTargetBuffer(7, 128);
    private final NalUnitTargetBuffer pps = new NalUnitTargetBuffer(8, 128);
    private final NalUnitTargetBuffer sei = new NalUnitTargetBuffer(6, 128);
    private long pesTimeUs = C.TIME_UNSET;
    private final ParsableByteArray seiWrapper = new ParsableByteArray();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class SampleReader {
        private static final int DEFAULT_BUFFER_SIZE = 128;
        private final boolean allowNonIdrKeyframes;
        private final ParsableNalUnitBitArray bitArray;
        private byte[] buffer;
        private int bufferLength;
        private final boolean detectAccessUnits;
        private boolean isFilling;
        private long nalUnitStartPosition;
        private long nalUnitTimeUs;
        private int nalUnitType;
        private final TrackOutput output;
        private SliceHeaderData previousSliceHeader;
        private boolean randomAccessIndicator;
        private boolean readingSample;
        private boolean sampleIsKeyframe;
        private long samplePosition;
        private long sampleTimeUs;
        private SliceHeaderData sliceHeader;
        private final SparseArray<NalUnitUtil.SpsData> sps = new SparseArray<>();
        private final SparseArray<NalUnitUtil.PpsData> pps = new SparseArray<>();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class SliceHeaderData {
            private static final int SLICE_TYPE_ALL_I = 7;
            private static final int SLICE_TYPE_I = 2;
            private boolean bottomFieldFlag;
            private boolean bottomFieldFlagPresent;
            private int deltaPicOrderCnt0;
            private int deltaPicOrderCnt1;
            private int deltaPicOrderCntBottom;
            private boolean fieldPicFlag;
            private int frameNum;
            private boolean hasSliceType;
            private boolean idrPicFlag;
            private int idrPicId;
            private boolean isComplete;
            private int nalRefIdc;
            private int picOrderCntLsb;
            private int picParameterSetId;
            private int sliceType;

            @Nullable
            private NalUnitUtil.SpsData spsData;

            private SliceHeaderData() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean isFirstVclNalUnitOfPicture(SliceHeaderData sliceHeaderData) {
                int i11;
                int i12;
                int i13;
                boolean z11;
                if (!this.isComplete) {
                    return false;
                }
                if (!sliceHeaderData.isComplete) {
                    return true;
                }
                NalUnitUtil.SpsData spsData = (NalUnitUtil.SpsData) Assertions.checkStateNotNull(this.spsData);
                NalUnitUtil.SpsData spsData2 = (NalUnitUtil.SpsData) Assertions.checkStateNotNull(sliceHeaderData.spsData);
                return (this.frameNum == sliceHeaderData.frameNum && this.picParameterSetId == sliceHeaderData.picParameterSetId && this.fieldPicFlag == sliceHeaderData.fieldPicFlag && (!this.bottomFieldFlagPresent || !sliceHeaderData.bottomFieldFlagPresent || this.bottomFieldFlag == sliceHeaderData.bottomFieldFlag) && (((i11 = this.nalRefIdc) == (i12 = sliceHeaderData.nalRefIdc) || (i11 != 0 && i12 != 0)) && (((i13 = spsData.picOrderCountType) != 0 || spsData2.picOrderCountType != 0 || (this.picOrderCntLsb == sliceHeaderData.picOrderCntLsb && this.deltaPicOrderCntBottom == sliceHeaderData.deltaPicOrderCntBottom)) && ((i13 != 1 || spsData2.picOrderCountType != 1 || (this.deltaPicOrderCnt0 == sliceHeaderData.deltaPicOrderCnt0 && this.deltaPicOrderCnt1 == sliceHeaderData.deltaPicOrderCnt1)) && (z11 = this.idrPicFlag) == sliceHeaderData.idrPicFlag && (!z11 || this.idrPicId == sliceHeaderData.idrPicId))))) ? false : true;
            }

            public void clear() {
                this.hasSliceType = false;
                this.isComplete = false;
            }

            public boolean isISlice() {
                if (!this.hasSliceType) {
                    return false;
                }
                int i11 = this.sliceType;
                return i11 == 7 || i11 == 2;
            }

            public void setAll(NalUnitUtil.SpsData spsData, int i11, int i12, int i13, int i14, boolean z11, boolean z12, boolean z13, boolean z14, int i15, int i16, int i17, int i18, int i19) {
                this.spsData = spsData;
                this.nalRefIdc = i11;
                this.sliceType = i12;
                this.frameNum = i13;
                this.picParameterSetId = i14;
                this.fieldPicFlag = z11;
                this.bottomFieldFlagPresent = z12;
                this.bottomFieldFlag = z13;
                this.idrPicFlag = z14;
                this.idrPicId = i15;
                this.picOrderCntLsb = i16;
                this.deltaPicOrderCntBottom = i17;
                this.deltaPicOrderCnt0 = i18;
                this.deltaPicOrderCnt1 = i19;
                this.isComplete = true;
                this.hasSliceType = true;
            }

            public void setSliceType(int i11) {
                this.sliceType = i11;
                this.hasSliceType = true;
            }
        }

        public SampleReader(TrackOutput trackOutput, boolean z11, boolean z12) {
            this.output = trackOutput;
            this.allowNonIdrKeyframes = z11;
            this.detectAccessUnits = z12;
            this.previousSliceHeader = new SliceHeaderData();
            this.sliceHeader = new SliceHeaderData();
            byte[] bArr = new byte[128];
            this.buffer = bArr;
            this.bitArray = new ParsableNalUnitBitArray(bArr, 0, 0);
            reset();
        }

        private void outputSample(int i11) {
            long j11 = this.sampleTimeUs;
            if (j11 != C.TIME_UNSET) {
                long j12 = this.nalUnitStartPosition;
                long j13 = this.samplePosition;
                if (j12 == j13) {
                    return;
                }
                int i12 = (int) (j12 - j13);
                this.output.sampleMetadata(j11, this.sampleIsKeyframe ? 1 : 0, i12, i11, null);
            }
        }

        private void setSampleIsKeyframe() {
            boolean isISlice = this.allowNonIdrKeyframes ? this.sliceHeader.isISlice() : this.randomAccessIndicator;
            boolean z11 = this.sampleIsKeyframe;
            int i11 = this.nalUnitType;
            boolean z12 = true;
            if (i11 != 5 && (!isISlice || i11 != 1)) {
                z12 = false;
            }
            this.sampleIsKeyframe = z11 | z12;
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x0109  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0110  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0129  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0161  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0123  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x010c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void appendToNalUnit(byte[] r24, int r25, int r26) {
            /*
                Method dump skipped, instructions count: 426
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.ts.H264Reader.SampleReader.appendToNalUnit(byte[], int, int):void");
        }

        public boolean endNalUnit(long j11, int i11, boolean z11) {
            if (this.nalUnitType == 9 || (this.detectAccessUnits && this.sliceHeader.isFirstVclNalUnitOfPicture(this.previousSliceHeader))) {
                if (z11 && this.readingSample) {
                    outputSample(i11 + ((int) (j11 - this.nalUnitStartPosition)));
                }
                this.samplePosition = this.nalUnitStartPosition;
                this.sampleTimeUs = this.nalUnitTimeUs;
                this.sampleIsKeyframe = false;
                this.readingSample = true;
            }
            setSampleIsKeyframe();
            this.nalUnitType = 24;
            return this.sampleIsKeyframe;
        }

        public boolean needsSpsPps() {
            return this.detectAccessUnits;
        }

        public void putPps(NalUnitUtil.PpsData ppsData) {
            this.pps.append(ppsData.picParameterSetId, ppsData);
        }

        public void putSps(NalUnitUtil.SpsData spsData) {
            this.sps.append(spsData.seqParameterSetId, spsData);
        }

        public void reset() {
            this.isFilling = false;
            this.readingSample = false;
            this.sliceHeader.clear();
        }

        public void startNalUnit(long j11, int i11, long j12, boolean z11) {
            this.nalUnitType = i11;
            this.nalUnitTimeUs = j12;
            this.nalUnitStartPosition = j11;
            this.randomAccessIndicator = z11;
            if (!this.allowNonIdrKeyframes || i11 != 1) {
                if (!this.detectAccessUnits) {
                    return;
                }
                if (i11 != 5 && i11 != 1 && i11 != 2) {
                    return;
                }
            }
            SliceHeaderData sliceHeaderData = this.previousSliceHeader;
            this.previousSliceHeader = this.sliceHeader;
            this.sliceHeader = sliceHeaderData;
            sliceHeaderData.clear();
            this.bufferLength = 0;
            this.isFilling = true;
        }
    }

    public H264Reader(SeiReader seiReader, boolean z11, boolean z12, String str) {
        this.seiReader = seiReader;
        this.allowNonIdrKeyframes = z11;
        this.detectAccessUnits = z12;
        this.containerMimeType = str;
    }

    @EnsuresNonNull({"output", "sampleReader"})
    private void assertTracksCreated() {
        Assertions.checkStateNotNull(this.output);
        Util.castNonNull(this.sampleReader);
    }

    @RequiresNonNull({"output", "sampleReader"})
    private void endNalUnit(long j11, int i11, int i12, long j12) {
        if (!this.hasOutputFormat || this.sampleReader.needsSpsPps()) {
            this.sps.endNalUnit(i12);
            this.pps.endNalUnit(i12);
            if (this.hasOutputFormat) {
                if (this.sps.isCompleted()) {
                    NalUnitTargetBuffer nalUnitTargetBuffer = this.sps;
                    NalUnitUtil.SpsData parseSpsNalUnit = NalUnitUtil.parseSpsNalUnit(nalUnitTargetBuffer.nalData, 3, nalUnitTargetBuffer.nalLength);
                    this.seiReader.setReorderingQueueSize(parseSpsNalUnit.maxNumReorderFrames);
                    this.sampleReader.putSps(parseSpsNalUnit);
                    this.sps.reset();
                } else if (this.pps.isCompleted()) {
                    NalUnitTargetBuffer nalUnitTargetBuffer2 = this.pps;
                    this.sampleReader.putPps(NalUnitUtil.parsePpsNalUnit(nalUnitTargetBuffer2.nalData, 3, nalUnitTargetBuffer2.nalLength));
                    this.pps.reset();
                }
            } else if (this.sps.isCompleted() && this.pps.isCompleted()) {
                ArrayList arrayList = new ArrayList();
                NalUnitTargetBuffer nalUnitTargetBuffer3 = this.sps;
                arrayList.add(Arrays.copyOf(nalUnitTargetBuffer3.nalData, nalUnitTargetBuffer3.nalLength));
                NalUnitTargetBuffer nalUnitTargetBuffer4 = this.pps;
                arrayList.add(Arrays.copyOf(nalUnitTargetBuffer4.nalData, nalUnitTargetBuffer4.nalLength));
                NalUnitTargetBuffer nalUnitTargetBuffer5 = this.sps;
                NalUnitUtil.SpsData parseSpsNalUnit2 = NalUnitUtil.parseSpsNalUnit(nalUnitTargetBuffer5.nalData, 3, nalUnitTargetBuffer5.nalLength);
                NalUnitTargetBuffer nalUnitTargetBuffer6 = this.pps;
                NalUnitUtil.PpsData parsePpsNalUnit = NalUnitUtil.parsePpsNalUnit(nalUnitTargetBuffer6.nalData, 3, nalUnitTargetBuffer6.nalLength);
                this.output.format(new Format.Builder().setId(this.formatId).setContainerMimeType(this.containerMimeType).setSampleMimeType(MimeTypes.VIDEO_H264).setCodecs(CodecSpecificDataUtil.buildAvcCodecString(parseSpsNalUnit2.profileIdc, parseSpsNalUnit2.constraintsFlagsAndReservedZero2Bits, parseSpsNalUnit2.levelIdc)).setWidth(parseSpsNalUnit2.width).setHeight(parseSpsNalUnit2.height).setColorInfo(new ColorInfo.Builder().setColorSpace(parseSpsNalUnit2.colorSpace).setColorRange(parseSpsNalUnit2.colorRange).setColorTransfer(parseSpsNalUnit2.colorTransfer).setLumaBitdepth(parseSpsNalUnit2.bitDepthLumaMinus8 + 8).setChromaBitdepth(parseSpsNalUnit2.bitDepthChromaMinus8 + 8).build()).setPixelWidthHeightRatio(parseSpsNalUnit2.pixelWidthHeightRatio).setInitializationData(arrayList).setMaxNumReorderSamples(parseSpsNalUnit2.maxNumReorderFrames).build());
                this.hasOutputFormat = true;
                this.seiReader.setReorderingQueueSize(parseSpsNalUnit2.maxNumReorderFrames);
                this.sampleReader.putSps(parseSpsNalUnit2);
                this.sampleReader.putPps(parsePpsNalUnit);
                this.sps.reset();
                this.pps.reset();
            }
        }
        if (this.sei.endNalUnit(i12)) {
            NalUnitTargetBuffer nalUnitTargetBuffer7 = this.sei;
            this.seiWrapper.reset(this.sei.nalData, NalUnitUtil.unescapeStream(nalUnitTargetBuffer7.nalData, nalUnitTargetBuffer7.nalLength));
            this.seiWrapper.setPosition(4);
            this.seiReader.consume(j12, this.seiWrapper);
        }
        if (this.sampleReader.endNalUnit(j11, i11, this.hasOutputFormat)) {
            this.randomAccessIndicator = false;
        }
    }

    @RequiresNonNull({"sampleReader"})
    private void nalUnitData(byte[] bArr, int i11, int i12) {
        if (!this.hasOutputFormat || this.sampleReader.needsSpsPps()) {
            this.sps.appendToNalUnit(bArr, i11, i12);
            this.pps.appendToNalUnit(bArr, i11, i12);
        }
        this.sei.appendToNalUnit(bArr, i11, i12);
        this.sampleReader.appendToNalUnit(bArr, i11, i12);
    }

    @RequiresNonNull({"sampleReader"})
    private void startNalUnit(long j11, int i11, long j12) {
        if (!this.hasOutputFormat || this.sampleReader.needsSpsPps()) {
            this.sps.startNalUnit(i11);
            this.pps.startNalUnit(i11);
        }
        this.sei.startNalUnit(i11);
        this.sampleReader.startNalUnit(j11, i11, j12, this.randomAccessIndicator);
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void consume(ParsableByteArray parsableByteArray) {
        int i11;
        assertTracksCreated();
        int position = parsableByteArray.getPosition();
        int limit = parsableByteArray.limit();
        byte[] data = parsableByteArray.getData();
        this.totalBytesWritten += parsableByteArray.bytesLeft();
        this.output.sampleData(parsableByteArray, parsableByteArray.bytesLeft());
        while (true) {
            int findNalUnit = NalUnitUtil.findNalUnit(data, position, limit, this.prefixFlags);
            if (findNalUnit == limit) {
                nalUnitData(data, position, limit);
                return;
            }
            int nalUnitType = NalUnitUtil.getNalUnitType(data, findNalUnit);
            if (findNalUnit <= 0 || data[findNalUnit - 1] != 0) {
                i11 = 3;
            } else {
                findNalUnit--;
                i11 = 4;
            }
            int i12 = findNalUnit;
            int i13 = i11;
            int i14 = i12 - position;
            if (i14 > 0) {
                nalUnitData(data, position, i12);
            }
            int i15 = limit - i12;
            long j11 = this.totalBytesWritten - i15;
            endNalUnit(j11, i15, i14 < 0 ? -i14 : 0, this.pesTimeUs);
            startNalUnit(j11, nalUnitType, this.pesTimeUs);
            position = i12 + i13;
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        TrackOutput track = extractorOutput.track(trackIdGenerator.getTrackId(), 2);
        this.output = track;
        this.sampleReader = new SampleReader(track, this.allowNonIdrKeyframes, this.detectAccessUnits);
        this.seiReader.createTracks(extractorOutput, trackIdGenerator);
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void packetFinished(boolean z11) {
        assertTracksCreated();
        if (z11) {
            this.seiReader.flush();
            endNalUnit(this.totalBytesWritten, 0, 0, this.pesTimeUs);
            startNalUnit(this.totalBytesWritten, 9, this.pesTimeUs);
            endNalUnit(this.totalBytesWritten, 0, 0, this.pesTimeUs);
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void packetStarted(long j11, int i11) {
        this.pesTimeUs = j11;
        this.randomAccessIndicator |= (i11 & 2) != 0;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void seek() {
        this.totalBytesWritten = 0L;
        this.randomAccessIndicator = false;
        this.pesTimeUs = C.TIME_UNSET;
        NalUnitUtil.clearPrefixFlags(this.prefixFlags);
        this.sps.reset();
        this.pps.reset();
        this.sei.reset();
        this.seiReader.clear();
        SampleReader sampleReader = this.sampleReader;
        if (sampleReader != null) {
            sampleReader.reset();
        }
    }
}
