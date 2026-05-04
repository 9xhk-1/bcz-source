package androidx.camera.video.internal.compat;

import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(29)
/* loaded from: classes.dex */
public final class Api29Impl {
    private Api29Impl() {
    }

    @Nullable
    public static AudioRecordingConfiguration getActiveRecordingConfiguration(@NonNull AudioRecord audioRecord) {
        return audioRecord.getActiveRecordingConfiguration();
    }

    public static boolean isClientSilenced(@NonNull AudioRecordingConfiguration audioRecordingConfiguration) {
        return audioRecordingConfiguration.isClientSilenced();
    }

    public static void registerAudioRecordingCallback(@NonNull AudioRecord audioRecord, @NonNull Executor executor, @NonNull AudioManager.AudioRecordingCallback audioRecordingCallback) {
        audioRecord.registerAudioRecordingCallback(executor, audioRecordingCallback);
    }

    public static void unregisterAudioRecordingCallback(@NonNull AudioRecord audioRecord, @NonNull AudioManager.AudioRecordingCallback audioRecordingCallback) {
        audioRecord.unregisterAudioRecordingCallback(audioRecordingCallback);
    }
}
