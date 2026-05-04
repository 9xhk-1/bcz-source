package sk;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class k implements ik.f<ByteBuffer, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.resource.bitmap.a f88763a;

    public k(com.bumptech.glide.load.resource.bitmap.a aVar) {
        this.f88763a = aVar;
    }

    @Override // ik.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public kk.u<Bitmap> a(@NonNull ByteBuffer byteBuffer, int i11, int i12, @NonNull ik.e eVar) throws IOException {
        return this.f88763a.h(byteBuffer, i11, i12, eVar);
    }

    @Override // ik.f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull ByteBuffer byteBuffer, @NonNull ik.e eVar) {
        return this.f88763a.t(byteBuffer);
    }
}
