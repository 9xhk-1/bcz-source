package androidx.compose.ui.tooling;

import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class PreviewLogger {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        public static /* synthetic */ void logError$ui_tooling_release$default(Companion companion, String str, Throwable th2, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                th2 = null;
            }
            companion.logError$ui_tooling_release(str, th2);
        }

        public static /* synthetic */ void logWarning$ui_tooling_release$default(Companion companion, String str, Throwable th2, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                th2 = null;
            }
            companion.logWarning$ui_tooling_release(str, th2);
        }

        public final void logError$ui_tooling_release(@k String str, @l Throwable th2) {
            Log.e("PreviewLogger", str, th2);
        }

        public final void logWarning$ui_tooling_release(@k String str, @l Throwable th2) {
            Log.w("PreviewLogger", str, th2);
        }

        private Companion() {
        }
    }
}
