package androidx.camera.core;

import android.os.Build;
import android.util.Log;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class Logger {
    static final int DEFAULT_MIN_LOG_LEVEL = 3;
    private static final int MAX_TAG_LENGTH = 23;
    private static int sMinLogLevel = 3;

    private Logger() {
    }

    public static void d(@NonNull String str, @NonNull String str2) {
        String truncateTag = truncateTag(str);
        if (isLogLevelEnabled(truncateTag, 3)) {
            Log.d(truncateTag, str2);
        }
    }

    public static void e(@NonNull String str, @NonNull String str2) {
        String truncateTag = truncateTag(str);
        if (isLogLevelEnabled(truncateTag, 6)) {
            Log.e(truncateTag, str2);
        }
    }

    public static int getMinLogLevel() {
        return sMinLogLevel;
    }

    public static void i(@NonNull String str, @NonNull String str2) {
        String truncateTag = truncateTag(str);
        if (isLogLevelEnabled(truncateTag, 4)) {
            Log.i(truncateTag, str2);
        }
    }

    public static boolean isDebugEnabled(@NonNull String str) {
        return isLogLevelEnabled(truncateTag(str), 3);
    }

    public static boolean isErrorEnabled(@NonNull String str) {
        return isLogLevelEnabled(truncateTag(str), 6);
    }

    public static boolean isInfoEnabled(@NonNull String str) {
        return isLogLevelEnabled(truncateTag(str), 4);
    }

    private static boolean isLogLevelEnabled(@NonNull String str, int i11) {
        return sMinLogLevel <= i11 || Log.isLoggable(str, i11);
    }

    public static boolean isVerboseEnabled(@NonNull String str) {
        return isLogLevelEnabled(truncateTag(str), 2);
    }

    public static boolean isWarnEnabled(@NonNull String str) {
        return isLogLevelEnabled(truncateTag(str), 5);
    }

    public static void resetMinLogLevel() {
        sMinLogLevel = 3;
    }

    public static void setMinLogLevel(@IntRange(from = 3, to = 6) int i11) {
        sMinLogLevel = i11;
    }

    @NonNull
    private static String truncateTag(@NonNull String str) {
        return (Build.VERSION.SDK_INT > 25 || 23 >= str.length()) ? str : str.substring(0, 23);
    }

    public static void w(@NonNull String str, @NonNull String str2) {
        String truncateTag = truncateTag(str);
        if (isLogLevelEnabled(truncateTag, 5)) {
            Log.w(truncateTag, str2);
        }
    }

    public static void d(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        String truncateTag = truncateTag(str);
        if (isLogLevelEnabled(truncateTag, 3)) {
            Log.d(truncateTag, str2, th2);
        }
    }

    public static void e(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        String truncateTag = truncateTag(str);
        if (isLogLevelEnabled(truncateTag, 6)) {
            Log.e(truncateTag, str2, th2);
        }
    }

    public static void i(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        String truncateTag = truncateTag(str);
        if (isLogLevelEnabled(truncateTag, 4)) {
            Log.i(truncateTag, str2, th2);
        }
    }

    public static void w(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        String truncateTag = truncateTag(str);
        if (isLogLevelEnabled(truncateTag, 5)) {
            Log.w(truncateTag, str2, th2);
        }
    }
}
