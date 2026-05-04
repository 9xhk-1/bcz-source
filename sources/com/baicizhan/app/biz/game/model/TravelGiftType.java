package com.baicizhan.app.biz.game.model;

import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class TravelGiftType {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ TravelGiftType[] $VALUES;
    private final int value;
    public static final TravelGiftType PostCard = new TravelGiftType("PostCard", 0, 1);
    public static final TravelGiftType GiftLetter = new TravelGiftType("GiftLetter", 1, 2);

    private static final /* synthetic */ TravelGiftType[] $values() {
        return new TravelGiftType[]{PostCard, GiftLetter};
    }

    static {
        TravelGiftType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private TravelGiftType(String str, int i11, int i12) {
        this.value = i12;
    }

    @k
    public static m00.a<TravelGiftType> getEntries() {
        return $ENTRIES;
    }

    public static TravelGiftType valueOf(String str) {
        return (TravelGiftType) Enum.valueOf(TravelGiftType.class, str);
    }

    public static TravelGiftType[] values() {
        return (TravelGiftType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
