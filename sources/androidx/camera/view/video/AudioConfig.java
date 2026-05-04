package androidx.camera.view.video;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class AudioConfig {

    @NonNull
    public static final AudioConfig AUDIO_DISABLED = new AudioConfig(false);
    private final boolean mIsAudioEnabled;

    public AudioConfig(boolean z11) {
        this.mIsAudioEnabled = z11;
    }

    @NonNull
    @RequiresPermission("android.permission.RECORD_AUDIO")
    public static AudioConfig create(boolean z11) {
        return new AudioConfig(z11);
    }

    public boolean getAudioEnabled() {
        return this.mIsAudioEnabled;
    }
}
