package androidx.media3.extractor.text;

import android.util.SparseArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.text.SubtitleParser;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class SubtitleTranscodingExtractorOutput implements ExtractorOutput {
    private final ExtractorOutput delegate;
    private boolean hasNonTextTracks;
    private final SubtitleParser.Factory subtitleParserFactory;
    private final SparseArray<SubtitleTranscodingTrackOutput> textTrackOutputs = new SparseArray<>();

    public SubtitleTranscodingExtractorOutput(ExtractorOutput extractorOutput, SubtitleParser.Factory factory) {
        this.delegate = extractorOutput;
        this.subtitleParserFactory = factory;
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void endTracks() {
        this.delegate.endTracks();
        if (this.hasNonTextTracks) {
            for (int i11 = 0; i11 < this.textTrackOutputs.size(); i11++) {
                this.textTrackOutputs.valueAt(i11).shouldSuppressParsingErrors(true);
            }
        }
    }

    public void resetSubtitleParsers() {
        for (int i11 = 0; i11 < this.textTrackOutputs.size(); i11++) {
            this.textTrackOutputs.valueAt(i11).resetSubtitleParser();
        }
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void seekMap(SeekMap seekMap) {
        this.delegate.seekMap(seekMap);
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public TrackOutput track(int i11, int i12) {
        if (i12 != 3) {
            this.hasNonTextTracks = true;
            return this.delegate.track(i11, i12);
        }
        SubtitleTranscodingTrackOutput subtitleTranscodingTrackOutput = this.textTrackOutputs.get(i11);
        if (subtitleTranscodingTrackOutput != null) {
            return subtitleTranscodingTrackOutput;
        }
        SubtitleTranscodingTrackOutput subtitleTranscodingTrackOutput2 = new SubtitleTranscodingTrackOutput(this.delegate.track(i11, i12), this.subtitleParserFactory);
        this.textTrackOutputs.put(i11, subtitleTranscodingTrackOutput2);
        return subtitleTranscodingTrackOutput2;
    }
}
