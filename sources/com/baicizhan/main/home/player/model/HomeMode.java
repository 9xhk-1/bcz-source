package com.baicizhan.main.home.player.model;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class HomeMode {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ HomeMode[] $VALUES;
    public static final HomeMode WORDS = new HomeMode("WORDS", 0);
    public static final HomeMode SENTENCES_JAPANESE = new HomeMode("SENTENCES_JAPANESE", 1);

    private static final /* synthetic */ HomeMode[] $values() {
        return new HomeMode[]{WORDS, SENTENCES_JAPANESE};
    }

    static {
        HomeMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private HomeMode(String str, int i11) {
    }

    @k
    public static a<HomeMode> getEntries() {
        return $ENTRIES;
    }

    public static HomeMode valueOf(String str) {
        return (HomeMode) Enum.valueOf(HomeMode.class, str);
    }

    public static HomeMode[] values() {
        return (HomeMode[]) $VALUES.clone();
    }
}
