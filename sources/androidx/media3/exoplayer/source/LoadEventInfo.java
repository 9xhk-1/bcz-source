package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSpec;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class LoadEventInfo {
    private static final AtomicLong idSource = new AtomicLong();
    public final long bytesLoaded;
    public final DataSpec dataSpec;
    public final long elapsedRealtimeMs;
    public final long loadDurationMs;
    public final long loadTaskId;
    public final Map<String, List<String>> responseHeaders;
    public final Uri uri;

    public LoadEventInfo(long j11, DataSpec dataSpec, long j12) {
        this(j11, dataSpec, dataSpec.uri, Collections.EMPTY_MAP, j12, 0L, 0L);
    }

    public static long getNewId() {
        return idSource.getAndIncrement();
    }

    public LoadEventInfo(long j11, DataSpec dataSpec, Uri uri, Map<String, List<String>> map, long j12, long j13, long j14) {
        this.loadTaskId = j11;
        this.dataSpec = dataSpec;
        this.uri = uri;
        this.responseHeaders = map;
        this.elapsedRealtimeMs = j12;
        this.loadDurationMs = j13;
        this.bytesLoaded = j14;
    }
}
