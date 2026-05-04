package androidx.media3.extractor.webp;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SingleSampleExtractor;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class WebpExtractor implements Extractor {
    private static final int FILE_SIGNATURE_SEGMENT_LENGTH = 4;
    private static final int RIFF_FILE_SIGNATURE = 1380533830;
    private static final int WEBP_FILE_SIGNATURE = 1464156752;
    private final ParsableByteArray scratch = new ParsableByteArray(4);
    private final SingleSampleExtractor imageExtractor = new SingleSampleExtractor(-1, -1, "image/webp");

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.imageExtractor.init(extractorOutput);
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        return this.imageExtractor.read(extractorInput, positionHolder);
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j11, long j12) {
        this.imageExtractor.seek(j11, j12);
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        this.scratch.reset(4);
        extractorInput.peekFully(this.scratch.getData(), 0, 4);
        if (this.scratch.readUnsignedInt() != 1380533830) {
            return false;
        }
        extractorInput.advancePeekPosition(4);
        this.scratch.reset(4);
        extractorInput.peekFully(this.scratch.getData(), 0, 4);
        return this.scratch.readUnsignedInt() == 1464156752;
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }
}
