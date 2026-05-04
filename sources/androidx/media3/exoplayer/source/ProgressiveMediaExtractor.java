package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.DataReader;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public interface ProgressiveMediaExtractor {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Factory {
        ProgressiveMediaExtractor createProgressiveMediaExtractor(PlayerId playerId);
    }

    void disableSeekingOnMp3Streams();

    long getCurrentInputPosition();

    void init(DataReader dataReader, Uri uri, Map<String, List<String>> map, long j11, long j12, ExtractorOutput extractorOutput) throws IOException;

    int read(PositionHolder positionHolder) throws IOException;

    void release();

    void seek(long j11, long j12);
}
