package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.EncoderProfilesProxy;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class AutoValue_EncoderProfilesProxy_VideoProfileProxy extends EncoderProfilesProxy.VideoProfileProxy {
    private final int bitDepth;
    private final int bitrate;
    private final int chromaSubsampling;
    private final int codec;
    private final int frameRate;
    private final int hdrFormat;
    private final int height;
    private final String mediaType;
    private final int profile;
    private final int width;

    public AutoValue_EncoderProfilesProxy_VideoProfileProxy(int i11, String str, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        this.codec = i11;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.mediaType = str;
        this.bitrate = i12;
        this.frameRate = i13;
        this.width = i14;
        this.height = i15;
        this.profile = i16;
        this.bitDepth = i17;
        this.chromaSubsampling = i18;
        this.hdrFormat = i19;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EncoderProfilesProxy.VideoProfileProxy) {
            EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = (EncoderProfilesProxy.VideoProfileProxy) obj;
            if (this.codec == videoProfileProxy.getCodec() && this.mediaType.equals(videoProfileProxy.getMediaType()) && this.bitrate == videoProfileProxy.getBitrate() && this.frameRate == videoProfileProxy.getFrameRate() && this.width == videoProfileProxy.getWidth() && this.height == videoProfileProxy.getHeight() && this.profile == videoProfileProxy.getProfile() && this.bitDepth == videoProfileProxy.getBitDepth() && this.chromaSubsampling == videoProfileProxy.getChromaSubsampling() && this.hdrFormat == videoProfileProxy.getHdrFormat()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public int getBitDepth() {
        return this.bitDepth;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public int getBitrate() {
        return this.bitrate;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public int getChromaSubsampling() {
        return this.chromaSubsampling;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public int getCodec() {
        return this.codec;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public int getFrameRate() {
        return this.frameRate;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public int getHdrFormat() {
        return this.hdrFormat;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public int getHeight() {
        return this.height;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    @NonNull
    public String getMediaType() {
        return this.mediaType;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public int getProfile() {
        return this.profile;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return ((((((((((((((((((this.codec ^ 1000003) * 1000003) ^ this.mediaType.hashCode()) * 1000003) ^ this.bitrate) * 1000003) ^ this.frameRate) * 1000003) ^ this.width) * 1000003) ^ this.height) * 1000003) ^ this.profile) * 1000003) ^ this.bitDepth) * 1000003) ^ this.chromaSubsampling) * 1000003) ^ this.hdrFormat;
    }

    public String toString() {
        return "VideoProfileProxy{codec=" + this.codec + ", mediaType=" + this.mediaType + ", bitrate=" + this.bitrate + ", frameRate=" + this.frameRate + ", width=" + this.width + ", height=" + this.height + ", profile=" + this.profile + ", bitDepth=" + this.bitDepth + ", chromaSubsampling=" + this.chromaSubsampling + ", hdrFormat=" + this.hdrFormat + com.alipay.sdk.m.u.i.f11099d;
    }
}
