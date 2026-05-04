package com.baicizhan.main.word_book;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public final class FavoriteStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ FavoriteStatus[] $VALUES;
    public static final FavoriteStatus ON_GOING = new FavoriteStatus("ON_GOING", 0);
    public static final FavoriteStatus PROMPTED = new FavoriteStatus("PROMPTED", 1);
    public static final FavoriteStatus FAVORITE_SUCCEEDED = new FavoriteStatus("FAVORITE_SUCCEEDED", 2);
    public static final FavoriteStatus UN_FAVORITE_SUCCEEDED = new FavoriteStatus("UN_FAVORITE_SUCCEEDED", 3);
    public static final FavoriteStatus SAVED = new FavoriteStatus("SAVED", 4);

    private static final /* synthetic */ FavoriteStatus[] $values() {
        return new FavoriteStatus[]{ON_GOING, PROMPTED, FAVORITE_SUCCEEDED, UN_FAVORITE_SUCCEEDED, SAVED};
    }

    static {
        FavoriteStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private FavoriteStatus(String str, int i11) {
    }

    @k
    public static a<FavoriteStatus> getEntries() {
        return $ENTRIES;
    }

    public static FavoriteStatus valueOf(String str) {
        return (FavoriteStatus) Enum.valueOf(FavoriteStatus.class, str);
    }

    public static FavoriteStatus[] values() {
        return (FavoriteStatus[]) $VALUES.clone();
    }
}
