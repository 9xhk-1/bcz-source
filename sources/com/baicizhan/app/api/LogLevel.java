package com.baicizhan.app.api;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class LogLevel {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ LogLevel[] $VALUES;
    public static final LogLevel Debug = new LogLevel("Debug", 0);
    public static final LogLevel Info = new LogLevel("Info", 1);
    public static final LogLevel Error = new LogLevel("Error", 2);

    private static final /* synthetic */ LogLevel[] $values() {
        return new LogLevel[]{Debug, Info, Error};
    }

    static {
        LogLevel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private LogLevel(String str, int i11) {
    }

    @k
    public static a<LogLevel> getEntries() {
        return $ENTRIES;
    }

    public static LogLevel valueOf(String str) {
        return (LogLevel) Enum.valueOf(LogLevel.class, str);
    }

    public static LogLevel[] values() {
        return (LogLevel[]) $VALUES.clone();
    }
}
