package androidx.camera.video.internal.encoder;

import android.util.Range;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface AudioEncoderInfo extends EncoderInfo {
    @NonNull
    Range<Integer> getBitrateRange();
}
