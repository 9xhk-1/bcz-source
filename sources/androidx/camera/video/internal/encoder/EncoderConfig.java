package androidx.camera.video.internal.encoder;

import android.media.MediaFormat;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.Timebase;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface EncoderConfig {
    public static final int CODEC_PROFILE_NONE = -1;

    @NonNull
    Timebase getInputTimebase();

    @NonNull
    String getMimeType();

    int getProfile();

    @NonNull
    MediaFormat toMediaFormat() throws InvalidConfigException;
}
