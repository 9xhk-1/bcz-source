package androidx.media3.extractor.png;

import androidx.media3.common.MimeTypes;
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
public final class PngExtractor implements Extractor {
    private static final int PNG_FILE_SIGNATURE = 35152;
    private static final int PNG_FILE_SIGNATURE_LENGTH = 2;
    private final SingleSampleExtractor imageExtractor = new SingleSampleExtractor(PNG_FILE_SIGNATURE, 2, MimeTypes.IMAGE_PNG);

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
        return this.imageExtractor.sniff(extractorInput);
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }
}
