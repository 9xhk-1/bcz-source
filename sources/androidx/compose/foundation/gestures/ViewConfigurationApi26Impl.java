package androidx.compose.foundation.gestures;

import android.view.ViewConfiguration;
import androidx.annotation.RequiresApi;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(26)
/* loaded from: classes.dex */
final class ViewConfigurationApi26Impl {

    @k
    public static final ViewConfigurationApi26Impl INSTANCE = new ViewConfigurationApi26Impl();

    private ViewConfigurationApi26Impl() {
    }

    public final float getHorizontalScrollFactor(@k ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public final float getVerticalScrollFactor(@k ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }
}
