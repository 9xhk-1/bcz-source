package androidx.tracing;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(18)
/* loaded from: classes3.dex */
final class TraceApi18Impl {
    private TraceApi18Impl() {
    }

    public static void beginSection(@NonNull String str) {
        android.os.Trace.beginSection(str);
    }

    public static void endSection() {
        android.os.Trace.endSection();
    }
}
