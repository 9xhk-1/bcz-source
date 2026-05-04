package androidx.media3.exoplayer.source.chunk;

import android.annotation.SuppressLint;
import android.media.MediaParser;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.chunk.ChunkExtractor;
import androidx.media3.exoplayer.source.m;
import androidx.media3.exoplayer.source.mediaparser.InputReaderAdapterV30;
import androidx.media3.exoplayer.source.mediaparser.MediaParserUtil;
import androidx.media3.exoplayer.source.mediaparser.OutputConsumerAdapterV30;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.DiscardingTrackOutput;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.text.DefaultSubtitleParserFactory;
import androidx.media3.extractor.text.SubtitleExtractor;
import androidx.media3.extractor.text.SubtitleParser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(30)
@UnstableApi
/* loaded from: classes2.dex */
public final class MediaParserChunkExtractor implements ChunkExtractor {

    @Deprecated
    public static final ChunkExtractor.Factory FACTORY = new Factory();
    private static final String TAG = "MediaPrsrChunkExtractor";
    private final DiscardingTrackOutput discardingTrackOutput;
    private final InputReaderAdapterV30 inputReaderAdapter;
    private final MediaParser mediaParser;
    private final OutputConsumerAdapterV30 outputConsumerAdapter;
    private long pendingSeekUs;

    @Nullable
    private Format[] sampleFormats;

    @Nullable
    private ChunkExtractor.TrackOutputProvider trackOutputProvider;
    private final TrackOutputProviderAdapter trackOutputProviderAdapter;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Factory implements ChunkExtractor.Factory {
        private boolean parseSubtitlesDuringExtraction;
        private SubtitleParser.Factory subtitleParserFactory = new DefaultSubtitleParserFactory();

        @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory
        @Nullable
        public ChunkExtractor createProgressiveMediaExtractor(int i11, Format format, boolean z11, List<Format> list, @Nullable TrackOutput trackOutput, PlayerId playerId) {
            if (!MimeTypes.isText(format.containerMimeType)) {
                return new MediaParserChunkExtractor(i11, format, list, playerId);
            }
            if (this.parseSubtitlesDuringExtraction) {
                return new BundledChunkExtractor(new SubtitleExtractor(this.subtitleParserFactory.create(format), format), i11, format);
            }
            return null;
        }

        @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory
        public Format getOutputTextFormat(Format format) {
            String str;
            if (!this.parseSubtitlesDuringExtraction || !this.subtitleParserFactory.supportsFormat(format)) {
                return format;
            }
            Format.Builder cueReplacementBehavior = format.buildUpon().setSampleMimeType(MimeTypes.APPLICATION_MEDIA3_CUES).setCueReplacementBehavior(this.subtitleParserFactory.getCueReplacementBehavior(format));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(format.sampleMimeType);
            if (format.codecs != null) {
                str = " " + format.codecs;
            } else {
                str = "";
            }
            sb2.append(str);
            return cueReplacementBehavior.setCodecs(sb2.toString()).setSubsampleOffsetUs(Long.MAX_VALUE).build();
        }

        @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory
        @uo.a
        public Factory experimentalParseSubtitlesDuringExtraction(boolean z11) {
            this.parseSubtitlesDuringExtraction = z11;
            return this;
        }

        @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory
        @uo.a
        public Factory setSubtitleParserFactory(SubtitleParser.Factory factory) {
            this.subtitleParserFactory = (SubtitleParser.Factory) Assertions.checkNotNull(factory);
            return this;
        }
    }

