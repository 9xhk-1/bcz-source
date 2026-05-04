package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
@Deprecated
/* loaded from: classes2.dex */
public final class DummyExtractorOutput implements ExtractorOutput {
    @Override // androidx.media3.extractor.ExtractorOutput
    public TrackOutput track(int i11, int i12) {
        return new DiscardingTrackOutput();
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void endTracks() {
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void seekMap(SeekMap seekMap) {
    }
}
