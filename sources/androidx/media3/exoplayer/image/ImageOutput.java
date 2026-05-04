package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;
import androidx.media3.common.util.UnstableApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public interface ImageOutput {
    public static final ImageOutput NO_OP = new ImageOutput() { // from class: androidx.media3.exoplayer.image.ImageOutput.1
        @Override // androidx.media3.exoplayer.image.ImageOutput
        public void onDisabled() {
        }

        @Override // androidx.media3.exoplayer.image.ImageOutput
        public void onImageAvailable(long j11, Bitmap bitmap) {
        }
    };

    void onDisabled();

    void onImageAvailable(long j11, Bitmap bitmap);
}