    @SuppressLint({"WrongConstant"})
    public MediaParserChunkExtractor(int i11, Format format, List<Format> list, PlayerId playerId) {
        MediaParser createByName;
        OutputConsumerAdapterV30 outputConsumerAdapterV30 = new OutputConsumerAdapterV30(format, i11, true);
        this.outputConsumerAdapter = outputConsumerAdapterV30;
        this.inputReaderAdapter = new InputReaderAdapterV30();
        String str = MimeTypes.isMatroska((String) Assertions.checkNotNull(format.containerMimeType)) ? "android.media.mediaparser.MatroskaParser" : "android.media.mediaparser.FragmentedMp4Parser";
        outputConsumerAdapterV30.setSelectedParserName(str);
        createByName = MediaParser.createByName(str, outputConsumerAdapterV30);
        this.mediaParser = createByName;
        Boolean bool = Boolean.TRUE;
        createByName.setParameter("android.media.mediaparser.matroska.disableCuesSeeking", bool);
        createByName.setParameter(MediaParserUtil.PARAMETER_IN_BAND_CRYPTO_INFO, bool);
        createByName.setParameter(MediaParserUtil.PARAMETER_INCLUDE_SUPPLEMENTAL_DATA, bool);
        createByName.setParameter(MediaParserUtil.PARAMETER_EAGERLY_EXPOSE_TRACK_TYPE, bool);
        createByName.setParameter(MediaParserUtil.PARAMETER_EXPOSE_DUMMY_SEEK_MAP, bool);
        createByName.setParameter(MediaParserUtil.PARAMETER_EXPOSE_CHUNK_INDEX_AS_MEDIA_FORMAT, bool);
        createByName.setParameter(MediaParserUtil.PARAMETER_OVERRIDE_IN_BAND_CAPTION_DECLARATIONS, bool);
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < list.size(); i12++) {
            arrayList.add(MediaParserUtil.toCaptionsMediaFormat(list.get(i12)));
        }
        this.mediaParser.setParameter(MediaParserUtil.PARAMETER_EXPOSE_CAPTION_FORMATS, arrayList);
        if (Util.SDK_INT >= 31) {
            MediaParserUtil.setLogSessionIdOnMediaParser(this.mediaParser, playerId);
        }
        this.outputConsumerAdapter.setMuxedCaptionFormats(list);
        this.trackOutputProviderAdapter = new TrackOutputProviderAdapter();
        this.discardingTrackOutput = new DiscardingTrackOutput();
        this.pendingSeekUs = C.TIME_UNSET;
    }

    private void maybeExecutePendingSeek() {
        Pair seekPoints;
        MediaParser.SeekMap dummySeekMap = this.outputConsumerAdapter.getDummySeekMap();
        long j11 = this.pendingSeekUs;
        if (j11 == C.TIME_UNSET || dummySeekMap == null) {
            return;
        }
        MediaParser mediaParser = this.mediaParser;
        seekPoints = dummySeekMap.getSeekPoints(j11);
        mediaParser.seek(m.a(seekPoints.first));
        this.pendingSeekUs = C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor
    @Nullable
    public ChunkIndex getChunkIndex() {
        return this.outputConsumerAdapter.getChunkIndex();
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor
    @Nullable
    public Format[] getSampleFormats() {
        return this.sampleFormats;
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor
    public void init(@Nullable ChunkExtractor.TrackOutputProvider trackOutputProvider, long j11, long j12) {
        this.trackOutputProvider = trackOutputProvider;
        this.outputConsumerAdapter.setSampleTimestampUpperLimitFilterUs(j12);
        this.outputConsumerAdapter.setExtractorOutput(this.trackOutputProviderAdapter);
        this.pendingSeekUs = j11;
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor
    public boolean read(ExtractorInput extractorInput) throws IOException {
        boolean advance;
        maybeExecutePendingSeek();
        this.inputReaderAdapter.setDataReader(extractorInput, extractorInput.getLength());
        advance = this.mediaParser.advance(this.inputReaderAdapter);
        return advance;
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor
    public void release() {
        this.mediaParser.release();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class TrackOutputProviderAdapter implements ExtractorOutput {
        private TrackOutputProviderAdapter() {
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public void endTracks() {
            MediaParserChunkExtractor mediaParserChunkExtractor = MediaParserChunkExtractor.this;
            mediaParserChunkExtractor.sampleFormats = mediaParserChunkExtractor.outputConsumerAdapter.getSampleFormats();
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public TrackOutput track(int i11, int i12) {
            return MediaParserChunkExtractor.this.trackOutputProvider != null ? MediaParserChunkExtractor.this.trackOutputProvider.track(i11, i12) : MediaParserChunkExtractor.this.discardingTrackOutput;
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public void seekMap(SeekMap seekMap) {
        }
    }
}
