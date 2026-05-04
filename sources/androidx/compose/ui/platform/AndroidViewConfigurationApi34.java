package androidx.compose.ui.platform;

import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(34)
/* loaded from: classes2.dex */
final class AndroidViewConfigurationApi34 {

    @m80.k
    public static final AndroidViewConfigurationApi34 INSTANCE = new AndroidViewConfigurationApi34();

    private AndroidViewConfigurationApi34() {
    }

    public final float getScaledHandwritingGestureLineMargin(@m80.k android.view.ViewConfiguration viewConfiguration) {
        int scaledHandwritingGestureLineMargin;
        scaledHandwritingGestureLineMargin = viewConfiguration.getScaledHandwritingGestureLineMargin();
        return scaledHandwritingGestureLineMargin;
    }

    public final float getScaledHandwritingSlop(@m80.k android.view.ViewConfiguration viewConfiguration) {
        int scaledHandwritingSlop;
        scaledHandwritingSlop = viewConfiguration.getScaledHandwritingSlop();
        return scaledHandwritingSlop;
    }
}
