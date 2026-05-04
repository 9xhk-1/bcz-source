package androidx.camera.core.internal.compat;

import android.media.MediaActionSound;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(33)
/* loaded from: classes.dex */
class MediaActionSoundCompatApi33Impl {
    private MediaActionSoundCompatApi33Impl() {
    }

    public static boolean mustPlayShutterSound() {
        return MediaActionSound.mustPlayShutterSound();
    }
}
