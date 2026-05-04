package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@RequiresApi(31)
/* loaded from: classes2.dex */
public final class FontWeightAdjustmentHelperApi31 {
    public static final int $stable = 0;

    @k
    public static final FontWeightAdjustmentHelperApi31 INSTANCE = new FontWeightAdjustmentHelperApi31();

    private FontWeightAdjustmentHelperApi31() {
    }

    @DoNotInline
    @RequiresApi(31)
    public final int fontWeightAdjustment(@k Context context) {
        int i11;
        i11 = context.getResources().getConfiguration().fontWeightAdjustment;
        return i11;
    }
}
