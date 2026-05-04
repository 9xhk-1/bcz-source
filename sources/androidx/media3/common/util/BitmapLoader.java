package androidx.media3.common.util;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaMetadata;
import com.google.common.util.concurrent.p1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public interface BitmapLoader {
    p1<Bitmap> decodeBitmap(byte[] bArr);

    p1<Bitmap> loadBitmap(Uri uri);

    @Nullable
    default p1<Bitmap> loadBitmapFromMetadata(MediaMetadata mediaMetadata) {
        byte[] bArr = mediaMetadata.artworkData;
        if (bArr != null) {
            return decodeBitmap(bArr);
        }
        Uri uri = mediaMetadata.artworkUri;
        if (uri != null) {
            return loadBitmap(uri);
        }
        return null;
    }

    boolean supportsMimeType(String str);
}
