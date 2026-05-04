package sk;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(api = 28)
/* loaded from: classes6.dex */
public final class s0 implements ik.f<InputStream, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    public final g f88797a = new g();

    @Override // ik.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public kk.u<Bitmap> a(@NonNull InputStream inputStream, int i11, int i12, @NonNull ik.e eVar) throws IOException {
        ImageDecoder.Source createSource;
        createSource = ImageDecoder.createSource(fl.a.b(inputStream));
        return this.f88797a.c(createSource, i11, i12, eVar);
    }

    @Override // ik.f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull InputStream inputStream, @NonNull ik.e eVar) throws IOException {
        return true;
    }
}
