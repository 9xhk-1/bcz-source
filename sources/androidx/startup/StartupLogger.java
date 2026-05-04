package androidx.startup;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public final class StartupLogger {
    static final boolean DEBUG = false;
    private static final String TAG = "StartupLogger";

    private StartupLogger() {
    }

    public static void e(@NonNull String str, @Nullable Throwable th2) {
        Log.e(TAG, str, th2);
    }

    public static void i(@NonNull String str) {
        Log.i(TAG, str);
    }

    public static void w(@NonNull String str) {
        Log.w(TAG, str);
    }
}
