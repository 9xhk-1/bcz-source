package androidx.camera.video.internal.config;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public abstract class MimeInfo {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class Builder<B> {
        @NonNull
        public abstract MimeInfo build();

        @NonNull
        public abstract B setMimeType(@NonNull String str);

        @NonNull
        public abstract B setProfile(int i11);
    }

    @NonNull
    public abstract String getMimeType();

    public abstract int getProfile();
}
