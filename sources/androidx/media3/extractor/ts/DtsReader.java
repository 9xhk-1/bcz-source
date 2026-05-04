package androidx.media3.extractor.ts;

import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.DtsUtil;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.ts.TsPayloadReader;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import ro.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class DtsReader implements ElementaryStreamReader {
    private static final int CORE_HEADER_SIZE = 18;
    static final int EXTSS_HEADER_SIZE_MAX = 4096;
    static final int FTOC_MAX_HEADER_SIZE = 5408;
    private static final int STATE_FINDING_EXTSS_HEADER_SIZE = 2;
    private static final int STATE_FINDING_SYNC = 0;
    private static final int STATE_FINDING_UHD_HEADER_SIZE = 4;
    private static final int STATE_READING_CORE_HEADER = 1;
    private static final int STATE_READING_EXTSS_HEADER = 3;
    private static final int STATE_READING_SAMPLE = 6;
    private static final int STATE_READING_UHD_HEADER = 5;
    private int bytesRead;
    private final String containerMimeType;
    private Format format;
    private String formatId;
    private int frameType;
    private final ParsableByteArray headerScratchBytes;

    @Nullable
    private final String language;
    private TrackOutput output;
    private final int roleFlags;
    private long sampleDurationUs;
    private int sampleSize;
    private int syncBytes;
    private int state = 0;
    private long timeUs = C.TIME_UNSET;
    private final AtomicInteger uhdAudioChunkId = new AtomicInteger();
    private int extensionSubstreamHeaderSize = -1;
    private int uhdHeaderSize = -1;

    public DtsReader(@Nullable String str, int i11, int i12, String str2) {
        this.headerScratchBytes = new ParsableByteArray(new byte[i12]);
        this.language = str;
        this.roleFlags = i11;
        this.containerMimeType = str2;
    }

    private boolean continueRead(ParsableByteArray parsableByteArray, byte[] bArr, int i11) {
        int min = Math.min(parsableByteArray.bytesLeft(), i11 - this.bytesRead);
        parsableByteArray.readBytes(bArr, this.bytesRead, min);
        int i12 = this.bytesRead + min;
        this.bytesRead = i12;
        return i12 == i11;
    }

    @RequiresNonNull({"output"})
    private void parseCoreHeader() {
        byte[] data = this.headerScratchBytes.getData();
        if (this.format == null) {
            Format parseDtsFormat = DtsUtil.parseDtsFormat(data, this.formatId, this.language, this.roleFlags, this.containerMimeType, null);
            this.format = parseDtsFormat;
            this.output.format(parseDtsFormat);
        }
        this.sampleSize = DtsUtil.getDtsFrameSize(data);
        this.sampleDurationUs = i.e(Util.sampleCountToDurationUs(DtsUtil.parseDtsAudioSampleCount(data), this.format.sampleRate));
    }

    @RequiresNonNull({"output"})
    private void parseExtensionSubstreamHeader() throws ParserException {
        DtsUtil.DtsHeader parseDtsHdHeader = DtsUtil.parseDtsHdHeader(this.headerScratchBytes.getData());
        updateFormatWithDtsHeaderInfo(parseDtsHdHeader);
        this.sampleSize = parseDtsHdHeader.frameSize;
        long j11 = parseDtsHdHeader.frameDurationUs;
        if (j11 == C.TIME_UNSET) {
            j11 = 0;
        }
        this.sampleDurationUs = j11;
    }

    @RequiresNonNull({"output"})
    private void parseUhdHeader() throws ParserException {
        DtsUtil.DtsHeader parseDtsUhdHeader = DtsUtil.parseDtsUhdHeader(this.headerScratchBytes.getData(), this.uhdAudioChunkId);
        if (this.frameType == 3) {
            updateFormatWithDtsHeaderInfo(parseDtsUhdHeader);
        }
        this.sampleSize = parseDtsUhdHeader.frameSize;
        long j11 = parseDtsUhdHeader.frameDurationUs;
        if (j11 == C.TIME_UNSET) {
            j11 = 0;
        }
        this.sampleDurationUs = j11;
    }

    private boolean skipToNextSyncWord(ParsableByteArray parsableByteArray) {
        while (parsableByteArray.bytesLeft() > 0) {
            int i11 = this.syncBytes << 8;
            this.syncBytes = i11;
            int readUnsignedByte = i11 | parsableByteArray.readUnsignedByte();
            this.syncBytes = readUnsignedByte;
            int frameType = DtsUtil.getFrameType(readUnsignedByte);
            this.frameType = frameType;
            if (frameType != 0) {
                byte[] data = this.headerScratchBytes.getData();
                int i12 = this.syncBytes;
                data[0] = (byte) ((i12 >> 24) & 255);
                data[1] = (byte) ((i12 >> 16) & 255);
                data[2] = (byte) ((i12 >> 8) & 255);
                data[3] = (byte) (i12 & 255);
                this.bytesRead = 4;
                this.syncBytes = 0;
                return true;
            }
        }
        return false;
    }

    @RequiresNonNull({"output"})
    private void updateFormatWithDtsHeaderInfo(DtsUtil.DtsHeader dtsHeader) {
        int i11;
        int i12 = dtsHeader.sampleRate;
        if (i12 == -2147483647 || (i11 = dtsHeader.channelCount) == -1) {
            return;
        }
        Format format = this.format;
        if (format != null && i11 == format.channelCount && i12 == format.sampleRate && Objects.equals(dtsHeader.mimeType, format.sampleMimeType)) {
            return;
        }
        Format format2 = this.format;
        Format build = (format2 == null ? new Format.Builder() : format2.buildUpon()).setId(this.formatId).setContainerMimeType(this.containerMimeType).setSampleMimeType(dtsHeader.mimeType).setChannelCount(dtsHeader.channelCount).setSampleRate(dtsHeader.sampleRate).setLanguage(this.language).setRoleFlags(this.roleFlags).build();
        this.format = build;
        this.output.format(build);
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void consume(ParsableByteArray parsableByteArray) throws ParserException {
        Assertions.checkStateNotNull(this.output);
        while (parsableByteArray.bytesLeft() > 0) {
            switch (this.state) {
                case 0:
                    if (!skipToNextSyncWord(parsableByteArray)) {
                        break;
                    } else {
                        int i11 = this.frameType;
                        if (i11 != 3 && i11 != 4) {
                            if (i11 != 1) {
                                this.state = 2;
                                break;
                            } else {
                                this.state = 1;
                                break;
                            }
                        } else {
                            this.state = 4;
                            break;
                        }
                    }
                case 1:
                    if (!continueRead(parsableByteArray, this.headerScratchBytes.getData(), 18)) {
                        break;
                    } else {
                        parseCoreHeader();
                        this.headerScratchBytes.setPosition(0);
                        this.output.sampleData(this.headerScratchBytes, 18);
                        this.state = 6;
                        break;
                    }
                case 2:
                    if (!continueRead(parsableByteArray, this.headerScratchBytes.getData(), 7)) {
                        break;
                    } else {
                        this.extensionSubstreamHeaderSize = DtsUtil.parseDtsHdHeaderSize(this.headerScratchBytes.getData());
                        this.state = 3;
                        break;
                    }
                case 3:
                    if (!continueRead(parsableByteArray, this.headerScratchBytes.getData(), this.extensionSubstreamHeaderSize)) {
                        break;
                    } else {
                        parseExtensionSubstreamHeader();
                        this.headerScratchBytes.setPosition(0);
                        this.output.sampleData(this.headerScratchBytes, this.extensionSubstreamHeaderSize);
                        this.state = 6;
                        break;
                    }
                case 4:
                    if (!continueRead(parsableByteArray, this.headerScratchBytes.getData(), 6)) {
                        break;
                    } else {
                        int parseDtsUhdHeaderSize = DtsUtil.parseDtsUhdHeaderSize(this.headerScratchBytes.getData());
                        this.uhdHeaderSize = parseDtsUhdHeaderSize;
                        int i12 = this.bytesRead;
                        if (i12 > parseDtsUhdHeaderSize) {
                            int i13 = i12 - parseDtsUhdHeaderSize;
                            this.bytesRead = i12 - i13;
                            parsableByteArray.setPosition(parsableByteArray.getPosition() - i13);
                        }
                        this.state = 5;
                        break;
                    }
                case 5:
                    if (!continueRead(parsableByteArray, this.headerScratchBytes.getData(), this.uhdHeaderSize)) {
                        break;
                    } else {
                        parseUhdHeader();
                        this.headerScratchBytes.setPosition(0);
                        this.output.sampleData(this.headerScratchBytes, this.uhdHeaderSize);
                        this.state = 6;
                        break;
                    }
                case 6:
                    int min = Math.min(parsableByteArray.bytesLeft(), this.sampleSize - this.bytesRead);
                    this.output.sampleData(parsableByteArray, min);
                    int i14 = this.bytesRead + min;
                    this.bytesRead = i14;
                    if (i14 == this.sampleSize) {
                        Assertions.checkState(this.timeUs != C.TIME_UNSET);
                        this.output.sampleMetadata(this.timeUs, this.frameType == 4 ? 0 : 1, this.sampleSize, 0, null);
                        this.timeUs += this.sampleDurationUs;
                        this.state = 0;
                        break;
                    } else {
                        break;
                    }
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        this.output = extractorOutput.track(trackIdGenerator.getTrackId(), 1);
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void packetStarted(long j11, int i11) {
        this.timeUs = j11;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void seek() {
        this.state = 0;
        this.bytesRead = 0;
        this.syncBytes = 0;
        this.timeUs = C.TIME_UNSET;
        this.uhdAudioChunkId.set(0);
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void packetFinished(boolean z11) {
    }
}
