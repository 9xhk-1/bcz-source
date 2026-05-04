package androidx.camera.core.impl.compat;

import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProxy;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class EncoderProfilesProxyCompat {
    private static final String TAG = "EncoderProfilesProxyCompat";

    private EncoderProfilesProxyCompat() {
    }

    @NonNull
    @RequiresApi(31)
    public static EncoderProfilesProxy from(@NonNull EncoderProfiles encoderProfiles) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            return EncoderProfilesProxyCompatApi33Impl.from(encoderProfiles);
        }
        if (i11 >= 31) {
            return EncoderProfilesProxyCompatApi31Impl.from(encoderProfiles);
        }
        throw new RuntimeException("Unable to call from(EncoderProfiles) on API " + i11 + ". Version 31 or higher required.");
    }

    @NonNull
    public static EncoderProfilesProxy from(@NonNull CamcorderProfile camcorderProfile) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            Logger.w(TAG, "Should use from(EncoderProfiles) on API " + i11 + "instead. CamcorderProfile is deprecated on API 31.");
        }
        return EncoderProfilesProxyCompatBaseImpl.from(camcorderProfile);
    }
}
