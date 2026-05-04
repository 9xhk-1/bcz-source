package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Build;
import android.os.Vibrator;
import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class HapticDefaults {
    public static final int $stable = 0;

    @m80.k
    public static final HapticDefaults INSTANCE = new HapticDefaults();

    private HapticDefaults() {
    }

    public final boolean isPremiumVibratorEnabled(@m80.k Context context) {
        boolean areAllPrimitivesSupported;
        if (Build.VERSION.SDK_INT < 31) {
            return false;
        }
        areAllPrimitivesSupported = ((Vibrator) context.getSystemService(Vibrator.class)).areAllPrimitivesSupported(1, 7, 2);
        return areAllPrimitivesSupported;
    }
}
