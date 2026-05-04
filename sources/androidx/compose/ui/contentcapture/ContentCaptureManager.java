package androidx.compose.ui.contentcapture;

import androidx.compose.ui.ExperimentalComposeUiApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@ExperimentalComposeUiApi
/* loaded from: classes.dex */
public interface ContentCaptureManager {

    @m80.k
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static boolean isEnabled = true;

        private Companion() {
        }

        @ExperimentalComposeUiApi
        public final boolean isEnabled() {
            return isEnabled;
        }

        @ExperimentalComposeUiApi
        public final void setEnabled(boolean z11) {
            isEnabled = z11;
        }

        @ExperimentalComposeUiApi
        public static /* synthetic */ void isEnabled$annotations() {
        }
    }
}
