package androidx.media3.extractor.ts;

import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.DiscardingTrackOutput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.ts.TsPayloadReader;
import java.util.Arrays;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class AdtsReader implements ElementaryStreamReader {
    private static final int CRC_SIZE = 2;
    private static final int HEADER_SIZE = 5;
    private static final int ID3_HEADER_SIZE = 10;
    private static final byte[] ID3_IDENTIFIER = {73, 68, 51};
    private static final int ID3_SIZE_OFFSET = 6;
    private static final int MATCH_STATE_FF = 512;
    private static final int MATCH_STATE_I = 768;
    private static final int MATCH_STATE_ID = 1024;
    private static final int MATCH_STATE_START = 256;
    private static final int MATCH_STATE_VALUE_SHIFT = 8;
    private static final int STATE_CHECKING_ADTS_HEADER = 1;
    private static final int STATE_FINDING_SAMPLE = 0;
    private static final int STATE_READING_ADTS_HEADER = 3;
    private static final int STATE_READING_ID3_HEADER = 2;
    private static final int STATE_READING_SAMPLE = 4;
    private static final String TAG = "AdtsReader";
    private static final int VERSION_UNSET = -1;
    private final ParsableBitArray adtsScratch;
    private int bytesRead;
    private final String containerMimeType;
    private int currentFrameVersion;
    private TrackOutput currentOutput;
    private long currentSampleDuration;
    private final boolean exposeId3;
    private int firstFrameSampleRateIndex;
    private int firstFrameVersion;
    private String formatId;
    private boolean foundFirstFrame;
    private boolean hasCrc;
    private boolean hasOutputFormat;
    private final ParsableByteArray id3HeaderBuffer;
    private TrackOutput id3Output;

    @Nullable
    private final String language;
    private int matchState;
    private TrackOutput output;
    private final int roleFlags;
    private long sampleDurationUs;
    private int sampleSize;
    private int state;
    private long timeUs;

    public AdtsReader(boolean z11, String str) {
        this(z11, null, 0, str);
    }

    @EnsuresNonNull({"output", "currentOutput", "id3Output"})
    private void assertTracksCreated() {
        Assertions.checkNotNull(this.output);
        Util.castNonNull(this.currentOutput);
        Util.castNonNull(this.id3Output);
    }

    private void checkAdtsHeader(ParsableByteArray parsableByteArray) {
        if (parsableByteArray.bytesLeft() == 0) {
            return;
        }
        this.adtsScratch.data[0] = parsableByteArray.getData()[parsableByteArray.getPosition()];
        this.adtsScratch.setPosition(2);
        int readBits = this.adtsScratch.readBits(4);
        int i11 = this.firstFrameSampleRateIndex;
        if (i11 != -1 && readBits != i11) {
            resetSync();
            return;
        }
        if (!this.foundFirstFrame) {
            this.foundFirstFrame = true;
            this.firstFrameVersion = this.currentFrameVersion;
            this.firstFrameSampleRateIndex = readBits;
        }
        setReadingAdtsHeaderState();
    }

    private boolean checkSyncPositionValid(ParsableByteArray parsableByteArray, int i11) {
        parsableByteArray.setPosition(i11 + 1);
        if (!tryRead(parsableByteArray, this.adtsScratch.data, 1)) {
            return false;
        }
        this.adtsScratch.setPosition(4);
        int readBits = this.adtsScratch.readBits(1);
        int i12 = this.firstFrameVersion;
        if (i12 != -1 && readBits != i12) {
            return false;
        }
        if (this.firstFrameSampleRateIndex != -1) {
            if (!tryRead(parsableByteArray, this.adtsScratch.data, 1)) {
                return true;
            }
            this.adtsScratch.setPosition(2);
            if (this.adtsScratch.readBits(4) != this.firstFrameSampleRateIndex) {
                return false;
            }
            parsableByteArray.setPosition(i11 + 2);
        }
        if (!tryRead(parsableByteArray, this.adtsScratch.data, 4)) {
            return true;
        }
        this.adtsScratch.setPosition(14);
        int readBits2 = this.adtsScratch.readBits(13);
        if (readBits2 < 7) {
            return false;
        }
        byte[] data = parsableByteArray.getData();
        int limit = parsableByteArray.limit();
        int i13 = i11 + readBits2;
        if (i13 >= limit) {
            return true;
        }
        byte b11 = data[i13];
        if (b11 == -1) {
            int i14 = i13 + 1;
            if (i14 == limit) {
                return true;
            }
            return isAdtsSyncBytes((byte) -1, data[i14]) && ((data[i14] & 8) >> 3) == readBits;
        }
        if (b11 != 73) {
            return false;
        }
        int i15 = i13 + 1;
        if (i15 == limit) {
            return true;
        }
        if (data[i15] != 68) {
            return false;
        }
        int i16 = i13 + 2;
        return i16 == limit || data[i16] == 51;
    }

    private boolean continueRead(ParsableByteArray parsableByteArray, byte[] bArr, int i11) {
        int min = Math.min(parsableByteArray.bytesLeft(), i11 - this.bytesRead);
        parsableByteArray.readBytes(bArr, this.bytesRead, min);
        int i12 = this.bytesRead + min;
        this.bytesRead = i12;
        return i12 == i11;
    }

    private void findNextSample(ParsableByteArray parsableByteArray) {
        byte[] data = parsableByteArray.getData();
        int position = parsableByteArray.getPosition();
        int limit = parsableByteArray.limit();
        while (position < limit) {
            int i11 = position + 1;
            byte b11 = data[position];
            int i12 = b11 & 255;
            if (this.matchState == 512 && isAdtsSyncBytes((byte) -1, (byte) i12) && (this.foundFirstFrame || checkSyncPositionValid(parsableByteArray, position - 1))) {
                this.currentFrameVersion = (b11 & 8) >> 3;
                this.hasCrc = (b11 & 1) == 0;
                if (this.foundFirstFrame) {
                    setReadingAdtsHeaderState();
                } else {
                    setCheckingAdtsHeaderState();
                }
                parsableByteArray.setPosition(i11);
                return;
            }
            int i13 = this.matchState;
            int i14 = i12 | i13;
            if (i14 == 329) {
                this.matchState = 768;
            } else if (i14 == 511) {
                this.matchState = 512;
            } else if (i14 == 836) {
                this.matchState = 1024;
            } else if (i14 == 1075) {
                setReadingId3HeaderState();
                parsableByteArray.setPosition(i11);
                return;
            } else if (i13 != 256) {
                this.matchState = 256;
            }
            position = i11;
        }
        parsableByteArray.setPosition(position);
    }

    private boolean isAdtsSyncBytes(byte b11, byte b12) {
        return isAdtsSyncWord(((b11 & 255) << 8) | (b12 & 255));
    }

    public static boolean isAdtsSyncWord(int i11) {
        return (i11 & 65526) == 65520;
    }

    @RequiresNonNull({"output"})
    private void parseAdtsHeader() throws ParserException {
        this.adtsScratch.setPosition(0);
        if (this.hasOutputFormat) {
            this.adtsScratch.skipBits(10);
        } else {
            int i11 = 2;
            int readBits = this.adtsScratch.readBits(2) + 1;
            if (readBits != 2) {
                Log.w(TAG, "Detected audio object type: " + readBits + ", but assuming AAC LC.");
            } else {
                i11 = readBits;
            }
            this.adtsScratch.skipBits(5);
            byte[] buildAudioSpecificConfig = AacUtil.buildAudioSpecificConfig(i11, this.firstFrameSampleRateIndex, this.adtsScratch.readBits(3));
            AacUtil.Config parseAudioSpecificConfig = AacUtil.parseAudioSpecificConfig(buildAudioSpecificConfig);
            Format build = new Format.Builder().setId(this.formatId).setContainerMimeType(this.containerMimeType).setSampleMimeType(MimeTypes.AUDIO_AAC).setCodecs(parseAudioSpecificConfig.codecs).setChannelCount(parseAudioSpecificConfig.channelCount).setSampleRate(parseAudioSpecificConfig.sampleRateHz).setInitializationData(Collections.singletonList(buildAudioSpecificConfig)).setLanguage(this.language).setRoleFlags(this.roleFlags).build();
            this.sampleDurationUs = 1024000000 / build.sampleRate;
            this.output.format(build);
            this.hasOutputFormat = true;
        }
        this.adtsScratch.skipBits(4);
        int readBits2 = this.adtsScratch.readBits(13);
        int i12 = readBits2 - 7;
        if (this.hasCrc) {
            i12 = readBits2 - 9;
        }
        setReadingSampleState(this.output, this.sampleDurationUs, 0, i12);
    }

    @RequiresNonNull({"id3Output"})
    private void parseId3Header() {
        this.id3Output.sampleData(this.id3HeaderBuffer, 10);
        this.id3HeaderBuffer.setPosition(6);
        setReadingSampleState(this.id3Output, 0L, 10, this.id3HeaderBuffer.readSynchSafeInt() + 10);
    }

    @RequiresNonNull({"currentOutput"})
    private void readSample(ParsableByteArray parsableByteArray) {
        int min = Math.min(parsableByteArray.bytesLeft(), this.sampleSize - this.bytesRead);
        this.currentOutput.sampleData(parsableByteArray, min);
        int i11 = this.bytesRead + min;
        this.bytesRead = i11;
        if (i11 == this.sampleSize) {
            Assertions.checkState(this.timeUs != C.TIME_UNSET);
            this.currentOutput.sampleMetadata(this.timeUs, 1, this.sampleSize, 0, null);
            this.timeUs += this.currentSampleDuration;
            setFindingSampleState();
        }
    }

    private void resetSync() {
        this.foundFirstFrame = false;
        setFindingSampleState();
    }

    private void setCheckingAdtsHeaderState() {
        this.state = 1;
        this.bytesRead = 0;
    }

    private void setFindingSampleState() {
        this.state = 0;
        this.bytesRead = 0;
        this.matchState = 256;
    }

    private void setReadingAdtsHeaderState() {
        this.state = 3;
        this.bytesRead = 0;
    }

    private void setReadingId3HeaderState() {
        this.state = 2;
        this.bytesRead = ID3_IDENTIFIER.length;
        this.sampleSize = 0;
        this.id3HeaderBuffer.setPosition(0);
    }

    private void setReadingSampleState(TrackOutput trackOutput, long j11, int i11, int i12) {
        this.state = 4;
        this.bytesRead = i11;
        this.currentOutput = trackOutput;
        this.currentSampleDuration = j11;
        this.sampleSize = i12;
    }

    private boolean tryRead(ParsableByteArray parsableByteArray, byte[] bArr, int i11) {
        if (parsableByteArray.bytesLeft() < i11) {
            return false;
        }
        parsableByteArray.readBytes(bArr, 0, i11);
        return true;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void consume(ParsableByteArray parsableByteArray) throws ParserException {
        assertTracksCreated();
        while (parsableByteArray.bytesLeft() > 0) {
            int i11 = this.state;
            if (i11 == 0) {
                findNextSample(parsableByteArray);
            } else if (i11 == 1) {
                checkAdtsHeader(parsableByteArray);
            } else if (i11 != 2) {
                if (i11 == 3) {
                    if (continueRead(parsableByteArray, this.adtsScratch.data, this.hasCrc ? 7 : 5)) {
                        parseAdtsHeader();
                    }
                } else {
                    if (i11 != 4) {
                        throw new IllegalStateException();
                    }
                    readSample(parsableByteArray);
                }
            } else if (continueRead(parsableByteArray, this.id3HeaderBuffer.getData(), 10)) {
                parseId3Header();
            }
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        TrackOutput track = extractorOutput.track(trackIdGenerator.getTrackId(), 1);
        this.output = track;
        this.currentOutput = track;
        if (!this.exposeId3) {
            this.id3Output = new DiscardingTrackOutput();
            return;
        }
        trackIdGenerator.generateNewId();
        TrackOutput track2 = extractorOutput.track(trackIdGenerator.getTrackId(), 5);
        this.id3Output = track2;
        track2.format(new Format.Builder().setId(trackIdGenerator.getFormatId()).setContainerMimeType(this.containerMimeType).setSampleMimeType(MimeTypes.APPLICATION_ID3).build());
    }

    public long getSampleDurationUs() {
        return this.sampleDurationUs;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void packetStarted(long j11, int i11) {
        this.timeUs = j11;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void seek() {
        this.timeUs = C.TIME_UNSET;
        resetSync();
    }

    public AdtsReader(boolean z11, @Nullable String str, int i11, String str2) {
        this.adtsScratch = new ParsableBitArray(new byte[7]);
        this.id3HeaderBuffer = new ParsableByteArray(Arrays.copyOf(ID3_IDENTIFIER, 10));
        this.firstFrameVersion = -1;
        this.firstFrameSampleRateIndex = -1;
        this.sampleDurationUs = C.TIME_UNSET;
        this.timeUs = C.TIME_UNSET;
        this.exposeId3 = z11;
        this.language = str;
        this.roleFlags = i11;
        this.containerMimeType = str2;
        setFindingSampleState();
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void packetFinished(boolean z11) {
    }
}
