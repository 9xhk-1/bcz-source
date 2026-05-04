package com.baicizhan.main.activity.aiclass.video;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class PlayerState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PlayerState[] $VALUES;
    public static final PlayerState PLAYING = new PlayerState("PLAYING", 0);
    public static final PlayerState PAUSE = new PlayerState("PAUSE", 1);
    public static final PlayerState LOADING = new PlayerState("LOADING", 2);
    public static final PlayerState ERROR = new PlayerState("ERROR", 3);
    public static final PlayerState END = new PlayerState("END", 4);

    private static final /* synthetic */ PlayerState[] $values() {
        return new PlayerState[]{PLAYING, PAUSE, LOADING, ERROR, END};
    }

    static {
        PlayerState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private PlayerState(String str, int i11) {
    }

    @k
    public static a<PlayerState> getEntries() {
        return $ENTRIES;
    }

    public static PlayerState valueOf(String str) {
        return (PlayerState) Enum.valueOf(PlayerState.class, str);
    }

    public static PlayerState[] values() {
        return (PlayerState[]) $VALUES.clone();
    }
}
