package com.android.volley.toolbox;

import com.android.volley.Cache;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class NoCache implements Cache {
    @Override // com.android.volley.Cache
    public Cache.Entry get(String str) {
        return null;
    }

    @Override // com.android.volley.Cache
    public void clear() {
    }

    @Override // com.android.volley.Cache
    public void initialize() {
    }

    @Override // com.android.volley.Cache
    public void remove(String str) {
    }

    @Override // com.android.volley.Cache
    public void invalidate(String str, boolean z11) {
    }

    @Override // com.android.volley.Cache
    public void put(String str, Cache.Entry entry) {
    }
}
