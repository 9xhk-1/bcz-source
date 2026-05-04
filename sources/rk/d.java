package rk;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import sk.r0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(api = 28)
/* loaded from: classes6.dex */
public final class d implements ImageDecoder$OnHeaderDecodedListener {

    /* renamed from: h, reason: collision with root package name */
    public static final String f84226h = "ImageDecoder";

    /* renamed from: a, reason: collision with root package name */
    public final r0 f84227a = r0.c();

    /* renamed from: b, reason: collision with root package name */
    public final int f84228b;

    /* renamed from: c, reason: collision with root package name */
    public final int f84229c;

    /* renamed from: d, reason: collision with root package name */
    public final DecodeFormat f84230d;

    /* renamed from: e, reason: collision with root package name */
    public final DownsampleStrategy f84231e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f84232f;

    /* renamed from: g, reason: collision with root package name */
    public final PreferredColorSpace f84233g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ImageDecoder$OnPartialImageListener {
        public a() {
        }

        public boolean onPartialImage(@NonNull ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public d(int i11, int i12, @NonNull ik.e eVar) {
        this.f84228b = i11;
        this.f84229c = i12;
        this.f84230d = (DecodeFormat) eVar.c(com.bumptech.glide.load.resource.bitmap.a.f28817g);
        this.f84231e = (DownsampleStrategy) eVar.c(DownsampleStrategy.f28814h);
        ik.d<Boolean> dVar = com.bumptech.glide.load.resource.bitmap.a.f28821k;
        this.f84232f = eVar.c(dVar) != null && ((Boolean) eVar.c(dVar)).booleanValue();
        this.f84233g = (PreferredColorSpace) eVar.c(com.bumptech.glide.load.resource.bitmap.a.f28818h);
    }

    public void onHeaderDecoded(@NonNull ImageDecoder imageDecoder, @NonNull ImageDecoder.ImageInfo imageInfo, @NonNull ImageDecoder.Source source) {
        Size size;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        ColorSpace.Named named2;
        ColorSpace colorSpace2;
        ColorSpace colorSpace3;
        ColorSpace colorSpace4;
        boolean isWideGamut;
        if (this.f84227a.g(this.f84228b, this.f84229c, this.f84232f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f84230d == DecodeFormat.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        size = imageInfo.getSize();
        int i11 = this.f84228b;
        if (i11 == Integer.MIN_VALUE) {
            i11 = size.getWidth();
        }
        int i12 = this.f84229c;
        if (i12 == Integer.MIN_VALUE) {
            i12 = size.getHeight();
        }
        float b11 = this.f84231e.b(size.getWidth(), size.getHeight(), i11, i12);
        int round = Math.round(size.getWidth() * b11);
        int round2 = Math.round(size.getHeight() * b11);
        if (Log.isLoggable(f84226h, 2)) {
            Log.v(f84226h, "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + b11);
        }
        imageDecoder.setTargetSize(round, round2);
        PreferredColorSpace preferredColorSpace = this.f84233g;
        if (preferredColorSpace != null) {
            int i13 = Build.VERSION.SDK_INT;
            if (i13 < 28) {
                if (i13 >= 26) {
                    named = ColorSpace.Named.SRGB;
                    colorSpace = ColorSpace.get(named);
                    imageDecoder.setTargetColorSpace(colorSpace);
                    return;
                }
                return;
            }
            if (preferredColorSpace == PreferredColorSpace.DISPLAY_P3) {
                colorSpace3 = imageInfo.getColorSpace();
                if (colorSpace3 != null) {
                    colorSpace4 = imageInfo.getColorSpace();
                    isWideGamut = colorSpace4.isWideGamut();
                    if (isWideGamut) {
                        named2 = ColorSpace.Named.DISPLAY_P3;
                        colorSpace2 = ColorSpace.get(named2);
                        imageDecoder.setTargetColorSpace(colorSpace2);
                    }
                }
            }
            named2 = ColorSpace.Named.SRGB;
            colorSpace2 = ColorSpace.get(named2);
            imageDecoder.setTargetColorSpace(colorSpace2);
        }
    }
}
