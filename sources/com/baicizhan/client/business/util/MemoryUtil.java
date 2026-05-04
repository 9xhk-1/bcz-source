package com.baicizhan.client.business.util;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class MemoryUtil {
    private static final long MB_UNIT = 1048576;

    private MemoryUtil() {
    }

    public static float getAvailableMemoryPercent() {
        return getAvailableMemorySize() / getMaxMemorySize();
    }

    public static int getAvailableMemorySize() {
        return getMaxMemorySize() - getConsumedMemorySize();
    }

    public static int getConsumedMemorySize() {
        return getTotalMemorySize() - getFreeMemorySize();
    }

    public static int getFreeMemorySize() {
        return (int) (Runtime.getRuntime().freeMemory() / 1048576);
    }

    public static int getMaxMemorySize() {
        return (int) (Runtime.getRuntime().maxMemory() / 1048576);
    }

    public static int getTotalMemorySize() {
        return (int) (Runtime.getRuntime().totalMemory() / 1048576);
    }
}
