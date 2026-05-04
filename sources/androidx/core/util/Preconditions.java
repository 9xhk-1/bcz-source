package androidx.core.util;

import android.text.TextUtils;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public final class Preconditions {
    private Preconditions() {
    }

    public static void checkArgument(boolean z11) {
        if (!z11) {
            throw new IllegalArgumentException();
        }
    }

    public static float checkArgumentFinite(float f11, @NonNull String str) {
        if (Float.isNaN(f11)) {
            throw new IllegalArgumentException(str + " must not be NaN");
        }
        if (!Float.isInfinite(f11)) {
            return f11;
        }
        throw new IllegalArgumentException(str + " must not be infinite");
    }

    public static int checkArgumentInRange(int i11, int i12, int i13, @NonNull String str) {
        if (i11 < i12) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i12), Integer.valueOf(i13)));
        }
        if (i11 <= i13) {
            return i11;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i12), Integer.valueOf(i13)));
    }

    @IntRange(from = 0)
    public static int checkArgumentNonnegative(int i11, @Nullable String str) {
        if (i11 >= 0) {
            return i11;
        }
        throw new IllegalArgumentException(str);
    }

    public static int checkFlagsArgument(int i11, int i12) {
        if ((i11 & i12) == i11) {
            return i11;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i11) + ", but only 0x" + Integer.toHexString(i12) + " are allowed");
    }

    @NonNull
    public static <T> T checkNotNull(@Nullable T t11) {
        t11.getClass();
        return t11;
    }

    public static void checkState(boolean z11, @Nullable String str) {
        if (!z11) {
            throw new IllegalStateException(str);
        }
    }

    @NonNull
    public static <T extends CharSequence> T checkStringNotEmpty(@Nullable T t11) {
        if (TextUtils.isEmpty(t11)) {
            throw new IllegalArgumentException();
        }
        return t11;
    }

    public static void checkArgument(boolean z11, @NonNull Object obj) {
        if (!z11) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @IntRange(from = 0)
    public static int checkArgumentNonnegative(int i11) {
        if (i11 >= 0) {
            return i11;
        }
        throw new IllegalArgumentException();
    }

    @NonNull
    public static <T> T checkNotNull(@Nullable T t11, @NonNull Object obj) {
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void checkState(boolean z11) {
        checkState(z11, null);
    }

    public static void checkArgument(boolean z11, @NonNull String str, @NonNull Object... objArr) {
        if (!z11) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    @NonNull
    public static <T extends CharSequence> T checkStringNotEmpty(@Nullable T t11, @NonNull Object obj) {
        if (TextUtils.isEmpty(t11)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return t11;
    }

    @NonNull
    public static <T extends CharSequence> T checkStringNotEmpty(@Nullable T t11, @NonNull String str, @NonNull Object... objArr) {
        if (TextUtils.isEmpty(t11)) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
        return t11;
    }

    public static long checkArgumentInRange(long j11, long j12, long j13, @NonNull String str) {
        if (j11 < j12) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Long.valueOf(j12), Long.valueOf(j13)));
        }
        if (j11 <= j13) {
            return j11;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Long.valueOf(j12), Long.valueOf(j13)));
    }

    public static float checkArgumentInRange(float f11, float f12, float f13, @NonNull String str) {
        if (f11 < f12) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Float.valueOf(f12), Float.valueOf(f13)));
        }
        if (f11 <= f13) {
            return f11;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Float.valueOf(f12), Float.valueOf(f13)));
    }

    public static double checkArgumentInRange(double d11, double d12, double d13, @NonNull String str) {
        if (d11 < d12) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Double.valueOf(d12), Double.valueOf(d13)));
        }
        if (d11 <= d13) {
            return d11;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Double.valueOf(d12), Double.valueOf(d13)));
    }
}
