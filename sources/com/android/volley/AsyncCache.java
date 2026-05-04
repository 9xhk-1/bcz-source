package com.android.volley;

import androidx.annotation.Nullable;
import com.android.volley.Cache;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class AsyncCache {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface OnGetCompleteCallback {
        void onGetComplete(@Nullable Cache.Entry entry);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface OnWriteCompleteCallback {
        void onWriteComplete();
    }

    public abstract void clear(OnWriteCompleteCallback onWriteCompleteCallback);

    public abstract void get(String str, OnGetCompleteCallback onGetCompleteCallback);

    public abstract void initialize(OnWriteCompleteCallback onWriteCompleteCallback);

    public abstract void invalidate(String str, boolean z11, OnWriteCompleteCallback onWriteCompleteCallback);

    public abstract void put(String str, Cache.Entry entry, OnWriteCompleteCallback onWriteCompleteCallback);

    public abstract void remove(String str, OnWriteCompleteCallback onWriteCompleteCallback);
}
