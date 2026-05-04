package androidx.compose.ui.text.font;

import android.content.Context;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class FontWeightAdjustmentHelper {
    public static final int $stable = 0;

    @k
    public static final FontWeightAdjustmentHelper INSTANCE = new FontWeightAdjustmentHelper();

    private FontWeightAdjustmentHelper() {
    }

    public final int getFontWeightAdjustment(@k Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return FontWeightAdjustmentHelperApi31.INSTANCE.fontWeightAdjustment(context);
        }
        return 0;
    }
}
