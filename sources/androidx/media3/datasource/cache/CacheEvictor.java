package androidx.media3.datasource.cache;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.cache.Cache;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public interface CacheEvictor extends Cache.Listener {
    void onCacheInitialized();

    void onStartFile(Cache cache, String str, long j11, long j12);

    boolean requiresCacheSpanTouches();
}
