package androidx.media3.extractor.ts;

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
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.ts.TsPayloadReader;
import com.google.common.base.Preconditions;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class H265Reader implements ElementaryStreamReader {
    private final String containerMimeType;
    private String formatId;
    private boolean hasOutputFormat;
    private TrackOutput output;
    private SampleReader sampleReader;
    private final SeiReader seiReader;
    private long totalBytesWritten;
    private final boolean[] prefixFlags = new boolean[3];
    private final NalUnitTargetBuffer vps = new NalUnitTargetBuffer(32, 128);
    private final NalUnitTargetBuffer sps = new NalUnitTargetBuffer(33, 128);
    private final NalUnitTargetBuffer pps = new NalUnitTargetBuffer(34, 128);
    private final NalUnitTargetBuffer prefixSei = new NalUnitTargetBuffer(39, 128);
    private final NalUnitTargetBuffer suffixSei = new NalUnitTargetBuffer(40, 128);
    private long pesTimeUs = C.TIME_UNSET;
    private final ParsableByteArray seiWrapper = new ParsableByteArray();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class SampleReader {
        private static final int FIRST_SLICE_FLAG_OFFSET = 2;
        private boolean isFirstPrefixNalUnit;
        private boolean isFirstSlice;
        private boolean lookingForFirstSliceFlag;
        private int nalUnitBytesRead;
        private boolean nalUnitHasKeyframeData;
        private long nalUnitPosition;
        private long nalUnitTimeUs;
        private final TrackOutput output;
        private boolean readingPrefix;
        private boolean readingSample;
        private boolean sampleIsKeyframe;
        private long samplePosition;
        private long sampleTimeUs;

        public SampleReader(TrackOutput trackOutput) {
            this.output = trackOutput;
        }

        private static boolean isPrefixNalUnit(int i11) {
            return (32 <= i11 && i11 <= 35) || i11 == 39;
        }

        private static boolean isVclBodyNalUnit(int i11) {
            return i11 < 32 || i11 == 40;
        }

        private void outputSample(int i11) {
            long j11 = this.sampleTimeUs;
            if (j11 != C.TIME_UNSET) {
                long j12 = this.nalUnitPosition;
                long j13 = this.samplePosition;
                if (j12 == j13) {
                    return;
                }
                int i12 = (int) (j12 - j13);
                this.output.sampleMetadata(j11, this.sampleIsKeyframe ? 1 : 0, i12, i11, null);
            }
        }

        public void endNalUnit(long j11, int i11, boolean z11) {
            if (this.readingPrefix && this.isFirstSlice) {
                this.sampleIsKeyframe = this.nalUnitHasKeyframeData;
                this.readingPrefix = false;
            } else if (this.isFirstPrefixNalUnit || this.isFirstSlice) {
                if (z11 && this.readingSample) {
                    outputSample(i11 + ((int) (j11 - this.nalUnitPosition)));
                }
                this.samplePosition = this.nalUnitPosition;
                this.sampleTimeUs = this.nalUnitTimeUs;
                this.sampleIsKeyframe = this.nalUnitHasKeyframeData;
                this.readingSample = true;
            }
        }

        public void readNalUnitData(byte[] bArr, int i11, int i12) {
            if (this.lookingForFirstSliceFlag) {
                int i13 = this.nalUnitBytesRead;
                int i14 = (i11 + 2) - i13;
                if (i14 >= i12) {
                    this.nalUnitBytesRead = i13 + (i12 - i11);
                } else {
                    this.isFirstSlice = (bArr[i14] & 128) != 0;
                    this.lookingForFirstSliceFlag = false;
                }
            }
        }

        public void reset() {
            this.lookingForFirstSliceFlag = false;
            this.isFirstSlice = false;
            this.isFirstPrefixNalUnit = false;
            this.readingSample = false;
            this.readingPrefix = false;
        }

        public void startNalUnit(long j11, int i11, int i12, long j12, boolean z11) {
            this.isFirstSlice = false;
            this.isFirstPrefixNalUnit = false;
            this.nalUnitTimeUs = j12;
            this.nalUnitBytesRead = 0;
            this.nalUnitPosition = j11;
            if (!isVclBodyNalUnit(i12)) {
                if (this.readingSample && !this.readingPrefix) {
                    if (z11) {
                        outputSample(i11);
                    }
                    this.readingSample = false;
                }
                if (isPrefixNalUnit(i12)) {
                    this.isFirstPrefixNalUnit = !this.readingPrefix;
                    this.readingPrefix = true;
                }
            }
            boolean z12 = i12 >= 16 && i12 <= 21;
            this.nalUnitHasKeyframeData = z12;
            this.lookingForFirstSliceFlag = z12 || i12 <= 9;
        }
    }

    public H265Reader(SeiReader seiReader, String str) {
        this.seiReader = seiReader;
        this.containerMimeType = str;
    }

    @EnsuresNonNull({"output", "sampleReader"})
    private void assertTracksCreated() {
        Assertions.checkStateNotNull(this.output);
        Util.castNonNull(this.sampleReader);
    }

    @RequiresNonNull({"output", "sampleReader"})
    private void endNalUnit(long j11, int i11, int i12, long j12) {
        this.sampleReader.endNalUnit(j11, i11, this.hasOutputFormat);
        if (!this.hasOutputFormat) {
            this.vps.endNalUnit(i12);
            this.sps.endNalUnit(i12);
            this.pps.endNalUnit(i12);
            if (this.vps.isCompleted() && this.sps.isCompleted() && this.pps.isCompleted()) {
                Format parseMediaFormat = parseMediaFormat(this.formatId, this.vps, this.sps, this.pps, this.containerMimeType);
                this.output.format(parseMediaFormat);
                Preconditions.checkState(parseMediaFormat.maxNumReorderSamples != -1);
                this.seiReader.setReorderingQueueSize(parseMediaFormat.maxNumReorderSamples);
                this.hasOutputFormat = true;
            }
        }
        if (this.prefixSei.endNalUnit(i12)) {
            NalUnitTargetBuffer nalUnitTargetBuffer = this.prefixSei;
            this.seiWrapper.reset(this.prefixSei.nalData, NalUnitUtil.unescapeStream(nalUnitTargetBuffer.nalData, nalUnitTargetBuffer.nalLength));
            this.seiWrapper.skipBytes(5);
            this.seiReader.consume(j12, this.seiWrapper);
        }
        if (this.suffixSei.endNalUnit(i12)) {
            NalUnitTargetBuffer nalUnitTargetBuffer2 = this.suffixSei;
            this.seiWrapper.reset(this.suffixSei.nalData, NalUnitUtil.unescapeStream(nalUnitTargetBuffer2.nalData, nalUnitTargetBuffer2.nalLength));
            this.seiWrapper.skipBytes(5);
            this.seiReader.consume(j12, this.seiWrapper);
        }
    }

    @RequiresNonNull({"sampleReader"})
    private void nalUnitData(byte[] bArr, int i11, int i12) {
        this.sampleReader.readNalUnitData(bArr, i11, i12);
        if (!this.hasOutputFormat) {
            this.vps.appendToNalUnit(bArr, i11, i12);
            this.sps.appendToNalUnit(bArr, i11, i12);
            this.pps.appendToNalUnit(bArr, i11, i12);
        }
        this.prefixSei.appendToNalUnit(bArr, i11, i12);
        this.suffixSei.appendToNalUnit(bArr, i11, i12);
    }

    private static Format parseMediaFormat(@Nullable String str, NalUnitTargetBuffer nalUnitTargetBuffer, NalUnitTargetBuffer nalUnitTargetBuffer2, NalUnitTargetBuffer nalUnitTargetBuffer3, String str2) {
        int i11 = nalUnitTargetBuffer.nalLength;
        byte[] bArr = new byte[nalUnitTargetBuffer2.nalLength + i11 + nalUnitTargetBuffer3.nalLength];
        System.arraycopy(nalUnitTargetBuffer.nalData, 0, bArr, 0, i11);
        System.arraycopy(nalUnitTargetBuffer2.nalData, 0, bArr, nalUnitTargetBuffer.nalLength, nalUnitTargetBuffer2.nalLength);
        System.arraycopy(nalUnitTargetBuffer3.nalData, 0, bArr, nalUnitTargetBuffer.nalLength + nalUnitTargetBuffer2.nalLength, nalUnitTargetBuffer3.nalLength);
        NalUnitUtil.H265SpsData parseH265SpsNalUnit = NalUnitUtil.parseH265SpsNalUnit(nalUnitTargetBuffer2.nalData, 3, nalUnitTargetBuffer2.nalLength, null);
        NalUnitUtil.H265ProfileTierLevel h265ProfileTierLevel = parseH265SpsNalUnit.profileTierLevel;
        return new Format.Builder().setId(str).setContainerMimeType(str2).setSampleMimeType(MimeTypes.VIDEO_H265).setCodecs(h265ProfileTierLevel != null ? CodecSpecificDataUtil.buildHevcCodecString(h265ProfileTierLevel.generalProfileSpace, h265ProfileTierLevel.generalTierFlag, h265ProfileTierLevel.generalProfileIdc, h265ProfileTierLevel.generalProfileCompatibilityFlags, h265ProfileTierLevel.constraintBytes, h265ProfileTierLevel.generalLevelIdc) : null).setWidth(parseH265SpsNalUnit.width).setHeight(parseH265SpsNalUnit.height).setColorInfo(new ColorInfo.Builder().setColorSpace(parseH265SpsNalUnit.colorSpace).setColorRange(parseH265SpsNalUnit.colorRange).setColorTransfer(parseH265SpsNalUnit.colorTransfer).setLumaBitdepth(parseH265SpsNalUnit.bitDepthLumaMinus8 + 8).setChromaBitdepth(parseH265SpsNalUnit.bitDepthChromaMinus8 + 8).build()).setPixelWidthHeightRatio(parseH265SpsNalUnit.pixelWidthHeightRatio).setMaxNumReorderSamples(parseH265SpsNalUnit.maxNumReorderPics).setMaxSubLayers(parseH265SpsNalUnit.maxSubLayersMinus1 + 1).setInitializationData(Collections.singletonList(bArr)).build();
    }

    @RequiresNonNull({"sampleReader"})
    private void startNalUnit(long j11, int i11, int i12, long j12) {
        this.sampleReader.startNalUnit(j11, i11, i12, j12, this.hasOutputFormat);
        if (!this.hasOutputFormat) {
            this.vps.startNalUnit(i12);
            this.sps.startNalUnit(i12);
            this.pps.startNalUnit(i12);
        }
        this.prefixSei.startNalUnit(i12);
        this.suffixSei.startNalUnit(i12);
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void consume(ParsableByteArray parsableByteArray) {
        int i11;
        assertTracksCreated();
        while (parsableByteArray.bytesLeft() > 0) {
            int position = parsableByteArray.getPosition();
            int limit = parsableByteArray.limit();
            byte[] data = parsableByteArray.getData();
            this.totalBytesWritten += parsableByteArray.bytesLeft();
            this.output.sampleData(parsableByteArray, parsableByteArray.bytesLeft());
            while (position < limit) {
                int findNalUnit = NalUnitUtil.findNalUnit(data, position, limit, this.prefixFlags);
                if (findNalUnit == limit) {
                    nalUnitData(data, position, limit);
                    return;
                }
                int h265NalUnitType = NalUnitUtil.getH265NalUnitType(data, findNalUnit);
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
                startNalUnit(j11, i15, h265NalUnitType, this.pesTimeUs);
                position = i12 + i13;
            }
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        TrackOutput track = extractorOutput.track(trackIdGenerator.getTrackId(), 2);
        this.output = track;
        this.sampleReader = new SampleReader(track);
        this.seiReader.createTracks(extractorOutput, trackIdGenerator);
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void packetFinished(boolean z11) {
        assertTracksCreated();
        if (z11) {
            this.seiReader.flush();
            endNalUnit(this.totalBytesWritten, 0, 0, this.pesTimeUs);
            startNalUnit(this.totalBytesWritten, 0, 48, this.pesTimeUs);
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void packetStarted(long j11, int i11) {
        this.pesTimeUs = j11;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void seek() {
        this.totalBytesWritten = 0L;
        this.pesTimeUs = C.TIME_UNSET;
        NalUnitUtil.clearPrefixFlags(this.prefixFlags);
        this.vps.reset();
        this.sps.reset();
        this.pps.reset();
        this.prefixSei.reset();
        this.suffixSei.reset();
        this.seiReader.clear();
        SampleReader sampleReader = this.sampleReader;
        if (sampleReader != null) {
            sampleReader.reset();
        }
    }
}
