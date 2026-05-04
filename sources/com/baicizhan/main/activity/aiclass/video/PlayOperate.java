package com.baicizhan.main.activity.aiclass.video;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class PlayOperate {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PlayOperate[] $VALUES;
    public static final PlayOperate PAUSE = new PlayOperate("PAUSE", 0);
    public static final PlayOperate STOP = new PlayOperate("STOP", 1);
    public static final PlayOperate RESUME = new PlayOperate("RESUME", 2);

    private static final /* synthetic */ PlayOperate[] $values() {
        return new PlayOperate[]{PAUSE, STOP, RESUME};
    }

    static {
        PlayOperate[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private PlayOperate(String str, int i11) {
    }

    @k
    public static a<PlayOperate> getEntries() {
        return $ENTRIES;
    }

    public static PlayOperate valueOf(String str) {
        return (PlayOperate) Enum.valueOf(PlayOperate.class, str);
    }

    public static PlayOperate[] values() {
        return (PlayOperate[]) $VALUES.clone();
    }
}
