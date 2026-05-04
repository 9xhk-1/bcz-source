package sk;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.exifinterface.media.ExifInterface;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(27)
/* loaded from: classes6.dex */
public final class u implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    public boolean a(@NonNull ByteBuffer byteBuffer, @NonNull lk.b bVar) throws IOException {
        return false;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int b(@NonNull ByteBuffer byteBuffer, @NonNull lk.b bVar) throws IOException {
        return d(fl.a.g(byteBuffer), bVar);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public ImageHeaderParser.ImageType c(@NonNull InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int d(@NonNull InputStream inputStream, @NonNull lk.b bVar) throws IOException {
        int attributeInt = new ExifInterface(inputStream).getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
        if (attributeInt == 0) {
            return -1;
        }
        return attributeInt;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public ImageHeaderParser.ImageType e(@NonNull ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public boolean f(@NonNull InputStream inputStream, @NonNull lk.b bVar) throws IOException {
        return false;
    }
}
