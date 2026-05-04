package androidx.media3.datasource.cache;

import androidx.media3.common.util.UnstableApi;
import java.util.Comparator;
import java.util.TreeSet;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class LeastRecentlyUsedCacheEvictor implements CacheEvictor {
    private long currentSize;
    private final TreeSet<CacheSpan> leastRecentlyUsed = new TreeSet<>(new Comparator() { // from class: androidx.media3.datasource.cache.b
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int compare;
            compare = LeastRecentlyUsedCacheEvictor.compare((CacheSpan) obj, (CacheSpan) obj2);
            return compare;
        }
    });
    private final long maxBytes;

    public LeastRecentlyUsedCacheEvictor(long j11) {
        this.maxBytes = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int compare(CacheSpan cacheSpan, CacheSpan cacheSpan2) {
        long j11 = cacheSpan.lastTouchTimestamp;
        long j12 = cacheSpan2.lastTouchTimestamp;
        return j11 - j12 == 0 ? cacheSpan.compareTo(cacheSpan2) : j11 < j12 ? -1 : 1;
    }

    private void evictCache(Cache cache, long j11) {
        while (this.currentSize + j11 > this.maxBytes && !this.leastRecentlyUsed.isEmpty()) {
            cache.removeSpan(this.leastRecentlyUsed.first());
        }
    }

    @Override // androidx.media3.datasource.cache.Cache.Listener
    public void onSpanAdded(Cache cache, CacheSpan cacheSpan) {
        this.leastRecentlyUsed.add(cacheSpan);
        this.currentSize += cacheSpan.length;
        evictCache(cache, 0L);
    }

    @Override // androidx.media3.datasource.cache.Cache.Listener
    public void onSpanRemoved(Cache cache, CacheSpan cacheSpan) {
        this.leastRecentlyUsed.remove(cacheSpan);
        this.currentSize -= cacheSpan.length;
    }

    @Override // androidx.media3.datasource.cache.Cache.Listener
    public void onSpanTouched(Cache cache, CacheSpan cacheSpan, CacheSpan cacheSpan2) {
        onSpanRemoved(cache, cacheSpan);
        onSpanAdded(cache, cacheSpan2);
    }

    @Override // androidx.media3.datasource.cache.CacheEvictor
    public void onStartFile(Cache cache, String str, long j11, long j12) {
        if (j12 != -1) {
            evictCache(cache, j12);
        }
    }

    @Override // androidx.media3.datasource.cache.CacheEvictor
    public boolean requiresCacheSpanTouches() {
        return true;
    }

    @Override // androidx.media3.datasource.cache.CacheEvictor
    public void onCacheInitialized() {
    }
}
