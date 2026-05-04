package androidx.media3.datasource.cache;

import androidx.media3.common.util.UnstableApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class NoOpCacheEvictor implements CacheEvictor {
    @Override // androidx.media3.datasource.cache.CacheEvictor
    public boolean requiresCacheSpanTouches() {
        return false;
    }

    @Override // androidx.media3.datasource.cache.CacheEvictor
    public void onCacheInitialized() {
    }

    @Override // androidx.media3.datasource.cache.Cache.Listener
    public void onSpanAdded(Cache cache, CacheSpan cacheSpan) {
    }

    @Override // androidx.media3.datasource.cache.Cache.Listener
    public void onSpanRemoved(Cache cache, CacheSpan cacheSpan) {
    }

    @Override // androidx.media3.datasource.cache.Cache.Listener
    public void onSpanTouched(Cache cache, CacheSpan cacheSpan, CacheSpan cacheSpan2) {
    }

    @Override // androidx.media3.datasource.cache.CacheEvictor
    public void onStartFile(Cache cache, String str, long j11, long j12) {
    }
}
