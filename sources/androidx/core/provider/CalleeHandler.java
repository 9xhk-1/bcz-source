package androidx.core.provider;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
class CalleeHandler {
    private CalleeHandler() {
    }

    @NonNull
    public static Handler create() {
        return Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
    }
}
