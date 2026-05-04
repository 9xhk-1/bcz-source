package androidx.camera.video.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.EncoderProfilesProxy;
import com.alipay.sdk.m.u.i;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class AutoValue_VideoValidatedEncoderProfilesProxy extends VideoValidatedEncoderProfilesProxy {
    private final List<EncoderProfilesProxy.AudioProfileProxy> audioProfiles;
    private final EncoderProfilesProxy.AudioProfileProxy defaultAudioProfile;
    private final int defaultDurationSeconds;
    private final EncoderProfilesProxy.VideoProfileProxy defaultVideoProfile;
    private final int recommendedFileFormat;
    private final List<EncoderProfilesProxy.VideoProfileProxy> videoProfiles;

    public AutoValue_VideoValidatedEncoderProfilesProxy(int i11, int i12, List<EncoderProfilesProxy.AudioProfileProxy> list, List<EncoderProfilesProxy.VideoProfileProxy> list2, @Nullable EncoderProfilesProxy.AudioProfileProxy audioProfileProxy, EncoderProfilesProxy.VideoProfileProxy videoProfileProxy) {
        this.defaultDurationSeconds = i11;
        this.recommendedFileFormat = i12;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.audioProfiles = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.videoProfiles = list2;
        this.defaultAudioProfile = audioProfileProxy;
        if (videoProfileProxy == null) {
            throw new NullPointerException("Null defaultVideoProfile");
        }
        this.defaultVideoProfile = videoProfileProxy;
    }

    public boolean equals(Object obj) {
        EncoderProfilesProxy.AudioProfileProxy audioProfileProxy;
        if (obj == this) {
            return true;
        }
        if (obj instanceof VideoValidatedEncoderProfilesProxy) {
            VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy = (VideoValidatedEncoderProfilesProxy) obj;
            if (this.defaultDurationSeconds == videoValidatedEncoderProfilesProxy.getDefaultDurationSeconds() && this.recommendedFileFormat == videoValidatedEncoderProfilesProxy.getRecommendedFileFormat() && this.audioProfiles.equals(videoValidatedEncoderProfilesProxy.getAudioProfiles()) && this.videoProfiles.equals(videoValidatedEncoderProfilesProxy.getVideoProfiles()) && ((audioProfileProxy = this.defaultAudioProfile) != null ? audioProfileProxy.equals(videoValidatedEncoderProfilesProxy.getDefaultAudioProfile()) : videoValidatedEncoderProfilesProxy.getDefaultAudioProfile() == null) && this.defaultVideoProfile.equals(videoValidatedEncoderProfilesProxy.getDefaultVideoProfile())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    @NonNull
    public List<EncoderProfilesProxy.AudioProfileProxy> getAudioProfiles() {
        return this.audioProfiles;
    }

    @Override // androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy
    @Nullable
    public EncoderProfilesProxy.AudioProfileProxy getDefaultAudioProfile() {
        return this.defaultAudioProfile;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public int getDefaultDurationSeconds() {
        return this.defaultDurationSeconds;
    }

    @Override // androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy
    @NonNull
    public EncoderProfilesProxy.VideoProfileProxy getDefaultVideoProfile() {
        return this.defaultVideoProfile;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public int getRecommendedFileFormat() {
        return this.recommendedFileFormat;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    @NonNull
    public List<EncoderProfilesProxy.VideoProfileProxy> getVideoProfiles() {
        return this.videoProfiles;
    }

    public int hashCode() {
        int hashCode = (((((((this.defaultDurationSeconds ^ 1000003) * 1000003) ^ this.recommendedFileFormat) * 1000003) ^ this.audioProfiles.hashCode()) * 1000003) ^ this.videoProfiles.hashCode()) * 1000003;
        EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = this.defaultAudioProfile;
        return ((hashCode ^ (audioProfileProxy == null ? 0 : audioProfileProxy.hashCode())) * 1000003) ^ this.defaultVideoProfile.hashCode();
    }

    public String toString() {
        return "VideoValidatedEncoderProfilesProxy{defaultDurationSeconds=" + this.defaultDurationSeconds + ", recommendedFileFormat=" + this.recommendedFileFormat + ", audioProfiles=" + this.audioProfiles + ", videoProfiles=" + this.videoProfiles + ", defaultAudioProfile=" + this.defaultAudioProfile + ", defaultVideoProfile=" + this.defaultVideoProfile + i.f11099d;
    }
}
