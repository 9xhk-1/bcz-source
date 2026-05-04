package org.slf4j.event;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public enum Level {
    ERROR(40, "ERROR"),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    TRACE(0, "TRACE");

    private final int levelInt;
    private final String levelStr;

    Level(int i11, String str) {
        this.levelInt = i11;
        this.levelStr = str;
    }

    public static Level intToLevel(int i11) {
        if (i11 == 0) {
            return TRACE;
        }
        if (i11 == 10) {
            return DEBUG;
        }
        if (i11 == 20) {
            return INFO;
        }
        if (i11 == 30) {
            return WARN;
        }
        if (i11 == 40) {
            return ERROR;
        }
        throw new IllegalArgumentException("Level integer [" + i11 + "] not recognized.");
    }

    public int toInt() {
        return this.levelInt;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.levelStr;
    }
}
