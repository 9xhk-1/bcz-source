package androidx.tracing;

import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(29)
/* loaded from: classes3.dex */
final class TraceApi29Impl {
    private TraceApi29Impl() {
    }

    public static void beginAsyncSection(@NonNull String str, int i11) {
        android.os.Trace.beginAsyncSection(str, i11);
    }

    public static void endAsyncSection(@NonNull String str, int i11) {
        android.os.Trace.endAsyncSection(str, i11);
    }

    @DoNotInline
    public static boolean isEnabled() {
        return android.os.Trace.isEnabled();
    }

    public static void setCounter(@NonNull String str, int i11) {
        android.os.Trace.setCounter(str, i11);
    }
}
