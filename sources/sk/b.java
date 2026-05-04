package sk;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class b implements ik.g<BitmapDrawable> {

    /* renamed from: a, reason: collision with root package name */
    public final lk.e f88736a;

    /* renamed from: b, reason: collision with root package name */
    public final ik.g<Bitmap> f88737b;

    public b(lk.e eVar, ik.g<Bitmap> gVar) {
        this.f88736a = eVar;
        this.f88737b = gVar;
    }

    @Override // ik.g
    @NonNull
    public EncodeStrategy a(@NonNull ik.e eVar) {
        return this.f88737b.a(eVar);
    }

    @Override // ik.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull kk.u<BitmapDrawable> uVar, @NonNull File file, @NonNull ik.e eVar) {
        return this.f88737b.b(new h(uVar.get().getBitmap(), this.f88736a), file, eVar);
    }
}
