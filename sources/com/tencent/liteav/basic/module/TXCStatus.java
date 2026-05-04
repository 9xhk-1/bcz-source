package com.tencent.liteav.basic.module;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class TXCStatus {
    public static void a(String str) {
        nativeStatusStartRecord(str);
    }

    public static void b(String str) {
        nativeStatusStopRecord(str);
    }

    public static int c(String str, int i11) {
        return c(str, i11, 0);
    }

    public static double d(String str, int i11) {
        return d(str, i11, 0);
    }

    private static native double nativeStatusGetDoubleValue(String str, int i11, int i12);

    private static native long nativeStatusGetIntValue(String str, int i11, int i12);

    private static native String nativeStatusGetStrValue(String str, int i11, int i12);

    private static native boolean nativeStatusSetDoubleValue(String str, int i11, int i12, double d11);

    private static native boolean nativeStatusSetIntValue(String str, int i11, int i12, long j11);

    private static native boolean nativeStatusSetStrValue(String str, int i11, int i12, String str2);

    private static native void nativeStatusStartRecord(String str);

    private static native void nativeStatusStopRecord(String str);

    public static boolean a(String str, int i11, Object obj) {
        return a(str, i11, 0, obj);
    }

    public static String b(String str, int i11) {
        return b(str, i11, 0);
    }

    public static int c(String str, int i11, int i12) {
        return (int) nativeStatusGetIntValue(str, i11, i12);
    }

    public static double d(String str, int i11, int i12) {
        return nativeStatusGetDoubleValue(str, i11, i12);
    }

    public static boolean a(String str, int i11, int i12, Object obj) {
        if (str == null || str.length() == 0 || obj == null) {
            return false;
        }
        if (obj instanceof Double) {
            return nativeStatusSetDoubleValue(str, i11, i12, ((Double) obj).doubleValue());
        }
        if (obj instanceof String) {
            return nativeStatusSetStrValue(str, i11, i12, (String) obj);
        }
        if (obj instanceof Long) {
            return nativeStatusSetIntValue(str, i11, i12, ((Long) obj).longValue());
        }
        return nativeStatusSetIntValue(str, i11, i12, ((Integer) obj).intValue());
    }

    public static String b(String str, int i11, int i12) {
        return nativeStatusGetStrValue(str, i11, i12);
    }

    public static long a(String str, int i11) {
        return a(str, i11, 0);
    }

    public static long a(String str, int i11, int i12) {
        return nativeStatusGetIntValue(str, i11, i12);
    }
}
