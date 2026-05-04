package androidx.camera.video.internal.compat;

import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(24)
/* loaded from: classes.dex */
public final class Api24Impl {
    private Api24Impl() {
    }

    public static int getClientAudioSessionId(@NonNull AudioRecordingConfiguration audioRecordingConfiguration) {
        return audioRecordingConfiguration.getClientAudioSessionId();
    }

    public static int getTimestamp(@NonNull AudioRecord audioRecord, @NonNull AudioTimestamp audioTimestamp, int i11) {
        return audioRecord.getTimestamp(audioTimestamp, i11);
    }
}
