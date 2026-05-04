package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public interface ExtractorOutput {
    public static final ExtractorOutput PLACEHOLDER = new ExtractorOutput() { // from class: androidx.media3.extractor.ExtractorOutput.1
        @Override // androidx.media3.extractor.ExtractorOutput
        public void endTracks() {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public void seekMap(SeekMap seekMap) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public TrackOutput track(int i11, int i12) {
            throw new UnsupportedOperationException();
        }
    };

    void endTracks();

    void seekMap(SeekMap seekMap);

    TrackOutput track(int i11, int i12);
}
