package androidx.camera.video.internal.compat;

import android.media.AudioFormat;
import android.media.AudioRecord;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(23)
/* loaded from: classes.dex */
public final class Api23Impl {
    private Api23Impl() {
    }

    @NonNull
    @RequiresPermission("android.permission.RECORD_AUDIO")
    public static AudioRecord build(@NonNull AudioRecord.Builder builder) {
        return builder.build();
    }

    @NonNull
    public static AudioRecord.Builder createAudioRecordBuilder() {
        return new AudioRecord.Builder();
    }

    public static void setAudioFormat(@NonNull AudioRecord.Builder builder, @NonNull AudioFormat audioFormat) {
        builder.setAudioFormat(audioFormat);
    }

    public static void setAudioSource(@NonNull AudioRecord.Builder builder, int i11) {
        builder.setAudioSource(i11);
    }

    public static void setBufferSizeInBytes(@NonNull AudioRecord.Builder builder, int i11) {
        builder.setBufferSizeInBytes(i11);
    }
}
