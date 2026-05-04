package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public class ForwardingExtractor implements Extractor {
    private final Extractor delegate;

    public ForwardingExtractor(Extractor extractor) {
        this.delegate = extractor;
    }

    @Override // androidx.media3.extractor.Extractor
    public List<SniffFailure> getSniffFailureDetails() {
        return this.delegate.getSniffFailureDetails();
    }

    @Override // androidx.media3.extractor.Extractor
    public Extractor getUnderlyingImplementation() {
        return this.delegate.getUnderlyingImplementation();
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.delegate.init(extractorOutput);
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        return this.delegate.read(extractorInput, positionHolder);
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
        this.delegate.release();
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j11, long j12) {
        this.delegate.seek(j11, j12);
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        return this.delegate.sniff(extractorInput);
    }
}
