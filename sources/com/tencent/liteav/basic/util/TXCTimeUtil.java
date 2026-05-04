package com.tencent.liteav.basic.util;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class TXCTimeUtil {
    static {
        h.d();
    }

    public static long generatePtsMS() {
        return nativeGeneratePtsMS();
    }

    public static long getClockTickInHz() {
        return nativeGetClockTickInHz();
    }

    public static long getTimeTick() {
        return nativeGetTimeTick();
    }

    public static long getUtcTimeTick() {
        return nativeGetUtcTimeTick();
    }

    public static void initAppStartTime() {
        nativeInitAppStartTime();
    }

    private static native long nativeGeneratePtsMS();

    private static native long nativeGetClockTickInHz();

    private static native long nativeGetTimeTick();

    private static native long nativeGetUtcTimeTick();

    private static native void nativeInitAppStartTime();
}
