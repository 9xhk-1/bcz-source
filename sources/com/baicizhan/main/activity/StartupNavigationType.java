package com.baicizhan.main.activity;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class StartupNavigationType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ StartupNavigationType[] $VALUES;
    public static final StartupNavigationType PUSHER = new StartupNavigationType("PUSHER", 0);
    public static final StartupNavigationType WE_CHAT = new StartupNavigationType("WE_CHAT", 1);
    public static final StartupNavigationType OPEN_INSTALL = new StartupNavigationType("OPEN_INSTALL", 2);
    public static final StartupNavigationType OTHERS = new StartupNavigationType("OTHERS", 3);

    private static final /* synthetic */ StartupNavigationType[] $values() {
        return new StartupNavigationType[]{PUSHER, WE_CHAT, OPEN_INSTALL, OTHERS};
    }

    static {
        StartupNavigationType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private StartupNavigationType(String str, int i11) {
    }

    @k
    public static a<StartupNavigationType> getEntries() {
        return $ENTRIES;
    }

    public static StartupNavigationType valueOf(String str) {
        return (StartupNavigationType) Enum.valueOf(StartupNavigationType.class, str);
    }

    public static StartupNavigationType[] values() {
        return (StartupNavigationType[]) $VALUES.clone();
    }
}
