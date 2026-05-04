package androidx.camera.video.internal.config;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.video.internal.config.AutoValue_VideoMimeInfo;
import androidx.camera.video.internal.config.MimeInfo;
import eo.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@c
/* loaded from: classes.dex */
public abstract class VideoMimeInfo extends MimeInfo {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @c.a
    public static abstract class Builder extends MimeInfo.Builder<Builder> {
        @Override // androidx.camera.video.internal.config.MimeInfo.Builder
        @NonNull
        public abstract VideoMimeInfo build();

        @NonNull
        public abstract Builder setCompatibleVideoProfile(@Nullable EncoderProfilesProxy.VideoProfileProxy videoProfileProxy);
    }

    @NonNull
    public static Builder builder(@NonNull String str) {
        return new AutoValue_VideoMimeInfo.Builder().setMimeType(str).setProfile(-1);
    }

    @Nullable
    public abstract EncoderProfilesProxy.VideoProfileProxy getCompatibleVideoProfile();
}
