package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderOutputBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public abstract class ImageOutputBuffer extends DecoderOutputBuffer {

    @Nullable
    public Bitmap bitmap;

    @Override // androidx.media3.decoder.DecoderOutputBuffer, androidx.media3.decoder.Buffer
    @CallSuper
    public void clear() {
        this.bitmap = null;
        super.clear();
    }
}
