package androidx.camera.video.internal.compat;

import android.media.MediaCodecInfo;
import android.util.Range;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(28)
/* loaded from: classes.dex */
public final class Api28Impl {
    private Api28Impl() {
    }

    @NonNull
    public static Range<Integer> getQualityRange(@NonNull MediaCodecInfo.EncoderCapabilities encoderCapabilities) {
        return encoderCapabilities.getQualityRange();
    }
}
