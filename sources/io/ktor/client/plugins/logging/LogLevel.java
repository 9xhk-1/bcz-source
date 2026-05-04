package io.ktor.client.plugins.logging;

import m00.a;
import m00.c;
import m80.k;
import r60.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class LogLevel {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ LogLevel[] $VALUES;
    private final boolean body;
    private final boolean headers;
    private final boolean info;
    public static final LogLevel ALL = new LogLevel(f.f83306f, 0, true, true, true);
    public static final LogLevel HEADERS = new LogLevel("HEADERS", 1, true, true, false);
    public static final LogLevel BODY = new LogLevel("BODY", 2, true, false, true);
    public static final LogLevel INFO = new LogLevel("INFO", 3, true, false, false);
    public static final LogLevel NONE = new LogLevel("NONE", 4, false, false, false);

    private static final /* synthetic */ LogLevel[] $values() {
        return new LogLevel[]{ALL, HEADERS, BODY, INFO, NONE};
    }

    static {
        LogLevel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private LogLevel(String str, int i11, boolean z11, boolean z12, boolean z13) {
        this.info = z11;
        this.headers = z12;
        this.body = z13;
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

    public final boolean getBody() {
        return this.body;
    }

    public final boolean getHeaders() {
        return this.headers;
    }

    public final boolean getInfo() {
        return this.info;
    }
}
