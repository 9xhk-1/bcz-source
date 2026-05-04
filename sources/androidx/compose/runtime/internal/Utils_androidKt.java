package androidx.compose.runtime.internal;

import android.util.Log;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class Utils_androidKt {

    @k
    private static final String LogTag = "ComposeInternal";

    public static final void logError(@k String str, @k Throwable th2) {
        Log.e(LogTag, str, th2);
    }
}
