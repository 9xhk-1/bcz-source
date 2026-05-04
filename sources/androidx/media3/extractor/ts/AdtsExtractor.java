package androidx.media3.extractor.ts;

import androidx.media3.common.C;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.ConstantBitrateSeekMap;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.ts.TsPayloadReader;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class AdtsExtractor implements Extractor {
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: androidx.media3.extractor.ts.c
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return AdtsExtractor.a();
        }
    };
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING = 1;
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING_ALWAYS = 2;
    private static final int MAX_PACKET_SIZE = 2048;
    private static final int MAX_SNIFF_BYTES = 8192;
    private static final int NUM_FRAMES_FOR_AVERAGE_FRAME_SIZE = 1000;
    private int averageFrameSize;
    private ExtractorOutput extractorOutput;
    private long firstFramePosition;
    private long firstSampleTimestampUs;
    private final int flags;
    private boolean hasCalculatedAverageFrameSize;
    private boolean hasOutputSeekMap;
    private final ParsableByteArray packetBuffer;
    private final AdtsReader reader;
    private final ParsableByteArray scratch;
    private final ParsableBitArray scratchBits;
    private boolean startedPacket;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public AdtsExtractor() {
        this(0);
    }

    public static /* synthetic */ Extractor[] a() {
        return new Extractor[]{new AdtsExtractor()};
    }

    private void calculateAverageFrameSize(ExtractorInput extractorInput) throws IOException {
        if (this.hasCalculatedAverageFrameSize) {
            return;
        }
        this.averageFrameSize = -1;
        extractorInput.resetPeekPosition();
        long j11 = 0;
        if (extractorInput.getPosition() == 0) {
            peekId3Header(extractorInput);
        }
        int i11 = 0;
        int i12 = 0;
        while (extractorInput.peekFully(this.scratch.getData(), 0, 2, true)) {
            try {
                this.scratch.setPosition(0);
                if (!AdtsReader.isAdtsSyncWord(this.scratch.readUnsignedShort())) {
                    break;
                }
                if (!extractorInput.peekFully(this.scratch.getData(), 0, 4, true)) {
                    break;
                }
                this.scratchBits.setPosition(14);
                int readBits = this.scratchBits.readBits(13);
                if (readBits <= 6) {
                    this.hasCalculatedAverageFrameSize = true;
                    throw ParserException.createForMalformedContainer("Malformed ADTS stream", null);
                }
                j11 += readBits;
                i12++;
                if (i12 != 1000 && extractorInput.advancePeekPosition(readBits - 6, true)) {
                }
                break;
            } catch (EOFException unused) {
            }
        }
        i11 = i12;
        extractorInput.resetPeekPosition();
        if (i11 > 0) {
            this.averageFrameSize = (int) (j11 / i11);
        } else {
            this.averageFrameSize = -1;
        }
        this.hasCalculatedAverageFrameSize = true;
    }

    private static int getBitrateFromFrameSize(int i11, long j11) {
        return (int) ((i11 * 8000000) / j11);
    }

    private SeekMap getConstantBitrateSeekMap(long j11, boolean z11) {
        return new ConstantBitrateSeekMap(j11, this.firstFramePosition, getBitrateFromFrameSize(this.averageFrameSize, this.reader.getSampleDurationUs()), this.averageFrameSize, z11);
    }

    @RequiresNonNull({"extractorOutput"})
    private void maybeOutputSeekMap(long j11, boolean z11) {
        if (this.hasOutputSeekMap) {
            return;
        }
        boolean z12 = (this.flags & 1) != 0 && this.averageFrameSize > 0;
        if (z12 && this.reader.getSampleDurationUs() == C.TIME_UNSET && !z11) {
            return;
        }
        if (!z12 || this.reader.getSampleDurationUs() == C.TIME_UNSET) {
            this.extractorOutput.seekMap(new SeekMap.Unseekable(C.TIME_UNSET));
        } else {
            this.extractorOutput.seekMap(getConstantBitrateSeekMap(j11, (this.flags & 2) != 0));
        }
        this.hasOutputSeekMap = true;
    }

    private int peekId3Header(ExtractorInput extractorInput) throws IOException {
        int i11 = 0;
        while (true) {
            extractorInput.peekFully(this.scratch.getData(), 0, 10);
            this.scratch.setPosition(0);
            if (this.scratch.readUnsignedInt24() != 4801587) {
                break;
            }
            this.scratch.skipBytes(3);
            int readSynchSafeInt = this.scratch.readSynchSafeInt();
            i11 += readSynchSafeInt + 10;
            extractorInput.advancePeekPosition(readSynchSafeInt);
        }
        extractorInput.resetPeekPosition();
        extractorInput.advancePeekPosition(i11);
        if (this.firstFramePosition == -1) {
            this.firstFramePosition = i11;
        }
        return i11;
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        this.reader.createTracks(extractorOutput, new TsPayloadReader.TrackIdGenerator(0, 1));
        extractorOutput.endTracks();
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        Assertions.checkStateNotNull(this.extractorOutput);
        long length = extractorInput.getLength();
        int i11 = this.flags;
        if ((i11 & 2) != 0 || ((i11 & 1) != 0 && length != -1)) {
            calculateAverageFrameSize(extractorInput);
        }
        int read = extractorInput.read(this.packetBuffer.getData(), 0, 2048);
        boolean z11 = read == -1;
        maybeOutputSeekMap(length, z11);
        if (z11) {
            return -1;
        }
        this.packetBuffer.setPosition(0);
        this.packetBuffer.setLimit(read);
        if (!this.startedPacket) {
            this.reader.packetStarted(this.firstSampleTimestampUs, 4);
            this.startedPacket = true;
        }
        this.reader.consume(this.packetBuffer);
        return 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j11, long j12) {
        this.startedPacket = false;
        this.reader.seek();
        this.firstSampleTimestampUs = j12;
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        int peekId3Header = peekId3Header(extractorInput);
        int i11 = peekId3Header;
        int i12 = 0;
        int i13 = 0;
        do {
            extractorInput.peekFully(this.scratch.getData(), 0, 2);
            this.scratch.setPosition(0);
            if (AdtsReader.isAdtsSyncWord(this.scratch.readUnsignedShort())) {
                i12++;
                if (i12 >= 4 && i13 > 188) {
                    return true;
                }
                extractorInput.peekFully(this.scratch.getData(), 0, 4);
                this.scratchBits.setPosition(14);
                int readBits = this.scratchBits.readBits(13);
                if (readBits <= 6) {
                    i11++;
                    extractorInput.resetPeekPosition();
                    extractorInput.advancePeekPosition(i11);
                } else {
                    extractorInput.advancePeekPosition(readBits - 6);
                    i13 += readBits;
                }
            } else {
                i11++;
                extractorInput.resetPeekPosition();
                extractorInput.advancePeekPosition(i11);
            }
            i12 = 0;
            i13 = 0;
        } while (i11 - peekId3Header < 8192);
        return false;
    }

    public AdtsExtractor(int i11) {
        this.flags = (i11 & 2) != 0 ? i11 | 1 : i11;
        this.reader = new AdtsReader(true, MimeTypes.AUDIO_AAC);
        this.packetBuffer = new ParsableByteArray(2048);
        this.averageFrameSize = -1;
        this.firstFramePosition = -1L;
        ParsableByteArray parsableByteArray = new ParsableByteArray(10);
        this.scratch = parsableByteArray;
        this.scratchBits = new ParsableBitArray(parsableByteArray.getData());
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }
}
