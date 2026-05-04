package com.baicizhan.app.api.service.model;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class StreakAwardType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ StreakAwardType[] $VALUES;
    public static final StreakAwardType Coin = new StreakAwardType("Coin", 0);
    public static final StreakAwardType AvatarFrame = new StreakAwardType("AvatarFrame", 1);
    public static final StreakAwardType Skin = new StreakAwardType("Skin", 2);
    public static final StreakAwardType CardSlot = new StreakAwardType("CardSlot", 3);

    private static final /* synthetic */ StreakAwardType[] $values() {
        return new StreakAwardType[]{Coin, AvatarFrame, Skin, CardSlot};
    }

    static {
        StreakAwardType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private StreakAwardType(String str, int i11) {
    }

    @k
    public static a<StreakAwardType> getEntries() {
        return $ENTRIES;
    }

    public static StreakAwardType valueOf(String str) {
        return (StreakAwardType) Enum.valueOf(StreakAwardType.class, str);
    }

    public static StreakAwardType[] values() {
        return (StreakAwardType[]) $VALUES.clone();
    }
}
