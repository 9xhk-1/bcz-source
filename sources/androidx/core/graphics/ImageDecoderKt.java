package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.drawable.Drawable;
import androidx.annotation.RequiresApi;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes2.dex */
public final class ImageDecoderKt {
    @RequiresApi(28)
    @m80.k
    public static final Bitmap decodeBitmap(@m80.k ImageDecoder.Source source, @m80.k final x00.q<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, g2> qVar) {
        Bitmap decodeBitmap;
        decodeBitmap = ImageDecoder.decodeBitmap(source, r.a(new ImageDecoder$OnHeaderDecodedListener() { // from class: androidx.core.graphics.ImageDecoderKt$decodeBitmap$1
            public final void onHeaderDecoded(@m80.k ImageDecoder imageDecoder, @m80.k ImageDecoder.ImageInfo imageInfo, @m80.k ImageDecoder.Source source2) {
                qVar.invoke(imageDecoder, imageInfo, source2);
            }
        }));
        return decodeBitmap;
    }

    @RequiresApi(28)
    @m80.k
    public static final Drawable decodeDrawable(@m80.k ImageDecoder.Source source, @m80.k final x00.q<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, g2> qVar) {
        Drawable decodeDrawable;
        decodeDrawable = ImageDecoder.decodeDrawable(source, r.a(new ImageDecoder$OnHeaderDecodedListener() { // from class: androidx.core.graphics.ImageDecoderKt$decodeDrawable$1
            public final void onHeaderDecoded(@m80.k ImageDecoder imageDecoder, @m80.k ImageDecoder.ImageInfo imageInfo, @m80.k ImageDecoder.Source source2) {
                qVar.invoke(imageDecoder, imageInfo, source2);
            }
        }));
        return decodeDrawable;
    }
}
