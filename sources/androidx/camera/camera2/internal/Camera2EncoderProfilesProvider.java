package androidx.camera.camera2.internal;

import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.compat.EncoderProfilesProxyCompat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class Camera2EncoderProfilesProvider implements EncoderProfilesProvider {
    private static final String TAG = "Camera2EncoderProfilesProvider";
    private final String mCameraId;
    private final Quirks mCameraQuirks;
    private final Map<Integer, EncoderProfilesProxy> mEncoderProfilesCache = new HashMap();
    private final boolean mHasValidCameraId;
    private final int mIntCameraId;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(31)
    public static class Api31Impl {
        private Api31Impl() {
        }

        public static EncoderProfiles getAll(String str, int i11) {
            return CamcorderProfile.getAll(str, i11);
        }
    }

    public Camera2EncoderProfilesProvider(@NonNull String str, @NonNull Quirks quirks) {
        boolean z11;
        int i11;
        this.mCameraId = str;
        try {
            i11 = Integer.parseInt(str);
            z11 = true;
        } catch (NumberFormatException unused) {
            Logger.w(TAG, "Camera id is not an integer: " + str + ", unable to create Camera2EncoderProfilesProvider");
            z11 = false;
            i11 = -1;
        }
        this.mHasValidCameraId = z11;
        this.mIntCameraId = i11;
        this.mCameraQuirks = quirks;
    }

    @Nullable
    private EncoderProfilesProxy createProfilesFromCamcorderProfile(int i11) {
        CamcorderProfile camcorderProfile;
        try {
            camcorderProfile = CamcorderProfile.get(this.mIntCameraId, i11);
        } catch (RuntimeException e11) {
            Logger.w(TAG, "Unable to get CamcorderProfile by quality: " + i11, e11);
            camcorderProfile = null;
        }
        if (camcorderProfile != null) {
            return EncoderProfilesProxyCompat.from(camcorderProfile);
        }
        return null;
    }

    @Nullable
    private EncoderProfilesProxy findHighestQualityProfiles() {
        Iterator<Integer> it = EncoderProfilesProvider.QUALITY_HIGH_TO_LOW.iterator();
        while (it.hasNext()) {
            EncoderProfilesProxy all = getAll(it.next().intValue());
            if (all != null) {
                return all;
            }
        }
        return null;
    }

    @Nullable
    private EncoderProfilesProxy findLowestQualityProfiles() {
        for (int size = EncoderProfilesProvider.QUALITY_HIGH_TO_LOW.size() - 1; size >= 0; size--) {
            EncoderProfilesProxy all = getAll(size);
            if (all != null) {
                return all;
            }
        }
        return null;
    }

    @Nullable
    private EncoderProfilesProxy getProfilesInternal(int i11) {
        if (Build.VERSION.SDK_INT >= 31) {
            EncoderProfiles all = Api31Impl.getAll(this.mCameraId, i11);
            if (all == null) {
                return null;
            }
            if (DeviceQuirks.get(InvalidVideoProfilesQuirk.class) != null) {
                Logger.d(TAG, "EncoderProfiles contains invalid video profiles, use CamcorderProfile to create EncoderProfilesProxy.");
            } else {
                try {
                    return EncoderProfilesProxyCompat.from(all);
                } catch (NullPointerException e11) {
                    Logger.w(TAG, "Failed to create EncoderProfilesProxy, EncoderProfiles might  contain invalid video profiles. Use CamcorderProfile instead.", e11);
                }
            }
        }
        return createProfilesFromCamcorderProfile(i11);
    }

    private boolean isEncoderProfilesResolutionValidInQuirk(@NonNull EncoderProfilesProxy encoderProfilesProxy) {
        CamcorderProfileResolutionQuirk camcorderProfileResolutionQuirk = (CamcorderProfileResolutionQuirk) this.mCameraQuirks.get(CamcorderProfileResolutionQuirk.class);
        if (camcorderProfileResolutionQuirk == null) {
            return true;
        }
        List<EncoderProfilesProxy.VideoProfileProxy> videoProfiles = encoderProfilesProxy.getVideoProfiles();
        if (videoProfiles.isEmpty()) {
            return true;
        }
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = videoProfiles.get(0);
        return camcorderProfileResolutionQuirk.getSupportedResolutions().contains(new Size(videoProfileProxy.getWidth(), videoProfileProxy.getHeight()));
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    @Nullable
    public EncoderProfilesProxy getAll(int i11) {
        EncoderProfilesProxy encoderProfilesProxy = null;
        if (!this.mHasValidCameraId || !CamcorderProfile.hasProfile(this.mIntCameraId, i11)) {
            return null;
        }
        if (this.mEncoderProfilesCache.containsKey(Integer.valueOf(i11))) {
            return this.mEncoderProfilesCache.get(Integer.valueOf(i11));
        }
        EncoderProfilesProxy profilesInternal = getProfilesInternal(i11);
        if (profilesInternal == null || isEncoderProfilesResolutionValidInQuirk(profilesInternal)) {
            encoderProfilesProxy = profilesInternal;
        } else if (i11 == 1) {
            encoderProfilesProxy = findHighestQualityProfiles();
        } else if (i11 == 0) {
            encoderProfilesProxy = findLowestQualityProfiles();
        }
        this.mEncoderProfilesCache.put(Integer.valueOf(i11), encoderProfilesProxy);
        return encoderProfilesProxy;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public boolean hasProfile(int i11) {
        return this.mHasValidCameraId && getAll(i11) != null;
    }
}
