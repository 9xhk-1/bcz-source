package androidx.media3.exoplayer.source;

import android.annotation.SuppressLint;
import android.media.MediaParser;
import android.net.Uri;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import androidx.media3.common.DataReader;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.ProgressiveMediaExtractor;
import androidx.media3.exoplayer.source.mediaparser.InputReaderAdapterV30;
import androidx.media3.exoplayer.source.mediaparser.MediaParserUtil;
import androidx.media3.exoplayer.source.mediaparser.OutputConsumerAdapterV30;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(30)
@UnstableApi
/* loaded from: classes2.dex */
public final class MediaParserExtractorAdapter implements ProgressiveMediaExtractor {

    @Deprecated
    public static final ProgressiveMediaExtractor.Factory FACTORY = new ProgressiveMediaExtractor.Factory() { // from class: androidx.media3.exoplayer.source.s
        @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor.Factory
        public final ProgressiveMediaExtractor createProgressiveMediaExtractor(PlayerId playerId) {
            return MediaParserExtractorAdapter.a(playerId);
        }
    };
    private final InputReaderAdapterV30 inputReaderAdapter;
    private final MediaParser mediaParser;
    private final OutputConsumerAdapterV30 outputConsumerAdapter;
    private String parserName;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Factory implements ProgressiveMediaExtractor.Factory {
        private static final Map<String, Object> parameters = new HashMap();

        public void setConstantBitrateSeekingEnabled(boolean z11) {
            if (!z11) {
                Map<String, Object> map = parameters;
                map.remove("android.media.mediaparser.adts.enableCbrSeeking");
                map.remove("android.media.mediaparser.amr.enableCbrSeeking");
                map.remove("android.media.mediaparser.mp3.enableCbrSeeking");
                return;
            }
            Map<String, Object> map2 = parameters;
            Boolean bool = Boolean.TRUE;
            map2.put("android.media.mediaparser.adts.enableCbrSeeking", bool);
            map2.put("android.media.mediaparser.amr.enableCbrSeeking", bool);
            map2.put("android.media.mediaparser.mp3.enableCbrSeeking", bool);
        }

        @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor.Factory
        public MediaParserExtractorAdapter createProgressiveMediaExtractor(PlayerId playerId) {
            return new MediaParserExtractorAdapter(playerId, parameters);
        }
    }

    public static /* synthetic */ ProgressiveMediaExtractor a(PlayerId playerId) {
        return new MediaParserExtractorAdapter(playerId, ImmutableMap.of());
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void disableSeekingOnMp3Streams() {
        if ("android.media.mediaparser.Mp3Parser".equals(this.parserName)) {
            this.outputConsumerAdapter.disableSeeking();
        }
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public long getCurrentInputPosition() {
        return this.inputReaderAdapter.getPosition();
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void init(DataReader dataReader, Uri uri, Map<String, List<String>> map, long j11, long j12, ExtractorOutput extractorOutput) throws IOException {
        String parserName;
        String parserName2;
        String parserName3;
        this.outputConsumerAdapter.setExtractorOutput(extractorOutput);
        this.inputReaderAdapter.setDataReader(dataReader, j12);
        this.inputReaderAdapter.setCurrentPosition(j11);
        parserName = this.mediaParser.getParserName();
        if ("android.media.mediaparser.UNKNOWN".equals(parserName)) {
            this.mediaParser.advance(this.inputReaderAdapter);
            parserName3 = this.mediaParser.getParserName();
            this.parserName = parserName3;
            this.outputConsumerAdapter.setSelectedParserName(parserName3);
            return;
        }
        if (parserName.equals(this.parserName)) {
            return;
        }
        parserName2 = this.mediaParser.getParserName();
        this.parserName = parserName2;
        this.outputConsumerAdapter.setSelectedParserName(parserName2);
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public int read(PositionHolder positionHolder) throws IOException {
        boolean advance;
        advance = this.mediaParser.advance(this.inputReaderAdapter);
        long andResetSeekPosition = this.inputReaderAdapter.getAndResetSeekPosition();
        positionHolder.position = andResetSeekPosition;
        if (advance) {
            return andResetSeekPosition != -1 ? 1 : 0;
        }
        return -1;
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void release() {
        this.mediaParser.release();
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void seek(long j11, long j12) {
        long j13;
        this.inputReaderAdapter.setCurrentPosition(j11);
        Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> seekPoints = this.outputConsumerAdapter.getSeekPoints(j12);
        MediaParser mediaParser = this.mediaParser;
        j13 = m.a(seekPoints.second).position;
        mediaParser.seek(m.a(j13 == j11 ? seekPoints.second : seekPoints.first));
    }

    @Deprecated
    public MediaParserExtractorAdapter(PlayerId playerId) {
        this(playerId, ImmutableMap.of());
    }

    @SuppressLint({"WrongConstant"})
    private MediaParserExtractorAdapter(PlayerId playerId, Map<String, Object> map) {
        MediaParser create;
        OutputConsumerAdapterV30 outputConsumerAdapterV30 = new OutputConsumerAdapterV30();
        this.outputConsumerAdapter = outputConsumerAdapterV30;
        this.inputReaderAdapter = new InputReaderAdapterV30();
        create = MediaParser.create(outputConsumerAdapterV30, new String[0]);
        this.mediaParser = create;
        Boolean bool = Boolean.TRUE;
        create.setParameter(MediaParserUtil.PARAMETER_EAGERLY_EXPOSE_TRACK_TYPE, bool);
        create.setParameter(MediaParserUtil.PARAMETER_IN_BAND_CRYPTO_INFO, bool);
        create.setParameter(MediaParserUtil.PARAMETER_INCLUDE_SUPPLEMENTAL_DATA, bool);
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            this.mediaParser.setParameter(entry.getKey(), entry.getValue());
        }
        this.parserName = "android.media.mediaparser.UNKNOWN";
        if (Util.SDK_INT >= 31) {
            MediaParserUtil.setLogSessionIdOnMediaParser(this.mediaParser, playerId);
        }
    }
}
