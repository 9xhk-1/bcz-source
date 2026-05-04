package com.squareup.picasso;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public enum NetworkPolicy {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);

    final int index;

    NetworkPolicy(int i11) {
        this.index = i11;
    }

    public static boolean isOfflineOnly(int i11) {
        return (i11 & OFFLINE.index) != 0;
    }

    public static boolean shouldReadFromDiskCache(int i11) {
        return (i11 & NO_CACHE.index) == 0;
    }

    public static boolean shouldWriteToDiskCache(int i11) {
        return (i11 & NO_STORE.index) == 0;
    }
}
