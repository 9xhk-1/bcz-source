package androidx.camera.video.internal.workaround;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.compat.quirk.NegativeLatLongSavesIncorrectlyQuirk;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class CorrectNegativeLatLongForMediaMuxer {
    private CorrectNegativeLatLongForMediaMuxer() {
    }

    @NonNull
    public static Pair<Double, Double> adjustGeoLocation(double d11, double d12) {
        if (DeviceQuirks.get(NegativeLatLongSavesIncorrectlyQuirk.class) != null) {
            d11 = adjustInternal(d11);
            d12 = adjustInternal(d12);
        }
        return Pair.create(Double.valueOf(d11), Double.valueOf(d12));
    }

    private static double adjustInternal(double d11) {
        return d11 >= 0.0d ? d11 : ((d11 * 10000.0d) - 1.0d) / 10000.0d;
    }
}
