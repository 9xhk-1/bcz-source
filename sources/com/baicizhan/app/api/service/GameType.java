package com.baicizhan.app.api.service;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class GameType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ GameType[] $VALUES;
    public static final GameType Learning = new GameType("Learning", 0);
    public static final GameType Spelling = new GameType("Spelling", 1);
    public static final GameType Review = new GameType("Review", 2);
    public static final GameType AiLeadU = new GameType("AiLeadU", 3);

    private static final /* synthetic */ GameType[] $values() {
        return new GameType[]{Learning, Spelling, Review, AiLeadU};
    }

    static {
        GameType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private GameType(String str, int i11) {
    }

    @k
    public static a<GameType> getEntries() {
        return $ENTRIES;
    }

    public static GameType valueOf(String str) {
        return (GameType) Enum.valueOf(GameType.class, str);
    }

    public static GameType[] values() {
        return (GameType[]) $VALUES.clone();
    }
}
