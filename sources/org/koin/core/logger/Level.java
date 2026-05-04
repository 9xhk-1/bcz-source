package org.koin.core.logger;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class Level {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Level[] $VALUES;
    public static final Level DEBUG = new Level("DEBUG", 0);
    public static final Level INFO = new Level("INFO", 1);
    public static final Level WARNING = new Level("WARNING", 2);
    public static final Level ERROR = new Level("ERROR", 3);
    public static final Level NONE = new Level("NONE", 4);

    private static final /* synthetic */ Level[] $values() {
        return new Level[]{DEBUG, INFO, WARNING, ERROR, NONE};
    }

    static {
        Level[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private Level(String str, int i11) {
    }

    @k
    public static a<Level> getEntries() {
        return $ENTRIES;
    }

    public static Level valueOf(String str) {
        return (Level) Enum.valueOf(Level.class, str);
    }

    public static Level[] values() {
        return (Level[]) $VALUES.clone();
    }
}
