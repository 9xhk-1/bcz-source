package androidx.media3.extractor.ts;

import androidx.media3.common.C;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.Ac3Util;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.ts.TsPayloadReader;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class Ac3Extractor implements Extractor {
    private static final int AC3_SYNC_WORD = 2935;
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: androidx.media3.extractor.ts.a
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return Ac3Extractor.a();
        }
    };
    private static final int MAX_SNIFF_BYTES = 8192;
    private static final int MAX_SYNC_FRAME_SIZE = 2786;
    private final Ac3Reader reader = new Ac3Reader(MimeTypes.AUDIO_AC3);
    private final ParsableByteArray sampleData = new ParsableByteArray(MAX_SYNC_FRAME_SIZE);
    private boolean startedPacket;

    public static /* synthetic */ Extractor[] a() {
        return new Extractor[]{new Ac3Extractor()};
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.reader.createTracks(extractorOutput, new TsPayloadReader.TrackIdGenerator(0, 1));
        extractorOutput.endTracks();
        extractorOutput.seekMap(new SeekMap.Unseekable(C.TIME_UNSET));
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        int read = extractorInput.read(this.sampleData.getData(), 0, MAX_SYNC_FRAME_SIZE);
        if (read == -1) {
            return -1;
        }
        this.sampleData.setPosition(0);
        this.sampleData.setLimit(read);
        if (!this.startedPacket) {
            this.reader.packetStarted(0L, 4);
            this.startedPacket = true;
        }
        this.reader.consume(this.sampleData);
        return 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j11, long j12) {
        this.startedPacket = false;
        this.reader.seek();
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        ParsableByteArray parsableByteArray = new ParsableByteArray(10);
        int i11 = 0;
        while (true) {
            extractorInput.peekFully(parsableByteArray.getData(), 0, 10);
            parsableByteArray.setPosition(0);
            if (parsableByteArray.readUnsignedInt24() != 4801587) {
                break;
            }
            parsableByteArray.skipBytes(3);
            int readSynchSafeInt = parsableByteArray.readSynchSafeInt();
            i11 += readSynchSafeInt + 10;
            extractorInput.advancePeekPosition(readSynchSafeInt);
        }
        extractorInput.resetPeekPosition();
        extractorInput.advancePeekPosition(i11);
        int i12 = 0;
        int i13 = i11;
        while (true) {
            extractorInput.peekFully(parsableByteArray.getData(), 0, 6);
            parsableByteArray.setPosition(0);
            if (parsableByteArray.readUnsignedShort() != AC3_SYNC_WORD) {
                extractorInput.resetPeekPosition();
                i13++;
                if (i13 - i11 >= 8192) {
                    return false;
                }
                extractorInput.advancePeekPosition(i13);
                i12 = 0;
            } else {
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                int parseAc3SyncframeSize = Ac3Util.parseAc3SyncframeSize(parsableByteArray.getData());
                if (parseAc3SyncframeSize == -1) {
                    return false;
                }
                extractorInput.advancePeekPosition(parseAc3SyncframeSize - 6);
            }
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }
}
