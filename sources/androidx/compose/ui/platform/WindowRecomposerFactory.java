package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.compose.ui.InternalComposeUiApi;
import androidx.compose.ui.platform.WindowRecomposerFactory;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@InternalComposeUiApi
/* loaded from: classes2.dex */
public interface WindowRecomposerFactory {

    @m80.k
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @m80.k
        private static final WindowRecomposerFactory LifecycleAware = new WindowRecomposerFactory() { // from class: androidx.compose.ui.platform.e1
            @Override // androidx.compose.ui.platform.WindowRecomposerFactory
            public final Recomposer createRecomposer(View view) {
                Recomposer LifecycleAware$lambda$0;
                LifecycleAware$lambda$0 = WindowRecomposerFactory.Companion.LifecycleAware$lambda$0(view);
                return LifecycleAware$lambda$0;
            }
        };

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Recomposer LifecycleAware$lambda$0(View view) {
            return WindowRecomposer_androidKt.createLifecycleAwareWindowRecomposer$default(view, null, null, 3, null);
        }

        @m80.k
        public final WindowRecomposerFactory getLifecycleAware() {
            return LifecycleAware;
        }
    }

    @m80.k
    Recomposer createRecomposer(@m80.k View view);
}
