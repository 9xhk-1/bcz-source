package com.baicizhan.main.home.player.model;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class AudioEffect {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AudioEffect[] $VALUES;
    public static final AudioEffect TREASURE_CHEST_DISPLAY = new AudioEffect("TREASURE_CHEST_DISPLAY", 0);
    public static final AudioEffect TREASURE_CHEST_OPEN = new AudioEffect("TREASURE_CHEST_OPEN", 1);
    public static final AudioEffect ISLAND_UNLOCK = new AudioEffect("ISLAND_UNLOCK", 2);
    public static final AudioEffect ISLAND_GROW = new AudioEffect("ISLAND_GROW", 3);
    public static final AudioEffect ISLAND_GROW2 = new AudioEffect("ISLAND_GROW2", 4);
    public static final AudioEffect ISLAND_INTERACT = new AudioEffect("ISLAND_INTERACT", 5);
    public static final AudioEffect TRY_UNLOCKING = new AudioEffect("TRY_UNLOCKING", 6);
    public static final AudioEffect STATUS_AWARD_COINS = new AudioEffect("STATUS_AWARD_COINS", 7);
    public static final AudioEffect STATUS_AWARD_FORWARDING = new AudioEffect("STATUS_AWARD_FORWARDING", 8);
    public static final AudioEffect COMMON_HOME_CLICK = new AudioEffect("COMMON_HOME_CLICK", 9);
    public static final AudioEffect HOME_LE_START = new AudioEffect("HOME_LE_START", 10);

    private static final /* synthetic */ AudioEffect[] $values() {
        return new AudioEffect[]{TREASURE_CHEST_DISPLAY, TREASURE_CHEST_OPEN, ISLAND_UNLOCK, ISLAND_GROW, ISLAND_GROW2, ISLAND_INTERACT, TRY_UNLOCKING, STATUS_AWARD_COINS, STATUS_AWARD_FORWARDING, COMMON_HOME_CLICK, HOME_LE_START};
    }

    static {
        AudioEffect[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private AudioEffect(String str, int i11) {
    }

    @k
    public static a<AudioEffect> getEntries() {
        return $ENTRIES;
    }

    public static AudioEffect valueOf(String str) {
        return (AudioEffect) Enum.valueOf(AudioEffect.class, str);
    }

    public static AudioEffect[] values() {
        return (AudioEffect[]) $VALUES.clone();
    }
}
