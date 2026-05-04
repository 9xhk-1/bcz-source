package androidx.camera.core.internal.compat.workaround;

import androidx.annotation.NonNull;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class JpegMetadataCorrector {
    private final IncorrectJpegMetadataQuirk mQuirk;

    public JpegMetadataCorrector(@NonNull Quirks quirks) {
        this.mQuirk = (IncorrectJpegMetadataQuirk) quirks.get(IncorrectJpegMetadataQuirk.class);
    }

    @NonNull
    public byte[] jpegImageToJpegByteArray(@NonNull ImageProxy imageProxy) {
        IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk = this.mQuirk;
        if (incorrectJpegMetadataQuirk != null) {
            return incorrectJpegMetadataQuirk.jpegImageToJpegByteArray(imageProxy);
        }
        ByteBuffer buffer = imageProxy.getPlanes()[0].getBuffer();
        byte[] bArr = new byte[buffer.capacity()];
        buffer.rewind();
        buffer.get(bArr);
        return bArr;
    }

    public boolean needCorrectJpegMetadata() {
        return this.mQuirk != null;
    }
}
