package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public class ForwardingExtractorOutput implements ExtractorOutput {
    private final ExtractorOutput output;

    public ForwardingExtractorOutput(ExtractorOutput extractorOutput) {
        this.output = extractorOutput;
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void endTracks() {
        this.output.endTracks();
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void seekMap(SeekMap seekMap) {
        this.output.seekMap(seekMap);
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public TrackOutput track(int i11, int i12) {
        return this.output.track(i11, i12);
    }
}
