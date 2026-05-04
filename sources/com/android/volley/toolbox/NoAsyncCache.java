package com.android.volley.toolbox;

import com.android.volley.AsyncCache;
import com.android.volley.Cache;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class NoAsyncCache extends AsyncCache {
    @Override // com.android.volley.AsyncCache
    public void clear(AsyncCache.OnWriteCompleteCallback onWriteCompleteCallback) {
        onWriteCompleteCallback.onWriteComplete();
    }

    @Override // com.android.volley.AsyncCache
    public void get(String str, AsyncCache.OnGetCompleteCallback onGetCompleteCallback) {
        onGetCompleteCallback.onGetComplete(null);
    }

    @Override // com.android.volley.AsyncCache
    public void initialize(AsyncCache.OnWriteCompleteCallback onWriteCompleteCallback) {
        onWriteCompleteCallback.onWriteComplete();
    }

    @Override // com.android.volley.AsyncCache
    public void invalidate(String str, boolean z11, AsyncCache.OnWriteCompleteCallback onWriteCompleteCallback) {
        onWriteCompleteCallback.onWriteComplete();
    }

    @Override // com.android.volley.AsyncCache
    public void put(String str, Cache.Entry entry, AsyncCache.OnWriteCompleteCallback onWriteCompleteCallback) {
        onWriteCompleteCallback.onWriteComplete();
    }

    @Override // com.android.volley.AsyncCache
    public void remove(String str, AsyncCache.OnWriteCompleteCallback onWriteCompleteCallback) {
        onWriteCompleteCallback.onWriteComplete();
    }
}
