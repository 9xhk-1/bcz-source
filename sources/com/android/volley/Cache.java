package com.android.volley;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface Cache {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Entry {
        public List<Header> allResponseHeaders;
        public byte[] data;
        public String etag;
        public long lastModified;
        public Map<String, String> responseHeaders = Collections.EMPTY_MAP;
        public long serverDate;
        public long softTtl;
        public long ttl;

        public boolean isExpired() {
            return isExpired(System.currentTimeMillis());
        }

        public boolean refreshNeeded() {
            return refreshNeeded(System.currentTimeMillis());
        }

        public boolean isExpired(long j11) {
            return this.ttl < j11;
        }

        public boolean refreshNeeded(long j11) {
            return this.softTtl < j11;
        }
    }

    void clear();

    @Nullable
    Entry get(String str);

    void initialize();

    void invalidate(String str, boolean z11);

    void put(String str, Entry entry);

    void remove(String str);
}
