package org.junit.platform.commons.util;

import java.util.LinkedHashMap;
import java.util.Map;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.6", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public class LruCache<K, V> extends LinkedHashMap<K, V> {
    private static final long serialVersionUID = 1;
    private final int maxSize;

    public LruCache(int maxSize) {
        super(maxSize + 1, 1.0f, true);
        this.maxSize = maxSize;
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > this.maxSize;
    }
}
