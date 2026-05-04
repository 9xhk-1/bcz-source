package androidx.media3.extractor.wav;

import android.util.Pair;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.WavUtil;
import com.badlogic.gdx.graphics.f;
import com.jiongji.andriod.card.R;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class WavExtractor implements Extractor {
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: androidx.media3.extractor.wav.a
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return WavExtractor.a();
        }
    };
    private static final int STATE_READING_FILE_TYPE = 0;
    private static final int STATE_READING_FORMAT = 2;
    private static final int STATE_READING_RF64_SAMPLE_DATA_SIZE = 1;
    private static final int STATE_READING_SAMPLE_DATA = 4;
    private static final int STATE_SKIPPING_TO_SAMPLE_DATA = 3;
    private static final String TAG = "WavExtractor";
    private static final int TARGET_SAMPLES_PER_SECOND = 10;
    private ExtractorOutput extractorOutput;
    private OutputWriter outputWriter;
    private TrackOutput trackOutput;
    private int state = 0;
    private long rf64SampleDataSize = -1;
    private int dataStartPosition = -1;
    private long dataEndPosition = -1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ImaAdPcmOutputWriter implements OutputWriter {
        private static final int[] INDEX_TABLE = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        private static final int[] STEP_TABLE = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, R.styleable.Theme_drawable_tab_friends, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, f.f11630n0, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, f.f11570d0, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
        private final ParsableByteArray decodedData;
        private final ExtractorOutput extractorOutput;
        private final Format format;
        private final int framesPerBlock;
        private final byte[] inputData;
        private long outputFrameCount;
        private int pendingInputBytes;
        private int pendingOutputBytes;
        private long startTimeUs;
        private final int targetSampleSizeFrames;
        private final TrackOutput trackOutput;
        private final WavFormat wavFormat;

        public ImaAdPcmOutputWriter(ExtractorOutput extractorOutput, TrackOutput trackOutput, WavFormat wavFormat) throws ParserException {
            this.extractorOutput = extractorOutput;
            this.trackOutput = trackOutput;
            this.wavFormat = wavFormat;
            int max = Math.max(1, wavFormat.frameRateHz / 10);
            this.targetSampleSizeFrames = max;
            ParsableByteArray parsableByteArray = new ParsableByteArray(wavFormat.extraData);
            parsableByteArray.readLittleEndianUnsignedShort();
            int readLittleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
            this.framesPerBlock = readLittleEndianUnsignedShort;
            int i11 = wavFormat.numChannels;
            int i12 = (((wavFormat.blockSize - (i11 * 4)) * 8) / (wavFormat.bitsPerSample * i11)) + 1;
            if (readLittleEndianUnsignedShort == i12) {
                int ceilDivide = Util.ceilDivide(max, readLittleEndianUnsignedShort);
                this.inputData = new byte[wavFormat.blockSize * ceilDivide];
                this.decodedData = new ParsableByteArray(ceilDivide * numOutputFramesToBytes(readLittleEndianUnsignedShort, i11));
                int i13 = ((wavFormat.frameRateHz * wavFormat.blockSize) * 8) / readLittleEndianUnsignedShort;
                this.format = new Format.Builder().setSampleMimeType(MimeTypes.AUDIO_RAW).setAverageBitrate(i13).setPeakBitrate(i13).setMaxInputSize(numOutputFramesToBytes(max, i11)).setChannelCount(wavFormat.numChannels).setSampleRate(wavFormat.frameRateHz).setPcmEncoding(2).build();
                return;
            }
            throw ParserException.createForMalformedContainer("Expected frames per block: " + i12 + "; got: " + readLittleEndianUnsignedShort, null);
        }

        private void decode(byte[] bArr, int i11, ParsableByteArray parsableByteArray) {
            for (int i12 = 0; i12 < i11; i12++) {
                for (int i13 = 0; i13 < this.wavFormat.numChannels; i13++) {
                    decodeBlockForChannel(bArr, i12, i13, parsableByteArray.getData());
                }
            }
            int numOutputFramesToBytes = numOutputFramesToBytes(this.framesPerBlock * i11);
            parsableByteArray.setPosition(0);
            parsableByteArray.setLimit(numOutputFramesToBytes);
        }

        private void decodeBlockForChannel(byte[] bArr, int i11, int i12, byte[] bArr2) {
            WavFormat wavFormat = this.wavFormat;
            int i13 = wavFormat.blockSize;
            int i14 = wavFormat.numChannels;
            int i15 = (i11 * i13) + (i12 * 4);
            int i16 = (i14 * 4) + i15;
            int i17 = (i13 / i14) - 4;
            int i18 = (short) (((bArr[i15 + 1] & 255) << 8) | (bArr[i15] & 255));
            int min = Math.min(bArr[i15 + 2] & 255, 88);
            int i19 = STEP_TABLE[min];
            int i21 = ((i11 * this.framesPerBlock * i14) + i12) * 2;
            bArr2[i21] = (byte) (i18 & 255);
            bArr2[i21 + 1] = (byte) (i18 >> 8);
            for (int i22 = 0; i22 < i17 * 2; i22++) {
                byte b11 = bArr[((i22 / 8) * i14 * 4) + i16 + ((i22 / 2) % 4)];
                int i23 = i22 % 2 == 0 ? b11 & 15 : (b11 & 255) >> 4;
                int i24 = ((((i23 & 7) * 2) + 1) * i19) >> 3;
                if ((i23 & 8) != 0) {
                    i24 = -i24;
                }
                i18 = Util.constrainValue(i18 + i24, -32768, 32767);
                i21 += i14 * 2;
                bArr2[i21] = (byte) (i18 & 255);
                bArr2[i21 + 1] = (byte) (i18 >> 8);
                int i25 = min + INDEX_TABLE[i23];
                int[] iArr = STEP_TABLE;
                min = Util.constrainValue(i25, 0, iArr.length - 1);
                i19 = iArr[min];
            }
        }

        private int numOutputBytesToFrames(int i11) {
            return i11 / (this.wavFormat.numChannels * 2);
        }

        private static int numOutputFramesToBytes(int i11, int i12) {
            return i11 * 2 * i12;
        }

        private void writeSampleMetadata(int i11) {
            long scaleLargeTimestamp = this.startTimeUs + Util.scaleLargeTimestamp(this.outputFrameCount, 1000000L, this.wavFormat.frameRateHz);
            int numOutputFramesToBytes = numOutputFramesToBytes(i11);
            this.trackOutput.sampleMetadata(scaleLargeTimestamp, 1, numOutputFramesToBytes, this.pendingOutputBytes - numOutputFramesToBytes, null);
            this.outputFrameCount += i11;
            this.pendingOutputBytes -= numOutputFramesToBytes;
        }

        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public void init(int i11, long j11) {
            WavSeekMap wavSeekMap = new WavSeekMap(this.wavFormat, this.framesPerBlock, i11, j11);
            this.extractorOutput.seekMap(wavSeekMap);
            this.trackOutput.format(this.format);
            this.trackOutput.durationUs(wavSeekMap.getDurationUs());
        }

        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public void reset(long j11) {
            this.pendingInputBytes = 0;
            this.startTimeUs = j11;
            this.pendingOutputBytes = 0;
            this.outputFrameCount = 0L;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0035 -> B:3:0x001b). Please report as a decompilation issue!!! */
        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean sampleData(androidx.media3.extractor.ExtractorInput r7, long r8) throws java.io.IOException {
            /*
                r6 = this;
                int r0 = r6.targetSampleSizeFrames
                int r1 = r6.pendingOutputBytes
                int r1 = r6.numOutputBytesToFrames(r1)
                int r0 = r0 - r1
                int r1 = r6.framesPerBlock
                int r0 = androidx.media3.common.util.Util.ceilDivide(r0, r1)
                androidx.media3.extractor.wav.WavFormat r1 = r6.wavFormat
                int r1 = r1.blockSize
                int r0 = r0 * r1
                r1 = 0
                int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                r2 = 1
                if (r1 != 0) goto L1d
            L1b:
                r1 = r2
                goto L1e
            L1d:
                r1 = 0
            L1e:
                if (r1 != 0) goto L3e
                int r3 = r6.pendingInputBytes
                if (r3 >= r0) goto L3e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.inputData
                int r5 = r6.pendingInputBytes
                int r3 = r7.read(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L38
                goto L1b
            L38:
                int r4 = r6.pendingInputBytes
                int r4 = r4 + r3
                r6.pendingInputBytes = r4
                goto L1e
            L3e:
                int r7 = r6.pendingInputBytes
                androidx.media3.extractor.wav.WavFormat r8 = r6.wavFormat
                int r8 = r8.blockSize
                int r7 = r7 / r8
                if (r7 <= 0) goto L75
                byte[] r8 = r6.inputData
                androidx.media3.common.util.ParsableByteArray r9 = r6.decodedData
                r6.decode(r8, r7, r9)
                int r8 = r6.pendingInputBytes
                androidx.media3.extractor.wav.WavFormat r9 = r6.wavFormat
                int r9 = r9.blockSize
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.pendingInputBytes = r8
                androidx.media3.common.util.ParsableByteArray r7 = r6.decodedData
                int r7 = r7.limit()
                androidx.media3.extractor.TrackOutput r8 = r6.trackOutput
                androidx.media3.common.util.ParsableByteArray r9 = r6.decodedData
                r8.sampleData(r9, r7)
                int r8 = r6.pendingOutputBytes
                int r8 = r8 + r7
                r6.pendingOutputBytes = r8
                int r7 = r6.numOutputBytesToFrames(r8)
                int r8 = r6.targetSampleSizeFrames
                if (r7 < r8) goto L75
                r6.writeSampleMetadata(r8)
            L75:
                if (r1 == 0) goto L82
                int r7 = r6.pendingOutputBytes
                int r7 = r6.numOutputBytesToFrames(r7)
                if (r7 <= 0) goto L82
                r6.writeSampleMetadata(r7)
            L82:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.wav.WavExtractor.ImaAdPcmOutputWriter.sampleData(androidx.media3.extractor.ExtractorInput, long):boolean");
        }

        private int numOutputFramesToBytes(int i11) {
            return numOutputFramesToBytes(i11, this.wavFormat.numChannels);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface OutputWriter {
        void init(int i11, long j11) throws ParserException;

        void reset(long j11);

        boolean sampleData(ExtractorInput extractorInput, long j11) throws IOException;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class PassthroughOutputWriter implements OutputWriter {
        private final ExtractorOutput extractorOutput;
        private final Format format;
        private long outputFrameCount;
        private int pendingOutputBytes;
        private long startTimeUs;
        private final int targetSampleSizeBytes;
        private final TrackOutput trackOutput;
        private final WavFormat wavFormat;

        public PassthroughOutputWriter(ExtractorOutput extractorOutput, TrackOutput trackOutput, WavFormat wavFormat, String str, int i11) throws ParserException {
            this.extractorOutput = extractorOutput;
            this.trackOutput = trackOutput;
            this.wavFormat = wavFormat;
            int i12 = (wavFormat.numChannels * wavFormat.bitsPerSample) / 8;
            if (wavFormat.blockSize == i12) {
                int i13 = wavFormat.frameRateHz;
                int i14 = i13 * i12 * 8;
                int max = Math.max(i12, (i13 * i12) / 10);
                this.targetSampleSizeBytes = max;
                this.format = new Format.Builder().setContainerMimeType(MimeTypes.AUDIO_WAV).setSampleMimeType(str).setAverageBitrate(i14).setPeakBitrate(i14).setMaxInputSize(max).setChannelCount(wavFormat.numChannels).setSampleRate(wavFormat.frameRateHz).setPcmEncoding(i11).build();
                return;
            }
            throw ParserException.createForMalformedContainer("Expected block size: " + i12 + "; got: " + wavFormat.blockSize, null);
        }

        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public void init(int i11, long j11) {
            WavSeekMap wavSeekMap = new WavSeekMap(this.wavFormat, 1, i11, j11);
            this.extractorOutput.seekMap(wavSeekMap);
            this.trackOutput.format(this.format);
            this.trackOutput.durationUs(wavSeekMap.getDurationUs());
        }

        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public void reset(long j11) {
            this.startTimeUs = j11;
            this.pendingOutputBytes = 0;
            this.outputFrameCount = 0L;
        }

        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public boolean sampleData(ExtractorInput extractorInput, long j11) throws IOException {
            int i11;
            int i12;
            long j12 = j11;
            while (j12 > 0 && (i11 = this.pendingOutputBytes) < (i12 = this.targetSampleSizeBytes)) {
                int sampleData = this.trackOutput.sampleData((DataReader) extractorInput, (int) Math.min(i12 - i11, j12), true);
                if (sampleData == -1) {
                    j12 = 0;
                } else {
                    this.pendingOutputBytes += sampleData;
                    j12 -= sampleData;
                }
            }
            int i13 = this.wavFormat.blockSize;
            int i14 = this.pendingOutputBytes / i13;
            if (i14 > 0) {
                long scaleLargeTimestamp = this.startTimeUs + Util.scaleLargeTimestamp(this.outputFrameCount, 1000000L, r1.frameRateHz);
                int i15 = i14 * i13;
                int i16 = this.pendingOutputBytes - i15;
                this.trackOutput.sampleMetadata(scaleLargeTimestamp, 1, i15, i16, null);
                this.outputFrameCount += i14;
                this.pendingOutputBytes = i16;
            }
            return j12 <= 0;
        }
    }

    public static /* synthetic */ Extractor[] a() {
        return new Extractor[]{new WavExtractor()};
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    private void assertInitialized() {
        Assertions.checkStateNotNull(this.trackOutput);
        Util.castNonNull(this.extractorOutput);
    }

    private void readFileType(ExtractorInput extractorInput) throws IOException {
        Assertions.checkState(extractorInput.getPosition() == 0);
        int i11 = this.dataStartPosition;
        if (i11 != -1) {
            extractorInput.skipFully(i11);
            this.state = 4;
        } else {
            if (!WavHeaderReader.checkFileType(extractorInput)) {
                throw ParserException.createForMalformedContainer("Unsupported or unrecognized wav file type.", null);
            }
            extractorInput.skipFully((int) (extractorInput.getPeekPosition() - extractorInput.getPosition()));
            this.state = 1;
        }
    }

    @RequiresNonNull({"extractorOutput", "trackOutput"})
    private void readFormat(ExtractorInput extractorInput) throws IOException {
        WavFormat readFormat = WavHeaderReader.readFormat(extractorInput);
        int i11 = readFormat.formatType;
        if (i11 == 17) {
            this.outputWriter = new ImaAdPcmOutputWriter(this.extractorOutput, this.trackOutput, readFormat);
        } else if (i11 == 6) {
            this.outputWriter = new PassthroughOutputWriter(this.extractorOutput, this.trackOutput, readFormat, MimeTypes.AUDIO_ALAW, -1);
        } else if (i11 == 7) {
            this.outputWriter = new PassthroughOutputWriter(this.extractorOutput, this.trackOutput, readFormat, MimeTypes.AUDIO_MLAW, -1);
        } else {
            int pcmEncodingForType = WavUtil.getPcmEncodingForType(i11, readFormat.bitsPerSample);
            if (pcmEncodingForType == 0) {
                throw ParserException.createForUnsupportedContainerFeature("Unsupported WAV format type: " + readFormat.formatType);
            }
            this.outputWriter = new PassthroughOutputWriter(this.extractorOutput, this.trackOutput, readFormat, MimeTypes.AUDIO_RAW, pcmEncodingForType);
        }
        this.state = 3;
    }

    private void readRf64SampleDataSize(ExtractorInput extractorInput) throws IOException {
        this.rf64SampleDataSize = WavHeaderReader.readRf64SampleDataSize(extractorInput);
        this.state = 2;
    }

    private int readSampleData(ExtractorInput extractorInput) throws IOException {
        Assertions.checkState(this.dataEndPosition != -1);
        return ((OutputWriter) Assertions.checkNotNull(this.outputWriter)).sampleData(extractorInput, this.dataEndPosition - extractorInput.getPosition()) ? -1 : 0;
    }

    private void skipToSampleData(ExtractorInput extractorInput) throws IOException {
        Pair<Long, Long> skipToSampleData = WavHeaderReader.skipToSampleData(extractorInput);
        this.dataStartPosition = ((Long) skipToSampleData.first).intValue();
        long longValue = ((Long) skipToSampleData.second).longValue();
        long j11 = this.rf64SampleDataSize;
        if (j11 != -1 && longValue == 4294967295L) {
            longValue = j11;
        }
        this.dataEndPosition = this.dataStartPosition + longValue;
        long length = extractorInput.getLength();
        if (length != -1 && this.dataEndPosition > length) {
            Log.w(TAG, "Data exceeds input length: " + this.dataEndPosition + j2.O + length);
            this.dataEndPosition = length;
        }
        ((OutputWriter) Assertions.checkNotNull(this.outputWriter)).init(this.dataStartPosition, this.dataEndPosition);
        this.state = 4;
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        this.trackOutput = extractorOutput.track(0, 1);
        extractorOutput.endTracks();
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        assertInitialized();
        int i11 = this.state;
        if (i11 == 0) {
            readFileType(extractorInput);
            return 0;
        }
        if (i11 == 1) {
            readRf64SampleDataSize(extractorInput);
            return 0;
        }
        if (i11 == 2) {
            readFormat(extractorInput);
            return 0;
        }
        if (i11 == 3) {
            skipToSampleData(extractorInput);
            return 0;
        }
        if (i11 == 4) {
            return readSampleData(extractorInput);
        }
        throw new IllegalStateException();
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j11, long j12) {
        this.state = j11 == 0 ? 0 : 4;
        OutputWriter outputWriter = this.outputWriter;
        if (outputWriter != null) {
            outputWriter.reset(j12);
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        return WavHeaderReader.checkFileType(extractorInput);
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }
}
