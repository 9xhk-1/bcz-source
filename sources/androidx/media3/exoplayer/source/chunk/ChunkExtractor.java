package androidx.media3.exoplayer.source.chunk;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.text.SubtitleParser;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public interface ChunkExtractor {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface TrackOutputProvider {
        TrackOutput track(int i11, int i12);
    }

    @Nullable
    ChunkIndex getChunkIndex();

    @Nullable
    Format[] getSampleFormats();

    void init(@Nullable TrackOutputProvider trackOutputProvider, long j11, long j12);

    boolean read(ExtractorInput extractorInput) throws IOException;

    void release();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Factory {
        @Nullable
        ChunkExtractor createProgressiveMediaExtractor(int i11, Format format, boolean z11, List<Format> list, @Nullable TrackOutput trackOutput, PlayerId playerId);

        @uo.a
        default Factory experimentalParseSubtitlesDuringExtraction(boolean z11) {
            return this;
        }

        @uo.a
        default Factory experimentalSetCodecsToParseWithinGopSampleDependencies(int i11) {
            return this;
        }

        default Format getOutputTextFormat(Format format) {
            return format;
        }

        @uo.a
        default Factory setSubtitleParserFactory(SubtitleParser.Factory factory) {
            return this;
        }
    }
}
