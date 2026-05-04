package androidx.compose.ui.platform;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
interface BoundsHelper {

    @m80.k
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @m80.k
        public final BoundsHelper getInstance() {
            int i11 = Build.VERSION.SDK_INT;
            return i11 >= 30 ? BoundsHelperApi30Impl.INSTANCE : i11 >= 29 ? BoundsHelperApi29Impl.INSTANCE : i11 >= 28 ? BoundsHelperApi28Impl.INSTANCE : BoundsHelperApi24Impl.INSTANCE;
        }
    }

    @m80.k
    Rect currentWindowBounds(@m80.k Activity activity);
}
