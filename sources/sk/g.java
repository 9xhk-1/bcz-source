package sk;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(api = 28)
/* loaded from: classes6.dex */
public final class g implements ik.f<ImageDecoder.Source, Bitmap> {

    /* renamed from: b, reason: collision with root package name */
    public static final String f88759b = "BitmapImageDecoder";

    /* renamed from: a, reason: collision with root package name */
    public final lk.e f88760a = new lk.f();

    @Override // ik.f
    public /* bridge */ /* synthetic */ kk.u<Bitmap> a(@NonNull ImageDecoder.Source source, int i11, int i12, @NonNull ik.e eVar) throws IOException {
        return c(f.a(source), i11, i12, eVar);
    }

    @Override // ik.f
    public /* bridge */ /* synthetic */ boolean b(@NonNull ImageDecoder.Source source, @NonNull ik.e eVar) throws IOException {
        return d(f.a(source), eVar);
    }

    public kk.u<Bitmap> c(@NonNull ImageDecoder.Source source, int i11, int i12, @NonNull ik.e eVar) throws IOException {
        Bitmap decodeBitmap;
        decodeBitmap = ImageDecoder.decodeBitmap(source, new rk.d(i11, i12, eVar));
        if (Log.isLoggable(f88759b, 2)) {
            Log.v(f88759b, "Decoded [" + decodeBitmap.getWidth() + "x" + decodeBitmap.getHeight() + "] for [" + i11 + "x" + i12 + "]");
        }
        return new h(decodeBitmap, this.f88760a);
    }

    public boolean d(@NonNull ImageDecoder.Source source, @NonNull ik.e eVar) throws IOException {
        return true;
    }
}
