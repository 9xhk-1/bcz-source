package xk;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import kk.u;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class a implements e<Bitmap, byte[]> {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap.CompressFormat f98128a;

    /* renamed from: b, reason: collision with root package name */
    public final int f98129b;

    public a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // xk.e
    @Nullable
    public u<byte[]> a(@NonNull u<Bitmap> uVar, @NonNull ik.e eVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        uVar.get().compress(this.f98128a, this.f98129b, byteArrayOutputStream);
        uVar.recycle();
        return new tk.b(byteArrayOutputStream.toByteArray());
    }

    public a(@NonNull Bitmap.CompressFormat compressFormat, int i11) {
        this.f98128a = compressFormat;
        this.f98129b = i11;
    }
}
