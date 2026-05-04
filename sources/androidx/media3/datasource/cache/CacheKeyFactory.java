package androidx.media3.datasource.cache;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSpec;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public interface CacheKeyFactory {
    public static final CacheKeyFactory DEFAULT = new CacheKeyFactory() { // from class: androidx.media3.datasource.cache.a
        @Override // androidx.media3.datasource.cache.CacheKeyFactory
        public final String buildCacheKey(DataSpec dataSpec) {
            return CacheKeyFactory.a(dataSpec);
        }
    };

    static /* synthetic */ String a(DataSpec dataSpec) {
        String str = dataSpec.key;
        return str != null ? str : dataSpec.uri.toString();
    }

    String buildCacheKey(DataSpec dataSpec);
}
