package com.baicizhan.app.biz.base.cache;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class CacheStrategy {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CacheStrategy[] $VALUES;
    public static final CacheStrategy CACHE_FIRST = new CacheStrategy("CACHE_FIRST", 0);
    public static final CacheStrategy NETWORK_FIRST = new CacheStrategy("NETWORK_FIRST", 1);
    public static final CacheStrategy CACHE_ONLY = new CacheStrategy("CACHE_ONLY", 2);
    public static final CacheStrategy NETWORK_ONLY = new CacheStrategy("NETWORK_ONLY", 3);

    private static final /* synthetic */ CacheStrategy[] $values() {
        return new CacheStrategy[]{CACHE_FIRST, NETWORK_FIRST, CACHE_ONLY, NETWORK_ONLY};
    }

    static {
        CacheStrategy[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private CacheStrategy(String str, int i11) {
    }

    @k
    public static a<CacheStrategy> getEntries() {
        return $ENTRIES;
    }

    public static CacheStrategy valueOf(String str) {
        return (CacheStrategy) Enum.valueOf(CacheStrategy.class, str);
    }

    public static CacheStrategy[] values() {
        return (CacheStrategy[]) $VALUES.clone();
    }
}
